📌 Règles du Kata

Additionner les nombres contenus dans une chaîne séparée par des virgules (,).

Ex: "1,2,3" → résultat = 6
Gérer les nouvelles lignes (\n) comme séparateurs supplémentaires.

Ex: "1\n2,3" → résultat = 6
Supporter des délimiteurs personnalisés.

Ex: "//;\n1;2" (ici, ; est le séparateur) → résultat = 3
Ignorer les nombres négatifs et afficher une erreur si présents.

Ex: "1,-2,3" → Erreur : "Nombres négatifs non autorisés: -2"
Ignorer les nombres supérieurs à 1000.

Ex: "2,1001" → résultat = 2
Supporter des délimiteurs de plusieurs caractères.

Ex: "//[***]\n1***2***3" → résultat = 6