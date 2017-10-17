package com.rnnestedscrollview;

import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;

/**
 * react-native@0.49.0 introduces a weird breaking change that don't allow us to use
 * requireNativeComponent twice of the same view name, and since we are using the same
 * implementation of ScrollView.js, we are requiring AndroidHorizontalScrollView twice
 * which now throws a error.
 *
 * This class only exists to replace the native view name (REACT_CLASS) and extends the default
 * behavior of the ReactHorizontalScrollViewManager.
 */
public class ReactHorizontalNestedScrollViewManager extends ReactHorizontalScrollViewManager {

  protected static final String REACT_CLASS = "AndroidHorizontalNestedScrollView";

  @Override
  public String getName() {
    return REACT_CLASS;
  }
}
