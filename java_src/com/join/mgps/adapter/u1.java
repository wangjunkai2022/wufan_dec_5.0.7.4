package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.AccountVoucherGameBean;
import java.util.List;
/* compiled from: HotVoucherAdapter.java */
/* loaded from: classes4.dex */
public class u1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private List<AccountVoucherGameBean> f45866b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45867c;

    /* renamed from: d  reason: collision with root package name */
    private Context f45868d;

    /* compiled from: HotVoucherAdapter.java */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        TextView f45869a;

        /* renamed from: b  reason: collision with root package name */
        TextView f45870b;

        /* renamed from: c  reason: collision with root package name */
        TextView f45871c;

        /* renamed from: d  reason: collision with root package name */
        TextView f45872d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f45873e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f45874f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HotVoucherAdapter.java */
        /* renamed from: com.join.mgps.adapter.u1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class View$OnClickListenerC0344a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AccountVoucherGameBean f45876b;

            View$OnClickListenerC0344a(AccountVoucherGameBean accountVoucherGameBean) {
                this.f45876b = accountVoucherGameBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil intentUtil = IntentUtil.getInstance();
                Context context = u1.this.f45868d;
                intentUtil.goGameDetialActivity(context, this.f45876b.getGame_id() + "", this.f45876b.getGame_tpl(), this.f45876b.getSp_tpl_two_position(), this.f45876b.get_from_type());
            }
        }

        public a(View view) {
            this.f45869a = (TextView) view.findViewById(R.id.voucherPrice);
            this.f45870b = (TextView) view.findViewById(R.id.voucherContent);
            this.f45872d = (TextView) view.findViewById(R.id.voucherGameGet);
            this.f45871c = (TextView) view.findViewById(R.id.voucherGameNumber);
            this.f45873e = (LinearLayout) view.findViewById(R.id.layoutGamevoucher);
            this.f45874f = (LinearLayout) view.findViewById(R.id.gameVoucherRight);
        }

        public void a(AccountVoucherGameBean accountVoucherGameBean) {
            if (accountVoucherGameBean != null) {
                TextView textView = this.f45869a;
                textView.setText("￥" + accountVoucherGameBean.getCoupon_money());
                this.f45870b.setText(accountVoucherGameBean.getCoupon_title());
                this.f45872d.setText(u1.this.f45868d.getString(R.string.voucher_go));
                int coupon_type = accountVoucherGameBean.getCoupon_type();
                if (coupon_type == 1) {
                    this.f45871c.setText(String.format(u1.this.f45868d.getString(R.string.voucher_surplus), Integer.valueOf(accountVoucherGameBean.getCoupon_surplus())));
                    this.f45872d.setPadding(0, 0, 0, com.join.mgps.Util.c0.a(u1.this.f45868d, 15.0f));
                    this.f45872d.setVisibility(0);
                    this.f45869a.setVisibility(0);
                } else if (coupon_type == 2) {
                    this.f45869a.setVisibility(8);
                    this.f45871c.setVisibility(8);
                    this.f45872d.setPadding(0, 0, 0, 0);
                }
                this.f45874f.setOnClickListener(new View$OnClickListenerC0344a(accountVoucherGameBean));
            }
        }
    }

    public u1(Context context, List<AccountVoucherGameBean> list) {
        this.f45867c = LayoutInflater.from(context);
        this.f45868d = context;
        this.f45866b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45866b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f45866b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.f45867c.inflate(R.layout.layout_voucher_game_detail, (ViewGroup) null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a((AccountVoucherGameBean) getItem(i4));
        return view;
    }
}
