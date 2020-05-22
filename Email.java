import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail;
     private int mailboxCapacity;

     public Email(String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;
         System.out.println("Email created: " + firstName + " "+ lastName);

         //Call a method asking for department and return department
         this.department = setDepartment();
         System.out.println("Department " + this.department);
     }

     private String setDepartment(){
         System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
         Scanner scan = new Scanner(System.in);
         int deptChoice = scan.nextInt();
         if(deptChoice == 1 ){
             return "Sales";
         } else if(deptChoice == 2){
             return "Development";
         } else if(deptChoice == 3){
             return "Accounting";
         } else{
             return "";
         }
         
     }

     //getters
    //  public String getName(String name){
    //      this.firstName + this.lastName = name;
    //  }
}