package labcodingfiles;
import java.util.*;
public class labcoding2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		

	}

}
