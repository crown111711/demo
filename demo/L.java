package demo;
import java.util.Scanner;
public class L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[]validation1={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
		int[]validation2={2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31};
		int[]validation3={4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31};
		int[]validation4={8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31};
		int[]validation5={16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		int i,j,Birthday=0;
		int[]p=new int[10];
		int[][]q={validation1,validation2,validation3,validation4,validation5};
		for(j=0;j<=4;j++)
		{
			p=q[j];
			
		  for(i=0;i<=15;i++)
		  {
			 System.out.print(p[i]+" ");
			if((i+1)%4==0)
			 {
				 System.out.println(" ");
			 }
		  }
		  System.out.println("\n这是第"+j+"组数"+"\n");  
		  System.out.println("please estimate that your Birthday is in this digita collection?please say yes or no ");
		  Scanner input=new Scanner(System.in);
		  String response=input.nextLine();
		  if(response.equals("yes"))
		  {
			 Birthday+=p[0] ;
		  }
			  
		}
		/*System.out.println("please estimate that your Birthday is in a digita collection of the five");
	    String response1=input.next();
		String response2=input.next();
		String response3=input.next();
		String response4=input.next();
		String response5=input.next();
		*/
		
		System.out.println("your Birthday is"+" "+Birthday);
		
	}

}
