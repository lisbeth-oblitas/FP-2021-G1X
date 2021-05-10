def paquetes():
  #Definir Variables
  resultPaquete=""
  #Datos de entrada
  montoRvDic=float(input("Ingrese el monto que recibe en diciembre:"))
  #Proceso
  if montoRvDic>=50000:
    resultPaquete="Paquete A"
  elif montoRvDic>=20000 and montoRvDic<50000:
    resultPaquete="Paquete B"
  elif montoRvDic>=10000 and montoRvDic<20000:
    resultPaquete="Paquete C"
  else:
    resultPaquete="Paquete D"
  #Datos de salida
  print("La persona comprara el: ", resultPaquete)
paquetes()