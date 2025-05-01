package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.MApplication;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.optimizetext.StaticLayoutView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.DownloadUrlBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumProfileFavoritesAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private com.join.android.app.component.optimizetext.b f41328b;

    /* renamed from: c  reason: collision with root package name */
    com.danikula.videocache.i f41329c;

    /* renamed from: d  reason: collision with root package name */
    private Context f41330d;

    /* renamed from: f  reason: collision with root package name */
    com.join.android.app.component.video.c f41332f;

    /* renamed from: h  reason: collision with root package name */
    LinearLayout.LayoutParams f41334h;

    /* renamed from: i  reason: collision with root package name */
    LinearLayout.LayoutParams f41335i;

    /* renamed from: j  reason: collision with root package name */
    LinearLayout.LayoutParams f41336j;

    /* renamed from: g  reason: collision with root package name */
    int f41333g = 0;

    /* renamed from: k  reason: collision with root package name */
    private u f41337k = null;

    /* renamed from: l  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f41338l = new ArrayList(0);

    /* renamed from: m  reason: collision with root package name */
    int f41339m = 0;

    /* renamed from: n  reason: collision with root package name */
    int f41340n = 0;

    /* renamed from: o  reason: collision with root package name */
    int f41341o = 0;

    /* renamed from: p  reason: collision with root package name */
    int f41342p = 0;

    /* renamed from: q  reason: collision with root package name */
    int f41343q = 0;

    /* renamed from: r  reason: collision with root package name */
    int f41344r = 0;

    /* renamed from: e  reason: collision with root package name */
    private List<k0> f41331e = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        POST_HEADER,
        POST_SUBJECT,
        POST_MESSAGE,
        POST_IMAGE,
        POST_VIDEO,
        POST_IMAGE_THUMBNAIL,
        POST_VIDEO_THUMBNAIL,
        POST_FOOTER,
        POST_TOP,
        FAVORITE_ITEM_HEADER,
        GAME_ITEM,
        P_SUBJECT,
        P_MESSAGE,
        P_IMGS,
        P_VIDEO,
        P_FOOTER,
        POST_GAME
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41345b;

        a(int i4) {
            this.f41345b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.d(this.f41345b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public FrameLayout f41347b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f41348c;

        a0() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41350b;

        b(int i4) {
            this.f41350b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.f(this.f41350b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41352b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41353c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41354d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41355e;

        b0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41357b;

        c(int i4) {
            this.f41357b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.b(this.f41357b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41359b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41360c;

        /* renamed from: d  reason: collision with root package name */
        public Button f41361d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41362e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f41363f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f41364g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f41365h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f41366i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f41367j;

        /* renamed from: k  reason: collision with root package name */
        public ProgressBar f41368k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f41369l;

        /* renamed from: m  reason: collision with root package name */
        public View f41370m;

        /* renamed from: n  reason: collision with root package name */
        public View f41371n;

        /* renamed from: o  reason: collision with root package name */
        public View f41372o;

        c0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41374b;

        d(int i4) {
            this.f41374b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                Context context = view.getContext();
                if (com.join.mgps.Util.j0.Y0(context)) {
                    ForumProfileFavoritesAdapter.this.f41337k.a(this.f41374b);
                    return;
                }
                com.join.mgps.Util.l2.a(context).b("用户未登录，请登录");
                com.join.mgps.Util.j0.L0(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41376b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41377c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41378d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41379e;

        /* renamed from: f  reason: collision with root package name */
        public View f41380f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f41381g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f41382h;

        /* renamed from: i  reason: collision with root package name */
        public RelativeLayout f41383i;

        /* renamed from: j  reason: collision with root package name */
        public VipView f41384j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f41385k;

        d0() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41387b;

        e(String str) {
            this.f41387b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f41387b);
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.c(parseInt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41389b;

        /* renamed from: c  reason: collision with root package name */
        public RelativeLayout f41390c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f41391d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f41392e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f41393f;

        e0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41395b;

        f(int i4) {
            this.f41395b = i4;
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
            if (action == 1 && !z4 && ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.d(this.f41395b);
            }
            return z4;
        }
    }

    /* loaded from: classes4.dex */
    class f0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public ImageView f41397b;

        f0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41399b;

        g(int i4) {
            this.f41399b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.d(this.f41399b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public StaticLayoutView f41401b;

        g0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f41403b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41404c;

        h(x xVar, int i4) {
            this.f41403b = xVar;
            this.f41404c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f41403b.f41573i.startAnimation(AnimationUtils.loadAnimation(ForumProfileFavoritesAdapter.this.f41330d, R.anim.scale_reset));
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.a(this.f41404c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public Button f41406b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41407c;

        /* renamed from: d  reason: collision with root package name */
        public View f41408d;

        /* renamed from: e  reason: collision with root package name */
        public View f41409e;

        h0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f41411b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f41412c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41413d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f41414e;

        i(ForumBean.GameInfo gameInfo, DownloadTask downloadTask, String str, String str2) {
            this.f41411b = gameInfo;
            this.f41412c = downloadTask;
            this.f41413d = str;
            this.f41414e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String plugin_num = this.f41411b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f41411b.getGame_down_url_remote());
                UtilsMy.T2(this.f41412c, ForumProfileFavoritesAdapter.this.f41330d);
                IntentUtil.getInstance().intentActivity(ForumProfileFavoritesAdapter.this.f41330d, intentDateBean);
                return;
            }
            Context context = view.getContext();
            com.papa.sim.statistic.p.l(context).s0(this.f41413d, this.f41414e, AccountUtil_.getInstance_(context).getUid());
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.e(this.f41414e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public Button f41416b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41417c;

        i0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41419b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41420c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f41421d;

        j(String str, String str2, ForumBean.GameInfo gameInfo) {
            this.f41419b = str;
            this.f41420c = str2;
            this.f41421d = gameInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            com.papa.sim.statistic.p.l(context).t0(this.f41419b, this.f41420c, AccountUtil_.getInstance_(context).getUid());
            com.join.mgps.Util.j0.I0(view.getContext(), this.f41421d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j0 extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41423b;

        /* renamed from: c  reason: collision with root package name */
        public FrameLayout f41424c;

        j0() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.c f41426b;

        k(k0.c cVar) {
            this.f41426b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41426b.f41441h).start();
        }
    }

    /* loaded from: classes4.dex */
    public static class k0 {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41428a;

        /* renamed from: b  reason: collision with root package name */
        Object f41429b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41430a;

            /* renamed from: b  reason: collision with root package name */
            public int f41431b;

            /* renamed from: c  reason: collision with root package name */
            public String f41432c;

            public a() {
            }

            public a(boolean z4, int i4, String str) {
                this.f41430a = z4;
                this.f41431b = i4;
                this.f41432c = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public ForumData.ForumUserFavoritesData f41433a;

            public b() {
            }

            public ForumData.ForumUserFavoritesData a() {
                return this.f41433a;
            }

            public void b(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
                this.f41433a = forumUserFavoritesData;
            }

            public b(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
                this.f41433a = forumUserFavoritesData;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f41434a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f41435b;

            /* renamed from: c  reason: collision with root package name */
            public String f41436c;

            /* renamed from: d  reason: collision with root package name */
            public String f41437d;

            /* renamed from: e  reason: collision with root package name */
            public int f41438e;

            /* renamed from: f  reason: collision with root package name */
            public int f41439f;

            /* renamed from: g  reason: collision with root package name */
            public int f41440g;

            /* renamed from: h  reason: collision with root package name */
            public int f41441h;

            /* renamed from: i  reason: collision with root package name */
            public int f41442i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f41443j;

            /* renamed from: k  reason: collision with root package name */
            public String f41444k;

            public c() {
            }

            public c(int i4, String str, String str2, String str3, int i5, int i6, int i7, int i8, boolean z4, int i9) {
                this.f41434a = i4;
                this.f41444k = str;
                this.f41436c = str2;
                this.f41437d = str3;
                this.f41438e = i5;
                this.f41439f = i6;
                this.f41440g = i7;
                this.f41441h = i9;
                this.f41442i = i8;
                this.f41443j = z4;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f41445a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f41446b;

            /* renamed from: c  reason: collision with root package name */
            public int f41447c;

            public d(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f41445a = list;
                this.f41446b = list2;
                this.f41447c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class e implements com.join.android.app.component.optimizetext.c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41448a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f41449b;

            /* renamed from: c  reason: collision with root package name */
            public String f41450c;

            /* renamed from: d  reason: collision with root package name */
            public int f41451d;

            /* renamed from: e  reason: collision with root package name */
            public int f41452e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f41453f;

            /* renamed from: g  reason: collision with root package name */
            public String f41454g;

            /* renamed from: h  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41455h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f41456i;

            /* renamed from: j  reason: collision with root package name */
            public SpannableStringBuilder f41457j;

            public e() {
            }

            @Override // com.join.android.app.component.optimizetext.c
            public SpannableStringBuilder a() {
                return this.f41457j;
            }

            @Override // com.join.android.app.component.optimizetext.c
            public String b() {
                return this.f41451d + "";
            }

            public e(boolean z4, boolean z5, String str, int i4, int i5, boolean z6, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, boolean z7, SpannableStringBuilder spannableStringBuilder) {
                this.f41448a = z4;
                this.f41449b = z5;
                this.f41450c = str;
                this.f41451d = i4;
                this.f41452e = i5;
                this.f41453f = z6;
                this.f41454g = str2;
                this.f41455h = list;
                this.f41456i = z7;
                this.f41457j = spannableStringBuilder;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41458a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f41459b;

            /* renamed from: c  reason: collision with root package name */
            public String f41460c;

            /* renamed from: d  reason: collision with root package name */
            public int f41461d;

            /* renamed from: e  reason: collision with root package name */
            public int f41462e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f41463f;

            /* renamed from: g  reason: collision with root package name */
            public String f41464g;

            /* renamed from: h  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41465h;

            /* renamed from: i  reason: collision with root package name */
            public List<RecommendLabelTag> f41466i;

            /* renamed from: j  reason: collision with root package name */
            public String f41467j;

            public f() {
            }

            public f(boolean z4, boolean z5, String str, int i4, int i5, boolean z6, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, String str3) {
                this.f41458a = z4;
                this.f41459b = z5;
                this.f41460c = str;
                this.f41461d = i4;
                this.f41462e = i5;
                this.f41463f = z6;
                this.f41464g = str2;
                this.f41465h = list;
                this.f41466i = list2;
                this.f41467j = str3;
            }

            public f(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2) {
                this.f41459b = z4;
                this.f41460c = str;
                this.f41461d = i4;
                this.f41462e = i5;
                this.f41463f = z5;
                this.f41464g = str2;
                this.f41465h = list;
                this.f41466i = list2;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public String f41468a;

            /* renamed from: b  reason: collision with root package name */
            public String f41469b;

            /* renamed from: c  reason: collision with root package name */
            public String f41470c;

            public g(String str, String str2, String str3) {
                this.f41468a = str;
                this.f41469b = str2;
                this.f41470c = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public int f41471a;

            /* renamed from: b  reason: collision with root package name */
            public String f41472b;

            /* renamed from: c  reason: collision with root package name */
            public int f41473c;

            /* renamed from: d  reason: collision with root package name */
            public int f41474d;

            /* renamed from: e  reason: collision with root package name */
            public int f41475e;

            /* renamed from: f  reason: collision with root package name */
            public int f41476f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41477g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41478h;

            public h() {
            }

            public h(int i4, int i5, String str, int i6, int i7, int i8, boolean z4, boolean z5) {
                this.f41471a = i4;
                this.f41476f = i5;
                this.f41472b = str;
                this.f41473c = i6;
                this.f41474d = i7;
                this.f41475e = i8;
                this.f41477g = z4;
                this.f41478h = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41482a;

            /* renamed from: b  reason: collision with root package name */
            public String f41483b;

            /* renamed from: c  reason: collision with root package name */
            public String f41484c;

            /* renamed from: d  reason: collision with root package name */
            public long f41485d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41486e;

            /* renamed from: f  reason: collision with root package name */
            public int f41487f;

            /* renamed from: g  reason: collision with root package name */
            public int f41488g;

            /* renamed from: h  reason: collision with root package name */
            public int f41489h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f41490i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f41491j;

            /* renamed from: k  reason: collision with root package name */
            public int f41492k;

            /* renamed from: l  reason: collision with root package name */
            public int f41493l;

            /* renamed from: m  reason: collision with root package name */
            private String f41494m;

            /* renamed from: n  reason: collision with root package name */
            private String f41495n;

            public j() {
            }

            public j(boolean z4, String str, String str2, long j4, boolean z5, int i4, int i5, boolean z6, boolean z7, int i6, int i7, String str3, String str4, int i8) {
                this.f41482a = z4;
                this.f41483b = str;
                this.f41484c = str2;
                this.f41485d = j4;
                this.f41486e = z5;
                this.f41487f = i4;
                this.f41488g = i5;
                this.f41489h = i8;
                this.f41490i = z6;
                this.f41491j = z7;
                this.f41492k = i6;
                this.f41493l = i7;
                this.f41494m = str3;
                this.f41495n = str4;
            }
        }

        /* loaded from: classes4.dex */
        public static class k {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f41496a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f41497b;

            /* renamed from: c  reason: collision with root package name */
            public int f41498c;

            public k(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f41496a = list;
                this.f41497b = list2;
                this.f41498c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class l implements com.join.android.app.component.optimizetext.c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41499a;

            /* renamed from: b  reason: collision with root package name */
            public String f41500b;

            /* renamed from: c  reason: collision with root package name */
            public int f41501c;

            /* renamed from: d  reason: collision with root package name */
            public int f41502d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41503e;

            /* renamed from: f  reason: collision with root package name */
            public String f41504f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41505g;

            /* renamed from: h  reason: collision with root package name */
            public SpannableStringBuilder f41506h;

            public l() {
            }

            @Override // com.join.android.app.component.optimizetext.c
            public SpannableStringBuilder a() {
                return this.f41506h;
            }

            @Override // com.join.android.app.component.optimizetext.c
            public String b() {
                return this.f41501c + "";
            }

            public l(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, SpannableStringBuilder spannableStringBuilder) {
                this.f41499a = z4;
                this.f41500b = str;
                this.f41501c = i4;
                this.f41502d = i5;
                this.f41503e = z5;
                this.f41504f = str2;
                this.f41505g = list;
                this.f41506h = spannableStringBuilder;
            }
        }

        /* loaded from: classes4.dex */
        public static class m {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41507a;

            /* renamed from: b  reason: collision with root package name */
            public String f41508b;

            /* renamed from: c  reason: collision with root package name */
            public int f41509c;

            /* renamed from: d  reason: collision with root package name */
            public int f41510d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41511e;

            /* renamed from: f  reason: collision with root package name */
            public String f41512f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41513g;

            public m() {
            }

            public m(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f41507a = z4;
                this.f41508b = str;
                this.f41509c = i4;
                this.f41510d = i5;
                this.f41511e = z5;
                this.f41512f = str2;
                this.f41513g = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class n {

            /* renamed from: a  reason: collision with root package name */
            public int f41514a;

            /* renamed from: b  reason: collision with root package name */
            public String f41515b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f41516c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f41517d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41518e;

            public n() {
            }

            public n(int i4, String str, boolean z4, boolean z5, boolean z6) {
                this.f41514a = i4;
                this.f41515b = str;
                this.f41516c = z4;
                this.f41517d = z5;
                this.f41518e = z6;
            }
        }

        /* loaded from: classes4.dex */
        public static class o {

            /* renamed from: a  reason: collision with root package name */
            public String f41519a;

            /* renamed from: b  reason: collision with root package name */
            public String f41520b;

            /* renamed from: c  reason: collision with root package name */
            public String f41521c;

            public o(String str, String str2, String str3) {
                this.f41519a = str;
                this.f41520b = str2;
                this.f41521c = str3;
            }
        }

        public k0() {
        }

        public Object a() {
            return this.f41429b;
        }

        public ViewType b() {
            return this.f41428a;
        }

        public void c(Object obj) {
            this.f41429b = obj;
        }

        public void d(ViewType viewType) {
            this.f41428a = viewType;
        }

        public k0(ViewType viewType, Object obj) {
            this.f41428a = viewType;
            this.f41429b = obj;
        }

        /* loaded from: classes4.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41479a;

            /* renamed from: b  reason: collision with root package name */
            public String f41480b;

            /* renamed from: c  reason: collision with root package name */
            public ForumBean.GameInfo f41481c;

            public i(boolean z4, String str, ForumBean.GameInfo gameInfo) {
                this.f41479a = z4;
                this.f41480b = str;
                this.f41481c = gameInfo;
            }

            public i(String str, ForumBean.GameInfo gameInfo) {
                this.f41480b = str;
                this.f41481c = gameInfo;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.j f41522b;

        l(k0.j jVar) {
            this.f41522b = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41522b.f41489h).start();
        }
    }

    /* loaded from: classes4.dex */
    class l0 {
        l0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41525b;

        m(int i4) {
            this.f41525b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileFavoritesAdapter.this.f41337k != null) {
                ForumProfileFavoritesAdapter.this.f41337k.a(this.f41525b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41527b;

        n(int i4) {
            this.f41527b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(this.f41527b);
            com.join.mgps.Util.j0.v0(view.getContext(), forumPostsBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f41529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41530c;

        o(List list, int i4) {
            this.f41529b = list;
            this.f41530c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f41529b.size()];
            this.f41529b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f41530c, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f41532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41533c;

        p(List list, int i4) {
            this.f41532b = list;
            this.f41533c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f41532b.size()];
            this.f41532b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f41533c, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41535b;

        q(String str) {
            this.f41535b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.Q0(view.getContext(), this.f41535b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f41537b;

        public r(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f41537b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            DownloadTask downloadTask = this.f41537b.getDownloadTask();
            if (downloadTask == null) {
                if (UtilsMy.o0(this.f41537b.getTag_info())) {
                    if (this.f41537b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(context).d(context, this.f41537b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, this.f41537b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f41537b.getVer()) || l4.d() >= Integer.parseInt(this.f41537b.getVer())) {
                                com.join.android.app.common.utils.e.l0(context);
                                APKUtils.a0(context, this.f41537b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(context).d(context, this.f41537b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f41537b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(context);
                            APKUtils.V(context, this.f41537b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(context, this.f41537b);
                return;
            }
            String plugin_num = this.f41537b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f41537b.getDown_url_remote());
                UtilsMy.T2(downloadTask, context);
                IntentUtil.getInstance().intentActivity(context, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            CollectionBeanSubBusiness collectionBeanSubBusiness = this.f41537b;
            if (collectionBeanSubBusiness != null && UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), this.f41537b.getCrc_sign_id()) > 0) {
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
                                        if (!com.join.android.app.common.utils.j.j(context)) {
                                            com.join.mgps.Util.l2.a(context).b("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(context, downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(context)) {
                                                    com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(context, downloadTask);
                                                    return;
                                                }
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
                        com.php25.PDownload.d.c(downloadTask, context);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(context, downloadTask);
                return;
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f41537b;
            if (collectionBeanSubBusiness2 != null) {
                if (UtilsMy.y0(collectionBeanSubBusiness2.getPay_tag_info(), this.f41537b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(context, this.f41537b.getCrc_sign_id());
                    return;
                }
                UtilsMy.y1(downloadTask, this.f41537b);
                if (UtilsMy.o1(context, downloadTask)) {
                    return;
                }
                if (this.f41537b.getDown_status() == 5) {
                    UtilsMy.l1(context, downloadTask);
                } else {
                    UtilsMy.R0(context, downloadTask, this.f41537b.getTp_down_url(), this.f41537b.getOther_down_switch(), this.f41537b.getCdn_down_switch());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private final Object f41539b;

        public s(Object obj) {
            this.f41539b = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4;
            int i5;
            int i6;
            Context context = view.getContext();
            DownloadTask downloadTask = (DownloadTask) this.f41539b;
            if (downloadTask != null) {
                downloadTask.getVer();
                downloadTask.getVer_name();
                downloadTask.getPackageName();
                downloadTask.getTipBeans();
                downloadTask.getSource_down_url();
                List<DownloadUrlBean> tp_down_url = downloadTask.getTp_down_url();
                int other_down_switch = downloadTask.getOther_down_switch();
                int cdn_down_switch = downloadTask.getCdn_down_switch();
                Object obj = this.f41539b;
                if (obj instanceof CollectionBeanSubBusiness) {
                    CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) obj;
                    downloadTask = collectionBeanSubBusiness.getDownloadTask();
                    collectionBeanSubBusiness.getVer();
                    if (collectionBeanSubBusiness.getPay_tag_info() != null) {
                        i6 = collectionBeanSubBusiness.getPay_tag_info().getPay_game_amount();
                        i4 = i6;
                    } else {
                        i6 = 0;
                        i4 = 0;
                    }
                    if (i6 > 0) {
                        b2.e0.o().p(collectionBeanSubBusiness.getCrc_sign_id());
                    }
                } else if (obj instanceof RecomDatabeanBusiness) {
                    AppBean game_info = ((RecomDatabeanBusiness) obj).getSub().get(0).getGame_info();
                    if (game_info.getPay_tag_info() != null) {
                        i5 = game_info.getPay_tag_info().getPay_game_amount();
                        i4 = i5;
                    } else {
                        i5 = 0;
                        i4 = 0;
                    }
                    if (i5 > 0) {
                        b2.e0.o().p(game_info.getCrc_sign_id());
                    }
                } else {
                    i4 = 0;
                }
                String plugin_num = downloadTask.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    IntentDateBean intentDateBean = new IntentDateBean();
                    intentDateBean.setLink_type(4);
                    intentDateBean.setLink_type_val(downloadTask.getUrl());
                    UtilsMy.T2(downloadTask, context);
                    IntentUtil.getInstance().intentActivity(context, intentDateBean);
                    return;
                }
                int status = downloadTask.getStatus();
                if (UtilsMy.x0(i4, downloadTask.getCrc_link_type_val()) > 0) {
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
                                            if (!com.join.android.app.common.utils.j.j(context)) {
                                                com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.r4(context, downloadTask);
                                                return;
                                            }
                                        } else if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    if (!com.join.android.app.common.utils.j.j(context)) {
                                                        com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                        return;
                                                    } else {
                                                        UtilsMy.I2(context, downloadTask);
                                                        return;
                                                    }
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
                            com.php25.PDownload.d.c(downloadTask, context);
                            return;
                        }
                        com.php25.PDownload.d.i(downloadTask);
                        return;
                    }
                    com.php25.PDownload.d.l(context, downloadTask);
                    return;
                }
                if (UtilsMy.x0(i4, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(context, downloadTask.getCrc_link_type_val());
                    return;
                }
                Object obj2 = this.f41539b;
                if (obj2 instanceof CollectionBeanSubBusiness) {
                    CollectionBeanSubBusiness collectionBeanSubBusiness2 = (CollectionBeanSubBusiness) obj2;
                    UtilsMy.y1(downloadTask, collectionBeanSubBusiness2);
                    if (UtilsMy.o1(context, downloadTask)) {
                        return;
                    }
                    if (collectionBeanSubBusiness2.getDown_status() == 5) {
                        UtilsMy.l1(context, downloadTask);
                    } else {
                        UtilsMy.R0(context, downloadTask, tp_down_url, other_down_switch, cdn_down_switch);
                    }
                } else if (obj2 instanceof RecomDatabeanBusiness) {
                    AppBean game_info2 = ((RecomDatabeanBusiness) obj2).getSub().get(0).getGame_info();
                    UtilsMy.x1(downloadTask, game_info2);
                    if (UtilsMy.o1(context, downloadTask)) {
                        return;
                    }
                    if (game_info2.getDown_status() == 5) {
                        UtilsMy.l1(context, downloadTask);
                    } else {
                        UtilsMy.R0(context, downloadTask, tp_down_url, other_down_switch, cdn_down_switch);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public View f41541b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41542c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41543d;

        t() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface u {
        void a(int i4);

        void b(int i4);

        void c(int i4);

        void d(int i4);

        void e(String str);

        void f(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41545b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41546c;

        /* renamed from: d  reason: collision with root package name */
        public Button f41547d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f41548e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f41549f;

        v() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public class w extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41551b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f41552c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41553d;

        /* renamed from: e  reason: collision with root package name */
        public RelativeLayout f41554e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f41555f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f41556g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f41557h;

        /* renamed from: i  reason: collision with root package name */
        public LinearLayout f41558i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f41559j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f41560k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f41561l;

        /* renamed from: m  reason: collision with root package name */
        public ProgressBar f41562m;

        /* renamed from: n  reason: collision with root package name */
        public View f41563n;

        /* renamed from: o  reason: collision with root package name */
        public View f41564o;

        public w() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41566b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41567c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41568d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41569e;

        /* renamed from: f  reason: collision with root package name */
        public View f41570f;

        /* renamed from: g  reason: collision with root package name */
        public View f41571g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f41572h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f41573i;

        /* renamed from: j  reason: collision with root package name */
        public SimpleDraweeView f41574j;

        x() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public View f41576b;

        /* renamed from: c  reason: collision with root package name */
        public View f41577c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f41578d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f41579e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f41580f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f41581g;

        y() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public StaticLayoutView f41583b;

        /* renamed from: c  reason: collision with root package name */
        public View f41584c;

        /* renamed from: d  reason: collision with root package name */
        public View f41585d;

        z() {
            super();
        }
    }

    public ForumProfileFavoritesAdapter(Context context, com.join.android.app.component.video.c cVar) {
        this.f41330d = context;
        this.f41332f = cVar;
        this.f41328b = new com.join.android.app.component.optimizetext.b(context);
        this.f41329c = y(context);
        d();
        A();
    }

    private void A() {
        if (this.f41334h == null) {
            this.f41334h = z();
        }
    }

    private void B(TextView textView, int i4) {
        textView.setOnTouchListener(new f(i4));
    }

    private void C(x xVar, boolean z4, int i4, int i5) {
        TextView textView = xVar.f41568d;
        ImageView imageView = xVar.f41573i;
        if (z4) {
            imageView.setImageResource(R.drawable.like);
            textView.setText(i4 + "");
            textView.setTextColor(Color.parseColor("#d92a0c"));
        } else {
            imageView.setImageResource(R.drawable.unlike);
            textView.setText(i4 + "");
            textView.setTextColor(Color.parseColor("#a9a9a9"));
        }
        ((View) xVar.f41568d.getParent()).setOnClickListener(new h(xVar, i5));
    }

    private void E(e0 e0Var, k0.k kVar) {
        if (kVar != null && kVar.f41496a.size() != 0) {
            if (this.f41334h == null) {
                this.f41334h = z();
            }
            List<String> list = kVar.f41497b;
            TextView textView = e0Var.f41389b;
            if (list != null && list.size() > 3) {
                textView.setVisibility(0);
                textView.setText("共" + list.size() + "张");
            } else {
                textView.setVisibility(8);
            }
            SimpleDraweeView[] simpleDraweeViewArr = {e0Var.f41391d, e0Var.f41392e, e0Var.f41393f};
            int i4 = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i5];
                if (i5 >= kVar.f41496a.size()) {
                    simpleDraweeView.setVisibility(8);
                } else {
                    ForumBean.ForumPostsBean.ResBean resBean = kVar.f41496a.get(i5);
                    if (resBean.getType().equals("pic")) {
                        O(simpleDraweeView, i5, resBean.getThumb(), i5 - i4, list);
                    } else if (resBean.getType().equals("video")) {
                        i4++;
                        Z(simpleDraweeView, i5, resBean.getThumb(), resBean.getRaw());
                    }
                }
            }
            return;
        }
        e0Var.f41390c.setVisibility(8);
    }

    private void F(View view, boolean z4, int i4) {
        TextView textView = (TextView) view.findViewById(R.id.forum_post_praise);
        ImageView imageView = (ImageView) view.findViewById(R.id.forum_post_praise_icon);
        if (z4) {
            imageView.setImageResource(R.drawable.like);
            textView.setText(i4 + "");
            return;
        }
        imageView.setImageResource(R.drawable.unlike);
        textView.setText(i4 + "");
    }

    private void G(View view, ForumBean.ForumPostsBean forumPostsBean) {
        boolean is_praise = forumPostsBean.is_praise();
        int praise = forumPostsBean.getPraise();
        forumPostsBean.setPraise(is_praise ? praise - 1 : praise + 1);
        forumPostsBean.setIs_praise(!is_praise);
        F(view, forumPostsBean.is_praise(), forumPostsBean.getPraise());
    }

    private void H(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
        I(textView, str, z4, z5, str2, list, null, 0, "");
    }

    private void I(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, int i4, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        com.join.mgps.Util.j0.h(textView.getContext(), spannableStringBuilder, list);
        com.join.mgps.Util.j0.g(textView, spannableStringBuilder, z4, z5, str2);
        com.join.mgps.Util.j0.i(textView.getContext(), spannableStringBuilder, list2, i4, str3);
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
    }

    private void W(ImageView imageView, String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        Context context = imageView.getContext();
        int i4 = context.getResources().getDisplayMetrics().widthPixels - (((int) (context.getResources().getDisplayMetrics().scaledDensity * 6.0f)) * 2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = (int) ((i4 * 1.0f) / 1.8f);
        imageView.setLayoutParams(layoutParams);
    }

    private void X(View view, CharSequence charSequence) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        } else if (view instanceof Button) {
            ((Button) view).setText(charSequence);
        }
    }

    private void Y(View view, int i4) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(i4);
        } else if (view instanceof Button) {
            ((Button) view).setTextColor(i4);
        }
    }

    private void b0(c0 c0Var, int i4) {
        if (i4 == 0) {
            c0Var.f41364g.setVisibility(8);
            c0Var.f41368k.setVisibility(8);
            c0Var.f41369l.setVisibility(8);
            c0Var.f41365h.setVisibility(0);
            c0Var.f41363f.setVisibility(0);
            return;
        }
        c0Var.f41364g.setVisibility(0);
        if (i4 == 17) {
            c0Var.f41368k.setVisibility(8);
            c0Var.f41369l.setVisibility(0);
        } else {
            c0Var.f41369l.setVisibility(8);
            c0Var.f41368k.setVisibility(0);
        }
        c0Var.f41365h.setVisibility(8);
        c0Var.f41363f.setVisibility(8);
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        t tVar;
        k0.a aVar;
        if (view != null) {
            tVar = (t) view.getTag();
        } else {
            tVar = new t();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_profile_favorites_header, (ViewGroup) null);
            tVar.f41541b = view.findViewById(R.id.forum_post_divider);
            tVar.f41542c = (TextView) view.findViewById(R.id.typeTv);
            tVar.f41543d = (TextView) view.findViewById(R.id.timestampTv);
            view.setTag(tVar);
        }
        try {
            aVar = (k0.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar == null) {
            return view;
        }
        if (aVar.f41430a) {
            tVar.f41541b.setVisibility(8);
        } else {
            tVar.f41541b.setVisibility(0);
        }
        int i5 = aVar.f41431b;
        if (i5 == 1) {
            tVar.f41542c.setText("游戏");
        } else if (i5 == 2) {
            tVar.f41542c.setText("帖子");
        } else {
            tVar.f41542c.setText("收藏");
        }
        if (TextUtils.isEmpty(aVar.f41432c)) {
            aVar.f41432c = "";
        }
        tVar.f41543d.setText(aVar.f41432c);
        return view;
    }

    private View k(int i4, View view, ViewGroup viewGroup) {
        x xVar;
        k0.c cVar;
        if (view != null) {
            xVar = (x) view.getTag();
        } else {
            xVar = new x();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_f_item_post_footer, (ViewGroup) null);
            xVar.f41574j = (SimpleDraweeView) view.findViewById(R.id.avatar);
            xVar.f41571g = view.findViewById(R.id.indicator);
            xVar.f41566b = (TextView) view.findViewById(R.id.groupName);
            xVar.f41567c = (TextView) view.findViewById(R.id.hostName);
            xVar.f41568d = (TextView) view.findViewById(R.id.likeCount);
            xVar.f41569e = (TextView) view.findViewById(R.id.commentCount);
            xVar.f41572h = (TextView) view.findViewById(R.id.forum_post_view);
            xVar.f41570f = view.findViewById(R.id.divider);
            xVar.f41573i = (ImageView) view.findViewById(R.id.forum_post_praise_icon);
            view.setTag(xVar);
        }
        try {
            cVar = (k0.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar != null && xVar != null) {
            if (cVar.f41435b) {
                xVar.f41570f.setVisibility(0);
            } else {
                xVar.f41570f.setVisibility(8);
            }
            if (cVar.f41434a == 0) {
                if (xVar.f41571g.getVisibility() != 0) {
                    xVar.f41571g.setVisibility(0);
                }
            } else if (xVar.f41571g.getVisibility() != 8) {
                xVar.f41571g.setVisibility(8);
            }
            xVar.f41566b.setText(cVar.f41436c);
            xVar.f41567c.setText(cVar.f41437d);
            TextView textView = xVar.f41568d;
            textView.setText(com.join.mgps.Util.j0.R(cVar.f41438e) + "");
            TextView textView2 = xVar.f41569e;
            textView2.setText(com.join.mgps.Util.j0.R(cVar.f41439f) + "");
            TextView textView3 = xVar.f41572h;
            textView3.setText(com.join.mgps.Util.j0.R(cVar.f41442i) + "");
            MyImageLoader.x(xVar.f41574j, cVar.f41444k);
            xVar.f41574j.setOnClickListener(new k(cVar));
            R(view, cVar.f41440g);
            C(xVar, cVar.f41443j, cVar.f41438e, cVar.f41440g);
            return view;
        }
        return view;
    }

    private View l(int i4, View view, ViewGroup viewGroup) {
        y yVar;
        View view2;
        k0.d dVar;
        if (view != null) {
            yVar = (y) view.getTag();
            view2 = view;
        } else {
            yVar = new y();
            View inflate = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_f_item_post_imgs, (ViewGroup) null);
            yVar.f41576b = inflate.findViewById(R.id.spaceT);
            yVar.f41577c = inflate.findViewById(R.id.imgsMain);
            yVar.f41578d = (SimpleDraweeView) inflate.findViewById(R.id.img_m_1);
            yVar.f41579e = (SimpleDraweeView) inflate.findViewById(R.id.img_m_2);
            yVar.f41580f = (SimpleDraweeView) inflate.findViewById(R.id.img_m_3);
            yVar.f41581g = (TextView) inflate.findViewById(R.id.images_count);
            inflate.setTag(yVar);
            view2 = inflate;
        }
        try {
            dVar = (k0.d) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (dVar == null) {
            return view2;
        }
        List<ForumBean.ForumPostsBean.ResBean> list = dVar.f41445a;
        if (list != null && list.size() != 0) {
            view2.setVisibility(0);
            List<String> list2 = dVar.f41446b;
            TextView textView = yVar.f41581g;
            int size = list2 != null ? list2.size() : 0;
            if (size > 3) {
                textView.setVisibility(0);
                textView.setText("共" + list2.size() + "张");
            } else {
                textView.setVisibility(8);
            }
            if (this.f41334h == null) {
                this.f41334h = z();
            }
            int i5 = 1;
            SimpleDraweeView[] simpleDraweeViewArr = {yVar.f41578d, yVar.f41579e, yVar.f41580f};
            int i6 = 0;
            int i7 = 0;
            while (i6 < 3) {
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i6];
                if (i6 >= dVar.f41445a.size()) {
                    simpleDraweeView.setVisibility(8);
                } else {
                    simpleDraweeView.setVisibility(0);
                    ForumBean.ForumPostsBean.ResBean resBean = dVar.f41445a.get(i6);
                    if (resBean.getType().equals("pic")) {
                        String thumb = resBean.getThumb();
                        Integer[] i02 = com.join.mgps.Util.j0.i0(thumb);
                        if (i6 == 0 && size == i5 && i02 != null && i02[0].intValue() != 0 && i02[i5].intValue() != 0) {
                            N(simpleDraweeView, i6, thumb, i6 - i7, list2);
                        } else {
                            O(simpleDraweeView, i6, thumb, i6 - i7, list2);
                        }
                    } else if (resBean.getType().equals("video")) {
                        i7++;
                        Z(simpleDraweeView, i6, resBean.getThumb(), resBean.getRaw());
                    }
                }
                i6++;
                i5 = 1;
            }
            R(view2, dVar.f41447c);
            return view2;
        }
        view2.setVisibility(8);
        return view2;
    }

    private View m(int i4, View view, ViewGroup viewGroup) {
        z zVar;
        k0.e eVar;
        if (view != null) {
            zVar = (z) view.getTag();
        } else {
            zVar = new z();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_f_item_post_message, (ViewGroup) null);
            zVar.f41583b = (StaticLayoutView) view.findViewById(R.id.msg);
            zVar.f41584c = view.findViewById(R.id.divider);
            zVar.f41585d = view.findViewById(R.id.spaceT);
            view.setTag(zVar);
        }
        try {
            eVar = (k0.e) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (eVar == null) {
            return view;
        }
        com.join.android.app.component.optimizetext.b bVar = this.f41328b;
        if (bVar.d(eVar.f41451d + "") == null) {
            this.f41328b.e(eVar);
        }
        StaticLayoutView staticLayoutView = zVar.f41583b;
        com.join.android.app.component.optimizetext.b bVar2 = this.f41328b;
        staticLayoutView.setLayout(bVar2.d(eVar.f41451d + ""));
        com.join.mgps.Util.j0.X0(zVar.f41583b);
        if (eVar.f41448a) {
            zVar.f41584c.setVisibility(0);
            zVar.f41585d.setVisibility(0);
        } else {
            zVar.f41584c.setVisibility(8);
            zVar.f41585d.setVisibility(8);
        }
        R(view, eVar.f41451d);
        return view;
    }

    private View n(int i4, View view, ViewGroup viewGroup) {
        a0 a0Var;
        k0.g gVar;
        if (view != null) {
            a0Var = (a0) view.getTag();
        } else {
            a0Var = new a0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_f_item_post_video, (ViewGroup) null);
            a0Var.f41347b = (FrameLayout) view.findViewById(R.id.videoContner);
            a0Var.f41348c = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            view.setTag(a0Var);
        }
        try {
            gVar = (k0.g) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (gVar == null) {
            return view;
        }
        String str = gVar.f41469b;
        String str2 = gVar.f41468a;
        if (a0Var.f41347b != null) {
            a0Var.f41347b.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f41344r));
            MyImageLoader.d(a0Var.f41348c, R.drawable.video_bg, str2);
            a0Var.f41348c.setTag(Integer.valueOf(i4));
            if (com.join.mgps.Util.g2.i(str)) {
                this.f41332f.e(i4, new c.l(i4, str, str2), new boolean[0]);
            }
        }
        return view;
    }

    private View o(int i4, View view, ViewGroup viewGroup) {
        b0 b0Var;
        k0.h hVar;
        if (view != null) {
            b0Var = (b0) view.getTag();
        } else {
            b0Var = new b0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_welcome_item_post_footer, (ViewGroup) null);
            b0Var.f41352b = (TextView) view.findViewById(R.id.forum_name);
            b0Var.f41353c = (TextView) view.findViewById(R.id.forum_post_view);
            b0Var.f41354d = (TextView) view.findViewById(R.id.forum_post_commit);
            b0Var.f41355e = (TextView) view.findViewById(R.id.forum_post_praise);
            view.setTag(b0Var);
        }
        try {
            hVar = (k0.h) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (hVar == null) {
            return view;
        }
        if (hVar.f41478h) {
            view.findViewById(R.id.post_footer_divider).setVisibility(0);
        } else {
            view.findViewById(R.id.post_footer_divider).setVisibility(8);
        }
        b0Var.f41352b.setText(hVar.f41472b);
        if (com.join.mgps.Util.g2.h(hVar.f41472b)) {
            ((ViewGroup) b0Var.f41352b.getParent()).setVisibility(8);
        } else {
            ((ViewGroup) b0Var.f41352b.getParent()).setVisibility(0);
        }
        TextView textView = b0Var.f41353c;
        com.join.mgps.Util.j0.D1(textView, hVar.f41473c + "", "0");
        TextView textView2 = b0Var.f41354d;
        com.join.mgps.Util.j0.D1(textView2, hVar.f41474d + "", "0");
        F(view, hVar.f41477g, hVar.f41475e);
        int i5 = hVar.f41471a;
        ((View) b0Var.f41355e.getParent()).setOnClickListener(new m(i5));
        T(view, i5);
        F((View) b0Var.f41355e.getParent(), hVar.f41477g, hVar.f41475e);
        V((View) b0Var.f41355e.getParent(), i5);
        return view;
    }

    private View p(int i4, View view, ViewGroup viewGroup) {
        c0 c0Var;
        View view2;
        k0.i iVar;
        if (view != null) {
            c0Var = (c0) view.getTag();
            view2 = view;
        } else {
            c0Var = new c0();
            View inflate = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_post_activity_item_post_game, (ViewGroup) null);
            c0Var.f41359b = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
            c0Var.f41360c = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
            c0Var.f41361d = (Button) inflate.findViewById(R.id.mgListviewItemInstall);
            c0Var.f41362e = (TextView) inflate.findViewById(R.id.mgListviewItemSize);
            c0Var.f41363f = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
            c0Var.f41364g = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
            c0Var.f41365h = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
            c0Var.f41366i = (TextView) inflate.findViewById(R.id.appSize);
            c0Var.f41367j = (TextView) inflate.findViewById(R.id.loding_info);
            c0Var.f41368k = (ProgressBar) inflate.findViewById(R.id.progressBar);
            c0Var.f41369l = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
            c0Var.f41370m = inflate.findViewById(R.id.line);
            c0Var.f41371n = inflate.findViewById(R.id.relateLayoutApp);
            c0Var.f41372o = inflate.findViewById(R.id.divider);
            inflate.setTag(c0Var);
            view2 = inflate;
        }
        try {
            iVar = (k0.i) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (iVar == null) {
            return view2;
        }
        ForumBean.GameInfo gameInfo = iVar.f41481c;
        String str = iVar.f41480b;
        String game_id = gameInfo.getGame_id();
        if (iVar.f41479a) {
            if (c0Var.f41372o.getVisibility() != 0) {
                c0Var.f41372o.setVisibility(0);
            }
        } else if (c0Var.f41372o.getVisibility() != 8) {
            c0Var.f41372o.setVisibility(8);
        }
        c0Var.f41361d.setBackgroundResource(R.drawable.detial_fourm_butn_selector1);
        int dimensionPixelSize = this.f41330d.getResources().getDimensionPixelSize(R.dimen.forum_posts_activity_gameinfo_download_width);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c0Var.f41361d.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        c0Var.f41361d.setLayoutParams(layoutParams);
        c0Var.f41360c.setText(gameInfo.getGame_name());
        c0Var.f41363f.setText(gameInfo.getGame_desc());
        String game_size = gameInfo.getGame_size();
        MyImageLoader.j(c0Var.f41359b, gameInfo.getGame_ico_remote(), MyImageLoader.A(this.f41330d));
        List<ForumBean.GameInfo.GameTagInfo> game_tag_info = gameInfo.getGame_tag_info();
        b0(c0Var, 0);
        DownloadTask downloadTask = gameInfo.getDownloadTask();
        if (downloadTask != null) {
            L(c0Var, downloadTask);
        } else {
            if (gameInfo.getPay_tag_info() != null && gameInfo.getPay_tag_info().getPay_game_amount() > 0 && !b2.e0.o().p(gameInfo.getGame_id())) {
                K(c0Var.f41361d, gameInfo.getPay_tag_info().getPay_game_amount());
            } else {
                J(c0Var.f41361d, gameInfo.getDown_status());
            }
            c0Var.f41361d.setOnClickListener(new i(gameInfo, downloadTask, str, game_id));
        }
        if ((ConstantIntEnum.H5.value() + "").equals(gameInfo.getPlugin_num())) {
            c0Var.f41365h.setVisibility(8);
            c0Var.f41361d.setBackgroundResource(R.drawable.recom_blue_butn);
            c0Var.f41361d.setText("开始");
            c0Var.f41361d.setTextColor(this.f41330d.getResources().getColor(R.color.app_blue_color));
        } else {
            c0Var.f41365h.setVisibility(0);
            com.join.mgps.Util.j0.c(game_tag_info, c0Var.f41365h, this.f41330d);
            UtilsMy.I(gameInfo.getScore(), gameInfo.getDown_count(), game_size, gameInfo.getSp_tag_info(), null, c0Var.f41365h, this.f41330d);
            UtilsMy.j3(gameInfo.getSp_tag_info(), view2, downloadTask);
        }
        c0Var.f41371n.setOnClickListener(new j(str, game_id, gameInfo));
        return view2;
    }

    private View q(int i4, View view, ViewGroup viewGroup) {
        d0 d0Var;
        k0.j jVar;
        if (view != null) {
            d0Var = (d0) view.getTag();
        } else {
            d0Var = new d0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_welcome_item_post_header, (ViewGroup) null);
            d0Var.f41380f = view.findViewById(R.id.forum_post_divider);
            d0Var.f41376b = (SimpleDraweeView) view.findViewById(R.id.forum_post_avatar_src);
            d0Var.f41377c = (TextView) view.findViewById(R.id.forum_post_nickname);
            d0Var.f41378d = (TextView) view.findViewById(R.id.forum_post_add_time);
            d0Var.f41379e = (TextView) view.findViewById(R.id.forum_post_stickie);
            d0Var.f41383i = (RelativeLayout) view.findViewById(R.id.forumExtFunc);
            d0Var.f41382h = (ImageView) view.findViewById(R.id.forum_post_moderator);
            d0Var.f41384j = (VipView) view.findViewById(R.id.vipFlag);
            d0Var.f41385k = (TextView) view.findViewById(R.id.copperTitleTv);
            view.setTag(d0Var);
        }
        try {
            jVar = (k0.j) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (jVar == null) {
            return view;
        }
        UtilsMy.A3(this.f41330d, d0Var.f41377c, jVar.f41492k, jVar.f41493l, R.color.forum_nickname_color);
        d0Var.f41384j.setVipData(jVar.f41492k, jVar.f41493l);
        d0Var.f41383i.setVisibility(0);
        jVar.f41482a = true;
        d0Var.f41380f.setVisibility(8);
        d0Var.f41377c.setText(jVar.f41484c);
        d0Var.f41378d.setText(com.join.android.app.common.utils.g.a(jVar.f41485d * 1000));
        if (jVar.f41486e) {
            d0Var.f41379e.setVisibility(0);
        } else {
            d0Var.f41379e.setVisibility(8);
        }
        if (jVar.f41491j) {
            d0Var.f41382h.setVisibility(0);
        } else {
            d0Var.f41382h.setVisibility(8);
        }
        MyImageLoader.x(d0Var.f41376b, jVar.f41483b);
        d0Var.f41376b.setOnClickListener(new l(jVar));
        int i5 = jVar.f41487f;
        T(view, i5);
        a0(d0Var.f41383i, i5);
        com.join.mgps.Util.j0.S0(d0Var.f41376b, d0Var.f41377c, d0Var.f41378d);
        com.join.mgps.Util.j0.U0(d0Var.f41384j);
        String str = jVar.f41494m;
        String str2 = jVar.f41495n;
        if (d0Var.f41385k != null) {
            if (!TextUtils.isEmpty(str)) {
                d0Var.f41385k.setVisibility(0);
                d0Var.f41385k.setText(str);
                Drawable drawable = this.f41330d.getResources().getDrawable(R.drawable.forum_post_host);
                if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                    str2 = "#2fccdf";
                }
                drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                d0Var.f41385k.setBackgroundDrawable(drawable);
            } else {
                d0Var.f41385k.setVisibility(8);
            }
        }
        return view;
    }

    private View r(int i4, View view, ViewGroup viewGroup) {
        e0 e0Var;
        k0.k kVar;
        if (view != null) {
            e0Var = (e0) view.getTag();
        } else {
            e0Var = new e0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_welcome_item_post_thumbnail, (ViewGroup) null);
            e0Var.f41390c = (RelativeLayout) view.findViewById(R.id.forum_post_media_container);
            e0Var.f41389b = (TextView) view.findViewById(R.id.images_count);
            e0Var.f41391d = (SimpleDraweeView) view.findViewById(R.id.img_m_1);
            e0Var.f41392e = (SimpleDraweeView) view.findViewById(R.id.img_m_2);
            e0Var.f41393f = (SimpleDraweeView) view.findViewById(R.id.img_m_3);
            view.setTag(e0Var);
        }
        try {
            kVar = (k0.k) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (kVar == null) {
            return view;
        }
        E(e0Var, kVar);
        T(view, kVar.f41498c);
        return view;
    }

    private View s(int i4, View view, ViewGroup viewGroup) {
        g0 g0Var;
        k0.l lVar;
        if (view != null) {
            g0Var = (g0) view.getTag();
        } else {
            g0Var = new g0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_post_activity_item_post_message1, (ViewGroup) null);
            g0Var.f41401b = (StaticLayoutView) view.findViewById(R.id.forum_post_message);
            view.setTag(g0Var);
        }
        try {
            lVar = (k0.l) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (lVar == null) {
            return view;
        }
        com.join.android.app.component.optimizetext.b bVar = this.f41328b;
        if (bVar.d(lVar.f41501c + "") == null) {
            this.f41328b.e(lVar);
        }
        StaticLayoutView staticLayoutView = g0Var.f41401b;
        com.join.android.app.component.optimizetext.b bVar2 = this.f41328b;
        staticLayoutView.setLayout(bVar2.d(lVar.f41501c + ""));
        com.join.mgps.Util.j0.X0(g0Var.f41401b);
        T(view, lVar.f41501c);
        return view;
    }

    private View t(int i4, View view, ViewGroup viewGroup) {
        h0 h0Var;
        k0.f fVar;
        if (view != null) {
            h0Var = (h0) view.getTag();
        } else {
            h0Var = new h0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_f_item_post_subject, (ViewGroup) null);
            h0Var.f41406b = (Button) view.findViewById(R.id.best);
            h0Var.f41407c = (TextView) view.findViewById(R.id.subject);
            h0Var.f41409e = view.findViewById(R.id.subjectMain);
            h0Var.f41408d = view.findViewById(R.id.forum_post_divider);
            view.setTag(h0Var);
        }
        try {
            fVar = (k0.f) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (fVar == null) {
            return view;
        }
        if (fVar.f41458a) {
            h0Var.f41408d.setVisibility(0);
        } else {
            h0Var.f41408d.setVisibility(8);
        }
        h0Var.f41407c.setMovementMethod(LinkMovementMethod.getInstance());
        I(h0Var.f41407c, fVar.f41460c, fVar.f41459b, fVar.f41463f, fVar.f41464g, fVar.f41465h, fVar.f41466i, fVar.f41462e, fVar.f41467j);
        int i5 = fVar.f41461d;
        B(h0Var.f41407c, i5);
        R(view, i5);
        return view;
    }

    private View u(int i4, View view, ViewGroup viewGroup) {
        i0 i0Var;
        k0.m mVar;
        if (view != null) {
            i0Var = (i0) view.getTag();
        } else {
            i0Var = new i0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_welcome_item_post_subject, (ViewGroup) null);
            i0Var.f41416b = (Button) view.findViewById(R.id.forum_post_best);
            i0Var.f41417c = (TextView) view.findViewById(R.id.forum_post_subject);
            view.setTag(i0Var);
        }
        try {
            mVar = (k0.m) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (mVar == null) {
            return view;
        }
        H(i0Var.f41417c, mVar.f41508b, mVar.f41507a, mVar.f41511e, mVar.f41512f, mVar.f41513g);
        T(view, mVar.f41509c);
        return view;
    }

    private View v(int i4, View view, ViewGroup viewGroup) {
        v vVar;
        k0.n nVar;
        try {
            if (view != null) {
                vVar = (v) view.getTag();
            } else {
                vVar = new v();
                view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_forum_activity_top_item, (ViewGroup) null);
                vVar.f41545b = (TextView) view.findViewById(R.id.forum_post_subject);
                vVar.f41546c = (TextView) view.findViewById(R.id.forum_post_stickie);
                vVar.f41547d = (Button) view.findViewById(R.id.forum_post_best);
                vVar.f41548e = (ImageView) view.findViewById(R.id.forum_post_pic);
                vVar.f41549f = (ImageView) view.findViewById(R.id.forum_post_video);
                view.setTag(vVar);
            }
            nVar = (k0.n) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (nVar == null) {
            return view;
        }
        if (com.join.mgps.Util.g2.h(nVar.f41515b)) {
            vVar.f41545b.setVisibility(8);
        } else {
            vVar.f41545b.setVisibility(0);
            vVar.f41545b.setText(nVar.f41515b);
        }
        if (nVar.f41516c) {
            vVar.f41547d.setVisibility(0);
        } else {
            vVar.f41547d.setVisibility(8);
        }
        if (nVar.f41517d) {
            vVar.f41548e.setVisibility(0);
        } else {
            vVar.f41548e.setVisibility(8);
        }
        if (nVar.f41518e) {
            vVar.f41549f.setVisibility(0);
        } else {
            vVar.f41549f.setVisibility(8);
        }
        view.setOnClickListener(new n(nVar.f41514a));
        return view;
    }

    private int w(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f41333g == 0) {
            Resources resources = context.getResources();
            this.f41333g = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.f41333g;
    }

    private View x(int i4, View view, ViewGroup viewGroup) {
        j0 j0Var;
        k0.o oVar;
        if (view != null) {
            j0Var = (j0) view.getTag();
        } else {
            j0Var = new j0();
            view = LayoutInflater.from(this.f41330d).inflate(R.layout.mg_forum_post_activity_item_post_video1, (ViewGroup) null);
            j0Var.f41424c = (FrameLayout) view.findViewById(R.id.videoContner);
            j0Var.f41423b = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            view.setTag(j0Var);
        }
        try {
            oVar = (k0.o) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (oVar == null) {
            return view;
        }
        w(this.f41330d);
        String str = oVar.f41520b;
        String str2 = oVar.f41519a;
        SimpleDraweeView simpleDraweeView = j0Var.f41423b;
        if (simpleDraweeView != null) {
            MyImageLoader.h(simpleDraweeView, str2);
        }
        if (j0Var.f41424c != null) {
            j0Var.f41423b.setTag(Integer.valueOf(i4));
            if (com.join.mgps.Util.g2.i(str)) {
                this.f41332f.e(i4, new c.l(i4, str, str2), new boolean[0]);
            }
        }
        return view;
    }

    public void D(DownloadTask downloadTask, int i4) {
    }

    void J(View view, int i4) {
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
                textView.setText(this.f41330d.getResources().getString(R.string.download_status_download));
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
                button.setText(this.f41330d.getResources().getString(R.string.download_status_download));
                button.setTextSize(2, 13.0f);
                button.setTextColor(-12802819);
                button.setBackgroundResource(R.drawable.recom_blue_butn);
            }
        }
    }

    void K(TextView textView, int i4) {
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        textView.setText(textView.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(i4)));
        textView.setTextSize(2, 13.0f);
        textView.setTextColor(-12802819);
        textView.setBackgroundResource(R.drawable.recom_blue_butn);
    }

    void L(c0 c0Var, Object obj) {
        int i4;
        Button button = c0Var.f41361d;
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
        if (obj instanceof CollectionBeanSubBusiness) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) obj;
            DownloadTask downloadTask2 = collectionBeanSubBusiness.getDownloadTask();
            String ver2 = collectionBeanSubBusiness.getVer();
            i4 = collectionBeanSubBusiness.getPay_tag_info() != null ? collectionBeanSubBusiness.getPay_tag_info().getPay_game_amount() : 0;
            if (i4 > 0 && b2.e0.o().p(collectionBeanSubBusiness.getCrc_sign_id())) {
                i4 = 0;
            }
            downloadTask = downloadTask2;
            ver = ver2;
        } else {
            if (obj instanceof RecomDatabeanBusiness) {
                AppBean game_info = ((RecomDatabeanBusiness) obj).getSub().get(0).getGame_info();
                int pay_game_amount = game_info.getPay_tag_info() != null ? game_info.getPay_tag_info().getPay_game_amount() : 0;
                if (pay_game_amount <= 0 || !b2.e0.o().p(game_info.getCrc_sign_id())) {
                    i4 = pay_game_amount;
                }
            }
            i4 = 0;
        }
        if (downloadTask == null) {
            if (UtilsMy.o0(tipBeans)) {
                if (i4 > 0 ? false : com.join.android.app.common.utils.e.l0(context).d(context, packageName)) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, packageName);
                    if (com.join.mgps.Util.g2.i(ver) && l4.d() < Integer.parseInt(ver)) {
                        button.setBackgroundResource(R.drawable.recom_green_butn);
                        X(button, "更新");
                        Y(button, resources.getColor(R.color.app_green_color));
                    } else {
                        button.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        X(button, context.getResources().getString(R.string.download_status_finished));
                        Y(button, resources.getColor(R.color.app_main_color));
                    }
                } else {
                    button.setBackgroundResource(R.drawable.recom_green_butn);
                    if (i4 > 0) {
                        K(c0Var.f41361d, i4);
                    } else {
                        J(button, status);
                    }
                }
            } else {
                button.setBackgroundResource(R.drawable.recom_green_butn);
                if (i4 > 0) {
                    K(c0Var.f41361d, i4);
                } else {
                    J(button, status);
                }
            }
        } else {
            int status2 = downloadTask.getStatus();
            if (i4 > 0) {
                status2 = 43;
            }
            if (status2 != 0) {
                if (status2 == 27) {
                    X(button, "暂停中");
                } else if (status2 != 2) {
                    if (status2 != 3) {
                        if (status2 != 5) {
                            if (status2 != 6) {
                                if (status2 != 7) {
                                    if (status2 != 42) {
                                        if (status2 != 43) {
                                            switch (status2) {
                                                case 9:
                                                    b0(c0Var, 0);
                                                    button.setBackgroundResource(R.drawable.recom_green_butn);
                                                    X(button, "更新");
                                                    Y(button, resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 10:
                                                    b0(c0Var, 16);
                                                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    X(button, "等待");
                                                    Y(button, resources.getColor(R.color.app_blue_color));
                                                    break;
                                                case 11:
                                                    b0(c0Var, 0);
                                                    button.setBackgroundResource(R.drawable.recom_green_butn);
                                                    X(button, "安装");
                                                    Y(button, resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 12:
                                                    b0(c0Var, 17);
                                                    TextView textView = c0Var.f41366i;
                                                    textView.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    c0Var.f41367j.setText("解压中..");
                                                    c0Var.f41369l.setProgress((int) downloadTask.getProgress());
                                                    button.setBackgroundResource(R.drawable.extract);
                                                    X(button, "解压中");
                                                    Y(button, resources.getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    b0(c0Var, 17);
                                                    TextView textView2 = c0Var.f41366i;
                                                    textView2.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    c0Var.f41367j.setText("点击重新解压");
                                                    c0Var.f41369l.setProgress((int) downloadTask.getProgress());
                                                    button.setBackgroundResource(R.drawable.reextract);
                                                    X(button, "解压");
                                                    Y(button, resources.getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        } else {
                                            b0(c0Var, 0);
                                            button.setBackgroundResource(R.drawable.recom_green_butn);
                                            if (i4 > 0) {
                                                K(c0Var.f41361d, i4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        b0(c0Var, 0);
                        button.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        X(button, context.getResources().getString(R.string.download_status_finished));
                        Y(button, resources.getColor(R.color.app_main_color));
                    }
                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                    X(button, "继续");
                    Y(button, resources.getColor(R.color.app_blue_color));
                    b0(c0Var, 16);
                    try {
                        if (downloadTask.getSize() == 0) {
                            TextView textView3 = c0Var.f41366i;
                            textView3.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                        } else {
                            TextView textView4 = c0Var.f41366i;
                            textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                        }
                        c0Var.f41368k.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    c0Var.f41367j.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                    X(button, "暂停");
                    Y(button, resources.getColor(R.color.app_blue_color));
                    b0(c0Var, 16);
                    if (downloadTask.getSize() == 0) {
                        TextView textView5 = c0Var.f41366i;
                        textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                    } else {
                        TextView textView6 = c0Var.f41366i;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                    }
                    c0Var.f41368k.setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    TextView textView7 = c0Var.f41367j;
                    textView7.setText(speed + "/S");
                }
            }
            b0(c0Var, 0);
            button.setBackgroundResource(R.drawable.recom_green_butn);
            if (i4 > 0) {
                K(c0Var.f41361d, i4);
            } else {
                J(button, status);
            }
        }
        button.setOnClickListener(new s(obj));
    }

    public void M(u uVar) {
        this.f41337k = uVar;
    }

    void N(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, List<String> list) {
        LinearLayout.LayoutParams layoutParams;
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null && i02[0].intValue() != 0 && i02[1].intValue() != 0) {
            if ((i02[0].intValue() * 1.0f) / i02[1].intValue() > 1.0f) {
                layoutParams = new LinearLayout.LayoutParams(this.f41340n, this.f41341o);
            } else {
                layoutParams = new LinearLayout.LayoutParams(this.f41342p, this.f41343q);
            }
        } else {
            int i6 = this.f41339m;
            layoutParams = new LinearLayout.LayoutParams(i6, i6);
        }
        if (!com.join.mgps.Util.g2.h(str)) {
            simpleDraweeView.setVisibility(0);
            simpleDraweeView.setLayoutParams(layoutParams);
            simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
            simpleDraweeView.setOnClickListener(new o(list, i5));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    void O(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, List<String> list) {
        if (this.f41334h == null) {
            this.f41334h = z();
        }
        int i6 = (int) (this.f41330d.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f41334h;
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
            simpleDraweeView.setOnClickListener(new p(list, i5));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    public void P(List<k0> list) {
        if (list == null) {
            return;
        }
        if (this.f41331e == null) {
            this.f41331e = new ArrayList();
        }
        this.f41331e.clear();
        this.f41331e.addAll(list);
    }

    public void Q(com.join.android.app.component.optimizetext.b bVar) {
        this.f41328b = bVar;
    }

    public void R(View view, int i4) {
        view.setOnClickListener(new g(i4));
    }

    public void S(View view, int i4) {
        view.setOnClickListener(new b(i4));
    }

    public void T(View view, int i4) {
        view.setOnClickListener(new a(i4));
    }

    public void U(View view, String str, String str2) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new e(str2));
    }

    public void V(View view, int i4) {
        view.setOnClickListener(new d(i4));
    }

    void Z(SimpleDraweeView simpleDraweeView, int i4, String str, String str2) {
        if (this.f41334h == null) {
            this.f41334h = z();
        }
        int i5 = (int) (this.f41330d.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f41334h;
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
            simpleDraweeView.setOnClickListener(new q(str2));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    public void a0(View view, int i4) {
        view.setOnClickListener(new c(i4));
    }

    public void c(k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        if (this.f41331e == null) {
            this.f41331e = new ArrayList();
        }
        this.f41331e.add(k0Var);
    }

    void c0(w wVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            wVar.f41557h.setVisibility(8);
            wVar.f41561l.setVisibility(8);
            wVar.f41562m.setVisibility(8);
            wVar.f41558i.setVisibility(0);
            wVar.f41556g.setVisibility(0);
            return;
        }
        wVar.f41557h.setVisibility(0);
        if (bool2.booleanValue()) {
            wVar.f41561l.setVisibility(8);
            wVar.f41562m.setVisibility(0);
        } else {
            wVar.f41562m.setVisibility(8);
            wVar.f41561l.setVisibility(0);
        }
        wVar.f41558i.setVisibility(8);
        wVar.f41556g.setVisibility(8);
    }

    public void d() {
        DisplayMetrics displayMetrics = this.f41330d.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        float dimensionPixelSize = displayMetrics.widthPixels - (this.f41330d.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2);
        int i6 = ((int) (dimensionPixelSize - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (i6 <= i4) {
            i4 = i6 > i5 ? i5 : i6;
        }
        this.f41339m = i4;
        this.f41344r = (int) ((dimensionPixelSize * 1.0f) / 1.8f);
        int i7 = (int) (0.615f * dimensionPixelSize);
        this.f41340n = i7;
        this.f41341o = (int) ((i7 * 1.0f) / 1.85f);
        int i8 = (int) (dimensionPixelSize * 0.54f);
        this.f41342p = i8;
        this.f41343q = (int) ((i8 * 1.0f) / 0.85f);
    }

    LinearLayout.LayoutParams e(int i4) {
        if (this.f41336j == null) {
            float f5 = this.f41330d.getResources().getDisplayMetrics().scaledDensity;
            int i5 = (int) (225.0f * f5);
            int i6 = (int) (150.0f * f5);
            int i7 = (int) (f5 * 4.0f);
            if (i4 <= i5) {
                i5 = i4 > 0 ? i4 : 0;
            }
            int i8 = (int) (i5 / 1.5f);
            if (i4 <= 0) {
                i5 = -1;
            } else {
                i6 = i8;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i6);
            layoutParams.setMargins(0, i7, 0, i7);
            this.f41336j = layoutParams;
        }
        return this.f41336j;
    }

    LinearLayout.LayoutParams g(View view) {
        if (this.f41335i == null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, ((int) view.getContext().getResources().getDisplayMetrics().density) * 6);
            this.f41335i = layoutParams;
        }
        return this.f41335i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<k0> list = this.f41331e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<k0> list = this.f41331e;
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
        List<k0> list = this.f41331e;
        if (list == null || i4 >= list.size()) {
            return -1;
        }
        return this.f41331e.get(i4).b().ordinal();
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.POST_HEADER.ordinal()) {
            return q(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_FOOTER.ordinal()) {
            return o(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_IMAGE_THUMBNAIL.ordinal()) {
            return r(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_VIDEO_THUMBNAIL.ordinal()) {
            return x(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_MESSAGE.ordinal()) {
            return s(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_SUBJECT.ordinal()) {
            return u(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_TOP.ordinal()) {
            return v(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.FAVORITE_ITEM_HEADER.ordinal()) {
            return f(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GAME_ITEM.ordinal()) {
            return h(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_FOOTER.ordinal()) {
            return k(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_IMGS.ordinal()) {
            return l(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_VIDEO.ordinal()) {
            return n(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_MESSAGE.ordinal()) {
            return m(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.P_SUBJECT.ordinal()) {
            return t(i4, view, viewGroup);
        }
        return itemViewType == ViewType.POST_GAME.ordinal() ? p(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public View h(int i4, View view, ViewGroup viewGroup) {
        w wVar;
        View view2;
        if (view == null) {
            View inflate = LayoutInflater.from(this.f41330d).inflate(R.layout.app_listview_item, (ViewGroup) null);
            w wVar2 = new w();
            wVar2.f41551b = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
            wVar2.f41552c = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
            wVar2.f41553d = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
            wVar2.f41554e = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
            wVar2.f41555f = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
            wVar2.f41556g = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
            wVar2.f41557h = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
            wVar2.f41558i = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
            wVar2.f41559j = (TextView) inflate.findViewById(R.id.appSize);
            wVar2.f41560k = (TextView) inflate.findViewById(R.id.loding_info);
            wVar2.f41561l = (ProgressBar) inflate.findViewById(R.id.progressBar);
            wVar2.f41562m = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
            wVar2.f41563n = inflate.findViewById(R.id.line);
            wVar2.f41564o = inflate.findViewById(R.id.relateLayoutApp);
            inflate.setTag(wVar2);
            wVar = wVar2;
            view2 = inflate;
        } else {
            wVar = (w) view.getTag();
            view2 = view;
        }
        wVar.f41563n.setVisibility(0);
        k0.b bVar = (k0.b) getItem(i4);
        if (bVar == null) {
            return view2;
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(bVar.f41433a.getGame());
        collectionBeanSubBusiness.setDownloadTask(bVar.f41433a.getDownloadTask());
        wVar.f41564o.setBackgroundResource(R.drawable.white_bg);
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
            wVar.f41552c.setVisibility(0);
        } else {
            wVar.f41552c.setVisibility(8);
        }
        wVar.f41553d.setText(collectionBeanSubBusiness.getGame_name());
        wVar.f41556g.setText(collectionBeanSubBusiness.getInfo());
        long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d);
        String ico_remote = collectionBeanSubBusiness.getIco_remote();
        if (TextUtils.isEmpty(ico_remote)) {
            ico_remote = "";
        }
        MyImageLoader.h(wVar.f41551b, ico_remote.trim());
        collectionBeanSubBusiness.getTag_info();
        UtilsMy.I(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness.getTag_info(), wVar.f41558i, this.f41330d);
        UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view2, downloadTask);
        String plugin_num = collectionBeanSubBusiness.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            wVar.f41555f.setBackgroundResource(R.drawable.recom_blue_butn);
            wVar.f41555f.setText("开始");
            wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_blue_color));
            wVar.f41558i.setVisibility(8);
            wVar.f41552c.setVisibility(8);
        } else if (downloadTask == null) {
            c0(wVar, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) <= 0 ? com.join.android.app.common.utils.e.l0(this.f41330d).d(this.f41330d, collectionBeanSubBusiness.getPackage_name()) : false) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f41330d).l(this.f41330d, collectionBeanSubBusiness.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                        wVar.f41555f.setBackgroundResource(R.drawable.recom_green_butn);
                        wVar.f41555f.setText("更新");
                        wVar.f41555f.setTextColor(-9263087);
                    } else {
                        wVar.f41555f.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        wVar.f41555f.setText(this.f41330d.getResources().getString(R.string.download_status_finished));
                        wVar.f41555f.setTextColor(-688602);
                    }
                } else {
                    wVar.f41555f.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                    UtilsMy.Z2(wVar.f41555f, wVar.f41554e, collectionBeanSubBusiness);
                }
            } else {
                wVar.f41555f.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                UtilsMy.Z2(wVar.f41555f, wVar.f41554e, collectionBeanSubBusiness);
            }
        } else {
            com.join.mgps.Util.v0.d("infoo", downloadTask.getStatus() + " dd " + downloadTask.getShowName());
            int status = downloadTask.getStatus();
            if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    wVar.f41555f.setText("暂停中");
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    wVar.f41555f.setBackgroundResource(R.drawable.recom_green_butn);
                                                    wVar.f41555f.setText("更新");
                                                    wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_green_color));
                                                    c0(wVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    wVar.f41555f.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    wVar.f41555f.setText("等待");
                                                    wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_blue_color));
                                                    Boolean bool = Boolean.FALSE;
                                                    c0(wVar, bool, bool);
                                                    TextView textView = wVar.f41559j;
                                                    textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    try {
                                                        wVar.f41561l.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    wVar.f41560k.setText("等待中");
                                                    break;
                                                case 11:
                                                    wVar.f41555f.setBackgroundResource(R.drawable.recom_green_butn);
                                                    wVar.f41555f.setText("安装");
                                                    wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_green_color));
                                                    c0(wVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    c0(wVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView2 = wVar.f41559j;
                                                    textView2.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    wVar.f41560k.setText("解压中..");
                                                    wVar.f41562m.setProgress((int) downloadTask.getProgress());
                                                    wVar.f41555f.setBackgroundResource(R.drawable.extract);
                                                    wVar.f41555f.setText("解压中");
                                                    wVar.f41555f.setTextColor(-4868683);
                                                    break;
                                                case 13:
                                                    c0(wVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView3 = wVar.f41559j;
                                                    textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    wVar.f41560k.setText("点击重新解压");
                                                    wVar.f41562m.setProgress((int) downloadTask.getProgress());
                                                    wVar.f41555f.setBackgroundResource(R.drawable.reextract);
                                                    wVar.f41555f.setText("解压");
                                                    wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        wVar.f41555f.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        wVar.f41555f.setText(this.f41330d.getResources().getString(R.string.download_status_finished));
                        wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_main_color));
                        Boolean bool2 = Boolean.TRUE;
                        c0(wVar, bool2, bool2);
                    }
                    wVar.f41555f.setBackgroundResource(R.drawable.recom_blue_butn);
                    wVar.f41555f.setText("继续");
                    wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_blue_color));
                    Boolean bool3 = Boolean.FALSE;
                    c0(wVar, bool3, bool3);
                    try {
                        if (downloadTask.getSize() == 0) {
                            TextView textView4 = wVar.f41559j;
                            textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView5 = wVar.f41559j;
                            textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        wVar.f41561l.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    wVar.f41560k.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    wVar.f41555f.setBackgroundResource(R.drawable.recom_blue_butn);
                    wVar.f41555f.setText("暂停");
                    wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_blue_color));
                    Boolean bool4 = Boolean.FALSE;
                    c0(wVar, bool4, bool4);
                    if (downloadTask.getSize() == 0) {
                        TextView textView6 = wVar.f41559j;
                        textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    } else {
                        TextView textView7 = wVar.f41559j;
                        textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    }
                    wVar.f41561l.setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    TextView textView8 = wVar.f41560k;
                    textView8.setText(speed + "/S");
                }
            }
            wVar.f41555f.setBackgroundResource(R.drawable.recom_blue_butn);
            UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
            UtilsMy.Z2(wVar.f41555f, wVar.f41554e, collectionBeanSubBusiness);
            wVar.f41555f.setTextColor(this.f41330d.getResources().getColor(R.color.app_blue_color));
            c0(wVar, Boolean.TRUE, Boolean.FALSE);
        }
        wVar.f41554e.setClickable(true);
        wVar.f41554e.setOnClickListener(new r(collectionBeanSubBusiness));
        return view2;
    }

    public List<k0> i() {
        return this.f41331e;
    }

    public com.join.android.app.component.optimizetext.b j() {
        return this.f41328b;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public com.danikula.videocache.i y(Context context) {
        return MApplication.m(context);
    }

    LinearLayout.LayoutParams z() {
        DisplayMetrics displayMetrics = this.f41330d.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        int dimensionPixelSize = ((int) ((displayMetrics.widthPixels - (this.f41330d.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2)) - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (dimensionPixelSize <= i4) {
            i4 = dimensionPixelSize > i5 ? i5 : dimensionPixelSize;
        }
        return new LinearLayout.LayoutParams(i4, i4);
    }
}
