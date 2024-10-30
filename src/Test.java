import java.util.Arrays;

public class Test {


    public int[] solution(int brown, int yellow) {

        for (int width = 3; width <= 5000; width++){
            for(int height = 3; height <= width; height++){
                int boundary = 2 * (width + height - 2);
                int center = width * height - boundary;

                if(brown == boundary && yellow == center){
                    return new int[]{width, height};
                }

            }
        }

        return null;
    }

    public static void main(String[] args) {

    }



}
