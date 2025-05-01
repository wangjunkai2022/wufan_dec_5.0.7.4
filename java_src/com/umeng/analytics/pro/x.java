package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.k;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ViewPageTracker.java */
/* loaded from: classes6.dex */
public class x {

    /* renamed from: c  reason: collision with root package name */
    private static final int f63956c = 5;

    /* renamed from: d  reason: collision with root package name */
    private static JSONArray f63957d = new JSONArray();

    /* renamed from: e  reason: collision with root package name */
    private static Object f63958e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Long> f63961f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    Stack<String> f63959a = new Stack<>();

    /* renamed from: b  reason: collision with root package name */
    com.umeng.analytics.vshelper.a f63960b = PageNameMonitor.getInstance();

    public static void a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f63958e) {
                    jSONArray = f63957d.toString();
                    f63957d = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("__a", new JSONArray(jSONArray));
                    if (jSONObject.length() > 0) {
                        k.a(context).a(w.a().c(), jSONObject, k.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected int a() {
        return 2;
    }

    public void b(String str) {
        Long l4;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f63961f.containsKey(str)) {
            synchronized (this.f63961f) {
                l4 = this.f63961f.get(str);
                this.f63961f.remove(str);
            }
            if (l4 == null) {
                return;
            }
            if (UMConfigure.isDebugLog() && this.f63959a.size() > 0 && str.equals(this.f63959a.peek())) {
                this.f63959a.pop();
            }
            long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
            synchronized (f63958e) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(f.f63709v, str);
                    jSONObject.put("duration", currentTimeMillis);
                    jSONObject.put(f.f63711x, l4);
                    jSONObject.put("type", a());
                    f63957d.put(jSONObject);
                    if (f63957d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                        UMWorkDispatch.sendEvent(appContext, 4099, CoreProtocol.getInstance(appContext), null);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!UMConfigure.isDebugLog() || this.f63959a.size() == 0) {
                return;
            }
            UMLog.aq(l.E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        } else if (UMConfigure.isDebugLog() && this.f63959a.size() == 0) {
            UMLog.aq(l.G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f63959a.size() != 0) {
            UMLog.aq(l.F, 0, "\\|", new String[]{"@"}, new String[]{this.f63959a.peek()}, null, null);
        }
        this.f63960b.customPageBegin(str);
        synchronized (this.f63961f) {
            this.f63961f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f63959a.push(str);
            }
        }
    }

    public void b() {
        String str;
        synchronized (this.f63961f) {
            str = null;
            long j4 = 0;
            for (Map.Entry<String, Long> entry : this.f63961f.entrySet()) {
                if (entry.getValue().longValue() > j4) {
                    long longValue = entry.getValue().longValue();
                    str = entry.getKey();
                    j4 = longValue;
                }
            }
        }
        if (str != null) {
            b(str);
        }
    }
}
