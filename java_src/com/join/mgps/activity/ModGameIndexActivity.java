package com.join.mgps.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.BaseAppCompatActivity;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.CloudShareViewModle;
import com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment;
import com.join.kotlin.ui.cloudarchive.ModgameModTabFragment;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathDataV2;
import com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
import com.join.kotlin.ui.cloudarchive.dialog.DownloadArchiveDialog;
import com.join.kotlin.ui.cloudarchive.dialog.ModPromptCallback;
import com.join.kotlin.ui.cloudarchive.dialog.ModPromptDialog;
import com.join.kotlin.ui.cloudarchive.dialog.NoticeArchiveDialog;
import com.join.kotlin.ui.introduction.ModIntroductionFragment;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.m1;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.screenshot.ScreenshotGamedetialBean;
import com.join.mgps.adapter.ModGameRecomendShrinkAdapter;
import com.join.mgps.adapter.ModGameRecommendExpandAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.MyTouchFrameLayout;
import com.join.mgps.dialog.f1;
import com.join.mgps.dialog.l1;
import com.join.mgps.dto.ArchievePathMultiArgs;
import com.join.mgps.dto.ArchievePathMultiBean;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.DetialShowImageSingBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GeneralCfgBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.dto.ModGameRecommendAdBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PdAdCfgBean;
import com.join.mgps.dto.RequestModGameArgs;
import com.join.mgps.dto.RequestModGameRecommendAdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.mod.bean.ModMeta;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.wrapper.UserPrefs;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@WindowFeature({1})
@EActivity(R.layout.activity_mod_game_index)
@Fullscreen
/* loaded from: classes.dex */
public class ModGameIndexActivity extends BaseAppCompatActivity implements View.OnSystemUiVisibilityChangeListener {
    private static com.github.snowdream.android.app.downloader.b U1 = null;
    static b.InterfaceC0290b V1 = null;
    private static Map<String, com.github.snowdream.android.app.downloader.c> W1 = new ConcurrentHashMap(0);
    public static final int X1 = 7;
    @ViewById
    RecyclerView A;
    private long A1;
    @ViewById
    ImageView B;
    private boolean B1;
    @ViewById
    ImageView C;
    private int C1;
    @ViewById
    MyTouchFrameLayout D;
    @ViewById
    MyTouchFrameLayout E;
    @ViewById
    View F;
    @ViewById
    LinearLayout G;
    private com.join.mgps.dialog.l1 G1;
    @ViewById
    TextView H;
    private ModGameArchivePathDataV2 H1;
    @Extra
    String I;
    private CloudShareViewModle I1;
    @Extra
    String J;
    @Extra
    String K;
    private DownloadTask L;
    private DownloadTask M;
    ModGameDetailBean N;
    Dialog N1;
    GamedetialModleFourBean O;
    ModgameModTabFragment O1;
    GamedetialModleFourBean P;
    ModgameCloudListFragment P1;
    private String Q;
    ModIntroductionFragment Q1;
    ExtBean R;
    com.join.mgps.dialog.f1 S;
    Dialog T1;
    @Pref
    PrefDef_ V;
    private ModGameRecomendShrinkAdapter W;
    private ModGameRecommendExpandAdapter X;
    private boolean Z;
    @ViewById(R.id.iv_back)

    /* renamed from: b  reason: collision with root package name */
    ImageView f35159b;
    @ViewById(R.id.tv_game_name)

    /* renamed from: c  reason: collision with root package name */
    TextView f35160c;
    @ViewById(R.id.sdv_image)

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f35161d;
    @ViewById(R.id.ll_mod_start)

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f35162e;
    @ViewById(R.id.ll_stand_start)

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f35163f;
    @ViewById(R.id.iv_mod_play)

    /* renamed from: g  reason: collision with root package name */
    ImageView f35164g;
    @ViewById(R.id.tv_mod_type)

    /* renamed from: h  reason: collision with root package name */
    TextView f35165h;
    @ViewById(R.id.tv_new_version)

    /* renamed from: i  reason: collision with root package name */
    TextView f35166i;
    @ViewById(R.id.tv_stand_type)

    /* renamed from: j  reason: collision with root package name */
    TextView f35167j;
    @ViewById(R.id.tv_stand_new_version)

    /* renamed from: k  reason: collision with root package name */
    TextView f35168k;
    @ViewById(R.id.tv_open_vip)

    /* renamed from: l  reason: collision with root package name */
    SimpleDraweeView f35169l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    ImageView f35170m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f35171n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f35172o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f35173p;

    /* renamed from: p0  reason: collision with root package name */
    private Activity f35174p0;

    /* renamed from: p1  reason: collision with root package name */
    private int f35175p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ConstraintLayout f35176q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f35177r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    SimpleDraweeView f35178s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    ViewPager f35179t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TabLayout f35180u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    View f35181v;

