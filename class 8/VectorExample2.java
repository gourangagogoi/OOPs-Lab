import java.util.*;

class VectorExample2{
    public static void main(String[] args){
        Vector<String> animals = new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        String element =animals.get(2);
        System.out.println("Element at index 2: "+element);
        Iterator<String> itr = animals.iterator();
        System.out.println("Vector: ");
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print(", ");
        }
    }
}