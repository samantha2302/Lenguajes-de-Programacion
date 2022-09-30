Factorial

factorial(0,1).
factorial(A,B) :-
		A > 0,
		C is A-1,
		factorial(C,D),
		B is A*D.
		
		
1) Primero A = 5, verifica si A > 0, como cumple, se crea C = A-1 -> C = 5-1
2) Se llama recursivamente 	
	factorial(C,D) -> factorial(4,D)
	
3) Se vuelve a evaluar la condicion A > 0 -> 4 > 0, cumple
4)  C = A-1 -> C = 4-1
5) Se llama recursivamente 	
	factorial(C,D) -> factorial(3,D)
	
6) Se vuelve a evaluar la condicion A > 0 -> 3 > 0, cumple
7)  C = A-1 -> C = 3-1
8) Se llama recursivamente 	
	factorial(C,D) -> factorial(2,D)
	
9) Se vuelve a evaluar la condicion A > 0 -> 2 > 0, cumple
10)  C = A-1 -> C = 2-1
11) Se llama recursivamente 	
	factorial(C,D) -> factorial(1,D)
	
12) Se vuelve a evaluar la condicion A > 0 -> 1 > 0, cumple
13)  C = A-1 -> C = 1-1
14) Se llama recursivamente 	
	factorial(C,D) -> factorial(0,D)

Como llega a case base el comportamiento de D es: 
	factorial(C,D) -> 	factorial(0,1)
					factorial(1,1)  A*D = 1*1
					factorial(2,1)  A*D = 2*1
					factorial(3,2)  A*D = 3*2
					factorial(4,6)  A*D = 4*6
					factorial(5,24)  A*D = 5*24
					

								


