package com.github.logicx24.rtree;

import com.github.logicx24.rtree.geometries.Point;
import com.github.logicx24.rtree.geometries.Rectangle;

import java.util.List;

public interface BoundingRectangleGenerator {

    Rectangle getMinimumBoundingRectangle(List<Point> points);
}
