# ShadowingChallenge

"PrisionShadowing" es un programa que te permite generar de manera aleatoria una prisión en donde tendrás los siguientes caracteres representativos:
1. "|" : Muros
2. "_" : Pasos del prisionero o pasillo
3. "P" : Prisionero
4. "S" : Salida
5. "<" o ">" o "^" o "v" : Guardias
6. "G" : Representacion de la visibilidad de un guardia


# Instalación

El programa tiene un ejecutable portatil el cual se encuentra en la ruta de proyect .\PrisionShadowing\dist , dicho ejecutable se llama PrisionShadowing.jar ,
al hacer doble clic sobre dicho ejecutable se podrá ejecutar el programa.

# Cómo se usa

Al abrir el programa podrás ver la prisión generada de manera aleatoria. La misma te indicará los siguiente:
1. Cantidad de Guardas: guardias generados de manera aleatoria en alguna posición de la prisión
2. Resistencia del Prisionero: Cantidad de pasos posibles que puede dar el prisionero para encontrar la salida
3. Resolución: un comentario que te indicará si el prisionero ha logrado escapar o no.
4. Pasos dados: en caso que el prisionero haya logrado encontrar una salida, se mostrará siempre y cuando el prisionero haya logrado escapar.
5. Ruta de Escape mas Corta: son la posiciones de los pasos que el Prisionero tendrá que seguir en una matriz NxM para lograr llegar ala Salida de la prisión
6. Prisión: la representación gráfica de la prisión.
7. Jugar de Nuevo: permitirá crear una nueva oportunidad de escape del prisionero en una nueva prisión.
8. Salir: Cerrará el archivo ejecutable

# Como Funciona?

El programa "PrisionShadowing" crea de manera aleatoria posiciones de objetos mediante cálculos aleatorios y condicionantes para el mejor posicionamiento de los objetos
anteriormente descritos. A su vez su función principal es buscar la salida más corta dentro de una matriz NxM, en este caso potenciado con la lógica de funcionamiento del
algoritmo de Lee, el cual consiste en buscar la menor cantidad de "pasos" a dar de un punto A(X,Y) a un punto B(X,Y), permitiendo avanzar solo sobre caracteres específicos "_".
El movimiento del prisionero solo puede darse de la siguiente manera: Arriba, Abajop, Izquierda, Derecha

# Repositorio

https://github.com/hdob/ShadowingChallenge.git
