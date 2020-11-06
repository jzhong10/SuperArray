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
  }
}
