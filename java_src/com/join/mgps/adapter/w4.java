package com.join.mgps.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RankingItemV2Adapter.java */
/* loaded from: classes4.dex */
public class w4 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45964b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45965c;

    /* renamed from: f  reason: collision with root package name */
    private String f45968f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f45969g;

    /* renamed from: d  reason: collision with root package name */
    private List<PAPAHomeBeanV7.HomeBeanDTO> f45966d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f45967e = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f45970h = false;

    /* renamed from: i  reason: collision with root package name */
    private a f45971i = null;

    /* compiled from: RankingItemV2Adapter.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO);
    }

    /* compiled from: RankingItemV2Adapter.java */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public TextView f45972a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f45973b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45974c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f45975d;

        /* renamed from: e  reason: collision with root package name */
        public LinearLayout f45976e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45977f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f45978g;

        /* renamed from: h  reason: collision with root package name */
        public ProgressBar f45979h;

        /* renamed from: i  reason: collision with root package name */
        public ProgressBar f45980i;

        /* renamed from: j  reason: collision with root package name */
        public FrameLayout f45981j;

        /* renamed from: k  reason: collision with root package name */
        public ProgressBar f45982k;

        public b() {
        }
    }

    public w4(Context context, String str) {
        this.f45968f = "0";
        this.f45964b = context;
        this.f45965c = LayoutInflater.from(context);
        this.f45968f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, b bVar, int i4, View view) {
        homeBeanDTO.setRequesting(homeBeanDTO.getGameBean() == null && homeBeanDTO.getDownloadTask() == null);
        bVar.f45982k.setVisibility(homeBeanDTO.isRequesting() ? 0 : 4);
        bVar.f45974c.setVisibility(homeBeanDTO.isRequesting() ? 4 : 0);
        a aVar = this.f45971i;
        if (aVar != null) {
            aVar.a(i4, homeBeanDTO);
        }
    }

    private void g(TextView textView, LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, boolean z4, boolean z5) {
        if (z4) {
            textView.setVisibility(0);
            linearLayout.setVisibility(8);
            progressBar.setVisibility(8);
            progressBar2.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(8);
        if (z5) {
            progressBar2.setVisibility(0);
            progressBar.setVisibility(8);
            return;
        }
        progressBar.setVisibility(0);
        progressBar2.setVisibility(8);
    }

    public List<PAPAHomeBeanV7.HomeBeanDTO> b() {
        return this.f45966d;
    }

    public void d() {
        this.f45970h = true;
    }

    public void e(a aVar) {
        this.f45971i = aVar;
    }

    public void f(int i4) {
        this.f45967e = i4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45966d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (this.f45966d.size() != 0 && i4 < this.f45966d.size()) {
            return this.f45966d.get(i4);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(final int i4, View view, ViewGroup viewGroup) {
        b bVar;
        View view2;
        if (view == null) {
            View inflate = this.f45965c.inflate(R.layout.ranking_listview_item_v2, (ViewGroup) null);
            bVar = new b();
            bVar.f45972a = (TextView) inflate.findViewById(R.id.tvGameName);
            bVar.f45973b = (TextView) inflate.findViewById(R.id.tvTags);
            bVar.f45974c = (TextView) inflate.findViewById(R.id.tvBtn);
            bVar.f45975d = (SimpleDraweeView) inflate.findViewById(R.id.ivGamePic);
            bVar.f45976e = (LinearLayout) inflate.findViewById(R.id.llInfo);
            bVar.f45977f = (TextView) inflate.findViewById(R.id.appSize);
            bVar.f45978g = (TextView) inflate.findViewById(R.id.loding_info);
            bVar.f45979h = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
            bVar.f45980i = (ProgressBar) inflate.findViewById(R.id.progressBar);
            bVar.f45981j = (FrameLayout) inflate.findViewById(R.id.flBtn);
            bVar.f45982k = (ProgressBar) inflate.findViewById(R.id.loading_progress);
            inflate.setTag(bVar);
            view2 = inflate;
        } else {
            bVar = (b) view.getTag();
            view2 = view;
        }
        final b bVar2 = bVar;
        final PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = this.f45966d.get(i4);
        MyImageLoader.i(bVar2.f45975d, homeBeanDTO.getBig_pic(), r.c.f11300g);
        if (homeBeanDTO.getG_info() != null) {
            bVar2.f45972a.setText(homeBeanDTO.getG_info().getName());
            if (!TextUtils.isEmpty(homeBeanDTO.getG_info().getTag_name())) {
                StringBuilder sb = new StringBuilder();
                String[] split = homeBeanDTO.getG_info().getTag_name().split(",");
                for (int i5 = 0; i5 < split.length; i5++) {
                    sb.append(split[i5]);
                    sb.append(" | ");
                    if (i5 >= 1) {
                        break;
                    }
                }
                bVar2.f45973b.setText(sb.substring(0, sb.length() - 3));
            }
            bVar2.f45974c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.v4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    w4.this.c(homeBeanDTO, bVar2, i4, view3);
                }
            });
        }
        bVar2.f45974c.setVisibility(0);
        bVar2.f45974c.setText("获取");
        bVar2.f45982k.setVisibility(4);
        DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
        CollectionBeanSub gameBean = homeBeanDTO.getGameBean();
        long size = downloadTask != null ? downloadTask.getSize() : 0L;
        if (gameBean != null) {
            if ((ConstantIntEnum.H5.value() + "").equals(gameBean.getPlugin_num())) {
                bVar2.f45974c.setText("开始");
                bVar2.f45972a.setVisibility(8);
                return view2;
            }
        }
        if (downloadTask == null) {
            g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, true, false);
            if (gameBean == null) {
                return view2;
            }
            if (UtilsMy.o0(gameBean.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f45964b).d(this.f45964b, gameBean.getPackageName()) && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45964b).l(this.f45964b, gameBean.getPackageName());
                    if (com.join.mgps.Util.g2.i(gameBean.getVer()) && l4.d() < Integer.parseInt(gameBean.getVer())) {
                        bVar2.f45974c.setText("更新");
                    } else {
                        bVar2.f45974c.setText("启动");
                    }
                } else {
                    UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
                    UtilsMy.f3(bVar2.f45974c, bVar2.f45981j, gameBean);
                }
            } else {
                UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
                UtilsMy.f3(bVar2.f45974c, bVar2.f45981j, gameBean);
            }
        } else {
            int status = downloadTask.getStatus();
            if (gameBean != null && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    bVar2.f45974c.setText("暂停中");
                } else if (status == 48) {
                    bVar2.f45974c.setText("安装中");
                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, true, false);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    bVar2.f45974c.setText("更新");
                                                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, true, false);
                                                    break;
                                                case 10:
                                                    bVar2.f45974c.setText("等待");
                                                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, false, false);
                                                    TextView textView = bVar2.f45977f;
                                                    textView.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                    try {
                                                        bVar2.f45980i.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    bVar2.f45978g.setText("等待");
                                                    break;
                                                case 11:
                                                    bVar2.f45974c.setText("安装");
                                                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, true, false);
                                                    break;
                                                case 12:
                                                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, false, true);
                                                    TextView textView2 = bVar2.f45977f;
                                                    textView2.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                    bVar2.f45978g.setText("解压中..");
                                                    bVar2.f45979h.setProgress((int) downloadTask.getProgress());
                                                    bVar2.f45974c.setText("解压中");
                                                    break;
                                                case 13:
                                                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, false, true);
                                                    TextView textView3 = bVar2.f45977f;
                                                    textView3.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                    bVar2.f45978g.setText("点击重新解压");
                                                    bVar2.f45979h.setProgress((int) downloadTask.getProgress());
                                                    bVar2.f45974c.setText("解压");
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        bVar2.f45974c.setText("启动");
                        g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, true, true);
                    }
                    bVar2.f45974c.setText("继续");
                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, false, false);
                    try {
                        if (downloadTask.getSize() == 0) {
                            TextView textView4 = bVar2.f45977f;
                            textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                        } else {
                            TextView textView5 = bVar2.f45977f;
                            textView5.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                        }
                        bVar2.f45980i.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    bVar2.f45978g.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    bVar2.f45974c.setText("暂停");
                    g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, false, false);
                    if (downloadTask.getSize() == 0) {
                        TextView textView6 = bVar2.f45977f;
                        textView6.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    } else {
                        TextView textView7 = bVar2.f45977f;
                        textView7.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    }
                    bVar2.f45980i.setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    TextView textView8 = bVar2.f45978g;
                    textView8.setText(speed + "/S");
                }
            }
            bVar2.f45974c.setText("获取");
            UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
            UtilsMy.f3(bVar2.f45974c, bVar2.f45981j, gameBean);
            g(bVar2.f45973b, bVar2.f45976e, bVar2.f45980i, bVar2.f45979h, true, false);
        }
        return view2;
    }
}
