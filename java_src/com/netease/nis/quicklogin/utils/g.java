package com.netease.nis.quicklogin.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.join.mgps.activity.CommentCreatActivity_;
import com.kuaishou.weapon.p0.t;
import com.netease.nis.basesdk.EncryptUtil;
import com.netease.nis.basesdk.HttpUtil;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.QuickLogin;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: UploadInfoHelper.java */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile g f57616c;

    /* renamed from: a  reason: collision with root package name */
    private final b f57617a = new b();

    /* renamed from: b  reason: collision with root package name */
    private Context f57618b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UploadInfoHelper.java */
    /* loaded from: classes5.dex */
    public class a implements HttpUtil.ResponseCallBack {
        a(g gVar) {
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            Logger.d("上传异常信息失败" + str);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            Logger.d("上传异常信息成功");
        }
    }

    /* compiled from: UploadInfoHelper.java */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f57619a;

        /* renamed from: b  reason: collision with root package name */
        private String f57620b;

        /* renamed from: c  reason: collision with root package name */
        private int f57621c;

        /* renamed from: d  reason: collision with root package name */
        private int f57622d;

        /* renamed from: e  reason: collision with root package name */
        private int f57623e;

        /* renamed from: f  reason: collision with root package name */
        private int f57624f;

        /* renamed from: g  reason: collision with root package name */
        private String f57625g;

        /* renamed from: h  reason: collision with root package name */
        private String f57626h;

        /* renamed from: i  reason: collision with root package name */
        private String f57627i;

        /* renamed from: j  reason: collision with root package name */
        private long f57628j;

        /* renamed from: k  reason: collision with root package name */
        private String f57629k;

        /* renamed from: l  reason: collision with root package name */
        private int f57630l;

        /* renamed from: m  reason: collision with root package name */
        private String f57631m;

        /* renamed from: o  reason: collision with root package name */
        private String f57633o;

        /* renamed from: p  reason: collision with root package name */
        private String f57634p;

        /* renamed from: q  reason: collision with root package name */
        private long f57635q;

        /* renamed from: r  reason: collision with root package name */
        private long f57636r;

        /* renamed from: n  reason: collision with root package name */
        private int f57632n = 1;

        /* renamed from: s  reason: collision with root package name */
        private boolean f57637s = false;

        public void a(String str) {
            this.f57619a = str;
        }

        public void b(int i4) {
            this.f57622d = i4;
        }

        public void c(int i4) {
            this.f57623e = i4;
        }

        public void d(String str) {
            this.f57626h = str;
        }

        public void e(String str) {
            this.f57625g = str;
        }

        public void f(String str) {
            this.f57634p = str;
        }

        public void g(String str) {
            this.f57633o = str;
        }

        public void h(String str) {
            this.f57629k = str;
        }

        public void i(String str) {
            this.f57620b = str;
        }

        public void a(c cVar) {
            if (!this.f57637s) {
                if (cVar == c.MONITOR_PRECHECK) {
                    this.f57621c = 1;
                } else if (cVar == c.MONITOR_GET_TOKEN) {
                    this.f57621c = 2;
                }
            } else if (cVar == c.MONITOR_PRECHECK) {
                this.f57621c = 4;
            } else if (cVar == c.MONITOR_GET_TOKEN) {
                this.f57621c = 5;
            }
            this.f57621c = 3;
        }

        public void b(String str) {
            this.f57627i = str;
        }

        public void c(String str) {
            this.f57631m = str;
        }

        public void d(int i4) {
            this.f57630l = i4;
        }

        public void b(long j4) {
            this.f57636r = j4;
        }

        public String b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("businessId", this.f57619a);
                jSONObject.put("token", this.f57620b);
                jSONObject.put("monitorType", this.f57621c);
                jSONObject.put("errorType", this.f57622d);
                jSONObject.put("httpCode", this.f57623e);
                jSONObject.put("code", this.f57624f);
                jSONObject.put("message", this.f57625g);
                jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f57626h);
                jSONObject.put("dns", this.f57627i);
                jSONObject.put("requestTime", this.f57628j);
                jSONObject.put("requestURL", this.f57629k);
                jSONObject.put("ot", this.f57630l);
                jSONObject.put("phone", this.f57631m);
                jSONObject.put("envType", this.f57632n);
                jSONObject.put(CommentCreatActivity_.K, this.f57633o);
                jSONObject.put("osInfo", this.f57634p);
                jSONObject.put("clientTime", this.f57635q);
                jSONObject.put("version", "3.2.5");
                Logger.d(jSONObject.toString());
                return jSONObject.toString();
            } catch (JSONException e5) {
                e5.printStackTrace();
                return null;
            }
        }

        public void a(int i4) {
            this.f57624f = i4;
        }

        public void a() {
            this.f57628j = System.currentTimeMillis() - this.f57636r;
        }

        public void a(long j4) {
            this.f57635q = j4;
        }

        public void a(boolean z4) {
            this.f57637s = z4;
        }
    }

    /* compiled from: UploadInfoHelper.java */
    /* loaded from: classes5.dex */
    public enum c {
        MONITOR_PRECHECK,
        MONITOR_GET_TOKEN,
        MONITOR_SDK_INTERNAL
    }

    private g() {
    }

    public static g c() {
        if (f57616c == null) {
            synchronized (g.class) {
                if (f57616c == null) {
                    f57616c = new g();
                }
            }
        }
        return f57616c;
    }

    public g a(Context context) {
        this.f57618b = context.getApplicationContext();
        return this;
    }

    public b b() {
        return this.f57617a;
    }

    public void d() {
        String str;
        if (QuickLogin.isAllowedUploadInfo) {
            String b5 = this.f57617a.b();
            if (TextUtils.isEmpty(b5)) {
                return;
            }
            String randomString = EncryptUtil.getRandomString(16);
            String randomString2 = EncryptUtil.getRandomString(12);
            try {
                str = com.netease.nis.quicklogin.utils.c.b(b5, randomString, randomString2);
            } catch (Exception e5) {
                Logger.e(e5.getMessage());
                str = "";
            }
            String RSAEncrypt = EncryptUtil.RSAEncrypt(randomString2 + randomString, QuickLogin.publicKey);
            HashMap hashMap = new HashMap();
            hashMap.put(t.f55701t, str);
            hashMap.put("rk", RSAEncrypt);
            hashMap.put("version", "3.2.5");
            HttpUtil.doPostRequestByForm("https://ye.dun.163yun.com/v2/collect", hashMap, null, new a(this));
        }
    }

    public void a(c cVar, int i4, String str, int i5, int i6, int i7, String str2, long j4) {
        a();
        this.f57617a.a(cVar);
        this.f57617a.b(i4);
        if (str != null) {
            this.f57617a.i(str);
        }
        if (i6 != 0) {
            this.f57617a.a(i6);
        }
        if (i7 != 0) {
            this.f57617a.c(i7);
        }
        this.f57617a.a();
        this.f57617a.d(i5);
        this.f57617a.e(str2);
        this.f57617a.a(j4);
    }

    private void a() {
        String b5 = com.netease.nis.quicklogin.utils.a.b(this.f57618b);
        String a5 = com.netease.nis.quicklogin.utils.a.a(this.f57618b);
        this.f57617a.d(b5);
        this.f57617a.b(a5);
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        this.f57617a.g(str);
        this.f57617a.f(str2);
    }
}
