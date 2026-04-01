# Exercice 1

## Question 1

Une méthode default dans une interface ne peut pas accéder directement aux champs privés de la classe qui l'implémente. Elle doit  
utiliser les méthodes publiques définies dans l'interface pour accéder aux données. Dans isDefective(), on appelle getQualityScore()  
qui est une méthode abstraite définie dans Qualifiable et implémentée dans Duck, permettant ainsi d'accéder au score de qualité.

# Exercice 2

## Question 2

La règle Java est que seul une classe abstraite peut contenir des champs et un constructeur. Si Maintainable était abstraite, elle ne  
pourrait pas être implémentée en parallèle avec une autre classe, alors qu’une interface peut être ajoutée à une classe déjà héritée.  
Ici Maintainable est un "contrat" et Machine est une base commune avec état et logique partagée, donc on choisit une interface pour  
Maintainable et une classe abstraite pour Machine.
