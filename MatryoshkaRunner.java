
/**
 * Write a description of class MatryoshkaRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MatryoshkaRunner
{
    public static void main(String[] args) {
        Matryoshka t1 = new Matryoshka(java.awt.Color.green, true);
        Matryoshka t2 = new Matryoshka(t1, java.awt.Color.magenta, true);
        Matryoshka t3 = new Matryoshka(t2, java.awt.Color.cyan, true);
        Matryoshka t4 = new Matryoshka(t3, java.awt.Color.red, true);
        Matryoshka t5 = new Matryoshka(t4, java.awt.Color.RED, true);
        Matryoshka t6 = new Matryoshka(t5, java.awt.Color.PINK, false);
        System.out.println(t6.numOfDolls());
        System.out.println(t6.getHairColor());
        System.out.println(t6.getHairColor());
        System.out.println(t6.howManyRed());
        System.out.println(t6.howManyDictators());
    }
}
