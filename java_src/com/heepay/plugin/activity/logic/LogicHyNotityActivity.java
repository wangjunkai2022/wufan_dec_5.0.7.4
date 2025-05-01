package com.heepay.plugin.activity.logic;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.common.util.f;
import com.heepay.plugin.activity.HyNotityActivity;
import com.heepay.plugin.c.c;
import com.heepay.plugin.c.d;
import com.heepay.plugin.c.e;
import com.heepay.plugin.c.h;
import com.heepay.plugin.c.i;
import com.heepay.plugin.domain.b;
import com.join.mgps.dto.Constant;
import com.umeng.analytics.pro.q;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes3.dex */
public abstract class LogicHyNotityActivity extends Activity {

    /* renamed from: o  reason: collision with root package name */
    protected static final Integer f14334o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected static final Integer f14335p = 1;

    /* renamed from: q  reason: collision with root package name */
    protected static final Integer f14336q = 2;

    /* renamed from: r  reason: collision with root package name */
    protected static final Integer f14337r = 3;

    /* renamed from: s  reason: collision with root package name */
    protected static final Integer f14338s = 4;

    /* renamed from: t  reason: collision with root package name */
    protected static final Integer f14339t = 5;

    /* renamed from: a  reason: collision with root package name */
    protected String f14340a;

    /* renamed from: b  reason: collision with root package name */
    protected int f14341b;

    /* renamed from: c  reason: collision with root package name */
    protected String f14342c;

    /* renamed from: d  reason: collision with root package name */
    protected String f14343d;

    /* renamed from: e  reason: collision with root package name */
    protected com.heepay.plugin.b.a f14344e;

    /* renamed from: f  reason: collision with root package name */
    public String f14345f;

    /* renamed from: g  reason: collision with root package name */
    public ProgressDialog f14346g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f14347h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14349j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14350k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14351l;

    /* renamed from: m  reason: collision with root package name */
    protected Timer f14352m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14353n;

    /* renamed from: u  reason: collision with root package name */
    protected WebView f14354u;

    /* renamed from: v  reason: collision with root package name */
    protected a f14355v;

    /* renamed from: i  reason: collision with root package name */
    protected int f14348i = 0;

