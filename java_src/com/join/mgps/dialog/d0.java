package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CouponsData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: CouponDialog.java */
/* loaded from: classes4.dex */
public class d0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private boolean f49302b;

    /* renamed from: c  reason: collision with root package name */
    private int f49303c;

    /* renamed from: d  reason: collision with root package name */
    private Context f49304d;

    /* renamed from: e  reason: collision with root package name */
    private List<CouponsData> f49305e;

    /* renamed from: f  reason: collision with root package name */
    private c2.c f49306f;

    /* renamed from: g  reason: collision with root package name */
    Map<String, CouponsData> f49307g;

    /* renamed from: h  reason: collision with root package name */
    private Button f49308h;

    /* compiled from: CouponDialog.java */
    /* loaded from: classes4.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkBox);
            if (!checkBox.isChecked()) {
                int i5 = 0;
                for (String str : d0.this.f49307g.keySet()) {
                    i5 += d0.this.f49307g.get(str).getMoney();
                }
                if (i5 >= d0.this.f49303c) {
                    com.join.mgps.Util.l2.a(d0.this.f49304d).b("已足够支付!");
                    return;
                }
            }
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    /* compiled from: CouponDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d0.this.dismiss();
            if (d0.this.f49307g.size() == 0) {
                return;
            }
            int i4 = 0;
            for (String str : d0.this.f49307g.keySet()) {
                i4 += d0.this.f49307g.get(str).getMoney();
            }
            if (d0.this.f49302b || i4 >= d0.this.f49303c) {
                d0.this.f49306f.a(d0.this.f49307g);
            } else {
                com.join.mgps.Util.l2.a(d0.this.f49304d).b("金额不足");
            }
        }
    }

    /* compiled from: CouponDialog.java */
    /* loaded from: classes4.dex */
    class c extends BaseAdapter {

        /* compiled from: CouponDialog.java */
        /* loaded from: classes4.dex */
        class a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f49312a;

            a(int i4) {
                this.f49312a = i4;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                double d5;
                CouponsData couponsData = (CouponsData) d0.this.f49305e.get(this.f49312a);
                if (z4) {
                    d0.this.f49307g.put(couponsData.getId(), couponsData);
                } else {
                    d0.this.f49307g.remove(couponsData.getId());
                }
                int i4 = 0;
                for (String str : d0.this.f49307g.keySet()) {
                    i4 += d0.this.f49307g.get(str).getMoney();
                }
                Double.isNaN(Math.round(i4));
                d0.this.f49308h.setText("确认（已选择" + (d5 / 100.0d) + "元）");
            }
        }

        c() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return d0.this.f49305e.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            double d5;
            View inflate = LayoutInflater.from(d0.this.f49304d).inflate(R.layout.papa_coupon_item_layout, (ViewGroup) null);
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkBox);
            TextView textView = (TextView) inflate.findViewById(R.id.money);
            TextView textView2 = (TextView) inflate.findViewById(R.id.expireDate);
            Set<String> keySet = d0.this.f49307g.keySet();
            CouponsData couponsData = (CouponsData) d0.this.f49305e.get(i4);
            ((TextView) inflate.findViewById(R.id.couponName)).setText("名称:" + couponsData.getName());
            int money = couponsData.getMoney();
            if (keySet.contains(couponsData.getId())) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
            }
            Double.isNaN(Math.round(money));
            textView.setText(Html.fromHtml("金额:<font color='0xfc3f5e' >" + (d5 / 100.0d) + "</font>元"), TextView.BufferType.SPANNABLE);
            StringBuilder sb = new StringBuilder();
            sb.append("截至时间：");
            sb.append(couponsData.getExpire_date());
            textView2.setText(sb.toString());
            checkBox.setClickable(false);
            checkBox.setOnCheckedChangeListener(new a(i4));
            return inflate;
        }
    }

    public d0(Context context) {
        super(context);
        this.f49302b = false;
        this.f49307g = new HashMap();
        this.f49304d = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f49304d).inflate(R.layout.papa_coupon_dialog_layout, (ViewGroup) null);
        setContentView(inflate);
        ListView listView = (ListView) inflate.findViewById(R.id.listView);
        this.f49308h = (Button) inflate.findViewById(R.id.ok);
        listView.setAdapter((ListAdapter) new c());
        listView.setOnItemClickListener(new a());
        this.f49308h.setOnClickListener(new b());
    }

    public d0(Context context, int i4, List<CouponsData> list, c2.c cVar, int i5, boolean z4) {
        super(context, i4);
        this.f49302b = false;
        this.f49307g = new HashMap();
        this.f49304d = context;
        this.f49305e = list;
        this.f49306f = cVar;
        this.f49303c = i5;
        this.f49302b = z4;
        setOwnerActivity((Activity) context);
    }

    protected d0(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49302b = false;
        this.f49307g = new HashMap();
    }
}
