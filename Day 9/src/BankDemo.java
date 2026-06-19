abstract class BankAccount{

    String accNo;
    String name;
    double balance;


    BankAccount(String accNo,String name,double balance){

        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
    }


    abstract void deposit(double amount);

    abstract void withdraw(double amount);


    void display(){

        System.out.println(accNo+" "+name+" "+balance);
    }
}



interface Transferable{

    void transfer(BankAccount b,double amount);
}



interface Interestable{

    void interest();
}



class SavingsAccount extends BankAccount implements Transferable,Interestable{


    SavingsAccount(String a,String n,double b){

        super(a,n,b);
    }


    void deposit(double amount){

        balance+=amount;
    }


    void withdraw(double amount){

        balance-=amount;
    }


    public void transfer(BankAccount b,double amount){

        withdraw(amount);

        b.deposit(amount);
    }


    public void interest(){

        balance+=balance*0.04;
    }
}



class CurrentAccount extends BankAccount implements Transferable{


    CurrentAccount(String a,String n,double b){

        super(a,n,b);
    }


    void deposit(double amount){

        balance+=amount;
    }


    void withdraw(double amount){

        balance-=amount;
    }


    public void transfer(BankAccount b,double amount){

        withdraw(amount);

        b.deposit(amount);
    }
}



public class BankDemo{


    public static void main(String[] args){


        BankAccount[] accounts={

                new SavingsAccount("S1","Amit",10000),

                new CurrentAccount("C1","Raj",50000)

        };


        for(BankAccount b:accounts){

            b.deposit(1000);

            b.display();
        }


        if(accounts[0] instanceof Interestable){

            Interestable i=(Interestable)accounts[0];

            i.interest();
        }


        Transferable t=(Transferable)accounts[0];

        t.transfer(accounts[1],2000);


        for(BankAccount b:accounts){

            b.display();
        }
    }
}