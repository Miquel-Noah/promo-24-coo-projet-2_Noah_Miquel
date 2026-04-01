### 1 :
Non une interface ne peut pas accéder directement a un attribut privé de la classe qui 
l'implémente. Mais elle peut y accéder via un accésseur. Dans notre cas a l'aide de getQualityScore
dans duck nous permet de récupérer la valeur de qualityScore  

### 2:
On choisit une interface plutôt qu'une classe abstraite quand la classe permet de répondre à "est capable de" 
alors qu'une classe abstraite répond à "est un".

### 3:
canBeFulfilled(Stock<Duck> stock) est plus restrictive que canBeFulfilled(Stock<? extends Duck> stock) car dans le
premier on limite le paramètre au stock qui stock seulemen des Duck, alors que le second utilise un jocker donc on 
peut lui passez en paramètre tous les stock qui stock des objets qui extends Duck.  
Par exemple :  

Stock<Duck> s1;  
Stock<StandardDuck> s2;  
Si on à ces deux stock et qu'on les passe dans la première méthode :  

canBeFulfilled(s1);  
canBeFulfilled(s2); //renvoie une erreur car Stock<StandardDuck> != Stock<Duck>