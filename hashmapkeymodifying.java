import java.util.*;
public class hashmapkeymodifying
{
  public static void main(String args[])
  {
    HashMap<String,String> a=new HashMap<>();
    a.put("sno","01");
    a.put("sname","muraja");
    a.put("city","chennia");
    System.out.println(a);
    a.put("sno","90");
    System.out.println(a);
  }
}
