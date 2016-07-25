import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("JAN=1\nFEB=2\nMAR=3\nAPR=4\nMAY=5\nJUN=6\nJUL=7\nAUG=8\nSEP=9\nOCT=10\nNOV=11\nDEC=12");
		System.out.println("Enter the Code of the Month");
		int a=s.nextInt();
		switch(a)		
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Month has 31 Days");
			break;
		case 2:
			System.out.println("Month has 28 or 29 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Month has 30 Days");
			break;
		default:
			System.out.println("Invalid Month");
		}
		s.close();
	}
}
