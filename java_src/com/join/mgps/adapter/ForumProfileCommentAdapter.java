package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumProfileCommentAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f41280b;

    /* renamed from: c  reason: collision with root package name */
    private List<i> f41281c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private c f41282d;

    /* loaded from: classes4.dex */
    public enum ViewType {
        PROFILE_HEADER,
        PROFILE_MESSAGE_ITEM,
        PROFILE_FOOTER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i.b f41283b;

        a(i.b bVar) {
            this.f41283b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41283b.f41317g).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41285b;

        b(int i4) {
            this.f41285b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileCommentAdapter.this.f41282d != null) {
                ForumProfileCommentAdapter.this.f41282d.d(this.f41285b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void d(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends j {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41287b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41288c;

        d() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class e extends j {
        e() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends j {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41291b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41292c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41293d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f41294e;

        /* renamed from: f  reason: collision with root package name */
        public View f41295f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f41296g;

        /* renamed from: h  reason: collision with root package name */
        public RelativeLayout f41297h;

        /* renamed from: i  reason: collision with root package name */
        public VipView f41298i;

        /* renamed from: j  reason: collision with root package name */
        public ImageView f41299j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f41300k;

        f() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends j {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41302b;

        /* renamed from: c  reason: collision with root package name */
        public View f41303c;

        g() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class h extends j {
        h() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41306a;

        /* renamed from: b  reason: collision with root package name */
        Object f41307b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f41308a;

            /* renamed from: b  reason: collision with root package name */
            public String f41309b;

            /* renamed from: c  reason: collision with root package name */
            public String f41310c;

            public a() {
            }

            public a(int i4, String str, String str2) {
                this.f41308a = i4;
                this.f41309b = str;
                this.f41310c = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41311a;

            /* renamed from: b  reason: collision with root package name */
            public String f41312b;

            /* renamed from: c  reason: collision with root package name */
            public String f41313c;

            /* renamed from: d  reason: collision with root package name */
            public long f41314d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41315e;

            /* renamed from: f  reason: collision with root package name */
            public int f41316f;

            /* renamed from: g  reason: collision with root package name */
            public int f41317g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41318h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f41319i;

            /* renamed from: j  reason: collision with root package name */
            public int f41320j;

            /* renamed from: k  reason: collision with root package name */
            public int f41321k;

            /* renamed from: l  reason: collision with root package name */
            public String f41322l;

            /* renamed from: m  reason: collision with root package name */
            public String f41323m;

            public b() {
            }

            public b(boolean z4, String str, String str2, long j4, boolean z5, int i4, int i5, int i6, String str3, String str4, int i7) {
                this.f41311a = z4;
                this.f41312b = str;
                this.f41313c = str2;
                this.f41314d = j4;
                this.f41315e = z5;
                this.f41316f = i4;
                this.f41317g = i7;
                this.f41320j = i5;
                this.f41321k = i6;
                this.f41322l = str3;
                this.f41323m = str4;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f41324a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f41325b;

            /* renamed from: c  reason: collision with root package name */
            public ForumBean.ForumProfileCommentBean f41326c;

            public c() {
            }

            public c(int i4, boolean z4, ForumBean.ForumProfileCommentBean forumProfileCommentBean) {
                this.f41324a = i4;
                this.f41325b = z4;
                this.f41326c = forumProfileCommentBean;
            }
        }

        public i() {
        }

        public Object a() {
            return this.f41307b;
        }

        public ViewType b() {
            return this.f41306a;
        }

        public void c(Object obj) {
            this.f41307b = obj;
        }

        public void d(ViewType viewType) {
            this.f41306a = viewType;
        }

        public i(ViewType viewType, Object obj) {
            this.f41306a = viewType;
            this.f41307b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class j {
        j() {
        }
    }

    public ForumProfileCommentAdapter(Context context) {
        this.f41280b = context;
    }

    private View c(int i4, View view, ViewGroup viewGroup) {
        d dVar;
        i.a aVar;
        try {
            if (view != null) {
                dVar = (d) view.getTag();
            } else {
                dVar = new d();
                view = LayoutInflater.from(this.f41280b).inflate(R.layout.mg_forum_profile_footer, (ViewGroup) null);
                dVar.f41287b = (SimpleDraweeView) view.findViewById(R.id.post_profile_image);
                dVar.f41288c = (TextView) view.findViewById(R.id.post_profile_message);
                view.setTag(dVar);
            }
            aVar = (i.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar == null) {
            return view;
        }
        f(view, aVar.f41308a);
        if (com.join.mgps.Util.g2.h(aVar.f41309b)) {
            dVar.f41287b.setVisibility(8);
        } else {
            dVar.f41287b.setVisibility(0);
            MyImageLoader.h(dVar.f41287b, aVar.f41309b);
        }
        com.join.mgps.Util.j0.D1(dVar.f41288c, aVar.f41310c, "");
        return view;
    }

    private View d(int i4, View view, ViewGroup viewGroup) {
        f fVar;
        i.b bVar;
        if (view != null) {
            fVar = (f) view.getTag();
        } else {
            fVar = new f();
            view = LayoutInflater.from(this.f41280b).inflate(R.layout.mg_forum_profile_header, (ViewGroup) null);
            fVar.f41295f = view.findViewById(R.id.forum_post_divider);
            fVar.f41291b = (SimpleDraweeView) view.findViewById(R.id.forum_post_avatar_src);
            fVar.f41292c = (TextView) view.findViewById(R.id.forum_post_nickname);
            fVar.f41293d = (TextView) view.findViewById(R.id.forum_post_add_time);
            fVar.f41294e = (TextView) view.findViewById(R.id.forum_post_stickie);
            fVar.f41296g = (ImageView) view.findViewById(R.id.forum_post_moderator);
            fVar.f41299j = (ImageView) view.findViewById(R.id.officialIcon);
            fVar.f41297h = (RelativeLayout) view.findViewById(R.id.forumExtFunc);
            fVar.f41298i = (VipView) view.findViewById(R.id.vipFlag);
            fVar.f41300k = (TextView) view.findViewById(R.id.copperTitleTv);
            view.setTag(fVar);
        }
        try {
            bVar = (i.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            return view;
        }
        UtilsMy.A3(this.f41280b, fVar.f41292c, bVar.f41320j, bVar.f41321k, R.color.forum_nickname_color);
        fVar.f41298i.setVipData(bVar.f41320j, bVar.f41321k);
        fVar.f41297h.setVisibility(8);
        if (bVar.f41311a) {
            fVar.f41295f.setVisibility(8);
        } else {
            fVar.f41295f.setVisibility(0);
        }
        fVar.f41292c.setText(bVar.f41313c);
        fVar.f41293d.setText(com.join.android.app.common.utils.g.a(bVar.f41314d * 1000));
        TextView textView = fVar.f41294e;
        if (textView != null) {
            if (bVar.f41315e) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        ImageView imageView = fVar.f41296g;
        if (imageView != null) {
            if (bVar.f41318h) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (bVar.f41319i) {
            fVar.f41299j.setVisibility(0);
        } else {
            fVar.f41299j.setVisibility(8);
        }
        MyImageLoader.x(fVar.f41291b, bVar.f41312b);
        fVar.f41291b.setOnClickListener(new a(bVar));
        f(view, bVar.f41316f);
        com.join.mgps.Util.j0.S0(fVar.f41291b, fVar.f41292c, fVar.f41293d);
        com.join.mgps.Util.j0.U0(fVar.f41298i);
        String str = bVar.f41322l;
        String str2 = bVar.f41323m;
        if (fVar.f41300k != null) {
            if (!TextUtils.isEmpty(str)) {
                fVar.f41300k.setVisibility(0);
                fVar.f41300k.setText(str);
                Drawable drawable = this.f41280b.getResources().getDrawable(R.drawable.forum_post_host);
                if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                    str2 = "#2fccdf";
                }
                drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                fVar.f41300k.setBackgroundDrawable(drawable);
            } else {
                fVar.f41300k.setVisibility(8);
            }
        }
        return view;
    }

    private View e(int i4, View view, ViewGroup viewGroup) {
        g gVar;
        i.c cVar;
        if (view != null) {
            gVar = (g) view.getTag();
        } else {
            gVar = new g();
            view = LayoutInflater.from(this.f41280b).inflate(R.layout.mg_forum_profile_message_item, (ViewGroup) null);
            gVar.f41302b = (TextView) view.findViewById(R.id.mg_forum_profile_message_tv);
            gVar.f41303c = view.findViewById(R.id.mg_forum_profile_message_divider);
            view.setTag(gVar);
        }
        try {
            cVar = (i.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar == null) {
            return view;
        }
        if (cVar.f41325b) {
            gVar.f41303c.setVisibility(8);
        } else {
            gVar.f41303c.setVisibility(0);
        }
        ForumBean.ForumProfileCommentBean forumProfileCommentBean = cVar.f41326c;
        if (forumProfileCommentBean == null) {
            return view;
        }
        String rnickname = forumProfileCommentBean.getRnickname();
        if (com.join.mgps.Util.g2.h(rnickname)) {
            rnickname = "我";
        }
        com.join.mgps.Util.j0.B1(gVar.f41302b, forumProfileCommentBean.getType(), rnickname, forumProfileCommentBean.getMessage());
        f(view, cVar.f41324a);
        return view;
    }

    private void f(View view, int i4) {
        view.setOnClickListener(new b(i4));
    }

    private void i(LinearLayout linearLayout, List<ForumBean.ForumProfileCommentBean> list) {
        View inflate;
        if (list != null && list.size() != 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (i4 < linearLayout.getChildCount()) {
                    inflate = linearLayout.getChildAt(i4);
                } else {
                    inflate = LayoutInflater.from(this.f41280b).inflate(R.layout.mg_forum_profile_message_item, (ViewGroup) null);
                    linearLayout.addView(inflate);
                }
                TextView textView = (TextView) inflate.findViewById(R.id.mg_forum_profile_message_tv);
                View findViewById = inflate.findViewById(R.id.mg_forum_profile_message_divider);
                if (i4 == list.size() - 1) {
                    findViewById.setVisibility(8);
                } else {
                    findViewById.setVisibility(0);
                }
                ForumBean.ForumProfileCommentBean forumProfileCommentBean = list.get(i4);
                if (forumProfileCommentBean != null) {
                    com.join.mgps.Util.j0.B1(textView, forumProfileCommentBean.getType(), forumProfileCommentBean.getRnickname(), forumProfileCommentBean.getMessage());
                }
            }
            if (linearLayout.getChildCount() > list.size()) {
                linearLayout.removeViews(list.size(), linearLayout.getChildCount() - list.size());
                return;
            }
            return;
        }
        linearLayout.setVisibility(8);
    }

    public List<i> b() {
        return this.f41281c;
    }

    public void g(List<i> list) {
        if (list == null) {
            return;
        }
        if (this.f41281c == null) {
            this.f41281c = new ArrayList();
        }
        this.f41281c.clear();
        this.f41281c.addAll(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<i> list = this.f41281c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<i> list = this.f41281c;
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
        List<i> list = this.f41281c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.PROFILE_HEADER.ordinal()) {
            return d(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.PROFILE_MESSAGE_ITEM.ordinal()) {
            return e(i4, view, viewGroup);
        }
        return itemViewType == ViewType.PROFILE_FOOTER.ordinal() ? c(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public void h(c cVar) {
        this.f41282d = cVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
