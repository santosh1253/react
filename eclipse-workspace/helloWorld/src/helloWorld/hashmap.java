package helloWorld;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class hashmap {
	public static void main(String args[])
	{

    HashMap<String,Integer> h=new HashMap<>();
    h.put("Guru",94);
    h.put("Harsha",65);
    h.put(null,68);
    h.put(null,94);
    h.put("Tarun",94);
    for(Map.Entry<String, Integer> e:h.entrySet())
    {
        System.out.println(e.getKey()+" "+e.getValue());
    }
	}
}
