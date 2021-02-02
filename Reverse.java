import java.util.Scanner;
public class Reverse
{
	public static void main(String [] args)
	{
		int [] num = {1,2,3,4,5};
		int left = 0;
		int right = num.length-1;
		int temp;
		
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		while (left < right)
		{
			temp = num[left];
			num[left] = num[right];
			num[right] =temp;
			left++;
			right--;
		}
		System.out.println("The numbers are");
		for (int k=0;k<num.length;k++)
		{
		
		
				System.out.print(num[k]+ ",");
		}
	}
}