import java.util.*;
class LinkedHashsetExample{
public static void main(String args[]){
LinkedHashSet<String> al=new LinkedHashSet(); 
al.add("Mariana");
al.add("Rick");
al.add("Sam");
Iterator<String> itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}