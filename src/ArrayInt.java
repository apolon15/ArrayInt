import java.util.ArrayList;

public class ArrayInt {

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


}
