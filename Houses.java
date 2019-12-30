import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class Houses {
    public void propertyFromDad(){
        int houseNumber=145;
        String owner="liaqat ali";
        System.out.println(owner+" "+houseNumber);
    }
    public void FromDad(){
        int houseNumber=18999;
        String owner="ahad";
        System.out.println(owner+" "+houseNumber);
    }
}
class Son extends Houses {
    public static void main(String[] args) {
        Son obj1=new Son();
       obj1.propertyFromDad();
       obj1.myDadGifts();
       obj1.FromDad();
    }
    public void myDadGifts(){
        System.out.println("house and a car is a gift to me");
    }
}