    /* renamed from: v1  reason: collision with root package name */
    private boolean f35182v1;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    View f35183w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    View f35184x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    View f35185y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    RecyclerView f35186z;
    private int T = 0;
    private boolean U = false;
    private ArrayList<CollectionBeanSubBusiness> Y = new ArrayList<>();
    private int D1 = 0;
    private boolean E1 = false;
    private boolean F1 = false;
    private Runnable J1 = new q();
    private Runnable K1 = new r();
    private int L1 = 0;
    private long M1 = 0;
    List<y> R1 = new ArrayList();
    boolean S1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ModGameIndexActivity.this.E.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i4) {
            super(context);
            this.f35190a = i4;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i4) {
            float dimension;
            if (this.f35190a == 1) {
                dimension = ModGameIndexActivity.this.getResources().getDimension(R.dimen.wdp140);
            } else {
                dimension = ModGameIndexActivity.this.getResources().getDimension(R.dimen.wdp85);
            }
            return (int) (super.calculateDyToMakeVisible(view, i4) + dimension);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return super.calculateSpeedPerPixel(displayMetrics) / 10.0f;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements ModPromptCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ModPromptDialog f35192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35193b;

        d(ModPromptDialog modPromptDialog, DownloadTask downloadTask) {
            this.f35192a = modPromptDialog;
            this.f35193b = downloadTask;
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ModPromptCallback
        public void callback1() {
            ModGameIndexActivity.this.P1(this.f35193b);
            this.f35192a.dismiss();
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ModPromptCallback
        public void callback2() {
            ModGameIndexActivity.this.M1();
            this.f35192a.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements l1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35196b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35197c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DomainInfoBean f35198d;

        e(int i4, DownloadTask downloadTask, int i5, DomainInfoBean domainInfoBean) {
            this.f35195a = i4;
            this.f35196b = downloadTask;
            this.f35197c = i5;
            this.f35198d = domainInfoBean;
        }

        @Override // com.join.mgps.dialog.l1.a
        public void a() {
            ModGameIndexActivity.this.G1.dismiss();
            int i4 = this.f35195a;
            if (i4 == 1) {
                ModGameIndexActivity.this.z1(this.f35196b, this.f35197c);
            } else if (i4 == 2) {
                ModGameIndexActivity.this.V0(this.f35196b);
            }
        }

        @Override // com.join.mgps.dialog.l1.a
        public void b() {
            UtilsMy.h4(ModGameIndexActivity.this.f35174p0, this.f35198d.getInfo(), "single_game_start");
            com.papa.sim.statistic.p.l(ModGameIndexActivity.this.f35174p0).O1(Event.pdSingleStartClick, new Ext().setGameId(ModGameIndexActivity.this.I).setIsJoin(this.f35198d.getIs_join()).setTestAbNumber(this.f35198d.getAb_test_number()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements ClickDelDialogListener {
        f() {
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
        public void onClickCancleButn() {
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
        public void onClickOkButn() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements ClickDelDialogListener {
        g() {
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
        public void onClickCancleButn() {
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
        public void onClickOkButn() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements ClickDelDialogListener {
        h() {
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
        public void onClickCancleButn() {
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
        public void onClickOkButn() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements GameRoomActivity.x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f35203a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35204b;

        i(Context context, DownloadTask downloadTask) {
            this.f35203a = context;
            this.f35204b = downloadTask;
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
            com.join.android.app.common.utils.e.l0(this.f35203a);
            APKUtils.a0(this.f35203a, this.f35204b.getPackageName());
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            com.join.android.app.common.utils.e.l0(this.f35203a);
            APKUtils.a0(this.f35203a, this.f35204b.getPackageName());
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements TabLayout.OnTabSelectedListener {
        j() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null || tab.getCustomView() == null) {
                return;
            }
            tab.getCustomView().findViewById(R.id.main).setBackgroundResource(ModGameIndexActivity.this.R1.get(tab.getPosition()).f35228b);
            ((ImageView) tab.getCustomView().findViewById(R.id.icon)).setImageResource(ModGameIndexActivity.this.R1.get(tab.getPosition()).f35230d);
            ((TextView) tab.getCustomView().findViewById(R.id.name)).setTextColor(Color.parseColor(ModGameIndexActivity.this.R1.get(tab.getPosition()).f35231e));
            if (ModGameIndexActivity.this.R1.get(tab.getPosition()).f35232f.equals("MOD")) {
                com.papa.sim.statistic.p.l(ModGameIndexActivity.this).O1(Event.changeCloudItTab, new Ext().setFrom("1").setGameId(ModGameIndexActivity.this.I));
            } else if (ModGameIndexActivity.this.R1.get(tab.getPosition()).f35232f.equals("我的存档")) {
                com.papa.sim.statistic.p.l(ModGameIndexActivity.this).O1(Event.changeCloudItTab, new Ext().setFrom("2"));
            } else if (ModGameIndexActivity.this.R1.get(tab.getPosition()).f35232f.equals(GameMainActivity4.H2)) {
                tab.getCustomView().findViewById(R.id.tvRedPoint).setVisibility(8);
                tab.getCustomView().findViewById(R.id.icon_gif).setVisibility(8);
                tab.getCustomView().findViewById(R.id.icon).setVisibility(0);
                com.papa.sim.statistic.p.l(ModGameIndexActivity.this).q1(Event.singleStartGamePageList, Event.ClickIntroTab, "", new Ext().setFrom("1"), new Data().setGameId(Long.parseLong(ModGameIndexActivity.this.I)));
                com.papa.sim.statistic.p.l(ModGameIndexActivity.this).O1(Event.changeCloudItTab, new Ext().setFrom("2").setGameId(ModGameIndexActivity.this.I));
            } else {
                com.papa.sim.statistic.p.l(ModGameIndexActivity.this).O1(Event.changeCloudItTab, new Ext().setFrom("0").setGameId(ModGameIndexActivity.this.I));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab == null || tab.getCustomView() == null) {
                return;
            }
            tab.getCustomView().findViewById(R.id.main).setBackgroundResource(R.drawable.alph);
            ((ImageView) tab.getCustomView().findViewById(R.id.icon)).setImageResource(ModGameIndexActivity.this.R1.get(tab.getPosition()).f35227a);
            ((TextView) tab.getCustomView().findViewById(R.id.name)).setTextColor(Color.parseColor(ModGameIndexActivity.this.R1.get(tab.getPosition()).f35229c));
            if (ModGameIndexActivity.this.R1.get(tab.getPosition()).f35232f.equals(GameMainActivity4.H2)) {
                tab.getCustomView().findViewById(R.id.icon).setVisibility(8);
                tab.getCustomView().findViewById(R.id.icon_gif).setVisibility(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k implements Observer<CloudShareViewModle.CloudShareEvent> {
        k() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(@Nullable CloudShareViewModle.CloudShareEvent cloudShareEvent) {
            if (cloudShareEvent.getShowdownloadModDialog() == 0 || ModGameIndexActivity.this.L == null) {
                return;
            }
            ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
            modGameIndexActivity.y1(modGameIndexActivity.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l extends com.join.mgps.dialog.f1 {
        l(Context context) {
            super(context);
        }

        @Override // com.join.mgps.dialog.f1, android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (ModGameIndexActivity.this.U) {
                if (ModGameIndexActivity.this.T == 2 && ModGameIndexActivity.this.M != null && ModGameIndexActivity.this.M.getStatus() != 2 && ModGameIndexActivity.this.M.getStatus() != 9 && ModGameIndexActivity.this.M.getStatus() != 42) {
                    ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
                    if (modGameIndexActivity.O != null) {
                        modGameIndexActivity.J1(modGameIndexActivity.M, ModGameIndexActivity.this.O);
                    }
                }
                ModGameIndexActivity modGameIndexActivity2 = ModGameIndexActivity.this;
                modGameIndexActivity2.F1(modGameIndexActivity2.M);
                return;
            }
            if (ModGameIndexActivity.this.T == 2 && ModGameIndexActivity.this.L != null && ModGameIndexActivity.this.L.getStatus() != 2 && ModGameIndexActivity.this.L.getStatus() != 9 && ModGameIndexActivity.this.L.getStatus() != 42) {
                ModGameIndexActivity modGameIndexActivity3 = ModGameIndexActivity.this;
                modGameIndexActivity3.J1(modGameIndexActivity3.L, ModGameIndexActivity.this.P);
            }
            ModGameIndexActivity modGameIndexActivity4 = ModGameIndexActivity.this;
            modGameIndexActivity4.F1(modGameIndexActivity4.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements DialogInterface.OnDismissListener {
        m() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (ModGameIndexActivity.this.U) {
                if (ModGameIndexActivity.this.M != null && ModGameIndexActivity.this.M.getStatus() == 2) {
                    ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
                    modGameIndexActivity.G1(modGameIndexActivity.M);
                    return;
                }
                ModGameIndexActivity modGameIndexActivity2 = ModGameIndexActivity.this;
                modGameIndexActivity2.F1(modGameIndexActivity2.M);
            } else if (ModGameIndexActivity.this.L != null && ModGameIndexActivity.this.L.getStatus() == 2) {
                ModGameIndexActivity modGameIndexActivity3 = ModGameIndexActivity.this;
                modGameIndexActivity3.G1(modGameIndexActivity3.L);
            } else {
                ModGameIndexActivity modGameIndexActivity4 = ModGameIndexActivity.this;
                modGameIndexActivity4.F1(modGameIndexActivity4.L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements f1.a {

        /* loaded from: classes4.dex */
        class a implements GameRoomActivity.x {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.join.mgps.dialog.f1 f35210a;

            a(com.join.mgps.dialog.f1 f1Var) {
                this.f35210a = f1Var;
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onFail(int i4) {
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onSuccess(int i4, int i5) {
                ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
                modGameIndexActivity.J1(modGameIndexActivity.L, ModGameIndexActivity.this.P);
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
                com.join.mgps.dialog.f1 f1Var = this.f35210a;
                if (f1Var == null || !f1Var.isShowing()) {
                    return;
                }
                this.f35210a.dismiss();
            }
        }

        n() {
        }

        @Override // com.join.mgps.dialog.f1.a
        public void a(com.join.mgps.dialog.f1 f1Var) {
            ModGameIndexActivity.this.T = 2;
            ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
            modGameIndexActivity.S.C(modGameIndexActivity.T, ModGameIndexActivity.this.U, ModGameIndexActivity.this.S1);
            if (ModGameIndexActivity.this.U) {
                if (ModGameIndexActivity.this.M.getStatus() != 9 && ModGameIndexActivity.this.M.getStatus() != 42) {
                    ModGameIndexActivity modGameIndexActivity2 = ModGameIndexActivity.this;
                    modGameIndexActivity2.J1(modGameIndexActivity2.M, ModGameIndexActivity.this.O);
                    return;
                }
                ModGameIndexActivity modGameIndexActivity3 = ModGameIndexActivity.this;
                modGameIndexActivity3.O1(modGameIndexActivity3.M, ModGameIndexActivity.this.O);
                return;
            }
            if (ModGameIndexActivity.this.L.getStatus() != 9 && ModGameIndexActivity.this.L.getStatus() != 42) {
                try {
                    String d5 = new PrefDef_(ModGameIndexActivity.this).androidIdNullsKey().d();
                    if (com.join.mgps.Util.g2.i(d5)) {
                        List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                        if (com.join.mgps.Util.g2.i(MApplication.H) && list.contains(MApplication.H)) {
                            if (IntentUtil.getInstance().goLogin(ModGameIndexActivity.this)) {
                                return;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (new PrefDef_(ModGameIndexActivity.this).download_game_switch().d().booleanValue()) {
                    ModGameIndexActivity modGameIndexActivity4 = ModGameIndexActivity.this;
                    UtilsMy.z0(modGameIndexActivity4, 2, modGameIndexActivity4.L.getCrc_link_type_val(), "VIRTUAL_SINGLE", new a(f1Var));
                } else {
                    ModGameIndexActivity modGameIndexActivity5 = ModGameIndexActivity.this;
                    modGameIndexActivity5.J1(modGameIndexActivity5.L, ModGameIndexActivity.this.P);
                }
            } else {
                ModGameIndexActivity modGameIndexActivity6 = ModGameIndexActivity.this;
                modGameIndexActivity6.O1(modGameIndexActivity6.L, ModGameIndexActivity.this.P);
            }
            if (ModGameIndexActivity.this.L == null || ModGameIndexActivity.this.L.getStatus() != 0) {
                return;
            }
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(ModGameIndexActivity.this);
            Event event = Event.modDownloadTip_install;
            Ext gameId = new Ext().setGameId(ModGameIndexActivity.this.I);
            l4.O1(event, gameId.setPosition(f1Var.o() + ""));
        }

        @Override // com.join.mgps.dialog.f1.a
        public void b(com.join.mgps.dialog.f1 f1Var) {
            if (f1Var != null && f1Var.isShowing()) {
                f1Var.dismiss();
            }
            if (ModGameIndexActivity.this.U) {
                if (ModGameIndexActivity.this.M == null || ModGameIndexActivity.this.M.getStatus() != 42) {
                    return;
                }
                ModGameIndexActivity.this.M.setStatus(5);
                ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
                if (modGameIndexActivity.O != null) {
                    modGameIndexActivity.J1(modGameIndexActivity.M, ModGameIndexActivity.this.O);
                    return;
                }
                return;
            }
            if (ModGameIndexActivity.this.L != null && ModGameIndexActivity.this.L.getStatus() == 42) {
                ModGameIndexActivity.this.L.setStatus(5);
                ModGameIndexActivity modGameIndexActivity2 = ModGameIndexActivity.this;
                modGameIndexActivity2.J1(modGameIndexActivity2.L, ModGameIndexActivity.this.P);
            }
            if (ModGameIndexActivity.this.L == null || ModGameIndexActivity.this.L.getStatus() != 0) {
                return;
            }
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(ModGameIndexActivity.this);
            Event event = Event.modDownloadTip_exit;
            Ext gameId = new Ext().setGameId(ModGameIndexActivity.this.I);
            l4.O1(event, gameId.setPosition(f1Var.o() + ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f35212a;

        o(boolean z4) {
            this.f35212a = z4;
        }

        @Override // com.join.mgps.Util.m1.b
        public void a(m1.c cVar) {
            if (cVar.a() == 1) {
                ModGameIndexActivity.this.finish();
                com.join.mgps.Util.m1 c5 = com.join.mgps.Util.m1.c();
                ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
                c5.e(modGameIndexActivity, modGameIndexActivity.R.getFrom_id(), cVar.b());
                com.join.mgps.Util.l2.a(ModGameIndexActivity.this).b("授权成功");
            } else if (this.f35212a) {
                ModGameIndexActivity.this.T1(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p extends s1.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserPrefs f35215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35216c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f35217d;

        p(int i4, UserPrefs userPrefs, int i5, int i6) {
            this.f35214a = i4;
            this.f35215b = userPrefs;
            this.f35216c = i5;
            this.f35217d = i6;
        }

        @Override // s1.c, s1.b
        public void onAdClose() {
            if (this.f35214a == 1) {
                ModGameIndexActivity.this.o1();
            } else {
                ModGameIndexActivity.this.p1();
            }
        }

        @Override // s1.c, s1.b
        public void onAdShow() {
            UserPrefs userPrefs = this.f35215b;
            userPrefs.setAdGamesConfig(this.f35216c + "", this.f35217d);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity.this.r1();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4;
            int i5;
            int i6;
            int i7;
            View findViewByPosition;
            Rect rect;
            View findViewByPosition2;
            Rect rect2;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ModGameIndexActivity.this.A.getLayoutManager();
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) ModGameIndexActivity.this.f35186z.getLayoutManager();
            if (linearLayoutManager != null) {
                i4 = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                i5 = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (linearLayoutManager2 != null) {
                i6 = linearLayoutManager2.findLastCompletelyVisibleItemPosition();
                i7 = linearLayoutManager2.findLastVisibleItemPosition();
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (!ModGameIndexActivity.this.f35182v1) {
                i4 = i6;
            }
            int min = Math.min(i4, ModGameIndexActivity.this.Y.size() - 1);
            if (!ModGameIndexActivity.this.f35182v1) {
                i5 = i7;
            }
            if (Math.min(i5, ModGameIndexActivity.this.Y.size() - 1) == ModGameIndexActivity.this.Y.size() - 1) {
                if (ModGameIndexActivity.this.f35182v1) {
                    if (linearLayoutManager != null && (findViewByPosition2 = linearLayoutManager.findViewByPosition(ModGameIndexActivity.this.Y.size() - 1)) != null) {
                        findViewByPosition2.getLocalVisibleRect(new Rect());
                        if ((rect2.height() * 100.0f) / findViewByPosition2.getMeasuredHeight() > 60.0f) {
                            min = ModGameIndexActivity.this.Y.size() - 1;
                        }
                    }
                } else if (linearLayoutManager2 != null && (findViewByPosition = linearLayoutManager2.findViewByPosition(ModGameIndexActivity.this.Y.size() - 1)) != null) {
                    findViewByPosition.getLocalVisibleRect(new Rect());
                    if ((rect.height() * 100.0f) / findViewByPosition.getMeasuredHeight() > 60.0f) {
                        min = ModGameIndexActivity.this.Y.size() - 1;
                    }
                }
            }
            for (int i8 = 0; i8 <= min; i8++) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) ModGameIndexActivity.this.Y.get(i8);
                if (!collectionBeanSubBusiness.isHasExposure()) {
                    ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
                    modGameIndexActivity.u1(collectionBeanSubBusiness, i8, modGameIndexActivity.f35182v1);
                    collectionBeanSubBusiness.setHasExposure(true);
                    ModGameIndexActivity.this.Y.set(i8, collectionBeanSubBusiness);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s extends RecyclerView.OnScrollListener {
        s() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            ModGameIndexActivity.this.b1();
            if (i4 == 1) {
                ModGameIndexActivity.this.s1(-1);
                ModGameIndexActivity.this.B1 = true;
            }
            if (i4 == 0 && ModGameIndexActivity.this.C1 != 0 && ModGameIndexActivity.this.B1) {
                com.papa.sim.statistic.p.l(ModGameIndexActivity.this.f35174p0).P1(Event.listClickBigPicSlideUPDown, ModGameIndexActivity.this.f35175p1, ModGameIndexActivity.this.d1(), -1, ModGameIndexActivity.this.D1);
                ModGameIndexActivity.this.C1 = 0;
                ModGameIndexActivity.this.B1 = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            if (System.currentTimeMillis() - ModGameIndexActivity.this.A1 < 200) {
                return;
            }
            ModGameIndexActivity.this.b1();
            ModGameIndexActivity.this.A1 = System.currentTimeMillis();
            ModGameIndexActivity.R0(ModGameIndexActivity.this, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t extends RecyclerView.OnScrollListener {
        t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            ModGameIndexActivity.this.b1();
            if (i4 == 1) {
                ModGameIndexActivity.this.B1 = true;
            } else if (i4 == 0 && ModGameIndexActivity.this.C1 != 0 && ModGameIndexActivity.this.B1) {
                com.papa.sim.statistic.p.l(ModGameIndexActivity.this.f35174p0).P1(Event.listClickIconSlideUPDown, ModGameIndexActivity.this.f35175p1, ModGameIndexActivity.this.d1(), -1, ModGameIndexActivity.this.D1);
                ModGameIndexActivity.this.C1 = 0;
                ModGameIndexActivity.this.B1 = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            if (System.currentTimeMillis() - ModGameIndexActivity.this.A1 < 200) {
                return;
            }
            ModGameIndexActivity.this.b1();
            ModGameIndexActivity.this.A1 = System.currentTimeMillis();
            ModGameIndexActivity.R0(ModGameIndexActivity.this, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements GestureDetector.OnGestureListener {
        u() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            return ModGameIndexActivity.this.f1(motionEvent, motionEvent2);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class v implements b.InterfaceC0290b {
        v() {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onError(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onFinish(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFinish onStart - ");
            sb.append(str);
            com.github.snowdream.android.app.downloader.c cVar = (com.github.snowdream.android.app.downloader.c) ModGameIndexActivity.W1.get(str);
            if (cVar != null && com.join.mgps.Util.g2.i(cVar.h())) {
                com.join.android.app.common.utils.e.l0(ModGameIndexActivity.this).w(ModGameIndexActivity.this, cVar.j());
            }
            ModGameIndexActivity.W1.remove(str);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onProgress(String str, int i4, String str2) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStart(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStop(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onWait(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void updateSize(String str, long j4) {
        }
    }

    /* loaded from: classes4.dex */
    class w implements GameRoomActivity.x {
        w() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
            modGameIndexActivity.y1(modGameIndexActivity.L);
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x implements GameRoomActivity.x {
        x() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            ModGameIndexActivity modGameIndexActivity = ModGameIndexActivity.this;
            modGameIndexActivity.y1(modGameIndexActivity.M);
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y {

        /* renamed from: a  reason: collision with root package name */
        public int f35227a;

        /* renamed from: b  reason: collision with root package name */
        public int f35228b;

        /* renamed from: d  reason: collision with root package name */
        public int f35230d;

        /* renamed from: f  reason: collision with root package name */
        public String f35232f;

        /* renamed from: c  reason: collision with root package name */
        public String f35229c = "#C1D0DD";

        /* renamed from: e  reason: collision with root package name */
        public String f35231e = "#FFFFFF";

        y() {
        }
    }

    private void A1(DownloadTask downloadTask) {
        NoticeArchiveDialog noticeArchiveDialog = new NoticeArchiveDialog();
        noticeArchiveDialog.setClickDelDialogListener(new h());
        noticeArchiveDialog.setDialogData(new DialogData("", "由于安卓11以上系统限制，无法同步存档至增强模式，请使用标准模式游玩已保存的游戏存档", "我知道了", "", false));
        noticeArchiveDialog.show(getSupportFragmentManager(), "");
    }

    private void B1(DownloadTask downloadTask, String str) {
        NoticeArchiveDialog noticeArchiveDialog = new NoticeArchiveDialog();
        noticeArchiveDialog.setClickDelDialogListener(new g());
        noticeArchiveDialog.setDialogData(new DialogData("", str, "我知道了", "", false));
        noticeArchiveDialog.show(getSupportFragmentManager(), "");
    }

    private void C1(DownloadTask downloadTask, int i4, int i5) {
        com.join.mgps.dialog.l1 l1Var = this.G1;
        if (l1Var == null || !l1Var.isShowing()) {
            if (!x1()) {
                if (i4 == 1) {
                    z1(downloadTask, i5);
                    return;
                } else if (i4 == 2) {
                    V0(downloadTask);
                    return;
                } else {
                    return;
                }
            }
            DomainInfoBean pd_info = this.N.getPd_info();
            if (this.N == null || pd_info == null) {
                return;
            }
            com.join.mgps.dialog.l1 l1Var2 = new com.join.mgps.dialog.l1(this, pd_info);
            this.G1 = l1Var2;
            l1Var2.t(new e(i4, downloadTask, i5, pd_info));
            this.G1.show();
            com.papa.sim.statistic.p.l(this.f35174p0).O1(Event.pdSingleStartDetails, new Ext().setGameId(this.I).setIsJoin(pd_info.getIs_join()).setTestAbNumber(pd_info.getAb_test_number()));
        }
    }

    private void D1() {
        NoticeArchiveDialog noticeArchiveDialog = new NoticeArchiveDialog();
        noticeArchiveDialog.setClickDelDialogListener(new f());
        noticeArchiveDialog.setDialogData(new DialogData("", "已成功同步存档至增强模式", "我知道了", "", false));
        noticeArchiveDialog.show(getSupportFragmentManager(), "");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I1(com.join.mgps.dto.ModGameDetailBean r17) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ModGameIndexActivity.I1(com.join.mgps.dto.ModGameDetailBean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K1(android.content.Context r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ModGameIndexActivity.K1(android.content.Context, int, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P1(DownloadTask downloadTask) {
        int i4;
        ArchiveData archiveData = this.I1.getArchiveData();
        if (archiveData.getUid() != AccountUtil_.getInstance_(this).getAccountData().getUid() && archiveData.getUid() != 0) {
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(this);
            a5.b("当前正在使用 " + archiveData.getNickname() + " 的存档");
        }
        if (com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())) {
            ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class);
            ModMeta modMeta = new ModMeta();
            modMeta.setPackageName(downloadTask.getPackageName());
            modMeta.setModPath(downloadTask.getResource_path());
            ModGameDetailBean modGameDetailBean = this.N;
            if (modGameDetailBean != null) {
                modMeta.setGoldFingerSwitch(modGameDetailBean.getGold_finger() == null ? "0" : "1");
                modMeta.setArchiveCloudSwitch(this.N.getCloud_archive_local_path() == null ? "0" : "1");
                modMeta.setIntroductionSwitch(this.N.getMod_game_info() != null ? String.valueOf(this.N.getMod_game_info().getBbs_strategy_switch()) : "0");
            } else {
                modMeta.setGoldFingerSwitch("0");
                modMeta.setArchiveCloudSwitch("0");
                modMeta.setIntroductionSwitch("0");
            }
            String str = "";
            if (modInfoBean != null) {
                modMeta.setModVersion(modInfoBean.getVer() + "");
                modMeta.setModCode(modInfoBean.getVer());
            }
            modMeta.setTypeId(UtilsMy.a2(downloadTask));
            modMeta.setGameId(downloadTask.getCrc_link_type_val());
            modMeta.setModType(0);
            modMeta.setAndroidId(com.join.android.app.common.utils.n.n(MApplication.f1497x).e(MApplication.f1497x));
            modMeta.setPlatform("wufun");
            modMeta.setPackage_type("wufun");
            modMeta.setTypeId(UtilsMy.a2(downloadTask));
            try {
                com.join.mgps.va.overmind.d.b0(downloadTask.getPackageName(), downloadTask.getResource_path());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            ModGameDetailBean modGameDetailBean2 = this.N;
            if (modGameDetailBean2 != null && modGameDetailBean2.getMod_game_info() != null) {
                str = JsonMapper.toJsonString(this.N.getMod_game_info().getMod_info());
            }
            com.join.mgps.va.overmind.d.o().V(this, modMeta, 0, str);
            if (APKUtils.G(downloadTask)) {
                i4 = 1;
            } else {
                i4 = APKUtils.L(downloadTask) ? 2 : 0;
            }
            com.papa.sim.statistic.p.l(this).h1(downloadTask.getCrc_link_type_val(), AccountUtil_.getInstance_(this).getUid(), i4, downloadTask.get_from(), downloadTask.get_from_type(), downloadTask.getExt());
            UtilsMy.t4(this, downloadTask.getCrc_link_type_val());
            return true;
        }
        return false;
    }

    static /* synthetic */ int R0(ModGameIndexActivity modGameIndexActivity, int i4) {
        int i5 = modGameIndexActivity.C1 + i4;
        modGameIndexActivity.C1 = i5;
        return i5;
    }

    private void R1() {
        boolean z4;
        DownloadTask downloadTask = this.L;
        if (downloadTask == null) {
            DownloadTask F = p1.f.K().F(this.I);
            if (F != null) {
                z4 = com.join.mgps.va.overmind.d.o().F(F.getPackageName());
            }
            z4 = false;
        } else {
            if (downloadTask.getStatus() == 5) {
                z4 = true;
            }
            z4 = false;
        }
        if (z4) {
            TextView textView = this.f35173p;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.f35177r;
            if (textView2 != null) {
                textView2.setText("已安装");
                this.f35177r.setTextColor(Color.parseColor("#FFDDEBFF"));
                this.f35177r.setVisibility(8);
            }
            SimpleDraweeView simpleDraweeView = this.f35178s;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f35177r;
        if (textView3 != null) {
            textView3.setText("未安装");
            this.f35177r.setTextColor(Color.parseColor("#FF9DC7FF"));
        }
        SimpleDraweeView simpleDraweeView2 = this.f35178s;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setVisibility(0);
        }
    }

    private void U0() {
        if (this.P != null) {
            DownloadTask F = com.join.mgps.Util.g2.i(this.I) ? p1.f.K().F(this.I) : null;
            if (F == null || this.L == null) {
                return;
            }
            try {
                this.L = F;
                if (F.getFileType().equals(Dtype.MOD.name()) && this.L.getStatus() == 5) {
                    if (Boolean.valueOf(com.join.mgps.va.overmind.d.o().F(this.L.getPackageName())).booleanValue()) {
                        DownloadTask F2 = p1.f.K().F(this.L.getCrc_link_type_val());
                        if (F2 != null && ((ModInfoBean) JsonMapper.getInstance().fromJson(F2.getMod_info(), ModInfoBean.class)).getVer() < this.P.getMod_info().getVer() && this.L.getStatus() == 5) {
                            this.L.setStatus(9);
                        }
                        f2.a s4 = com.join.mgps.va.overmind.d.o().s(this.L.getPackageName());
                        if (s4 != null && com.join.mgps.Util.g2.i(this.P.getVer()) && s4.f69002k < Integer.parseInt(this.P.getVer()) && this.L.getStatus() == 5) {
                            if (this.P.getGame_upgrade_state() == 1) {
                                this.L.setStatus(9);
                            } else {
                                this.L.setStatus(42);
                            }
                        }
                    } else {
                        this.L.setStatus(11);
                    }
                    if (this.L.getStatus() != 9 && this.L.getStatus() != 42) {
                        this.f35166i.setVisibility(8);
                        return;
                    }
                    this.f35166i.setVisibility(0);
                    return;
                }
                this.L.setStatus(F.getStatus());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private void U1(com.join.mgps.event.n nVar) {
        DownloadTask F;
        for (int i4 = 0; i4 < this.Y.size(); i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = this.Y.get(i4);
            if (collectionBeanSubBusiness.getMod_info() != null) {
                F = p1.f.K().F(collectionBeanSubBusiness.getDownloadtaskDown().getRef_crc_sign_id());
            } else {
                F = p1.f.K().F(collectionBeanSubBusiness.getDownloadtaskDown().getCrc_link_type_val());
            }
            if (F != null) {
                this.X.notifyItemChanged(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(DownloadTask downloadTask) {
        if (downloadTask.getStatus() != 5 || downloadTask.isOpen() || this.M == null || !com.join.android.app.common.utils.e.l0(this).d(this, this.M.getPackageName()) || this.N.getCloud_archive_local_path() == null) {
            return;
        }
        UtilsMy.t4(this, downloadTask.getCrc_link_type_val());
        if (this.N.getCloud_archive_local_path().getMainArchiveLocalPath().startsWith("/Android/data")) {
            if (Build.VERSION.SDK_INT > 29) {
                A1(downloadTask);
                return;
            }
            if (this.N1 == null) {
                this.N1 = com.join.mgps.Util.b0.f0(this).y(this, "存档拷贝中");
            }
            this.N1.show();
            X0(downloadTask);
        } else if (this.N.getCloud_archive_local_path().getMainArchiveLocalPath().startsWith("/data/data")) {
            A1(downloadTask);
        }
    }

    private void W0() {
        GamedetialModleFourBean gamedetialModleFourBean;
        if (this.O != null) {
            DownloadTask F = this.J != null ? p1.f.K().F(this.J) : null;
            if (F == null && (gamedetialModleFourBean = this.O) != null) {
                DownloadTask downloadtaskDown = gamedetialModleFourBean.getDownloadtaskDown();
                this.M = downloadtaskDown;
                Dtype dtype = Dtype.android;
                downloadtaskDown.setRomType(dtype.name());
                this.M.setFileType(dtype.name());
            }
            if (F == null || this.M == null) {
                return;
            }
            try {
                this.M = F;
                if (F.getFileType().equals(Dtype.android.name()) && this.M.getStatus() == 5) {
                    if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(this).d(this, this.M.getPackageName())).booleanValue()) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this).l(this, this.M.getPackageName());
                        if (com.join.mgps.Util.g2.i(this.O.getVer()) && l4.d() < Integer.parseInt(this.O.getVer()) && this.M.getStatus() == 5) {
                            if (this.O.getGame_upgrade_state() == 1) {
                                this.M.setStatus(9);
                            } else {
                                this.M.setStatus(42);
                            }
                        }
                    } else {
                        this.M.setStatus(11);
                    }
                } else {
                    this.M.setStatus(F.getStatus());
                }
                if (this.M.getStatus() != 9 && this.M.getStatus() != 42) {
                    this.f35168k.setVisibility(8);
                    return;
                }
                this.f35168k.setVisibility(0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(this.K1);
        }
    }

    private void h1() {
        this.f35186z.setLayoutManager(new LinearLayoutManager(this));
        ModGameRecomendShrinkAdapter modGameRecomendShrinkAdapter = new ModGameRecomendShrinkAdapter(this.Y);
        this.W = modGameRecomendShrinkAdapter;
        this.f35186z.setAdapter(modGameRecomendShrinkAdapter);
        this.W.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.activity.u1
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                ModGameIndexActivity.this.i1(baseQuickAdapter, view, i4);
            }
        });
        this.A.setLayoutManager(new LinearLayoutManager(this));
        ModGameRecommendExpandAdapter modGameRecommendExpandAdapter = new ModGameRecommendExpandAdapter(this.Y);
        this.X = modGameRecommendExpandAdapter;
        this.A.setAdapter(modGameRecommendExpandAdapter);
        this.A.setItemAnimator(null);
        this.X.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.activity.t1
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                ModGameIndexActivity.this.j1(baseQuickAdapter, view, i4);
            }
        });
        this.X.setOnItemChildClickListener(new BaseQuickAdapter.h() { // from class: com.join.mgps.activity.s1
            @Override // com.join.mgps.base.BaseQuickAdapter.h
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                ModGameIndexActivity.this.k1(baseQuickAdapter, view, i4);
            }
        });
        this.A.addOnScrollListener(new s());
        this.f35186z.addOnScrollListener(new t());
        GestureDetector gestureDetector = new GestureDetector(this, new u());
        this.E.setDetector(gestureDetector);
        this.D.setDetector(gestureDetector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        w1(1, i4);
        r1();
        com.papa.sim.statistic.p.l(this).P1(Event.listClickIconStatus, this.f35175p1, d1(), 2, this.D1);
        com.papa.sim.statistic.p.l(this.f35174p0).z1(Event.gameClickIconModelClick, this.f35175p1, this.Y.get(i4).getGame_id(), d1(), i4 + 1, this.D1);
        s1(i4);
    }

    private boolean isModMainGame(DownloadTask downloadTask) {
        ModInfoBean modInfoBean = com.join.mgps.Util.g2.i(downloadTask.getMod_info()) ? (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class) : null;
        return modInfoBean == null || downloadTask.getCrc_link_type_val().equals(modInfoBean.getMain_game_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.Y.get(i4);
        if (collectionBeanSubBusiness != null) {
            com.papa.sim.statistic.p.l(this.f35174p0).z1(Event.gameClickBigPicGoDetail, this.f35175p1, collectionBeanSubBusiness.getGame_id(), d1(), i4 + 1, this.D1);
            IntentDateBean intentDataBean = collectionBeanSubBusiness.getIntentDataBean();
            ExtBean extBean = intentDataBean.getExtBean();
            extBean.setFrom("148");
            intentDataBean.setExtBean(extBean);
            collectionBeanSubBusiness.getIntentDataBean().setExtBean(this.R);
            IntentUtil.getInstance().intentActivity(this, intentDataBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        DownloadTask F;
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.Y.get(i4);
        if (collectionBeanSubBusiness.getMod_info() != null) {
            F = p1.f.K().F(collectionBeanSubBusiness.getDownloadtaskDown().getRef_crc_sign_id());
        } else {
            F = p1.f.K().F(collectionBeanSubBusiness.getDownloadtaskDown().getCrc_link_type_val());
        }
        if (F != null) {
            F.set_from(101);
            F.set_from_type(148);
            int status = F.getStatus();
            if (status != 0) {
                if (status == 11) {
                    UtilsMy.a4(F, this.f35174p0);
                    return;
                } else if (status == 13) {
                    com.php25.PDownload.d.l(this.f35174p0, F);
                    return;
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        UtilsMy.T3(this.f35174p0, F);
                        return;
                    }
                    com.php25.PDownload.d.c(F, this.f35174p0);
                    return;
                } else {
                    com.php25.PDownload.d.i(F);
                    com.join.android.app.common.servcie.r.b(this.f35174p0, F, Event.downloadStop);
                    return;
                }
            }
            UtilsMy.Y0(this.f35174p0, collectionBeanSubBusiness);
            com.papa.sim.statistic.p.l(this.f35174p0).z1(Event.gameClickBigModelGet, this.f35175p1, collectionBeanSubBusiness.getGame_id(), d1(), i4 + 1, this.D1);
            return;
        }
        UtilsMy.Y0(this.f35174p0, collectionBeanSubBusiness);
        com.papa.sim.statistic.p.l(this.f35174p0).z1(Event.gameClickBigModelGet, this.f35175p1, collectionBeanSubBusiness.getGame_id(), d1(), i4 + 1, this.D1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit l1(DownloadTask downloadTask) {
        if ((downloadTask.getModInfoBean() != null && downloadTask.getModInfoBean().isIncompatible()) || (downloadTask.getSingleGameModInfoBean() != null && downloadTask.getSingleGameModInfoBean().isIncompatible())) {
            E1(downloadTask);
            return null;
        }
        P1(downloadTask);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(Integer num) {
        this.U = false;
        DownloadTask downloadTask = this.L;
        if (downloadTask == null || downloadTask.getStatus() != 48) {
            z1(this.L, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit n1(DownloadTask downloadTask, PrefDef_ prefDef_) {
        if (com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())) {
            K1(this, 1, prefDef_.mod_enhance_ad_cfg().d());
            return null;
        }
        UtilsMy.a4(downloadTask, this);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        final DownloadTask F;
        long currentTimeMillis = System.currentTimeMillis();
        PrintStream printStream = System.out;
        printStream.println("start111 time:" + currentTimeMillis);
        if (!com.join.mgps.Util.g2.i(this.I) || (F = p1.f.K().F(this.I)) == null) {
            return;
        }
        if (com.join.mgps.va.overmind.d.o().N(F.getPackageName()) && (APKUtils.b(this, F) || APKUtils.g(this, new Function0() { // from class: com.join.mgps.activity.v1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l12;
                l12 = ModGameIndexActivity.this.l1(F);
                return l12;
            }
        }))) {
            return;
        }
        if ((F.getModInfoBean() != null && F.getModInfoBean().isIncompatible()) || (F.getSingleGameModInfoBean() != null && F.getSingleGameModInfoBean().isIncompatible())) {
            E1(F);
        } else {
            P1(F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1() {
        DownloadTask F;
        int i4;
        if (com.join.mgps.Util.g2.i(this.J) && (F = p1.f.K().F(this.J)) != null) {
            if (com.join.android.app.common.utils.e.l0(this).d(this, F.getPackageName())) {
                boolean z4 = false;
                for (TipBean tipBean : F.getTipBeans()) {
                    if ("23".equals(tipBean.getId())) {
                        z4 = true;
                    }
                }
                boolean booleanValue = new PrefDef_(this).launch_game_switch().d().booleanValue();
                if (z4 && booleanValue) {
                    UtilsMy.z0(this, 1, F.getCrc_link_type_val(), "ANDROID_SINGLE", new i(this, F));
                } else {
                    com.join.android.app.common.utils.e.l0(this);
                    APKUtils.a0(this, F.getPackageName());
                }
                if (APKUtils.G(F)) {
                    i4 = 1;
                } else {
                    i4 = APKUtils.L(F) ? 2 : 0;
                }
                com.papa.sim.statistic.p.l(this).h1(F.getCrc_link_type_val(), AccountUtil_.getInstance_(this).getUid(), i4, F.get_from(), F.get_from_type(), F.getExt());
                UtilsMy.t4(this, F.getCrc_link_type_val());
                return;
            } else if (F.getStatus() == 11) {
                UtilsMy.a4(F, this);
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("请连接网络后重试!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        this.B1 = false;
        this.C1 = 0;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.M1 < 500) {
            return;
        }
        this.M1 = currentTimeMillis;
        s1(-1);
        if (this.E.getVisibility() == 0) {
            this.F.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E, "translationX", 0.0f, getResources().getDimension(R.dimen.wdp318));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E, "alpha", 1.0f, 0.5f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.D, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2);
            animatorSet.play(ofFloat3);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new a());
            animatorSet.start();
            this.f35182v1 = false;
            w1(2, -1);
        } else {
            this.E.setVisibility(0);
            this.F.setVisibility(0);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, "translationX", getResources().getDimension(R.dimen.wdp318), 0.0f);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.E, "alpha", 0.8f, 1.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.D, "alpha", 0.5f, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat4);
            animatorSet2.play(ofFloat5);
            animatorSet2.play(ofFloat6);
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new b());
            animatorSet2.start();
            this.f35182v1 = true;
        }
        b1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1(int i4) {
        if (this.L1 >= 0 || i4 >= 0) {
            this.L1 = i4;
            ArrayList<CollectionBeanSubBusiness> arrayList = this.Y;
            if (arrayList == null || arrayList.size() <= i4) {
                return;
            }
            int i5 = 0;
            while (i5 < this.Y.size()) {
                this.Y.get(i5).b(i5 == i4);
                i5++;
            }
            ModGameRecommendExpandAdapter modGameRecommendExpandAdapter = this.X;
            if (modGameRecommendExpandAdapter != null) {
                modGameRecommendExpandAdapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1(CollectionBeanSubBusiness collectionBeanSubBusiness, int i4, boolean z4) {
        com.papa.sim.statistic.p.l(this).z1(z4 ? Event.gameClickBigPicGoWYDetail : Event.gameClickIconModelWYClick, this.f35175p1, collectionBeanSubBusiness.getGame_id(), d1(), i4 + 1, this.D1);
    }

    private void w1(int i4, int i5) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A.getLayoutManager();
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this.f35186z.getLayoutManager();
        if (linearLayoutManager == null || linearLayoutManager2 == null) {
            return;
        }
        int findFirstVisibleItemPosition = i4 == 1 ? linearLayoutManager2.findFirstVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition();
        c cVar = new c(this, i4);
        if (i5 < 0) {
            i5 = findFirstVisibleItemPosition;
        }
        cVar.setTargetPosition(i5);
        if (i4 == 1) {
            linearLayoutManager.startSmoothScroll(cVar);
        } else {
            linearLayoutManager2.startSmoothScroll(cVar);
        }
    }

    private boolean x1() {
        PdAdCfgBean convertStr2Bean = PdAdCfgBean.convertStr2Bean(this.V.pd_ad_config().d());
        if (convertStr2Bean != null && convertStr2Bean.canShowSingleStartUp()) {
            if (convertStr2Bean != null) {
                convertStr2Bean.updateSingleShowTimes();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(DownloadTask downloadTask) {
        z1(downloadTask, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1(DownloadTask downloadTask, int i4) {
        com.join.mgps.dialog.f1 f1Var;
        if (downloadTask != null) {
            int status = downloadTask.getStatus();
            if (status != 0 && status != 27) {
                if (status == 42) {
                    this.T = 1;
                } else if (status != 5 && status != 6) {
                    if (status == 10) {
                        this.T = 3;
                    } else if (status != 11) {
                        this.T = 2;
                    }
                }
                f1Var = this.S;
                if (f1Var != null && f1Var.isShowing()) {
                    this.S.dismiss();
                }
                l lVar = new l(this);
                this.S = lVar;
                lVar.p(this.N.getCloud_archive_local_path());
                this.S.r(downloadTask.getCrc_link_type_val());
                this.S.setOnDismissListener(new m());
                this.S.u(new n());
                this.S.v(i4);
                if (!this.S.isShowing() || isFinishing()) {
                }
                this.S.show();
                this.S.C(this.T, this.U, this.S1);
                return;
            }
            this.T = 0;
            f1Var = this.S;
            if (f1Var != null) {
                this.S.dismiss();
            }
            l lVar2 = new l(this);
            this.S = lVar2;
            lVar2.p(this.N.getCloud_archive_local_path());
            this.S.r(downloadTask.getCrc_link_type_val());
            this.S.setOnDismissListener(new m());
            this.S.u(new n());
            this.S.v(i4);
            if (this.S.isShowing()) {
            }
        }
    }

    void E1(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        ModPromptDialog modPromptDialog = new ModPromptDialog();
        Bundle bundle = new Bundle();
        bundle.putString("gameName", downloadTask.getShowName());
        modPromptDialog.setArguments(bundle);
        modPromptDialog.setListener(new d(modPromptDialog, downloadTask));
        modPromptDialog.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F1(DownloadTask downloadTask) {
        int status;
        if (downloadTask != null) {
            try {
                status = downloadTask.getStatus();
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        } else {
            status = 0;
        }
        if (isModMainGame(downloadTask)) {
            if (downloadTask.getStatus() == 13) {
                this.f35172o.setText(getResources().getText(R.string.mod_unzio_mod));
            }
            if (status != 9 && status != 42) {
                if (status == 11) {
                    this.f35168k.setVisibility(8);
                    this.f35170m.setVisibility(8);
                    this.f35172o.setVisibility(0);
                    this.f35172o.setText("待安装");
                    return;
                } else if (status == 48) {
                    this.f35168k.setVisibility(8);
                    this.f35170m.setVisibility(8);
                    this.f35172o.setVisibility(0);
                    this.f35172o.setText("安装中");
                    return;
                } else if (status == 12) {
                    this.f35168k.setVisibility(8);
                    this.f35170m.setVisibility(8);
                    this.f35172o.setVisibility(0);
                    this.f35172o.setText("解压中");
                    return;
                } else if (status == 13) {
                    this.f35168k.setVisibility(8);
                    this.f35170m.setVisibility(8);
                    this.f35172o.setVisibility(0);
                    this.f35172o.setText("重新解压");
                    return;
                } else {
                    this.f35168k.setVisibility(8);
                    this.f35170m.setVisibility(0);
                    this.f35172o.setVisibility(8);
                    return;
                }
            }
            this.f35168k.setVisibility(0);
            this.f35170m.setVisibility(8);
            this.f35172o.setVisibility(8);
            return;
        }
        this.f35165h.setText(getResources().getText(R.string.mod_download_mod));
        this.f35177r.setVisibility(8);
        this.f35178s.setVisibility(8);
        if (status != 9 && status != 42) {
            if (status == 11) {
                this.f35166i.setVisibility(8);
                this.f35171n.setVisibility(8);
                this.f35173p.setVisibility(0);
                this.f35173p.setText("待安装");
                this.f35176q.setBackgroundResource(R.drawable.bg_mod_start);
                return;
            } else if (status == 48) {
                this.f35166i.setVisibility(8);
                this.f35171n.setVisibility(8);
                this.f35173p.setVisibility(0);
                this.f35173p.setText("安装中");
                this.f35176q.setBackgroundResource(R.drawable.bg_mod_start_n);
                return;
            } else if (status == 12) {
                this.f35166i.setVisibility(8);
                this.f35171n.setVisibility(8);
                this.f35173p.setVisibility(0);
                this.f35173p.setText("解压中");
                this.f35176q.setBackgroundResource(R.drawable.bg_mod_start);
                return;
            } else if (status == 13) {
                this.f35166i.setVisibility(8);
                this.f35171n.setVisibility(8);
                this.f35173p.setVisibility(0);
                this.f35173p.setText("重新解压");
                this.f35176q.setBackgroundResource(R.drawable.bg_mod_start);
                return;
            } else {
                this.f35166i.setVisibility(8);
                this.f35171n.setVisibility(0);
                this.f35173p.setVisibility(8);
                if (downloadTask != null && downloadTask.getStatus() == 5) {
                    this.f35178s.setVisibility(8);
                    this.f35177r.setVisibility(8);
                } else {
                    this.f35178s.setVisibility(0);
                    this.f35177r.setVisibility(0);
                }
                this.f35176q.setBackgroundResource(R.drawable.bg_mod_start);
                return;
            }
        }
        this.f35166i.setVisibility(0);
        this.f35171n.setVisibility(8);
        this.f35173p.setVisibility(8);
        this.f35176q.setBackgroundResource(R.drawable.bg_mod_start);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G1(DownloadTask downloadTask) {
        try {
            if (isModMainGame(downloadTask)) {
                this.f35168k.setVisibility(8);
                this.f35170m.setVisibility(8);
                this.f35172o.setVisibility(0);
                TextView textView = this.f35172o;
                textView.setText(downloadTask.getProgress() + "%");
            } else {
                this.f35166i.setVisibility(8);
                this.f35171n.setVisibility(8);
                this.f35173p.setVisibility(0);
                this.f35177r.setVisibility(8);
                this.f35178s.setVisibility(8);
                TextView textView2 = this.f35173p;
                textView2.setText(downloadTask.getProgress() + "%");
                this.f35165h.setText(getResources().getText(R.string.mod_downloading));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H1() {
        this.E.setVisibility(this.Z ? 0 : 8);
        this.F.setVisibility(this.Z ? 0 : 8);
        this.D.setVisibility(0);
        this.G.setPadding(0, 0, (int) getResources().getDimension(R.dimen.wdp202), 0);
        if (this.Z) {
            this.f35182v1 = true;
            com.papa.sim.statistic.p.l(this).P1(Event.listShowBigPicUPPage, this.f35175p1, d1(), -1, this.D1);
        } else {
            this.f35182v1 = false;
            com.papa.sim.statistic.p.l(this).P1(Event.listShowIconHotList, this.f35175p1, d1(), -1, this.D1);
        }
        b1();
    }

    void J1(final DownloadTask downloadTask, GamedetialModleFourBean gamedetialModleFourBean) {
        if (!com.join.android.app.common.utils.j.j(this)) {
            com.join.mgps.Util.l2.a(this).b("请检查网络！");
            return;
        }
        int i4 = 0;
        if (downloadTask != null) {
            i4 = downloadTask.getStatus();
            downloadTask.set_from(131);
        }
        if (downloadTask != null && UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()) > 0) {
            i4 = 43;
        }
        if (downloadTask != null && (i4 == 2 || i4 == 10)) {
            com.php25.PDownload.d.i(downloadTask);
        } else if (i4 == 13) {
            com.php25.PDownload.d.l(this, downloadTask);
        } else if (i4 == 27 || i4 == 3) {
            com.php25.PDownload.d.c(downloadTask, this);
        } else if (i4 == 13) {
            com.php25.PDownload.d.l(this, downloadTask);
            return;
        } else if (i4 == 5) {
            com.join.mgps.dialog.f1 f1Var = this.S;
            if (f1Var != null && f1Var.isShowing()) {
                this.S.dismiss();
            }
            final PrefDef_ prefDef_ = new PrefDef_(this);
            if (isModMainGame(downloadTask)) {
                if (com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName())) {
                    K1(this, 2, prefDef_.mod_normal_ad_cfg().d());
                } else {
                    UtilsMy.a4(downloadTask, this);
                }
            } else {
                if (com.join.mgps.va.overmind.d.o().N(downloadTask.getPackageName())) {
                    APKUtils.Companion companion = APKUtils.f14829a;
                    if (companion.e(this, downloadTask) || companion.g(this, new Function0() { // from class: com.join.mgps.activity.w1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit n12;
                            n12 = ModGameIndexActivity.this.n1(downloadTask, prefDef_);
                            return n12;
                        }
                    })) {
                        return;
                    }
                }
                if (com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())) {
                    K1(this, 1, prefDef_.mod_enhance_ad_cfg().d());
                } else {
                    UtilsMy.a4(downloadTask, this);
                }
            }
        } else if (11 == i4) {
            com.join.mgps.dialog.f1 f1Var2 = this.S;
            if (f1Var2 != null && f1Var2.isShowing()) {
                this.S.dismiss();
            }
            UtilsMy.a4(downloadTask, this);
        } else if (43 == i4 || 7 == i4 || i4 == 0) {
            if (gamedetialModleFourBean != null) {
                S0(downloadTask);
                if (gamedetialModleFourBean.getGame_detailed() != null && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_detailed().getTpl_two_qq())) {
                    com.join.mgps.Util.b0.f0(this).b0(this, gamedetialModleFourBean.getGame_detailed().getTpl_two_qq_key(), gamedetialModleFourBean.getGame_detailed().getAd_pic_qq(), gamedetialModleFourBean.getGame_detailed().getTpl_two_qq());
                }
                if (UtilsMy.y0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()) > 0) {
                    ExtBean extBean = this.R;
                    if (extBean != null && "checkgame".equals(extBean.getFrom())) {
                        UtilsMy.e4(this, gamedetialModleFourBean.getCrc_sign_id(), this.R.getFrom_id());
                    } else if (!UtilsMy.o1(this, downloadTask)) {
                        if (gamedetialModleFourBean.getDown_status() == 5) {
                            UtilsMy.l1(this, downloadTask);
                        } else {
                            UtilsMy.d4(this, gamedetialModleFourBean.getCrc_sign_id());
                        }
                    }
                } else {
                    UtilsMy.C1(downloadTask, gamedetialModleFourBean);
                    if (!UtilsMy.o1(this, downloadTask)) {
                        if (gamedetialModleFourBean.getDown_status() == 5) {
                            if (APKUtils.G(downloadTask) && downloadTask.getTask_down_type() == 3) {
                                com.php25.PDownload.d.c(downloadTask, this);
                            } else {
                                UtilsMy.l1(this, downloadTask);
                            }
                        } else {
                            com.php25.PDownload.d.c(downloadTask, this);
                        }
                    }
                }
            }
        } else if (48 == i4) {
            com.join.mgps.Util.l2.a(this).b("安装中，请稍后...");
        } else if (gamedetialModleFourBean != null) {
            S0(downloadTask);
            if (gamedetialModleFourBean.getGame_detailed() != null && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_detailed().getTpl_two_qq())) {
                com.join.mgps.Util.b0.f0(this).b0(this, gamedetialModleFourBean.getGame_detailed().getTpl_two_qq_key(), gamedetialModleFourBean.getGame_detailed().getAd_pic_qq(), gamedetialModleFourBean.getGame_detailed().getTpl_two_qq());
            }
            if (UtilsMy.y0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()) > 0) {
                ExtBean extBean2 = this.R;
                if (extBean2 != null && "checkgame".equals(extBean2.getFrom())) {
                    UtilsMy.e4(this, gamedetialModleFourBean.getCrc_sign_id(), this.R.getFrom_id());
                } else if (!UtilsMy.o1(this, downloadTask)) {
                    if (gamedetialModleFourBean.getDown_status() == 5) {
                        UtilsMy.l1(this, downloadTask);
                    } else {
                        UtilsMy.d4(this, gamedetialModleFourBean.getCrc_sign_id());
                    }
                }
            } else {
                UtilsMy.C1(downloadTask, gamedetialModleFourBean);
                if (!UtilsMy.o1(this, downloadTask)) {
                    if (gamedetialModleFourBean.getDown_status() == 5) {
                        if (APKUtils.G(downloadTask) && downloadTask.getTask_down_type() == 3) {
                            com.php25.PDownload.d.c(downloadTask, this);
                        } else {
                            UtilsMy.l1(this, downloadTask);
                        }
                    } else {
                        com.php25.PDownload.d.c(downloadTask, this);
                    }
                }
            }
        }
        Q1(downloadTask, gamedetialModleFourBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_mod_start})
    public void L1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            GamedetialModleFourBean gamedetialModleFourBean = this.P;
            if (gamedetialModleFourBean != null && gamedetialModleFourBean.getMod_info() != null) {
                this.U = false;
                DownloadTask downloadTask = this.L;
                if (downloadTask != null && downloadTask.getStatus() == 48) {
                    com.join.mgps.Util.l2.a(this).b("安装中，请稍后...");
                    return;
                } else if (this.L != null && com.join.mgps.va.overmind.d.o().F(this.L.getPackageName()) && this.L.getStatus() != 0 && this.L.getStatus() != 9 && this.L.getStatus() != 42 && this.L.getStatus() != 2 && this.L.getStatus() != 3) {
                    J1(this.L, this.P);
                    return;
                } else {
                    DownloadTask downloadTask2 = this.L;
                    if (downloadTask2 != null && downloadTask2.getStatus() == 9 && this.L.getStatus() != 2 && this.L.getStatus() != 3) {
                        O1(this.L, this.P);
                        y1(this.L);
                        return;
                    } else if (this.L.getStatus() == 12) {
                        com.join.mgps.Util.l2.a(this).b("解压中，请稍后...");
                        return;
                    } else {
                        try {
                            String d5 = new PrefDef_(this).androidIdNullsKey().d();
                            if (com.join.mgps.Util.g2.i(d5)) {
                                List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                                if (com.join.mgps.Util.g2.i(MApplication.H) && list.contains(MApplication.H)) {
                                    if (IntentUtil.getInstance().goLogin(this)) {
                                        return;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        UtilsMy.z0(this, 2, this.L.getCrc_link_type_val(), "VIRTUAL_SINGLE", new w());
                        return;
                    }
                }
            }
            o1();
            return;
        }
        o1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_stand_start})
    public void M1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            DownloadTask downloadTask = this.M;
            if (downloadTask != null && this.O != null) {
                this.U = true;
                if (downloadTask != null && com.join.android.app.common.utils.e.l0(this).d(this, this.M.getPackageName()) && this.M.getStatus() != 0 && this.M.getStatus() != 9 && this.M.getStatus() != 42 && this.M.getStatus() != 2 && this.M.getStatus() != 3) {
                    J1(this.M, this.O);
                    return;
                } else if (this.M.getStatus() == 9 && this.L.getStatus() != 2 && this.L.getStatus() != 3) {
                    O1(this.M, this.O);
                    y1(this.M);
                    return;
                } else if (this.M.getStatus() == 12) {
                    com.join.mgps.Util.l2.a(this).b("解压中,请稍后!");
                    return;
                } else {
                    try {
                        String d5 = new PrefDef_(this).androidIdNullsKey().d();
                        if (com.join.mgps.Util.g2.i(d5)) {
                            List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                            if (com.join.mgps.Util.g2.i(MApplication.H) && list.contains(MApplication.H)) {
                                if (IntentUtil.getInstance().goLogin(this)) {
                                    return;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (new PrefDef_(this).download_game_switch().d().booleanValue()) {
                        UtilsMy.z0(this, 2, this.M.getCrc_link_type_val(), "VIRTUAL_SINGLE", new x());
                        return;
                    } else {
                        y1(this.M);
                        return;
                    }
                }
            }
            p1();
            return;
        }
        p1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72025s0})
    public void N1(@Receiver.Extra String str) {
        if (TextUtils.isEmpty(str) || !str.equals("modStdDialog")) {
            return;
        }
        M1();
    }

    void O1(DownloadTask downloadTask, GamedetialModleFourBean gamedetialModleFourBean) {
        boolean z4;
        boolean z5;
        ModInfoBean modInfoBean;
        try {
            if (!com.join.android.app.common.utils.j.j(this)) {
                com.join.mgps.Util.l2.a(this).b("无网络连接");
                return;
            }
            if (gamedetialModleFourBean.getGame_detailed() != null && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_detailed().getTpl_two_qq())) {
                com.join.mgps.Util.b0.f0(this).b0(this, gamedetialModleFourBean.getGame_detailed().getTpl_two_qq_key(), gamedetialModleFourBean.getGame_detailed().getAd_pic_qq(), gamedetialModleFourBean.getGame_detailed().getTpl_two_qq());
            }
            int downloadType = downloadTask.getDownloadType();
            if (downloadType != 0 && downloadType != 1) {
                if (downloadType != 2) {
                    return;
                }
                UtilsMy.u4(downloadTask);
                return;
            }
            if (downloadTask.getCrc_link_type_val() != null && !downloadTask.getCrc_link_type_val().equals("")) {
                S0(downloadTask);
                if (isModMainGame(downloadTask)) {
                    z4 = false;
                    z5 = false;
                } else {
                    if (com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())) {
                        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
                        z4 = F != null && ((modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(F.getMod_info(), ModInfoBean.class)) == null || (this.P.getMod_info() != null && modInfoBean.getVer() < this.P.getMod_info().getVer()));
                        f2.a s4 = com.join.mgps.va.overmind.d.o().s(downloadTask.getPackageName());
                        if (s4 != null && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getVer()) && s4.f69002k < Integer.parseInt(gamedetialModleFourBean.getVer()) && (!z4 || gamedetialModleFourBean.getGame_upgrade_state() == 1)) {
                            z5 = true;
                            this.f35166i.setVisibility(8);
                        }
                    } else {
                        z4 = false;
                    }
                    z5 = false;
                    this.f35166i.setVisibility(8);
                }
                com.php25.PDownload.d.b(downloadTask);
                downloadTask.setVer(gamedetialModleFourBean.getVer());
                downloadTask.setVer_name(gamedetialModleFourBean.getVer_name());
                downloadTask.setUrl(gamedetialModleFourBean.getDown_url_remote());
                downloadTask.setCfg_ver(gamedetialModleFourBean.getCfg_ver());
                downloadTask.setCfg_ver_name(gamedetialModleFourBean.getCfg_ver_name());
                downloadTask.setCfg_down_url(gamedetialModleFourBean.getCfg_down_url());
                downloadTask.setPay_game_amount(gamedetialModleFourBean.getPay_tag_info() != null ? gamedetialModleFourBean.getPay_tag_info().getPay_game_amount() : 0);
                downloadTask.setMod_info(JsonMapper.toJsonString(gamedetialModleFourBean.getMod_info()));
                downloadTask.setPath("");
                downloadTask.setGameZipPath("");
                if (z5 && z4) {
                    downloadTask.setTask_down_type(0);
                } else if (z4) {
                    downloadTask.setTask_down_type(1);
                } else if (z5) {
                    downloadTask.setTask_down_type(2);
                } else {
                    downloadTask.setTask_down_type(0);
                }
                p1.f.K().m(downloadTask);
                UtilsMy.L0(downloadTask);
                if (isModMainGame(downloadTask)) {
                    this.f35168k.setVisibility(8);
                }
                if (UtilsMy.y0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()) > 0) {
                    ExtBean extBean = this.R;
                    if (extBean != null && "checkgame".equals(extBean.getFrom())) {
                        UtilsMy.e4(this, gamedetialModleFourBean.getCrc_sign_id(), this.R.getFrom_id());
                        return;
                    } else if (UtilsMy.o1(this, downloadTask)) {
                        return;
                    } else {
                        if (gamedetialModleFourBean.getDown_status() == 5) {
                            UtilsMy.l1(this, downloadTask);
                            return;
                        } else {
                            UtilsMy.d4(this, gamedetialModleFourBean.getCrc_sign_id());
                            return;
                        }
                    }
                }
                UtilsMy.C1(downloadTask, gamedetialModleFourBean);
                if (UtilsMy.o1(this, downloadTask)) {
                    return;
                }
                if (gamedetialModleFourBean.getDown_status() == 5 && (downloadTask.getTask_down_type() == 0 || downloadTask.getTask_down_type() == 2)) {
                    UtilsMy.l1(this, downloadTask);
                } else {
                    com.php25.PDownload.d.c(downloadTask, this);
                }
            }
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q1(DownloadTask downloadTask, GamedetialModleFourBean gamedetialModleFourBean) {
        if (gamedetialModleFourBean == null || downloadTask == null) {
            return;
        }
        boolean isModMainGame = isModMainGame(downloadTask);
        if (gamedetialModleFourBean.getPlugin_num() != null) {
            String plugin_num = gamedetialModleFourBean.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                F1(downloadTask);
                return;
            }
        }
        int status = downloadTask.getStatus();
        if (UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status == 9 || status == 42) {
            F1(downloadTask);
        } else if (status == 12) {
            F1(downloadTask);
        } else if (status == 13) {
            F1(downloadTask);
        } else if (status == 11) {
            F1(downloadTask);
        } else if (status == 5) {
            F1(downloadTask);
            T1(true);
        } else if (status == 2) {
            UtilsMy.x4(downloadTask);
            com.join.mgps.dialog.f1 f1Var = this.S;
            if (f1Var != null && f1Var.isShowing()) {
                this.S.C(2, this.U, this.S1);
                this.S.D(downloadTask);
                return;
            }
            G1(downloadTask);
        } else if (status == 3 || status == 6 || status == 27) {
            F1(downloadTask);
            UtilsMy.x4(downloadTask);
            com.join.mgps.dialog.f1 f1Var2 = this.S;
            if (f1Var2 != null) {
                f1Var2.C(2, this.U, this.S1);
                this.S.D(downloadTask);
            }
        } else if (status == 10) {
            F1(downloadTask);
            com.join.mgps.dialog.f1 f1Var3 = this.S;
            if (f1Var3 != null) {
                f1Var3.C(2, this.U, this.S1);
                this.S.D(downloadTask);
            }
        } else if (status == 1) {
        } else {
            if (status == 43) {
                F1(downloadTask);
                if (UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()) > 0) {
                    if (isModMainGame) {
                        this.f35167j.setText(getResources().getString(R.string.pay_game_amount, gamedetialModleFourBean.getPay_tag_info().getPayGameAmount()));
                    } else {
                        this.f35165h.setText(getResources().getString(R.string.pay_game_amount, gamedetialModleFourBean.getPay_tag_info().getPayGameAmount()));
                    }
                }
                if (gamedetialModleFourBean.getBespeak_switch() == 1 && gamedetialModleFourBean.getDown_status() == 2) {
                    if (gamedetialModleFourBean.getGame_book() == 1) {
                        if (isModMainGame) {
                            this.f35167j.setText("已预约");
                        } else {
                            this.f35165h.setText("已预约");
                        }
                        v1(this.f35167j, gamedetialModleFourBean.getDown_status(), gamedetialModleFourBean.getSize(), UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()), gamedetialModleFourBean.getCrc_sign_id(), isModMainGame);
                        return;
                    } else if (isModMainGame) {
                        this.f35167j.setText("预约");
                        return;
                    } else {
                        this.f35165h.setText("预约");
                        return;
                    }
                }
                int w02 = UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id());
                if (isModMainGame) {
                    v1(this.f35167j, gamedetialModleFourBean.getDown_status(), gamedetialModleFourBean.getSize(), w02, gamedetialModleFourBean.getCrc_sign_id(), isModMainGame);
                } else {
                    v1(this.f35165h, gamedetialModleFourBean.getDown_status(), gamedetialModleFourBean.getSize(), w02, gamedetialModleFourBean.getCrc_sign_id(), isModMainGame);
                }
            } else if (status == 48) {
                F1(downloadTask);
                this.f35166i.setVisibility(8);
            } else if (status == 9) {
            } else {
                F1(downloadTask);
                if (UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id()) > 0) {
                    if (isModMainGame) {
                        this.f35167j.setText(getResources().getString(R.string.pay_game_amount, gamedetialModleFourBean.getPay_tag_info().getPayGameAmount()));
                    } else {
                        this.f35165h.setText(getResources().getString(R.string.pay_game_amount, gamedetialModleFourBean.getPay_tag_info().getPayGameAmount()));
                    }
                } else if (isModMainGame) {
                    this.f35167j.setText(getResources().getString(R.string.download_status_download));
                } else {
                    this.f35165h.setText(getResources().getString(R.string.download_status_download));
                }
                if (gamedetialModleFourBean.getBespeak_switch() == 1 && (gamedetialModleFourBean.getDown_status() == 2 || gamedetialModleFourBean.getDown_status() == 6)) {
                    if (gamedetialModleFourBean.getGame_book() != 1) {
                        if (isModMainGame) {
                            this.f35167j.setText("预约");
                            return;
                        } else {
                            this.f35165h.setText("预约");
                            return;
                        }
                    }
                    if (isModMainGame) {
                        this.f35167j.setText("已预约");
                    } else {
                        this.f35165h.setText("已预约");
                    }
                    int w03 = UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id());
                    if (isModMainGame) {
                        v1(this.f35167j, 2, gamedetialModleFourBean.getSize(), w03, gamedetialModleFourBean.getCrc_sign_id(), isModMainGame);
                        return;
                    } else {
                        v1(this.f35165h, 2, gamedetialModleFourBean.getSize(), w03, gamedetialModleFourBean.getCrc_sign_id(), isModMainGame);
                        return;
                    }
                }
                int w04 = UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id());
                if (isModMainGame) {
                    v1(this.f35167j, gamedetialModleFourBean.getDown_status(), gamedetialModleFourBean.getSize(), w04, gamedetialModleFourBean.getCrc_sign_id(), isModMainGame);
                } else {
                    v1(this.f35165h, gamedetialModleFourBean.getDown_status(), gamedetialModleFourBean.getSize(), w04, gamedetialModleFourBean.getCrc_sign_id(), isModMainGame);
                }
            }
        }
    }

    void S0(DownloadTask downloadTask) {
        ExtBean extBean = this.R;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || downloadTask == null || !"112".equals(this.R.getFrom())) {
            return;
        }
        ExtBean extBean2 = new ExtBean();
        extBean2.setFrom("101");
        extBean2.setPosition("112");
        extBean2.setLocation(this.R.getLocation());
        downloadTask.setExt(JsonMapper.toJsonString(extBean2));
    }

    void S1() {
        this.I1.loadLocalArchiveDatas(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void T0() {
        if (this.L == null || this.H1 == null) {
            return;
        }
        File file = new File(getExternalFilesDir("backup") + File.separator + this.L.getCrc_link_type_val());
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length <= 0) {
            return;
        }
        String mainLocalPath = this.H1.getMainLocalPath();
        String b02 = com.join.mgps.va.overmind.f.f54952a.b0();
        if (mainLocalPath.startsWith("/data/data")) {
            mainLocalPath = mainLocalPath.replace("/data/data", "/data/user/0");
            b02 = b02.replace("/sdcard", "");
        }
        int lastIndexOf = mainLocalPath.lastIndexOf(net.lingala.zip4j.util.e.F0);
        String substring = mainLocalPath.substring(lastIndexOf);
        String substring2 = mainLocalPath.substring(0, lastIndexOf);
        com.join.mgps.Util.h0.d(file.getAbsolutePath() + substring, b02 + substring2);
        com.join.mgps.Util.h0.h(file.getAbsolutePath(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void T1(boolean z4) {
        ExtBean extBean = this.R;
        if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
            return;
        }
        com.join.mgps.Util.m1.c().b(this, this.R.getFrom_id(), new o(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V1(ModGameDetailBean modGameDetailBean) {
        DownloadTask downloadTask;
        ModInfoBean modInfoBean;
        GamedetialModleFourBean gamedetialModleFourBean;
        DetialShowImageBean detialShowImageBean;
        DetialShowImageSingBean remote;
        DetialShowImageBean detialShowImageBean2;
        DetialShowImageSingBean remote2;
        this.N = modGameDetailBean;
        if (modGameDetailBean != null) {
            try {
                this.f35183w.setVisibility(8);
                this.f35184x.setVisibility(8);
                this.f35181v.setVisibility(0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (this.N.getGold_finger() != null) {
                this.I1.setGoldFingerBean(this.N.getGold_finger());
            }
            I1(modGameDetailBean);
            String str = modGameDetailBean.getCloud_archive_local_path() != null ? "1" : "";
            this.O = modGameDetailBean.getMain_game_info();
            this.P = modGameDetailBean.getMod_game_info();
            com.papa.sim.statistic.p.l(this).a1(Event.indexGameStart, AccountUtil_.getInstance_(this).getUid(), this.P.getGame_id(), this.K, 1, str);
            if (modGameDetailBean.getAd_info() != null && modGameDetailBean.getAd_info().getMain() != null) {
                MyImageLoader.h(this.f35169l, modGameDetailBean.getAd_info().getMain().getPic_remote());
            }
            GamedetialModleFourBean gamedetialModleFourBean2 = this.O;
            if (gamedetialModleFourBean2 != null) {
                if (gamedetialModleFourBean2.getGame_screen_shot() != null && this.O.getGame_screen_shot().size() > 0) {
                    ScreenshotGamedetialBean screenshotGamedetialBean = this.O.getGame_screen_shot().get(0);
                    if (screenshotGamedetialBean != null) {
                        String pic = screenshotGamedetialBean.getPic();
                        if (!com.join.mgps.Util.g2.h(pic)) {
                            MyImageLoader.h(this.f35161d, pic);
                        }
                    }
                } else if (this.O.getPic_info() != null && this.O.getPic_info().size() > 0 && (detialShowImageBean2 = this.O.getPic_info().get(0)) != null && (remote2 = detialShowImageBean2.getRemote()) != null) {
                    String path = remote2.getPath();
                    if (!com.join.mgps.Util.g2.h(path)) {
                        MyImageLoader.h(this.f35161d, path);
                    }
                }
            }
            if (this.O == null && (gamedetialModleFourBean = this.P) != null) {
                if (gamedetialModleFourBean.getGame_screen_shot() != null && this.P.getGame_screen_shot().size() > 0) {
                    ScreenshotGamedetialBean screenshotGamedetialBean2 = this.P.getGame_screen_shot().get(0);
                    if (screenshotGamedetialBean2 != null) {
                        String pic2 = screenshotGamedetialBean2.getPic();
                        if (!com.join.mgps.Util.g2.h(pic2)) {
                            MyImageLoader.h(this.f35161d, pic2);
                        }
                    }
                } else if (this.P.getPic_info() != null && this.P.getPic_info().size() > 0 && (detialShowImageBean = this.P.getPic_info().get(0)) != null && (remote = detialShowImageBean.getRemote()) != null) {
                    String path2 = remote.getPath();
                    if (!com.join.mgps.Util.g2.h(path2)) {
                        MyImageLoader.h(this.f35161d, path2);
                    }
                }
            }
            GamedetialModleFourBean gamedetialModleFourBean3 = this.O;
            if (gamedetialModleFourBean3 != null) {
                this.f35160c.setText(gamedetialModleFourBean3.getGame_name());
            } else {
                GamedetialModleFourBean gamedetialModleFourBean4 = this.P;
                if (gamedetialModleFourBean4 != null) {
                    this.f35160c.setText(gamedetialModleFourBean4.getGame_name());
                }
            }
            GeneralCfgBean general_cfg = this.N.getGeneral_cfg();
            if (general_cfg != null) {
                this.Q = general_cfg.getMemberUrl();
                if (general_cfg.getStrongMode() != null) {
                    this.f35165h.setText(general_cfg.getStrongMode().getTitle());
                }
                if (general_cfg.getNormalMode() != null) {
                    this.f35167j.setText(general_cfg.getNormalMode().getTitle());
                }
            }
            if (com.join.mgps.Util.g2.i(this.I)) {
                this.L = p1.f.K().F(this.I);
            }
            if (this.L == null) {
                this.L = this.P.getDownloadtaskDown();
                ModGameDetailBean modGameDetailBean2 = this.N;
                if (modGameDetailBean2 != null && modGameDetailBean2.getPd_info() != null) {
                    C1(this.L, 1, 1);
                } else {
                    y1(this.L);
                }
                if (com.join.mgps.Util.g2.i(this.L.getMod_info()) && (modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(this.L.getMod_info(), ModInfoBean.class)) != null && this.L.getCrc_link_type_val().equals(modInfoBean.getMod_game_id())) {
                    this.L.setResource_url_remote(modInfoBean.getDown_url());
                    DownloadTask downloadTask2 = this.L;
                    Dtype dtype = Dtype.MOD;
                    downloadTask2.setFileType(dtype.name());
                    this.L.setRomType(dtype.name());
                    Iterator<TipBean> it2 = this.L.getTipBeans().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        TipBean next = it2.next();
                        String id = next.getId();
                        if (id.equals(ConstantIntEnum.DATA.value() + "")) {
                            this.L.setRomType(Dtype.androiddata.name());
                        } else {
                            String id2 = next.getId();
                            if (id2.equals(ConstantIntEnum.OBB.value() + "")) {
                                this.L.setRomType(Dtype.androidobb.name());
                            }
                        }
                        String id3 = next.getId();
                        if (id3.equals(ConstantIntEnum.OBBDATA.value() + "")) {
                            this.L.setRomType(Dtype.androidobbdata.name());
                            break;
                        }
                    }
                    if (com.join.android.app.common.utils.e.l0(this).d(this, this.L.getPackageName()) && this.L.getTask_down_type() == 0 && !com.join.mgps.va.overmind.d.o().F(this.L.getPackageName())) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this).l(this, this.L.getPackageName());
                        if (com.join.mgps.Util.g2.i(modInfoBean.getCompatible_version()) && com.join.mgps.Util.g2.i(modInfoBean.getCompatible_version())) {
                            String[] split = modInfoBean.getCompatible_version().split(",");
                            int length = split.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                String str2 = split[i4];
                                if (str2.equals(l4.e() + "_" + l4.d())) {
                                    this.S1 = true;
                                    break;
                                }
                                i4++;
                            }
                        }
                        Iterator<TipBean> it3 = this.L.getTipBeans().iterator();
                        boolean z4 = false;
                        while (it3.hasNext()) {
                            TipBean next2 = it3.next();
                            String id4 = next2.getId();
                            if (!id4.equals(ConstantIntEnum.DATA.value() + "")) {
                                String id5 = next2.getId();
                                if (!id5.equals(ConstantIntEnum.OBB.value() + "")) {
                                    String id6 = next2.getId();
                                    if (id6.equals(ConstantIntEnum.OBBDATA.value() + "")) {
                                    }
                                }
                            }
                            z4 = true;
                        }
                        boolean z5 = this.S1;
                        if ((z5 && Build.VERSION.SDK_INT < 30) || (z5 && !z4)) {
                            this.L.setTask_down_type(3);
                        }
                    }
                }
                this.L.setDownloadType(0);
                this.L.setScreenshot_pic(this.P.getScreenshot_pic());
                String d5 = this.V.hasShowModInstallGames().d();
                if (com.join.mgps.Util.g2.h(d5) || !d5.contains(this.L.getCrc_link_type_val())) {
                    ModGameDetailBean modGameDetailBean3 = this.N;
                    if (modGameDetailBean3 != null && modGameDetailBean3.getPd_info() != null) {
                        C1(this.L, 1, 0);
                    } else {
                        z1(this.L, 0);
                    }
                    this.V.hasShowModInstallGames().g(d5 + "," + this.L.getCrc_link_type_val());
                }
                y1(this.L);
            } else if ("46".equals(this.P.getPlugin_num())) {
                DownloadTask downloadTask3 = this.L;
                Dtype dtype2 = Dtype.MOD;
                downloadTask3.setFileType(dtype2.name());
                this.L.setRomType(dtype2.name());
                Iterator<TipBean> it4 = this.L.getTipBeans().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    TipBean next3 = it4.next();
                    String id7 = next3.getId();
                    if (id7.equals(ConstantIntEnum.DATA.value() + "")) {
                        this.L.setRomType(Dtype.androiddata.name());
                    } else {
                        String id8 = next3.getId();
                        if (id8.equals(ConstantIntEnum.OBB.value() + "")) {
                            this.L.setRomType(Dtype.androidobb.name());
                        }
                    }
                    String id9 = next3.getId();
                    if (id9.equals(ConstantIntEnum.OBBDATA.value() + "")) {
                        this.L.setRomType(Dtype.androidobbdata.name());
                        break;
                    }
                }
            }
            U0();
            if (this.L.getStatus() != 9 && this.L.getStatus() != 42) {
                this.f35166i.setVisibility(8);
            } else {
                this.f35166i.setVisibility(0);
            }
            Q1(this.L, this.P);
            GamedetialModleFourBean gamedetialModleFourBean5 = this.O;
            if (gamedetialModleFourBean5 != null) {
                this.J = gamedetialModleFourBean5.getGame_id();
            }
            if (com.join.mgps.Util.g2.i(this.J)) {
                this.M = p1.f.K().F(this.J);
            }
            DownloadTask downloadTask4 = this.M;
            if (downloadTask4 == null) {
                GamedetialModleFourBean gamedetialModleFourBean6 = this.O;
                if (gamedetialModleFourBean6 != null) {
                    DownloadTask downloadtaskDown = gamedetialModleFourBean6.getDownloadtaskDown();
                    this.M = downloadtaskDown;
                    Dtype dtype3 = Dtype.android;
                    downloadtaskDown.setFileType(dtype3.name());
                    this.M.setRomType(dtype3.name());
                }
            } else {
                downloadTask4.setDownloadType(0);
                this.M.setScreenshot_pic(this.O.getScreenshot_pic());
            }
            W0();
            GamedetialModleFourBean gamedetialModleFourBean7 = this.O;
            if (gamedetialModleFourBean7 != null && (downloadTask = this.M) != null) {
                Q1(downloadTask, gamedetialModleFourBean7);
            }
            N1(this.K);
            ModGameDetailBean modGameDetailBean4 = this.N;
            if (modGameDetailBean4 != null && modGameDetailBean4.getPd_info() != null) {
                C1(this.L, 2, 0);
            } else {
                V0(this.L);
            }
            c1(new ArrayList<String>() { // from class: com.join.mgps.activity.ModGameIndexActivity.20
                {
                    add(ModGameIndexActivity.this.L.getCrc_link_type_val());
                }
            });
        }
        R1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X0(DownloadTask downloadTask) {
        String mainArchiveLocalPath;
        GamedetialModleFourBean gamedetialModleFourBean = this.O;
        if (gamedetialModleFourBean != null && this.P != null && TextUtils.equals(gamedetialModleFourBean.getVer(), this.P.getVer())) {
            if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55590j) == 0 && ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55589i) == 0) {
                if (com.join.mgps.va.overmind.d.o().O()) {
                    String str = com.join.mgps.va.overmind.f.f54952a.b0() + this.N.getCloud_archive_local_path().getMainArchiveLocalPath();
                    String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + mainArchiveLocalPath.replace(this.N.getMod_game_info().getPackageName(), this.N.getMain_game_info().getPackageName());
                    File file = new File(str2);
                    if (file.exists() && file.listFiles() != null && file.listFiles().length > 0) {
                        try {
                            com.join.mgps.Util.g0.a(str2, str);
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        Z0(true, downloadTask);
                        return;
                    }
                    Z0(false, downloadTask);
                    return;
                }
                return;
            }
            ActivityCompat.requestPermissions(this, new String[]{com.kuaishou.weapon.p0.g.f55590j, com.kuaishou.weapon.p0.g.f55589i}, 7);
            return;
        }
        Dialog dialog = this.N1;
        if (dialog != null && dialog.isShowing()) {
            this.N1.dismiss();
        }
        A1(downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Y0(DownloadTask downloadTask) {
        try {
            try {
                if (downloadTask.getFileType().equals(Dtype.MOD.name())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(com.join.mgps.Util.v.f28117q);
                    String str = File.separator;
                    sb.append(str);
                    sb.append(downloadTask.getPackageName());
                    File file = new File(sb.toString());
                    if (file.exists()) {
                        File file2 = new File(com.join.mgps.va.overmind.d.o().q(true) + str + "data" + str + downloadTask.getPackageName());
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        com.join.mgps.Util.h0.d(file.getPath(), file2.getPath());
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(boolean z4, DownloadTask downloadTask) {
        Dialog dialog = this.N1;
        if (dialog != null && dialog.isShowing()) {
            this.N1.dismiss();
        }
        if (z4) {
            if (!this.E1) {
                this.F1 = false;
                D1();
                return;
            }
            this.F1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1() {
        Dialog dialog = this.T1;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.T1.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f35174p0 = this;
        CloudShareViewModle cloudShareViewModle = (CloudShareViewModle) new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(CloudShareViewModle.class);
        this.I1 = cloudShareViewModle;
        cloudShareViewModle.getEvent().observe(this, new k());
        h1();
        getDetialData();
        e1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c1(List<String> list) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                ArchievePathMultiArgs archievePathMultiArgs = new ArchievePathMultiArgs();
                archievePathMultiArgs.setUid(String.valueOf(accountData.getUid()));
                archievePathMultiArgs.setDownloadedGameIdList(list);
                requestModel.setArgs(archievePathMultiArgs);
                requestModel.setDefault(this);
                ResponseModel<ArchievePathMultiBean> r4 = com.join.mgps.rpc.impl.i.D0().r(requestModel.makeSign());
                if (r4 == null || r4.getCode() != 200 || r4.getData() == null || r4.getData().getCloud_archive_path_list() == null || r4.getData().getCloud_archive_path_list().size() <= 0) {
                    return;
                }
                this.H1 = r4.getData().getCloud_archive_path_list().get(0);
                T0();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public String d1() {
        GamedetialModleFourBean gamedetialModleFourBean = this.P;
        if (gamedetialModleFourBean != null) {
            return gamedetialModleFourBean.getGame_id();
        }
        GamedetialModleFourBean gamedetialModleFourBean2 = this.O;
        return gamedetialModleFourBean2 != null ? gamedetialModleFourBean2.getGame_id() : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.f5().build();
                }
                RequestModel requestModel = new RequestModel();
                RequestModGameRecommendAdArgs requestModGameRecommendAdArgs = new RequestModGameRecommendAdArgs();
                requestModGameRecommendAdArgs.setUid(accountData.getUid());
                requestModGameRecommendAdArgs.setGameId(Long.parseLong(this.I));
                requestModGameRecommendAdArgs.setDownloadedGameIdList(p1.f.K().A());
                requestModel.setArgs(requestModGameRecommendAdArgs);
                requestModel.setDefault(this);
                ResponseModel<ModGameRecommendAdBean> body = com.join.mgps.rpc.impl.i.D0().B0().s1(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && body.getData() != null) {
                    List<CollectionBeanSubBusiness> rec_game_list = body.getData().getRec_game_list();
                    for (CollectionBeanSubBusiness collectionBeanSubBusiness : rec_game_list) {
                        collectionBeanSubBusiness.setFromRecomDown(true);
                        collectionBeanSubBusiness.set_from(101);
                        collectionBeanSubBusiness.set_from_type(148);
                    }
                    this.Y = (ArrayList) rec_game_list;
                    this.Z = body.getData().isPopup();
                    if ("A".equalsIgnoreCase(body.getData().getPanel())) {
                        this.D1 = 1;
                    } else if ("B".equalsIgnoreCase(body.getData().getPanel())) {
                        this.D1 = 2;
                    }
                    this.D1++;
                    H1();
                    t1();
                    return;
                }
                g1();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                g1();
                return;
            }
        }
        g1();
    }

    public boolean f1(MotionEvent motionEvent, MotionEvent motionEvent2) {
        float x4 = motionEvent == null ? 0.0f : motionEvent.getX();
        float x5 = motionEvent2 == null ? 0.0f : motionEvent2.getX();
        float y2 = motionEvent == null ? 0.0f : motionEvent.getY();
        float y4 = motionEvent2 == null ? 0.0f : motionEvent2.getY();
        float f5 = x4 - x5;
        float abs = Math.abs(f5);
        float abs2 = Math.abs(y2 - y4);
        StringBuilder sb = new StringBuilder();
        sb.append("onFling: ");
        sb.append(x4);
        sb.append("  ");
        sb.append(x5);
        if (Math.abs(abs2 == 0.0f ? 100.0f : abs / abs2) > 1.0f) {
            if (x5 - x4 > 150.0f) {
                if (this.f35182v1) {
                    r1();
                    com.papa.sim.statistic.p.l(this.f35174p0).P1(Event.listClickBigPicStaus, this.f35175p1, d1(), 1, this.D1);
                    return true;
                }
                return true;
            } else if (f5 <= 150.0f || this.f35182v1) {
                return true;
            } else {
                r1();
                com.papa.sim.statistic.p.l(this.f35174p0).P1(Event.listClickIconStatus, this.f35175p1, d1(), 1, this.D1);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1() {
        this.E.setVisibility(8);
        this.D.setVisibility(8);
        this.G.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDetialData() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel<RequestModGameArgs> requestModel = new RequestModel<>();
                RequestModGameArgs requestModGameArgs = new RequestModGameArgs();
                requestModGameArgs.setUid(accountData.getUid());
                requestModGameArgs.setUserToken(accountData.getToken());
                requestModGameArgs.setGameId(this.I);
                requestModel.setArgs(requestModGameArgs);
                requestModel.setDefault(this);
                ResponseModel<ModGameDetailBean> B = com.join.mgps.rpc.impl.i.D0().B(requestModel);
                if (B != null && B.getCode() == 200) {
                    V1(B.getData());
                    return;
                } else {
                    showLodingFailed();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    void hideNavigationBar() {
        if (Build.VERSION.SDK_INT >= 19) {
            setSystemUiVisibility();
        }
    }

    public void initPreDownloadFactory() {
        U1 = com.github.snowdream.android.app.downloader.b.e();
        v vVar = new v();
        V1 = vVar;
        U1.m(vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.bgExpand})
    public void l0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.expandMask})
    public void m0() {
        r1();
        com.papa.sim.statistic.p.l(this).P1(Event.listClickBigPicStaus, this.f35175p1, d1(), 2, this.D1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnRecommendToggleExpand})
    public void n0() {
        w1(1, -1);
        r1();
        com.papa.sim.statistic.p.l(this).P1(Event.listClickIconStatus, this.f35175p1, d1(), 1, this.D1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnRecommendToggleShrink})
    public void o0() {
        r1();
        com.papa.sim.statistic.p.l(this).P1(Event.listClickBigPicStaus, this.f35175p1, d1(), 1, this.D1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_back})
    public void onBack() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(this);
        com.join.mgps.Util.d0.a().d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask downloadTask;
        DownloadTask a5 = nVar.a();
        U1(nVar);
        if (nVar.c() == 8) {
            DownloadTask downloadTask2 = this.L;
            if (downloadTask2 != null && downloadTask2.getStatus() == 2) {
                UtilsMy.x4(this.L);
                com.join.mgps.dialog.f1 f1Var = this.S;
                if (f1Var != null) {
                    f1Var.C(2, this.U, this.S1);
                    this.S.D(this.L);
                }
                TextView textView = this.f35173p;
                textView.setText(this.L.getProgress() + "%");
            }
            DownloadTask downloadTask3 = this.M;
            if (downloadTask3 == null || downloadTask3.getStatus() != 2) {
                return;
            }
            UtilsMy.x4(this.M);
            com.join.mgps.dialog.f1 f1Var2 = this.S;
            if (f1Var2 != null) {
                f1Var2.C(2, this.U, this.S1);
                this.S.D(this.M);
            }
            TextView textView2 = this.f35172o;
            textView2.setText(this.M.getProgress() + "%");
            return;
        }
        if (a5 != null && this.L != null && a5.getCrc_link_type_val().equals(this.L.getCrc_link_type_val())) {
            this.L = a5;
            UtilsMy.x4(a5);
            int c5 = nVar.c();
            if (c5 == 0) {
                R1();
            } else if (c5 != 8) {
                if (c5 != 48 && c5 != 5) {
                    if (c5 != 6) {
                        switch (c5) {
                            case 10:
                                com.join.mgps.dialog.f1 f1Var3 = this.S;
                                if (f1Var3 != null) {
                                    f1Var3.C(3, this.U, this.S1);
                                    this.S.D(this.L);
                                    break;
                                }
                                break;
                            case 12:
                                com.join.mgps.dialog.f1 f1Var4 = this.S;
                                if (f1Var4 != null && f1Var4.isShowing()) {
                                    this.S.dismiss();
                                }
                                F1(this.L);
                                break;
                            case 13:
                                com.join.mgps.dialog.f1 f1Var5 = this.S;
                                if (f1Var5 != null && f1Var5.isShowing()) {
                                    this.S.dismiss();
                                }
                                com.join.mgps.Util.l2.a(this).b("解压失败");
                                F1(this.L);
                                break;
                        }
                    } else {
                        com.join.mgps.dialog.f1 f1Var6 = this.S;
                        if (f1Var6 != null && f1Var6.isShowing()) {
                            this.S.dismiss();
                        }
                    }
                }
                com.join.mgps.dialog.f1 f1Var7 = this.S;
                if (f1Var7 != null && f1Var7.isShowing()) {
                    this.S.dismiss();
                }
                U0();
                if (nVar.c() == 5) {
                    V0(this.L);
                }
                F1(this.L);
                if (APKUtils.G(a5) && (downloadTask = this.M) != null && downloadTask.getStatus() == 5) {
                    Dialog dialog = this.T1;
                    if (dialog == null) {
                        this.T1 = com.join.mgps.Util.b0.f0(this).x(this).a("拷贝中。。。");
                    } else if (dialog.isShowing()) {
                        this.T1.dismiss();
                    }
                    this.T1.show();
                    Y0(a5);
                }
                R1();
            } else {
                DownloadTask downloadTask4 = this.L;
                if (downloadTask4 == null || downloadTask4.getPath() == null || this.L == null || !a5.getCrc_link_type_val().equals(this.L.getCrc_link_type_val())) {
                    return;
                }
                UtilsMy.x4(this.L);
                com.join.mgps.dialog.f1 f1Var8 = this.S;
                if (f1Var8 != null) {
                    f1Var8.C(2, this.U, this.S1);
                    this.S.D(this.L);
                }
                TextView textView3 = this.f35173p;
                textView3.setText(this.L.getProgress() + "%");
                return;
            }
        }
        if (a5 == null || this.M == null || !a5.getCrc_link_type_val().equals(this.M.getCrc_link_type_val())) {
            return;
        }
        this.M = a5;
        UtilsMy.x4(a5);
        int c6 = nVar.c();
        if (c6 != 5) {
            if (c6 != 8) {
                switch (c6) {
                    case 10:
                        com.join.mgps.dialog.f1 f1Var9 = this.S;
                        if (f1Var9 != null) {
                            f1Var9.C(3, this.U, this.S1);
                            this.S.D(this.M);
                            return;
                        }
                        return;
                    case 11:
                        break;
                    case 12:
                        com.join.mgps.dialog.f1 f1Var10 = this.S;
                        if (f1Var10 != null && f1Var10.isShowing()) {
                            this.S.dismiss();
                        }
                        F1(this.M);
                        return;
                    case 13:
                        com.join.mgps.dialog.f1 f1Var11 = this.S;
                        if (f1Var11 != null && f1Var11.isShowing()) {
                            this.S.dismiss();
                        }
                        com.join.mgps.Util.l2.a(this).b("解压失败");
                        F1(this.M);
                        return;
                    default:
                        return;
                }
            } else {
                DownloadTask downloadTask5 = this.M;
                if (downloadTask5 == null || downloadTask5.getPath() == null || this.M == null || !a5.getCrc_link_type_val().equals(this.M.getCrc_link_type_val())) {
                    return;
                }
                UtilsMy.x4(this.M);
                com.join.mgps.dialog.f1 f1Var12 = this.S;
                if (f1Var12 != null) {
                    f1Var12.C(2, this.U, this.S1);
                    this.S.D(this.M);
                }
                TextView textView4 = this.f35172o;
                textView4.setText(this.L.getProgress() + "%");
                return;
            }
        }
        com.join.mgps.dialog.f1 f1Var13 = this.S;
        if (f1Var13 != null && f1Var13.isShowing()) {
            this.S.dismiss();
        }
        W0();
        F1(this.M);
        R1();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLocalArchiveUpdate(DownloadArchiveDialog.UpdateLocalArchiveEvent updateLocalArchiveEvent) {
        this.I1.loadLocalArchiveDatas(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.I = intent.getStringExtra("gameId");
        this.J = intent.getStringExtra(ModGameIndexActivity_.f35235d2);
        this.K = intent.getStringExtra("from");
        getDetialData();
        e1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.E1 = true;
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 != 7) {
            return;
        }
        for (int i5 : iArr) {
            if (i5 != 0) {
                B1(this.L, "由于安卓系统目录限制,无法同步存档至增强模式");
                return;
            }
        }
        DownloadTask downloadTask = this.L;
        if (downloadTask != null) {
            X0(downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.E1 = false;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            this.f35175p1 = accountData.getUid();
        }
        try {
            U0();
            W0();
            R1();
            hideNavigationBar();
            UtilsMy.q4(this.f35174p0);
            ModGameDetailBean modGameDetailBean = this.N;
            if (modGameDetailBean != null && modGameDetailBean.getCloud_archive_local_path() != null) {
                S1();
            }
            com.join.mgps.dialog.f1 f1Var = this.S;
            if (f1Var != null && f1Var.isShowing()) {
                if (this.U && this.M != null && p1.f.K().F(this.M.getCrc_link_type_val()) == null) {
                    this.S.dismiss();
                }
                if (!this.U && this.L != null && p1.f.K().F(this.L.getCrc_link_type_val()) == null) {
                    this.S.dismiss();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (this.F1) {
            this.F1 = false;
            D1();
        }
    }

    @Subscribe
    public void onStartGame(com.join.mgps.event.s sVar) {
        M1();
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i4) {
        if (i4 == 0) {
            hideNavigationBar();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_open_vip})
    public void q1() {
        com.papa.sim.statistic.p.l(this).O1(Event.clickLeftCloudAd, new Ext().setGameId(this.I));
        ModGameDetailBean modGameDetailBean = this.N;
        if (modGameDetailBean != null && modGameDetailBean.getAd_info() != null) {
            if (this.N.getAd_info().getSub() == null || this.N.getAd_info().getSub().size() <= 0) {
                return;
            }
            IntentDateBean intentDataBean = this.N.getAd_info().getSub().get(0).getIntentDataBean();
            if (intentDataBean.getLink_type() == 4) {
                if (intentDataBean.getLink_type_val().contains("?")) {
                    intentDataBean.setLink_type_val(intentDataBean.getLink_type_val() + "&gameid=" + this.I);
                } else {
                    intentDataBean.setLink_type_val(intentDataBean.getLink_type_val() + "?gameid=" + this.I);
                }
            }
            IntentUtil.getInstance().intentActivity(this, intentDataBean);
        } else if (com.join.mgps.Util.g2.i(this.Q)) {
            com.papa.sim.statistic.p.l(this).O1(Event.onclickVipMod, new Ext().setGameId(this.I));
            if (this.Q.contains("?")) {
                IntentUtil intentUtil = IntentUtil.getInstance();
                intentUtil.goShareWebActivity(this, this.Q + "&gameid=" + this.I);
                return;
            }
            IntentUtil intentUtil2 = IntentUtil.getInstance();
            intentUtil2.goShareWebActivity(this, this.Q + "?gameid=" + this.I);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        getDetialData();
        e1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    void setSystemUiVisibility() {
        getWindow().getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : 1799);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f35183w.setVisibility(0);
            this.f35184x.setVisibility(8);
            this.f35181v.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            this.f35183w.setVisibility(8);
            this.f35184x.setVisibility(0);
            this.f35181v.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t1() {
        ArrayList<CollectionBeanSubBusiness> arrayList = this.Y;
        if (arrayList != null) {
            this.H.setText(String.valueOf(arrayList.size()));
            this.W.setNewData(this.Y);
            this.X.setNewData(this.Y);
        }
    }

    public void v1(TextView textView, int i4, String str, int i5, String str2, boolean z4) {
        try {
            textView.setEnabled(true);
            boolean z5 = UtilsMy.v0(i5, str2) > 0;
            if (i4 == 3 && !z5) {
                if (z4) {
                    textView.setText(textView.getResources().getString(R.string.mod_download_stand));
                } else {
                    textView.setText(textView.getResources().getString(R.string.mod_download_mod));
                }
            } else if (i4 == 2 && !z5) {
                textView.setText("即将开放");
                textView.setEnabled(false);
            } else if (i4 == 6 && !z5) {
                textView.setText("预约");
            } else {
                if (z4) {
                    textView.setText(textView.getResources().getString(R.string.mod_download_stand));
                } else {
                    textView.setText(textView.getResources().getString(R.string.mod_download_mod));
                }
                if (i5 > 0) {
                    textView.setText(textView.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(i5)));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
