package org.apache.cordova.plugin;

import org.apache.cordova.DroidGap;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.util.SparseArray;
import android.webkit.WebSettings;
import android.webkit.WebSettings.TextSize;
import android.webkit.WebView;


/**
 * Cordova Plugin for adjusting the font size, between 50% and 200%.
 * 
 * Shows up in the JavaScript as window.plugins.fontSizeAdjust
 * 
 * @author nolan
 *
 */
@SuppressWarnings("deprecation")
public class RemFixerPlugin extends CordovaPlugin {
    
    @Override
    public boolean execute() {
        
        DroidGap droidGap = (DroidGap)super.cordova.getActivity();
        
        WebView webView = (WebView) droidGap.findViewById(100);

        
        adjustOnUIThread(droidGap, webView);
        
        return true;
    }
    
    private void adjustOnUIThread(final Activity activity, final WebView webView) {
        
        activity.runOnUiThread(new Runnable() {
            
            @Override
            public void run() {
                webView.getSettings().setMinimumFontSize(1);
                webView.getSettings().setMinimumLogicalFontSize(1);
            }
        });
    }
}
