package com.github.logicx24.rtree;

import com.github.logicx24.rtree.geometries.Polygon;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public interface Splitter {

    Boolean shouldSplit(Node node);

    Pair<List<Polygon>, List<Polygon>> split(Node node, int minSize);
}
