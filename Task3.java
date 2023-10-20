/*1.Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions*/ 
import java.util.*;
class Task3 
{
     public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            double a;
            User u=new User();
            System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.CHECK BALANCE\n4.EXIT");
            int option=sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter the amount to Deposit : ");
                    a=sc.nextDouble();
                    u.Deposit(a);
                    break;

                case 2:
                    System.out.println("Enter the amount to Withdraw : ");
                    a=sc.nextDouble();
                    u.Withdraw(a);
                    break;

                case 3:
                    u.CheckBalance();
                    break;


            }
        }
}
 class User extends ATM
{
        public void CheckBalance()
        {
            System.out.println("Enter Your Name : ");
            name=sc.next();
            System.out.println("Enter Your A/c No : ");
            account=sc.nextInt();
        }
       

}
 class ATM
{
    Scanner sc=new Scanner(System.in);
    double bal=100000;
    int account;
    double amount;
    String name;
    public void Deposit(double amount)
    {
            System.out.println("Enter Your Name : ");
            name=sc.next();
            System.out.println("Enter Your A/c No : ");
            account=sc.nextInt();
            bal=bal+amount;
            System.out.println("======AMOUNT DEPOSITED SUCCESSFULLY======");

    }
    public void Withdraw(double amount)
    {
            System.out.println("Enter Your Name : ");
            name=sc.next();
            System.out.println("Enter Your A/c No : ");
            account=sc.nextInt();
            System.out.println("Enter the amount to Deposit : ");
            if(amount>bal)
            {
                System.out.println("====Cannot withdraw amount greater than balance====");
            }
            else
            {
                bal=bal-amount;
                System.out.println("======AMOUNT WITHDRAWN SUCCESSFULLY======");
            }
    }
    public void CheckBalance()
    {
    }
}
