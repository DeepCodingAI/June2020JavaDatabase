package unittesting;

public class Calculator {

    public String lastName = "Clinton";

    public int addition(int num1, int num2){
        int total = num1 + num2;

        return total;
    }

    public int subtraction(int num1, int num2){
        int total = num1 - num2;

        return total;
    }

    public int multiplication(int num1, int num2){
        int total = num1 * num2;

        return total;
    }

    public String getFullName(String firstName){
        String fullName = firstName +" "+ lastName;
        return fullName;
    }
}
