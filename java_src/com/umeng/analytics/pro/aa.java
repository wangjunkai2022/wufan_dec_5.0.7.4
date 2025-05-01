package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SessionIdManager.java */
/* loaded from: classes6.dex */
public class aa {

    /* renamed from: c  reason: collision with root package name */
    private static volatile aa f63287c;

    /* renamed from: a  reason: collision with root package name */
    private y f63288a = new z();

    /* renamed from: b  reason: collision with root package name */
    private String f63289b;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f63290d;

    /* renamed from: e  reason: collision with root package name */
    private String f63291e;

    /* compiled from: SessionIdManager.java */
    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, long j4, long j5, long j6);

        void a(String str, String str2, long j4, long j5, long j6);
    }

    private aa() {
    }

    public static aa a() {
        if (f63287c == null) {
            synchronized (aa.class) {
                if (f63287c == null) {
                    f63287c = new aa();
                }
            }
        }
        return f63287c;
    }

    private String f(Context context) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString(w.f63945d, d(context));
            edit.commit();
        } catch (Exception unused) {
        }
        long h4 = h(context);
        long i4 = i(context);
        String str = this.f63289b;
        long a5 = w.a(context);
        long j4 = a5 * 5000;
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count 值完成，count次数：" + a5);
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
            if (UMWorkDispatch.eventHasExist()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
                UMWorkDispatch.removeEvent();
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
            }
        } else {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** foreground count druation云控参数关闭。");
        }
        a(i4, h4, j4, str, false);
        this.f63289b = this.f63288a.a(context);
        a(i4, h4, j4, str, true);
        this.f63288a.a(context, this.f63289b);
        return this.f63289b;
    }

    private boolean g(Context context) {
        return !TextUtils.isEmpty(this.f63289b) && k.a(context).a(this.f63289b) > 0;
    }

    private long h(Context context) {
        return a(context, w.f63947f);
    }

    private long i(Context context) {
        return a(context, w.f63942a);
    }

    private boolean j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j4 = sharedPreferences.getLong(w.f63946e, 0L);
            long j5 = sharedPreferences.getLong(w.f63947f, 0L);
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.E) && j4 > 0 && j5 == 0) {
                long a5 = w.a(appContext);
                if (a5 > 0) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j5 = j4 + (a5 * 5000);
                }
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j5 - j4));
            return this.f63288a.a(j4, j5);
        } catch (Exception unused) {
            return false;
        }
    }

    public long b() {
        return this.f63288a.a();
    }

    public String c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f63289b = f(appContext);
        } catch (Exception unused) {
        }
        return this.f63289b;
    }

    public String d(Context context) {
        if (TextUtils.isEmpty(this.f63289b)) {
            try {
                this.f63289b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f63289b;
    }

    public boolean e(Context context) {
        if (TextUtils.isEmpty(this.f63289b)) {
            this.f63289b = d(context);
        }
        return TextUtils.isEmpty(this.f63289b) || j(context) || g(context);
    }

    public synchronized String b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f63289b = d(appContext);
        if (e(appContext)) {
            try {
                this.f63289b = f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f63289b;
    }

    public void a(long j4) {
        this.f63288a.a(j4);
    }

    public String a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String str = "";
        try {
            synchronized (aa.class) {
                str = PreferenceWrapper.getDefault(appContext).getString(w.f63945d, "");
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public void b(a aVar) {
        List<a> list;
        if (aVar == null || (list = this.f63290d) == null || list.size() == 0) {
            return;
        }
        this.f63290d.remove(aVar);
    }

    public String a(Context context, long j4) {
        if (TextUtils.isEmpty(this.f63291e)) {
            String str = "SUB" + j4;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("%0" + (32 - str.length()) + com.kuaishou.weapon.p0.t.f55701t, 0));
            this.f63291e = sb.toString();
        }
        return this.f63291e;
    }

    private long a(Context context, String str) {
        long j4;
        try {
            j4 = PreferenceWrapper.getDefault(context).getLong(str, 0L);
        } catch (Exception unused) {
            j4 = 0;
        }
        return j4 <= 0 ? System.currentTimeMillis() : j4;
    }

    private void a(long j4, long j5, long j6, String str, boolean z4) {
        List<a> list = this.f63290d;
        if (list != null) {
            for (a aVar : list) {
                if (z4) {
                    try {
                        aVar.a(str, this.f63289b, j4, j5, j6);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.a(this.f63289b, j4, j5, j6);
                }
            }
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f63290d == null) {
            this.f63290d = new ArrayList();
        }
        if (this.f63290d.contains(aVar)) {
            return;
        }
        this.f63290d.add(aVar);
    }
}
