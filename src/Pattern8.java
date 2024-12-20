
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		for(int i=1;i<=5;i++)
		{
		for(int j=i;j<=6;j++)
		{
		if((i+j)<=6)
		{
		System.out.print("_ ");
		}
		else
		{
		System.out.print("* ");
		}
		}
		System.out.println();
		}
	}

}
