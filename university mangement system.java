
import java.util.*;
interface a{
    public void changename();
    public void changereg();
}

interface b extends a{
    public void changeroll();
    public void changeadd();
}

abstract class student implements b{
    
       Scanner sc = new Scanner(System.in);
       
       String name;
       int roll;
       int reg;
       String address;
       
       void input(String name, int roll, int reg, String address){
           this.name = name;
           this.roll = roll;
           this.reg = reg;
           this.address = address;
       }
       
}

class student1 extends student
{
     public void changename()
       {
           String s;
           System.out.print("Enter New Name : ");
           s = sc.next();
           this.name = s;
           System.out.println("Name Changed Successfully");   
       }
    public void changereg(){
        int x;
        System.out.print("Enter New Registration Number : ");
        x = sc.nextInt();
        this.reg = x;
         System.out.println("Reg.NO Changed Successfully");    
    }
    public void changeroll(){
        int x;
        System.out.print("Enter New Roll Number : ");
        x = sc.nextInt();
        this.roll = x;
	 System.out.println("Roll NO Changed Successfully");
    }

    public void changeadd(){
        String x;
        System.out.print("Enter New Address City: ");
        x = sc.next();
        this.address = x;
	 System.out.println("Address Changed Successfully");
    }
}

class teacher1{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    int salary;
    String branch;
    String subject;
    
    teacher1(String name,int id,int salary,String branch,String subject)
    {
       this.name = name;
       this.id = id;
       this.salary = salary;
       this.branch = branch;
       this.subject = subject;
    }
    
    public void changename()
    {
        System.out.print("\nEnter The New Name");
        String x;
        x = sc.next();
        this.name = x;
        System.out.println("Name Changed Successfully");
    }
   public void changeid()
    {
        System.out.print("\nEnter The New ID");
        int x;
        x = sc.nextInt();
        this.id = x;
        System.out.println("ID Changed Successfully");
        
    }
    public void changesalary(){
        System.out.print("\nEnter The New Salary");
        int x;
        x = sc.nextInt();
        this.salary = x;
        System.out.println("Salary Changed Successfully");
    }
    public void changebranch(){
        System.out.print("\nEnter The New Branch");
        String x;
        x = sc.next();
        this.branch = x;
        System.out.println("Branch Changed Successfully");
    }
    public void changesubject(){
        System.out.print("\nEnter The New Subject");
        String x;
        x = sc.next();
        this.subject = subject;
        System.out.println("Subject Changed Successfully");
    }
}

