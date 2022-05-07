import java.util.LinkedList;
public class App38 {
    public static void manin ( String[]args){

        LinkedList<String> list = new LinkedList<String>();
      
        list.add("java") ;
        list.add("C++");
        list.add("PHP");
        list.add("java");
        System.out.println("vi du su dung phuong thuc  addALL()");
        System.out.println("------------------------------------");
        LinkedList<String> listA= new LinkedList<String>();
        listA.  addALL (list);
        System.out.print("listA:");
        showlist(listA);
        


    }
}
