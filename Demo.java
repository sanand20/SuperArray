public class Demo{
  public static void removeDuplicates(SuperArray s){
  for (int i = 0; i<s.size(); i++){
    String x = s.get(i);
    for (int j = i+1; j<s.size(); j++){
      if (x.equals(s.get(j))){
        s.remove(j);
        j--;
      }
    }
  }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    for (int i = 0; i<a.size(); i++){
      String x = a.get(i);
      if (b.contains(x)==false){
          a.remove(i);
          i--;
        }
      }
    return (a);
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("ka");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    SuperArray word = new SuperArray();
    //grouped to save vertical space
    word.add("i");   word.add("uni");     word.add("ebi");     word.add("una");
    word.add("una");    word.add("ebi");     word.add("kani");    word.add("una");
    word.add("una");    word.add("ebi");     word.add("toro");


    System.out.println(findOverlap(words, word));  }
}
