package Java_Programs._34_Wrapper_classes;
//in this program we have maximum number of the oops concepts
public class P167_Wrapper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1,"Iphone 16:",126555.55);
        Mobile Samsung = new Mobile(1,"ultra 24:",130555.55);
        iphone.setPrice(206555.55);
        iphone.Display();
        Samsung.Display();
        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirPlaneMode();
        iphone.Calling();
    }
}
class Mobile extends OldPhone{
    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    Mobile(){
        System.out.println("DC");
    }

    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void Display(){
        System.out.println(this.name+this.phone+this.price);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void switchOnAirPlaneMode(){
        System.out.println("Common Airplane Mode");
    }
    @Override
    void Calling(){
        System.out.println("dial pad touch now");
    }

    void priceChance(Integer price){
        System.out.println("Change price in inetegers");
    }
    void priceChance(Double price){
        System.out.println("Change price in Decimals");
    }
}
class OldPhone implements SIMCard{
    void Calling(){
        System.out.println("DialPad");
    }

    @Override
    public void enterCard() {
        System.out.println("Card entered");
    }
}

interface SIMCard{
    void enterCard();
}