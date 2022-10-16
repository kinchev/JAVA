package String;

public class  StudentAttendanceRecord1551 {
    public static boolean checkRecord(String s) {
        int checkAbsent=0;
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                checkAbsent++;
                if(checkAbsent>1){
                    return false;
                }
            }else if(s.contains("LLL")){
                return false;
            }

            
        }
       
        return true;
    }
    public static void main(String[] args) {
       System.out.println(checkRecord("PPALLP"));
    }
}
