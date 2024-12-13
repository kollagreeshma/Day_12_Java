import java.util.*;
class linkedhashset
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hii");
        a.add("hii");
        a.add("students");
        a.add("greeshma");
        a.add("students");
        for(String s:a)
        {
        System.out.println(s+" ");
        }
    }
}