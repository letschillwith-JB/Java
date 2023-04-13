import java.util.*;
public class HashingDemo {

	public static Map<Character, List<String>> addName(String names[]){
		
		//sort the array
		Arrays.sort(names);
		
		Map<Character,List<String>> map = new HashMap<>();
		for(int i=0; i<names.length; i++) {
			Character c = names[i].charAt(0);
			if(map.containsKey(c)) {
				map.get(c).add(names[i]);
			}else {
				List<String> l = new ArrayList<>();
				l.add(names[i]);
				map.put(c, l);
			}
		}
		return map;
	}
	
	
	public static void display(Map<Character, List<String>> map) {
		
		for(Map.Entry<Character, List<String>> m:map.entrySet()) {
			System.out.print(m.getKey()+" : ");
			List<String> l = m.getValue();
			for(int i=0; i<l.size(); i++) {
				System.out.print(l.get(i)+", ");
			}
			System.out.println();
		}
	}
	
	public static boolean searchName(Map<Character, List<String>> map, String name) {
		Character c = name.charAt(0);
		if(!map.containsKey(c)) return false;
		else {
			List<String> l = new ArrayList<>();
			l = map.get(c);
			if(l.contains(name))return true;
			else return false;
		}
	}
	
	public static boolean removeName(Map<Character, List<String>> map, String name) {
		Character c = name.charAt(0);
		if(!map.containsKey(c)) return false;
		else {
			List<String> l = new ArrayList<>();
			l = map.get(c);
			if(l.contains(name)) {
				l.remove(l.indexOf(name));
				return true;
			}else 
				return false;
		}
	}
	
	
	public static void main(String[] args) {
		String names[] = {"Naya", "Ishaan", "Jai", "Inaya", "Amar", "Navi",
		"Dhruv",
		"Kanan", "Diya", "Shyla", "Agastya", "Ananya", "Nila", "Tenzin",
		"Tamia",
		"Shaan", "Ajay", "Jaya", "Anjali", "Aditi", "Reva", "Sahil",
		"Darsh", "Aja",
		"Ambar", "Deven", "Ishani", "Kavi", "Marjane", "Jasleen",
		"Ashwin", "Aadhira",
		"Candy", "Kum", "Salina", "Artha", "Raghav", "Avan", "Sitara",
		"Shylah", "Divya",
		"Varun", "Sona", "Shaila", "Kimaya", "Farid", "Kashvi", "Devi",
		"Charu", "Mihir", "Tulsi",
		"Anila", "Anala", "Vivan", "Amitabh", "Mahika", "Sudhir",
		"Lata", "Anand", "Akshay"};
		Map<Character, List<String>> map = addName(names);
		
		System.out.println("The original map is ");
		display(map);
		
		
		System.out.println();

		if(searchName(map, "Farid")) {
		System.out.println("Name 'Farid' found in Map");
		}else {
		System.out.println("Name 'Farid' not found in Map");
		}
		System.out.println();
		if(searchName(map, "Harish")) {
		System.out.println("Name 'Harish' found in Map");
		}else {
		System.out.println("Name 'Harish' not found in Map");
		}
		System.out.println();
		if(removeName(map, "Lata")) {
		System.out.println("Name 'lata' removed from Map");
		}else {
		System.out.println("Name 'lata' not in map hence not deleted");
		}
		System.out.println();
		if(removeName(map, "Harish")) {
		System.out.println("Name 'Harish' removed from Map");
		}else {
		System.out.println("Name 'Harish' not in map hence not deleted");
		}
		System.out.println();
		display(map);
		}
	}

