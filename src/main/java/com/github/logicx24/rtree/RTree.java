package com.github.logicx24.rtree;

import javax.inject.Inject;
import javax.inject.Provider;

public class RTree {

    public static final int MAX_CHILDREN_PER_NODE = 4;

    private Splitter splitter;
    private Selector selector;

    private Provider<Node> nodeProvider;

    private Node root;

    @Inject
    public RTree(
            Splitter splitter,
            Selector selector,
            Provider<Node> nodeProvider
    ) {

        this.splitter = splitter;
        this.selector = selector;
        this.nodeProvider = nodeProvider;

    }


}
