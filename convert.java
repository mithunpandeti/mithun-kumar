public class convert
{
public static void main(String[]args)
{
String s="aaXXXbbSSSdd";
int l=s.length();
int count=0;
for(int i=0;i<l;i++)
{
	if(i==(l-1)){
	}
	else if(s.charAt(i)==s.charAt(i+1))
	{
	count++;
	}
}
System.out.println(count);
}
}
