public class Method_Fun {
    public static void greeting(){ // This is a method named greeting
        System.out.println("Runninngggg...."); // This is a simple greeting method
    }

    public static void firstPattern(){
            // System.out.println(" * \n * * \n * * * \n * * * * \n * * * * *");
    }
    public static void secondPattern(){
            // System.out.println(" * * *  \n * *  \n *  \n");
    }
    public static void thirdPattern(){
            int rows = 0;
            while (rows < 20){
                System.out.print("*");
                int n = 0;
                while (n < rows){
                    System.out.print(" *");
                    n++;
                }
                System.out.println();
                rows++;
            }
    }
    public static void main(String[] args) {
        greeting();
        firstPattern(); // 
        secondPattern();
        thirdPattern();
    }
}
        
    