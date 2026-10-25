package day25.two;

public class Main {
    public static void main(String[] args) {

        char[] chars = {'d', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.println("Исходный массив: ");
        for (int j = 0; j < chars.length; j++) {
            System.out.print(chars[j] + " ");
        }
        System.out.print(System.lineSeparator());
        QuickSort.qSort(chars);
        System.out.println("Отсортированный массив: ");
        for (int j = 0; j < chars.length; j++) {
            System.out.print(chars[j]+ " ");
        }

    }
}


class QuickSort {

    static void qSort(char[] items) {
        qs(items, 0, items.length - 1);
    }


    private static void qs(char[] items, int left, int right) {

        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);

    }
}
