package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
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
/* compiled from: GameAppAdapter.java */
/* loaded from: classes4.dex */
public class n0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44919b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f44920c;

    /* renamed from: d  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f44921d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f44922e = 0;

    /* compiled from: GameAppAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f44923b;

        public a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44923b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44923b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f44923b.getTag_info())) {
                    if (this.f44923b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(n0.this.f44919b).d(n0.this.f44919b, this.f44923b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(n0.this.f44919b).l(n0.this.f44919b, this.f44923b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44923b.getVer()) || l4.d() >= Integer.parseInt(this.f44923b.getVer())) {
                                com.join.android.app.common.utils.e.l0(n0.this.f44919b);
                                APKUtils.a0(n0.this.f44919b, this.f44923b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(n0.this.f44919b).d(n0.this.f44919b, this.f44923b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44923b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(n0.this.f44919b);
                            APKUtils.V(n0.this.f44919b, this.f44923b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(n0.this.f44919b, this.f44923b);
                return;
            }
            String plugin_num = this.f44923b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44923b.getDown_url_remote());
                UtilsMy.T2(downloadTask, n0.this.f44919b);
                IntentUtil.getInstance().intentActivity(n0.this.f44919b, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f44923b.getPay_tag_info(), this.f44923b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(n0.this.f44919b, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(n0.this.f44919b, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(n0.this.f44919b)) {
                                        com.join.mgps.Util.l2.a(n0.this.f44919b).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(n0.this.f44919b, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(n0.this.f44919b)) {
                                                com.join.mgps.Util.l2.a(n0.this.f44919b).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(n0.this.f44919b, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, n0.this.f44919b);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, n0.this.f44919b);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            if (UtilsMy.y0(this.f44923b.getPay_tag_info(), this.f44923b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(n0.this.f44919b, downloadTask.getCrc_link_type_val());
            } else if (this.f44923b.getDown_status() == 5) {
                UtilsMy.l1(n0.this.f44919b, downloadTask);
            } else {
                UtilsMy.R0(n0.this.f44919b, downloadTask, this.f44923b.getTp_down_url(), this.f44923b.getOther_down_switch(), this.f44923b.getCdn_down_switch());
            }
        }
    }

    /* compiled from: GameAppAdapter.java */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        View f44925a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44926b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f44927c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f44928d;

        /* renamed from: e  reason: collision with root package name */
        SimpleDraweeView f44929e;

        /* renamed from: f  reason: collision with root package name */
        TextView f44930f;

        /* renamed from: g  reason: collision with root package name */
        RelativeLayout f44931g;

        /* renamed from: h  reason: collision with root package name */
        TextView f44932h;

        /* renamed from: i  reason: collision with root package name */
        LinearLayout f44933i;

        /* renamed from: j  reason: collision with root package name */
        TextView f44934j;

        /* renamed from: k  reason: collision with root package name */
        LinearLayout f44935k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f44936l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f44937m;

        /* renamed from: n  reason: collision with root package name */
        public ProgressBar f44938n;

        /* renamed from: o  reason: collision with root package name */
        public ProgressBar f44939o;

        public b() {
        }
    }

    public n0(Context context) {
        this.f44919b = context;
        this.f44920c = LayoutInflater.from(context);
    }

    public List<CollectionBeanSubBusiness> b() {
        return this.f44921d;
    }

    public void c(int i4) {
        this.f44922e = i4;
    }

    void d(b bVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            bVar.f44935k.setVisibility(8);
            bVar.f44938n.setVisibility(8);
            bVar.f44939o.setVisibility(8);
            bVar.f44933i.setVisibility(0);
            bVar.f44934j.setVisibility(0);
            return;
        }
        bVar.f44935k.setVisibility(0);
        if (bool2.booleanValue()) {
            bVar.f44938n.setVisibility(8);
            bVar.f44939o.setVisibility(0);
        } else {
            bVar.f44939o.setVisibility(8);
            bVar.f44938n.setVisibility(0);
        }
        bVar.f44933i.setVisibility(8);
        bVar.f44934j.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44921d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (this.f44921d.size() == 0) {
            return null;
        }
        return this.f44921d.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        View view2;
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f44921d.get(i4);
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        if (view == null) {
            view2 = this.f44920c.inflate(R.layout.classify_listview_item, (ViewGroup) null);
            bVar = new b();
            bVar.f44925a = view2.findViewById(R.id.lineTop);
            bVar.f44926b = (TextView) view2.findViewById(R.id.tvNumber);
            bVar.f44927c = (ImageView) view2.findViewById(R.id.ivNumber);
            bVar.f44928d = (ImageView) view2.findViewById(R.id.giftPackageSwich);
            bVar.f44929e = (SimpleDraweeView) view2.findViewById(R.id.mgListviewItemIcon);
            bVar.f44930f = (TextView) view2.findViewById(R.id.mgListviewItemAppname);
            bVar.f44931g = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
            bVar.f44932h = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
            bVar.f44933i = (LinearLayout) view2.findViewById(R.id.tipsLayout);
            bVar.f44934j = (TextView) view2.findViewById(R.id.mgListviewItemDescribe);
            bVar.f44935k = (LinearLayout) view2.findViewById(R.id.linearLayout2);
            bVar.f44936l = (TextView) view2.findViewById(R.id.appSize);
            bVar.f44937m = (TextView) view2.findViewById(R.id.loding_info);
            bVar.f44938n = (ProgressBar) view2.findViewById(R.id.progressBar);
            bVar.f44939o = (ProgressBar) view2.findViewById(R.id.progressBarZip);
            view2.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
            view2 = view;
        }
        if (i4 == 0 && this.f44922e > 0) {
            bVar.f44925a.setVisibility(0);
        } else {
            bVar.f44925a.setVisibility(8);
        }
        int i5 = i4 + 1;
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            bVar.f44926b.setVisibility(0);
            bVar.f44927c.setVisibility(8);
            TextView textView = bVar.f44926b;
            textView.setText(i5 + "");
            bVar.f44926b.setTextColor(-16777216);
            bVar.f44926b.setTextSize(12.0f);
            bVar.f44926b.getPaint().setFakeBoldText(false);
        } else if (this.f44922e > 0) {
            bVar.f44926b.setVisibility(8);
            bVar.f44927c.setVisibility(0);
            if (i5 == 1) {
                bVar.f44927c.setImageResource(R.drawable.ic_standalone_one);
            } else if (i5 == 2) {
                bVar.f44927c.setImageResource(R.drawable.ic_standalone_two);
            } else if (i5 == 3) {
                bVar.f44927c.setImageResource(R.drawable.ic_standalone_three);
            }
        } else {
            bVar.f44926b.setVisibility(0);
            bVar.f44927c.setVisibility(8);
            TextView textView2 = bVar.f44926b;
            textView2.setText(i5 + "");
            bVar.f44926b.setTextColor(Color.parseColor("#ff9f15"));
            bVar.f44926b.setTextSize(14.0f);
            bVar.f44926b.getPaint().setFakeBoldText(true);
        }
        bVar.f44930f.setText(collectionBeanSubBusiness.getGame_name());
        bVar.f44934j.setText(collectionBeanSubBusiness.getInfo());
        bVar.f44929e.setImageDrawable(this.f44919b.getResources().getDrawable(R.drawable.main_normal_icon));
        if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
            bVar.f44928d.setVisibility(0);
        } else {
            bVar.f44928d.setVisibility(8);
        }
        MyImageLoader.h(bVar.f44929e, collectionBeanSubBusiness.getIco_remote());
        CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f44921d.get(i4);
        long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness2.getSize()) * 1024.0d * 1024.0d);
        UtilsMy.I(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness2.getTag_info(), bVar.f44933i, this.f44919b);
        UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view2, downloadTask);
        String plugin_num = collectionBeanSubBusiness2.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            bVar.f44932h.setBackgroundResource(R.drawable.recom_blue_butn);
            bVar.f44932h.setText("开始");
            bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_blue_color));
            bVar.f44933i.setVisibility(8);
            bVar.f44928d.setVisibility(8);
        } else if (downloadTask == null) {
            d(bVar, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(collectionBeanSubBusiness2.getTag_info())) {
                if (UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id()) > 0 ? false : com.join.android.app.common.utils.e.l0(this.f44919b).d(this.f44919b, collectionBeanSubBusiness2.getPackage_name())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44919b).l(this.f44919b, collectionBeanSubBusiness2.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness2.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness2.getVer())) {
                        bVar.f44932h.setBackgroundResource(R.drawable.recom_green_butn);
                        bVar.f44932h.setText("更新");
                        bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_green_color));
                    } else {
                        bVar.f44932h.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        bVar.f44932h.setText(this.f44919b.getResources().getString(R.string.download_status_finished));
                        bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_main_color));
                    }
                } else {
                    bVar.f44932h.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
                    UtilsMy.Z2(bVar.f44932h, bVar.f44931g, collectionBeanSubBusiness2);
                }
            } else {
                bVar.f44932h.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
                UtilsMy.Z2(bVar.f44932h, bVar.f44931g, collectionBeanSubBusiness2);
            }
        } else {
            int status = UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id()) > 0 ? 43 : downloadTask.getStatus();
            if (status != 0) {
                if (status == 27) {
                    bVar.f44932h.setText("暂停中");
                } else if (status == 48) {
                    bVar.f44932h.setBackgroundResource(R.drawable.recom_blue_butn);
                    bVar.f44932h.setText("安装中");
                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_blue_color));
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
                                                    bVar.f44932h.setBackgroundResource(R.drawable.recom_green_butn);
                                                    bVar.f44932h.setText("更新");
                                                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_green_color));
                                                    d(bVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    bVar.f44932h.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    bVar.f44932h.setText("等待");
                                                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_blue_color));
                                                    Boolean bool = Boolean.FALSE;
                                                    d(bVar, bool, bool);
                                                    try {
                                                        TextView textView3 = bVar.f44936l;
                                                        textView3.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        bVar.f44938n.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    bVar.f44937m.setText("等待中");
                                                    break;
                                                case 11:
                                                    bVar.f44932h.setBackgroundResource(R.drawable.recom_green_butn);
                                                    bVar.f44932h.setText("安装");
                                                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_green_color));
                                                    d(bVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    d(bVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView4 = bVar.f44936l;
                                                    textView4.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    bVar.f44937m.setText("解压中..");
                                                    bVar.f44939o.setProgress((int) downloadTask.getProgress());
                                                    bVar.f44932h.setBackgroundResource(R.drawable.extract);
                                                    bVar.f44932h.setText("解压中");
                                                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    d(bVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView5 = bVar.f44936l;
                                                    textView5.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    bVar.f44937m.setText("点击重新解压");
                                                    bVar.f44939o.setProgress((int) downloadTask.getProgress());
                                                    bVar.f44932h.setBackgroundResource(R.drawable.reextract);
                                                    bVar.f44932h.setText("解压");
                                                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        bVar.f44932h.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        bVar.f44932h.setText(this.f44919b.getResources().getString(R.string.download_status_finished));
                        bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_main_color));
                        d(bVar, Boolean.TRUE, Boolean.FALSE);
                    }
                    bVar.f44932h.setBackgroundResource(R.drawable.recom_blue_butn);
                    bVar.f44932h.setText("继续");
                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_blue_color));
                    Boolean bool2 = Boolean.FALSE;
                    d(bVar, bool2, bool2);
                    try {
                        TextView textView6 = bVar.f44936l;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        bVar.f44938n.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    bVar.f44937m.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    bVar.f44932h.setBackgroundResource(R.drawable.recom_blue_butn);
                    bVar.f44932h.setText("暂停");
                    bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_blue_color));
                    Boolean bool3 = Boolean.FALSE;
                    d(bVar, bool3, bool3);
                    TextView textView7 = bVar.f44936l;
                    textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    TextView textView8 = bVar.f44937m;
                    textView8.setText(downloadTask.getSpeed() + "/S");
                    bVar.f44938n.setProgress((int) downloadTask.getProgress());
                }
            }
            bVar.f44932h.setBackgroundResource(R.drawable.recom_blue_butn);
            bVar.f44932h.setTextColor(this.f44919b.getResources().getColor(R.color.app_blue_color));
            UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
            UtilsMy.Z2(bVar.f44932h, bVar.f44931g, collectionBeanSubBusiness2);
            d(bVar, Boolean.TRUE, Boolean.FALSE);
        }
        bVar.f44931g.setOnClickListener(new a(collectionBeanSubBusiness2));
        return view2;
    }
}
