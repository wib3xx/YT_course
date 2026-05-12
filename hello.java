// class hello{
//     public static void main(String [] args)
//     {
       
//        // System.out.println(num1);
//        // System.out.println(num2);   
//       //  System.out.println("My name is Sarvagay");
//       //  System.out.println(6 + 6);
//      //   System.out.println(5 + 5);

//         int num1 = 3;
//         int num2 = 3;

//         int result = num1 + num2;
        
//         System.out.print(result);
//     }
// }



    // class hello{
    //     public static void main(String[] args){

    // int num1 = 5;
    // int num2 = 10;

    // int result = num1 + num2;
    //         System.out.println(result);
    //     }
    // }


    // class hello{
    //     public static void main(String[] args){

    //         int num1 = 2;
    //         int num2 = 3;

    //         int result = num1 + num2;
    //         System.out.println(result);
    //     }
    // }

    // class hello{
    //     public static void main(String[] args){

    //         int num = 5;

    //         byte by = 128; // This will cause a compilation error because byte can only hold values from -128 to 127

    //         byte by2 = 127; // This is correct, as 127 is within the range of byte

    //         short sh = 5588; // This will cause a compilation error because short can only hold values from -32,768 to 32,767
            
    //         short sh2 = 32767; // This is correct, as 32767 is within the range of short
            
    //         long l = 123456789L; // This is correct, but it's good practice to use uppercase 'L' for long literals to avoid confusion with the digit '1'
        
    //         float f = 5.8f; // This is correct, but it's good practice to use lowercase 'f' for float literals

    //         double d = 5.8; // This is correct, as double is the default type for decimal literals

    //         char c = 'Sarvagay'; // This will cause a compilation error because char can only hold a single character

    //         char c = 'S'; // This is correct, as it holds a single character

    //         boolean bool = true; // This is correct, as boolean can only hold true or false
        
    //     }

    // }


    // class hello{
    //     public static void main (String[ ] args){

    //         // int num1 = 0b1010; // This is a binary literal, which represents the decimal value 10
    //        // int num2 = 0x7E;
    //     //    int num3 = 10_00_00_00;

            
    //         System.out.println(num3);
    //     }
    // }


    // class hello{
    //     public static void main (String[] args){

    //         byte b = 127;
    //         int a = b; // This is an implicit widening conversion from byte to int, which is allowed in Java
    //         System.out.println(a);
    //     }
    // }

    // class hello{
    //     public static void main (String [] args){
    //         int num = 5;

    //         //num++;  //incriment operator, it will add 1 to num
    //        // num += 2; // This is a compound assignment operator that adds 2 to num and assigns the result back to num
    //       //  num--; //decriment operator, it will subtract 1 from num
    //        // ++num; // This is a pre-increment operator, which increments num by 1 before using its value
    //       //int result = ++num;
    //       //int result = num++;
    //       //num++;
    //       int result = ++num;       
    //         System.out.println(result);
    //     }
    // }

    // class hello{
    //     public static void main (String [] args){
    //         int a = 5;
    //         int b = 6;

    //           // boolean result = a > b;
    //         //  boolean result = a != b;
    //          // boolean result = a == b;

    //         //  double x = 8.8;
    //         //  double y = 1.2;

    //          boolean result = a > b;

    //             System.out.println(result);
    //     }
    // }

    class hello{
        public static void main( String [] args){

            int a = 5;
            int b = 5;
            //int result = a + b;
            boolean result1 = a > b | a < b;;
            // boolean result2 = a < b;
            // boolean result3 = a == b;

             System.out.println(!result1);
            //  System.out.println(result2);
            //  System.out.println(result3);
        }
    }

