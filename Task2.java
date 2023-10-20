import java.util.*;
 class Task2
 {

    public static void main(String args[])
    {
        System.out.println("\n\n*****WELCOME TO SBMP*****\n\n");
        Scanner input=new Scanner(System.in);
        Info i=new Info();
        int english,maths,science,ss,french;
        float totalmarks;
        float avg;
        
        System.out.println("Enter Student Name:");
        i.name=input.next();
        System.out.println("Enter Student Roll No:");
        i.rollno=input.nextInt();
        System.out.println("Enter the marks according to the Subjects:\n");
        System.out.println("Mathematics:");
        maths=input.nextInt();
        System.out.println("English:");
        english=input.nextInt();
         System.out.println("Science:");
        science=input.nextInt();
         System.out.println("Social Studies:");
        ss=input.nextInt();
         System.out.println("French:");
        french=input.nextInt();

          if ((english >= 0 && english <= 100) && (maths >= 0 && maths <= 100) && (science >= 0 && science <= 100) && (french >= 0 && french <= 100) && (ss>=0 && ss<=100)) {
                 totalmarks = english + maths + science + french + ss;
                 avg = totalmarks / 5f;
         i.display();
        if(avg>90.0 && avg<=100.0)
        {
            
            System.out.println("Total Marks: "+totalmarks+"/500\nPercentage: "+avg+"\nGrade: A");
        }
        else if(avg>75.0 && avg<=90.0)
        {
            System.out.println("Total Marks: "+totalmarks+"/500\nPercentage: "+avg+"\nGrade: B");
    
        }
        else if(avg>60.0 && avg<=75.0)
        {
            System.out.println("Total Marks: "+totalmarks+"/500\nPercentage: "+avg+"\nGrade: C");

        }
        else if(avg>35.0 && avg<=60.0)
        {
            System.out.println("Total Marks: "+totalmarks+"/500\nPercentage: "+avg+"\nGrade: D");

        }
        else if(avg<=35.0)
        {
            System.out.println("Total Marks: "+totalmarks+"/500\nPercentage: "+avg+"\n");
            System.out.println("Fail");

        }
    
     }
        
    else
    {
            System.out.println("Invalid");
    }
        
    }
 }
 class Info
 {
    int rollno;
    String name;
     void display()
    {
        System.out.println("Student Name: "+name+"\n"+"Student Roll No: "+rollno);
    }
 }