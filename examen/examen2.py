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
examen2()
