import java.util.*;
public class hashmapremoving
{
  public static void main(String args[])
  {
    HashMap<String,String> a=new HashMap<>();
    a.put("sno","01");
    a.put("sname","muraja");
    a.put("city","chennia");
    System.out.println(a);
    a.remove("sname");
    System.out.println(a);
    a.clear();
    System.out.println(a);
  }
}
