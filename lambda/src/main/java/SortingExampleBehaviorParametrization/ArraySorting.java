package SortingExampleBehaviorParametrization;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
//        as.sort();
        QuickSort qs = new QuickSort();
        as.sort(qs);
        BubbleSort bs = new BubbleSort();
        as.sort(bs);
    }

    private void sort(Sorting sorting) {  // <-- Behavior parametrization
        sorting.sort();
    }
}
