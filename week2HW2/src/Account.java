public class Account {
    private int id;
    private String name;
    private int balance=0;

    public Account(){

    }
 public Account(int id,String name){
        this.id=id;
        this.name=name;
 }
 public Account(int id,String name,int balance){
         this.id=id;
   this.name=name;
        this.balance=balance;
 }

 public int getId() {
       return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
   public void credit(int amount){
    balance=balance-amount;
   }
    public void debit(int amount){
        balance=balance+amount;
    }
    public void transferto(Account anthor, int amount){
      balance=0;
   }
    public String toString() {

        return id+""+name+""+balance ;
    }


}
