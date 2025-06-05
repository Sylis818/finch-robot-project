package com.sylis;
import com.birdbrain.Finch;
public class FinalFinch {
public static void main(String[] args) {
    Finch bird = new Finch();



//move through the first straight part
bird.setMove("F", 100, 80);
//takes the first turn
bird.setTurn("L", 90, 100);
//plays a note because why not
bird.playNote(32,4);
//moves it a little bit 
bird.setMove("F", 30, 80);
//turns 
bird.setTurn("L", 90, 100);
//moves to line up with the gap
bird.setMove("F", 35, 80);
//turns to face the gap
bird.setTurn("R", 90, 100);
//moves through the gap
bird.setMove("F", 60, 80);
//turns to the right
bird.setTurn("R", 96, 100);
//goes through the long part
bird.setMove("F", 125, 60);
//tunrs right
bird.setTurn("R", 90, 100);
//moves a little
bird.setMove("F", 15, 80);
//turns left
bird.setTurn("L", 90, 100);
//moves a little bit to make the last turn
bird.setMove("F", 25, 80);
//last turn
bird.setTurn("L", 90, 100);
//goes to the end
bird.setMove("F", 20, 80);





//stops the bird and disconnects it from the program
    bird.stop();
    bird.disconnect();
}
}