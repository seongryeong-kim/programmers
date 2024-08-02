class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int a=0;a<arr.length;a++){
            sum+=arr[a];
        }
        answer=(double)sum/arr.length;
        return answer;
    }
}