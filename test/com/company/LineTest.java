package com.company;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LineTest {
    @Test
    public void addPointWillAddPointsInLine(){
        Line line = new Line();
        line.addPoint(new Point(1, 1));
        assertTrue(line.containsPoint(new Point(1, 1)));
    }

    @Test
    public void containsPointReturnsTrueWhenPointIsNotOnTheLine(){
        Line l = new Line();
        l.addPoint(new Point(1,1));
        l.addPoint(new Point(1,2));
        assertTrue(l.containsPoint(new Point(1, 2)));
        assertTrue(l.containsPoint(new Point(1,1)));
    }

    @Test
    public void containsPointReturnsFalseWhenPointIsNotOnTheLine(){
        Line l = new Line();
        l.addPoint(new Point(1,1));
        assertFalse(l.containsPoint(new Point(1, 3)));
    }

    @Test
    public void containsLineReturnsTrueWhenLineHasAllPointsInGivenLine(){
        Line l1 = new Line();
        l1.addPoint(new Point(1,1));
        l1.addPoint(new Point(1,2));

        Line l2 = new Line();
        l2.addPoint(new Point(1,1));
        l2.addPoint(new Point(1,2));
        l2.addPoint(new Point(1,3));

        assertTrue(l1.hasPointsOn(l2));
    }
}
