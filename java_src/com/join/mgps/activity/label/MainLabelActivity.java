package com.join.mgps.activity.label;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.j0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.activity.label.MainLabelActivity;
import com.join.mgps.activity.posting.PostingActivity;
import com.join.mgps.activity.posting.PostingActivity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.customview.ForumBaseHeaderView;
import com.join.mgps.customview.MainLabelHeaderView;
import com.join.mgps.customview.SlidingTabLayout6;
import com.join.mgps.dto.EmptyMessage;
import com.join.mgps.dto.MainLabelBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.fragment.FragmentPagerFragment;
import com.join.mgps.fragment.LabelFragment;
import com.join.mgps.fragment.LabelFragment_;
import com.join.mgps.rpc.i;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import ru.noties.scrollable.ScrollableLayout;
import ru.noties.scrollable.j;
import ru.noties.scrollable.k;
@EActivity(R.layout.activity_main_label)
/* loaded from: classes4.dex */
public class MainLabelActivity extends BaseAppCompatActivity {
    public static final int N = 1;
    public static final int O = 2;
    private h B;
    int D;
    private MainLabelBean E;
    @ViewById
    ImageView F;
    FragmentManager G;
    LabelFragment_[] H;
    FragmentPagerAdapter J;
    com.join.mgps.fragment.e K;
    @ViewById
    RelativeLayout L;

    /* renamed from: b  reason: collision with root package name */
    i f39057b;
    @Bean

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.Util.b f39058c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f39059d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f39060e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    int f39061f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    String f39062g;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    int f39063h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    int f39064i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    String f39065j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f39066k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f39067l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    SlidingTabLayout6 f39068m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ScrollableLayout f39069n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ViewPager f39070o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    RelativeLayout f39071p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    RelativeLayout f39072q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    RelativeLayout f39073r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    ImageView f39074s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    MainLabelHeaderView f39075t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    SimpleDraweeView f39076u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    TextView f39077v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    TextView f39078w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    TextView f39079x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    LinearLayout f39080y;

