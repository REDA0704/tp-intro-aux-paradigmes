// 1. En impératif (boucle for)
function factorielleImperative(n: number): number {
    let resultat = 1;
    for (let i = 2; i <= n; i++) {
        resultat *= i;
    }
    return resultat;
}

// 2. En fonctionnel (récursion)
function factorielleFonctionnelle(n: number): number {
    if (n <= 1) return 1;
    return n * factorielleFonctionnelle(n - 1);
}

console.log("Impératif (for) : 5! =", factorielleImperative(5));
console.log("Fonctionnel (récursif) : 5! =", factorielleFonctionnelle(5));