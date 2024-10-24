
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;


// Stack last in, First out (LIFO)


///////////////////////////// A:  Stack and Queue

class Stack<T> {

    private LinkedList<T> list = new LinkedList<>();

    public void push(T value) {
        list.addFirst(value);  // Add to the head
    }

    public T pop() {
        return list.removeFirst();  // Remove from the head
    }

    public T peek() {
        return list.getFirst();  // View the head element
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}


// QUEUE First in, First Out (FIFO)


class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T value) {
        list.addLast(value);  // Add to the tail
    }

    public T dequeue() {
        return list.removeFirst();  // Remove from the head
    }

    public T peek() {
        return list.getFirst();  // View the head element
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}





class implementer {



    public static void main(String[] args){

        Stack mystack = new Stack();

        mystack.push(100); /// add to the head
        mystack.push(50);
        mystack.push(190);
        mystack.push(350);

        mystack.pop(); // remove from head

        System.out.println(mystack.peek()); // seeing the first item


        Queue myqueu = new Queue();

        myqueu.enqueue(100); // add to the tail
        myqueu.enqueue(50);
        myqueu.enqueue(190);
        myqueu.enqueue(350);


        myqueu.dequeue(); // remove from head

        System.out.println(mystack.peek()); // seeing the first item



    }
}



///////////////////////////// B : Hashmap and Hashtable

// Hashmap (key:value) can take null


class HashMapExample {


    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> cityPopulation = new HashMap<>();

        // Adding key-value pairs
        cityPopulation.put("Los Angeles", 4000000);
        cityPopulation.put("New York", 8500000);
        cityPopulation.put("Chicago", 2700000);

        // Adding a null key with a value
        cityPopulation.put(null, 500000);  // HashMap allows null keys

        // Displaying the HashMap
        System.out.println("City Population: " + cityPopulation);

        // Accessing an element
        System.out.println("Population of Los Angeles: " + cityPopulation.get("Los Angeles"));

        // Modifying a value
        cityPopulation.put("Chicago", 3000000);
        System.out.println("Updated Population of Chicago: " + cityPopulation.get("Chicago"));
        System.out.println( cityPopulation.get("Chicago") + 14000); // its casting is simpler because of integer
    }
}




////// Hashtable (key: value) cant take null value



//import java.util.Hashtable;

class HashtableExample {



    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> cityPopulation = new Hashtable<>();

        // Adding key-value pairs
        cityPopulation.put("Los Angeles", 4000000);
        cityPopulation.put("New York", 8500000);
        cityPopulation.put("Chicago", 2700000);

        // Uncommenting the line below will throw a NullPointerException
        // cityPopulation.put(null, 500000);  // Hashtable does not allow null keys

        // Displaying the Hashtable
        System.out.println("City Population: " + cityPopulation);

        // Accessing an element
        System.out.println("Population of Los Angeles: " + cityPopulation.get("Los Angeles"));

        // Modifying a value
        cityPopulation.put("Chicago", 3000000);
        System.out.println("Updated Population of Chicago: " + cityPopulation.get("Chicago"));
    }
}






