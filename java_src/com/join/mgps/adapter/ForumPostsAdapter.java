package com.join.mgps.adapter;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
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
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.MApplication;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.activity.ForumPostsCopyActivity_;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.DownloadUrlBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumPostsAdapter extends BaseMultiItemQuickAdapter<e0, BaseViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    private final String f40945d;

    /* renamed from: e  reason: collision with root package name */
    com.danikula.videocache.i f40946e;

    /* renamed from: f  reason: collision with root package name */
    private String f40947f;

    /* renamed from: g  reason: collision with root package name */
    private Context f40948g;

    /* renamed from: h  reason: collision with root package name */
    com.join.android.app.component.video.c f40949h;

    /* renamed from: i  reason: collision with root package name */
    c0 f40950i;

    /* renamed from: j  reason: collision with root package name */
    LinearLayout.LayoutParams f40951j;

    /* renamed from: k  reason: collision with root package name */
    int f40952k;

    /* renamed from: l  reason: collision with root package name */
    int f40953l;

    /* renamed from: m  reason: collision with root package name */
    LinearLayout.LayoutParams f40954m;

    /* renamed from: n  reason: collision with root package name */
    Hashtable<String, d0> f40955n;

    /* renamed from: o  reason: collision with root package name */
    x f40956o;

    /* renamed from: p  reason: collision with root package name */
    boolean f40957p;

    /* renamed from: q  reason: collision with root package name */
    a0 f40958q;

    /* renamed from: r  reason: collision with root package name */
    private b0 f40959r;

    /* loaded from: classes4.dex */
    public enum ViewType {
        POST_HEADER,
        POST_HEADER1,
        POST_SUBJECT,
        POST_MESSAGE,
        POST_RICH_MESSAGE,
        POST_IMAGE,
        POST_VIDEO,
        POST_IMAGE_THUMBNAIL,
        POST_GAME,
        POST_GAME_RES_LINK,
        POST_FOOTER,
        EMPLOYEE_TAGS,
        POST_FOOTER1,
        DIVIDER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f40960a;

        a(SimpleDraweeView simpleDraweeView) {
            this.f40960a = simpleDraweeView;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            try {
                ForumPostsAdapter.this.y0(str, this.f40960a, fVar);
                if (fVar != null) {
                    d0 d0Var = new d0();
                    d0Var.f40991a = fVar.getWidth();
                    d0Var.f40992b = fVar.getHeight();
                    ForumPostsAdapter.this.q(str, d0Var);
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
            this.f40960a.setMinimumHeight(ForumPostsAdapter.this.f40953l);
        }
    }

    /* loaded from: classes4.dex */
    public class a0 extends com.join.mgps.customview.e implements View.OnClickListener {

        /* renamed from: p  reason: collision with root package name */
        public static final int f40962p = 1;

        /* renamed from: q  reason: collision with root package name */
        public static final int f40963q = 2;

        /* renamed from: r  reason: collision with root package name */
        public static final int f40964r = 3;

        /* renamed from: d  reason: collision with root package name */
        View f40965d;

        /* renamed from: e  reason: collision with root package name */
        View f40966e;

        /* renamed from: f  reason: collision with root package name */
        View f40967f;

        /* renamed from: g  reason: collision with root package name */
        View f40968g;

        /* renamed from: h  reason: collision with root package name */
        View f40969h;

        /* renamed from: i  reason: collision with root package name */
        View f40970i;

        /* renamed from: j  reason: collision with root package name */
        int f40971j;

        /* renamed from: k  reason: collision with root package name */
        int f40972k;

        /* renamed from: l  reason: collision with root package name */
        String f40973l;

        /* renamed from: m  reason: collision with root package name */
        String f40974m;

        /* renamed from: n  reason: collision with root package name */
        int f40975n;

        public a0(Context context) {
            super(context);
            c();
            k();
        }

        private void k() {
            View inflate = LayoutInflater.from(this.f48455b).inflate(R.layout.mg_forum_popupwindow_layout, (ViewGroup) null);
            this.f40965d = inflate.findViewById(R.id.btn_forum_comment_delete);
            this.f40966e = inflate.findViewById(R.id.btn_forum_comment_copy);
            this.f40967f = inflate.findViewById(R.id.divider_forum_comment_1);
            this.f40968g = inflate.findViewById(R.id.btn_forum_comment);
            this.f40969h = inflate.findViewById(R.id.divider_2);
            this.f40970i = inflate.findViewById(R.id.btn_forum_report);
            this.f40965d.setOnClickListener(this);
            this.f40966e.setOnClickListener(this);
            this.f40968g.setOnClickListener(this);
            this.f40970i.setOnClickListener(this);
            setContentView(inflate);
            setWidth(-2);
            setHeight(-2);
        }

        public void A(int i4) {
            this.f40972k = i4;
        }

        void c() {
            setAnimationStyle(0);
            setFocusable(false);
        }

        public int d() {
            return this.f40971j;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void dismiss() {
            super.dismiss();
            this.f40971j = 0;
            this.f40972k = 0;
            this.f40973l = "";
            this.f40974m = "";
        }

        public View e() {
            return this.f40966e;
        }

        public View f() {
            return this.f40965d;
        }

        public int g() {
            return this.f40975n;
        }

        public String h() {
            return this.f40974m;
        }

        public String i() {
            return this.f40973l;
        }

        public int j() {
            return this.f40972k;
        }

        void l() {
            if (ForumPostsAdapter.this.f40959r == null) {
                return;
            }
            int i4 = this.f40975n;
            if (i4 == 1) {
                ForumPostsAdapter.this.f40959r.h(this.f40971j, this.f40973l);
            } else if (i4 == 2) {
                ForumPostsAdapter.this.f40959r.k(this.f40971j, this.f40972k, this.f40973l);
            }
        }

        void m() {
            String charSequence;
            if (ForumPostsAdapter.this.f40959r == null) {
                return;
            }
            if (Build.VERSION.SDK_INT > 11) {
                ClipboardManager clipboardManager = (ClipboardManager) this.f48455b.getSystemService("clipboard");
                clipboardManager.setPrimaryClip(ClipData.newPlainText("wufan", this.f40974m));
                charSequence = clipboardManager.getText().toString();
            } else {
                android.text.ClipboardManager clipboardManager2 = (android.text.ClipboardManager) this.f48455b.getSystemService("clipboard");
                clipboardManager2.setText(this.f40974m);
                charSequence = clipboardManager2.getText().toString();
            }
            if (charSequence.equals(this.f40974m.toString())) {
                com.join.mgps.Util.l2.a(this.f48455b).b("已复制到剪贴板！");
            }
        }

        void n() {
            if (ForumPostsAdapter.this.f40959r == null) {
                return;
            }
            int i4 = this.f40975n;
            if (i4 == 1) {
                ForumPostsAdapter.this.f40959r.d(this.f40971j);
            } else if (i4 == 2) {
                ForumPostsAdapter.this.f40959r.g(this.f40972k);
            }
        }

        void o() {
            if (ForumPostsAdapter.this.f40959r == null) {
                return;
            }
            int i4 = this.f40975n;
            if (i4 == 1) {
                ForumPostsAdapter.this.f40959r.j(this.f40971j);
            } else if (i4 == 2) {
                ForumPostsAdapter.this.f40959r.f(this.f40972k);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_forum_comment /* 2131296846 */:
                    l();
                    break;
                case R.id.btn_forum_comment_copy /* 2131296847 */:
                    m();
                    break;
                case R.id.btn_forum_comment_delete /* 2131296848 */:
                    n();
                    break;
                case R.id.btn_forum_report /* 2131296849 */:
                    o();
                    break;
            }
            dismiss();
        }

        public void p() {
            View view = this.f40965d;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f40968g;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f40970i;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }

        public void q(int i4) {
            this.f40971j = i4;
        }

        public void r(int i4) {
            View view = this.f40968g;
            if (view != null) {
                view.setVisibility(i4);
            }
        }

        public void s(View view) {
            this.f40966e = view;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void showAsDropDown(View view) {
            showAsDropDown(view, 0, (view.getMeasuredHeight() * (-1)) - this.f48455b.getResources().getDimensionPixelSize(R.dimen.mg_forum_popupwindow_height));
            b();
        }

        public void t(int i4) {
            View view = this.f40966e;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f40966e.setVisibility(0);
            } else {
                this.f40966e.setVisibility(8);
            }
        }

        public void u(View view) {
            this.f40965d = view;
        }

        public void v(int i4) {
            View view = this.f40965d;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f40967f.setVisibility(0);
            } else {
                this.f40967f.setVisibility(8);
            }
        }

        public void w(int i4) {
            this.f40975n = i4;
        }

        public void x(String str) {
            this.f40974m = str;
        }

        public void y(String str) {
            this.f40973l = str;
        }

        void z(int i4) {
            View view = this.f40970i;
            if (view != null) {
                view.setVisibility(i4);
            }
            if (i4 == 0) {
                this.f40969h.setVisibility(0);
            } else {
                this.f40969h.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f40977a;

        b(SimpleDraweeView simpleDraweeView) {
            this.f40977a = simpleDraweeView;
        }

        @Override // com.facebook.drawee.controller.c
        /* renamed from: a */
        public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
            try {
                ForumPostsAdapter.this.f0(str, this.f40977a, fVar);
                if (fVar != null) {
                    d0 d0Var = new d0();
                    d0Var.f40991a = fVar.getWidth();
                    d0Var.f40992b = fVar.getHeight();
                    ForumPostsAdapter.this.q(str, d0Var);
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
            SimpleDraweeView simpleDraweeView = this.f40977a;
            simpleDraweeView.setLayoutParams(ForumPostsAdapter.this.N(simpleDraweeView.getContext()));
        }
    }

    /* loaded from: classes4.dex */
    public interface b0 {
        void a(int i4);

        void b(int i4);

        void c(int i4);

        void d(int i4);

        void e(String str);

        void f(int i4);

        void g(int i4);

        void h(int i4, String str);

        void i(View view, int i4);

        void j(int i4);

        void k(int i4, int i5, String str);

        void l();

        void m(int i4);

        void n(View view, int i4);

        void o();

        void p(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f40979b;

        c(View view) {
            this.f40979b = view;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.join.mgps.Util.w0.e("mPopWindow.setTouchInterceptor", motionEvent.toString());
            ForumPostsAdapter forumPostsAdapter = ForumPostsAdapter.this;
            if (forumPostsAdapter.I(forumPostsAdapter.f40956o, motionEvent) && !ForumPostsAdapter.this.J(this.f40979b, motionEvent)) {
                ForumPostsAdapter.this.f40957p = true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40989b;

        d(int i4) {
            this.f40989b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.b(this.f40989b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d0 {

        /* renamed from: a  reason: collision with root package name */
        public int f40991a;

        /* renamed from: b  reason: collision with root package name */
        public int f40992b;

        public d0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.o();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class e0 implements u1.b {

        /* renamed from: b  reason: collision with root package name */
        ViewType f40995b;

        /* renamed from: c  reason: collision with root package name */
        Object f40996c;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40997a;

            /* renamed from: b  reason: collision with root package name */
            public int f40998b;

            /* renamed from: c  reason: collision with root package name */
            public int f40999c;

            /* renamed from: d  reason: collision with root package name */
            public String f41000d;

            /* renamed from: e  reason: collision with root package name */
            public String f41001e;

            /* renamed from: f  reason: collision with root package name */
            public long f41002f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41003g;

            /* renamed from: h  reason: collision with root package name */
            public int f41004h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f41005i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f41006j;

            /* renamed from: k  reason: collision with root package name */
            public int f41007k;

            /* renamed from: l  reason: collision with root package name */
            public boolean f41008l;

            /* renamed from: m  reason: collision with root package name */
            public boolean f41009m;

            /* renamed from: n  reason: collision with root package name */
            public boolean f41010n;

            /* renamed from: o  reason: collision with root package name */
            public int f41011o;

            /* renamed from: p  reason: collision with root package name */
            public int f41012p;

            /* renamed from: q  reason: collision with root package name */
            public boolean f41013q;

            /* renamed from: r  reason: collision with root package name */
            public String f41014r;

            public a() {
            }

            public a(boolean z4, int i4, int i5, String str, String str2, long j4, boolean z5, int i6, boolean z6, boolean z7, int i7, boolean z8, boolean z9, boolean z10, int i8, int i9, boolean z11, String str3) {
                this.f40997a = z4;
                this.f40998b = i4;
                this.f40999c = i5;
                this.f41000d = str;
                this.f41001e = str2;
                this.f41002f = j4;
                this.f41003g = z5;
                this.f41004h = i6;
                this.f41005i = z6;
                this.f41006j = z7;
                this.f41007k = i7;
                this.f41008l = z8;
                this.f41009m = z9;
                this.f41010n = z10;
                this.f41011o = i8;
                this.f41012p = i9;
                this.f41013q = z11;
                this.f41014r = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f41015a;

            /* renamed from: b  reason: collision with root package name */
            public int f41016b;

            /* renamed from: c  reason: collision with root package name */
            public List<String> f41017c;

            public b() {
            }

            public b(String str, int i4, List<String> list) {
                this.f41015a = str;
                this.f41016b = i4;
                this.f41017c = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f41018a;

            /* renamed from: b  reason: collision with root package name */
            public String f41019b;

            /* renamed from: c  reason: collision with root package name */
            public String f41020c;

            /* renamed from: d  reason: collision with root package name */
            public int f41021d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41022e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f41023f;

            public c() {
            }

            public c(int i4, String str, String str2, int i5, boolean z4, boolean z5) {
                this.f41018a = i4;
                this.f41019b = str;
                this.f41020c = str2;
                this.f41021d = i5;
                this.f41022e = z4;
                this.f41023f = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f41024a;

            /* renamed from: b  reason: collision with root package name */
            public ForumBean.ForumCommentBean f41025b;

            /* renamed from: c  reason: collision with root package name */
            public int f41026c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f41027d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41028e;

            /* renamed from: f  reason: collision with root package name */
            public int f41029f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41030g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41031h;

            public d(int i4, ForumBean.ForumCommentBean forumCommentBean, int i5, boolean z4, boolean z5) {
                this.f41024a = i4;
                this.f41025b = forumCommentBean;
                this.f41026c = i5;
                this.f41027d = z4;
                this.f41028e = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class e {

            /* renamed from: a  reason: collision with root package name */
            int f41032a;

            /* renamed from: b  reason: collision with root package name */
            int f41033b;

            public e(int i4, int i5) {
                this.f41032a = i4;
                this.f41033b = i5;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public List<RecommendLabelTag> f41034a;

            /* renamed from: b  reason: collision with root package name */
            public int f41035b;

            /* renamed from: c  reason: collision with root package name */
            public String f41036c;

            public f(List<RecommendLabelTag> list, int i4, String str) {
                this.f41034a = list;
                this.f41035b = i4;
                this.f41036c = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public int f41037a;

            /* renamed from: b  reason: collision with root package name */
            public String f41038b;

            /* renamed from: c  reason: collision with root package name */
            public int f41039c;

            /* renamed from: d  reason: collision with root package name */
            public int f41040d;

            /* renamed from: e  reason: collision with root package name */
            public int f41041e;

            /* renamed from: f  reason: collision with root package name */
            public int f41042f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41043g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41044h;

            public g() {
            }

            public g(int i4, int i5, String str, int i6, int i7, int i8, boolean z4, boolean z5) {
                this.f41037a = i4;
                this.f41042f = i5;
                this.f41038b = str;
                this.f41039c = i6;
                this.f41040d = i7;
                this.f41041e = i8;
                this.f41043g = z4;
                this.f41044h = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public String f41045a;

            /* renamed from: b  reason: collision with root package name */
            public ForumBean.GameInfo f41046b;

            /* renamed from: c  reason: collision with root package name */
            public String f41047c;

            public h(String str, ForumBean.GameInfo gameInfo, String str2) {
                this.f41045a = str;
                this.f41046b = gameInfo;
                this.f41047c = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41048a;

            /* renamed from: b  reason: collision with root package name */
            public int f41049b;

            /* renamed from: c  reason: collision with root package name */
            public String f41050c;

            /* renamed from: d  reason: collision with root package name */
            public String f41051d;

            /* renamed from: e  reason: collision with root package name */
            public long f41052e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f41053f;

            /* renamed from: g  reason: collision with root package name */
            public int f41054g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41055h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f41056i;

            /* renamed from: j  reason: collision with root package name */
            public int f41057j;

            /* renamed from: k  reason: collision with root package name */
            public int f41058k;

            /* renamed from: l  reason: collision with root package name */
            public int f41059l;

            /* renamed from: m  reason: collision with root package name */
            public String f41060m;

            /* renamed from: n  reason: collision with root package name */
            public String f41061n;

            /* renamed from: o  reason: collision with root package name */
            public boolean f41062o;

            /* renamed from: p  reason: collision with root package name */
            public String f41063p;

            /* renamed from: q  reason: collision with root package name */
            public String f41064q;

            /* renamed from: r  reason: collision with root package name */
            public int f41065r;

            /* renamed from: s  reason: collision with root package name */
            public boolean f41066s;

            /* renamed from: t  reason: collision with root package name */
            public String f41067t;

            public i() {
            }

            public i(boolean z4, int i4, String str, String str2, long j4, boolean z5, int i5, boolean z6, boolean z7, int i6, int i7, int i8, String str3, String str4, boolean z8, String str5, String str6, int i9, boolean z9, String str7) {
                this.f41048a = z4;
                this.f41049b = i4;
                this.f41050c = str;
                this.f41051d = str2;
                this.f41052e = j4;
                this.f41053f = z5;
                this.f41054g = i5;
                this.f41055h = z6;
                this.f41056i = z7;
                this.f41057j = i6;
                this.f41058k = i7;
                this.f41059l = i8;
                this.f41060m = str3;
                this.f41061n = str4;
                this.f41062o = z8;
                this.f41063p = str5;
                this.f41064q = str6;
                this.f41065r = i9;
                this.f41066s = z9;
                this.f41067t = str7;
            }
        }

        /* loaded from: classes4.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41068a;

            /* renamed from: b  reason: collision with root package name */
            public String f41069b;

            /* renamed from: c  reason: collision with root package name */
            public String f41070c;

            /* renamed from: d  reason: collision with root package name */
            public long f41071d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41072e;

            /* renamed from: f  reason: collision with root package name */
            public int f41073f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41074g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41075h;

            /* renamed from: i  reason: collision with root package name */
            public int f41076i;

            /* renamed from: j  reason: collision with root package name */
            public int f41077j;

            /* renamed from: k  reason: collision with root package name */
            public int f41078k;

            /* renamed from: l  reason: collision with root package name */
            public int f41079l;

            /* renamed from: m  reason: collision with root package name */
            public String f41080m;

            /* renamed from: n  reason: collision with root package name */
            public String f41081n;

            public j() {
            }

            public j(boolean z4, String str, String str2, long j4, boolean z5, int i4, boolean z6, boolean z7, int i5, int i6, int i7, String str3, String str4, int i8) {
                this.f41068a = z4;
                this.f41069b = str;
                this.f41070c = str2;
                this.f41071d = j4;
                this.f41072e = z5;
                this.f41073f = i4;
                this.f41074g = z6;
                this.f41075h = z7;
                this.f41076i = i5;
                this.f41077j = i6;
                this.f41078k = i7;
                this.f41080m = str3;
                this.f41081n = str4;
                this.f41079l = i8;
            }
        }

        /* loaded from: classes4.dex */
        public static class k {

            /* renamed from: a  reason: collision with root package name */
            public String f41082a;

            /* renamed from: b  reason: collision with root package name */
            int f41083b;

            /* renamed from: c  reason: collision with root package name */
            List<String> f41084c;

            public k() {
            }

            public k(String str, int i4, List<String> list) {
                this.f41082a = str;
                this.f41083b = i4;
                this.f41084c = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class l {

            /* renamed from: a  reason: collision with root package name */
            public List<String> f41085a;

            /* renamed from: b  reason: collision with root package name */
            List<String> f41086b;

            public l() {
            }

            public l(List<String> list, List<String> list2) {
                this.f41085a = list;
                this.f41086b = list2;
            }
        }

        /* loaded from: classes4.dex */
        public static class m {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41087a;

            /* renamed from: b  reason: collision with root package name */
            public SpannableStringBuilder f41088b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f41089c;

            /* renamed from: d  reason: collision with root package name */
            public String f41090d;

            /* renamed from: e  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41091e;

            public m() {
            }

            public m(boolean z4, SpannableStringBuilder spannableStringBuilder, boolean z5, String str, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f41087a = z4;
                this.f41088b = spannableStringBuilder;
                this.f41089c = z5;
                this.f41090d = str;
                this.f41091e = list;
            }

            public m(boolean z4, SpannableStringBuilder spannableStringBuilder, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f41087a = z4;
                this.f41088b = spannableStringBuilder;
                this.f41091e = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class n {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41092a;

            /* renamed from: b  reason: collision with root package name */
            public Spanned f41093b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f41094c;

            /* renamed from: d  reason: collision with root package name */
            public String f41095d;

            /* renamed from: e  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41096e;

            public n(boolean z4, Spanned spanned, boolean z5, String str, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f41092a = z4;
                this.f41093b = spanned;
                this.f41094c = z5;
                this.f41095d = str;
                this.f41096e = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class o {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41097a;

            /* renamed from: b  reason: collision with root package name */
            public String f41098b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f41099c;

            /* renamed from: d  reason: collision with root package name */
            public String f41100d;

            /* renamed from: e  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41101e;

            /* renamed from: f  reason: collision with root package name */
            public List<RecommendLabelTag> f41102f;

            /* renamed from: g  reason: collision with root package name */
            public int f41103g;

            /* renamed from: h  reason: collision with root package name */
            public String f41104h;

            public o() {
            }

            public o(boolean z4, String str, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, int i4, String str3) {
                this.f41097a = z4;
                this.f41098b = str;
                this.f41099c = z5;
                this.f41100d = str2;
                this.f41101e = list;
                this.f41102f = list2;
                this.f41103g = i4;
                this.f41104h = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class p {

            /* renamed from: a  reason: collision with root package name */
            public String f41105a;

            /* renamed from: b  reason: collision with root package name */
            public String f41106b;

            /* renamed from: c  reason: collision with root package name */
            public String f41107c;

            public p(String str, String str2, String str3) {
                this.f41105a = str;
                this.f41106b = str2;
                this.f41107c = str3;
            }
        }

        public e0() {
        }

        public <T> T a() {
            return (T) this.f40996c;
        }

        public ViewType b() {
            return this.f40995b;
        }

        public void c(Object obj) {
            this.f40996c = obj;
        }

        public void d(ViewType viewType) {
            this.f40995b = viewType;
        }

        @Override // u1.b
        public int getItemType() {
            return this.f40995b.ordinal();
        }

        public e0(ViewType viewType, Object obj) {
            this.f40995b = viewType;
            this.f40996c = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0.a f41108b;

        f(e0.a aVar) {
            this.f41108b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean booleanValue;
            View view2;
            com.join.mgps.Util.w0.e("v.setOnClickListener");
            x xVar = ForumPostsAdapter.this.f40956o;
            if (xVar != null && (view2 = xVar.f41162g) != null && view2 != view) {
                view2.setTag(Boolean.FALSE);
            }
            if (view.getTag() == null) {
                view.setTag(Boolean.TRUE);
                booleanValue = false;
            } else {
                booleanValue = ((Boolean) view.getTag()).booleanValue();
            }
            if (!booleanValue || ForumPostsAdapter.this.f40957p) {
                ForumPostsAdapter.this.C0(view, this.f41108b);
                view.setTag(Boolean.TRUE);
                ForumPostsAdapter.this.f40957p = false;
                return;
            }
            view.setTag(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0.c f41110b;

        g(e0.c cVar) {
            this.f41110b = cVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.n(view, this.f41110b.f41018a);
            }
            ForumPostsAdapter forumPostsAdapter = ForumPostsAdapter.this;
            e0.c cVar = this.f41110b;
            forumPostsAdapter.B0(view, 1, cVar.f41023f, cVar.f41022e, cVar.f41018a, 0, cVar.f41020c, cVar.f41019b);
            return true;
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41112b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41114d;

        h(int i4, int i5, String str) {
            this.f41112b = i4;
            this.f41113c = i5;
            this.f41114d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.k(this.f41112b, this.f41113c, this.f41114d);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41116b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f41117c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f41118d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f41119e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f41120f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f41121g;

        i(int i4, boolean z4, boolean z5, int i5, String str, String str2) {
            this.f41116b = i4;
            this.f41117c = z4;
            this.f41118d = z5;
            this.f41119e = i5;
            this.f41120f = str;
            this.f41121g = str2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.i(view, this.f41116b);
            }
            ForumPostsAdapter.this.B0(view, 2, this.f41117c, this.f41118d, this.f41116b, this.f41119e, this.f41120f, this.f41121g);
            return true;
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f41123b;

        j(ForumBean.GameInfo gameInfo) {
            this.f41123b = gameInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.I0(view.getContext(), this.f41123b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f41125b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f41126c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41127d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f41128e;

        k(ForumBean.GameInfo gameInfo, DownloadTask downloadTask, String str, String str2) {
            this.f41125b = gameInfo;
            this.f41126c = downloadTask;
            this.f41127d = str;
            this.f41128e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String plugin_num = this.f41125b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f41125b.getGame_down_url_remote());
                UtilsMy.T2(this.f41126c, ForumPostsAdapter.this.f40948g);
                IntentUtil.getInstance().intentActivity(ForumPostsAdapter.this.f40948g, intentDateBean);
                return;
            }
            Context context = view.getContext();
            com.papa.sim.statistic.p.l(context).s0(this.f41127d, this.f41128e, AccountUtil_.getInstance_(context).getUid());
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.e(this.f41128e);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41130b;

        l(String str) {
            this.f41130b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.e(this.f41130b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41132b;

        m(String str) {
            this.f41132b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f41132b);
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.c(parseInt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41134b;

        n(int i4) {
            this.f41134b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goForumGroupActivity(view.getContext(), this.f41134b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41136b;

        o(int i4) {
            this.f41136b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41136b).start();
            String uid = AccountUtil_.getInstance_(view.getContext()).getUid();
            if (TextUtils.isEmpty(uid)) {
                return;
            }
            if (uid.equals(this.f41136b + "") || ForumPostsAdapter.this.f40959r == null) {
                return;
            }
            ForumPostsAdapter.this.f40959r.m(this.f41136b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41138b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41139c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ForumBean.GameInfo f41140d;

        p(String str, String str2, ForumBean.GameInfo gameInfo) {
            this.f41138b = str;
            this.f41139c = str2;
            this.f41140d = gameInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            com.papa.sim.statistic.p.l(context).t0(this.f41138b, this.f41139c, AccountUtil_.getInstance_(context).getUid());
            com.join.mgps.Util.j0.J0(view.getContext(), this.f41140d, 13203);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0.j f41142b;

        q(e0.j jVar) {
            this.f41142b = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41142b.f41079l).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41144b;

        r(int i4) {
            this.f41144b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.findViewById(R.id.forum_post_praise_icon).startAnimation(AnimationUtils.loadAnimation(ForumPostsAdapter.this.f40948g, R.anim.scale_reset));
            if (ForumPostsAdapter.this.f40959r != null) {
                ForumPostsAdapter.this.f40959r.a(this.f41144b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41146b;

        s(int i4) {
            this.f41146b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumPostsAdapter.this.f40949h.A() != this.f41146b || ForumPostsAdapter.this.f40949h.D() == 5) {
                return;
            }
            ForumPostsAdapter.this.f40949h.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements View.OnClickListener {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.join.mgps.dialog.c0 f41149b;

            a(com.join.mgps.dialog.c0 c0Var) {
                this.f41149b = c0Var;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsCopyActivity_.f0(ForumPostsAdapter.this.f40948g).a(ForumPostsAdapter.this.f40947f).start();
                this.f41149b.dismiss();
            }
        }

        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(ForumPostsAdapter.this.f40947f)) {
                return;
            }
            com.join.mgps.dialog.c0 c0Var = new com.join.mgps.dialog.c0(ForumPostsAdapter.this.f40948g);
            c0Var.show();
            c0Var.a(new a(c0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements View.OnClickListener {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.join.mgps.dialog.c0 f41152b;

            a(com.join.mgps.dialog.c0 c0Var) {
                this.f41152b = c0Var;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsCopyActivity_.f0(ForumPostsAdapter.this.f40948g).a(ForumPostsAdapter.this.f40947f).start();
                this.f41152b.dismiss();
            }
        }

        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.mgps.Util.g2.h(ForumPostsAdapter.this.f40947f)) {
                return;
            }
            com.join.mgps.dialog.c0 c0Var = new com.join.mgps.dialog.c0(ForumPostsAdapter.this.f40948g);
            c0Var.show();
            c0Var.a(new a(c0Var));
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0.a f41154b;

        v(e0.a aVar) {
            this.f41154b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41154b.f40998b).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f41156b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41157c;

        w(List list, int i4) {
            this.f41156b = list;
            this.f41157c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f41156b.size()];
            this.f41156b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f41157c, strArr);
        }
    }

    /* loaded from: classes4.dex */
    public class x extends com.join.mgps.customview.e implements View.OnClickListener {

        /* renamed from: d  reason: collision with root package name */
        int f41159d;

        /* renamed from: e  reason: collision with root package name */
        int f41160e;

        /* renamed from: f  reason: collision with root package name */
        String f41161f;

        /* renamed from: g  reason: collision with root package name */
        View f41162g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                x.this.f41159d = view.getId();
                ForumPostsAdapter.this.f40956o.dismiss();
            }
        }

        public x(Context context) {
            super(context);
            View inflate = LayoutInflater.from(this.f48455b).inflate(R.layout.mg_forum_forum_post_a_comment_reply_popwindow, (ViewGroup) null);
            setContentView(inflate);
            setWidth((int) this.f48455b.getResources().getDimension(R.dimen.wdp346));
            setHeight((int) this.f48455b.getResources().getDimension(R.dimen.wdp89));
            setAnimationStyle(R.style.animationCommentReplyPop);
            g(inflate);
            setFocusable(false);
        }

        private void g(View view) {
            View findViewById = view.findViewById(R.id.resolve);
            View findViewById2 = view.findViewById(R.id.report);
            View findViewById3 = view.findViewById(R.id.reply);
            View findViewById4 = view.findViewById(R.id.delete);
            a aVar = new a();
            findViewById.setOnClickListener(aVar);
            findViewById2.setOnClickListener(aVar);
            findViewById3.setOnClickListener(aVar);
            findViewById4.setOnClickListener(aVar);
        }

        public int d() {
            return this.f41160e;
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void dismiss() {
            super.dismiss();
            View view = this.f41162g;
            if (view != null) {
                view.setClickable(true);
                this.f41162g.setFocusable(true);
            }
            switch (this.f41159d) {
                case R.id.delete /* 2131297262 */:
                    if (ForumPostsAdapter.this.f40959r != null) {
                        ForumPostsAdapter.this.f40959r.d(this.f41160e);
                        return;
                    }
                    return;
                case R.id.reply /* 2131300626 */:
                    if (ForumPostsAdapter.this.f40959r != null) {
                        ForumPostsAdapter.this.f40959r.h(this.f41160e, this.f41161f);
                        return;
                    }
                    return;
                case R.id.report /* 2131300630 */:
                    if (ForumPostsAdapter.this.f40959r != null) {
                        ForumPostsAdapter.this.f40959r.l();
                        return;
                    }
                    return;
                case R.id.resolve /* 2131300638 */:
                    if (ForumPostsAdapter.this.f40959r != null) {
                        ForumPostsAdapter.this.f40959r.p(this.f41160e);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        public String e() {
            return this.f41161f;
        }

        public void f(int i4) {
            this.f41160e = i4;
        }

        public void h(String str) {
            this.f41161f = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.join.mgps.customview.e, android.widget.PopupWindow
        public void showAsDropDown(View view, int i4, int i5) {
            this.f41162g = view;
            super.showAsDropDown(view, i4, i5);
            b();
            this.f41159d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private Context f41165b;

        /* renamed from: c  reason: collision with root package name */
        private String f41166c;

        public y(Context context, String str) {
            this.f41165b = context;
            this.f41166c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(this.f41165b, this.f41166c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private final Object f41168b;

        public z(Object obj) {
            this.f41168b = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4;
            int i5;
            int i6;
            Context context = view.getContext();
            DownloadTask downloadTask = (DownloadTask) this.f41168b;
            if (downloadTask != null) {
                downloadTask.getVer();
                downloadTask.getVer_name();
                downloadTask.getPackageName();
                downloadTask.getTipBeans();
                downloadTask.getSource_down_url();
                List<DownloadUrlBean> tp_down_url = downloadTask.getTp_down_url();
                int other_down_switch = downloadTask.getOther_down_switch();
                int cdn_down_switch = downloadTask.getCdn_down_switch();
                Object obj = this.f41168b;
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
                Object obj2 = this.f41168b;
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

    public ForumPostsAdapter(Context context, com.join.android.app.component.video.c cVar) {
        super(new ArrayList());
        this.f40945d = getClass().getSimpleName();
        this.f40947f = "";
        this.f40952k = 0;
        this.f40953l = 0;
        this.f40957p = false;
        this.f40959r = null;
        this.f40948g = context;
        this.f40949h = cVar;
        this.f40946e = S(context);
        this.f40952k = R(context);
        this.f40953l = Q(context);
        a(ViewType.POST_HEADER.ordinal(), R.layout.mg_forum_post_activity_item_post_header);
        a(ViewType.POST_HEADER1.ordinal(), R.layout.mg_forum_post_activity_item_post_header1);
        a(ViewType.POST_FOOTER.ordinal(), R.layout.mg_forum_post_activity_item_post_footer);
        a(ViewType.POST_FOOTER1.ordinal(), R.layout.mg_forum_post_activity_item_post_footer1);
        a(ViewType.POST_GAME_RES_LINK.ordinal(), R.layout.mg_forum_post_activity_item_post_game_res_link);
        a(ViewType.POST_GAME.ordinal(), R.layout.mg_forum_post_activity_item_post_game);
        a(ViewType.POST_IMAGE.ordinal(), R.layout.mg_forum_post_activity_item_post_image);
        a(ViewType.POST_VIDEO.ordinal(), R.layout.mg_forum_post_activity_item_post_videojc);
        a(ViewType.POST_IMAGE_THUMBNAIL.ordinal(), R.layout.mg_forum_post_activity_item_post_image_thumbnail);
        a(ViewType.POST_MESSAGE.ordinal(), R.layout.mg_forum_post_activity_item_post_message);
        a(ViewType.POST_RICH_MESSAGE.ordinal(), R.layout.mg_forum_post_activity_item_post_rich_message);
        a(ViewType.POST_SUBJECT.ordinal(), R.layout.mg_forum_post_activity_item_post_subject);
        a(ViewType.EMPLOYEE_TAGS.ordinal(), R.layout.mg_forum_post_activity_item_employee_tags);
        a(ViewType.DIVIDER.ordinal(), R.layout.mg_forum_post_activity_item_commnet_divider);
        U();
    }

    private void A(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.i iVar = (e0.i) e0Var.a();
            if (iVar == null) {
                return;
            }
            if (iVar.f41057j != 1) {
                baseViewHolder.setGone(R.id.flagBestAnswer, false);
            } else {
                baseViewHolder.setGone(R.id.flagBestAnswer, true);
            }
            baseViewHolder.setText(R.id.forum_post_add_time, "发布于 " + com.join.android.app.common.utils.g.a(iVar.f41052e * 1000));
            baseViewHolder.setText(R.id.groupName, iVar.f41064q);
            u0(baseViewHolder.getView(R.id.groupParent), iVar.f41065r);
            p0(baseViewHolder.itemView);
            baseViewHolder.setGone(R.id.forumExtFunc, false);
            s0(baseViewHolder.getView(R.id.forumExtFunc), iVar.f41054g);
            com.join.mgps.Util.j0.S0(baseViewHolder.getView(R.id.forum_post_add_time));
            if (iVar.f41066s) {
                baseViewHolder.setText(R.id.topMoneyTx, "赏" + iVar.f41067t + "铜板");
                ((TextView) baseViewHolder.getView(R.id.topMoneyTx)).setGravity(17);
                baseViewHolder.setGone(R.id.topMoneyTx, true);
                return;
            }
            baseViewHolder.setGone(R.id.topMoneyTx, false);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void A0(View view, int i4) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(i4);
        } else if (view instanceof Button) {
            ((Button) view).setTextColor(i4);
        }
    }

    private void B(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.j jVar = (e0.j) e0Var.a();
            if (jVar == null) {
                return;
            }
            try {
                ((VipView) baseViewHolder.getView(R.id.vipFlag)).setVipData(jVar.f41077j, jVar.f41078k);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (jVar.f41076i != 1) {
                baseViewHolder.setGone(R.id.flagBestAnswer, false);
            } else {
                baseViewHolder.setGone(R.id.flagBestAnswer, true);
            }
            baseViewHolder.setGone(R.id.forumExtFunc, true);
            baseViewHolder.setGone(R.id.forum_post_divider, !jVar.f41068a);
            baseViewHolder.setGone(R.id.forum_post_host, true);
            baseViewHolder.setText(R.id.forum_post_nickname, jVar.f41070c);
            baseViewHolder.setText(R.id.forum_post_add_time, com.join.android.app.common.utils.g.a(jVar.f41071d * 1000));
            baseViewHolder.setGone(R.id.forum_post_stickie, jVar.f41072e);
            baseViewHolder.setGone(R.id.officialIcon, jVar.f41075h);
            if (jVar.f41074g) {
                baseViewHolder.setTextColor(R.id.forum_post_nickname, this.f40948g.getResources().getColor(R.color.app_blue_color));
                baseViewHolder.setGone(R.id.forum_post_moderator, true);
            } else {
                UtilsMy.A3(this.f40948g, (TextView) baseViewHolder.getView(R.id.forum_post_nickname), jVar.f41077j, jVar.f41078k, R.color.forum_nickname_color);
                baseViewHolder.setGone(R.id.forum_post_moderator, false);
            }
            MyImageLoader.x((SimpleDraweeView) baseViewHolder.getView(R.id.forum_post_avatar_src), jVar.f41069b);
            baseViewHolder.getView(R.id.forum_post_avatar_src).setOnClickListener(new q(jVar));
            p0(baseViewHolder.itemView);
            baseViewHolder.setGone(R.id.forumExtFunc, false);
            s0(baseViewHolder.getView(R.id.forumExtFunc), jVar.f41073f);
            com.join.mgps.Util.j0.S0(baseViewHolder.getView(R.id.forum_post_avatar_src), baseViewHolder.getView(R.id.forum_post_nickname), baseViewHolder.getView(R.id.forum_post_add_time));
            com.join.mgps.Util.j0.U0(baseViewHolder.getView(R.id.vipFlag));
            String str = jVar.f41080m;
            String str2 = jVar.f41081n;
            if (baseViewHolder.getView(R.id.copperTitleTv) != null) {
                if (!TextUtils.isEmpty(str)) {
                    baseViewHolder.setGone(R.id.copperTitleTv, true);
                    baseViewHolder.setText(R.id.copperTitleTv, str);
                    Drawable drawable = this.f40948g.getResources().getDrawable(R.drawable.forum_post_host);
                    if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                        str2 = "#2fccdf";
                    }
                    drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                    baseViewHolder.getView(R.id.copperTitleTv).setBackgroundDrawable(drawable);
                    return;
                }
                baseViewHolder.setGone(R.id.copperTitleTv, false);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void C(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.l lVar = (e0.l) e0Var.a();
            if (lVar == null) {
                return;
            }
            d0((RelativeLayout) baseViewHolder.getView(R.id.forum_post_media_container), lVar.f41085a, lVar.f41086b);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(View view, e0.a aVar) {
        if (aVar == null) {
            return;
        }
        x xVar = this.f40956o;
        if (xVar != null && xVar.isShowing()) {
            this.f40956o.dismiss();
        }
        if (this.f40956o == null) {
            this.f40956o = new x(this.f40948g);
        }
        this.f40956o.f(aVar.f40999c);
        this.f40956o.h(aVar.f41001e);
        int dimension = (int) this.f40948g.getResources().getDimension(R.dimen.wdp378);
        int dimension2 = (int) this.f40948g.getResources().getDimension(R.dimen.wdp89);
        int dimension3 = (int) this.f40948g.getResources().getDimension(R.dimen.wdp72);
        if (aVar.f41008l) {
            this.f40956o.getContentView().findViewById(R.id.resolve).setVisibility(0);
            this.f40956o.getContentView().findViewById(R.id.v_resolve).setVisibility(0);
        } else {
            this.f40956o.getContentView().findViewById(R.id.resolve).setVisibility(8);
            this.f40956o.getContentView().findViewById(R.id.v_resolve).setVisibility(8);
            dimension -= dimension3;
        }
        if (aVar.f41009m) {
            this.f40956o.getContentView().findViewById(R.id.report).setVisibility(0);
            this.f40956o.getContentView().findViewById(R.id.v_report).setVisibility(0);
        } else {
            this.f40956o.getContentView().findViewById(R.id.report).setVisibility(8);
            this.f40956o.getContentView().findViewById(R.id.v_report).setVisibility(8);
            dimension -= dimension3;
        }
        if (aVar.f41010n) {
            this.f40956o.getContentView().findViewById(R.id.delete).setVisibility(0);
            this.f40956o.getContentView().findViewById(R.id.v_delete).setVisibility(0);
        } else {
            this.f40956o.getContentView().findViewById(R.id.delete).setVisibility(8);
            this.f40956o.getContentView().findViewById(R.id.v_delete).setVisibility(8);
            dimension -= dimension3;
        }
        this.f40956o.setWidth(dimension);
        int width = this.f40956o.getWidth();
        int height = this.f40956o.getHeight();
        int i4 = -width;
        if (height != 0) {
            dimension2 = height;
        }
        this.f40956o.showAsDropDown(view, i4, -((dimension2 / 2) + (view.getMeasuredHeight() / 2)));
        this.f40956o.setTouchInterceptor(new c(view));
    }

    private void D(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.k kVar = (e0.k) e0Var.a();
            if (kVar == null) {
                return;
            }
            b0(this.f40948g, kVar.f41084c.get(kVar.f41083b));
            d0 P = P(kVar.f41082a);
            if (P != null) {
                baseViewHolder.getView(R.id.img).setLayoutParams(new RelativeLayout.LayoutParams(P.f40991a, P.f40992b));
                MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.img), kVar.f41082a);
            } else {
                Y((SimpleDraweeView) baseViewHolder.getView(R.id.img), kVar.f41082a);
            }
            com.join.mgps.Util.j0.C1((ImageView) baseViewHolder.getView(R.id.img), kVar.f41083b, kVar.f41084c);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void D0(BaseViewHolder baseViewHolder, int i4) {
        if (i4 == 0) {
            baseViewHolder.setGone(R.id.linearLayout2, false);
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setGone(R.id.progressBarZip, false);
            baseViewHolder.setGone(R.id.tipsLayout, true);
            baseViewHolder.setGone(R.id.mgListviewItemDescribe, true);
            return;
        }
        baseViewHolder.setGone(R.id.linearLayout2, true);
        if (i4 == 17) {
            baseViewHolder.setGone(R.id.progressBar, false);
            baseViewHolder.setGone(R.id.progressBarZip, true);
        } else {
            baseViewHolder.setGone(R.id.progressBar, true);
            baseViewHolder.setGone(R.id.progressBarZip, false);
        }
        baseViewHolder.setGone(R.id.tipsLayout, false);
        baseViewHolder.setGone(R.id.mgListviewItemDescribe, false);
    }

    private void E(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.m mVar = (e0.m) e0Var.a();
            if (mVar == null) {
                return;
            }
            TextView textView = (TextView) baseViewHolder.getView(R.id.forum_post_message);
            if (Build.VERSION.SDK_INT >= 21) {
                ((TextView) baseViewHolder.getView(R.id.forum_post_message)).setLetterSpacing(0.02f);
            }
            V(textView);
            textView.setTextColor(this.f40948g.getResources().getColor(R.color.forum_post_detail_item_message));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setOnClickListener(new t());
            i0(textView, mVar.f41088b, mVar.f41087a, mVar.f41089c, mVar.f41090d, mVar.f41091e);
            p0(baseViewHolder.itemView);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void F(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.n nVar = (e0.n) e0Var.a();
            if (nVar == null) {
                return;
            }
            TextView textView = (TextView) baseViewHolder.getView(R.id.forum_post_message);
            V(textView);
            textView.setOnClickListener(new u());
            textView.setText(nVar.f41093b);
            p0(baseViewHolder.itemView);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void G(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.o oVar = (e0.o) e0Var.a();
            if (oVar == null) {
                return;
            }
            TextView textView = (TextView) baseViewHolder.getView(R.id.forum_post_subject);
            textView.setTextSize(0, this.f40948g.getResources().getDimensionPixelSize(R.dimen.forum_posts_activity_subject_size));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            h0(textView, oVar.f41098b, oVar.f41097a, oVar.f41099c, oVar.f41100d, oVar.f41101e, oVar.f41102f, oVar.f41103g, oVar.f41104h);
            p0(baseViewHolder.itemView);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void H(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.p pVar = (e0.p) e0Var.a();
            if (pVar == null) {
                return;
            }
            String str = pVar.f41106b;
            String str2 = pVar.f41105a;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.bannerView);
            int layoutPosition = baseViewHolder.getLayoutPosition();
            if (simpleDraweeView != null) {
                simpleDraweeView.setTag(Integer.valueOf(layoutPosition));
                simpleDraweeView.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f40952k));
                simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
                MyImageLoader.d(simpleDraweeView, R.drawable.video_bg, str2);
                simpleDraweeView.setOnClickListener(new s(layoutPosition));
            }
            FrameLayout frameLayout = (FrameLayout) baseViewHolder.getView(R.id.videoContner);
            if (frameLayout != null) {
                frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f40952k));
                com.danikula.videocache.i iVar = this.f40946e;
                if (iVar != null) {
                    str = iVar.j(str);
                }
                if (com.join.mgps.Util.g2.i(str)) {
                    this.f40949h.e(layoutPosition, new c.l(layoutPosition, str, str2), new boolean[0]);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I(PopupWindow popupWindow, MotionEvent motionEvent) {
        View contentView;
        if (popupWindow == null || motionEvent == null || (contentView = popupWindow.getContentView()) == null) {
            return false;
        }
        return !J(contentView, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J(View view, MotionEvent motionEvent) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        return iArr[0] < rawX && iArr[1] < rawY && rawX < iArr[0] + view.getWidth() && rawY < iArr[1] + view.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinearLayout.LayoutParams N(Context context) {
        if (context == null) {
            return null;
        }
        if (this.f40954m == null) {
            Resources resources = context.getResources();
            int i4 = resources.getDisplayMetrics().widthPixels;
            float f5 = context.getResources().getDisplayMetrics().density;
            int dimensionPixelSize = (int) ((i4 - resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding)) - (30 * f5));
            int i5 = (int) (4 * f5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, (int) ((dimensionPixelSize * 1.0f) / 1.5f));
            layoutParams.setMargins(0, i5, 0, i5);
            this.f40954m = layoutParams;
        }
        return this.f40954m;
    }

    private int Q(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f40953l == 0) {
            Resources resources = context.getResources();
            this.f40953l = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.5f);
        }
        return this.f40953l;
    }

    private int R(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f40952k == 0) {
            Resources resources = context.getResources();
            this.f40952k = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.f40952k;
    }

    private void U() {
        if (this.f40951j == null) {
            this.f40951j = T();
        }
    }

    private void V(TextView textView) {
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
                    spannableStringBuilder.setSpan(new y(textView.getContext(), url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 17);
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(e0.h hVar, View view) {
        if (TextUtils.isEmpty(hVar.f41047c)) {
            return;
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(hVar.f41047c);
        IntentUtil.getInstance().intentActivity(this.f40948g, intentDateBean);
    }

    private void Z(View view, boolean z4, int i4) {
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

    private void c0(Context context, String str) {
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null) {
            d0 d0Var = new d0();
            int intValue = i02[0].intValue();
            int intValue2 = i02[1].intValue();
            Resources resources = context.getResources();
            int dimensionPixelSize = (int) ((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) - (resources.getDisplayMetrics().density * 40.0f));
            d0Var.f40991a = dimensionPixelSize;
            d0Var.f40992b = (int) (dimensionPixelSize * 1.0f * ((intValue2 * 1.0f) / intValue));
            q(str, d0Var);
        }
    }

    private void d0(RelativeLayout relativeLayout, List<String> list, List<String> list2) {
        if (list != null && list.size() != 0) {
            if (this.f40951j == null) {
                this.f40951j = T();
            }
            TextView textView = (TextView) relativeLayout.findViewById(R.id.images_count);
            if (list.size() > 3) {
                textView.setVisibility(0);
                textView.setText("共" + list.size() + "张");
            } else {
                textView.setVisibility(8);
            }
            int i4 = (int) (this.f40948g.getResources().getDisplayMetrics().density * 6.0f);
            int[] iArr = {R.id.img_m_1, R.id.img_m_2, R.id.img_m_3};
            for (int i5 = 0; i5 < 3; i5++) {
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) relativeLayout.findViewById(iArr[i5]);
                LinearLayout.LayoutParams layoutParams = this.f40951j;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (i5 < list.size()) {
                    String str = list.get(i5);
                    simpleDraweeView.setVisibility(0);
                    if (i5 > 0) {
                        layoutParams2.setMargins(i4, 0, 0, 0);
                    } else {
                        layoutParams2.setMargins(0, 0, 0, 0);
                    }
                    simpleDraweeView.setLayoutParams(layoutParams2);
                    simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
                    simpleDraweeView.setOnClickListener(new w(list2, i5));
                } else {
                    simpleDraweeView.setVisibility(8);
                }
            }
            return;
        }
        relativeLayout.setVisibility(8);
    }

    private void h0(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, List<RecommendLabelTag> list2, int i4, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        com.join.mgps.Util.j0.h(textView.getContext(), spannableStringBuilder, list);
        com.join.mgps.Util.j0.i(textView.getContext(), spannableStringBuilder, list2, i4, str3);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
    }

    private void i0(TextView textView, SpannableStringBuilder spannableStringBuilder, boolean z4, boolean z5, String str, List<ForumBean.ForumPostsBean.TagInfo> list) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        com.join.mgps.Util.j0.h(textView.getContext(), spannableStringBuilder2, list);
        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2.toString().replace("<br/>", ""));
    }

    private void r(BaseViewHolder baseViewHolder, e0 e0Var) {
        String string;
        try {
            e0.a aVar = (e0.a) e0Var.a();
            if (aVar == null) {
                return;
            }
            baseViewHolder.setGone(R.id.divider, aVar.f40997a);
            try {
                ((VipView) baseViewHolder.getView(R.id.vipFlag)).setVipData(aVar.f41011o, aVar.f41012p);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            baseViewHolder.setGone(R.id.flagBestAnswer, aVar.f41007k == 1);
            baseViewHolder.setText(R.id.comment_nickname, aVar.f41001e);
            baseViewHolder.setText(R.id.comment_add_time, com.join.android.app.common.utils.g.a(aVar.f41002f * 1000));
            MyImageLoader.x((SimpleDraweeView) baseViewHolder.getView(R.id.comment_avatar_src), aVar.f41000d);
            baseViewHolder.getView(R.id.comment_avatar_src).setOnClickListener(new v(aVar));
            baseViewHolder.setGone(R.id.forum_post_host, aVar.f41003g);
            baseViewHolder.setGone(R.id.isOfficial, aVar.f41006j);
            if (aVar.f41005i) {
                baseViewHolder.setTextColor(R.id.comment_nickname, this.f40948g.getResources().getColor(R.color.app_blue_color));
                baseViewHolder.setGone(R.id.forum_post_moderator, true);
            } else {
                UtilsMy.A3(this.f40948g, (TextView) baseViewHolder.getView(R.id.comment_nickname), aVar.f41011o, aVar.f41012p, R.color.forum_nickname_color);
                baseViewHolder.setGone(R.id.forum_post_moderator, false);
            }
            baseViewHolder.setGone(R.id.moderator, aVar.f41013q);
            if (!TextUtils.isEmpty(aVar.f41014r)) {
                baseViewHolder.setGone(R.id.member_honor, true);
                baseViewHolder.setText(R.id.member_honor, aVar.f41014r);
            } else {
                baseViewHolder.setGone(R.id.member_honor, false);
            }
            int i4 = aVar.f41004h;
            if (i4 == 1) {
                string = this.f40948g.getResources().getString(R.string.comment_item_floor_1st);
            } else if (i4 == 2) {
                string = this.f40948g.getResources().getString(R.string.comment_item_floor_2nd);
            } else {
                string = this.f40948g.getResources().getString(R.string.comment_item_floor, Integer.valueOf(aVar.f41004h));
            }
            baseViewHolder.setText(R.id.comment_floor, string);
            p0(baseViewHolder.itemView);
            o0(baseViewHolder.getView(R.id.comment_reply), aVar);
            com.join.mgps.Util.j0.S0(baseViewHolder.getView(R.id.comment_avatar_src), baseViewHolder.getView(R.id.comment_nickname), baseViewHolder.getView(R.id.comment_add_time));
            com.join.mgps.Util.j0.U0(baseViewHolder.getView(R.id.vipFlag));
            x0(baseViewHolder.getView(R.id.comment_avatar_src), aVar.f40998b);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void s(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.b bVar = (e0.b) e0Var.a();
            if (bVar == null || baseViewHolder.getView(R.id.comment_img) == null) {
                return;
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.comment_img);
            c0(this.f40948g, bVar.f41017c.get(bVar.f41016b));
            d0 P = P(bVar.f41015a);
            if (P != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(P.f40991a, P.f40992b);
                int i4 = (int) (4 * this.f40948g.getResources().getDisplayMetrics().density);
                layoutParams.setMargins(0, i4, 0, i4);
                simpleDraweeView.setLayoutParams(layoutParams);
                MyImageLoader.h(simpleDraweeView, bVar.f41015a);
            } else {
                X(simpleDraweeView, bVar.f41015a);
            }
            com.join.mgps.Util.j0.C1(simpleDraweeView, bVar.f41016b, bVar.f41017c);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void t(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.c cVar = (e0.c) e0Var.a();
            if (cVar == null) {
                return;
            }
            baseViewHolder.setText(R.id.comment_message, cVar.f41019b);
            V((TextView) baseViewHolder.getView(R.id.comment_message));
            p0(baseViewHolder.itemView);
            n0(baseViewHolder.getView(R.id.comment_message), cVar);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void t0(View view, String str) {
        view.setOnClickListener(new l(str));
    }

    private void u(BaseViewHolder baseViewHolder, e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        try {
            e0.e eVar = (e0.e) e0Var.a();
            baseViewHolder.setBackgroundColor(R.id.v_view, eVar.f41033b);
            baseViewHolder.getView(R.id.v_view).setLayoutParams(new ViewGroup.LayoutParams(-1, eVar.f41032a));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void u0(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new n(i4));
    }

    private void v(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.f fVar = (e0.f) e0Var.a();
            if (fVar == null) {
                return;
            }
            if (this.f40950i == null) {
                this.f40950i = new c0(this.f40948g);
            }
            this.f40950i.d(fVar.f41035b);
            this.f40950i.e(fVar.f41036c);
            this.f40950i.c().clear();
            this.f40950i.c().addAll(fVar.f41034a);
            ((HListView) baseViewHolder.getView(R.id.list)).setAdapter((ListAdapter) this.f40950i);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void v0(View view, ForumBean.GameInfo gameInfo) {
        view.setOnClickListener(new j(gameInfo));
    }

    private void w(BaseViewHolder baseViewHolder, e0 e0Var) {
    }

    private void x(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.g gVar = (e0.g) e0Var.a();
            if (gVar == null) {
                return;
            }
            baseViewHolder.setGone(R.id.post_footer_divider, gVar.f41044h);
            baseViewHolder.setText(R.id.forum_name, gVar.f41038b);
            baseViewHolder.setGone(R.id.forum_name, com.join.mgps.Util.g2.i(gVar.f41038b));
            com.join.mgps.Util.j0.D1((TextView) baseViewHolder.getView(R.id.forum_post_view), gVar.f41039c + "", "0");
            com.join.mgps.Util.j0.D1((TextView) baseViewHolder.getView(R.id.forum_post_commit), gVar.f41040d + "", "0");
            Z(baseViewHolder.itemView, gVar.f41043g, gVar.f41041e);
            ((View) baseViewHolder.getView(R.id.forum_post_praise).getParent()).setOnClickListener(new r(gVar.f41037a));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void x0(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new o(i4));
    }

    private void y(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            final e0.h hVar = (e0.h) e0Var.a();
            if (hVar == null) {
                return;
            }
            ForumBean.GameInfo gameInfo = hVar.f41046b;
            gameInfo.getGame_id();
            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.detial_fourm_butn_selector1);
            int dimensionPixelSize = this.f40948g.getResources().getDimensionPixelSize(R.dimen.forum_posts_activity_gameinfo_download_width);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) baseViewHolder.getView(R.id.mgListviewItemInstall).getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            baseViewHolder.getView(R.id.mgListviewItemInstall).setLayoutParams(layoutParams);
            baseViewHolder.setText(R.id.mgListviewItemInstall, "打开");
            baseViewHolder.setText(R.id.mgListviewItemAppname, gameInfo.getGame_name());
            MyImageLoader.j((SimpleDraweeView) baseViewHolder.getView(R.id.mgListviewItemIcon), gameInfo.getGame_ico_remote(), MyImageLoader.A(this.f40948g));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.join.mgps.adapter.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ForumPostsAdapter.this.W(hVar, view);
                }
            };
            baseViewHolder.getView(R.id.mgListviewItemInstall).setOnClickListener(onClickListener);
            baseViewHolder.getView(R.id.relateLayoutApp).setOnClickListener(onClickListener);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup.LayoutParams y0(String str, View view, com.facebook.imagepipeline.image.f fVar) {
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
            com.join.mgps.Util.w0.e(this.f40945d + "setPostImageParam-->rawHeight=" + height + " rawWidth=" + width + " ratio=" + f5 + " itemHeight=" + i4 + " itemWidth=" + dimensionPixelSize + "\n" + str);
            view.setMinimumHeight(0);
            view.setLayoutParams(layoutParams);
            return layoutParams;
        }
        return null;
    }

    private void z(BaseViewHolder baseViewHolder, e0 e0Var) {
        try {
            e0.h hVar = (e0.h) e0Var.a();
            if (hVar == null) {
                return;
            }
            ForumBean.GameInfo gameInfo = hVar.f41046b;
            String str = hVar.f41045a;
            String game_id = gameInfo.getGame_id();
            baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.detial_fourm_butn_selector1);
            int dimensionPixelSize = this.f40948g.getResources().getDimensionPixelSize(R.dimen.forum_posts_activity_gameinfo_download_width);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) baseViewHolder.getView(R.id.mgListviewItemInstall).getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            baseViewHolder.getView(R.id.mgListviewItemInstall).setLayoutParams(layoutParams);
            baseViewHolder.setText(R.id.mgListviewItemAppname, gameInfo.getGame_name());
            baseViewHolder.setText(R.id.mgListviewItemDescribe, gameInfo.getGame_desc());
            String game_size = gameInfo.getGame_size();
            MyImageLoader.j((SimpleDraweeView) baseViewHolder.getView(R.id.mgListviewItemIcon), gameInfo.getGame_ico_remote(), MyImageLoader.A(this.f40948g));
            List<ForumBean.GameInfo.GameTagInfo> game_tag_info = gameInfo.getGame_tag_info();
            D0(baseViewHolder, 0);
            DownloadTask downloadTask = gameInfo.getDownloadTask();
            if (downloadTask != null) {
                l0(baseViewHolder, downloadTask);
            } else {
                if (gameInfo.getPay_tag_info() != null && gameInfo.getPay_tag_info().getPay_game_amount() > 0 && !b2.e0.o().p(gameInfo.getGame_id())) {
                    k0((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), gameInfo.getPay_tag_info().getPay_game_amount());
                } else {
                    j0(baseViewHolder.getView(R.id.mgListviewItemInstall), gameInfo.getDown_status());
                }
                baseViewHolder.getView(R.id.mgListviewItemInstall).setOnClickListener(new k(gameInfo, downloadTask, str, game_id));
            }
            if ((ConstantIntEnum.H5.value() + "").equals(gameInfo.getPlugin_num())) {
                baseViewHolder.setGone(R.id.tipsLayout, false);
                baseViewHolder.setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn);
                baseViewHolder.setText(R.id.mgListviewItemInstall, "开始");
                baseViewHolder.setTextColor(R.id.mgListviewItemInstall, this.f40948g.getResources().getColor(R.color.app_blue_color));
            } else {
                baseViewHolder.setGone(R.id.tipsLayout, true);
                com.join.mgps.Util.j0.c(game_tag_info, (LinearLayout) baseViewHolder.getView(R.id.tipsLayout), this.f40948g);
                UtilsMy.I(gameInfo.getScore(), gameInfo.getDown_count(), game_size, gameInfo.getSp_tag_info(), null, (LinearLayout) baseViewHolder.getView(R.id.tipsLayout), this.f40948g);
                UtilsMy.j3(gameInfo.getSp_tag_info(), baseViewHolder.itemView, gameInfo.getDownloadTask());
            }
            baseViewHolder.getView(R.id.relateLayoutApp).setOnClickListener(new p(str, game_id, gameInfo));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void z0(View view, CharSequence charSequence) {
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        } else if (view instanceof Button) {
            ((Button) view).setText(charSequence);
        }
    }

    void B0(View view, int i4, boolean z4, boolean z5, int i5, int i6, String str, String str2) {
        if (this.f40958q == null) {
            this.f40958q = new a0(this.f40948g);
        }
        this.f40958q.q(i5);
        this.f40958q.A(i6);
        this.f40958q.x(str2);
        this.f40958q.w(i4);
        this.f40958q.t(0);
        if (z4) {
            this.f40958q.v(0);
        } else {
            this.f40958q.v(8);
        }
        if (z5) {
            this.f40958q.z(0);
        } else {
            this.f40958q.z(8);
        }
        if (com.join.mgps.Util.g2.h(str)) {
            str = "";
        }
        this.f40958q.y(str);
        this.f40958q.showAsDropDown(view);
    }

    public void K() {
        Hashtable<String, d0> hashtable = this.f40955n;
        if (hashtable != null) {
            hashtable.clear();
            System.gc();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: L */
    public void convert(@NonNull BaseViewHolder baseViewHolder, e0 e0Var) {
        int itemType = e0Var.getItemType();
        if (itemType == ViewType.POST_HEADER.ordinal()) {
            B(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_HEADER1.ordinal()) {
            A(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_FOOTER.ordinal()) {
            x(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_FOOTER1.ordinal()) {
            w(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_GAME_RES_LINK.ordinal()) {
            y(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_GAME.ordinal()) {
            z(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_IMAGE.ordinal()) {
            D(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_VIDEO.ordinal()) {
            H(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_IMAGE_THUMBNAIL.ordinal()) {
            C(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_MESSAGE.ordinal()) {
            E(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_RICH_MESSAGE.ordinal()) {
            F(baseViewHolder, e0Var);
        } else if (itemType == ViewType.POST_SUBJECT.ordinal()) {
            G(baseViewHolder, e0Var);
        } else if (itemType == ViewType.EMPLOYEE_TAGS.ordinal()) {
            v(baseViewHolder, e0Var);
        } else if (itemType == ViewType.DIVIDER.ordinal()) {
            u(baseViewHolder, e0Var);
        }
    }

    public String M() {
        return this.f40947f;
    }

    BitmapFactory.Options O(String str) {
        return null;
    }

    d0 P(String str) {
        Hashtable<String, d0> hashtable = this.f40955n;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str);
    }

    public com.danikula.videocache.i S(Context context) {
        return MApplication.m(context);
    }

    LinearLayout.LayoutParams T() {
        DisplayMetrics displayMetrics = this.f40948g.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        int dimensionPixelSize = ((int) ((displayMetrics.widthPixels - (this.f40948g.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2)) - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (dimensionPixelSize <= i4) {
            i4 = dimensionPixelSize > i5 ? i5 : dimensionPixelSize;
        }
        return new LinearLayout.LayoutParams(i4, i4);
    }

    public void X(SimpleDraweeView simpleDraweeView, String str) {
        try {
            simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new b(simpleDraweeView)).a(MyImageLoader.H(str)).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void Y(SimpleDraweeView simpleDraweeView, String str) {
        try {
            simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
            simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().H(new a(simpleDraweeView)).a(MyImageLoader.H(str)).build());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a0(DownloadTask downloadTask, int i4) {
    }

    void b0(Context context, String str) {
        Integer[] i02 = com.join.mgps.Util.j0.i0(str);
        if (i02 != null) {
            d0 d0Var = new d0();
            int intValue = i02[0].intValue();
            int intValue2 = i02[1].intValue();
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2);
            d0Var.f40991a = dimensionPixelSize;
            d0Var.f40992b = (int) (dimensionPixelSize * 1.0f * ((intValue2 * 1.0f) / intValue));
            q(str, d0Var);
        }
    }

    public void e0(String str) {
        this.f40947f = str;
    }

    LinearLayout.LayoutParams f0(String str, View view, com.facebook.imagepipeline.image.f fVar) {
        if (fVar != null) {
            int width = fVar.getWidth();
            int height = fVar.getHeight();
            Context context = view.getContext();
            Resources resources = context.getResources();
            int i4 = resources.getDisplayMetrics().widthPixels;
            float f5 = context.getResources().getDisplayMetrics().density;
            int dimensionPixelSize = (int) ((i4 - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) - (40 * f5));
            int i5 = (int) (4 * f5);
            float f6 = (height * 1.0f) / width;
            int i6 = (int) (dimensionPixelSize * 1.0f * f6);
            com.join.mgps.Util.w0.e(this.f40945d + "setCommentImageItemParams-->rawHeight=" + height + " rawWidth=" + width + " ratio=" + f6 + " itemHeight=" + i6 + " itemWidth=" + dimensionPixelSize + "\n" + str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, i6);
            layoutParams.setMargins(0, i5, 0, i5);
            view.setLayoutParams(layoutParams);
            return layoutParams;
        }
        return null;
    }

    void g0(e0 e0Var, boolean z4) {
        if (e0Var == null) {
            return;
        }
        try {
            ((e0.d) e0Var.a()).f41031h = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void j0(View view, int i4) {
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
                textView.setText(this.f40948g.getResources().getString(R.string.download_status_download));
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
                button.setText(this.f40948g.getResources().getString(R.string.download_status_download));
                button.setTextSize(2, 13.0f);
                button.setTextColor(-12802819);
                button.setBackgroundResource(R.drawable.recom_blue_butn);
            }
        }
    }

    void k0(TextView textView, int i4) {
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        textView.setText(textView.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(i4)));
        textView.setTextSize(2, 13.0f);
        textView.setTextColor(-12802819);
        textView.setBackgroundResource(R.drawable.recom_blue_butn);
    }

    void l0(BaseViewHolder baseViewHolder, Object obj) {
        int i4;
        Button button = (Button) baseViewHolder.getView(R.id.mgListviewItemInstall);
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
                        z0(button, "更新");
                        A0(button, resources.getColor(R.color.app_green_color));
                    } else {
                        button.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        z0(button, context.getResources().getString(R.string.download_status_finished));
                        A0(button, resources.getColor(R.color.app_main_color));
                    }
                } else {
                    button.setBackgroundResource(R.drawable.recom_green_butn);
                    if (i4 > 0) {
                        k0(button, i4);
                    } else {
                        j0(button, status);
                    }
                }
            } else {
                button.setBackgroundResource(R.drawable.recom_green_butn);
                if (i4 > 0) {
                    k0(button, i4);
                } else {
                    j0(button, status);
                }
            }
        } else {
            int status2 = downloadTask.getStatus();
            if (i4 > 0) {
                status2 = 43;
            }
            if (status2 != 0) {
                if (status2 == 27) {
                    z0(button, "暂停中");
                } else if (status2 != 2) {
                    if (status2 != 3) {
                        if (status2 != 5) {
                            if (status2 != 6) {
                                if (status2 != 7) {
                                    if (status2 != 42) {
                                        if (status2 != 43) {
                                            switch (status2) {
                                                case 9:
                                                    D0(baseViewHolder, 0);
                                                    button.setBackgroundResource(R.drawable.recom_green_butn);
                                                    z0(button, "更新");
                                                    A0(button, resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 10:
                                                    D0(baseViewHolder, 16);
                                                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    z0(button, "等待");
                                                    A0(button, resources.getColor(R.color.app_blue_color));
                                                    break;
                                                case 11:
                                                    D0(baseViewHolder, 0);
                                                    button.setBackgroundResource(R.drawable.recom_green_butn);
                                                    z0(button, "安装");
                                                    A0(button, resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 12:
                                                    D0(baseViewHolder, 17);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    baseViewHolder.setText(R.id.loding_info, "解压中..");
                                                    ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                    button.setBackgroundResource(R.drawable.extract);
                                                    z0(button, "解压中");
                                                    A0(button, resources.getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    D0(baseViewHolder, 17);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                    baseViewHolder.setText(R.id.loding_info, "点击重新解压");
                                                    ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) downloadTask.getProgress());
                                                    button.setBackgroundResource(R.drawable.reextract);
                                                    z0(button, "解压");
                                                    A0(button, resources.getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        } else {
                                            D0(baseViewHolder, 0);
                                            button.setBackgroundResource(R.drawable.recom_green_butn);
                                            if (i4 > 0) {
                                                k0(button, i4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        D0(baseViewHolder, 0);
                        button.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        z0(button, context.getResources().getString(R.string.download_status_finished));
                        A0(button, resources.getColor(R.color.app_main_color));
                    }
                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                    z0(button, "继续");
                    A0(button, resources.getColor(R.color.app_blue_color));
                    D0(baseViewHolder, 16);
                    try {
                        if (downloadTask.getSize() == 0) {
                            baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                        } else {
                            baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                        }
                        ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    baseViewHolder.setText(R.id.loding_info, "暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    button.setBackgroundResource(R.drawable.recom_blue_butn);
                    z0(button, "暂停");
                    A0(button, resources.getColor(R.color.app_blue_color));
                    D0(baseViewHolder, 16);
                    if (downloadTask.getSize() == 0) {
                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                    } else {
                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                    }
                    ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
                    String speed = downloadTask.getSpeed();
                    baseViewHolder.setText(R.id.loding_info, speed + "/S");
                }
            }
            D0(baseViewHolder, 0);
            button.setBackgroundResource(R.drawable.recom_green_butn);
            if (i4 > 0) {
                k0(button, i4);
            } else {
                j0(button, status);
            }
        }
        button.setOnClickListener(new z(obj));
    }

    public void m0(b0 b0Var) {
        this.f40959r = b0Var;
    }

    public void n0(View view, e0.c cVar) {
        view.setOnLongClickListener(new g(cVar));
    }

    public void o0(View view, e0.a aVar) {
        view.setOnClickListener(new f(aVar));
    }

    public void p0(View view) {
        view.setOnClickListener(new e());
    }

    void q(String str, d0 d0Var) {
        if (this.f40955n == null) {
            this.f40955n = new Hashtable<>();
        }
        this.f40955n.put(str, d0Var);
    }

    public void q0(View view, boolean z4, boolean z5, int i4, int i5, String str, String str2) {
        view.setOnLongClickListener(new i(i4, z4, z5, i5, str, str2));
    }

    public void r0(View view, int i4, int i5, String str) {
        com.join.mgps.Util.w0.e("setOnCommentReplyReply", "cid=" + i4 + " rid=" + i5 + " rNickname=" + str);
        view.setOnClickListener(new h(i4, i5, str));
    }

    public void s0(View view, int i4) {
        view.setOnClickListener(new d(i4));
    }

    public void w0(View view, String str, String str2) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new m(str2));
    }

    /* loaded from: classes4.dex */
    public static class c0 extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private final Context f40981b;

        /* renamed from: c  reason: collision with root package name */
        private List<RecommendLabelTag> f40982c;

        /* renamed from: d  reason: collision with root package name */
        private int f40983d;

        /* renamed from: e  reason: collision with root package name */
        private String f40984e;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecommendLabelTag f40985b;

            a(RecommendLabelTag recommendLabelTag) {
                this.f40985b = recommendLabelTag;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil.getInstance().goMainLabelActivity(view.getContext(), this.f40985b.getTag_id(), c0.this.f40983d, c0.this.f40984e);
            }
        }

        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            TextView f40987a;

            b() {
            }
        }

        public c0(Context context, List<RecommendLabelTag> list) {
            this.f40981b = context;
            this.f40982c = list;
        }

        public List<RecommendLabelTag> c() {
            return this.f40982c;
        }

        public void d(int i4) {
            this.f40983d = i4;
        }

        public void e(String str) {
            this.f40984e = str;
        }

        public void f(List<RecommendLabelTag> list) {
            this.f40982c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<RecommendLabelTag> list = this.f40982c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<RecommendLabelTag> list = this.f40982c;
            if (list == null || i4 >= list.size()) {
                return null;
            }
            return this.f40982c.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            View view2;
            b bVar;
            RecommendLabelTag recommendLabelTag;
            if (view == null) {
                bVar = new b();
                view2 = LayoutInflater.from(this.f40981b).inflate(R.layout.forum_group_tag_detail_item, (ViewGroup) null);
                bVar.f40987a = (TextView) view2.findViewById(R.id.tagTv);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (b) view.getTag();
            }
            if (bVar.f40987a != null && (recommendLabelTag = (RecommendLabelTag) getItem(i4)) != null) {
                TextView textView = bVar.f40987a;
                textView.setText("#" + recommendLabelTag.getTag_name());
                bVar.f40987a.setOnClickListener(new a(recommendLabelTag));
            }
            return view2;
        }

        public c0(Context context) {
            this.f40981b = context;
            this.f40982c = new ArrayList();
        }
    }
}
