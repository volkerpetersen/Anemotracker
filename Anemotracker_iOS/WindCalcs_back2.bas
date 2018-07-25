Type=Class
Version=4.4
ModulesStructureVersion=1
B4i=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Dim vane As Float = 0
	Dim anemo As Float = 0
	
	Dim speed As Float = 0
	Dim bearing As Float = 0
	Dim latitude As Float
	Dim longitude As Float
	
	Dim compass As Float
	
	Dim awm, awa, twm, twa, twN As Float = 0
	'Dim twNm As Float = 0
	Dim simulated As Boolean
	Dim swm, swa As Float
	Dim knots As Float = 0
	
	Dim speed_min As Float = 2.0
	Dim speed_sw As Boolean = True
	Dim speed_low As Boolean = False
	Dim speed_bearing As Float = 0.0  ' Bearing según el speed para poner el compass
	
	Dim mean_sw As Boolean = False
	Dim offset As Float	
	
	Dim m_anemo As List
	Dim m_x, m_y As List 
	 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	m_anemo.Initialize
	m_x.Initialize
	m_y.Initialize
	speed = 0
	anemo = 0
	vane = 0
	bearing = 0
	offset = 0
	simulated = False

End Sub

'Sub Round2( val As Float, decimals As Int ) As Float
'	
'	'Return NumberFormat( value, 0, decimals )
'	Return val
'End Sub
Sub calc_anemo( v_anemo As Float, v_vane As Float )
	'ToastMessageShow( v_anemo, False )	
	' hacemos filtro mediana antes de nada...
	Dim intermedio As Int
	Dim n_samples As Int 
	If mean_sw Then	' Cojo 25 valores
		n_samples = 25
	Else	' Cojo solo 10 valores
		n_samples = 5
	End If
	If m_anemo.Size >= n_samples Then
		Dim j= (m_anemo.Size - n_samples)  As Int 
		For i=0 To j
			
			m_anemo.RemoveAt(0) 
			m_x.RemoveAt(0)
			m_y.RemoveAt(0)
		Next
	End If
	m_anemo.Add( v_anemo ) 
	m_x.Add( v_anemo*CosD( -v_vane ) )
	m_y.Add( v_anemo*SinD( -v_vane ) )
	Dim media_x=0, media_y=0 As Float
	For i=0 To m_x.Size-1
		media_x = media_x + m_x.Get(i)
		media_y = media_y + m_y.Get(i)
	Next
	media_x = media_x / m_x.Size
	media_y = media_y / m_y.Size  
	vane = -ATan2D( media_y, media_x )
	intermedio = 360 - vane
	vane = intermedio Mod 360
	
	'Log( m_anemo )
	Dim o_anemo As List 
	o_anemo.Initialize
	o_anemo.AddAll( m_anemo )
	o_anemo.Sort(True)
	'Log( o_anemo )
	' Quito filtro media, nos quedamos con mediana pura....
'	If o_anemo.Size = 50 Then
'		Dim media=0 As Float
'		For i=6 To 45
'			media = media + o_anemo.get( i )/40
'		Next 
'		anemo = media 
'	Else 
'		anemo = o_anemo.Get( o_anemo.Size / 2  )
'	End If
	anemo = o_anemo.Get( o_anemo.Size/2 )
	'Log( anemo )
	
