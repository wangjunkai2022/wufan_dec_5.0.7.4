package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
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
/* loaded from: classes4.dex */
public class GameAppRecyAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f42032a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f42033b;

    /* renamed from: c  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f42034c = new ArrayList();

    /* loaded from: classes4.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f42035a;

        /* renamed from: b  reason: collision with root package name */
        View f42036b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f42037c;

        /* renamed from: d  reason: collision with root package name */
        SimpleDraweeView f42038d;

        /* renamed from: e  reason: collision with root package name */
        TextView f42039e;

        /* renamed from: f  reason: collision with root package name */
        RelativeLayout f42040f;

        /* renamed from: g  reason: collision with root package name */
        TextView f42041g;

        /* renamed from: h  reason: collision with root package name */
        LinearLayout f42042h;

        /* renamed from: i  reason: collision with root package name */
        TextView f42043i;

        /* renamed from: j  reason: collision with root package name */
        LinearLayout f42044j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f42045k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f42046l;

        /* renamed from: m  reason: collision with root package name */
        public ProgressBar f42047m;

        /* renamed from: n  reason: collision with root package name */
        public ProgressBar f42048n;

        public ViewHolder(View view) {
            super(view);
            this.f42036b = view;
        }
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f42050b;

        a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f42050b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f42050b.getCrc_sign_id() != null) {
                IntentUtil.getInstance().intentActivity(GameAppRecyAdapter.this.f42032a, this.f42050b.getIntentDataBean());
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f42052b;

        public b(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f42052b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f42052b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f42052b.getTag_info())) {
                    if (this.f42052b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(GameAppRecyAdapter.this.f42032a).d(GameAppRecyAdapter.this.f42032a, this.f42052b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(GameAppRecyAdapter.this.f42032a).l(GameAppRecyAdapter.this.f42032a, this.f42052b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f42052b.getVer()) || l4.d() >= Integer.parseInt(this.f42052b.getVer())) {
                                com.join.android.app.common.utils.e.l0(GameAppRecyAdapter.this.f42032a);
                                APKUtils.a0(GameAppRecyAdapter.this.f42032a, this.f42052b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(GameAppRecyAdapter.this.f42032a).d(GameAppRecyAdapter.this.f42032a, this.f42052b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f42052b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(GameAppRecyAdapter.this.f42032a);
                            APKUtils.V(GameAppRecyAdapter.this.f42032a, this.f42052b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(GameAppRecyAdapter.this.f42032a, this.f42052b);
                return;
            }
            String plugin_num = this.f42052b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f42052b.getDown_url_remote());
                UtilsMy.T2(downloadTask, GameAppRecyAdapter.this.f42032a);
                IntentUtil.getInstance().intentActivity(GameAppRecyAdapter.this.f42032a, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f42052b.getPay_tag_info(), this.f42052b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(GameAppRecyAdapter.this.f42032a, downloadTask);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(GameAppRecyAdapter.this.f42032a, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(GameAppRecyAdapter.this.f42032a)) {
                                        com.join.mgps.Util.l2.a(GameAppRecyAdapter.this.f42032a).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(GameAppRecyAdapter.this.f42032a, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(GameAppRecyAdapter.this.f42032a)) {
                                                com.join.mgps.Util.l2.a(GameAppRecyAdapter.this.f42032a).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(GameAppRecyAdapter.this.f42032a, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, GameAppRecyAdapter.this.f42032a);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, GameAppRecyAdapter.this.f42032a);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            if (UtilsMy.y0(this.f42052b.getPay_tag_info(), this.f42052b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(GameAppRecyAdapter.this.f42032a, downloadTask.getCrc_link_type_val());
                return;
            }
            UtilsMy.y1(downloadTask, this.f42052b);
            if (UtilsMy.o1(GameAppRecyAdapter.this.f42032a, downloadTask)) {
                return;
            }
            if (this.f42052b.getDown_status() == 5) {
                UtilsMy.l1(GameAppRecyAdapter.this.f42032a, downloadTask);
            } else {
                UtilsMy.R0(GameAppRecyAdapter.this.f42032a, downloadTask, this.f42052b.getTp_down_url(), this.f42052b.getOther_down_switch(), this.f42052b.getCdn_down_switch());
            }
        }
    }

    public GameAppRecyAdapter(Context context) {
        this.f42032a = context;
        this.f42033b = LayoutInflater.from(context);
    }

    void b(ViewHolder viewHolder, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            viewHolder.f42044j.setVisibility(8);
            viewHolder.f42047m.setVisibility(8);
            viewHolder.f42048n.setVisibility(8);
            viewHolder.f42042h.setVisibility(0);
            viewHolder.f42043i.setVisibility(0);
            return;
        }
        viewHolder.f42044j.setVisibility(0);
        if (bool2.booleanValue()) {
            viewHolder.f42047m.setVisibility(8);
            viewHolder.f42048n.setVisibility(0);
        } else {
            viewHolder.f42048n.setVisibility(8);
            viewHolder.f42047m.setVisibility(0);
        }
        viewHolder.f42042h.setVisibility(8);
        viewHolder.f42043i.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42034c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    public List<CollectionBeanSubBusiness> getItems() {
        return this.f42034c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f42034c.get(i4);
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        int i5 = i4 + 1;
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            TextView textView = viewHolder2.f42035a;
            textView.setText(i5 + "");
            viewHolder2.f42035a.setTextColor(-16777216);
            viewHolder2.f42035a.setTextSize(12.0f);
            viewHolder2.f42035a.getPaint().setFakeBoldText(false);
        } else {
            TextView textView2 = viewHolder2.f42035a;
            textView2.setText(i5 + "");
            viewHolder2.f42035a.setTextColor(Color.parseColor("#ff9f15"));
            viewHolder2.f42035a.setTextSize(14.0f);
            viewHolder2.f42035a.getPaint().setFakeBoldText(true);
        }
        viewHolder2.f42039e.setText(collectionBeanSubBusiness.getGame_name());
        viewHolder2.f42043i.setText(collectionBeanSubBusiness.getInfo());
        viewHolder2.f42038d.setImageDrawable(this.f42032a.getResources().getDrawable(R.drawable.main_normal_icon));
        if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
            viewHolder2.f42037c.setVisibility(0);
        } else {
            viewHolder2.f42037c.setVisibility(8);
        }
        MyImageLoader.h(viewHolder2.f42038d, collectionBeanSubBusiness.getIco_remote());
        CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f42034c.get(i4);
        long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness2.getSize()) * 1024.0d * 1024.0d);
        UtilsMy.I(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness.getTag_info(), viewHolder2.f42042h, this.f42032a);
        UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), viewHolder2.f42036b, downloadTask);
        String plugin_num = collectionBeanSubBusiness2.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_blue_butn);
            viewHolder2.f42041g.setText("开始");
            viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_blue_color));
            viewHolder2.f42042h.setVisibility(8);
            viewHolder2.f42037c.setVisibility(8);
        } else if (downloadTask == null) {
            b(viewHolder2, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(collectionBeanSubBusiness2.getTag_info())) {
                boolean d5 = com.join.android.app.common.utils.e.l0(this.f42032a).d(this.f42032a, collectionBeanSubBusiness2.getPackage_name());
                if (UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id()) > 0) {
                    d5 = false;
                }
                if (d5) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f42032a).l(this.f42032a, collectionBeanSubBusiness2.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness2.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness2.getVer())) {
                        viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_green_butn);
                        viewHolder2.f42041g.setText("更新");
                        viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_green_color));
                    } else {
                        viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        viewHolder2.f42041g.setText(this.f42032a.getResources().getString(R.string.download_status_finished));
                        viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_main_color));
                    }
                } else {
                    viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
                    UtilsMy.Z2(viewHolder2.f42041g, viewHolder2.f42040f, collectionBeanSubBusiness2);
                }
            } else {
                viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
                UtilsMy.Z2(viewHolder2.f42041g, viewHolder2.f42040f, collectionBeanSubBusiness2);
            }
        } else {
            int status = UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id()) > 0 ? 43 : downloadTask.getStatus();
            if (status != 0) {
                if (status == 27) {
                    viewHolder2.f42041g.setText("暂停中");
                } else if (status == 48) {
                    viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_blue_butn);
                    viewHolder2.f42041g.setText("安装中");
                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_blue_color));
                    b(viewHolder2, Boolean.TRUE, Boolean.FALSE);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_green_butn);
                                                    viewHolder2.f42041g.setText("更新");
                                                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_green_color));
                                                    b(viewHolder2, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    viewHolder2.f42041g.setText("等待");
                                                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_blue_color));
                                                    Boolean bool = Boolean.FALSE;
                                                    b(viewHolder2, bool, bool);
                                                    try {
                                                        TextView textView3 = viewHolder2.f42045k;
                                                        textView3.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        viewHolder2.f42047m.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    viewHolder2.f42046l.setText("等待中");
                                                    break;
                                                case 11:
                                                    viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_green_butn);
                                                    viewHolder2.f42041g.setText("安装");
                                                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_green_color));
                                                    b(viewHolder2, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    b(viewHolder2, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView4 = viewHolder2.f42045k;
                                                    textView4.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    viewHolder2.f42046l.setText("解压中..");
                                                    viewHolder2.f42048n.setProgress((int) downloadTask.getProgress());
                                                    viewHolder2.f42041g.setBackgroundResource(R.drawable.extract);
                                                    viewHolder2.f42041g.setText("解压中");
                                                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    b(viewHolder2, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView5 = viewHolder2.f42045k;
                                                    textView5.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    viewHolder2.f42046l.setText("点击重新解压");
                                                    viewHolder2.f42048n.setProgress((int) downloadTask.getProgress());
                                                    viewHolder2.f42041g.setBackgroundResource(R.drawable.reextract);
                                                    viewHolder2.f42041g.setText("解压");
                                                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        viewHolder2.f42041g.setText(this.f42032a.getResources().getString(R.string.download_status_finished));
                        viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_main_color));
                        b(viewHolder2, Boolean.TRUE, Boolean.FALSE);
                    }
                    viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_blue_butn);
                    viewHolder2.f42041g.setText("继续");
                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_blue_color));
                    Boolean bool2 = Boolean.FALSE;
                    b(viewHolder2, bool2, bool2);
                    try {
                        TextView textView6 = viewHolder2.f42045k;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        viewHolder2.f42047m.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    viewHolder2.f42046l.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_blue_butn);
                    viewHolder2.f42041g.setText("暂停");
                    viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_blue_color));
                    Boolean bool3 = Boolean.FALSE;
                    b(viewHolder2, bool3, bool3);
                    TextView textView7 = viewHolder2.f42045k;
                    textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    TextView textView8 = viewHolder2.f42046l;
                    textView8.setText(downloadTask.getSpeed() + "/S");
                    viewHolder2.f42047m.setProgress((int) downloadTask.getProgress());
                }
            }
            viewHolder2.f42041g.setBackgroundResource(R.drawable.recom_blue_butn);
            viewHolder2.f42041g.setTextColor(this.f42032a.getResources().getColor(R.color.app_blue_color));
            UtilsMy.w0(collectionBeanSubBusiness2.getPay_tag_info(), collectionBeanSubBusiness2.getCrc_sign_id());
            UtilsMy.Z2(viewHolder2.f42041g, viewHolder2.f42040f, collectionBeanSubBusiness2);
            b(viewHolder2, Boolean.TRUE, Boolean.FALSE);
        }
        viewHolder2.f42040f.setOnClickListener(new b(collectionBeanSubBusiness2));
        viewHolder2.f42036b.setOnClickListener(new a(collectionBeanSubBusiness));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        View inflate = this.f42033b.inflate(R.layout.classify_listview_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f42035a = (TextView) inflate.findViewById(R.id.tvNumber);
        viewHolder.f42037c = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
        viewHolder.f42038d = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
        viewHolder.f42039e = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
        viewHolder.f42040f = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
        viewHolder.f42041g = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
        viewHolder.f42042h = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
        viewHolder.f42043i = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
        viewHolder.f42044j = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
        viewHolder.f42045k = (TextView) inflate.findViewById(R.id.appSize);
        viewHolder.f42046l = (TextView) inflate.findViewById(R.id.loding_info);
        viewHolder.f42047m = (ProgressBar) inflate.findViewById(R.id.progressBar);
        viewHolder.f42048n = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
        return viewHolder;
    }
}
