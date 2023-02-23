package day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //Data Type     Variable Name   =   Value   ;
        int age = 27;

        //Example 1: Create a variable whose value is 1.99
        double priceOfShirt = 1.99;

        /* Data Types
            1) integer: It is used for whole numbers.
                The minimum value of integers is -2,147,483,648
                The maximum value of integers is 2,147,483,647
                Integer variables use 32 bits in memory

            2) short: It is used for whole numbers.
                The minimum value of shorts is -32,768
                The maximum value of shorts is 32,767
                short variables use 16 bits in memory

            3) byte: It is used for whole numbers.
                The minimum value of byte is -128
                The maximum value of byte is 127
                byte variables use 8 bits in memory

            4) long: It is used for whole numbers.
                The minimum value of byte is -9,223,372,036,854,755,808
                The maximum value of byte is 9,223,372,036,854,755,807
                long variables use 64 bits in memory

            Note: When you select any data type the value must be in the range of the data type
         */
        int populationOfGermany = 80000000;
        System.out.println(populationOfGermany);

        //Note: Java accepts long values as integer as default. But if your value is greater than the maximum
        // value of integers you will get error. To fix that you have to put "L" or "l" to the end of the number.
        long populationOfTheWorld = 7000000000L;
        long populationOfChina = 1400000;

        byte ageOfStudent = 23;
        System.out.println(ageOfStudent);
    }
}
