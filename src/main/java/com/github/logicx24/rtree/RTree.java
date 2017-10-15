package com.github.logicx24.rtree;

import javax.inject.Inject;

public class RTree {

    private Splitter splitter;
    private Selector selector;
    private BoundingRectangleGenerator boundingRectangleGenerator;
    private Node node;

    private Node root;

    @Inject
    public RTree(
            Splitter splitter,
            Selector selector,
            BoundingRectangleGenerator boundingRectangleGenerator,
            Node rootNode
    ) {

        this.splitter = splitter;
        this.selector = selector;
        this.boundingRectangleGenerator = boundingRectangleGenerator;

        this.root = rootNode;
    }


}
