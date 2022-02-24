public class LinearSearch2d {
//    O(n^2)
    public static int linearSearch2D(String[][] haystack, String target) {
        for (int i = 0; i < haystack.length; i++) {
            for (int j = 0; j < haystack[0].length; j++) {
                if(haystack[i][j]==target){
                    System.out.println(target + " located at [" + i+ "][" + j + "].");
                    return 1;
                }

            }
        }
        System.out.println("Couldn't find the " + target + " in the haystack.");
        return -1;
    }
    public static void main(String[] args) {
        String[][] haystack = {{"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"needle", "hay"}, {"hay", "hay"}};
        String target = "needle";
        linearSearch2D(haystack, target);
    }
}
