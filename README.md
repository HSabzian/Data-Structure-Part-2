
Stack, Queue, HashMap and HashTable structures are fundamental to efficient data storage and retrieval in Java, and the choice between them depends on the specific needs of your application, such as thread safety and performance requirements.


# 1. Stack (Implemented using LinkedList)
A Stack is a linear data structure that follows the Last-In, First-Out (LIFO) principle. The last element added to the stack is the first one to be removed. You can think of it as a stack of plates: you add plates to the top, and you remove the topmost plate first.

Key Operations:

 push: Adds an element to the top of the stack.

pop: Removes the top element from the stack.

peek: Returns the top element without removing it.

In our implementation, you used a LinkedList for the stack, which makes operations efficient as LinkedList allows fast insertion and deletion at both ends.

# 2. Queue (Implemented using LinkedList)
A Queue is a linear data structure that follows the First-In, First-Out (FIFO) principle. The first element added to the queue is the first one to be removed. It’s similar to a line at a store where the first person in line is served first.

Key Operations:

enqueue: Adds an element to the end of the queue. 

dequeue: Removes the element from the front of the queue.

peek: Returns the front element without removing it.

In our implementation, a LinkedList is used to maintain the queue, which allows efficient insertion and deletion at both the front and rear ends.

# 3. HashMap
A HashMap is a key-value pair-based data structure. It uses a hashing mechanism to store and retrieve elements in constant time on average. It allows null keys and values and does not maintain any order of the elements.

Key Features:

Fast lookups, insertions, and deletions due to hashing.

Allows one null key and multiple null values.

Not synchronized (non-thread-safe) by default, so it's not suitable for multi-threaded environments without external synchronization.

# 4. Hashtable
A Hashtable is also a key-value pair-based data structure similar to a HashMap, but with some key differences. It was one of the original Java collections and is synchronized, meaning it is thread-safe but slower than HashMap. It does not allow null keys or values.

Key Features:

Synchronized (thread-safe) by default.

Does not allow null keys or values.

Slightly slower compared to HashMap due to synchronization overhead.

