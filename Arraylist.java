import java.util.ArrayList;
class Main{
    public static void main(String args[]){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add(0,"Banana");
        //fruits.add("Grapes");
        fruits.add("Pine Apple");
        fruits.add("Apple");
        fruits.add("Pine Apple");
        System.out.println(fruits);
        System.out.println(fruits.subList(1,4));
        fruits.remove("Apple");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        fruits.set(0,"Apple");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.hashCode());
        System.out.println(fruits.indexOf("Apple"));
        System.out.println(fruits.lastIndexOf("Pine Apple"));
        
        Object[] array = fruits.toArray();
        for(Object obj : array)
        System.out.println(obj);
        fruits.clear();
        System.out.println(fruits);
        //System.out.println();
        
    }
}
