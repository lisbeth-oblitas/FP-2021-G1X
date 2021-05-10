def tarea():
  #definir variable y otros
  print("¿cual es el costo del articulo?")
  enunciadoY=0
  #datos de entrada
  cantidadX=int(input("ingrese el costo para hacerle el descuento:"))
  #proceso
  if cantidadX>=200:
   enunciadoY=cantidadX-(cantidadX*15/100)
  if cantidadX<=199:
    enunciadoY=cantidadX-(cantidadX*12/100)
  if cantidadX<=99:
    enunciadoY=cantidadX-(cantidadX*10/100)
  #datos de salida
  print("usted devera pagar:", enunciadoY)
tarea()