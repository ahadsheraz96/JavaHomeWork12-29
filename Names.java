public class Names {
    public static void main (String[] args){
        String [] friendsNames={"ahad", "amir", "rasheed", "waqar"};
        System.out.println("the name at index 2 is "+friendsNames[2]);
        System.out.println("the name at index 3 is "+friendsNames[3]);
        Names obj1=new Names();
        obj1.allNames();
       // Listing obj2=new Listing();
        //obj2.Lists();
          Listing.lists();
          //beacause we using static key word so no need to make an object of a class
    }
    public void allNames(){
        String [] c= {"ali","khan","afaq", "khansaab"};
        for (int y=0; y<c.length; y++){
            System.out.println(c[y]);
        }
    }
}
