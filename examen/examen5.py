def examen5():
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
def examen2():
  #Definir variable y otros
  print("ingrese sus datos:")
  bonoObtenidoMLOA=0.0
  #Datos de Entrada
  salarioMinimoMLOA=float(input("Ingrese el salario:"))
  puntuacionObtenidaMLOA=float(input("Ingrese la puntuación:"))
  #Proceso
  if puntuacionObtenidaMLOA<=100 and puntuacionObtenidaMLOA>=50:
    bonoObtenidoMLOA=salarioMinimoMLOA*10/100
  elif puntuacionObtenidaMLOA >=101 and puntuacionObtenidaMLOA<=150:
    bonoObtenidoMLOA=salarioMinimoMLOA*40/100
  elif puntuacionObtenidaMLOA>=151:
    bonoObtenidoMLOA=salarioMinimoMLOA*70/100
  #Datos de salida
  print("El docente obtendra un bono de:", bonoObtenidoMLOA )
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
  def examen4():
 #definir datos y varibales
 print ("indica que operacion desea realizar")
 operacionMLOA=0
 #ingrese datos de entrada
 numeroMLOA=int(input("ingrese el primer numero:"))
 numero1MLOA=int(input("ingrese el segundo numero:"))
 signoMLOA=input("ingrese el signo de la operacion que quieres realizar:")
 #proceso
 if signoMLOA=="+":
   operacionMLOA=numeroMLOA+numero1MLOA
 if signoMLOA=="-":
   operacionMLOA=numeroMLOA-numero1MLOA
 if signoMLOA=="*":
   operacionMLOA=numeroMLOA*numero1MLOA
 if signoMLOA=="/":
   operacionMLOA=numero/numero1MLOA
 if signoMLOA=="^":
   operacionMLOA=numeroMLOA^numero1MLOA
  #datos de salida
 print("El resultado de su operacion es :",operacionMLOA)
#examenMLOA() 
#examen2()
#examen3()
examen4()