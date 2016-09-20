public class build
{
public static void main(String[]args)
{
String s="abbCCCddBBBxx";
StringBuilder sb = new StringBuilder(s);
		int maxcount = 0, count=0;
		maxcount++;
		count++;
		for(int i=1; i<sb.length(); i++)
		{
			
			if(sb.charAt(i) == sb.charAt(i-1)) {
				count++;
				if(count > maxcount)
					maxcount = count;
			}
			else if(sb.charAt(i) != sb.charAt(i-1))
				count = 1;
				}
				System.out.println(maxcount);
				}
	}
