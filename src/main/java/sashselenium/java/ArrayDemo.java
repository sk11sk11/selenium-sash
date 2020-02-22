package sashselenium.java;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//Array-- collection of similar types of data
		int rollNumber=101;
		
		int rollNumberArray[]=new int[15];
		
		rollNumberArray[0]=100;
		rollNumberArray[1]=105;
		rollNumberArray[2]=107;
		rollNumberArray[3]=103;
		rollNumberArray[4]=106;
		rollNumberArray[5]=99;
		
		for(int i=0; i<=5; i++) {
		System.out.println(rollNumberArray[i]);
		
		}
		
		int rollNumbers[]= {5,7,2,1,9,6,3,10,12};
		System.out.println("Total student count: "+ rollNumbers.length);
		
		for(int i=0; i<rollNumbers.length; i++) {
			System.out.println(rollNumbers[i]+ ", ");
		}
		
		String names[]= {"Raj", "Mohit", "John", "x", "y"};
		for(int i=0; i<names.length; i++) {
		System.out.println(names[i]+"roll number is "+ rollNumbers[i]);
		}

	}

}
