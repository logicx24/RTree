package com.github.logicx24.rtree.geometries.impl;

import com.github.logicx24.rtree.geometries.Point;
import com.github.logicx24.rtree.geometries.Rectangle;

public class RectangleImpl extends PolygonImpl implements Rectangle {
    @Override
    public Point x1() {
        return null;
    }

    @Override
    public Point x2() {
        return null;
    }

    @Override
    public Point y1() {
        return null;
    }

    @Override
    public Point y2() {
        return null;
    }

    @Override
    public Boolean contains(Rectangle rectangle) {
        return getMinimumBoundingRectangle().contains(rectangle);
    }

    @Override
    public Double area() {
        return null;
    }
}
