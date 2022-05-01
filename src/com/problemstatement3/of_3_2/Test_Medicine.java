package com.problemstatement3.of_3_2;

public class Test_Medicine {
	
		public static void main(String[] args) 
		{
			 Medicine_Interface  m[] = new  Medicine_Interface [5];
		double i = Math.random()*4;
		int j = (int) i;
		System.out.println(j);
		switch(j)
		{
		case 1: m[0] = new  Medicine_Interface ();

		m[1] = new Tablet();
		m[0].displayLabel();
		m[1].displayLabel();
		break;
		case 2: m[2] = new Medicine_Interface ();
		m[3] = new Syrup();
		m[2].displayLabel();
		m[3].displayLabel();
		break;
		case 3: m[4] = new  Medicine_Interface ();
		m[5] = new Ointment();
		m[4].displayLabel();
		m[5].displayLabel();
		break;
		default: System.out.println("Invalid Choice");
		}

}
}