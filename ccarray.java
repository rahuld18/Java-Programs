import java.util.Scanner;
class ccarray 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String s[],p[];
boolean b=true;
int t=sc.nextInt();
while(b){
int n=sc.nextInt();
int k=sc.nextInt();
s=new String[n];
for(int i=0;i<n;i++){
	
	
	s[i]=sc.next();
}


for(int i=0;i<k;i++){
	int pp=sc.nextInt();
	
	p=new String[pp];
	for(int j=0;j<pp;j++)
	p[i]=sc.next();

for(int j=0;j<n;j++)
{
	for(int l=0;l<pp;l++){
	if(s[j].equals(p[j]))
	{
		System.out.print("YES ");
	}
	else{
		System.out.print("NO ");
	}
	}
}


}


t--;
if(t==0)
	b=false;

}

	
	
}
}