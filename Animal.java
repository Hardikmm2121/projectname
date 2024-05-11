
public interface Animal {

	int eye = 2;
	void walk();
	default void eat() {
		System.out.println("Eating in interface...");
	}
}



