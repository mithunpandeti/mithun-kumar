#include<stdio.h>
void main()
{
	int a[5]={1,2,3,4,5};
	int b,c,d=5,t;
	for(int i=0;i<5;i++)
	{
		b=a[i];
		t=b;
		if(d%2==1)
		{
			for(int j=i+1;j<5;j++)
			{
				if(b<a[j])
				{
					b=a[j];
					c=j;
				}
			}
			
			a[i]=a[c];
			a[c]=t;
		}
		else
		{
			for(int j=i+1;j<5;j++)
			{
				if(b>a[j])
				{
					b=a[j];
					c=j;
				}
			}
			a[i]=a[c];
			a[c]=t;
		}
		d--;
	}
	for(int i=0;i<5;i++)
	{
		printf("%d",a[i]);
	}	
}