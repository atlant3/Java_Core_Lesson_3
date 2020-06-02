package taks1;

public class task1 {

	public static void main(String[] args) {
		// task1_1
		int a = 3;
		double b = 3.4;
		float w = 5.7f;
		char g = 'X';
		long q = 50l;
		short r = 50;
		byte s = 50;
		boolean k = true;
		
		//task1_2
		System.out.println("Max int =" + Integer.MAX_VALUE);
		System.out.println("Min int =" + Integer.MIN_VALUE);
		
		System.out.println("Max Double =" + Double.MAX_VALUE);
		System.out.println("Min Double =" + Double.MIN_VALUE);
		
		System.out.println("Max Float =" + Float.MAX_VALUE);
		System.out.println("Min Float =" + Float.MIN_VALUE);
		
		System.out.println("Char =" + Character.MAX_RADIX);
		System.out.println("Char =" + Character.MIN_RADIX);
		
		System.out.println("Max Long =" + Long.MAX_VALUE);
		System.out.println("Min Long =" + Long.MIN_VALUE);
		
		System.out.println("Max Short =" + Short.MAX_VALUE);
		System.out.println("Min Short =" + Short.MIN_VALUE);
		
		System.out.println("Max Byte =" + Byte.MAX_VALUE);
		System.out.println("Min Byte =" + Byte.MIN_VALUE);
		
		System.out.println("true Boolean =" + Boolean.TRUE);
		System.out.println("false Boolean =" + Boolean.FALSE);
		
		//task1_3
		
		int [] array = {1, 11, 12, 13, 55, 69, 2, 58, 109, 13};
		int min = array[0];
		int max = array[0];
		
		for (int i=0; i< array.length; i++) {
			if (array[i]>max) 
			{
				max = array[i];
			}
			if (array[i]<min) 
			{
				min = array[i];
			}
		}
		
		System.out.println("Min array = " + min);
		System.out.println("Max array = " + max);
	

	}
}
