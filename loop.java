public class loop {
    public void numbers( ){
        for (int x=0; x<=100; x++){
            System.out.println(x);
        }
    }
    public void list(){
        int[] a ={1,2,25,36,98,78,41,100};
        for (int x=0; x<a.length; x++ ){
            System.out.println(a[x]);
        }
    }
    public void arrlist() {
        int[] b;
        b = new int[3];

        b[0] = 5;
        b[1] = 6;
        b[2] = 7;
        System.out.println(b[1]);
    }
}
