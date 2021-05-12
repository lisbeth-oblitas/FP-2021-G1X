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
examen4()