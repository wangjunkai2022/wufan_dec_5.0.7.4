package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
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
import java.util.ArrayList;
import java.util.List;
/* compiled from: CollectionAdapter.java */
/* loaded from: classes4.dex */
public class e extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44324b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f44325c;

    /* renamed from: d  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f44326d = new ArrayList(0);

    /* compiled from: CollectionAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f44327b;

        public a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44327b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44327b.isCpsGame() && com.join.mgps.Util.s0.c() && com.join.mgps.Util.s0.a(this.f44327b.getTag_info())) {
                com.join.mgps.Util.s0.b();
                return;
            }
            DownloadTask downloadTask = this.f44327b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f44327b.getTag_info())) {
                    if (this.f44327b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(e.this.f44324b).d(e.this.f44324b, this.f44327b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(e.this.f44324b).l(e.this.f44324b, this.f44327b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44327b.getVer()) || l4.d() >= Integer.parseInt(this.f44327b.getVer())) {
                                com.join.android.app.common.utils.e.l0(e.this.f44324b);
                                APKUtils.a0(e.this.f44324b, this.f44327b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(e.this.f44324b).d(e.this.f44324b, this.f44327b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44327b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(e.this.f44324b);
                            APKUtils.V(e.this.f44324b, this.f44327b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(e.this.f44324b, this.f44327b);
                return;
            }
            String plugin_num = this.f44327b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44327b.getDown_url_remote());
                UtilsMy.T2(downloadTask, e.this.f44324b);
                IntentUtil.getInstance().intentActivity(e.this.f44324b, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f44327b.getPay_tag_info(), this.f44327b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(e.this.f44324b, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(e.this.f44324b, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(e.this.f44324b)) {
                                        com.join.mgps.Util.l2.a(e.this.f44324b).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(e.this.f44324b, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(e.this.f44324b)) {
                                                com.join.mgps.Util.l2.a(e.this.f44324b).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(e.this.f44324b, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, e.this.f44324b);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, e.this.f44324b);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness = this.f44327b;
            if (collectionBeanSubBusiness != null) {
                if (UtilsMy.y0(collectionBeanSubBusiness.getPay_tag_info(), this.f44327b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(e.this.f44324b, downloadTask.getCrc_link_type_val());
                    return;
                }
                UtilsMy.y1(downloadTask, this.f44327b);
                if (UtilsMy.o1(e.this.f44324b, downloadTask)) {
                    return;
                }
                if (this.f44327b.getDown_status() == 5) {
                    UtilsMy.l1(e.this.f44324b, downloadTask);
                } else {
                    UtilsMy.R0(e.this.f44324b, downloadTask, this.f44327b.getTp_down_url(), this.f44327b.getOther_down_switch(), this.f44327b.getCdn_down_switch());
                }
            }
        }
    }

    /* compiled from: CollectionAdapter.java */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44329a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f44330b;

        /* renamed from: c  reason: collision with root package name */
        TextView f44331c;

        /* renamed from: d  reason: collision with root package name */
        RelativeLayout f44332d;

        /* renamed from: e  reason: collision with root package name */
        TextView f44333e;

        /* renamed from: f  reason: collision with root package name */
        View f44334f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f44335g;

        /* renamed from: h  reason: collision with root package name */
        LinearLayout f44336h;

        /* renamed from: i  reason: collision with root package name */
        LinearLayout f44337i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f44338j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f44339k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f44340l;

        /* renamed from: m  reason: collision with root package name */
        public ProgressBar f44341m;

        public b() {
        }
    }

    public e(Context context) {
        this.f44324b = context;
        this.f44325c = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public CollectionBeanSubBusiness getItem(int i4) {
        return this.f44326d.get(i4);
    }

    public List<CollectionBeanSubBusiness> c() {
        return this.f44326d;
    }

    void d(b bVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            bVar.f44336h.setVisibility(8);
            bVar.f44340l.setVisibility(8);
            bVar.f44341m.setVisibility(8);
            bVar.f44337i.setVisibility(0);
            bVar.f44335g.setVisibility(0);
            return;
        }
        bVar.f44336h.setVisibility(0);
        if (bool2.booleanValue()) {
            bVar.f44340l.setVisibility(8);
            bVar.f44341m.setVisibility(0);
        } else {
            bVar.f44341m.setVisibility(8);
            bVar.f44340l.setVisibility(0);
        }
        bVar.f44337i.setVisibility(8);
        bVar.f44335g.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44326d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        View view2;
        long j4;
        if (view == null) {
            View inflate = this.f44325c.inflate(R.layout.app_listview_item, (ViewGroup) null);
            b bVar2 = new b();
            bVar2.f44329a = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
            bVar2.f44330b = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
            bVar2.f44331c = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
            bVar2.f44332d = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
            bVar2.f44333e = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
            bVar2.f44335g = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
            bVar2.f44336h = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
            bVar2.f44337i = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
            bVar2.f44338j = (TextView) inflate.findViewById(R.id.appSize);
            bVar2.f44339k = (TextView) inflate.findViewById(R.id.loding_info);
            bVar2.f44340l = (ProgressBar) inflate.findViewById(R.id.progressBar);
            bVar2.f44341m = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
            bVar2.f44334f = inflate.findViewById(R.id.line);
            inflate.setTag(bVar2);
            bVar = bVar2;
            view2 = inflate;
        } else {
            bVar = (b) view.getTag();
            view2 = view;
        }
        bVar.f44334f.setVisibility(0);
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f44326d.get(i4);
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
            bVar.f44330b.setVisibility(0);
        } else {
            bVar.f44330b.setVisibility(8);
        }
        bVar.f44331c.setText(collectionBeanSubBusiness.getGame_name());
        bVar.f44335g.setText(collectionBeanSubBusiness.getInfo());
        try {
            j4 = (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d);
        } catch (Exception e5) {
            e5.printStackTrace();
            j4 = 0;
        }
        MyImageLoader.h(bVar.f44329a, collectionBeanSubBusiness.getIco_remote().trim());
        UtilsMy.I(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness.getTag_info(), bVar.f44337i, this.f44324b);
        UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view2, downloadTask);
        if (collectionBeanSubBusiness.isCpsGame() && com.join.mgps.Util.s0.c() && com.join.mgps.Util.s0.a(collectionBeanSubBusiness.getTag_info())) {
            bVar.f44333e.setBackgroundResource(R.drawable.recom_maincolor_butn);
            bVar.f44333e.setText(this.f44324b.getResources().getString(R.string.download_status_finished));
            bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_main_color));
        } else {
            String plugin_num = collectionBeanSubBusiness.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                bVar.f44333e.setBackgroundResource(R.drawable.recom_blue_butn);
                bVar.f44333e.setText("开始");
                bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_blue_color));
                bVar.f44337i.setVisibility(8);
                bVar.f44330b.setVisibility(8);
            } else if (downloadTask == null) {
                d(bVar, Boolean.TRUE, Boolean.FALSE);
                if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                    boolean d5 = com.join.android.app.common.utils.e.l0(this.f44324b).d(this.f44324b, collectionBeanSubBusiness.getPackage_name());
                    if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                        d5 = false;
                    }
                    if (d5) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44324b).l(this.f44324b, collectionBeanSubBusiness.getPackage_name());
                        if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                            bVar.f44333e.setBackgroundResource(R.drawable.recom_green_butn);
                            bVar.f44333e.setText("更新");
                            bVar.f44333e.setTextColor(-9263087);
                        } else {
                            bVar.f44333e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            bVar.f44333e.setText(this.f44324b.getResources().getString(R.string.download_status_finished));
                            bVar.f44333e.setTextColor(-688602);
                        }
                    } else {
                        bVar.f44333e.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                        UtilsMy.Z2(bVar.f44333e, bVar.f44332d, collectionBeanSubBusiness);
                    }
                } else {
                    bVar.f44333e.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                    UtilsMy.Z2(bVar.f44333e, bVar.f44332d, collectionBeanSubBusiness);
                }
            } else {
                com.join.mgps.Util.v0.d("infoo", downloadTask.getStatus() + " dd " + downloadTask.getShowName());
                int status = downloadTask.getStatus();
                if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        bVar.f44333e.setText("暂停中");
                    } else if (status == 48) {
                        bVar.f44333e.setBackgroundResource(R.drawable.recom_blue_butn);
                        bVar.f44333e.setText("安装中");
                        bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_blue_color));
                        d(bVar, Boolean.TRUE, Boolean.FALSE);
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        bVar.f44333e.setBackgroundResource(R.drawable.recom_green_butn);
                                                        bVar.f44333e.setText("更新");
                                                        bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_green_color));
                                                        d(bVar, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 10:
                                                        bVar.f44333e.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        bVar.f44333e.setText("等待");
                                                        bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_blue_color));
                                                        Boolean bool = Boolean.FALSE;
                                                        d(bVar, bool, bool);
                                                        TextView textView = bVar.f44338j;
                                                        textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(j4));
                                                        try {
                                                            bVar.f44340l.setProgress((int) downloadTask.getProgress());
                                                        } catch (Exception e6) {
                                                            e6.printStackTrace();
                                                        }
                                                        bVar.f44339k.setText("等待中");
                                                        break;
                                                    case 11:
                                                        bVar.f44333e.setBackgroundResource(R.drawable.recom_green_butn);
                                                        bVar.f44333e.setText("安装");
                                                        bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_green_color));
                                                        d(bVar, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 12:
                                                        d(bVar, Boolean.FALSE, Boolean.TRUE);
                                                        TextView textView2 = bVar.f44338j;
                                                        textView2.setText(UtilsMy.a(j4) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(j4));
                                                        bVar.f44339k.setText("解压中..");
                                                        bVar.f44341m.setProgress((int) downloadTask.getProgress());
                                                        bVar.f44333e.setBackgroundResource(R.drawable.extract);
                                                        bVar.f44333e.setText("解压中");
                                                        bVar.f44333e.setTextColor(-4868683);
                                                        break;
                                                    case 13:
                                                        d(bVar, Boolean.FALSE, Boolean.TRUE);
                                                        TextView textView3 = bVar.f44338j;
                                                        textView3.setText(UtilsMy.a(j4) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(j4));
                                                        bVar.f44339k.setText("点击重新解压");
                                                        bVar.f44341m.setProgress((int) downloadTask.getProgress());
                                                        bVar.f44333e.setBackgroundResource(R.drawable.reextract);
                                                        bVar.f44333e.setText("解压");
                                                        bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_grey_color));
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            bVar.f44333e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            bVar.f44333e.setText(this.f44324b.getResources().getString(R.string.download_status_finished));
                            bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_main_color));
                            Boolean bool2 = Boolean.TRUE;
                            d(bVar, bool2, bool2);
                        }
                        bVar.f44333e.setBackgroundResource(R.drawable.recom_blue_butn);
                        bVar.f44333e.setText("继续");
                        bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_blue_color));
                        Boolean bool3 = Boolean.FALSE;
                        d(bVar, bool3, bool3);
                        try {
                            if (downloadTask.getSize() == 0) {
                                TextView textView4 = bVar.f44338j;
                                textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(j4));
                            } else {
                                TextView textView5 = bVar.f44338j;
                                textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(j4));
                            }
                            bVar.f44340l.setProgress((int) downloadTask.getProgress());
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        bVar.f44339k.setText("暂停中");
                    } else {
                        UtilsMy.x4(downloadTask);
                        bVar.f44333e.setBackgroundResource(R.drawable.recom_blue_butn);
                        bVar.f44333e.setText("暂停");
                        bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_blue_color));
                        Boolean bool4 = Boolean.FALSE;
                        d(bVar, bool4, bool4);
                        if (downloadTask.getSize() == 0) {
                            TextView textView6 = bVar.f44338j;
                            textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(j4));
                        } else {
                            TextView textView7 = bVar.f44338j;
                            textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(j4));
                        }
                        bVar.f44340l.setProgress((int) downloadTask.getProgress());
                        String speed = downloadTask.getSpeed();
                        TextView textView8 = bVar.f44339k;
                        textView8.setText(speed + "/S");
                    }
                }
                bVar.f44333e.setBackgroundResource(R.drawable.recom_blue_butn);
                UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                UtilsMy.Z2(bVar.f44333e, bVar.f44332d, collectionBeanSubBusiness);
                bVar.f44333e.setTextColor(this.f44324b.getResources().getColor(R.color.app_blue_color));
                d(bVar, Boolean.TRUE, Boolean.FALSE);
            }
        }
        bVar.f44332d.setOnClickListener(new a(collectionBeanSubBusiness));
        return view2;
    }
}
