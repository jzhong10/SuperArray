import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
      SuperArray a1 = new SuperArray();
      /*
      System.out.println(a1.size());
      System.out.println(a1.get(9));
      System.out.println(a1.add("added new string"));
      System.out.println(a1.get(9));
      System.out.println(a1.set(9, "replaced string"));
      System.out.println(a1.get(9));
      a1.resize();
      System.out.println(a1.get(9));
      System.out.println(a1.get(18));
      */

      /*
      System.out.println(a1.get(9));
      for (int i = 0; i<12; i++) {
        a1.add("" + i);
        System.out.println(a1.get(i));
      }

      SuperArray words = new SuperArray();
      System.out.println(words.toString());
      words.add("kani");
      System.out.println(words.toString());
      words.add("uni");
      System.out.println(words.toString());
      words.add("ebi");
      for(int i = 0; i < words.size(); i++){
        System.out.println( words.get(i) );
      }
      System.out.println();
      System.out.println(words.contains("uno"));
      System.out.println(words.contains("uni"));
      System.out.println(words.contains("unI"));
      System.out.println();
      System.out.println(words.isEmpty());
      System.out.println(words.toString());
      words.clear();
      System.out.println(words.isEmpty());
      System.out.println(words.toString());
      System.out.println();
*/
      SuperArray b1 = new SuperArray(7);
      /*
      System.out.println(b1.size());
      b1.add("word");
      b1.add("ohmy");
      b1.add("ok");
      System.out.println(b1.toString());
      System.out.println(b1.size());
      b1.add(1, "how");
      b1.add("oh");
      System.out.println(b1.toString());
      System.out.println(b1.size());
      System.out.println(b1.remove(4));
      System.out.println(b1.toString());
      System.out.println(b1.remove(2));
      System.out.println(b1.toString());
      System.out.println(b1.indexOf("ok"));
      System.out.println(Arrays.toString(b1.toArray()));
      System.out.println(b1.remove(0));
      System.out.println(b1.toString());
      */
      SuperArray c1 = new SuperArray(1);
      for (int i = 0; i<20; i++) {
        c1.add("" + i);
      }
      System.out.println(c1.toString());
      while (!c1.isEmpty()) {
        System.out.println(c1.toString());
        //System.out.println(c1.remove(c1.size()-1));
        System.out.println(c1.remove((int) (Math.random() * (c1.size()) )));
      }
      /*
      System.out.println(c1.remove(2));
      System.out.println(c1.toString());
      System.out.println(c1.remove(1));
      System.out.println(c1.toString());
      System.out.println(c1.remove(0));
      System.out.println(c1.toString());
      */
    }
}
