package io.cordova.hellocordova;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class MyPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action,
                           JSONArray args,
                           CallbackContext callbackContext)
            throws JSONException {

        callbackContext.success();

        Toast.makeText(
                this.cordova.getActivity(),
                args.getString(0),
                Toast.LENGTH_LONG).show();

        return true;
    }
}
