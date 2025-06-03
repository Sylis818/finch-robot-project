package com.sylis;
import com.birdbrain.Finch;
public class FinalFinch {
public static void main(String[] args) {
    Finch bird = new Finch();




bird.setMove("F", 100, 80);
bird.setTurn("L", 90, 100);
bird.playNote(32,4);
bird.setMove("F", 30, 80);
bird.setTurn("L", 90, 100);
bird.setMove("F", 40, 80);
bird.setTurn("R", 90, 100);
bird.setMove("F", 60, 80);
bird.setTurn("R", 90, 100);
bird.setMove("F", 120, 80);
bird.setTurn("R", 90, 100);
bird.setMove("F", 10, 80);






    bird.stop();
    bird.disconnect();
}
}