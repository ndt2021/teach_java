package buoi9;

import java.util.HashMap;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
//        HashSet<Integer> h = new HashSet<Integer>();
//        h.add(5);
//        h.add(4);
//        h.add(6);
//        h.add(5);
//        System.out.println(h);

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1,"may bay");
        hm.put(2,"oto");
        hm.put(3, "xe lăn");
        hm.put(4,"may bay");
        hm.put(2, "xe may");
        System.out.println(hm);

        System.out.println(hm.get(6));
        System.out.println(hm.containsKey(4));
        System.out.println(hm.containsValue("may bay"));
        System.out.println(hm.keySet());
        //   key:
        //   value :


    }



}


//  28   2    28/2   => 14      2  => 7        2    3 4 5
//  F0 =0  F1 =1    F2 = F1  +  F0   ; F3 =F2 + F1  ;  F4 = F3 + F2