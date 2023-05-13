import java.util.Scanner;

class main {

        public static void main(String[] args) { 
       /*  System.out.println("Hello, World!");
         Variable
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
        String channel = "CodeWithAmit";
       System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name + " from\" " + channel);
        System.out.println(name + " from\\ " + channel);
        System.out.println(name + " from\t " + channel);
        System.out.println(name + " from\n " + channel); 
        System.out.println(name.contains("Am"));
        System.out.println(name.charAt(2)); 
        System.out.println(name.endsWith("it")); 
        System.out.println(name.indexOf("mit"));      
         /* 
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
            /* 
            byte u = 56;
            double d = 45.645435345d;
            System.out.println(u);
            System.out.println(d);
            char grade = 'A';
            System.out.println(grade);
              
            */
            /*operators in java

            operand, opretor, operand = Result
            4          +          7  =  11

            Types of opretor in java 

            1. Arithmetic operators 
            2. Logical operators
            2. Assignment operators
            4. Compression operatoCompression
            */ 
            /*int num1 = 45,  num2=78;
            num1 += 3;
            num2 -= 8; 
            /* Expoler these opretors - *=, /=, %= */
            /* 
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
             System.out.println(num2++);
             System.out.println(++num1);
             System.out.println(num1--);
             System.out.println(--num1);
               */
             /* Comparison Operstors
              * 1. == check for equality of two values
              * 2. != : check if two values are not equal
              * 3. <
              * 4. >
              * 5. <=
              * 6. >=

              * Logical operators:
              * 1. && - Logical and operator - returns true only if both condition are true
              * 2. || - Logical and operator - returns true if any one condition is true 
              * 3. ! - Logical not - Reverse the result frpm true to false and vice versa
              */
              // Testing  user input in java 
             /*  Scanner scan = new Scanner(System.in);
              System.out.println("Enter Age");
              int input = scan.nextInt();
              System.out.println(input);
              */

        } 
    }