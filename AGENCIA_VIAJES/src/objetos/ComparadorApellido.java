package objetos;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Cliente>{
	
	public int compare (Cliente c1, Cliente c2) {
		return c1.getApellidos().compareTo(c2.getApellidos());
	}
}