    /* renamed from: z  reason: collision with root package name */
    private int f39081z;
    private boolean A = false;
    private String C = "hot";
    List<MainLabelBean.TagType> I = new ArrayList();
    boolean M = false;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainLabelActivity mainLabelActivity = MainLabelActivity.this;
            LabelFragment_ labelFragment_ = mainLabelActivity.H[mainLabelActivity.f39070o.getCurrentItem()];
            boolean f02 = labelFragment_.f0();
            if (f02) {
                MainLabelActivity.this.f39075t.getPostsFilterSwitch().setImageResource(R.drawable.icon_switch_yellow_close);
                labelFragment_.r0("");
            } else {
                MainLabelActivity.this.f39075t.getPostsFilterSwitch().setImageResource(R.drawable.icon_switch_yellow_open);
                labelFragment_.r0(MainLabelActivity.this.f39064i + "");
            }
            labelFragment_.v0(!f02);
        }
    }

    /* loaded from: classes4.dex */
    class b implements ForumBaseHeaderView.a {
        b() {
        }

        @Override // com.join.mgps.customview.ForumBaseHeaderView.a
        public void h(int i4) {
            ScrollableLayout scrollableLayout = MainLabelActivity.this.f39069n;
            if (scrollableLayout != null) {
                scrollableLayout.setMaxScrollY(i4);
                ViewGroup.LayoutParams layoutParams = MainLabelActivity.this.f39070o.getLayoutParams();
                layoutParams.width = -1;
                int measuredHeight = MainLabelActivity.this.f39071p.getMeasuredHeight() - MainLabelActivity.this.f39072q.getMeasuredHeight();
                if (MainLabelActivity.this.L.getVisibility() == 0) {
                    measuredHeight -= MainLabelActivity.this.L.getMeasuredHeight();
                }
                layoutParams.height = measuredHeight;
                MainLabelActivity.this.f39070o.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements ViewPager.OnPageChangeListener {
        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (MainLabelActivity.this.H[i4].f0()) {
                MainLabelActivity.this.f39075t.getPostsFilterSwitch().setImageResource(R.drawable.icon_switch_yellow_open);
            } else {
                MainLabelActivity.this.f39075t.getPostsFilterSwitch().setImageResource(R.drawable.icon_switch_yellow_close);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements ViewPager.OnPageChangeListener {
        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            try {
                MainLabelActivity mainLabelActivity = MainLabelActivity.this;
                FragmentPagerAdapter fragmentPagerAdapter = mainLabelActivity.J;
                Fragment item = fragmentPagerAdapter != null ? fragmentPagerAdapter.getItem(mainLabelActivity.f39081z) : null;
                if (item != null) {
                    item.onPause();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            MainLabelActivity.this.f39081z = i4;
            MainLabelActivity.this.w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements ru.noties.scrollable.b {
        e() {
        }

        @Override // ru.noties.scrollable.b
        public boolean q(int i4) {
            FragmentPagerFragment m02 = MainLabelActivity.this.m0();
            return m02 != null && m02.q(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements j {
        f() {
        }

        @Override // ru.noties.scrollable.j
        public void F(int i4, long j4) {
            FragmentPagerFragment m02 = MainLabelActivity.this.m0();
            if (m02 != null) {
                m02.F(i4, j4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements k {
        g() {
        }

        @Override // ru.noties.scrollable.k
        public void a(int i4, int i5, int i6) {
            try {
                MainLabelActivity.this.l0(i4 >= i6 + (-15));
                MainLabelActivity mainLabelActivity = MainLabelActivity.this;
                ((LabelFragment) mainLabelActivity.J.getItem(mainLabelActivity.f39081z)).X();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private void getData() {
        if (com.join.android.app.common.utils.j.j(this)) {
            A0();
            o0();
            return;
        }
        z0();
    }

    private List<FragmentPagerAdapter.a> s0(List<MainLabelBean.TagType> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new FragmentPagerAdapter.a(list.get(i4).getType_name(), u0(i4)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t0(MainLabelBean mainLabelBean, View view) {
        CommentSelfListActivity_.P0(view.getContext()).a(mainLabelBean.getManager_info().getUid()).start();
    }

    private Fragment u0(int i4) {
        LabelFragment_ labelFragment_ = this.H[i4];
        if (labelFragment_ != null) {
            return labelFragment_;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("tag_id", this.f39061f);
        bundle.putString("tag_name", this.f39062g);
        bundle.putInt("position", i4);
        bundle.putString("fid", "" + this.f39064i);
        bundle.putInt("type", this.I.get(i4).getType_id());
        LabelFragment_ labelFragment_2 = new LabelFragment_();
        labelFragment_2.setArguments(bundle);
        this.H[i4] = labelFragment_2;
        return labelFragment_2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        try {
            this.f39071p.setVisibility(8);
            this.f39060e.setVisibility(0);
            this.f39059d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void B0(String str) {
        this.C = str;
        this.H[this.f39070o.getCurrentItem()].s0(str, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(boolean z4) {
        if (z4) {
            this.f39066k.setText("已关注");
            MainLabelHeaderView mainLabelHeaderView = this.f39075t;
            if (mainLabelHeaderView != null) {
                mainLabelHeaderView.d("已关注");
            }
        } else {
            this.f39066k.setText("关注");
            MainLabelHeaderView mainLabelHeaderView2 = this.f39075t;
            if (mainLabelHeaderView2 != null) {
                mainLabelHeaderView2.d("关注");
            }
        }
        this.A = z4;
        if ((this.D == 1) != z4) {
            com.join.mgps.pref.h.n(this).o0(true);
        } else {
            com.join.mgps.pref.h.n(this).o0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(final MainLabelBean mainLabelBean) {
        if (!com.join.mgps.pref.h.n(this).A() && this.E != null && mainLabelBean.getIs_follow() != mainLabelBean.getIs_follow()) {
            com.join.mgps.pref.h.n(this).o0(true);
        } else {
            this.D = mainLabelBean.getIs_follow();
        }
        this.E = mainLabelBean;
        if (this.f39061f == 0) {
            this.f39061f = mainLabelBean.getTag_id();
        }
        TextView textView = this.f39078w;
        textView.setText(j0.R(mainLabelBean.getPosts()) + "帖子");
        MyImageLoader.j(this.f39076u, mainLabelBean.getManager_info().getAvatar_src(), MyImageLoader.C(this, R.color.white, R.dimen.live_avatar_round_width_first_width, R.dimen.live_avatar_round_stroke_width));
        this.f39077v.setText(mainLabelBean.getManager_info().getNickname());
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.join.mgps.activity.label.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainLabelActivity.t0(MainLabelBean.this, view);
            }
        };
        this.f39076u.setOnClickListener(onClickListener);
        this.f39077v.setOnClickListener(onClickListener);
        this.f39075t.setViewData(mainLabelBean);
        TextView textView2 = this.f39079x;
        textView2.setText("#" + mainLabelBean.getTag_name() + "#");
        if (mainLabelBean.is_allow()) {
            this.f39067l.setVisibility(0);
        } else {
            this.f39067l.setVisibility(8);
        }
        C0(mainLabelBean.getIs_follow() == 1);
        q0(mainLabelBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f39057b = com.join.mgps.rpc.impl.g.A0();
        if (this.f39064i <= 0) {
            this.f39063h = 1;
        }
        this.G = getSupportFragmentManager();
        this.f39075t.setOnClickListener(new a());
        this.f39075t.setFilterVisibility(this.f39063h == 2, this.f39065j);
        this.f39069n.setFriction(0.09f);
        this.f39069n.setAutoMaxScroll(false);
        this.f39075t.setmOnMeasureHeight(new b());
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    int getType() {
        if (this.I.size() <= 1) {
            return this.I.get(0).getType_id();
        }
        return this.I.get(this.f39070o.getCurrentItem()).getType_id();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(int i4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                i iVar = this.f39057b;
                String uid = this.f39058c.getUid();
                ResultResMainBean<EmptyMessage> n02 = iVar.n0(uid, "" + this.f39061f, i4, this.f39062g);
                if (n02.getError() == 0) {
                    boolean z4 = true;
                    showToast(i4 == 1 ? "关注成功!" : "取消关注成功!");
                    if (i4 != 1) {
                        z4 = false;
                    }
                    C0(z4);
                } else {
                    showToast(n02.getData().getMsg());
                }
                return;
            } catch (Exception unused) {
                showToast("网络异常！");
                return;
            }
        }
        showToast("当前网络不可用！");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        if (AccountUtil_.getInstance_(this).isTourist()) {
            y0();
        } else if (this.A) {
            i0(0);
        } else {
            i0(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        if (IntentUtil.getInstance().goLogin(this)) {
            showToast(getString(R.string.forum_user_not_login));
        } else if (this.E != null && this.I.size() > 0) {
            MainLabelBean mainLabelBean = this.E;
            String forum_name = mainLabelBean != null ? mainLabelBean.getForum_name() : "";
            if (TextUtils.isEmpty(this.f39065j)) {
                forum_name = this.f39065j;
            }
            PostingActivity_.v b5 = PostingActivity_.w1(this).e(this.E.getTag_name()).b(100);
            PostingActivity_.v h4 = b5.h(this.f39061f + "");
            h4.i(this.f39062g + "").g(getType()).f(forum_name).a(this.f39064i).startForResult(PostingActivity.f39467p1);
        }
    }

    void l0(boolean z4) {
        if (this.M != z4) {
            this.f39079x.setVisibility(z4 ? 0 : 8);
            this.f39066k.setVisibility(z4 ? 0 : 8);
            this.f39080y.setVisibility(z4 ? 8 : 0);
            this.M = z4;
        }
    }

    FragmentPagerFragment m0() {
        com.join.mgps.fragment.e eVar = this.K;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public int n0() {
        ViewPager viewPager = this.f39070o;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        try {
            ResultResMainBean<MainLabelBean> p4 = this.f39057b.p(this.f39058c.getUid(), this.f39061f, this.f39064i, this.f39062g);
            if (p4.getError() == 0) {
                D0(p4.getData());
                p0();
            } else {
                z0();
            }
        } catch (Exception e5) {
            v0.b("MainLabel", "getMainLabelInfo Exception:" + e5.getMessage());
            z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 17476 && i5 == -1 && com.join.android.app.common.utils.j.j(this)) {
            LabelFragment_[] labelFragment_Arr = this.H;
            if (labelFragment_Arr != null && labelFragment_Arr.length > 0) {
                this.C = "new";
                labelFragment_Arr[this.f39070o.getCurrentItem()].s0(this.C, true);
                return;
            }
            getData();
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LabelFragment labelFragment;
        try {
            FragmentPagerAdapter fragmentPagerAdapter = this.J;
            if (fragmentPagerAdapter != null) {
                int count = fragmentPagerAdapter.getCount();
                int i4 = this.f39081z;
                if (count >= i4 && (labelFragment = (LabelFragment) this.J.getItem(i4)) != null) {
                    if (labelFragment.onBackPressedMy()) {
                        return;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.B;
        if (hVar != null) {
            hVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        this.f39071p.setVisibility(0);
        this.f39060e.setVisibility(8);
        this.f39059d.setVisibility(8);
    }

    void q0(MainLabelBean mainLabelBean) {
        List<MainLabelBean.TagType> tag_type = mainLabelBean.getTag_type();
        this.I.clear();
        this.I.addAll(tag_type);
        int size = this.I.size();
        this.H = new LabelFragment_[size];
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        this.J = fragmentPagerAdapter;
        fragmentPagerAdapter.e(s0(tag_type));
        this.f39070o.setAdapter(this.J);
        this.f39070o.setOffscreenPageLimit(this.J.getCount());
        this.f39070o.addOnPageChangeListener(new c());
        this.f39068m.setViewPager(this.f39070o);
        this.f39068m.setOnPageChangeListener(new d());
        this.f39068m.g();
        this.J.notifyDataSetChanged();
        this.f39069n.setDraggableView(this.f39075t);
        if (size <= 1) {
            this.L.setVisibility(8);
            this.f39069n.removeView(this.L);
        } else {
            this.L.setVisibility(0);
            if (this.J.getCount() <= 4) {
                this.f39068m.setShouldExpand(true);
            } else {
                this.f39068m.setShouldExpand(false);
            }
        }
        this.K = new com.join.mgps.fragment.f(this.f39070o, getSupportFragmentManager());
        this.f39069n.setCanScrollVerticallyDelegate(new e());
        this.f39069n.setOnFlingOverListener(new f());
        this.f39069n.invalidate();
        this.f39069n.w(new g());
    }

    boolean r0() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    public void showSort(View view) {
        h hVar = this.B;
        if (hVar != null && hVar.isShowing()) {
            this.B.dismiss();
        }
        if (this.B == null) {
            this.B = new h(this, -2, -2);
        }
        h hVar2 = this.B;
        if (hVar2 != null && hVar2.getContentView() != null) {
            this.B.getContentView().measure(0, 0);
            this.B.setHeight(this.B.getContentView().getMeasuredHeight());
        }
        this.B.showAsDropDown(view, view.getMeasuredWidth() - getResources().getDimensionPixelOffset(R.dimen.dp15), 0);
        this.B.e(this.C);
        this.B.getContentView().invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (r0()) {
            return;
        }
        l2.a(this).b(str);
    }

    public void v0() {
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void w0() {
        ((LabelFragment) this.J.getItem(this.f39081z)).X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void x0() {
        showSort(this.f39074s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        b0.f0(this).m(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        this.f39071p.setVisibility(8);
        this.f39060e.setVisibility(8);
        this.f39059d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends PopupWindow {

        /* renamed from: a  reason: collision with root package name */
        private Context f39089a;

        /* renamed from: b  reason: collision with root package name */
        String f39090b;

        /* renamed from: c  reason: collision with root package name */
        RadioGroup f39091c;

        /* renamed from: d  reason: collision with root package name */
        RadioButton f39092d;

        /* renamed from: e  reason: collision with root package name */
        RadioButton f39093e;

        /* renamed from: f  reason: collision with root package name */
        RadioButton f39094f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    h.this.dismiss();
                    return true;
                }
                return false;
            }
        }

        public h(Context context) {
            super(context);
            this.f39089a = context;
            c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(RadioGroup radioGroup, int i4) {
            if (i4 == R.id.radioButton_mostReply) {
                MainLabelActivity.this.B0("");
            } else if (i4 == R.id.radioButton_new) {
                MainLabelActivity.this.B0("new");
            } else if (i4 == R.id.radioButton_hot) {
                MainLabelActivity.this.B0("hot");
            }
            dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(String str) {
            this.f39090b = str;
            if (str.equals("new")) {
                this.f39091c.check(R.id.radioButton_new);
            } else if (this.f39090b.equals("hot")) {
                this.f39091c.check(R.id.radioButton_hot);
            } else {
                this.f39091c.check(R.id.radioButton_mostReply);
            }
        }

        private void f() {
            setBackgroundDrawable(new BitmapDrawable());
            setFocusable(true);
            setTouchable(true);
            setOutsideTouchable(true);
            setTouchInterceptor(new a());
        }

        void c() {
            View inflate = LayoutInflater.from(this.f39089a).inflate(R.layout.pop_lable_list_sort, (ViewGroup) null);
            setContentView(inflate);
            setWidth(-2);
            setHeight(-2);
            f();
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.rgSort);
            this.f39091c = radioGroup;
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.join.mgps.activity.label.b
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                    MainLabelActivity.h.this.d(radioGroup2, i4);
                }
            });
        }

        public h(Context context, int i4, int i5) {
            super(i4, i5);
            this.f39089a = context;
            c();
        }
    }
}
