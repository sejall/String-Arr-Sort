import java.io.Console;
class StringArrSort
{
	public static void main(String args[])
	{
		Console con= System.console();
		System.out.print("enter size of array");
		int a= Integer.parseInt(con.readLine());
		
		String b[] = new String[a];
		for (int i=0;i<a;i++)
		{
			b[i]=con.readLine();
		}
		for(int i=0;i<a-1;i++)
			for(int j=i+1;j<a;j++)
			{
				if(b[i].compareTo(b[j])>0)
				{
					String t;
					t=b[i];
					b[i]=b[j];
					b[j]=t;
				}
			}
		for (int i=0;i<a;i++)
		{
			System.out.println(b[i]);
		}
	}
}

