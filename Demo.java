public class Demo {

  public static void removeDuplicates(SuperArray s) {
    int index = 0;
    for (int i = 0; i<s.size(); i++) {
      if (i == s.indexOf(s.get(i))) {
        s.set(index, s.get(i));
        index++;
      }
    }
    // remove the rest
    while (index!=s.size()) {
      s.remove(index);
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray sarr = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        sarr.add(a.get(i));
      }
    }
    return sarr;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
      SuperArray sarr = new SuperArray();
      int ssize = 0;
      if (a.size() > b.size()) {
        ssize = b.size();
      } else {
        ssize = a.size();
      }
      for (int i = 0; i<ssize; i++) {
        sarr.add(a.get(i));
        sarr.add(b.get(i));
      }
      if (a.size() > b.size()) {
        for (int i = ssize; i<a.size(); i++) {
          sarr.add(a.get(i));
        }
      } else {
          for (int i = ssize; i<b.size(); i++) {
          sarr.add(b.get(i));
          }
      }
      return sarr;
  }

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("uhuh");    words.add("56256");     words.add("toro");

    System.out.println(words);
    //removeDuplicates(words);
    System.out.println(words);

    SuperArray words1 = new SuperArray();
    words1.add("kani");   words1.add("uni");     words1.add("oidjf 9i2qu");     words1.add("una");
    words1.add("uhuh");    words1.add("ebi");     words1.add("7ouiu8");    words1.add("una");
    words1.add("una");    words1.add("ebi");     words1.add("toro");

    System.out.println(words1);
    //removeDuplicates(words1);
    System.out.println(words1);

    SuperArray worded = findOverlap(words, words1);
    System.out.println(worded);

    SuperArray n3 = new SuperArray();
    for (int i = 0; i<10; i++) {
      n3.add("" + i);
    }

    SuperArray n4 = new SuperArray();
    for (int i = 20; i<25; i++) {
      n4.add("" + i);
    }
    System.out.println(n3);
    System.out.println(n4);
    System.out.println(zip(n3, n4));
  }
}
