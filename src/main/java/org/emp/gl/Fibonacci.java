package org.emp.gl;

/**
 * Classe utilitaire pour calculer les nombres de la suite de Fibonacci
 */
public class Fibonacci {

    /**
     * Calcule le n-ième nombre de Fibonacci de manière récursive
     *
     * @param n l'indice dans la suite (doit être >= 0)
     * @return le n-ième nombre de Fibonacci
     * @throws IllegalArgumentException si n est négatif
     */
    public static int fibonacci(int n) {
        // Vérification de la précondition
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        // Cas de base
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Relation de récurrence F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Version alternative itérative (plus efficace pour les grandes valeurs de n)
     *
     * @param n l'indice dans la suite (doit être >= 0)
     * @return le n-ième nombre de Fibonacci
     * @throws IllegalArgumentException si n est négatif
     */
    public static int fibonacciIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }

    /**
     * Version avec mémoization pour optimiser les appels récursifs
     */
    private static final int MAX_MEMO = 100;
    private static final int[] memo = new int[MAX_MEMO];

    public static int fibonacciMemoization(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        if (n <= 1) {
            return n;
        }

        if (n < MAX_MEMO && memo[n] != 0) {
            return memo[n];
        }

        int result = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);

        if (n < MAX_MEMO) {
            memo[n] = result;
        }

        return result;
    }
}