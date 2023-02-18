import java.util.ArrayList;
import java.util.Collections;


public class PriorityQueue<T extends Comparable<T>> implements Comparable<T> {
    private int size=0;
    private ArrayList<T> arr = new ArrayList<T>(2);

    public PriorityQueue(){
    }
    public void AddElement(T tmp){
        arr.add(size, tmp);
        size++;
        for (int i=size/2-1; i>=0; --i)
            ReWrite( arr, size, i);
    }

    private void ReWrite(ArrayList<T> arr, int n, int max){
        int i = max;
        int idLeft = i*2+1, idRight=i*2+2;
        if (idLeft<n && arr.get(idLeft).compareTo(arr.get(i))>0)
            i = idLeft;
        if (idRight<n && arr.get(idRight).compareTo(arr.get(i))>0)
            i = idRight;
        if (i != max) {
            Collections.swap(arr, i, max);
            //System.out.println(i + " - " + max);
            ReWrite(arr, n, i);
        }
    }

    public void DelMaxEl() {
        if (size>=0) {
            arr.remove(0);
            size--;
            for (int i = size / 2 - 1; i >= 0; --i)
                ReWrite(arr, size, i);
        }
        else
            System.out.println("Очередь пуста!");
    }
    public void DelElement (T del) {
        if (size >= 0) {
            int tmp = -1;
            for (int i = 0; i < size; ++i)
                if (arr.get(i).compareTo(del) == 0)
                    tmp = i;
            if (tmp >= 0) {
                arr.remove(tmp);
                size--;
                for (int i = size / 2 - 1; i >= 0; --i)
                    ReWrite(arr, size, i);
            } else
                System.out.println("Такого элемента нет в очереди");
        } else
            System.out.println("Очередь пуста!");
    }
    public T GetMaxEl(){
        return arr.get(0);
    }
    public void Count(){
        System.out.println("Элементов в очереди: "+ size);
    }
    public void Write(){
        System.out.println(arr);
    }
    @Override
    public int compareTo(T o) {
        return 0;
    }
}
