public class DisemvowelTrolls {
    /*
    Trolls are attacking your comment section!

    A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

    Your task is to write a function that takes a string and return a new string with all vowels removed.

    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

    Note: for this kata y isn't considered a vowel.
     */
    public static String disemvowel(String str) {
        String result = str;
        result = result.replace("a", "");
        result = result.replace("e", "");
        result = result.replace("i", "");
        result = result.replace("o", "");
        result = result.replace("u", "");
        result = result.replace("A", "");
        result = result.replace("E", "");
        result = result.replace("I", "");
        result = result.replace("O", "");
        result = result.replace("U", "");
        return result;
    }

    public static String disemvowelCODEWARS(String Z) {
        return Z.replaceAll("(?i)[aeiou]", "");
    }

    public static void main(String[] args) {
        //System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowelCODEWARS("This website is for losers LOL!"));
    }
}
