# cordova-rem-fixer

This plugin supposed to fix [`rem` sized elements bug in Android Webview](https://stackoverflow.com/questions/41179357/android-webview-rem-units-scale-way-to-large-for-boxes) but it doesn't really work and I have no idea why.

Adding following lines:
```java
        super.getSettings().setMinimumFontSize(1);
        super.getSettings().setMinimumLogicalFontSize(1);
```
 to `/platforms/android/CordovaLib/src/org/apache/cordova/engine/SystemWebView.java` inside the `init` method, around LOC 60 fixed the issue tho. 
