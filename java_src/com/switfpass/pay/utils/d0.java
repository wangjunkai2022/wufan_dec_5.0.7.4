package com.switfpass.pay.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.MchBean;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
import com.switfpass.pay.lib.Resourcemap;
import com.tencent.mm.sdk.modelpay.PayReq;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import java.util.List;
/* loaded from: classes5.dex */
public class d0 extends Dialog {

    /* renamed from: w  reason: collision with root package name */
    private static String f61838w = MainApplication.f61503n;

    /* renamed from: b  reason: collision with root package name */
    private Activity f61839b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f61840c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f61841d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f61842e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f61843f;

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f61844g;

    /* renamed from: h  reason: collision with root package name */
    private RelativeLayout f61845h;

    /* renamed from: i  reason: collision with root package name */
    private RelativeLayout f61846i;

    /* renamed from: j  reason: collision with root package name */
    private RelativeLayout f61847j;

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout f61848k;

    /* renamed from: l  reason: collision with root package name */
    private g0 f61849l;

    /* renamed from: m  reason: collision with root package name */
    private RequestMsg f61850m;

    /* renamed from: n  reason: collision with root package name */
    private List f61851n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f61852o;

    /* renamed from: p  reason: collision with root package name */
    private IWXAPI f61853p;

    /* renamed from: q  reason: collision with root package name */
    private f0 f61854q;

    /* renamed from: r  reason: collision with root package name */
    private AlertDialog f61855r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f61856s;

    /* renamed from: t  reason: collision with root package name */
    protected ProgressDialog f61857t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f61858u;

    /* renamed from: v  reason: collision with root package name */
    Handler f61859v;

    public d0(Activity activity) {
        super(activity);
        this.f61856s = true;
        this.f61857t = null;
        this.f61858u = false;
        this.f61859v = new k1();
        this.f61839b = activity;
    }

