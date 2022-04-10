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
   //     System.out.println(arrayList);

        IMath iMath = new IMath() {

            @Override
            public float avg(ArrayList<Integer> arrayList) {
                float result = 0;
                arrayList.toArray();
                for (int i = 0; i <= arrayList.size() - 1; i++) {
                    int x = arrayList.get(i);
                    result += x;
                }
                return result / arrayList.size();
            }
        };

//        System.out.println(iMath.max(arrayList.getArray()));
//        System.out.println(iMath.min(arrayList.getArray()));
//        System.out.println(iMath.avg(arrayList.getArray()));

        Isort iSort = new Isort() {

            @Override
            public void sortAsc(ArrayList<Integer> arrayList) {
                Collections.sort(arrayList);
            }

            @Override
            public void sortDesc(ArrayList<Integer> arrayList) {
                Collections.sort(arrayList);
                Collections.reverse(arrayList);
            }
        };
        iSort.sortAsc(arrayList.getArray());
        System.out.println(arrayList);
        iSort.sortDesc(arrayList.getArray());
        System.out.println(arrayList);

    }
}
