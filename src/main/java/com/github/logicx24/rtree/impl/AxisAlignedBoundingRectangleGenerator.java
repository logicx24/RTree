package com.github.logicx24.rtree.impl;

import com.github.logicx24.rtree.BoundingRectangleGenerator;
import com.github.logicx24.rtree.geometries.Point;
import com.github.logicx24.rtree.geometries.Rectangle;

import javax.inject.Inject;
import java.util.List;

public class AxisAlignedBoundingRectangleGenerator implements BoundingRectangleGenerator {

    private ConvexHullGenerator convexHullGenerator;

    @Inject
    public AxisAlignedBoundingRectangleGenerator(ConvexHullGenerator convexHullGenerator) {

        this.convexHullGenerator = convexHullGenerator;
    }

    @Override
    public Rectangle getMinimumBoundingRectangle(List<Point> points) {
        return null;
    }
}
