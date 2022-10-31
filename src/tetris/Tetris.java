package tetris;

import javax.swing.JOptionPane;

public class Tetris {

    private static GameForm gf;
    private static StartupForm sf;
    private static LeaderboardForm lf;

    public static void start() {
        gf.setVisible(true);
        gf.startGame();
    }
    public static void showLeaderboard(){
        lf.setVisible(true);
    }
    public static void showStartup(){
        sf.setVisible(true);
    }
    public static void gameOver(int score){
        String name = JOptionPane.showInputDialog("Game Over\nHãy nhập tên:");
        gf.setVisible(true);
        lf.addPlayer(name,score);
    }

    public static void main(String[] agrs) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gf = new GameForm();
                sf = new StartupForm();
                lf = new LeaderboardForm();

                sf.setVisible(true);
            }
        });

    }
}
