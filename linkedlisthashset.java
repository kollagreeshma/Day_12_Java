import java.util.*;
class linkedlisthashset
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hii");
        a.add("hii");
        a.add("students");
        a.add("greeshma");
        a.add("Students");
        System.out.println(a);
        a.remove("greeshma");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}