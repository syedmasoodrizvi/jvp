package Lab_12;

public class Task1 {
	
		public static void main(String args[]) { 
		int[] number = {25,33,43,81,78,41,381,191,201};
		try{
			System.out.println(number[1]);
			System.out.println(number[41]);
			}
			catch(ArrayIndexOutOfBoundsException e){ 
				System.out.println ("Array Index is Out Of Bounds");
			}
		}	
	}

