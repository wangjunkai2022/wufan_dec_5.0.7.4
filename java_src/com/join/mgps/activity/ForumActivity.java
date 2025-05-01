package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.BaseAppCompatActivity;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.t2;
import com.join.mgps.activity.posting.PostingActivity;
import com.join.mgps.activity.posting.PostingActivity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.customview.ForumBaseHeaderView;
import com.join.mgps.customview.ForumGroupHeaderView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.SlidingTabLayout4;
import com.join.mgps.customview.WrapContentListView;
import com.join.mgps.customview.d;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.RecommenGroupClassify;
import com.join.mgps.fragment.ForumGroupPostsFragment;
import com.join.mgps.fragment.FragmentPagerFragment;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import ru.noties.scrollable.ScrollableLayout;
@EActivity(R.layout.mg_forum_group_activity)
/* loaded from: classes4.dex */
public class ForumActivity extends BaseAppCompatActivity implements View.OnClickListener, ForumBaseHeaderView.a {
    public static int E = 2;
    WrapContentListView A;
    BaseAdapter B;
    List<ForumData.ForumGroupIndexTab> C = new ArrayList();
    String[] D;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f30325b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f30326c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f30327d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    View f30328e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ForumLoadingView f30329f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ScrollableLayout f30330g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ForumGroupHeaderView f30331h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SlidingTabLayout4 f30332i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ViewPager f30333j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f30334k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    PtrClassicFrameLayout f30335l;

    /* renamed from: m  reason: collision with root package name */
    Button f30336m;

    /* renamed from: n  reason: collision with root package name */
    t2.a f30337n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.i f30338o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    int f30339p;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    String f30340q;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.fragment.e f30341r;

    /* renamed from: s  reason: collision with root package name */
    ForumData.ForumGroupIndex f30342s;

    /* renamed from: t  reason: collision with root package name */
    private List<ForumData.ForumGroupIndexTab> f30343t;

    /* renamed from: u  reason: collision with root package name */
    FragmentPagerAdapter f30344u;

    /* renamed from: v  reason: collision with root package name */
    private int f30345v;

    /* renamed from: w  reason: collision with root package name */
    int f30346w;

    /* renamed from: x  reason: collision with root package name */
    com.join.mgps.customview.d f30347x;

    /* renamed from: y  reason: collision with root package name */
    private int f30348y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.customview.e f30349z;

