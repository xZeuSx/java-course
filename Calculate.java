public class Calculate{

	public static void main(String[] args){
		System.out.println("Calculate......");

        //Сложение и вычитание
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		int difference = second - first;
		
		//Умножение и деление
		double a = Double.valueOf(args[2]);
		double b = Double.valueOf(args[3]);
		float c = Float.valueOf(args[4]);
		float d = Float.valueOf(args[5]);
		double multi = a * b;
		double division = b / a;
		double multi_2 = a * b;
		double division_2 = b / a;
		
		
		System.out.println("first + second  = " + summ);
		System.out.println("second - first  = " + difference);
		System.out.println("a * b  = " + multi);
		System.out.println("b / a  = " + division);
		System.out.println("c * d  = " + multi_2);
		System.out.println("d / c  = " + division_2);
	}
}