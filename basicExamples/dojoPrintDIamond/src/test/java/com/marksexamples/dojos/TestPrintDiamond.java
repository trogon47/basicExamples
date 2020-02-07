package com.marksexamples.dojos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrintDiamond {
    @Test
    public void checkDisplaysAADiamond() {
        PrintDiamond printDiamond = new PrintDiamond();
        assertEquals("A\nA", printDiamond.print('A'));
    }

    @Test
    public void checkDisplaysABBAOKWithSpacing() {
        PrintDiamond printDiamond = new PrintDiamond();
        assertEquals(  " A\nB B\n A", printDiamond.print('B'));
    }

    @Test
    public void checkDisplaysABBCCBBAWUthSpacing() {
        PrintDiamond printDiamond= new PrintDiamond();
        assertEquals("  A\n B B\nC   C\n B B\n  A", printDiamond.print('C'));
    }



}
