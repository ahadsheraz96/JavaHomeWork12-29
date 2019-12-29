public class Calling {
    public static void main (String[] args){
        Calling obj1= new Calling();
        int a=obj1.sum(52,48);
        System.out.println(a);
        String v=obj1.frinds("amir","waqar","afaq");
        System.out.println(v);
       String b= obj1.frinds("rashhed","izik","jahid bhai");
        System.out.println(b);
        int xv=obj1.sub(58,25);
        System.out.println(xv);

        Average obj3=new Average();
       obj3.example();
        obj3.numberLucky();

        loop obj4=new loop();
        obj4.numbers();
        obj4.list();
        obj4.arrlist();
    }
    public int sum(int x, int y){
        return x+y;
    }
    public String frinds(String a, String b, String c){
        return a+" "+b+" "+c;
    }
    private int sub(int a , int b){
        return a-b;
    }
}
