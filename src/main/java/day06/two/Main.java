package day06.two;

public class Main {
    public static void main(String[] args) {

        ErrArray array = new ErrArray(10, 0);

        System.out.println(array.put(10, 10));

    }
}


class ErrArray {
    private int a[];
    private int err;

    public int length;

    ErrArray(int size, int env) {
        a = new int[size];
        err = env;
        length = size;
    }

    public int get(int index) {
        if(indexOK(index)) return a[index];
        return err;
    }

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        if (index >= 0 && index < length) {
            return true;
        }
        return false;
    }
}
