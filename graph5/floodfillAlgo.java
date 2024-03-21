package graph5;

import java.util.*;

public class floodfillAlgo {
    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgcol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgcol) {
            return;
        }

        // Mark the current pixel as visited
        vis[sr][sc] = true;

        // Change the color of the current pixel
        image[sr][sc] = color;

        // Recursively call the helper function for all adjacent pixels
        helper(image, sr, sc - 1, color, vis, orgcol); // left
        helper(image, sr, sc + 1, color, vis, orgcol); // right
        helper(image, sr - 1, sc, color, vis, orgcol); // up
        helper(image, sr + 1, sc, color, vis, orgcol); // down
    }

    public int[][] floodfill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    // Test case
    public static void main(String[] args) {
        floodfillAlgo floodFill = new floodfillAlgo();
        int[][] image = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 1, 0, 1, 1},
            {1, 1, 2, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 2, 2, 0},
            {1, 1, 1, 1, 1, 2, 1, 1},
            {1, 1, 1, 1, 1, 2, 2, 1}
        };
        int sr = 4, sc = 4, color = 3;
        int[][] result = floodFill.floodfill(image, sr, sc, color);

        // Print the result
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}

