public class Traits{
    public String looks(String eyecolor, String hair, String Height) {
        String genes=eyecolor+" "+hair+" "+Height;
        return genes;
    }
}
class OffSprings extends Traits{
    public static void main(String[] args) {
        OffSprings obj1=new OffSprings();
        String khan=obj1.looks("green","black","5.9");
        System.out.println(khan);
    }
}