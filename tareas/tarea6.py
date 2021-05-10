def tarea6():
  #definicion las variables 
  print("consulta su bono")
  bonoC=0
  #introduscamos los valores
  antiguedadD=int(input("introdusca sus años de antiguedad:"))
  #procedimiento
  if antiguedadD==1:
    bonoC="100"
  if antiguedadD==2:
   bonoC="200"
  if antiguedadD==3:
   bonoC="300"
  if antiguedadD==4:
   bonoC="400"
  if antiguedadD==5:
   bonoC="500"
  if antiguedadD==6:
    bonoC="1000"
  #datos de salida
  print("su bono es de",bonoC,"dolares")
tarea6()
   