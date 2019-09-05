
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1;
int c=0;
int sum=0;
for(int i=1;i<=1000;i++)
{
c=a+b;
a=b;
b=c;
if(c>4000000)
	break;
else
{
if(c%2==0)
	sum=sum+c;
}
	}
System.out.println(sum);
	}
}
