package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.alipay.sdk.app.PayTask;
import com.heepay.plugin.api.HPlugin;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.Constant;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.dto.PapayOrder;
import com.join.mgps.dto.PapayResult;
import com.join.mgps.dto.PayCenterOrderRequest;
import com.join.mgps.dto.PayCenterOrderResponse;
import com.join.mgps.dto.PayGameDataRequest;
import com.join.mgps.dto.PayGamepayData;
import com.join.mgps.dto.PayResult;
import com.join.mgps.dto.PaygameResponse;
import com.join.mgps.dto.PaymentInfo;
import com.join.mgps.pref.PrefDef_;
import com.qq.e.comm.pi.ACTD;
import com.switfpass.pay.MainApplication;
import com.switfpass.pay.activity.PayPlugin;
import com.switfpass.pay.bean.RequestMsg;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.umcrash.UMCrash;
import com.wufan.user.service.protobuf.k;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.json.JSONException;
import org.json.JSONObject;
@EActivity(R.layout.activity_pay_now)
/* loaded from: classes4.dex */
public class PayNowActivity extends BaseActivity {
    public static final String L = "";
    public static final String M = "";
    public static final String N = "";
    public static final String O = "";
    private static final int P = 1;
    private static final int Q = 2;
    private static final int R = 3;
    Activity B;
    PayCenterOrderRequest C;
    private String E;
    IWXAPI G;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f36860b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36861c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f36862d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    HorizontalScrollView f36863e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f36864f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36865g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36866h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f36867i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f36868j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f36869k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ImageView f36870l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    ImageView f36871m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f36872n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    LinearLayout f36873o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    LinearLayout f36874p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    LinearLayout f36875q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    LinearLayout f36876r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f36877s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f36878t;
    @Pref

    /* renamed from: u  reason: collision with root package name */
    PrefDef_ f36879u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    PapayOrder f36880v;
    @Extra

    /* renamed from: w  reason: collision with root package name */
    IntentDataMain f36881w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    ExtBean f36882x;

