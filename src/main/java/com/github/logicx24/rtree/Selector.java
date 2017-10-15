package com.github.logicx24.rtree;

import java.util.List;

public interface Selector {

    Node select(List<Node> nodes);
}
