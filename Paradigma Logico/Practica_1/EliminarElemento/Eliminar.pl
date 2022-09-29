eliminar(_, [], []).
% Y equivale al numero que hay que eliminar
% Xs es la cola de la lista
% Zs es la lista modificada sin el elemento
eliminar(Y, [Y|Xs], Zs):- eliminar(Y, Xs, Zs), !.
eliminar(X, [Y|Xs], [Y|Zs]):- eliminar(X, Xs, Zs).
