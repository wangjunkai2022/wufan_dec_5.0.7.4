package com.join.mgps.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.JpInfoBean;
import com.join.mgps.dto.RequestMiniGameArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.fragment.FindMiniGameFragment;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_find_mini_game)
/* loaded from: classes.dex */
public class FindMiniGameFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XQuickRecyclerView f51226b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f51227c;

    /* renamed from: d  reason: collision with root package name */
    MiniGameListAdapter f51228d;

    /* renamed from: e  reason: collision with root package name */
    Context f51229e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f51230f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    PtrClassicFrameLayout f51231g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f51232h;
    @FragmentArg

    /* renamed from: i  reason: collision with root package name */
    String f51233i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.k f51234j;

    /* renamed from: l  reason: collision with root package name */
    com.join.android.app.component.video.g f51236l;

    /* renamed from: k  reason: collision with root package name */
    int f51235k = 1;

    /* renamed from: m  reason: collision with root package name */
    private boolean f51237m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f51238n = false;

    /* renamed from: o  reason: collision with root package name */
    List<DownloadTask> f51239o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    Map<String, DownloadTask> f51240p = new ConcurrentHashMap();

    /* renamed from: q  reason: collision with root package name */
    boolean f51241q = false;

    /* loaded from: classes3.dex */
    public class MiniGameListAdapter extends BaseMultiItemQuickAdapter<CommonGameInfoBean, BaseViewHolder> {

        /* renamed from: e  reason: collision with root package name */
        public static final int f51242e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f51243f = 2;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends w1.p {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CommonGameInfoBean f51245b;

            a(CommonGameInfoBean commonGameInfoBean) {
                this.f51245b = commonGameInfoBean;
            }

            @Override // w1.p, s2.h
            public void onClickBlank(String str, Object... objArr) {
                super.onClickBlank(str, objArr);
                this.f51245b.set_from_type(150);
                IntentUtil.getInstance().intentActivity(FindMiniGameFragment.this.f51229e, this.f51245b.getIntentDataBean());
            }

            @Override // w1.p, w1.q
            public void onClickCover() {
                super.onClickCover();
                this.f51245b.set_from_type(150);
                IntentUtil.getInstance().intentActivity(FindMiniGameFragment.this.f51229e, this.f51245b.getIntentDataBean());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            CommonGameInfoBean f51247b;

            public b(CommonGameInfoBean commonGameInfoBean) {
                this.f51247b = commonGameInfoBean;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Unit b(Context context, View view) {
                if (!com.join.android.app.common.utils.j.j(context)) {
                    l2.a(context).b("网络连接异常");
                    return null;
                }
                View findViewById = view.findViewById(R.id.pb_loading);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
                if (textView != null) {
                    textView.setText("");
                }
                UtilsMy.F2(context, this.f51247b);
                return null;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(final View view) {
                final Context context = view.getContext();
                DownloadTask downloadTask = this.f51247b.getDownloadTask();
                GInfoBean g_info = this.f51247b.getG_info();
                if (g_info != null) {
                    if (downloadTask == null) {
                        MiniGameListAdapter.this.i(this.f51247b);
                        if (this.f51247b.isGameVm() && this.f51247b.isMiniGame() && this.f51247b.is64Bit() && (APKUtils.c(context, this.f51247b) || APKUtils.g(context, new Function0() { // from class: com.join.mgps.fragment.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit b5;
                                b5 = FindMiniGameFragment.MiniGameListAdapter.b.this.b(context, view);
                                return b5;
                            }
                        }))) {
                            return;
                        }
                        if (!com.join.android.app.common.utils.j.j(context)) {
                            l2.a(context).b("网络连接异常");
                            return;
                        }
                        View findViewById = view.findViewById(R.id.pb_loading);
                        if (findViewById != null) {
                            findViewById.setVisibility(0);
                        }
                        TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
                        if (textView != null) {
                            textView.setText("");
                        }
                        UtilsMy.F2(context, this.f51247b);
                        return;
                    }
                    String plugin_num = g_info.getPlugin_num();
                    if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                        IntentDateBean intentDateBean = new IntentDateBean();
                        ExtBean extBean = new ExtBean();
                        extBean.setReMarks(this.f51247b.getReMarks());
                        intentDateBean.setExtBean(extBean);
                        intentDateBean.setLink_type(4);
                        intentDateBean.setLink_type_val(downloadTask.getDown_url_remote());
                        UtilsMy.T2(downloadTask, context);
                        IntentUtil.getInstance().intentActivity(context, intentDateBean);
                        return;
                    }
                    int status = downloadTask != null ? downloadTask.getStatus() : 0;
                    if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                        status = 43;
                    }
                    if (status != 0) {
                        if (status != 13) {
                            if (status != 2) {
                                if (status != 3) {
                                    if (status == 5) {
                                        UtilsMy.T3(context, downloadTask);
                                        return;
                                    } else if (status != 6) {
                                        if (status != 7) {
                                            if (status == 42) {
                                                MiniGameListAdapter.this.i(this.f51247b);
                                                UtilsMy.s4(context, this.f51247b);
                                                return;
                                            } else if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        if (!com.join.android.app.common.utils.j.j(context)) {
                                                            l2.a(context).b("无网络连接");
                                                            return;
                                                        }
                                                        MiniGameListAdapter.this.i(this.f51247b);
                                                        UtilsMy.H2(context, downloadTask.getCrc_link_type_val(), this.f51247b);
                                                        return;
                                                    case 10:
                                                        break;
                                                    case 11:
                                                        UtilsMy.a4(downloadTask, context);
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        }
                                    }
                                }
                                MiniGameListAdapter.this.i(this.f51247b);
                                if (downloadTask.isMiniGame()) {
                                    APKUtils.U(context, downloadTask);
                                }
                                com.php25.PDownload.d.c(downloadTask, context);
                                return;
                            }
                            if (downloadTask.isMiniGame()) {
                                APKUtils.U(context, downloadTask);
                                return;
                            } else {
                                com.php25.PDownload.d.i(downloadTask);
                                return;
                            }
                        }
                        com.php25.PDownload.d.l(context, downloadTask);
                        return;
                    }
                    MiniGameListAdapter.this.i(this.f51247b);
                    UtilsMy.F2(context, this.f51247b);
                }
            }
        }

        public MiniGameListAdapter() {
            super(null);
            a(1, R.layout.item_find_mini_game);
            a(2, R.layout.item_find_mini_game_video);
        }

        private void j(BaseViewHolder baseViewHolder, final CommonGameInfoBean commonGameInfoBean) {
            MultiStandVideo multiStandVideo;
            DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
            JpInfoBean jp_info = commonGameInfoBean.getJp_info();
            if (jp_info != null) {
                if (jp_info.isGame()) {
                    GInfoBean g_info = commonGameInfoBean.getG_info();
                    if (g_info != null) {
                        baseViewHolder.setText(R.id.mgListviewItemAppname, g_info.getName());
                        ((TextView) baseViewHolder.getView(R.id.mgListviewItemAppname)).setTypeface(Typeface.DEFAULT, 0);
                        if (g2.h(commonGameInfoBean.getV_url())) {
                            if (g2.i(commonGameInfoBean.getBig_pic())) {
                                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), commonGameInfoBean.getBig_pic());
                            } else {
                                List<String> pic_info = g_info.getPic_info();
                                if (g2.h("") && pic_info != null && pic_info.size() > 0) {
                                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), pic_info.get(0));
                                }
                            }
                        }
                        baseViewHolder.setGone(R.id.giftPackageSwich, g_info.getGift_package_switch() == 1);
                        if (g_info.getScore().doubleValue() > 0.0d && g_info.showScore()) {
                            baseViewHolder.setText(R.id.tv_score, String.valueOf(g_info.getScore()));
                            baseViewHolder.setGone(R.id.tv_score, true);
                        } else {
                            baseViewHolder.setGone(R.id.tv_score, false);
                        }
                        baseViewHolder.setText(R.id.tv_label, UtilsMy.L1(g_info.getSp_tag_info(), g_info.getTag_info()));
                        UtilsMy.j3(g_info.getSp_tag_info(), baseViewHolder.getView(R.id.relateLayoutApp), downloadTask);
                    }
                } else {
                    baseViewHolder.setText(R.id.appName, commonGameInfoBean.getTitle());
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), commonGameInfoBean.getBig_pic());
                }
                if (g2.i(commonGameInfoBean.getV_url()) && (multiStandVideo = (MultiStandVideo) baseViewHolder.getView(R.id.wf_video)) != null) {
                    multiStandVideo.g(commonGameInfoBean.getBig_pic());
                    multiStandVideo.setName(commonGameInfoBean.getTitle());
                    multiStandVideo.setPlayTag(FindMiniGameFragment.this.f51236l.p());
                    multiStandVideo.setPlayPosition(commonGameInfoBean.hashCode());
                    multiStandVideo.setUpLazy(commonGameInfoBean.getV_url(), false, null, null, "");
                    multiStandVideo.setRotateViewAuto(false);
                    multiStandVideo.setLockLand(true);
                    multiStandVideo.setReleaseWhenLossAudio(false);
                    multiStandVideo.setShowFullAnimation(false);
                    multiStandVideo.setIsTouchWiget(false);
                    multiStandVideo.setNeedLockFull(false);
                    multiStandVideo.setVideoAllCallBack(new a(commonGameInfoBean));
                }
                if (g2.i(commonGameInfoBean.getBg_color())) {
                    try {
                        if (commonGameInfoBean.getBg_color().startsWith("#")) {
                            baseViewHolder.setBackgroundColor(R.id.ll_bottom_container, Color.parseColor(commonGameInfoBean.getBg_color()));
                        } else {
                            baseViewHolder.setBackgroundColor(R.id.ll_bottom_container, Color.parseColor("#" + commonGameInfoBean.getBg_color()));
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    baseViewHolder.setBackgroundColor(R.id.ll_bottom_container, Color.parseColor("#994558"));
                }
                baseViewHolder.getView(R.id.rLayoutRight).setOnClickListener(new b(commonGameInfoBean));
                baseViewHolder.getView(R.id.relateLayoutApp).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FindMiniGameFragment.MiniGameListAdapter.this.l(commonGameInfoBean, view);
                    }
                });
            }
            if (commonGameInfoBean.getRequestStatus() == 47) {
                baseViewHolder.setGone(R.id.pb_loading, true);
                baseViewHolder.setText(R.id.mgListviewItemInstall, "");
                return;
            }
            baseViewHolder.setGone(R.id.pb_loading, false);
            if (commonGameInfoBean.getDownloadTask() != null && !commonGameInfoBean.getDownloadTask().isSingleGame() && commonGameInfoBean.getDownloadTask().getStatus() == 11) {
                baseViewHolder.setText(R.id.mgListviewItemInstall, "安装");
            } else {
                baseViewHolder.setText(R.id.mgListviewItemInstall, "打开");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(CommonGameInfoBean commonGameInfoBean, View view) {
            commonGameInfoBean.set_from_type(150);
            IntentUtil.getInstance().intentActivity(FindMiniGameFragment.this.f51229e, commonGameInfoBean.getIntentDataBean());
        }

        @Override // com.join.mgps.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return (getItem(i4) == 0 || !g2.i(((CommonGameInfoBean) getItem(i4)).getV_url())) ? 1 : 2;
        }

        void i(CommonGameInfoBean commonGameInfoBean) {
            ExtBean extBean;
            commonGameInfoBean.set_from(150);
            commonGameInfoBean.set_from_type(150);
            if (g2.h(commonGameInfoBean.getExt())) {
                extBean = new ExtBean();
            } else {
                extBean = (ExtBean) JsonMapper.getInstance().fromJson(commonGameInfoBean.getExt(), ExtBean.class);
            }
            extBean.setFrom("150");
            commonGameInfoBean.setExt(JsonMapper.toJsonString(extBean));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: k */
        public void convert(@NonNull BaseViewHolder baseViewHolder, CommonGameInfoBean commonGameInfoBean) {
            if (commonGameInfoBean == null) {
                return;
            }
            j(baseViewHolder, commonGameInfoBean);
        }
    }

    /* loaded from: classes3.dex */
    class a implements XQuickRecyclerView.g {
        a() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XQuickRecyclerView.g
        public void onLoadMore() {
            FindMiniGameFragment findMiniGameFragment = FindMiniGameFragment.this;
            int i4 = findMiniGameFragment.f51235k + 1;
            findMiniGameFragment.f51235k = i4;
            findMiniGameFragment.b0(i4);
        }

        @Override // com.join.android.app.component.xrecyclerview.XQuickRecyclerView.g
        public void onRefresh() {
            FindMiniGameFragment.this.f51226b.reset();
            FindMiniGameFragment.this.f51237m = false;
            FindMiniGameFragment findMiniGameFragment = FindMiniGameFragment.this;
            findMiniGameFragment.f51235k = 1;
            findMiniGameFragment.b0(1);
        }
    }

    /* loaded from: classes3.dex */
    class b extends UniversalItemDecoration {
        b() {
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = 0;
            aVar.f46234a = (int) FindMiniGameFragment.this.getResources().getDimension(R.dimen.wdp10);
            aVar.f46235b = (int) FindMiniGameFragment.this.getResources().getDimension(R.dimen.wdp10);
            if (i4 != 0 && i4 != 1) {
                aVar.f46236c = (int) FindMiniGameFragment.this.getResources().getDimension(R.dimen.wdp10);
            } else {
                aVar.f46236c = (int) FindMiniGameFragment.this.getResources().getDimension(R.dimen.wdp20);
            }
            aVar.f46237d = (int) FindMiniGameFragment.this.getResources().getDimension(R.dimen.wdp10);
            return aVar;
        }
    }

    /* loaded from: classes3.dex */
    class c extends RecyclerView.OnScrollListener {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0) {
                com.join.android.app.component.video.g gVar = FindMiniGameFragment.this.f51236l;
                if (gVar != null) {
                    gVar.f(2);
                }
                FindMiniGameFragment.this.j0();
            }
        }
    }

    private void e0(DownloadTask downloadTask) {
        GInfoBean g_info;
        Iterator<DownloadTask> it2 = this.f51239o.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f51240p.remove(next.getCrc_link_type_val());
                it2.remove();
                for (T t4 : this.f51228d.getData()) {
                    if (t4.isGame() && (g_info = t4.getG_info()) != null) {
                        if (t4.isModGameVm()) {
                            DownloadTask downloadTask2 = this.f51240p.get(g_info.getMod_id());
                            DownloadTask downloadTask3 = this.f51240p.get(g_info.getId());
                            if (downloadTask2 == null && downloadTask3 == null) {
                                t4.setDownloadTask(null);
                            } else if (downloadTask2 != null) {
                                t4.setDownloadTask(downloadTask2);
                            } else if (downloadTask3 != null) {
                                t4.setDownloadTask(downloadTask3);
                            } else if (g_info.getId().equals(downloadTask.getCrc_link_type_val())) {
                                t4.setDownloadTask(null);
                            }
                        } else if (g_info.getId().equals(downloadTask.getCrc_link_type_val())) {
                            t4.setDownloadTask(null);
                        }
                    }
                }
            }
        }
        MiniGameListAdapter miniGameListAdapter = this.f51228d;
        if (miniGameListAdapter != null) {
            miniGameListAdapter.notifyDataSetChanged();
        }
    }

    private void f0(DownloadTask downloadTask) {
        d0(downloadTask);
    }

    private void g0(DownloadTask downloadTask) {
        if (!this.f51240p.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51239o.add(downloadTask);
            this.f51240p.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        o0(downloadTask);
    }

    private void h0(DownloadTask downloadTask) {
        if (!this.f51240p.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51239o.add(downloadTask);
            this.f51240p.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        d0(downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        MiniGameListAdapter miniGameListAdapter;
        if (this.f51226b == null || (miniGameListAdapter = this.f51228d) == null || miniGameListAdapter.getItemCount() <= 0) {
            return;
        }
        int lastCompletelyVisiblePosition = this.f51226b.getLastCompletelyVisiblePosition();
        for (int firstCompletelyVisiblePosition = this.f51226b.getFirstCompletelyVisiblePosition(); firstCompletelyVisiblePosition <= lastCompletelyVisiblePosition; firstCompletelyVisiblePosition++) {
            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) this.f51228d.getItem(firstCompletelyVisiblePosition);
            if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null && commonGameInfoBean.isMiniGame() && !commonGameInfoBean.isHasExposure()) {
                Ext ext = new Ext();
                ext.setPage("");
                ext.setFrom("104");
                ext.setGameId(commonGameInfoBean.getG_info().getId());
                commonGameInfoBean.setHasExposure(true);
                com.papa.sim.statistic.p.l(this.f51229e).k0(Event.expSmallGameAdPage, ext, commonGameInfoBean.getG_info().getId());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r3.getCrc_link_type_val().equals(r1.getMod_id()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        r0.setDownloadTask(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n0(java.util.List<com.join.mgps.dto.CommonGameInfoBean> r11) {
        /*
            r10 = this;
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r0 = r10.f51239o
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Iterator r11 = r11.iterator()
        L9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Le3
            java.lang.Object r0 = r11.next()
            com.join.mgps.dto.CommonGameInfoBean r0 = (com.join.mgps.dto.CommonGameInfoBean) r0
            com.join.mgps.dto.GInfoBean r1 = r0.getG_info()
            if (r1 == 0) goto L9
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r2 = r10.f51239o
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()
            com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3
            boolean r4 = r0.isModGameVm()
            if (r4 == 0) goto Ld0
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.f51240p
            java.lang.String r5 = r1.getId()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
            r5 = 1
            r6 = 5
            r7 = 0
            if (r4 == 0) goto L4c
            int r4 = r4.getStatus()
            if (r4 != r6) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r8 = r10.f51240p
            java.lang.String r9 = r1.getMod_id()
            java.lang.Object r8 = r8.get(r9)
            com.github.snowdream.android.app.downloader.DownloadTask r8 = (com.github.snowdream.android.app.downloader.DownloadTask) r8
            if (r8 == 0) goto L62
            int r8 = r8.getStatus()
            if (r8 != r6) goto L62
            goto L63
        L62:
            r5 = 0
        L63:
            if (r5 == 0) goto L79
            if (r4 == 0) goto L79
            java.lang.String r6 = r3.getCrc_link_type_val()
            java.lang.String r7 = r1.getId()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L79
            r0.setDownloadTask(r3)
            goto L21
        L79:
            if (r5 == 0) goto L8d
            java.lang.String r5 = r3.getCrc_link_type_val()
            java.lang.String r6 = r1.getMod_id()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8d
            r0.setDownloadTask(r3)
            goto L21
        L8d:
            if (r4 == 0) goto La1
            java.lang.String r4 = r3.getCrc_link_type_val()
            java.lang.String r5 = r1.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La1
            r0.setDownloadTask(r3)
            goto L21
        La1:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.f51240p
            java.lang.String r5 = r1.getMod_id()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
            if (r4 != 0) goto Lbb
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.f51240p
            java.lang.String r5 = r1.getId()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
        Lbb:
            if (r4 == 0) goto L21
            java.lang.String r5 = r3.getCrc_link_type_val()
            java.lang.String r4 = r4.getCrc_link_type_val()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L21
            r0.setDownloadTask(r3)
            goto L21
        Ld0:
            java.lang.String r4 = r3.getCrc_link_type_val()
            java.lang.String r5 = r1.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L21
            r0.setDownloadTask(r3)
            goto L21
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.FindMiniGameFragment.n0(java.util.List):void");
    }

    private void o0(DownloadTask downloadTask) {
        for (int i4 = 0; i4 < this.f51228d.getItemCount(); i4++) {
            try {
                CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) this.f51228d.getItem(i4);
                GInfoBean g_info = commonGameInfoBean.getG_info();
                if (g_info != null) {
                    if (commonGameInfoBean.isModGameVm()) {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(g_info.getId());
                        boolean z4 = true;
                        boolean z5 = f5 != null && f5.getStatus() == 5;
                        DownloadTask f6 = com.join.android.app.common.servcie.i.e().f(g_info.getMod_id());
                        if (f6 == null || f6.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5 && downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                            commonGameInfoBean.setDownloadTask(downloadTask);
                        } else if (z4 && downloadTask.getCrc_link_type_val().equals(g_info.getMod_id())) {
                            commonGameInfoBean.setDownloadTask(downloadTask);
                        } else if (z5 && downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                            commonGameInfoBean.setDownloadTask(downloadTask);
                        } else {
                            DownloadTask F = p1.f.K().F(g_info.getMod_id());
                            if (F == null) {
                                F = p1.f.K().F(g_info.getId());
                            }
                            if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                commonGameInfoBean.setDownloadTask(downloadTask);
                            }
                        }
                    } else if (downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                        commonGameInfoBean.setDownloadTask(downloadTask);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
    }

    private void p0(String str, int i4) {
        if (g2.h(str)) {
            return;
        }
        for (int i5 = 0; i5 < this.f51228d.getItemCount(); i5++) {
            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) this.f51228d.getItem(i5);
            GInfoBean g_info = commonGameInfoBean.getG_info();
            if (g_info != null && (str.equals(g_info.getId()) || str.equals(g_info.getMod_id()))) {
                commonGameInfoBean.setRequestStatus(i4);
                this.f51228d.notifyItemChanged(i5);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        this.f51229e = getActivity();
        com.join.mgps.Util.d0.a().d(this);
        this.f51234j = com.join.mgps.rpc.impl.i.D0();
        this.f51228d = new MiniGameListAdapter();
        this.f51226b.setLayoutManager(new GridLayoutManager(this.f51229e, 2));
        this.f51226b.setAdapter(this.f51228d);
        this.f51226b.setPreLoadCount(10);
        this.f51226b.setPtrFrameLayout(this.f51231g);
        this.f51226b.setItemViewCacheSize(8);
        this.f51226b.setHasFixedSize(true);
        this.f51236l = new com.join.android.app.component.video.g(this.f51226b, "FindMiniGameFragmentVideoHelper");
        this.f51226b.setLoadingListener(new a());
        RecyclerView.ItemAnimator itemAnimator = this.f51226b.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        this.f51226b.addItemDecoration(new b());
        this.f51226b.addOnScrollListener(new c());
        i0();
        b0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W() {
        LinearLayout linearLayout = this.f51227c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        c0();
        XQuickRecyclerView xQuickRecyclerView = this.f51226b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void a0() {
        if (this.f51238n) {
            com.join.android.app.component.video.g gVar = this.f51236l;
            if (gVar != null) {
                gVar.f(2);
            }
            j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0(int i4) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f51229e)) {
                if (i4 == 1 && this.f51237m) {
                    showLoding();
                }
                RequestModel requestModel = new RequestModel(this.f51229e);
                RequestMiniGameArgs requestMiniGameArgs = new RequestMiniGameArgs();
                requestMiniGameArgs.setPage(i4);
                requestMiniGameArgs.setPageSize(20);
                requestMiniGameArgs.setUid(com.join.mgps.Util.j0.o0(this.f51229e));
                String str = this.f51233i;
                if (str != null) {
                    requestMiniGameArgs.setGameId(str);
                }
                requestModel.setArgs(requestMiniGameArgs);
                ResponseModel<List<CommonGameInfoBean>> E = this.f51234j.E(requestModel.makeSign());
                if (E != null && E.getData() != null && E.getData().size() > 0) {
                    c0();
                    m0();
                    l0(E.getData());
                    return;
                } else if (i4 == 1) {
                    W();
                    return;
                } else {
                    k0();
                    return;
                }
            }
            showLodingFailed();
        } catch (Exception e5) {
            showLodingFailed();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        LinearLayout linearLayout = this.f51230f;
        if (linearLayout == null || this.f51232h == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f51232h.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0(DownloadTask downloadTask) {
        MiniGameListAdapter miniGameListAdapter;
        if (downloadTask == null || (miniGameListAdapter = this.f51228d) == null || miniGameListAdapter.getItemCount() <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.f51228d.getItemCount()) {
                GInfoBean g_info = ((CommonGameInfoBean) this.f51228d.getItem(i4)).getG_info();
                if (g_info != null && g2.i(g_info.getId()) && g_info.getId().equals(downloadTask.getCrc_link_type_val())) {
                    ((CommonGameInfoBean) this.f51228d.getItem(i4)).setDownloadTask(downloadTask);
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        this.f51228d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        List<DownloadTask> d5 = p1.f.K().d();
        this.f51239o = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f51239o) {
            if (downloadTask.getCrc_link_type_val() != null) {
                this.f51240p.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        XQuickRecyclerView xQuickRecyclerView = this.f51226b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(List<CommonGameInfoBean> list) {
        if (list != null) {
            c0();
        }
        MiniGameListAdapter miniGameListAdapter = this.f51228d;
        if (miniGameListAdapter != null) {
            if (this.f51235k == 1) {
                miniGameListAdapter.setNewData(list);
                a0();
            } else {
                miniGameListAdapter.addData((Collection) list);
            }
            n0(list);
        }
        XQuickRecyclerView xQuickRecyclerView = this.f51226b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.loadMoreComplete();
        }
        if (this.f51241q) {
            k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        XQuickRecyclerView xQuickRecyclerView = this.f51226b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f51227c;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
        com.join.android.app.component.video.g gVar = this.f51236l;
        if (gVar != null) {
            gVar.t();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            q0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    q0(a5, 6);
                    return;
                } else if (c5 != 7) {
                    switch (c5) {
                        case 10:
                            q0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            q0(a5, 8);
                            return;
                        case 13:
                            q0(a5, 9);
                            return;
                        default:
                            switch (c5) {
                                case 48:
                                    break;
                                case 49:
                                case 50:
                                    p0(nVar.b(), nVar.c());
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    q0(a5, 3);
                    return;
                }
            }
            q0(a5, 5);
        } else {
            q0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        r0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0();
    }

    void q0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    g0(downloadTask);
                    return;
                case 3:
                    e0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    h0(downloadTask);
                    return;
                case 6:
                    f0(downloadTask);
                    return;
            }
        }
    }

    public void r0() {
        com.join.android.app.component.video.g gVar = this.f51236l;
        if (gVar != null) {
            gVar.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        b0(this.f51235k);
    }

    public void s0() {
        com.join.android.app.component.video.g gVar = this.f51236l;
        if (gVar != null) {
            gVar.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f51229e);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4) {
            this.f51238n = true;
            s0();
            j0();
            return;
        }
        this.f51238n = false;
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f51230f;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f51232h;
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
        LinearLayout linearLayout = this.f51232h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51230f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }
}
