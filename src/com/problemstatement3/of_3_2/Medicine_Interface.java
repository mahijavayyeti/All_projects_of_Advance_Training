package com.problemstatement3.of_3_2;

public class Medicine_Interface {
	

	
		public void displayLabel(){
			System.out.println("Company : Globex Pharma");
			System.out.println("Address : Bangalore");
			}
		}
	class Tablet extends  Medicine_Interface 
	{
		 
	public void displayLabel(){
		System.out.println("store in a cool dry place");
		}
	}
	class Syrup extends  Medicine_Interface {
		public void displayLabel(){
			System.out.println("Consumption as directed by thephysician");
			}
		}
	class Ointment extends  Medicine_Interface {
				public void displayLabel(){
				         System.out.println("for external use only");
				         }
				}

