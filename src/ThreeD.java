import java.util.Scanner;

public class ThreeD {

	public static void main(String[] args) {
	
		    int size=0;
		    int topicNumber=1;
		    Scanner scan = new Scanner(System.in);
		    
			System.out.println("PLease enter number of topics per semester:  ");
			size=scan.nextInt();
		    
		    int [] [] [] students = new int [3] [2] [size];

		    for (int i=0; i<students.length; i++)
		    {
		    	System.out.println( "Please insert student class no.:   ");
    			scan.nextInt();
    			
		    	for (int j=0; j<students[i].length; j++)
		    	{
		    		System.out.println( "Please insert students id:  ");
	    			scan.nextInt();
	    			topicNumber=1;
	    			
		    		for (int k=0; k<students[i][j].length; k++)
		    		{
		    			System.out.println("PLease enter students mark for topic number " + topicNumber+ " : " );
		    			scan.nextInt();
	                    if (topicNumber<=size)
		    			topicNumber++;

		    		}
		    	}
		    	
		    }
		        		
	
	}

}
