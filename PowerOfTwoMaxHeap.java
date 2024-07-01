import java.util.ArrayList;

public class PowerOfTwoMaxHeap {
    private ArrayList<Integer> heap;
    private int childDegree;

    public PowerOfTwoMaxHeap(int childDegree) {
        this.heap = new ArrayList<>();
        this.childDegree = childDegree;
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0);
        }
        return max;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / childDegree;
            if (heap.get(index) <= heap.get(parent)) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    private void heapifyDown(int index) {
        while (true) {
            int maxChildIndex = getMaxChildIndex(index);
            if (maxChildIndex == -1 || heap.get(index) >= heap.get(maxChildIndex)) {
                break;
            }
            swap(index, maxChildIndex);
            index = maxChildIndex;
        }
    }

    private int getMaxChildIndex(int index) {
        int maxChildIndex = -1;
        int start = index * childDegree + 1;
        int end = Math.min(heap.size(), (index + 1) * childDegree);
        for (int i = start; i < end; i++) {
            if (maxChildIndex == -1 || heap.get(i) > heap.get(maxChildIndex)) {
                maxChildIndex = i;
            }
        }
        return maxChildIndex;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        // Test the PowerOfTwoMaxHeap
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);
        heap.insert(5);
        heap.insert(10);
        heap.insert(8);
        heap.insert(15);
        heap.insert(12);
        heap.insert(20);
        heap.insert(17);

        System.out.println("Max element: " + heap.popMax()); // Output: 20
        System.out.println("Max element: " + heap.popMax()); // Output: 17
    }
}
