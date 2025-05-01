package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class GameTopicAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private com.join.android.app.component.optimizetext.b f43140b;

    /* renamed from: c  reason: collision with root package name */
    private Context f43141c;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout.LayoutParams f43143e;

    /* renamed from: f  reason: collision with root package name */
    int f43144f = 0;

    /* renamed from: d  reason: collision with root package name */
    private List<g> f43142d = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        POST_SUBJECT,
        POST_HEADER,
        POST_VIDEO_THUMBNAIL,
        POST_FOOTER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g.b f43145b;

        a(g.b bVar) {
            this.f43145b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f43145b.f43172e).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43148c;

        b(String str, int i4) {
            this.f43147b = str;
            this.f43148c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTopicAdapter gameTopicAdapter = GameTopicAdapter.this;
            String str = this.f43147b;
            gameTopicAdapter.j(str, this.f43148c + "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends h {

        /* renamed from: b  reason: collision with root package name */
        public TextView f43150b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43151c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f43152d;

        c() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends h {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f43154b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43155c;

        d() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends h {

        /* renamed from: b  reason: collision with root package name */
        public TextView f43157b;

        e() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends h {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f43159b;

        f() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        ViewType f43161a;

        /* renamed from: b  reason: collision with root package name */
        Object f43162b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f43163a;

            /* renamed from: b  reason: collision with root package name */
            public String f43164b;

            /* renamed from: c  reason: collision with root package name */
            public String f43165c;

            /* renamed from: d  reason: collision with root package name */
            public int f43166d;

            /* renamed from: e  reason: collision with root package name */
            public int f43167e;

            public a(int i4, String str, String str2, int i5, int i6) {
                this.f43163a = i4;
                this.f43164b = str;
                this.f43165c = str2;
                this.f43166d = i5;
                this.f43167e = i6;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f43168a;

            /* renamed from: b  reason: collision with root package name */
            public String f43169b;

            /* renamed from: c  reason: collision with root package name */
            public String f43170c;

            /* renamed from: d  reason: collision with root package name */
            public int f43171d;

            /* renamed from: e  reason: collision with root package name */
            public int f43172e;

            public b(int i4, String str, String str2, String str3, int i5) {
                this.f43171d = i4;
                this.f43172e = i5;
                this.f43170c = str;
                this.f43168a = str2;
                this.f43169b = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f43173a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f43174b;

            /* renamed from: c  reason: collision with root package name */
            public int f43175c;

            public c(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f43173a = list;
                this.f43174b = list2;
                this.f43175c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class d implements com.join.android.app.component.optimizetext.c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f43176a;

            /* renamed from: b  reason: collision with root package name */
            public String f43177b;

            /* renamed from: c  reason: collision with root package name */
            public int f43178c;

            /* renamed from: d  reason: collision with root package name */
            public int f43179d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f43180e;

            /* renamed from: f  reason: collision with root package name */
            public String f43181f;

            /* renamed from: g  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.TagInfo> f43182g;

            /* renamed from: h  reason: collision with root package name */
            public SpannableStringBuilder f43183h;

            public d() {
            }

            @Override // com.join.android.app.component.optimizetext.c
            public SpannableStringBuilder a() {
                return this.f43183h;
            }

            @Override // com.join.android.app.component.optimizetext.c
            public String b() {
                return this.f43178c + "";
            }

            public d(boolean z4, String str, int i4, int i5, boolean z5, String str2, List<ForumBean.ForumPostsBean.TagInfo> list, SpannableStringBuilder spannableStringBuilder) {
                this.f43176a = z4;
                this.f43177b = str;
                this.f43178c = i4;
                this.f43179d = i5;
                this.f43180e = z5;
                this.f43181f = str2;
                this.f43182g = list;
                this.f43183h = spannableStringBuilder;
            }
        }

        /* loaded from: classes4.dex */
        public static class e {

            /* renamed from: a  reason: collision with root package name */
            public int f43184a;

            /* renamed from: b  reason: collision with root package name */
            public String f43185b;

            /* renamed from: c  reason: collision with root package name */
            public String f43186c;

            public e(int i4, String str, String str2) {
                this.f43184a = i4;
                this.f43185b = str;
                this.f43186c = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public int f43187a;

            /* renamed from: b  reason: collision with root package name */
            public String f43188b;

            /* renamed from: c  reason: collision with root package name */
            public String f43189c;

            public f(int i4, String str, String str2) {
                this.f43187a = i4;
                this.f43188b = str;
                this.f43189c = str2;
            }
        }

        public g() {
        }

        public Object a() {
            return this.f43162b;
        }

        public ViewType b() {
            return this.f43161a;
        }

        public void c(Object obj) {
            this.f43162b = obj;
        }

        public void d(ViewType viewType) {
            this.f43161a = viewType;
        }

        public g(ViewType viewType, Object obj) {
            this.f43161a = viewType;
            this.f43162b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class h {
        h() {
        }
    }

    public GameTopicAdapter(Context context) {
        this.f43141c = context;
        this.f43140b = new com.join.android.app.component.optimizetext.b(context);
        k();
    }

    private View d(int i4, View view, ViewGroup viewGroup) {
        c cVar;
        g.a aVar;
        if (view != null) {
            cVar = (c) view.getTag();
        } else {
            cVar = new c();
            view = LayoutInflater.from(this.f43141c).inflate(R.layout.mg_fragment_game_topic_footer, (ViewGroup) null);
            cVar.f43150b = (TextView) view.findViewById(R.id.forum_name);
            cVar.f43151c = (TextView) view.findViewById(R.id.forum_post_view);
            cVar.f43152d = (TextView) view.findViewById(R.id.forum_post_commit);
            view.setTag(cVar);
        }
        try {
            aVar = (g.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar == null) {
            return view;
        }
        cVar.f43150b.setText(aVar.f43165c);
        TextView textView = cVar.f43151c;
        com.join.mgps.Util.j0.D1(textView, aVar.f43166d + "", "0");
        TextView textView2 = cVar.f43152d;
        com.join.mgps.Util.j0.D1(textView2, aVar.f43167e + "", "0");
        n(view, aVar.f43164b, aVar.f43163a);
        return view;
    }

    private View e(int i4, View view, ViewGroup viewGroup) {
        d dVar;
        g.b bVar;
        if (view != null) {
            dVar = (d) view.getTag();
        } else {
            dVar = new d();
            view = LayoutInflater.from(this.f43141c).inflate(R.layout.mg_fragment_game_topic_header, (ViewGroup) null);
            dVar.f43154b = (SimpleDraweeView) view.findViewById(R.id.forum_post_avatar_src);
            dVar.f43155c = (TextView) view.findViewById(R.id.forum_post_nickname);
            view.setTag(dVar);
        }
        try {
            bVar = (g.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            return view;
        }
        String str = bVar.f43168a;
        String string = view.getContext().getResources().getString(R.string.game_topic_nickname, str);
        int indexOf = string.indexOf(str);
        int length = str.length() + indexOf;
        SpannableString spannableString = new SpannableString(string);
        if (length <= string.length()) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FC9234")), indexOf, length, 33);
        }
        dVar.f43155c.setText(spannableString);
        MyImageLoader.x(dVar.f43154b, bVar.f43169b);
        dVar.f43154b.setOnClickListener(new a(bVar));
        n(view, bVar.f43170c, bVar.f43171d);
        return view;
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        e eVar;
        g.e eVar2;
        if (view != null) {
            eVar = (e) view.getTag();
        } else {
            eVar = new e();
            view = LayoutInflater.from(this.f43141c).inflate(R.layout.mg_fragment_game_topic_title, (ViewGroup) null);
            eVar.f43157b = (TextView) view.findViewById(R.id.forum_post_subject);
            view.setTag(eVar);
        }
        try {
            eVar2 = (g.e) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (eVar2 == null) {
            return view;
        }
        eVar.f43157b.setText(eVar2.f43186c);
        n(view, eVar2.f43185b, eVar2.f43184a);
        return view;
    }

    private int g(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f43144f == 0) {
            Resources resources = context.getResources();
            this.f43144f = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 2.46f);
        }
        return this.f43144f;
    }

    private View h(int i4, View view, ViewGroup viewGroup) {
        f fVar;
        g.f fVar2;
        if (view != null) {
            fVar = (f) view.getTag();
        } else {
            fVar = new f();
            view = LayoutInflater.from(this.f43141c).inflate(R.layout.mg_fragment_game_topic_cover, (ViewGroup) null);
            fVar.f43159b = (SimpleDraweeView) view.findViewById(R.id.cover);
            view.setTag(fVar);
        }
        try {
            fVar2 = (g.f) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (fVar2 == null) {
            return view;
        }
        fVar.f43159b.setLayoutParams(new RelativeLayout.LayoutParams(-1, g(this.f43141c)));
        String str = fVar2.f43189c;
        SimpleDraweeView simpleDraweeView = fVar.f43159b;
        if (simpleDraweeView != null) {
            simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
            MyImageLoader.h(fVar.f43159b, str);
        }
        n(view, fVar2.f43188b, fVar2.f43187a);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str, String str2) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(2);
        intentDateBean.setTpl_type("2");
        intentDateBean.setCrc_link_type_val(str + "");
        intentDateBean.setExtBean(new ExtBean("current_topic", str2 + "", str));
        IntentUtil.getInstance().intentActivity(this.f43141c, intentDateBean);
    }

    private void k() {
        if (this.f43143e == null) {
            this.f43143e = i();
        }
    }

    public List<g> b() {
        return this.f43142d;
    }

    public com.join.android.app.component.optimizetext.b c() {
        return this.f43140b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<g> list = this.f43142d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<g> list = this.f43142d;
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
        List<g> list = this.f43142d;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.POST_HEADER.ordinal()) {
            return e(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_FOOTER.ordinal()) {
            return d(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_VIDEO_THUMBNAIL.ordinal()) {
            return h(i4, view, viewGroup);
        }
        return itemViewType == ViewType.POST_SUBJECT.ordinal() ? f(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    LinearLayout.LayoutParams i() {
        DisplayMetrics displayMetrics = this.f43141c.getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        int i4 = (int) (210.0f * f5);
        int i5 = (int) (160.0f * f5);
        int dimensionPixelSize = ((int) ((displayMetrics.widthPixels - (this.f43141c.getResources().getDimensionPixelSize(R.dimen.mg_forum_forums_item_padding) * 2)) - ((((int) (6.0f * f5)) * f5) * 2.0f))) / 3;
        if (dimensionPixelSize <= i4) {
            i4 = dimensionPixelSize > i5 ? i5 : dimensionPixelSize;
        }
        return new LinearLayout.LayoutParams(i4, i4);
    }

    public void l(List<g> list) {
        if (list == null) {
            return;
        }
        if (this.f43142d == null) {
            this.f43142d = new ArrayList();
        }
        this.f43142d.clear();
        this.f43142d.addAll(list);
    }

    public void m(com.join.android.app.component.optimizetext.b bVar) {
        this.f43140b = bVar;
    }

    void n(View view, String str, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new b(str, i4));
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
