// 1. En impératif (boucle for)
function sommeImperative(n: number): number {
    let total = 0;
    for (let i = 1; i <= n; i++) {
        total += i;
    }
    return total;
}

// 2. En fonctionnel (reduce)
function sommeFonctionnelle(n: number): number {
    // Crée un tableau [1, 2, 3, 4, 5] puis applique reduce
    const nombres = Array.from({ length: n }, (_, i) => i + 1);
    return nombres.reduce((acc, curr) => acc + curr, 0);
}

console.log("Impératif (for) :", sommeImperative(5));
console.log("Fonctionnel (reduce) :", sommeFonctionnelle(5));