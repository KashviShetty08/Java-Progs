package stackperson;

public class Stack

{
    private Person[] peopleArr;
    private int top;
    private int capacity;

    Stack(int size) 
    
    {
        capacity = size;
        peopleArr = new Person[capacity];
        top = -1;
    }

    Stack(Person[] givenArr) {
      capacity = givenArr.length;
      peopleArr = new Person[capacity];
       for (int i = 0; i < givenArr.length; i++)
       {
            peopleArr[i] = givenArr[i];
        }
        top = givenArr.length - 1;
    }

    void push(Person p)
    
   {
        if (top == capacity - 1) 
        {
            System.out.println("Stack full (overflow), can’t push.");
            return;
        }
        peopleArr[++top] = p;
    }

    void push(Person p1, Person p2)
    {
        push(p1);
        push(p2);
    }

    Person pop() 
    {
        if (top == -1) {
            System.out.println("Stack empty (underflow), nothing to pop.");
            return null;
        }
        return peopleArr[top--];
    }

    void pop(int n)
    {
        for (int i = 0; i < n; i++)
        {
            Person p = pop();
            if (p == null) break;
            System.out.print("Popped: ");
            p.displayPerson();
        }
    }

    void display()
    {
        if (top == -1) 
        {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack (top to bottom):");
        for (int i = top; i >= 0; i--) 
        {
            peopleArr[i].displayPerson();
        }
    }

   
    void displayBottomToTop()
    {
        if (top == -1) 
        {
           System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack (bottom to top):");
        for (int i = 0; i <= top; i++) {
           peopleArr[i].displayPerson();
        }
    }


    void displayTopN(int n)
    {
        if (top == -1)
        {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top " + n + " persons:");
        for (int i = top; i >= top - n + 1 && i >= 0; i--) 
        {
            peopleArr[i].displayPerson();
        }
    }
}