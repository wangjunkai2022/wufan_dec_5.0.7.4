package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumTMemberAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f41798b;

    /* renamed from: d  reason: collision with root package name */
    private c f41800d = null;

    /* renamed from: c  reason: collision with root package name */
    private List<i> f41799c = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        MEMBER_HEADER,
        MEMBER_ITEM,
        MEMBER_MODERATORS,
        MEMBER_MY
    }

    /* loaded from: classes4.dex */
    class a extends SimpleAdapter {
        a(Context context, List list, int i4, String[] strArr, int[] iArr) {
            super(context, list, i4, strArr, iArr);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41802b;

        b(int i4) {
            this.f41802b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumTMemberAdapter.this.f41800d != null) {
                Context context = view.getContext();
                if (com.join.mgps.Util.j0.Y0(context)) {
                    ForumTMemberAdapter.this.f41800d.a(this.f41802b);
                    return;
                }
                com.join.mgps.Util.l2.a(context).b("用户未登录，请登录");
                com.join.mgps.Util.j0.L0(context);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c {
        public abstract void a(int i4);
    }

    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public View f41804a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f41805b;

        public d() {
        }
    }

    /* loaded from: classes4.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f41807a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f41808b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41809c;

        /* renamed from: d  reason: collision with root package name */
        public RelativeLayout f41810d;

        public e() {
        }
    }

    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public HListView f41812a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f41813b;
    }

    /* loaded from: classes4.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f41814a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f41815b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41816c;

        /* renamed from: d  reason: collision with root package name */
        public RelativeLayout f41817d;

        /* renamed from: e  reason: collision with root package name */
        public Button f41818e;

        /* renamed from: f  reason: collision with root package name */
        public Button f41819f;
    }

    /* loaded from: classes4.dex */
    public class h extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        final String f41820b = "itemImg";

        /* renamed from: c  reason: collision with root package name */
        final String f41821c = "itemName";

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<HashMap<String, Object>> f41822d;

        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            public SimpleDraweeView f41824a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f41825b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f41826c;

            a() {
            }
        }

        public h() {
        }

        public ArrayList<HashMap<String, Object>> a() {
            return this.f41822d;
        }

        public void b(ArrayList<HashMap<String, Object>> arrayList) {
            this.f41822d = arrayList;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            ArrayList<HashMap<String, Object>> arrayList = this.f41822d;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            ArrayList<HashMap<String, Object>> arrayList = this.f41822d;
            if (arrayList == null) {
                return null;
            }
            return arrayList.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            try {
                if (view != null) {
                    aVar = (a) view.getTag();
                } else {
                    aVar = new a();
                    view = LayoutInflater.from(ForumTMemberAdapter.this.f41798b).inflate(R.layout.mg_forum_forum_t_member_item_moderators_item, (ViewGroup) null);
                    aVar.f41824a = (SimpleDraweeView) view.findViewById(R.id.itemImg);
                    aVar.f41825b = (TextView) view.findViewById(R.id.itemName);
                    view.setTag(aVar);
                }
                HashMap hashMap = (HashMap) getItem(i4);
                MyImageLoader.h(aVar.f41824a, (String) hashMap.get("itemImg"));
                aVar.f41825b.setText((String) hashMap.get("itemName"));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }
    }

    /* loaded from: classes4.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        ViewType f41828a;

        /* renamed from: b  reason: collision with root package name */
        Object f41829b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f41830a;

            public a(String str) {
                this.f41830a = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f41831a;

            /* renamed from: b  reason: collision with root package name */
            public String f41832b;

            /* renamed from: c  reason: collision with root package name */
            public String f41833c;

            public b(String str, String str2, String str3) {
                this.f41831a = str;
                this.f41832b = str2;
                this.f41833c = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public ArrayList<HashMap<String, Object>> f41834a;

            public c(ArrayList<HashMap<String, Object>> arrayList) {
                this.f41834a = arrayList;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f41835a;

            /* renamed from: b  reason: collision with root package name */
            public String f41836b;

            /* renamed from: c  reason: collision with root package name */
            public String f41837c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f41838d;

            /* renamed from: e  reason: collision with root package name */
            public int f41839e;

            public d(String str, String str2, String str3, boolean z4, int i4) {
                this.f41835a = str;
                this.f41836b = str2;
                this.f41837c = str3;
                this.f41838d = z4;
                this.f41839e = i4;
            }
        }

        public i() {
        }

        public Object a() {
            return this.f41829b;
        }

        public ViewType b() {
            return this.f41828a;
        }

        public void c(Object obj) {
            this.f41829b = obj;
        }

        public void d(ViewType viewType) {
            this.f41828a = viewType;
        }

        public i(ViewType viewType, Object obj) {
            this.f41828a = viewType;
            this.f41829b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class j {
        j() {
        }
    }

    public ForumTMemberAdapter(Context context) {
        this.f41798b = context;
    }

    private View d(int i4, View view, ViewGroup viewGroup) {
        d dVar;
        i.a aVar;
        if (view != null) {
            dVar = (d) view.getTag();
        } else {
            dVar = new d();
            view = LayoutInflater.from(this.f41798b).inflate(R.layout.mg_forum_forum_t_member_item_header, (ViewGroup) null);
            dVar.f41804a = view.findViewById(R.id.dividerTop);
            dVar.f41805b = (TextView) view.findViewById(R.id.sectionTitle);
            view.setTag(dVar);
        }
        try {
            aVar = (i.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar == null) {
            return view;
        }
        dVar.f41805b.setText(aVar.f41830a);
        return view;
    }

    private View e(int i4, View view, ViewGroup viewGroup) {
        e eVar;
        i.b bVar;
        if (view != null) {
            eVar = (e) view.getTag();
        } else {
            eVar = new e();
            view = LayoutInflater.from(this.f41798b).inflate(R.layout.mg_forum_forum_t_member_item, (ViewGroup) null);
            eVar.f41807a = (SimpleDraweeView) view.findViewById(R.id.avatar);
            eVar.f41808b = (TextView) view.findViewById(R.id.nickName);
            eVar.f41809c = (TextView) view.findViewById(R.id.desc);
            eVar.f41810d = (RelativeLayout) view.findViewById(R.id.follow);
            view.setTag(eVar);
        }
        try {
            bVar = (i.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            return view;
        }
        SimpleDraweeView simpleDraweeView = eVar.f41807a;
        MyImageLoader.h(simpleDraweeView, bVar.f41831a + "");
        eVar.f41808b.setText(bVar.f41832b);
        eVar.f41809c.setText(bVar.f41833c);
        eVar.f41810d.setVisibility(8);
        return view;
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        f fVar;
        i.c cVar;
        if (view != null) {
            fVar = (f) view.getTag();
        } else {
            fVar = new f();
            view = LayoutInflater.from(this.f41798b).inflate(R.layout.mg_forum_forum_t_member_item_moderators, (ViewGroup) null);
            fVar.f41812a = (HListView) view.findViewById(R.id.list);
            fVar.f41813b = (TextView) view.findViewById(R.id.noMoreModerator);
            view.setTag(fVar);
        }
        try {
            cVar = (i.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar == null) {
            fVar.f41812a.setVisibility(8);
            fVar.f41813b.setVisibility(0);
            return view;
        }
        fVar.f41812a.setVisibility(0);
        fVar.f41813b.setVisibility(8);
        h hVar = (h) fVar.f41812a.getAdapter();
        if (hVar == null) {
            hVar = new h();
            fVar.f41812a.setAdapter((ListAdapter) hVar);
        }
        hVar.b(cVar.f41834a);
        hVar.notifyDataSetChanged();
        return view;
    }

    private View g(int i4, View view, ViewGroup viewGroup) {
        g gVar;
        i.d dVar;
        if (view != null) {
            gVar = (g) view.getTag();
        } else {
            gVar = new g();
            view = LayoutInflater.from(this.f41798b).inflate(R.layout.mg_forum_forum_t_member_item_my, (ViewGroup) null);
            gVar.f41814a = (SimpleDraweeView) view.findViewById(R.id.avatar);
            gVar.f41815b = (TextView) view.findViewById(R.id.nickName);
            gVar.f41816c = (TextView) view.findViewById(R.id.desc);
            gVar.f41817d = (RelativeLayout) view.findViewById(R.id.follow);
            gVar.f41818e = (Button) view.findViewById(R.id.followImg);
            gVar.f41819f = (Button) view.findViewById(R.id.followedImg);
            view.setTag(gVar);
        }
        try {
            dVar = (i.d) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (dVar == null) {
            return view;
        }
        SimpleDraweeView simpleDraweeView = gVar.f41814a;
        MyImageLoader.h(simpleDraweeView, dVar.f41835a + "");
        gVar.f41815b.setText(dVar.f41836b);
        gVar.f41816c.setText(dVar.f41837c);
        return view;
    }

    private SimpleAdapter h(ArrayList<HashMap<String, Object>> arrayList) {
        return new a(this.f41798b, arrayList, R.layout.mg_forum_forum_t_member_item_moderators_item, new String[]{"itemImg", "itemName"}, new int[]{R.id.itemImg, R.id.itemName});
    }

    public List<i> c() {
        return this.f41799c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<i> list = this.f41799c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<i> list = this.f41799c;
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
        List<i> list = this.f41799c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.MEMBER_HEADER.ordinal()) {
            return d(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MEMBER_ITEM.ordinal()) {
            return e(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MEMBER_MODERATORS.ordinal()) {
            return f(i4, view, viewGroup);
        }
        return itemViewType == ViewType.MEMBER_MY.ordinal() ? g(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public void i(c cVar) {
        this.f41800d = cVar;
    }

    public void j(List<i> list) {
        if (list == null) {
            return;
        }
        if (this.f41799c == null) {
            this.f41799c = new ArrayList();
        }
        this.f41799c.clear();
        this.f41799c.addAll(list);
    }

    public void k(View view, int i4) {
        view.setOnClickListener(new b(i4));
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
