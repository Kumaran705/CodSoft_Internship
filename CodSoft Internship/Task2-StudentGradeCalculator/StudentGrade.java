
import java.util.*;
public class StudentGrade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Subjects: ");
        int n=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the Mark of Subject "+i+"= ");
            int mark=sc.nextInt();
            totalmarks+=mark;
        }
        double avg=(double)totalmarks/n;
        char grade;
        if(avg>=90)
             grade='S';
        else if(avg>=80&&avg<90)
           grade='A';
        else if(avg>=70&&avg<80)
             grade='B';
        else if(avg>=60&&avg<70)
              grade='C';
        else if(avg>=50&&avg<60)
            grade='D';
        else
            grade='F';
        System.out.println("-----------RESULT---------");
        System.out.println("Total Marks: "+totalmarks);
        System.out.printf("Average Percentage: %.2f\n",avg);
        System.out.println("Grade :"+grade);
        sc.close();

        

    }

}