package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculatedForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            //adding 1 Celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        Collection<Double> temps = temperatures.getTemperatures().values();
        List<Double> tempsToAverage = new ArrayList<>(temps);
        double cumulativeTemp = 0;
        for (Double temperature : tempsToAverage) {
            cumulativeTemp += temperature;
        }
        return cumulativeTemp / tempsToAverage.size();
    }

    public double getMedianTemperature() {
        Collection<Double> temps = temperatures.getTemperatures().values();
        List<Double> tempsToMedian = new ArrayList<>(temps);
        double median;
        tempsToMedian.sort(Comparator.reverseOrder());
        int midTemp = ((tempsToMedian.size()*2)/4);
        median = tempsToMedian.get(midTemp);
        return median;
    }

}
