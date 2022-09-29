insertar(E,[],[E]).
insertar(E,[H|T],[E|[H|T]]):-  E < H,!.
insertar(E,[H|T],[H|R]):- insertar(E,T,R).
