import java.util.Scanner;
class matrix
{
	private int m[][];
	private int rows,cols;
	
	Scanner sc=new Scanner(System.in);
	void getMatrix( int rows,int cols)
	{
		this.rows=rows;
		this.cols=cols;
		m=new int[rows][cols];
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
			{
		System.out.print("Enter "+(i+j)+"element");
		m[i][j]=sc.nextInt();
			}		
	}
	void putMatrix()
	{//rows=3;cols=3;
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
		System.out.print(" "+m[i][j]);
			}
			System.out.println();
			
	}
		
		
	}
	matrix add(matrix p)
	{
		rows=3;cols=3;
		
       matrix r=new matrix();
	   r.m=new int[rows][cols];

	   for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
	   r.m[i][j]=m[i][j]+p.m[i][j];	   
			}
		}
		return r;
		
	}
	
}


class rclassmatrix
{
	public static void main(String arg[])
	{
		
			matrix m1=new matrix();
		m1.getMatrix(3,3);
		matrix m2=new matrix();
		m2.getMatrix(3,3);
		matrix m3=m1.add(m2);
		m3.putMatrix();
		
	}
	
	
}
