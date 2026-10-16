import java.util.*;

public class BusBooking {
    Map<String, Integer> bus;
    int totaltime = 0;
    int removedcost;

    public BusBooking(int n) {
        bus = new HashMap<>();
    }

    public void toggle(String seat) {
        if (bus.containsKey(seat)) {
            removedcost = bus.remove(seat);
            totaltime -= removedcost;
        } else {
            int cost = 0;
            String neighbour = "";
            
            if (seat.charAt(0) == 'A') {
                neighbour = 'B' + seat.substring(1);
            }
            if (seat.charAt(0) == 'D') {
                neighbour = 'C' + seat.substring(1);
            }

            if (bus.containsKey(neighbour)) {
                cost = 3;
            } else {
                cost = 1;
            }
            
            bus.put(seat, cost);
            totaltime += cost;
        }
    }

    public int getTotalTime() {
        return totaltime;
    }

    public int getMinTime() {
        return bus.size();
    }

    public static void main(String[] args) {
        int n = 10;
        BusBooking obj = new BusBooking(n);
        obj.toggle("C7");
        obj.toggle("D7");
        obj.toggle("D7");
        obj.toggle("C7");
        System.out.print(obj.getTotalTime() + " ");
        System.out.print(obj.getMinTime() + " ");
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */