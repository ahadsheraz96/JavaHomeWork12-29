public class Siblings {
    public String names(String a, String b){
        return a+" "+b;
    }
}
class FullName extends Siblings{
    public static void main(String[] args) {
        FullName obj1=new FullName();
        String nam=obj1.names("ahad","khan");
        System.out.println(nam);

    }

}
