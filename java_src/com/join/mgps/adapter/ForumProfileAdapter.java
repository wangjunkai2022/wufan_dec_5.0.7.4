package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.MApplication;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.optimizetext.StaticLayoutView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumProfileAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private com.join.android.app.component.optimizetext.b f41170b;

    /* renamed from: c  reason: collision with root package name */
    com.danikula.videocache.i f41171c;

    /* renamed from: d  reason: collision with root package name */
    private Context f41172d;

    /* renamed from: g  reason: collision with root package name */
    LinearLayout.LayoutParams f41175g;

    /* renamed from: h  reason: collision with root package name */
    LinearLayout.LayoutParams f41176h;

    /* renamed from: f  reason: collision with root package name */
    int f41174f = 0;

    /* renamed from: i  reason: collision with root package name */
    private j f41177i = null;

    /* renamed from: e  reason: collision with root package name */
    private List<r> f41173e = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        POST_HEADER,
        POST_SUBJECT,
        POST_MESSAGE,
        POST_IMAGE_THUMBNAIL,
        POST_VIDEO_THUMBNAIL,
        POST_FOOTER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r.f f41178b;

        a(r.f fVar) {
            this.f41178b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41178b.f41255m).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41180b;

        b(int i4) {
            this.f41180b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileAdapter.this.f41177i != null) {
                ForumProfileAdapter.this.f41177i.a(this.f41180b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f41182b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41183c;

        c(List list, int i4) {
            this.f41182b = list;
            this.f41183c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f41182b.size()];
            this.f41182b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f41183c, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41185b;

        d(String str) {
            this.f41185b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.Q0(view.getContext(), this.f41185b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41187b;

        e(int i4) {
            this.f41187b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileAdapter.this.f41177i != null) {
                ForumProfileAdapter.this.f41177i.g(this.f41187b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41189b;

        f(int i4) {
            this.f41189b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileAdapter.this.f41177i != null) {
                ForumProfileAdapter.this.f41177i.f(this.f41189b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41191b;

        g(int i4) {
            this.f41191b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileAdapter.this.f41177i != null) {
                ForumProfileAdapter.this.f41177i.b(this.f41191b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41193b;

        h(int i4) {
            this.f41193b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.findViewById(R.id.forum_post_praise_icon).startAnimation(AnimationUtils.loadAnimation(ForumProfileAdapter.this.f41172d, R.anim.scale_reset));
            if (ForumProfileAdapter.this.f41177i != null) {
                Context context = view.getContext();
                if (com.join.mgps.Util.j0.Y0(context)) {
                    ForumProfileAdapter.this.f41177i.a(this.f41193b);
                    return;
                }
                com.join.mgps.Util.l2.a(context).b("用户未登录，请登录");
                com.join.mgps.Util.j0.L0(context);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41195b;

        i(String str) {
            this.f41195b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f41195b);
            if (ForumProfileAdapter.this.f41177i != null) {
                ForumProfileAdapter.this.f41177i.c(parseInt);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(int i4);

        void b(int i4);

        void c(int i4);

        void f(int i4);

        void g(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends s {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41197b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41198c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41199d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41200e;

        k() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l extends s {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41202b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41203c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41204d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41205e;

        /* renamed from: f  reason: collision with root package name */
        public View f41206f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f41207g;

        /* renamed from: h  reason: collision with root package name */
        public RelativeLayout f41208h;

        /* renamed from: i  reason: collision with root package name */
        public VipView f41209i;

        /* renamed from: j  reason: collision with root package name */
        public ImageView f41210j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f41211k;

        l() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends s {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41213b;

        /* renamed from: c  reason: collision with root package name */
        public RelativeLayout f41214c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f41215d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f41216e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f41217f;

        m() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class n extends s {

        /* renamed from: b  reason: collision with root package name */
        public ImageView f41219b;

        n() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o extends s {

        /* renamed from: b  reason: collision with root package name */
        public StaticLayoutView f41221b;

        o() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p extends s {

        /* renamed from: b  reason: collision with root package name */
        public Button f41223b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41224c;

        p() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q extends s {

        /* renamed from: b  reason: collision with root package name */
        public ImageView f41226b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f41227c;

        /* renamed from: d  reason: collision with root package name */
        public FrameLayout f41228d;

        q() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class r {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41230a;

        /* renamed from: b  reason: collision with root package name */
        Object f41231b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumWelcomeAdItemBean> f41232a;

            public a() {
            }

            public a(List<ForumBean.ForumWelcomeAdItemBean> list) {
                this.f41232a = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {
        }

        /* loaded from: classes4.dex */
        public static class c {
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            ForumBean f41233a;

            /* renamed from: b  reason: collision with root package name */
            ForumBean f41234b;

            public d() {
            }

            public d(ForumBean forumBean, ForumBean forumBean2) {
                this.f41233a = forumBean;
                this.f41234b = forumBean2;
            }
        }

        /* loaded from: classes4.dex */
        public static class e {

            /* renamed from: a  reason: collision with root package name */
            public int f41235a;

            /* renamed from: b  reason: collision with root package name */
            public String f41236b;

            /* renamed from: c  reason: collision with root package name */
            public int f41237c;

            /* renamed from: d  reason: collision with root package name */
            public int f41238d;

            /* renamed from: e  reason: collision with root package name */
            public int f41239e;

            /* renamed from: f  reason: collision with root package name */
            public int f41240f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41241g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41242h;

            public e() {
            }

            public e(int i4, int i5, String str, int i6, int i7, int i8, boolean z4, boolean z5) {
                this.f41235a = i4;
                this.f41240f = i5;
                this.f41236b = str;
                this.f41237c = i6;
                this.f41238d = i7;
                this.f41239e = i8;
                this.f41241g = z4;
                this.f41242h = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41243a;

            /* renamed from: b  reason: collision with root package name */
            public String f41244b;

            /* renamed from: c  reason: collision with root package name */
            public String f41245c;

            /* renamed from: d  reason: collision with root package name */
            public long f41246d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41247e;

            /* renamed from: f  reason: collision with root package name */
            public int f41248f;

            /* renamed from: g  reason: collision with root package name */
            public int f41249g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41250h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f41251i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f41252j;

            /* renamed from: k  reason: collision with root package name */
            public int f41253k;

            /* renamed from: l  reason: collision with root package name */
            public int f41254l;

            /* renamed from: m  reason: collision with root package name */
            public int f41255m;

            /* renamed from: n  reason: collision with root package name */
            public String f41256n;

            /* renamed from: o  reason: collision with root package name */
            public String f41257o;

            public f() {
            }

            public f(boolean z4, String str, String str2, long j4, boolean z5, int i4, int i5, boolean z6, int i6, int i7, boolean z7, String str3, String str4, int i8) {
                this.f41243a = z4;
                this.f41244b = str;
                this.f41245c = str2;
                this.f41246d = j4;
                this.f41247e = z5;
                this.f41248f = i4;
                this.f41249g = i5;
                this.f41255m = i8;
                this.f41250h = z6;
                this.f41253k = i6;
                this.f41254l = i7;
                this.f41252j = z7;
                this.f41256n = str3;
                this.f41257o = str4;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f41258a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f41259b;

            /* renamed from: c  reason: collision with root package name */
            public int f41260c;

            public g(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f41258a = list;
                this.f41259b = list2;
                this.f41260c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class h implements com.join.android.app.component.optimizetext.c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41261a;

            /* renamed from: b  reason: collision with root package name */
            public String f41262b;

            /* renamed from: c  reason: collision with root package name */
            public int f41263c;

            /* renamed from: d  reason: collision with root package name */
            public int f41264d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41265e;

            /* renamed from: f  reason: collision with root package name */
            public String f41266f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41267g;

            /* renamed from: h  reason: collision with root package name */
            public SpannableStringBuilder f41268h;

            public h() {
            }

            @Override // com.join.android.app.component.optimizetext.c
            public SpannableStringBuilder a() {
                return this.f41268h;
            }

            @Override // com.join.android.app.component.optimizetext.c
            public String b() {
                return this.f41263c + "";
            }

            public h(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, SpannableStringBuilder spannableStringBuilder) {
                this.f41261a = z4;
                this.f41262b = str;
                this.f41263c = i4;
                this.f41264d = i5;
                this.f41265e = z5;
                this.f41266f = str2;
                this.f41267g = list;
                this.f41268h = spannableStringBuilder;
            }
        }

        /* loaded from: classes4.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41269a;

            /* renamed from: b  reason: collision with root package name */
            public String f41270b;

            /* renamed from: c  reason: collision with root package name */
            public int f41271c;

            /* renamed from: d  reason: collision with root package name */
            public int f41272d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41273e;

            /* renamed from: f  reason: collision with root package name */
            public String f41274f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41275g;

            public i() {
            }

            public i(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f41269a = z4;
                this.f41270b = str;
                this.f41271c = i4;
                this.f41272d = i5;
                this.f41273e = z5;
                this.f41274f = str2;
                this.f41275g = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            public String f41276a;

            /* renamed from: b  reason: collision with root package name */
            public String f41277b;

            /* renamed from: c  reason: collision with root package name */
            public String f41278c;

            public j(String str, String str2, String str3) {
                this.f41276a = str;
                this.f41277b = str2;
                this.f41278c = str3;
            }
        }

        public r() {
        }

        public Object a() {
            return this.f41231b;
        }

        public ViewType b() {
            return this.f41230a;
        }

        public void c(Object obj) {
            this.f41231b = obj;
        }

        public void d(ViewType viewType) {
            this.f41230a = viewType;
        }

        public r(ViewType viewType, Object obj) {
            this.f41230a = viewType;
            this.f41231b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class s {
        s() {
        }
    }

    public ForumProfileAdapter(Context context) {
        this.f41172d = context;
        this.f41170b = new com.join.android.app.component.optimizetext.b(context);
        this.f41171c = m(context);
        o();
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        k kVar;
        r.e eVar;
        if (view != null) {
            kVar = (k) view.getTag();
        } else {
            kVar = new k();
            view = LayoutInflater.from(this.f41172d).inflate(R.layout.mg_forum_welcome_item_post_footer, (ViewGroup) null);
            kVar.f41197b = (TextView) view.findViewById(R.id.forum_name);
            kVar.f41198c = (TextView) view.findViewById(R.id.forum_post_view);
            kVar.f41199d = (TextView) view.findViewById(R.id.forum_post_commit);
            kVar.f41200e = (TextView) view.findViewById(R.id.forum_post_praise);
            view.setTag(kVar);
        }
        try {
            eVar = (r.e) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (eVar == null) {
            return view;
        }
        if (eVar.f41242h) {
            view.findViewById(R.id.post_footer_divider).setVisibility(0);
        } else {
            view.findViewById(R.id.post_footer_divider).setVisibility(8);
        }
        kVar.f41197b.setText(eVar.f41236b);
        if (com.join.mgps.Util.g2.h(eVar.f41236b)) {
            ((ViewGroup) kVar.f41197b.getParent()).setVisibility(8);
        } else {
            ((ViewGroup) kVar.f41197b.getParent()).setVisibility(0);
        }
        TextView textView = kVar.f41198c;
        com.join.mgps.Util.j0.D1(textView, eVar.f41237c + "", "0");
        TextView textView2 = kVar.f41199d;
        com.join.mgps.Util.j0.D1(textView2, eVar.f41238d + "", "0");
        p(view, eVar.f41241g, eVar.f41239e);
        int i5 = eVar.f41235a;
        ((View) kVar.f41200e.getParent()).setOnClickListener(new b(i5));
        y(view, i5);
        x((View) kVar.f41197b.getParent(), eVar.f41240f);
        A((View) kVar.f41200e.getParent(), i5, eVar.f41241g, eVar.f41239e);
        return view;
    }

    private View g(int i4, View view, ViewGroup viewGroup) {
        l lVar;
        r.f fVar;
        if (view != null) {
            lVar = (l) view.getTag();
        } else {
            lVar = new l();
            view = LayoutInflater.from(this.f41172d).inflate(R.layout.mg_forum_welcome_item_post_header, (ViewGroup) null);
            lVar.f41206f = view.findViewById(R.id.forum_post_divider);
            lVar.f41202b = (SimpleDraweeView) view.findViewById(R.id.forum_post_avatar_src);
            lVar.f41203c = (TextView) view.findViewById(R.id.forum_post_nickname);
            lVar.f41204d = (TextView) view.findViewById(R.id.forum_post_add_time);
            lVar.f41205e = (TextView) view.findViewById(R.id.forum_post_stickie);
            lVar.f41208h = (RelativeLayout) view.findViewById(R.id.forumExtFunc);
            lVar.f41207g = (ImageView) view.findViewById(R.id.forum_post_moderator);
            lVar.f41210j = (ImageView) view.findViewById(R.id.officialIcon);
            lVar.f41209i = (VipView) view.findViewById(R.id.vipFlag);
            lVar.f41211k = (TextView) view.findViewById(R.id.copperTitleTv);
            view.setTag(lVar);
        }
        try {
            fVar = (r.f) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (fVar == null) {
            return view;
        }
        try {
            UtilsMy.A3(this.f41172d, lVar.f41203c, fVar.f41253k, fVar.f41254l, R.color.forum_nickname_color);
            lVar.f41209i.setVipData(fVar.f41253k, fVar.f41254l);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        lVar.f41208h.setVisibility(0);
        if (fVar.f41243a) {
            lVar.f41206f.setVisibility(8);
        } else {
            lVar.f41206f.setVisibility(0);
        }
        lVar.f41203c.setText(fVar.f41245c);
        lVar.f41204d.setText(com.join.android.app.common.utils.g.a(fVar.f41246d * 1000));
        if (fVar.f41247e) {
            lVar.f41205e.setVisibility(0);
        } else {
            lVar.f41205e.setVisibility(8);
        }
        if (fVar.f41251i) {
            lVar.f41207g.setVisibility(0);
        } else {
            lVar.f41207g.setVisibility(8);
        }
        if (fVar.f41252j) {
            lVar.f41210j.setVisibility(0);
        } else {
            lVar.f41210j.setVisibility(8);
        }
        MyImageLoader.x(lVar.f41202b, fVar.f41244b);
        lVar.f41202b.setOnClickListener(new a(fVar));
        int i5 = fVar.f41248f;
        y(view, i5);
        C(lVar.f41208h, i5);
        com.join.mgps.Util.j0.S0(lVar.f41202b, lVar.f41203c, lVar.f41204d);
        com.join.mgps.Util.j0.U0(lVar.f41209i);
        String str = fVar.f41256n;
        String str2 = fVar.f41257o;
        if (lVar.f41211k != null) {
            if (!TextUtils.isEmpty(str)) {
                lVar.f41211k.setVisibility(0);
                lVar.f41211k.setText(str);
                Drawable drawable = this.f41172d.getResources().getDrawable(R.drawable.forum_post_host);
                if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                    str2 = "#2fccdf";
                }
                drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                lVar.f41211k.setBackgroundDrawable(drawable);
            } else {
                lVar.f41211k.setVisibility(8);
            }
        }
        return view;
    }

    private View h(int i4, View view, ViewGroup viewGroup) {
        m mVar;
        r.g gVar;
        if (view != null) {
            mVar = (m) view.getTag();
        } else {
            mVar = new m();
            view = LayoutInflater.from(this.f41172d).inflate(R.layout.mg_forum_welcome_item_post_thumbnail, (ViewGroup) null);
            mVar.f41214c = (RelativeLayout) view.findViewById(R.id.forum_post_media_container);
            mVar.f41213b = (TextView) view.findViewById(R.id.images_count);
            mVar.f41215d = (SimpleDraweeView) view.findViewById(R.id.img_m_1);
            mVar.f41216e = (SimpleDraweeView) view.findViewById(R.id.img_m_2);
            mVar.f41217f = (SimpleDraweeView) view.findViewById(R.id.img_m_3);
            view.setTag(mVar);
        }
        try {
            gVar = (r.g) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (gVar == null) {
            return view;
        }
        q(mVar, gVar);
        y(view, gVar.f41260c);
        return view;
    }

    private View i(int i4, View view, ViewGroup viewGroup) {
        o oVar;
        r.h hVar;
        if (view != null) {
            oVar = (o) view.getTag();
        } else {
            oVar = new o();
            view = LayoutInflater.from(this.f41172d).inflate(R.layout.mg_forum_post_activity_item_post_message1, (ViewGroup) null);
            oVar.f41221b = (StaticLayoutView) view.findViewById(R.id.forum_post_message);
            view.setTag(oVar);
        }
        try {
            hVar = (r.h) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (hVar == null) {
            return view;
        }
        com.join.android.app.component.optimizetext.b bVar = this.f41170b;
        if (bVar.d(hVar.f41263c + "") == null) {
            this.f41170b.e(hVar);
        }
        StaticLayoutView staticLayoutView = oVar.f41221b;
        com.join.android.app.component.optimizetext.b bVar2 = this.f41170b;
        staticLayoutView.setLayout(bVar2.d(hVar.f41263c + ""));
        com.join.mgps.Util.j0.X0(oVar.f41221b);
        y(view, hVar.f41263c);
        return view;
    }

    private View j(int i4, View view, ViewGroup viewGroup) {
        p pVar;
        r.i iVar;
        if (view != null) {
            pVar = (p) view.getTag();
        } else {
            pVar = new p();
            view = LayoutInflater.from(this.f41172d).inflate(R.layout.mg_forum_welcome_item_post_subject, (ViewGroup) null);
            pVar.f41223b = (Button) view.findViewById(R.id.forum_post_best);
            pVar.f41224c = (TextView) view.findViewById(R.id.forum_post_subject);
            view.setTag(pVar);
        }
        try {
            iVar = (r.i) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (iVar == null) {
            return view;
        }
        s(pVar.f41224c, iVar.f41270b, iVar.f41269a, iVar.f41273e, iVar.f41274f, iVar.f41275g);
        y(view, iVar.f41271c);
        return view;
    }

    private int k(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f41174f == 0) {
            Resources resources = context.getResources();
            this.f41174f = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.f41174f;
    }

    private View l(int i4, View view, ViewGroup viewGroup) {
        q qVar;
        r.j jVar;
        if (view != null) {
            qVar = (q) view.getTag();
        } else {
            qVar = new q();
            view = LayoutInflater.from(this.f41172d).inflate(R.layout.mg_forum_post_activity_item_post_video1, (ViewGroup) null);
            qVar.f41228d = (FrameLayout) view.findViewById(R.id.videoContner);
            qVar.f41227c = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            view.setTag(qVar);
        }
        try {
            jVar = (r.j) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (jVar == null) {
            return view;
        }
        k(this.f41172d);
        String str = jVar.f41277b;
        String str2 = jVar.f41276a;
        if (qVar.f41228d != null) {
            MyImageLoader.d(qVar.f41227c, R.drawable.video_bg, str2);
            if (com.join.mgps.Util.g2.i(str)) {
                new c.l(i4, str, str2);
            }
        }
        return view;
    }

    private void o() {
        if (this.f41175g == null) {
            this.f41175g = n();
        }
    }

    private void p(View view, boolean z4, int i4) {
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

    private void q(m mVar, r.g gVar) {
        if (gVar != null && gVar.f41258a.size() != 0) {
            if (this.f41175g == null) {
                this.f41175g = n();
            }
            List<String> list = gVar.f41259b;
            TextView textView = mVar.f41213b;
            if (list != null && list.size() > 3) {
                textView.setVisibility(0);
                textView.setText("共" + list.size() + "张");
            } else {
                textView.setVisibility(8);
            }
            SimpleDraweeView[] simpleDraweeViewArr = {mVar.f41215d, mVar.f41216e, mVar.f41217f};
            int i4 = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i5];
                if (i5 >= gVar.f41258a.size()) {
                    simpleDraweeView.setVisibility(8);
                } else {
                    ForumBean.ForumPostsBean.ResBean resBean = gVar.f41258a.get(i5);
                    if (resBean.getType().equals("pic")) {
                        u(simpleDraweeView, i5, resBean.getThumb(), i5 - i4, list);
                    } else if (resBean.getType().equals("video")) {
                        i4++;
                        B(simpleDraweeView, i5, resBean.getThumb(), resBean.getRaw());
                    }
                }
            }
            return;
        }
        mVar.f41214c.setVisibility(8);
    }

    private void r(View view, ForumBean.ForumPostsBean forumPostsBean) {
        boolean is_praise = forumPostsBean.is_praise();
        int praise = forumPostsBean.getPraise();
        forumPostsBean.setPraise(is_praise ? praise - 1 : praise + 1);
        forumPostsBean.setIs_praise(!is_praise);
        p(view, forumPostsBean.is_praise(), forumPostsBean.getPraise());
    }

    private void s(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
        com.join.mgps.Util.j0.w1(textView, str, z4, z5, str2, list);
    }

    public void A(View view, int i4, boolean z4, int i5) {
        view.setOnClickListener(new h(i4));
    }

    void B(SimpleDraweeView simpleDraweeView, int i4, String str, String str2) {
        if (this.f41175g == null) {
            this.f41175g = n();
        }
        int i5 = (int) (this.f41172d.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f41175g;
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
            simpleDraweeView.setOnClickListener(new d(str2));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    public void C(View view, int i4) {
        view.setOnClickListener(new g(i4));
    }

    LinearLayout.LayoutParams c(View view) {
        if (this.f41176h == null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, ((int) view.getContext().getResources().getDisplayMetrics().density) * 6);
            this.f41176h = layoutParams;
        }
        return this.f41176h;
    }

    public List<r> d() {
        return this.f41173e;
    }

    public com.join.android.app.component.optimizetext.b e() {
        return this.f41170b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<r> list = this.f41173e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<r> list = this.f41173e;
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
        List<r> list = this.f41173e;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.POST_HEADER.ordinal()) {
            return g(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_FOOTER.ordinal()) {
            return f(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_IMAGE_THUMBNAIL.ordinal()) {
            return h(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_VIDEO_THUMBNAIL.ordinal()) {
            return l(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_MESSAGE.ordinal()) {
            return i(i4, view, viewGroup);
        }
        return itemViewType == ViewType.POST_SUBJECT.ordinal() ? j(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public com.danikula.videocache.i m(Context context) {
        return MApplication.m(context);
    }

    LinearLayout.LayoutParams n() {
        DisplayMetrics displayMetrics = this.f41172d.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        int dimensionPixelSize = ((int) ((displayMetrics.widthPixels - (this.f41172d.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2)) - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (dimensionPixelSize <= i4) {
            i4 = dimensionPixelSize > i5 ? i5 : dimensionPixelSize;
        }
        return new LinearLayout.LayoutParams(i4, i4);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public void t(j jVar) {
        this.f41177i = jVar;
    }

    void u(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, List<String> list) {
        if (this.f41175g == null) {
            this.f41175g = n();
        }
        int i6 = (int) (this.f41172d.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f41175g;
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

    public void v(List<r> list) {
        if (list == null) {
            return;
        }
        if (this.f41173e == null) {
            this.f41173e = new ArrayList();
        }
        this.f41173e.clear();
        this.f41173e.addAll(list);
    }

    public void w(com.join.android.app.component.optimizetext.b bVar) {
        this.f41170b = bVar;
    }

    public void x(View view, int i4) {
        view.setOnClickListener(new f(i4));
    }

    public void y(View view, int i4) {
        view.setOnClickListener(new e(i4));
    }

    public void z(View view, String str, String str2) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new i(str2));
    }
}
