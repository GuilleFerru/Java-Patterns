public class App {
    public static void main(String[] args) throws Exception {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(3, 12, 955);
        weatherData.setMeasurements(12, 20, 960);
        weatherData.setMeasurements(18, 27, 970);
        weatherData.setMeasurements(1, 10, 958);
    }
}
