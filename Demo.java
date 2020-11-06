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

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
}
