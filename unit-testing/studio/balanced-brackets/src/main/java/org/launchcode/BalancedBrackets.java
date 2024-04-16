package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int leftBrackets = 0;
        int rightBrackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                leftBrackets++;
            } else if (ch == ']') {

                rightBrackets++;
//                if (leftBrackets < 1 && str.length() <= 1 && rightBrackets < 1)
//                    rightBrackets--;
//                else if (rightBrackets <= 1)
//                    rightBrackets++;

            }
            if (leftBrackets - rightBrackets < 0)
                return leftBrackets - rightBrackets == 0;
        }
//        return brackets == 0;
        return leftBrackets == rightBrackets;
    }
}