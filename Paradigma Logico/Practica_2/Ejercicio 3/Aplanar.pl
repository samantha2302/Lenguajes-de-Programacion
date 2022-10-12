%Implemente la función aplanar. Esta función recibe una lista con
%múltiples listas anidadas como elementos y devuelve una lista con los
%mismos elementos de manera lineal (sin listas).

aplanar([],[]).
aplanar([[Xs|Xss]|Ys],S):-aplanar([Xs|Xss],T1),
    aplanar(Ys,R1),
    append(T1,R1,S),!.

aplanar([[]|Ys],S):-aplanar(Ys,S),!.

aplanar([Xs|Xss],[Xs|S]):-aplanar(Xss,S).
