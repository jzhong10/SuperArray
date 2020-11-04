import java.util.Arrays;

public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
      data = new String[10];
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
}
