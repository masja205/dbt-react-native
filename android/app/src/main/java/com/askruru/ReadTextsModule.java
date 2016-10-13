package com.askruru;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext; 
import com.facebook.react.bridge.ReactContext; 
import com.facebook.react.bridge.ReactContextBaseJavaModule; 
import com.facebook.react.bridge.ReactMethod; 
import java.util.Map;

public class ReadTextsModule extends ReactContextBaseJavaModule { 
  
  
    public ReadTextsModule(ReactApplicationContext reactContext) { 
      super(reactContext);
    }

    @Override
    public String getName() { 

        return "ReadTexts";

    }

    @ReactMethod
    public void getTextMessages(Callback error, Callback success) {
        success.invoke();

    }
    
}
