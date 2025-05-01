package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.MApplication;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.optimizetext.StaticLayoutView;
import com.join.android.app.component.video.MediaController;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumBaseAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    com.join.android.app.component.optimizetext.b f40307b;

    /* renamed from: c  reason: collision with root package name */
    com.danikula.videocache.i f40308c;

    /* renamed from: e  reason: collision with root package name */
    private Context f40310e;

    /* renamed from: g  reason: collision with root package name */
    com.join.android.app.component.video.c f40312g;

    /* renamed from: i  reason: collision with root package name */
    private com.join.mgps.listener.f f40314i;

    /* renamed from: k  reason: collision with root package name */
    Hashtable<String, u0> f40316k;

    /* renamed from: l  reason: collision with root package name */
    LinearLayout.LayoutParams f40317l;

    /* renamed from: n  reason: collision with root package name */
    LinearLayout.LayoutParams f40319n;

    /* renamed from: v  reason: collision with root package name */
    private MyVideoView f40327v;

    /* renamed from: w  reason: collision with root package name */
    private MediaController f40328w;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40309d = false;

    /* renamed from: h  reason: collision with root package name */
    String f40313h = "ForumBaseAdapter";

    /* renamed from: j  reason: collision with root package name */
    int f40315j = 0;

    /* renamed from: m  reason: collision with root package name */
    int f40318m = 0;

    /* renamed from: o  reason: collision with root package name */
    private t0 f40320o = null;

    /* renamed from: p  reason: collision with root package name */
    int f40321p = 0;

    /* renamed from: q  reason: collision with root package name */
    int f40322q = 0;

    /* renamed from: r  reason: collision with root package name */
    int f40323r = 0;

    /* renamed from: s  reason: collision with root package name */
    int f40324s = 0;

    /* renamed from: t  reason: collision with root package name */
    int f40325t = 0;

    /* renamed from: u  reason: collision with root package name */
    int f40326u = 0;

    /* renamed from: x  reason: collision with root package name */
    private int f40329x = -1;

    /* renamed from: y  reason: collision with root package name */
    private String f40330y = "";

    /* renamed from: z  reason: collision with root package name */
    private int f40331z = -1;
    private boolean A = false;
    private boolean B = false;
    List<Integer> C = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<r1> f40311f = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        POST_HEADER,
        POST_SUBJECT,
        POST_MESSAGE,
        POST_IMAGE_THUMBNAIL,
        POST_VIDEO_THUMBNAIL,
        POST_FOOTER,
        POST_TOP,
        POST_GAME,
        MY_FORUM_HEADER,
        MY_FORUM_ITEM,
        MY_FORUM_FOOTER,
        MY_FORUM_MORE_FOOTER,
        HOT_FORUM_HEADER,
        HOT_FORUM_ITEM,
        HOT_FORUM_FOOTER,
        TOP_BLOCK,
        MID_BLOCK,
        AD_BLOCK,
        FORUM_TOPIC,
        BAIDUAD,
        LIVE,
        LIVE_ENTRY,
        GROUP_ITEM,
        GROUP_ITEM_2,
        P_SUBJECT,
        P_SUBJECT_LABEL,
        P_MESSAGE,
        P_IMGS,
        P_VIDEO,
        P_FOOTER,
        TAG_FLOW_LAYOUT,
        GROUP_MEMBER_SECTION_TITLE,
        GROUP_MEMBER_ITEM,
        TAG_ITEM,
        POST_GAME_RES_LINK,
        RICH_MESSAGE,
        POST_RICH_MESSAGE,
        POST_IMAGE,
        POST_VIDEO
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40332b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40333c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f40334d;

        a(String str, String str2, ForumBean.GameInfo gameInfo) {
            this.f40332b = str;
            this.f40333c = str2;
            this.f40334d = gameInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            com.papa.sim.statistic.p.l(context).t0(this.f40332b, this.f40333c, AccountUtil_.getInstance_(context).getUid());
            com.join.mgps.Util.j0.J0(view.getContext(), this.f40334d, 13203);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r1.x f40336b;

        a0(r1.x xVar) {
            this.f40336b = xVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f40336b.f40653m).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public View f40338b;

        a1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f40340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40341c;

        b(IntentDateBean intentDateBean, int i4) {
            this.f40340b = intentDateBean;
            this.f40341c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            if (this.f40340b == null) {
                return;
            }
            IntentUtil.getInstance().intentActivity(context, this.f40340b);
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
            l4.u0("banner3-" + (this.f40341c + 1), AccountUtil_.getInstance_(context).getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40343b;

        b0(int i4) {
            this.f40343b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.a(this.f40343b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b1 implements t0 {
        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void b(ForumBean forumBean) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void c(int i4) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void e(String str) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void f(ForumBean forumBean) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void g(int i4) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void h(String str) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void i(RecommendLabelTag recommendLabelTag) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void j(ForumBean forumBean) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void k() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void l() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void m(int i4) {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.t0
        public void n() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f40345b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40346c;

        c(List list, int i4) {
            this.f40345b = list;
            this.f40346c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f40345b.size()];
            this.f40345b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f40346c, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r1.m f40348b;

        c0(r1.m mVar) {
            this.f40348b = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f40348b.f40588h).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40350b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40351c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40352d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40353e;

        /* renamed from: f  reason: collision with root package name */
        public View f40354f;

        /* renamed from: g  reason: collision with root package name */
        public View f40355g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f40356h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f40357i;

        /* renamed from: j  reason: collision with root package name */
        public SimpleDraweeView f40358j;

        c1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f40360b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40361c;

        d(List list, int i4) {
            this.f40360b = list;
            this.f40361c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f40360b.size()];
            this.f40360b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f40361c, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40363b;

        d0(int i4) {
            this.f40363b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40312g.A() != this.f40363b || ForumBaseAdapter.this.f40312g.D() == 5) {
                ForumBaseAdapter.this.f40314i.a(this.f40363b);
            } else {
                ForumBaseAdapter.this.f40312g.t();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public View f40365b;

        /* renamed from: c  reason: collision with root package name */
        public View f40366c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f40367d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f40368e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f40369f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f40370g;

        d1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40372b;

        e(String str) {
            this.f40372b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.Q0(view.getContext(), this.f40372b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40374b;

        e0(int i4) {
            this.f40374b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40312g.A() != this.f40374b || ForumBaseAdapter.this.f40312g.D() == 5) {
                ForumBaseAdapter.this.f40314i.a(this.f40374b);
            } else {
                ForumBaseAdapter.this.f40312g.t();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public StaticLayoutView f40376b;

        /* renamed from: c  reason: collision with root package name */
        public View f40377c;

        /* renamed from: d  reason: collision with root package name */
        public View f40378d;

        e1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f40380b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40381c;

        f(c1 c1Var, int i4) {
            this.f40380b = c1Var;
            this.f40381c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f40380b.f40357i.startAnimation(AnimationUtils.loadAnimation(ForumBaseAdapter.this.f40310e, R.anim.scale_reset));
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.a(this.f40381c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f0 implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f40383a;

        f0(SimpleDraweeView simpleDraweeView) {
            this.f40383a = simpleDraweeView;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            try {
                ForumBaseAdapter.this.a1(str, this.f40383a, fVar);
                if (fVar != null) {
                    u0 u0Var = new u0();
                    u0Var.f40684a = fVar.getWidth();
                    u0Var.f40685b = fVar.getHeight();
                    ForumBaseAdapter.this.h(str, u0Var);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: b */
        public void onIntermediateImageSet(String str, com.facebook.imagepipeline.image.f fVar) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onIntermediateImageFailed(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onRelease(String str) {
        }

        @Override // com.facebook.drawee.controller.c
        public void onSubmit(String str, Object obj) {
            this.f40383a.setMinimumHeight(ForumBaseAdapter.this.f40315j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public FrameLayout f40385b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f40386c;

        f1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f40388b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40389c;

        g(IntentDateBean intentDateBean, int i4) {
            this.f40388b = intentDateBean;
            this.f40389c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            if (this.f40388b == null) {
                return;
            }
            IntentUtil.getInstance().intentActivity(context, this.f40388b);
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
            l4.u0("banner2-" + (this.f40389c + 1), AccountUtil_.getInstance_(context).getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f40391b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f40392c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40393d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f40394e;

        g0(ForumBean.GameInfo gameInfo, DownloadTask downloadTask, String str, String str2) {
            this.f40391b = gameInfo;
            this.f40392c = downloadTask;
            this.f40393d = str;
            this.f40394e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ((ConstantIntEnum.H5.value() + "").equals(this.f40391b.getPlugin_num())) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f40391b.getGame_down_url_remote());
                UtilsMy.T2(this.f40392c, ForumBaseAdapter.this.f40310e);
                IntentUtil.getInstance().intentActivity(ForumBaseAdapter.this.f40310e, intentDateBean);
                return;
            }
            Context context = view.getContext();
            com.papa.sim.statistic.p.l(context).s0(this.f40393d, this.f40394e, AccountUtil_.getInstance_(context).getUid());
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.e(this.f40394e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40396b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40397c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40398d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40399e;

        /* renamed from: f  reason: collision with root package name */
        public View f40400f;

        /* renamed from: g  reason: collision with root package name */
        public View f40401g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f40402h;

        g1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f40404b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40405c;

        h(IntentDateBean intentDateBean, int i4) {
            this.f40404b = intentDateBean;
            this.f40405c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            if (this.f40404b == null) {
                return;
            }
            IntentUtil.getInstance().intentActivity(context, this.f40404b);
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
            l4.u0("banner1-" + (this.f40405c + 1), AccountUtil_.getInstance_(context).getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40407b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f40408c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f40409d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f40410e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f40411f;

        /* renamed from: g  reason: collision with root package name */
        public RelativeLayout f40412g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f40413h;

        h0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f40415b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40416c;

        /* renamed from: d  reason: collision with root package name */
        public Button f40417d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40418e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f40419f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f40420g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f40421h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f40422i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f40423j;

        /* renamed from: k  reason: collision with root package name */
        public ProgressBar f40424k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f40425l;

        /* renamed from: m  reason: collision with root package name */
        public View f40426m;

        /* renamed from: n  reason: collision with root package name */
        public View f40427n;

        /* renamed from: o  reason: collision with root package name */
        public View f40428o;

        h1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f40430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40431c;

        i(IntentDateBean intentDateBean, int i4) {
            this.f40430b = intentDateBean;
            this.f40431c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            if (this.f40430b == null) {
                return;
            }
            IntentUtil.getInstance().intentActivity(context, this.f40430b);
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
            l4.u0("banner3-" + (this.f40431c + 1), AccountUtil_.getInstance_(context).getUid());
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private Context f40433b;

        /* renamed from: c  reason: collision with root package name */
        private String f40434c;

        public i0(Context context, String str) {
            this.f40433b = context;
            this.f40434c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(this.f40433b, this.f40434c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f40436b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40437c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40438d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40439e;

        /* renamed from: f  reason: collision with root package name */
        public View f40440f;

        /* renamed from: g  reason: collision with root package name */
        public RelativeLayout f40441g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f40442h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f40443i;

        /* renamed from: j  reason: collision with root package name */
        public VipView f40444j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f40445k;

        i1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40447b;

        j(String str) {
            this.f40447b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.h(this.f40447b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private final Object f40449b;

        public j0(Object obj) {
            this.f40449b = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r12) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.ForumBaseAdapter.j0.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40451b;

        /* renamed from: c  reason: collision with root package name */
        public RelativeLayout f40452c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f40453d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f40454e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f40455f;

        j1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r1.c f40457b;

        k(r1.c cVar) {
            this.f40457b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f40457b.f40549i).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40459b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40460c;

        /* renamed from: d  reason: collision with root package name */
        public Button f40461d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f40462e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f40463f;

        k0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public StaticLayoutView f40465b;

        k1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40467b;

        l(int i4) {
            this.f40467b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.d(this.f40467b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class l0 extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<ForumBean.ForumTopicBean> f40469b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ForumBean.ForumTopicBean f40471b;

            a(ForumBean.ForumTopicBean forumTopicBean) {
                this.f40471b = forumTopicBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.join.mgps.Util.j0.D0(view.getContext(), this.f40471b);
            }
        }

        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            public SimpleDraweeView f40473a;

            b() {
            }
        }

        public l0() {
        }

        private void c(ImageView imageView, ForumBean.ForumTopicBean forumTopicBean) {
            imageView.setOnClickListener(new a(forumTopicBean));
        }

        public List<ForumBean.ForumTopicBean> a() {
            return this.f40469b;
        }

        public void b(List<ForumBean.ForumTopicBean> list) {
            this.f40469b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<ForumBean.ForumTopicBean> list = this.f40469b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<ForumBean.ForumTopicBean> list = this.f40469b;
            if (list == null) {
                return null;
            }
            return list.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            try {
                if (view != null) {
                    bVar = (b) view.getTag();
                } else {
                    bVar = new b();
                    view = LayoutInflater.from(ForumBaseAdapter.this.f40310e).inflate(R.layout.mg_forum_welcome_item_forum_topic_item, (ViewGroup) null);
                    bVar.f40473a = (SimpleDraweeView) view.findViewById(R.id.itemImg);
                    view.setTag(bVar);
                }
                ForumBean.ForumTopicBean forumTopicBean = this.f40469b.get(i4);
                MyImageLoader.h(bVar.f40473a, forumTopicBean.getIcon_src());
                c(bVar.f40473a, forumTopicBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f40475b;

        l1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean f40477b;

        m(ForumBean forumBean) {
            this.f40477b = forumBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.f(this.f40477b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40479b;

        /* renamed from: c  reason: collision with root package name */
        public HListView f40480c;

        m0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public Button f40482b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40483c;

        /* renamed from: d  reason: collision with root package name */
        public View f40484d;

        /* renamed from: e  reason: collision with root package name */
        public View f40485e;

        m1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f40488b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40489c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40490d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40491e;

        /* renamed from: f  reason: collision with root package name */
        public View f40492f;

        n0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public Button f40494b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40495c;

        n1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40497b;

        o(int i4) {
            this.f40497b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.g(this.f40497b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f40499b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40500c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40501d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40502e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f40503f;

        o0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f40505b;

        /* renamed from: c  reason: collision with root package name */
        public FrameLayout f40506c;

        o1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40508b;

        p(int i4) {
            this.f40508b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.findViewById(R.id.forum_post_praise_icon).startAnimation(AnimationUtils.loadAnimation(ForumBaseAdapter.this.f40310e, R.anim.scale_reset));
            if (ForumBaseAdapter.this.f40320o != null) {
                Context context = view.getContext();
                if (com.join.mgps.Util.j0.Y0(context)) {
                    ForumBaseAdapter.this.f40320o.a(this.f40508b);
                    return;
                }
                com.join.mgps.Util.l2.a(context).b("用户未登录，请登录");
                com.join.mgps.Util.j0.L0(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40510b;

        p0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public FlowLayout f40512b;

        p1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public View f40515b;

        q0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q1 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40517b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f40518c;

        q1() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean f40520b;

        r(ForumBean forumBean) {
            this.f40520b = forumBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            if (com.join.mgps.Util.j0.Y0(context)) {
                if (ForumBaseAdapter.this.f40320o != null) {
                    ForumBaseAdapter.this.f40320o.b(this.f40520b);
                    return;
                }
                return;
            }
            com.join.mgps.Util.j0.L0(context);
            com.join.mgps.Util.l2.a(context).b(context.getString(R.string.forum_user_not_login));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f40522b;

        r0() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class r1 {

        /* renamed from: a  reason: collision with root package name */
        ViewType f40524a;

        /* renamed from: b  reason: collision with root package name */
        Object f40525b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public ForumBean.ForumWelcomeAdBean f40526a;

            public a() {
            }

            public a(ForumBean.ForumWelcomeAdBean forumWelcomeAdBean) {
                this.f40526a = forumWelcomeAdBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class a0 {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40527a;

            /* renamed from: b  reason: collision with root package name */
            public String f40528b;

            /* renamed from: c  reason: collision with root package name */
            public int f40529c;

            /* renamed from: d  reason: collision with root package name */
            public int f40530d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40531e;

            /* renamed from: f  reason: collision with root package name */
            public String f40532f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40533g;

            public a0() {
            }

            public a0(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f40527a = z4;
                this.f40528b = str;
                this.f40529c = i4;
                this.f40530d = i5;
                this.f40531e = z5;
                this.f40532f = str2;
                this.f40533g = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumTopicBean> f40534a;

            public b(List<ForumBean.ForumTopicBean> list) {
                this.f40534a = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class b0 {

            /* renamed from: a  reason: collision with root package name */
            public int f40535a;

            /* renamed from: b  reason: collision with root package name */
            public String f40536b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40537c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f40538d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40539e;

            /* renamed from: f  reason: collision with root package name */
            private List<ForumBean.ForumPostsBean.TagInfo> f40540f;

            public b0() {
            }

            public b0(int i4, String str, boolean z4, boolean z5, boolean z6, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f40535a = i4;
                this.f40536b = str;
                this.f40537c = z4;
                this.f40538d = z5;
                this.f40539e = z6;
                this.f40540f = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public String f40541a;

            /* renamed from: b  reason: collision with root package name */
            public String f40542b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40543c;

            /* renamed from: d  reason: collision with root package name */
            public int f40544d;

            /* renamed from: e  reason: collision with root package name */
            public String f40545e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f40546f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40547g;

            /* renamed from: h  reason: collision with root package name */
            public int f40548h;

            /* renamed from: i  reason: collision with root package name */
            public int f40549i;

            public c() {
            }

            public c(String str, String str2, boolean z4, int i4, String str3, boolean z5, boolean z6, int i5, int i6) {
                this.f40541a = str;
                this.f40542b = str2;
                this.f40543c = z4;
                this.f40544d = i4;
                this.f40545e = str3;
                this.f40546f = z5;
                this.f40547g = z6;
                this.f40548h = i5;
                this.f40549i = i6;
            }
        }

        /* loaded from: classes4.dex */
        public static class c0 {

            /* renamed from: a  reason: collision with root package name */
            public String f40550a;

            /* renamed from: b  reason: collision with root package name */
            public String f40551b;

            /* renamed from: c  reason: collision with root package name */
            public String f40552c;

            public c0(String str, String str2, String str3) {
                this.f40550a = str;
                this.f40551b = str2;
                this.f40552c = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f40553a;

            public d() {
            }

            public d(String str) {
                this.f40553a = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class d0 {

            /* renamed from: a  reason: collision with root package name */
            public String f40554a;

            /* renamed from: b  reason: collision with root package name */
            public String f40555b;

            /* renamed from: c  reason: collision with root package name */
            public String f40556c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f40557d;

            /* renamed from: e  reason: collision with root package name */
            public int f40558e;

            /* renamed from: f  reason: collision with root package name */
            public int f40559f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40560g;

            public d0(String str, String str2, String str3, boolean z4, int i4, int i5, boolean z5) {
                this.f40554a = str;
                this.f40555b = str2;
                this.f40556c = str3;
                this.f40557d = z4;
                this.f40558e = i4;
                this.f40559f = i5;
                this.f40560g = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class e {
        }

        /* loaded from: classes4.dex */
        public static class e0 {

            /* renamed from: a  reason: collision with root package name */
            public int f40561a;

            /* renamed from: b  reason: collision with root package name */
            public List<r1> f40562b;

            public e0(int i4, List<r1> list) {
                this.f40561a = i4;
                this.f40562b = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {
        }

        /* loaded from: classes4.dex */
        public static class f0 {

            /* renamed from: a  reason: collision with root package name */
            public int f40563a;

            /* renamed from: b  reason: collision with root package name */
            public String f40564b;

            /* renamed from: c  reason: collision with root package name */
            public List<RecommendLabelTag> f40565c;

            public f0() {
            }

            public f0(int i4, String str, List<RecommendLabelTag> list) {
                this.f40563a = i4;
                this.f40564b = str;
                this.f40565c = list;
            }

            public f0(List<RecommendLabelTag> list) {
                this.f40565c = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            ForumBean f40566a;

            /* renamed from: b  reason: collision with root package name */
            ForumBean f40567b;

            public g() {
            }

            public g(ForumBean forumBean, ForumBean forumBean2) {
                this.f40566a = forumBean;
                this.f40567b = forumBean2;
            }

            public g(ForumBean forumBean) {
                this.f40566a = forumBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class g0 {

            /* renamed from: a  reason: collision with root package name */
            public RecommendLabelTag f40568a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f40569b;

            public g0(RecommendLabelTag recommendLabelTag, boolean z4) {
                this.f40568a = recommendLabelTag;
                this.f40569b = z4;
            }
        }

        /* loaded from: classes4.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40570a;

            /* renamed from: b  reason: collision with root package name */
            public String f40571b;

            /* renamed from: c  reason: collision with root package name */
            public String f40572c;

            /* renamed from: d  reason: collision with root package name */
            public String f40573d;

            /* renamed from: e  reason: collision with root package name */
            public String f40574e;

            /* renamed from: f  reason: collision with root package name */
            public String f40575f;

            public h(boolean z4, String str, String str2, String str3, String str4, String str5) {
                this.f40570a = z4;
                this.f40571b = str;
                this.f40572c = str2;
                this.f40573d = str3;
                this.f40574e = str4;
                this.f40575f = str5;
            }
        }

        /* loaded from: classes4.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public ForumBean.ForumWelcomeAdBean f40576a;

            public i() {
            }

            public i(ForumBean.ForumWelcomeAdBean forumWelcomeAdBean) {
                this.f40576a = forumWelcomeAdBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            int f40577a;

            public j() {
            }

            public j(int i4) {
                this.f40577a = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class k {

            /* renamed from: a  reason: collision with root package name */
            public String f40578a;

            public k() {
            }

            public k(String str) {
                this.f40578a = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class l {

            /* renamed from: a  reason: collision with root package name */
            ForumBean f40579a;

            /* renamed from: b  reason: collision with root package name */
            boolean f40580b;

            public l() {
            }

            public l(ForumBean forumBean, boolean z4) {
                this.f40579a = forumBean;
                this.f40580b = z4;
            }
        }

        /* loaded from: classes4.dex */
        public static class m {

            /* renamed from: a  reason: collision with root package name */
            public int f40581a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f40582b;

            /* renamed from: c  reason: collision with root package name */
            public String f40583c;

            /* renamed from: d  reason: collision with root package name */
            public String f40584d;

            /* renamed from: e  reason: collision with root package name */
            public int f40585e;

            /* renamed from: f  reason: collision with root package name */
            public int f40586f;

            /* renamed from: g  reason: collision with root package name */
            public int f40587g;

            /* renamed from: h  reason: collision with root package name */
            public int f40588h;

            /* renamed from: i  reason: collision with root package name */
            public int f40589i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f40590j;

            /* renamed from: k  reason: collision with root package name */
            public String f40591k;

            public m() {
            }

            public m(String str, String str2, String str3, int i4, int i5, int i6, int i7, boolean z4, int i8) {
                this.f40591k = str;
                this.f40583c = str2;
                this.f40584d = str3;
                this.f40585e = i4;
                this.f40586f = i5;
                this.f40587g = i6;
                this.f40589i = i7;
                this.f40590j = z4;
                this.f40588h = i8;
            }

            public m(int i4, String str, String str2, String str3, int i5, int i6, int i7, int i8, boolean z4, int i9) {
                this.f40581a = i4;
                this.f40591k = str;
                this.f40583c = str2;
                this.f40584d = str3;
                this.f40585e = i5;
                this.f40586f = i6;
                this.f40587g = i7;
                this.f40589i = i8;
                this.f40590j = z4;
                this.f40588h = i9;
            }
        }

        /* loaded from: classes4.dex */
        public static class n {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f40592a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f40593b;

            /* renamed from: c  reason: collision with root package name */
            public int f40594c;

            public n(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f40592a = list;
                this.f40593b = list2;
                this.f40594c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class o implements com.join.android.app.component.optimizetext.c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40595a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f40596b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40597c;

            /* renamed from: d  reason: collision with root package name */
            public String f40598d;

            /* renamed from: e  reason: collision with root package name */
            public int f40599e;

            /* renamed from: f  reason: collision with root package name */
            public int f40600f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40601g;

            /* renamed from: h  reason: collision with root package name */
            public String f40602h;

            /* renamed from: i  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40603i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f40604j;

            /* renamed from: k  reason: collision with root package name */
            public SpannableStringBuilder f40605k;

            public o() {
            }

            @Override // com.join.android.app.component.optimizetext.c
            public SpannableStringBuilder a() {
                return this.f40605k;
            }

            @Override // com.join.android.app.component.optimizetext.c
            public String b() {
                return this.f40599e + "";
            }

            public o(boolean z4, boolean z5, boolean z6, String str, int i4, int i5, boolean z7, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, boolean z8, SpannableStringBuilder spannableStringBuilder) {
                this.f40595a = z4;
                this.f40596b = z5;
                this.f40597c = z6;
                this.f40598d = str;
                this.f40599e = i4;
                this.f40600f = i5;
                this.f40601g = z7;
                this.f40602h = str2;
                this.f40603i = list;
                this.f40604j = z8;
                this.f40605k = spannableStringBuilder;
            }
        }

        /* loaded from: classes4.dex */
        public static class p {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40606a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f40607b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f40608c;

            /* renamed from: d  reason: collision with root package name */
            public String f40609d;

            /* renamed from: e  reason: collision with root package name */
            public int f40610e;

            /* renamed from: f  reason: collision with root package name */
            public int f40611f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40612g;

            /* renamed from: h  reason: collision with root package name */
            public String f40613h;

            /* renamed from: i  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40614i;

            /* renamed from: j  reason: collision with root package name */
            public List<RecommendLabelTag> f40615j;

            /* renamed from: k  reason: collision with root package name */
            public String f40616k;

            /* renamed from: l  reason: collision with root package name */
            public int f40617l;

            public p() {
            }

            public p(boolean z4, boolean z5, boolean z6, String str, int i4, int i5, boolean z7, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, String str3, int i6) {
                this.f40606a = z4;
                this.f40607b = z5;
                this.f40608c = z6;
                this.f40609d = str;
                this.f40610e = i4;
                this.f40611f = i5;
                this.f40612g = z7;
                this.f40613h = str2;
                this.f40614i = list;
                this.f40615j = list2;
                this.f40616k = str3;
                this.f40617l = i6;
            }
        }

        /* loaded from: classes4.dex */
        public static class q {

            /* renamed from: a  reason: collision with root package name */
            public String f40618a;

            /* renamed from: b  reason: collision with root package name */
            public String f40619b;

            /* renamed from: c  reason: collision with root package name */
            public String f40620c;

            public q(String str, String str2, String str3) {
                this.f40618a = str;
                this.f40619b = str2;
                this.f40620c = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class r {

            /* renamed from: a  reason: collision with root package name */
            public String f40621a;

            /* renamed from: b  reason: collision with root package name */
            int f40622b;

            /* renamed from: c  reason: collision with root package name */
            List<String> f40623c;

            public r() {
            }

            public r(String str, int i4, List<String> list) {
                this.f40621a = str;
                this.f40622b = i4;
                this.f40623c = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class s {

            /* renamed from: a  reason: collision with root package name */
            public SpannableStringBuilder f40624a;

            public s() {
            }

            public s(SpannableStringBuilder spannableStringBuilder) {
                this.f40624a = spannableStringBuilder;
            }
        }

        /* loaded from: classes4.dex */
        public static class t {

            /* renamed from: a  reason: collision with root package name */
            public Spanned f40625a;

            public t(Spanned spanned) {
                this.f40625a = spanned;
            }
        }

        /* loaded from: classes4.dex */
        public static class u {

            /* renamed from: a  reason: collision with root package name */
            public String f40626a;

            /* renamed from: b  reason: collision with root package name */
            public String f40627b;

            /* renamed from: c  reason: collision with root package name */
            public String f40628c;

            public u(String str, String str2, String str3) {
                this.f40626a = str;
                this.f40627b = str2;
                this.f40628c = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class v {

            /* renamed from: a  reason: collision with root package name */
            public int f40629a;

            /* renamed from: b  reason: collision with root package name */
            public String f40630b;

            /* renamed from: c  reason: collision with root package name */
            public int f40631c;

            /* renamed from: d  reason: collision with root package name */
            public int f40632d;

            /* renamed from: e  reason: collision with root package name */
            public int f40633e;

            /* renamed from: f  reason: collision with root package name */
            public int f40634f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40635g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40636h;

            public v() {
            }

            public v(int i4, int i5, String str, int i6, int i7, int i8, boolean z4, boolean z5) {
                this.f40629a = i4;
                this.f40634f = i5;
                this.f40630b = str;
                this.f40631c = i6;
                this.f40632d = i7;
                this.f40633e = i8;
                this.f40635g = z4;
                this.f40636h = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class w {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40637a;

            /* renamed from: b  reason: collision with root package name */
            public String f40638b;

            /* renamed from: c  reason: collision with root package name */
            public ForumBean.GameInfo f40639c;

            /* renamed from: d  reason: collision with root package name */
            public String f40640d;

            public w(boolean z4, String str, ForumBean.GameInfo gameInfo, String str2) {
                this.f40637a = z4;
                this.f40638b = str;
                this.f40639c = gameInfo;
                this.f40640d = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class x {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40641a;

            /* renamed from: b  reason: collision with root package name */
            public String f40642b;

            /* renamed from: c  reason: collision with root package name */
            public String f40643c;

            /* renamed from: d  reason: collision with root package name */
            public long f40644d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40645e;

            /* renamed from: f  reason: collision with root package name */
            public int f40646f;

            /* renamed from: g  reason: collision with root package name */
            public int f40647g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40648h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f40649i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f40650j;

            /* renamed from: k  reason: collision with root package name */
            public int f40651k;

            /* renamed from: l  reason: collision with root package name */
            public int f40652l;

            /* renamed from: m  reason: collision with root package name */
            public int f40653m;

            /* renamed from: n  reason: collision with root package name */
            public String f40654n;

            /* renamed from: o  reason: collision with root package name */
            public String f40655o;

            public x() {
            }

            public x(boolean z4, String str, String str2, long j4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, int i6, int i7, String str3, String str4, int i8) {
                this.f40641a = z4;
                this.f40642b = str;
                this.f40643c = str2;
                this.f40644d = j4;
                this.f40645e = z5;
                this.f40646f = i4;
                this.f40647g = i5;
                this.f40653m = i8;
                this.f40648h = z6;
                this.f40649i = z7;
                this.f40650j = z8;
                this.f40651k = i6;
                this.f40652l = i7;
                this.f40655o = str3;
                this.f40654n = str4;
            }
        }

        /* loaded from: classes4.dex */
        public static class y {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f40656a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f40657b;

            /* renamed from: c  reason: collision with root package name */
            public int f40658c;

            public y(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f40656a = list;
                this.f40657b = list2;
                this.f40658c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class z implements com.join.android.app.component.optimizetext.c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40659a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f40660b;

            /* renamed from: c  reason: collision with root package name */
            public String f40661c;

            /* renamed from: d  reason: collision with root package name */
            public int f40662d;

            /* renamed from: e  reason: collision with root package name */
            public int f40663e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f40664f;

            /* renamed from: g  reason: collision with root package name */
            public String f40665g;

            /* renamed from: h  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f40666h;

            /* renamed from: i  reason: collision with root package name */
            public SpannableStringBuilder f40667i;

            public z() {
            }

            @Override // com.join.android.app.component.optimizetext.c
            public SpannableStringBuilder a() {
                return this.f40667i;
            }

            @Override // com.join.android.app.component.optimizetext.c
            public String b() {
                return this.f40662d + "";
            }

            public z(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, boolean z6, SpannableStringBuilder spannableStringBuilder) {
                this.f40660b = z4;
                this.f40661c = str;
                this.f40662d = i4;
                this.f40663e = i5;
                this.f40664f = z5;
                this.f40665g = str2;
                this.f40666h = list;
                this.f40659a = z6;
                this.f40667i = spannableStringBuilder;
            }
        }

        public r1() {
        }

        public <T> T a() {
            return (T) this.f40525b;
        }

        public ViewType b() {
            return this.f40524a;
        }

        public void c(Object obj) {
            this.f40525b = obj;
        }

        public void d(ViewType viewType) {
            this.f40524a = viewType;
        }

        public r1(ViewType viewType, Object obj) {
            this.f40524a = viewType;
            this.f40525b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean f40668b;

        s(ForumBean forumBean) {
            this.f40668b = forumBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            if (com.join.mgps.Util.j0.Y0(context)) {
                if (ForumBaseAdapter.this.f40320o != null) {
                    ForumBaseAdapter.this.f40320o.j(this.f40668b);
                    return;
                }
                return;
            }
            com.join.mgps.Util.j0.L0(context);
            com.join.mgps.Util.l2.a(context).b(context.getString(R.string.forum_user_not_login));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public View f40670b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f40671c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40672d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40673e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f40674f;

        /* renamed from: g  reason: collision with root package name */
        public Button f40675g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f40676h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f40677i;

        s0() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class s1 {
        s1() {
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40680b;

        t(String str) {
            this.f40680b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f40680b);
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.c(parseInt);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface t0 {
        void a(int i4);

        void b(ForumBean forumBean);

        void c(int i4);

        void d(int i4);

        void e(String str);

        void f(ForumBean forumBean);

        void g(int i4);

        void h(String str);

        void i(RecommendLabelTag recommendLabelTag);

        void j(ForumBean forumBean);

        void k();

        void l();

        void m(int i4);

        void n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40682b;

        u(int i4) {
            this.f40682b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.m(this.f40682b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class u0 {

        /* renamed from: a  reason: collision with root package name */
        public int f40684a;

        /* renamed from: b  reason: collision with root package name */
        public int f40685b;

        public u0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40687b;

        v(int i4) {
            this.f40687b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(this.f40687b);
            com.join.mgps.Util.j0.v0(view.getContext(), forumPostsBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v0 extends h0 {

        /* renamed from: j  reason: collision with root package name */
        public View f40689j;

        v0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendLabelTag f40691b;

        w(RecommendLabelTag recommendLabelTag) {
            this.f40691b = recommendLabelTag;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.i(this.f40691b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f40693b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f40694c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f40695d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40696e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f40697f;

        /* renamed from: g  reason: collision with root package name */
        public View f40698g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f40699h;

        w0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40701b;

        x(int i4) {
            this.f40701b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goForumGroupActivity(view.getContext(), this.f40701b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public View f40703b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40704c;

        x0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendLabelTag f40706b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40707c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40708d;

        y(RecommendLabelTag recommendLabelTag, int i4, String str) {
            this.f40706b = recommendLabelTag;
            this.f40707c = i4;
            this.f40708d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f40706b.getTag_id() == -1) {
                IntentUtil intentUtil = IntentUtil.getInstance();
                Context context = view.getContext();
                String str = "";
                if (this.f40707c != 0) {
                    str = this.f40707c + "";
                }
                intentUtil.goLabelGroupActivity(context, str);
                return;
            }
            IntentUtil.getInstance().goMainLabelActivity(view.getContext(), this.f40706b.getTag_id(), this.f40707c, this.f40708d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f40710b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40711c;

        y0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40713b;

        z(int i4) {
            this.f40713b = i4;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TextView textView = (TextView) view;
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
            int action = motionEvent.getAction();
            boolean z4 = false;
            if (action == 1 || action == 0) {
                int x4 = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                int y2 = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                int scrollX = x4 + textView.getScrollX();
                int scrollY = y2 + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        clickableSpanArr[0].onClick(textView);
                    }
                    z4 = true;
                }
            }
            if (action == 1 && !z4 && ForumBaseAdapter.this.f40320o != null) {
                ForumBaseAdapter.this.f40320o.d(this.f40713b);
            }
            return z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z0 extends s1 {

        /* renamed from: b  reason: collision with root package name */
        public View f40715b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f40716c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40717d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40718e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f40719f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f40720g;

        /* renamed from: h  reason: collision with root package name */
        public Button f40721h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f40722i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f40723j;

        z0() {
            super();
        }
    }

    public ForumBaseAdapter(Context context, com.join.android.app.component.video.c cVar) {
        this.f40310e = context;
        this.f40312g = cVar;
        this.f40307b = new com.join.android.app.component.optimizetext.b(context);
        this.f40308c = c0(this.f40310e);
        m();
        i0();
    }

    private View B(int i4, View view, ViewGroup viewGroup) {
        v0 v0Var;
        View inflate;
        r1.i iVar;
        if (view != null) {
            v0Var = (v0) view.getTag();
            inflate = view;
        } else {
            v0Var = new v0();
            inflate = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_live_entry, (ViewGroup) null);
            v0Var.f40689j = inflate.findViewById(R.id.forum_ad_container);
            v0Var.f40407b = (TextView) inflate.findViewById(R.id.forum_ad_title);
            v0Var.f40408c = (SimpleDraweeView) inflate.findViewById(R.id.layout_forum_ad_1);
            v0Var.f40409d = (SimpleDraweeView) inflate.findViewById(R.id.layout_forum_ad_2);
            v0Var.f40410e = (SimpleDraweeView) inflate.findViewById(R.id.layout_forum_ad_3);
            v0Var.f40411f = (SimpleDraweeView) inflate.findViewById(R.id.layout_forum_ad_4);
            inflate.setTag(v0Var);
        }
        v0 v0Var2 = v0Var;
        try {
            iVar = (r1.i) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (iVar != null && iVar.f40576a != null) {
            SimpleDraweeView[] simpleDraweeViewArr = {v0Var2.f40408c, v0Var2.f40409d, v0Var2.f40410e, v0Var2.f40411f};
            for (int i5 = 0; i5 < 4; i5++) {
                simpleDraweeViewArr[i5].setVisibility(8);
            }
            for (int i6 = 0; iVar.f40576a.getAdBeans() != null && i6 < iVar.f40576a.getAdBeans().size(); i6++) {
                BannerBean bannerBean = iVar.f40576a.getAdBeans().get(i6);
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i6];
                simpleDraweeView.setVisibility(0);
                MyImageLoader.h(simpleDraweeView, bannerBean.getPic_remote());
                float f5 = this.f40310e.getResources().getDisplayMetrics().density;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) simpleDraweeView.getLayoutParams();
                int i7 = ((int) (this.f40310e.getResources().getDisplayMetrics().widthPixels - (f5 * 18.0f))) / 2;
                layoutParams.width = i7;
                layoutParams.height = (int) ((i7 * 1.0f) / 2.07f);
                simpleDraweeView.setLayoutParams(layoutParams);
                IntentDateBean j02 = com.join.mgps.Util.j0.j0(bannerBean);
                ExtBean extBean = new ExtBean();
                extBean.setFrom("forum");
                extBean.setPosition("banner2" + (i4 + 1));
                j02.setExtBean(extBean);
                simpleDraweeView.setOnClickListener(new b(j02, i6));
                if (i6 == 1 || i6 == 3) {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(simpleDraweeView.getLayoutParams().width, simpleDraweeView.getLayoutParams().height);
                    layoutParams2.setMargins((int) (simpleDraweeView.getResources().getDisplayMetrics().density * 6.0f), 0, 0, 0);
                    simpleDraweeView.setLayoutParams(layoutParams2);
                }
                if (iVar.f40576a.getAdBeans().size() == 1) {
                    try {
                        v0Var2.f40689j.setPadding(0, this.f40310e.getResources().getDimensionPixelOffset(R.dimen.mg_forum_item_divider), 0, 0);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) simpleDraweeView.getLayoutParams();
                        layoutParams3.width = -1;
                        layoutParams3.height = A();
                        layoutParams3.setMargins(0, 0, 0, 0);
                        simpleDraweeView.setLayoutParams(layoutParams3);
                        simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
            if (iVar.f40576a.getAdBeans() == null) {
                inflate.setVisibility(8);
            } else if (iVar.f40576a.getAdBeans().size() < 1) {
                inflate.setVisibility(8);
            } else if (iVar.f40576a.getAdBeans().size() < 3) {
                ViewGroup viewGroup2 = (ViewGroup) simpleDraweeViewArr[2].getParent();
                viewGroup2.setVisibility(8);
                ((LinearLayout.LayoutParams) viewGroup2.getLayoutParams()).topMargin = 0;
            }
            return inflate;
        }
        return inflate;
    }

    private View C(int i4, View view, ViewGroup viewGroup) {
        return view;
    }

    private View D(int i4, View view, ViewGroup viewGroup) {
        h0 h0Var;
        r1.a aVar;
        if (view != null) {
            h0Var = (h0) view.getTag();
        } else {
            h0Var = new h0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_ad_block, (ViewGroup) null);
            h0Var.f40407b = (TextView) view.findViewById(R.id.forum_ad_title);
            h0Var.f40408c = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_1);
            h0Var.f40409d = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_2);
            h0Var.f40410e = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_3);
            h0Var.f40411f = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_4);
            view.setTag(h0Var);
        }
        try {
            aVar = (r1.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar != null && aVar.f40526a != null) {
            SimpleDraweeView[] simpleDraweeViewArr = {h0Var.f40408c, h0Var.f40409d, h0Var.f40410e, h0Var.f40411f};
            for (int i5 = 0; aVar.f40526a.getAdBeans() != null && i5 < aVar.f40526a.getAdBeans().size(); i5++) {
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i5];
                J0(simpleDraweeView, aVar.f40526a.getAdBeans().get(i5), i5);
                if (i5 == 1 || i5 == 3) {
                    try {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(simpleDraweeView.getLayoutParams().width, simpleDraweeView.getLayoutParams().height);
                        layoutParams.setMargins((int) (simpleDraweeView.getResources().getDisplayMetrics().density * 6.0f), 0, 0, 0);
                        simpleDraweeView.setLayoutParams(layoutParams);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
            if (aVar.f40526a.getAdBeans() == null) {
                view.setVisibility(8);
            } else if (aVar.f40526a.getAdBeans().size() < 2) {
                view.setVisibility(8);
            } else if (aVar.f40526a.getAdBeans().size() < 4) {
                ViewGroup viewGroup2 = (ViewGroup) simpleDraweeViewArr[2].getParent();
                viewGroup2.setVisibility(8);
                ((LinearLayout.LayoutParams) viewGroup2.getLayoutParams()).topMargin = 0;
            }
            return view;
        }
        return view;
    }

    private void D0(View view, String str) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new j(str));
    }

    private View E(int i4, View view, ViewGroup viewGroup) {
        x0 x0Var;
        if (view != null) {
            x0Var = (x0) view.getTag();
        } else {
            x0Var = new x0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_my_forum_footer, (ViewGroup) null);
            x0Var.f40704c = (TextView) view.findViewById(R.id.my_forum_count_tv);
            view.setTag(x0Var);
        }
        try {
            TextView textView = x0Var.f40704c;
            Resources resources = this.f40310e.getResources();
            textView.setText(resources.getString(R.string.my_forum_count, ((r1.j) getItem(i4)).f40577a + ""));
            V0(view);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View F(int i4, View view, ViewGroup viewGroup) {
        y0 y0Var;
        try {
            if (view != null) {
                y0Var = (y0) view.getTag();
            } else {
                y0Var = new y0();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_my_forum_header, (ViewGroup) null);
                y0Var.f40710b = (LinearLayout) view.findViewById(R.id.forumMore);
                y0Var.f40711c = (TextView) view.findViewById(R.id.sectionTitle);
                view.setTag(y0Var);
            }
            r1.k kVar = (r1.k) getItem(i4);
            if (kVar != null && com.join.mgps.Util.g2.i(kVar.f40578a)) {
                y0Var.f40711c.setText(kVar.f40578a);
            } else if (com.join.mgps.Util.j0.Y0(this.f40310e)) {
                y0Var.f40711c.setText("我的专区");
            } else {
                y0Var.f40711c.setText("推荐关注");
            }
            if (y0Var.f40710b != null) {
                P0(view);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View G(int i4, View view, ViewGroup viewGroup) {
        z0 z0Var;
        r1.l lVar;
        if (view != null) {
            z0Var = (z0) view.getTag();
        } else {
            z0Var = new z0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_hot_forum_item, (ViewGroup) null);
            View findViewById = view.findViewById(R.id.mg_forum_item);
            z0Var.f40715b = findViewById;
            z0Var.f40716c = (SimpleDraweeView) findViewById.findViewById(R.id.forum_icon);
            z0Var.f40717d = (TextView) z0Var.f40715b.findViewById(R.id.forum_name);
            z0Var.f40723j = (TextView) z0Var.f40715b.findViewById(R.id.forum_desc);
            z0Var.f40721h = (Button) z0Var.f40715b.findViewById(R.id.forum_follow);
            z0Var.f40720g = (LinearLayout) z0Var.f40715b.findViewById(R.id.forum_follow_layout);
            z0Var.f40722i = (TextView) z0Var.f40715b.findViewById(R.id.forum_today_posts_tv);
            view.setTag(z0Var);
        }
        try {
            lVar = (r1.l) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (lVar == null) {
            return view;
        }
        ForumBean forumBean = lVar.f40579a;
        MyImageLoader.j(z0Var.f40716c, forumBean.getIcon_src(), MyImageLoader.B(this.f40310e));
        TextView textView = z0Var.f40717d;
        com.join.mgps.Util.j0.D1(textView, forumBean.getName() + "", "");
        com.join.mgps.Util.j0.D1(z0Var.f40723j, forumBean.getDescription(), "");
        O0(z0Var.f40715b, forumBean);
        Resources resources = z0Var.f40722i.getResources();
        TextView textView2 = z0Var.f40722i;
        com.join.mgps.Util.j0.D1(textView2, resources.getString(R.string.forum_info_today_posts, forumBean.getToday_posts() + ""), "今日 0");
        if (lVar.f40580b) {
            if (forumBean.is_follow()) {
                z0Var.f40720g.setVisibility(8);
            } else {
                z0Var.f40720g.setVisibility(0);
            }
        } else {
            z0Var.f40720g.setVisibility(8);
        }
        M0(z0Var.f40721h, lVar.f40579a);
        return view;
    }

    private View H(int i4, View view, ViewGroup viewGroup) {
        a1 a1Var;
        if (view != null) {
            a1Var = (a1) view.getTag();
        } else {
            a1Var = new a1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_my_forum_more_footer, (ViewGroup) null);
            a1Var.f40338b = view.findViewById(R.id.forums_hot_item_forum_all);
            view.setTag(a1Var);
        }
        try {
            if (a1Var.f40338b != null) {
                P0(view);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View I(int i4, View view, ViewGroup viewGroup) {
        r1.m mVar;
        c1 c1Var = null;
        if (view != null) {
            if (view.getTag() instanceof c1) {
                c1Var = (c1) view.getTag();
            }
        } else {
            c1 c1Var2 = new c1();
            View inflate = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_f_item_post_footer, (ViewGroup) null);
            c1Var2.f40358j = (SimpleDraweeView) inflate.findViewById(R.id.avatar);
            c1Var2.f40355g = inflate.findViewById(R.id.indicator);
            c1Var2.f40350b = (TextView) inflate.findViewById(R.id.groupName);
            c1Var2.f40351c = (TextView) inflate.findViewById(R.id.hostName);
            c1Var2.f40352d = (TextView) inflate.findViewById(R.id.likeCount);
            c1Var2.f40353e = (TextView) inflate.findViewById(R.id.commentCount);
            c1Var2.f40356h = (TextView) inflate.findViewById(R.id.forum_post_view);
            c1Var2.f40357i = (ImageView) inflate.findViewById(R.id.forum_post_praise_icon);
            c1Var2.f40354f = inflate.findViewById(R.id.divider);
            inflate.setTag(c1Var2);
            c1Var = c1Var2;
            view = inflate;
        }
        try {
            mVar = (r1.m) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (mVar != null && c1Var != null) {
            if (mVar.f40582b) {
                c1Var.f40354f.setVisibility(0);
            } else {
                c1Var.f40354f.setVisibility(8);
            }
            if (mVar.f40581a == 0) {
                if (c1Var.f40355g.getVisibility() != 0) {
                    c1Var.f40355g.setVisibility(0);
                }
            } else if (c1Var.f40355g.getVisibility() != 8) {
                c1Var.f40355g.setVisibility(8);
            }
            c1Var.f40350b.setText(mVar.f40583c);
            c1Var.f40351c.setText(mVar.f40584d);
            TextView textView = c1Var.f40352d;
            textView.setText(com.join.mgps.Util.j0.R(mVar.f40585e) + "");
            TextView textView2 = c1Var.f40353e;
            textView2.setText(com.join.mgps.Util.j0.R(mVar.f40586f) + "");
            TextView textView3 = c1Var.f40356h;
            textView3.setText(com.join.mgps.Util.j0.R(mVar.f40589i) + "");
            MyImageLoader.x(c1Var.f40358j, mVar.f40591k);
            c1Var.f40358j.setOnClickListener(new c0(mVar));
            R0(view, mVar.f40587g);
            q0(c1Var, mVar.f40590j, mVar.f40585e, mVar.f40587g);
            return view;
        }
        return view;
    }

    private View J(int i4, View view, ViewGroup viewGroup) {
        View view2;
        d1 d1Var;
        r1.n nVar;
        try {
            if (view != null) {
                d1Var = view.getTag() instanceof d1 ? (d1) view.getTag() : null;
                view2 = view;
            } else {
                d1 d1Var2 = new d1();
                View inflate = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_f_item_post_imgs, (ViewGroup) null);
                try {
                    d1Var2.f40365b = inflate.findViewById(R.id.spaceT);
                    d1Var2.f40366c = inflate.findViewById(R.id.imgsMain);
                    d1Var2.f40367d = (SimpleDraweeView) inflate.findViewById(R.id.img_m_1);
                    d1Var2.f40368e = (SimpleDraweeView) inflate.findViewById(R.id.img_m_2);
                    d1Var2.f40369f = (SimpleDraweeView) inflate.findViewById(R.id.img_m_3);
                    d1Var2.f40370g = (TextView) inflate.findViewById(R.id.images_count);
                    inflate.setTag(d1Var2);
                    d1Var = d1Var2;
                    view2 = inflate;
                } catch (Exception e5) {
                    e = e5;
                    view2 = inflate;
                    e.printStackTrace();
                    return view2;
                }
            }
        } catch (Exception e6) {
            e = e6;
            view2 = view;
        }
        try {
            nVar = (r1.n) getItem(i4);
        } catch (Exception e7) {
            e = e7;
            e.printStackTrace();
            return view2;
        }
        if (nVar != null && d1Var != null) {
            List<ForumBean.ForumPostsBean.ResBean> list = nVar.f40592a;
            if (list != null && list.size() != 0) {
                view2.setVisibility(0);
                List<String> list2 = nVar.f40593b;
                TextView textView = d1Var.f40370g;
                int size = list2 != null ? list2.size() : 0;
                if (size > 3) {
                    textView.setVisibility(0);
                    textView.setText("共" + list2.size() + "张");
                } else {
                    textView.setVisibility(8);
                }
                if (this.f40317l == null) {
                    this.f40317l = g0();
                }
                int i5 = 1;
                SimpleDraweeView[] simpleDraweeViewArr = {d1Var.f40367d, d1Var.f40368e, d1Var.f40369f};
                int i6 = 0;
                int i7 = 0;
                while (i6 < 3) {
                    SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i6];
                    if (i6 >= nVar.f40592a.size()) {
                        simpleDraweeView.setVisibility(8);
                    } else {
                        simpleDraweeView.setVisibility(0);
                        ForumBean.ForumPostsBean.ResBean resBean = nVar.f40592a.get(i6);
                        if (resBean.getType().equals("pic")) {
                            String thumb = resBean.getThumb();
                            Integer[] i02 = com.join.mgps.Util.j0.i0(thumb);
                            if (i6 == 0 && size == i5 && i02 != null && i02[0].intValue() != 0 && i02[i5].intValue() != 0) {
                                E0(simpleDraweeView, i6, thumb, i6 - i7, list2);
                            } else {
                                F0(simpleDraweeView, i6, thumb, i6 - i7, list2);
                            }
                        } else if (resBean.getType().equals("video")) {
                            i7++;
                            g1(simpleDraweeView, i6, resBean.getThumb(), resBean.getRaw());
                        }
                    }
                    i6++;
                    i5 = 1;
                }
                R0(view2, nVar.f40594c);
                return view2;
            }
            view2.setVisibility(8);
        }
        return view2;
    }

    private void J0(SimpleDraweeView simpleDraweeView, BannerBean bannerBean, int i4) {
        if (bannerBean == null || simpleDraweeView == null) {
            return;
        }
        simpleDraweeView.setVisibility(0);
        MyImageLoader.j(simpleDraweeView, bannerBean.getPic_remote(), MyImageLoader.z(simpleDraweeView.getContext()));
        if (this.f40319n == null) {
            float f5 = this.f40310e.getResources().getDisplayMetrics().density;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) simpleDraweeView.getLayoutParams();
            int i5 = ((int) (this.f40310e.getResources().getDisplayMetrics().widthPixels - (f5 * 18.0f))) / 2;
            layoutParams.width = i5;
            layoutParams.height = (int) ((i5 * 1.0f) / 2.07f);
            this.f40319n = layoutParams;
        }
        simpleDraweeView.setLayoutParams(this.f40319n);
        IntentDateBean j02 = com.join.mgps.Util.j0.j0(bannerBean);
        ExtBean extBean = new ExtBean();
        extBean.setFrom("forum");
        extBean.setPosition("banner2" + (i4 + 1));
        j02.setExtBean(extBean);
        simpleDraweeView.setOnClickListener(new i(j02, i4));
    }

    private View K(int i4, View view, ViewGroup viewGroup) {
        r1.o oVar;
        e1 e1Var = null;
        try {
            if (view != null) {
                if (view.getTag() instanceof e1) {
                    e1Var = (e1) view.getTag();
                }
            } else {
                e1 e1Var2 = new e1();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_f_item_post_message, (ViewGroup) null);
                e1Var2.f40376b = (StaticLayoutView) view.findViewById(R.id.msg);
                e1Var2.f40377c = view.findViewById(R.id.divider);
                e1Var2.f40378d = view.findViewById(R.id.spaceT);
                view.setTag(e1Var2);
                e1Var = e1Var2;
            }
            oVar = (r1.o) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (oVar != null && e1Var != null) {
            com.join.android.app.component.optimizetext.b bVar = this.f40307b;
            if (bVar.d(oVar.f40599e + "") == null) {
                this.f40307b.e(oVar);
            }
            StaticLayoutView staticLayoutView = e1Var.f40376b;
            com.join.android.app.component.optimizetext.b bVar2 = this.f40307b;
            staticLayoutView.setLayout(bVar2.d(oVar.f40599e + ""));
            com.join.mgps.Util.j0.X0(e1Var.f40376b);
            if (oVar.f40595a) {
                e1Var.f40377c.setVisibility(0);
                e1Var.f40378d.setVisibility(0);
            } else {
                e1Var.f40377c.setVisibility(8);
                e1Var.f40378d.setVisibility(8);
            }
            R0(view, oVar.f40599e);
            return view;
        }
        return view;
    }

    private View L(int i4, View view, ViewGroup viewGroup) {
        r1.q qVar;
        f1 f1Var = null;
        try {
            if (view != null) {
                if (view.getTag() instanceof f1) {
                    f1Var = (f1) view.getTag();
                }
            } else {
                f1 f1Var2 = new f1();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_f_item_post_video, (ViewGroup) null);
                f1Var2.f40385b = (FrameLayout) view.findViewById(R.id.videoContner);
                f1Var2.f40386c = (SimpleDraweeView) view.findViewById(R.id.bannerView);
                view.setTag(f1Var2);
                f1Var = f1Var2;
            }
            qVar = (r1.q) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (qVar != null && f1Var != null) {
            String str = qVar.f40619b;
            String str2 = qVar.f40618a;
            if (f1Var.f40385b != null) {
                f1Var.f40385b.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f40326u));
                MyImageLoader.d(f1Var.f40386c, R.drawable.video_bg, str2);
                int i5 = i4 + 1;
                if (!this.f40312g.B().startsWith("ForumGroupPostsFragment") && !this.f40312g.B().startsWith("ForumGroupMemberActivity") && !this.f40312g.B().startsWith("LabelFragment") && !this.f40312g.B().startsWith("ForumPostsFragment")) {
                    i4 = i5;
                }
                f1Var.f40386c.setTag(Integer.valueOf(i4));
                if (com.join.mgps.Util.g2.i(str)) {
                    this.f40312g.e(i4, new c.l(i4, str, str2), new boolean[0]);
                }
                f1Var.f40386c.setOnClickListener(new e0(i4));
            }
            return view;
        }
        return view;
    }

    private View P(int i4, View view, ViewGroup viewGroup) {
        g1 g1Var;
        r1.v vVar;
        if (view != null) {
            g1Var = (g1) view.getTag();
        } else {
            g1Var = new g1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_post_footer, (ViewGroup) null);
            g1Var.f40396b = (TextView) view.findViewById(R.id.forum_name);
            g1Var.f40397c = (TextView) view.findViewById(R.id.forum_post_view);
            g1Var.f40398d = (TextView) view.findViewById(R.id.forum_post_commit);
            g1Var.f40399e = (TextView) view.findViewById(R.id.forum_post_praise);
            g1Var.f40402h = (ImageView) view.findViewById(R.id.forum_post_praise_icon);
            g1Var.f40400f = view.findViewById(R.id.post_footer_divider);
            g1Var.f40401g = view.findViewById(R.id.forum_name_parent);
            view.setTag(g1Var);
        }
        try {
            vVar = (r1.v) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (vVar == null) {
            return view;
        }
        if (vVar.f40636h) {
            g1Var.f40400f.setVisibility(0);
        } else {
            g1Var.f40400f.setVisibility(8);
        }
        g1Var.f40396b.setText(vVar.f40630b);
        if (com.join.mgps.Util.g2.h(vVar.f40630b)) {
            g1Var.f40401g.setVisibility(8);
        } else {
            g1Var.f40401g.setVisibility(0);
        }
        TextView textView = g1Var.f40397c;
        com.join.mgps.Util.j0.D1(textView, vVar.f40631c + "", "0");
        TextView textView2 = g1Var.f40398d;
        com.join.mgps.Util.j0.D1(textView2, vVar.f40632d + "", "0");
        r0(g1Var, vVar.f40635g, vVar.f40633e);
        int i5 = vVar.f40629a;
        ((View) g1Var.f40399e.getParent()).setOnClickListener(new b0(i5));
        R0(view, i5);
        int i6 = vVar.f40634f;
        ForumBean forumBean = new ForumBean();
        forumBean.setFid(i6);
        O0((View) g1Var.f40396b.getParent(), forumBean);
        T0((View) g1Var.f40399e.getParent(), i5, vVar.f40635g, vVar.f40633e);
        return view;
    }

    private View Q(int i4, View view, ViewGroup viewGroup) {
        final r1.w wVar;
        h1 h1Var = null;
        try {
            if (view != null) {
                if (view.getTag() instanceof h1) {
                    h1Var = (h1) view.getTag();
                }
            } else {
                h1 h1Var2 = new h1();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_post_activity_item_post_game_res_link, (ViewGroup) null);
                h1Var2.f40415b = (SimpleDraweeView) view.findViewById(R.id.mgListviewItemIcon);
                h1Var2.f40416c = (TextView) view.findViewById(R.id.mgListviewItemAppname);
                h1Var2.f40417d = (Button) view.findViewById(R.id.mgListviewItemInstall);
                h1Var2.f40418e = (TextView) view.findViewById(R.id.mgListviewItemSize);
                h1Var2.f40419f = (TextView) view.findViewById(R.id.mgListviewItemDescribe);
                h1Var2.f40420g = (LinearLayout) view.findViewById(R.id.linearLayout2);
                h1Var2.f40421h = (LinearLayout) view.findViewById(R.id.tipsLayout);
                h1Var2.f40422i = (TextView) view.findViewById(R.id.appSize);
                h1Var2.f40423j = (TextView) view.findViewById(R.id.loding_info);
                h1Var2.f40424k = (ProgressBar) view.findViewById(R.id.progressBar);
                h1Var2.f40425l = (ProgressBar) view.findViewById(R.id.progressBarZip);
                h1Var2.f40426m = view.findViewById(R.id.line);
                h1Var2.f40427n = view.findViewById(R.id.relateLayoutApp);
                h1Var2.f40428o = view.findViewById(R.id.divider);
                view.setTag(h1Var2);
                h1Var = h1Var2;
            }
            wVar = (r1.w) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (wVar != null && h1Var != null) {
            ForumBean.GameInfo gameInfo = wVar.f40639c;
            gameInfo.getGame_id();
            if (wVar.f40637a) {
                if (h1Var.f40428o.getVisibility() != 0) {
                    h1Var.f40428o.setVisibility(0);
                }
            } else if (h1Var.f40428o.getVisibility() != 8) {
                h1Var.f40428o.setVisibility(8);
            }
            h1Var.f40417d.setBackgroundResource(R.drawable.detial_fourm_butn_selector1);
            int dimensionPixelSize = this.f40310e.getResources().getDimensionPixelSize(R.dimen.forum_posts_activity_gameinfo_download_width);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) h1Var.f40417d.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            h1Var.f40417d.setLayoutParams(layoutParams);
            h1Var.f40417d.setText("打开");
            h1Var.f40416c.setText(gameInfo.getGame_name());
            MyImageLoader.j(h1Var.f40415b, gameInfo.getGame_ico_remote(), MyImageLoader.A(this.f40310e));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.join.mgps.adapter.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ForumBaseAdapter.this.n0(wVar, view2);
                }
            };
            h1Var.f40417d.setOnClickListener(onClickListener);
            h1Var.f40427n.setOnClickListener(onClickListener);
            return view;
        }
        return view;
    }

    private void Q0(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new x(i4));
    }

    private View R(int i4, View view, ViewGroup viewGroup) {
        View view2;
        h1 h1Var;
        r1.w wVar;
        try {
            if (view != null) {
                h1Var = view.getTag() instanceof h1 ? (h1) view.getTag() : null;
                view2 = view;
            } else {
                h1 h1Var2 = new h1();
                View inflate = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_post_activity_item_post_game, (ViewGroup) null);
                try {
                    h1Var2.f40415b = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
                    h1Var2.f40416c = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
                    h1Var2.f40417d = (Button) inflate.findViewById(R.id.mgListviewItemInstall);
                    h1Var2.f40418e = (TextView) inflate.findViewById(R.id.mgListviewItemSize);
                    h1Var2.f40419f = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
                    h1Var2.f40420g = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
                    h1Var2.f40421h = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
                    h1Var2.f40422i = (TextView) inflate.findViewById(R.id.appSize);
                    h1Var2.f40423j = (TextView) inflate.findViewById(R.id.loding_info);
                    h1Var2.f40424k = (ProgressBar) inflate.findViewById(R.id.progressBar);
                    h1Var2.f40425l = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
                    h1Var2.f40426m = inflate.findViewById(R.id.line);
                    h1Var2.f40427n = inflate.findViewById(R.id.relateLayoutApp);
                    h1Var2.f40428o = inflate.findViewById(R.id.divider);
                    inflate.setTag(h1Var2);
                    h1Var = h1Var2;
                    view2 = inflate;
                } catch (Exception e5) {
                    e = e5;
                    view2 = inflate;
                    e.printStackTrace();
                    return view2;
                }
            }
            try {
                wVar = (r1.w) getItem(i4);
            } catch (Exception e6) {
                e = e6;
                e.printStackTrace();
                return view2;
            }
        } catch (Exception e7) {
            e = e7;
            view2 = view;
        }
        if (wVar != null && h1Var != null) {
            ForumBean.GameInfo gameInfo = wVar.f40639c;
            String str = wVar.f40638b;
            String game_id = gameInfo.getGame_id();
            if (wVar.f40637a) {
                if (h1Var.f40428o.getVisibility() != 0) {
                    h1Var.f40428o.setVisibility(0);
                }
            } else if (h1Var.f40428o.getVisibility() != 8) {
                h1Var.f40428o.setVisibility(8);
            }
            h1Var.f40417d.setBackgroundResource(R.drawable.detial_fourm_butn_selector1);
            int dimensionPixelSize = this.f40310e.getResources().getDimensionPixelSize(R.dimen.forum_posts_activity_gameinfo_download_width);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) h1Var.f40417d.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            h1Var.f40417d.setLayoutParams(layoutParams);
            h1Var.f40416c.setText(gameInfo.getGame_name());
            h1Var.f40419f.setText(gameInfo.getGame_desc());
            String game_size = gameInfo.getGame_size();
            MyImageLoader.j(h1Var.f40415b, gameInfo.getGame_ico_remote(), MyImageLoader.A(this.f40310e));
            List<ForumBean.GameInfo.GameTagInfo> game_tag_info = gameInfo.getGame_tag_info();
            h1(h1Var, 0);
            DownloadTask downloadTask = gameInfo.getDownloadTask();
            if (downloadTask != null) {
                if (gameInfo.getPay_tag_info() != null) {
                    downloadTask.setPay_game_amount(gameInfo.getPay_tag_info().getPay_game_amount());
                }
                B0(h1Var, downloadTask);
            } else {
                if (UtilsMy.w0(gameInfo.getPay_tag_info(), gameInfo.getGame_id()) > 0) {
                    A0(h1Var.f40417d, gameInfo.getPay_tag_info().getPay_game_amount());
                } else {
                    z0(h1Var.f40417d, gameInfo.getDown_status());
                }
                h1Var.f40417d.setOnClickListener(new g0(gameInfo, downloadTask, str, game_id));
            }
            if ((ConstantIntEnum.H5.value() + "").equals(gameInfo.getPlugin_num())) {
                h1Var.f40421h.setVisibility(8);
                h1Var.f40417d.setBackgroundResource(R.drawable.recom_blue_butn);
                h1Var.f40417d.setText("开始");
                h1Var.f40417d.setTextColor(this.f40310e.getResources().getColor(R.color.app_blue_color));
            } else {
                h1Var.f40421h.setVisibility(0);
                com.join.mgps.Util.j0.c(game_tag_info, h1Var.f40421h, this.f40310e);
                UtilsMy.I(gameInfo.getScore(), gameInfo.getDown_count(), game_size, gameInfo.getSp_tag_info(), null, h1Var.f40421h, this.f40310e);
                UtilsMy.j3(gameInfo.getSp_tag_info(), view2, gameInfo.getDownloadTask());
            }
            h1Var.f40427n.setOnClickListener(new a(str, game_id, gameInfo));
            return view2;
        }
        return view2;
    }

    private View S(int i4, View view, ViewGroup viewGroup) {
        i1 i1Var;
        r1.x xVar;
        if (view != null) {
            i1Var = (i1) view.getTag();
        } else {
            i1Var = new i1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_post_header, (ViewGroup) null);
            i1Var.f40440f = view.findViewById(R.id.forum_post_divider);
            i1Var.f40436b = (SimpleDraweeView) view.findViewById(R.id.forum_post_avatar_src);
            i1Var.f40437c = (TextView) view.findViewById(R.id.forum_post_nickname);
            i1Var.f40438d = (TextView) view.findViewById(R.id.forum_post_add_time);
            i1Var.f40439e = (TextView) view.findViewById(R.id.forum_post_stickie);
            i1Var.f40441g = (RelativeLayout) view.findViewById(R.id.forumExtFunc);
            i1Var.f40442h = (ImageView) view.findViewById(R.id.forum_post_moderator);
            i1Var.f40443i = (ImageView) view.findViewById(R.id.officialIcon);
            i1Var.f40444j = (VipView) view.findViewById(R.id.vipFlag);
            i1Var.f40445k = (TextView) view.findViewById(R.id.copperTitleTv);
            view.setTag(i1Var);
        }
        try {
            xVar = (r1.x) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (xVar == null) {
            return view;
        }
        try {
            UtilsMy.A3(this.f40310e, i1Var.f40437c, xVar.f40651k, xVar.f40652l, R.color.forum_nickname_color);
            i1Var.f40444j.setVipData(xVar.f40651k, xVar.f40652l);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (xVar.f40641a) {
            i1Var.f40440f.setVisibility(8);
        } else {
            i1Var.f40440f.setVisibility(0);
        }
        i1Var.f40437c.setText(xVar.f40643c);
        i1Var.f40438d.setText(com.join.android.app.common.utils.g.a(xVar.f40644d * 1000));
        if (xVar.f40645e) {
            i1Var.f40439e.setVisibility(0);
        } else {
            i1Var.f40439e.setVisibility(8);
        }
        if (xVar.f40649i) {
            i1Var.f40442h.setVisibility(0);
        } else {
            i1Var.f40442h.setVisibility(8);
        }
        if (xVar.f40650j) {
            i1Var.f40443i.setVisibility(0);
        } else {
            i1Var.f40443i.setVisibility(8);
        }
        MyImageLoader.x(i1Var.f40436b, xVar.f40642b);
        i1Var.f40436b.setOnClickListener(new a0(xVar));
        int i5 = xVar.f40646f;
        R0(view, i5);
        K0(i1Var.f40441g, i5);
        com.join.mgps.Util.j0.S0(i1Var.f40436b, i1Var.f40437c, i1Var.f40438d);
        com.join.mgps.Util.j0.U0(i1Var.f40444j);
        String str = xVar.f40655o;
        String str2 = xVar.f40654n;
        if (i1Var.f40445k != null) {
            if (!TextUtils.isEmpty(str)) {
                i1Var.f40445k.setVisibility(0);
                i1Var.f40445k.setText(str);
                Drawable drawable = this.f40310e.getResources().getDrawable(R.drawable.forum_post_host);
                if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                    str2 = "#2fccdf";
                }
                drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                i1Var.f40445k.setBackgroundDrawable(drawable);
            } else {
                i1Var.f40445k.setVisibility(8);
            }
        }
        return view;
    }

    private int T(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f40315j == 0) {
            Resources resources = context.getResources();
            this.f40315j = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.5f);
        }
        return this.f40315j;
    }

    private View U(int i4, View view, ViewGroup viewGroup) {
        j1 j1Var;
        r1.y yVar;
        if (view != null) {
            j1Var = (j1) view.getTag();
        } else {
            j1Var = new j1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_post_thumbnail, (ViewGroup) null);
            j1Var.f40452c = (RelativeLayout) view.findViewById(R.id.forum_post_media_container);
            j1Var.f40451b = (TextView) view.findViewById(R.id.images_count);
            j1Var.f40453d = (SimpleDraweeView) view.findViewById(R.id.img_m_1);
            j1Var.f40454e = (SimpleDraweeView) view.findViewById(R.id.img_m_2);
            j1Var.f40455f = (SimpleDraweeView) view.findViewById(R.id.img_m_3);
            view.setTag(j1Var);
        }
        try {
            yVar = (r1.y) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (yVar == null) {
            return view;
        }
        u0(j1Var, yVar);
        R0(view, yVar.f40658c);
        return view;
    }

    private void U0(View view, RecommendLabelTag recommendLabelTag) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new w(recommendLabelTag));
    }

    private View V(int i4, View view, ViewGroup viewGroup) {
        k1 k1Var;
        r1.z zVar;
        if (view != null) {
            k1Var = (k1) view.getTag();
        } else {
            k1Var = new k1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_post_activity_item_post_message1, (ViewGroup) null);
            k1Var.f40465b = (StaticLayoutView) view.findViewById(R.id.forum_post_message);
            view.setTag(k1Var);
        }
        try {
            zVar = (r1.z) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (zVar == null) {
            return view;
        }
        com.join.android.app.component.optimizetext.b bVar = this.f40307b;
        if (bVar.d(zVar.f40662d + "") == null) {
            this.f40307b.e(zVar);
        }
        StaticLayoutView staticLayoutView = k1Var.f40465b;
        com.join.android.app.component.optimizetext.b bVar2 = this.f40307b;
        staticLayoutView.setLayout(bVar2.d(zVar.f40662d + ""));
        com.join.mgps.Util.j0.X0(k1Var.f40465b);
        R0(view, zVar.f40662d);
        return view;
    }

    private View W(int i4, View view, ViewGroup viewGroup) {
        View view2;
        m1 m1Var;
        r1.p pVar;
        try {
            if (view != null) {
                view2 = view;
                m1Var = view.getTag() instanceof m1 ? (m1) view.getTag() : null;
            } else {
                m1 m1Var2 = new m1();
                View inflate = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_f_item_post_subject, (ViewGroup) null);
                try {
                    m1Var2.f40482b = (Button) inflate.findViewById(R.id.best);
                    m1Var2.f40483c = (TextView) inflate.findViewById(R.id.subject);
                    m1Var2.f40485e = inflate.findViewById(R.id.subjectMain);
                    m1Var2.f40484d = inflate.findViewById(R.id.forum_post_divider);
                    inflate.setTag(m1Var2);
                    view2 = inflate;
                    m1Var = m1Var2;
                } catch (Exception e5) {
                    e = e5;
                    view2 = inflate;
                    e.printStackTrace();
                    return view2;
                }
            }
        } catch (Exception e6) {
            e = e6;
            view2 = view;
        }
        try {
            pVar = (r1.p) getItem(i4);
        } catch (Exception e7) {
            e = e7;
            e.printStackTrace();
            return view2;
        }
        if (pVar != null && m1Var != null) {
            if (pVar.f40606a) {
                m1Var.f40484d.setVisibility(0);
            } else {
                m1Var.f40484d.setVisibility(8);
            }
            m1Var.f40483c.setMovementMethod(LinkMovementMethod.getInstance());
            ArrayList arrayList = new ArrayList();
            if (pVar.f40607b) {
                ForumBean.ForumPostsBean.TagInfo tagInfo = new ForumBean.ForumPostsBean.TagInfo();
                tagInfo.setName("精");
                tagInfo.setColor("#00FFFFFF");
                tagInfo.setFont_color("#FF8378FF");
                tagInfo.setBorder_color("#FF8378FF");
                arrayList.add(0, tagInfo);
            }
            if (pVar.f40608c) {
                ForumBean.ForumPostsBean.TagInfo tagInfo2 = new ForumBean.ForumPostsBean.TagInfo();
                tagInfo2.setName("顶");
                tagInfo2.setColor("#00FFFFFF");
                tagInfo2.setFont_color("#FFFF6464");
                tagInfo2.setBorder_color("#FFFF6464");
                arrayList.add(0, tagInfo2);
            }
            List<ForumBean.ForumPostsBean.TagInfo> list = pVar.f40614i;
            if (list != null) {
                arrayList.addAll(list);
            }
            y0(m1Var.f40483c, pVar.f40609d, pVar.f40607b, pVar.f40612g, pVar.f40613h, arrayList, pVar.f40615j, pVar.f40611f, pVar.f40616k, pVar.f40617l);
            int i5 = pVar.f40610e;
            k0(m1Var.f40483c, i5);
            R0(view2, i5);
            return view2;
        }
        return view2;
    }

    private View X(int i4, View view, ViewGroup viewGroup) {
        View view2;
        m1 m1Var;
        r1.p pVar;
        try {
            if (view != null) {
                view2 = view;
                m1Var = view.getTag() instanceof m1 ? (m1) view.getTag() : null;
            } else {
                m1 m1Var2 = new m1();
                View inflate = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_f_item_post_subject_label, (ViewGroup) null);
                try {
                    m1Var2.f40482b = (Button) inflate.findViewById(R.id.best);
                    m1Var2.f40483c = (TextView) inflate.findViewById(R.id.subject);
                    m1Var2.f40485e = inflate.findViewById(R.id.subjectMain);
                    m1Var2.f40484d = inflate.findViewById(R.id.forum_post_divider);
                    inflate.setTag(m1Var2);
                    view2 = inflate;
                    m1Var = m1Var2;
                } catch (Exception e5) {
                    e = e5;
                    view2 = inflate;
                    e.printStackTrace();
                    return view2;
                }
            }
        } catch (Exception e6) {
            e = e6;
            view2 = view;
        }
        try {
            pVar = (r1.p) getItem(i4);
        } catch (Exception e7) {
            e = e7;
            e.printStackTrace();
            return view2;
        }
        if (pVar != null && m1Var != null) {
            if (pVar.f40606a) {
                m1Var.f40484d.setVisibility(0);
            } else {
                m1Var.f40484d.setVisibility(8);
            }
            m1Var.f40483c.setMovementMethod(LinkMovementMethod.getInstance());
            ArrayList arrayList = new ArrayList();
            if (pVar.f40607b) {
                ForumBean.ForumPostsBean.TagInfo tagInfo = new ForumBean.ForumPostsBean.TagInfo();
                tagInfo.setName("精");
                tagInfo.setColor("#00FFFFFF");
                tagInfo.setFont_color("#FF8378FF");
                tagInfo.setBorder_color("#FF8378FF");
                arrayList.add(0, tagInfo);
            }
            if (pVar.f40608c) {
                ForumBean.ForumPostsBean.TagInfo tagInfo2 = new ForumBean.ForumPostsBean.TagInfo();
                tagInfo2.setName("顶");
                tagInfo2.setColor("#00FFFFFF");
                tagInfo2.setFont_color("#FFFF6464");
                tagInfo2.setBorder_color("#FFFF6464");
                arrayList.add(0, tagInfo2);
            }
            List<ForumBean.ForumPostsBean.TagInfo> list = pVar.f40614i;
            if (list != null) {
                arrayList.addAll(list);
            }
            y0(m1Var.f40483c, pVar.f40609d, pVar.f40607b, pVar.f40612g, pVar.f40613h, arrayList, pVar.f40615j, pVar.f40611f, pVar.f40616k, pVar.f40617l);
            int i5 = pVar.f40610e;
            k0(m1Var.f40483c, i5);
            R0(view2, i5);
            return view2;
        }
        return view2;
    }

    private View Y(int i4, View view, ViewGroup viewGroup) {
        n1 n1Var;
        r1.a0 a0Var;
        if (view != null) {
            n1Var = (n1) view.getTag();
        } else {
            n1Var = new n1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_post_subject, (ViewGroup) null);
            n1Var.f40494b = (Button) view.findViewById(R.id.forum_post_best);
            n1Var.f40495c = (TextView) view.findViewById(R.id.forum_post_subject);
            view.setTag(n1Var);
        }
        try {
            a0Var = (r1.a0) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (a0Var == null) {
            return view;
        }
        x0(n1Var.f40495c, a0Var.f40528b, a0Var.f40527a, a0Var.f40531e, a0Var.f40532f, a0Var.f40533g);
        R0(view, a0Var.f40529c);
        return view;
    }

    private View Z(int i4, View view, ViewGroup viewGroup) {
        k0 k0Var;
        r1.b0 b0Var;
        try {
            if (view != null) {
                k0Var = (k0) view.getTag();
            } else {
                k0Var = new k0();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_forum_activity_top_item, (ViewGroup) null);
                k0Var.f40459b = (TextView) view.findViewById(R.id.forum_post_subject);
                k0Var.f40460c = (TextView) view.findViewById(R.id.forum_post_stickie);
                k0Var.f40461d = (Button) view.findViewById(R.id.forum_post_best);
                k0Var.f40462e = (ImageView) view.findViewById(R.id.forum_post_pic);
                k0Var.f40463f = (ImageView) view.findViewById(R.id.forum_post_video);
                view.setTag(k0Var);
            }
            b0Var = (r1.b0) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (b0Var == null) {
            return view;
        }
        if (com.join.mgps.Util.g2.h(b0Var.f40536b)) {
            k0Var.f40459b.setVisibility(8);
        } else {
            k0Var.f40459b.setVisibility(0);
            k0Var.f40459b.setText(b0Var.f40536b);
        }
        try {
            if (k0Var.f40460c != null && b0Var.f40540f != null && b0Var.f40540f.size() != 0) {
                k0Var.f40460c.getResources();
                DisplayMetrics displayMetrics = k0Var.f40460c.getResources().getDisplayMetrics();
                ForumBean.ForumPostsBean.TagInfo tagInfo = (ForumBean.ForumPostsBean.TagInfo) b0Var.f40540f.get(0);
                if (com.join.mgps.Util.g2.i(tagInfo.getId()) && tagInfo.getId().equals("1")) {
                    k0Var.f40460c.setText(tagInfo.getName());
                    k0Var.f40460c.setTextColor(Color.parseColor(tagInfo.getFont_color()));
                    Drawable c5 = com.join.mgps.customview.c0.c(new ColorDrawable(Color.parseColor(tagInfo.getColor())));
                    if (c5 != null && (c5 instanceof com.join.mgps.customview.c0)) {
                        ((com.join.mgps.customview.c0) c5).l(Color.parseColor(tagInfo.getBorder_color()));
                        ((com.join.mgps.customview.c0) c5).n(TypedValue.applyDimension(1, 1.0f, displayMetrics));
                        ((com.join.mgps.customview.c0) c5).o(1.2f);
                        ((com.join.mgps.customview.c0) c5).q(ImageView.ScaleType.FIT_XY);
                    }
                    if (Build.VERSION.SDK_INT > 15) {
                        k0Var.f40460c.setBackground(c5);
                    } else {
                        k0Var.f40460c.setBackgroundDrawable(c5);
                    }
                } else {
                    k0Var.f40460c.setBackgroundResource(R.drawable.top_tips);
                }
            } else {
                k0Var.f40460c.setBackgroundResource(R.drawable.top_tips);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (b0Var.f40537c) {
            k0Var.f40461d.setVisibility(0);
        } else {
            k0Var.f40461d.setVisibility(8);
        }
        k0Var.f40462e.setVisibility(8);
        k0Var.f40463f.setVisibility(8);
        view.setOnClickListener(new v(b0Var.f40535a));
        return view;
    }

    private int a0(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f40318m == 0) {
            Resources resources = context.getResources();
            this.f40318m = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.f40318m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup.LayoutParams a1(String str, View view, com.facebook.imagepipeline.image.f fVar) {
        if (fVar != null) {
            int width = fVar.getWidth();
            int height = fVar.getHeight();
            Resources resources = view.getContext().getResources();
            int dimensionPixelSize = resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2);
            float f5 = (height * 1.0f) / width;
            int i4 = (int) (dimensionPixelSize * 1.0f * f5);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = i4;
            com.join.mgps.Util.w0.e("setPostImageParam-->rawHeight=" + height + " rawWidth=" + width + " ratio=" + f5 + " itemHeight=" + i4 + " itemWidth=" + dimensionPixelSize + "\n" + str);
            view.setMinimumHeight(0);
            view.setLayoutParams(layoutParams);
            return layoutParams;
        }
        return null;
    }

    private View b0(int i4, View view, ViewGroup viewGroup) {
        o1 o1Var;
        r1.c0 c0Var;
        if (view != null) {
            o1Var = (o1) view.getTag();
        } else {
            o1Var = new o1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_post_activity_item_post_video1, (ViewGroup) null);
            o1Var.f40506c = (FrameLayout) view.findViewById(R.id.videoContner);
            o1Var.f40505b = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            view.setTag(o1Var);
        }
        try {
            c0Var = (r1.c0) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (c0Var == null) {
            return view;
        }
        int a02 = a0(this.f40310e);
        String str = c0Var.f40551b;
        String str2 = c0Var.f40550a;
        if (o1Var.f40506c != null) {
            o1Var.f40506c.setLayoutParams(new RelativeLayout.LayoutParams(-1, a02));
            MyImageLoader.d(o1Var.f40505b, R.drawable.video_bg, str2);
            int i5 = i4 + 1;
            o1Var.f40505b.setTag(Integer.valueOf(i5));
            if (com.join.mgps.Util.g2.i(str)) {
                this.f40312g.e(i5, new c.l(i5, str, str2), new boolean[0]);
            }
            o1Var.f40505b.setOnClickListener(new d0(i5));
        }
        return view;
    }

    private void c1(View view, CharSequence charSequence) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        } else if (view instanceof Button) {
            ((Button) view).setText(charSequence);
        }
    }

    private View d0(int i4, View view, ViewGroup viewGroup) {
        l1 l1Var;
        r1.e0 e0Var;
        BaseViewHolder baseViewHolder;
        if (view != null) {
            l1Var = (l1) view.getTag();
        } else {
            l1Var = new l1();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_rich_message, (ViewGroup) null);
            l1Var.f40475b = (LinearLayout) view.findViewById(R.id.ll_rich_layout);
            view.setTag(l1Var);
        }
        try {
            e0Var = (r1.e0) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (e0Var == null) {
            return view;
        }
        List<r1> list = e0Var.f40562b;
        if (list != null && list.size() > 0) {
            for (int i5 = 0; i5 < e0Var.f40562b.size() && i5 <= 8; i5++) {
                r1 r1Var = e0Var.f40562b.get(i5);
                int ordinal = r1Var.b().ordinal();
                if (ordinal == ViewType.POST_IMAGE.ordinal()) {
                    baseViewHolder = new BaseViewHolder(View.inflate(this.f40310e, R.layout.mg_forum_post_activity_item_post_image, null));
                    i(baseViewHolder, r1Var);
                } else if (ordinal == ViewType.POST_VIDEO.ordinal()) {
                    baseViewHolder = new BaseViewHolder(View.inflate(this.f40310e, R.layout.mg_forum_post_activity_item_post_videojc, null));
                    l(baseViewHolder, r1Var);
                } else if (ordinal == ViewType.POST_MESSAGE.ordinal()) {
                    baseViewHolder = new BaseViewHolder(View.inflate(this.f40310e, R.layout.mg_forum_post_activity_item_post_message, null));
                    j(baseViewHolder, r1Var);
                } else if (ordinal == ViewType.POST_RICH_MESSAGE.ordinal()) {
                    baseViewHolder = new BaseViewHolder(View.inflate(this.f40310e, R.layout.mg_forum_post_activity_item_post_rich_message, null));
                    k(baseViewHolder, r1Var);
                } else {
                    baseViewHolder = null;
                }
                if (baseViewHolder != null) {
                    l1Var.f40475b.addView(baseViewHolder.itemView);
                }
            }
        }
        R0(l1Var.f40475b, e0Var.f40561a);
        return view;
    }

    private void d1(View view, int i4) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(i4);
        } else if (view instanceof Button) {
            ((Button) view).setTextColor(i4);
        }
    }

    private View e0(int i4, View view, ViewGroup viewGroup) {
        p1 p1Var;
        r1.f0 f0Var;
        List<RecommendLabelTag> list;
        try {
            if (view != null) {
                p1Var = (p1) view.getTag();
            } else {
                p1Var = new p1();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_flow_layout_container, (ViewGroup) null);
                p1Var.f40512b = (FlowLayout) view.findViewById(R.id.flowLayout);
                view.setTag(p1Var);
            }
            f0Var = (r1.f0) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (f0Var != null && (list = f0Var.f40565c) != null && list.size() >= 1) {
            p1Var.f40512b.removeAllViews();
            int i5 = 0;
            while (i5 < f0Var.f40565c.size()) {
                View p02 = p0(f0Var.f40565c.get(i5), i5 == 0, f0Var.f40563a, f0Var.f40564b);
                if (p02 != null) {
                    p1Var.f40512b.addView(p02);
                }
                i5++;
            }
            return view;
        }
        return view;
    }

    private void e1(SimpleDraweeView simpleDraweeView, BannerBean bannerBean, int i4) {
        if (bannerBean == null || simpleDraweeView == null) {
            return;
        }
        MyImageLoader.j(simpleDraweeView, bannerBean.getPic_remote(), MyImageLoader.z(simpleDraweeView.getContext()));
        if (this.f40319n == null) {
            float f5 = this.f40310e.getResources().getDisplayMetrics().density;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) simpleDraweeView.getLayoutParams();
            int i5 = ((int) (this.f40310e.getResources().getDisplayMetrics().widthPixels - (f5 * 18.0f))) / 2;
            layoutParams.width = i5;
            layoutParams.height = (int) ((i5 * 1.0f) / 2.07f);
            this.f40319n = layoutParams;
        }
        simpleDraweeView.setLayoutParams(this.f40319n);
        IntentDateBean j02 = com.join.mgps.Util.j0.j0(bannerBean);
        ExtBean extBean = new ExtBean();
        extBean.setFrom("forum");
        extBean.setPosition(MediationConstant.RIT_TYPE_BANNER + (i4 + 1));
        j02.setExtBean(extBean);
        simpleDraweeView.setOnClickListener(new h(j02, i4));
    }

    private View f0(int i4, View view, ViewGroup viewGroup) {
        q1 q1Var;
        r1.g0 g0Var;
        try {
            if (view != null) {
                q1Var = (q1) view.getTag();
            } else {
                q1Var = new q1();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_tag_item, (ViewGroup) null);
                q1Var.f40517b = (TextView) view.findViewById(R.id.name);
                q1Var.f40518c = (ImageView) view.findViewById(R.id.dot);
                view.setTag(q1Var);
            }
            g0Var = (r1.g0) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (g0Var == null) {
            return view;
        }
        RecommendLabelTag recommendLabelTag = g0Var.f40568a;
        if (recommendLabelTag != null && !TextUtils.isEmpty(recommendLabelTag.getTag_name())) {
            TextView textView = q1Var.f40517b;
            textView.setText("#" + g0Var.f40568a.getTag_name() + "#");
        } else {
            q1Var.f40517b.setText("");
        }
        if (g0Var.f40569b) {
            q1Var.f40518c.setVisibility(0);
        } else {
            q1Var.f40518c.setVisibility(8);
        }
        U0(view, g0Var.f40568a);
        return view;
    }

    private View h0(int i4, View view, ViewGroup viewGroup) {
        h0 h0Var;
        r1.a aVar;
        if (view != null) {
            h0Var = (h0) view.getTag();
        } else {
            h0Var = new h0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_ad_block, (ViewGroup) null);
            h0Var.f40407b = (TextView) view.findViewById(R.id.forum_ad_title);
            h0Var.f40408c = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_1);
            h0Var.f40409d = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_2);
            h0Var.f40410e = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_3);
            h0Var.f40411f = (SimpleDraweeView) view.findViewById(R.id.layout_forum_ad_4);
            view.setTag(h0Var);
        }
        try {
            aVar = (r1.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar != null && aVar.f40526a != null) {
            SimpleDraweeView[] simpleDraweeViewArr = {h0Var.f40408c, h0Var.f40409d, h0Var.f40410e, h0Var.f40411f};
            for (int i5 = 0; aVar.f40526a.getAdBeans() != null && i5 < aVar.f40526a.getAdBeans().size(); i5++) {
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i5];
                e1(simpleDraweeView, aVar.f40526a.getAdBeans().get(i5), i5);
                if (i5 == 1 || i5 == 3) {
                    try {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(simpleDraweeView.getLayoutParams().width, simpleDraweeView.getLayoutParams().height);
                        layoutParams.setMargins((int) (simpleDraweeView.getResources().getDisplayMetrics().density * 6.0f), 0, 0, 0);
                        simpleDraweeView.setLayoutParams(layoutParams);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
            return view;
        }
        return view;
    }

    private void h1(h1 h1Var, int i4) {
        if (i4 == 0) {
            h1Var.f40420g.setVisibility(8);
            h1Var.f40424k.setVisibility(8);
            h1Var.f40425l.setVisibility(8);
            h1Var.f40421h.setVisibility(0);
            h1Var.f40419f.setVisibility(0);
            return;
        }
        h1Var.f40420g.setVisibility(0);
        if (i4 == 17) {
            h1Var.f40424k.setVisibility(8);
            h1Var.f40425l.setVisibility(0);
        } else {
            h1Var.f40425l.setVisibility(8);
            h1Var.f40424k.setVisibility(0);
        }
        h1Var.f40421h.setVisibility(8);
        h1Var.f40419f.setVisibility(8);
    }

    private void i(BaseViewHolder baseViewHolder, r1 r1Var) {
        try {
            r1.r rVar = (r1.r) r1Var.a();
            if (rVar == null) {
                return;
            }
            t0(this.f40310e, rVar.f40623c.get(rVar.f40622b));
            u0 M = M(rVar.f40621a);
            if (M != null) {
                baseViewHolder.getView(R.id.img).setLayoutParams(new RelativeLayout.LayoutParams(M.f40684a, M.f40685b));
                MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.img), rVar.f40621a);
            } else {
                o0((SimpleDraweeView) baseViewHolder.getView(R.id.img), rVar.f40621a);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void i0() {
        if (this.f40317l == null) {
            this.f40317l = g0();
        }
    }

    private void j(BaseViewHolder baseViewHolder, r1 r1Var) {
        try {
            r1.s sVar = (r1.s) r1Var.a();
            if (sVar == null) {
                return;
            }
            TextView textView = (TextView) baseViewHolder.getView(R.id.forum_post_message);
            if (Build.VERSION.SDK_INT >= 21) {
                ((TextView) baseViewHolder.getView(R.id.forum_post_message)).setLetterSpacing(0.02f);
            }
            textView.setTextSize(0, this.f40310e.getResources().getDimensionPixelSize(R.dimen.forum_posts_activity_message_size));
            textView.setTextColor(this.f40310e.getResources().getColor(R.color.forum_post_detail_item_message));
            textView.setLineSpacing(0.0f, 1.4f);
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setText(sVar.f40624a.toString().replace("<br/>", ""));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void j0(TextView textView) {
        textView.setMovementMethod(com.join.mgps.Util.x.a());
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            int length = text.length();
            Spannable spannable = (Spannable) textView.getText();
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, length, URLSpan.class);
            if (uRLSpanArr.length == 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                if (url.indexOf("http://") == 0 || url.indexOf("https://") == 0) {
                    spannableStringBuilder.setSpan(new i0(textView.getContext(), url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 17);
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    private void k(BaseViewHolder baseViewHolder, r1 r1Var) {
        try {
            r1.t tVar = (r1.t) r1Var.a();
            if (tVar == null) {
                return;
            }
            ((TextView) baseViewHolder.getView(R.id.forum_post_message)).setText(tVar.f40625a);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void k0(TextView textView, int i4) {
        textView.setOnTouchListener(new z(i4));
    }

    private void l(BaseViewHolder baseViewHolder, r1 r1Var) {
        try {
            r1.u uVar = (r1.u) r1Var.a();
            if (uVar == null) {
                return;
            }
            String str = uVar.f40626a;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.bannerView);
            int layoutPosition = baseViewHolder.getLayoutPosition();
            if (simpleDraweeView != null) {
                simpleDraweeView.setTag(Integer.valueOf(layoutPosition));
                simpleDraweeView.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f40318m));
                simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
                MyImageLoader.d(simpleDraweeView, R.drawable.video_bg, str);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private View n(int i4, View view, ViewGroup viewGroup) {
        h0 h0Var;
        r1.a aVar;
        ForumBean.ForumWelcomeAdBean forumWelcomeAdBean;
        String str = "";
        if (view != null) {
            h0Var = (h0) view.getTag();
        } else {
            h0Var = new h0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_ad, (ViewGroup) null);
            h0Var.f40407b = (TextView) view.findViewById(R.id.sectionTitle);
            h0Var.f40413h = (TextView) view.findViewById(R.id.sectionSubTitle);
            h0Var.f40412g = (RelativeLayout) view.findViewById(R.id.forumExtFunc);
            h0Var.f40408c = (SimpleDraweeView) view.findViewById(R.id.img_1);
            h0Var.f40409d = (SimpleDraweeView) view.findViewById(R.id.img_2);
            h0Var.f40410e = (SimpleDraweeView) view.findViewById(R.id.img_3);
            view.setTag(h0Var);
        }
        try {
            aVar = (r1.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar == null || (forumWelcomeAdBean = aVar.f40526a) == null) {
            return view;
        }
        try {
            String title = forumWelcomeAdBean.getTitle();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString("直播");
            Context context = this.f40310e;
            spannableString.setSpan(com.join.mgps.Util.j0.S(com.join.mgps.Util.k2.a(context, "#f38548")), 0, spannableString.length(), 33);
            if (com.join.mgps.Util.g2.h(title)) {
                spannableStringBuilder.append((CharSequence) spannableString);
            } else {
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) (" " + title));
            }
            h0Var.f40407b.setText(spannableStringBuilder);
            String sub_title = aVar.f40526a.getSub_title();
            if (!com.join.mgps.Util.g2.h(sub_title)) {
                str = sub_title;
            }
            h0Var.f40413h.setText(str);
            D0(h0Var.f40412g, aVar.f40526a.getTitle());
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        SimpleDraweeView[] simpleDraweeViewArr = {h0Var.f40408c, h0Var.f40409d, h0Var.f40410e};
        int i5 = 0;
        for (int i6 = 0; i6 < 3; i6++) {
            SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i6];
            if (i6 < aVar.f40526a.getAdBeans().size()) {
                BannerBean bannerBean = aVar.f40526a.getAdBeans().get(i6);
                if (bannerBean.getAd_switch() == 1) {
                    simpleDraweeViewArr[i5].setVisibility(0);
                    v0(simpleDraweeViewArr[i5], bannerBean, i5);
                    i5++;
                } else {
                    int i7 = (3 - i5) - 1;
                    if (i7 < 3 && i7 >= 0) {
                        simpleDraweeViewArr[i7].setVisibility(8);
                    }
                }
            } else {
                simpleDraweeView.setVisibility(8);
            }
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(r1.w wVar, View view) {
        if (TextUtils.isEmpty(wVar.f40640d)) {
            return;
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(wVar.f40640d);
        IntentUtil.getInstance().intentActivity(this.f40310e, intentDateBean);
    }

    private View o(int i4, View view, ViewGroup viewGroup) {
        return view;
    }

    private View p0(RecommendLabelTag recommendLabelTag, boolean z4, int i4, String str) {
        View inflate;
        View view = null;
        try {
            inflate = View.inflate(this.f40310e, R.layout.forum_group_tag_item, null);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, this.f40310e.getResources().getDisplayMetrics());
            marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 15.0f, this.f40310e.getResources().getDisplayMetrics());
            inflate.setLayoutParams(marginLayoutParams);
            TextView textView = (TextView) inflate.findViewById(R.id.tagTv);
            if (textView == null) {
                return null;
            }
            textView.setBackgroundResource(R.color.transparent);
            textView.setTextColor(Color.parseColor("#3CA4FD"));
            String str2 = "#" + recommendLabelTag.getTag_name() + "#";
            try {
                if (z4) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(textView.getContext().getResources().getDrawable(R.drawable.mg_forum_tag_hot), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 2.0f, textView.getContext().getResources().getDisplayMetrics()));
                    textView.setBackgroundResource(R.drawable.shape_hot_tag_bg);
                    textView.setTextColor(Color.parseColor("#FFFF4343"));
                    str2 = recommendLabelTag.getTag_name();
                } else {
                    textView.getPaint().setFakeBoldText(false);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            textView.setText(str2);
            textView.setOnClickListener(new y(recommendLabelTag, i4, str));
            return inflate;
        } catch (Exception e7) {
            e = e7;
            view = inflate;
            e.printStackTrace();
            return view;
        }
    }

    private View q(int i4, View view, ViewGroup viewGroup) {
        m0 m0Var;
        r1.b bVar;
        if (view != null) {
            m0Var = (m0) view.getTag();
        } else {
            m0Var = new m0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_forum_topic, (ViewGroup) null);
            m0Var.f40480c = (HListView) view.findViewById(R.id.list);
            m0Var.f40479b = (TextView) view.findViewById(R.id.sectionTitle);
            view.setTag(m0Var);
        }
        try {
            bVar = (r1.b) getItem(i4);
            m0Var.f40479b.setText("精彩话题");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            view.setVisibility(8);
            return view;
        }
        view.setVisibility(0);
        l0 l0Var = (l0) m0Var.f40480c.getAdapter();
        if (l0Var == null) {
            l0Var = new l0();
            m0Var.f40480c.setAdapter((ListAdapter) l0Var);
        }
        l0Var.b(bVar.f40534a);
        l0Var.notifyDataSetChanged();
        return view;
    }

    private void q0(c1 c1Var, boolean z4, int i4, int i5) {
        TextView textView = c1Var.f40352d;
        ImageView imageView = c1Var.f40357i;
        if (z4) {
            imageView.setImageResource(R.drawable.like);
            textView.setText(i4 + "");
            textView.setTextColor(Color.parseColor("#d92a0c"));
        } else {
            imageView.setImageResource(R.drawable.unlike);
            textView.setText(i4 + "");
            textView.setTextColor(Color.parseColor("#a9a9a9"));
        }
        ((View) c1Var.f40352d.getParent()).setOnClickListener(new f(c1Var, i5));
    }

    private View r(int i4, View view, ViewGroup viewGroup) {
        n0 n0Var;
        r1.d0 d0Var;
        if (view != null) {
            n0Var = (n0) view.getTag();
        } else {
            n0Var = new n0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_item_for_welcome1, (ViewGroup) null);
            n0Var.f40488b = (SimpleDraweeView) view.findViewById(R.id.forum_icon);
            n0Var.f40489c = (TextView) view.findViewById(R.id.forum_name);
            n0Var.f40490d = (TextView) view.findViewById(R.id.forum_desc);
            n0Var.f40491e = (TextView) view.findViewById(R.id.countTv);
            n0Var.f40492f = view.findViewById(R.id.arrow);
            view.setTag(n0Var);
        }
        try {
            d0Var = (r1.d0) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (d0Var == null) {
            return view;
        }
        MyImageLoader.h(n0Var.f40488b, d0Var.f40554a);
        n0Var.f40489c.setText(d0Var.f40555b);
        n0Var.f40490d.setText(d0Var.f40556c);
        if (d0Var.f40558e > 0) {
            TextView textView = n0Var.f40491e;
            textView.setText("今日更新：" + d0Var.f40558e);
        } else {
            n0Var.f40491e.setText("今日更新：0");
        }
        if (d0Var.f40560g) {
            n0Var.f40491e.setVisibility(0);
        } else {
            n0Var.f40491e.setVisibility(8);
        }
        n0Var.f40490d.setVisibility(0);
        Q0(view, d0Var.f40559f);
        return view;
    }

    private void r0(g1 g1Var, boolean z4, int i4) {
        TextView textView = g1Var.f40399e;
        ImageView imageView = g1Var.f40402h;
        if (z4) {
            imageView.setImageResource(R.drawable.like);
            textView.setText(i4 + "");
            textView.setTextColor(Color.parseColor("#d92a0c"));
            return;
        }
        imageView.setImageResource(R.drawable.unlike);
        textView.setText(i4 + "");
        textView.setTextColor(Color.parseColor("#a9a9a9"));
    }

    private View s(int i4, View view, ViewGroup viewGroup) {
        o0 o0Var;
        r1.c cVar;
        try {
            if (view != null) {
                o0Var = (o0) view.getTag();
            } else {
                o0Var = new o0();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_group_member_item, (ViewGroup) null);
                o0Var.f40499b = (SimpleDraweeView) view.findViewById(R.id.avatar);
                o0Var.f40500c = (TextView) view.findViewById(R.id.nickName);
                o0Var.f40501d = (TextView) view.findViewById(R.id.grade);
                o0Var.f40502e = (TextView) view.findViewById(R.id.addTime);
                o0Var.f40503f = (TextView) view.findViewById(R.id.groupAction);
                view.setTag(o0Var);
            }
            cVar = (r1.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar == null) {
            return view;
        }
        MyImageLoader.x(o0Var.f40499b, TextUtils.isEmpty(cVar.f40541a) ? "" : cVar.f40541a);
        o0Var.f40499b.setOnClickListener(new k(cVar));
        o0Var.f40500c.setText(cVar.f40542b);
        if (cVar.f40543c) {
            o0Var.f40501d.setVisibility(0);
            if (cVar.f40544d == 0) {
                o0Var.f40501d.setText("组长");
            } else {
                o0Var.f40501d.setText("副组长");
            }
        } else {
            o0Var.f40501d.setVisibility(8);
        }
        TextView textView = o0Var.f40502e;
        textView.setText(cVar.f40545e + "加入");
        if (cVar.f40546f && cVar.f40547g) {
            o0Var.f40503f.setVisibility(0);
            o0Var.f40502e.setVisibility(8);
        } else {
            o0Var.f40503f.setVisibility(8);
            if (!cVar.f40543c) {
                o0Var.f40502e.setVisibility(0);
            } else {
                o0Var.f40502e.setVisibility(8);
            }
        }
        N0(o0Var.f40503f, cVar.f40548h);
        return view;
    }

    private View t(int i4, View view, ViewGroup viewGroup) {
        p0 p0Var;
        r1.d dVar;
        try {
            if (view != null) {
                p0Var = (p0) view.getTag();
            } else {
                p0Var = new p0();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_group_member_section_title, (ViewGroup) null);
                p0Var.f40510b = (TextView) view.findViewById(R.id.title);
                view.setTag(p0Var);
            }
            dVar = (r1.d) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (dVar == null) {
            return view;
        }
        p0Var.f40510b.setText(TextUtils.isEmpty(dVar.f40553a) ? "成员" : dVar.f40553a);
        return view;
    }

    private View u(int i4, View view, ViewGroup viewGroup) {
        q0 q0Var;
        if (view != null) {
            q0Var = (q0) view.getTag();
        } else {
            q0Var = new q0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_hot_forum_footer, (ViewGroup) null);
            q0Var.f40515b = view.findViewById(R.id.forums_hot_item_forum_all);
            view.setTag(q0Var);
        }
        try {
            View view2 = q0Var.f40515b;
            if (view2 != null) {
                P0(view2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private void u0(j1 j1Var, r1.y yVar) {
        if (yVar != null && yVar.f40656a.size() != 0) {
            if (this.f40317l == null) {
                this.f40317l = g0();
            }
            List<String> list = yVar.f40657b;
            TextView textView = j1Var.f40451b;
            if (list != null && list.size() > 3) {
                textView.setVisibility(0);
                textView.setText("共" + list.size() + "张");
            } else {
                textView.setVisibility(8);
            }
            SimpleDraweeView[] simpleDraweeViewArr = {j1Var.f40453d, j1Var.f40454e, j1Var.f40455f};
            int i4 = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i5];
                if (i5 >= yVar.f40656a.size()) {
                    simpleDraweeView.setVisibility(8);
                } else {
                    ForumBean.ForumPostsBean.ResBean resBean = yVar.f40656a.get(i5);
                    if (resBean.getType().equals("pic")) {
                        F0(simpleDraweeView, i5, resBean.getThumb(), i5 - i4, list);
                    } else if (resBean.getType().equals("video")) {
                        i4++;
                        g1(simpleDraweeView, i5, resBean.getThumb(), resBean.getRaw());
                    }
                }
            }
            return;
        }
        j1Var.f40452c.setVisibility(8);
    }

    private View v(int i4, View view, ViewGroup viewGroup) {
        r0 r0Var;
        try {
            if (view != null) {
                r0Var = (r0) view.getTag();
            } else {
                r0Var = new r0();
                view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_hot_forum_header, (ViewGroup) null);
                r0Var.f40522b = (LinearLayout) view.findViewById(R.id.forumMore);
                view.setTag(r0Var);
            }
            LinearLayout linearLayout = r0Var.f40522b;
            if (linearLayout != null) {
                P0(linearLayout);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private void v0(SimpleDraweeView simpleDraweeView, BannerBean bannerBean, int i4) {
        if (bannerBean == null || simpleDraweeView == null) {
            return;
        }
        if (this.f40317l == null) {
            this.f40317l = g0();
        }
        String pic_remote = bannerBean.getPic_remote();
        int i5 = (int) (this.f40310e.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f40317l;
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(layoutParams.width, layoutParams.height);
        if (i4 > 0) {
            layoutParams2.setMargins(i5, 0, 0, 0);
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        simpleDraweeView.setVisibility(0);
        simpleDraweeView.setLayoutParams(layoutParams2);
        simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
        MyImageLoader.i(simpleDraweeView, pic_remote, r.c.f11294a);
        IntentDateBean j02 = com.join.mgps.Util.j0.j0(bannerBean);
        ExtBean extBean = new ExtBean();
        extBean.setFrom("forum");
        extBean.setPosition("banner3" + (i4 + 1));
        j02.setExtBean(extBean);
        simpleDraweeView.setOnClickListener(new g(j02, i4));
    }

    private View w(int i4, View view, ViewGroup viewGroup) {
        s0 s0Var;
        r1.g gVar;
        if (view != null) {
            s0Var = (s0) view.getTag();
        } else {
            s0Var = new s0();
            view = LayoutInflater.from(this.f40310e).inflate(R.layout.mg_forum_welcome_item_hot_forum_item, (ViewGroup) null);
            View findViewById = view.findViewById(R.id.mg_forum_item);
            s0Var.f40670b = findViewById;
            s0Var.f40671c = (SimpleDraweeView) findViewById.findViewById(R.id.forum_icon);
            s0Var.f40672d = (TextView) s0Var.f40670b.findViewById(R.id.forum_name);
            s0Var.f40677i = (TextView) s0Var.f40670b.findViewById(R.id.forum_desc);
            s0Var.f40675g = (Button) s0Var.f40670b.findViewById(R.id.forum_follow);
            s0Var.f40676h = (TextView) s0Var.f40670b.findViewById(R.id.forum_today_posts_tv);
            view.setTag(s0Var);
        }
        try {
            gVar = (r1.g) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (gVar == null) {
            return view;
        }
        ForumBean forumBean = gVar.f40566a;
        TextView textView = s0Var.f40672d;
        com.join.mgps.Util.j0.D1(textView, forumBean.getName() + "", "");
        TextView textView2 = s0Var.f40677i;
        com.join.mgps.Util.j0.D1(textView2, forumBean.getDescription() + "", "");
        O0(s0Var.f40670b, forumBean);
        MyImageLoader.j(s0Var.f40671c, forumBean.getIcon_src(), MyImageLoader.B(this.f40310e));
        com.join.mgps.Util.j0.D1(s0Var.f40676h, s0Var.f40676h.getResources().getString(R.string.forum_info_today_posts, com.join.mgps.Util.j0.R(forumBean.getToday_posts())), "今日 0");
        if (forumBean.is_follow()) {
            s0Var.f40675g.setVisibility(8);
        } else {
            s0Var.f40675g.setVisibility(0);
        }
        L0(s0Var.f40675g, forumBean);
        return view;
    }

    private void x0(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
        y0(textView, str, z4, z5, str2, list, null, 0, "", 0);
    }

    private void y0(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, int i4, String str3, int i5) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        com.join.mgps.Util.j0.h(textView.getContext(), spannableStringBuilder, list);
        com.join.mgps.Util.j0.g(textView, spannableStringBuilder, z4, (z5 && i5 == 1) ? false : z5, str2);
        if (z5 && i5 == 1) {
            com.join.mgps.Util.j0.d(textView, spannableStringBuilder);
        }
        if (this.f40309d) {
            com.join.mgps.Util.j0.i(textView.getContext(), spannableStringBuilder, list2, i4, str3);
        }
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
    }

    int A() {
        return (int) (this.f40310e.getResources().getDisplayMetrics().widthPixels / 1.40625f);
    }

    void A0(TextView textView, int i4) {
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        textView.setText(textView.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(i4)));
        textView.setTextSize(2, 13.0f);
        textView.setTextColor(-12802819);
        textView.setBackgroundResource(R.drawable.recom_blue_butn);
    }

    void B0(h1 h1Var, Object obj) {
        Button button = h1Var.f40417d;
        if (button == null || obj == null) {
            return;
        }
        Context context = button.getContext();
        Resources resources = context.getResources();
        DownloadTask downloadTask = (DownloadTask) obj;
        int status = downloadTask.getStatus();
        String ver = downloadTask.getVer();
        String packageName = downloadTask.getPackageName();
        ArrayList<TipBean> tipBeans = downloadTask.getTipBeans();
        long size = downloadTask.getSize();
        int pay_game_amount = downloadTask.getPay_game_amount();
        if (pay_game_amount > 0 && b2.e0.o().p(downloadTask.getCrc_link_type_val())) {
            pay_game_amount = 0;
        }
        if (obj instanceof CollectionBeanSubBusiness) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) obj;
            DownloadTask downloadTask2 = collectionBeanSubBusiness.getDownloadTask();
            String ver2 = collectionBeanSubBusiness.getVer();
            if (collectionBeanSubBusiness.getPay_tag_info() != null) {
                pay_game_amount = collectionBeanSubBusiness.getPay_tag_info().getPay_game_amount();
            }
            if (pay_game_amount > 0 && b2.e0.o().p(collectionBeanSubBusiness.getCrc_sign_id())) {
                pay_game_amount = 0;
            }
            downloadTask = downloadTask2;
            ver = ver2;
        } else if (obj instanceof RecomDatabeanBusiness) {
            AppBean game_info = ((RecomDatabeanBusiness) obj).getSub().get(0).getGame_info();
            if (game_info.getPay_tag_info() != null) {
                pay_game_amount = game_info.getPay_tag_info().getPay_game_amount();
            }
            if (pay_game_amount > 0 && b2.e0.o().p(game_info.getCrc_sign_id())) {
                pay_game_amount = 0;
            }
        }
        if (downloadTask == null) {
            if (UtilsMy.o0(tipBeans)) {
                if (pay_game_amount > 0 ? false : com.join.android.app.common.utils.e.l0(context).d(context, packageName)) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, packageName);
                    if (com.join.mgps.Util.g2.i(ver) && l4.d() < Integer.parseInt(ver)) {
                        button.setBackgroundResource(R.drawable.recom_green_butn);
                        c1(button, "更新");
                        d1(button, resources.getColor(R.color.app_green_color));
                    } else {
                        button.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        c1(button, context.getResources().getString(R.string.download_status_finished));
                        d1(button, resources.getColor(R.color.app_main_color));
                    }
                } else {
                    button.setBackgroundResource(R.drawable.recom_green_butn);
                    if (pay_game_amount > 0) {
                        A0(h1Var.f40417d, pay_game_amount);
                    } else {
                        z0(button, status);
                    }
                }
            } else {
                button.setBackgroundResource(R.drawable.recom_green_butn);
                if (pay_game_amount > 0) {
                    A0(h1Var.f40417d, pay_game_amount);
                } else {
                    z0(button, status);
                }
            }
        } else {
            int status2 = downloadTask.getStatus();
            if (pay_game_amount > 0) {
                status2 = 43;
            }
            if (status2 != 0) {
                if (status2 == 27) {
                    c1(button, "暂停中");
                } else if (status2 != 2) {
                    if (status2 != 3) {
                        if (status2 != 5) {
                            if (status2 != 6) {
                                if (status2 != 7) {
                                    if (status2 != 42) {
                                        if (status2 != 43) {
                                            switch (status2) {
                                                case 9:
                                                    h1(h1Var, 0);
                                                    button.setBackgroundResource(R.drawable.recom_green_butn);
                                                    c1(button, "更新");
                                                    d1(button, resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 10:
                                                    h1(h1Var, 16);
                                                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    c1(button, "等待");
                                                    d1(button, resources.getColor(R.color.app_blue_color));
                                                    break;
                                                case 11:
                                                    h1(h1Var, 0);
                                                    button.setBackgroundResource(R.drawable.recom_green_butn);
                                                    c1(button, "安装");
                                                    d1(button, resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 12:
                                                    h1(h1Var, 17);
                                                    TextView textView = h1Var.f40422i;
                                                    textView.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    h1Var.f40423j.setText("解压中..");
                                                    h1Var.f40425l.setProgress((int) downloadTask.getProgress());
                                                    button.setBackgroundResource(R.drawable.extract);
                                                    c1(button, "解压中");
                                                    d1(button, resources.getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    h1(h1Var, 17);
                                                    TextView textView2 = h1Var.f40422i;
                                                    textView2.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    h1Var.f40423j.setText("点击重新解压");
                                                    h1Var.f40425l.setProgress((int) downloadTask.getProgress());
                                                    button.setBackgroundResource(R.drawable.reextract);
                                                    c1(button, "解压");
                                                    d1(button, resources.getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        h1(h1Var, 0);
                        button.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        c1(button, context.getResources().getString(R.string.download_status_finished));
                        d1(button, resources.getColor(R.color.app_main_color));
                    }
                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                    c1(button, "继续");
                    d1(button, resources.getColor(R.color.app_blue_color));
                    h1(h1Var, 16);
                    try {
                        if (downloadTask.getSize() == 0) {
                            TextView textView3 = h1Var.f40422i;
                            textView3.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                        } else {
                            TextView textView4 = h1Var.f40422i;
                            textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                        }
                        h1Var.f40424k.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    h1Var.f40423j.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                    c1(button, "暂停");
                    d1(button, resources.getColor(R.color.app_blue_color));
                    h1(h1Var, 16);
                    if (downloadTask.getSize() == 0) {
                        TextView textView5 = h1Var.f40422i;
                        textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                    } else {
                        TextView textView6 = h1Var.f40422i;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                    }
                    h1Var.f40424k.setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    TextView textView7 = h1Var.f40423j;
                    textView7.setText(speed + "/S");
                }
            }
            h1(h1Var, 0);
            button.setBackgroundResource(R.drawable.recom_green_butn);
            if (pay_game_amount > 0) {
                A0(h1Var.f40417d, pay_game_amount);
            } else {
                z0(button, status);
            }
        }
        button.setOnClickListener(new j0(obj));
    }

    public void C0(String str) {
        this.f40313h = str;
    }

    void E0(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, List<String> list) {
        LinearLayout.LayoutParams layoutParams;
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null && i02[0].intValue() != 0 && i02[1].intValue() != 0) {
            if ((i02[0].intValue() * 1.0f) / i02[1].intValue() > 1.0f) {
                layoutParams = new LinearLayout.LayoutParams(this.f40322q, this.f40323r);
            } else {
                layoutParams = new LinearLayout.LayoutParams(this.f40324s, this.f40325t);
            }
        } else {
            int i6 = this.f40321p;
            layoutParams = new LinearLayout.LayoutParams(i6, i6);
        }
        if (!com.join.mgps.Util.g2.h(str)) {
            simpleDraweeView.setVisibility(0);
            simpleDraweeView.setLayoutParams(layoutParams);
            simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
            MyImageLoader.i(simpleDraweeView, str, r.c.f11294a);
            simpleDraweeView.setOnClickListener(new d(list, i5));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    void F0(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, List<String> list) {
        if (this.f40317l == null) {
            this.f40317l = g0();
        }
        int i6 = (int) (this.f40310e.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f40317l;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
        if (i4 > 0) {
            layoutParams2.setMargins(i6, 0, 0, 0);
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        if (!com.join.mgps.Util.g2.h(str)) {
            simpleDraweeView.setVisibility(0);
            simpleDraweeView.setLayoutParams(layoutParams2);
            simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
            simpleDraweeView.setOnClickListener(new c(list, i5));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    public void G0(List<r1> list) {
        if (list == null) {
            return;
        }
        if (this.f40311f == null) {
            this.f40311f = new ArrayList();
        }
        this.f40311f.clear();
        this.f40311f.addAll(list);
    }

    public void H0(com.join.android.app.component.optimizetext.b bVar) {
        this.f40307b = bVar;
    }

    public void I0(t0 t0Var) {
        this.f40320o = t0Var;
    }

    public void K0(View view, int i4) {
        view.setOnClickListener(new o(i4));
    }

    public void L0(View view, ForumBean forumBean) {
        view.setOnClickListener(new r(forumBean));
    }

    u0 M(String str) {
        Hashtable<String, u0> hashtable = this.f40316k;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str);
    }

    public void M0(View view, ForumBean forumBean) {
        view.setOnClickListener(new s(forumBean));
    }

    public int N() {
        return this.f40331z;
    }

    public void N0(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new u(i4));
    }

    public String O() {
        return this.f40330y;
    }

    public void O0(View view, ForumBean forumBean) {
        view.setOnClickListener(new m(forumBean));
    }

    public void P0(View view) {
        view.setOnClickListener(new n());
    }

    public void R0(View view, int i4) {
        view.setOnClickListener(new l(i4));
    }

    public void S0(View view, String str, String str2) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new t(str2));
    }

    public void T0(View view, int i4, boolean z4, int i5) {
        view.setOnClickListener(new p(i4));
    }

    public void V0(View view) {
        view.setOnClickListener(new q());
    }

    public void W0(boolean z4) {
        this.A = z4;
    }

    public void X0(int i4) {
        this.f40331z = i4;
    }

    public void Y0(String str) {
        this.f40330y = str;
    }

    public void Z0(boolean z4) {
        this.B = z4;
    }

    public void b1(boolean z4) {
        this.f40309d = z4;
    }

    public com.danikula.videocache.i c0(Context context) {
        return MApplication.m(context);
    }

    public void f(r1 r1Var) {
        if (r1Var == null) {
            return;
        }
        if (this.f40311f == null) {
            this.f40311f = new ArrayList();
        }
        this.f40311f.add(r1Var);
    }

    public void f1(com.join.mgps.listener.f fVar) {
        this.f40314i = fVar;
    }

    public void g(List<r1> list) {
        if (list == null) {
            return;
        }
        if (this.f40311f == null) {
            this.f40311f = new ArrayList();
        }
        this.f40311f.addAll(list);
    }

    LinearLayout.LayoutParams g0() {
        DisplayMetrics displayMetrics = this.f40310e.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        int dimensionPixelSize = ((int) ((displayMetrics.widthPixels - (this.f40310e.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2)) - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (dimensionPixelSize <= i4) {
            i4 = dimensionPixelSize > i5 ? i5 : dimensionPixelSize;
        }
        return new LinearLayout.LayoutParams(i4, i4);
    }

    void g1(SimpleDraweeView simpleDraweeView, int i4, String str, String str2) {
        if (this.f40317l == null) {
            this.f40317l = g0();
        }
        int i5 = (int) (this.f40310e.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f40317l;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
        if (i4 > 0) {
            layoutParams2.setMargins(i5, 0, 0, 0);
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        if (!com.join.mgps.Util.g2.h(str)) {
            simpleDraweeView.setVisibility(0);
            simpleDraweeView.setLayoutParams(layoutParams2);
            simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
            simpleDraweeView.setOnClickListener(new e(str2));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<r1> list = this.f40311f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<r1> list = this.f40311f;
        if (list != null) {
            return list.get(i4).a();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        r1 r1Var;
        ViewType b5;
        List<r1> list = this.f40311f;
        if (list == null || (r1Var = list.get(i4)) == null || (b5 = r1Var.b()) == null) {
            return -1;
        }
        return b5.ordinal();
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.POST_HEADER.ordinal()) {
            return S(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_FOOTER.ordinal()) {
            return P(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_TOP.ordinal()) {
            return Z(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_FOOTER.ordinal()) {
            return I(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_IMAGE_THUMBNAIL.ordinal()) {
            return U(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_IMGS.ordinal()) {
            return J(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_VIDEO_THUMBNAIL.ordinal()) {
            return b0(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_VIDEO.ordinal()) {
            return L(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_GAME_RES_LINK.ordinal()) {
            return Q(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_MESSAGE.ordinal()) {
            return V(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_MESSAGE.ordinal()) {
            return K(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_SUBJECT.ordinal()) {
            return Y(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_SUBJECT.ordinal()) {
            return W(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_SUBJECT_LABEL.ordinal()) {
            return X(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_GAME.ordinal()) {
            return R(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MY_FORUM_HEADER.ordinal()) {
            return F(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MY_FORUM_ITEM.ordinal()) {
            return G(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MY_FORUM_FOOTER.ordinal()) {
            return E(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MY_FORUM_MORE_FOOTER.ordinal()) {
            return H(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.HOT_FORUM_HEADER.ordinal()) {
            return v(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.HOT_FORUM_ITEM.ordinal()) {
            return w(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.HOT_FORUM_FOOTER.ordinal()) {
            return u(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.FORUM_TOPIC.ordinal()) {
            return q(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.BAIDUAD.ordinal()) {
            return o(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.TOP_BLOCK.ordinal()) {
            return h0(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MID_BLOCK.ordinal()) {
            return D(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.AD_BLOCK.ordinal()) {
            return n(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.LIVE.ordinal()) {
            return C(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.LIVE_ENTRY.ordinal()) {
            return B(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GROUP_ITEM.ordinal()) {
            return r(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.TAG_FLOW_LAYOUT.ordinal()) {
            return e0(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GROUP_MEMBER_SECTION_TITLE.ordinal()) {
            return t(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GROUP_MEMBER_ITEM.ordinal()) {
            return s(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.TAG_ITEM.ordinal()) {
            return f0(i4, view, viewGroup);
        }
        return itemViewType == ViewType.RICH_MESSAGE.ordinal() ? d0(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    void h(String str, u0 u0Var) {
        if (this.f40316k == null) {
            this.f40316k = new Hashtable<>();
        }
        this.f40316k.put(str, u0Var);
    }

    public boolean l0() {
        return this.A;
    }

    public void m() {
        DisplayMetrics displayMetrics = this.f40310e.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        float dimensionPixelSize = displayMetrics.widthPixels - (this.f40310e.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2);
        int i6 = ((int) (dimensionPixelSize - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (i6 <= i4) {
            i4 = i6 > i5 ? i5 : i6;
        }
        this.f40321p = i4;
        this.f40326u = (int) ((dimensionPixelSize * 1.0f) / 1.8f);
        int i7 = (int) (0.615f * dimensionPixelSize);
        this.f40322q = i7;
        this.f40323r = (int) ((i7 * 1.0f) / 1.85f);
        int i8 = (int) (dimensionPixelSize * 0.54f);
        this.f40324s = i8;
        this.f40325t = (int) ((i8 * 1.0f) / 0.85f);
    }

    public boolean m0() {
        return this.B;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public void o0(SimpleDraweeView simpleDraweeView, String str) {
        try {
            simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new f0(simpleDraweeView)).a(MyImageLoader.H(str)).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public int p() {
        return this.f40329x;
    }

    public void s0(DownloadTask downloadTask, int i4) {
    }

    void t0(Context context, String str) {
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null) {
            u0 u0Var = new u0();
            int intValue = i02[0].intValue();
            int intValue2 = i02[1].intValue();
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2);
            u0Var.f40684a = dimensionPixelSize;
            u0Var.f40685b = (int) (dimensionPixelSize * 1.0f * ((intValue2 * 1.0f) / intValue));
            h(str, u0Var);
        }
    }

    public void w0(int i4) {
        this.f40329x = i4;
    }

    public List<r1> x() {
        return this.f40311f;
    }

    public com.join.android.app.component.optimizetext.b y() {
        return this.f40307b;
    }

    public t0 z() {
        return this.f40320o;
    }

    void z0(View view, int i4) {
        view.setEnabled(true);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTextColor(-12802819);
            if (i4 == 3) {
                textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
                textView.setTextSize(2, 12.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            } else if (i4 == 2) {
                textView.setText("即将开放");
                textView.setTextSize(2, 11.0f);
                textView.setTextColor(-7763575);
                textView.setEnabled(false);
                textView.setBackgroundResource(R.drawable.recom_grey_butn);
            } else {
                textView.setText(this.f40310e.getResources().getString(R.string.download_status_download));
                textView.setTextSize(2, 13.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            }
        } else if (view instanceof Button) {
            Button button = (Button) view;
            button.setTextColor(-12802819);
            if (i4 == 3) {
                button.setText(button.getResources().getString(R.string.download_status_pre_download));
                button.setTextSize(2, 12.0f);
                button.setTextColor(-12802819);
                button.setBackgroundResource(R.drawable.recom_blue_butn);
            } else if (i4 == 2) {
                button.setText("即将开放");
                button.setTextSize(2, 11.0f);
                button.setTextColor(-7763575);
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.recom_grey_butn);
            } else {
                button.setText(this.f40310e.getResources().getString(R.string.download_status_download));
                button.setTextSize(2, 13.0f);
                button.setTextColor(-12802819);
                button.setBackgroundResource(R.drawable.recom_blue_butn);
            }
        }
    }
}
