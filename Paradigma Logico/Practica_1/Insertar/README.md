Insertar

insertar(E,[],[E]).
insertar(E,[H|T],[E|[H|T]]):-  E < H,!.
insertar(E,[H|T],[H|R]):- insertar(E,T,R).

Primero 
	E = es el elemento a insertar
	H = cabeza de la lista 
	T = Cuerpo de la lista 
	
Verifica si el primer elemento es menor que la cabeza de la lista 

	insertar(3 ,[1|2, 4, 5],[3|[1|2, 4, 5]]):-  3 < 1,!.
	
No cumple, por lo tanto se llama recursivamente, pero con el siguiente elemento de la lista, que toma   
a ser cabeza de la lista

	insertar(3 ,[2|4, 5],[3|[2|4, 5]]):-  3 < 2,!.

No cumple, por lo tanto se llama recursivamente, pero con el siguiente elemento de la lista, que toma   
a ser cabeza de la lista

	insertar(3 ,[4| 5],[3|[4| 5]]):-  3 < 4,!.

Cumple, por lo tanto 
	
	insertar(3,[4|5],[4|5]):- insertar(3, [4,5], [1,2,3,4,5])








