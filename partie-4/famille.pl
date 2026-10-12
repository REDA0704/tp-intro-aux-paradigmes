% Faits
parent(jean, paul).
parent(paul, luc).
parent(marie, luc).
parent(sophie, paul).
parent(sophie, claire).
parent(claire, emma).


%---Règle n°1----

% Grand-parent : X est grand-parent de Y si X est parent d’un Z qui est parent de Y
grandparent(X, Y) :- parent(X, Z), parent(Z, Y).

% Frère/soeur : X est frère/soeur de Y si ils partagent un parent
sibling(X, Y) :- parent(Z, X), parent(Z, Y), X \= Y.



%---Règle n°2----

% Ancêtre (définition récursive)
% Base : X est ancêtre direct de Y si X est parent de Y
ancestor(X, Y) :- parent(X, Y).
% Récursion : X est ancêtre de Y si X est parent de Z et Z est ancêtre de Y
ancestor(X, Y) :- parent(X, Z), ancestor(Z, Y).

% Oncle/tante
uncle_or_aunt(X, Y) :- sibling(X, Z), parent(Z, Y).



%---Règle n°3----

cousin(X, Y) :- parent(PX, X), parent(PY, Y), sibling(PX, PY).



