package com.hrishabh;

public class EscapeGhosts {

    public static void main(String[] args) {
        int[][] arr = {
                {-1, 0}, {0, 1}, {-1, 0}, {0, 1}, {-1, 0}
        };
        int[] target = {0,0};
        System.out.println(escapeGhosts(arr, target));
    }

    static boolean escapeGhosts(int[][] ghosts, int[] target) {
        // Moves required for the player to reach the target
        int totalPlayerMoves = 0;
        totalPlayerMoves = Math.abs(target[0]) + Math.abs(target[1]);

        // Ghost reaching at the target in minimum moves
        int minGhostMoves = Integer.MAX_VALUE;
        for (int i = 0; i < ghosts.length; i++) {
            int ghostMoves = 0;
            for (int j = 0; j < 2; j++) {
                    ghostMoves += Math.abs(target[j]-ghosts[i][j]);
            }
            if (ghostMoves < minGhostMoves){
                minGhostMoves = ghostMoves;
            }
        }

        // Checking if player will reach the target before ghost
        if (minGhostMoves <= totalPlayerMoves){
            return false;
        }
        return true;
    }
}