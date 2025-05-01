package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.PayTagInfo;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.TipNew;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: CollectionModuleSixAdapter.java */
/* loaded from: classes4.dex */
public class g extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44365b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f44366c;

    /* renamed from: d  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f44367d = new ArrayList(0);

    /* renamed from: e  reason: collision with root package name */
    com.danikula.videocache.i f44368e;

    /* renamed from: f  reason: collision with root package name */
    com.join.android.app.component.video.c f44369f;

    /* compiled from: CollectionModuleSixAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f44370b;

        public a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44370b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44370b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f44370b.getTag_info())) {
                    if (this.f44370b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(g.this.f44365b).d(g.this.f44365b, this.f44370b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(g.this.f44365b).l(g.this.f44365b, this.f44370b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44370b.getVer()) || l4.d() >= Integer.parseInt(this.f44370b.getVer())) {
                                com.join.android.app.common.utils.e.l0(g.this.f44365b);
                                APKUtils.a0(g.this.f44365b, this.f44370b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(g.this.f44365b).d(g.this.f44365b, this.f44370b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44370b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(g.this.f44365b);
                            APKUtils.V(g.this.f44365b, this.f44370b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(g.this.f44365b, this.f44370b);
                return;
            }
            String plugin_num = this.f44370b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44370b.getDown_url_remote());
                UtilsMy.T2(downloadTask, g.this.f44365b);
                IntentUtil.getInstance().intentActivity(g.this.f44365b, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f44370b.getPay_tag_info(), this.f44370b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(g.this.f44365b, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(g.this.f44365b, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(g.this.f44365b)) {
                                        com.join.mgps.Util.l2.a(g.this.f44365b).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(g.this.f44365b, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(g.this.f44365b)) {
                                                com.join.mgps.Util.l2.a(g.this.f44365b).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(g.this.f44365b, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, g.this.f44365b);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, g.this.f44365b);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness = this.f44370b;
            if (collectionBeanSubBusiness != null) {
                if (UtilsMy.y0(collectionBeanSubBusiness.getPay_tag_info(), this.f44370b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(g.this.f44365b, downloadTask.getCrc_link_type_val());
                    return;
                }
                UtilsMy.y1(downloadTask, this.f44370b);
                if (UtilsMy.o1(g.this.f44365b, downloadTask)) {
                    return;
                }
                if (this.f44370b.getDown_status() == 5) {
                    UtilsMy.l1(g.this.f44365b, downloadTask);
                } else {
                    UtilsMy.R0(g.this.f44365b, downloadTask, this.f44370b.getTp_down_url(), this.f44370b.getOther_down_switch(), this.f44370b.getCdn_down_switch());
                }
            }
        }
    }

    /* compiled from: CollectionModuleSixAdapter.java */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        View f44372a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f44373b;

        /* renamed from: c  reason: collision with root package name */
        FrameLayout f44374c;

        /* renamed from: d  reason: collision with root package name */
        SimpleDraweeView f44375d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f44376e;

        /* renamed from: f  reason: collision with root package name */
        TextView f44377f;

        /* renamed from: g  reason: collision with root package name */
        RelativeLayout f44378g;

        /* renamed from: h  reason: collision with root package name */
        TextView f44379h;

        /* renamed from: i  reason: collision with root package name */
        View f44380i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f44381j;

        /* renamed from: k  reason: collision with root package name */
        LinearLayout f44382k;

        /* renamed from: l  reason: collision with root package name */
        LinearLayout f44383l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f44384m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f44385n;

        /* renamed from: o  reason: collision with root package name */
        public ProgressBar f44386o;

        /* renamed from: p  reason: collision with root package name */
        public ProgressBar f44387p;

        public b() {
        }
    }

    public g(Context context, com.join.android.app.component.video.c cVar) {
        this.f44365b = context;
        this.f44369f = cVar;
        this.f44366c = LayoutInflater.from(context);
        this.f44368e = e(context);
    }

    void b(String str, int i4, String str2, TipNew tipNew, List<TipBean> list, LinearLayout linearLayout, Context context) {
        String str3;
        TipBean tipBean;
        TipBean tipBean2;
        if (com.join.mgps.Util.g2.h(str2)) {
            str2 = "1";
        }
        linearLayout.removeAllViews();
        TipBean tipBean3 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.six_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appType);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tongban);
        TextView textView3 = (TextView) inflate.findViewById(R.id.pingfen);
        ((TextView) inflate.findViewById(R.id.appdownCount)).setText(com.join.mgps.Util.g2.c(i4));
        ((TextView) inflate.findViewById(R.id.appsize)).setText(UtilsMy.J2((long) (Double.parseDouble(str2) * 1048576.0d)));
        if (tipNew != null) {
            if (tipNew.getModel() != null) {
                TipBean model = tipNew.getModel();
                if (!"7".equals(model.getId()) && !"23".equals(model.getId())) {
                    Iterator<TipBean> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        TipBean next = it2.next();
                        if (com.join.mgps.Util.g2.i(next.getId()) && !next.getId().equals(tipNew.getModel().getId())) {
                            tipBean3 = next;
                            break;
                        }
                    }
                    if (tipBean3 != null) {
                        textView.setText(tipNew.getModel().getName() + "·" + tipBean3.getName());
                    } else {
                        textView.setText(tipNew.getModel().getName());
                    }
                } else {
                    str3 = "安卓";
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (TipBean tipBean4 : list) {
                            if (tipBean4.getId() != null && !tipBean4.getId().equals("") && !tipBean4.getId().equals("44") && !tipBean4.getId().equals("45") && !tipBean4.getId().equals("47") && !tipBean4.getId().equals("48")) {
                                if (arrayList.size() >= 2) {
                                    break;
                                }
                                arrayList.add(tipBean4);
                            }
                        }
                        if (arrayList.size() > 1) {
                            TipBean tipBean5 = (TipBean) arrayList.get(0);
                            str3 = tipBean5 != null ? tipBean5.getName() : "安卓";
                            if (arrayList.size() > 1 && (tipBean2 = (TipBean) arrayList.get(1)) != null) {
                                str3 = str3 + "·" + tipBean2.getName();
                            }
                        } else if (arrayList.size() > 0 && (tipBean = (TipBean) arrayList.get(0)) != null) {
                            str3 = "安卓·" + tipBean.getName();
                        }
                    }
                    textView.setText(str3);
                }
            } else {
                textView.setVisibility(8);
            }
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        if (com.join.mgps.Util.g2.i(str) && !"0".equals(str)) {
            textView3.setText(str + "分");
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        linearLayout.addView(inflate);
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public CollectionBeanSubBusiness getItem(int i4) {
        return this.f44367d.get(i4);
    }

    public List<CollectionBeanSubBusiness> d() {
        return this.f44367d;
    }

    public com.danikula.videocache.i e(Context context) {
        return MApplication.m(context);
    }

    void f(TextView textView, RelativeLayout relativeLayout, int i4, PayTagInfo payTagInfo) {
        relativeLayout.setEnabled(true);
        boolean z4 = payTagInfo != null && payTagInfo.getAmount_check() > 0;
        if (i4 == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
        } else if (i4 == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            relativeLayout.setEnabled(false);
        } else {
            if (payTagInfo == null || payTagInfo.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, payTagInfo.getPayGameAmount()));
            }
            textView.setTextSize(2, 13.0f);
        }
    }

    void g(b bVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            bVar.f44382k.setVisibility(8);
            bVar.f44386o.setVisibility(8);
            bVar.f44387p.setVisibility(8);
            bVar.f44383l.setVisibility(0);
            return;
        }
        bVar.f44382k.setVisibility(0);
        if (bool2.booleanValue()) {
            bVar.f44386o.setVisibility(8);
            bVar.f44387p.setVisibility(0);
        } else {
            bVar.f44387p.setVisibility(8);
            bVar.f44386o.setVisibility(0);
        }
        bVar.f44383l.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44367d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        View view2;
        if (view == null) {
            View inflate = this.f44366c.inflate(R.layout.video_listview_item, (ViewGroup) null);
            bVar = new b();
            bVar.f44372a = inflate.findViewById(R.id.line_top);
            bVar.f44373b = (SimpleDraweeView) inflate.findViewById(R.id.bannerView);
            bVar.f44374c = (FrameLayout) inflate.findViewById(R.id.videoContner);
            bVar.f44375d = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
            bVar.f44376e = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
            bVar.f44377f = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
            bVar.f44378g = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
            bVar.f44379h = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
            bVar.f44381j = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
            bVar.f44382k = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
            bVar.f44383l = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
            bVar.f44384m = (TextView) inflate.findViewById(R.id.appSize);
            bVar.f44385n = (TextView) inflate.findViewById(R.id.loding_info);
            bVar.f44386o = (ProgressBar) inflate.findViewById(R.id.progressBar);
            bVar.f44387p = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
            bVar.f44380i = inflate.findViewById(R.id.line);
            inflate.setTag(bVar);
            view2 = inflate;
        } else {
            bVar = (b) view.getTag();
            view2 = view;
        }
        b bVar2 = bVar;
        if (i4 == 0) {
            bVar2.f44372a.setVisibility(8);
        } else {
            bVar2.f44372a.setVisibility(0);
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f44367d.get(i4);
        if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getGame_info_top_video_url())) {
            if (bVar2.f44374c != null) {
                MyImageLoader.h(bVar2.f44373b, collectionBeanSubBusiness.getGame_info_top_pic());
                String game_info_top_video_url = collectionBeanSubBusiness.getGame_info_top_video_url();
                int i5 = i4 + 1;
                bVar2.f44373b.setTag(Integer.valueOf(i5));
                if (com.join.mgps.Util.g2.i(game_info_top_video_url)) {
                    this.f44369f.e(i5, new c.l(i5, game_info_top_video_url, collectionBeanSubBusiness.getGame_info_top_pic()), new boolean[0]);
                }
            }
            MyImageLoader.d(bVar2.f44373b, R.drawable.banner_normal_icon, collectionBeanSubBusiness.getGame_info_top_pic());
        }
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
            bVar2.f44376e.setVisibility(0);
        } else {
            bVar2.f44376e.setVisibility(8);
        }
        bVar2.f44377f.setText(collectionBeanSubBusiness.getGame_name());
        bVar2.f44381j.setText(collectionBeanSubBusiness.getInfo());
        long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d);
        MyImageLoader.h(bVar2.f44375d, collectionBeanSubBusiness.getIco_remote().trim());
        collectionBeanSubBusiness.getTag_info();
        b(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness.getTag_info(), bVar2.f44383l, this.f44365b);
        UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view2, downloadTask);
        String plugin_num = collectionBeanSubBusiness.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            bVar2.f44379h.setText("开始");
            bVar2.f44383l.setVisibility(8);
            bVar2.f44376e.setVisibility(8);
        } else if (downloadTask == null) {
            g(bVar2, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0 ? false : com.join.android.app.common.utils.e.l0(this.f44365b).d(this.f44365b, collectionBeanSubBusiness.getPackage_name())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44365b).l(this.f44365b, collectionBeanSubBusiness.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                        bVar2.f44379h.setText("更新");
                    } else {
                        bVar2.f44379h.setText(this.f44365b.getResources().getString(R.string.download_status_finished));
                    }
                } else {
                    UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                    f(bVar2.f44379h, bVar2.f44378g, collectionBeanSubBusiness.getDown_status(), collectionBeanSubBusiness.getPay_tag_info());
                }
            } else {
                UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                f(bVar2.f44379h, bVar2.f44378g, collectionBeanSubBusiness.getDown_status(), collectionBeanSubBusiness.getPay_tag_info());
            }
        } else {
            com.join.mgps.Util.v0.d("infoo", downloadTask.getStatus() + " dd " + downloadTask.getShowName());
            int status = downloadTask.getStatus();
            if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    bVar2.f44379h.setText("暂停中");
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    bVar2.f44379h.setText("更新");
                                                    g(bVar2, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    bVar2.f44379h.setText("等待");
                                                    Boolean bool = Boolean.FALSE;
                                                    g(bVar2, bool, bool);
                                                    TextView textView = bVar2.f44384m;
                                                    textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    try {
                                                        bVar2.f44386o.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    bVar2.f44385n.setText("等待中");
                                                    break;
                                                case 11:
                                                    bVar2.f44379h.setText("安装");
                                                    g(bVar2, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    g(bVar2, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView2 = bVar2.f44384m;
                                                    textView2.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    bVar2.f44385n.setText("解压中..");
                                                    bVar2.f44387p.setProgress((int) downloadTask.getProgress());
                                                    bVar2.f44379h.setText("解压中");
                                                    break;
                                                case 13:
                                                    g(bVar2, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView3 = bVar2.f44384m;
                                                    textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    bVar2.f44385n.setText("点击重新解压");
                                                    bVar2.f44387p.setProgress((int) downloadTask.getProgress());
                                                    bVar2.f44379h.setText("解压");
                                                    break;
                                            }
                                        } else if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                                            bVar2.f44379h.setText(this.f44365b.getResources().getString(R.string.pay_game_amount, collectionBeanSubBusiness.getPay_tag_info().getPayGameAmount()));
                                        }
                                    }
                                }
                            }
                        }
                        bVar2.f44379h.setText(this.f44365b.getResources().getString(R.string.download_status_finished));
                        Boolean bool2 = Boolean.TRUE;
                        g(bVar2, bool2, bool2);
                    }
                    bVar2.f44379h.setText("继续");
                    Boolean bool3 = Boolean.FALSE;
                    g(bVar2, bool3, bool3);
                    try {
                        if (downloadTask.getSize() == 0) {
                            TextView textView4 = bVar2.f44384m;
                            textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView5 = bVar2.f44384m;
                            textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        bVar2.f44386o.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    bVar2.f44385n.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    bVar2.f44379h.setText("暂停");
                    Boolean bool4 = Boolean.FALSE;
                    g(bVar2, bool4, bool4);
                    if (downloadTask.getSize() == 0) {
                        TextView textView6 = bVar2.f44384m;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    } else {
                        TextView textView7 = bVar2.f44384m;
                        textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    }
                    bVar2.f44386o.setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    TextView textView8 = bVar2.f44385n;
                    textView8.setText(speed + "/S");
                }
            }
            UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
            f(bVar2.f44379h, bVar2.f44378g, collectionBeanSubBusiness.getDown_status(), collectionBeanSubBusiness.getPay_tag_info());
            bVar2.f44379h.setTextColor(this.f44365b.getResources().getColor(R.color.app_blue_color));
            g(bVar2, Boolean.TRUE, Boolean.FALSE);
        }
        bVar2.f44378g.setOnClickListener(new a(collectionBeanSubBusiness));
        return view2;
    }
}
