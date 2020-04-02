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
public class ICE4 {

    /**
     * @param args the command line arguments
     */
    public char maxAscii(String s)
    {
        char max = 'A';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) > max)
            {
                max = s.charAt(i);
            }
        }
        return max;
    }
    public static int CharacterOcuurence(String s, char c)
    {
        int occur = 0;
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i) == c)
                occur++;
        }
        return occur;
    }
    public boolean CharacterExists(String s,char c)
    {
        for(int i = 0; i < s.length();i++)
        {
            if(s.charAt(i) == c)
                return true;
        }
        return false;
    }
}
