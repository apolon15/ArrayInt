import java.util.ArrayList;
import java.util.Collections;

public interface IMath {
    default int max(ArrayList<Integer> arrayList) {
        return Collections.max(arrayList);
    }

    default int min(ArrayList<Integer> arrayList) {
        return Collections.min(arrayList);
    }

    float avg(ArrayList<Integer> arrayList);
}
