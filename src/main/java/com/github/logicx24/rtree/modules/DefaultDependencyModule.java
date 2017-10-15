package com.github.logicx24.rtree.modules;

import com.github.logicx24.rtree.BoundingRectangleGenerator;
import com.github.logicx24.rtree.Selector;
import com.github.logicx24.rtree.Splitter;
import com.github.logicx24.rtree.impl.AxisAlignedBoundingRectangleGenerator;
import com.github.logicx24.rtree.impl.ChanConvexHullGenerator;
import com.github.logicx24.rtree.impl.ConvexHullGenerator;
import com.github.logicx24.rtree.impl.SelectorLeastAreaEnlargement;
import com.github.logicx24.rtree.impl.SplitterQuadratic;
import com.google.inject.AbstractModule;

public class DefaultDependencyModule extends AbstractModule {

    public void configure() {
        bind(BoundingRectangleGenerator.class).to(AxisAlignedBoundingRectangleGenerator.class);
        bind(ConvexHullGenerator.class).to(ChanConvexHullGenerator.class);
        bind(Selector.class).to(SelectorLeastAreaEnlargement.class);
        bind(Splitter.class).to(SplitterQuadratic.class);
    }
}
