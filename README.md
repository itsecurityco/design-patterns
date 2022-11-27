# Design Patterns
Ejemplos de patrones de diseño para construir sistemas con buenas cualidades de programación orientada a objetos basados en el libro Head First Design Patterns.

## Índice de contenidos
- [Strategy](#strategy)
- [Observer](#observer)

## Strategy
El patrón estrategia permite:

- Definir una familia de algoritmos.
- Encapsular cada algoritmo y lo hace intercambiable.
- Que el algoritmo varíe independientemente del cliente que lo use.

### Ejemplo
```java
import strategy.KnifeBehavior;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();

        Character queen = new Queen();
        queen.fight();
        queen.fight();
    }
}
```
#### Salida
```bash
Attacking with Sword ⚔!
Attacking with Knife 🔪!
Attacking with Bow and Arrow 🏹!
Attacking with Bow and Arrow 🏹!
```

#### Diagrama
![Strategy Pattern](https://user-images.githubusercontent.com/1725054/203911981-a833082e-06db-4be6-9dda-96eb131679c6.png)

## Observer
El patrón observador permite:

- Crear una dependencia de uno a muchos entre objetos.
- Cuando un objeto actualiza su estado, todos los demás objetos que dependen de él son notificados y actualizados automáticamente.

### Ejemplo
```java
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(19, 46, 28.31f);
        weatherData.setMeasurements(30, 45, 28.31f);
        weatherData.setMeasurements(28, 43, 28.28f);

        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurements(31, 45, 29.30f);
    }
}
```
#### Salida
```bash
Current conditions: 19.0C degrees and 46.0% humidity.
Avg/Max/Min temperature = 19.0/19.0/19.0.
More of the same.

Current conditions: 30.0C degrees and 45.0% humidity.
Avg/Max/Min temperature = 24.5/30.0/19.0.
More of the same.

Current conditions: 28.0C degrees and 43.0% humidity.
Avg/Max/Min temperature = 25.666666/30.0/19.0.
Watch out for cooler, rainy weather.

Current conditions: 31.0C degrees and 45.0% humidity.
Avg/Max/Min temperature = 27.0/31.0/19.0.
```

#### Diagrama
![Observer Pattern](https://user-images.githubusercontent.com/1725054/204122987-bbf1e5f1-d162-471b-8b22-29d6fa0e1a80.png)