End Sub
Sub calc

	' CUIDADO anemo = anemo*1.942615/100.0  habrá que emplear nudos....
	Dim r As Map
	knots = speed * 3600 / 1852
	If speed_sw Then
		If knots <= speed_min  Then
			speed_low = True
		Else
			speed_low = False
		End If
	Else
		speed_low = False
	End If
	'Log( speed_sw & " " & speed_min & " " & speed_low )
	'Log( compass )
	'Log( knots )
	'r = calc_wind( speed, anemo, vane, bearing, False )
	If simulated Then
		' Calculo a la inversa
		' Empleamos datos base en nudos (simulado)
		' Por tanto necesitamos convertir speed (m/s) a nudos
		'Log( twa )
		' swa es el viento simulado respecto a norte.
		Dim swR As Float
		swR = swa - bearing
		If swR < 0 Then
			swR = swR + 360 ' importante el + porque swN es negativo
		End If
		twm = Round2( swm, 1 )
		twa = Round2( swR, 1 )		
		twN = Round2( twa , 1 ) ' respecto al norte ya es correcto...
		If speed_low Then
			r = calc_wind( knots, swm, swR, compass, True )	' alimento con viento real respecto al barco (relativo) no respecto al norte
			speed_bearing = compass
		Else
			r = calc_wind( knots, swm, swR, bearing, True )	' alimento con viento real respecto al barco (relativo) no respecto al norte
			speed_bearing = bearing
		End If
		awm = Round2( r.Get("modulo"), 1 )
		awa = Round2( r.Get("angulo"), 1 )
		
	Else   ' EN cálculos reales utilizamos todos los vectores en m/s y luego convertimos a knots
		   ' m/s a nudos -> m/s -> m/h -> knots (millas/h)
		' VANE CORREGIDO CON -OFFSET
		If speed_low Then
			r = calc_wind( speed, anemo, vane-offset, compass, False ) ' Cálculo en m/s
			speed_bearing = compass
		Else
			r = calc_wind( speed, anemo, vane-offset, bearing, False ) ' Cálculo en m/s
			speed_bearing = bearing
		End If
		If mean_sw Then 
			' quito sistema cutre anterior de media, por el nuevo de mediana
			'awm = Round2( awm * 0.9 + (anemo * 3600 / 1852)*0.1, 1 )
			awm = Round2( (anemo * 3600 / 1852), 1 )
			' quito mean en veleta, no tiene sentido
			'awa = Round2( (awa * 0.9 + (vane-offset)*0.1), 1 )
			awa = Round2( vane-offset, 1 )

			' quito sistema cutre anterior de media, por el nuevo de mediana
			'twm = Round2( twm * 0.9 + ( r.Get("modulo") * 3600 / 1852)*0.1, 1 )
			twm = Round2( r.Get("modulo") * 3600 / 1852, 1 )
			' quito mean en veleta, no tiene sentido
			'twa = Round2( twa * 0.9 + r.Get("angulo")*0.1, 1 )
			twa = Round2( r.Get("angulo"), 1 )
			' quito mean cutre anterior...
			'twN = Round2( twN * 0.9 + r.Get("windN")*0.1 , 1 )
			twN = Round2( r.Get("windN"), 1 )
		Else
			awm = Round2( anemo * 3600 / 1852, 1 )
			awa = Round2( vane-offset, 1 )

			twm = Round2( r.Get("modulo") * 3600 / 1852, 1 )
			twa = Round2( r.Get("angulo"), 1 )
			twN = Round2( r.Get("windN"), 1 )
		End If
	End If
	
	
End Sub

Sub test_calc 
        'self.tags['compass']['value'] = self.sensors['compass']
		' tests
		'Dim vientos As List	
		'vientos = ( (1, 1, 0) , (1,1,45), (1,1,90), (1,1,135), (1,1,180), (1,1,225), (1,1,270), (1,1,315), (1,1,360) )
		Dim results As String
		Dim r As Map
		
		r = calc_wind( 1, 1, 0, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"
		
		r = calc_wind( 1, 1, 45, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"
		
		r = calc_wind( 1, 1, 90, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"

		r = calc_wind( 1, 1, 135, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"

		r = calc_wind( 1, 1, 180, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"

		r = calc_wind( 1, 1, 225, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"

		r = calc_wind( 1, 1, 270, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"

		r = calc_wind( 1, 1, 315, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"

		r = calc_wind( 1, 1, 360, 0, False )
		results = results & r.Get( "modulo") & ", " & r.Get( "angulo" ) & "\n"


		'ToastMessageShow( results, True )
		
        'Dim vbarco As Float
		'vbarco = 
		

End Sub

Sub calc_wind( p_speed As Float, p_anemo As Float, p_vane As Float, p_bearing As Float, inverse As Boolean ) As Map
	Dim ret As Map
	Dim barco_x, barco_y, vientoap_x, vientoap_y As Float
	Dim vientoreal_x, vientoreal_y, vientoreal_m, vientoreal_a, windN  As Float
	Dim intermedio As Int	
	ret.Initialize
	barco_x = p_speed
	barco_y = 0
	vientoap_x = p_anemo*CosD( -p_vane ) 
	vientoap_y = p_anemo*SinD( -p_vane )
	If( inverse ) Then
		'' Calculo a la inversa, sólo para viento simulado
		vientoreal_x = vientoap_x + barco_x
		vientoreal_y = vientoap_y + barco_y
		vientoreal_a = ATan2D( vientoreal_y , vientoreal_x )
		vientoreal_m = Sqrt( vientoreal_x*vientoreal_x + vientoreal_y*vientoreal_y )
		'vientoreal_a = (360 - vientoreal_a ) Mod 360
		intermedio = 360 - vientoreal_a
		vientoreal_a = intermedio Mod 360
	Else
		vientoreal_x = vientoap_x - barco_x
		vientoreal_y = vientoap_y - barco_y
		vientoreal_a = ATan2D( vientoreal_y , vientoreal_x )
		vientoreal_m = Sqrt( vientoreal_x*vientoreal_x + vientoreal_y*vientoreal_y )
		'vientoreal_a = (360 - vientoreal_a ) Mod 360
		intermedio = 360 - vientoreal_a
		vientoreal_a = intermedio Mod 360
	End If
	ret.Put( "x", vientoap_x )
	ret.Put( "y", vientoap_y )
	ret.Put( "modulo", vientoreal_m )
	ret.Put( "angulo", vientoreal_a )
	intermedio = ( vientoreal_a + p_bearing ) 
	windN = (intermedio + 360 ) Mod 360
	ret.Put( "windN", windN )
	Return ret
End Sub

Sub Round2( value As Float, decimals As Int ) As Float
	
	'Return NumberFormat( value, 0, decimals )
	Return value
End Sub