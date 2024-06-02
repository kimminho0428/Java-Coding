package string;

public class StringCompress {
    public int solution(String s) {
        int answer = s.length();
        int cnt = 1; //문자 반복 횟수

        for(int i=1; i<=s.length() / 2; i++){
            StringBuilder sb = new StringBuilder();
            //앞에서 i 만큼 문자열 자르기
            String prev = s.substring(0, i);

            for(int j=i; j<=s.length(); j+=i){
                //인덱스는 문자열의 길이를 넘을 수 없음
                int endIdx = Math.min((i + j), s.length());

                String sub = s.substring(j, endIdx);

                //이전 상태와 동일하다면 반복 횟수 증가
                if(prev.equals(sub)) cnt++;
                    //다른 문자열이 나왔다면 상태 초기화
                else{
                    sb.append((cnt >= 2) ? cnt+prev : prev);
                    prev = sub;
                    cnt = 1;
                }
            }
            // 마지막 문자 붙이기
            sb.append(prev);
            //결과
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        System.out.println(sc.solution("aabbaccc"));
    }
}