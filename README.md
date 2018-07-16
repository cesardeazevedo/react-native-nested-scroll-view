# react-native-nested-scroll-view

This is a fork from the original react native ScrollView and a replacement with [NestedScrollView](https://developer.android.com/reference/android/support/v4/widget/NestedScrollView.html).

**DISCLAIMER**

I build this component while i was building the [react-native-bottom-sheet-behavior](https://github.com/cesardeazevedo/react-native-bottom-sheet-behavior) and the [react-native-collapsing-toolbar](https://github.com/cesardeazevedo/react-native-collapsing-toolbar), which the [NestedScrollView](https://developer.android.com/reference/android/support/v4/widget/NestedScrollView.html) was a requirement in order to work with [CoordinatorLayout's](https://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.html), if you are not using any native component, and just want to add some nested scroll in some List, i don't know if this component will work for you, feel free to give a try.

This component is too generic and wasn't built covering all Nested Scroll use cases, instead, it was born as just a fork of the original react native ScrollView, and i haven't tested all use cases and possibilities.

This project is android only, and will fallback to ScrollView on iOS.

## Issues

If you have any issues, please attach a example project that i could reproduce it, since i don't know how people are exactly using it, without a project example, i won't be able to help you.

## Libraries Using it.

* [react-native-collapsing-toolbar](https://github.com/cesardeazevedo/react-native-collapsing-toolbar)

* [react-native-bottom-sheet-behavior](https://github.com/cesardeazevedo/react-native-bottom-sheet-behavior)

> Tell me where you are using it!

## Getting started

`$ npm install react-native-nested-scroll-view --save`

### Automatic installation

`$ react-native link react-native-nested-scroll-view`

### Manual installation

MainApplication.java

```diff

+   import com.rnnestedscrollview.RNNestedScrollViewPackage;

    public class MainApplication extends Application implements ReactApplication {

      @Override
      protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
+           new RNNestedScrollViewPackage()
        );
      }
    }

```

android/app/build.gradle


```diff

    dependencies {
        compile fileTree(dir: "libs", include: ["*.jar"])
        compile "com.android.support:appcompat-v7:23.0.1"
        compile "com.facebook.react:react-native:+"  // From node_modules
+       compile project(':react-native-nested-scroll-view')
    }

```

android/settings.gradle

```diff

include ':app'

+   include ':react-native-nested-scroll-view'
+   project(':react-native-nested-scroll-view').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-nested-scroll-view/android')

```

# License

[MIT](./LICENSE)
