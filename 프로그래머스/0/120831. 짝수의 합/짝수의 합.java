class Solution {
    public int solution(int n) {
        // int array[];
        int answer = 0;
        // 1.짝수 구하기
        // 2.변수에 짝수 모두 더해서 저장하기
        for(int i=1;i<=n;i++){
            if(i%2==0){
                answer+=i;
            }
        }
        return answer;
    }
}