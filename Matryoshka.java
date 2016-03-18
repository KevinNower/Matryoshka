
/**
 * Write a description of class Matryoshka here.
 * 
 * @author Kevin Nower 
 * @version 3/8/16
 */

import java.awt.Color;
public class Matryoshka {
    private Matryoshka innerDoll;
    private Color hair;
    private boolean isDictator;

    public Matryoshka(Color choice, boolean isDictator) {
        innerDoll = null;
        hair = choice;
        this.isDictator = isDictator;
    }

    public Matryoshka(Matryoshka innerDoll, Color choice, boolean isDictator) {
        this.innerDoll = innerDoll;
        hair = choice;
        this.isDictator = isDictator;
    }

    public int numOfDolls() {
        if(innerDoll == null) {
            return 1;
        }
        else {
            return 1 + innerDoll.numOfDolls();
        }
    }

    public boolean hasInnerDoll() {
        return innerDoll != null;
    }

    public Matryoshka getInnerDoll() {
        return innerDoll;
    }

    public Color getHairColor() {
        return hair;
    }

    public boolean isRed() {
        return hair == Color.RED;
    }

    public int howManyRed() {

        if(innerDoll == null && hair == Color.RED) {
            return 1;
        }

        else if (innerDoll == null) {
            return 0;
        }

        else if(hair != Color.RED) {
            return innerDoll.howManyRed();
        }

        else {
            return 1 + innerDoll.howManyRed();
        }

    }

    public int howManyDictators() {

        if(innerDoll == null && isDictator == true) {
            return 1;
        }

        else if (innerDoll == null) {
            return 0;
        }

        else if(isDictator == false) {
            return innerDoll.howManyDictators();
        }

        else {
            return 1 + innerDoll.howManyDictators();
        }
    }
}