package com.github.logicx24.rtree.impl;

import com.github.logicx24.rtree.geometries.Point;
import com.github.logicx24.rtree.geometries.Polygon;

import java.util.List;

public interface ConvexHullGenerator {

    Polygon generateHull(List<Point> points);
}
