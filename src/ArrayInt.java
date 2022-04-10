import java.util.ArrayList;
import java.util.Collections;

public class ArrayInt implements IMath, Isort {
    private ArrayList<Integer> array;

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayInt(int copacity) {
        array = new ArrayList<>(copacity);

    }

    public boolean add(int num) {
        array.add(num);
        return true;
    }

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

    @Override
    public String toString() {
        return "ArrayInt{" +
                "array=" + array +
                '}';
    }


    @Override
    public void sortAsc(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    //    System.out.println(arrayList);
    }

    @Override
    public void sortDesc(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
     //   System.out.println(arrayList);
    }
}
