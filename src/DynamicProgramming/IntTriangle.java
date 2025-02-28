package DynamicProgramming;

import java.util.Arrays;

public class IntTriangle {

    private final int[][] mem = new int[501][501];

    private int max(int x, int y, int[][] triangle){
        if (y == triangle.length) return 0;
        if (mem[x][y] != -1) return mem[x][y];

        return mem[x][y] = triangle[y][x] + Math.max(
                max(x, y + 1, triangle),
                max(x + 1, y + 1, triangle));
    }

    public int solution(int[][] triangle) {
        for (int[] rows : mem) {
            Arrays.fill(rows, -1);
        }
        return max(0, 0, triangle);
    }

    public static void main(String[] args) {
        IntTriangle intTriangle = new IntTriangle();
        int[][] triangle = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int solution = intTriangle.solution(triangle);
        System.out.println("solution = " + solution);
    }

}
