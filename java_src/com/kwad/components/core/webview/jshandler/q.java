package com.kwad.components.core.webview.jshandler;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.utils.bb;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class q implements SensorEventListener, com.kwad.sdk.core.webview.c.a {
    private Map<Integer, com.kwad.sdk.core.webview.c.c> WT = new ConcurrentHashMap();

    /* loaded from: classes5.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int WW;
        public ArrayList<Float> WX;
        public int accuracy;
        public long timestamp;
        public int type;

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final void parseJson(@Nullable JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.type = jSONObject.optInt("type");
            this.WW = jSONObject.optInt("interval");
            this.timestamp = jSONObject.optLong(UMCrash.SP_KEY_TIMESTAMP);
            this.accuracy = jSONObject.optInt("accuracy");
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            ArrayList<Float> arrayList = new ArrayList<>();
            if (optJSONArray == null) {
                this.WX = arrayList;
                return;
            }
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                try {
                    Object obj = optJSONArray.get(i4);
                    if (obj != null) {
                        arrayList.add((Float) obj);
                    }
                } catch (Throwable unused) {
                }
            }
            this.WX = arrayList;
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            int i4 = this.type;
            if (i4 != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "type", i4);
            }
            int i5 = this.WW;
            if (i5 != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "interval", i5);
            }
            long j4 = this.timestamp;
            if (j4 != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, UMCrash.SP_KEY_TIMESTAMP, j4);
            }
            int i6 = this.accuracy;
            if (i6 != 0) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "accuracy", i6);
            }
            if (!this.WX.isEmpty()) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "values", this.WX);
            }
            return jSONObject;
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, @NonNull com.kwad.sdk.core.webview.c.c cVar) {
        if (!TextUtils.isEmpty(str)) {
            a aVar = new a();
            try {
                aVar.parseJson(new JSONObject(str));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            this.WT.put(Integer.valueOf(aVar.type), cVar);
            a(aVar.type, aVar.WW, cVar);
            return;
        }
        cVar.onError(-1, "data is empty");
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @NonNull
    public final String getKey() {
        return "registerSensorListener";
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        com.kwad.sdk.utils.bb.Nn().a(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent);
    }

    private void a(int i4, int i5, final com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.sdk.utils.bb.Nn().a(i4, i5, this, new bb.b() { // from class: com.kwad.components.core.webview.jshandler.q.1
            @Override // com.kwad.sdk.utils.bb.b
            public final void onFailed() {
                cVar.onError(-1, "sensor is not support");
            }
        });
    }

    private void a(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 4) {
            type = 2;
        } else if (type == 10) {
            type = 1;
        }
        com.kwad.sdk.core.webview.c.c cVar = this.WT.get(Integer.valueOf(type));
        if (cVar == null) {
            return;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int i4 = 0;
        while (true) {
            float[] fArr = sensorEvent.values;
            if (i4 < fArr.length) {
                arrayList.add(Float.valueOf(fArr[i4]));
                i4++;
            } else {
                a aVar = new a();
                aVar.WX = arrayList;
                aVar.timestamp = sensorEvent.timestamp;
                aVar.accuracy = sensorEvent.accuracy;
                cVar.a(aVar);
                return;
            }
        }
    }
}
