package ee.itcollege.exercises.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;

public class ListNaide {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		
		URL resource = ListNaide.class.getResource("kala.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(resource.toURI())));
	
			System.out.println(reader.readLine());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
				
		
		Generics<Integer> generics = new Generics<Integer>();
		generics.setObject(5);
		
		SortableList<Student> names = new SortableList<Student>();
		names.add(new Student("Anna"));
		names.add(new Student("Mai"));
		names.add(new Student("Abigail"));
		names.sort();
		
		System.out.println(names);
		
		
		
	}
	
	

}
