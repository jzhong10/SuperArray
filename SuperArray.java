import java.util.Arrays;

public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
      size = 10;
      data = new String[size];
    }

    public int size() {
      return size;
    }

    public boolean add(String element) {
      data[size-1] = element;
      return true;
    }

    public String get(int index) {
      if (index<size) {
        return data[index];
      }
      return "Out of Bounds foolish one";
    }


}
