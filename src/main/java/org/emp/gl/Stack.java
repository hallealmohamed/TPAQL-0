package org.emp.gl;

/**
 * Implémentation d'une pile (stack) d'entiers avec tableau dynamique
 */
public class Stack {
    private int[] array;          // Tableau pour stocker les éléments
    private int top;             // Index du sommet de la pile
    private static final int INITIAL_CAPACITY = 10;  // Capacité initiale

    /**
     * Constructeur - Initialise une pile vide
     */
    public Stack() {
        array = new int[INITIAL_CAPACITY];
        top = -1;  // -1 indique que la pile est vide
    }

    /**
     * Ajoute un élément au sommet de la pile
     * @param element L'élément à ajouter
     */
    public void push(int element) {
        // Si le tableau est plein, on l'agrandit
        if (top == array.length - 1) {
            expandArray();
        }
        array[++top] = element;  // Incrémente top puis ajoute l'élément
    }

    /**
     * Retire et retourne l'élément au sommet de la pile
     * @return L'élément au sommet
     * @throws IllegalStateException si la pile est vide
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];  // Retourne l'élément puis décrémente top
    }

    /**
     * Retourne l'élément au sommet sans le retirer
     * @return L'élément au sommet
     * @throws IllegalStateException si la pile est vide
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }

    /**
     * Vérifie si la pile est vide
     * @return true si la pile est vide, false sinon
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Retourne le nombre d'éléments dans la pile
     * @return La taille de la pile
     */
    public int size() {
        return top + 1;
    }

    /**
     * Méthode interne pour agrandir le tableau lorsqu'il est plein
     */
    private void expandArray() {
        int newCapacity = array.length * 2;  // Double la capacité
        int[] newArray = new int[newCapacity];

        // Copie les éléments dans le nouveau tableau
        System.arraycopy(array, 0, newArray, 0, array.length);

        array = newArray;  // Remplace l'ancien tableau par le nouveau
    }

    /**
     * Méthode utilitaire pour afficher le contenu de la pile (pour débogage)
     * @return Une représentation textuelle de la pile
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(array[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}