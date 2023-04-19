import java.util.*;
import java.util.Map.*;
public class pg13 {
	static HashMap<String,String> m1=new HashMap<>();
	static HashMap<String,String> m2=new HashMap<>();
	public static HashMap<String,String> saveCountryCapital(String s1,String s2) {
		m1.put(s1, s2);
		return m1;
	}
	public static void getCapital(String countryname) {
		System.out.println("Capital of "+countryname+" is :: "+m1.get(countryname));
	}
	public static void getCountry(String capitalname) {
		for(Entry<String,String> entry : m1.entrySet()) {
			if(entry.getValue()==capitalname) {
				System.out.println(capitalname+" belongs to the country "+entry.getKey());
				break;
			}
		}
	}
	public static HashMap<String,String> getnewmap() {
		for(Entry<String,String> entry : m1.entrySet()) {
			m2.put(entry.getValue(), entry.getKey());
		}
		return m2;
	}
	public static ArrayList<String> getAL() {
		ArrayList<String> al=new ArrayList<>();
		for(Entry<String,String> entry : m1.entrySet()) {
			al.add(entry.getKey());
		}
		return al;
	}
	public static void main(String[] args) {
		saveCountryCapital("India","Delhi");
		saveCountryCapital("Japan","Tokyo");
		System.out.println("The hashmap is :: "+m1);
		getCapital("Japan");
		getCountry("Delhi");
		System.out.println("New hashmap is :: "+getnewmap());
		System.out.println("Arraylist is :: "+getAL());

	}

}
