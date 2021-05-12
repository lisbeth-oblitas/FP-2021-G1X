def examenMLOA():
  #Definir variable y otros
  print("Consulte su nota del curso de fundamentos de programacion segun la ponderacion")
  notafinalMLOA=0
  #Datos de entrada
  unidad1MLOA=int(input("Ingresa tu nota de la primera unidad: "))
  unidad2MLOA=int(input("Ingresa tu nota de la segunda unidad: "))
  unidad3MLOA=int(input("Ingresa tu nota de la tercera unidad: "))
  trabajofMLOA=int(input("Ingresa tu nota de la cuarta unidad: "))
  #Proseso
  if unidad1MLOA>=0 and unidad1MLOA<=20:
    nota1MLOA=unidad1MLOA*20/100
  if unidad2MLOA>=0 and unidad2MLOA<=20:
    nota2MLOA=unidad2MLOA*15/100
  if unidad3MLOA>=0 and unidad3MLOA<=20:
    nota3MLOA=unidad3MLOA*15/100
  if trabajofMLOA>=0 and trabajofMLOA<=20:
    nota4MLOA=trabajofMLOA*50/100
  notafinalMLOA=nota1MLOA+nota2MLOA+nota3MLOA+nota4MLOA
  #datos de salida
  print("Su nota final es:",notafinalMLOA)
examenMLOA() 