    /* loaded from: classes4.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            com.join.mgps.customview.e eVar = ForumActivity.this.f30349z;
            if (eVar != null && eVar.isShowing()) {
                ForumActivity.this.f30349z.dismiss();
            }
            if (AccountUtil_.getInstance_(view.getContext()).isTourist()) {
                ForumActivity.this.F0();
            } else if (ForumActivity.this.f30342s != null) {
                PostingActivity_.w1(view.getContext()).g(ForumActivity.this.C.get(i4).getType_id()).f(ForumActivity.this.f30342s.getForum_name()).a(ForumActivity.this.f30339p).startForResult(PostingActivity.f39467p1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.ptr.b {
        b() {
        }

        @Override // com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            ForumActivity.this.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends ForumLoadingView.e {
        c(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumActivity.this.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends ForumLoadingView.e {
        d(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            ForumActivity.this.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends ForumLoadingView.e {
        e(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumActivity.this.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements ViewPager.OnPageChangeListener {
        f() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            com.join.mgps.Util.w0.e("onPageScrolled", "position=" + i4 + "");
            ForumActivity.this.t0();
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            try {
                ForumActivity forumActivity = ForumActivity.this;
                FragmentPagerAdapter fragmentPagerAdapter = forumActivity.f30344u;
                Fragment item = fragmentPagerAdapter != null ? fragmentPagerAdapter.getItem(forumActivity.f30345v) : null;
                if (item != null) {
                    item.onPause();
                    ForumActivity.this.onPause();
                }
                ForumActivity.this.f30344u.getItem(i4).onResume();
                ForumActivity.this.onResume();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            ForumActivity.this.f30345v = i4;
            ForumActivity.this.B0();
            ForumActivity.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements ru.noties.scrollable.b {
        g() {
        }

        @Override // ru.noties.scrollable.b
        public boolean q(int i4) {
            FragmentPagerFragment q02 = ForumActivity.this.q0();
            return q02 != null && q02.q(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements ru.noties.scrollable.j {
        h() {
        }

        @Override // ru.noties.scrollable.j
        public void F(int i4, long j4) {
            FragmentPagerFragment q02 = ForumActivity.this.q0();
            if (q02 != null) {
                q02.F(i4, j4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements ru.noties.scrollable.k {
        i() {
        }

        @Override // ru.noties.scrollable.k
        public void a(int i4, int i5, int i6) {
            try {
                ForumActivity forumActivity = ForumActivity.this;
                ((ForumGroupPostsFragment) forumActivity.f30344u.getItem(forumActivity.f30345v)).a0();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements d.b {
        j() {
        }

        @Override // com.join.mgps.customview.d.b
        public void a(int i4) {
            ForumActivity.E = i4;
            ForumActivity.this.C0();
        }
    }

    private List<FragmentPagerAdapter.a> x0(Context context) {
        List<ForumData.ForumGroupIndexTab> list = this.f30343t;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i4 = 0; i4 < this.f30343t.size(); i4++) {
            ForumData.ForumGroupIndexTab forumGroupIndexTab = this.f30343t.get(i4);
            int type_id = forumGroupIndexTab.getType_id();
            String type_name = forumGroupIndexTab.getType_name();
            RecommenGroupClassify recommenGroupClassify = new RecommenGroupClassify();
            recommenGroupClassify.setGid(type_id);
            recommenGroupClassify.setGname(type_name);
            arrayList.add(new FragmentPagerAdapter.a(type_name, ForumGroupPostsFragment.g0(this.f30339p, this.f30342s.getForum_name(), recommenGroupClassify, i4)));
        }
        return arrayList;
    }

    public void A0(int i4) {
        if ((i4 > 0 && this.f30348y < 0) || (i4 < 0 && this.f30348y > 0)) {
            this.f30337n.g();
            this.f30348y = 0;
        }
        int i5 = this.f30348y + i4;
        this.f30348y = i5;
        if (i5 > this.f30337n.h()) {
            this.f30337n.l(false);
        } else if (this.f30348y < 0) {
            this.f30337n.l(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        ((ForumGroupPostsFragment) this.f30344u.getItem(this.f30345v)).a0();
    }

    void C0() {
        z0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        com.join.mgps.fragment.e eVar = this.f30341r;
        if (eVar == null || !(eVar.a() instanceof ForumGroupPostsFragment)) {
            return;
        }
        ((ForumGroupPostsFragment) this.f30341r.a()).w0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E0() {
        try {
            if (this.f30347x == null) {
                com.join.mgps.customview.d dVar = new com.join.mgps.customview.d(this, -2, -2);
                this.f30347x = dVar;
                dVar.d(new j());
            }
            int applyDimension = (int) TypedValue.applyDimension(1, 126.0f, getResources().getDisplayMetrics());
            com.join.mgps.customview.d dVar2 = this.f30347x;
            if (dVar2 != null && dVar2.getContentView() != null) {
                this.f30347x.getContentView().measure(0, 0);
                applyDimension = this.f30347x.getContentView().getMeasuredWidth();
                this.f30347x.setHeight(this.f30347x.getContentView().getMeasuredHeight());
            }
            this.f30347x.setWidth(applyDimension);
            int measuredWidth = (this.f30334k.getMeasuredWidth() - applyDimension) - getResources().getDimensionPixelOffset(R.dimen.dp17);
            if (!this.f30347x.isShowing()) {
                this.f30347x.showAsDropDown(this.f30334k, measuredWidth, 0);
            }
            this.f30347x.c(E);
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0(ForumData.ForumGroupIndex forumGroupIndex) {
        ForumData.ForumGroupIndex forumGroupIndex2;
        if (forumGroupIndex == null) {
            return;
        }
        if (!com.join.mgps.pref.h.n(this).A() && (forumGroupIndex2 = this.f30342s) != null && forumGroupIndex2.getIs_joined() != forumGroupIndex.getIs_joined()) {
            com.join.mgps.pref.h.n(this).o0(true);
        } else {
            this.f30346w = forumGroupIndex.getIs_joined();
        }
        this.f30342s = forumGroupIndex;
        this.f30331h.setData(forumGroupIndex);
        this.C.clear();
        if (forumGroupIndex.getPost_type() != null && forumGroupIndex.getPost_type().size() != 0) {
            this.C.addAll(forumGroupIndex.getPost_type());
        }
        if (this.f30343t == null) {
            this.f30343t = new ArrayList();
        }
        if (this.f30343t != null && forumGroupIndex.getType() != null && this.f30343t.equals(forumGroupIndex.getType())) {
            D0();
            return;
        }
        this.f30343t = forumGroupIndex.getType();
        v0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void H0() {
        com.join.mgps.Util.j0.C0(this, this.f30339p);
    }

    public void I0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f30335l;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30338o = com.join.mgps.rpc.impl.g.A0();
        u0();
        this.f30325b.setVisibility(0);
        this.f30327d.setVisibility(0);
        this.f30325b.setText("小组主页");
        this.f30337n = new t2.a(this.f30336m);
        this.f30330g.setAutoMaxScroll(false);
        this.f30331h.setmOnMeasureHeight(this);
        this.f30331h.setHeaderClickListener(this);
        this.f30335l.j(true);
        this.f30335l.setPtrHandler(new b());
        n0(1);
        z0();
        this.f30326c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
        if (TextUtils.isEmpty(this.f30340q) || !this.f30340q.equals("discovery")) {
            return;
        }
        ForumIndexActivity_.i0(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    int getType() {
        List<ForumData.ForumGroupIndexTab> list = this.f30343t;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return this.f30343t.get(this.f30333j.getCurrentItem()).getType_id();
    }

    @Override // com.join.mgps.customview.ForumBaseHeaderView.a
    public void h(int i4) {
        ScrollableLayout scrollableLayout = this.f30330g;
        if (scrollableLayout != null) {
            scrollableLayout.setMaxScrollY(i4);
            ViewGroup.LayoutParams layoutParams = this.f30333j.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = this.f30329f.getMeasuredHeight() - this.f30332i.getMeasuredHeight();
            this.f30333j.setLayoutParams(layoutParams);
            this.f30330g.setAutoMaxScroll(true);
        }
    }

    public void k0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f30335l;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        if (this.f30342s != null) {
            PostingActivity_.w1(this).g(getType()).f(this.f30342s.getForum_name()).a(this.f30339p).startForResult(PostingActivity.f39467p1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(boolean z4) {
        ForumGroupHeaderView forumGroupHeaderView = this.f30331h;
        if (forumGroupHeaderView != null) {
            forumGroupHeaderView.setJoinState(z4);
        }
        if ((this.f30346w == 1) != z4) {
            com.join.mgps.pref.h.n(this).o0(true);
        } else {
            com.join.mgps.pref.h.n(this).o0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0(int i4) {
        ForumLoadingView forumLoadingView = this.f30329f;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.j(1);
        } else if (i4 == 2) {
            forumLoadingView.j(2);
            t0();
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView2 = this.f30329f;
            forumLoadingView2.setListener(new e(forumLoadingView2));
            this.f30329f.j(16);
        } else if (i4 == 9) {
            forumLoadingView.setListener(new c(forumLoadingView));
            this.f30329f.j(9);
        } else if (i4 != 10) {
        } else {
            forumLoadingView.setFailedMsg("没有更多内容哦~");
            ForumLoadingView forumLoadingView3 = this.f30329f;
            forumLoadingView3.setListener(new d(forumLoadingView3));
            this.f30329f.setReloadingVisibility(0);
            this.f30329f.j(10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<ForumData.HomepageRecommendLabel> i4 = this.f30338o.i(this.f30339p, AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).getToken());
                if (i4 != null && i4.getData() != null) {
                    if (i4.getError() == 0) {
                        m0(false);
                    }
                    f0(i4.getData().getMsg());
                    return;
                }
                f0(getString(R.string.exit_group_failed));
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        f0(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 17476 && i5 == -1) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(PostingActivity_.M1, -1);
                if (this.f30343t != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= this.f30343t.size()) {
                            break;
                        } else if (intExtra == this.f30343t.get(i6).getType_id()) {
                            this.f30333j.setCurrentItem(i6, true);
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
            D0();
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean g02 = com.join.android.app.component.video.a.g0(this);
        try {
            if (((ForumGroupPostsFragment) this.f30344u.getItem(this.f30345v)).onBackPressedMy()) {
                return;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        super.onBackPressed();
        if (g02 || TextUtils.isEmpty(this.f30340q) || !this.f30340q.equals("discovery")) {
            return;
        }
        ForumIndexActivity_.i0(this).start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.memberLL) {
            IntentUtil.getInstance().goForumGroupMemberActivity(this, this.f30339p);
        } else if (id == R.id.follow) {
            if (this.f30331h.b()) {
                o0();
            } else if (AccountUtil_.getInstance_(this).isTourist()) {
                F0();
            } else {
                y0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        List<ForumData.ForumGroupIndexTab> list = this.C;
        if (list != null && list.size() != 0) {
            this.D = new String[this.C.size()];
            for (int i4 = 0; i4 < this.C.size(); i4++) {
                String[] strArr = this.D;
                strArr[i4] = this.C.get(i4).getType_name() + "帖";
            }
            if (this.f30349z == null) {
                View inflate = LayoutInflater.from(this).inflate(R.layout.forum_activity_forum_post, (ViewGroup) null);
                com.join.mgps.customview.e eVar = new com.join.mgps.customview.e(this);
                this.f30349z = eVar;
                eVar.setWidth(-1);
                this.f30349z.setHeight(-2);
                this.f30349z.setContentView(inflate);
                this.A = (WrapContentListView) this.f30349z.getContentView().findViewById(R.id.wrapListView);
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, (int) R.layout.forum_activity_forum_post_item, (int) R.id.name, this.D);
            this.B = arrayAdapter;
            this.A.setAdapter((ListAdapter) arrayAdapter);
            this.A.setOnItemClickListener(new a());
            int measuredHeight = this.f30349z.getContentView().getMeasuredHeight() * (-1);
            if (measuredHeight == 0) {
                measuredHeight = getResources().getDimensionPixelOffset(R.dimen.wdp112) * (-1) * this.D.length;
            }
            this.f30349z.showAsDropDown(this.f30328e, 0, measuredHeight);
            return;
        }
        com.join.mgps.customview.e eVar2 = this.f30349z;
        if (eVar2 == null || !eVar2.isShowing()) {
            return;
        }
        this.f30349z.dismiss();
    }

    FragmentPagerFragment q0() {
        com.join.mgps.fragment.e eVar = this.f30341r;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public int r0() {
        ViewPager viewPager = this.f30333j;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<ForumData.ForumGroupIndex> u02 = this.f30338o.u0(this.f30339p, AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).getToken());
                if (u02 != null && u02.getError() == 0) {
                    if (u02.getData() == null) {
                        n0(4);
                        return;
                    }
                    G0(u02.getData());
                    n0(2);
                    return;
                }
                n0(4);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                n0(4);
                return;
            }
        }
        f0(getString(R.string.net_connect_failed));
        n0(9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        try {
            if (this.f30336m == null) {
                return;
            }
            List<ForumData.ForumGroupIndexTab> list = this.f30343t;
            if (list != null && list.size() != 0) {
                int i4 = this.f30345v;
                if (i4 >= 0 && i4 < this.f30343t.size()) {
                    if (this.f30343t.get(this.f30345v).getType_id() == 5) {
                        this.f30336m.setVisibility(8);
                        return;
                    } else {
                        this.f30336m.setVisibility(0);
                        return;
                    }
                }
                this.f30336m.setVisibility(0);
                return;
            }
            this.f30336m.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void u0() {
        ForumBean forumBean;
        try {
            String str = (String) getIntent().getSerializableExtra("key_forum_bean");
            if (TextUtils.isEmpty(str) || (forumBean = (ForumBean) JsonMapper.getInstance().fromJson(str, ForumBean.class)) == null || forumBean.getFid() == 0) {
                return;
            }
            this.f30339p = forumBean.getFid();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void v0() {
        this.f30332i.setVisibility(0);
        this.f30333j.setVisibility(0);
        this.f30333j.removeAllViews();
        if (this.f30344u == null) {
            this.f30344u = new FragmentPagerAdapter(getSupportFragmentManager());
        }
        this.f30344u.e(x0(this));
        this.f30333j.setAdapter(this.f30344u);
        this.f30333j.setOffscreenPageLimit(this.f30344u.getCount());
        this.f30332i.setViewPager(this.f30333j);
        this.f30332i.g();
        this.f30344u.notifyDataSetChanged();
        if (this.f30344u.getCount() <= 5) {
            this.f30332i.setShouldExpand(true);
        } else {
            this.f30332i.setShouldExpand(false);
        }
        this.f30332i.setOnPageChangeListener(new f());
        this.f30330g.setDraggableView(this.f30331h);
        this.f30341r = new com.join.mgps.fragment.f(this.f30333j, getSupportFragmentManager());
        this.f30330g.setCanScrollVerticallyDelegate(new g());
        this.f30330g.setOnFlingOverListener(new h());
        this.f30330g.w(new i());
    }

    public boolean w0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f30335l;
        if (ptrClassicFrameLayout != null) {
            return ptrClassicFrameLayout.q();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<ForumData.HomepageRecommendLabel> e02 = this.f30338o.e0(this.f30339p, AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).getToken());
                if (e02 != null && e02.getData() != null) {
                    if (e02.getError() == 0) {
                        m0(true);
                    }
                    f0(e02.getData().getMsg());
                    return;
                }
                f0(getString(R.string.join_group_failed));
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        f0(getString(R.string.net_connect_failed));
    }

    void z0() {
        s0();
    }
}