public class LPUSARKAR {
    public static void main(String args[]) {
    try{
    System.out.println("\n\n--------------------LPUSARKAR---------------------\n");
            Scanner sc = new Scanner(System.in);
            student1 a[] = new student1[100];
            a[0] = new student1();
            a[1] = new student1();
            a[2] = new student1();
            a[3] = new student1();
            a[4] = new student1();
            a[5] = new student1();
            a[0].input("Raman" ,   1,11802377,"  Varanasi");
            a[1].input("BABA"  ,   2,11801988,"  Lucknow");
            a[2].input("Gaggu" ,   3,11801999,"  Kalka");
            a[3].input("Barkha",   4,11801966,"  Gujrat");
            a[4].input("Anju"  ,   5,118101944," Jhajjar");
            a[5].input("Vadai" ,   6,11802443,"  jagadhri");
            
            int size = 6;
            
            teacher1 a1[] = new teacher1[100];
            
            a1[0] = new teacher1("Nitin",  1,100000,"B.Tech","Mathemtics");
            a1[1] = new teacher1("Swati",  2,100000,"MBA",   "English");
            a1[2] = new teacher1("Rajni",  3,100000,"B.Tech","Physics");
            a1[3] = new teacher1("kamal",  4,100000,"M.Sc",  "Chemistry");
            a1[4] = new teacher1("Aditya", 5,100000,"M.Tech","Python");
            a1[5] = new teacher1("Rani",6,100000,"M.Tech","Mechanics");
            
            int size1 = 6;
            
            int t; t=0;
            while(t!=2)
            {
            System.out.print("1) Log In\n2) Exit\nEnter Your Choice : ");
            t = sc.nextInt();
            
            switch(t)
            {
            case 1:{
            String s1; String s2;
            System.out.println("\nEnter Credentials");
            System.out.print("USERNAME : ");
            s1 = sc.next();
            System.out.print("PASSWORD : ");
            s2 = sc.next();
            if(s1.equals("Rishabh") && s2.equals("Bansalshaab"))
            {
            int u; u=0;
            while(u!=3)
            {
            System.out.println("\n1) STUDENT RECORDS\n2) TEACHER RECORDS\n3) Log Out\n\n Enter Your Choice : ");
            u = sc.nextInt();
            
            switch(u)
            {
                case 1:{
                    int n; n= 0;
            while(n!=5)
            {

            System.out.println("\n\nSelect Any Option :-\n1) Show All Students Details\n2) Add Student\n3) Remove Student\n4) Change Name/Roll No/Registration  
No/Address Of Student\n5) Back\n");
            n = sc.nextInt();
            switch(n)
            {
                case 1: {
                    System.out.print("    \t" + "Name" + " \t" + "Roll No." + "   \t" + "Registration No." + "  \t" + "Address" + " \n");
                    for(int i=0;i<size;i++)
                    {
                        System.out.print((i+1) + ") \t" + a[i].name + " \t " + a[i].roll + " \t\t" + a[i].reg + " \t\t" + a[i].address + " \n");
                    }
                    break;
                }
                 case 2: {
                    
                    String x1; int x2; int x3; String x4;
                    
                    System.out.print("Name Of New Student : ");
                    x1 = sc.next();
                    System.out.print("Roll.No Of New Student: ");
                    x2 = sc.nextInt();
                    System.out.print("Registration No Of New Student : ");
                    x3 = sc.nextInt();
                    System.out.print("Address City Of New Student : ");
                    x4 = sc.next();
                    
                    a[size] = new student1();
                    a[size].input(x1,x2,x3,x4);
                    size++;
                    break;
                    
                }
                
                case 3:{
                    System.out.print("    \t" + "Name" + " \t" + "Roll No." + "   \t" + "Registration No." + "  \t" + "Address" + " \n");
                    for(int i=0;i<size;i++)
                    {
                        System.out.print((i+1) + ") \t" + a[i].name + " \t " + a[i].roll + " \t\t" + a[i].reg + " \t\t" + a[i].address + " \n");
                    }
                    
                    int x;
                    System.out.print("Enter The Student You Want To Delete.");
                    x = sc.nextInt();
                    
                    x = x - 1;
                    
                    student1 temp = new student1();
                    for(int i=x;i<=size-1;i++)
                    {
                        temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                    }
                    --size;
                    break;
                }
                
                case 4:{
                    System.out.println("\n1)Change Name\n2)Change Roll No\n3)Change Registration No\n4)Change Address\n");
                    int c;
                    c = sc.nextInt();
                    switch(c){
                        case 1 :{
                        System.out.print("    \t" + "Name" + " \t" + "Roll No." + "   \t" + "Registration No." + "  \t" + "Address" + " \n");
                    for(int i=0;i<size;i++)
                    {
                        System.out.print((i+1) + ") \t" + a[i].name + " \t " + a[i].roll + " \t\t" + a[i].reg + " \t\t" + a[i].address + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose Name Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a[x-1].changename();
                         break;
                        }
                        
                        case 2:{
                            System.out.print("    \t" + "Name" + " \t" + "Roll No." + "   \t" + "Registration No." + "  \t" + "Address" + " \n");
                    for(int i=0;i<size;i++)
                    {
                        System.out.print((i+1) + ") \t" + a[i].name + " \t " + a[i].roll + " \t\t" + a[i].reg + " \t\t" + a[i].address + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose Roll Number Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a[x-1].changeroll();
                         break;
                        }
                        
                        case 3:{
                            System.out.print("    \t" + "Name" + " \t" + "Roll No." + "   \t" + "Registration No." + "  \t" + "Address" + " \n");
                    for(int i=0;i<size;i++)
                    {
                        System.out.print((i+1) + ") \t" + a[i].name + " \t " + a[i].roll + " \t\t" + a[i].reg + " \t\t" + a[i].address + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose Registration Number Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a[x-1].changereg();
                         break;
                        }
                        
                        case 4:{
                            System.out.print("    \t" + "Name" + " \t" + "Roll No." + "   \t" + "Registration No." + "  \t" + "Address" + " \n");
                    for(int i=0;i<size;i++)
                    {
                        System.out.print((i+1) + ") \t" + a[i].name + " \t " + a[i].roll + " \t\t" + a[i].reg + " \t\t" + a[i].address + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose Address Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a[x-1].changeadd();
                         break;
                        }
                        
                        default : System.out.println("Wrong Option Selected");
                        break;
                    }
                    break;
                }
                
                case 5:{
                    System.out.println("Thank You For Using STUDENT MANAGEMENT SYSTEM !");
                    break;
                }
                
                default : {
                    System.out.println("Wrong Option Selected");
                    break;
                }
            }
            }
                    break;
                }
                
                case 2:{
                    int n; n= 0;
            while(n!=5)
            {

            System.out.println("\n\nSelect Any Option :-\n1) Show All Teachers Details\n2) Add Teacher\n3) Remove Teacher\n4) Change Name/ID/Salary/Branch/Subject\n5)  
Back\n");
            n = sc.nextInt();
            switch(n)
            {
                case 1: {
                    System.out.print("    \t" + "Name" + " \t" + "ID" + "   \t" + "SALARY" + "  \t" + "BRANCH" + "\t" + "SUBJECT" + " \n");
                    for(int i=0;i<size1;i++)
                    {
                        System.out.print((i+1) + ") \t" + a1[i].name + " \t " + a1[i].id + "\t" + a1[i].salary + "\t\t" + a1[i].branch + "\t" + a1[i].subject + " \n");
                    }
                    break;
                }
                
                case 2: {
                    
                    String x1; int x2; int x3; String x4; String x5;
                    
                    System.out.print("Name Of New Teacher : ");
                    x1 = sc.next();
                    System.out.print("ID Of New Teacher: ");
                    x2 = sc.nextInt();
                    System.out.print("Salary Of New Teacher : ");
                    x3 = sc.nextInt();
                    System.out.print("Branch Of New Teacher : ");
                    x4 = sc.next();
                    System.out.print("Subject Of New Teacher : ");
                    x5 = sc.next();
                    
                    a1[size1] = new teacher1(x1,x2,x3,x4,x5);
                    size1++;
                    System.out.println("Teacher Added Successfully");
                    break;
                    
                }
                
                case 3:{
                    System.out.print("    \t" + "Name" + " \t" + "ID" + "   \t" + "SALARY" + "  \t" + "BRANCH" + "\t" + "SUBJECT" + " \n");
                    for(int i=0;i<size1;i++)
                    {
                        System.out.print((i+1) + ") \t" + a1[i].name + " \t " + a1[i].id + "\t" + a1[i].salary + "\t\t" + a1[i].branch + "\t" + a1[i].subject + " \n");
                    }
                    
                    int x;
                    System.out.print("Enter The Teacher You Want To Delete : ");
                    x = sc.nextInt();
                    
                    x = x - 1;
                    
                    teacher1 temp = new teacher1(" ",0,0," "," ");
                    for(int i=x;i<=size1-1;i++)
                    {
                        temp = a1[i];
                        a1[i] = a1[i+1];
                        a1[i+1] = temp;
                    }
                    --size1;
                    System.out.println("Teacher Deleted Successfully");
                    break;
                }
                
                case 4:{
                    System.out.println("\n1)Change Name\n2)Change ID\n3)Change Salary\n4)Change Branch\n5)Change Subject\n");
                    int c;
                    c = sc.nextInt();
                    switch(c){
                        case 1:{
                     System.out.print("    \t" + "Name" + " \t" + "ID" + "   \t" + "SALARY" + "  \t" + "BRANCH" + "\t" + "SUBJECT" + " \n");
                    for(int i=0;i<size1;i++)
                    {
                        System.out.print((i+1) + ") \t" + a1[i].name + " \t " + a1[i].id + "\t" + a1[i].salary + "\t\t" + a1[i].branch + "\t" + a1[i].subject + " \n");
                   }
                         
                         int x;
                         System.out.print("Whose Name Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a1[x-1].changename();
                         break;
                        }
                        
                        case 2 :{
                        System.out.print("    \t" + "Name" + " \t" + "ID" + "   \t" + "SALARY" + "  \t" + "BRANCH" + "\t" + "SUBJECT" + " \n");
                    for(int i=0;i<size1;i++)
                    {
                        System.out.print((i+1) + ") \t" + a1[i].name + " \t " + a1[i].id + "\t" + a1[i].salary + "\t\t" + a1[i].branch + "\t" + a1[i].subject + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose ID Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a1[x-1].changeid();
                         break;
                        }
                        
                        case 3:{
                            System.out.print("    \t" + "Name" + " \t" + "ID" + "   \t" + "SALARY" + "  \t" + "BRANCH" + "\t" + "SUBJECT" + " \n");
                    for(int i=0;i<size1;i++)
                    {
                        System.out.print((i+1) + ") \t" + a1[i].name + " \t " + a1[i].id + "\t" + a1[i].salary + "\t\t" + a1[i].branch + "\t" + a1[i].subject + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose Salary Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a1[x-1].changesalary();
                         break;
                        }
                        
                        case 4:{
                        System.out.print("    \t" + "Name" + " \t" + "ID" + "   \t" + "SALARY" + "  \t" + "BRANCH" + "\t" + "SUBJECT" + " \n");
                    for(int i=0;i<size1;i++)
                    {
                        System.out.print((i+1) + ") \t" + a1[i].name + " \t " + a1[i].id + "\t" + a1[i].salary + "\t\t" + a1[i].branch + "\t" + a1[i].subject + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose Branch Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a1[x-1].changebranch();
                         break;
                        }
                        
                        case 5:{
                     System.out.print("    \t" + "Name" + " \t" + "ID" + "   \t" + "SALARY" + "  \t" + "BRANCH" + "\t" + "SUBJECT" + " \n");
                    for(int i=0;i<size1;i++)
                    {
                        System.out.print((i+1) + ") \t" + a1[i].name + " \t " + a1[i].id + "\t" + a1[i].salary + "\t\t" + a1[i].branch + "\t" + a1[i].subject + " \n");
                    }
                         
                         int x;
                         System.out.print("Whose Subject Do You Want To Change ? \n");
                         x = sc.nextInt();
                         a1[x-1].changesubject();
                         break;
                        }
                        
                        default : System.out.println("Wrong Option Selected");
                        break;
                    }
                    break;
            }
                
                
                case 5:{
                    System.out.println("Thank You For Using TEACHER MANAGEMENT SYSTEM !");
                    break;
                }
                
                default : {
                    System.out.println("Wrong Option Selected");
                    break;
                }
            }
            
    }
                    break;
                }
                
                case 3: {
                    //System.out.println("Thank You For Using University Management System");
                    break;
                }
                
                default: {
                    System.out.println("Wrong Option Selected. Please Select A Right Option.\n");
                    break;
                }
            }
            }
            }
            else
            {
                System.out.println("\nWrong Credentials. Please Try Again\n");
            }
            break;
            
            }
            
            case 2:{
                System.out.println("\nThank You For Using University Management System\n");
                break;
            }
            
            default:{
                System.out.println("Wrong Option Selected. Please Select Right Option");
                break;
            }
            }
            }
    }
    catch(ArithmeticException e)
    {
        System.out.println(" Arithmetic Exception Handled");
    }
        }
        
      
    }