    /* renamed from: w  reason: collision with root package name */
    protected DialogInterface.OnCancelListener f14356w = new DialogInterface.OnCancelListener() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.6
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
            LogicHyNotityActivity.this.f14347h = true;
        }
    };

    /* loaded from: classes3.dex */
    protected class a extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<LogicHyNotityActivity> f14366b;

        public a(LogicHyNotityActivity logicHyNotityActivity) {
            this.f14366b = new WeakReference<>(logicHyNotityActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            LogicHyNotityActivity logicHyNotityActivity;
            LogicHyNotityActivity logicHyNotityActivity2;
            String str2;
            LogicHyNotityActivity logicHyNotityActivity3;
            String str3;
            LogicHyNotityActivity logicHyNotityActivity4;
            String str4;
            String str5 = "Token校验错误";
            String str6 = "Token校验失败";
            super.handleMessage(message);
            final LogicHyNotityActivity logicHyNotityActivity5 = this.f14366b.get();
            if (logicHyNotityActivity5 == null) {
                return;
            }
            try {
                int i4 = message.what;
                try {
                    if (i4 == 4120) {
                        LogicHyNotityActivity.this.h();
                        i.a().a(logicHyNotityActivity5, "连接服务器出错");
                        LogicHyNotityActivity.this.a("调用QueryPayStatus异常");
                        return;
                    }
                    if (i4 != 4121) {
                        try {
                            if (i4 != 4128) {
                                if (i4 != 4129) {
                                    switch (i4) {
                                        case 4097:
                                            d.a("----->", "版本信息获取成功");
                                            if (LogicHyNotityActivity.this.f14340a.startsWith(f.f10923a)) {
                                                LogicHyNotityActivity.this.h();
                                                return;
                                            } else {
                                                LogicHyNotityActivity.this.e();
                                                return;
                                            }
                                        case 4098:
                                            d.a("----->", "版本信息获取失败");
                                            LogicHyNotityActivity.this.h();
                                            Object obj = message.obj;
                                            if (obj == null || TextUtils.isEmpty(obj.toString())) {
                                                i.a().a(logicHyNotityActivity5, "版本信息获取失败");
                                            } else {
                                                i.a().a(logicHyNotityActivity5, message.obj.toString());
                                            }
                                            logicHyNotityActivity2 = LogicHyNotityActivity.this;
                                            str2 = "调用GetVersionInfo()失败";
                                            break;
                                        case 4099:
                                            LogicHyNotityActivity.this.h();
                                            i.a().a(logicHyNotityActivity5, "版本信息获取错误");
                                            LogicHyNotityActivity.this.a("调用GetVersionInfo()异常");
                                            d.a("----->", "版本信息获取错误");
                                            return;
                                        default:
                                            try {
                                                switch (i4) {
                                                    case q.a.f63892e /* 4101 */:
                                                        try {
                                                            d.a("----->", "调用SubmitPay成功");
                                                            com.heepay.plugin.domain.d dVar = (com.heepay.plugin.domain.d) message.obj;
                                                            int b5 = dVar.b();
                                                            final String a5 = dVar.a();
                                                            c.a("---->payType:" + b5);
                                                            c.a("---->param1:" + a5);
                                                            d.a("----->", "param1" + a5);
                                                            if (b5 == 22) {
                                                                if (!a5.startsWith("ali_payqr:".replace("_", "")) && !a5.startsWith("ali_pays:".replace("_", ""))) {
                                                                    if (!a5.startsWith(f.f10923a) && !a5.startsWith("https")) {
                                                                        LogicHyNotityActivity.this.h();
                                                                        LogicHyNotityActivity logicHyNotityActivity6 = LogicHyNotityActivity.this;
                                                                        logicHyNotityActivity6.f14349j = false;
                                                                        logicHyNotityActivity6.f14351l = true;
                                                                        h.a(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.a.3
                                                                            @Override // java.lang.Runnable
                                                                            public void run() {
                                                                                try {
                                                                                    Class<?> cls = Class.forName("com.alipay.sdk.app.PayTask");
                                                                                    Object[] objArr = {logicHyNotityActivity5};
                                                                                    a.this.sendMessage(e.a((int) Constant.RESULTCODE, (String) cls.getDeclaredMethod("pay", String.class, Boolean.TYPE).invoke(cls.getConstructor(Activity.class).newInstance(objArr), a5, Boolean.TRUE)));
                                                                                } catch (ClassNotFoundException unused) {
                                                                                    a.this.sendMessage(e.a(4121, "请检查商户端插件是否完整"));
                                                                                } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
                                                                                    a.this.sendMessage(e.a(4121, "异常调用"));
                                                                                }
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                    LogicHyNotityActivity.this.f14352m = new Timer();
                                                                    LogicHyNotityActivity.this.f14352m.schedule(new TimerTask() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.a.2
                                                                        @Override // java.util.TimerTask, java.lang.Runnable
                                                                        public void run() {
                                                                            LogicHyNotityActivity.this.runOnUiThread(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.a.2.1
                                                                                @Override // java.lang.Runnable
                                                                                public void run() {
                                                                                    WebView webView = LogicHyNotityActivity.this.f14354u;
                                                                                    if (webView == null || webView.getVisibility() != 8) {
                                                                                        return;
                                                                                    }
                                                                                    LogicHyNotityActivity.this.f14354u.setVisibility(0);
                                                                                    LogicHyNotityActivity.this.h();
                                                                                }
                                                                            });
                                                                        }
                                                                    }, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
                                                                    LogicHyNotityActivity.this.f14354u.loadUrl(a5);
                                                                    logicHyNotityActivity3 = LogicHyNotityActivity.this;
                                                                    logicHyNotityActivity3.f14349j = false;
                                                                }
                                                                LogicHyNotityActivity.this.h();
                                                                LogicHyNotityActivity logicHyNotityActivity7 = LogicHyNotityActivity.this;
                                                                logicHyNotityActivity7.f14349j = true;
                                                                logicHyNotityActivity7.f14351l = false;
                                                                logicHyNotityActivity7.b(a5);
                                                                return;
                                                            } else if (b5 != 30) {
                                                                d.a("----->支付类型有误", "----");
                                                                return;
                                                            } else if (a5.startsWith("wei_xin:".replace("_", ""))) {
                                                                LogicHyNotityActivity.this.h();
                                                                LogicHyNotityActivity logicHyNotityActivity8 = LogicHyNotityActivity.this;
                                                                logicHyNotityActivity8.f14349j = true;
                                                                logicHyNotityActivity8.f14351l = false;
                                                                logicHyNotityActivity8.b(a5);
                                                                return;
                                                            } else {
                                                                if (!a5.startsWith(f.f10923a) && !a5.startsWith("https")) {
                                                                    LogicHyNotityActivity.this.h();
                                                                    i.a().a(logicHyNotityActivity5, "支付遇到未知错误，请重新发起支付");
                                                                    logicHyNotityActivity2 = LogicHyNotityActivity.this;
                                                                    str2 = "微信支付发起参数错误";
                                                                    break;
                                                                }
                                                                d.a("----->进入中信跳转页面", "----1");
                                                                LogicHyNotityActivity.this.f14352m = new Timer();
                                                                LogicHyNotityActivity.this.f14352m.schedule(new TimerTask() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.a.1
                                                                    @Override // java.util.TimerTask, java.lang.Runnable
                                                                    public void run() {
                                                                        LogicHyNotityActivity.this.runOnUiThread(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.a.1.1
                                                                            @Override // java.lang.Runnable
                                                                            public void run() {
                                                                                d.a("----->进入中信跳转页面", "----2");
                                                                                WebView webView = LogicHyNotityActivity.this.f14354u;
                                                                                if (webView == null || webView.getVisibility() != 8) {
                                                                                    return;
                                                                                }
                                                                                LogicHyNotityActivity.this.f14354u.setVisibility(0);
                                                                                d.a("----->进入中信跳转页面", "----3");
                                                                                LogicHyNotityActivity.this.h();
                                                                            }
                                                                        });
                                                                    }
                                                                }, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
                                                                d.a("----->进入中信跳转页面", "----4");
                                                                LogicHyNotityActivity logicHyNotityActivity9 = LogicHyNotityActivity.this;
                                                                logicHyNotityActivity9.f14353n = true;
                                                                logicHyNotityActivity9.f14354u.loadUrl(a5);
                                                                logicHyNotityActivity3 = LogicHyNotityActivity.this;
                                                                logicHyNotityActivity3.f14349j = false;
                                                            }
                                                            logicHyNotityActivity3.f14351l = false;
                                                            return;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            str5 = "支付遇到未知错误，请重新发起支付";
                                                            str6 = "-2";
                                                            c.b("---->", ":" + e.getMessage());
                                                            LogicHyNotityActivity.this.a(str6, str5);
                                                            e.printStackTrace();
                                                            return;
                                                        }
                                                    case q.a.f63893f /* 4102 */:
                                                        d.a("----->", "调用SubmitPay失败");
                                                        LogicHyNotityActivity.this.h();
                                                        Object obj2 = message.obj;
                                                        if (obj2 == null || TextUtils.isEmpty(obj2.toString())) {
                                                            i.a().a(logicHyNotityActivity5, "系统维护中,请稍后重试");
                                                        } else {
                                                            i.a().a(logicHyNotityActivity5, message.obj.toString());
                                                        }
                                                        LogicHyNotityActivity.this.a("调用SubmitPay失败");
                                                        return;
                                                    case q.a.f63894g /* 4103 */:
                                                        LogicHyNotityActivity.this.h();
                                                        if ("1".equals((String) message.obj)) {
                                                            c.b("--->", "QUERRY_STATUS_SUCCESS_01");
                                                            LogicHyNotityActivity.this.a("1", "支付成功");
                                                            return;
                                                        }
                                                        return;
                                                    case q.a.f63895h /* 4104 */:
                                                        LogicHyNotityActivity.this.h();
                                                        String str7 = (String) message.obj;
                                                        if ("0".equals(str7)) {
                                                            c.b("--->", "QUERRY_STATUS_SUCCESS_02");
                                                            LogicHyNotityActivity.this.a("0", "支付取消");
                                                            return;
                                                        } else if ("-1".equals(str7)) {
                                                            LogicHyNotityActivity.this.a("-1", "支付失败");
                                                            c.b("--->", "QUERRY_STATUS_SUCCESS_03");
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    default:
                                                        switch (i4) {
                                                            case 4113:
                                                                str3 = "失败";
                                                                c.b("---上报日志", str3);
                                                                return;
                                                            case 4114:
                                                                str3 = "成功";
                                                                c.b("---上报日志", str3);
                                                                return;
                                                            case 4115:
                                                                d.a("----->", "Token校验成功");
                                                                LogicHyNotityActivity.this.c();
                                                                return;
                                                            case 4116:
                                                                d.a("----->", "Token校验失败");
                                                                LogicHyNotityActivity.this.h();
                                                                Object obj3 = message.obj;
                                                                if (obj3 == null || TextUtils.isEmpty(obj3.toString())) {
                                                                    i.a().a(logicHyNotityActivity5, "Token校验失败");
                                                                } else {
                                                                    i.a().a(logicHyNotityActivity5, message.obj.toString());
                                                                }
                                                                logicHyNotityActivity4 = LogicHyNotityActivity.this;
                                                                str4 = "调用CheckPayTokenID失败";
                                                                logicHyNotityActivity4.a(str4);
                                                                return;
                                                            case 4117:
                                                                d.a("----->", "Token校验错误");
                                                                LogicHyNotityActivity.this.h();
                                                                i.a().a(logicHyNotityActivity5, "Token校验错误");
                                                                logicHyNotityActivity4 = LogicHyNotityActivity.this;
                                                                str4 = "调用CheckPayTokenID异常";
                                                                logicHyNotityActivity4.a(str4);
                                                                return;
                                                            case 4118:
                                                                d.a("----->", "调用SubmitPay错误");
                                                                LogicHyNotityActivity.this.h();
                                                                Object obj4 = message.obj;
                                                                if (obj4 != null && !TextUtils.isEmpty(obj4.toString()) && message.obj.toString().contains("连接服务器出错")) {
                                                                    i.a().a(logicHyNotityActivity5, "连接服务器出错");
                                                                }
                                                                logicHyNotityActivity4 = LogicHyNotityActivity.this;
                                                                str4 = "调用SubmitPay异常";
                                                                logicHyNotityActivity4.a(str4);
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                            } catch (Exception e6) {
                                                e = e6;
                                                str6 = "-2";
                                                str5 = "支付遇到未知错误，请重新发起支付";
                                                c.b("---->", ":" + e.getMessage());
                                                LogicHyNotityActivity.this.a(str6, str5);
                                                e.printStackTrace();
                                                return;
                                            }
                                    }
                                } else {
                                    WebView webView = LogicHyNotityActivity.this.f14354u;
                                    if (webView != null && webView.canGoBack()) {
                                        LogicHyNotityActivity.this.f14354u.goBack();
                                        return;
                                    } else {
                                        logicHyNotityActivity2 = LogicHyNotityActivity.this;
                                        str2 = "TODO";
                                    }
                                }
                                logicHyNotityActivity2.a(str2);
                                return;
                            }
                            LogicHyNotityActivity logicHyNotityActivity10 = LogicHyNotityActivity.this;
                            logicHyNotityActivity10.a(logicHyNotityActivity10.c("支付宝APP唤起成功"), LogicHyNotityActivity.f14339t);
                            if (TextUtils.isEmpty(message.obj.toString())) {
                                logicHyNotityActivity = LogicHyNotityActivity.this;
                            } else {
                                String a6 = new b(message.obj.toString()).a();
                                if (TextUtils.equals(a6, "9000")) {
                                    LogicHyNotityActivity.this.a("1", "支付成功");
                                } else if (TextUtils.equals(a6, "8000")) {
                                    LogicHyNotityActivity.this.a("-3", "支付处理中");
                                } else if (TextUtils.equals(a6, "6001")) {
                                    LogicHyNotityActivity.this.a("0", "支付取消");
                                } else if (TextUtils.equals(a6, "6002")) {
                                    LogicHyNotityActivity.this.a("-2", "网络未连接，请检查网络设置");
                                    str = "支付宝原生";
                                } else {
                                    logicHyNotityActivity = LogicHyNotityActivity.this;
                                }
                                str = "支付宝原生";
                            }
                            logicHyNotityActivity.a("-1", "支付失败");
                            str = "支付宝原生";
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } else {
                        LogicHyNotityActivity.this.a("-2", "请检查商户端插件是否完整");
                        str = "支付宝-2";
                    }
                    c.b("--->", str);
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Exception e9) {
                e = e9;
                str5 = "支付遇到未知错误，请重新发起支付";
                str6 = "-2";
            }
        }
    }

    protected ProgressDialog a(Context context, String str, String str2) {
        f();
        ProgressDialog show = ProgressDialog.show(context, str, str2, false, true);
        this.f14346g = show;
        show.setProgressStyle(0);
        this.f14346g.setOnCancelListener(this.f14356w);
        this.f14346g.setCanceledOnTouchOutside(false);
        this.f14346g.setCancelable(false);
        return this.f14346g;
    }

    public void a(String str) {
        super.finish();
        c.a("onFinish is called:" + str);
    }

    protected void a(final String str, final Integer num) {
        c.a("-------------type1:" + num);
        h.a(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.heepay.plugin.domain.f a5 = LogicHyNotityActivity.this.f14344e.a(str, num.intValue());
                    if (a5.a()) {
                        a aVar = LogicHyNotityActivity.this.f14355v;
                        if (aVar != null) {
                            aVar.sendMessage(e.a(4113, a5));
                            return;
                        }
                        return;
                    }
                    a aVar2 = LogicHyNotityActivity.this.f14355v;
                    if (aVar2 != null) {
                        aVar2.sendMessage(e.b(4114, a5));
                    }
                } catch (Exception e5) {
                    a aVar3 = LogicHyNotityActivity.this.f14355v;
                    if (aVar3 != null) {
                        aVar3.sendMessage(e.a(4113, e5, "提交日志信息失败"));
                    }
                }
            }
        });
    }

    protected void a(String str, String str2) {
        c.b("--返回支付结果", "setCallBack：" + str + "，respMessage：" + str2);
        h();
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("respCode", str);
        bundle.putString("respMessage", str2);
        intent.putExtras(bundle);
        setResult(Constant.RESULTCODE, intent);
        a("setCallBack");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(String str, int i4, String str2, String str3) {
        boolean z4;
        if (TextUtils.isEmpty(str)) {
            i.a().a(this, "传入的TokenID参数为空");
            z4 = true;
        } else {
            z4 = false;
        }
        if (i4 == 0) {
            i.a().a(this, "传入的agentID为不合法");
            z4 = true;
        }
        if (TextUtils.isEmpty(str2)) {
            i.a().a(this, "传入的agentBillID参数为空");
            z4 = true;
        }
        if (TextUtils.isEmpty(str3)) {
            i.a().a(this, "传入的payType参数为空");
            return true;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        this.f14347h = false;
        h.a(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.1
            @Override // java.lang.Runnable
            public void run() {
                a aVar;
                try {
                    LogicHyNotityActivity logicHyNotityActivity = LogicHyNotityActivity.this;
                    com.heepay.plugin.domain.f a5 = logicHyNotityActivity.f14344e.a(logicHyNotityActivity.f14340a, logicHyNotityActivity.f14341b, logicHyNotityActivity.f14342c, true);
                    if (a5.a()) {
                        a aVar2 = LogicHyNotityActivity.this.f14355v;
                        if (aVar2 != null) {
                            aVar2.sendMessage(e.a((int) q.a.f63895h, String.valueOf(a5.d())));
                            return;
                        }
                        return;
                    }
                    LogicHyNotityActivity logicHyNotityActivity2 = LogicHyNotityActivity.this;
                    if (logicHyNotityActivity2.f14347h || (aVar = logicHyNotityActivity2.f14355v) == null) {
                        return;
                    }
                    aVar.sendMessage(e.a((int) q.a.f63894g, String.valueOf(a5.d())));
                } catch (Exception e5) {
                    a aVar3 = LogicHyNotityActivity.this.f14355v;
                    if (aVar3 != null) {
                        aVar3.sendMessage(e.a(4120, e5, "查询失败!"));
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "param2:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.heepay.plugin.c.c.a(r0)
            r0 = 1
            r1 = 0
            java.lang.String r2 = "intent"
            boolean r2 = r5.startsWith(r2)     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            if (r2 == 0) goto L2c
            android.content.Intent r5 = android.content.Intent.parseUri(r5, r0)     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            java.lang.String r2 = "android.intent.category.BROWSABLE"
            android.content.Intent r5 = r5.addCategory(r2)     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            r4.startActivity(r5)     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            goto L49
        L2c:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            r2.<init>(r3, r5)     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            r4.startActivity(r2)     // Catch: java.net.URISyntaxException -> L3b android.content.ActivityNotFoundException -> L40
            goto L49
        L3b:
            r5 = move-exception
            r5.printStackTrace()
            goto L48
        L40:
            java.lang.String r5 = "-2"
            java.lang.String r0 = "请检查是否安装客户端"
            r4.a(r5, r0)
        L48:
            r0 = 0
        L49:
            if (r0 == 0) goto L70
            java.lang.String r5 = r4.f14345f
            java.lang.String r0 = "22"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L62
            java.lang.String r5 = "支付宝APP唤起成功"
        L58:
            java.lang.String r5 = r4.c(r5)
            java.lang.Integer r0 = com.heepay.plugin.activity.logic.LogicHyNotityActivity.f14339t
            r4.a(r5, r0)
            goto L70
        L62:
            java.lang.String r5 = r4.f14345f
            java.lang.String r0 = "30"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L70
            java.lang.String r5 = "微信APP唤起成功"
            goto L58
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heepay.plugin.activity.logic.LogicHyNotityActivity.b(java.lang.String):void");
    }

    protected String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(token：" + this.f14343d + ")-(message：" + str + ")");
        c.b("上报信息", stringBuffer.toString());
        return stringBuffer.toString();
    }

    protected void c() {
        if (com.heepay.plugin.c.f.a().a(this)) {
            h.a(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    a aVar;
                    try {
                        LogicHyNotityActivity logicHyNotityActivity = LogicHyNotityActivity.this;
                        com.heepay.plugin.domain.f a5 = logicHyNotityActivity.f14344e.a(logicHyNotityActivity.f14340a, logicHyNotityActivity.f14341b, logicHyNotityActivity.f14342c, logicHyNotityActivity.f14345f, com.heepay.plugin.domain.e.a().g());
                        if (a5.a()) {
                            a aVar2 = LogicHyNotityActivity.this.f14355v;
                            if (aVar2 != null) {
                                aVar2.sendMessage(e.a((int) q.a.f63893f, a5.b()));
                                return;
                            }
                            return;
                        }
                        LogicHyNotityActivity logicHyNotityActivity2 = LogicHyNotityActivity.this;
                        if (logicHyNotityActivity2.f14347h || (aVar = logicHyNotityActivity2.f14355v) == null) {
                            return;
                        }
                        aVar.sendMessage(e.b(q.a.f63892e, a5));
                    } catch (Exception e5) {
                        a aVar3 = LogicHyNotityActivity.this.f14355v;
                        if (aVar3 != null) {
                            aVar3.sendMessage(e.a(4118, e5, "提交失败!"));
                        }
                    }
                }
            });
        } else {
            a("-2", "网络未连接，请检查网络设置");
        }
    }

    protected void d() {
        if (!com.heepay.plugin.c.f.a().a(this)) {
            a("-2", "网络未连接，请检查网络设置");
            return;
        }
        this.f14347h = false;
        this.f14346g = a(this, "", "正在启动支付...");
        h.a(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.heepay.plugin.domain.f d5 = LogicHyNotityActivity.this.f14344e.d();
                    if (d5.a()) {
                        a aVar = LogicHyNotityActivity.this.f14355v;
                        if (aVar != null) {
                            aVar.sendMessage(e.a(4098, d5.b()));
                            return;
                        }
                        return;
                    }
                    a aVar2 = LogicHyNotityActivity.this.f14355v;
                    if (aVar2 != null) {
                        aVar2.sendMessage(e.b(4097, d5));
                    }
                } catch (Exception e5) {
                    a aVar3 = LogicHyNotityActivity.this.f14355v;
                    if (aVar3 != null) {
                        aVar3.sendMessage(e.a(4099, e5, "版本信息获取错误!"));
                    }
                }
            }
        });
    }

    protected void e() {
        if (com.heepay.plugin.c.f.a().a(this)) {
            h.a(new Runnable() { // from class: com.heepay.plugin.activity.logic.LogicHyNotityActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LogicHyNotityActivity logicHyNotityActivity = LogicHyNotityActivity.this;
                        com.heepay.plugin.domain.f a5 = logicHyNotityActivity.f14344e.a(logicHyNotityActivity.f14340a, logicHyNotityActivity.f14341b, logicHyNotityActivity.f14342c, logicHyNotityActivity.f14345f);
                        if (a5.a()) {
                            a aVar = LogicHyNotityActivity.this.f14355v;
                            if (aVar != null) {
                                aVar.sendMessage(e.a(4116, a5.b()));
                                return;
                            }
                            return;
                        }
                        a aVar2 = LogicHyNotityActivity.this.f14355v;
                        if (aVar2 != null) {
                            aVar2.sendMessage(e.b(4115, a5));
                        }
                    } catch (Exception e5) {
                        a aVar3 = LogicHyNotityActivity.this.f14355v;
                        if (aVar3 != null) {
                            aVar3.sendMessage(e.a(4117, e5, "验证失败"));
                        }
                    }
                }
            });
        } else {
            a("-2", "网络未连接，请检查网络设置");
        }
    }

    protected void f() {
        int i4;
        if (getApplicationInfo().targetSdkVersion <= 26 || Build.VERSION.SDK_INT != 26) {
            Configuration configuration = getResources().getConfiguration();
            int i5 = configuration.orientation;
            if (i5 != 2) {
                if (i5 != 1) {
                    int i6 = configuration.hardKeyboardHidden;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return;
                        }
                        if (getApplicationInfo().targetSdkVersion == 27 && ((i4 = Build.VERSION.SDK_INT) == 26 || i4 == 27)) {
                            return;
                        }
                    }
                }
                setRequestedOrientation(1);
                return;
            }
            setRequestedOrientation(0);
        }
    }

    protected void g() {
        if (getApplicationInfo().targetSdkVersion <= 26 || Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(-1);
        }
    }

    public void h() {
        ProgressDialog progressDialog = this.f14346g;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f14346g.dismiss();
        this.f14346g = null;
        g();
    }

    public void i() {
        WebView webView = new WebView(this);
        this.f14354u = webView;
        webView.setBackgroundColor(getResources().getColor(17170443));
        this.f14354u.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebSettings settings = this.f14354u.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setUserAgentString(this.f14354u.getSettings().getUserAgentString() + com.heepay.plugin.c.a.a(" HyApp(H_e_e_paySDK/1) "));
        this.f14354u.setWebViewClient(new com.heepay.plugin.d.c((HyNotityActivity) this));
        this.f14354u.setWebChromeClient(new com.heepay.plugin.d.b("HPSDK", com.heepay.plugin.d.a.class));
        setContentView(this.f14354u);
        this.f14354u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        this.f14344e.a(this);
        d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f14350k) {
            a("closeable");
            return super.onKeyDown(i4, keyEvent);
        }
        WebView webView = this.f14354u;
        if (webView == null || !webView.canGoBack()) {
            a("onKeyDown");
            return super.onKeyDown(i4, keyEvent);
        }
        this.f14354u.goBack();
        return true;
    }
}
