Miembro 

miembro(N,[N|_]).
miembro(N,[_|Tail]) :- miembro(N,Tail).

miembro(2, [1, 3, 4, 5, 2, 0]). 
miembro(N,[N|_]).                         -> 1) No cumple
miembro(N,[_|Tail]) :- miembro(N,Tail).


2) No cumple, el dos no es igual a la cabeza de la cola restante. 

miembro(2,[_|3, 4, 5, 2, 0]) :- miembro(2, [3, 4, 5, 2, 0]).


3) No cumple, el dos no es igual a la cabeza de la cola restante. 

miembro(2,[_|4, 5, 2, 0]) :- miembro(2, [4, 5, 2, 0]).

4) No cumple, el dos no es igual a la cabeza de la cola restante. 

miembro(2,[_|5, 2, 0]) :- miembro(2, [5, 2, 0]).

4) Cumple, el dos es igual a la cabeza de la cola restante. 

miembro(2,[_|2, 0]) :- miembro(2, [2, 0]) = TRUE