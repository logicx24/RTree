package com.github.logicx24.rtree.geometries;

public interface Geometry {

    Double distance(Geometry geometry);

    String getId();

    Geometry setId(String id);
}
