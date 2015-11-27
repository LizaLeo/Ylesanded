package ee.itcollege.exercises.day4;

public class Generics<T extends Comparable<?>> {
	
	T object;
    public void setObject(T object) {
        this.object = object;
    }

}
