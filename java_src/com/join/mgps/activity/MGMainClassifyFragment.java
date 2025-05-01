package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.MyRadioGroup;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.SlidingTabLayout;
import com.join.mgps.db.tables.CategoryRecordTable;
import com.join.mgps.dto.CategoryBean;
import com.join.mgps.dto.CategorySimpleBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Where;
import com.papa91.arc.CContext;
import java.util.ArrayList;
import java.util.List;
import m.framework.ui.widget.asyncview.AsyncImageView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EFragment(R.layout.my_game_layout)
/* loaded from: classes4.dex */
public class MGMainClassifyFragment extends Fragment implements com.join.mgps.pref.b {
    public static final String I = "MGMainClassifyFragment";
    @ViewById
    LinearLayout A;
    @ViewById
    ToggleButton B;
    com.join.mgps.rpc.e C;
    @Pref
    PrefDef_ E;
    private com.join.mgps.pref.f F;
    String H;

    /* renamed from: b  reason: collision with root package name */
    private Context f34820b;

    /* renamed from: c  reason: collision with root package name */
    private ClassifyListFragment f34821c;

    /* renamed from: d  reason: collision with root package name */
    private ClassifyListFragment f34822d;

    /* renamed from: e  reason: collision with root package name */
    private ClassifyListFragment f34823e;

    /* renamed from: f  reason: collision with root package name */
    private NavigationAdapter f34824f;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f34837s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f34838t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    LinearLayout f34839u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    MViewpagerV4 f34840v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    SlidingTabLayout f34841w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    ToggleButton f34842x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    TextView f34843y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    TextView f34844z;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<Fragment> f34825g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private List<String> f34826h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private List<CategorySimpleBean> f34827i = null;

    /* renamed from: j  reason: collision with root package name */
    private PopupWindow f34828j = null;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow f34829k = null;

    /* renamed from: l  reason: collision with root package name */
    private String f34830l = "";

    /* renamed from: m  reason: collision with root package name */
    private int f34831m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f34832n = -9211021;

    /* renamed from: o  reason: collision with root package name */
    private int f34833o = -756480;

    /* renamed from: p  reason: collision with root package name */
    private int f34834p = -1644167168;

    /* renamed from: q  reason: collision with root package name */
    final String[] f34835q = {LocalGameActivity.f34225s};

