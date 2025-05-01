package com.switfpass.pay.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.mgps.activity.PayNowActivity_;
import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.lib.Resourcemap;
import java.text.NumberFormat;
import net.tsz.afinal.FinalBitmap;
/* loaded from: classes5.dex */
public class PayResultActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private TextView f61521b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f61522c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f61523d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f61524e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f61525f;

    /* renamed from: g  reason: collision with root package name */
    private OrderBena f61526g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f61527h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f61528i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f61529j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f61530k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f61531l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f61532m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f61533n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f61534o;

    /* renamed from: p  reason: collision with root package name */
    private LinearLayout f61535p;

    /* renamed from: q  reason: collision with root package name */
    private LinearLayout f61536q;

    /* renamed from: r  reason: collision with root package name */
    private LinearLayout f61537r;

    /* renamed from: s  reason: collision with root package name */
    private LinearLayout f61538s;

    /* renamed from: t  reason: collision with root package name */
    private Button f61539t;

    /* renamed from: u  reason: collision with root package name */
    private FinalBitmap f61540u;

    /* renamed from: v  reason: collision with root package name */
    private TextView f61541v;

    public static void startActivity(OrderBena orderBena, Context context) {
        Intent intent = new Intent();
        intent.putExtra(PayNowActivity_.W, orderBena);
        intent.setClass(context, PayResultActivity.class);
        context.startActivity(intent);
    }

    protected View b(int i4) {
        return findViewById(i4);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(Resourcemap.getLayout_Result());
        this.f61526g = (OrderBena) getIntent().getSerializableExtra(PayNowActivity_.W);
        FinalBitmap create = FinalBitmap.create(this);
        this.f61540u = create;
        try {
            create.configDiskCachePath(com.switfpass.pay.utils.o0.i());
        } catch (Exception unused) {
        }
        this.f61541v = (TextView) b(Resourcemap.getLayout_tv_pay_transNo());
        this.f61528i = (ImageView) b(Resourcemap.getById_iv_pay_image());
        this.f61536q = (LinearLayout) b(Resourcemap.getById_pay_logo_lay());
        this.f61537r = (LinearLayout) b(Resourcemap.getById_pay_img_lay());
        this.f61527h = (ImageView) b(Resourcemap.getById_pay_logo_title());
        this.f61521b = (TextView) b(Resourcemap.getLayout_tv_orderNo());
        this.f61522c = (TextView) b(Resourcemap.getLayout_tv_order_time());
        this.f61523d = (TextView) b(Resourcemap.getLayout_tv_order_state());
        this.f61524e = (TextView) b(Resourcemap.getLayout_tv_tv_bank());
        this.f61525f = (TextView) b(Resourcemap.getLayout_tv_money());
        b(Resourcemap.getLayout_iv_payType());
        this.f61529j = (TextView) b(Resourcemap.getLayout_finsh());
        this.f61530k = (TextView) b(Resourcemap.getLayout_tv_pay_body());
        this.f61531l = (TextView) b(Resourcemap.getLayout_tv_pay_mch_order());
        this.f61532m = (TextView) b(Resourcemap.getLayout_tv_pay_wx_order());
        this.f61533n = (TextView) b(Resourcemap.getLayout_tx_pay_wx_title());
        this.f61535p = (LinearLayout) b(Resourcemap.getLayout_rl_pay_mch());
        this.f61534o = (TextView) b(Resourcemap.getLayout_tv_pay_mch());
        this.f61538s = (LinearLayout) b(Resourcemap.getLayout_layBack());
        this.f61539t = (Button) b(Resourcemap.getLayout_pay_complete());
        if (!"".equals(this.f61526g.n()) && this.f61526g.n() != null) {
            this.f61537r.setVisibility(8);
            this.f61536q.setVisibility(0);
            this.f61540u.display(this.f61527h, this.f61526g.n());
        }
        if (this.f61526g.d() == null || this.f61526g.d().equals("")) {
            this.f61535p.setVisibility(8);
        } else {
            this.f61535p.setVisibility(0);
            this.f61531l.setText(this.f61526g.d());
        }
        this.f61521b.setText(this.f61526g.l());
        this.f61524e.setText(this.f61526g.w());
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        TextView textView = this.f61525f;
        textView.setText("￥" + numberInstance.format(Double.parseDouble(this.f61526g.i()) / 100.0d));
        this.f61522c.setText(com.switfpass.pay.utils.o0.e(Long.parseLong(this.f61526g.x())));
        this.f61530k.setText(this.f61526g.c());
        this.f61541v.setText(this.f61526g.g());
        this.f61532m.setText(this.f61526g.y());
        this.f61534o.setText(this.f61526g.f());
        this.f61523d.setText(getResources().getString(Resourcemap.getString_pay_success_prompt()));
        if (this.f61526g.r() != null) {
            if (this.f61526g.r().equals(MainApplication.f61500k) || this.f61526g.r().equalsIgnoreCase(MainApplication.f61507r) || this.f61526g.r().equalsIgnoreCase(MainApplication.f61506q)) {
                this.f61528i.setImageDrawable(getResources().getDrawable(Resourcemap.getById_icon_qq_color()));
                this.f61533n.setText(getResources().getString(Resourcemap.getString_pay_qq_order_no()));
                this.f61535p.setVisibility(8);
            } else if (this.f61526g.r().equals(MainApplication.f61503n) || this.f61526g.r().equalsIgnoreCase(MainApplication.f61509t)) {
                this.f61528i.setImageDrawable(getResources().getDrawable(Resourcemap.getById_icon_pay_color()));
                this.f61533n.setText(getResources().getString(Resourcemap.getString_pay_zfb_order_no()));
            }
        }
        this.f61529j.setOnClickListener(new f0(this));
        this.f61538s.setOnClickListener(new g0(this));
        this.f61539t.setOnClickListener(new h0(this));
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            OrderBena orderBena = this.f61526g;
            if (orderBena == null || !orderBena.B()) {
                com.switfpass.pay.handle.a.a(0, 0);
            } else {
                com.switfpass.pay.handle.a.b(6, 7, "支付状态：该笔订单已支付");
            }
            finish();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }
}
