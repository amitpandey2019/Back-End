import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.Compression;

class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /* Variable
        Just Like:
        Water - Bucket
        Masala - box
        Lunch - LunchBox
        In Java:
        Variables are containers which store data values
        String, int, float, char, boolean
        How do you declare variables:
        Syntex - <dataType> <variableName> = <value>;
        */ 
        String name = "Amit";
        System.out.println(name);
        
        int a = 24;
        float b = 45.22f;
        boolean isAdult = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(isAdult);
        
        /*Rules for constructing name of variables in java
        1. Can contain digits, underscores, doller signs,letters
        2. should begin with a letter, $or try {
        3. Java is case sensitive langusage which means that 
           amit and Amit are two different varisble altogether. 
        4.shouldnot contain whitespaces
        5.you cannot use reserved keywords  from java
            */
            /*
            Two types of java data types:
            1.primitive - byte (1 byte), short (2 bytes), int(4 byte), long (8 bytes)
              duble (8 bytes), boolean(1 bit), char (2 byte)
            2.Non primitive or reference data type - 
             */
            byte u = 56;
            double d = 45.645435345d;
            System.out.println(u);
            System.out.println(d);
            char grade = 'A';
            System.out.println(grade);
              
            /*operators in java

            operand, opretor, operand = Result
            4          +          7  =  11

            Types of opretor in java 

            1. Arithmetic operators 
            2. Logical operators
            2. Assignment operators
            4. Compression operatoCompression
            */ 
            int num1 = 45, num2=78;
            System.out.print("The value of num1 + num2 is ");
            System.out.println(num1 + num2);

            System.out.print("The value of num1 - num2 is ");
            System.out.println(num1 - num2);

            System.out.print("The value of num1 * num2 is ");
            System.out.println(num1 * num2);

            System.out.print ("The value of num1 / num2 is ");
            System.out.println(num1 / num2);

            System.out.print("The value of num1 % num2 is ");
            System.out.println(num1 % num2); 
             System.out.println(num1++);
             System.out.println(++num1);
             System.out.println(num1--);
             System.out.println(--num1); 

        } 
    }