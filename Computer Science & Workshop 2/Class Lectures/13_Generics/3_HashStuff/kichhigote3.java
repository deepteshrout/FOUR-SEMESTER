import java.util.*;
class HashMapExample
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        hmap1.put(14, "George");
        hmap1.put(33, "Paul");
        hmap1.put(16, "Jane");
        hmap1.put(7, "Brian");
        hmap1.put(19, "Jack");
        Set set1 = hmap1.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext())
        {
            Map.Entry ment1 = (Map.Entry) iterator1.next();
            System.out.println("The value is:" + ment1.getValue() + " and key is: " + ment1.getKey());
        }
        String va = hmap1.get(2);
        System.out.println("Index 2 has value of " + va);
        hmap1.remove(16);
        Set set2 = hmap1.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry ment2 = (Map.Entry) iterator2.next();
            System.out.println("Now value is " + ment2.getValue() + "and key is: " + ment2.getKey());
        }
    }
}

/*The value is:Jane and key is: 16
The value is:Paul and key is: 33
The value is:Jack and key is: 19
The value is:Brian and key is: 7
The value is:George and key is: 14
Index 2 has value of null
Now value is Pauland key is: 33
Now value is Jackand key is: 19
Now value is Brianand key is: 7
Now value is Georgeand key is: 14 */