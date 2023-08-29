package udemyPracticePrograms;

public class WeatherAdvisor {

	public String provideWeatherAdvisory(int temperature) {
		// Provide a weather advisory message based on the temperature.
		if (temperature < 0) {
			return "It's freezing! Wear a heavy coat.";
		} else if (temperature >= 0 && temperature <= 10) {
			return "It's cold! Bundle up.";
		} else if (temperature > 10 && temperature <= 20) {
			return "It's cool! A light jacket will do.";
		} else if (temperature > 20 && temperature <= 40) {
			return "It's warm! Enjoy the day.";
		} else {
			return "Dont go out!";
		}
	}

	public static void main(String[] args) {
		WeatherAdvisor obj = new WeatherAdvisor();
		System.out.println(obj.provideWeatherAdvisory(55));
	}
}