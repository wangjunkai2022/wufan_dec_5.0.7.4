package com.efs.sdk.base.core.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.kuaishou.weapon.p0.bi;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Long> f10298a = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.c.b.1
        {
            put("flow_5min", Long.valueOf((long) q.a.f73127b));
            put("flow_hour", Long.valueOf((long) bi.f55326s));
            put("flow_day", 86400000L);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Long> f10299b = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.c.b.2
        {
            put("flow_5min", 1048576L);
            put("flow_hour", 1048576L);
            put("flow_day", Long.valueOf((long) PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE));
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private Map<String, AtomicInteger> f10300c;

    /* renamed from: d  reason: collision with root package name */
    private volatile SharedPreferences f10301d;

    /* renamed from: e  reason: collision with root package name */
    private volatile SharedPreferences.Editor f10302e;

    /* renamed from: f  reason: collision with root package name */
    private Context f10303f;

    /* renamed from: g  reason: collision with root package name */
    private String f10304g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f10305a = new b((byte) 0);
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b a() {
        return a.f10305a;
    }

    private void b() {
        try {
            c();
        } catch (Throwable th) {
            Log.e("efs.flow", "init sharedpreferences error", th);
        }
    }

    private void c() {
        if (this.f10301d == null) {
            synchronized (b.class) {
                if (this.f10301d == null) {
                    this.f10301d = SharedPreferencesUtils.getSharedPreferences(this.f10303f, this.f10304g.toLowerCase() + "_flow");
                }
            }
        }
        if (this.f10302e == null) {
            synchronized (b.class) {
                if (this.f10302e == null) {
                    this.f10302e = this.f10301d.edit();
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        int i4 = message.what;
        if (i4 == 0) {
            b();
            if (this.f10301d == null) {
                Log.w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
            } else if (this.f10302e == null) {
                Log.w("efs.flow", "sharedpreferences editor is null, cann't refresh flow stat");
            } else {
                String valueOf = String.valueOf(message.obj);
                long j4 = message.arg1;
                String netStatus = GlobalInfoManager.getInstance().getNetStatus();
                for (String str : f10298a.keySet()) {
                    String concat = "curr_time_".concat(String.valueOf(str));
                    if (!this.f10301d.contains(concat)) {
                        this.f10302e.putLong(concat, System.currentTimeMillis());
                    }
                    for (String str2 : a(str, valueOf, netStatus)) {
                        this.f10302e.putLong(str2, this.f10301d.getLong(str2, 0L) + j4);
                    }
                }
                this.f10302e.apply();
            }
        } else if (i4 != 1) {
            Log.w("efs.flow", "flow stat listener not support action '" + message.what + "'");
        } else {
            String valueOf2 = String.valueOf(message.obj);
            long j5 = message.arg1;
            b();
            if (this.f10301d == null) {
                Log.w("efs.flow", "sharedpreferences is null, cann't get last refresh timestamp");
            } else if (this.f10302e == null) {
                Log.w("efs.flow", "sharedpreferences editor is null, cann't refresh timestamp");
            } else {
                String concat2 = "curr_time_".concat(valueOf2);
                if (Math.abs(System.currentTimeMillis() - this.f10301d.getLong(concat2, System.currentTimeMillis())) >= j5) {
                    for (String str3 : this.f10301d.getAll().keySet()) {
                        if (str3.startsWith(valueOf2)) {
                            this.f10302e.putLong(str3, 0L);
                        }
                    }
                    this.f10302e.putLong(concat2, System.currentTimeMillis());
                    this.f10302e.apply();
                    this.f10300c.clear();
                }
            }
        }
    }

    private b() {
        super(com.efs.sdk.base.core.util.concurrent.a.f10436a.getLooper());
        this.f10300c = new ConcurrentHashMap(5);
        this.f10303f = ControllerCenter.getGlobalEnvStruct().mAppContext;
        this.f10304g = ControllerCenter.getGlobalEnvStruct().getAppid();
        b();
        File c5 = com.efs.sdk.base.core.util.a.c(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (c5.exists()) {
            com.efs.sdk.base.core.util.b.b(c5);
        }
    }

    public final boolean a(@NonNull String str, long j4) {
        String netStatus = GlobalInfoManager.getInstance().getNetStatus();
        boolean z4 = true;
        for (Map.Entry<String, Long> entry : f10298a.entrySet()) {
            z4 = a(entry.getKey(), entry.getValue().longValue(), str, netStatus, j4);
            if (!z4) {
                break;
            }
        }
        return z4;
    }

    private boolean a(@NonNull String str, long j4, @NonNull String str2, @NonNull String str3, long j5) {
        b();
        if (this.f10301d == null) {
            Log.w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
            return false;
        }
        List<String> a5 = a(str, str2, str3);
        Map<String, String> c5 = com.efs.sdk.base.core.config.a.c.a().c();
        for (String str4 : a5) {
            if (Math.abs(System.currentTimeMillis() - this.f10301d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j4) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = str;
                obtain.arg1 = Long.valueOf(j4).intValue();
                sendMessage(obtain);
            }
            long a6 = a(c5, str, str4);
            long j6 = this.f10301d.getLong(str4, 0L);
            if (j6 + j5 > a6) {
                Log.i("efs.flow", "flow limit, key: " + str4 + ", max: " + a6 + ", now: " + j6 + ", size: " + j5);
                a(str4);
                return false;
            }
        }
        return true;
    }

    private void a(String str) {
        com.efs.sdk.base.core.f.f fVar;
        com.efs.sdk.base.core.f.f fVar2;
        if (!this.f10300c.containsKey(str) || this.f10300c.get(str) == null || this.f10300c.get(str).get() <= 10) {
            fVar = f.a.f10411a;
            fVar.a(com.efs.sdk.base.core.config.a.c.a().f10353d.f10341a, str);
            if (str.equals("flow_day")) {
                fVar2 = f.a.f10411a;
                fVar2.a(com.efs.sdk.base.core.config.a.c.a().f10353d.f10341a);
            }
            if (!this.f10300c.containsKey(str)) {
                this.f10300c.put(str, new AtomicInteger());
            }
            this.f10300c.get(str).incrementAndGet();
        }
    }

    private static long a(Map<String, String> map, @NonNull String str, @NonNull String str2) {
        long longValue = f10299b.get(str).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty(map.get(str2))) {
            return longValue;
        }
        try {
            return Long.parseLong(map.get(str2));
        } catch (Throwable th) {
            Log.w("efs.flow", "get max flow error", th);
            return longValue;
        }
    }

    private static List<String> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str + "_" + str2);
        }
        if (!TextUtils.isEmpty(str3) && !"unknown".equalsIgnoreCase(str3)) {
            arrayList.add(str + "_" + str3);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            arrayList.add(str + "_" + str2 + "_" + str3);
        }
        return arrayList;
    }
}
