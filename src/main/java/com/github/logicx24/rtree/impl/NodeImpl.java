package com.github.logicx24.rtree.impl;

import com.github.logicx24.rtree.Node;
import com.github.logicx24.rtree.geometries.Point;
import com.github.logicx24.rtree.geometries.Polygon;
import com.github.logicx24.rtree.geometries.Rectangle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeImpl implements Node {

    private Rectangle boundingRectangle;
    private Set<Polygon> shapes = new HashSet<>();
    private List<Node> children = new ArrayList<>();
    private Boolean isLeaf;

    @Override
    public Boolean contains(Point point) {
        return boundingRectangle.contains(point);
    }

    @Override
    public Set<Polygon> getContainedShapes() {
        return shapes;
    }

    @Override
    public Set<Node> getChildren() {
        return null;
    }

    @Override
    public void addChild(Node child) {
        children.add(child);

        for (Polygon shape : child.getContainedShapes()) {
            addShape(shape);
        }
    }

    @Override
    public void addShape(Polygon containedShape) {
        shapes.add(containedShape);
    }

    @Override
    public List<Point> getAllContainedPoints() {
        List<Point> allPoints = new ArrayList<>();
        for (Polygon polygon : getContainedShapes()) {
            allPoints.addAll(polygon.getPoints());
        }
        return allPoints;
    }

    @Override
    public Boolean isLeaf() {
        return isLeaf;
    }

    @Override
    public Node setIsLeaf(Boolean leaf) {
        isLeaf = leaf;
        return this;
    }

    @Override
    public void setBoundingRectangle(Rectangle boundingRectangle) {
        this.boundingRectangle = boundingRectangle;
    }
}
