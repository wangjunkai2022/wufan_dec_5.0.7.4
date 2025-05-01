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
import java.util.HashMap;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumTopicAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private com.join.android.app.component.optimizetext.b f41841b;

    /* renamed from: c  reason: collision with root package name */
    com.danikula.videocache.i f41842c;

    /* renamed from: d  reason: collision with root package name */
    private Context f41843d;

    /* renamed from: f  reason: collision with root package name */
    com.join.android.app.component.video.c f41845f;

    /* renamed from: h  reason: collision with root package name */
    LinearLayout.LayoutParams f41847h;

    /* renamed from: j  reason: collision with root package name */
    LinearLayout.LayoutParams f41849j;

    /* renamed from: k  reason: collision with root package name */
    LinearLayout.LayoutParams f41850k;

    /* renamed from: g  reason: collision with root package name */
    int f41846g = 0;

    /* renamed from: i  reason: collision with root package name */
    int f41848i = 0;

    /* renamed from: l  reason: collision with root package name */
    private k f41851l = null;

    /* renamed from: e  reason: collision with root package name */
    private List<t> f41844e = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        FORUM_TOPIC_TOP,
        POST_HEADER,
        POST_SUBJECT,
        POST_MESSAGE,
        POST_IMAGE,
        POST_VIDEO,
        POST_IMAGE_THUMBNAIL,
        POST_VIDEO_THUMBNAIL,
        POST_FOOTER,
        POST_TOP
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41852b;

        a(String str) {
            this.f41852b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f41852b);
            if (ForumTopicAdapter.this.f41851l != null) {
                ForumTopicAdapter.this.f41851l.c(parseInt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t.g f41854b;

        b(t.g gVar) {
            this.f41854b = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41854b.f41945m).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41856b;

        c(int i4) {
            this.f41856b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumTopicAdapter.this.f41851l != null) {
                ForumTopicAdapter.this.f41851l.a(this.f41856b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41858b;

        d(int i4) {
            this.f41858b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(this.f41858b);
            com.join.mgps.Util.j0.v0(view.getContext(), forumPostsBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f41860b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41861c;

        e(List list, int i4) {
            this.f41860b = list;
            this.f41861c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String[] strArr = new String[this.f41860b.size()];
            this.f41860b.toArray(strArr);
            com.join.mgps.Util.j0.G0(view.getContext(), this.f41861c, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41863b;

        f(String str) {
            this.f41863b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.Q0(view.getContext(), this.f41863b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41865b;

        g(int i4) {
            this.f41865b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumTopicAdapter.this.f41851l != null) {
                ForumTopicAdapter.this.f41851l.d(this.f41865b);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41867b;

        h(int i4) {
            this.f41867b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumTopicAdapter.this.f41851l != null) {
                ForumTopicAdapter.this.f41851l.e(this.f41867b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41869b;

        i(int i4) {
            this.f41869b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumTopicAdapter.this.f41851l != null) {
                ForumTopicAdapter.this.f41851l.b(this.f41869b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41871b;

        j(int i4) {
            this.f41871b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.findViewById(R.id.forum_post_praise_icon).startAnimation(AnimationUtils.loadAnimation(ForumTopicAdapter.this.f41843d, R.anim.scale_reset));
            if (ForumTopicAdapter.this.f41851l != null) {
                Context context = view.getContext();
                if (com.join.mgps.Util.j0.Y0(context)) {
                    ForumTopicAdapter.this.f41851l.a(this.f41871b);
                    return;
                }
                com.join.mgps.Util.l2.a(context).b("用户未登录，请登录");
                com.join.mgps.Util.j0.L0(context);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface k {
        void a(int i4);

        void b(int i4);

        void c(int i4);

        void d(int i4);

        void e(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l extends u {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41873b;

        l() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends u {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41875b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41876c;

        /* renamed from: d  reason: collision with root package name */
        public Button f41877d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f41878e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f41879f;

        m() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n extends u {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41881b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41882c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41883d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41884e;

        n() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o extends u {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41886b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41887c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41888d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41889e;

        /* renamed from: f  reason: collision with root package name */
        public View f41890f;

        /* renamed from: g  reason: collision with root package name */
        public RelativeLayout f41891g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f41892h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f41893i;

        /* renamed from: j  reason: collision with root package name */
        public VipView f41894j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f41895k;

        o() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p extends u {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41897b;

        /* renamed from: c  reason: collision with root package name */
        public RelativeLayout f41898c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f41899d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f41900e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f41901f;

        p() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q extends u {

        /* renamed from: b  reason: collision with root package name */
        public StaticLayoutView f41903b;

        q() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r extends u {

        /* renamed from: b  reason: collision with root package name */
        public Button f41905b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41906c;

        r() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s extends u {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41908b;

        /* renamed from: c  reason: collision with root package name */
        public FrameLayout f41909c;

        s() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class t {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41911a;

        /* renamed from: b  reason: collision with root package name */
        Object f41912b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f41913a;

            public a(String str) {
                this.f41913a = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f41914a;

            public b(String str) {
                this.f41914a = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public String f41915a;

            /* renamed from: b  reason: collision with root package name */
            public String f41916b;

            /* renamed from: c  reason: collision with root package name */
            public String f41917c;

            public c(String str, String str2, String str3) {
                this.f41915a = str;
                this.f41916b = str2;
                this.f41917c = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public ArrayList<HashMap<String, Object>> f41918a;

            /* renamed from: b  reason: collision with root package name */
            public String f41919b;

            public d(ArrayList<HashMap<String, Object>> arrayList, String str) {
                this.f41918a = arrayList;
                this.f41919b = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class e {

            /* renamed from: a  reason: collision with root package name */
            public String f41920a;

            /* renamed from: b  reason: collision with root package name */
            public String f41921b;

            /* renamed from: c  reason: collision with root package name */
            public String f41922c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f41923d;

            /* renamed from: e  reason: collision with root package name */
            public int f41924e;

            public e(String str, String str2, String str3, boolean z4, int i4) {
                this.f41920a = str;
                this.f41921b = str2;
                this.f41922c = str3;
                this.f41923d = z4;
                this.f41924e = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public int f41925a;

            /* renamed from: b  reason: collision with root package name */
            public String f41926b;

            /* renamed from: c  reason: collision with root package name */
            public int f41927c;

            /* renamed from: d  reason: collision with root package name */
            public int f41928d;

            /* renamed from: e  reason: collision with root package name */
            public int f41929e;

            /* renamed from: f  reason: collision with root package name */
            public int f41930f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41931g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41932h;

            public f() {
            }

            public f(int i4, int i5, String str, int i6, int i7, int i8, boolean z4, boolean z5) {
                this.f41925a = i4;
                this.f41930f = i5;
                this.f41926b = str;
                this.f41927c = i6;
                this.f41928d = i7;
                this.f41929e = i8;
                this.f41931g = z4;
                this.f41932h = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41933a;

            /* renamed from: b  reason: collision with root package name */
            public String f41934b;

            /* renamed from: c  reason: collision with root package name */
            public String f41935c;

            /* renamed from: d  reason: collision with root package name */
            public long f41936d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41937e;

            /* renamed from: f  reason: collision with root package name */
            public int f41938f;

            /* renamed from: g  reason: collision with root package name */
            public int f41939g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41940h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f41941i;

            /* renamed from: j  reason: collision with root package name */
            public int f41942j;

            /* renamed from: k  reason: collision with root package name */
            public int f41943k;

            /* renamed from: l  reason: collision with root package name */
            public int f41944l;

            /* renamed from: m  reason: collision with root package name */
            public int f41945m;

            /* renamed from: n  reason: collision with root package name */
            public String f41946n;

            /* renamed from: o  reason: collision with root package name */
            public String f41947o;

            public g() {
            }

            public g(boolean z4, String str, String str2, long j4, boolean z5, int i4, int i5, boolean z6, boolean z7, int i6, int i7, int i8, String str3, String str4, int i9) {
                this.f41933a = z4;
                this.f41934b = str;
                this.f41935c = str2;
                this.f41936d = j4;
                this.f41937e = z5;
                this.f41938f = i4;
                this.f41939g = i5;
                this.f41945m = i9;
                this.f41940h = z6;
                this.f41941i = z7;
                this.f41942j = i6;
                this.f41943k = i7;
                this.f41944l = i8;
                this.f41946n = str3;
                this.f41947o = str4;
            }
        }

        /* loaded from: classes4.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f41948a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f41949b;

            /* renamed from: c  reason: collision with root package name */
            public int f41950c;

            public h(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f41948a = list;
                this.f41949b = list2;
                this.f41950c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class i implements com.join.android.app.component.optimizetext.c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41951a;

            /* renamed from: b  reason: collision with root package name */
            public String f41952b;

            /* renamed from: c  reason: collision with root package name */
            public int f41953c;

            /* renamed from: d  reason: collision with root package name */
            public int f41954d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41955e;

            /* renamed from: f  reason: collision with root package name */
            public String f41956f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41957g;

            /* renamed from: h  reason: collision with root package name */
            public SpannableStringBuilder f41958h;

            public i() {
            }

            @Override // com.join.android.app.component.optimizetext.c
            public SpannableStringBuilder a() {
                return this.f41958h;
            }

            @Override // com.join.android.app.component.optimizetext.c
            public String b() {
                return this.f41953c + "";
            }

            public i(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, SpannableStringBuilder spannableStringBuilder) {
                this.f41951a = z4;
                this.f41952b = str;
                this.f41953c = i4;
                this.f41954d = i5;
                this.f41955e = z5;
                this.f41956f = str2;
                this.f41957g = list;
                this.f41958h = spannableStringBuilder;
            }
        }

        /* loaded from: classes4.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41959a;

            /* renamed from: b  reason: collision with root package name */
            public String f41960b;

            /* renamed from: c  reason: collision with root package name */
            public int f41961c;

            /* renamed from: d  reason: collision with root package name */
            public int f41962d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41963e;

            /* renamed from: f  reason: collision with root package name */
            public String f41964f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f41965g;

            public j() {
            }

            public j(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
                this.f41959a = z4;
                this.f41960b = str;
                this.f41961c = i4;
                this.f41962d = i5;
                this.f41963e = z5;
                this.f41964f = str2;
                this.f41965g = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class k {

            /* renamed from: a  reason: collision with root package name */
            public int f41966a;

            /* renamed from: b  reason: collision with root package name */
            public String f41967b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f41968c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f41969d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41970e;

            public k() {
            }

            public k(int i4, String str, boolean z4, boolean z5, boolean z6) {
                this.f41966a = i4;
                this.f41967b = str;
                this.f41968c = z4;
                this.f41969d = z5;
                this.f41970e = z6;
            }
        }

        /* loaded from: classes4.dex */
        public static class l {

            /* renamed from: a  reason: collision with root package name */
            public String f41971a;

            /* renamed from: b  reason: collision with root package name */
            public String f41972b;

            /* renamed from: c  reason: collision with root package name */
            public String f41973c;

            public l(String str, String str2, String str3) {
                this.f41971a = str;
                this.f41972b = str2;
                this.f41973c = str3;
            }
        }

        public t() {
        }

        public Object a() {
            return this.f41912b;
        }

        public ViewType b() {
            return this.f41911a;
        }

        public void c(Object obj) {
            this.f41912b = obj;
        }

        public void d(ViewType viewType) {
            this.f41911a = viewType;
        }

        public t(ViewType viewType, Object obj) {
            this.f41911a = viewType;
            this.f41912b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class u {
        u() {
        }
    }

    public ForumTopicAdapter(Context context, com.join.android.app.component.video.c cVar) {
        this.f41845f = cVar;
        this.f41843d = context;
        this.f41841b = new com.join.android.app.component.optimizetext.b(context);
        this.f41842c = p(context);
        s();
    }

    private void F(ImageView imageView, String str) {
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

    private View e(int i4, View view, ViewGroup viewGroup) {
        l lVar;
        if (view != null) {
            lVar = (l) view.getTag();
        } else {
            lVar = new l();
            view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_forum_topic_a_item_top, (ViewGroup) null);
            lVar.f41873b = (SimpleDraweeView) view.findViewById(R.id.banner);
            view.setTag(lVar);
        }
        try {
            MyImageLoader.h(lVar.f41873b, ((t.a) getItem(i4)).f41913a);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, r(this.f41843d));
            SimpleDraweeView simpleDraweeView = lVar.f41873b;
            if (simpleDraweeView != null) {
                simpleDraweeView.setLayoutParams(layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View h(int i4, View view, ViewGroup viewGroup) {
        n nVar;
        t.f fVar;
        if (view != null) {
            nVar = (n) view.getTag();
        } else {
            nVar = new n();
            view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_welcome_item_post_footer, (ViewGroup) null);
            nVar.f41881b = (TextView) view.findViewById(R.id.forum_name);
            nVar.f41882c = (TextView) view.findViewById(R.id.forum_post_view);
            nVar.f41883d = (TextView) view.findViewById(R.id.forum_post_commit);
            nVar.f41884e = (TextView) view.findViewById(R.id.forum_post_praise);
            view.setTag(nVar);
        }
        try {
            fVar = (t.f) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (fVar == null) {
            return view;
        }
        if (fVar.f41932h) {
            view.findViewById(R.id.post_footer_divider).setVisibility(0);
        } else {
            view.findViewById(R.id.post_footer_divider).setVisibility(8);
        }
        nVar.f41881b.setText(fVar.f41926b);
        if (com.join.mgps.Util.g2.h(fVar.f41926b)) {
            ((ViewGroup) nVar.f41881b.getParent()).setVisibility(8);
        } else {
            ((ViewGroup) nVar.f41881b.getParent()).setVisibility(0);
        }
        TextView textView = nVar.f41882c;
        com.join.mgps.Util.j0.D1(textView, fVar.f41927c + "", "0");
        TextView textView2 = nVar.f41883d;
        com.join.mgps.Util.j0.D1(textView2, fVar.f41928d + "", "0");
        u(view, fVar.f41931g, fVar.f41929e);
        int i5 = fVar.f41925a;
        ((View) nVar.f41884e.getParent()).setOnClickListener(new c(i5));
        C(view, i5);
        u((View) nVar.f41884e.getParent(), fVar.f41931g, fVar.f41929e);
        E((View) nVar.f41884e.getParent(), i5);
        return view;
    }

    private View i(int i4, View view, ViewGroup viewGroup) {
        o oVar;
        t.g gVar;
        if (view != null) {
            oVar = (o) view.getTag();
        } else {
            oVar = new o();
            view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_welcome_item_post_header, (ViewGroup) null);
            oVar.f41890f = view.findViewById(R.id.forum_post_divider);
            oVar.f41886b = (SimpleDraweeView) view.findViewById(R.id.forum_post_avatar_src);
            oVar.f41887c = (TextView) view.findViewById(R.id.forum_post_nickname);
            oVar.f41888d = (TextView) view.findViewById(R.id.forum_post_add_time);
            oVar.f41889e = (TextView) view.findViewById(R.id.forum_post_stickie);
            oVar.f41892h = (ImageView) view.findViewById(R.id.forum_post_moderator);
            oVar.f41891g = (RelativeLayout) view.findViewById(R.id.forumExtFunc);
            oVar.f41893i = (ImageView) view.findViewById(R.id.flagBestAnswer);
            oVar.f41894j = (VipView) view.findViewById(R.id.vipFlag);
            oVar.f41895k = (TextView) view.findViewById(R.id.copperTitleTv);
            view.setTag(oVar);
        }
        try {
            gVar = (t.g) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (gVar == null) {
            return view;
        }
        oVar.f41891g.setVisibility(0);
        try {
            oVar.f41894j.setVipData(gVar.f41943k, gVar.f41944l);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (gVar.f41942j != 1) {
            oVar.f41893i.setVisibility(8);
        } else {
            oVar.f41893i.setVisibility(0);
        }
        if (gVar.f41933a) {
            oVar.f41890f.setVisibility(8);
        } else {
            oVar.f41890f.setVisibility(0);
        }
        oVar.f41887c.setText(gVar.f41935c);
        oVar.f41888d.setText(com.join.android.app.common.utils.g.a(gVar.f41936d * 1000));
        if (gVar.f41937e) {
            oVar.f41889e.setVisibility(0);
        } else {
            oVar.f41889e.setVisibility(8);
        }
        if (gVar.f41941i) {
            oVar.f41887c.setTextColor(this.f41843d.getResources().getColor(R.color.app_blue_color));
            oVar.f41892h.setVisibility(0);
        } else {
            UtilsMy.A3(this.f41843d, oVar.f41887c, gVar.f41943k, gVar.f41944l, R.color.forum_nickname_color);
            oVar.f41892h.setVisibility(8);
        }
        MyImageLoader.x(oVar.f41886b, gVar.f41934b);
        oVar.f41886b.setOnClickListener(new b(gVar));
        int i5 = gVar.f41938f;
        C(view, i5);
        H(oVar.f41891g, i5);
        com.join.mgps.Util.j0.S0(oVar.f41886b, oVar.f41887c, oVar.f41888d);
        com.join.mgps.Util.j0.U0(oVar.f41894j);
        String str = gVar.f41946n;
        String str2 = gVar.f41947o;
        if (oVar.f41895k != null) {
            if (!TextUtils.isEmpty(str)) {
                oVar.f41895k.setVisibility(0);
                oVar.f41895k.setText(str);
                Drawable drawable = this.f41843d.getResources().getDrawable(R.drawable.forum_post_host);
                if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                    str2 = "#2fccdf";
                }
                drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                oVar.f41895k.setBackgroundDrawable(drawable);
            } else {
                oVar.f41895k.setVisibility(8);
            }
        }
        return view;
    }

    private View j(int i4, View view, ViewGroup viewGroup) {
        p pVar;
        t.h hVar;
        if (view != null) {
            pVar = (p) view.getTag();
        } else {
            pVar = new p();
            view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_welcome_item_post_thumbnail, (ViewGroup) null);
            pVar.f41898c = (RelativeLayout) view.findViewById(R.id.forum_post_media_container);
            pVar.f41897b = (TextView) view.findViewById(R.id.images_count);
            pVar.f41899d = (SimpleDraweeView) view.findViewById(R.id.img_m_1);
            pVar.f41900e = (SimpleDraweeView) view.findViewById(R.id.img_m_2);
            pVar.f41901f = (SimpleDraweeView) view.findViewById(R.id.img_m_3);
            view.setTag(pVar);
        }
        try {
            hVar = (t.h) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (hVar == null) {
            return view;
        }
        t(pVar, hVar);
        C(view, hVar.f41950c);
        return view;
    }

    private View k(int i4, View view, ViewGroup viewGroup) {
        q qVar;
        t.i iVar;
        if (view != null) {
            qVar = (q) view.getTag();
        } else {
            qVar = new q();
            view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_post_activity_item_post_message1, (ViewGroup) null);
            qVar.f41903b = (StaticLayoutView) view.findViewById(R.id.forum_post_message);
            view.setTag(qVar);
        }
        try {
            iVar = (t.i) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (iVar == null) {
            return view;
        }
        com.join.android.app.component.optimizetext.b bVar = this.f41841b;
        if (bVar.d(iVar.f41953c + "") == null) {
            this.f41841b.e(iVar);
        }
        StaticLayoutView staticLayoutView = qVar.f41903b;
        com.join.android.app.component.optimizetext.b bVar2 = this.f41841b;
        staticLayoutView.setLayout(bVar2.d(iVar.f41953c + ""));
        com.join.mgps.Util.j0.X0(qVar.f41903b);
        C(view, iVar.f41953c);
        return view;
    }

    private View l(int i4, View view, ViewGroup viewGroup) {
        r rVar;
        t.j jVar;
        if (view != null) {
            rVar = (r) view.getTag();
        } else {
            rVar = new r();
            view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_welcome_item_post_subject, (ViewGroup) null);
            rVar.f41905b = (Button) view.findViewById(R.id.forum_post_best);
            rVar.f41906c = (TextView) view.findViewById(R.id.forum_post_subject);
            view.setTag(rVar);
        }
        try {
            jVar = (t.j) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (jVar == null) {
            return view;
        }
        w(rVar.f41906c, jVar.f41960b, jVar.f41959a, jVar.f41963e, jVar.f41964f, jVar.f41965g);
        C(view, jVar.f41961c);
        return view;
    }

    private View m(int i4, View view, ViewGroup viewGroup) {
        m mVar;
        t.k kVar;
        try {
            if (view != null) {
                mVar = (m) view.getTag();
            } else {
                mVar = new m();
                view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_forum_activity_top_item, (ViewGroup) null);
                mVar.f41875b = (TextView) view.findViewById(R.id.forum_post_subject);
                mVar.f41876c = (TextView) view.findViewById(R.id.forum_post_stickie);
                mVar.f41877d = (Button) view.findViewById(R.id.forum_post_best);
                mVar.f41878e = (ImageView) view.findViewById(R.id.forum_post_pic);
                mVar.f41879f = (ImageView) view.findViewById(R.id.forum_post_video);
                view.setTag(mVar);
            }
            kVar = (t.k) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (kVar == null) {
            return view;
        }
        if (com.join.mgps.Util.g2.h(kVar.f41967b)) {
            mVar.f41875b.setVisibility(8);
        } else {
            mVar.f41875b.setVisibility(0);
            mVar.f41875b.setText(kVar.f41967b);
        }
        if (kVar.f41968c) {
            mVar.f41877d.setVisibility(0);
        } else {
            mVar.f41877d.setVisibility(8);
        }
        if (kVar.f41969d) {
            mVar.f41878e.setVisibility(0);
        } else {
            mVar.f41878e.setVisibility(8);
        }
        if (kVar.f41970e) {
            mVar.f41879f.setVisibility(0);
        } else {
            mVar.f41879f.setVisibility(8);
        }
        view.setOnClickListener(new d(kVar.f41966a));
        return view;
    }

    private int n(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f41846g == 0) {
            Resources resources = context.getResources();
            this.f41846g = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.f41846g;
    }

    private View o(int i4, View view, ViewGroup viewGroup) {
        s sVar;
        t.l lVar;
        if (view != null) {
            sVar = (s) view.getTag();
        } else {
            sVar = new s();
            view = LayoutInflater.from(this.f41843d).inflate(R.layout.mg_forum_post_activity_item_post_video1, (ViewGroup) null);
            sVar.f41909c = (FrameLayout) view.findViewById(R.id.videoContner);
            sVar.f41908b = (SimpleDraweeView) view.findViewById(R.id.bannerView);
            view.setTag(sVar);
        }
        try {
            lVar = (t.l) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (lVar == null) {
            return view;
        }
        int n4 = n(this.f41843d);
        String str = lVar.f41972b;
        String str2 = lVar.f41971a;
        if (sVar.f41909c != null) {
            sVar.f41909c.setLayoutParams(new RelativeLayout.LayoutParams(-1, n4));
            MyImageLoader.d(sVar.f41908b, R.drawable.video_bg, str2);
            sVar.f41908b.setTag(Integer.valueOf(i4));
            if (com.join.mgps.Util.g2.i(str)) {
                com.danikula.videocache.i iVar = this.f41842c;
                if (iVar != null) {
                    str = iVar.j(str);
                }
                this.f41845f.e(i4, new c.l(i4, str, str2), new boolean[0]);
            }
        }
        return view;
    }

    private int r(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f41848i == 0) {
            Resources resources = context.getResources();
            int i4 = resources.getDisplayMetrics().widthPixels;
            resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding);
            this.f41848i = (int) (((i4 - 0) * 1.0f) / 2.07f);
        }
        return this.f41848i;
    }

    private void s() {
        if (this.f41847h == null) {
            this.f41847h = q();
        }
    }

    private void t(p pVar, t.h hVar) {
        if (hVar != null && hVar.f41948a.size() != 0) {
            if (this.f41847h == null) {
                this.f41847h = q();
            }
            List<String> list = hVar.f41949b;
            TextView textView = pVar.f41897b;
            if (list != null && list.size() > 3) {
                textView.setVisibility(0);
                textView.setText("共" + list.size() + "张");
            } else {
                textView.setVisibility(8);
            }
            SimpleDraweeView[] simpleDraweeViewArr = {pVar.f41899d, pVar.f41900e, pVar.f41901f};
            int i4 = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i5];
                if (i5 >= hVar.f41948a.size()) {
                    simpleDraweeView.setVisibility(8);
                } else {
                    ForumBean.ForumPostsBean.ResBean resBean = hVar.f41948a.get(i5);
                    if (resBean.getType().equals("pic")) {
                        y(simpleDraweeView, i5, resBean.getThumb(), i5 - i4, list);
                    } else if (resBean.getType().equals("video")) {
                        i4++;
                        G(simpleDraweeView, i5, resBean.getThumb(), resBean.getRaw());
                    }
                }
            }
            return;
        }
        pVar.f41898c.setVisibility(8);
    }

    private void u(View view, boolean z4, int i4) {
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

    private void v(View view, ForumBean.ForumPostsBean forumPostsBean) {
        boolean is_praise = forumPostsBean.is_praise();
        int praise = forumPostsBean.getPraise();
        forumPostsBean.setPraise(is_praise ? praise - 1 : praise + 1);
        forumPostsBean.setIs_praise(!is_praise);
        u(view, forumPostsBean.is_praise(), forumPostsBean.getPraise());
    }

    private void w(TextView textView, String str, boolean z4, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list) {
        com.join.mgps.Util.j0.w1(textView, str, z4, z5, str2, list);
    }

    public void A(com.join.android.app.component.optimizetext.b bVar) {
        this.f41841b = bVar;
    }

    public void B(View view, int i4) {
        view.setOnClickListener(new h(i4));
    }

    public void C(View view, int i4) {
        view.setOnClickListener(new g(i4));
    }

    public void D(View view, String str, String str2) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new a(str2));
    }

    public void E(View view, int i4) {
        view.setOnClickListener(new j(i4));
    }

    void G(SimpleDraweeView simpleDraweeView, int i4, String str, String str2) {
        if (this.f41847h == null) {
            this.f41847h = q();
        }
        int i5 = (int) (this.f41843d.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f41847h;
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
            simpleDraweeView.setOnClickListener(new f(str2));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    public void H(View view, int i4) {
        view.setOnClickListener(new i(i4));
    }

    LinearLayout.LayoutParams c(int i4) {
        if (this.f41850k == null) {
            float f5 = this.f41843d.getResources().getDisplayMetrics().scaledDensity;
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
            this.f41850k = layoutParams;
        }
        return this.f41850k;
    }

    LinearLayout.LayoutParams d(View view) {
        if (this.f41849j == null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, ((int) view.getContext().getResources().getDisplayMetrics().density) * 6);
            this.f41849j = layoutParams;
        }
        return this.f41849j;
    }

    public List<t> f() {
        return this.f41844e;
    }

    public com.join.android.app.component.optimizetext.b g() {
        return this.f41841b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<t> list = this.f41844e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<t> list = this.f41844e;
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
        List<t> list = this.f41844e;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.FORUM_TOPIC_TOP.ordinal()) {
            return e(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_HEADER.ordinal()) {
            return i(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_FOOTER.ordinal()) {
            return h(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_IMAGE_THUMBNAIL.ordinal()) {
            return j(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_VIDEO_THUMBNAIL.ordinal()) {
            return o(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_MESSAGE.ordinal()) {
            return k(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_SUBJECT.ordinal()) {
            return l(i4, view, viewGroup);
        }
        return itemViewType == ViewType.POST_TOP.ordinal() ? m(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public com.danikula.videocache.i p(Context context) {
        return MApplication.m(context);
    }

    LinearLayout.LayoutParams q() {
        DisplayMetrics displayMetrics = this.f41843d.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        int dimensionPixelSize = ((int) ((displayMetrics.widthPixels - (this.f41843d.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2)) - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (dimensionPixelSize <= i4) {
            i4 = dimensionPixelSize > i5 ? i5 : dimensionPixelSize;
        }
        return new LinearLayout.LayoutParams(i4, i4);
    }

    public void x(k kVar) {
        this.f41851l = kVar;
    }

    void y(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, List<String> list) {
        if (this.f41847h == null) {
            this.f41847h = q();
        }
        int i6 = (int) (this.f41843d.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f41847h;
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
            simpleDraweeView.setOnClickListener(new e(list, i5));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    public void z(List<t> list) {
        if (list == null) {
            return;
        }
        if (this.f41844e == null) {
            this.f41844e = new ArrayList();
        }
        this.f41844e.clear();
        this.f41844e.addAll(list);
    }
}
