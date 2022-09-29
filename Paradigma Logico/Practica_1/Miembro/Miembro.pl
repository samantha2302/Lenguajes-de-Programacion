% Es para saber si un miembro de la lista, existe en ella,
% devuelve true o false.
miembro(N,[N|_]).
miembro(N,[_|Tail]) :- miembro(N,Tail).
