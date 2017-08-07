package kata;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	//Creating an internal field so it can be read in another method
	private List<Integer> intList;
	
	//Main method to create the list
	public void run() {
		intList = new ArrayList<Integer>();
		for (int i=1; i<=100; i++) {
			intList.add(i);
		}
		
	}

	//Method to get the total size of the Array
	public int getNumberLength() {
		return intList.size();
	}

}
