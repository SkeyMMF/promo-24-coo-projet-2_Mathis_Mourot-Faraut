# Exercice 1

## Question 1

Une méthode default dans une interface ne peut pas accéder directement aux champs privés de la classe qui l'implémente. Elle doit  
utiliser les méthodes publiques définies dans l'interface pour accéder aux données. Dans isDefective(), on appelle getQualityScore()  
qui est une méthode abstraite définie dans Qualifiable et implémentée dans Duck, permettant ainsi d'accéder au score de qualité.
