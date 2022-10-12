%%
%        a ---- c ---- x
%      /   \   /
%     /	    \ /
%   i        X
%     \     / \
%      \   /   \
%        b ---- d ---- f
%

conectado(i,a,2).
conectado(i,b,18).
conectado(a,i,4).
conectado(a,c,15).
conectado(a,d,6).
conectado(b,i,10).
conectado(b,c,15).
conectado(b,d,20).
conectado(c,a,3).
conectado(c,x,9).
conectado(c,b,5).
conectado(d,b,2).
conectado(d,a,4).
conectado(d,f,6).
conectado(x,c,6).
conectado(f,d,12).


ruta(Ini,Fin,Ruta,Peso):- ruta2(Ini,Fin,[],Ruta,Peso).

ruta2(Fin,Fin,_,[Fin],0).
ruta2(Ini,Fin,Visitados,[Ini|Resto],Peso):-

    conectado(Ini,Alguien,Peso2),
    not(member(Alguien,Visitados)),
    ruta2(Alguien,Fin,[Ini|Visitados],Resto,P),
    Peso is P + Peso2.

% Modifique el predicado para averiguar las rutas en un grafo para que
% calcule la ruta más corta de todas en función de pesos que deben
% agregarse al grafo.
listaRutasConPesos(Ini,Fin,ListaRuta):- findall([Ruta,Peso],ruta(Ini,Fin,Ruta,Peso),ListaRuta).

rutacortapesos(Ini,Fin):-
    listaRutasConPesos(Ini,Fin,ListaRuta),
    rutaCortaPesos(ListaRuta,[],100,RutaCorta,Peso),
    write('Ruta corta: '), write(RutaCorta), nl,
    write('Peso: '), write(Peso).

rutaCortaPesos([],RF,PF,RF,PF):-!.
rutaCortaPesos([[R,P]|T],_,Pa,RutaCorta,Peso):-
    P=<Pa,
    rutaCortaPesos(T,R,P,RutaCorta,Peso).

rutaCortaPesos([_|T],Ra,Pa,RutaCorta,Peso):-
    rutaCortaPesos(T,Ra,Pa,RutaCorta,Peso).
