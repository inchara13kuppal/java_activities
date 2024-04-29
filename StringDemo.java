package activities;

public class StringDemo {
    public static void main(String[] args) {

        String str = "Hello, ";
        System.out.println("Original String: " + str);

        str = str.concat("World!");
        System.out.println("Concatenated String: " + str);

        int length = str.length();
        System.out.println("Length of the String: " + length);

        StringBuffer stringBuffer = new StringBuffer("Java is ");
        System.out.println("Original StringBuffer: " + stringBuffer);

        stringBuffer.append("awesome!");
        System.out.println("Appended StringBuffer: " + stringBuffer);

        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);
    }
}

