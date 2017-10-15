package com.github.logicx24.rtree.impl;

import com.github.logicx24.rtree.Node;
import com.github.logicx24.rtree.Splitter;
import com.github.logicx24.rtree.geometries.Polygon;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class SplitterQuadratic implements Splitter {

    @Override
    public Boolean shouldSplit(Node node) {
        return null;
    }

    @Override
    public Pair<List<Polygon>, List<Polygon>> split(Node node, int minSize) {
        return null;
    }
}
