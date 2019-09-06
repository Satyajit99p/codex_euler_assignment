
public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
		int s=0;
		for( i=2;i>1;i++)
{
			int m=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
	 m=m+1;
	}
	if(m==2)
		s=s+1;
	if(s==10001)
		break;
}
		System.out.println(i);
		
	}

}
