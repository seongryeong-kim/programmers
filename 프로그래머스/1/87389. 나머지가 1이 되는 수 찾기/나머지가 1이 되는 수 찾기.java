class Solution {
    public int solution(int n) {
        int answer = 0;
        //시작은 n, n을 1부터 n까지 나누는데 나머지가 1일 때까지 
        for(int a=1;a<=n;a++){
            if(n%a==1){
                answer=a;
                break;
            }
        }
        return answer;
    }
}