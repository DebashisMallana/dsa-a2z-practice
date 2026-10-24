import java.util.*;
public class TimeMap {
HashMap<String, Map<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
        {
           map.put(key,new HashMap<>());
        }    
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        else if(map.get(key).containsKey(timestamp)) return map.get(key).get(timestamp);
        else 
        {
            int max=-1;
           for(int time:map.get(key).keySet())
           {
              if(time<=timestamp && time>max) max=time;
           }
           if(max==-1) return "";
           else
           return map.get(key).get(max);
        }
    }
        

    public static void main(String[] args) {
    TimeMap obj = new TimeMap();
    obj.set("ctondw", "ztpearaw", 1);
    obj.set("vrobykydll", "hwliiq", 2);
    obj.set("gszaw", "ztpearaw", 3);
    obj.set("ctondw", "gszaw", 4);
    System.out.println(obj.get("gszaw", 5));
    System.out.println(obj.get("ctondw", 6));
    System.out.println(obj.get("ctondw", 7));
    System.out.println(obj.get("gszaw", 8));
    System.out.println(obj.get("vrobykydll", 9));
    System.out.println(obj.get("ctondw", 10));

    obj.set("vrobykydll", "kcvcjzzwx", 11);

    System.out.println(obj.get("vrobykydll", 12));
    System.out.println(obj.get("ctondw", 13));
    System.out.println(obj.get("vrobykydll", 14));

    obj.set("ztpearaw", "zondoubtib", 15);
    obj.set("kcvcjzzwx", "hwliiq", 16);
    obj.set("wtgbfvg", "vrobykydll", 17);
    obj.set("hwliiq", "gzsiivks", 18);

    System.out.println(obj.get("kcvcjzzwx", 19));
    System.out.println(obj.get("ztpearaw", 20));
}
}


/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */