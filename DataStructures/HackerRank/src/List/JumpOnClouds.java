package List;

import java.util.List;

public class JumpOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {

        int count = 0;
        int i = 0;
        while(i<c.size()-1) {
            if (i<c.size()-2 && c.get(i+2)==0) {
                i++;
            }
            if(i != c.size() - 1) {
                count++;
            }
            i++;
        }
return count;
    }
    public static void main(String[] args) {

    }
}
