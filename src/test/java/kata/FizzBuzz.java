package kata;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	//Creating an internal field so it can be read in another method
	private List<String> resultList;
	
	//Main method to create the list
	public void run() {
		resultList = new ArrayList<String>();
		for (int i=1; i<=100; i++) {
			boolean multipleOfThree = i%3==0;
			boolean multipleOfFive = i%5==0;
			
			StringBuilder value = new StringBuilder();
			if (multipleOfThree) {
				value.append("Fizz");
			}
			if (multipleOfFive) {
				value.append("Buzz");
			}
			if (!multipleOfThree && !multipleOfFive) {
				value.append(i);
			}
		   
			resultList.add(value.toString());
		}
		
	}

	//Method to get the total size of the Array
	public int getNumberLength() {
		return resultList.size();
	}

	public String getValueForPosition(int position) {
		//Position starts on 1 while index starts on 0
		return resultList.get(position-1);
	}

}
