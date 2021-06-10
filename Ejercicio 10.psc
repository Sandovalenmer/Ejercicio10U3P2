proceso Ejercicio10
	
	sumatoria=0
	mutiplos=0
	sumatoria2=0
	
	Mientras sumatoria <= 1000 Hacer
		Escribir "Ingrese el primer número"
		Leer N
		Escribir "Ingrese el segundo número"
		Leer N1
		sumatoria=sumatoria+N+N1
		Escribir sumatoria
		si (n1 % 6=0) Entonces
			multiplos=multiplos+1
		siNo si (n2 % 6 = 0)entonces
				multiplos=multiplos+1	
			sino 
				Escribir "El número NO es un múltiplo de 6"
			FinSi
			si N >= 1 y N <= 10 Entonces
				sumatoria2=sumatoria2+N
			sino si N1 >= 1 y N1 <= 10 Entonces
					sumatoria2=sumatoria2+N1
				SiNo
					Escribir "No hay números entre 1 y 10"
				FinSi
			FinSi
		FinSi
	FinMientras
	
	Escribir "Cantidad de números multiplos de 6: " multiplo_6
	Escribir "Sumatoria de números en el rango: l al 10: " sumatoria_a_1a10 
FinProceso