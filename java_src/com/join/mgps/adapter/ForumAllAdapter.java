package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumAllAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f40252b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f40253c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    LinearLayout.LayoutParams f40254d;

    /* renamed from: e  reason: collision with root package name */
    d f40255e;

    /* loaded from: classes4.dex */
    public enum ViewType {
        FORUM_ITEM
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean f40256b;

        a(ForumBean forumBean) {
            this.f40256b = forumBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = ForumAllAdapter.this.f40255e;
            if (dVar != null) {
                dVar.f(this.f40256b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean f40258b;

        b(ForumBean forumBean) {
            this.f40258b = forumBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.mgps.Util.j0.Y0(view.getContext())) {
                com.join.mgps.Util.j0.L0(view.getContext());
                return;
            }
            d dVar = ForumAllAdapter.this.f40255e;
            if (dVar != null) {
                dVar.b(this.f40258b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends f {

        /* renamed from: b  reason: collision with root package name */
        public View f40260b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f40261c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40262d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40263e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f40264f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f40265g;

        /* renamed from: h  reason: collision with root package name */
        public Button f40266h;

        /* renamed from: i  reason: collision with root package name */
        public LinearLayout f40267i;

        /* renamed from: j  reason: collision with root package name */
        public LinearLayout f40268j;

        /* renamed from: k  reason: collision with root package name */
        public LinearLayout f40269k;

        /* renamed from: l  reason: collision with root package name */
        public RelativeLayout f40270l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f40271m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f40272n;

        c() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void b(ForumBean forumBean);

        void f(ForumBean forumBean);
    }

    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        ViewType f40274a;

        /* renamed from: b  reason: collision with root package name */
        Object f40275b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumWelcomeAdItemBean> f40276a;

            public a() {
            }

            public a(List<ForumBean.ForumWelcomeAdItemBean> list) {
                this.f40276a = list;
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
            ForumBean f40277a;

            /* renamed from: b  reason: collision with root package name */
            ForumBean f40278b;

            public d() {
            }

            public d(ForumBean forumBean) {
                this.f40277a = forumBean;
            }

            public d(ForumBean forumBean, ForumBean forumBean2) {
                this.f40277a = forumBean;
                this.f40278b = forumBean2;
            }
        }

        /* renamed from: com.join.mgps.adapter.ForumAllAdapter$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0339e {

            /* renamed from: a  reason: collision with root package name */
            public int f40279a;

            /* renamed from: b  reason: collision with root package name */
            public String f40280b;

            /* renamed from: c  reason: collision with root package name */
            public int f40281c;

            /* renamed from: d  reason: collision with root package name */
            public int f40282d;

            /* renamed from: e  reason: collision with root package name */
            public int f40283e;

            /* renamed from: f  reason: collision with root package name */
            public int f40284f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40285g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40286h;

            public C0339e() {
            }

            public C0339e(int i4, int i5, String str, int i6, int i7, int i8, boolean z4, boolean z5) {
                this.f40279a = i4;
                this.f40284f = i5;
                this.f40280b = str;
                this.f40281c = i6;
                this.f40282d = i7;
                this.f40283e = i8;
                this.f40285g = z4;
                this.f40286h = z5;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40287a;

            /* renamed from: b  reason: collision with root package name */
            public String f40288b;

            /* renamed from: c  reason: collision with root package name */
            public String f40289c;

            /* renamed from: d  reason: collision with root package name */
            public long f40290d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40291e;

            /* renamed from: f  reason: collision with root package name */
            public int f40292f;

            /* renamed from: g  reason: collision with root package name */
            public int f40293g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f40294h;

            public f() {
            }

            public f(boolean z4, String str, String str2, long j4, boolean z5, int i4, int i5, boolean z6) {
                this.f40287a = z4;
                this.f40288b = str;
                this.f40289c = str2;
                this.f40290d = j4;
                this.f40291e = z5;
                this.f40292f = i4;
                this.f40293g = i5;
                this.f40294h = z6;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public List<ForumBean.ForumPostsBean.ResBean> f40295a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f40296b;

            /* renamed from: c  reason: collision with root package name */
            public int f40297c;

            public g(List<ForumBean.ForumPostsBean.ResBean> list, List<String> list2, int i4) {
                this.f40295a = list;
                this.f40296b = list2;
                this.f40297c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40298a;

            /* renamed from: b  reason: collision with root package name */
            public String f40299b;

            /* renamed from: c  reason: collision with root package name */
            public int f40300c;

            /* renamed from: d  reason: collision with root package name */
            public int f40301d;

            public h() {
            }

            public h(boolean z4, String str, int i4, int i5) {
                this.f40298a = z4;
                this.f40299b = str;
                this.f40300c = i4;
                this.f40301d = i5;
            }
        }

        /* loaded from: classes4.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40302a;

            /* renamed from: b  reason: collision with root package name */
            public String f40303b;

            /* renamed from: c  reason: collision with root package name */
            public int f40304c;

            /* renamed from: d  reason: collision with root package name */
            public int f40305d;

            public i() {
            }

            public i(boolean z4, String str, int i4, int i5) {
                this.f40302a = z4;
                this.f40303b = str;
                this.f40304c = i4;
                this.f40305d = i5;
            }
        }

        public e() {
        }

        public Object a() {
            return this.f40275b;
        }

        public ViewType b() {
            return this.f40274a;
        }

        public void c(Object obj) {
            this.f40275b = obj;
        }

        public void d(ViewType viewType) {
            this.f40274a = viewType;
        }

        public e(ViewType viewType, Object obj) {
            this.f40274a = viewType;
            this.f40275b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class f {
        f() {
        }
    }

    public ForumAllAdapter(Context context) {
        this.f40252b = context;
    }

    private View a(int i4, View view, ViewGroup viewGroup) {
        c cVar;
        e.d dVar;
        if (view != null) {
            cVar = (c) view.getTag();
        } else {
            cVar = new c();
            view = LayoutInflater.from(this.f40252b).inflate(R.layout.mg_forum_all_activity_item, (ViewGroup) null);
            View findViewById = view.findViewById(R.id.mg_forum_item);
            cVar.f40260b = findViewById;
            cVar.f40261c = (SimpleDraweeView) findViewById.findViewById(R.id.forum_icon);
            cVar.f40262d = (TextView) cVar.f40260b.findViewById(R.id.forum_name);
            cVar.f40271m = (TextView) cVar.f40260b.findViewById(R.id.forum_desc);
            cVar.f40263e = (TextView) cVar.f40260b.findViewById(R.id.forum_users_tv);
            cVar.f40264f = (TextView) cVar.f40260b.findViewById(R.id.forum_posts_tv);
            cVar.f40265g = (TextView) cVar.f40260b.findViewById(R.id.forum_follow_tv);
            cVar.f40267i = (LinearLayout) cVar.f40260b.findViewById(R.id.forumUsersParent);
            cVar.f40268j = (LinearLayout) cVar.f40260b.findViewById(R.id.forumPostsParent);
            cVar.f40269k = (LinearLayout) cVar.f40260b.findViewById(R.id.forumFollowsParent);
            cVar.f40270l = (RelativeLayout) cVar.f40260b.findViewById(R.id.forumTodayPostsParent);
            cVar.f40272n = (TextView) cVar.f40260b.findViewById(R.id.forum_today_posts_tv);
            cVar.f40266h = (Button) cVar.f40260b.findViewById(R.id.forum_follow);
            view.setTag(cVar);
        }
        try {
            dVar = (e.d) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (dVar == null) {
            return view;
        }
        cVar.f40267i.setVisibility(0);
        cVar.f40268j.setVisibility(0);
        cVar.f40269k.setVisibility(0);
        cVar.f40272n.setVisibility(8);
        d(dVar.f40277a, cVar.f40260b, cVar);
        ForumBean forumBean = dVar.f40277a;
        if (forumBean != null && forumBean.is_follow()) {
            cVar.f40266h.setText("已关注");
            cVar.f40266h.setTextSize(12.0f);
            cVar.f40266h.setTextColor(-5723992);
            cVar.f40266h.setBackgroundResource(R.drawable.common_grey_selector);
        } else {
            cVar.f40266h.setText("关注");
            cVar.f40266h.setTextSize(13.0f);
            cVar.f40266h.setTextColor(-1);
            cVar.f40266h.setBackgroundResource(R.drawable.common_orange_selector);
        }
        g(cVar.f40266h, dVar.f40277a);
        return view;
    }

    private LinearLayout.LayoutParams b(Context context) {
        if (this.f40254d == null) {
            double d5 = (context.getResources().getDisplayMetrics().widthPixels / 2) - ((int) ((context.getResources().getDisplayMetrics().density * 16.0f) * 2.0f));
            Double.isNaN(d5);
            int i4 = (int) (d5 * 0.33d);
            this.f40254d = new LinearLayout.LayoutParams(i4, i4);
        }
        return this.f40254d;
    }

    private void d(ForumBean forumBean, View view, c cVar) {
        if (forumBean != null && forumBean.getFid() != 0) {
            TextView textView = cVar.f40262d;
            com.join.mgps.Util.j0.D1(textView, forumBean.getName() + "", "");
            TextView textView2 = cVar.f40271m;
            com.join.mgps.Util.j0.D1(textView2, forumBean.getDescription() + "", "");
            com.join.mgps.Util.j0.D1(cVar.f40263e, com.join.mgps.Util.j0.R(forumBean.getUsers()), "0");
            com.join.mgps.Util.j0.D1(cVar.f40264f, com.join.mgps.Util.j0.R(forumBean.getPosts()), "0");
            com.join.mgps.Util.j0.D1(cVar.f40265g, com.join.mgps.Util.j0.R(forumBean.getFollow_count()), "0");
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
            h(view, forumBean);
            MyImageLoader.j(cVar.f40261c, forumBean.getIcon_src(), MyImageLoader.D(this.f40252b));
            int i4 = (int) (view.getResources().getDisplayMetrics().density * 60.0f);
            cVar.f40261c.setLayoutParams(new LinearLayout.LayoutParams(i4, i4));
            h(view, forumBean);
        } else if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    public List<e> c() {
        return this.f40253c;
    }

    public void e(List<e> list) {
        if (list == null) {
            return;
        }
        if (this.f40253c == null) {
            this.f40253c = new ArrayList();
        }
        this.f40253c.clear();
        this.f40253c.addAll(list);
    }

    public void f(d dVar) {
        this.f40255e = dVar;
    }

    public void g(View view, ForumBean forumBean) {
        view.setOnClickListener(new b(forumBean));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<e> list = this.f40253c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<e> list = this.f40253c;
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
        List<e> list = this.f40253c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        return getItemViewType(i4) == ViewType.FORUM_ITEM.ordinal() ? a(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    void h(View view, ForumBean forumBean) {
        view.setOnClickListener(new a(forumBean));
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
