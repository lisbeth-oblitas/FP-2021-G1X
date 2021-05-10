def tarea10():
  #definir variable
  print ("consulta bono navideño")
  resultadobono=0
  #datos de entrada
  tipoX=input("como desea revisar su bono antiguedad o sueldo:")
  antiguedadX=int(input("cuanto de antiguedad tienes:"))
  sueldoX=int(input("cual es tu sueldo:"))
  #proceso
  if tipoX=="antiguedad":
     #antiguedadX=int(input("cuanto de antiguedad tienes:"))
    if antiguedadX>=4:
      resultadobono=(sueldoX*25/100)
    else:
       resultadobono=(sueldoX*20/100)
  if tipoX=="sueldo":
     #sueldoX=int(input("cual es tu sueldo:"))
    if sueldoX<=2000:
       resultadobono=(sueldoX*25/100)
    else:
       resultadobono=(sueldoX*20/100)
  #datos de salida
  print("su bono navideño es:", resultadobono)
tarea10()
