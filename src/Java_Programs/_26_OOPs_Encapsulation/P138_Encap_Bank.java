package Java_Programs._26_OOPs_Encapsulation;

public class P138_Encap_Bank {
    //## Encapsulation
//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Bundling of data and methods that operate on that data within a single unit.
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.
    public static void main(String[] args) {
        ICICIBank anuj = new ICICIBank("Anuj",100);
        System.out.println(anuj.getBalOutside());
        //but we shouldn't set the value to balance it shouldn't be done
        //so casher can only make the changes in value no one else
        //so we have to ask if you are a casher or not
        anuj.setBalByCashier(500,true);
        anuj.setBalByCashier(500,false);
        //we can also remove the set method so that no one can set any value
        //we can change the names of getters and setters after creating them
    }
}
class ICICIBank{
    private String name;
    private long bal;

    public ICICIBank(String name, long bal){
        this.name = name;
        this.bal = bal;
    }

    public String getNameOutside() {
        return name;
    }

    public void setNameOutside(String name) {
        this.name = name;
    }

    public long getBalOutside() {
        return bal;
    }

    public void setBalByCashier(long bal,boolean isCashier) {
        if (isCashier){
            this.bal = bal;
        }else {
            System.out.println("Not able to change the balance");
        }
    }
}