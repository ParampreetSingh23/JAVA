import java.util.ArrayList;
import java.util.Collections;

public class file {
  public static void printRev(ArrayList<Integer> list){
    for(int i = list.size()-1;i>=0;i--){
      System.out.println(list.get(i));
    }
  }
  public static void findMax(ArrayList<Integer> list){
    int max = 0;
    for(int i = 0;i<list.size();i++){
      if(max<list.get(i)){
        max = list.get(i);
      }
    }
    System.out.println(max);
  }
  public static void swap(ArrayList<Integer> list,int i1,int i2){
    int a = list.get(i1);
    int b = list.get(i2);
    int temp =  a;
    a = b;
    b = temp;

  }
  public static void findSubset(ArrayList<Integer> list ,int i,   ArrayList<Integer> subset ){
 
    if(i==list.size()){
      System.out.println(subset);
      return;
    }
    findSubset(list, i+1 ,  new ArrayList<>(subset));
    subset.add(list.get(i));
    findSubset(list, i+1,  new ArrayList<>(subset));
  }
  public double findMedianSortedArrays(ArrayList<Double> list1, ArrayList<Double> list2) {
    int n = list1.size() + list2.size();
    return n;
        
  }
  public static void main(String args[]){
    // ArrayList<Double> list1 = new ArrayList<>();
    // ArrayList<Double> list2 = new ArrayList<>();
    //add element
    // list1.add(1);
    // list1.add(3);
    // list2.add(2);
    // list.add(9);
    // list.add(7);//O(1)
    // list.add(1,9);
    //get element
    // int ele = list.get(2);
    // //remove element
    // // list.remove(1);
    // //set element
    // list.set(2,10);
    // // System.out.println(ele);
    // //contains element
    // boolean contain = list.contains(2);

    // System.out.println(contain);
    // System.out.println(list.size());
    // printRev(list);
    // System.out.println(list);
    // swap(list, 0, 1);
    // Collections.sort(list);
    // System.out.println(list);
    // findSubset(list, 0, subset);
    // System.out.println(findMedianSortedArrays(list1,list2));
    //2-D ArrayLists
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();
    for(int i = 1;i<=5;i++){
      list1.add(i*2);
      list2.add(i*3);
      list3.add(i*4);
    }
    // String one = "code";
    // String two = "chaf";
    // two = two.replace('a','e');
    // System.out.println(one+" "+two);
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    // System.out.println(mainList);
    for(int i = 0;i<mainList.size();i++){
      ArrayList<Integer> currList = mainList.get(i);
      for(int j = 0;j<currList.size();j++){
        System.out.print(currList.get(j)+" ");
      }
    }
} 

} 