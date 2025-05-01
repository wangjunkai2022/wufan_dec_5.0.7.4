package com.netease.nis.quicklogin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.kuaishou.weapon.p0.t;
import com.netease.nis.basesdk.EncryptUtil;
import com.netease.nis.basesdk.HttpUtil;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.a;
import com.netease.nis.quicklogin.entity.PreCheckEntity;
import com.netease.nis.quicklogin.helper.UnifyUiConfig;
import com.netease.nis.quicklogin.listener.QuickLoginListener;
import com.netease.nis.quicklogin.listener.QuickLoginPreMobileListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.utils.LoginUiHelper;
import com.netease.nis.quicklogin.utils.f;
import com.netease.nis.quicklogin.utils.g;
import com.sdk.Unicorn.base.api.ToolUtils;
import com.sdk.Unicorn.base.module.manager.SDKManager;
import com.umeng.umcrash.UMCrash;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class QuickLogin {
    public static boolean DEBUG = false;
    public static final String TAG = "QuickLogin";
    public static int fetchNumberTimeout = 5;
    public static boolean isAllowedUploadInfo = true;
    public static long prefetchDataStartTime = 0;
    public static int prefetchNumberTimeout = 8;
    public static final String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjZBIRMtccHrq2VXapzir50diR1uZrR/SHc/mHMvW7sCZ7Bw/VfJkgdYCaNyyLLiIuOGw/OxHiocw95qPayfiMJkkKSR+XUc5KKWQuFSHmw2LNmq9YPdVtsqAjAQ4Qe3XcN1WQnrSpLsLer0WFSI+h0riBnvR9y9kn25RlC/uCvEo0//4r340RgOC1XLr3OPE1Nxc4WbrTN8uEB0hZ6PtWAY0ZQ6X8G+EXecbWHIhgBi9LhKhsZmIx3u/O+z+Jqx54nGgNhxVawsHtUBblT/oUAJzO0NkvYU0zFZ2ses9VnXXo/QwoYqcwnLIcf7zrQg5nVLTNyVpPZAFNdF/WsYJLQIDAQAB";

    /* renamed from: a  reason: collision with root package name */
    private String f57386a;

    /* renamed from: b  reason: collision with root package name */
    private Context f57387b;

    /* renamed from: c  reason: collision with root package name */
    private com.netease.nis.quicklogin.a f57388c;

    /* renamed from: d  reason: collision with root package name */
    private String f57389d;

    /* renamed from: e  reason: collision with root package name */
    private int f57390e;

    /* renamed from: f  reason: collision with root package name */
    private String f57391f;

    /* renamed from: g  reason: collision with root package name */
    private String f57392g;

    /* renamed from: h  reason: collision with root package name */
    private String f57393h;

    /* renamed from: i  reason: collision with root package name */
    private String f57394i;

    /* renamed from: j  reason: collision with root package name */
    private JSONObject f57395j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57396k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f57397l;

    /* renamed from: m  reason: collision with root package name */
    private g f57398m;

    /* renamed from: n  reason: collision with root package name */
    private LoginUiHelper f57399n;

    /* renamed from: o  reason: collision with root package name */
    private UnifyUiConfig f57400o;

    /* renamed from: p  reason: collision with root package name */
    private long f57401p;

    /* loaded from: classes5.dex */
    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginPreMobileListener f57402a;

        a(QuickLoginPreMobileListener quickLoginPreMobileListener) {
            this.f57402a = quickLoginPreMobileListener;
        }

        @Override // com.netease.nis.quicklogin.QuickLogin.d
        public void a(com.netease.nis.quicklogin.a aVar) {
            QuickLogin.this.f57388c = aVar;
            QuickLogin.prefetchDataStartTime = System.currentTimeMillis();
            Logger.d("prefetchMobileNumber [startTime] " + QuickLogin.prefetchDataStartTime);
            QuickLogin.this.f57388c.a(QuickLogin.this.f57392g, this.f57402a);
        }
    }

    /* loaded from: classes5.dex */
    class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginTokenListener f57404a;

        b(QuickLoginTokenListener quickLoginTokenListener) {
            this.f57404a = quickLoginTokenListener;
        }

        @Override // com.netease.nis.quicklogin.QuickLogin.d
        public void a(com.netease.nis.quicklogin.a aVar) {
            QuickLogin.this.f57388c = aVar;
            QuickLogin.prefetchDataStartTime = System.currentTimeMillis();
            QuickLogin.this.f57388c.a(QuickLogin.this.f57391f, this.f57404a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements HttpUtil.ResponseCallBack {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f57406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QuickLoginListener f57407b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57408c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f57409d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f57410e;

        c(long j4, QuickLoginListener quickLoginListener, String str, String str2, d dVar) {
            this.f57406a = j4;
            this.f57407b = quickLoginListener;
            this.f57408c = str;
            this.f57409d = str2;
            this.f57410e = dVar;
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            QuickLogin.this.a(this.f57407b, str);
            Logger.e("preCheck [onError]" + str);
            QuickLogin quickLogin = QuickLogin.this;
            quickLogin.a(null, quickLogin.f57390e, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), i4, str);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            QuickLogin.this.f57401p = System.currentTimeMillis();
            Logger.d("preCheck [onSuccess] " + str);
            Logger.d("preCheck [time] " + (System.currentTimeMillis() - this.f57406a) + "ms");
            PreCheckEntity preCheckEntity = (PreCheckEntity) com.netease.nis.quicklogin.utils.a.a(str, PreCheckEntity.class);
            if (preCheckEntity == null || preCheckEntity.getCode() != 200) {
                QuickLogin.this.a(this.f57407b, str);
                QuickLogin quickLogin = QuickLogin.this;
                quickLogin.a(null, quickLogin.f57390e, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), preCheckEntity == null ? 0 : preCheckEntity.getCode(), str);
                return;
            }
            String data = preCheckEntity.getData();
            if (preCheckEntity.getExtData() == null || this.f57407b.onExtendMsg(preCheckEntity.getExtData())) {
                try {
                    String a5 = com.netease.nis.quicklogin.utils.c.a(data, this.f57408c, this.f57409d);
                    Logger.d("preCheck [real] " + a5);
                    PreCheckEntity.Data data2 = (PreCheckEntity.Data) com.netease.nis.quicklogin.utils.a.a(a5, PreCheckEntity.Data.class);
                    if (data2 == null) {
                        QuickLogin.this.a(this.f57407b, str);
                        QuickLogin quickLogin2 = QuickLogin.this;
                        quickLogin2.a(null, quickLogin2.f57390e, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), preCheckEntity.getCode(), str);
                        return;
                    }
                    QuickLogin.this.f57392g = data2.getToken();
                    QuickLogin.this.f57393h = data2.getAppId();
                    QuickLogin.this.f57394i = data2.getAppKey();
                    QuickLogin.this.f57391f = data2.getUrl();
                    int ot = data2.getOt();
                    if (ot >= 1 && ot <= 3) {
                        QuickLogin.this.f57390e = ot;
                    }
                    this.f57410e.a(QuickLogin.this.a());
                } catch (Exception e5) {
                    Logger.e(e5.getMessage());
                    QuickLogin.this.a(this.f57407b, e5.toString());
                    QuickLogin quickLogin3 = QuickLogin.this;
                    quickLogin3.a(null, quickLogin3.f57390e, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), preCheckEntity.getCode(), e5.toString());
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(com.netease.nis.quicklogin.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class e {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a  reason: collision with root package name */
        private static final QuickLogin f57412a = new QuickLogin(null);
    }

    /* synthetic */ QuickLogin(a aVar) {
        this();
    }

    public static QuickLogin getInstance() {
        return e.f57412a;
    }

    public int checkNetWork(Context context) {
        try {
            return com.netease.nis.quicklogin.utils.a.a(context, (QuickLoginListener) null);
        } catch (JSONException e5) {
            Logger.e(e5.getMessage());
            return 5;
        }
    }

    public void clearScripCache(Context context) {
        try {
            AuthnHelper.getInstance(context).delScrip();
            ToolUtils.clearCache(context);
            com.netease.nis.quicklogin.utils.e.a(context, "timeend", 0L);
        } catch (Exception e5) {
            e5.printStackTrace();
            Logger.e("clearScripCache Exception=" + e5);
        }
    }

    public int getOperatorType(Context context) {
        try {
            return com.netease.nis.quicklogin.utils.a.c(context);
        } catch (JSONException e5) {
            Logger.e(e5.getMessage());
            return 5;
        }
    }

    public String getSDKVersion() {
        return "3.2.5";
    }

    public void getToken(String str, @NonNull QuickLoginTokenListener quickLoginTokenListener) {
        try {
            if (!this.f57397l) {
                this.f57386a = "https://ye.dun.163yun.com/v1/preCheck";
            }
            this.f57396k = false;
            a(str, quickLoginTokenListener, new b(quickLoginTokenListener));
        } catch (Exception e5) {
            e5.printStackTrace();
            a(this.f57392g, 0, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, e5.toString());
        }
    }

    public void init(Context context, String str) {
        this.f57387b = context.getApplicationContext();
        this.f57389d = str;
        com.netease.nis.quicklogin.utils.b.c().a(this.f57389d, this.f57387b);
        this.f57399n = new LoginUiHelper(context);
        g a5 = g.c().a(this.f57387b);
        this.f57398m = a5;
        a5.b().a(this.f57389d);
        f.a().a(this.f57387b).a(this.f57389d);
    }

    public boolean isPreLoginResultValid() {
        return System.currentTimeMillis() - this.f57401p <= 102000;
    }

    public void onePass(@NonNull QuickLoginTokenListener quickLoginTokenListener) {
        try {
            if (this.f57388c == null) {
                Logger.e("预取号异常，请查看预取号对应的错误回调");
                return;
            }
            this.f57399n.a(this.f57400o, this.f57392g);
            this.f57399n.a(quickLoginTokenListener);
            this.f57388c.a(quickLoginTokenListener);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void prefetchMobileNumber(@NonNull QuickLoginPreMobileListener quickLoginPreMobileListener) {
        try {
            if (!this.f57397l) {
                this.f57386a = "https://ye.dun.163yun.com/v1/oneclick/preCheck";
            }
            this.f57396k = true;
            a((String) null, quickLoginPreMobileListener, new a(quickLoginPreMobileListener));
        } catch (Exception e5) {
            e5.printStackTrace();
            a(this.f57392g, 0, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, e5.toString());
        }
    }

    public void quitActivity() {
        LoginUiHelper loginUiHelper = this.f57399n;
        if (loginUiHelper != null) {
            loginUiHelper.b();
        }
    }

    public void removeCustomView(int i4, View view) {
        LoginUiHelper loginUiHelper = this.f57399n;
        if (loginUiHelper != null) {
            loginUiHelper.a(i4, view);
        }
    }

    public void setAllowedUploadInfo(boolean z4) {
        isAllowedUploadInfo = z4;
    }

    public void setDebugMode(boolean z4) {
        DEBUG = z4;
        Logger.setTag(TAG);
        Logger.enableLog(z4);
        SDKManager.setDebug(z4);
        com.cmic.sso.sdk.auth.c.setDebugMode(z4);
    }

    public void setExtendData(JSONObject jSONObject) {
        this.f57395j = jSONObject;
    }

    public void setFetchNumberTimeout(int i4) {
        fetchNumberTimeout = i4;
    }

    public void setLoadingVisibility(boolean z4) {
        LoginUiHelper loginUiHelper = this.f57399n;
        if (loginUiHelper != null) {
            loginUiHelper.a(z4);
        }
    }

    public void setPreCheckUrl(String str) {
        this.f57397l = true;
        this.f57386a = str;
    }

    public void setPrefetchNumberTimeout(int i4) {
        prefetchNumberTimeout = i4;
    }

    public void setPrivacyState(boolean z4) {
        LoginUiHelper loginUiHelper = this.f57399n;
        if (loginUiHelper != null) {
            loginUiHelper.b(z4);
        }
    }

    public void setUnifyUiConfig(UnifyUiConfig unifyUiConfig) {
        this.f57400o = unifyUiConfig;
    }

    private QuickLogin() {
        this.f57392g = null;
        this.f57395j = null;
        this.f57396k = false;
        this.f57397l = false;
    }

    private void a(String str, QuickLoginListener quickLoginListener, d dVar) throws JSONException {
        if (this.f57396k) {
            this.f57398m.b().a(true);
        }
        this.f57398m.b().b(System.currentTimeMillis());
        this.f57398m.b().c(str);
        this.f57398m.b().h(this.f57386a);
        this.f57390e = com.netease.nis.quicklogin.utils.a.a(this.f57387b, quickLoginListener);
        Logger.d("networkType:" + this.f57390e);
        int i4 = this.f57390e;
        if (i4 == 5) {
            a(null, 5, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, "无法判断网络类型");
            a(quickLoginListener, "无法判断网络类型");
        } else if (i4 == 4) {
            a(null, 4, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, "当前仅wifi联网");
            a(quickLoginListener, "当前仅wifi联网，请连接数据流量");
        } else if (!this.f57396k && (TextUtils.isEmpty(str) || str.length() != 11)) {
            a(quickLoginListener, "输入手机号不合法，请检查后重新输入");
        } else {
            String randomString = EncryptUtil.getRandomString(16);
            String randomString2 = EncryptUtil.getRandomString(12);
            com.netease.nis.quicklogin.b.a.f57425a = randomString;
            com.netease.nis.quicklogin.b.a.f57426b = randomString2;
            Map<String, String> a5 = a(str, randomString, randomString2, quickLoginListener);
            HashMap hashMap = new HashMap();
            hashMap.put("terminal", "1");
            hashMap.put("version", "3.2.5");
            hashMap.put("model", Build.MODEL);
            hashMap.put("osVersion", Build.VERSION.RELEASE);
            HttpUtil.doPostRequestByForm(this.f57386a, a5, hashMap, new c(System.currentTimeMillis(), quickLoginListener, randomString, randomString2, dVar));
        }
    }

    private Map<String, String> a(String str, String str2, String str3, QuickLoginListener quickLoginListener) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("businessId", this.f57389d);
        if (this.f57396k) {
            jSONObject.put("operatorType", this.f57390e);
        } else {
            jSONObject.put("phone", str);
        }
        jSONObject.put("envType", 1);
        jSONObject.put("nonce", EncryptUtil.getRandomString(32));
        jSONObject.put(UMCrash.SP_KEY_TIMESTAMP, System.currentTimeMillis());
        jSONObject.put("cacheType", 1);
        String str4 = null;
        try {
            str4 = com.netease.nis.quicklogin.utils.c.b(jSONObject.toString(), str2, str3);
        } catch (Exception e5) {
            Logger.e(e5.getMessage());
            a(quickLoginListener, e5.toString());
            a(null, this.f57390e, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, e5.toString());
        }
        String RSAEncrypt = EncryptUtil.RSAEncrypt(str3 + str2, publicKey);
        HashMap hashMap = new HashMap();
        hashMap.put(t.f55701t, str4);
        hashMap.put("rk", RSAEncrypt);
        hashMap.put("version", getSDKVersion());
        JSONObject jSONObject2 = this.f57395j;
        if (jSONObject2 != null) {
            hashMap.put("extData", jSONObject2.toString());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i4, int i5, int i6, String str2) {
        g.c().a(g.c.MONITOR_PRECHECK, i5, str, i4, i6, 0, str2, System.currentTimeMillis());
        g.c().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.netease.nis.quicklogin.a a() {
        boolean z4 = this.f57396k;
        if (z4 && (this.f57394i == null || this.f57393h == null)) {
            throw new RuntimeException("appKey,appId is not allowed to be null");
        }
        if (this.f57392g != null) {
            if (this.f57387b != null) {
                return new a.C0569a().a(z4).a(this.f57393h).b(this.f57394i).c(this.f57392g).a(this.f57390e).a(this.f57387b);
            }
            throw new RuntimeException("mContext is not allowed to be null");
        }
        throw new RuntimeException("YDToken is not allowed to be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(QuickLoginListener quickLoginListener, String str) {
        if (quickLoginListener instanceof QuickLoginPreMobileListener) {
            String str2 = this.f57392g;
            quickLoginListener.onGetMobileNumberError(str2 != null ? str2 : "易盾token为空", str);
        } else if (quickLoginListener instanceof QuickLoginTokenListener) {
            String str3 = this.f57392g;
            quickLoginListener.onGetTokenError(str3 != null ? str3 : "易盾token为空", str);
        }
    }
}
