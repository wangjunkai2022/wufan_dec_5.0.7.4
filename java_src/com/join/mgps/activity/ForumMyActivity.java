package com.join.mgps.activity;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.label.MainLabelActivity_;
import com.join.mgps.customview.ForumBaseHeaderView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.ForumMyHeaderView;
import com.join.mgps.customview.XExpandableListView;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.RecommenGroup;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import ru.noties.scrollable.ScrollableLayout;
@EActivity(R.layout.activity_forum_my)
/* loaded from: classes4.dex */
public class ForumMyActivity extends BaseAppCompatActivity implements View.OnClickListener, ForumBaseHeaderView.a {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f30437b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ForumLoadingView f30438c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ScrollableLayout f30439d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ForumMyHeaderView f30440e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    PtrClassicFrameLayout f30441f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XExpandableListView f30442g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.rpc.i f30443h;

    /* renamed from: i  reason: collision with root package name */
    public int f30444i;

    /* renamed from: j  reason: collision with root package name */
    public int f30445j;

    /* renamed from: q  reason: collision with root package name */
    private com.join.mgps.customview.g f30452q;

    /* renamed from: r  reason: collision with root package name */
    k f30453r;

    /* renamed from: k  reason: collision with root package name */
    List<RecommenGroup> f30446k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<RecommendLabelTag> f30447l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final int f30448m = 1;

    /* renamed from: n  reason: collision with root package name */
    private final int f30449n = 2;

    /* renamed from: o  reason: collision with root package name */
    private final int f30450o = 3;

    /* renamed from: p  reason: collision with root package name */
    private final int f30451p = 4;

    /* renamed from: s  reason: collision with root package name */
    Handler f30454s = new Handler();

