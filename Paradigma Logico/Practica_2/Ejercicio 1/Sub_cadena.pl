%Implemente un predicado que, a partir de una lista de cadenas de
%parámetro, filtre aquellas que contengan una subcadena que el usuario
%indique en otro argumento.
%
subcadena(Pre,Palabra) :-
        sub_string(Palabra, _, _, _, Pre),!.
filtersubcadena(Pre, X, Y) :-
        include(subcadena(Pre), X, Y).
