package Static_and_nonStatic;

public class instanceVariable_and_staticVariable {
    int a;
    static int b;
    public instanceVariable_and_staticVariable(){
        a++;
        b++;
    }
    public void display(){
         System.out.println("Instance Count: " + a + " | Static Count: " + b);
    }

    public static void main(String[] args) {
        instanceVariable_and_staticVariable s1 = new instanceVariable_and_staticVariable();
        s1.display();
        instanceVariable_and_staticVariable s2 = new instanceVariable_and_staticVariable();
        s2.display();

        instanceVariable_and_staticVariable s3 = new instanceVariable_and_staticVariable();
        s3.display();
    }

}

//instance variable

// Belongs to each object separately.

// Always starts at 0 for every new object.

// So each new object’s instanceCount will be 1 after constructor runs.

// it store in heap arer


// staticCount

// Belongs to the class.

// One single copy is shared among all objects.

// Every time a new object is created, the same staticCount is increased.

// it store in memory area


// output of this code

// Instance Count: 1 | Static Count: 1
// Instance Count: 1 | Static Count: 2
// Instance Count: 1 | Static Count: 3