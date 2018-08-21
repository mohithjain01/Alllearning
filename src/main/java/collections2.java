import java.util.*;

public class collections2 {


    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("orange");
        tree.add("red");

        HashMap<String,String> pairs = new HashMap<String, String>();
        pairs.put("mohith","software");
        pairs.put("key","value");
        pairs.put("black","white");
        pairs.put("tree","set");
    ArrayList<String> list = new ArrayList<String>();
    list.add("mohiht");
    list.add("rihit");
    list.add("rahul");
    list.add("black and white");
    list.add("this is crazy");
    List<String> sublist = list.subList(0,3);
/*    for(String s : sublist)
    {
        System.out.println(s);
    }*/
    sublist.remove("rihit");
    list.remove("black and white");
        for(String s : list)
        {
            System.out.println(s);
        }
      /*  System.out.println(pairs.get("mohith"));
        Set keys = pairs.keySet();
        System.out.println(keys);
        Collection values = pairs.values();
        System.out.println(values);
        Set entries = pairs.entrySet();
        System.out.println(entries);

        Iterator iter = keys.iterator();
        while(iter.hasNext())
        {
            System.out.println(pairs.get(iter.next()));
        }
        for(Map.Entry<String,String> it : pairs.entrySet())
        {

        } */
    }
}
