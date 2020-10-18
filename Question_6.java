
public class Question_6 {

	public static void main(String[] args) {
double s=0;
int p=0;
double x=0;
for (int i=1;i<=100;i++)
{
	s=s + (i*i);
	p=p+i;
}	
x=x+(p*p);
double z=x-s;
System.out.println(z);
	}

}
