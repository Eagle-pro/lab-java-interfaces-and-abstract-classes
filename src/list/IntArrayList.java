package list;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[(int)(array.length * 1.5)];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException();
        return array[id];
    }
}
