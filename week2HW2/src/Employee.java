public class Employee {
    private String id;
    private String name;
    private int salary;
    public Employee(){

    }
    public Employee(String id,String name,int salary){
        this.id="1234";
        this.name="MOON";
        this.salary=8000;
    }
    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
public int getAnnualSalary(){
        return salary;
}
public void RaisedSalary(int percent){
       salary=0;
}
public String toString(){
        return id+""+name+""+salary ;
}
}
