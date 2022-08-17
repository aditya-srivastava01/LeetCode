class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return (check(p1,p2,p3,p4)||check(p1,p2,p4,p3)||check(p1,p3,p2,p4)||check(p1,p3,p4,p2)||check(p1,p4,p2,p3)||check(p1,p4,p3,p2)||check(p2,p1,p3,p4)||check(p2,p1,p4,p3)||check(p2,p3,p1,p4)||check(p2,p3,p4,p1)||check(p2,p4,p1,p3)||check(p2,p4,p3,p1)||check(p3,p1,p2,p4)||check(p3,p1,p4,p2)||check(p3,p2,p1,p4)||check(p3,p2,p4,p1)||check(p3,p4,p1,p2)||check(p3,p4,p2,p1)||check(p4,p1,p2,p3)||check(p4,p1,p3,p2)||check(p4,p2,p1,p3)||check(p4,p2,p3,p1)||check(p4,p3,p1,p2)||check(p4,p3,p2,p1))
;
    }
    public boolean check(int[] p1, int[] p2, int[] p3, int[] p4){
        int ab = dist(p1,p2);
        int bc = dist(p2,p3);
        int cd = dist(p3,p4);
        int ad = dist(p4,p1);
        int dig_ac = dist(p1,p3);
        int dig_bd = dist(p2,p4);
        if(ab==bc && bc==cd && cd==ad && ab==ad && ab!=0 && dig_ac!=0 && dig_bd!=0){
            // System.out.println(ab+" "+bc+" "+cd+" "+ad);
            if((ab+bc==dig_ac && ad+cd==dig_ac)&&(ab+ad==dig_bd && bc+cd==dig_bd)){
                return true;
            }
        }
        return false;
    }
    public int dist(int[] one,int[] two){
        return (one[0]-two[0])*(one[0]-two[0])+(one[1]-two[1])*(one[1]-two[1]);
    }
}