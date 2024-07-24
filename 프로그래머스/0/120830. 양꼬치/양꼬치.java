class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //양꼬치 금액
        int lamb = n * 12000;
        //음료수 금액
        int drink = k * 2000;
        //총 합계
        answer = lamb + drink;
        
        //할인금액 구하기
        int discount = n / 10; 
            if(discount>=1){
                discount *= 2000; 
            }
       
        answer -= discount;
        
        return answer;
    }
}