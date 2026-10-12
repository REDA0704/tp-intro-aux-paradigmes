% Cas de base : la somme de 1 à 0 vaut 0
somme(0, 0).

% Cas récursif : Somme de 1 à N = N + Somme de 1 à (N-1)
somme(N, Total) :-
    N > 0,
    N1 is N - 1,
    somme(N1, Total1),
    Total is N + Total1.

% Exécution automatique au lancement
:- somme(5, Resultat), writeln(Resultat).
:- halt.