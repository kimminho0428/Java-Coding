package string;

public class ContainYandP {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toUpperCase();
        int count1 = 0;
        int count2 = 0;


        for(char ch : str.toCharArray()){
            if(ch == 'P'){
                count1 += 1;
            } else if(ch == 'Y'){
                count2 += 1;
            }
        }

        if(count1 - count2 == 0){
            answer = true;
        } else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        ContainYandP containYandP = new ContainYandP();
        System.out.println( containYandP.solution("pPoooyY"));

    }
}
