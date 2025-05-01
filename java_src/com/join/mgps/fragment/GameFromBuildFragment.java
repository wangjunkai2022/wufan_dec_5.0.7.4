package com.join.mgps.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.GameDetailActivity_;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.GameFromBooleanBean;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.game_build)
/* loaded from: classes.dex */
public class GameFromBuildFragment extends Fragment implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f51705b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f51706c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f51707d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f51708e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f51709f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f51710g;

    /* renamed from: h  reason: collision with root package name */
    Context f51711h;

    /* renamed from: i  reason: collision with root package name */
    f f51712i;

    /* renamed from: k  reason: collision with root package name */
    String f51714k;

    /* renamed from: l  reason: collision with root package name */
    String f51715l;

    /* renamed from: m  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f51716m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.b f51717n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.i f51718o;

    /* renamed from: p  reason: collision with root package name */
    List<GameFromPopoWinBean.DataBean> f51719p;

    /* renamed from: q  reason: collision with root package name */
    List<e> f51720q;

    /* renamed from: s  reason: collision with root package name */
    List<CollectionBeanSub> f51722s;

    /* renamed from: t  reason: collision with root package name */
    List<DownloadTask> f51723t;

    /* renamed from: j  reason: collision with root package name */
    int f51713j = 1;

    /* renamed from: r  reason: collision with root package name */
    boolean f51721r = false;

    /* renamed from: u  reason: collision with root package name */
    private Map<String, DownloadTask> f51724u = new ConcurrentHashMap();

    /* renamed from: v  reason: collision with root package name */
    int f51725v = 0;

    /* renamed from: w  reason: collision with root package name */
    List<CollectionBeanSubBusiness> f51726w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private int f51727x = 0;

    /* renamed from: y  reason: collision with root package name */
    private int f51728y = 0;

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            GameFromBuildFragment gameFromBuildFragment = GameFromBuildFragment.this;
            gameFromBuildFragment.f51713j = 1;
            gameFromBuildFragment.Z();
            GameFromBuildFragment.this.f0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            GameFromBuildFragment.this.Z();
            GameFromBuildFragment.this.f0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f51731b;

        public c(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f51731b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f51731b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f51731b.getTag_info())) {
                    if (this.f51731b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(GameFromBuildFragment.this.f51711h).d(GameFromBuildFragment.this.f51711h, this.f51731b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(GameFromBuildFragment.this.f51711h).l(GameFromBuildFragment.this.f51711h, this.f51731b.getPackage_name());
                            if (!g2.i(this.f51731b.getVer()) || l4.d() >= Integer.parseInt(this.f51731b.getVer())) {
                                com.join.android.app.common.utils.e.l0(GameFromBuildFragment.this.f51711h);
                                APKUtils.a0(GameFromBuildFragment.this.f51711h, this.f51731b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(GameFromBuildFragment.this.f51711h).d(GameFromBuildFragment.this.f51711h, this.f51731b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f51731b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(GameFromBuildFragment.this.f51711h);
                            APKUtils.V(GameFromBuildFragment.this.f51711h, this.f51731b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(GameFromBuildFragment.this.f51711h, this.f51731b);
                return;
            }
            String plugin_num = this.f51731b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f51731b.getDown_url_remote());
                UtilsMy.T2(downloadTask, GameFromBuildFragment.this.f51711h);
                IntentUtil.getInstance().intentActivity(GameFromBuildFragment.this.f51711h, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f51731b.getPay_tag_info(), this.f51731b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status != 13) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(GameFromBuildFragment.this.f51711h, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(GameFromBuildFragment.this.f51711h)) {
                                            l2.a(GameFromBuildFragment.this.f51711h).b("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(GameFromBuildFragment.this.f51711h, downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(GameFromBuildFragment.this.f51711h)) {
                                                    l2.a(GameFromBuildFragment.this.f51711h).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(GameFromBuildFragment.this.f51711h, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, GameFromBuildFragment.this.f51711h);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, GameFromBuildFragment.this.f51711h);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(GameFromBuildFragment.this.f51711h, downloadTask);
                return;
            }
            if (UtilsMy.y0(this.f51731b.getPay_tag_info(), this.f51731b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(GameFromBuildFragment.this.f51711h, downloadTask.getCrc_link_type_val());
            } else if (this.f51731b.getDown_status() == 5) {
                UtilsMy.l1(GameFromBuildFragment.this.f51711h, downloadTask);
            } else {
                UtilsMy.R0(GameFromBuildFragment.this.f51711h, downloadTask, this.f51731b.getTp_down_url(), this.f51731b.getOther_down_switch(), this.f51731b.getCdn_down_switch());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f51733a;

        /* renamed from: b  reason: collision with root package name */
        public ImageView f51734b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f51735c;

        /* renamed from: d  reason: collision with root package name */
        public RelativeLayout f51736d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f51737e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f51738f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f51739g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f51740h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f51741i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f51742j;

        /* renamed from: k  reason: collision with root package name */
        public ProgressBar f51743k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f51744l;

        /* renamed from: m  reason: collision with root package name */
        public View f51745m;

        /* renamed from: n  reason: collision with root package name */
        public View f51746n;

        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        int f51748a;

        /* renamed from: b  reason: collision with root package name */
        Object f51749b;

        public e(Object obj, int i4) {
            this.f51749b = obj;
            this.f51748a = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends BaseAdapter {

        /* loaded from: classes3.dex */
        class a implements View.OnLongClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameFromPopoWinBean.DataBean f51752b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f51753c;

            /* renamed from: com.join.mgps.fragment.GameFromBuildFragment$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            class View$OnClickListenerC0367a implements View.OnClickListener {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Dialog f51755b;

                View$OnClickListenerC0367a(Dialog dialog) {
                    this.f51755b = dialog;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.f51755b.dismiss();
                }
            }

            /* loaded from: classes3.dex */
            class b implements View.OnClickListener {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Dialog f51757b;

                b(Dialog dialog) {
                    this.f51757b = dialog;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    GameFromBuildFragment gameFromBuildFragment = GameFromBuildFragment.this;
                    if (gameFromBuildFragment.f51725v == gameFromBuildFragment.f51716m.getUid() || GameFromBuildFragment.this.f51725v == 0) {
                        a aVar = a.this;
                        GameFromBuildFragment.this.e0(aVar.f51752b.getId());
                        a aVar2 = a.this;
                        GameFromBuildFragment.this.d0(aVar2.f51753c);
                        this.f51757b.dismiss();
                    }
                }
            }

            a(GameFromPopoWinBean.DataBean dataBean, int i4) {
                this.f51752b = dataBean;
                this.f51753c = i4;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(GameFromBuildFragment.this.f51711h, R.style.MyDialog);
                oVar.setContentView(R.layout.delete_center_dialog);
                Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
                ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除游戏单");
                ((TextView) oVar.findViewById(R.id.dialog_content)).setText("你确定要删除该游戏单？");
                button.setText("删除");
                ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new View$OnClickListenerC0367a(oVar));
                button.setOnClickListener(new b(oVar));
                oVar.show();
                return true;
            }
        }

        /* loaded from: classes3.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameFromPopoWinBean.DataBean f51759b;

            b(GameFromPopoWinBean.DataBean dataBean) {
                this.f51759b = dataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(GameFromBuildFragment.this.getActivity(), GameDetailActivity_.class);
                intent.putExtra("fromid", this.f51759b.getId());
                intent.putExtra("_from", 11104);
                intent.putExtra("groupuid", this.f51759b.getUid());
                intent.putExtra("gameid", "0");
                intent.putExtra("company_id", "0");
                GameFromBuildFragment.this.startActivity(intent);
            }
        }

        f() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return GameFromBuildFragment.this.f51720q.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<e> list = GameFromBuildFragment.this.f51720q;
            if (list == null) {
                return null;
            }
            return list.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return GameFromBuildFragment.this.f51720q.get(i4).f51748a;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            g gVar;
            View view2;
            d dVar;
            View view3;
            h hVar;
            View view4;
            int itemViewType = getItemViewType(i4);
            if (itemViewType == 1) {
                if (view == null) {
                    view2 = LayoutInflater.from(GameFromBuildFragment.this.f51711h).inflate(R.layout.game_build_item, (ViewGroup) null);
                    gVar = new g();
                    gVar.f51761a = (SimpleDraweeView) view2.findViewById(R.id.smv_icon);
                    gVar.f51763c = (TextView) view2.findViewById(R.id.tv_size);
                    gVar.f51762b = (TextView) view2.findViewById(R.id.tv_title);
                    gVar.f51764d = (RelativeLayout) view2.findViewById(R.id.rl_content);
                    view2.setTag(gVar);
                } else {
                    gVar = (g) view.getTag();
                    view2 = view;
                }
                GameFromPopoWinBean.DataBean dataBean = (GameFromPopoWinBean.DataBean) GameFromBuildFragment.this.f51720q.get(i4).f51749b;
                gVar.f51764d.setOnLongClickListener(new a(dataBean, i4));
                if (dataBean.getGame_list().size() != 0) {
                    gVar.f51761a.setImageURI(dataBean.getGame_list().get(0).getGame_ico());
                } else {
                    gVar.f51761a.setImageResource(R.drawable.main_normal_icon);
                }
                gVar.f51762b.setText(dataBean.getTitle());
                TextView textView = gVar.f51763c;
                textView.setText(dataBean.getGame_count() + "款");
                gVar.f51764d.setOnClickListener(new b(dataBean));
                return view2;
            } else if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return view;
                }
                if (view == null) {
                    view4 = LayoutInflater.from(GameFromBuildFragment.this.f51711h).inflate(R.layout.gameformtxt, (ViewGroup) null);
                    hVar = new h();
                    hVar.f51766a = (TextView) view4.findViewById(R.id.tv_title);
                    view4.setTag(hVar);
                } else {
                    hVar = (h) view.getTag();
                    view4 = view;
                }
                hVar.f51766a.setText((String) GameFromBuildFragment.this.f51720q.get(i4).f51749b);
                return view4;
            } else {
                if (view == null) {
                    view3 = LayoutInflater.from(GameFromBuildFragment.this.f51711h).inflate(R.layout.app_listview_item, (ViewGroup) null);
                    dVar = new d();
                    dVar.f51733a = (SimpleDraweeView) view3.findViewById(R.id.mgListviewItemIcon);
                    dVar.f51734b = (ImageView) view3.findViewById(R.id.giftPackageSwich);
                    dVar.f51735c = (TextView) view3.findViewById(R.id.mgListviewItemAppname);
                    dVar.f51736d = (RelativeLayout) view3.findViewById(R.id.rLayoutRight);
                    dVar.f51737e = (TextView) view3.findViewById(R.id.mgListviewItemInstall);
                    dVar.f51738f = (TextView) view3.findViewById(R.id.mgListviewItemDescribe);
                    dVar.f51739g = (LinearLayout) view3.findViewById(R.id.linearLayout2);
                    dVar.f51740h = (LinearLayout) view3.findViewById(R.id.tipsLayout);
                    dVar.f51741i = (TextView) view3.findViewById(R.id.appSize);
                    dVar.f51742j = (TextView) view3.findViewById(R.id.loding_info);
                    dVar.f51743k = (ProgressBar) view3.findViewById(R.id.progressBar);
                    dVar.f51744l = (ProgressBar) view3.findViewById(R.id.progressBarZip);
                    dVar.f51745m = view3.findViewById(R.id.line);
                    dVar.f51746n = view3.findViewById(R.id.relateLayoutApp);
                    view3.setTag(dVar);
                } else {
                    dVar = (d) view.getTag();
                    view3 = view;
                }
                CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) GameFromBuildFragment.this.f51720q.get(i4).f51749b;
                DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                dVar.f51746n.setBackgroundResource(R.drawable.white_bg);
                if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
                    dVar.f51734b.setVisibility(0);
                } else {
                    dVar.f51734b.setVisibility(8);
                }
                dVar.f51735c.setText(collectionBeanSubBusiness.getGame_name());
                dVar.f51738f.setText(collectionBeanSubBusiness.getInfo());
                long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d);
                String ico_remote = collectionBeanSubBusiness.getIco_remote();
                if (TextUtils.isEmpty(ico_remote)) {
                    ico_remote = "";
                }
                MyImageLoader.h(dVar.f51733a, ico_remote.trim());
                collectionBeanSubBusiness.getTag_info();
                UtilsMy.I(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness.getTag_info(), dVar.f51740h, GameFromBuildFragment.this.f51711h);
                UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view3, downloadTask);
                String plugin_num = collectionBeanSubBusiness.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    dVar.f51737e.setBackgroundResource(R.drawable.recom_blue_butn);
                    dVar.f51737e.setText("开始");
                    dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_blue_color));
                    dVar.f51740h.setVisibility(8);
                    dVar.f51734b.setVisibility(8);
                } else if (downloadTask == null) {
                    GameFromBuildFragment.this.s0(dVar, Boolean.TRUE, Boolean.FALSE);
                    if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                        boolean d5 = com.join.android.app.common.utils.e.l0(GameFromBuildFragment.this.f51711h).d(GameFromBuildFragment.this.f51711h, collectionBeanSubBusiness.getPackage_name());
                        if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                            d5 = false;
                        }
                        if (d5) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(GameFromBuildFragment.this.f51711h).l(GameFromBuildFragment.this.f51711h, collectionBeanSubBusiness.getPackage_name());
                            if (g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                                dVar.f51737e.setBackgroundResource(R.drawable.recom_green_butn);
                                dVar.f51737e.setText("更新");
                                dVar.f51737e.setTextColor(-9263087);
                            } else {
                                dVar.f51737e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                dVar.f51737e.setText(GameFromBuildFragment.this.f51711h.getResources().getString(R.string.download_status_finished));
                                dVar.f51737e.setTextColor(-688602);
                            }
                        } else {
                            dVar.f51737e.setBackgroundResource(R.drawable.recom_green_butn);
                            UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                            UtilsMy.Z2(dVar.f51737e, dVar.f51736d, collectionBeanSubBusiness);
                        }
                    } else {
                        dVar.f51737e.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                        UtilsMy.Z2(dVar.f51737e, dVar.f51736d, collectionBeanSubBusiness);
                    }
                } else {
                    com.join.mgps.Util.v0.d("infoo", downloadTask.getStatus() + " dd " + downloadTask.getShowName());
                    int status = downloadTask.getStatus();
                    if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                        status = 43;
                    }
                    if (status != 0) {
                        if (status == 27) {
                            dVar.f51737e.setText("暂停中");
                        } else if (status != 2) {
                            if (status != 3) {
                                if (status != 5) {
                                    if (status != 6) {
                                        if (status != 7) {
                                            if (status != 42) {
                                                if (status != 43) {
                                                    switch (status) {
                                                        case 9:
                                                            dVar.f51737e.setBackgroundResource(R.drawable.recom_green_butn);
                                                            dVar.f51737e.setText("更新");
                                                            dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_green_color));
                                                            GameFromBuildFragment.this.s0(dVar, Boolean.TRUE, Boolean.FALSE);
                                                            break;
                                                        case 10:
                                                            dVar.f51737e.setBackgroundResource(R.drawable.recom_blue_butn);
                                                            dVar.f51737e.setText("等待");
                                                            dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_blue_color));
                                                            GameFromBuildFragment gameFromBuildFragment = GameFromBuildFragment.this;
                                                            Boolean bool = Boolean.FALSE;
                                                            gameFromBuildFragment.s0(dVar, bool, bool);
                                                            TextView textView2 = dVar.f51741i;
                                                            textView2.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            try {
                                                                dVar.f51743k.setProgress((int) downloadTask.getProgress());
                                                            } catch (Exception e5) {
                                                                e5.printStackTrace();
                                                            }
                                                            dVar.f51742j.setText("等待中");
                                                            break;
                                                        case 11:
                                                            dVar.f51737e.setBackgroundResource(R.drawable.recom_green_butn);
                                                            dVar.f51737e.setText("安装");
                                                            dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_green_color));
                                                            GameFromBuildFragment.this.s0(dVar, Boolean.TRUE, Boolean.FALSE);
                                                            break;
                                                        case 12:
                                                            GameFromBuildFragment.this.s0(dVar, Boolean.FALSE, Boolean.TRUE);
                                                            TextView textView3 = dVar.f51741i;
                                                            textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            dVar.f51742j.setText("解压中..");
                                                            dVar.f51744l.setProgress((int) downloadTask.getProgress());
                                                            dVar.f51737e.setBackgroundResource(R.drawable.extract);
                                                            dVar.f51737e.setText("解压中");
                                                            dVar.f51737e.setTextColor(-4868683);
                                                            break;
                                                        case 13:
                                                            GameFromBuildFragment.this.s0(dVar, Boolean.FALSE, Boolean.TRUE);
                                                            TextView textView4 = dVar.f51741i;
                                                            textView4.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            dVar.f51742j.setText("点击重新解压");
                                                            dVar.f51744l.setProgress((int) downloadTask.getProgress());
                                                            dVar.f51737e.setBackgroundResource(R.drawable.reextract);
                                                            dVar.f51737e.setText("解压");
                                                            dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_grey_color));
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                dVar.f51737e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                dVar.f51737e.setText(GameFromBuildFragment.this.f51711h.getResources().getString(R.string.download_status_finished));
                                dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_main_color));
                                GameFromBuildFragment gameFromBuildFragment2 = GameFromBuildFragment.this;
                                Boolean bool2 = Boolean.TRUE;
                                gameFromBuildFragment2.s0(dVar, bool2, bool2);
                            }
                            dVar.f51737e.setBackgroundResource(R.drawable.recom_blue_butn);
                            dVar.f51737e.setText("继续");
                            dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_blue_color));
                            GameFromBuildFragment gameFromBuildFragment3 = GameFromBuildFragment.this;
                            Boolean bool3 = Boolean.FALSE;
                            gameFromBuildFragment3.s0(dVar, bool3, bool3);
                            try {
                                if (downloadTask.getSize() == 0) {
                                    TextView textView5 = dVar.f51741i;
                                    textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                } else {
                                    TextView textView6 = dVar.f51741i;
                                    textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                }
                                dVar.f51743k.setProgress((int) downloadTask.getProgress());
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            dVar.f51742j.setText("暂停中");
                        } else {
                            UtilsMy.x4(downloadTask);
                            dVar.f51737e.setBackgroundResource(R.drawable.recom_blue_butn);
                            dVar.f51737e.setText("暂停");
                            dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_blue_color));
                            GameFromBuildFragment gameFromBuildFragment4 = GameFromBuildFragment.this;
                            Boolean bool4 = Boolean.FALSE;
                            gameFromBuildFragment4.s0(dVar, bool4, bool4);
                            if (downloadTask.getSize() == 0) {
                                TextView textView7 = dVar.f51741i;
                                textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                TextView textView8 = dVar.f51741i;
                                textView8.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            dVar.f51743k.setProgress((int) downloadTask.getProgress());
                            String speed = downloadTask.getSpeed();
                            TextView textView9 = dVar.f51742j;
                            textView9.setText(speed + "/S");
                        }
                    }
                    dVar.f51737e.setBackgroundResource(R.drawable.recom_blue_butn);
                    UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                    UtilsMy.Z2(dVar.f51737e, dVar.f51736d, collectionBeanSubBusiness);
                    dVar.f51737e.setTextColor(GameFromBuildFragment.this.f51711h.getResources().getColor(R.color.app_blue_color));
                    GameFromBuildFragment.this.s0(dVar, Boolean.TRUE, Boolean.FALSE);
                }
                dVar.f51736d.setClickable(true);
                dVar.f51736d.setOnClickListener(new c(collectionBeanSubBusiness));
                return view3;
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 4;
        }
    }

    /* loaded from: classes3.dex */
    class g {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f51761a;

        /* renamed from: b  reason: collision with root package name */
        TextView f51762b;

        /* renamed from: c  reason: collision with root package name */
        TextView f51763c;

        /* renamed from: d  reason: collision with root package name */
        RelativeLayout f51764d;

        g() {
        }
    }

    /* loaded from: classes3.dex */
    class h {

        /* renamed from: a  reason: collision with root package name */
        TextView f51766a;

        h() {
        }
    }

    private void h0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f51723t.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f51724u.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f51726w) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.f51724u.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.f51724u.get(collectionBeanSubBusiness.getGame_id());
                        if (downloadTask2 == null && downloadTask3 == null) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        } else if (downloadTask2 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                        } else if (downloadTask3 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                        } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        }
                    } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(null);
                    }
                }
            }
        }
        this.f51712i.notifyDataSetChanged();
    }

    private void i0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51724u;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f51712i.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void j0(DownloadTask downloadTask) {
        UtilsMy.A4(this.f51723t);
        if (!this.f51724u.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51723t.add(downloadTask);
            this.f51724u.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        n0(downloadTask);
        this.f51712i.notifyDataSetChanged();
    }

    private void k0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51724u;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51723t.add(downloadTask);
            this.f51724u.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        n0(downloadTask);
        DownloadTask downloadTask2 = this.f51724u.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f51712i.notifyDataSetChanged();
    }

    private void n0(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f51726w) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f51724u.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f51724u.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void o0(List<CollectionBeanSubBusiness> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.f51723t) == null || list2.size() == 0) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.f51723t.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f51724u.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.f51724u.get(mod_info.getMod_game_id());
                        z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
                        if (z4 && z5) {
                            if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else if (z4) {
                            if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else if (z5) {
                            if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else {
                            DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                            if (F == null) {
                                F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                            }
                            if (F != null && next.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        }
                    } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                        collectionBeanSubBusiness.setDownloadTask(next);
                        break;
                    }
                }
            }
        }
    }

    private void q0() {
        CollectionBeanSubBusiness collectionBeanSubBusiness;
        DownloadTask downloadTask;
        if (this.f51728y < 0 || this.f51727x >= this.f51720q.size()) {
            return;
        }
        for (int i4 = this.f51728y; i4 <= this.f51727x; i4++) {
            if (this.f51720q.get(i4).f51748a == 2 && (collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f51720q.get(i4).f51749b) != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f51706c.getChildAt(i4 - this.f51728y);
                if (childAt.getTag() instanceof d) {
                    d dVar = (d) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = dVar.f51741i;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = dVar.f51741i;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            dVar.f51744l.setProgress((int) f5.getProgress());
                        } else {
                            dVar.f51743k.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = dVar.f51742j;
                            textView3.setText(f5.getSpeed() + "/S");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        this.f51711h = getActivity();
        this.f51720q = new ArrayList();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f51725v = arguments.getInt("uid", 0);
        }
        this.f51717n = com.join.mgps.rpc.impl.a.c0();
        this.f51718o = com.join.mgps.rpc.impl.g.A0();
        this.f51719p = new ArrayList();
        com.join.mgps.Util.d0.a().d(this);
        this.f51706c.setOnScrollListener(this);
        this.f51706c.setPreLoadCount(1);
        this.f51722s = new ArrayList();
        this.f51716m = AccountUtil_.getInstance_(this.f51711h).getAccountData();
        List<DownloadTask> d5 = p1.f.K().d();
        this.f51723t = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f51723t) {
                this.f51724u.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        f fVar = new f();
        this.f51712i = fVar;
        this.f51706c.setAdapter((ListAdapter) fVar);
        this.f51714k = "";
        RequestBeanUtil.getInstance(this.f51711h);
        this.f51715l = RequestBeanUtil.getVersionAndVersionName();
        f0();
        this.f51706c.setPullRefreshEnable(new a());
        this.f51706c.setPullLoadEnable(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W(List<GameFromPopoWinBean.DataBean> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f51720q.add(new e(list.get(i4), 1));
        }
        if (list.size() < 10) {
            m0();
        }
        f fVar = this.f51712i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X(List<CollectionBeanSub> list) {
        if (this.f51720q != null) {
            for (CollectionBeanSub collectionBeanSub : list) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                this.f51720q.add(new e(collectionBeanSubBusiness, 2));
                this.f51726w.add(collectionBeanSubBusiness);
            }
            f fVar = this.f51712i;
            if (fVar != null) {
                fVar.notifyDataSetChanged();
            }
            o0(this.f51726w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z() {
        try {
            LinearLayout linearLayout = this.f51705b;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            XListView2 xListView2 = this.f51706c;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @UiThread
    public void a0() {
        this.f51713j = 1;
        Z();
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b0() {
        f fVar = this.f51712i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        if (this.f51720q.size() > 0) {
            this.f51720q.clear();
            f fVar = this.f51712i;
            if (fVar != null) {
                fVar.notifyDataSetChanged();
            }
        }
    }

    void d0(int i4) {
        this.f51720q.remove(i4);
        this.f51712i.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0(String str) {
        try {
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            linkedMultiValueMap.add("uid", Integer.valueOf(this.f51716m.getUid()));
            linkedMultiValueMap.add("token", this.f51716m.getToken());
            linkedMultiValueMap.add("group_id", str);
            linkedMultiValueMap.add("device_id", this.f51714k);
            linkedMultiValueMap.add("version", this.f51715l);
            GameFromBooleanBean W = this.f51717n.W(linkedMultiValueMap);
            if (W.getError() == 0) {
                if (W.getData().isState()) {
                    showToast("删除成功");
                } else {
                    showToast("删除失败");
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f0() {
        try {
            if (com.join.android.app.common.utils.j.j(this.f51711h)) {
                if (this.f51713j == 1) {
                    showLoding();
                }
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                int i4 = this.f51725v;
                if (i4 == 0) {
                    i4 = this.f51716m.getUid();
                }
                linkedMultiValueMap.add("uid", Integer.valueOf(i4));
                int i5 = this.f51713j;
                this.f51713j = i5 + 1;
                linkedMultiValueMap.add("page", Integer.valueOf(i5));
                linkedMultiValueMap.add("type", 1);
                linkedMultiValueMap.add("device_id", this.f51714k);
                linkedMultiValueMap.add("version", this.f51715l);
                GameFromPopoWinBean r4 = this.f51717n.r(linkedMultiValueMap);
                if (r4 != null && r4.getError() == 0 && r4.getData() != null && r4.getData().size() != 0) {
                    p0();
                    g0();
                    if (this.f51713j == 2) {
                        c0();
                    }
                    W(r4.getData());
                    return;
                }
                g0();
                if (this.f51713j == 2) {
                    if (this.f51721r) {
                        return;
                    }
                    l0();
                    return;
                }
                m0();
                return;
            }
            if (!this.f51721r) {
                showLodingFailed();
            }
            if (this.f51713j == 2) {
                showLodingFailed();
            } else {
                m0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        LinearLayout linearLayout = this.f51707d;
        if (linearLayout == null || this.f51708e == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f51708e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        LinearLayout linearLayout = this.f51705b;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        XListView2 xListView2 = this.f51706c;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        XListView2 xListView2 = this.f51706c;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f51706c.v();
                this.f51706c.setNoMore();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        switch (nVar.c()) {
            case 2:
                r0(a5, 1);
                return;
            case 3:
                r0(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                r0(a5, 5);
                return;
            case 6:
                r0(a5, 6);
                return;
            case 7:
                r0(a5, 3);
                return;
            case 8:
                Map<String, DownloadTask> map = this.f51724u;
                if (map == null || map.isEmpty()) {
                    return;
                }
                q0();
                return;
            case 10:
                r0(a5, 7);
                return;
            case 12:
                r0(a5, 8);
                return;
            case 13:
                r0(a5, 9);
                return;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f51727x = (i5 + i4) - 1;
        this.f51728y = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        XListView2 xListView2 = this.f51706c;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f51706c.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void r0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    j0(downloadTask);
                    return;
                case 3:
                    h0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    k0(downloadTask);
                    return;
                case 6:
                    i0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f51713j = 1;
        XListView2 xListView2 = this.f51706c;
        if (xListView2 != null) {
            xListView2.setVisibility(0);
        }
        Z();
        f0();
    }

    void s0(d dVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            dVar.f51739g.setVisibility(8);
            dVar.f51743k.setVisibility(8);
            dVar.f51744l.setVisibility(8);
            dVar.f51740h.setVisibility(0);
            return;
        }
        dVar.f51739g.setVisibility(0);
        if (bool2.booleanValue()) {
            dVar.f51743k.setVisibility(8);
            dVar.f51744l.setVisibility(0);
        } else {
            dVar.f51744l.setVisibility(8);
            dVar.f51743k.setVisibility(0);
        }
        dVar.f51740h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f51711h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f51707d;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f51708e;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f51708e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51707d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f51706c;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        Toast.makeText(this.f51711h, str, 0).show();
    }
}
