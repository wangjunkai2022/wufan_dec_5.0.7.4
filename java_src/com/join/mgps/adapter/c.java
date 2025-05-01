package com.join.mgps.adapter;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.GiftsDetailActivity_;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import java.util.List;
/* compiled from: CodesBoxAdapter.java */
/* loaded from: classes4.dex */
public class c extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    ExtBean f44222b;

    /* renamed from: c  reason: collision with root package name */
    private Context f44223c;

    /* renamed from: d  reason: collision with root package name */
    private List<GiftPackageDataInfoBean> f44224d;

    /* compiled from: CodesBoxAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f44225b;

        a(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f44225b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(c.this.f44223c).getAccountData();
            if (accountData != null) {
                GiftsDetailActivity_.P0(c.this.f44223c).c(this.f44225b).a(accountData.getUid()).start();
            }
        }
    }

    /* compiled from: CodesBoxAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f44227b;

        b(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f44227b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44227b.getGift_package_status() == 1) {
                if (this.f44227b.getGift_package_overdue() == 1) {
                    com.join.mgps.Util.l2.a(c.this.f44223c).b("该礼包已过期");
                    return;
                }
                ((ClipboardManager) c.this.f44223c.getSystemService("clipboard")).setText(this.f44227b.getGift_package_code());
                com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(c.this.f44223c);
                a5.b(this.f44227b.getGift_package_code() + "已复制到剪贴板");
            }
        }
    }

    /* compiled from: CodesBoxAdapter.java */
    /* renamed from: com.join.mgps.adapter.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0341c {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f44229a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f44230b;

        /* renamed from: c  reason: collision with root package name */
        TextView f44231c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44232d;

        /* renamed from: e  reason: collision with root package name */
        TextView f44233e;

        /* renamed from: f  reason: collision with root package name */
        TextView f44234f;

        C0341c() {
        }
    }

    public c(Context context) {
        this.f44223c = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44224d.size();
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
        View view2;
        C0341c c0341c;
        if (view == null) {
            c0341c = new C0341c();
            view2 = LayoutInflater.from(this.f44223c).inflate(R.layout.codes_box_item, (ViewGroup) null);
            c0341c.f44229a = (LinearLayout) view2.findViewById(R.id.layoutItem);
            c0341c.f44230b = (SimpleDraweeView) view2.findViewById(R.id.giftIcon);
            c0341c.f44231c = (TextView) view2.findViewById(R.id.giftNameTv);
            c0341c.f44232d = (TextView) view2.findViewById(R.id.giftNameTime);
            c0341c.f44233e = (TextView) view2.findViewById(R.id.saveCodeContent);
            c0341c.f44234f = (TextView) view2.findViewById(R.id.saveCodeTv);
            view2.setTag(c0341c);
        } else {
            view2 = view;
            c0341c = (C0341c) view.getTag();
        }
        GiftPackageDataInfoBean giftPackageDataInfoBean = this.f44224d.get(i4);
        c0341c.f44231c.setText(giftPackageDataInfoBean.getGift_package_title());
        TextView textView = c0341c.f44232d;
        textView.setText(com.join.mgps.Util.y.x(giftPackageDataInfoBean.getGift_package_times_begin()) + " 至 " + com.join.mgps.Util.y.x(giftPackageDataInfoBean.getGift_package_times_end()));
        c0341c.f44233e.setText(giftPackageDataInfoBean.getGift_package_code());
        c0341c.f44230b.setImageDrawable(this.f44223c.getResources().getDrawable(R.drawable.banner_normal_icon));
        MyImageLoader.f(c0341c.f44230b, R.drawable.banner_normal_icon, giftPackageDataInfoBean.getGift_package_pic(), MyImageLoader.D(this.f44223c));
        if (giftPackageDataInfoBean.getGift_package_status() == 1) {
            if (giftPackageDataInfoBean.getGift_package_overdue() == 1) {
                c0341c.f44234f.setText("已过期");
                c0341c.f44234f.setTextColor(-7763575);
                c0341c.f44234f.setBackgroundResource(R.drawable.recom_grey_butn);
            } else {
                c0341c.f44234f.setText("复制");
                c0341c.f44234f.setTextColor(-358375);
                c0341c.f44234f.setBackgroundResource(R.drawable.recom_maincolor_butn);
            }
        } else {
            c0341c.f44234f.setText("领取");
            c0341c.f44234f.setTextColor(-358375);
            c0341c.f44234f.setBackgroundResource(R.drawable.recom_maincolor_butn);
        }
        c0341c.f44229a.setOnClickListener(new a(giftPackageDataInfoBean));
        c0341c.f44234f.setOnClickListener(new b(giftPackageDataInfoBean));
        return view2;
    }

    public c(Context context, List<GiftPackageDataInfoBean> list) {
        this.f44223c = context;
        this.f44224d = list;
    }
}
