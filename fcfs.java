
import java.util.*;

class fcfs{
	
	int process;
	float at[],bt[],tat[],wt[];
	
	public static void main(String[] arr)
	{
		int i,j,avgta,avgwt;
		fcfs f=new fcfs();
		Scanner sc=new Scanner(System.in);
		f.process=sc.nextInt();
		//System.out.print(f.process);
		f.at=new float[f.process];
		f.bt=new float[f.process];
		f.tat=new float[f.process];
		f.wt=new float[f.process];
		
		for(i=0;i<f.at.length;i++)
		{
			f.at[i]=sc.nextFloat();
			
			f.bt[i]=sc.nextFloat();
			
			
			
				}
				
		for(i=0;i<f.at.length;i++)
		{
		for(j=0;j<f.at.length-i-1;j++)
		{
			if(f.at[j]>f.at[j+1])
			{
			float temp=f.at[j];
			f.at[j]=f.at[j+1];
			f.at[j+1]=temp;
			
			float temp=f.bt[j];
			f.bt[j]=f.bt[j+1];
			f.bt[j+1]=temp;
		    }
		}		
		}for(int  i = 0 ; i < n; i++)
		{
			if( i == 0)
			{	
				ct[i] = ar[i] + bt[i];
			}
			else
			{
				if( ar[i] > ct[i-1])
				{
					ct[i] = ar[i] + bt[i];
				}
				else
					ct[i] = ct[i-1] + bt[i];
			}
			ta[i] = ct[i] - ar[i] ;          // turnaround time= completion time- arrival time
			wt[i] = ta[i] - bt[i] ;          // waiting time= turnaround time- burst time
			avgwt += wt[i] ;               // total waiting time
			avgta += ta[i] ;               // total turnaround time
		}
		
		System.out.println("\npid  arrival  brust  complete turn waiting");
		for(int  i = 0 ; i< n;  i++)
		{
			System.out.println((i+1) + "  \t " + ar[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + ta[i] + "\t"  + wt[i] ) ;
		}
		sc.close();
		System.out.println("\naverage waiting time: "+ (avgwt/n));     // printing average waiting time.
		System.out.println("average turnaround time:"+(avgta/n));
		
		
	}
	
	
}