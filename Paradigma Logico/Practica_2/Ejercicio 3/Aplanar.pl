%Implemente la funci�n aplanar. Esta funci�n recibe una lista con
%m�ltiples listas anidadas como elementos y devuelve una lista con los
%mismos elementos de manera lineal (sin listas).

aplanar([],[]).
aplanar([[Xs|Xss]|Ys],S):-aplanar([Xs|Xss],T1),
    aplanar(Ys,R1),
    append(T1,R1,S),!.

aplanar([[]|Ys],S):-aplanar(Ys,S),!.

aplanar([Xs|Xss],[Xs|S]):-aplanar(Xss,S).
