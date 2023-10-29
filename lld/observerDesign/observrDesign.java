package lld.observerDesign;

import java.util.ArrayList;
import java.util.List;

// Step 1: Define the Observer interface
interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// Step 2: Define the Subject (Publisher)
class WeatherData {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    // Step 3: Register and remove observers
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Step 4: Notify observers of state changes
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // Step 5: Update state and notify observers
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers(); // Notify observers when the data changes
    }
}

// Step 6: Create Concrete Observers
class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Update current conditions display
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}

class StatisticsDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Update statistics display
        System.out.println("Weather statistics updated.");
    }
}



// Define an Observer interface to ensure that all observers implement the update method.

// Create a WeatherData class (the subject) that maintains a list of observers and notifies them when its state (temperature, humidity, pressure) changes.

// Observers, such as CurrentConditionsDisplay and StatisticsDisplay, implement the Observer interface and update themselves when they receive new data.

// Register and remove observers with the subject. This allows you to dynamically add or remove observers.

// Notify observers of changes when the subject's state is updated.

// In the main program, we create a WeatherData instance and register the CurrentConditionsDisplay and StatisticsDisplay as observers. When we update the weather data, both displays are notified automatically, and they react to the changes.

// The Observer Pattern helps keep the subject and observers loosely coupled, making it easy to add new displays or other components without modifying the subject. It follows the 20-80 rule by providing a simple and efficient way to achieve a highly decoupled design, allowing you to expand and maintain your codebase with ease.