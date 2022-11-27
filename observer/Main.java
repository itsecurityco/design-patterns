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