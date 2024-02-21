import java.util.Scanner;
public class GradeCalculator {
                                                    
	 //Grade calculate System
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects: :");
		int subject=sc.nextInt();
		double marks[]=new double[subject];
		
		
		for(int i=0;i<subject;i++)
		{
			System.out.println("Enter the marks obtained in subject  "+(i+1)+" :");
			marks[i]=sc.nextDouble();
		}
		
		double totalmarks=0;
		for(int i=0;i<marks.length;i++)
		{
			totalmarks = totalmarks+marks[i];
		}
		
		double average=totalmarks/subject;
		
		char grade=calculateGrade(average);
		
		System.out.println("--------------------------------");
		System.out.println("Total marks          :"+totalmarks);
		System.out.println("Average Percentage   :"+average);
		System.out.println("Grade                :"+grade);
		System.out.println("-----------Thank you--------------");
		
        sc.close();
	}
	private static char calculateGrade(double average)
	{
		if(average>=90)
		{
			return 'A';
		}else if(average>=80) {
			return 'B';
		}else if(average>=70) {
			return 'C';
		}else if(average>=60){
			return 'D';
		}else {
			return 'F';
		}
	}

}