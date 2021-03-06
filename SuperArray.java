import java.util.Arrays;

public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
      data = new String[10];
      size = 0;
    }

    public SuperArray(int initialCapacity) {
      if (initialCapacity < 0) {
        throw new IllegalArgumentException("Initial Capacity can't be negative!");
      }
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
      if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Can't get index " + index + " - is out of bounds for this SuperArray sized " + size);
      }
      return data[index];
    }

    public String set(int index, String element) {
      if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Can't set index " + index + " - is out of bounds for this SuperArray sized " + size);
      }
      String prev = data[index];
      data[index] = element;
      return prev;
    }

    public void resize() {
      String[] newData = new String[data.length*2+1];
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
        if (data[i].equals(s)) {
          return true;
        }
      }
      return false;
    }

    public void add(int index, String element) {
      if (index < 0 || index > size) {
        throw new IndexOutOfBoundsException("Can't add at index " + index + " - is out of bounds for this SuperArray sized " + size);
      }
      size++;
      if (size==data.length) {
        resize();
      }
      for (int i = size; i>index; i--) {
        data[i] = data[i-1];
      }
      data[index] = element;

    }

    public String remove(int index) {
      if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Can't remove at index " + index + " - is out of bounds for this SuperArray sized " + size);
      }
      String str = data[index];
      if (data.length==size) {
        resize();
      }
      for (int i = index; i<size; i++) {
        data[i] = data[i+1];
      }
      size--;
      return str;
    }

    public int indexOf(String str) {
      for (int i = 0; i<size; i++) {
        if (data[i].equals(str)) {
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

    public int lastIndexOf(String str) {
      for (int i = size-1; i>=0; i--) {
        if (data[i].equals(str)) {
          return i;
        }
      }
      return -1;
    }

    public boolean equals(SuperArray other) {
      if (size != other.size()) {
        return false;
      }
      for (int i = 0; i < size; i++) {
        if (!data[i].equals(other.get(i))) {
          return false;
        }
      }
      return true;
    }

    public SuperArray copy() {
      SuperArray arr = new SuperArray(size);
      for (int i = 0; i < size; i++) {
        arr.add(data[i]);
      }
      return arr;
    }
}
