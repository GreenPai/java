package sub1;

import java.io.ObjectInputStream.GetField;

public class FruitBox<T> {
	private T frult;
	
	public T getFrult() {
		return frult;
	}
	
	public void setFrult(T frult) {
		this.frult = frult;
	}
	
}
