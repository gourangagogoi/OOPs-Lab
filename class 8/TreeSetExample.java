import java.util.*;
class TreeSetExample{
public static void main(String args[]){
TreeSet<String> al=new TreeSet();
al.add("Mariana");
al.add("Rick");
al.add("Sam");
Iterator<String> itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}