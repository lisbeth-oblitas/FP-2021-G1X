def tarea7():
  #definicion las variables 
  print ("Indique cuantas horas trabajo")
  enunciadoY=0
  #datos de entrada
  dia1=int(input("lunes:"))
  dia2=int(input("martes:"))
  dia3=int(input("miercoles:"))
  dia4=int(input("jueves:"))
  dia5=int(input("viernes:"))
  dia6=int(input("sabado:"))
  dia7=int(input("domingo:"))
  #proceso
  cantidadX=dia1+dia2+dia3+dia4+dia5+dia6+dia7
  exedente=(cantidadX-40)
  exedente1=(exedente-5)
  if cantidadX<=40:
   enunciadoY=36*cantidadX
  if cantidadX>41 and cantidadX<=45:
   enunciadoY=((36*40)+(72*(exedente-exedente1)))
  if cantidadX>46 and cantidadX<=50:
   enunciadoY=((36*40)+(72*(exedente-exedente1)+(108*exedente1)))
  if cantidadX>=51:
   enunciadoY="trabajo mucho"
  #datos de salida
  print("sus horas de trabajo son", cantidadX)
  print("su sueldo de esta semana es", enunciadoY)
tarea7()

      