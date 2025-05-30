package com.sylis;
import com.birdbrain.Finch;
public class SquareFinch {
public static void main(Strings[] args) {
    Finch bird = new Finch();
for (int i = 0; i<4; i++) {
bird.setMove("F", 20, 100);
bird.setTurn("R", 90, 100);
}

    bird.stop();
    bird.disconnect();
}
}