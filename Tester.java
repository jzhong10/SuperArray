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

      /*
      SuperArray c1 = new SuperArray();
      for (int i = 0; i<20; i++) {
        c1.add("" + i);
      }
      System.out.println(c1.toString());
      //System.out.println(c1.remove(19));
      System.out.println(Arrays.toString(c1.toArray()));

      while (!c1.isEmpty()) {
        System.out.println(c1.toString());
        System.out.println(c1.remove(0));
        //System.out.println(c1.remove(c1.size()-1));
        //System.out.println(c1.remove((int) (Math.random() * (c1.size()) )));
      }
      System.out.println(c1.toString());

      */

      /*
      System.out.println(c1.remove(2));
      System.out.println(c1.toString());
      System.out.println(c1.remove(1));
      System.out.println(c1.toString());
      System.out.println(c1.remove(0));
      System.out.println(c1.toString());
      */

      /*
      SuperArray d1 = new SuperArray();
      while (d1.size()<10) {
        d1.add("42");
      }
      System.out.println(d1);
      System.out.println(d1.indexOf("42"));
      d1.set(9, "f8");
      System.out.println(d1.lastIndexOf("42"));

      SuperArray n1 = new SuperArray();
      for (int i = 0; i<20; i++) {
        n1.add("" + i);
      }

      SuperArray n2 = new SuperArray();
      for (int i = 0; i<20; i++) {
        n2.add("" + i);
      }


      System.out.println(n1);
      System.out.println(n2);
      System.out.println(n1.equals(n2));
      n1.add("nono");
      System.out.println(n1.equals(n2));
      n1.remove(20);
      System.out.println(n1.equals(n2));

      System.out.println();

      SuperArray no1 = new SuperArray(); //a
      no1.add("9");   no1.add("1");     no1.add("2");
      no1.add("2");   no1.add("3");     no1.add("4");
      SuperArray no2 = new SuperArray(); //b
      no2.add("0");   no2.add("4");     no2.add("4");
      no2.add("2");   no2.add("2");     no2.add("9");
      System.out.println(no1);
      System.out.println(no1.lastIndexOf("2"));
      System.out.println(no2);
      System.out.println(no2.lastIndexOf("2"));
      if ( no1.lastIndexOf("2") == 3 ) {
        System.out.println("lastIndexOf test: SUCCESS");
      } else {
        System.out.println("\t\t\tlastIndexOf test: FAIL");
      }
      */
      try {
        SuperArray t = new SuperArray(-5);
      } catch (IllegalArgumentException e) {
        System.out.println("Failure");
      }

      SuperArray t1 = new SuperArray(0);
      t1.add("ok");
      t1.add("ohmy");
      try {
        System.out.println(t1.get(2));
      } catch (IndexOutOfBoundsException e) {
        System.out.println("could not get index");
      }
      t1.resize();
      //t1.add("ok");
      try {
        System.out.println(t1.get(2));
      } catch (IndexOutOfBoundsException e) {
        System.out.println("could not get index even with null value");
      }

      try {
        System.out.println(t1.set(2, "ohwow"));
      } catch (IndexOutOfBoundsException e) {
        System.out.println("setting at a bad index");
      }

      try {
        t1.add(5, "ohwow");
      } catch (IndexOutOfBoundsException e) {
        System.out.println("adding at a bad index");
      }

      try {
        t1.add(0, "ohwow");
      } catch (IndexOutOfBoundsException e) {
        System.out.println("adding at a bad index");
      }
      System.out.println(t1);
      //t1.add(5, "ohwow");

      try {
        t1.remove(-4);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("removing at a bad index");
      }

      try {
        t1.remove(7);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("removing at a bad index");
      }

      try {
        t1.remove(1);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("removing at a bad index");
      }
      System.out.println(t1);
    }
}
