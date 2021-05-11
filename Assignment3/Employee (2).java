package abhishekkkkk;

import java.util.Scanner;//import Scanner

class Employee{ //parent class Employee
    String name; //
    int id;//4 bytes
    String address;
    long mobile_no;//8 bytes
}


class salary extends Employee  {//child class inheriting employee class


    double basic_pay;//Basic pay
    double hra;
    double da;
    double pf;
    double scf;
    double gross_salary;
    double net_salary;


    public void input() {//function to take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        name=scanner.nextLine();//getting name as input from user

        System.out.println("Enter employee id:");
        id=scanner.nextInt();//getting id as input from user
        scanner.nextLine();

        System.out.println("Enter your full address:");
        address=scanner.nextLine();//getting addresss from user

        System.out.println("Enter mobile no:");
        mobile_no=scanner.nextLong();//getting mobileno from user

       

        System.out.println();
    }

    public void calculate(){//function to calculate gross salary and net salary
        da=basic_pay*0.97;//formula to calculate da from basic pay
        hra=basic_pay*0.1;//formula to calculate hra from basic pay
        pf=basic_pay*0.12;//formula to calculate pf from basic pay
        scf=basic_pay*0.001;//formula to calculate scf from basic pay

        gross_salary=basic_pay+da+hra;//calculating gross salary
        net_salary=gross_salary-pf-scf;//calculating net salary
    }

    public void display(){//function to calculate display
        System.out.println("Displaying employee details...");
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Designation at organization: Programmer");
        System.out.println("Employee full address:"+address);
        System.out.println("Employee mobile no:"+mobile_no);
        System.out.println("your basic pay is:"+basic_pay);
        System.out.println("your gross salary is:"+gross_salary);
        System.out.println("your net salary is:"+net_salary);
        System.out.println();

    }




}

class Programmer extends salary{//child class inheriting salary class
    
    Programmer(double bp){//parameterized constructor
        basic_pay=bp;
    }
    
    public void input(){//calling input function
        super.input();
    }
    
      public void calculate(){//calling calculate function
        super.calculate();
    }
    
      public void display(){//calling display function
        super.display();
    }
}    
    
class Team_Lead extends salary{//child class inheriting salary
    Team_Lead(double bp){//parametirized constructor 
        basic_pay=bp;
    } 
    
     public void input(){//calling input function
        super.input();
    }
    
      public void calculate(){//calling calculate function
        super.calculate();
    }
    
      public void display(){//calling display function
        super.display();
    }
}

class Assistant_Project_Manager extends salary{//child class inheriting salary
    Assistant_Project_Manager(double bp){//Parameterized constructor
        basic_pay=bp;
    }
    
     public void input(){//calling input fxn
        super.input();
    }
    
      public void calculate(){//calling calculate fxn
        super.calculate();
    }
    
      public void display(){//calling display function
        super.display();
    }
}
    
    
    
class Project_Manager extends salary{//child class inheriting salary class
    Project_Manager(double bp){//parameterized constructor
        basic_pay=bp;
    }
    
     public void input(){// calling input fxn
        super.input();
    }
    
      public void calculate(){//calling calculate fxn
        super.calculate();
    }
    
      public void display(){// calling display fxn
        super.display();
    }
}
    class Main11{//Mainclass
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double s1,s2,s3,s4;

        int no;//choice
        
        while(true) {
            System.out.println("Enter your choice:");
            System.out.println("Press: \n1 for Programmer \n2 for Assistant Project Manager \n3 for Project Manager \n4 for Team Leader");
            no=scan.nextInt();
            
            switch (no) {
                
                case 1://Programmer
                System.out.println("Enter basic pay for employee at Programmer's designation:");
               s1 = scan.nextDouble();
               Programmer pg = new Programmer(s1);
                pg.input();
                pg.calculate();
                pg.display();
                break;

                case 2://Asst. Project manager
                System.out.println("Enter basic pay for employee at Assistant Project Manager's designation:");
                s2 = scan.nextDouble();
                Assistant_Project_Manager asm = new Assistant_Project_Manager(s2);
                asm.input();
                asm.calculate();
                asm.display();
                break;

                case 3://Project manager
                System.out.println("Enter basic pay for employee at Project Manager's designation:");
                s3 = scan.nextDouble();
                Project_Manager pm = new Project_Manager(s3);
                pm.input();
                pm.calculate();
                pm.display();
                break;

                case 4://Team leader
                System.out.println("Enter basic pay for employee at Team Leader's designation:");
                s4 = scan.nextDouble();
                Team_Lead tl = new Team_Lead(s4);
                tl.input();
                tl.calculate();
                tl.display();
                break;
                
                default:
                System.out.println("Please Enter a valid choice and try again...");
                break;
            }
        }

    }
}






