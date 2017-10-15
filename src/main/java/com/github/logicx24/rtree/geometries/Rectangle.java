package com.github.logicx24.rtree.geometries;

public interface Rectangle extends Polygon {

    Point x1();

    Point x2();

    Point y1();

    Point y2();

    Boolean contains(Rectangle rectangle);
}
