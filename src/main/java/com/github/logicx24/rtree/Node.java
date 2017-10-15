package com.github.logicx24.rtree;

import com.github.logicx24.rtree.geometries.Point;
import com.github.logicx24.rtree.geometries.Polygon;

import java.util.Set;

public interface Node {

    Boolean contains(Point point);

    Set<Polygon> getContainedShapes();

    Set<Node> getChildren();

    void addChild(Node child);

    void addShape(Polygon containedShape);

    Boolean isLeaf();
}
