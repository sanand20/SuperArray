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
  public static SuperArray zip(SuperArray a, SuperArray b){
    int j = 0;
    int k = 0;
    SuperArray ans = new SuperArray();
    SuperArray bigger = new SuperArray();
    if (a.size()>b.size()){
      bigger = a;
    }
    else {bigger = b;}
    for (int i = 0; i<bigger.size(); i++){
      if (a.size()>j){
        ans.add(a.get(j));
        j++;
      }
      if (b.size()>k){
        ans.add(b.get(k));
        k++;
      }
    }
    return (ans);
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

    SuperArray a = new SuperArray();
    a.add("a"); a.add("b"); a.add("c"); a.add("d"); a.add("e"); a.add("f");
    SuperArray b = new SuperArray();
    b.add("1"); b.add("2"); b.add("3"); b.add("4");
    System.out.println(zip(b,a));

    System.out.println(findOverlap(words, word));  }
}
