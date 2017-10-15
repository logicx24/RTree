package com.github.logicx24.rtree.geometries;

import java.util.List;

public interface Polygon extends Geometry {

    Boolean contains(Point point);

    Boolean intersects(Polygon polygon);

    List<Point> getPoints();

    void addPoint(Point point);

    void addPoints(List<Point> points);

    Double perimeter();

    void setBoundingRectangle(Rectangle boundingRectangle);

    Double area();

}
