package lld.observerDesign;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        // Step 7: Register observers with the subject
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);

        // Simulate new weather data
        weatherData.setMeasurements(75.0f, 65.0f, 30.4f);

        // Step 8: Remove an observer (if needed)
        weatherData.removeObserver(currentDisplay);

        // Simulate more weather data
        weatherData.setMeasurements(80.0f, 70.0f, 29.2f);
    }
    
}