    public d0(Activity activity, List list) {
        super(activity);
        this.f61856s = true;
        this.f61857t = null;
        this.f61858u = false;
        this.f61859v = new k1();
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(Resourcemap.getLayout_pay_dialog_check(), (ViewGroup) null);
        this.f61840c = viewGroup;
        setContentView(viewGroup);
        this.f61839b = activity;
        this.f61851n = list;
        w();
        this.f61846i.setOnClickListener(new q(this));
        this.f61841d.setOnClickListener(new s(this));
        this.f61842e.setOnClickListener(new t(this));
        this.f61844g.setOnClickListener(new u(this));
        this.f61845h.setOnClickListener(new v(this));
        this.f61843f.setOnClickListener(new z(this));
        this.f61847j.setOnClickListener(new b0(this));
        this.f61848k.setOnClickListener(new h0(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(d0 d0Var, OrderBena orderBena, RequestMsg requestMsg) {
        PayReq payReq = new PayReq();
        payReq.appId = requestMsg.b();
        payReq.prepayId = orderBena.o();
        payReq.partnerId = orderBena.m();
        payReq.nonceStr = orderBena.j();
        payReq.timeStamp = orderBena.u();
        payReq.packageValue = "Sign=WXPay";
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(d0Var.f61839b, requestMsg.b());
        d0Var.f61853p = createWXAPI;
        createWXAPI.registerApp(requestMsg.b());
        payReq.sign = orderBena.s();
        boolean z4 = d0Var.f61853p.getWXAppSupportAPI() >= 570425345;
        new StringBuilder("isPaySupported-->").append(z4);
        if (!d0Var.f61853p.openWXApp()) {
            Toast.makeText(d0Var.f61839b, "手机没有安装微信，请先安装微信", 0).show();
        } else if (z4) {
            d0Var.f61853p.sendReq(payReq);
        } else {
            Toast.makeText(d0Var.f61839b, "微信版本太低了，请升级后再使用", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(d0 d0Var, RequestMsg requestMsg) {
        d0Var.cancel();
        requestMsg.O("微信支付");
        d0Var.f61849l = new g0(d0Var.f61839b, "请稍候，正在请求微信", new a2(d0Var));
        com.switfpass.pay.service.d.d().b(requestMsg, new b(d0Var, requestMsg));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean f(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i4 = 0; i4 < installedPackages.size(); i4++) {
                if (installedPackages.get(i4).packageName.equals(com.alipay.sdk.util.j.f4963b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h(d0 d0Var, RequestMsg requestMsg) {
        d0Var.cancel();
        requestMsg.O("支付宝支付");
        d0Var.f61849l = new g0(d0Var.f61839b, "请稍候，正在请求支付宝", new f(d0Var));
        com.switfpass.pay.service.d.d().c(requestMsg, MainApplication.f61505p, new m(d0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean i(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i4 = 0; i4 < installedPackages.size(); i4++) {
                if (installedPackages.get(i4).packageName.equals("com.tencent.mm")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i4 = 0; i4 < installedPackages.size(); i4++) {
                if (installedPackages.get(i4).packageName.equals("com.tencent.mobileqq")) {
                    return true;
                }
            }
        }
        return false;
    }

    private void w() {
        RelativeLayout relativeLayout;
        this.f61848k = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getLayout_pay_wx_wap());
        this.f61847j = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getLayout_pay_qq_wap());
        this.f61852o = (TextView) this.f61840c.findViewById(Resourcemap.getLayout_dialog_prompt());
        this.f61841d = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getLayout_wx_scan());
        this.f61842e = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getLayout_qq_scan());
        this.f61843f = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getLayout_zfb_scan());
        this.f61844g = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getLayout_wx_app());
        this.f61845h = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getLayout_zfb_app());
        this.f61846i = (RelativeLayout) this.f61840c.findViewById(Resourcemap.getById_pay_scan());
        if (this.f61851n.isEmpty() || this.f61851n == null) {
            this.f61852o.setVisibility(0);
            return;
        }
        for (int i4 = 0; i4 < this.f61851n.size(); i4++) {
            String k4 = ((MchBean) this.f61851n.get(i4)).k();
            if (((MchBean) this.f61851n.get(i4)).k().equals(MainApplication.f61500k)) {
                relativeLayout = this.f61842e;
            } else if (((MchBean) this.f61851n.get(i4)).k().equals(MainApplication.f61501l)) {
                relativeLayout = this.f61841d;
            } else if (((MchBean) this.f61851n.get(i4)).k().equals(MainApplication.f61502m)) {
                relativeLayout = this.f61844g;
            } else if (((MchBean) this.f61851n.get(i4)).k().equalsIgnoreCase(MainApplication.f61503n) || ((MchBean) this.f61851n.get(i4)).k().equalsIgnoreCase(MainApplication.f61504o)) {
                f61838w = ((MchBean) this.f61851n.get(i4)).k();
                relativeLayout = this.f61843f;
            } else if (((MchBean) this.f61851n.get(i4)).k().equalsIgnoreCase(MainApplication.f61505p)) {
                relativeLayout = this.f61845h;
            } else if (((MchBean) this.f61851n.get(i4)).k().equalsIgnoreCase(MainApplication.f61510u)) {
                relativeLayout = this.f61847j;
            } else if (((MchBean) this.f61851n.get(i4)).k().equalsIgnoreCase(MainApplication.f61511v)) {
                relativeLayout = this.f61848k;
            } else if (k4.contains(MainApplication.f61507r) || k4.contains(MainApplication.f61506q) || k4.contains(MainApplication.f61509t) || k4.contains(MainApplication.f61508s)) {
                relativeLayout = this.f61846i;
            }
            relativeLayout.setVisibility(0);
        }
    }

    public void A(RequestMsg requestMsg) {
        if (requestMsg.u() == null || "".equals(requestMsg.u())) {
            Toast.makeText(this.f61839b, "参数支付类型tradeType不能为空", 0).show();
        } else if (requestMsg.s() == null || "".equals(requestMsg.s())) {
            Toast.makeText(this.f61839b, "参数tokenId不能为空", 0).show();
        } else if (requestMsg.u().equalsIgnoreCase(MainApplication.f61500k)) {
            p(requestMsg);
        } else if (requestMsg.u().equalsIgnoreCase(MainApplication.f61501l)) {
            B(requestMsg);
        } else if (!requestMsg.u().equalsIgnoreCase(MainApplication.f61503n) && !requestMsg.u().equalsIgnoreCase(MainApplication.f61504o)) {
            Toast.makeText(this.f61839b, "支付类型错误,或者不支持此支付类型", 0).show();
        } else {
            f61838w = requestMsg.u();
            F(requestMsg);
        }
    }

    public void B(RequestMsg requestMsg) {
        this.f61854q = new j0(this);
        cancel();
        requestMsg.O("微信扫码支付");
        this.f61849l = new g0(this.f61839b, "请稍候，正在请求微信二维码", this.f61854q);
        com.switfpass.pay.service.d.d().a(requestMsg, MainApplication.f61501l, new l0(this));
    }

    public void C(RequestMsg requestMsg) {
        cancel();
        this.f61849l = new g0(this.f61839b, "请稍候，正在请求微信支付", new n1(this));
        requestMsg.O("微信WAP支付");
        com.switfpass.pay.service.d.d().f(requestMsg, MainApplication.f61511v, new o1(this, requestMsg));
    }

    public void D(RequestMsg requestMsg) {
        requestMsg.O("微信WAP支付");
        com.switfpass.pay.service.d.d().f(requestMsg, MainApplication.f61511v, new l1(this, requestMsg));
    }

    public void E(RequestMsg requestMsg) {
        com.switfpass.pay.service.d.d().a(requestMsg, MainApplication.f61503n, new t0(this, requestMsg));
    }

    public void F(RequestMsg requestMsg) {
        String str = MainApplication.f61503n;
        if (requestMsg.u() != null && !"".equals(requestMsg.u()) && !requestMsg.u().equals("null") && requestMsg.u().equals(MainApplication.f61504o)) {
            str = MainApplication.f61504o;
        }
        cancel();
        this.f61849l = new g0(this.f61839b, "请稍候，正在请求支付宝二维码", new v1(this));
        requestMsg.O("支付宝扫码支付");
        com.switfpass.pay.service.d.d().a(requestMsg, str, new w1(this));
    }

    public void G(RequestMsg requestMsg) {
        com.switfpass.pay.service.d.d().f(requestMsg, MainApplication.f61512w, new w0(this, requestMsg));
    }

    public void l() {
        try {
            ProgressDialog progressDialog = this.f61857t;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f61857t.dismiss();
            this.f61857t.cancel();
            this.f61857t = null;
        } catch (Exception e5) {
            new StringBuilder("dismissMyLoading ").append(e5);
        }
    }

    public RequestMsg n() {
        return this.f61850m;
    }

    public void p(RequestMsg requestMsg) {
        cancel();
        requestMsg.O("手Q扫码支付");
        this.f61849l = new g0(this.f61839b, "请稍候，正在请求手Q二维码", new p0(this));
        com.switfpass.pay.service.d.d().a(requestMsg, MainApplication.f61500k, new q0(this));
    }

    public void q(RequestMsg requestMsg) {
        cancel();
        this.f61849l = new g0(this.f61839b, "请稍候，正在请求QQ钱包H5支付", new s1(this));
        requestMsg.O("QQwap支付");
        com.switfpass.pay.service.d.d().f(requestMsg, MainApplication.f61510u, new t1(this, requestMsg));
    }

    public void r(RequestMsg requestMsg) {
        com.switfpass.pay.service.d.d().f(requestMsg, MainApplication.f61510u, new q1(this, requestMsg));
    }

    public void s(RequestMsg requestMsg) {
        this.f61850m = requestMsg;
    }

    public void t(c0 c0Var) {
    }

    public void u(String str, g0 g0Var) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f61839b);
        builder.setTitle("温馨提示");
        builder.setMessage(str);
        builder.setPositiveButton("确定", new a(this, g0Var));
        builder.setNegativeButton("取消", new a0());
        this.f61855r = builder.show();
    }

    public void v(Context context, boolean z4, String str) {
        try {
            if (this.f61857t == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.f61857t = progressDialog;
                progressDialog.setCancelable(z4);
            }
            this.f61857t.show();
            this.f61857t.setMessage(str);
        } catch (Exception e5) {
            new StringBuilder("showLoading ").append(e5);
        }
    }

    public void y(RequestMsg requestMsg) {
        if (requestMsg.u() == null || "".equals(requestMsg.u())) {
            Toast.makeText(this.f61839b, "参数支付类型tradeType不能为空", 0).show();
        } else if (requestMsg.s() == null || "".equals(requestMsg.s())) {
            Toast.makeText(this.f61839b, "参数tokenId不能为空", 0).show();
        } else if (requestMsg.u().equalsIgnoreCase(MainApplication.f61505p)) {
            cancel();
            requestMsg.O("支付宝支付");
            com.switfpass.pay.service.d.d().c(requestMsg, MainApplication.f61505p, new o(this));
        } else if (!requestMsg.u().equalsIgnoreCase(MainApplication.f61502m)) {
            Toast.makeText(this.f61839b, "支付类型错误,或者不支持此支付类型", 0).show();
        } else {
            MainApplication.A = requestMsg.b();
            com.switfpass.pay.service.d.d().b(requestMsg, new y1(this, requestMsg));
        }
    }

    public void z(RequestMsg requestMsg) {
        Activity activity;
        String str;
        if (requestMsg.u() == null || "".equals(requestMsg.u())) {
            activity = this.f61839b;
            str = "参数支付类型tradeType不能为空";
        } else if (requestMsg.s() == null || "".equals(requestMsg.s())) {
            activity = this.f61839b;
            str = "参数tokenId不能为空";
        } else if (requestMsg.u().equalsIgnoreCase(MainApplication.f61510u)) {
            r(requestMsg);
            return;
        } else if (requestMsg.u().equalsIgnoreCase(MainApplication.f61511v)) {
            D(requestMsg);
            return;
        } else if (requestMsg.u().equalsIgnoreCase(MainApplication.f61512w)) {
            G(requestMsg);
            return;
        } else if (requestMsg.u().equalsIgnoreCase(MainApplication.f61513x)) {
            E(requestMsg);
            return;
        } else {
            activity = this.f61839b;
            str = "支付类型错误,或者不支持此支付类型";
        }
        Toast.makeText(activity, str, 0).show();
    }
}
