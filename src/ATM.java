import java.util.Scanner;

public class ATM{
    float Balance;
    int PIN = 9536;

    Scanner sc = new Scanner(System.in);
    public void  checkpin(){
        System.out.print("Enter Your Pin : ");
        int enterPin = sc.nextInt();
        if (enterPin == PIN){
            menu();
        }else {
            System.out.println("Invalid Pin, Try Again!");
            checkpin();
        }
    }
    // now menu()
    public void menu(){
        System.out.println("1. Check A/C Balance : ");
        System.out.println("2. Withdraw Money : ");
        System.out.println("3. Deposit Money : ");
        System.out.println("4. Change Your Pin : ");
        System.out.println("5. Exit ");
        System.out.print("Enter Your Choice : ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt==1){
            chekBalance();
        }else if(opt==2){
            withdrawMoney();
        } else if (opt==3) {
            depositMoney();
        } else if (opt==4) {
            changePin();
        } else if (opt==5) {
            return;
        } else {
            System.out.println("Please Enter Valid Choice.");
        }
    }

    public void chekBalance(){
        System.out.println("Balance : "+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.print("Enter Withdraw Amount : ");
        float amount = sc.nextFloat();
        if (amount<=Balance){
            System.out.println("Withdraw Successfully : Rs. "+amount);
            Balance-=amount;
            System.out.println("Balance : "+Balance);
            menu();
        }else {
            System.out.println("Insufficient Balance.");
            menu();
        }
    }
    public void depositMoney(){
        System.out.print("Enter Deposit Amount : ");
        int depositAmount = sc.nextInt();
        Balance+=depositAmount;
        System.out.println("Money Deposited Successfully.");
        menu();
    }
    public void changePin(){
        System.out.print("Enter New Pin : ");
        int newPin = sc.nextInt();
        PIN = newPin;
        System.out.println("Pin Changed Successfully.");
        checkpin();
    }


}