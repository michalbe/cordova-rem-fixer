package org.apache.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.json.JSONException;

import android.webkit.WebView;

@SuppressWarnings("deprecation")
public class RemFixerPlugin extends CordovaPlugin {
    public static WebView webView;  

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView cordovaWebView) {
        super.initialize(cordova, cordovaWebView);

        RemFixerPlugin.webView = (WebView) cordovaWebView;
    }

    @Override
    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {

        RemFixerPlugin.webView.getSettings().setMinimumFontSize(100);
        RemFixerPlugin.webView.getSettings().setMinimumLogicalFontSize(100);
        
        return true;
    }
}
