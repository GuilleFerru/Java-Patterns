public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 100.0f;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    //private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        //this.weatherData = weatherData;
        weatherData.registerObsever(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;

        }

        display();

    }

    @Override
    public void display() {
        System.out.println("Average temp: " + (tempSum / numReadings) + " - Max register temp: " + maxTemp
                + " - Min register temp: " + minTemp);

    }

}
