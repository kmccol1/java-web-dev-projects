package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void endingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("...abc  []"));
    }

    @Test
    public void beginningBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] ... abc  d"));
    }

    @Test
    public void wordsInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void leftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[...abc"));
    }

    @Test
    public void rightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("... abc ]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void oppositeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void twoLeftBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoRightBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void nestedUnbalancedSquareBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Hello], [World]"));
    }

    @Test
    public void multipleBalancedSquareBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello], [World], [Encrypted]"));
    }

    @Test
    public void mixedCharsUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello, [W]orld!, [E]ncr[yp]ted]"));
    }

    @Test
    public void mixedCharsBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello, [W]orld!, [E]ncr[yp]ted"));
    }


}