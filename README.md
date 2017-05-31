# react-native-nested-scroll-view

This is a fork from the original react native ScrollView and a replacement with NestedScrollView.
You should only use this if you are using such native components such as CoordinatorLayout.

## Libraries Using it.

* [react-native-collapsing-toolbar](https://github.com/cesardeazevedo/react-native-collapsing-toolbar)

* [react-native-bottom-sheet-behavior](https://github.com/cesardeazevedo/react-native-bottom-sheet-behavior *Optional)

> Tell me where you are using it!

## Getting started

`$ npm install react-native-nested-scroll-view --save`

### Automatic installation

`$ react-native link react-native-nested-scroll-view`

### Manual installation

MainActivity.java

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
+       compile project(': react-native-nested-scroll-view')
    }

```

android/settings.gradle

```diff

include ':app'

+   include ':react-native-nested-scroll-view'
+   project(':react-native-nested-scroll-view').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-nested-scroll-view/android')


# License

[MIT](./LICENSE)
