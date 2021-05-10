def tarea5():
  #definir variable 
  print("consulte su lugar de viaje")
  vacacionesI=0
  #Datos de entrada
  cantidadA=int(input("¿Cuanto es su presopuesto?:"))
  #Proseso
  if cantidadA>=1500 and cantidadA<=1599:
    vacaciones="Ud. podra irse de viaje a México"
  if cantidadA>=1600 and cantidadA<=2399:
    vacaciones="Ud. podra irse de viaje a P.V."
  if cantidadA>=2400 and cantidadA<=3599:
    vacaciones="Ud. podra irse de viaje a Acapulco"
  if cantidadA>=3600:
    vacaciones="Ud. podra irse de viaje a Cancún"
  if cantidadA<=1500:
    vacaciones="Ud. se queda en su casa"
  #datos de salida
  print(vacaciones)
tarea5()

  