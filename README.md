# Java Installation Guide:

### Java Installation For Windows's user : [Medium](https://positive-stud.medium.com/step-by-step-guide-to-install-java-on-windows-pc-c85e7778c14c)

### Java Installation For Linux's user : [Medium](https://positive-stud.medium.com/step-by-step-guide-to-install-java-on-windows-pc-c85e7778c14c)

# Getting Started:

### About Eclipse:

- Eclipse is an integrated development environment (IDE) for developing applications using the Java programming language
  and many other programming languages. The Java Development Tools (JDT) project provides a plug‐in that allows Eclipse
  to be used as a Java IDE.

- A new Java class can be created using the New Java Class wizard. The Java Class wizard can be invoked in different
  ways –
    1. By clicking on the File menu and selecting New → Class, or
    2. By right clicking in the package explorer and selecting New → Class, or
    3. By clicking on the class drop-down button and selecting class.

> Note: We will understand what classes are when we will study Object-Oriented Programming. For now, you can assume them as a file. Also name of class and **.java** file inside which we have this class should be same.

### About Main:

- Consider the following line of code:

  ```public static void main(String[] args) {}```

- This is the line at which the program will begin executing. Thi statement is similar to start block in flowcharts. All
  Java programs begin execution by calling main()

- We will understand what public, static, void mean in subsequence lectures. For now, we should assume that we have to
  write main as it is.

- The curly braces {} indicate start and end of main.

### print / println():

- In order to print things to console we have to write System.out.println("Hello World"). Again for now we should leave
  System.out.print mean, and should write it as it is.

- The built‐in method print() is used to display the string which is passed to it. This output string is not followed by
  a newline, i.e., the next output will start on the same line.

- The built‐in method println() is similar to print(), except that println() outputs a newline after each call.

    ```
    public static void main(String[] args) {
      System.out.println("Hello World");
      System.out.println("Programming is fun");
    }
    ```

    ````Output
    Hello World
    Programming is fun	
    ````

### Variables:

- Consider the following code for adding two number.

    ```
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        int ans = num1 + num2;
        System.out.println("Sum = " + ans);
    }
    ```

    ```Output
    15
    ```

- Here, we used variables to store values of two integers and their sum. Thus, a variable is a basic unit of storage in
  a Java program.

- Syntax for Declaring a Variable:
  ```type variable_name [= value];```

- Here, type is one of Java’s primitive data types. The variable_name is the name of a variable. We can initialize the
  variable by specifying an equal sign, and a value(Initialization is optional).

- However, the compiler never assigns a default value to an uninitialized local variable in Java.

- While writing variable names you should be careful and follow the rules for naming them. Following are the rules for
  writing variable names.

    1. All variable names may contain uppercase and lowercase letters(a‐z, A‐Z), underscore(_), dollar sign($)and the
       digits 0 to 9. The dollar sign character is not intended for general use. No spaces and no other special
       characters are allowed.

    2. The variable names must not begin with a number.

    3. Java is case‐sensitive. Uppercase characters are distinct from lowercase characters.

    4. A Java keyword(reserved word)cannot be used as a variable name.
