import java.util.*;

class Account {

    int accNo;
    String name;
    int pin;
    double balance;

    ArrayList<String> history=new ArrayList<>();


    Account(int no,String name,int pin){

        accNo=no;
        this.name=name;
        this.pin=pin;

    }


    void deposit(double amt){

        balance+=amt;

        history.add("Deposited "+amt);

    }


    void withdraw(double amt){

        if(amt<=balance){

            balance-=amt;

            history.add("Withdraw "+amt);

        }
        else
            System.out.println("Insufficient Balance");

    }


    void transfer(Account a,double amt){

        if(amt<=balance){

            balance-=amt;

            a.balance+=amt;

            history.add("Transferred "+amt);

        }

    }


    void changePin(int p){

        pin=p;

    }


    void display(){

        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);

        for(String x:history)
            System.out.println(x);

    }

}


public class Banking {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);


        Account a1=new Account(101,"Ravi",1234);

        int ch;

        do{

            System.out.println(
                    "1 Deposit\n2 Withdraw\n3 Transfer\n4 Change Pin\n5 History\n6 Exit");


            ch=sc.nextInt();


            switch(ch){

                case 1:
                    a1.deposit(sc.nextDouble());
                    break;

                case 2:
                    a1.withdraw(sc.nextDouble());
                    break;

                case 3:
                    Account a2=new Account(102,"Amit",2222);
                    a1.transfer(a2,sc.nextDouble());
                    break;

                case 4:
                    a1.changePin(sc.nextInt());
                    break;

                case 5:
                    a1.display();
                    break;

            }


        }while(ch!=6);

    }
}