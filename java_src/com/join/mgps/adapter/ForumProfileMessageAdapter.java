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
public class ForumProfileMessageAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f41587b;

    /* renamed from: c  reason: collision with root package name */
    private List<j> f41588c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private d f41589d;

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
        final /* synthetic */ j.b f41590b;

        a(j.b bVar) {
            this.f41590b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f41590b.f41639l).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41592b;

        b(int i4) {
            this.f41592b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileMessageAdapter.this.f41589d != null) {
                ForumProfileMessageAdapter.this.f41589d.d(this.f41592b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f41596d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f41597e;

        c(int i4, int i5, int i6, String str) {
            this.f41594b = i4;
            this.f41595c = i5;
            this.f41596d = i6;
            this.f41597e = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileMessageAdapter.this.f41589d != null) {
                ForumProfileMessageAdapter.this.f41589d.a(this.f41594b, this.f41595c, this.f41596d, this.f41597e);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(int i4, int i5, int i6, String str);

        void d(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends k {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41599b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41600c;

        /* renamed from: d  reason: collision with root package name */
        public RelativeLayout f41601d;

        e() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class f extends k {
        f() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends k {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f41604b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41605c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f41606d;

        /* renamed from: e  reason: collision with root package name */
        public View f41607e;

        /* renamed from: f  reason: collision with root package name */
        public RelativeLayout f41608f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f41609g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f41610h;

        /* renamed from: i  reason: collision with root package name */
        public VipView f41611i;

        /* renamed from: j  reason: collision with root package name */
        public ImageView f41612j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f41613k;

        g() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends k {

        /* renamed from: b  reason: collision with root package name */
        public TextView f41615b;

        /* renamed from: c  reason: collision with root package name */
        public View f41616c;

        h() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    class i extends k {
        i() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41619a;

        /* renamed from: b  reason: collision with root package name */
        Object f41620b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f41621a;

            /* renamed from: b  reason: collision with root package name */
            public String f41622b;

            /* renamed from: c  reason: collision with root package name */
            public String f41623c;

            /* renamed from: d  reason: collision with root package name */
            public int f41624d;

            /* renamed from: e  reason: collision with root package name */
            public String f41625e;

            /* renamed from: f  reason: collision with root package name */
            public String f41626f;

            /* renamed from: g  reason: collision with root package name */
            public int f41627g;

            public a(int i4, String str, String str2, int i5, String str3, String str4, int i6) {
                this.f41621a = i4;
                this.f41622b = str;
                this.f41623c = str2;
                this.f41624d = i5;
                this.f41625e = str3;
                this.f41626f = str4;
                this.f41627g = i6;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41628a;

            /* renamed from: b  reason: collision with root package name */
            public String f41629b;

            /* renamed from: c  reason: collision with root package name */
            public String f41630c;

            /* renamed from: d  reason: collision with root package name */
            public long f41631d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f41632e;

            /* renamed from: f  reason: collision with root package name */
            public int f41633f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41634g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f41635h;

            /* renamed from: i  reason: collision with root package name */
            public int f41636i;

            /* renamed from: j  reason: collision with root package name */
            public String f41637j;

            /* renamed from: k  reason: collision with root package name */
            public int f41638k;

            /* renamed from: l  reason: collision with root package name */
            public int f41639l;

            /* renamed from: m  reason: collision with root package name */
            public int f41640m;

            /* renamed from: n  reason: collision with root package name */
            public int f41641n;

            /* renamed from: o  reason: collision with root package name */
            public String f41642o;

            /* renamed from: p  reason: collision with root package name */
            public String f41643p;

            public b(boolean z4, String str, String str2, long j4, boolean z5, int i4, boolean z6, boolean z7, int i5, String str3, int i6, int i7, int i8, String str4, String str5, int i9) {
                this.f41628a = z4;
                this.f41629b = str;
                this.f41630c = str2;
                this.f41631d = j4;
                this.f41632e = z5;
                this.f41633f = i4;
                this.f41639l = i9;
                this.f41634g = z6;
                this.f41635h = z7;
                this.f41636i = i5;
                this.f41637j = str3;
                this.f41638k = i6;
                this.f41640m = i7;
                this.f41641n = i8;
                this.f41642o = str4;
                this.f41643p = str5;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f41644a;

            /* renamed from: b  reason: collision with root package name */
            public String f41645b;

            /* renamed from: c  reason: collision with root package name */
            public String f41646c;

            /* renamed from: d  reason: collision with root package name */
            public String f41647d;

            /* renamed from: e  reason: collision with root package name */
            public int f41648e;

            /* renamed from: f  reason: collision with root package name */
            public int f41649f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f41650g;

            public c(int i4, String str, String str2, String str3, int i5, int i6, boolean z4) {
                this.f41644a = i4;
                this.f41645b = str;
                this.f41646c = str2;
                this.f41647d = str3;
                this.f41648e = i5;
                this.f41649f = i6;
                this.f41650g = z4;
            }
        }

        public j() {
        }

        public Object a() {
            return this.f41620b;
        }

        public ViewType b() {
            return this.f41619a;
        }

        public void c(Object obj) {
            this.f41620b = obj;
        }

        public void d(ViewType viewType) {
            this.f41619a = viewType;
        }

        public j(ViewType viewType, Object obj) {
            this.f41619a = viewType;
            this.f41620b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class k {
        k() {
        }
    }

    public ForumProfileMessageAdapter(Context context) {
        this.f41587b = context;
    }

    private View c(int i4, View view, ViewGroup viewGroup) {
        e eVar;
        j.a aVar;
        try {
            if (view != null) {
                eVar = (e) view.getTag();
            } else {
                eVar = new e();
                view = LayoutInflater.from(this.f41587b).inflate(R.layout.mg_forum_profile_footer, (ViewGroup) null);
                eVar.f41601d = (RelativeLayout) view.findViewById(R.id.post_profile_post_profile);
                eVar.f41599b = (SimpleDraweeView) view.findViewById(R.id.post_profile_image);
                eVar.f41600c = (TextView) view.findViewById(R.id.post_profile_message);
                view.setTag(eVar);
            }
            aVar = (j.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar == null) {
            return view;
        }
        if (com.join.mgps.Util.g2.h(aVar.f41622b)) {
            eVar.f41599b.setVisibility(8);
        } else {
            eVar.f41599b.setVisibility(0);
            MyImageLoader.h(eVar.f41599b, aVar.f41622b);
        }
        com.join.mgps.Util.j0.D1(eVar.f41600c, aVar.f41623c, "");
        f(eVar.f41601d, aVar.f41621a);
        i(view, aVar.f41625e, aVar.f41621a, aVar.f41624d, aVar.f41627g, aVar.f41626f);
        return view;
    }

    private View d(int i4, View view, ViewGroup viewGroup) {
        g gVar;
        View view2;
        j.b bVar;
        if (view != null) {
            gVar = (g) view.getTag();
            view2 = view;
        } else {
            gVar = new g();
            View inflate = LayoutInflater.from(this.f41587b).inflate(R.layout.mg_forum_profile_header, (ViewGroup) null);
            gVar.f41607e = inflate.findViewById(R.id.forum_post_divider);
            gVar.f41604b = (SimpleDraweeView) inflate.findViewById(R.id.forum_post_avatar_src);
            gVar.f41605c = (TextView) inflate.findViewById(R.id.forum_post_nickname);
            gVar.f41606d = (TextView) inflate.findViewById(R.id.forum_post_add_time);
            gVar.f41608f = (RelativeLayout) inflate.findViewById(R.id.forumExtFunc);
            gVar.f41609g = (ImageView) inflate.findViewById(R.id.moreFunc);
            gVar.f41610h = (ImageView) inflate.findViewById(R.id.replyFunc);
            gVar.f41611i = (VipView) inflate.findViewById(R.id.vipFlag);
            gVar.f41612j = (ImageView) inflate.findViewById(R.id.officialIcon);
            gVar.f41613k = (TextView) inflate.findViewById(R.id.copperTitleTv);
            inflate.setTag(gVar);
            view2 = inflate;
        }
        try {
            bVar = (j.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            return view2;
        }
        UtilsMy.A3(this.f41587b, gVar.f41605c, bVar.f41640m, bVar.f41641n, R.color.forum_nickname_color);
        gVar.f41611i.setVipData(bVar.f41640m, bVar.f41641n);
        gVar.f41608f.setVisibility(0);
        gVar.f41609g.setVisibility(8);
        gVar.f41610h.setVisibility(0);
        if (bVar.f41628a) {
            gVar.f41607e.setVisibility(8);
        } else {
            gVar.f41607e.setVisibility(0);
        }
        if (bVar.f41635h) {
            gVar.f41612j.setVisibility(0);
        } else {
            gVar.f41612j.setVisibility(8);
        }
        gVar.f41605c.setText(bVar.f41630c);
        gVar.f41606d.setText(com.join.android.app.common.utils.g.a(bVar.f41631d * 1000));
        MyImageLoader.x(gVar.f41604b, bVar.f41629b);
        gVar.f41604b.setOnClickListener(new a(bVar));
        i(view2, bVar.f41637j, bVar.f41633f, bVar.f41636i, bVar.f41638k, bVar.f41630c);
        i(gVar.f41610h, bVar.f41637j, bVar.f41633f, bVar.f41636i, bVar.f41638k, bVar.f41630c);
        com.join.mgps.Util.j0.S0(gVar.f41604b, gVar.f41605c, gVar.f41606d);
        com.join.mgps.Util.j0.U0(gVar.f41611i);
        String str = bVar.f41642o;
        String str2 = bVar.f41643p;
        if (gVar.f41613k != null) {
            if (!TextUtils.isEmpty(str)) {
                gVar.f41613k.setVisibility(0);
                gVar.f41613k.setText(str);
                Drawable drawable = this.f41587b.getResources().getDrawable(R.drawable.forum_post_host);
                if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                    str2 = "#2fccdf";
                }
                drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                gVar.f41613k.setBackgroundDrawable(drawable);
            } else {
                gVar.f41613k.setVisibility(8);
            }
        }
        return view2;
    }

    private View e(int i4, View view, ViewGroup viewGroup) {
        h hVar;
        j.c cVar;
        if (view != null) {
            hVar = (h) view.getTag();
        } else {
            hVar = new h();
            view = LayoutInflater.from(this.f41587b).inflate(R.layout.mg_forum_profile_message_item, (ViewGroup) null);
            hVar.f41615b = (TextView) view.findViewById(R.id.mg_forum_profile_message_tv);
            hVar.f41616c = view.findViewById(R.id.mg_forum_profile_message_divider);
            view.setTag(hVar);
        }
        try {
            cVar = (j.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar == null) {
            return view;
        }
        hVar.f41616c.setVisibility(8);
        if (cVar.f41650g && !cVar.f41646c.contains("#*#")) {
            cVar.f41646c += "#*#";
        }
        com.join.mgps.Util.j0.B1(hVar.f41615b, cVar.f41645b, cVar.f41646c, cVar.f41647d);
        i(view, cVar.f41645b, cVar.f41644a, cVar.f41648e, cVar.f41649f, cVar.f41646c);
        return view;
    }

    private void f(View view, int i4) {
        view.setOnClickListener(new b(i4));
    }

    private void g(View view, int i4, int i5, int i6, String str) {
        view.setOnClickListener(new c(i4, i5, i6, str));
    }

    private void k(LinearLayout linearLayout, List<ForumBean.ForumProfileCommentBean> list) {
        View inflate;
        if (list != null && list.size() != 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (i4 < linearLayout.getChildCount()) {
                    inflate = linearLayout.getChildAt(i4);
                } else {
                    inflate = LayoutInflater.from(this.f41587b).inflate(R.layout.mg_forum_profile_message_item, (ViewGroup) null);
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

    public List<j> b() {
        return this.f41588c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<j> list = this.f41588c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<j> list = this.f41588c;
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
        List<j> list = this.f41588c;
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

    public void h(List<j> list) {
        if (list == null) {
            return;
        }
        if (this.f41588c == null) {
            this.f41588c = new ArrayList();
        }
        this.f41588c.clear();
        this.f41588c.addAll(list);
    }

    void i(View view, String str, int i4, int i5, int i6, String str2) {
        if (str.equals("comment")) {
            g(view, i4, i5, 0, str2);
        } else if (str.equals("reply")) {
            g(view, i4, i5, i6, str2);
        } else if (str.equals("praise") || str.equals("best") || str.equals("bestanswer")) {
            f(view, i4);
        }
    }

    public void j(d dVar) {
        this.f41589d = dVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
