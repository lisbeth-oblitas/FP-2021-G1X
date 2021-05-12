def examen3():
  #definir variables
  print ("consulta que vacuna te toca")
  resultadoMLOA=0
  #datos de entrada
  añosMLOA=int(input("ingresa tu edad:"))
  #proceso
  if añosMLOA>=70:
    resultadoMLOA="se le aplica la vacuna tipo C"
  if añosMLOA>16 and añosMLOA<=69:
     sexoMLOA=input("ingresar sexo:") 
     if sexoMLOA=="hombre":
       resultadoMLOA="se le aplica la vacuna A"
     if sexoMLOA=="mujer":
       resultadoMLOA="se le aplica la vacuna B"
  if añosMLOA<=16:
    resultadoMLOA="se le aplica la vacuna tipo A"
  #datos de salida
  print("A la persona:",resultadoMLOA)
examen3()
