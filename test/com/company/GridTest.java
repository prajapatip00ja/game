package com.company;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void giveLineAtGivesLineAtGivenIndex (){
        Grid grid = new Grid();
        grid.addLine(new Line());
        assertEquals(new Line(), grid.giveLineAt(0));
    }
//
//    @Test
//    public void addLineAddsALineInTheGrid (){
//
//    }
}