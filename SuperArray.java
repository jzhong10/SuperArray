import java.util.Arrays;

public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
      data = new String[10];
      size = 0;
    }

    public SuperArray(int initialCapacity) {
      data = new String[initialCapacity];
      size = 0;
    }

    public int size() {
      return size;
    }

    public boolean add(String element) {
      if (size == data.length) {
        resize();
      }
      data[size] = element;
      size++;
      return true;
    }

    public String get(int index) {
      return data[index];
    }

    public String set(int index, String element) {
      String prev = data[index];
      data[index] = element;
      return prev;
    }

    public void resize() {
      String[] newData = new String[data.length*2];
      for (int i = 0; i < data.length; i++) {
        newData[i] = data[i];
      }
      data = newData;
    }

    public boolean isEmpty() {
      return size==0;
    }

    public void clear() {
      size = 0;
      data = new String[10];
    }

    public String toString() {
      String retstr = "[";
      for (int i = 0; i<size; i++) {
        retstr += data[i];
        if (size-1 != i) {
          retstr += ", ";
        }
      }
      retstr += "]";
      return retstr;
    }

    public boolean contains(String s) {
      for (int i = 0; i<size; i++) {
        if (data[i]==s) {
          return true;
        }
      }
      return false;
    }

    public void add(int index, String element) {
      size++;
      if (size==data.length) {
        resize();
      }
      //System.out.println("Before" + Arrays.toString(data));
      for (int i = size; i>index; i--) {
        data[i] = data[i-1];
      }
      data[index] = element;
      //System.out.println("After" + Arrays.toString(data));
    }

    public String remove(int index) {
      String str = data[index];
      for (int i = index; i<size; i++) {
        data[i] = data[i+1];
      }
      size--;
      return str;
    }

    public int indexOf(String str) {
      for (int i = 0; i<size; i++) {
        if (data[i]==str) {
          return i;
        }
      }
      return -1;
    }

    public String[] toArray() {
      String[] arr = new String[size];
      for (int i = 0; i<size; i++) {
        arr[i] = data[i];
      }
      return arr;
    }
}
