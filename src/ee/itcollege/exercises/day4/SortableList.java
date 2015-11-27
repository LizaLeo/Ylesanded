package ee.itcollege.exercises.day4;

import java.util.ArrayList;
import java.util.Collections;


public class SortableList<E extends Comparable<E>> extends ArrayList<E>{

	public void sort() {
		Collections.sort(this);
		
	}
	
	
	

}