    /* renamed from: y  reason: collision with root package name */
    MApplication f36883y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.rpc.o f36884z;
    private String A = "";
    private boolean D = false;
    private int F = 0;
    private Handler H = new a();
    private int I = 5;
    Handler J = new b();
    private long K = 0;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                PayNowActivity.this.z0((PaymentInfo) message.obj);
            } else if (i4 != 2) {
            } else {
                PayResult payResult = new PayResult((String) message.obj);
                payResult.getResult();
                String resultStatus = payResult.getResultStatus();
                if (TextUtils.equals(resultStatus, "9000")) {
                    PapayResult papayResult = new PapayResult();
                    papayResult.setStatus(1);
                    papayResult.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                    papayResult.setMessage("");
                    PayNowActivity.this.w0(papayResult);
                } else if (TextUtils.equals(resultStatus, "8000")) {
                    PapayResult papayResult2 = new PapayResult();
                    papayResult2.setStatus(4);
                    papayResult2.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                    papayResult2.setMessage("支付结果确认中");
                    PayNowActivity.this.w0(papayResult2);
                } else {
                    PapayResult papayResult3 = new PapayResult();
                    papayResult3.setStatus(2);
                    papayResult3.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                    papayResult3.setMessage("支付失败");
                    PayNowActivity.this.w0(papayResult3);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PayNowActivity.this.checkToken();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements com.join.android.app.common.http.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PayCenterOrderRequest f36887a;

        c(PayCenterOrderRequest payCenterOrderRequest) {
            this.f36887a = payCenterOrderRequest;
        }

        @Override // com.join.android.app.common.http.b
        public void a(Object obj) {
            PayNowActivity.this.r0();
        }

        @Override // com.join.android.app.common.http.b
        public void onSuccess(Object obj) {
            PayNowActivity.this.r0();
            CommentResponse commentResponse = (CommentResponse) obj;
            if (commentResponse == null || commentResponse.getCode() != 0) {
                if (commentResponse != null) {
                    com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(PayNowActivity.this.B);
                    a5.b(commentResponse.getMsg() + "");
                    PapayResult papayResult = new PapayResult();
                    papayResult.setStatus(2);
                    papayResult.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                    papayResult.setMessage("");
                    PayNowActivity.this.w0(papayResult);
                    return;
                }
                com.join.mgps.Util.l2.a(PayNowActivity.this.B).b("获取游戏数据失败");
                com.join.mgps.Util.l2 a6 = com.join.mgps.Util.l2.a(PayNowActivity.this.B);
                a6.b(commentResponse.getMsg() + "");
                PapayResult papayResult2 = new PapayResult();
                papayResult2.setStatus(2);
                papayResult2.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                papayResult2.setMessage("");
                PayNowActivity.this.w0(papayResult2);
                return;
            }
            PaygameResponse paygameResponse = (PaygameResponse) commentResponse.getData_info();
            if (paygameResponse != null) {
                PayGamepayData order = paygameResponse.getOrder();
                this.f36887a.setApp_callback_url(order.getCallbackURL());
                PayCenterOrderRequest payCenterOrderRequest = this.f36887a;
                payCenterOrderRequest.setPay_rmb((Float.parseFloat(order.getAmount()) / 100.0f) + "");
                this.f36887a.setApp_key(order.getSdkAppKey());
                this.f36887a.setApp_order_id(order.getOrderId());
                com.join.mgps.rpc.h.f54077q = order.getSdkPayURL();
                if (order.getPayMode() == 2) {
                    PayNowActivity.this.D0(this.f36887a);
                    return;
                }
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setCrc_link_type_val(order.getWebPaymentURL());
                ShareWebActivity_.t2(PayNowActivity.this.B).b(intentDateBean).startForResult(10000);
                return;
            }
            com.join.mgps.Util.l2 a7 = com.join.mgps.Util.l2.a(PayNowActivity.this.B);
            a7.b(commentResponse.getMsg() + "");
            PapayResult papayResult3 = new PapayResult();
            papayResult3.setStatus(2);
            papayResult3.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
            papayResult3.setMessage("");
            PayNowActivity.this.w0(papayResult3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements com.join.android.app.common.http.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PayCenterOrderRequest f36889a;

        d(PayCenterOrderRequest payCenterOrderRequest) {
            this.f36889a = payCenterOrderRequest;
        }

        @Override // com.join.android.app.common.http.b
        public void a(Object obj) {
            PayNowActivity.this.r0();
            PapayResult papayResult = new PapayResult();
            com.join.mgps.Util.v0.c("orderId =" + PayNowActivity.this.A);
            papayResult.setStatus(2);
            papayResult.setPayType(this.f36889a.getAction());
            papayResult.setMessage("获取订单号失败");
            PayNowActivity.this.w0(papayResult);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0396 -> B:92:0x03ad). Please submit an issue!!! */
        @Override // com.join.android.app.common.http.b
        public void onSuccess(Object obj) {
            int i4;
            PayNowActivity.this.r0();
            PayCenterOrderResponse payCenterOrderResponse = (PayCenterOrderResponse) obj;
            if (!PayCenterOrderRequest.ACTION_UNION_PAY.equals(payCenterOrderResponse.getAction()) && !PayCenterOrderRequest.ACTION_CREDIT_PAY.equals(payCenterOrderResponse.getAction())) {
                if (PayCenterOrderRequest.ACTION_ALI_PAY.equals(payCenterOrderResponse.getAction())) {
                    try {
                        JSONObject jSONObject = new JSONObject(payCenterOrderResponse.getJson());
                        if (jSONObject.getInt("ret") == 0) {
                            String string = jSONObject.getString("f_id");
                            String string2 = jSONObject.getJSONObject("extra_data").getString("alipay_sign");
                            PayNowActivity.this.A = string;
                            if (!com.join.mgps.Util.g2.h(string2)) {
                                PayNowActivity.this.B0(string2);
                            }
                        } else {
                            PapayResult papayResult = new PapayResult();
                            papayResult.setStatus(2);
                            papayResult.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                            papayResult.setMessage(jSONObject.getString("msg"));
                            PayNowActivity.this.w0(papayResult);
                        }
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                        PapayResult papayResult2 = new PapayResult();
                        papayResult2.setStatus(2);
                        papayResult2.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                        papayResult2.setMessage("获取订单号失败");
                        PayNowActivity.this.w0(papayResult2);
                    }
                } else if (PayCenterOrderRequest.ACTION_PABI.equals(payCenterOrderResponse.getAction())) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(payCenterOrderResponse.getJson());
                        int i5 = jSONObject2.getInt("ret");
                        String str = "余额不足";
                        if (i5 == 0) {
                            PayNowActivity.this.A = jSONObject2.getString("f_id");
                            str = jSONObject2.getString("msg");
                            i4 = 1;
                        } else {
                            if (i5 == 10001) {
                                str = "验证失败";
                            } else if (i5 == 10002) {
                                str = "token验证失败";
                            } else if (i5 == 10003) {
                                com.join.mgps.Util.l2.a(PayNowActivity.this).b("余额不足");
                            } else if (i5 == 10004) {
                                str = "服务器繁忙";
                            } else if (i5 == 10006) {
                                str = "代金券错误";
                            } else {
                                str = i5 == 10007 ? "不支持红包支付" : jSONObject2.getString("msg");
                            }
                            i4 = 2;
                        }
                        PapayResult papayResult3 = new PapayResult();
                        papayResult3.setStatus(i4);
                        papayResult3.setPayType(PayCenterOrderRequest.ACTION_PABI);
                        papayResult3.setMessage(str);
                        PayNowActivity.this.w0(papayResult3);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                        PapayResult papayResult4 = new PapayResult();
                        papayResult4.setStatus(2);
                        papayResult4.setPayType(PayCenterOrderRequest.ACTION_PABI);
                        papayResult4.setMessage("获取订单号失败");
                        PayNowActivity.this.w0(papayResult4);
                    }
                } else if (!PayCenterOrderRequest.ACTION_ZIWEI_WECHAT.equals(payCenterOrderResponse.getAction())) {
                    if (PayCenterOrderRequest.ACTION_WECHAT_SWIFT.equals(payCenterOrderResponse.getAction())) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(payCenterOrderResponse.getJson());
                            if (jSONObject3.getInt("code") == 0) {
                                JSONObject jSONObject4 = new JSONObject(jSONObject3.getString("data"));
                                PayNowActivity.this.A = jSONObject4.getString("order_id");
                                String string3 = jSONObject4.getString("token_id");
                                if (!TextUtils.isEmpty(string3)) {
                                    PayNowActivity.this.F = 8;
                                    RequestMsg requestMsg = new RequestMsg();
                                    requestMsg.N(string3);
                                    requestMsg.P(MainApplication.f61511v);
                                    PayPlugin.k(PayNowActivity.this.B, requestMsg);
                                } else {
                                    PapayResult papayResult5 = new PapayResult();
                                    papayResult5.setStatus(2);
                                    papayResult5.setPayType(PayCenterOrderRequest.ACTION_WECHAT_SWIFT);
                                    papayResult5.setMessage(jSONObject3.getString("msg"));
                                    PayNowActivity.this.w0(papayResult5);
                                }
                            } else {
                                PapayResult papayResult6 = new PapayResult();
                                papayResult6.setStatus(2);
                                papayResult6.setPayType(PayCenterOrderRequest.ACTION_WECHAT_SWIFT);
                                papayResult6.setMessage(jSONObject3.getString("msg"));
                                PayNowActivity.this.w0(papayResult6);
                            }
                        } catch (Exception e7) {
                            e7.printStackTrace();
                            PapayResult papayResult7 = new PapayResult();
                            papayResult7.setStatus(2);
                            papayResult7.setPayType(PayCenterOrderRequest.ACTION_WECHAT_SWIFT);
                            papayResult7.setMessage("获取订单号失败");
                            PayNowActivity.this.w0(papayResult7);
                        }
                    } else if (PayCenterOrderRequest.ACTION_WECHAT.equals(payCenterOrderResponse.getAction())) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(payCenterOrderResponse.getJson());
                            if (jSONObject5.getInt("code") == 0) {
                                JSONObject jSONObject6 = jSONObject5.getJSONObject("data");
                                this.f36889a.setKingnet_order_id(jSONObject6.getString("order_id"));
                                PaymentInfo paymentInfo = new PaymentInfo();
                                paymentInfo.setTokenID(jSONObject6.getString("token_id"));
                                paymentInfo.setAgentId(jSONObject6.getString(Constant.AGENT_ID));
                                paymentInfo.setBillNo(jSONObject6.getString("order_id"));
                                PayNowActivity.this.A = jSONObject6.getString("order_id");
                                Message message = new Message();
                                message.what = 1;
                                message.obj = paymentInfo;
                                PayNowActivity.this.H.sendMessage(message);
                            } else {
                                PapayResult papayResult8 = new PapayResult();
                                papayResult8.setStatus(2);
                                papayResult8.setPayType(PayCenterOrderRequest.ACTION_WECHAT);
                                papayResult8.setMessage(jSONObject5.getString("msg"));
                                PayNowActivity.this.w0(papayResult8);
                            }
                        } catch (JSONException e8) {
                            e8.printStackTrace();
                            PapayResult papayResult9 = new PapayResult();
                            papayResult9.setStatus(2);
                            papayResult9.setPayType(PayCenterOrderRequest.ACTION_WECHAT);
                            papayResult9.setMessage("获取订单号失败");
                            PayNowActivity.this.w0(papayResult9);
                        }
                    } else if (PayCenterOrderRequest.ACTION_WECHAT_OFFICIAL.equals(payCenterOrderResponse.getAction())) {
                        try {
                            JSONObject jSONObject7 = new JSONObject(payCenterOrderResponse.getJson());
                            if (jSONObject7.getInt("code") == 0) {
                                JSONObject jSONObject8 = jSONObject7.getJSONObject("data");
                                this.f36889a.setKingnet_order_id(jSONObject8.getString("orderId"));
                                PayNowActivity.this.A = jSONObject8.getString("orderId");
                                jSONObject8.toString();
                                PayReq payReq = new PayReq();
                                payReq.appId = jSONObject8.getString(ACTD.APPID_KEY);
                                payReq.partnerId = jSONObject8.getString("partnerid");
                                payReq.prepayId = jSONObject8.getString("prepayid");
                                payReq.nonceStr = jSONObject8.getString("noncestr");
                                payReq.timeStamp = jSONObject8.getString(UMCrash.SP_KEY_TIMESTAMP);
                                payReq.packageValue = jSONObject8.getString("package");
                                HashMap hashMap = new HashMap();
                                hashMap.put(ACTD.APPID_KEY, payReq.appId);
                                hashMap.put("partnerid", payReq.partnerId);
                                hashMap.put("prepayid", payReq.prepayId);
                                hashMap.put("package", payReq.packageValue);
                                hashMap.put("noncestr", payReq.nonceStr);
                                hashMap.put(UMCrash.SP_KEY_TIMESTAMP, payReq.timeStamp);
                                payReq.sign = jSONObject8.getString(Constant.MD5);
                                PayNowActivity.this.G.sendReq(payReq);
                            } else {
                                PapayResult papayResult10 = new PapayResult();
                                papayResult10.setStatus(2);
                                papayResult10.setPayType(PayCenterOrderRequest.ACTION_WECHAT);
                                papayResult10.setMessage(jSONObject7.getString("msg"));
                                PayNowActivity.this.w0(papayResult10);
                            }
                        } catch (Exception e9) {
                            e9.printStackTrace();
                            PapayResult papayResult11 = new PapayResult();
                            papayResult11.setStatus(2);
                            papayResult11.setPayType(PayCenterOrderRequest.ACTION_WECHAT);
                            papayResult11.setMessage("获取订单号失败");
                            PayNowActivity.this.w0(papayResult11);
                        }
                    }
                }
            } else {
                try {
                    JSONObject jSONObject9 = new JSONObject(payCenterOrderResponse.getJson());
                    String string4 = jSONObject9.getString("extra_data");
                    if (jSONObject9.getInt("ret") == 0) {
                        String string5 = new JSONObject(string4).getString("tn");
                        PayNowActivity.this.A = jSONObject9.getString("f_id");
                        com.join.mgps.Util.g2.h(string5);
                    } else {
                        PapayResult papayResult12 = new PapayResult();
                        papayResult12.setStatus(2);
                        papayResult12.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                        papayResult12.setMessage(jSONObject9.getString("msg"));
                        PayNowActivity.this.w0(papayResult12);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    PapayResult papayResult13 = new PapayResult();
                    papayResult13.setStatus(2);
                    papayResult13.setPayType(PayCenterOrderRequest.ACTION_ALI_PAY);
                    papayResult13.setMessage("获取订单号失败");
                    PayNowActivity.this.w0(papayResult13);
                }
            }
            PayNowActivity.this.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36891b;

        e(String str) {
            this.f36891b = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                String pay = new PayTask(PayNowActivity.this.B).pay(com.join.mgps.Util.w.a(this.f36891b), true);
                Message message = new Message();
                message.what = 2;
                message.obj = pay;
                PayNowActivity.this.H.sendMessage(message);
            } catch (Exception e5) {
                e5.printStackTrace();
                PapayResult papayResult = new PapayResult();
                com.join.mgps.Util.v0.c("orderId =" + PayNowActivity.this.A);
                papayResult.setStatus(2);
                papayResult.setPayType(PayNowActivity.this.C.getAction());
                papayResult.setMessage("签名验证失败");
                PayNowActivity.this.w0(papayResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(String str) {
        new e(str).start();
    }

    private void C0() {
        this.f36860b.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bill_dialog_enter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        this.f36864f.setVisibility(0);
        this.f36862d.setVisibility(8);
        this.f36863e.setVisibility(8);
    }

    private void showLoding() {
        this.f36864f.setVisibility(0);
        this.f36862d.setVisibility(8);
        this.f36863e.setVisibility(8);
    }

    public static boolean u0(Context context) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(PapayResult papayResult) {
        papayResult.setPayProduct(this.C.getProduct_name());
        papayResult.setPayOrderId(this.A);
        com.join.mgps.Util.v0.c("orderId =" + this.A);
        if (papayResult.getStatus() == 1 && this.f36880v.ORDERTYPE == 1) {
            checkToken();
        }
        com.join.mgps.listener.b.b().c();
        int i4 = this.f36880v.ORDERTYPE;
        if (i4 == 1) {
            PapayFinishActivity_.h0(this.B).a(papayResult).b(true).start();
        } else if (i4 == 2) {
            int status = papayResult.getStatus();
            if (status == 1) {
                papayResult.setGameid(this.f36880v.PRODUCT_ID);
                PayFinishActivity_.k0(this).a(papayResult).start();
            } else if (status == 2) {
                com.join.mgps.Util.l2.a(this).b("支付失败");
                finish();
            } else if (status == 3) {
                com.join.mgps.Util.l2.a(this).b("支付取消");
                finish();
            } else if (status != 4) {
                com.join.mgps.Util.l2.a(this).b("支付失败");
                finish();
            } else {
                com.join.mgps.Util.l2.a(this).b("支付等待");
                finish();
            }
            finish();
        } else if (i4 == 3) {
            int status2 = papayResult.getStatus();
            if (status2 == 1) {
                sendBroadcast(new Intent("com.join,mgps.sim.sdkgamePayfinish"));
                ExtBean extBean = this.f36882x;
                if (extBean != null && "1".equals(extBean.getFrom())) {
                    com.join.mgps.Util.m1.c().e(this, this.f36882x.getFrom_id(), this.f36882x.getPosition());
                }
            } else if (status2 == 2) {
                com.join.mgps.Util.l2.a(this).b("支付失败");
            } else if (status2 == 3) {
                com.join.mgps.Util.l2.a(this).b("支付取消");
            } else if (status2 != 4) {
                com.join.mgps.Util.l2.a(this).b("支付失败");
            } else {
                com.join.mgps.Util.l2.a(this).b("支付等待");
            }
            finish();
        } else {
            PapayFinishActivity_.h0(this.B).a(papayResult).start();
        }
        int i5 = this.f36880v.PAYORRECHARGE;
        if (i5 == 1 || i5 == 2) {
            org.greenrobot.eventbus.c.f().o(papayResult);
        }
    }

    private void x0(Intent intent) {
        String string = intent.getExtras().getString("respCode");
        String string2 = intent.getExtras().getString("respMessage");
        if ("1".equals(string)) {
            PapayResult papayResult = new PapayResult();
            papayResult.setStatus(1);
            papayResult.setPayType(this.C.getAction());
            papayResult.setMessage("支付成功");
            w0(papayResult);
        }
        if ("0".equals(string) || "-2".equals(string) || "-3".equals(string)) {
            PapayResult papayResult2 = new PapayResult();
            papayResult2.setStatus(2);
            papayResult2.setPayType(this.C.getAction());
            papayResult2.setMessage("支付失败 " + string2);
            w0(papayResult2);
        }
        if ("-1".equals(string)) {
            PapayResult papayResult3 = new PapayResult();
            papayResult3.setStatus(2);
            papayResult3.setPayType(this.C.getAction());
            papayResult3.setMessage("支付失败");
            w0(papayResult3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(PaymentInfo paymentInfo) {
        HPlugin.pay(this, paymentInfo.getTokenID() + "," + paymentInfo.getAgentId() + "," + paymentInfo.getBillNo() + ",30");
    }

    public void A0(PayCenterOrderRequest payCenterOrderRequest) {
        int i4 = this.f36880v.ORDERTYPE;
        if (i4 != 2 && i4 != 3) {
            D0(payCenterOrderRequest);
            return;
        }
        PayGameDataRequest payGameDataRequest = new PayGameDataRequest();
        payGameDataRequest.setConsole_app_key(payCenterOrderRequest.getApp_key());
        payGameDataRequest.setDevice_id("");
        payGameDataRequest.setPay_type(payCenterOrderRequest.getAction());
        payGameDataRequest.setUid(payCenterOrderRequest.getOpenuid() + "");
        payGameDataRequest.setApp_ver(com.join.android.app.common.utils.n.n(this).y() + "");
        showLoding();
        com.join.mgps.rpc.n.g(payGameDataRequest, new c(payCenterOrderRequest));
    }

    public void D0(PayCenterOrderRequest payCenterOrderRequest) {
        long currentTimeMillis = System.currentTimeMillis();
        com.join.mgps.Util.v0.d("paytime", "paytime1" + currentTimeMillis + "    " + this.K);
        if (currentTimeMillis - this.K < 500) {
            com.join.mgps.Util.v0.d("paytime", "paytime222" + currentTimeMillis + "    " + this.K);
            return;
        }
        payCenterOrderRequest.getAction().equals(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT);
        this.K = currentTimeMillis;
        if (!com.join.android.app.common.utils.j.j(this.B)) {
            com.join.mgps.Util.l2.a(this.B).b(getResources().getString(R.string.net_connect_failed));
        }
        showLoding();
        com.join.mgps.rpc.n.f(payCenterOrderRequest, new d(payCenterOrderRequest));
    }

    void E0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_WECHAT_SWIFT);
        A0(this.C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_UNION_PAY);
        this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_UNION_PAY);
        A0(this.C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.L})
    public void G0(Intent intent) {
        String stringExtra = intent.getStringExtra("out_trade_no");
        String stringExtra2 = intent.getStringExtra("return_code");
        String stringExtra3 = intent.getStringExtra("return_msg");
        StringBuilder sb = new StringBuilder();
        sb.append(stringExtra);
        sb.append("  ");
        sb.append(stringExtra2);
        sb.append("  ");
        sb.append(stringExtra3);
        if (getPackageName().equals(stringExtra)) {
            if ("SUCCESS".equals(stringExtra2)) {
                PapayResult papayResult = new PapayResult();
                papayResult.setStatus(1);
                papayResult.setPayType(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT);
                papayResult.setMessage("支付成功");
                w0(papayResult);
            } else if ("CANCEL".equals(stringExtra2)) {
                PapayResult papayResult2 = new PapayResult();
                papayResult2.setStatus(2);
                papayResult2.setPayType(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT);
                papayResult2.setMessage("获取订单号失败");
                w0(papayResult2);
            } else {
                PapayResult papayResult3 = new PapayResult();
                papayResult3.setStatus(2);
                papayResult3.setPayType(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT);
                papayResult3.setMessage(stringExtra3);
                w0(papayResult3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void H0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_WECHAT);
        this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_WECHAT);
        int i4 = this.f36880v.PAYTYPE;
        if (i4 == 2) {
            this.C.setAction(PayCenterOrderRequest.ACTION_WECHAT);
            this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_WECHAT);
        } else if (i4 == 7) {
            this.C.setAction(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT);
            this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT);
        } else if (i4 == 8) {
            this.C.setAction(PayCenterOrderRequest.ACTION_WECHAT_SWIFT);
            this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_WECHAT_SWIFT);
        } else if (i4 == 9) {
            this.C.setAction(PayCenterOrderRequest.ACTION_WECHAT_OFFICIAL);
            this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_WECHAT_OFFICIAL);
        }
        A0(this.C);
    }

    void I0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_WECHAT);
        A0(this.C);
    }

    void J0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT);
        A0(this.C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f36884z = com.join.mgps.rpc.impl.n.h();
        this.B = this;
        MApplication mApplication = (MApplication) getApplication();
        this.f36883y = mApplication;
        mApplication.e(this);
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this, null);
        this.G = createWXAPI;
        createWXAPI.registerApp("wx5e0a2e02d261de17");
        TextView textView = this.f36865g;
        textView.setText(Html.fromHtml("商品：<font color='0x3b3b3b' >" + this.f36880v.PRODUCT_NAME + "</font>"), TextView.BufferType.SPANNABLE);
        this.C = new PayCenterOrderRequest();
        String d5 = this.f36879u.getLastPayType().d();
        if (d5.equals(PayCenterOrderRequest.ACTION_ALI_PAY)) {
            TextView textView2 = this.f36867i;
            textView2.setText(Html.fromHtml("使用支付宝支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
            this.f36876r.setSelected(true);
        } else if (!d5.equals(PayCenterOrderRequest.ACTION_ZIWEI_WECHAT) && !d5.equals(PayCenterOrderRequest.ACTION_WECHAT) && !d5.equals(PayCenterOrderRequest.ACTION_WECHAT_SWIFT)) {
            if (d5.equals(PayCenterOrderRequest.ACTION_UNION_PAY)) {
                TextView textView3 = this.f36867i;
                textView3.setText(Html.fromHtml("使用银行卡支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
                this.f36877s.setSelected(true);
            } else if (d5.equals(PayCenterOrderRequest.ACTION_CREDIT_PAY)) {
                TextView textView4 = this.f36867i;
                textView4.setText(Html.fromHtml("使用信用卡支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
                this.f36878t.setSelected(true);
            } else if (d5.equals(PayCenterOrderRequest.PAY_TYPE_WALLET)) {
                if (this.f36880v.PAYORRECHARGE == 1) {
                    TextView textView5 = this.f36867i;
                    textView5.setText(Html.fromHtml("使用饭票支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
                    this.f36873o.setSelected(true);
                } else {
                    TextView textView6 = this.f36867i;
                    textView6.setText(Html.fromHtml("使用支付宝支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
                    this.f36876r.setSelected(true);
                }
            } else if (d5.equals(PayCenterOrderRequest.PAY_TYPE_RED_ENVELOPE)) {
                if (this.f36880v.PAYORRECHARGE == 1) {
                    TextView textView7 = this.f36867i;
                    textView7.setText(Html.fromHtml("使用红包支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
                    this.f36874p.setSelected(true);
                } else {
                    TextView textView8 = this.f36867i;
                    textView8.setText(Html.fromHtml("使用支付宝支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
                    this.f36876r.setSelected(true);
                }
            }
        } else {
            TextView textView9 = this.f36867i;
            textView9.setText(Html.fromHtml("使用微信支付<font color='#fa8819' >" + getString(R.string.pay_ad_type) + "</font>"));
            this.f36875q.setSelected(true);
        }
        try {
            String format = new DecimalFormat("##0.00").format(Float.parseFloat(this.f36880v.MONEY_AMOUNT));
            this.C.setPay_rmb(format);
            this.f36880v.MONEY_AMOUNT = format;
            TextView textView10 = this.f36866h;
            textView10.setText(Html.fromHtml("金额：<font color='0xfc3f5e' > " + this.f36880v.MONEY_AMOUNT + "元</font>"), TextView.BufferType.SPANNABLE);
            this.C.setApp_callback_url(this.f36880v.NOTIFY_URI);
            this.C.setApp_extra1(this.f36880v.APP_EXT1);
            this.C.setApp_extra2(this.f36880v.APP_EXT2);
            this.C.setApp_key(this.f36880v.APPKEY);
            this.C.setApp_name(this.f36880v.APP_NAME);
            this.C.setApp_order_id(this.f36880v.APP_ORDER_ID);
            this.C.setApp_user_name(this.f36880v.APP_USER_NAME);
            this.C.setImei("");
            this.C.setUid(this.f36880v.APP_USER_ID);
            this.C.setOpenuid(this.f36880v.PA_OPEN_UID);
            this.C.setPackage_name(getPackageName());
            this.C.setToken(this.f36880v.TOKEN);
            PapayOrder papayOrder = this.f36880v;
            int i4 = papayOrder.APP_SERVER;
            int i5 = i4 > 0 ? 100000000 + i4 : 100000000;
            int i6 = papayOrder.APP_DISTRICT;
            if (i6 > 0) {
                i5 += i6 * 10000;
            }
            this.C.setSid(i5);
            this.C.setProduct_id(this.f36880v.PRODUCT_ID);
            this.C.setProduct_name(this.f36880v.PRODUCT_NAME);
            C0();
            PapayOrder papayOrder2 = this.f36880v;
            if (papayOrder2.PAYORRECHARGE == 1) {
                int i7 = papayOrder2.PAYSHOWTYPE;
                if (i7 == 0) {
                    this.f36873o.setVisibility(8);
                    this.f36874p.setVisibility(8);
                } else if (i7 == 1) {
                    this.f36873o.setVisibility(0);
                    this.f36874p.setVisibility(8);
                } else if (i7 == 2) {
                    this.f36873o.setVisibility(8);
                    this.f36874p.setVisibility(0);
                } else if (i7 == 3) {
                    this.f36873o.setVisibility(0);
                    this.f36874p.setVisibility(0);
                }
                this.C.setResource_id(com.join.mgps.rpc.a.f54033e);
            } else {
                this.C.setResource_id(com.join.mgps.rpc.a.f54034f);
            }
            switch (this.f36880v.PAYTYPE) {
                case 1:
                    o0();
                    return;
                case 2:
                    I0();
                    return;
                case 3:
                    F0();
                    return;
                case 4:
                    q0();
                    return;
                case 5:
                    v0();
                    return;
                case 6:
                    t0();
                    return;
                case 7:
                    J0();
                    return;
                case 8:
                    E0();
                    return;
                default:
                    return;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            com.join.mgps.Util.l2.a(this).b("充值金额不合法");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkToken() {
        int i4 = this.I;
        if (i4 > 0) {
            this.I = i4 - 1;
            try {
                com.join.mgps.rpc.c k4 = com.join.mgps.rpc.impl.b.k();
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
                if (accountData != null && accountData.n2() != 2) {
                    k.b k32 = com.wufan.user.service.protobuf.k.k3();
                    k32.e3(accountData.getUid());
                    k32.c3(accountData.getToken());
                    k32.Y2(b3.b.a(this));
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", k32.getUid() + "");
                    hashMap.put("token", k32.getToken());
                    hashMap.put("appVersion", k32.getAppVersion());
                    k32.a3(com.join.mgps.Util.x1.d(hashMap));
                    com.wufan.user.service.protobuf.n d5 = k4.d(k32.build());
                    if (d5 != null && d5.getData() != null) {
                        com.wufan.user.service.protobuf.f data = d5.getData();
                        com.wufan.user.service.protobuf.n0 build = accountData.toBuilder().s4(data.M()).j4(data.V1()).q4(data.y()).k4(data.G()).build();
                        if (com.join.mgps.Util.b.piv(build)) {
                            this.I = 0;
                            AccountUtil_.getInstance_(this).saveAccountData(build, this);
                            UtilsMy.R(this);
                        } else {
                            this.J.sendEmptyMessageDelayed(1, com.join.mgps.data.c.f49010a);
                        }
                    } else {
                        this.J.sendEmptyMessageDelayed(1, com.join.mgps.data.c.f49010a);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                this.J.sendEmptyMessageDelayed(1, com.join.mgps.data.c.f49010a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_ALI_PAY);
        this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_ALI_PAY);
        A0(this.C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void ok() {
        String d5 = this.f36879u.getLastPayType().d();
        if (this.f36880v.PAYORRECHARGE == 1) {
            if (d5.equals(PayCenterOrderRequest.PAY_TYPE_WALLET)) {
                this.C.setAction(PayCenterOrderRequest.ACTION_PABI);
                this.C.setWallet_type(PayCenterOrderRequest.PAY_TYPE_WALLET);
            } else if (d5.equals(PayCenterOrderRequest.PAY_TYPE_RED_ENVELOPE)) {
                this.C.setAction(PayCenterOrderRequest.ACTION_PABI);
                this.C.setWallet_type(PayCenterOrderRequest.PAY_TYPE_RED_ENVELOPE);
            } else {
                this.C.setAction(this.f36879u.getLastPayType().d());
            }
        } else if (d5.equals(PayCenterOrderRequest.PAY_TYPE_WALLET)) {
            this.C.setAction(PayCenterOrderRequest.ACTION_ALI_PAY);
        } else if (d5.equals(PayCenterOrderRequest.PAY_TYPE_RED_ENVELOPE)) {
            this.C.setAction(PayCenterOrderRequest.ACTION_ALI_PAY);
        } else {
            this.C.setAction(this.f36879u.getLastPayType().d());
        }
        A0(this.C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (i4 == 10000) {
            if (i5 == 10010) {
                PapayResult papayResult = new PapayResult();
                papayResult.setStatus(1);
                papayResult.setPayType(this.C.getAction());
                papayResult.setMessage("支付成功");
                w0(papayResult);
                return;
            } else if (i5 == 10011) {
                PapayResult papayResult2 = new PapayResult();
                papayResult2.setStatus(2);
                papayResult2.setPayType(this.C.getAction());
                papayResult2.setMessage("支付失败");
                w0(papayResult2);
                return;
            } else {
                PapayResult papayResult3 = new PapayResult();
                papayResult3.setStatus(2);
                papayResult3.setPayType(this.C.getAction());
                papayResult3.setMessage("支付失败");
                w0(papayResult3);
                return;
            }
        }
        if (intent != null) {
            String string = intent.getExtras().getString("resultCode");
            if (com.join.mgps.Util.g2.i(string) && this.F == 8) {
                if (!TextUtils.isEmpty(string) && string.equalsIgnoreCase("success")) {
                    PapayResult papayResult4 = new PapayResult();
                    papayResult4.setStatus(1);
                    papayResult4.setPayType(this.C.getAction());
                    papayResult4.setMessage("支付成功");
                    w0(papayResult4);
                } else {
                    PapayResult papayResult5 = new PapayResult();
                    papayResult5.setStatus(2);
                    papayResult5.setPayType(this.C.getAction());
                    papayResult5.setMessage("支付失败");
                    w0(papayResult5);
                }
            } else if (this.F == 8) {
                PapayResult papayResult6 = new PapayResult();
                papayResult6.setStatus(2);
                papayResult6.setPayType(this.C.getAction());
                papayResult6.setMessage("支付失败");
                w0(papayResult6);
            }
        } else if (this.F == 8) {
            PapayResult papayResult7 = new PapayResult();
            papayResult7.setStatus(2);
            papayResult7.setPayType(this.C.getAction());
            papayResult7.setMessage("支付失败");
            w0(papayResult7);
        }
        if (i5 == 0) {
            PapayResult papayResult8 = new PapayResult();
            papayResult8.setStatus(2);
            papayResult8.setPayType(this.C.getAction());
            papayResult8.setMessage("支付失败");
            w0(papayResult8);
        }
        if (i5 == 4128) {
            x0(intent);
        }
        if (intent == null) {
            return;
        }
        String string2 = intent.getExtras().getString("pay_result");
        if (com.join.mgps.Util.g2.h(string2)) {
            return;
        }
        if (string2.equalsIgnoreCase("success")) {
            PapayResult papayResult9 = new PapayResult();
            papayResult9.setStatus(1);
            papayResult9.setPayType(this.C.getAction());
            papayResult9.setMessage("支付成功");
            w0(papayResult9);
        } else if (string2.equalsIgnoreCase("fail")) {
            PapayResult papayResult10 = new PapayResult();
            papayResult10.setStatus(2);
            papayResult10.setPayType(this.C.getAction());
            papayResult10.setMessage("支付失败");
            w0(papayResult10);
        } else if (string2.equalsIgnoreCase("cancel")) {
            PapayResult papayResult11 = new PapayResult();
            papayResult11.setStatus(3);
            papayResult11.setPayType(this.C.getAction());
            papayResult11.setMessage("支付取消");
            w0(papayResult11);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i4 = this.f36880v.PAYORRECHARGE;
        if (i4 == 1 || i4 == 2) {
            PapayResult papayResult = new PapayResult();
            papayResult.setStatus(3);
            org.greenrobot.eventbus.c.f().o(papayResult);
        }
        finish();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f36881w != null) {
                moveTaskToBack(true);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        this.f36862d.setVisibility(8);
        this.f36863e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_CREDIT_PAY);
        this.f36879u.getLastPayType().g(PayCenterOrderRequest.ACTION_CREDIT_PAY);
        A0(this.C);
    }

    public String s0() {
        return "sign_type=\"RSA\"";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_PABI);
        this.f36879u.getLastPayType().g(PayCenterOrderRequest.PAY_TYPE_RED_ENVELOPE);
        this.C.setWallet_type(PayCenterOrderRequest.PAY_TYPE_RED_ENVELOPE);
        A0(this.C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        this.C.setAction(PayCenterOrderRequest.ACTION_PABI);
        this.f36879u.getLastPayType().g(PayCenterOrderRequest.PAY_TYPE_WALLET);
        this.C.setWallet_type(PayCenterOrderRequest.PAY_TYPE_WALLET);
        A0(this.C);
    }

    public String y0(String str) {
        return com.join.mgps.Util.y1.a(str, "");
    }
}
