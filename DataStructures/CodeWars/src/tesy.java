public class tesy {

    public static void main(String[] args) {
        String text = new String("12345");
        // calling recursive function
        String result=text.substring(1) + text.charAt(0);
        System.out.println(result); // Prints: ydwoh
    }
}

