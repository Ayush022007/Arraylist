package Arraylist;
import java.util.ArrayList; 

public class que1{
    public static void main(String Args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list);
        // System.out.println(list.get(2));
        // System.out.println(list.remove(2));
        // System.out.println(list);
        list.set(3,355);
        System.err.println(list);
    }
}
