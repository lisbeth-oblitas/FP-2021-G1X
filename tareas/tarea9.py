def tarea9():
  #definir variables
  print ("consulta que vacuna te toca")
  #datos de entrada
  añosX=int(input("ingresa tu edad:"))
  #proceso
  if añosX>=70:
    resultadoaños="se le aplica la vacuna tipo C"
  if añosX>16 and añosX<=69:
     sexoX=input("ingresar sexo:") 
     if sexoX=="hombre":
       resultadoaños="se le aplica la vacuna A"
     if sexoX=="mujer":
       resultadoaños="se le apliva la vacuna B"
  if añosX<=16:
    resultadoaños="se le aplica la vacuna tipo A"
  #datos de salida
  print("A la persona:",resultadoaños)
tarea9()
