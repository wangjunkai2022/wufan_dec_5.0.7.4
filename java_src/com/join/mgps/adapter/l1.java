package com.join.mgps.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.GameOLHeadAdBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameOLGiftPackageAdapter.java */
/* loaded from: classes4.dex */
public class l1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f44545b;

    /* renamed from: c  reason: collision with root package name */
    private Context f44546c;

    /* renamed from: d  reason: collision with root package name */
    private List<v1.a<GiftPackageDataInfoBean>> f44547d = new ArrayList(0);

    /* renamed from: e  reason: collision with root package name */
    private Handler f44548e;

    /* compiled from: GameOLGiftPackageAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameOLHeadAdBean f44549b;

        a(GameOLHeadAdBean gameOLHeadAdBean) {
            this.f44549b = gameOLHeadAdBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(l1.this.f44546c, this.f44549b.getSub().get(0).getIntentDataBean());
        }
    }

    /* compiled from: GameOLGiftPackageAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f44551b;

        b(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f44551b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44551b.getGift_package_status() == 0) {
                Message message = new Message();
                message.what = 1;
                message.obj = this.f44551b;
                l1.this.f44548e.sendMessage(message);
            } else if (this.f44551b.getGift_package_status() == 1) {
                Message message2 = new Message();
                message2.what = 2;
                message2.obj = this.f44551b;
                l1.this.f44548e.sendMessage(message2);
            }
        }
    }

    /* compiled from: GameOLGiftPackageAdapter.java */
    /* loaded from: classes4.dex */
    class c {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44553a;

        c() {
        }
    }

    /* compiled from: GameOLGiftPackageAdapter.java */
    /* loaded from: classes4.dex */
    class d {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44555a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f44556b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44557c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f44558d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f44559e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f44560f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f44561g;

        /* renamed from: h  reason: collision with root package name */
        private RelativeLayout f44562h;

        d() {
        }
    }

    /* compiled from: GameOLGiftPackageAdapter.java */
    /* loaded from: classes4.dex */
    class e {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44564a;

        e() {
        }
    }

    public l1(Context context, Handler handler) {
        this.f44545b = LayoutInflater.from(context);
        this.f44546c = context;
        this.f44548e = handler;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public v1.a<GiftPackageDataInfoBean> getItem(int i4) {
        return this.f44547d.get(i4);
    }

    public List<v1.a<GiftPackageDataInfoBean>> d() {
        return this.f44547d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44547d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f44547d.get(i4).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        e eVar;
        e eVar2;
        d dVar;
        d dVar2;
        int itemViewType = getItemViewType(i4);
        c cVar = null;
        if (view == null) {
            if (itemViewType == 0) {
                c cVar2 = new c();
                View inflate = this.f44545b.inflate(R.layout.gameol_top_ad_layout, (ViewGroup) null);
                cVar2.f44553a = (SimpleDraweeView) inflate.findViewById(R.id.adImage);
                inflate.setTag(cVar2);
                eVar = null;
                cVar = cVar2;
                view = inflate;
                eVar2 = eVar;
                dVar = eVar;
            } else if (itemViewType != 1) {
                if (itemViewType == 2) {
                    d dVar3 = new d();
                    View inflate2 = this.f44545b.inflate(R.layout.gameol_gift_listview_item, (ViewGroup) null);
                    dVar3.f44555a = (SimpleDraweeView) inflate2.findViewById(R.id.mgListviewItemIcon);
                    dVar3.f44556b = (ImageView) inflate2.findViewById(R.id.giftPackageSwich);
                    dVar3.f44558d = (TextView) inflate2.findViewById(R.id.mgListviewItemAppname);
                    dVar3.f44562h = (RelativeLayout) inflate2.findViewById(R.id.rLayoutRight);
                    dVar3.f44557c = (TextView) inflate2.findViewById(R.id.mgListviewItemInstall);
                    dVar3.f44559e = (TextView) inflate2.findViewById(R.id.GiftSurplus);
                    dVar3.f44560f = (TextView) inflate2.findViewById(R.id.GiftCount);
                    dVar3.f44561g = (TextView) inflate2.findViewById(R.id.GiftEndTime);
                    inflate2.setTag(dVar3);
                    dVar2 = dVar3;
                    view = inflate2;
                    eVar2 = null;
                    dVar = dVar2;
                }
                eVar2 = null;
                dVar = null;
            } else {
                e eVar3 = new e();
                View inflate3 = this.f44545b.inflate(R.layout.gameol_top_title_layout, (ViewGroup) null);
                eVar3.f44564a = (TextView) inflate3.findViewById(R.id.titleText);
                inflate3.setTag(eVar3);
                dVar = null;
                eVar2 = eVar3;
                view = inflate3;
            }
        } else if (itemViewType == 0) {
            eVar = null;
            cVar = (c) view.getTag();
            eVar2 = eVar;
            dVar = eVar;
        } else if (itemViewType != 1) {
            if (itemViewType == 2) {
                dVar2 = (d) view.getTag();
                eVar2 = null;
                dVar = dVar2;
            }
            eVar2 = null;
            dVar = null;
        } else {
            eVar2 = (e) view.getTag();
            dVar = null;
        }
        if (itemViewType == 0) {
            GameOLHeadAdBean b5 = this.f44547d.get(i4).b();
            MyImageLoader.d(cVar.f44553a, R.drawable.banner_normal_icon, b5.getMain().getPic_remote());
            cVar.f44553a.setOnClickListener(new a(b5));
        } else if (itemViewType == 1) {
            eVar2.f44564a.setText(this.f44547d.get(i4).e());
        } else if (itemViewType == 2) {
            GiftPackageDataInfoBean c5 = this.f44547d.get(i4).c();
            MyImageLoader.d(dVar.f44555a, R.drawable.main_normal_icon, c5.getGift_package_pic());
            dVar.f44556b.setVisibility(0);
            dVar.f44558d.setText(c5.getGift_package_title());
            dVar.f44559e.setText(c5.getGift_package_surplus() + net.lingala.zip4j.util.e.F0);
            dVar.f44560f.setText(c5.getGift_package_count() + "");
            dVar.f44561g.setText(com.join.mgps.Util.y.D(c5.getGift_package_times_end() * 1000));
            if (c5.getGift_package_status() == 0) {
                dVar.f44557c.setText("领取");
            } else {
                dVar.f44557c.setText("查看");
            }
            dVar.f44562h.setOnClickListener(new b(c5));
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
