package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
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
import com.join.mgps.activity.ImagePagerActivity;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.SearchResultAdinfo;
import com.join.mgps.enums.ConstantIntEnum;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SearchAppAdapter.java */
/* loaded from: classes4.dex */
public class y4 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f46064b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f46065c;

    /* renamed from: d  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f46066d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private String f46067e;

    /* renamed from: f  reason: collision with root package name */
    SearchResultAdinfo f46068f;

    /* renamed from: g  reason: collision with root package name */
    d f46069g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchAppAdapter.java */
    /* loaded from: classes4.dex */
    public class a implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f46070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f46071b;

        a(List list, CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f46070a = list;
            this.f46071b = collectionBeanSubBusiness;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                Intent intent = new Intent(y4.this.f46064b, ImagePagerActivity.class);
                String[] strArr = new String[this.f46070a.size()];
                for (int i5 = 0; i5 < this.f46070a.size(); i5++) {
                    strArr[i5] = (String) this.f46070a.get(i5);
                }
                if (com.join.mgps.Util.g2.i(this.f46071b.getVedio_url()) && i4 == 0) {
                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                    videoInfo.m(this.f46071b.getVedio_url());
                    videoInfo.h(strArr[0]);
                    FullScreenActivity_.i0(y4.this.f46064b).a(videoInfo).start();
                    return;
                }
                intent.putExtra("image_urls", strArr);
                intent.putExtra("image_index", i4);
                y4.this.f46064b.startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchAppAdapter.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f46073b;

        b(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f46073b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f46073b.getCrc_sign_id() != null) {
                IntentUtil.getInstance().goGameDetialActivity(y4.this.f46064b, this.f46073b.getCrc_sign_id(), this.f46073b.getGame_info_tpl_type(), this.f46073b.getSp_tpl_two_position(), 112);
                d dVar = y4.this.f46069g;
                if (dVar != null) {
                    dVar.e(this.f46073b.getCrc_sign_id());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchAppAdapter.java */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f46075b;

        public c(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f46075b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f46075b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f46075b.getTag_info())) {
                    if (this.f46075b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(y4.this.f46064b).d(y4.this.f46064b, this.f46075b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(y4.this.f46064b).l(y4.this.f46064b, this.f46075b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f46075b.getVer()) || l4.d() >= Integer.parseInt(this.f46075b.getVer())) {
                                com.join.android.app.common.utils.e.l0(y4.this.f46064b);
                                APKUtils.a0(y4.this.f46064b, this.f46075b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(y4.this.f46064b).d(y4.this.f46064b, this.f46075b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f46075b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(y4.this.f46064b);
                            APKUtils.V(y4.this.f46064b, this.f46075b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(y4.this.f46064b, this.f46075b);
                return;
            }
            String plugin_num = this.f46075b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f46075b.getDown_url_remote());
                UtilsMy.T2(downloadTask, y4.this.f46064b);
                IntentUtil.getInstance().intentActivity(y4.this.f46064b, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f46075b.getPay_tag_info(), this.f46075b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(y4.this.f46064b, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(y4.this.f46064b, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(y4.this.f46064b)) {
                                        com.join.mgps.Util.l2.a(y4.this.f46064b).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(y4.this.f46064b, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(y4.this.f46064b)) {
                                                com.join.mgps.Util.l2.a(y4.this.f46064b).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(y4.this.f46064b, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, y4.this.f46064b);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    downloadTask.setKeyword(y4.this.f46067e);
                    com.php25.PDownload.d.c(downloadTask, y4.this.f46064b);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            downloadTask.setKeyword(y4.this.f46067e);
            if (UtilsMy.y0(this.f46075b.getPay_tag_info(), this.f46075b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(y4.this.f46064b, downloadTask.getCrc_link_type_val());
            } else {
                UtilsMy.y1(downloadTask, this.f46075b);
                if (!UtilsMy.o1(y4.this.f46064b, downloadTask)) {
                    if (this.f46075b.getDown_status() == 5) {
                        UtilsMy.l1(y4.this.f46064b, downloadTask);
                    } else {
                        UtilsMy.R0(y4.this.f46064b, downloadTask, this.f46075b.getTp_down_url(), this.f46075b.getOther_down_switch(), this.f46075b.getCdn_down_switch());
                    }
                }
            }
            d dVar = y4.this.f46069g;
            if (dVar != null) {
                dVar.e(downloadTask.getCrc_link_type_val());
            }
        }
    }

    /* compiled from: SearchAppAdapter.java */
    /* loaded from: classes4.dex */
    public interface d {
        void e(String str);
    }

    /* compiled from: SearchAppAdapter.java */
    /* loaded from: classes4.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f46077a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f46078b;

        /* renamed from: c  reason: collision with root package name */
        TextView f46079c;

        /* renamed from: d  reason: collision with root package name */
        TextView f46080d;

        /* renamed from: e  reason: collision with root package name */
        RelativeLayout f46081e;

        /* renamed from: f  reason: collision with root package name */
        TextView f46082f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f46083g;

        /* renamed from: h  reason: collision with root package name */
        TextView f46084h;

        /* renamed from: i  reason: collision with root package name */
        LinearLayout f46085i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f46086j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f46087k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f46088l;

        /* renamed from: m  reason: collision with root package name */
        public ProgressBar f46089m;

        /* renamed from: n  reason: collision with root package name */
        RelativeLayout f46090n;

        /* renamed from: o  reason: collision with root package name */
        View f46091o;

        public e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchAppAdapter.java */
    /* loaded from: classes4.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        TextView f46093a;

        /* renamed from: b  reason: collision with root package name */
        TextView f46094b;

        public f(View view) {
            this.f46093a = (TextView) view.findViewById(R.id.tips);
            this.f46094b = (TextView) view.findViewById(R.id.titleText);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchAppAdapter.java */
    /* loaded from: classes4.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        HListView f46096a;

        public g(View view) {
            this.f46096a = (HListView) view.findViewById(R.id.screenListView);
        }
    }

    public y4(Context context) {
        this.f46064b = context;
    }

    public List<CollectionBeanSubBusiness> c() {
        return this.f46066d;
    }

    public View d(int i4, View view, ViewGroup viewGroup) {
        e eVar;
        View view2;
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f46066d.get(i4);
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        if (view == null) {
            view2 = this.f46065c.inflate(R.layout.app_listview_item2, (ViewGroup) null);
            eVar = new e();
            eVar.f46077a = (SimpleDraweeView) view2.findViewById(R.id.mgListviewItemIcon);
            eVar.f46078b = (ImageView) view2.findViewById(R.id.giftPackageSwich);
            eVar.f46079c = (TextView) view2.findViewById(R.id.mgListviewItemAppname);
            eVar.f46080d = (TextView) view2.findViewById(R.id.adText);
            eVar.f46090n = (RelativeLayout) view2.findViewById(R.id.relateLayoutApp);
            eVar.f46081e = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
            eVar.f46082f = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
            eVar.f46083g = (LinearLayout) view2.findViewById(R.id.tipsLayout);
            eVar.f46084h = (TextView) view2.findViewById(R.id.mgListviewItemDescribe);
            eVar.f46080d = (TextView) view2.findViewById(R.id.adText);
            eVar.f46085i = (LinearLayout) view2.findViewById(R.id.linearLayout2);
            eVar.f46086j = (TextView) view2.findViewById(R.id.appSize);
            eVar.f46087k = (TextView) view2.findViewById(R.id.loding_info);
            eVar.f46088l = (ProgressBar) view2.findViewById(R.id.progressBar);
            eVar.f46089m = (ProgressBar) view2.findViewById(R.id.progressBarZip);
            eVar.f46091o = view2.findViewById(R.id.line);
            view2.setTag(eVar);
        } else {
            eVar = (e) view.getTag();
            view2 = view;
        }
        eVar.f46091o.setVisibility(8);
        eVar.f46079c.setText(collectionBeanSubBusiness.getGame_name());
        eVar.f46084h.setText(collectionBeanSubBusiness.getInfo());
        eVar.f46090n.setOnClickListener(new b(collectionBeanSubBusiness));
        MyImageLoader.h(eVar.f46077a, collectionBeanSubBusiness.getIco_remote().trim());
        CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f46066d.get(i4);
        if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
            eVar.f46078b.setVisibility(0);
        } else {
            eVar.f46078b.setVisibility(8);
        }
        long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness2.getSize()) * 1024.0d * 1024.0d);
        if (collectionBeanSubBusiness.isAd()) {
            UtilsMy.L(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), eVar.f46083g, this.f46064b);
        } else {
            UtilsMy.I(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness.getTag_info(), eVar.f46083g, this.f46064b);
        }
        UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view2, downloadTask);
        String plugin_num = collectionBeanSubBusiness.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            eVar.f46082f.setBackgroundResource(R.drawable.recom_blue_butn);
            eVar.f46082f.setText("开始");
            eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_blue_color));
            eVar.f46083g.setVisibility(8);
            eVar.f46078b.setVisibility(8);
        } else if (downloadTask == null) {
            i(eVar, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(collectionBeanSubBusiness2.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f46064b).d(this.f46064b, collectionBeanSubBusiness2.getPackage_name()) && UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f46064b).l(this.f46064b, collectionBeanSubBusiness2.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness2.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness2.getVer())) {
                        eVar.f46082f.setBackgroundResource(R.drawable.recom_green_butn);
                        eVar.f46082f.setText("更新");
                        eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_green_color));
                    } else {
                        eVar.f46082f.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        eVar.f46082f.setText(this.f46064b.getResources().getString(R.string.download_status_finished));
                        eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_main_color));
                    }
                } else {
                    eVar.f46082f.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
                    UtilsMy.Z2(eVar.f46082f, eVar.f46081e, collectionBeanSubBusiness2);
                }
            } else {
                eVar.f46082f.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
                UtilsMy.Z2(eVar.f46082f, eVar.f46081e, collectionBeanSubBusiness2);
            }
        } else {
            int status = downloadTask.getStatus();
            if (UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    eVar.f46082f.setText("暂停中");
                } else if (status == 48) {
                    eVar.f46082f.setBackgroundResource(R.drawable.recom_blue_butn);
                    eVar.f46082f.setText("安装中");
                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_blue_color));
                    i(eVar, Boolean.TRUE, Boolean.FALSE);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    eVar.f46082f.setBackgroundResource(R.drawable.recom_green_butn);
                                                    eVar.f46082f.setText("更新");
                                                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_green_color));
                                                    i(eVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    eVar.f46082f.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    eVar.f46082f.setText("等待");
                                                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_blue_color));
                                                    Boolean bool = Boolean.FALSE;
                                                    i(eVar, bool, bool);
                                                    try {
                                                        TextView textView = eVar.f46086j;
                                                        textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        eVar.f46088l.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    eVar.f46087k.setText("等待中");
                                                    break;
                                                case 11:
                                                    eVar.f46082f.setBackgroundResource(R.drawable.recom_green_butn);
                                                    eVar.f46082f.setText("安装");
                                                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_green_color));
                                                    i(eVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    i(eVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView2 = eVar.f46086j;
                                                    textView2.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    eVar.f46087k.setText("解压中..");
                                                    eVar.f46089m.setProgress((int) downloadTask.getProgress());
                                                    eVar.f46082f.setBackgroundResource(R.drawable.extract);
                                                    eVar.f46082f.setText("解压中");
                                                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    i(eVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView3 = eVar.f46086j;
                                                    textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    eVar.f46087k.setText("点击重新解压");
                                                    eVar.f46089m.setProgress((int) downloadTask.getProgress());
                                                    eVar.f46082f.setBackgroundResource(R.drawable.reextract);
                                                    eVar.f46082f.setText("解压");
                                                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        eVar.f46082f.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        eVar.f46082f.setText(this.f46064b.getResources().getString(R.string.download_status_finished));
                        eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_main_color));
                        i(eVar, Boolean.TRUE, Boolean.FALSE);
                    }
                    eVar.f46082f.setBackgroundResource(R.drawable.recom_blue_butn);
                    eVar.f46082f.setText("继续");
                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_blue_color));
                    Boolean bool2 = Boolean.FALSE;
                    i(eVar, bool2, bool2);
                    try {
                        TextView textView4 = eVar.f46086j;
                        textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        eVar.f46088l.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    eVar.f46087k.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    eVar.f46082f.setBackgroundResource(R.drawable.recom_blue_butn);
                    eVar.f46082f.setText("暂停");
                    eVar.f46082f.setTextColor(this.f46064b.getResources().getColor(R.color.app_blue_color));
                    Boolean bool3 = Boolean.FALSE;
                    i(eVar, bool3, bool3);
                    TextView textView5 = eVar.f46086j;
                    textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    TextView textView6 = eVar.f46087k;
                    textView6.setText(downloadTask.getSpeed() + "/S");
                    eVar.f46088l.setProgress((int) downloadTask.getProgress());
                }
            }
            eVar.f46082f.setBackgroundResource(R.drawable.recom_green_butn);
            UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
            UtilsMy.Z2(eVar.f46082f, eVar.f46081e, collectionBeanSubBusiness2);
            i(eVar, Boolean.TRUE, Boolean.FALSE);
        }
        eVar.f46081e.setOnClickListener(new c(collectionBeanSubBusiness2));
        return view2;
    }

    public View e(int i4, View view, ViewGroup viewGroup) {
        g gVar;
        boolean z4;
        if (view == null) {
            view = LayoutInflater.from(this.f46064b).inflate(R.layout.gamedetail_item_viewpage1, (ViewGroup) null);
            gVar = new g(view);
            view.setTag(gVar);
        } else {
            gVar = (g) view.getTag();
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() == 0) {
            if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVedio_cover_pic()) && com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVedio_url())) {
                arrayList.add(collectionBeanSubBusiness.getVedio_cover_pic());
                z4 = true;
            } else {
                z4 = false;
            }
            List<DetialShowImageBean> pic_info = collectionBeanSubBusiness.getPic_info();
            if (pic_info != null) {
                for (int i5 = 0; i5 < pic_info.size(); i5++) {
                    arrayList.add(pic_info.get(i5).getRemote().getPath());
                }
            }
            if (arrayList.size() == 0) {
                gVar.f46096a.setVisibility(8);
            } else {
                gVar.f46096a.setVisibility(0);
                int pic_position = collectionBeanSubBusiness.getPic_position();
                gVar.f46096a.setAdapter((ListAdapter) new p0(this.f46064b, pic_position, arrayList, z4));
                if (pic_position == 1) {
                    gVar.f46096a.setDividerWidth(this.f46064b.getResources().getDimensionPixelSize(R.dimen.wdp10));
                    gVar.f46096a.postInvalidate();
                } else {
                    gVar.f46096a.setDividerWidth(this.f46064b.getResources().getDimensionPixelSize(R.dimen.wdp20));
                    gVar.f46096a.postInvalidate();
                }
                gVar.f46096a.setOnItemClickListener(new a(arrayList, collectionBeanSubBusiness));
            }
        }
        return view;
    }

    public View f(int i4, View view, ViewGroup viewGroup) {
        f fVar;
        String str;
        if (view == null) {
            view = LayoutInflater.from(this.f46064b).inflate(R.layout.search_ad_title_view, (ViewGroup) null, false);
            fVar = new f(view);
            view.setTag(fVar);
        } else {
            fVar = (f) view.getTag();
        }
        SearchResultAdinfo searchResultAdinfo = this.f46068f;
        if (searchResultAdinfo != null) {
            fVar.f46093a.setText(searchResultAdinfo.getLabel());
            int length = this.f46068f.getLabel().length();
            if (length == 2) {
                str = "\u3000\u3000 ";
            } else if (length == 3) {
                str = "\u3000\u3000\u3000";
            } else if (length == 4) {
                str = "\u3000\u3000\u3000\u3000";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(" ");
                int i5 = ((length * 2) / 3) + 1;
                String str2 = "";
                for (int i6 = 0; i6 < i5; i6++) {
                    stringBuffer.append("\u3000");
                    str2 = stringBuffer.toString();
                }
                str = str2;
            }
            TextView textView = fVar.f46094b;
            textView.setText(str + this.f46068f.getTitle());
        }
        return view;
    }

    public void g(SearchResultAdinfo searchResultAdinfo) {
        this.f46068f = searchResultAdinfo;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46066d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (this.f46066d.size() == 0) {
            return null;
        }
        return this.f46066d.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return ((CollectionBeanSubBusiness) getItem(i4)).getViewType();
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType;
        try {
            itemViewType = getItemViewType(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (itemViewType == 0) {
            return d(i4, view, viewGroup);
        }
        if (itemViewType == 1) {
            return e(i4, view, viewGroup);
        }
        if (itemViewType == 2) {
            return f(i4, view, viewGroup);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    public void h(d dVar) {
        this.f46069g = dVar;
    }

    void i(e eVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            eVar.f46085i.setVisibility(8);
            eVar.f46088l.setVisibility(8);
            eVar.f46089m.setVisibility(8);
            eVar.f46083g.setVisibility(0);
            eVar.f46084h.setVisibility(0);
            return;
        }
        eVar.f46085i.setVisibility(0);
        if (bool2.booleanValue()) {
            eVar.f46088l.setVisibility(8);
            eVar.f46089m.setVisibility(0);
        } else {
            eVar.f46089m.setVisibility(8);
            eVar.f46088l.setVisibility(0);
        }
        eVar.f46083g.setVisibility(8);
        eVar.f46084h.setVisibility(8);
    }

    public y4(Context context, String str) {
        this.f46064b = context;
        this.f46065c = LayoutInflater.from(context);
        this.f46067e = str;
    }
}
