import java.util.*;
class unionstring
{
    public static void main(String args[])
    {
        String arr1 []={"hii","hello","greeh","how","are","you"};
        String arr2 []={"hii","hello","gamya","and","indu"};
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(String s : arr1)
        a.add(s);
        for(String s1 : arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<String> u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u); 
    }
}