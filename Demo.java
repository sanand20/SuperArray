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
    int j = 0;
    SuperArray temp = new SuperArray();
    for (int i = 0; i<a.size(); i++){
      String x = a.get(i);
      if (b.contains(a)){
        temp[j]=a[i];
        j++;
      }
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    SuperArray word = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    findOverlap(words, word);
    System.out.println(temp);  }
}
