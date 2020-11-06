import java.util.*;
public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray() {
    data = new String [10];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
      if (size == data.length){
        resize();
      }
      data[size]=element;
      size++;
      return true;
    }
  public String get(int index){
    if (data[index]!= null){
      return data[index];
    }
    else {return "none";}
  }
  public String set(int index, String element){
    if (data[index]!= null){
      String ans = data[index];
      data[index]=element;
      return ans;
    }
    return "NO ELEMENT TO REPLACE";
  }
  private void resize(){
    String [] temp = new String [size * 2 + 1];
    for (int i = 0; i<data.length; i++){
      temp[i]=data[i];
    }
    data = temp;
  }
  public boolean isEmpty(){
    if (size ==0){
      return true;
    }
    else {return false;}
  }
  public void clear(){
    size = 0;
    String [] temp = new String [10];
    data = temp;
    }
  public String toString() {
    String [] temp = new String [size];
    int j = 0;
    for (int i = 0; i<data.length; i++){
      if (data[i]!=null){
        temp[j]=data[i];
        j++;
      }
    }
    return Arrays.toString(temp);
    }
    public boolean contains(String s){
      boolean ans = false;
      for (int i = 0; i < data.length; i++){
        if (data[i]!= null && data[i].equals(s)){
          ans = true;
        }
      }
      return ans;
    }
    public SuperArray(int initialCapacity){
      String [] temp = new String [initialCapacity];
      data = temp;
      size = 0;
    }
    public void add(int index, String element){
       String [] temp = new String [data.length + 1];
       for (int i = 0; i<index; i++){
         if (data[i]!= null){
           temp[i]= data[i];
         }
       }
       for (int i = index; i<data.length; i++){
         if (data[i]!= null){
           temp[i+1]= data[i];
         }
       }
       temp[index]=element;
       data = temp;
       size ++;
     }
}
