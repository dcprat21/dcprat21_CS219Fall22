// Desmond Pratt
// HW#5
package HW5;

public class Exercise66 {

    // Creating a function that takes the word and see if there are in the tiles
    public static boolean canSpell(String word, String tiles){
        boolean canSpell = false;

        // For loop that takes the tiles and see if the given word can be spelled
        for (int i = 0; i < tiles.length(); i++){
            char w = tiles.charAt(i);

            // If statement that puts CanSpell = true if some of letters in the tiles can spell the given word
            if(word.indexOf(w) >= 0){
                int t = word.indexOf(w);
                word = word.substring(0, t) + word.substring( t + 1);
                canSpell = true;

            }

            // Else statement if the tiles cannot spell the given word
            else{
                canSpell = false;

            }
        }
        // Returning canSpell
        return canSpell;
    }
    // Main function that prints true or false depending on the word and tiles.
    public static void main(String [] args){
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("apple","aodowdmdpwdakjdepddal"));
        System.out.println(canSpell("Deez", "dromaticas"));
        System.out.println(!canSpell("board","Ronaldo"));
    }
}
