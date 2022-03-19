import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       Secret[] all =Secret.values();
        int count = 0;
        for (Secret secret : all) {
            if (secret.name().startsWith("STAR"))
                count++;
        }
        System.out.println(count);
    }
}


//enum Secret {
//    STAR, CRASH, START, // ...
//}
