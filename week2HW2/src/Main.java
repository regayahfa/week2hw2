public class Main {
    public static void main(String[] args) {

       Account BANK=new Account();

BANK.getId();
BANK.getName();
BANK.getBalance();
//BANK.
System.out.println("id : "+BANK.getId());
        System.out.println("name: "+BANK.getName());
        System.out.println("balance: "+BANK.getBalance());

        System.out.println("-------------------------");

        Account Accountanother=new Account(12,"reem",100);
        System.out.println("bank2");
        System.out.println("id : "+Accountanother.getId());
        System.out.println("name:  "+Accountanother.getName());
        System.out.println("balance:  "+Accountanother.getBalance());

        System.out.println("-------------------------");
     BANK.credit(100);
     Accountanother.debit(100);
        System.out.println(" bank  balance:  "+BANK.getBalance());
        System.out.println(" bank 2 balance:  "+Accountanother.getBalance());
      System.out.println(BANK);
        System.out.println(Accountanother);

        System.out.println("-Q2-");
        Employee EMP1 = new Employee("123", "MOON", 8000);
        EMP1.getId();
        EMP1.getName();
        EMP1.getSalary();

        System.out.println(EMP1);

    }

}