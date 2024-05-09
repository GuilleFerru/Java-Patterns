public class App {
    public static void main(String[] args) throws Exception {
        
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(25,60 ,960);
        weatherData.setMeasurements(27,50 ,970);
    }
}
