package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.List;
/* compiled from: MustPlayAdapter.java */
/* loaded from: classes4.dex */
public class d2 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44278b;

    /* renamed from: c  reason: collision with root package name */
    private List<v1.c> f44279c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f44280d;

    /* compiled from: MustPlayAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f44281b;

        a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44281b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(d2.this.f44278b, this.f44281b.getIntentDataBean());
        }
    }

    /* compiled from: MustPlayAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f44283b;

        b(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44283b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(d2.this.f44278b, this.f44283b.getIntentDataBean());
        }
    }

    /* compiled from: MustPlayAdapter.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f44285b;

        c(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44285b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(d2.this.f44278b, this.f44285b.getIntentDataBean());
        }
    }

    /* compiled from: MustPlayAdapter.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f44287b;

        d(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44287b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(d2.this.f44278b, this.f44287b.getIntentDataBean());
        }
    }

    /* compiled from: MustPlayAdapter.java */
    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f44289b;

        public e(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44289b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44289b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f44289b.getTag_info())) {
                    if (this.f44289b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(d2.this.f44278b).d(d2.this.f44278b, this.f44289b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(d2.this.f44278b).l(d2.this.f44278b, this.f44289b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44289b.getVer()) || l4.d() >= Integer.parseInt(this.f44289b.getVer())) {
                                com.join.android.app.common.utils.e.l0(d2.this.f44278b);
                                APKUtils.a0(d2.this.f44278b, this.f44289b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(d2.this.f44278b).d(d2.this.f44278b, this.f44289b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44289b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(d2.this.f44278b);
                            APKUtils.V(d2.this.f44278b, this.f44289b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(d2.this.f44278b, this.f44289b);
                return;
            }
            if ((ConstantIntEnum.H5.value() + "").equals(this.f44289b.getPlugin_num())) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44289b.getDown_url_remote());
                UtilsMy.T2(downloadTask, d2.this.f44278b);
                IntentUtil.getInstance().intentActivity(d2.this.f44278b, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            CollectionBeanSubBusiness collectionBeanSubBusiness = this.f44289b;
            if (collectionBeanSubBusiness != null && UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), this.f44289b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(d2.this.f44278b, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(d2.this.f44278b, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(d2.this.f44278b)) {
                                        com.join.mgps.Util.l2.a(d2.this.f44278b).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(d2.this.f44278b, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(d2.this.f44278b)) {
                                                com.join.mgps.Util.l2.a(d2.this.f44278b).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(d2.this.f44278b, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, d2.this.f44278b);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, d2.this.f44278b);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f44289b;
            if (collectionBeanSubBusiness2 != null) {
                if (UtilsMy.y0(collectionBeanSubBusiness2.getPay_tag_info(), this.f44289b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(d2.this.f44278b, downloadTask.getCrc_link_type_val());
                    return;
                }
                UtilsMy.y1(downloadTask, this.f44289b);
                if (UtilsMy.o1(d2.this.f44278b, downloadTask)) {
                    return;
                }
                if (this.f44289b.getDown_status() == 5) {
                    UtilsMy.l1(d2.this.f44278b, downloadTask);
                } else {
                    UtilsMy.R0(d2.this.f44278b, downloadTask, this.f44289b.getTp_down_url(), this.f44289b.getOther_down_switch(), this.f44289b.getCdn_down_switch());
                }
            }
        }
    }

    /* compiled from: MustPlayAdapter.java */
    /* loaded from: classes4.dex */
    class f {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f44291a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f44292b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f44293c;

        /* renamed from: d  reason: collision with root package name */
        private LinearLayout f44294d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f44295e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f44296f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f44297g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f44298h;

        /* renamed from: i  reason: collision with root package name */
        private SimpleDraweeView f44299i;

        /* renamed from: j  reason: collision with root package name */
        private SimpleDraweeView f44300j;

        /* renamed from: k  reason: collision with root package name */
        private SimpleDraweeView f44301k;

        /* renamed from: l  reason: collision with root package name */
        private SimpleDraweeView f44302l;

        /* renamed from: m  reason: collision with root package name */
        private TextView f44303m;

        /* renamed from: n  reason: collision with root package name */
        private TextView f44304n;

        /* renamed from: o  reason: collision with root package name */
        private TextView f44305o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f44306p;

        f() {
        }
    }

    /* compiled from: MustPlayAdapter.java */
    /* loaded from: classes4.dex */
    class g {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44308a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f44309b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f44310c;

        g() {
        }
    }

    public d2(Context context, List<v1.c> list) {
        this.f44278b = context;
        this.f44279c = list;
        this.f44280d = LayoutInflater.from(context);
    }

    private void b(CollectionBeanSubBusiness collectionBeanSubBusiness, TextView textView) {
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        if (downloadTask == null) {
            if ((ConstantIntEnum.H5.value() + "").equals(collectionBeanSubBusiness.getPlugin_num())) {
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
                textView.setText("开始");
                textView.setTextColor(this.f44278b.getResources().getColor(R.color.app_blue_color));
                return;
            } else if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                boolean d5 = com.join.android.app.common.utils.e.l0(this.f44278b).d(this.f44278b, collectionBeanSubBusiness.getPackage_name());
                if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                    d5 = false;
                }
                if (d5) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44278b).l(this.f44278b, collectionBeanSubBusiness.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                        textView.setBackgroundResource(R.drawable.recom_green_butn);
                        textView.setText("更新");
                        textView.setTextColor(-9263087);
                        return;
                    }
                    textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                    textView.setText(this.f44278b.getResources().getString(R.string.download_status_finished));
                    textView.setTextColor(-688602);
                    return;
                }
                textView.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                UtilsMy.d3(textView, collectionBeanSubBusiness);
                return;
            } else {
                textView.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                UtilsMy.d3(textView, collectionBeanSubBusiness);
                return;
            }
        }
        com.join.mgps.Util.v0.d("infoo", downloadTask.getStatus() + " dd " + downloadTask.getShowName());
        int status = downloadTask.getStatus();
        if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 27) {
                textView.setText("暂停中");
                return;
            } else if (status == 48) {
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
                textView.setText("安装中");
                textView.setTextColor(-12941854);
                return;
            } else if (status != 2) {
                if (status != 3) {
                    if (status != 5) {
                        if (status != 6) {
                            if (status != 7) {
                                if (status != 42) {
                                    if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                textView.setText("更新");
                                                textView.setTextColor(-9263087);
                                                return;
                                            case 10:
                                                textView.setBackgroundResource(R.drawable.recom_blue_butn);
                                                textView.setText("等待");
                                                textView.setTextColor(-12941854);
                                                return;
                                            case 11:
                                                textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                textView.setText("安装");
                                                textView.setTextColor(-9263087);
                                                return;
                                            case 12:
                                                textView.setBackgroundResource(R.drawable.extract);
                                                textView.setText("解压中");
                                                textView.setTextColor(-4868683);
                                                return;
                                            case 13:
                                                textView.setBackgroundResource(R.drawable.reextract);
                                                textView.setText("解压");
                                                textView.setTextColor(-12941854);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                    textView.setText(this.f44278b.getResources().getString(R.string.download_status_finished));
                    textView.setTextColor(-688602);
                    return;
                }
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
                textView.setText("继续");
                textView.setTextColor(-12941854);
                return;
            } else {
                UtilsMy.x4(downloadTask);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
                textView.setText("暂停");
                textView.setTextColor(-12941854);
                return;
            }
        }
        textView.setBackgroundResource(R.drawable.recom_green_butn);
        UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
        UtilsMy.d3(textView, collectionBeanSubBusiness);
    }

    public void c(List<v1.c> list) {
        this.f44279c = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44279c.size() + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return (i4 == this.f44279c.size() || this.f44279c.get(i4).c()) ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        f fVar;
        f fVar2;
        List<CollectionBeanSubBusiness> a5;
        int itemViewType = getItemViewType(i4);
        g gVar = null;
        if (view == null) {
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    f fVar3 = new f();
                    View inflate = this.f44280d.inflate(R.layout.must_play_app_layout, viewGroup, false);
                    fVar3.f44291a = (LinearLayout) inflate.findViewById(R.id.layout1);
                    fVar3.f44292b = (LinearLayout) inflate.findViewById(R.id.layout2);
                    fVar3.f44293c = (LinearLayout) inflate.findViewById(R.id.layout3);
                    fVar3.f44294d = (LinearLayout) inflate.findViewById(R.id.layout4);
                    fVar3.f44295e = (TextView) inflate.findViewById(R.id.appName1);
                    fVar3.f44296f = (TextView) inflate.findViewById(R.id.appName2);
                    fVar3.f44297g = (TextView) inflate.findViewById(R.id.appName3);
                    fVar3.f44298h = (TextView) inflate.findViewById(R.id.appName4);
                    fVar3.f44299i = (SimpleDraweeView) inflate.findViewById(R.id.appIcon1);
                    fVar3.f44300j = (SimpleDraweeView) inflate.findViewById(R.id.appIcon2);
                    fVar3.f44301k = (SimpleDraweeView) inflate.findViewById(R.id.appIcon3);
                    fVar3.f44302l = (SimpleDraweeView) inflate.findViewById(R.id.appIcon4);
                    fVar3.f44303m = (TextView) inflate.findViewById(R.id.appButn1);
                    fVar3.f44304n = (TextView) inflate.findViewById(R.id.appButn2);
                    fVar3.f44305o = (TextView) inflate.findViewById(R.id.appButn3);
                    fVar3.f44306p = (TextView) inflate.findViewById(R.id.appButn4);
                    inflate.setTag(fVar3);
                    fVar2 = fVar3;
                    view = inflate;
                }
                fVar2 = null;
            } else {
                g gVar2 = new g();
                View inflate2 = this.f44280d.inflate(R.layout.must_play_title_layout, viewGroup, false);
                gVar2.f44308a = (TextView) inflate2.findViewById(R.id.titleName);
                gVar2.f44309b = (TextView) inflate2.findViewById(R.id.titleline);
                gVar2.f44310c = (LinearLayout) inflate2.findViewById(R.id.section_follow);
                inflate2.setTag(gVar2);
                fVar = null;
                gVar = gVar2;
                view = inflate2;
                fVar2 = fVar;
            }
        } else if (itemViewType != 0) {
            if (itemViewType == 1) {
                fVar2 = (f) view.getTag();
            }
            fVar2 = null;
        } else {
            fVar = null;
            gVar = (g) view.getTag();
            fVar2 = fVar;
        }
        if (i4 == 0 && itemViewType == 0) {
            gVar.f44309b.setVisibility(8);
            gVar.f44310c.setVisibility(0);
        } else if (itemViewType == 0 && i4 == this.f44279c.size()) {
            gVar.f44309b.setVisibility(0);
            gVar.f44310c.setVisibility(8);
            return view;
        } else if (itemViewType == 0) {
            gVar.f44309b.setVisibility(0);
            gVar.f44310c.setVisibility(0);
        }
        v1.c cVar = this.f44279c.get(i4);
        if (itemViewType == 0) {
            gVar.f44308a.setText(cVar.b());
        } else if (itemViewType == 1 && (a5 = cVar.a()) != null) {
            fVar2.f44291a.setVisibility(4);
            fVar2.f44292b.setVisibility(4);
            fVar2.f44293c.setVisibility(4);
            fVar2.f44294d.setVisibility(4);
            for (int i5 = 0; i5 < a5.size(); i5++) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = a5.get(i5);
                if (i5 == 0) {
                    fVar2.f44291a.setVisibility(0);
                    MyImageLoader.h(fVar2.f44299i, collectionBeanSubBusiness.getIco_remote());
                    fVar2.f44295e.setText(collectionBeanSubBusiness.getGame_name());
                    b(collectionBeanSubBusiness, fVar2.f44303m);
                    fVar2.f44303m.setOnClickListener(new e(collectionBeanSubBusiness));
                    fVar2.f44299i.setOnClickListener(new a(collectionBeanSubBusiness));
                } else if (i5 == 1) {
                    fVar2.f44292b.setVisibility(0);
                    MyImageLoader.h(fVar2.f44300j, collectionBeanSubBusiness.getIco_remote());
                    fVar2.f44296f.setText(collectionBeanSubBusiness.getGame_name());
                    b(collectionBeanSubBusiness, fVar2.f44304n);
                    fVar2.f44304n.setOnClickListener(new e(collectionBeanSubBusiness));
                    fVar2.f44300j.setOnClickListener(new b(collectionBeanSubBusiness));
                } else if (i5 == 2) {
                    fVar2.f44293c.setVisibility(0);
                    MyImageLoader.h(fVar2.f44301k, collectionBeanSubBusiness.getIco_remote());
                    fVar2.f44297g.setText(collectionBeanSubBusiness.getGame_name());
                    b(collectionBeanSubBusiness, fVar2.f44305o);
                    fVar2.f44305o.setOnClickListener(new e(collectionBeanSubBusiness));
                    fVar2.f44301k.setOnClickListener(new c(collectionBeanSubBusiness));
                } else if (i5 == 3) {
                    fVar2.f44294d.setVisibility(0);
                    MyImageLoader.h(fVar2.f44302l, collectionBeanSubBusiness.getIco_remote());
                    fVar2.f44298h.setText(collectionBeanSubBusiness.getGame_name());
                    b(collectionBeanSubBusiness, fVar2.f44306p);
                    fVar2.f44306p.setOnClickListener(new e(collectionBeanSubBusiness));
                    fVar2.f44302l.setOnClickListener(new d(collectionBeanSubBusiness));
                }
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
