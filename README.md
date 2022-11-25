# Design Patterns
Ejemplos de patrones de diseño para construir sistemas con buenas cualidades de programación orientada a objetos.

## Índice de contenidos
- [Strategy](#strategy)
  + [Ejemplo](#ejemplo)
    - [Código cliente](#c-digo-cliente)
    - [Salida](#salida)
    - [Diagrama](#diagrama)

## Strategy
El patrón de estrategia permite:

- Definir una familia de algoritmos.
- Encapsular cada algoritmo y lo hace intercambiable.
- Que el algoritmo varíe independientemente del cliente que lo use.

### Ejemplo
#### Código cliente
```java
import strategy.KnifeBehavior;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();
    }
}
```
#### Salida
```bash
Attacking with Sword ⚔!
Attacking with Knife 🔪!
```

#### Diagrama
![Strategy Pattern drawio](https://user-images.githubusercontent.com/1725054/203911981-a833082e-06db-4be6-9dda-96eb131679c6.png)
