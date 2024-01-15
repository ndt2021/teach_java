package buoi9;

import java.util.ArrayList;


public class collection {

    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<String>();

        ds.add("oto");
        ds.add("xe may");
        ds.add("xe may");
        ds.add("xe dap");

        System.out.println(ds.get(0));
        System.out.println(ds.size());
        System.out.println("cac phan tu trong danh sach"+ds);

        ds.set(0, "car");

        System.out.println(ds.remove(2));


        System.out.println("cac phan tu trong danh sach"+ds.remove("car"));

       // ds.clear();
        System.out.println( ds.contains("car"));


    }

}
