
public class Question_4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
		for(int i=100;i<=999;i++)
{
	for(int j=100;j<=999;j++)
	{
		int q=i*j;
		int p=i*j;
		int r=0;
		while(p!=0)
		{
			int d=p%10;
			r=(r*10)+d;
			p=p/10;
		}
		if(r==q)
			 x=r>x?r:x;
	}
}
System.out.println(x);
	}

}
