# Composite Patern
## Definición de Refactoring guru
Permite componer objetos en estructuras de árbol y, a continuación, trabajar con 
estas estructuras como si fueran objetos individuales.

## En otras palabras
Este patrón se basa en la estructura de un arbol, donde tenemos

* El coponente (component)son las ramaz que comunican troncos y hojas,
es esta interfaz que define las operaciones que son comunes entre los troncos y las hojas 
* Las hojas (leaf) que serían las hojas de un árbol, implementan y personalizan la
la interfaz (ramas).
* El Composite (contenedor) que sería el tronco (tallo), seria la clase que utiliza las
subclases a traves de la interfaz, normalmente recibe una solicitud, delega el trabajo
a las subclases, y luego combina  los resultados o hace calculos intermedios (si es necesario)
y devuelve el resultado final al cliente

