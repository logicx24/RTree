package com.github.logicx24.rtree.geometries;

public class Point implements Geometry {

    private final Double x;
    private final Double y;

    private String id;

    public Point(Double x, Double y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public Double distance(Geometry geometry) {
        return null;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Point setId(String id) {
        this.id = id;
        return this;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
}
