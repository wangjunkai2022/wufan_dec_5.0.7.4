package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
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
import com.join.mgps.dto.ExtBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.psk.eventmodule.Event;
import com.psk.eventmodule.StatFactory;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RankingItemAdapter.java */
/* loaded from: classes4.dex */
public class u4 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45881b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45882c;

    /* renamed from: f  reason: collision with root package name */
    private String f45885f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f45886g;

    /* renamed from: d  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f45883d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f45884e = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f45887h = false;

    /* compiled from: RankingItemAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f45888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f45889c;

        a(CollectionBeanSubBusiness collectionBeanSubBusiness, int i4) {
            this.f45888b = collectionBeanSubBusiness;
            this.f45889c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = this.f45888b;
            if (collectionBeanSubBusiness.getCrc_sign_id() != null) {
                String str = u4.this.f45887h ? "home" : "ranking";
                if (TextUtils.equals(u4.this.f45885f, "1")) {
                    StatFactory companion = StatFactory.Companion.getInstance(u4.this.f45881b);
                    Event event = Event.click;
                    String game_id = collectionBeanSubBusiness.getGame_id();
                    companion.sendEvent(new StatFactory.VolcanoEvent(event, game_id, new StatFactory.SpmData("wufun", str, "ranking", (this.f45889c + 1) + "", false), this.f45888b.getPosition_path(), UtilsMy.k2(this.f45888b.getTag_info())));
                }
                IntentDateBean intentDataBean = collectionBeanSubBusiness.getIntentDataBean();
                ExtBean extBean = intentDataBean.getExtBean();
                extBean.setRecPosition(str + "-ranking-" + (this.f45889c + 1));
                extBean.setReMarks(collectionBeanSubBusiness.getReMarks());
                intentDataBean.setExtBean(extBean);
                IntentUtil.getInstance().intentActivity(u4.this.f45881b, intentDataBean);
            }
        }
    }

    /* compiled from: RankingItemAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f45891b;

        /* renamed from: c  reason: collision with root package name */
        int f45892c;

        public b(CollectionBeanSubBusiness collectionBeanSubBusiness, int i4) {
            this.f45892c = 0;
            this.f45891b = collectionBeanSubBusiness;
            this.f45892c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f45891b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f45891b.getTag_info())) {
                    if (this.f45891b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(u4.this.f45881b).d(u4.this.f45881b, this.f45891b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(u4.this.f45881b).l(u4.this.f45881b, this.f45891b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f45891b.getVer()) || l4.d() >= Integer.parseInt(this.f45891b.getVer())) {
                                com.join.android.app.common.utils.e.l0(u4.this.f45881b);
                                APKUtils.a0(u4.this.f45881b, this.f45891b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(u4.this.f45881b).d(u4.this.f45881b, this.f45891b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f45891b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(u4.this.f45881b);
                            APKUtils.V(u4.this.f45881b, this.f45891b.getMod_info());
                            return;
                        }
                    }
                }
                String str = u4.this.f45887h ? "home" : "ranking";
                this.f45891b.setRecPosition(str + "-ranking-" + (this.f45892c + 1));
                CollectionBeanSubBusiness collectionBeanSubBusiness = this.f45891b;
                collectionBeanSubBusiness.setReMarks((this.f45892c + 1) + "");
                if (TextUtils.equals("1", u4.this.f45885f)) {
                    StatFactory companion = StatFactory.Companion.getInstance(u4.this.f45881b);
                    Event event = Event.check;
                    String game_id = this.f45891b.getGame_id();
                    companion.sendEvent(new StatFactory.VolcanoEvent(event, game_id, new StatFactory.SpmData("wufun", str, "ranking", (this.f45892c + 1) + "", false), this.f45891b.getPosition_path(), UtilsMy.k2(this.f45891b.getTag_info())));
                }
                UtilsMy.Y0(u4.this.f45881b, this.f45891b);
                return;
            }
            String plugin_num = this.f45891b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f45891b.getDown_url_remote());
                UtilsMy.T2(downloadTask, u4.this.f45881b);
                IntentUtil.getInstance().intentActivity(u4.this.f45881b, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f45891b.getPay_tag_info(), this.f45891b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(u4.this.f45881b, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(u4.this.f45881b, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(u4.this.f45881b)) {
                                        com.join.mgps.Util.l2.a(u4.this.f45881b).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(u4.this.f45881b, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(u4.this.f45881b)) {
                                                com.join.mgps.Util.l2.a(u4.this.f45881b).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(u4.this.f45881b, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, u4.this.f45881b);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, u4.this.f45881b);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            if (UtilsMy.y0(this.f45891b.getPay_tag_info(), this.f45891b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(u4.this.f45881b, downloadTask.getCrc_link_type_val());
            } else if (this.f45891b.getDown_status() == 5) {
                UtilsMy.l1(u4.this.f45881b, downloadTask);
            } else {
                UtilsMy.R0(u4.this.f45881b, downloadTask, this.f45891b.getTp_down_url(), this.f45891b.getOther_down_switch(), this.f45891b.getCdn_down_switch());
            }
        }
    }

    /* compiled from: RankingItemAdapter.java */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        View f45894a;

        /* renamed from: b  reason: collision with root package name */
        View f45895b;

        /* renamed from: c  reason: collision with root package name */
        TextView f45896c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f45897d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f45898e;

        /* renamed from: f  reason: collision with root package name */
        SimpleDraweeView f45899f;

        /* renamed from: g  reason: collision with root package name */
        TextView f45900g;

        /* renamed from: h  reason: collision with root package name */
        RelativeLayout f45901h;

        /* renamed from: i  reason: collision with root package name */
        TextView f45902i;

        /* renamed from: j  reason: collision with root package name */
        LinearLayout f45903j;

        /* renamed from: k  reason: collision with root package name */
        TextView f45904k;

        /* renamed from: l  reason: collision with root package name */
        LinearLayout f45905l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f45906m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f45907n;

        /* renamed from: o  reason: collision with root package name */
        public ProgressBar f45908o;

        /* renamed from: p  reason: collision with root package name */
        public ProgressBar f45909p;

        public c() {
        }
    }

    public u4(Context context, String str) {
        this.f45885f = "0";
        this.f45881b = context;
        this.f45882c = LayoutInflater.from(context);
        this.f45885f = str;
    }

    public boolean d() {
        return this.f45886g;
    }

    public List<CollectionBeanSubBusiness> e() {
        return this.f45883d;
    }

    public void f() {
        this.f45887h = true;
    }

    public void g(boolean z4) {
        this.f45886g = z4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45883d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (this.f45883d.size() != 0 && i4 < this.f45883d.size()) {
            return this.f45883d.get(i4);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        c cVar;
        View view2;
        if (view == null) {
            View inflate = this.f45882c.inflate(R.layout.ranking_listview_item, (ViewGroup) null);
            c cVar2 = new c();
            cVar2.f45894a = inflate.findViewById(R.id.lineTop);
            cVar2.f45896c = (TextView) inflate.findViewById(R.id.tvNumber);
            cVar2.f45897d = (ImageView) inflate.findViewById(R.id.ivNumber);
            cVar2.f45898e = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
            cVar2.f45899f = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
            cVar2.f45900g = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
            cVar2.f45901h = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
            cVar2.f45902i = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
            cVar2.f45903j = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
            cVar2.f45904k = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
            cVar2.f45905l = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
            cVar2.f45906m = (TextView) inflate.findViewById(R.id.appSize);
            cVar2.f45907n = (TextView) inflate.findViewById(R.id.loding_info);
            cVar2.f45908o = (ProgressBar) inflate.findViewById(R.id.progressBar);
            cVar2.f45909p = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
            cVar2.f45895b = inflate.findViewById(R.id.relateLayoutApp);
            inflate.setTag(cVar2);
            cVar = cVar2;
            view2 = inflate;
        } else {
            cVar = (c) view.getTag();
            view2 = view;
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f45883d.get(i4);
        CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f45883d.get(i4);
        DownloadTask downloadTask = collectionBeanSubBusiness2.getDownloadTask();
        if (i4 == 0 && this.f45884e > 0) {
            cVar.f45894a.setVisibility(0);
        } else {
            cVar.f45894a.setVisibility(8);
        }
        if (collectionBeanSubBusiness.get_from_type() == 123456) {
            cVar.f45894a.setVisibility(8);
            view2.findViewById(R.id.line).setVisibility(8);
            cVar.f45895b.setBackgroundColor(0);
        }
        int i5 = i4 + 1;
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            cVar.f45896c.setVisibility(0);
            cVar.f45897d.setVisibility(8);
            TextView textView = cVar.f45896c;
            textView.setText(i5 + "");
            cVar.f45896c.setTextColor(-16777216);
            cVar.f45896c.setTextSize(12.0f);
            cVar.f45896c.getPaint().setFakeBoldText(false);
        } else if (this.f45884e > 0) {
            cVar.f45896c.setVisibility(8);
            cVar.f45897d.setVisibility(0);
            if (i5 == 1) {
                cVar.f45897d.setImageResource(R.drawable.ic_standalone_one);
            } else if (i5 == 2) {
                cVar.f45897d.setImageResource(R.drawable.ic_standalone_two);
            } else if (i5 == 3) {
                cVar.f45897d.setImageResource(R.drawable.ic_standalone_three);
            }
        } else {
            cVar.f45896c.setVisibility(0);
            cVar.f45897d.setVisibility(8);
            TextView textView2 = cVar.f45896c;
            textView2.setText(i5 + "");
            cVar.f45896c.setTextColor(Color.parseColor("#ff9f15"));
            cVar.f45896c.setTextSize(14.0f);
            cVar.f45896c.getPaint().setFakeBoldText(true);
        }
        cVar.f45900g.setText(collectionBeanSubBusiness2.getGame_name());
        cVar.f45904k.setText(collectionBeanSubBusiness2.getInfo());
        cVar.f45899f.setImageDrawable(this.f45881b.getResources().getDrawable(R.drawable.main_normal_icon));
        if (collectionBeanSubBusiness2.getGift_package_switch() == 1) {
            cVar.f45898e.setVisibility(0);
        } else {
            cVar.f45898e.setVisibility(8);
        }
        MyImageLoader.n(cVar.f45899f, collectionBeanSubBusiness2.getIco_remote());
        long size = downloadTask != null ? downloadTask.getSize() : 0L;
        UtilsMy.I(collectionBeanSubBusiness2.getScore(), collectionBeanSubBusiness2.getDown_count(), collectionBeanSubBusiness2.getSize(), collectionBeanSubBusiness2.getSp_tag_info(), collectionBeanSubBusiness2.getTag_info(), cVar.f45903j, this.f45881b);
        UtilsMy.j3(collectionBeanSubBusiness2.getSp_tag_info(), view2, downloadTask);
        String plugin_num = collectionBeanSubBusiness.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            cVar.f45902i.setBackgroundResource(R.drawable.recom_blue_butn);
            cVar.f45902i.setText("开始");
            cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_blue_color));
            cVar.f45903j.setVisibility(8);
            cVar.f45898e.setVisibility(8);
        } else if (downloadTask == null) {
            i(cVar, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                boolean d5 = com.join.android.app.common.utils.e.l0(this.f45881b).d(this.f45881b, collectionBeanSubBusiness.getPackage_name());
                if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                    d5 = false;
                }
                if (d5) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45881b).l(this.f45881b, collectionBeanSubBusiness.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                        cVar.f45902i.setBackgroundResource(R.drawable.recom_green_butn);
                        cVar.f45902i.setText("更新");
                        cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_green_color));
                    } else {
                        cVar.f45902i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        cVar.f45902i.setText(this.f45881b.getResources().getString(R.string.download_status_finished));
                        cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_main_color));
                    }
                } else {
                    cVar.f45902i.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                    UtilsMy.Z2(cVar.f45902i, cVar.f45901h, collectionBeanSubBusiness);
                }
            } else {
                cVar.f45902i.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                UtilsMy.Z2(cVar.f45902i, cVar.f45901h, collectionBeanSubBusiness);
            }
        } else {
            int status = UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0 ? 43 : downloadTask.getStatus();
            if (status != 0) {
                if (status == 27) {
                    cVar.f45902i.setText("暂停中");
                } else if (status == 48) {
                    cVar.f45902i.setBackgroundResource(R.drawable.recom_blue_butn);
                    cVar.f45902i.setText("安装中");
                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_blue_color));
                    i(cVar, Boolean.TRUE, Boolean.FALSE);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    cVar.f45902i.setBackgroundResource(R.drawable.recom_green_butn);
                                                    cVar.f45902i.setText("更新");
                                                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_green_color));
                                                    i(cVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    cVar.f45902i.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    cVar.f45902i.setText("等待");
                                                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_blue_color));
                                                    Boolean bool = Boolean.FALSE;
                                                    i(cVar, bool, bool);
                                                    try {
                                                        TextView textView3 = cVar.f45906m;
                                                        textView3.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                        cVar.f45908o.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    cVar.f45907n.setText("等待中");
                                                    break;
                                                case 11:
                                                    cVar.f45902i.setBackgroundResource(R.drawable.recom_green_butn);
                                                    cVar.f45902i.setText("安装");
                                                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_green_color));
                                                    i(cVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    i(cVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView4 = cVar.f45906m;
                                                    textView4.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    cVar.f45907n.setText("解压中..");
                                                    cVar.f45909p.setProgress((int) downloadTask.getProgress());
                                                    cVar.f45902i.setBackgroundResource(R.drawable.extract);
                                                    cVar.f45902i.setText("解压中");
                                                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    i(cVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView5 = cVar.f45906m;
                                                    textView5.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    cVar.f45907n.setText("点击重新解压");
                                                    cVar.f45909p.setProgress((int) downloadTask.getProgress());
                                                    cVar.f45902i.setBackgroundResource(R.drawable.reextract);
                                                    cVar.f45902i.setText("解压");
                                                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cVar.f45902i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        cVar.f45902i.setText(this.f45881b.getResources().getString(R.string.download_status_finished));
                        cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_main_color));
                        i(cVar, Boolean.TRUE, Boolean.FALSE);
                    }
                    cVar.f45902i.setBackgroundResource(R.drawable.recom_blue_butn);
                    cVar.f45902i.setText("继续");
                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_blue_color));
                    Boolean bool2 = Boolean.FALSE;
                    i(cVar, bool2, bool2);
                    try {
                        TextView textView6 = cVar.f45906m;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                        cVar.f45908o.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    cVar.f45907n.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    cVar.f45902i.setBackgroundResource(R.drawable.recom_blue_butn);
                    cVar.f45902i.setText("暂停");
                    cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_blue_color));
                    Boolean bool3 = Boolean.FALSE;
                    i(cVar, bool3, bool3);
                    TextView textView7 = cVar.f45906m;
                    textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                    TextView textView8 = cVar.f45907n;
                    textView8.setText(downloadTask.getSpeed() + "/S");
                    cVar.f45908o.setProgress((int) downloadTask.getProgress());
                }
            }
            cVar.f45902i.setBackgroundResource(R.drawable.recom_blue_butn);
            cVar.f45902i.setTextColor(this.f45881b.getResources().getColor(R.color.app_blue_color));
            UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
            UtilsMy.Z2(cVar.f45902i, cVar.f45901h, collectionBeanSubBusiness);
            i(cVar, Boolean.TRUE, Boolean.FALSE);
        }
        cVar.f45895b.setOnClickListener(new a(collectionBeanSubBusiness2, i4));
        cVar.f45901h.setOnClickListener(new b(collectionBeanSubBusiness, i4));
        return view2;
    }

    public void h(int i4) {
        this.f45884e = i4;
    }

    void i(c cVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            cVar.f45905l.setVisibility(8);
            cVar.f45908o.setVisibility(8);
            cVar.f45909p.setVisibility(8);
            cVar.f45903j.setVisibility(0);
            cVar.f45904k.setVisibility(0);
            return;
        }
        cVar.f45905l.setVisibility(0);
        if (bool2.booleanValue()) {
            cVar.f45908o.setVisibility(8);
            cVar.f45909p.setVisibility(0);
        } else {
            cVar.f45909p.setVisibility(8);
            cVar.f45908o.setVisibility(0);
        }
        cVar.f45903j.setVisibility(8);
        cVar.f45904k.setVisibility(8);
    }
}
