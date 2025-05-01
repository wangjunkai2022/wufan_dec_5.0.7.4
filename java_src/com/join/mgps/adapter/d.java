package com.join.mgps.adapter;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.GiftsDetailActivity_;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import java.util.List;
/* compiled from: CodesRecommendAdapter.java */
/* loaded from: classes4.dex */
public class d extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    ExtBean f44257b;

    /* renamed from: c  reason: collision with root package name */
    private Context f44258c;

    /* renamed from: d  reason: collision with root package name */
    private List<GiftPackageDataInfoBean> f44259d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f44260e;

    /* compiled from: CodesRecommendAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f44261b;

        a(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f44261b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(d.this.f44258c).getAccountData();
            if (accountData != null) {
                GiftsDetailActivity_.P0(d.this.f44258c).c(this.f44261b).a(accountData.getUid()).start();
            }
        }
    }

    /* compiled from: CodesRecommendAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f44263b;

        b(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f44263b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44263b.getGift_package_status() == 1) {
                if (this.f44263b.getGift_package_overdue() == 1) {
                    com.join.mgps.Util.l2.a(d.this.f44258c).b("该礼包已过期");
                    return;
                }
                ((ClipboardManager) d.this.f44258c.getSystemService("clipboard")).setText(this.f44263b.getGift_package_code());
                com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(d.this.f44258c);
                a5.b(this.f44263b.getGift_package_code() + "已复制到剪贴板");
                return;
            }
            Message message = new Message();
            message.what = 1;
            message.obj = this.f44263b;
            d.this.f44260e.sendMessage(message);
        }
    }

    /* compiled from: CodesRecommendAdapter.java */
    /* loaded from: classes4.dex */
    class c {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f44265a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f44266b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f44267c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44268d;

        /* renamed from: e  reason: collision with root package name */
        RelativeLayout f44269e;

        /* renamed from: f  reason: collision with root package name */
        TextView f44270f;

        /* renamed from: g  reason: collision with root package name */
        TextView f44271g;

        /* renamed from: h  reason: collision with root package name */
        TextView f44272h;

        /* renamed from: i  reason: collision with root package name */
        TextView f44273i;

        c() {
        }
    }

    public d(Context context) {
        this.f44258c = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44259d.size();
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
        c cVar;
        if (view == null) {
            cVar = new c();
            view2 = LayoutInflater.from(this.f44258c).inflate(R.layout.gameol_gift_listview_item, (ViewGroup) null);
            cVar.f44265a = (LinearLayout) view2.findViewById(R.id.linearLayout);
            cVar.f44266b = (SimpleDraweeView) view2.findViewById(R.id.mgListviewItemIcon);
            cVar.f44267c = (ImageView) view2.findViewById(R.id.giftPackageSwich);
            cVar.f44268d = (TextView) view2.findViewById(R.id.mgListviewItemAppname);
            cVar.f44269e = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
            cVar.f44270f = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
            cVar.f44271g = (TextView) view2.findViewById(R.id.GiftSurplus);
            cVar.f44272h = (TextView) view2.findViewById(R.id.GiftCount);
            cVar.f44273i = (TextView) view2.findViewById(R.id.GiftEndTime);
            view2.setTag(cVar);
        } else {
            view2 = view;
            cVar = (c) view.getTag();
        }
        GiftPackageDataInfoBean giftPackageDataInfoBean = this.f44259d.get(i4);
        MyImageLoader.f(cVar.f44266b, R.drawable.banner_normal_icon, giftPackageDataInfoBean.getGift_package_pic(), MyImageLoader.D(this.f44258c));
        cVar.f44267c.setVisibility(0);
        cVar.f44268d.setText(giftPackageDataInfoBean.getGift_package_title());
        TextView textView = cVar.f44271g;
        textView.setText(giftPackageDataInfoBean.getGift_package_surplus() + net.lingala.zip4j.util.e.F0);
        TextView textView2 = cVar.f44272h;
        textView2.setText(giftPackageDataInfoBean.getGift_package_count() + "");
        cVar.f44273i.setText(com.join.mgps.Util.y.D(giftPackageDataInfoBean.getGift_package_times_end() * 1000));
        if (giftPackageDataInfoBean.getGift_package_status() == 1) {
            if (giftPackageDataInfoBean.getGift_package_overdue() == 1) {
                cVar.f44270f.setText("已过期");
            } else {
                cVar.f44270f.setText("复制");
            }
        } else {
            cVar.f44270f.setText("领取");
        }
        cVar.f44265a.setOnClickListener(new a(giftPackageDataInfoBean));
        cVar.f44269e.setOnClickListener(new b(giftPackageDataInfoBean));
        return view2;
    }

    public d(Context context, List<GiftPackageDataInfoBean> list, Handler handler) {
        this.f44258c = context;
        this.f44259d = list;
        this.f44260e = handler;
    }
}
