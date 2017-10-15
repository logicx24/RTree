package com.github.logicx24.rtree.geometries.impl;

import com.github.logicx24.rtree.geometries.Geometry;
import com.github.logicx24.rtree.geometries.Point;
import com.github.logicx24.rtree.geometries.Polygon;
import com.github.logicx24.rtree.geometries.Rectangle;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class PolygonImpl implements Polygon {

    private String id;
    private List<Point> points;

    private Rectangle boundingRectangle;

    @Override
    public Double distance(Geometry geometry) {
        return null;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public PolygonImpl setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public Boolean contains(Point point) {
        return getMinimumBoundingRectangle().contains(point);
    }

    @Override
    public Boolean intersects(Polygon polygon) {
        return null;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public void addPoint(Point point) {
        addPoints(ImmutableList.of(point));
    }

    @Override
    public void addPoints(List<Point> points) {
        this.points.addAll(points);
    }

    Rectangle getMinimumBoundingRectangle() {
        return boundingRectangle;
    }

    @Override
    public Double perimeter() {
        return null;
    }

    @Override
    public void setBoundingRectangle(Rectangle boundingRectangle) {
        this.boundingRectangle = boundingRectangle;
    }

    @Override
    public Double area() {
        return null;
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
