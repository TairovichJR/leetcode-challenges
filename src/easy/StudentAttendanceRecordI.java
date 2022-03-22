package easy;


/**
 * Created by tairovich_jr on 2022-03-22.
 */
public class StudentAttendanceRecordI {


    public boolean checkRecord(String s){

        int absent = 0;
        int late = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A'){
                late = 0;
                if (++absent >= 2) {
                    return false;
                }
            }
            if (s.charAt(i) == 'L'){
                if (++late >= 3){
                    return false;
                }
            }else{
                late = 0;
            }
        }
        return true;
    }

}
