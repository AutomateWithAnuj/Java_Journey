package Java_Programs._23_OOPs_Constructors;

public class P121_OOPs_DefaultConstructures {
    public static void main(String[] args) {
        //before doing anything if you want to do anything you can do it in constructor
        Baby b1 =  new Baby();
        //whenever an object is created it will automatically call the default constructor
        new Baby();
        //till now that default constructor has been called twice
        Baby b2; //for this contractor will not be called because object not created
        //Default constructors first assign default values to the all the attributes in program
    }
}
class Baby{
    //Attribute
    String name;
    //Behaviour
    void cry(){
        System.out.println("Cry!!");
    }
    void sleep(){
        System.out.println("Sleep!");
    }
    void eat(){
        System.out.println("Eat!!");
    }
    Baby(){
        //By default, java has the default constructor also even if you don't create it will be still their
        //you can write also by yourself so if it is written it will consider that as the default constructor
        //so we write default constructor only when we want it to be executed for something written in it
        System.out.println("I am default constructor");
        //Fetch data from mysql database
        //Read from CSV File, XLSX
        //Open a file and read the data (json, test_data.xlsx, text file)
    }

}
