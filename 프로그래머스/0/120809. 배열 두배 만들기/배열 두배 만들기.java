class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        answer=numbers;
        //int[] answer = int[] numbers 두배의 값을 가진 배열 
        for(int a=0;a<numbers.length;a++){
            answer[a]=numbers[a]*2;
        }
        return answer;
    }
}