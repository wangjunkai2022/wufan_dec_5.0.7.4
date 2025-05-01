package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.MApplication;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.service.CommonService_;
import java.util.Map;
/* compiled from: BaseRewardVideo.java */
/* loaded from: classes.dex */
public abstract class d extends t {

    /* renamed from: l  reason: collision with root package name */
    protected static boolean f39676l;

    /* renamed from: a  reason: collision with root package name */
    protected Context f39677a;

    /* renamed from: b  reason: collision with root package name */
    protected String f39678b;

    /* renamed from: c  reason: collision with root package name */
    protected String f39679c;

    /* renamed from: d  reason: collision with root package name */
    protected String f39680d;

    /* renamed from: e  reason: collision with root package name */
    protected Activity f39681e;

    /* renamed from: f  reason: collision with root package name */
    protected String f39682f;

    /* renamed from: g  reason: collision with root package name */
    protected int f39683g;

    /* renamed from: h  reason: collision with root package name */
    protected int f39684h;

    /* renamed from: i  reason: collision with root package name */
    protected long f39685i = 0;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f39686j = false;

    /* renamed from: k  reason: collision with root package name */
    protected Map<String, Object> f39687k;

    static {
        f39676l = com.join.android.app.common.http.c.f14632c;
    }

    public d(String str, Context context, String str2, String str3) {
        this.f39680d = str + "RewardVideo";
        this.f39677a = context;
        this.f39678b = str2;
        this.f39679c = str3;
    }

    public static void i(Context context, int i4) {
        if (context != null) {
            if (i4 == 2) {
                MApplication.f1497x.G(true);
            }
            Intent intent = new Intent();
            intent.setAction("com.emu.ad.result");
            intent.putExtra("adAction", i4);
            context.sendBroadcast(intent);
        }
    }

    public static void j(Context context, int i4, Map<String, Object> map) {
        if (context != null) {
            Intent intent = new Intent();
            intent.setAction("com.emu.ad.result");
            intent.putExtra("adAction", i4);
            intent.putExtra(MGMainActivity.KEY_EXTRAS, JsonMapper.toJsonString(map));
            context.sendBroadcast(intent);
        }
    }

    public static void k(Context context, int i4, String str) {
        if (context != null) {
            Intent intent = new Intent();
            intent.setAction("com.join.android.app.mgsim.wufun.ad.result");
            intent.putExtra("adAction", i4);
            intent.putExtra("gameId", str);
            context.sendBroadcast(intent);
        }
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void a(String str, int i4, int i5) {
        super.a(str, i4, i5);
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void b(boolean z4) {
        Activity activity;
        super.b(z4);
        Activity activity2 = this.f39681e;
        if (activity2 == null || activity2.isFinishing()) {
            this.f39681e = MApplication.f1497x.getActivity();
        }
        if (!z4 || (activity = this.f39681e) == null || activity.isFinishing()) {
            return;
        }
        t(this.f39681e, this.f39682f, this.f39683g, this.f39684h, this.f39687k);
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void c(String str) {
        super.c(str);
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void d(String str, int i4, int i5, Map<String, Object> map) {
        super.d(str, i4, i5, map);
    }

    public abstract void e();

    protected boolean f() {
        return false;
    }

    public void g() {
        h(false);
    }

    public abstract void h(boolean z4);

    public void l(String str, String str2) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        intent.putExtra(CommonService_.b0.f54290b, str);
        intent.putExtra("gameId", str2);
        this.f39677a.sendBroadcast(intent);
    }

    public void m(Map<String, Object> map) {
        this.f39687k = map;
    }

    public void n(String str) {
        this.f39682f = str;
    }

    public void o(int i4) {
        this.f39683g = i4;
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onADClick() {
        super.onADClick();
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onADClose() {
        super.onADClose();
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onADExpose() {
        super.onADExpose();
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onADShow() {
        super.onADShow();
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onError(int i4, String str) {
        super.onError(i4, str);
        if (f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onError:");
            sb.append(str);
        }
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onInitSuccess() {
        super.onInitSuccess();
        if (f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onInitSuccess appID:[");
            sb.append(this.f39678b);
            sb.append("],posID:[");
            sb.append(this.f39679c);
            sb.append("]");
        }
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onReward(Map<String, Object> map) {
        super.onReward(map);
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onVideoCached() {
        super.onVideoCached();
    }

    @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
    public void onVideoComplete() {
        super.onVideoComplete();
    }

    public void p(int i4) {
        this.f39684h = i4;
    }

    public void q(Activity activity) {
        r(activity, "");
    }

    public void r(Activity activity, String str) {
        s(activity, str, 0, 0);
    }

    public void s(Activity activity, String str, int i4, int i5) {
        t(activity, str, i4, i5, null);
    }

    public void t(Activity activity, String str, int i4, int i5, Map<String, Object> map) {
        this.f39682f = str;
        this.f39684h = i5;
        this.f39683g = i4;
        this.f39687k = map;
        this.f39681e = activity;
        if (com.join.android.app.common.utils.j.j(activity)) {
            if (f()) {
                u(this.f39681e);
                return;
            } else if (Math.abs(System.currentTimeMillis() - this.f39685i) < 2000) {
                this.f39685i = System.currentTimeMillis();
                onError(-1, "视频加载中,请稍候...");
                return;
            } else {
                this.f39685i = System.currentTimeMillis();
                h(true);
                return;
            }
        }
        l2.a(activity).b("网络异常，请联网重试");
        onError(-1, "网络异常，请联网重试");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u(Activity activity) {
    }
}
