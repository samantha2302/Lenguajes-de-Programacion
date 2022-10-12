% Construya una función que se llame sub_conjunto. Esta función recibe
% dos listas y debe retornar True cuando el primer argumento es
% subconjunto completo del segundo y #f en caso contrario.

subconjunto([],_).
subconjunto([Xs|Xss],Y):-
        member(Xs,Y),
        select(Xs,Y,Z),
        subconjunto(Xss,Z).

