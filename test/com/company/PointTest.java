package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testEqualsReturnsTrueWhenTwoPointsAreEqual() {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);
        assertTrue(point1.equals(point2));
        assertTrue(point2.equals(point1));
    }

    @Test
    public void testEqualsReturnsFalseWhenTwoPointsAreNotEqual (){
        Point point1 = new Point(1,2);
        Point point2 = new Point(2,2);
        assertFalse(point1.equals(point2));
        assertFalse(point2.equals(point1));
    }
}