package com.rnnestedscrollview;

import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;

public class ReactHorizontalNestedScrollContainerViewManager
    extends ReactHorizontalScrollContainerViewManager {

  protected static final String REACT_CLASS = "AndroidHorizontalNestedScrollContentView";

  @Override
  public String getName() {
    return REACT_CLASS;
  }
}
