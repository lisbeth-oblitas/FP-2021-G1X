def tarea4():
  #Definir variables y otros
  print("cuantas horas trabajo")
  respuestaM=0
  #Datos de entrada
  dia1=int(input("Lunes:"))
  dia2=int(input("Martes:"))
  dia3=int(input("Miercoles:"))
  dia4=int(input("Jueves:"))
  dia5=int(input("Viernes:"))
  dia6=int(input("Sabado:"))
  dia7=int(input("Domingo:"))
  #Proceso
  diasX=dia1+dia2+dia3+dia4+dia5+dia6+dia7
  exedente=diasX-40
  if diasX>40:
   respuestaM=(36*40)+(72*exedente)
  else:
   respuestaM=36*diasX 
  #Datos de salida
  print("ud. trabajo:", diasX)
  print("Su sueldo de esta semana sera:", respuestaM)
tarea4()