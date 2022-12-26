package SortingExampleBehaviorParametrization;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
//        as.sort();
        QuickSort qs = new QuickSort();
        as.sort(qs);
        BubbleSort bs = new BubbleSort();
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);

        Sorting bubleSort = () -> System.out.println("Buble sorting");
        as.sort(bubleSort);
    }

    private void sort(Sorting sorting) {  // <-- Behavior parametrization
        sorting.sort();
    }
}

/*
Type Inference:

    interface StringLenghthLambda{
    int getLenght(String s)
    }
 */