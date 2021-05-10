def tarea3():
  #Definir Variables
  print("consulta si ya votas")
  resultadoaños=0
  #datos de entrada
  añosX=int(input("ingresa tu edad: "))
  #proceso
  if añosX>=18:
    resultadoaños="apto para votar"
  else:
    resultadoaños="no apto para votar"
  #datos de salida
  print(resultadoaños)
tarea3()
