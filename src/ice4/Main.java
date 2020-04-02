/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

/**
 *
 * @author Anjali Panchal
 */
public class Main {
    public static void main(String[] args){
        ICE4 test = new ICE4();
        System.out.println("Largest alphabet " + test.maxAscii("Anjali"));
        System.out.println(test.CharacterExists("AnjaliPanchal",'j'));
        System.out.println(test.CharacterExists("Anjali",'m'));
        System.out.println(test.CharacterOcuurence("Panchal",'a'));
    }
}
