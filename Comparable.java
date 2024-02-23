
import java.util.*;
class  Comparable {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TreeSet t=new TreeSet(new mycom());
        t.add("a");
        t.add("aaaa");
        t.add("aa");
        t.add("b");
        System.out.print(t);
    }
}
class mycom implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1=obj1.toString();
         String s2=obj2.toString();
         int l1=s1.length();
         int l2=s2.length();
         if(l1<l2)
             return -1;
        else if(l1>l2)
        return 1;
        else
        return s1.compareTo(s2);
    }
}
