

public class string {
    public static void main(String[] args) {
        
        String name = "Rohit Sharma";
        String name2 = "   Rohit  Sharma   ";
        String password = "Password123";

     /*    int length = name.length();
        System.out.println("Length of the String: " + length);

        char letter = name.charAt(2);
        System.out.println("Character at index 2: " + letter);

        int index = name.indexOf('h');
        System.out.println("Index of 'h': " + index);

        int lastIndex = name.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndex);

        name = name.toUpperCase();
        System.out.println("Uppercase: " + name);

        name = name.toLowerCase();
        System.out.println("Lowercase: " + name);

        name2 = name.trim();
        System.out.println("Trimmed String: '" + name + "'");

        name = name.replace('o', 'a');
        System.out.println("Replaced String: " + name); */


        // checking if the string is empty or not name = " "
        if (name.isEmpty()) {
            System.out.println("String is empty ");
        }
        else {
            System.out.println("String is not empty: " + name);
        }

        //contains space or not name2 = "   Rohit  Sharma   "
        if (name2.contains(" ")){
            System.out.println("String contains space :" + name2);
        }
        else{
            System.out.println("String does not contain space");
        }

        // checking if the password is correct password = "Password123"
        if(password.equals("Password123")){
            System.out.println("Password is correct :" + password);
        }
        else{
            System.out.println("Password is incorrect");
        }
    }
}
