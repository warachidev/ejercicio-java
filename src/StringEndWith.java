public class StringEndWith {
    /*
    Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

    Examples:
    solution('abc', 'bc') // returns true
    solution('abc', 'd') // returns false
     */
    public static boolean solution(String str, String ending) {
        int strSize = str.length() - 1;
        int endingSize = ending.length() - 1;
        if (strSize < endingSize) return false;
        while (strSize >= 0 && endingSize >= 0) {
            if (str.charAt(strSize--) != ending.charAt(endingSize--))
                return false;
        }
        return true;
    }

    public static boolean solutionCODEWARS(String str, String ending) {
        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "abcd"));
    }
}
