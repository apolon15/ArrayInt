import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayInt arrayList = new ArrayInt(8);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(-2);
        arrayList.add(23);
        arrayList.add(22);
        arrayList.add(0);
        arrayList.add(98);
        arrayList.add(-32);
        System.out.println(arrayList);
        arrayList.replace(3, 999);
        System.out.println(arrayList.max());
        System.out.println(arrayList.min());
        System.out.println(arrayList.avg());

        arrayList.sortDesc();
        arrayList.sortAsc();

    }
}
