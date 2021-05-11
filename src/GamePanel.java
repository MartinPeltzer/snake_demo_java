import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    //Variabelen declareren
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten; //(begint op nul)
    int appleX;
    int appleY;
    char direction = 'R'; //begint met naar rechts bewegen
    boolean running = false;
    Timer timer;
    Random random;


    //Constructor
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    //Methods:
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this); //nu doet hij het wel; vergeten om "implements ActionListener" aan R10 toe te voegen
        timer.start();
    }

    public void paintComponent(Graphics g) {

    }

    public void draw(Graphics g) {

    }

    public void newApple() {

    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver(Graphics g) {

    }

    //(Adding the unimplemented method)
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Create inner class
    public class MyKeyAdapter extends KeyAdapter {
        //Omdat hier een methode in gaat, ga je dus een methode overriden; toevoegen @Override
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
}