    /* renamed from: r  reason: collision with root package name */
    final String[] f34836r = {""};
    private int D = 14;
    int[] G = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum GameType {
        PLAT_ALL("", LocalGameActivity.f34225s, "筛选", R.drawable.plat_all),
        FEATURED_ONLINE("10001", "精选网游", "网游", R.drawable.online_game),
        LARGE_SINGLE("10002", "大型单机", "单机", R.drawable.stand_alone_game),
        FC("35", "FC小霸王", CContext.SCENE_FC, R.drawable.fc),
        FBA("31", "街机游戏", "街机", R.drawable.jg),
        GBA("33", "GBA游戏", CContext.SCENE_GBA, R.drawable.gba),
        PSP("34", "PSP游戏", CContext.SCENE_PSP, R.drawable.psp),
        PS("53", "PS游戏", "PS", R.drawable.ps),
        SFC("43", "SFC游戏", "SFC", R.drawable.sfc),
        MD("51", "MD游戏", "MD", R.drawable.md),
        WSC("54", "WSC游戏", "WSC", R.drawable.wsc),
        NDS("32", "NDS游戏", "NDS", R.drawable.nds),
        GBC("56", "GBC游戏", "GBC", R.drawable.gbc),
        N64("57", "N64游戏", "N64", R.drawable.n64),
        ONS("58", "ONS游戏", "ONS", R.drawable.ons),
        DC("60", "dc游戏", "DC", R.drawable.dc_icon),
        PS2("167", "PS2游戏", "PS2", R.drawable.ps2_icon),
        N3DS("168", "3DS游戏", "3DS", R.drawable.n3ds_icon);
        
        private String id;
        private int resId;
        private String title;
        private String titleAbbr;

        GameType(String str, String str2, String str3, int i4) {
            this.id = str;
            this.title = str2;
            this.titleAbbr = str3;
            this.resId = i4;
        }

        public String id() {
            return this.id;
        }

        public int resId() {
            return this.resId;
        }

        public String title() {
            return this.title;
        }

        public String titleAbbr() {
            return this.titleAbbr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGMainClassifyFragment.this.f34828j == null || !MGMainClassifyFragment.this.f34828j.isShowing()) {
                return;
            }
            MGMainClassifyFragment.this.f34828j.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                MGMainClassifyFragment.this.r0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                MGMainClassifyFragment.this.s0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RadioButton f34848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34849b;

        d(RadioButton radioButton, String str) {
            this.f34848a = radioButton;
            this.f34849b = str;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                MGMainClassifyFragment.this.f34835q[0] = this.f34848a.getText().toString().trim();
                MGMainClassifyFragment.this.f34836r[0] = this.f34849b;
                this.f34848a.setTextColor(-756480);
                return;
            }
            this.f34848a.setTextColor(-12829636);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGMainClassifyFragment.this.f34829k == null || !MGMainClassifyFragment.this.f34829k.isShowing()) {
                return;
            }
            MGMainClassifyFragment.this.f34829k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements PopupWindow.OnDismissListener {
        f() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            MGMainClassifyFragment.this.f34843y.setVisibility(8);
            MGMainClassifyFragment.this.B.setVisibility(0);
            MGMainClassifyFragment.this.A.setVisibility(0);
            MGMainClassifyFragment.this.f34842x.setVisibility(0);
            MGMainClassifyFragment.this.f34844z.setVisibility(8);
            MGMainClassifyFragment.this.E.isReloadClassify().g(Boolean.FALSE);
            MGMainClassifyFragment.this.F.callbackDownloadCenterVisible(null);
            MGMainClassifyFragment.this.B.setChecked(false);
            MGMainClassifyFragment mGMainClassifyFragment = MGMainClassifyFragment.this;
            if (mGMainClassifyFragment.H.equals(mGMainClassifyFragment.f34835q[0])) {
                return;
            }
            MGMainClassifyFragment mGMainClassifyFragment2 = MGMainClassifyFragment.this;
            mGMainClassifyFragment2.l0(mGMainClassifyFragment2.f34835q[0]);
            MGMainClassifyFragment.this.f34821c.v0(MGMainClassifyFragment.this.f34836r[0]);
            MGMainClassifyFragment.this.n0();
            MGMainClassifyFragment.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Button f34853b;

        g(Button button) {
            this.f34853b = button;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    this.f34853b.setTextColor(MGMainClassifyFragment.this.f34832n);
                    return false;
                } else if (action != 2) {
                    return false;
                } else {
                    this.f34853b.setTextColor(MGMainClassifyFragment.this.f34833o);
                    return false;
                }
            }
            this.f34853b.setTextColor(MGMainClassifyFragment.this.f34833o);
            MGMainClassifyFragment.this.f34828j.dismiss();
            MGMainClassifyFragment.this.f34842x.setText("分类");
            MGMainClassifyFragment.this.f34842x.setTextOn("分类");
            MGMainClassifyFragment.this.f34842x.setTextOff("分类");
            MGMainClassifyFragment.this.f34821c.u0("");
            MGMainClassifyFragment.this.m0("");
            MGMainClassifyFragment.this.j0("");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RadioButton f34855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CategorySimpleBean f34856b;

