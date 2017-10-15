package com.github.logicx24.rtree.geometries;

import java.util.List;

public interface Polygon extends Geometry {

    Boolean contains(Point point);

    Boolean intersects(Polygon polygon);

    List<Point> getPoints();

    Rectangle getMinimumBoundingRectangle();

    Double perimeter();


}
