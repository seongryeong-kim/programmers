class Solution {
    public int solution(int n) {
        //n의 약수 
        //n이 10라면 약수는 1,2,5,10
        //n%x==0
        int answer = 0;
        for(int a=1;a<=n;a++){
            if(n%a==0){
                answer+=a;
            }
        }
        return answer;
    }
}