        h(RadioButton radioButton, CategorySimpleBean categorySimpleBean) {
            this.f34855a = radioButton;
            this.f34856b = categorySimpleBean;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                this.f34855a.setTextColor(MGMainClassifyFragment.this.f34833o);
                if (MGMainClassifyFragment.this.f34828j == null || !MGMainClassifyFragment.this.f34828j.isShowing()) {
                    return;
                }
                MGMainClassifyFragment.this.f34828j.dismiss();
                MGMainClassifyFragment.this.f34842x.setText(this.f34856b.getTitle());
                MGMainClassifyFragment.this.f34842x.setTextOff(this.f34856b.getTitle());
                MGMainClassifyFragment.this.f34842x.setTextOn(this.f34856b.getTitle());
                MGMainClassifyFragment.this.f34821c.u0(this.f34856b.getId());
                MGMainClassifyFragment.this.m0(this.f34856b.getId());
                MGMainClassifyFragment.this.j0(this.f34856b.getId());
                return;
            }
            this.f34855a.setTextColor(MGMainClassifyFragment.this.f34832n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RadioButton f34858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CategorySimpleBean f34859b;

        i(RadioButton radioButton, CategorySimpleBean categorySimpleBean) {
            this.f34858a = radioButton;
            this.f34859b = categorySimpleBean;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                this.f34858a.setTextColor(MGMainClassifyFragment.this.f34833o);
                if (MGMainClassifyFragment.this.f34828j == null || !MGMainClassifyFragment.this.f34828j.isShowing()) {
                    return;
                }
                MGMainClassifyFragment.this.f34828j.dismiss();
                MGMainClassifyFragment.this.f34842x.setText(this.f34859b.getTitle());
                MGMainClassifyFragment.this.f34842x.setTextOff(this.f34859b.getTitle());
                MGMainClassifyFragment.this.f34842x.setTextOn(this.f34859b.getTitle());
                MGMainClassifyFragment.this.f34821c.u0(this.f34859b.getId());
                MGMainClassifyFragment.this.m0(this.f34859b.getId());
                MGMainClassifyFragment.this.j0(this.f34859b.getId());
                return;
            }
            this.f34858a.setTextColor(MGMainClassifyFragment.this.f34832n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RadioButton f34861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CategorySimpleBean f34862b;

        j(RadioButton radioButton, CategorySimpleBean categorySimpleBean) {
            this.f34861a = radioButton;
            this.f34862b = categorySimpleBean;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                this.f34861a.setTextColor(MGMainClassifyFragment.this.f34833o);
                if (MGMainClassifyFragment.this.f34828j == null || !MGMainClassifyFragment.this.f34828j.isShowing()) {
                    return;
                }
                MGMainClassifyFragment.this.f34828j.dismiss();
                MGMainClassifyFragment.this.f34842x.setText(this.f34862b.getTitle());
                MGMainClassifyFragment.this.f34842x.setTextOff(this.f34862b.getTitle());
                MGMainClassifyFragment.this.f34842x.setTextOn(this.f34862b.getTitle());
                MGMainClassifyFragment.this.f34821c.u0(this.f34862b.getId());
                MGMainClassifyFragment.this.m0(this.f34862b.getId());
                MGMainClassifyFragment.this.j0(this.f34862b.getId());
                return;
            }
            this.f34861a.setTextColor(MGMainClassifyFragment.this.f34832n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements PopupWindow.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f34864b;

        public k(LinearLayout linearLayout) {
            this.f34864b = linearLayout;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            this.f34864b.setVisibility(8);
            MGMainClassifyFragment.this.f34842x.setChecked(false);
        }
    }

    private void V() {
        this.E.isReloadClassify().g(Boolean.FALSE);
        this.F.callbackDownloadCenterVisible(null);
        if (this.E.isFirstClickClassify().d().booleanValue() && !isHidden()) {
            this.F.callbackClassifyTipsVisible(null);
        }
        try {
            this.f34826h.add("最热");
            this.f34826h.add("飙升");
            this.f34826h.add("新锐");
            for (int i4 = 0; i4 < this.f34826h.size(); i4++) {
                if (i4 == 0) {
                    ClassifyListFragment i02 = ClassifyListFragment.i0("1", this.f34830l);
                    this.f34821c = i02;
                    this.f34825g.add(i02);
                } else if (i4 == 1) {
                    ClassifyListFragment i03 = ClassifyListFragment.i0("2", this.f34830l);
                    this.f34822d = i03;
                    this.f34825g.add(i03);
                } else if (i4 == 2) {
                    ClassifyListFragment i04 = ClassifyListFragment.i0("3", this.f34830l);
                    this.f34823e = i04;
                    this.f34825g.add(i04);
                }
            }
            if (this.f34840v == null) {
                this.f34840v = (MViewpagerV4) LayoutInflater.from(this.f34820b).inflate(R.layout.my_game_layout, (ViewGroup) null, false).findViewById(R.id.mViewpagerV4);
            }
            this.f34840v.setIntercept(false);
            NavigationAdapter navigationAdapter = new NavigationAdapter(getChildFragmentManager(), this.f34825g, this.f34826h);
            this.f34824f = navigationAdapter;
            navigationAdapter.d(this.f34825g, this.f34826h);
            this.f34824f.notifyDataSetChanged();
            this.f34840v.setAdapter(this.f34824f);
            this.f34840v.setOffscreenPageLimit(3);
            this.f34841w.setCustomTabView(R.layout.classsify_tab_indicator, 16908308);
            int i5 = this.f34831m;
            if (i5 >= 540) {
                this.f34841w.setMarginWidth(i5 / 20);
            } else {
                this.f34841w.setMarginWidth(10);
            }
            this.f34841w.setSelectedIndicatorColors(-882134);
            this.f34841w.setDistributeEvenly(true);
            this.f34841w.setViewPager(this.f34840v);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private List<CategorySimpleBean> d0(CategoryBean categoryBean) {
        if (categoryBean.getMessages().getData() == null || categoryBean.getMessages().getData().size() <= 0) {
            return null;
        }
        return categoryBean.getMessages().getData().get(0).getGame_type();
    }

    public static MGMainClassifyFragment h0(int i4) {
        MGMainClassifyFragment_ mGMainClassifyFragment_ = new MGMainClassifyFragment_();
        Bundle bundle = new Bundle();
        bundle.putInt(I, i4);
        mGMainClassifyFragment_.setArguments(bundle);
        return mGMainClassifyFragment_;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.C = com.join.mgps.rpc.impl.d.P1();
        this.f34820b = getActivity();
        GameType gameType = null;
        this.F.callbackDownloadCenterVisible(null);
        this.f34827i = new ArrayList();
        this.f34831m = ((WindowManager) this.f34820b.getSystemService("window")).getDefaultDisplay().getWidth();
        Bundle arguments = getArguments();
        int i4 = arguments != null ? arguments.getInt(I) : 0;
        this.D = 14;
        if (i4 == 0) {
            this.f34830l = "";
            l0("筛选");
        } else if (i4 == 61) {
            gameType = GameType.PS2;
        } else if (i4 != 62) {
            switch (i4) {
                case 10:
                    gameType = GameType.FBA;
                    break;
                case 11:
                    gameType = GameType.FC;
                    break;
                case 12:
                    gameType = GameType.GBA;
                    break;
                case 13:
                    gameType = GameType.SFC;
                    break;
                case 14:
                    gameType = GameType.PSP;
                    break;
                case 15:
                    gameType = GameType.FEATURED_ONLINE;
                    break;
                case 16:
                    gameType = GameType.MD;
                    break;
                case 17:
                    gameType = GameType.PS;
                    break;
                case 18:
                    gameType = GameType.LARGE_SINGLE;
                    break;
                case 19:
                    gameType = GameType.WSC;
                    break;
                case 20:
                    gameType = GameType.NDS;
                    break;
                case 21:
                    gameType = GameType.GBC;
                    break;
                case 22:
                    gameType = GameType.N64;
                    break;
                case 23:
                    gameType = GameType.ONS;
                    break;
                case 24:
                    gameType = GameType.DC;
                    break;
            }
        } else {
            gameType = GameType.N3DS;
        }
        if (gameType != null) {
            String id = gameType.id();
            String titleAbbr = gameType.titleAbbr();
            this.f34830l = id;
            l0(titleAbbr);
        }
        p0();
        f0();
        this.f34842x.setChecked(false);
        this.f34842x.setOnCheckedChangeListener(new b());
        this.B.setChecked(false);
        this.B.setOnCheckedChangeListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void e0() {
        this.f34843y.setVisibility(8);
        this.B.setVisibility(0);
        PopupWindow popupWindow = this.f34829k;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f34829k.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f0() {
        if (com.join.android.app.common.utils.j.j(this.f34820b)) {
            try {
                List<CategorySimpleBean> d02 = d0(this.C.W0(g0()));
                if (d02 != null) {
                    o0(d02);
                } else {
                    q0();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                q0();
                return;
            }
        }
        q0();
    }

    public CommonRequestBean g0() {
        return RequestBeanUtil.getInstance(this.f34820b).getCategoryRequestBean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        com.papa.sim.statistic.p.l(this.f34820b).u2(Where.classify, AccountUtil_.getInstance_(getActivity()).getUid());
        SearchHintActivity_.G1(this.f34820b).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void j0(String str) {
        this.f34823e.u0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void k0() {
        this.f34823e.v0(this.f34836r[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(String str) {
        GameType[] values = GameType.values();
        int i4 = 0;
        while (true) {
            if (i4 >= values.length) {
                break;
            } else if (str.equals(values[i4].title())) {
                str = values[i4].titleAbbr();
                break;
            } else {
                i4++;
            }
        }
        this.B.setText(str);
        this.B.setTextOn(str);
        this.B.setTextOff(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void m0(String str) {
        this.f34822d.u0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void n0() {
        this.f34822d.v0(this.f34836r[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(List<CategorySimpleBean> list) {
        this.f34838t.setVisibility(8);
        this.f34839u.setVisibility(8);
        this.f34837s.setVisibility(0);
        this.f34827i.clear();
        this.f34827i.addAll(list);
        b2.f.n().a();
        for (int i4 = 0; i4 < list.size(); i4++) {
            CategoryRecordTable categoryRecordTable = new CategoryRecordTable();
            CategorySimpleBean categorySimpleBean = list.get(i4);
            categoryRecordTable.setId(categorySimpleBean.getId());
            categoryRecordTable.setTitle(categorySimpleBean.getTitle());
            categoryRecordTable.setIco_remote(categorySimpleBean.getIco_remote());
            categoryRecordTable.setShow_index(categorySimpleBean.getShow_index());
            categoryRecordTable.setGame_num(categorySimpleBean.getGame_num());
            b2.f.n().k(categoryRecordTable);
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.F = (MGMainActivity) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        try {
            if (!this.E.isFirstClickClassify().d().booleanValue() || this.E.isReloadClassify().d().booleanValue() || this.f34826h.size() <= 0 || isHidden()) {
                return;
            }
            this.F.callbackClassifyTipsVisible(null);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        this.f34838t.setVisibility(0);
        this.f34839u.setVisibility(8);
        this.f34837s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        List<CategoryRecordTable> d5 = b2.f.n().d();
        this.f34827i.clear();
        if (d5 != null) {
            for (int i4 = 0; i4 < d5.size(); i4++) {
                CategoryRecordTable categoryRecordTable = d5.get(i4);
                CategorySimpleBean categorySimpleBean = new CategorySimpleBean();
                categorySimpleBean.setShow_index(categoryRecordTable.getShow_index());
                categorySimpleBean.setId(categoryRecordTable.getId());
                categorySimpleBean.setGame_num(categoryRecordTable.getGame_num());
                categorySimpleBean.setIco_remote(categoryRecordTable.getIco_remote());
                categorySimpleBean.setTitle(categoryRecordTable.getTitle());
                this.f34827i.add(categorySimpleBean);
            }
        }
        List<CategorySimpleBean> list = this.f34827i;
        if (list != null && list.size() > 0) {
            this.f34838t.setVisibility(8);
            this.f34839u.setVisibility(8);
            this.f34837s.setVisibility(0);
            V();
            return;
        }
        this.f34838t.setVisibility(8);
        this.f34839u.setVisibility(0);
        this.f34837s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        boolean z4;
        LinearLayout linearLayout = new LinearLayout(this.f34820b);
        int i4 = -1;
        linearLayout.setLayoutParams(new RadioGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this.f34820b);
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(-1);
        int i5 = -2;
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(this.f34820b);
        linearLayout3.setLayoutParams(new RadioGroup.LayoutParams(-1, -1));
        linearLayout3.setBackgroundColor(this.f34834p);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout3);
        Button button = new Button(this.f34820b);
        button.setText(LocalGameActivity.f34225s);
        button.setTextSize(this.D);
        button.setTextColor(this.f34832n);
        int i6 = this.f34831m;
        if (i6 > 960) {
            layoutParams.setMargins(i6 / 15, i6 / 25, i6 / 15, i6 / 25);
        } else {
            layoutParams.setMargins(i6 / 30, i6 / 25, i6 / 30, i6 / 20);
        }
        button.setGravity(17);
        button.setLayoutParams(layoutParams);
        button.setOnTouchListener(new g(button));
        linearLayout2.addView(button);
        int i7 = 0;
        if (this.f34842x.getText().toString().equals("分类")) {
            button.setBackgroundResource(R.drawable.classify_all_pressed);
            button.setTextColor(this.f34833o);
            z4 = true;
        } else {
            button.setBackgroundResource(R.drawable.classify_all_normal);
            button.setTextColor(this.f34832n);
            z4 = false;
        }
        MyRadioGroup myRadioGroup = new MyRadioGroup(this.f34820b);
        myRadioGroup.setOrientation(1);
        RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(-1, -2);
        myRadioGroup.setLayoutParams(layoutParams2);
        layoutParams2.setMargins(0, 0, 0, this.f34831m / 20);
        int i8 = this.f34831m;
        if (i8 > 960) {
            myRadioGroup.setPadding(i8 / 15, 0, i8 / 15, 0);
        } else {
            myRadioGroup.setPadding(i8 / 30, 0, i8 / 30, 0);
        }
        myRadioGroup.setGravity(17);
        RadioGroup.LayoutParams layoutParams3 = new RadioGroup.LayoutParams(-1, -2, 1.0f);
        if (this.f34831m >= 960) {
            layoutParams3.setMargins(0, 0, 28, 0);
        }
        RadioGroup.LayoutParams layoutParams4 = new RadioGroup.LayoutParams(-1, -2, 1.0f);
        if (this.f34831m >= 960) {
            layoutParams4.setMargins(14, 0, 14, 0);
        }
        RadioGroup.LayoutParams layoutParams5 = new RadioGroup.LayoutParams(-1, -2, 1.0f);
        if (this.f34831m >= 960) {
            layoutParams5.setMargins(28, 0, 0, 0);
        }
        int i9 = 0;
        while (i9 < (this.f34827i.size() + 2) / 3) {
            LinearLayout linearLayout4 = new LinearLayout(this.f34820b);
            linearLayout4.setLayoutParams(new RadioGroup.LayoutParams(i4, i5));
            linearLayout4.setOrientation(i7);
            RadioButton radioButton = new RadioButton(this.f34820b);
            int i10 = i9 * 3;
            if (i10 < this.f34827i.size()) {
                CategorySimpleBean categorySimpleBean = this.f34827i.get(i10);
                radioButton.setButtonDrawable(new ColorDrawable(i7));
                radioButton.setGravity(17);
                radioButton.setTextColor(this.f34832n);
                radioButton.setBackgroundResource(R.drawable.classify_bg_selector);
                if (!z4) {
                    if (categorySimpleBean.getTitle().equals(this.f34842x.getText())) {
                        radioButton.setChecked(true);
                        radioButton.setTextColor(this.f34833o);
                    } else {
                        radioButton.setChecked(false);
                        radioButton.setTextColor(this.f34832n);
                    }
                }
                radioButton.setText(categorySimpleBean.getTitle());
                radioButton.setTextSize(this.D);
                radioButton.setOnCheckedChangeListener(new h(radioButton, categorySimpleBean));
            }
            RadioButton radioButton2 = new RadioButton(this.f34820b);
            radioButton2.setGravity(17);
            radioButton2.setTextColor(this.f34832n);
            radioButton2.setButtonDrawable(new ColorDrawable(0));
            radioButton2.setBackgroundResource(R.drawable.classify_bg_selector);
            radioButton2.setTextSize(this.D);
            int i11 = i10 + 1;
            LinearLayout linearLayout5 = linearLayout3;
            LinearLayout linearLayout6 = linearLayout;
            if (i11 < this.f34827i.size()) {
                radioButton2.setVisibility(0);
                CategorySimpleBean categorySimpleBean2 = this.f34827i.get(i11);
                if (!z4) {
                    if (categorySimpleBean2.getTitle().equals(this.f34842x.getText())) {
                        radioButton2.setChecked(true);
                        radioButton2.setTextColor(this.f34833o);
                    } else {
                        radioButton2.setChecked(false);
                        radioButton2.setTextColor(this.f34832n);
                    }
                }
                radioButton2.setOnCheckedChangeListener(new i(radioButton2, categorySimpleBean2));
                radioButton2.setText(categorySimpleBean2.getTitle());
            } else {
                radioButton2.setVisibility(4);
                radioButton2.setText("");
            }
            RadioButton radioButton3 = new RadioButton(this.f34820b);
            radioButton3.setGravity(17);
            radioButton3.setTextColor(this.f34832n);
            radioButton3.setButtonDrawable(new ColorDrawable(0));
            radioButton3.setBackgroundResource(R.drawable.classify_bg_selector);
            radioButton3.setTextSize(this.D);
            int i12 = i10 + 2;
            if (i12 < this.f34827i.size()) {
                radioButton3.setVisibility(0);
                CategorySimpleBean categorySimpleBean3 = this.f34827i.get(i12);
                if (!z4) {
                    if (categorySimpleBean3.getTitle().equals(this.f34842x.getText())) {
                        radioButton3.setChecked(true);
                        radioButton3.setTextColor(this.f34833o);
                    } else {
                        radioButton3.setChecked(false);
                        radioButton3.setTextColor(this.f34832n);
                    }
                }
                radioButton3.setOnCheckedChangeListener(new j(radioButton3, categorySimpleBean3));
                radioButton3.setText(categorySimpleBean3.getTitle());
            } else {
                radioButton3.setText("");
                radioButton3.setVisibility(4);
            }
            linearLayout4.addView(radioButton, layoutParams3);
            linearLayout4.addView(radioButton2, layoutParams4);
            linearLayout4.addView(radioButton3, layoutParams5);
            linearLayout4.setPadding(0, 0, 0, this.f34831m / 40);
            myRadioGroup.addView(linearLayout4);
            i9++;
            linearLayout3 = linearLayout5;
            linearLayout = linearLayout6;
            i4 = -1;
            i5 = -2;
            i7 = 0;
        }
        LinearLayout linearLayout7 = linearLayout;
        LinearLayout linearLayout8 = linearLayout3;
        if (this.f34827i.size() > 0) {
            linearLayout2.addView(myRadioGroup);
        }
        PopupWindow popupWindow = new PopupWindow(linearLayout7, this.f34831m, -1);
        this.f34828j = popupWindow;
        popupWindow.setFocusable(true);
        this.f34828j.setOutsideTouchable(true);
        this.f34828j.setBackgroundDrawable(new BitmapDrawable());
        this.B.getLocationOnScreen(new int[2]);
        linearLayout7.setVisibility(0);
        this.f34828j.showAsDropDown(this.B);
        linearLayout8.setOnClickListener(new a());
        this.f34828j.setOnDismissListener(new k(linearLayout7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        p0();
        f0();
    }

    void s0() {
        this.B.setVisibility(8);
        this.A.setVisibility(8);
        this.f34842x.setVisibility(8);
        this.f34843y.setVisibility(0);
        this.f34844z.setVisibility(0);
        this.F.callbackDownloadCenterVisible(null);
        this.H = this.B.getText().toString();
        GameType[] values = GameType.values();
        int i4 = 0;
        while (true) {
            if (i4 >= values.length) {
                break;
            } else if (this.H.equals(values[i4].titleAbbr())) {
                this.H = values[i4].title();
                break;
            } else {
                i4++;
            }
        }
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -1);
        ScrollView scrollView = new ScrollView(this.f34820b);
        scrollView.setLayoutParams(layoutParams);
        scrollView.setBackgroundColor(-1);
        RadioGroup radioGroup = new RadioGroup(this.f34820b);
        radioGroup.setOrientation(1);
        radioGroup.setLayoutParams(new RadioGroup.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
        int i5 = 0;
        for (int i6 = 0; i6 < values.length; i6++) {
            String id = values[i6].id();
            String title = values[i6].title();
            int resId = values[i6].resId();
            RadioButton radioButton = new RadioButton(this.f34820b);
            radioButton.setLayoutParams(new RadioGroup.LayoutParams((ViewGroup.MarginLayoutParams) new RadioGroup.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.exclusive_tag_height))));
            radioButton.setText("    " + title);
            radioButton.setTag(id);
            if (this.H.equals(title)) {
                radioButton.setTextColor(-756480);
                i5 = i6;
            } else {
                radioButton.setTextColor(-12829636);
            }
            radioButton.setTextColor(-12829636);
            if (this.f34831m == 480) {
                radioButton.setTextSize(14.0f);
            } else {
                radioButton.setTextSize(16.0f);
            }
            int i7 = this.f34831m;
            radioButton.setPadding(i7 / 20, i7 / 35, i7 / 16, i7 / 35);
            radioButton.setButtonDrawable(new ColorDrawable(AsyncImageView.DEFAULT_TRANSPARENT));
            Drawable drawable = getResources().getDrawable(resId);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            Drawable drawable2 = getResources().getDrawable(R.drawable.classify_choice_selector);
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            radioButton.setCompoundDrawables(drawable, null, drawable2, null);
            radioButton.setCompoundDrawablePadding(10);
            radioButton.setGravity(19);
            radioButton.setOnCheckedChangeListener(new d(radioButton, id));
            radioButton.setOnClickListener(new e());
            radioGroup.addView(radioButton);
            RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(-1, 1);
            View view = new View(this.f34820b);
            view.setBackgroundColor(-1184275);
            view.setLayoutParams(layoutParams2);
            radioGroup.addView(view);
        }
        ((RadioButton) radioGroup.getChildAt(i5 * 2)).setChecked(true);
        scrollView.addView(radioGroup);
        PopupWindow popupWindow = new PopupWindow(scrollView, ((WindowManager) this.f34820b.getSystemService("window")).getDefaultDisplay().getWidth(), -1);
        this.f34829k = popupWindow;
        popupWindow.setFocusable(true);
        this.f34829k.setOutsideTouchable(false);
        this.f34829k.setBackgroundDrawable(new BitmapDrawable());
        this.B.getLocationOnScreen(this.G);
        scrollView.setVisibility(0);
        this.f34829k.showAsDropDown(this.B);
        this.f34829k.setOnDismissListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f34820b);
    }

    @Override // com.join.mgps.pref.b
    public void x(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("GameType");
            String string2 = bundle.getString("RomType");
            if (string == null || string2 == null) {
                return;
            }
            this.f34842x.setText("分类");
            this.f34842x.setTextOn("分类");
            this.f34842x.setTextOff("分类");
            l0("筛选");
            this.f34821c.w0(string, string2);
            this.f34822d.w0(string, string2);
            this.f34823e.w0(string, string2);
        }
    }
}
