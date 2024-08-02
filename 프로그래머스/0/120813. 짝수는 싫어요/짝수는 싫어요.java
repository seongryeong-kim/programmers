class Solution {
    public int[] solution(int n) {
        int num;
        if(n%2==1){
            num=n/2+1;
        } else{
            num=n/2;
        }
//         int[] answer={};
        int[] answer=new int[num];
        // answer{n};
        for(int a=1;a<=n;a++){
             if(a%2==1){
            answer[a/2] = a;
            }
        }
        
        return answer;
    }
}