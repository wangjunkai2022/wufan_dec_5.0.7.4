package com.efs.sdk.base.core.config.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.join.mgps.dto.Constant;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class c implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static final Random f10350a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public IConfigRefreshAction f10351b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10352c;

    /* renamed from: d  reason: collision with root package name */
    public b f10353d;

    /* renamed from: e  reason: collision with root package name */
    public Map<IConfigCallback, String[]> f10354e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f10355f;

    /* renamed from: g  reason: collision with root package name */
    private e f10356g;

    /* renamed from: h  reason: collision with root package name */
    private long f10357h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f10359a = new c((byte) 0);
    }

    /* synthetic */ c(byte b5) {
        this();
    }

    private void e() {
        f fVar;
        fVar = f.a.f10320a;
        if (!fVar.a()) {
            Log.i("efs.config", "has no permission to refresh config from remote");
        } else if (!this.f10352c) {
            Log.i("efs.config", "disable refresh config from remote");
        } else {
            String refresh = g().refresh();
            Log.i("efs.config", "from server. efs config is ".concat(String.valueOf(refresh)));
            if (TextUtils.isEmpty(refresh)) {
                return;
            }
            a(refresh);
        }
    }

    private void f() {
        boolean z4;
        try {
            z4 = this.f10356g.a(this.f10353d);
        } catch (Throwable unused) {
            z4 = false;
        }
        if (z4) {
            return;
        }
        this.f10355f.sendEmptyMessageDelayed(3, 3000L);
    }

    @NonNull
    private IConfigRefreshAction g() {
        IConfigRefreshAction iConfigRefreshAction = this.f10351b;
        return iConfigRefreshAction == null ? com.efs.sdk.base.core.config.a.a.a() : iConfigRefreshAction;
    }

    private boolean h() {
        e.b();
        long j4 = 0;
        try {
            e eVar = this.f10356g;
            eVar.c();
            if (eVar.f10361a != null) {
                j4 = eVar.f10361a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        return System.currentTimeMillis() - j4 >= (this.f10353d.f10345e * 60) * 1000;
    }

    private void i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : ControllerCenter.getGlobalEnvStruct().getCallback(1)) {
                Message obtain = Message.obtain(null, 1, new JSONObject(this.f10353d.f10347g).toString());
                Message obtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(obtain, obtain2));
                obtain.recycle();
                obtain2.recycle();
            }
            for (IEfsReporterObserver iEfsReporterObserver : ControllerCenter.getGlobalEnvStruct().getEfsReporterObservers()) {
                iEfsReporterObserver.onConfigChange();
            }
        } catch (Throwable th) {
            Log.e("efs.config", th);
        }
    }

    public final Map<String, String> c() {
        return new HashMap(this.f10353d.f10347g);
    }

    public final void d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.core.config.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : c.this.f10354e.keySet()) {
                        String[] strArr = (String[]) c.this.f10354e.get(iConfigCallback);
                        HashMap hashMap = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (c.this.f10353d.f10347g.containsKey(str)) {
                                    hashMap.put(str, c.this.c().get(str));
                                    Log.i("efs.config", "--->>> configCallback key is " + str + " ## value is " + c.this.c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    c.this.f10354e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        b bVar;
        f fVar;
        int i4 = message.what;
        if (i4 == 0) {
            boolean a5 = e.a();
            Log.i("efs.config", "delete old config is ".concat(String.valueOf(a5)));
            if (a5) {
                this.f10355f.sendEmptyMessage(1);
            } else {
                e eVar = this.f10356g;
                eVar.c();
                if (eVar.f10361a == null) {
                    bVar = null;
                } else {
                    b a6 = b.a();
                    a6.f10341a = eVar.f10361a.getInt("cver", -1);
                    Set<String> keySet = eVar.f10361a.getAll().keySet();
                    HashMap hashMap = new HashMap();
                    for (String str : keySet) {
                        String string = eVar.f10361a.getString(str, "");
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str, string);
                        }
                    }
                    a6.a(hashMap);
                    a6.a(eVar.f10361a.getString(Constant.MD5, ""));
                    bVar = a6;
                }
                if (bVar == null) {
                    Log.i("efs.config", "first load local config false.");
                } else if (a(bVar)) {
                    Log.i("efs.config", "current config to same.");
                } else {
                    this.f10353d = bVar;
                    String str2 = "load config from storage";
                    if (-1 != bVar.f10341a) {
                        i();
                        d();
                        str2 = "load config from storage and notify observer";
                    }
                    Log.i("efs.config", str2);
                }
            }
        } else if (i4 == 1) {
            int i5 = message.arg1;
            if (i5 <= this.f10353d.f10341a) {
                Log.i("efs.config", "current config version is " + i5 + ", no need to refresh");
                Log.i("efs.config", "current config version(" + this.f10353d.f10341a + ") is " + i5 + ", no need to refresh");
            } else {
                e();
            }
        } else if (i4 == 2) {
            try {
                fVar = f.a.f10320a;
                if (fVar.a()) {
                    if (!h()) {
                        Log.i("efs.config", "No update is required, less than 8h since the last update");
                    } else {
                        e();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (i4 == 3) {
            f();
        }
        return true;
    }

    private c() {
        this.f10352c = true;
        this.f10354e = new HashMap();
        this.f10355f = new Handler(com.efs.sdk.base.core.util.concurrent.a.f10436a.getLooper(), this);
        this.f10356g = new e();
        this.f10353d = b.a();
        this.f10357h = ControllerCenter.getGlobalEnvStruct().configRefreshDelayMills;
    }

    public static c a() {
        return a.f10359a;
    }

    public final void b() {
        this.f10355f.sendEmptyMessage(0);
        this.f10355f.sendEmptyMessageDelayed(2, this.f10357h);
    }

    public final void a(int i4) {
        if (i4 <= this.f10353d.f10341a) {
            Log.i("efs.config", "current config version is " + i4 + ", no need to refresh");
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i4;
        obtain.what = 1;
        this.f10355f.sendMessage(obtain);
    }

    public final String a(boolean z4) {
        if (z4) {
            return "https://" + this.f10353d.f10344d;
        }
        return this.f10353d.f10343c + this.f10353d.f10344d;
    }

    public final void a(String str) {
        b a5 = b.a();
        if (d.a(str, a5)) {
            if (a(a5)) {
                return;
            }
            this.f10353d = a5;
            f();
            i();
            d();
            return;
        }
        this.f10355f.sendEmptyMessageDelayed(1, 3000L);
    }

    private boolean a(b bVar) {
        if (this.f10353d.f10341a >= bVar.f10341a) {
            return true;
        }
        Log.i("efs.config", "current config version (" + this.f10353d.f10341a + ") is older than another (" + bVar.f10341a + ")");
        return false;
    }
}
