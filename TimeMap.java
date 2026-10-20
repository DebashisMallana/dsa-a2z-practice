import java.util.*;
public class TimeMap {
String k;
String v;
int ts;
HashMap<Integer, HashMap<String, String>> map = new HashMap<>();
    public TimeMap() {
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(timestamp, new HashMap<>());
        map.get(timestamp).put(key, value); 
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(timestamp))
            {
                if(map.get(timestamp).containsKey(key))
            return map.get(timestamp).get(key);
            }
        else 
        {
            int high=timestamp;
            int low=0;
            while(high>=low)
            {
                int mid=low+(high-low)/2;
                if(map.containsKey(mid))
                    {
                        if(map.get(mid).containsKey(key)) return map.get(mid).get(key);
                    }
                    else high=mid-1;
            }
        }
        return "";
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