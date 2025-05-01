package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.ImagePagerActivity;
import com.join.mgps.activity.SearchListActivity1;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.SearchGameListAdapter;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.SearchIntegratedFavoriteBean;
import com.join.mgps.dto.SearchIntegratedPostBean;
import com.join.mgps.dto.WxProgram;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.Where;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* loaded from: classes4.dex */
public class SearchGameListAdapter extends BaseMultiItemQuickAdapter<i, BaseViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    private Context f44021d;

    /* renamed from: e  reason: collision with root package name */
    private String f44022e;

    /* renamed from: f  reason: collision with root package name */
    com.join.android.app.component.video.g f44023f;

    /* renamed from: g  reason: collision with root package name */
    private f f44024g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends w1.p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GInfoBean f44025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommonGameInfoBean f44026c;

        a(GInfoBean gInfoBean, CommonGameInfoBean commonGameInfoBean) {
            this.f44025b = gInfoBean;
            this.f44026c = commonGameInfoBean;
        }

        @Override // w1.p, s2.h
        public void onClickBlank(String str, Object... objArr) {
            super.onClickBlank(str, objArr);
            IntentUtil.getInstance().goGameDetialActivity(SearchGameListAdapter.this.f44021d, this.f44025b.getId(), this.f44025b.getGame_info_tpl_type(), this.f44025b.getSp_tpl_two_position(), this.f44026c.get_from_type(), this.f44026c.getReMarks(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.N(this.f44026c));
        }

        @Override // w1.p, w1.q
        public void onClickCover() {
            super.onClickCover();
            IntentUtil.getInstance().goGameDetialActivity(SearchGameListAdapter.this.f44021d, this.f44025b.getId(), this.f44025b.getGame_info_tpl_type(), this.f44025b.getSp_tpl_two_position(), this.f44026c.get_from_type(), this.f44026c.getReMarks(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.N(this.f44026c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends w1.p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GInfoBean f44028b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommonGameInfoBean f44029c;

        b(GInfoBean gInfoBean, CommonGameInfoBean commonGameInfoBean) {
            this.f44028b = gInfoBean;
            this.f44029c = commonGameInfoBean;
        }

        @Override // w1.p, s2.h
        public void onClickBlank(String str, Object... objArr) {
            super.onClickBlank(str, objArr);
            IntentUtil.getInstance().goGameDetialActivity(SearchGameListAdapter.this.f44021d, this.f44028b.getId(), this.f44028b.getGame_info_tpl_type(), this.f44028b.getSp_tpl_two_position(), this.f44029c.get_from_type(), this.f44029c.getReMarks(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.N(this.f44029c));
        }

        @Override // w1.p, w1.q
        public void onClickCover() {
            super.onClickCover();
            IntentUtil.getInstance().goGameDetialActivity(SearchGameListAdapter.this.f44021d, this.f44028b.getId(), this.f44028b.getGame_info_tpl_type(), this.f44028b.getSp_tpl_two_position(), this.f44029c.get_from_type(), this.f44029c.getReMarks(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.O(), SearchGameListAdapter.this.N(this.f44029c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f44031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonGameInfoBean f44032b;

        c(List list, CommonGameInfoBean commonGameInfoBean) {
            this.f44031a = list;
            this.f44032b = commonGameInfoBean;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                Intent intent = new Intent(SearchGameListAdapter.this.f44021d, ImagePagerActivity.class);
                String[] strArr = new String[this.f44031a.size()];
                for (int i5 = 0; i5 < this.f44031a.size(); i5++) {
                    strArr[i5] = (String) this.f44031a.get(i5);
                }
                if (com.join.mgps.Util.g2.i(this.f44032b.getV_url()) && i4 == 0) {
                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                    videoInfo.m(this.f44032b.getV_url());
                    videoInfo.h(strArr[0]);
                    FullScreenActivity_.i0(SearchGameListAdapter.this.f44021d).a(videoInfo).start();
                    return;
                }
                intent.putExtra("image_urls", strArr);
                intent.putExtra("image_index", i4);
                SearchGameListAdapter.this.f44021d.startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIntegratedFavoriteBean.FavoriteBean f44034b;

        d(SearchIntegratedFavoriteBean.FavoriteBean favoriteBean) {
            this.f44034b = favoriteBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SearchGameListAdapter.this.f44024g != null) {
                f fVar = SearchGameListAdapter.this.f44024g;
                Context context = view.getContext();
                fVar.n(context, this.f44034b.getId() + "", this.f44034b.getUid(), "0", "0");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44036b;

        e(String str) {
            this.f44036b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SearchGameListAdapter.this.f44024g != null) {
                SearchGameListAdapter.this.f44024g.f(this.f44036b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface f {
        void e(String str);

        void f(String str);

        void j(String str);

        void k(String str);

        void n(Context context, String str, String str2, String str3, String str4);
    }

    /* loaded from: classes4.dex */
    class g extends ClickableSpan implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private final View.OnClickListener f44038b;

        public g(View.OnClickListener onClickListener) {
            this.f44038b = onClickListener;
        }

        @Override // android.text.style.ClickableSpan, android.view.View.OnClickListener
        public void onClick(View view) {
            this.f44038b.onClick(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#FF4A4A4A"));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CommonGameInfoBean f44040b;

        public h(CommonGameInfoBean commonGameInfoBean) {
            this.f44040b = commonGameInfoBean;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit b(Context context, View view) {
            if (!com.join.android.app.common.utils.j.j(context)) {
                com.join.mgps.Util.l2.a(context).b("网络连接异常");
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
            UtilsMy.F2(context, this.f44040b);
            return null;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View view) {
            final Context context = view.getContext();
            DownloadTask downloadTask = this.f44040b.getDownloadTask();
            GInfoBean g_info = this.f44040b.getG_info();
            if (g_info != null) {
                if (g_info.isCpsGame() && com.join.mgps.Util.s0.c() && com.join.mgps.Util.s0.a(g_info.getTag_info())) {
                    com.join.mgps.Util.s0.b();
                    return;
                }
                if (downloadTask == null) {
                    SearchGameListAdapter.this.t(this.f44040b);
                    if (this.f44040b.isGameVm() && this.f44040b.isMiniGame() && this.f44040b.is64Bit() && (APKUtils.c(context, this.f44040b) || APKUtils.g(context, new Function0() { // from class: com.join.mgps.adapter.h5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit b5;
                            b5 = SearchGameListAdapter.h.this.b(context, view);
                            return b5;
                        }
                    }))) {
                        return;
                    }
                    if (!com.join.android.app.common.utils.j.j(context)) {
                        com.join.mgps.Util.l2.a(context).b("网络连接异常");
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
                    UtilsMy.F2(context, this.f44040b);
                    return;
                }
                String plugin_num = g_info.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    IntentDateBean intentDateBean = new IntentDateBean();
                    ExtBean extBean = new ExtBean();
                    extBean.setReMarks(this.f44040b.getReMarks());
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
                                            this.f44040b.setKeyword(SearchGameListAdapter.this.f44022e);
                                            SearchGameListAdapter.this.t(this.f44040b);
                                            UtilsMy.s4(context, this.f44040b);
                                            return;
                                        } else if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    if (com.join.android.app.common.utils.j.j(context)) {
                                                        this.f44040b.setKeyword(SearchGameListAdapter.this.f44022e);
                                                        SearchGameListAdapter.this.t(this.f44040b);
                                                        UtilsMy.H2(context, downloadTask.getCrc_link_type_val(), this.f44040b);
                                                        return;
                                                    }
                                                    com.join.mgps.Util.l2.a(context).b("无网络连接");
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
                            this.f44040b.setKeyword(SearchGameListAdapter.this.f44022e);
                            SearchGameListAdapter.this.t(this.f44040b);
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
                this.f44040b.setKeyword(SearchGameListAdapter.this.f44022e);
                SearchGameListAdapter.this.t(this.f44040b);
                UtilsMy.F2(context, this.f44040b);
                if (SearchGameListAdapter.this.f44024g != null) {
                    SearchGameListAdapter.this.f44024g.e(downloadTask.getCrc_link_type_val());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class i implements u1.b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f44042e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f44043f = 2;

        /* renamed from: g  reason: collision with root package name */
        public static final int f44044g = 3;

        /* renamed from: h  reason: collision with root package name */
        public static final int f44045h = 4;

        /* renamed from: i  reason: collision with root package name */
        public static final int f44046i = 5;

        /* renamed from: j  reason: collision with root package name */
        public static final int f44047j = 6;

        /* renamed from: k  reason: collision with root package name */
        public static final int f44048k = 7;

        /* renamed from: l  reason: collision with root package name */
        public static final int f44049l = 8;

        /* renamed from: m  reason: collision with root package name */
        public static final int f44050m = 9;

        /* renamed from: n  reason: collision with root package name */
        public static final int f44051n = 10;

        /* renamed from: o  reason: collision with root package name */
        public static final int f44052o = 11;

        /* renamed from: p  reason: collision with root package name */
        public static final int f44053p = 12;

        /* renamed from: q  reason: collision with root package name */
        public static final int f44054q = 13;

        /* renamed from: r  reason: collision with root package name */
        public static final int f44055r = 14;

        /* renamed from: s  reason: collision with root package name */
        public static final int f44056s = 15;

        /* renamed from: t  reason: collision with root package name */
        public static final int f44057t = 16;

        /* renamed from: u  reason: collision with root package name */
        public static final int f44058u = 17;

        /* renamed from: b  reason: collision with root package name */
        public int f44059b;

        /* renamed from: c  reason: collision with root package name */
        public Object f44060c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f44061d;

        public i(int i4, Object obj) {
            this.f44059b = i4;
            this.f44060c = obj;
        }

        public <O> O a() {
            return (O) this.f44060c;
        }

        public i b(boolean z4) {
            this.f44061d = z4;
            return this;
        }

        @Override // u1.b
        public int getItemType() {
            return this.f44059b;
        }
    }

    public SearchGameListAdapter(Context context, com.join.android.app.component.video.g gVar) {
        super(null);
        this.f44024g = null;
        this.f44021d = context;
        this.f44023f = gVar;
        a(1, R.layout.mg_forum_search_item_post_subject);
        a(2, R.layout.mg_forum_search_item_post_message);
        a(3, R.layout.mg_forum_search_list_item_post_footer);
        a(4, R.layout.mg_forum_search_item_post_top_area);
        a(5, R.layout.mg_forum_search_item_favorite_top_area);
        a(6, R.layout.mg_forum_search_item_favorite_game_list);
        a(7, R.layout.item_search_game_list);
        a(14, R.layout.item_search_game_list_ad);
        a(11, R.layout.item_search_mini_game_list);
        a(12, R.layout.item_search_mini_game_video_list);
        a(8, R.layout.gamedetail_item_viewpage1);
        a(9, R.layout.mg_forum_search_item_all_no_more);
        a(10, R.layout.mg_forum_search_item_all_view_more);
        a(13, R.layout.item_search_recommend_title);
        a(15, R.layout.item_search_mini_program);
        a(16, R.layout.item_search_mini_game_list);
        a(17, R.layout.item_search_mini_game_video_list);
    }

    private void A(BaseViewHolder baseViewHolder, i iVar) {
        if (iVar == null) {
            return;
        }
        CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
        t(commonGameInfoBean);
        y(baseViewHolder, iVar);
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_mask);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R.id.iv_mask_solid);
        if (imageView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setGradientType(0);
            if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBg_color())) {
                gradientDrawable.setColors(new int[]{Color.parseColor("#00000000"), Color.parseColor(commonGameInfoBean.getBg_color())});
            } else {
                gradientDrawable.setColors(new int[]{Color.parseColor("#00000000"), Color.parseColor("#99000000")});
            }
            imageView.setImageDrawable(gradientDrawable);
            if (imageView2 != null) {
                imageView2.setImageDrawable(gradientDrawable);
            }
        }
        K(baseViewHolder, iVar);
    }

    private void B(BaseViewHolder baseViewHolder, i iVar) {
        MultiStandVideo multiStandVideo;
        if (iVar == null) {
            return;
        }
        final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
        t(commonGameInfoBean);
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        final GInfoBean g_info = commonGameInfoBean.getG_info();
        if (g_info != null) {
            baseViewHolder.setText(R.id.mgListviewItemAppname, g_info.getName());
            ((TextView) baseViewHolder.getView(R.id.mgListviewItemAppname)).setTypeface(Typeface.DEFAULT, 0);
            baseViewHolder.getView(R.id.relateLayoutApp).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.a5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchGameListAdapter.this.Q(g_info, commonGameInfoBean, view);
                }
            });
            if (com.join.mgps.Util.g2.h(commonGameInfoBean.getV_url())) {
                if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBig_pic())) {
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), commonGameInfoBean.getBig_pic());
                } else {
                    List<String> pic_info = g_info.getPic_info();
                    if (com.join.mgps.Util.g2.h("") && pic_info != null && pic_info.size() > 0) {
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
            baseViewHolder.getView(R.id.rLayoutRight).setOnClickListener(new h(commonGameInfoBean));
        }
        if (com.join.mgps.Util.g2.i(commonGameInfoBean.getV_url()) && (multiStandVideo = (MultiStandVideo) baseViewHolder.getView(R.id.wf_video)) != null) {
            multiStandVideo.g(commonGameInfoBean.getBig_pic());
            multiStandVideo.setPlayTag(this.f44023f.p());
            multiStandVideo.setPlayPosition(commonGameInfoBean.hashCode());
            multiStandVideo.setUpLazy(commonGameInfoBean.getV_url(), false, null, null, "");
            multiStandVideo.setRotateViewAuto(false);
            multiStandVideo.setLockLand(true);
            multiStandVideo.setReleaseWhenLossAudio(false);
            multiStandVideo.setShowFullAnimation(false);
            multiStandVideo.setIsTouchWiget(false);
            multiStandVideo.setNeedLockFull(false);
            multiStandVideo.setVideoAllCallBack(new a(g_info, commonGameInfoBean));
        }
        if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBg_color())) {
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

    private void C(BaseViewHolder baseViewHolder, i iVar) {
        J(baseViewHolder, iVar);
    }

    private void D(BaseViewHolder baseViewHolder, i iVar) {
        final DomainInfoBean pd_info;
        if (iVar == null) {
            return;
        }
        CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
        t(commonGameInfoBean);
        if (commonGameInfoBean == null || (pd_info = commonGameInfoBean.getPd_info()) == null) {
            return;
        }
        if (!commonGameInfoBean.isHasExposure()) {
            com.papa.sim.statistic.p.l(this.f44021d).O1(Event.pdGameWish, new Ext().setIsJoin(pd_info.getIs_join()).setTestAbNumber(pd_info.getAb_test_number()).setIsResultPage("1"));
            commonGameInfoBean.setHasExposure(true);
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image);
        if (simpleDraweeView != null) {
            MyImageLoader.h(simpleDraweeView, pd_info.getPic());
        }
        if (com.join.mgps.Util.g2.i(pd_info.getInfo())) {
            try {
                final WxProgram wxProgram = (WxProgram) JsonMapper.getInstance().fromJson(com.join.mgps.Util.a.b(pd_info.getInfo()), WxProgram.class);
                if (wxProgram != null) {
                    baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.e5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SearchGameListAdapter.this.R(wxProgram, pd_info, view);
                        }
                    });
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private void E(BaseViewHolder baseViewHolder, i iVar) {
        MultiStandVideo multiStandVideo;
        if (iVar == null) {
            return;
        }
        final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
        t(commonGameInfoBean);
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        final GInfoBean g_info = commonGameInfoBean.getG_info();
        if (g_info != null) {
            baseViewHolder.setText(R.id.mgListviewItemAppname, g_info.getName());
            ((TextView) baseViewHolder.getView(R.id.mgListviewItemAppname)).setTypeface(Typeface.DEFAULT, 0);
            baseViewHolder.getView(R.id.relateLayoutApp).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.d5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchGameListAdapter.this.S(g_info, commonGameInfoBean, view);
                }
            });
            if (com.join.mgps.Util.g2.h(commonGameInfoBean.getOnlineGameAdVideoUrl())) {
                if (com.join.mgps.Util.g2.i(commonGameInfoBean.getOnlineGAmeAdPic())) {
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), commonGameInfoBean.getOnlineGAmeAdPic());
                } else {
                    List<String> pic_info = g_info.getPic_info();
                    if (com.join.mgps.Util.g2.h("") && pic_info != null && pic_info.size() > 0) {
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
            baseViewHolder.getView(R.id.rLayoutRight).setOnClickListener(new h(commonGameInfoBean));
        }
        if (com.join.mgps.Util.g2.i(commonGameInfoBean.getOnlineGameAdVideoUrl()) && (multiStandVideo = (MultiStandVideo) baseViewHolder.getView(R.id.wf_video)) != null) {
            multiStandVideo.g(commonGameInfoBean.getOnlineGAmeAdPic());
            multiStandVideo.setPlayTag(this.f44023f.p());
            multiStandVideo.setPlayPosition(commonGameInfoBean.hashCode());
            multiStandVideo.setUpLazy(commonGameInfoBean.getOnlineGameAdVideoUrl(), false, null, null, "");
            multiStandVideo.setRotateViewAuto(false);
            multiStandVideo.setLockLand(true);
            multiStandVideo.setReleaseWhenLossAudio(false);
            multiStandVideo.setShowFullAnimation(false);
            multiStandVideo.setIsTouchWiget(false);
            multiStandVideo.setNeedLockFull(false);
            multiStandVideo.setVideoAllCallBack(new b(g_info, commonGameInfoBean));
        }
        if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBg_color())) {
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
        String plugin_num = g_info.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
            baseViewHolder.setText(R.id.mgListviewItemInstall, "开始");
            baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
            baseViewHolder.setGone(R.id.giftPackageSwich, false);
        } else if (downloadTask == null) {
            c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(g_info.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f44021d).d(this.f44021d, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44021d).l(this.f44021d, g_info.getPackage_name());
                    if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                        baseViewHolder.setText(R.id.mgListviewItemInstall, "更新");
                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                    } else {
                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                        baseViewHolder.setText(R.id.mgListviewItemInstall, this.f44021d.getResources().getString(R.string.download_status_finished));
                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                    }
                } else {
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    UtilsMy.a3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                }
            } else {
                baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
            }
        } else {
            int status = downloadTask.getStatus();
            long parseDouble = (long) (Double.parseDouble(g_info.getApp_size()) * 1024.0d * 1024.0d);
            if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停中");
                } else if (status == 48) {
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "安装中");
                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                    c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "更新");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                                                    c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "等待");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                                                    Boolean bool = Boolean.FALSE;
                                                    c0(baseViewHolder, bool, bool);
                                                    try {
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e6) {
                                                        e6.printStackTrace();
                                                    }
                                                    baseViewHolder.setText(R.id.loding_info, "等待中");
                                                    break;
                                                case 11:
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "安装");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                                                    c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    c0(baseViewHolder, Boolean.FALSE, Boolean.TRUE);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    baseViewHolder.setText(R.id.loding_info, "解压中..");
                                                    ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "解压中");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                                                    break;
                                                case 13:
                                                    c0(baseViewHolder, Boolean.FALSE, Boolean.TRUE);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    baseViewHolder.setText(R.id.loding_info, "点击重新解压");
                                                    ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "解压");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                        baseViewHolder.setText(R.id.mgListviewItemInstall, this.f44021d.getResources().getString(R.string.download_status_finished));
                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                        c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                    }
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "继续");
                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                    Boolean bool2 = Boolean.FALSE;
                    c0(baseViewHolder, bool2, bool2);
                    try {
                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    baseViewHolder.setText(R.id.loding_info, "暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停");
                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f44021d.getResources().getColor(R.color.white));
                    Boolean bool3 = Boolean.FALSE;
                    c0(baseViewHolder, bool3, bool3);
                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    StringBuilder sb = new StringBuilder();
                    sb.append(downloadTask.getSpeed());
                    sb.append("/S");
                    baseViewHolder.setText(R.id.loding_info, sb.toString());
                    ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                }
            }
            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
            UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
            UtilsMy.a3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
            c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
        }
        if (commonGameInfoBean.getRequestStatus() == 47) {
            baseViewHolder.setGone(R.id.pb_loading, true);
            baseViewHolder.setText(R.id.mgListviewItemInstall, "");
            return;
        }
        baseViewHolder.setGone(R.id.pb_loading, false);
    }

    private void F(BaseViewHolder baseViewHolder, i iVar) {
        try {
            ForumBean.ForumSearchQueryBean forumSearchQueryBean = (ForumBean.ForumSearchQueryBean) iVar.a();
            if (forumSearchQueryBean != null) {
                com.join.mgps.Util.j0.D1((TextView) baseViewHolder.getView(R.id.forum_post_view), forumSearchQueryBean.getView(), "0");
                com.join.mgps.Util.j0.D1((TextView) baseViewHolder.getView(R.id.forum_post_commit), forumSearchQueryBean.getComment(), "0");
                com.join.mgps.Util.j0.D1((TextView) baseViewHolder.getView(R.id.forum_post_praise), forumSearchQueryBean.getPraise(), "0");
                a0(baseViewHolder.getView(R.id.cl_root), forumSearchQueryBean.getPid());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void G(BaseViewHolder baseViewHolder, i iVar) {
        try {
            ForumBean.ForumSearchQueryBean forumSearchQueryBean = (ForumBean.ForumSearchQueryBean) iVar.a();
            if (forumSearchQueryBean != null) {
                String message = forumSearchQueryBean.getMessage();
                String g4 = com.join.mgps.Util.g2.g(forumSearchQueryBean.getKeyword());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(message);
                int color = this.f44021d.getResources().getColor(R.color.search_high_light);
                int indexOf = message.indexOf(g4);
                int length = g4.length() + indexOf;
                try {
                    if (length <= message.length() && indexOf >= 0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf, length, 33);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                final String pid = forumSearchQueryBean.getPid();
                baseViewHolder.getView(R.id.messageParent).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.f5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SearchGameListAdapter.this.T(pid, view);
                    }
                });
                baseViewHolder.setText(R.id.forum_post_message, spannableStringBuilder);
                try {
                    int i4 = 0;
                    if (forumSearchQueryBean.isShowDivider()) {
                        baseViewHolder.setTextColor(R.id.forum_post_message, Color.parseColor("#3b3b3b"));
                        ((TextView) baseViewHolder.getView(R.id.forum_post_message)).setTypeface(Typeface.DEFAULT, 1);
                        i4 = ((TextView) baseViewHolder.getView(R.id.forum_post_message)).getResources().getDimensionPixelOffset(R.dimen.wdp36);
                    } else {
                        baseViewHolder.setTextColor(R.id.forum_post_message, Color.parseColor("#FF4A4A4A"));
                        ((TextView) baseViewHolder.getView(R.id.forum_post_message)).setTypeface(Typeface.DEFAULT, 0);
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baseViewHolder.getView(R.id.forum_post_message).getLayoutParams();
                    layoutParams.topMargin = i4;
                    baseViewHolder.getView(R.id.forum_post_message).setLayoutParams(layoutParams);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                baseViewHolder.getView(R.id.messageParent).requestLayout();
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    private void H(BaseViewHolder baseViewHolder, i iVar) {
        try {
            ForumBean.ForumSearchQueryBean forumSearchQueryBean = (ForumBean.ForumSearchQueryBean) iVar.a();
            if (forumSearchQueryBean == null) {
                return;
            }
            String subject = forumSearchQueryBean.getSubject();
            String g4 = com.join.mgps.Util.g2.g(forumSearchQueryBean.getKeyword());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subject);
            int color = this.f44021d.getResources().getColor(R.color.search_high_light);
            int indexOf = subject.indexOf(g4);
            int length = g4.length() + indexOf;
            try {
                if (length <= subject.length() && indexOf >= 0) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf, length, 33);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            baseViewHolder.setText(R.id.forum_post_subject, spannableStringBuilder);
            a0(baseViewHolder.getView(R.id.ll_root), forumSearchQueryBean.getPid());
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void I(BaseViewHolder baseViewHolder, i iVar) {
        final SearchIntegratedPostBean.TopArea topArea = (SearchIntegratedPostBean.TopArea) iVar.a();
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), topArea.getIcon_src());
        baseViewHolder.setText(R.id.name, topArea.getName());
        baseViewHolder.setText(R.id.desc, topArea.getDescription());
        baseViewHolder.setText(R.id.count, "今日更新:" + topArea.getToday_posts());
        baseViewHolder.getView(R.id.cl_root).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.g5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchGameListAdapter.U(SearchIntegratedPostBean.TopArea.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String N(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean.getStatistics() != null) {
            return commonGameInfoBean.getStatistics().getMin_game_search_source() + "";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(int i4, View view) {
        ((SearchListActivity1) this.f44021d).L0(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(GInfoBean gInfoBean, CommonGameInfoBean commonGameInfoBean, View view) {
        if (gInfoBean.getId() != null) {
            IntentUtil.getInstance().goGameDetialActivity(view.getContext(), gInfoBean.getId(), gInfoBean.getGame_info_tpl_type(), gInfoBean.getSp_tpl_two_position(), commonGameInfoBean.get_from_type(), commonGameInfoBean.getReMarks(), Where.search.name(), O(), N(commonGameInfoBean));
            f fVar = this.f44024g;
            if (fVar != null) {
                fVar.e(gInfoBean.getId());
                this.f44024g.k(gInfoBean.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(WxProgram wxProgram, DomainInfoBean domainInfoBean, View view) {
        if (wxProgram != null) {
            com.papa.sim.statistic.p.l(this.f44021d).O1(Event.pdGameWishClick, new Ext().setTestAbNumber(domainInfoBean.getAb_test_number()).setIsResultPage("1").setIsJoin(domainInfoBean.getIs_join()));
            wxProgram.setSceneType("game_search_wish");
            UtilsMy.g4(this.f44021d, wxProgram);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(GInfoBean gInfoBean, CommonGameInfoBean commonGameInfoBean, View view) {
        if (gInfoBean.getId() != null) {
            IntentUtil.getInstance().goGameDetialActivity(view.getContext(), gInfoBean.getId(), gInfoBean.getGame_info_tpl_type(), gInfoBean.getSp_tpl_two_position(), commonGameInfoBean.get_from_type(), commonGameInfoBean.getReMarks(), Where.search.name(), O(), N(commonGameInfoBean));
            f fVar = this.f44024g;
            if (fVar != null) {
                fVar.e(gInfoBean.getId());
                this.f44024g.k(gInfoBean.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(String str, View view) {
        X(view.getContext(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(SearchIntegratedPostBean.TopArea topArea, View view) {
        ForumBean forumBean = new ForumBean();
        forumBean.setFid(topArea.getFid());
        com.join.mgps.Util.j0.r0(view.getContext(), forumBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(GInfoBean gInfoBean, CommonGameInfoBean commonGameInfoBean, View view) {
        if (gInfoBean.getId() != null) {
            IntentUtil.getInstance().goGameDetialActivity(view.getContext(), gInfoBean.getId(), gInfoBean.getGame_info_tpl_type(), gInfoBean.getSp_tpl_two_position(), commonGameInfoBean.get_from_type(), commonGameInfoBean.getReMarks(), O(), O(), N(commonGameInfoBean));
            f fVar = this.f44024g;
            if (fVar != null) {
                fVar.e(gInfoBean.getId());
                this.f44024g.k(gInfoBean.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(GInfoBean gInfoBean, CommonGameInfoBean commonGameInfoBean, View view) {
        if (gInfoBean.getId() != null) {
            IntentUtil.getInstance().goGameDetialActivity(view.getContext(), gInfoBean.getId(), gInfoBean.getGame_info_tpl_type(), gInfoBean.getSp_tpl_two_position(), commonGameInfoBean.get_from_type(), commonGameInfoBean.getReMarks(), O(), O(), N(commonGameInfoBean));
            f fVar = this.f44024g;
            if (fVar != null) {
                fVar.e(gInfoBean.getId());
                this.f44024g.k(gInfoBean.getId());
            }
        }
    }

    private void u(BaseViewHolder baseViewHolder, i iVar) {
        int intValue = ((Integer) iVar.a()).intValue();
        ViewGroup.LayoutParams layoutParams = baseViewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
        if (intValue == 1) {
            baseViewHolder.setImageResource(R.id.icon, R.drawable.img_bg_game);
            baseViewHolder.setText(R.id.name, "未搜索到相应游戏\n已为您推荐其它游戏");
        } else if (intValue == 2) {
            baseViewHolder.setImageResource(R.id.icon, R.drawable.img_bg_dell);
            baseViewHolder.setText(R.id.name, "未搜索到相应游戏单\n已为您推荐热门游戏单");
        } else if (intValue == 3) {
            baseViewHolder.setImageResource(R.id.icon, R.drawable.img_bg_talk);
            baseViewHolder.setText(R.id.name, "未搜索到相应社区\n已为您推荐其他热门社区");
        }
    }

    private void v(BaseViewHolder baseViewHolder, i iVar) {
        final int intValue = ((Integer) iVar.a()).intValue();
        baseViewHolder.getView(R.id.cl_root).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.z4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchGameListAdapter.this.P(intValue, view);
            }
        });
    }

    private void w(BaseViewHolder baseViewHolder, i iVar) {
        SearchIntegratedFavoriteBean.FavoriteBean favoriteBean = (SearchIntegratedFavoriteBean.FavoriteBean) iVar.a();
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), favoriteBean.getPic());
        baseViewHolder.setText(R.id.name, favoriteBean.getTitle());
        baseViewHolder.setText(R.id.desc, favoriteBean.getAuth_name());
        baseViewHolder.setText(R.id.count, favoriteBean.getGame_count() + "款");
        baseViewHolder.setVisible(R.id.divider, favoriteBean.isShowDivider());
        baseViewHolder.getView(R.id.cl_root).setOnClickListener(new d(favoriteBean));
    }

    private void x(BaseViewHolder baseViewHolder, i iVar) {
        try {
            String str = (String) iVar.a();
            SpannableString spannableString = new SpannableString(String.format("包含%s的游戏单", str));
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFF47500")), 2, str.length() + 2, 18);
            baseViewHolder.setText(R.id.title, spannableString);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void y(BaseViewHolder baseViewHolder, i iVar) {
        ViewGroup.LayoutParams layoutParams = baseViewHolder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
    }

    private void z(BaseViewHolder baseViewHolder, i iVar) {
        L(baseViewHolder, iVar);
    }

    public void J(BaseViewHolder baseViewHolder, i iVar) {
        int i4;
        int i5;
        int i6;
        RelativeLayout.LayoutParams layoutParams;
        if (iVar == null) {
            return;
        }
        final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
        t(commonGameInfoBean);
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        final GInfoBean g_info = commonGameInfoBean.getG_info();
        if (g_info != null) {
            Context context = this.f44021d;
            if (iVar.f44061d) {
                if (baseViewHolder.getView(R.id.line).getLayoutParams() != null) {
                    layoutParams = (RelativeLayout.LayoutParams) baseViewHolder.getView(R.id.line).getLayoutParams();
                } else {
                    layoutParams = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
                }
                layoutParams.leftMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp34);
                layoutParams.rightMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp34);
                baseViewHolder.getView(R.id.line).setLayoutParams(layoutParams);
            }
            baseViewHolder.setVisible(R.id.line, iVar.f44061d);
            baseViewHolder.setText(R.id.mgListviewItemAppname, g_info.getName());
            if (com.join.mgps.Util.g2.i(g_info.getInfo())) {
                baseViewHolder.setGone(R.id.mgListviewItemDescribe, true);
                baseViewHolder.setText(R.id.mgListviewItemDescribe, g_info.getInfo());
            } else {
                baseViewHolder.setGone(R.id.mgListviewItemDescribe, false);
            }
            baseViewHolder.getView(R.id.relateLayoutApp).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.b5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchGameListAdapter.this.V(g_info, commonGameInfoBean, view);
                }
            });
            if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBig_pic())) {
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), commonGameInfoBean.getBig_pic());
            } else {
                List<String> pic_info = g_info.getPic_info();
                if (com.join.mgps.Util.g2.h("") && pic_info != null && pic_info.size() > 0) {
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), pic_info.get(0));
                }
            }
            baseViewHolder.setGone(R.id.giftPackageSwich, g_info.getGift_package_switch() == 1);
            long parseDouble = (long) (Double.parseDouble(g_info.getApp_size()) * 1024.0d * 1024.0d);
            if (g_info.getScore().doubleValue() > 0.0d && g_info.showScore()) {
                baseViewHolder.setText(R.id.tv_score, String.valueOf(g_info.getScore()));
                baseViewHolder.setGone(R.id.tv_score, true);
            } else {
                baseViewHolder.setGone(R.id.tv_score, false);
            }
            baseViewHolder.setText(R.id.tv_label, UtilsMy.M1(g_info.getSp_tag_info(), g_info.getTag_info()));
            UtilsMy.j3(g_info.getSp_tag_info(), baseViewHolder.getView(R.id.relateLayoutApp), downloadTask);
            if (g_info.isCpsGame() && com.join.mgps.Util.s0.c() && com.join.mgps.Util.s0.a(g_info.getTag_info())) {
                baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn);
                baseViewHolder.setText(R.id.mgListviewItemInstall, context.getResources().getString(R.string.download_status_finished));
                baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_main_color));
            } else {
                String plugin_num = g_info.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "开始");
                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                    baseViewHolder.setGone(R.id.giftPackageSwich, false);
                } else if (downloadTask == null) {
                    c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                    if (UtilsMy.o0(g_info.getTag_info())) {
                        if (com.join.android.app.common.utils.e.l0(context).d(context, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, g_info.getPackage_name());
                            if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                                baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                                baseViewHolder.setText(R.id.mgListviewItemInstall, "更新");
                                baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                            } else {
                                baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                                baseViewHolder.setText(R.id.mgListviewItemInstall, context.getResources().getString(R.string.download_status_finished));
                                baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                            }
                        } else {
                            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                            UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                            i4 = R.id.rLayoutRight;
                            UtilsMy.a3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                            baseViewHolder.getView(i4).setOnClickListener(new h(commonGameInfoBean));
                        }
                    } else {
                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                        UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                        UtilsMy.a3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                    }
                } else {
                    int status = downloadTask.getStatus();
                    if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                        status = 43;
                    }
                    if (status != 0) {
                        if (status == 27) {
                            baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停中");
                        } else if (status == 48) {
                            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                            baseViewHolder.setText(R.id.mgListviewItemInstall, "安装中");
                            baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                            c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                        } else if (status != 2) {
                            if (status != 3) {
                                if (status != 5) {
                                    if (status == 6) {
                                        i6 = R.id.mgListviewItemInstall;
                                        i5 = R.color.app_blue_color;
                                    } else if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "更新");
                                                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                                                        c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 10:
                                                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "等待");
                                                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                                                        Boolean bool = Boolean.FALSE;
                                                        c0(baseViewHolder, bool, bool);
                                                        try {
                                                            baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                                                        } catch (Exception e5) {
                                                            e5.printStackTrace();
                                                        }
                                                        baseViewHolder.setText(R.id.loding_info, "等待中");
                                                        break;
                                                    case 11:
                                                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "安装");
                                                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                                                        c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 12:
                                                        c0(baseViewHolder, Boolean.FALSE, Boolean.TRUE);
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        baseViewHolder.setText(R.id.loding_info, "解压中..");
                                                        ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.extract);
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "解压中");
                                                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_grey_color));
                                                        break;
                                                    case 13:
                                                        c0(baseViewHolder, Boolean.FALSE, Boolean.TRUE);
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        baseViewHolder.setText(R.id.loding_info, "点击重新解压");
                                                        ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "解压");
                                                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                                baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                                baseViewHolder.setText(R.id.mgListviewItemInstall, context.getResources().getString(R.string.download_status_finished));
                                baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                                c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                            } else {
                                i5 = R.color.app_blue_color;
                                i6 = R.id.mgListviewItemInstall;
                            }
                            baseViewHolder.setBackgroundRes(i6, R.drawable.btn_download_3ca4fd_stroke_1px);
                            baseViewHolder.setText(i6, "继续");
                            baseViewHolder.setTextColor(i6, context.getResources().getColor(i5));
                            Boolean bool2 = Boolean.FALSE;
                            c0(baseViewHolder, bool2, bool2);
                            try {
                                baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            baseViewHolder.setText(R.id.loding_info, "暂停中");
                        } else {
                            UtilsMy.x4(downloadTask);
                            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                            baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停");
                            baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_blue_color));
                            Boolean bool3 = Boolean.FALSE;
                            c0(baseViewHolder, bool3, bool3);
                            baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            StringBuilder sb = new StringBuilder();
                            sb.append(downloadTask.getSpeed());
                            sb.append("/S");
                            baseViewHolder.setText(R.id.loding_info, sb.toString());
                            ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                        }
                    }
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.btn_download_3ca4fd_stroke_1px);
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    i4 = R.id.rLayoutRight;
                    UtilsMy.a3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                    c0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                    baseViewHolder.getView(i4).setOnClickListener(new h(commonGameInfoBean));
                }
            }
            i4 = R.id.rLayoutRight;
            baseViewHolder.getView(i4).setOnClickListener(new h(commonGameInfoBean));
        }
        if (commonGameInfoBean.getRequestStatus() == 47) {
            baseViewHolder.setGone(R.id.pb_loading, true);
            baseViewHolder.setText(R.id.mgListviewItemInstall, "");
            return;
        }
        baseViewHolder.setGone(R.id.pb_loading, false);
    }

    public void K(BaseViewHolder baseViewHolder, i iVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RelativeLayout.LayoutParams layoutParams;
        if (iVar == null) {
            return;
        }
        final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
        t(commonGameInfoBean);
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        final GInfoBean g_info = commonGameInfoBean.getG_info();
        if (g_info != null) {
            Context context = this.f44021d;
            if (iVar.f44061d) {
                if (baseViewHolder.getView(R.id.line).getLayoutParams() != null) {
                    layoutParams = (RelativeLayout.LayoutParams) baseViewHolder.getView(R.id.line).getLayoutParams();
                } else {
                    layoutParams = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
                }
                layoutParams.leftMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp34);
                layoutParams.rightMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp34);
                baseViewHolder.getView(R.id.line).setLayoutParams(layoutParams);
            }
            baseViewHolder.setVisible(R.id.line, iVar.f44061d);
            baseViewHolder.setText(R.id.mgListviewItemAppname, g_info.getName());
            if (com.join.mgps.Util.g2.i(g_info.getInfo())) {
                baseViewHolder.setGone(R.id.mgListviewItemDescribe, true);
                baseViewHolder.setText(R.id.mgListviewItemDescribe, g_info.getInfo());
            } else {
                baseViewHolder.setGone(R.id.mgListviewItemDescribe, false);
            }
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.c5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchGameListAdapter.this.W(g_info, commonGameInfoBean, view);
                }
            });
            if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBig_pic())) {
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), commonGameInfoBean.getBig_pic());
            } else {
                List<String> pic_info = g_info.getPic_info();
                if (com.join.mgps.Util.g2.h("") && pic_info != null && pic_info.size() > 0) {
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image), pic_info.get(0));
                }
            }
            baseViewHolder.setGone(R.id.giftPackageSwich, g_info.getGift_package_switch() == 1);
            long parseDouble = (long) (Double.parseDouble(g_info.getApp_size()) * 1024.0d * 1024.0d);
            if (g_info.getScore().doubleValue() > 0.0d && g_info.showScore()) {
                baseViewHolder.setText(R.id.tv_score, String.valueOf(g_info.getScore()));
                baseViewHolder.setGone(R.id.tv_score, true);
            } else {
                baseViewHolder.setGone(R.id.tv_score, false);
            }
            baseViewHolder.setText(R.id.tv_label, UtilsMy.M1(g_info.getSp_tag_info(), g_info.getTag_info()));
            UtilsMy.j3(g_info.getSp_tag_info(), baseViewHolder.getView(R.id.relateLayoutApp), downloadTask);
            String plugin_num = g_info.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                baseViewHolder.setText(R.id.mgListviewItemInstall, "开始");
                baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                baseViewHolder.setGone(R.id.giftPackageSwich, false);
            } else if (downloadTask == null) {
                d0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                if (UtilsMy.o0(g_info.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(context).d(context, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, g_info.getPackage_name());
                        if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                            baseViewHolder.setText(R.id.mgListviewItemInstall, "更新");
                            baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                        } else {
                            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                            baseViewHolder.setText(R.id.mgListviewItemInstall, context.getResources().getString(R.string.download_status_finished));
                            baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                        }
                    } else {
                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                        UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                        UtilsMy.h3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                    }
                } else {
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    UtilsMy.h3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                }
            } else {
                int status = UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0 ? 43 : downloadTask.getStatus();
                if (status == 0) {
                    i4 = R.id.mgListviewItemInstall;
                    i5 = R.drawable.recom_white_butn;
                } else if (status == 27) {
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停中");
                } else if (status == 48) {
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "安装中");
                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                    d0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "更新");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                                                    d0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "等待");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                                                    Boolean bool = Boolean.FALSE;
                                                    d0(baseViewHolder, bool, bool);
                                                    try {
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    baseViewHolder.setText(R.id.loding_info, "等待中");
                                                    break;
                                                case 11:
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "安装");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                                                    d0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    d0(baseViewHolder, Boolean.FALSE, Boolean.TRUE);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    baseViewHolder.setText(R.id.loding_info, "解压中..");
                                                    ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.extract);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "解压中");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    d0(baseViewHolder, Boolean.FALSE, Boolean.TRUE);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    baseViewHolder.setText(R.id.loding_info, "点击重新解压");
                                                    ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "解压");
                                                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                                                    break;
                                            }
                                        }
                                    }
                                }
                                i5 = R.drawable.recom_white_butn;
                                i4 = R.id.mgListviewItemInstall;
                            } else {
                                i8 = R.id.mgListviewItemInstall;
                                i9 = R.drawable.recom_white_butn;
                                i7 = R.color.white;
                            }
                        }
                        baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                        baseViewHolder.setText(R.id.mgListviewItemInstall, context.getResources().getString(R.string.download_status_finished));
                        baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                        d0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                    } else {
                        i7 = R.color.white;
                        i8 = R.id.mgListviewItemInstall;
                        i9 = R.drawable.recom_white_butn;
                    }
                    baseViewHolder.setBackgroundRes(i8, i9);
                    baseViewHolder.setText(i8, "继续");
                    baseViewHolder.setTextColor(i8, context.getResources().getColor(i7));
                    Boolean bool2 = Boolean.FALSE;
                    d0(baseViewHolder, bool2, bool2);
                    try {
                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    baseViewHolder.setText(R.id.loding_info, "暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_white_butn);
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停");
                    baseViewHolder.setTextColor(R.id.mgListviewItemInstall, context.getResources().getColor(R.color.white));
                    Boolean bool3 = Boolean.FALSE;
                    d0(baseViewHolder, bool3, bool3);
                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    StringBuilder sb = new StringBuilder();
                    sb.append(downloadTask.getSpeed());
                    sb.append("/S");
                    baseViewHolder.setText(R.id.loding_info, sb.toString());
                    ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                }
                baseViewHolder.setBackgroundRes(i4, i5);
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                i6 = R.id.rLayoutRight;
                UtilsMy.h3((TextView) baseViewHolder.getView(i4), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                d0(baseViewHolder, Boolean.TRUE, Boolean.FALSE);
                baseViewHolder.getView(i6).setOnClickListener(new h(commonGameInfoBean));
            }
            i6 = R.id.rLayoutRight;
            baseViewHolder.getView(i6).setOnClickListener(new h(commonGameInfoBean));
        }
        if (commonGameInfoBean.getRequestStatus() == 47) {
            baseViewHolder.setGone(R.id.pb_loading, true);
            baseViewHolder.setText(R.id.mgListviewItemInstall, "");
            return;
        }
        baseViewHolder.setGone(R.id.pb_loading, false);
    }

    public void L(BaseViewHolder baseViewHolder, i iVar) {
        boolean z4;
        CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
        t(commonGameInfoBean);
        GInfoBean g_info = commonGameInfoBean.getG_info();
        if (g_info != null) {
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBig_pic()) && com.join.mgps.Util.g2.i(commonGameInfoBean.getV_url())) {
                    arrayList.add(commonGameInfoBean.getBig_pic());
                    z4 = true;
                } else {
                    z4 = false;
                }
                List<String> pic_info = g_info.getPic_info();
                if (pic_info != null) {
                    for (int i4 = 0; i4 < pic_info.size(); i4++) {
                        arrayList.add(pic_info.get(i4));
                    }
                }
                baseViewHolder.setGone(R.id.screenListView, arrayList.size() > 0);
                if (arrayList.size() > 0) {
                    int intValue = g_info.getPic_position().intValue();
                    ((HListView) baseViewHolder.getView(R.id.screenListView)).setAdapter((ListAdapter) new p0(this.f44021d, intValue, arrayList, z4));
                    if (intValue == 1) {
                        ((HListView) baseViewHolder.getView(R.id.screenListView)).setDividerWidth(this.f44021d.getResources().getDimensionPixelSize(R.dimen.wdp10));
                        ((HListView) baseViewHolder.getView(R.id.screenListView)).postInvalidate();
                    } else {
                        ((HListView) baseViewHolder.getView(R.id.screenListView)).setDividerWidth(this.f44021d.getResources().getDimensionPixelSize(R.dimen.wdp20));
                        ((HListView) baseViewHolder.getView(R.id.screenListView)).postInvalidate();
                    }
                    ((HListView) baseViewHolder.getView(R.id.screenListView)).setOnItemClickListener(new c(arrayList, commonGameInfoBean));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: M */
    public void convert(@NonNull BaseViewHolder baseViewHolder, i iVar) {
        switch (iVar.getItemType()) {
            case 1:
                H(baseViewHolder, iVar);
                return;
            case 2:
                G(baseViewHolder, iVar);
                return;
            case 3:
                F(baseViewHolder, iVar);
                return;
            case 4:
                I(baseViewHolder, iVar);
                return;
            case 5:
                x(baseViewHolder, iVar);
                return;
            case 6:
                w(baseViewHolder, iVar);
                return;
            case 7:
                C(baseViewHolder, iVar);
                return;
            case 8:
                z(baseViewHolder, iVar);
                return;
            case 9:
                u(baseViewHolder, iVar);
                return;
            case 10:
                v(baseViewHolder, iVar);
                return;
            case 11:
            case 12:
                B(baseViewHolder, iVar);
                return;
            case 13:
                y(baseViewHolder, iVar);
                return;
            case 14:
                A(baseViewHolder, iVar);
                return;
            case 15:
                D(baseViewHolder, iVar);
                return;
            case 16:
            case 17:
                E(baseViewHolder, iVar);
                return;
            default:
                return;
        }
    }

    public String O() {
        return this.f44022e;
    }

    public void X(Context context, String str) {
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        forumPostsBean.setPid(Integer.parseInt(str));
        com.join.mgps.Util.j0.v0(context, forumPostsBean);
    }

    public void Y(f fVar) {
        this.f44024g = fVar;
    }

    void Z(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i4);
    }

    public void a0(View view, String str) {
        view.setOnClickListener(new e(str));
    }

    public void b0(String str) {
        this.f44022e = str;
    }

    void c0(BaseViewHolder baseViewHolder, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            baseViewHolder.setGone(R.id.linearLayout2, false);
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setGone(R.id.progressBarZip, false);
            baseViewHolder.setGone(R.id.ll_label, true);
            return;
        }
        baseViewHolder.setVisible(R.id.linearLayout2, true);
        if (bool2.booleanValue()) {
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setVisible(R.id.progressBarZip, true);
        } else {
            baseViewHolder.setGone(R.id.progressBarZip, false);
            baseViewHolder.setVisible(R.id.progressBar, true);
        }
        baseViewHolder.setGone(R.id.ll_label, false);
    }

    void d0(BaseViewHolder baseViewHolder, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            baseViewHolder.setGone(R.id.rl_download_state, false);
            baseViewHolder.setGone(R.id.linearLayout2, false);
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setGone(R.id.progressBarZip, false);
            baseViewHolder.setGone(R.id.mgListviewItemDescribe, true);
            return;
        }
        baseViewHolder.setVisible(R.id.linearLayout2, true);
        baseViewHolder.setVisible(R.id.rl_download_state, true);
        if (bool2.booleanValue()) {
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setVisible(R.id.progressBarZip, true);
        } else {
            baseViewHolder.setGone(R.id.progressBarZip, false);
            baseViewHolder.setVisible(R.id.progressBar, true);
        }
        baseViewHolder.setGone(R.id.mgListviewItemDescribe, false);
    }

    void t(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null) {
            return;
        }
        ExtBean extBean = new ExtBean();
        if (commonGameInfoBean.isAdInfo()) {
            commonGameInfoBean.set_from_type(147);
            commonGameInfoBean.set_from(147);
            extBean.setFrom("147");
            extBean.set_from_type(147);
        } else {
            commonGameInfoBean.set_from_type(103);
            commonGameInfoBean.set_from(103);
            extBean.setFrom("103");
            extBean.set_from_type(103);
        }
        extBean.setDataFlag(N(commonGameInfoBean));
        commonGameInfoBean.setKeyword(O());
        extBean.setPosition("112");
        extBean.setWhere(O());
        commonGameInfoBean.setExt(JsonMapper.toJsonString(extBean));
    }
}
