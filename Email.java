import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail, email;
    private String companySuffix = "thecompany.com";
     private int mailboxCapacity = 500;
     private int defaultPasswordLength = 10;

     public Email(String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;
        //  System.out.println("Email created: " + firstName + " "+ lastName);

         //Call a method asking for department and return department
         this.department = setDepartment();
        //  System.out.println("Department " + this.department);

         //Call a method to return a random password
         this.password = randomPassword(defaultPasswordLength);
         System.out.println("Your password is: " + this.password);
         //combne elements to generate email
         email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
        //  System.out.println("Your email is: " + email);
     }

     private String setDepartment(){
         System.out.print("New worker: " + firstName + ", Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
         Scanner scan = new Scanner(System.in);
         int deptChoice = scan.nextInt();
         scan.close();
         if(deptChoice == 1 ){
             return "sales";
         } else if(deptChoice == 2){
             return "development";
         } else if(deptChoice == 3){
             return "accounting";
         } else{
             return "";
            }
        }
        
        
        private String randomPassword(int length){
         String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
         char[] password = new char[length];
         for(int i = 0; i<length; i++){
             int rand = (int)(Math.random() * passwordSet.length());
             password[i] = passwordSet.charAt(rand);
         }
         return new String(password);
     }

     //Setters for mainbox capacity, alternate email, password change
     //set the mailbox capacity
     public void setMailBoxCapacity(int capacity){
         this.mailboxCapacity = capacity;
     }
     public void setAlternateEmail(String altemail){
         this.alternateEmail = altemail;
     }
     public void changePassword(String password){
         this.password = password;
     }

      //getters

      public int getMailBoxCapacity(){
          return mailboxCapacity;
      }
      public String getAlternateEmail(){
          return alternateEmail;
      }
      public String getPassword(){
          return password;
      }

      public String showInfo(){
          return "Display Name: " + firstName + " " +lastName +
                 "\nCompany Email: " + email +
                 "\nMailbox Capacity: " + mailboxCapacity + "mb";
      }
}