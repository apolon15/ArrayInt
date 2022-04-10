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
    public boolean replace(int index,int number){
        array.add(index,number);
        return true;
    }

    @Override
    public int max() {
        System.out.println("Максимальный эл-т массива :" );
        return Collections.max(array);

    }

    @Override
    public int min() {
        System.out.println("Минимальный эл-т массива :" );
        return Collections.min(array);
    }

    @Override
    public float avg() {

           float result = 0;
        array.toArray();
        for (int i = 0; i <= array.size() - 1; i++) {
            int x = array.get(i);
            result += x;
        }System.out.println("Среднее значение  массива :" );
        return result / array.size();
    }

    @Override
    public String toString() {
        return "ArrayInt{" +
                "array=" + array +
                '}';
    }


    @Override
    public void sortAsc() {
        Collections.sort(array);
        System.out.println("Отортирован массив по возрастанию:" );
        System.out.println(array);
    }

    @Override
    public void sortDesc() {
        Collections.sort(array);
        Collections.reverse(array);
        System.out.println("Отортирован массив по убыванию:" );
        System.out.println(array);
    }
}

