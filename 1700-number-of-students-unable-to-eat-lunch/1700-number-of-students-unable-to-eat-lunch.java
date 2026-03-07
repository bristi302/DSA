class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0;
        int zeros = 0;
        for(int stud : students){
            if(stud == 0) zeros++;
            else ones++;
        }
        for(int sandwiche : sandwiches){
            if(sandwiche == 0){
                if(zeros == 0) return ones;
                else zeros --;
            }
            else if(sandwiche == 1){
                if(ones == 0) return zeros;
                else ones--;
            }
        }
        return zeros+ones;
    }
}