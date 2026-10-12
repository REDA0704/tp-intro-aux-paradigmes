% Cas de base : 0! = 1
factorielle(0, 1).

% Cas récursif : N! = N * (N-1)!
factorielle(N, Resultat) :-
    N > 0,
    N1 is N - 1,
    factorielle(N1, Resultat1),
    Resultat is N * Resultat1.

% Exécution
:- factorielle(5, R), writeln(R).
:- halt.