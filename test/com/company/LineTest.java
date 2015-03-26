package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
        assertTrue(l.containsPoint(new Point(1,2)));
        assertTrue(l.containsPoint(new Point(1,1)));
    }

    @Test
    public void containsPointReturnsFalseWhenPointIsNotOnTheLine(){
        Line l = new Line();
        l.addPoint(new Point(1,1));
        assertFalse(l.containsPoint(new Point(1,3)));
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

    @Test
    public void containsLineReturnsFalseWhenLineDoesNotHaveAllPointsInGivenLine(){
        Line l1 = new Line();
        l1.addPoint(new Point(1,1));
        l1.addPoint(new Point(1,2));
        Line l2 = new Line();
        l2.addPoint(new Point(1,1));
        l2.addPoint(new Point(1,3));

        assertFalse(l1.hasPointsOn(l2));
    }

    @Test
    public void sizeReturnsSizeOfTheLine (){
        Line line = new Line();
        line.addPoint(new Point(1,1));
        line.addPoint(new Point(1,2));
        assertEquals(2, line.size());
    }

    @Test
    public void equalsReturnsTrueWhenLineIsEqualToGivenLine (){
        Line line1 = new Line();
        line1.addPoint(new Point(1,1));
        Line line2 = new Line();
        line2.addPoint(new Point(1,1));

        assertTrue(line1.equals(line2));
        assertTrue(line2.equals(line1));
    }

    @Test
    public void equalsReturnsFalseWhenLineIsNotEqualToGivenLine (){
        Line line1 = new Line();
        line1.addPoint(new Point(1,1));
        Line line2 = new Line();
        line2.addPoint(new Point(3,1));
        assertFalse(line1.equals(line2));
        assertFalse(line2.equals(line1));
    }
}
