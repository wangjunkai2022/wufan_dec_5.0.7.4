package com.kwai.adclient.kscommerciallogger.snapshot;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class d {
    private final String aVB;
    private final LinkedHashMap<String, String> aVC = new LinkedHashMap<>();
    private final long time = System.nanoTime();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str) {
        this.aVB = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized JSONObject Pc() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.aVC.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("time", this.time);
            jSONObject.put("span_name", this.aVB);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }
}
