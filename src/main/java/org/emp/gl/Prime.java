package org.emp.gl;
/**
 * Classe utilitaire pour vérifier si un nombre est premier
 */
public class Prime {

    /**
     * Vérifie si un nombre est premier
     * @param n le nombre à tester
     * @return true si n est premier, false sinon
     */
    public static boolean isPrime(int n) {
        // Les nombres inférieurs à 2 ne sont pas premiers
        if (n < 2) {
            return false;
        }

        // 2 est le seul nombre premier pair
        if (n == 2) {
            return true;
        }

        // Les nombres pairs > 2 ne sont pas premiers
        if (n % 2 == 0) {
            return false;
        }

        // Vérifie les diviseurs impairs jusqu'à sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}