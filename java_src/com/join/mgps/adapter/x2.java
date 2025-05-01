package com.join.mgps.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.MyVoucherGameActivity_;
import com.join.mgps.dto.AccountVoucher;
import com.join.mgps.dto.AccountVoucherGameBean;
import java.util.List;
/* compiled from: MyVoucherAdapter.java */
/* loaded from: classes4.dex */
public class x2 extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final int f45995f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f45996g = 1;

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f45997b;

    /* renamed from: c  reason: collision with root package name */
    private Context f45998c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f45999d;

    /* renamed from: e  reason: collision with root package name */
    private int f46000e;

    /* compiled from: MyVoucherAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountVoucher f46001b;

        a(AccountVoucher accountVoucher) {
            this.f46001b = accountVoucher;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyVoucherGameActivity_.y0(x2.this.f45998c).a(this.f46001b).start();
        }
    }

    /* compiled from: MyVoucherAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountVoucherGameBean f46003b;

        b(AccountVoucherGameBean accountVoucherGameBean) {
            this.f46003b = accountVoucherGameBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = x2.this.f45998c;
            intentUtil.goGameDetialActivity(context, this.f46003b.getGame_id() + "", this.f46003b.getGame_info_tpl_type(), this.f46003b.getSp_tpl_two_position(), this.f46003b.get_from());
        }
    }

    /* compiled from: MyVoucherAdapter.java */
    /* loaded from: classes4.dex */
    class c {

        /* renamed from: a  reason: collision with root package name */
        TextView f46005a;

        /* renamed from: b  reason: collision with root package name */
        TextView f46006b;

        /* renamed from: c  reason: collision with root package name */
        TextView f46007c;

        /* renamed from: d  reason: collision with root package name */
        TextView f46008d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f46009e;

        public c(View view) {
            this.f46005a = (TextView) view.findViewById(R.id.voucherContent);
            this.f46006b = (TextView) view.findViewById(R.id.voucherPrice);
            this.f46008d = (TextView) view.findViewById(R.id.voucherGameGet);
            this.f46007c = (TextView) view.findViewById(R.id.voucherGameNumber);
            this.f46009e = (LinearLayout) view.findViewById(R.id.gameVoucherRight);
        }
    }

    /* compiled from: MyVoucherAdapter.java */
    /* loaded from: classes4.dex */
    class d {

        /* renamed from: a  reason: collision with root package name */
        public TextView f46011a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f46012b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f46013c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f46014d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f46015e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f46016f;

        /* renamed from: g  reason: collision with root package name */
        public SimpleDraweeView f46017g;

        public d(View view) {
            this.f46011a = (TextView) view.findViewById(R.id.appName);
            this.f46012b = (TextView) view.findViewById(R.id.voucherIs);
            this.f46013c = (TextView) view.findViewById(R.id.voucherOut);
            this.f46014d = (TextView) view.findViewById(R.id.voucherHand);
            this.f46015e = (TextView) view.findViewById(R.id.gameVoucherPrice);
            this.f46016f = (TextView) view.findViewById(R.id.gameVoucherConsume);
            this.f46017g = (SimpleDraweeView) view.findViewById(R.id.mgListviewItemIcon);
        }
    }

    public x2(List<Object> list, Context context) {
        this.f45997b = list;
        this.f45998c = context;
        this.f45999d = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45997b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f45997b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return getItem(i4) instanceof AccountVoucher ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        d dVar;
        c cVar;
        try {
            int itemViewType = getItemViewType(i4);
            this.f46000e = itemViewType;
            d dVar2 = null;
            if (view == null) {
                if (itemViewType == 0) {
                    view = this.f45999d.inflate(R.layout.my_voucher_item, (ViewGroup) null);
                    dVar = new d(view);
                    view.setTag(dVar);
                    dVar2 = dVar;
                    cVar = null;
                } else if (itemViewType != 1) {
                    cVar = null;
                } else {
                    view = this.f45999d.inflate(R.layout.my_no_voucher_item, (ViewGroup) null);
                    cVar = new c(view);
                    view.setTag(cVar);
                }
            } else if (itemViewType != 0) {
                if (itemViewType == 1) {
                    cVar = (c) view.getTag();
                }
                cVar = null;
            } else {
                dVar = (d) view.getTag();
                dVar2 = dVar;
                cVar = null;
            }
            int i5 = this.f46000e;
            if (i5 != 0) {
                if (i5 == 1 && (this.f45997b.get(i4) instanceof AccountVoucherGameBean)) {
                    AccountVoucherGameBean accountVoucherGameBean = (AccountVoucherGameBean) this.f45997b.get(i4);
                    cVar.f46005a.setText(accountVoucherGameBean.getCoupon_title());
                    int coupon_type = accountVoucherGameBean.getCoupon_type();
                    if (coupon_type == 1) {
                        cVar.f46006b.setVisibility(0);
                        cVar.f46007c.setVisibility(0);
                        cVar.f46008d.setPadding(0, 0, 0, com.join.mgps.Util.c0.a(this.f45998c, 15.0f));
                    } else if (coupon_type == 2) {
                        cVar.f46006b.setVisibility(8);
                        cVar.f46007c.setVisibility(8);
                        cVar.f46008d.setPadding(0, 0, 0, 0);
                    }
                    cVar.f46006b.setText("￥" + accountVoucherGameBean.getCoupon_money());
                    cVar.f46007c.setText(String.format(this.f45998c.getString(R.string.voucher_surplus), Integer.valueOf(accountVoucherGameBean.getCoupon_surplus())));
                    cVar.f46009e.setOnClickListener(new b(accountVoucherGameBean));
                }
            } else if (this.f45997b.get(i4) instanceof AccountVoucher) {
                AccountVoucher accountVoucher = (AccountVoucher) this.f45997b.get(i4);
                dVar2.f46011a.setText(accountVoucher.getGame_name());
                MyImageLoader.h(dVar2.f46017g, accountVoucher.getGame_icon());
                dVar2.f46016f.setText(Html.fromHtml(String.format(this.f45998c.getResources().getString(R.string.voucher_consume_price), "<font color = '#D33D3E'>" + accountVoucher.getStatus().getUsed().getMoney() + "</font>")));
                dVar2.f46015e.setText(Html.fromHtml(String.format(this.f45998c.getResources().getString(R.string.voucher_use_price), "<font color = '#D33D3E'>" + accountVoucher.getStatus().getAvailable().getCount() + "</font>", "<font color = '#D33D3E'>" + accountVoucher.getStatus().getAvailable().getMoney() + "</font>")));
                view.setOnClickListener(new a(accountVoucher));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
