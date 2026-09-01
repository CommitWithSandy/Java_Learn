public class M_Para{

    public static int additionNum(int firstNum, int secondNum){ // This method takes two parameters, firstNum and secondNum
    System.out.println("First number:" + firstNum);
    System.out.println("Second number:" + secondNum);
    int sum = firstNum + secondNum;
    return sum; // The method returns the sum of the two numbers
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + additionNum(5, 10));
        System.out.println("Addition: " + additionNum(25, 25));

    } 
}
