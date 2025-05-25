#TP=0  Projet de Tests Unitaires Java

Ce projet est une implémentation de différentes classes Java avec leurs tests unitaires correspondants, utilisant JUnit 5. Il sert de démonstration des bonnes pratiques de test unitaire et de la programmation orientée objet en Java.

## Structure du Projet

Le projet est organisé comme suit :

```
src/
├── main/java/org/emp/gl/
│   ├── Person.java         # Classe représentant une personne
│   ├── Stack.java          # Implémentation d'une pile
│   ├── Fibonacci.java      # Calcul des nombres de Fibonacci
│   ├── Prime.java          # Vérification des nombres premiers
│   ├── Factorial.java      # Calcul de la factorielle
│   ├── BankAccount.java    # Gestion de compte bancaire
│   ├── Matrix.java         # Opérations sur les matrices
│   └── Main.java           # Point d'entrée de l'application
└── test/java/
    ├── PersonTest.java
    ├── StackTest.java
    ├── FibonacciTest.java
    ├── PrimeTest.java
    ├── FactorialTest.java
    ├── BankAccountTest.java
    └── MatrixTest.java
```

## Fonctionnalités

### 1. Person
- Gestion des informations d'une personne (nom, prénom, âge)
- Vérification de la majorité
- Formatage du nom complet

### 2. Stack
- Implémentation d'une pile d'entiers
- Opérations push, pop, peek
- Redimensionnement automatique
- Gestion des erreurs (pile vide)

### 3. Fibonacci
- Calcul récursif des nombres de Fibonacci
- Gestion des cas limites
- Vérification des entrées invalides

### 4. Prime
- Vérification si un nombre est premier
- Optimisation pour les grands nombres
- Gestion des cas spéciaux (0, 1, 2)

### 5. Factorial
- Calcul itératif de la factorielle
- Gestion des cas limites (0, 1)
- Vérification des entrées invalides

### 6. BankAccount
- Gestion de compte bancaire
- Opérations de dépôt, retrait, transfert
- Calcul des intérêts
- Gestion des erreurs (solde insuffisant)

### 7. Matrix
- Opérations sur les matrices carrées
- Addition, multiplication, transposition
- Gestion des erreurs (tailles incompatibles)

## Tests Unitaires

Les tests unitaires sont implémentés en utilisant JUnit 5 et suivent les principes du category equivalence testing. Chaque classe de test couvre :

- Cas normaux
- Cas limites
- Cas d'erreur
- Tests paramétrés
- Séquences d'opérations complexes

## Prérequis

- Java 8 ou supérieur
- Maven
- JUnit 5

## Installation

1. Clonez le repository :
```bash
git clone [URL_DU_REPO]
```

2. Naviguez dans le dossier du projet :
```bash
cd [NOM_DU_PROJET]
```

3. Compilez le projet avec Maven :
```bash
mvn clean install
```

## Exécution des Tests

Pour exécuter tous les tests :
```bash
mvn test
```

Pour exécuter un test spécifique :
```bash
mvn test -Dtest=PersonTest
```

## Bonnes Pratiques Implémentées

1. **Tests Unitaires**
   - Pattern AAA (Arrange, Act, Assert)
   - Tests paramétrés
   - Gestion des exceptions
   - Tests de performance

2. **Programmation Orientée Objet**
   - Encapsulation
   - Gestion des erreurs
   - Documentation du code

3. **Qualité du Code**
   - Nommage explicite
   - Code modulaire
   - Gestion des cas limites

## Contribution

Les contributions sont les bienvenues ! N'hésitez pas à :
1. Fork le projet
2. Créer une branche pour votre fonctionnalité
3. Commiter vos changements
4. Pousser vers la branche
5. Ouvrir une Pull Request

## Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.
