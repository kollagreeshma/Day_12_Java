import java.util.*;
class linkedlist{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("hello");
        a.add("Iam");
        a.add("greeshu");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        a.clear();
        System.out.println(a); 
    }
}