public class Friends {
    public static void main (String [] args){
        int [] a;
        a=new int[6];
        a[0]=100;
        a[1]=1;
        a[2]=10;
        a[3]=15;
        a[4]=20;
        a[5]=100;
        System.out.println(a[1]);
        System.out.println(a[0]);
        System.out.println(a[5]);
        for(int x=0; x<a.length; x++)
            System.out.println(a[x]);
        }
    }

