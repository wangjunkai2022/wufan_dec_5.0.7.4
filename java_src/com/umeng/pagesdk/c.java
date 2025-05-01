package com.umeng.pagesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.Choreographer;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    float f64667a;

    /* renamed from: b  reason: collision with root package name */
    long f64668b;

    /* renamed from: c  reason: collision with root package name */
    int f64669c;

    /* renamed from: d  reason: collision with root package name */
    int f64670d;

    /* renamed from: e  reason: collision with root package name */
    int f64671e;

    /* renamed from: g  reason: collision with root package name */
    boolean f64673g;

    /* renamed from: h  reason: collision with root package name */
    long f64674h;

    /* renamed from: i  reason: collision with root package name */
    long f64675i;

    /* renamed from: j  reason: collision with root package name */
    String f64676j;

    /* renamed from: k  reason: collision with root package name */
    private Context f64677k;

    /* renamed from: f  reason: collision with root package name */
    Map<String, Double> f64672f = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private Choreographer.FrameCallback f64678l = new Choreographer.FrameCallback() { // from class: com.umeng.pagesdk.c.1
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j4) {
            boolean z4 = PageManger.isDebug;
            c cVar = c.this;
            if (cVar.f64673g) {
                if (cVar.f64674h == 0) {
                    cVar.f64674h = System.currentTimeMillis();
                }
                long currentTimeMillis = System.currentTimeMillis();
                c cVar2 = c.this;
                if (currentTimeMillis - cVar2.f64674h > cVar2.f64675i) {
                    cVar2.b();
                    return;
                }
                if (cVar2.f64668b == 0) {
                    cVar2.f64668b = j4;
                }
                float f5 = ((float) (j4 - cVar2.f64668b)) / 1000000.0f;
                if (f5 > cVar2.f64667a) {
                    double d5 = cVar2.f64669c * 1000;
                    double d6 = f5;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    double d7 = d5 / d6;
                    cVar2.f64669c = 0;
                    cVar2.f64668b = 0L;
                    if (PageManger.isDebug) {
                        StringBuilder sb = new StringBuilder("doFrame: ");
                        sb.append(d7);
                        sb.append(", map size is ");
                        sb.append(c.this.f64672f.size());
                        sb.append(", page is ");
                        sb.append(c.this.f64676j);
                    }
                    Map<String, Double> map = c.this.f64672f;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(System.currentTimeMillis());
                    map.put(sb2.toString(), Double.valueOf(d7));
                    c cVar3 = c.this;
                    int i4 = cVar3.f64670d + 1;
                    cVar3.f64670d = i4;
                    if (i4 >= cVar3.f64671e) {
                        cVar3.c();
                        c cVar4 = c.this;
                        cVar4.f64670d = 0;
                        Map<String, Double> map2 = cVar4.f64672f;
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                } else {
                    cVar2.f64669c++;
                }
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    };

    public c(Context context) {
        SharedPreferences sharedPreferences;
        this.f64667a = 1000.0f;
        this.f64671e = 6;
        this.f64675i = q.a.f73127b;
        this.f64677k = context;
        if (context == null || (sharedPreferences = context.getSharedPreferences("efs_page", 0)) == null) {
            return;
        }
        this.f64667a = sharedPreferences.getFloat(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL, 1000.0f);
        this.f64671e = sharedPreferences.getInt(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, 6);
        this.f64675i = sharedPreferences.getLong(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC, q.a.f73127b);
        if (PageManger.isDebug) {
            StringBuilder sb = new StringBuilder("init fps. diff is ");
            sb.append(this.f64667a);
            sb.append(", count diff is ");
            sb.append(this.f64671e);
            sb.append(", dlealt time is ");
            sb.append(this.f64675i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a a5;
        Iterator<Map.Entry<String, Double>> it2 = this.f64672f.entrySet().iterator();
        if (it2 != null) {
            JSONArray jSONArray = null;
            boolean z4 = false;
            while (it2.hasNext()) {
                Map.Entry<String, Double> next = it2.next();
                if (next != null) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (PageManger.getRefreshRate() > 0.0f) {
                            double doubleValue = next.getValue().doubleValue();
                            double refreshRate = PageManger.getRefreshRate();
                            Double.isNaN(refreshRate);
                            if (doubleValue < refreshRate * 1.1d) {
                                jSONObject.put(next.getKey(), next.getValue());
                                if (next.getValue().doubleValue() < 40.0d) {
                                    z4 = true;
                                }
                            }
                        }
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("pN", this.f64676j);
                    jSONObject2.put("pF", jSONArray);
                    if (z4 && (a5 = b.a(this.f64677k).a()) != null) {
                        jSONObject2.put("te", a5.f64657c);
                        jSONObject2.put("le", a5.f64655a);
                    }
                    EfsJSONLog efsJSONLog = new EfsJSONLog("fpsperf");
                    efsJSONLog.put("fps", jSONObject2);
                    EfsReporter reporter = PageManger.getReporter();
                    if (reporter != null) {
                        reporter.send(efsJSONLog);
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public final void a() {
        if (this.f64673g) {
            boolean z4 = PageManger.isDebug;
            return;
        }
        this.f64673g = true;
        if (PageManger.isDebug) {
            new StringBuilder("start, page is ").append(this.f64676j);
        }
        Choreographer.getInstance().removeFrameCallback(this.f64678l);
        Choreographer.getInstance().postFrameCallback(this.f64678l);
    }

    public final void b() {
        if (PageManger.isDebug) {
            new StringBuilder("stop, page is ").append(this.f64676j);
        }
        c();
        this.f64673g = false;
        this.f64674h = 0L;
        this.f64668b = 0L;
        this.f64669c = 0;
        Map<String, Double> map = this.f64672f;
        if (map != null) {
            map.clear();
        }
        this.f64670d = 0;
    }
}
