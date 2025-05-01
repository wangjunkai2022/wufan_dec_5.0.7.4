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
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.PaPaBannerListActivity_;
import com.join.mgps.activity.TagGameListActivity_;
import com.join.mgps.customview.InterceptEventHorizontalScrollView;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.CollectionInfo;
import com.join.mgps.dto.PaPaBean;
import com.join.mgps.dto.StandAloneListBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class PaPaStandAloneV2Adapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private List<PaPaBean> f43819b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f43820c;

    /* renamed from: d  reason: collision with root package name */
    private int f43821d;

    /* renamed from: e  reason: collision with root package name */
    private final View.OnClickListener f43822e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f43823f;

    /* loaded from: classes4.dex */
    public class ContentCollectionAdapter extends RecyclerView.Adapter<ContentCollectionHolder> {

        /* renamed from: a  reason: collision with root package name */
        private List<AppBean> f43824a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private Context f43825b;

        public ContentCollectionAdapter(Context context) {
            this.f43825b = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(ContentCollectionHolder contentCollectionHolder, int i4) {
            e(contentCollectionHolder, this.f43824a.get(i4));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public ContentCollectionHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_standalone_horizontal_item_view, (ViewGroup) null);
            ContentCollectionHolder contentCollectionHolder = new ContentCollectionHolder(inflate);
            contentCollectionHolder.f43827a = (SimpleDraweeView) inflate.findViewById(R.id.image1);
            contentCollectionHolder.f43828b = (TextView) inflate.findViewById(R.id.appname1);
            contentCollectionHolder.f43829c = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.rootView);
            contentCollectionHolder.f43830d = linearLayout;
            linearLayout.setOnClickListener(PaPaStandAloneV2Adapter.this.f43823f);
            contentCollectionHolder.f43829c.setOnClickListener(PaPaStandAloneV2Adapter.this.f43822e);
            return contentCollectionHolder;
        }

        public void e(ContentCollectionHolder contentCollectionHolder, AppBean appBean) {
            contentCollectionHolder.f43830d.setTag(appBean);
            contentCollectionHolder.f43828b.setText(appBean.getGame_name());
            MyImageLoader.h(contentCollectionHolder.f43827a, appBean.getIco_remote());
            contentCollectionHolder.f43829c.setTag(appBean);
            DownloadTask downloadTask = appBean.getDownloadTask();
            UtilsMy.j3(appBean.getSp_tag_info(), contentCollectionHolder.f43830d, downloadTask);
            String plugin_num = appBean.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_blue_butn);
                contentCollectionHolder.f43829c.setText("开始");
                contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_blue_color));
            } else if (downloadTask == null) {
                appBean.getDownloadtaskDown();
                if (UtilsMy.o0(appBean.getTag_info())) {
                    boolean d5 = com.join.android.app.common.utils.e.l0(this.f43825b).d(this.f43825b, appBean.getPackageName());
                    if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                        d5 = false;
                    }
                    if (d5) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f43825b).l(this.f43825b, appBean.getPackageName());
                        if (com.join.mgps.Util.g2.i(appBean.getVer()) && l4.d() < Integer.parseInt(appBean.getVer())) {
                            contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_green_butn);
                            contentCollectionHolder.f43829c.setText("更新");
                            contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_green_color));
                            return;
                        }
                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        contentCollectionHolder.f43829c.setText(this.f43825b.getResources().getString(R.string.download_status_finished));
                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_main_color));
                        return;
                    }
                    contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                    UtilsMy.c3(contentCollectionHolder.f43829c, appBean);
                    return;
                }
                contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                UtilsMy.c3(contentCollectionHolder.f43829c, appBean);
            } else {
                int status = downloadTask.getStatus();
                if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        contentCollectionHolder.f43829c.setText("暂停中");
                        return;
                    } else if (status == 48) {
                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_blue_butn);
                        contentCollectionHolder.f43829c.setText("安装中");
                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_blue_color));
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
                                                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_green_butn);
                                                        contentCollectionHolder.f43829c.setText("更新");
                                                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_green_color));
                                                        return;
                                                    case 10:
                                                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        contentCollectionHolder.f43829c.setText("等待");
                                                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    case 11:
                                                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_green_butn);
                                                        contentCollectionHolder.f43829c.setText("安装");
                                                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_green_color));
                                                        return;
                                                    case 12:
                                                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.extract);
                                                        contentCollectionHolder.f43829c.setText("解压中");
                                                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_grey_color));
                                                        return;
                                                    case 13:
                                                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.reextract);
                                                        contentCollectionHolder.f43829c.setText("解压");
                                                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            contentCollectionHolder.f43829c.setText(this.f43825b.getResources().getString(R.string.download_status_finished));
                            contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_main_color));
                            return;
                        }
                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_blue_butn);
                        contentCollectionHolder.f43829c.setText("继续");
                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_blue_color));
                        return;
                    } else {
                        UtilsMy.x4(downloadTask);
                        contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_blue_butn);
                        TextView textView = contentCollectionHolder.f43829c;
                        textView.setText(((int) downloadTask.getProgress()) + "%");
                        contentCollectionHolder.f43829c.setTextColor(this.f43825b.getResources().getColor(R.color.app_blue_color));
                        return;
                    }
                }
                contentCollectionHolder.f43829c.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                UtilsMy.c3(contentCollectionHolder.f43829c, appBean);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f43824a.size();
        }

        public void setListDatas(List<AppBean> list) {
            this.f43824a.clear();
            this.f43824a.addAll(list);
        }
    }

    /* loaded from: classes4.dex */
    public class ContentCollectionHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f43827a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43828b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43829c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f43830d;

        public ContentCollectionHolder(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    public class ContentCompanyAdapter extends RecyclerView.Adapter<ContentCompanyHolder> {

        /* renamed from: a  reason: collision with root package name */
        private List<StandAloneListBean.ListBean> f43832a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private Context f43833b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ StandAloneListBean.ListBean f43835b;

            a(StandAloneListBean.ListBean listBean) {
                this.f43835b = listBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PaPaBannerListActivity_.k0(ContentCompanyAdapter.this.f43833b).e(1).a(true).b(true).c(this.f43835b.getId()).d(this.f43835b.getTitle()).start();
            }
        }

        public ContentCompanyAdapter(Context context) {
            this.f43833b = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b */
        public void onBindViewHolder(ContentCompanyHolder contentCompanyHolder, int i4) {
            e(contentCompanyHolder, this.f43832a.get(i4), i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public ContentCompanyHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_standalone_company_item_view, (ViewGroup) null);
            ContentCompanyHolder contentCompanyHolder = new ContentCompanyHolder(inflate);
            contentCompanyHolder.f43837a = inflate.findViewById(R.id.standAloneLeftVi);
            contentCompanyHolder.f43838b = (RelativeLayout) inflate.findViewById(R.id.standAloneCompanyRootRl);
            contentCompanyHolder.f43839c = (TextView) inflate.findViewById(R.id.standAloneCompanyTv);
            contentCompanyHolder.f43840d = (SimpleDraweeView) inflate.findViewById(R.id.standAloneCompanyIv);
            contentCompanyHolder.f43841e = inflate.findViewById(R.id.standAloneRightVi);
            return contentCompanyHolder;
        }

        public void e(ContentCompanyHolder contentCompanyHolder, StandAloneListBean.ListBean listBean, int i4) {
            if (i4 == 0) {
                contentCompanyHolder.f43837a.setVisibility(0);
                contentCompanyHolder.f43841e.setVisibility(8);
            } else if (i4 == this.f43832a.size() - 1) {
                contentCompanyHolder.f43837a.setVisibility(8);
                contentCompanyHolder.f43841e.setVisibility(0);
            } else {
                contentCompanyHolder.f43837a.setVisibility(8);
                contentCompanyHolder.f43841e.setVisibility(8);
            }
            contentCompanyHolder.f43839c.setText(listBean.getTitle());
            contentCompanyHolder.f43840d.setImageURI(listBean.getPic());
            contentCompanyHolder.f43838b.setOnClickListener(new a(listBean));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f43832a.size();
        }

        public void setListDatas(List<StandAloneListBean.ListBean> list) {
            this.f43832a.clear();
            this.f43832a.addAll(list);
        }
    }

    /* loaded from: classes4.dex */
    public class ContentCompanyHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f43837a;

        /* renamed from: b  reason: collision with root package name */
        RelativeLayout f43838b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43839c;

        /* renamed from: d  reason: collision with root package name */
        SimpleDraweeView f43840d;

        /* renamed from: e  reason: collision with root package name */
        View f43841e;

        public ContentCompanyHolder(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StandAloneListBean.ListBean f43843b;

        a(StandAloneListBean.ListBean listBean) {
            this.f43843b = listBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.F0(PaPaStandAloneV2Adapter.this.f43820c).b(0).c(true).d(this.f43843b.getTitle()).e(Integer.parseInt(this.f43843b.getId())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StandAloneListBean.ListBean f43845b;

        b(StandAloneListBean.ListBean listBean) {
            this.f43845b = listBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.F0(PaPaStandAloneV2Adapter.this.f43820c).b(0).c(true).d(this.f43845b.getTitle()).e(Integer.parseInt(this.f43845b.getId())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StandAloneListBean.ListBean f43847b;

        c(StandAloneListBean.ListBean listBean) {
            this.f43847b = listBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.F0(PaPaStandAloneV2Adapter.this.f43820c).b(0).c(true).d(this.f43847b.getTitle()).e(Integer.parseInt(this.f43847b.getId())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBean f43849b;

        d(AppBean appBean) {
            this.f43849b = appBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(PaPaStandAloneV2Adapter.this.f43820c, this.f43849b.getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        private RelativeLayout f43851a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f43852b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f43853c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f43854d;

        /* renamed from: e  reason: collision with root package name */
        public ProgressBar f43855e;

        /* renamed from: f  reason: collision with root package name */
        public ProgressBar f43856f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f43857g;

        /* renamed from: h  reason: collision with root package name */
        private RelativeLayout f43858h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f43859i;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f43860j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f43861k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f43862l;

        /* renamed from: m  reason: collision with root package name */
        private LinearLayout f43863m;

        public e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        InterceptEventHorizontalScrollView f43865a;

        f() {
        }
    }

    /* loaded from: classes4.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public InterceptEventHorizontalScrollView f43866a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        View f43867a;

        h() {
        }
    }

    /* loaded from: classes4.dex */
    static class i {
        i() {
        }
    }

    /* loaded from: classes4.dex */
    public class j {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f43868a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f43869b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f43870c;

        /* renamed from: d  reason: collision with root package name */
        private LinearLayout f43871d;

        /* renamed from: e  reason: collision with root package name */
        private SimpleDraweeView f43872e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f43873f;

        /* renamed from: g  reason: collision with root package name */
        private LinearLayout f43874g;

        /* renamed from: h  reason: collision with root package name */
        private SimpleDraweeView f43875h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f43876i;

        public j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        TextView f43878a;

        k() {
        }
    }

    public PaPaStandAloneV2Adapter(Context context, List<PaPaBean> list, View.OnClickListener onClickListener) {
        this.f43821d = 1;
        this.f43820c = context;
        this.f43819b = list;
        this.f43821d = PaPaBean.getTypes() + 1;
        this.f43822e = onClickListener;
    }

    private void e(e eVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            eVar.f43860j.setVisibility(8);
            eVar.f43856f.setVisibility(8);
            eVar.f43855e.setVisibility(8);
            eVar.f43857g.setVisibility(0);
            return;
        }
        eVar.f43860j.setVisibility(0);
        if (bool2.booleanValue()) {
            eVar.f43856f.setVisibility(8);
            eVar.f43855e.setVisibility(0);
        } else {
            eVar.f43855e.setVisibility(8);
            eVar.f43856f.setVisibility(0);
        }
        eVar.f43857g.setVisibility(8);
    }

    private void f(View view, f fVar, PaPaBean paPaBean) {
        List<StandAloneListBean.ListBean> list = (List) paPaBean.getTypeValue();
        ContentCompanyAdapter contentCompanyAdapter = (ContentCompanyAdapter) view.getTag(R.id.papa_company_recycleview_adapter);
        if (contentCompanyAdapter == null) {
            contentCompanyAdapter = new ContentCompanyAdapter(this.f43820c);
            view.setTag(R.id.papa_company_recycleview_adapter, contentCompanyAdapter);
        }
        fVar.f43865a.setAdapter(contentCompanyAdapter);
        contentCompanyAdapter.setListDatas(list);
        contentCompanyAdapter.notifyDataSetChanged();
    }

    private void g(View view, g gVar, PaPaBean paPaBean) {
        List<AppBean> list = (List) paPaBean.getTypeValue();
        ContentCollectionAdapter contentCollectionAdapter = (ContentCollectionAdapter) view.getTag(R.id.papa_recycleview_adapter);
        if (contentCollectionAdapter == null) {
            contentCollectionAdapter = new ContentCollectionAdapter(this.f43820c);
            view.setTag(R.id.papa_recycleview_adapter, contentCollectionAdapter);
        }
        gVar.f43866a.setAdapter(contentCollectionAdapter);
        contentCollectionAdapter.setListDatas(list);
        contentCollectionAdapter.notifyDataSetChanged();
    }

    private void h(h hVar, int i4) {
        if (i4 == 0) {
            hVar.f43867a.setVisibility(8);
        } else {
            hVar.f43867a.setVisibility(0);
        }
    }

    private void i(i iVar, PaPaBean paPaBean) {
    }

    private void j(j jVar, PaPaBean paPaBean) {
        List list = (List) paPaBean.getTypeValue();
        jVar.f43868a.setVisibility(4);
        jVar.f43871d.setVisibility(4);
        jVar.f43874g.setVisibility(4);
        for (int i4 = 0; i4 < list.size(); i4++) {
            StandAloneListBean.ListBean listBean = (StandAloneListBean.ListBean) list.get(i4);
            if (i4 == 0) {
                jVar.f43870c.setText(listBean.getTitle());
                jVar.f43869b.setImageURI(listBean.getPic());
                jVar.f43868a.setVisibility(0);
                jVar.f43868a.setOnClickListener(new a(listBean));
            } else if (i4 == 1) {
                jVar.f43873f.setText(listBean.getTitle());
                jVar.f43872e.setImageURI(listBean.getPic());
                jVar.f43871d.setVisibility(0);
                jVar.f43871d.setOnClickListener(new b(listBean));
            } else if (i4 == 2) {
                jVar.f43876i.setText(listBean.getTitle());
                jVar.f43875h.setImageURI(listBean.getPic());
                jVar.f43874g.setVisibility(0);
                jVar.f43874g.setOnClickListener(new c(listBean));
            }
        }
    }

    private void k(k kVar, PaPaBean paPaBean) {
        kVar.f43878a.setText(((CollectionInfo) paPaBean.getTypeValue()).getTitle());
    }

    private void l(e eVar, PaPaBean paPaBean) {
        AppBean appBean = (AppBean) paPaBean.getTypeValue();
        MyImageLoader.d(eVar.f43852b, R.drawable.main_normal_icon, appBean.getIco_remote());
        eVar.f43853c.setVisibility(8);
        eVar.f43854d.setText(appBean.getGame_name());
        eVar.f43857g.setText(appBean.getInfo());
        long parseDouble = (long) (Double.parseDouble(appBean.getAppSize()) * 1048576.0d);
        UtilsMy.I(appBean.getScore(), appBean.getDown_count(), appBean.getAppSize(), appBean.getSp_tag_info(), appBean.getTag_info(), eVar.f43863m, this.f43820c);
        DownloadTask downloadTask = appBean.getDownloadTask();
        UtilsMy.j3(appBean.getSp_tag_info(), eVar.f43858h, downloadTask);
        eVar.f43859i.setText("");
        String plugin_num = appBean.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            eVar.f43859i.setBackgroundResource(R.drawable.recom_blue_butn);
            eVar.f43859i.setText("开始");
            eVar.f43859i.setTextColor(this.f43820c.getResources().getColor(R.color.app_blue_color));
            eVar.f43863m.setVisibility(8);
            eVar.f43853c.setVisibility(8);
        } else if (downloadTask == null) {
            appBean.getDownloadtaskDown();
            e(eVar, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(appBean.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f43820c).d(this.f43820c, appBean.getPackageName()) && UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f43820c).l(this.f43820c, appBean.getPackageName());
                    if (com.join.mgps.Util.g2.i(appBean.getVer()) && l4.d() < Integer.parseInt(appBean.getVer())) {
                        eVar.f43859i.setBackgroundResource(R.drawable.recom_green_butn);
                        eVar.f43859i.setText("更新");
                        eVar.f43859i.setTextColor(-9263087);
                    } else {
                        eVar.f43859i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        eVar.f43859i.setText(this.f43820c.getResources().getString(R.string.download_status_finished));
                        eVar.f43859i.setTextColor(-688602);
                    }
                } else {
                    eVar.f43859i.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                    UtilsMy.Y2(eVar.f43859i, eVar.f43858h, appBean);
                }
            } else {
                eVar.f43859i.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
                UtilsMy.Y2(eVar.f43859i, eVar.f43858h, appBean);
            }
        } else {
            int status = downloadTask.getStatus();
            if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    eVar.f43859i.setText("暂停中");
                } else if (status == 48) {
                    eVar.f43859i.setBackgroundResource(R.drawable.recom_blue_butn);
                    eVar.f43859i.setText("安装中");
                    eVar.f43859i.setTextColor(-12941854);
                    e(eVar, Boolean.TRUE, Boolean.FALSE);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    eVar.f43859i.setBackgroundResource(R.drawable.recom_green_butn);
                                                    eVar.f43859i.setText("更新");
                                                    eVar.f43859i.setTextColor(-9263087);
                                                    e(eVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    eVar.f43859i.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    eVar.f43859i.setText("等待");
                                                    eVar.f43859i.setTextColor(-12941854);
                                                    Boolean bool = Boolean.FALSE;
                                                    e(eVar, bool, bool);
                                                    TextView textView = eVar.f43861k;
                                                    textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    try {
                                                        eVar.f43856f.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    eVar.f43862l.setText("等待中");
                                                    break;
                                                case 11:
                                                    eVar.f43859i.setBackgroundResource(R.drawable.recom_green_butn);
                                                    eVar.f43859i.setText("安装");
                                                    eVar.f43859i.setTextColor(-9263087);
                                                    e(eVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    e(eVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView2 = eVar.f43861k;
                                                    textView2.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    eVar.f43862l.setText("解压中..");
                                                    eVar.f43855e.setProgress((int) downloadTask.getProgress());
                                                    eVar.f43859i.setBackgroundResource(R.drawable.extract);
                                                    eVar.f43859i.setText("解压中");
                                                    eVar.f43859i.setTextColor(-4868683);
                                                    break;
                                                case 13:
                                                    e(eVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView3 = eVar.f43861k;
                                                    textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    eVar.f43862l.setText("点击重新解压");
                                                    eVar.f43855e.setProgress((int) downloadTask.getProgress());
                                                    eVar.f43859i.setBackgroundResource(R.drawable.reextract);
                                                    eVar.f43859i.setText("解压");
                                                    eVar.f43859i.setTextColor(-12941854);
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        eVar.f43859i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        eVar.f43859i.setText(this.f43820c.getResources().getString(R.string.download_status_finished));
                        eVar.f43859i.setTextColor(-688602);
                        Boolean bool2 = Boolean.TRUE;
                        e(eVar, bool2, bool2);
                    }
                    eVar.f43859i.setBackgroundResource(R.drawable.recom_blue_butn);
                    eVar.f43859i.setText("继续");
                    eVar.f43859i.setTextColor(-12941854);
                    Boolean bool3 = Boolean.FALSE;
                    e(eVar, bool3, bool3);
                    try {
                        if (downloadTask.getSize() == 0) {
                            TextView textView4 = eVar.f43861k;
                            textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView5 = eVar.f43861k;
                            textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        eVar.f43856f.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    eVar.f43862l.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    eVar.f43859i.setBackgroundResource(R.drawable.recom_blue_butn);
                    eVar.f43859i.setText("暂停");
                    eVar.f43859i.setTextColor(-12941854);
                    Boolean bool4 = Boolean.FALSE;
                    e(eVar, bool4, bool4);
                    if (downloadTask.getSize() == 0) {
                        TextView textView6 = eVar.f43861k;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    } else {
                        TextView textView7 = eVar.f43861k;
                        textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    }
                    eVar.f43856f.setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    TextView textView8 = eVar.f43862l;
                    textView8.setText(speed + "/S");
                }
            }
            eVar.f43859i.setBackgroundResource(R.drawable.recom_green_butn);
            UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id());
            UtilsMy.Y2(eVar.f43859i, eVar.f43858h, appBean);
            e(eVar, Boolean.TRUE, Boolean.FALSE);
        }
        eVar.f43858h.setOnClickListener(this.f43822e);
        eVar.f43858h.setTag(appBean);
        eVar.f43851a.setOnClickListener(new d(appBean));
    }

    public void d(View.OnClickListener onClickListener) {
        this.f43823f = onClickListener;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<PaPaBean> list = this.f43819b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f43819b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f43819b.get(i4).getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d8  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.PaPaStandAloneV2Adapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f43821d;
    }
}
