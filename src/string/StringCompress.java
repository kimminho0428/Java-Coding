package string;

import java.util.ArrayList;
import java.util.List;

public class StringCompress {
    public int solution(String s) {
        int answer = s.length();
        int cnt = 1;
        for(int i=1; i<=s.length()/2; i++){
            StringBuilder sb = new StringBuilder();
            String prev = s.substring(0, i);

            for(int j=i; j<=s.length(); j+=i){
                int endIdx = Math.min((i + j), s.length());
                String sub = s.substring(j, endIdx);
                if(prev.equals(sub)){
                    cnt++;
                } else {
                    sb.append((cnt >= 2) ? cnt+prev:prev);
                    prev = sub;
                    cnt = 1;
                }
            }
            sb.append(prev);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        System.out.println(sc.solution("aabbaccc"));
    }
}
