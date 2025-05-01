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
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.InterceptEventHorizontalScrollView;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.CollectionInfo;
import com.join.mgps.dto.GameFactoryListBean;
import com.join.mgps.dto.GameHeadAd;
import com.join.mgps.dto.PaPaBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes4.dex */
public class PaPaListItemDownloadAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private List<PaPaBean> f43786b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f43787c;

    /* renamed from: d  reason: collision with root package name */
    private int f43788d;

    /* renamed from: e  reason: collision with root package name */
    private final View.OnClickListener f43789e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f43790f;

    /* loaded from: classes4.dex */
    public class ContentCollectionAdapter extends RecyclerView.Adapter<ContentCollectionHolder> {

        /* renamed from: a  reason: collision with root package name */
        private List<AppBean> f43791a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private Context f43792b;

        public ContentCollectionAdapter(Context context) {
            this.f43792b = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(ContentCollectionHolder contentCollectionHolder, int i4) {
            e(contentCollectionHolder, this.f43791a.get(i4));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public ContentCollectionHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.intersting_horiz_listitem, (ViewGroup) null);
            ContentCollectionHolder contentCollectionHolder = new ContentCollectionHolder(inflate);
            contentCollectionHolder.f43794a = (SimpleDraweeView) inflate.findViewById(R.id.image1);
            contentCollectionHolder.f43795b = (TextView) inflate.findViewById(R.id.appname1);
            contentCollectionHolder.f43796c = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.rootView);
            contentCollectionHolder.f43797d = linearLayout;
            linearLayout.setOnClickListener(PaPaListItemDownloadAdapter.this.f43790f);
            contentCollectionHolder.f43796c.setOnClickListener(PaPaListItemDownloadAdapter.this.f43789e);
            return contentCollectionHolder;
        }

        public void e(ContentCollectionHolder contentCollectionHolder, AppBean appBean) {
            contentCollectionHolder.f43797d.setTag(appBean);
            contentCollectionHolder.f43795b.setText(appBean.getGame_name());
            MyImageLoader.h(contentCollectionHolder.f43794a, appBean.getIco_remote());
            contentCollectionHolder.f43796c.setTag(appBean);
            DownloadTask downloadTask = appBean.getDownloadTask();
            UtilsMy.j3(appBean.getSp_tag_info(), contentCollectionHolder.f43797d, downloadTask);
            String plugin_num = appBean.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_blue_butn);
                contentCollectionHolder.f43796c.setText("开始");
                contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_blue_color));
            } else if (downloadTask == null) {
                if (UtilsMy.o0(appBean.getTag_info())) {
                    boolean d5 = com.join.android.app.common.utils.e.l0(this.f43792b).d(this.f43792b, appBean.getPackageName());
                    if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                        d5 = false;
                    }
                    if (d5) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f43792b).l(this.f43792b, appBean.getPackageName());
                        if (com.join.mgps.Util.g2.i(appBean.getVer()) && l4.d() < Integer.parseInt(appBean.getVer())) {
                            contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_green_butn);
                            contentCollectionHolder.f43796c.setText("更新");
                            contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_green_color));
                            return;
                        }
                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        contentCollectionHolder.f43796c.setText(this.f43792b.getResources().getString(R.string.download_status_finished));
                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_main_color));
                        return;
                    }
                    contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                    UtilsMy.c3(contentCollectionHolder.f43796c, appBean);
                    return;
                }
                contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                UtilsMy.c3(contentCollectionHolder.f43796c, appBean);
            } else {
                int status = downloadTask.getStatus();
                if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        contentCollectionHolder.f43796c.setText("暂停中");
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
                                                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_green_butn);
                                                        contentCollectionHolder.f43796c.setText("更新");
                                                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_green_color));
                                                        return;
                                                    case 10:
                                                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        contentCollectionHolder.f43796c.setText("等待");
                                                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    case 11:
                                                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_green_butn);
                                                        contentCollectionHolder.f43796c.setText("安装");
                                                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_green_color));
                                                        return;
                                                    case 12:
                                                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.extract);
                                                        contentCollectionHolder.f43796c.setText("解压中");
                                                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_grey_color));
                                                        return;
                                                    case 13:
                                                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.reextract);
                                                        contentCollectionHolder.f43796c.setText("解压");
                                                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            contentCollectionHolder.f43796c.setText(this.f43792b.getResources().getString(R.string.download_status_finished));
                            contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_main_color));
                            return;
                        }
                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_blue_butn);
                        contentCollectionHolder.f43796c.setText("继续");
                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_blue_color));
                        return;
                    } else {
                        UtilsMy.x4(downloadTask);
                        contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_blue_butn);
                        contentCollectionHolder.f43796c.setText("暂停");
                        contentCollectionHolder.f43796c.setTextColor(this.f43792b.getResources().getColor(R.color.app_blue_color));
                        return;
                    }
                }
                contentCollectionHolder.f43796c.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                UtilsMy.c3(contentCollectionHolder.f43796c, appBean);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f43791a.size();
        }

        public void setListDatas(List<AppBean> list) {
            this.f43791a.clear();
            this.f43791a.addAll(list);
        }
    }

    /* loaded from: classes4.dex */
    public class ContentCollectionHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f43794a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43795b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43796c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f43797d;

        public ContentCollectionHolder(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        InterceptEventHorizontalScrollView f43799a;

        a() {
        }
    }

    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f43800a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f43801b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f43802c;

        /* renamed from: d  reason: collision with root package name */
        public ProgressBar f43803d;

        /* renamed from: e  reason: collision with root package name */
        public ProgressBar f43804e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f43805f;

        /* renamed from: g  reason: collision with root package name */
        private RelativeLayout f43806g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f43807h;

        /* renamed from: i  reason: collision with root package name */
        private LinearLayout f43808i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f43809j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f43810k;

        /* renamed from: l  reason: collision with root package name */
        private LinearLayout f43811l;

        public b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f43813a;

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        TextView f43814a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43815b;

        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f43816a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43817b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43818c;

        e() {
        }
    }

    public PaPaListItemDownloadAdapter(Context context, List<PaPaBean> list, View.OnClickListener onClickListener) {
        this.f43788d = 1;
        this.f43787c = context;
        this.f43786b = list;
        this.f43788d = PaPaBean.getTypes() + 1;
        this.f43789e = onClickListener;
    }

    public void c(View.OnClickListener onClickListener) {
        this.f43790f = onClickListener;
    }

    void d(b bVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            bVar.f43808i.setVisibility(8);
            bVar.f43804e.setVisibility(8);
            bVar.f43803d.setVisibility(8);
            bVar.f43805f.setVisibility(0);
            return;
        }
        bVar.f43808i.setVisibility(0);
        if (bool2.booleanValue()) {
            bVar.f43804e.setVisibility(8);
            bVar.f43803d.setVisibility(0);
        } else {
            bVar.f43803d.setVisibility(8);
            bVar.f43804e.setVisibility(0);
        }
        bVar.f43805f.setVisibility(8);
    }

    void e(View view, a aVar, PaPaBean paPaBean) {
        List<AppBean> list = (List) paPaBean.getTypeValue();
        ContentCollectionAdapter contentCollectionAdapter = (ContentCollectionAdapter) view.getTag(R.id.papa_recycleview_adapter);
        if (contentCollectionAdapter == null) {
            contentCollectionAdapter = new ContentCollectionAdapter(this.f43787c);
            view.setTag(R.id.papa_recycleview_adapter, contentCollectionAdapter);
        }
        aVar.f43799a.setAdapter(contentCollectionAdapter);
        contentCollectionAdapter.setListDatas(list);
        contentCollectionAdapter.notifyDataSetChanged();
    }

    void f(b bVar, PaPaBean paPaBean) {
        AppBean appBean = (AppBean) paPaBean.getTypeValue();
        MyImageLoader.d(bVar.f43800a, R.drawable.main_normal_icon, appBean.getIco_remote());
        bVar.f43801b.setVisibility(8);
        bVar.f43802c.setText(appBean.getGame_name());
        bVar.f43805f.setText(appBean.getInfo());
        long parseDouble = (long) (Double.parseDouble(appBean.getAppSize()) * 1048576.0d);
        UtilsMy.I(appBean.getScore(), appBean.getDown_count(), appBean.getAppSize(), appBean.getSp_tag_info(), appBean.getTag_info(), bVar.f43811l, this.f43787c);
        DownloadTask downloadTask = appBean.getDownloadTask();
        UtilsMy.j3(appBean.getSp_tag_info(), bVar.f43806g, downloadTask);
        bVar.f43807h.setText("");
        String plugin_num = appBean.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            bVar.f43807h.setBackgroundResource(R.drawable.recom_blue_butn);
            bVar.f43807h.setText("开始");
            bVar.f43807h.setTextColor(this.f43787c.getResources().getColor(R.color.app_blue_color));
            bVar.f43811l.setVisibility(8);
            bVar.f43801b.setVisibility(8);
        } else if (downloadTask == null) {
            d(bVar, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(appBean.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f43787c).d(this.f43787c, appBean.getPackageName()) && UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f43787c).l(this.f43787c, appBean.getPackageName());
                    if (com.join.mgps.Util.g2.i(appBean.getVer()) && l4.d() < Integer.parseInt(appBean.getVer())) {
                        bVar.f43807h.setBackgroundResource(R.drawable.recom_green_butn);
                        bVar.f43807h.setText("更新");
                        bVar.f43807h.setTextColor(-9263087);
                    } else {
                        bVar.f43807h.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        bVar.f43807h.setText(this.f43787c.getResources().getString(R.string.download_status_finished));
                        bVar.f43807h.setTextColor(-688602);
                    }
                } else {
                    bVar.f43807h.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                    UtilsMy.Y2(bVar.f43807h, bVar.f43806g, appBean);
                }
            } else {
                bVar.f43807h.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                UtilsMy.Y2(bVar.f43807h, bVar.f43806g, appBean);
            }
        } else {
            int status = downloadTask.getStatus();
            if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    bVar.f43807h.setText("暂停中");
                } else if (status == 48) {
                    bVar.f43807h.setBackgroundResource(R.drawable.recom_blue_butn);
                    bVar.f43807h.setText("安装中");
                    bVar.f43807h.setTextColor(-12941854);
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
                                                    bVar.f43807h.setBackgroundResource(R.drawable.recom_green_butn);
                                                    bVar.f43807h.setText("更新");
                                                    bVar.f43807h.setTextColor(-9263087);
                                                    d(bVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    bVar.f43807h.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    bVar.f43807h.setText("等待");
                                                    bVar.f43807h.setTextColor(-12941854);
                                                    Boolean bool = Boolean.FALSE;
                                                    d(bVar, bool, bool);
                                                    TextView textView = bVar.f43809j;
                                                    textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    try {
                                                        bVar.f43804e.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    bVar.f43810k.setText("等待中");
                                                    break;
                                                case 11:
                                                    bVar.f43807h.setBackgroundResource(R.drawable.recom_green_butn);
                                                    bVar.f43807h.setText("安装");
                                                    bVar.f43807h.setTextColor(-9263087);
                                                    d(bVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    d(bVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView2 = bVar.f43809j;
                                                    textView2.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    bVar.f43810k.setText("解压中..");
                                                    bVar.f43803d.setProgress((int) downloadTask.getProgress());
                                                    bVar.f43807h.setBackgroundResource(R.drawable.extract);
                                                    bVar.f43807h.setText("解压中");
                                                    bVar.f43807h.setTextColor(-4868683);
                                                    break;
                                                case 13:
                                                    d(bVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView3 = bVar.f43809j;
                                                    textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    bVar.f43810k.setText("点击重新解压");
                                                    bVar.f43803d.setProgress((int) downloadTask.getProgress());
                                                    bVar.f43807h.setBackgroundResource(R.drawable.reextract);
                                                    bVar.f43807h.setText("解压");
                                                    bVar.f43807h.setTextColor(-12941854);
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        bVar.f43807h.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        bVar.f43807h.setText(this.f43787c.getResources().getString(R.string.download_status_finished));
                        bVar.f43807h.setTextColor(-688602);
                        Boolean bool2 = Boolean.TRUE;
                        d(bVar, bool2, bool2);
                    }
                    bVar.f43807h.setBackgroundResource(R.drawable.recom_blue_butn);
                    bVar.f43807h.setText("继续");
                    bVar.f43807h.setTextColor(-12941854);
                    Boolean bool3 = Boolean.FALSE;
                    d(bVar, bool3, bool3);
                    try {
                        if (downloadTask.getSize() == 0) {
                            TextView textView4 = bVar.f43809j;
                            textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView5 = bVar.f43809j;
                            textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        bVar.f43804e.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    bVar.f43810k.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    bVar.f43807h.setBackgroundResource(R.drawable.recom_blue_butn);
                    bVar.f43807h.setText("暂停");
                    bVar.f43807h.setTextColor(-12941854);
                    Boolean bool4 = Boolean.FALSE;
                    d(bVar, bool4, bool4);
                    if (downloadTask.getSize() == 0) {
                        TextView textView6 = bVar.f43809j;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    } else {
                        TextView textView7 = bVar.f43809j;
                        textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    }
                    bVar.f43804e.setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    TextView textView8 = bVar.f43810k;
                    textView8.setText(speed + "/S");
                }
            }
            bVar.f43807h.setBackgroundResource(R.drawable.recom_green_butn);
            UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
            UtilsMy.Y2(bVar.f43807h, bVar.f43806g, appBean);
            d(bVar, Boolean.TRUE, Boolean.FALSE);
        }
        bVar.f43806g.setTag(appBean);
        bVar.f43806g.setOnClickListener(this.f43789e);
    }

    void g(c cVar, PaPaBean paPaBean) {
        List list = (List) paPaBean.getTypeValue();
        if (list == null || list.size() == 0) {
            return;
        }
        if (((GameHeadAd) list.get(0)).getMain().getAd_switch() == 0) {
            cVar.f43813a.setVisibility(8);
            return;
        }
        cVar.f43813a.setVisibility(0);
        if (((GameHeadAd) list.get(0)).getSub() != null && ((GameHeadAd) list.get(0)).getSub().size() > 0) {
            cVar.f43813a.setTag(((GameHeadAd) list.get(0)).getSub().get(0));
            cVar.f43813a.setOnClickListener(this.f43790f);
        }
        MyImageLoader.h(cVar.f43813a, ((GameHeadAd) list.get(0)).getMain().getPic_remote());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<PaPaBean> list = this.f43786b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f43786b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f43786b.get(i4).getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        a aVar;
        e eVar;
        e eVar2;
        a aVar2;
        b bVar2;
        d dVar;
        d dVar2;
        a aVar3;
        d dVar3;
        e eVar3;
        d dVar4;
        HashMap<String, Object> imageHeaderParams;
        int itemViewType = getItemViewType(i4);
        c cVar = null;
        if (view == null) {
            if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_IMAGE_HEADER.value()) {
                c cVar2 = new c();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_papa_header_image, (ViewGroup) null);
                PaPaBean paPaBean = this.f43786b.get(i4);
                cVar2.f43813a = (SimpleDraweeView) inflate.findViewById(R.id.gameCover);
                if (paPaBean.getImageHeaderParams() != null) {
                    if (paPaBean.getImageHeaderParams().containsKey(PaPaBean.KEY_IMAGE_HEADER_HEIGHT)) {
                        cVar2.f43813a.setLayoutParams(new LinearLayout.LayoutParams(-1, com.join.mgps.Util.c0.a(this.f43787c, ((Integer) imageHeaderParams.get(PaPaBean.KEY_IMAGE_HEADER_HEIGHT)).intValue())));
                    }
                }
                inflate.setTag(cVar2);
                eVar2 = null;
                aVar2 = null;
                bVar2 = null;
                cVar = cVar2;
                view = inflate;
                dVar2 = bVar2;
                aVar3 = aVar2;
            } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_TITLE_COLLECTION.value()) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_papa_standalone_rec_title, (ViewGroup) null);
                d dVar5 = new d();
                dVar5.f43815b = (TextView) view.findViewById(R.id.tv_all);
                dVar5.f43814a = (TextView) view.findViewById(R.id.tv_title);
                view.setTag(dVar5);
                dVar4 = dVar5;
                eVar2 = null;
                dVar = dVar4;
                eVar3 = eVar2;
                dVar3 = dVar;
                bVar2 = eVar3;
                aVar3 = eVar3;
                dVar2 = dVar3;
            } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_GAMEFACTORY_LIST.value()) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gamefactory_list_title, (ViewGroup) null);
                eVar = new e();
                eVar.f43816a = (SimpleDraweeView) view.findViewById(R.id.gameLogo);
                eVar.f43817b = (TextView) view.findViewById(R.id.tv_name);
                eVar.f43818c = (TextView) view.findViewById(R.id.tv_desc);
                view.setTag(eVar);
                eVar2 = eVar;
                dVar3 = null;
                eVar3 = null;
                bVar2 = eVar3;
                aVar3 = eVar3;
                dVar2 = dVar3;
            } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_COLLECTION.value()) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_papa_standalone_rec, (ViewGroup) null);
                aVar = new a();
                aVar.f43799a = (InterceptEventHorizontalScrollView) view.findViewById(R.id.mHorizontalScrollView);
                view.setTag(aVar);
                aVar3 = aVar;
                dVar2 = null;
                eVar2 = null;
                bVar2 = null;
            } else {
                if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value()) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_papa_download_list, (ViewGroup) null);
                    bVar = new b();
                    bVar.f43800a = (SimpleDraweeView) view.findViewById(R.id.mgListviewItemIcon);
                    bVar.f43801b = (ImageView) view.findViewById(R.id.giftPackageSwich);
                    bVar.f43802c = (TextView) view.findViewById(R.id.mgListviewItemAppname);
                    bVar.f43803d = (ProgressBar) view.findViewById(R.id.progressBarZip);
                    bVar.f43804e = (ProgressBar) view.findViewById(R.id.progressBar);
                    bVar.f43805f = (TextView) view.findViewById(R.id.mgListviewItemDescribe);
                    bVar.f43806g = (RelativeLayout) view.findViewById(R.id.rLayoutRight);
                    bVar.f43807h = (TextView) view.findViewById(R.id.mgListviewItemInstall);
                    bVar.f43808i = (LinearLayout) view.findViewById(R.id.linearLayout2);
                    bVar.f43809j = (TextView) view.findViewById(R.id.appSize);
                    bVar.f43810k = (TextView) view.findViewById(R.id.loding_info);
                    bVar.f43811l = (LinearLayout) view.findViewById(R.id.tipsLayout);
                    view.setTag(bVar);
                    bVar2 = bVar;
                    dVar2 = null;
                    eVar2 = null;
                    aVar3 = null;
                }
                dVar = null;
                eVar2 = null;
                eVar3 = eVar2;
                dVar3 = dVar;
                bVar2 = eVar3;
                aVar3 = eVar3;
                dVar2 = dVar3;
            }
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_IMAGE_HEADER.value()) {
            eVar2 = null;
            aVar2 = null;
            bVar2 = null;
            cVar = (c) view.getTag();
            dVar2 = bVar2;
            aVar3 = aVar2;
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_TITLE_COLLECTION.value()) {
            dVar4 = (d) view.getTag();
            eVar2 = null;
            dVar = dVar4;
            eVar3 = eVar2;
            dVar3 = dVar;
            bVar2 = eVar3;
            aVar3 = eVar3;
            dVar2 = dVar3;
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_GAMEFACTORY_LIST.value()) {
            eVar = (e) view.getTag();
            eVar2 = eVar;
            dVar3 = null;
            eVar3 = null;
            bVar2 = eVar3;
            aVar3 = eVar3;
            dVar2 = dVar3;
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_COLLECTION.value()) {
            aVar = (a) view.getTag();
            aVar3 = aVar;
            dVar2 = null;
            eVar2 = null;
            bVar2 = null;
        } else {
            if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value()) {
                bVar = (b) view.getTag();
                bVar2 = bVar;
                dVar2 = null;
                eVar2 = null;
                aVar3 = null;
            }
            dVar = null;
            eVar2 = null;
            eVar3 = eVar2;
            dVar3 = dVar;
            bVar2 = eVar3;
            aVar3 = eVar3;
            dVar2 = dVar3;
        }
        PaPaBean paPaBean2 = this.f43786b.get(i4);
        if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_IMAGE_HEADER.value()) {
            g(cVar, paPaBean2);
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_TITLE_COLLECTION.value()) {
            h(dVar2, paPaBean2);
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_GAMEFACTORY_LIST.value()) {
            i(eVar2, paPaBean2);
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_COLLECTION.value()) {
            e(view, aVar3, paPaBean2);
        } else if (itemViewType == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value()) {
            f(bVar2, paPaBean2);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f43788d;
    }

    void h(d dVar, PaPaBean paPaBean) {
        CollectionInfo collectionInfo = (CollectionInfo) paPaBean.getTypeValue();
        dVar.f43814a.setText(collectionInfo.getTitle());
        dVar.f43815b.setTag(collectionInfo);
        dVar.f43815b.setOnClickListener(this.f43790f);
    }

    void i(e eVar, PaPaBean paPaBean) {
        GameFactoryListBean.LogoInfo logoInfo = (GameFactoryListBean.LogoInfo) paPaBean.getTypeValue();
        MyImageLoader.h(eVar.f43816a, logoInfo.getLogo_pic());
        eVar.f43818c.setText(logoInfo.getIntroduce());
        eVar.f43817b.setText(logoInfo.getTitle());
    }
}
