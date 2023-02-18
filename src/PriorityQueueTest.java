import java.util.ArrayList;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<Integer>();
        test.AddElement(1);
        test.AddElement(70);
        test.AddElement(3);
        test.AddElement(5);
        test.AddElement(8);
        test.AddElement(15);
        test.Write();
        test.DelMaxEl();
        test.Write();
        test.DelElement(5);
        test.Write();
        test.Count();
    }
}
