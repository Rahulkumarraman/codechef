import java.util.Scanner;
class Scholarship
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		if(r>=1 && r<=50)
			System.out.println("100");
		else if(r>=51 && r<=100)
			System.out.println("50");
		else
			System.out.println("0");
	}
}