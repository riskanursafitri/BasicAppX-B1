package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    Temperature() {
        this.celcius = 0;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
    public void setFahrenheit(double celcius) {
        this.celcius = (celcius - 32) / 9 * 5;
    }
    public void setKelvins(double celcius) {
        this.celcius = celcius-273.15;
    }

    public double getCelcius() {
        return celcius;
    }
    public double getFahrenheit() {
        return celcius*9/5+32;
    }
    public double getKelvins() {
        return celcius+273.15;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        if (oriUnit.equals("°C") && convUnit.equals("°F")) {
            setCelcius(value);
            return getFahrenheit();
        } else if (oriUnit.equals("°C") && convUnit.equals("K")) {
            setCelcius(value);
            return getKelvins();
        } else if (oriUnit.equals("°F") && convUnit.equals("°C")) {
            setFahrenheit(value);
            return getCelcius();
        } else if (oriUnit.equals("°F") && convUnit.equals("K")) {
            setFahrenheit(value);
            return getKelvins();
        } else if (oriUnit.equals("K") && convUnit.equals("°C")) {
            setKelvins(value);
            return getCelcius();
        } else if (oriUnit.equals("K") && convUnit.equals("°F")) {
            setKelvins(value);
            return getFahrenheit();
        } else {
            return value;
        }
    }
}

