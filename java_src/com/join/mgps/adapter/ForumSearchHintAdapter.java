package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumSearchHintAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f41763b;

    /* renamed from: d  reason: collision with root package name */
    private b f41765d = null;

    /* renamed from: c  reason: collision with root package name */
    private List<f> f41764c = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        POST_SUBJECT,
        POST_MESSAGE,
        POST_FOOTER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41766b;

        a(String str) {
            this.f41766b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumSearchHintAdapter.this.f41765d != null) {
                ForumSearchHintAdapter.this.f41765d.f(this.f41766b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void f(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends g {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41768b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41769c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41770d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41771e;

        /* renamed from: f  reason: collision with root package name */
        public View f41772f;

        /* renamed from: g  reason: collision with root package name */
        public View f41773g;

        /* renamed from: h  reason: collision with root package name */
        public View f41774h;

        c() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends g {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41776b;

        /* renamed from: c  reason: collision with root package name */
        public View f41777c;

        d() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends g {

        /* renamed from: b  reason: collision with root package name */
        public Button f41779b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41780c;

        /* renamed from: d  reason: collision with root package name */
        public View f41781d;

        e() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41783a;

        /* renamed from: b  reason: collision with root package name */
        Object f41784b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f41785a;

            /* renamed from: b  reason: collision with root package name */
            public String f41786b;

            /* renamed from: c  reason: collision with root package name */
            public String f41787c;

            /* renamed from: d  reason: collision with root package name */
            public String f41788d;

            /* renamed from: e  reason: collision with root package name */
            public String f41789e;

            public a() {
            }

            public a(String str, String str2, String str3, String str4, String str5) {
                this.f41785a = str;
                this.f41786b = str2;
                this.f41787c = str3;
                this.f41788d = str4;
                this.f41789e = str5;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f41790a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f41791b;

            /* renamed from: c  reason: collision with root package name */
            public String f41792c;

            /* renamed from: d  reason: collision with root package name */
            public String f41793d;

            public b() {
            }

            public b(String str, String str2, String str3, boolean z4) {
                this.f41793d = str2;
                this.f41792c = str3;
                this.f41791b = z4;
                this.f41790a = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public String f41794a;

            /* renamed from: b  reason: collision with root package name */
            public String f41795b;

            /* renamed from: c  reason: collision with root package name */
            public String f41796c;

            public c() {
            }

            public c(String str, String str2, String str3) {
                this.f41796c = str2;
                this.f41795b = str3;
                this.f41794a = str;
            }
        }

        public f() {
        }

        public Object a() {
            return this.f41784b;
        }

        public ViewType b() {
            return this.f41783a;
        }

        public void c(Object obj) {
            this.f41784b = obj;
        }

        public void d(ViewType viewType) {
            this.f41783a = viewType;
        }

        public f(ViewType viewType, Object obj) {
            this.f41783a = viewType;
            this.f41784b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class g {
        g() {
        }
    }

    public ForumSearchHintAdapter(Context context) {
        this.f41763b = context;
    }

    private View c(int i4, View view, ViewGroup viewGroup) {
        c cVar;
        f.a aVar;
        if (view != null) {
            cVar = (c) view.getTag();
        } else {
            cVar = new c();
            view = LayoutInflater.from(this.f41763b).inflate(R.layout.mg_forum_search_item_post_footer, (ViewGroup) null);
            cVar.f41769c = (TextView) view.findViewById(R.id.forum_post_view);
            cVar.f41770d = (TextView) view.findViewById(R.id.forum_post_commit);
            cVar.f41771e = (TextView) view.findViewById(R.id.forum_post_praise);
            cVar.f41772f = view.findViewById(R.id.viewParent);
            cVar.f41773g = view.findViewById(R.id.commentParent);
            cVar.f41774h = view.findViewById(R.id.forum_post_praise_parent);
            try {
                int a5 = com.join.android.app.component.optimizetext.a.a(6.0f);
                g(cVar.f41772f, a5);
                g(cVar.f41773g, a5);
                g(cVar.f41774h, a5);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            view.setTag(cVar);
        }
        try {
            aVar = (f.a) getItem(i4);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (aVar == null) {
            return view;
        }
        com.join.mgps.Util.j0.D1(cVar.f41769c, aVar.f41787c, "0");
        com.join.mgps.Util.j0.D1(cVar.f41770d, aVar.f41788d, "0");
        com.join.mgps.Util.j0.D1(cVar.f41771e, aVar.f41789e, "0");
        i(view, aVar.f41786b);
        return view;
    }

    private View d(int i4, View view, ViewGroup viewGroup) {
        d dVar;
        f.b bVar;
        int a5;
        if (view != null) {
            dVar = (d) view.getTag();
        } else {
            dVar = new d();
            view = LayoutInflater.from(this.f41763b).inflate(R.layout.mg_forum_post_activity_item_post_message, (ViewGroup) null);
            dVar.f41776b = (TextView) view.findViewById(R.id.forum_post_message);
            dVar.f41777c = view.findViewById(R.id.messageParent);
            view.setTag(dVar);
        }
        try {
            bVar = (f.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            return view;
        }
        String str = bVar.f41792c;
        String g4 = com.join.mgps.Util.g2.g(bVar.f41790a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int color = this.f41763b.getResources().getColor(R.color.search_high_light);
        int indexOf = str.indexOf(g4);
        int length = g4.length() + indexOf;
        try {
            if (length <= str.length() && indexOf >= 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf, length, 33);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        com.join.mgps.Util.j0.A1(dVar.f41776b, spannableStringBuilder);
        i(view, bVar.f41793d);
        try {
            if (bVar.f41791b) {
                dVar.f41776b.setTextColor(Color.parseColor("#3b3b3b"));
                a5 = com.join.android.app.component.optimizetext.a.a(10.0f);
            } else {
                a5 = com.join.android.app.component.optimizetext.a.a(2.0f);
                dVar.f41776b.setTextColor(Color.parseColor("#8a8a8a"));
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar.f41776b.getLayoutParams();
            layoutParams.topMargin = a5;
            dVar.f41776b.setLayoutParams(layoutParams);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return view;
    }

    private View e(int i4, View view, ViewGroup viewGroup) {
        e eVar;
        f.c cVar;
        if (view != null) {
            eVar = (e) view.getTag();
        } else {
            eVar = new e();
            view = LayoutInflater.from(this.f41763b).inflate(R.layout.mg_forum_welcome_item_post_subject, (ViewGroup) null);
            eVar.f41779b = (Button) view.findViewById(R.id.forum_post_best);
            eVar.f41780c = (TextView) view.findViewById(R.id.forum_post_subject);
            View findViewById = view.findViewById(R.id.subject_parent);
            eVar.f41781d = findViewById;
            findViewById.setPadding(findViewById.getPaddingLeft(), com.join.android.app.component.optimizetext.a.a(10.0f), eVar.f41781d.getPaddingRight(), eVar.f41781d.getPaddingBottom());
            view.setTag(eVar);
        }
        try {
            cVar = (f.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar == null) {
            return view;
        }
        String str = cVar.f41795b;
        String g4 = com.join.mgps.Util.g2.g(cVar.f41794a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int color = this.f41763b.getResources().getColor(R.color.search_high_light);
        int indexOf = str.indexOf(g4);
        int length = g4.length() + indexOf;
        try {
            if (length <= str.length() && indexOf >= 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf, length, 33);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        eVar.f41780c.setText(spannableStringBuilder);
        i(view, cVar.f41796c);
        return view;
    }

    public List<f> b() {
        return this.f41764c;
    }

    public void f(b bVar) {
        this.f41765d = bVar;
    }

    void g(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i4);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<f> list = this.f41764c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<f> list = this.f41764c;
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
        List<f> list = this.f41764c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.POST_FOOTER.ordinal()) {
            return c(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.POST_MESSAGE.ordinal()) {
            return d(i4, view, viewGroup);
        }
        return itemViewType == ViewType.POST_SUBJECT.ordinal() ? e(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public void h(List<f> list) {
        if (list == null) {
            return;
        }
        if (this.f41764c == null) {
            this.f41764c = new ArrayList();
        }
        this.f41764c.clear();
        this.f41764c.addAll(list);
    }

    public void i(View view, String str) {
        view.setOnClickListener(new a(str));
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
