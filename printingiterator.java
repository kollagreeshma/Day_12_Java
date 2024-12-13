import java.util.*;
class printingiterator
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hii");
        a.add("hii");
        a.add("students");
        a.add("greeshma");
        a.add("students");
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next()+" ");
        }
    }
}