    /* renamed from: t  reason: collision with root package name */
    boolean f30455t = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.ptr.b {
        a() {
        }

        @Override // com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            ForumMyActivity.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ru.noties.scrollable.b {
        b() {
        }

        @Override // ru.noties.scrollable.b
        public boolean q(int i4) {
            XExpandableListView xExpandableListView = ForumMyActivity.this.f30442g;
            return xExpandableListView != null && xExpandableListView.canScrollVertically(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements ru.noties.scrollable.j {
        c() {
        }

        @Override // ru.noties.scrollable.j
        public void F(int i4, long j4) {
            XExpandableListView xExpandableListView = ForumMyActivity.this.f30442g;
            if (xExpandableListView != null) {
                xExpandableListView.smoothScrollBy(i4, (int) j4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements com.join.mgps.customview.f {
        d() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ForumMyActivity.this.g0()) {
                ForumMyActivity forumMyActivity = ForumMyActivity.this;
                if (forumMyActivity.f30445j == -1) {
                    forumMyActivity.m0();
                } else {
                    forumMyActivity.i0(forumMyActivity.f30444i + 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements com.join.mgps.customview.g {
        e() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (ForumMyActivity.this.g0()) {
                ForumMyActivity forumMyActivity = ForumMyActivity.this;
                forumMyActivity.f30445j = 0;
                forumMyActivity.i0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements ExpandableListView.OnGroupClickListener {
        f() {
        }

        @Override // android.widget.ExpandableListView.OnGroupClickListener
        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i4, long j4) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XExpandableListView xExpandableListView = ForumMyActivity.this.f30442g;
            if (xExpandableListView == null) {
                return;
            }
            xExpandableListView.s();
            ForumMyActivity.this.f30442g.r();
            ForumMyActivity forumMyActivity = ForumMyActivity.this;
            if (forumMyActivity.f30445j == -1) {
                forumMyActivity.f30442g.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends ForumLoadingView.e {
        h(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends ForumLoadingView.e {
        i(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
        }
    }

    /* loaded from: classes4.dex */
    class j {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f30465a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f30466b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f30467c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f30468d;

        /* renamed from: e  reason: collision with root package name */
        public View f30469e;

        j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends BaseExpandableListAdapter {

        /* renamed from: a  reason: collision with root package name */
        List<l> f30471a;

        /* renamed from: b  reason: collision with root package name */
        private Context f30472b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f30474b;

            a(int i4) {
                this.f30474b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!ForumMyActivity.this.f30442g.isGroupExpanded(this.f30474b)) {
                    ForumMyActivity.this.f30442g.expandGroup(this.f30474b);
                } else {
                    ForumMyActivity.this.f30442g.collapseGroup(this.f30474b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil.getInstance().goForumMyPostsActivity(view.getContext());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil.getInstance().goForumProfileCommentActivity(view.getContext());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class d implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f30478b;

            d(int i4) {
                this.f30478b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil.getInstance().goForumGroupActivity(view.getContext(), this.f30478b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class e implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f30480b;

            e(int i4) {
                this.f30480b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainLabelActivity_.O0(view.getContext()).d(this.f30480b).start();
            }
        }

        public k(Context context) {
            this.f30472b = context;
        }

        private void f(View view, int i4) {
            if (view == null) {
                return;
            }
            view.setOnClickListener(new d(i4));
        }

        private void i(View view, int i4) {
            if (view == null) {
                return;
            }
            view.setOnClickListener(new e(i4));
        }

        public void a(l lVar) {
            if (this.f30471a == null) {
                this.f30471a = new ArrayList();
            }
            this.f30471a.add(lVar);
        }

        public List<l> b() {
            return this.f30471a;
        }

        @Override // android.widget.ExpandableListAdapter
        /* renamed from: c */
        public l getGroup(int i4) {
            List<l> list = this.f30471a;
            if (list == null || i4 >= list.size()) {
                return null;
            }
            return this.f30471a.get(i4);
        }

        public void d(List<l> list) {
            this.f30471a = list;
        }

        public void e(View view, int i4) {
            if (view == null) {
                return;
            }
            view.setOnClickListener(new a(i4));
        }

        public void g(View view) {
            if (view == null) {
                return;
            }
            view.setOnClickListener(new b());
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getChild(int i4, int i5) {
            if (getGroup(i4) != null) {
                l group = getGroup(i4);
                if (group.getType() == 1) {
                    if (group.a() == null || i5 >= group.a().size()) {
                        return null;
                    }
                    return group.a().get(i5);
                } else if (group.getType() != 2 || group.b() == null || i5 >= group.b().size()) {
                    return null;
                } else {
                    return group.b().get(i5);
                }
            }
            return null;
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i4, int i5) {
            return i5;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[Catch: Exception -> 0x00f5, TryCatch #0 {Exception -> 0x00f5, blocks: (B:5:0x0056, B:8:0x005d, B:11:0x0066, B:13:0x0071, B:18:0x00bb, B:20:0x00cc, B:22:0x00ea, B:21:0x00e3, B:14:0x008f, B:16:0x009a), top: B:27:0x0056 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00e3 A[Catch: Exception -> 0x00f5, TryCatch #0 {Exception -> 0x00f5, blocks: (B:5:0x0056, B:8:0x005d, B:11:0x0066, B:13:0x0071, B:18:0x00bb, B:20:0x00cc, B:22:0x00ea, B:21:0x00e3, B:14:0x008f, B:16:0x009a), top: B:27:0x0056 }] */
        @Override // android.widget.ExpandableListAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.view.View getChildView(int r4, int r5, boolean r6, android.view.View r7, android.view.ViewGroup r8) {
            /*
                r3 = this;
                if (r7 == 0) goto L9
                java.lang.Object r6 = r7.getTag()
                com.join.mgps.activity.ForumMyActivity$j r6 = (com.join.mgps.activity.ForumMyActivity.j) r6
                goto L56
            L9:
                com.join.mgps.activity.ForumMyActivity$j r6 = new com.join.mgps.activity.ForumMyActivity$j
                com.join.mgps.activity.ForumMyActivity r7 = com.join.mgps.activity.ForumMyActivity.this
                r6.<init>()
                android.content.Context r7 = r3.f30472b
                android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
                r8 = 2131494328(0x7f0c05b8, float:1.8612161E38)
                r0 = 0
                android.view.View r7 = r7.inflate(r8, r0)
                r8 = 2131297769(0x7f0905e9, float:1.8213492E38)
                android.view.View r8 = r7.findViewById(r8)
                com.facebook.drawee.view.SimpleDraweeView r8 = (com.facebook.drawee.view.SimpleDraweeView) r8
                r6.f30465a = r8
                r8 = 2131297772(0x7f0905ec, float:1.8213498E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                r6.f30466b = r8
                r8 = 2131297765(0x7f0905e5, float:1.8213484E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                r6.f30467c = r8
                r8 = 2131297210(0x7f0903ba, float:1.8212358E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                r6.f30468d = r8
                r8 = 2131296534(0x7f090116, float:1.8210987E38)
                android.view.View r8 = r7.findViewById(r8)
                r6.f30469e = r8
                r7.setTag(r6)
            L56:
                java.lang.Object r8 = r3.getChild(r4, r5)     // Catch: java.lang.Exception -> Lf5
                if (r8 != 0) goto L5d
                return r7
            L5d:
                com.join.mgps.activity.ForumMyActivity$l r8 = r3.getGroup(r4)     // Catch: java.lang.Exception -> Lf5
                r0 = 0
                java.lang.String r1 = ""
                if (r8 == 0) goto Lb8
                com.join.mgps.activity.ForumMyActivity$l r8 = r3.getGroup(r4)     // Catch: java.lang.Exception -> Lf5
                int r8 = r8.getType()     // Catch: java.lang.Exception -> Lf5
                r2 = 1
                if (r8 != r2) goto L8f
                java.lang.Object r4 = r3.getChild(r4, r5)     // Catch: java.lang.Exception -> Lf5
                com.join.mgps.dto.RecommenGroup r4 = (com.join.mgps.dto.RecommenGroup) r4     // Catch: java.lang.Exception -> Lf5
                java.lang.String r1 = r4.getIcon_src()     // Catch: java.lang.Exception -> Lf5
                java.lang.String r5 = r4.getName()     // Catch: java.lang.Exception -> Lf5
                java.lang.String r8 = r4.getDescription()     // Catch: java.lang.Exception -> Lf5
                int r2 = r4.getToday_posts()     // Catch: java.lang.Exception -> Lf5
                int r4 = r4.getFid()     // Catch: java.lang.Exception -> Lf5
                r3.f(r7, r4)     // Catch: java.lang.Exception -> Lf5
                goto Lbb
            L8f:
                com.join.mgps.activity.ForumMyActivity$l r8 = r3.getGroup(r4)     // Catch: java.lang.Exception -> Lf5
                int r8 = r8.getType()     // Catch: java.lang.Exception -> Lf5
                r2 = 2
                if (r8 != r2) goto Lb8
                java.lang.Object r4 = r3.getChild(r4, r5)     // Catch: java.lang.Exception -> Lf5
                com.join.mgps.dto.RecommendLabelTag r4 = (com.join.mgps.dto.RecommendLabelTag) r4     // Catch: java.lang.Exception -> Lf5
                java.lang.String r1 = r4.getTag_icon()     // Catch: java.lang.Exception -> Lf5
                java.lang.String r5 = r4.getTag_name()     // Catch: java.lang.Exception -> Lf5
                java.lang.String r8 = r4.getDescription()     // Catch: java.lang.Exception -> Lf5
                int r2 = r4.getToday_posts()     // Catch: java.lang.Exception -> Lf5
                int r4 = r4.getTag_id()     // Catch: java.lang.Exception -> Lf5
                r3.i(r7, r4)     // Catch: java.lang.Exception -> Lf5
                goto Lbb
            Lb8:
                r5 = r1
                r8 = r5
                r2 = 0
            Lbb:
                com.facebook.drawee.view.SimpleDraweeView r4 = r6.f30465a     // Catch: java.lang.Exception -> Lf5
                com.join.android.app.common.utils.MyImageLoader.h(r4, r1)     // Catch: java.lang.Exception -> Lf5
                android.widget.TextView r4 = r6.f30466b     // Catch: java.lang.Exception -> Lf5
                r4.setText(r5)     // Catch: java.lang.Exception -> Lf5
                android.widget.TextView r4 = r6.f30467c     // Catch: java.lang.Exception -> Lf5
                r4.setText(r8)     // Catch: java.lang.Exception -> Lf5
                if (r2 <= 0) goto Le3
                android.widget.TextView r4 = r6.f30468d     // Catch: java.lang.Exception -> Lf5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf5
                r5.<init>()     // Catch: java.lang.Exception -> Lf5
                java.lang.String r8 = "今日更新："
                r5.append(r8)     // Catch: java.lang.Exception -> Lf5
                r5.append(r2)     // Catch: java.lang.Exception -> Lf5
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lf5
                r4.setText(r5)     // Catch: java.lang.Exception -> Lf5
                goto Lea
            Le3:
                android.widget.TextView r4 = r6.f30468d     // Catch: java.lang.Exception -> Lf5
                java.lang.String r5 = "今日更新：0"
                r4.setText(r5)     // Catch: java.lang.Exception -> Lf5
            Lea:
                android.widget.TextView r4 = r6.f30468d     // Catch: java.lang.Exception -> Lf5
                r4.setVisibility(r0)     // Catch: java.lang.Exception -> Lf5
                android.widget.TextView r4 = r6.f30467c     // Catch: java.lang.Exception -> Lf5
                r4.setVisibility(r0)     // Catch: java.lang.Exception -> Lf5
                goto Lf9
            Lf5:
                r4 = move-exception
                r4.printStackTrace()
            Lf9:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumMyActivity.k.getChildView(int, int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i4) {
            if (getGroup(i4) != null) {
                l group = getGroup(i4);
                if (group.getType() == 1) {
                    if (group.a() != null) {
                        return group.a().size();
                    }
                    return 0;
                } else if (group.getType() != 2 || group.b() == null) {
                    return 0;
                } else {
                    return group.b().size();
                }
            }
            return 0;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            List<l> list = this.f30471a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i4) {
            return i4;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i4, boolean z4, View view, ViewGroup viewGroup) {
            m mVar;
            if (view != null) {
                mVar = (m) view.getTag();
            } else {
                mVar = new m();
                view = LayoutInflater.from(this.f30472b).inflate(R.layout.mg_forum_my_item_ex_header, (ViewGroup) null);
                mVar.f30486a = (ImageView) view.findViewById(R.id.icon);
                mVar.f30487b = (TextView) view.findViewById(R.id.title);
                mVar.f30488c = (TextView) view.findViewById(R.id.state);
                mVar.f30489d = view.findViewById(R.id.arrow);
                mVar.f30490e = view.findViewById(R.id.divider);
                mVar.f30491f = view.findViewById(R.id.divider1);
                view.setTag(mVar);
            }
            try {
                if (z4) {
                    mVar.f30488c.setText("收起");
                } else {
                    mVar.f30488c.setText("展开");
                }
                l group = getGroup(i4);
                e(view, i4);
                if (group.getType() == 1) {
                    mVar.f30486a.setImageResource(R.drawable.mg_forum_icon_group);
                    mVar.f30487b.setText("小组");
                    mVar.f30489d.setVisibility(8);
                    mVar.f30491f.setVisibility(8);
                    mVar.f30490e.setVisibility(0);
                    mVar.f30488c.setVisibility(0);
                } else if (group.getType() == 2) {
                    mVar.f30489d.setVisibility(8);
                    mVar.f30486a.setImageResource(R.drawable.mg_forum_icon_tag);
                    mVar.f30487b.setText("话题");
                    mVar.f30491f.setVisibility(8);
                    mVar.f30490e.setVisibility(0);
                    mVar.f30488c.setVisibility(0);
                } else if (group.getType() == 3) {
                    mVar.f30489d.setVisibility(0);
                    mVar.f30486a.setImageResource(R.drawable.mg_forum_icon_post);
                    mVar.f30487b.setText("帖子");
                    mVar.f30491f.setVisibility(8);
                    mVar.f30490e.setVisibility(8);
                    mVar.f30488c.setVisibility(8);
                    g(view);
                } else if (group.getType() == 4) {
                    mVar.f30491f.setVisibility(0);
                    mVar.f30490e.setVisibility(8);
                    mVar.f30488c.setVisibility(8);
                    mVar.f30489d.setVisibility(0);
                    mVar.f30486a.setImageResource(R.drawable.mg_forum_icon_comment);
                    mVar.f30487b.setText("评论");
                    h(view);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }

        public void h(View view) {
            if (view == null) {
                return;
            }
            view.setOnClickListener(new c());
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i4, int i5) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l {

        /* renamed from: a  reason: collision with root package name */
        private int f30482a;

        /* renamed from: b  reason: collision with root package name */
        List<RecommenGroup> f30483b;

        /* renamed from: c  reason: collision with root package name */
        List<RecommendLabelTag> f30484c;

        l() {
        }

        public List<RecommenGroup> a() {
            return this.f30483b;
        }

        public List<RecommendLabelTag> b() {
            return this.f30484c;
        }

        public void c(List<RecommenGroup> list) {
            this.f30483b = list;
        }

        public void d(List<RecommendLabelTag> list) {
            this.f30484c = list;
        }

        public void e(int i4) {
            this.f30482a = i4;
        }

        public int getType() {
            return this.f30482a;
        }
    }

    /* loaded from: classes4.dex */
    class m {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f30486a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f30487b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f30488c;

        /* renamed from: d  reason: collision with root package name */
        public View f30489d;

        /* renamed from: e  reason: collision with root package name */
        public View f30490e;

        /* renamed from: f  reason: collision with root package name */
        public View f30491f;

        m() {
        }
    }

    private synchronized void j0() {
        k kVar = this.f30453r;
        if (kVar != null && kVar.b() != null) {
            this.f30453r.b().clear();
        }
        l lVar = new l();
        lVar.e(3);
        this.f30453r.a(lVar);
        l lVar2 = new l();
        lVar2.e(4);
        this.f30453r.a(lVar2);
        List<RecommenGroup> list = this.f30446k;
        if (list != null && list.size() != 0) {
            l lVar3 = new l();
            lVar3.e(1);
            lVar3.c(this.f30446k);
            this.f30453r.a(lVar3);
        }
        List<RecommendLabelTag> list2 = this.f30447l;
        if (list2 != null && list2.size() != 0) {
            l lVar4 = new l();
            lVar4.e(2);
            lVar4.d(this.f30447l);
            this.f30453r.a(lVar4);
        }
        this.f30453r.notifyDataSetChanged();
        if (this.f30455t) {
            for (int i4 = 0; i4 < this.f30453r.getGroupCount(); i4++) {
                this.f30442g.expandGroup(i4);
            }
            this.f30455t = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30443h = com.join.mgps.rpc.impl.g.A0();
        this.f30437b.setVisibility(0);
        this.f30437b.setText("我的社区");
        ForumMyHeaderView forumMyHeaderView = this.f30440e;
        if (forumMyHeaderView != null) {
            forumMyHeaderView.setmOnMeasureHeight(this);
            this.f30440e.setHeaderClickListener(this);
        }
        if (this.f30439d != null) {
            this.f30441f.setPtrHandler(new a());
            this.f30439d.setAutoMaxScroll(false);
            this.f30439d.setCanScrollVerticallyDelegate(new b());
            this.f30439d.setOnFlingOverListener(new c());
        }
        this.f30442g.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f30442g.setPullLoadEnable(new d());
        e eVar = new e();
        this.f30452q = eVar;
        this.f30442g.setPullRefreshEnable(eVar);
        k kVar = new k(this);
        this.f30453r = kVar;
        this.f30442g.setAdapter(kVar);
        this.f30442g.setOnGroupClickListener(new f());
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(int i4) {
        if (i4 == 1) {
            this.f30438c.m();
            this.f30438c.j(1);
        } else if (i4 == 2) {
            this.f30438c.m();
            this.f30438c.j(2);
        } else if (i4 == 4) {
            this.f30438c.j(4);
        } else if (i4 == 16) {
            this.f30438c.setFailedMsg("加载失败~");
            ForumLoadingView forumLoadingView = this.f30438c;
            forumLoadingView.setListener(new i(forumLoadingView));
            this.f30438c.j(16);
        } else if (i4 == 9) {
            this.f30438c.j(9);
        } else if (i4 != 10) {
        } else {
            ForumLoadingView forumLoadingView2 = this.f30438c;
            forumLoadingView2.setFailedMsg("没有更多社区内容帖哦~");
            ForumLoadingView forumLoadingView3 = this.f30438c;
            forumLoadingView3.setListener(new h(forumLoadingView3));
            this.f30438c.setReloadingVisibility(0);
            this.f30438c.j(10);
            this.f30438c.setFailedImgVisibility(8);
        }
    }

    boolean g0() {
        if (com.join.android.app.common.utils.j.j(getBaseContext())) {
            return true;
        }
        showMessage(getString(R.string.net_connect_failed));
        f0(9);
        m0();
        return false;
    }

    @Override // com.join.mgps.customview.ForumBaseHeaderView.a
    public void h(int i4) {
        ScrollableLayout scrollableLayout = this.f30439d;
        if (scrollableLayout != null) {
            scrollableLayout.setMaxScrollY(i4);
            ViewGroup.LayoutParams layoutParams = this.f30442g.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = this.f30438c.getMeasuredHeight();
            this.f30442g.setLayoutParams(layoutParams);
            this.f30439d.setAutoMaxScroll(true);
        }
    }

    void h0() {
        i0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r7.f30445j != (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r7.f30445j == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
        r7.f30445j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        m0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0(int r8) {
        /*
            r7 = this;
            boolean r0 = com.join.android.app.common.utils.j.j(r7)
            if (r0 == 0) goto L9b
            r0 = 4
            r1 = 0
            r2 = -1
            int r3 = r7.f30445j     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r3 != r8) goto L15
            if (r3 == r2) goto L11
            r7.f30445j = r1
        L11:
            r7.m0()
            return
        L15:
            r7.f30445j = r8     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            com.join.mgps.Util.AccountUtil_ r3 = com.join.mgps.Util.AccountUtil_.getInstance_(r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.lang.String r3 = r3.getUid()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            com.join.mgps.Util.AccountUtil_ r4 = com.join.mgps.Util.AccountUtil_.getInstance_(r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.lang.String r4 = r4.getToken()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            com.join.mgps.rpc.i r5 = r7.f30443h     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r6 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            com.join.mgps.dto.ForumResponse r3 = r5.E(r3, r4, r8, r6)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r3 == 0) goto L76
            int r4 = r3.getError()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r4 != 0) goto L76
            java.lang.Object r4 = r3.getData()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r4 != 0) goto L4a
            r7.f0(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r8 = r7.f30445j
            if (r8 == r2) goto L46
            r7.f30445j = r1
        L46:
            r7.m0()
            return
        L4a:
            java.lang.Object r4 = r3.getData()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            com.join.mgps.dto.ForumData$MyForumMain r4 = (com.join.mgps.dto.ForumData.MyForumMain) r4     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r7.l0(r4, r8)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.lang.Object r4 = r3.getData()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            com.join.mgps.dto.ForumData$MyForumMain r4 = (com.join.mgps.dto.ForumData.MyForumMain) r4     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.util.List r4 = r4.getTag_follow()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r4 == 0) goto L73
            java.lang.Object r3 = r3.getData()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            com.join.mgps.dto.ForumData$MyForumMain r3 = (com.join.mgps.dto.ForumData.MyForumMain) r3     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.util.List r3 = r3.getTag_follow()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r3 != 0) goto L70
            goto L73
        L70:
            r7.f30444i = r8     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            goto L79
        L73:
            r7.f30445j = r2     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            goto L79
        L76:
            r7.f0(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
        L79:
            int r8 = r7.f30445j
            if (r8 == r2) goto L8d
            goto L8b
        L7e:
            r8 = move-exception
            goto L91
        L80:
            r8 = move-exception
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L7e
            r7.f0(r0)     // Catch: java.lang.Throwable -> L7e
            int r8 = r7.f30445j
            if (r8 == r2) goto L8d
        L8b:
            r7.f30445j = r1
        L8d:
            r7.m0()
            goto Laa
        L91:
            int r0 = r7.f30445j
            if (r0 == r2) goto L97
            r7.f30445j = r1
        L97:
            r7.m0()
            throw r8
        L9b:
            r8 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r8 = r7.getString(r8)
            r7.showMessage(r8)
            r8 = 9
            r7.f0(r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumMyActivity.i0(int):void");
    }

    void k0() {
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(ForumData.MyForumMain myForumMain, int i4) {
        List<RecommenGroup> forum_follow = myForumMain.getForum_follow();
        List<RecommendLabelTag> tag_follow = myForumMain.getTag_follow();
        if (i4 == 1) {
            this.f30446k.clear();
            this.f30447l.clear();
        }
        if (forum_follow != null && forum_follow.size() != 0) {
            this.f30446k.addAll(forum_follow);
        }
        if (tag_follow != null && tag_follow.size() != 0) {
            this.f30447l.addAll(tag_follow);
        }
        if (i4 == 1) {
            this.f30455t = true;
        }
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f30454s.postDelayed(new g(), 100L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        try {
            if (this.f30438c.getLoadingState() == 2 && com.join.mgps.pref.h.n(this).A()) {
                com.join.mgps.pref.h.n(this).o0(false);
                h0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }
}
