package com.join.mgps.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.component.album.MyAlbumActivity;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.component.video.MediaController;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.HtmlDocUtil;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.posting.PostingActivity;
import com.join.mgps.adapter.ForumCommentAdapter;
import com.join.mgps.adapter.ForumPostsAdapter;
import com.join.mgps.customview.BaiduAdBannerRelativeLayout;
import com.join.mgps.customview.CustomLoadingView;
import com.join.mgps.customview.ForumStickView;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.RewardType;
import com.join.mgps.customview.VipView;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.b;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GroupInfoBean;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.TouristLoginRequestBean;
import com.join.mgps.pref.PrefDef_;
import com.tencent.bugly.Bugly;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import it.sephiroth.android.library.widget.AbsHListView;
import it.sephiroth.android.library.widget.HListView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.bither.util.b;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@WindowFeature({10})
@EActivity(R.layout.mg_forum_post_activity)
/* loaded from: classes.dex */
public class ForumPostsActivity extends BaseAppCompatActivity implements ForumStickView.e {
    public static final String A3 = "key_mediacmd";
    public static final String B3 = "key_mediacmd_params";

    /* renamed from: w3  reason: collision with root package name */
    private static final String f30570w3;

    /* renamed from: x3  reason: collision with root package name */
    public static final String f30571x3;

    /* renamed from: y3  reason: collision with root package name */
    public static final int f30572y3 = 3;

    /* renamed from: z3  reason: collision with root package name */
    private static final int f30573z3 = 9;
    @ViewById
    TextView A;
    @ViewById
    TextView B;
    @ViewById
    Button C;
    @StringRes(resName = "net_excption")
    String C1;
    @ViewById
    ImageView D;
    @StringRes(resName = "connect_server_excption")
    String D1;
    WrapContentGridView D2;
    @ViewById
    ImageView E;
    com.join.mgps.rpc.i E1;
    b0 E2;
    @ViewById
    TextView F;
    @Extra
    ExtBean F1;
    private com.join.mgps.dialog.v0 F2;
    @ViewById
    XQuickRecyclerView G;
    ForumBean.ForumPostsBean G1;
    private int G2;
    @ViewById
    ConsecutiveScrollerLayout H;
    ForumBean.GameInfo H1;
    @ViewById
    ForumStickView I;
    List<ForumCommentAdapter.z> I1;
    @ViewById
    ImageView J;
    List<ForumPostsAdapter.e0> J1;
    @ViewById
    RecyclerView K;
    @ViewById
    View L;
    ForumPostsAdapter M;
    ForumCommentAdapter N;
    LinearLayout O;
    LinearLayout P;
    @ViewById
    FrameLayout P2;
    LinearLayout Q;
    @ViewById
    RelativeLayout Q2;
    View R;
    @ViewById
    MyVideoView R2;
    LinearLayout S;
    @ViewById
    SimpleDraweeView S2;
    LinearLayout T;
    private int T1;
    @ViewById
    ImageView T2;
    LinearLayout U;
    private int U1;
    @ViewById
    LinearLayout U2;
    View V;
    private int V1;
    MediaController V2;
    View W;
    private String W1;
    int W2;
    ImageView X;
    String X2;
    ImageView Y;
    com.join.android.app.component.video.c Y1;
    String Y2;
    ImageView Z;
    boolean Z2;

    /* renamed from: a2  reason: collision with root package name */
    private com.join.mgps.dialog.v0 f30574a2;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f30576b;

    /* renamed from: b2  reason: collision with root package name */
    private com.join.mgps.dialog.w0 f30577b2;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f30579c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f30582d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f30585e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    CustomLoadingView f30588f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f30591g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f30594h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f30597i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f30600j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ClearEditText f30603k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f30606l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f30609m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    Button f30612n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f30615o;

    /* renamed from: o2  reason: collision with root package name */
    private a0 f30616o2;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    RelativeLayout f30618p;

    /* renamed from: p0  reason: collision with root package name */
    ImageView f30619p0;

    /* renamed from: p2  reason: collision with root package name */
    com.join.mgps.rpc.b f30621p2;

    /* renamed from: p3  reason: collision with root package name */
    e0 f30622p3;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ImageView f30623q;

    /* renamed from: q2  reason: collision with root package name */
    private BaiduAdBannerRelativeLayout f30624q2;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f30626r;

    /* renamed from: r2  reason: collision with root package name */
    private com.join.mgps.rpc.e f30627r2;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    Button f30629s;

    /* renamed from: s2  reason: collision with root package name */
    private List<ForumBean.ForumGagType> f30630s2;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f30632t;

    /* renamed from: t3  reason: collision with root package name */
    public RecyclerView f30634t3;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    View f30635u;

    /* renamed from: u3  reason: collision with root package name */
    public com.join.mgps.recycler.a f30637u3;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    LinearLayout f30638v;

    /* renamed from: v3  reason: collision with root package name */
    g0 f30640v3;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    HListView f30641w;

    /* renamed from: w2  reason: collision with root package name */
    f0 f30642w2;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    SimpleDraweeView f30643x;

    /* renamed from: x2  reason: collision with root package name */
    List<String> f30644x2;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    VipView f30645y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    TextView f30646z;

    /* renamed from: z2  reason: collision with root package name */
    private com.join.mgps.dialog.y1 f30647z2;

    /* renamed from: p1  reason: collision with root package name */
    final String f30620p1 = "asc";

    /* renamed from: v1  reason: collision with root package name */
    final String f30639v1 = "desc";
    int A1 = 0;
    String B1 = "asc";
    private final int K1 = 1;
    private final int L1 = 2;
    private final int M1 = 4;
    private final int N1 = 17;
    private final int O1 = 18;
    private final int P1 = 20;
    private final int Q1 = 33;
    private final int R1 = 34;
    private final int S1 = 36;
    private int X1 = 1;
    ForumCommentAdapter.w Z1 = new k();

    /* renamed from: c2  reason: collision with root package name */
    private int f30580c2 = 0;

    /* renamed from: d2  reason: collision with root package name */
    private int f30583d2 = 0;

    /* renamed from: e2  reason: collision with root package name */
    private final int f30586e2 = 0;

    /* renamed from: f2  reason: collision with root package name */
    private final int f30589f2 = 16;

    /* renamed from: g2  reason: collision with root package name */
    private final int f30592g2 = 32;

    /* renamed from: h2  reason: collision with root package name */
    private final int f30595h2 = 17;

    /* renamed from: i2  reason: collision with root package name */
    private final int f30598i2 = 18;

    /* renamed from: j2  reason: collision with root package name */
    private final int f30601j2 = 20;

    /* renamed from: k2  reason: collision with root package name */
    private final int f30604k2 = 24;

    /* renamed from: l2  reason: collision with root package name */
    private int f30607l2 = 0;

    /* renamed from: m2  reason: collision with root package name */
    int f30610m2 = 0;

    /* renamed from: n2  reason: collision with root package name */
    private b.e f30613n2 = new s();

    /* renamed from: t2  reason: collision with root package name */
    private boolean f30633t2 = false;

    /* renamed from: u2  reason: collision with root package name */
    boolean f30636u2 = false;
    boolean v2 = false;
    List<RecommendLabelTag> y2 = new ArrayList();
    private final PostingActivity.m A2 = new e();
    volatile boolean B2 = false;
    View.OnClickListener C2 = new f();
    boolean H2 = false;
    b.d I2 = new l();
    boolean J2 = false;
    boolean K2 = false;
    boolean L2 = false;
    boolean M2 = false;
    int N2 = -1;
    int O2 = 0;

    /* renamed from: a3  reason: collision with root package name */
    boolean f30575a3 = false;

    /* renamed from: b3  reason: collision with root package name */
    int f30578b3 = -1;

    /* renamed from: c3  reason: collision with root package name */
    int f30581c3 = -1;

    /* renamed from: d3  reason: collision with root package name */
    int f30584d3 = 0;

    /* renamed from: e3  reason: collision with root package name */
    com.join.mgps.customview.o f30587e3 = null;

    /* renamed from: f3  reason: collision with root package name */
    private Map<String, DownloadTask> f30590f3 = new ConcurrentHashMap();

    /* renamed from: g3  reason: collision with root package name */
    Map<String, DownloadTask> f30593g3 = new HashMap();

    /* renamed from: h3  reason: collision with root package name */
    Map<String, DownloadTask> f30596h3 = new HashMap();

    /* renamed from: i3  reason: collision with root package name */
    private List<DownloadTask> f30599i3 = new ArrayList();

    /* renamed from: j3  reason: collision with root package name */
    int f30602j3 = 0;

    /* renamed from: k3  reason: collision with root package name */
    boolean f30605k3 = false;

    /* renamed from: l3  reason: collision with root package name */
    boolean f30608l3 = false;

    /* renamed from: m3  reason: collision with root package name */
    boolean f30611m3 = false;

    /* renamed from: n3  reason: collision with root package name */
    boolean f30614n3 = false;

    /* renamed from: o3  reason: collision with root package name */
    boolean f30617o3 = false;

    /* renamed from: q3  reason: collision with root package name */
    public int f30625q3 = 0;

    /* renamed from: r3  reason: collision with root package name */
    public int f30628r3 = 0;

    /* renamed from: s3  reason: collision with root package name */
    public int f30631s3 = 0;

    /* loaded from: classes4.dex */
    public enum MediaCmd {
        CMD_PLAY,
        CMD_PLAY_BACKGROUND,
        CMD_PAUSE,
        CMD_STOP,
        CMD_FULLSCREEN,
        CMD_TRANSLATE_Y
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30649c;

        a(int i4, int i5) {
            this.f30648b = i4;
            this.f30649c = i5;
        }

        private void a(int i4) {
            ForumPostsActivity.this.T0(i4, 0);
        }

        private void b(int i4) {
            ForumPostsActivity.this.T0(0, i4);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumPostsActivity.this.X1 != 17) {
                if (ForumPostsActivity.this.X1 != 18 && ForumPostsActivity.this.X1 != 20) {
                    if (ForumPostsActivity.this.X1 != 33) {
                        if (ForumPostsActivity.this.X1 == 34 || ForumPostsActivity.this.X1 == 36) {
                            b(this.f30649c);
                        }
                    } else {
                        a(this.f30648b);
                    }
                } else {
                    ForumPostsActivity.this.K0(this.f30649c);
                }
            } else {
                ForumPostsActivity.this.J0(this.f30648b);
            }
            ForumPostsActivity.this.f30574a2.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    public class a0 extends PopupWindow {

        /* renamed from: a  reason: collision with root package name */
        private final Context f30651a;

        /* renamed from: b  reason: collision with root package name */
        private final View f30652b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    a0.this.dismiss();
                    return true;
                }
                return false;
            }
        }

        public a0(Context context, View view, int i4, int i5) {
            super(view, i4, i5, true);
            this.f30651a = context;
            this.f30652b = view;
            b();
            a();
        }

        private void a() {
        }

        private void b() {
            setBackgroundDrawable(new BitmapDrawable());
            setTouchable(true);
            setOutsideTouchable(true);
            setTouchInterceptor(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements f0.c {
        b() {
        }

        @Override // com.join.mgps.activity.ForumPostsActivity.f0.c
        public void a(int i4, String str) {
            ForumPostsActivity.this.f30644x2.remove(i4);
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            forumPostsActivity.f30642w2.c(forumPostsActivity.f30644x2);
            ForumPostsActivity.this.f30642w2.notifyDataSetChanged();
        }

        @Override // com.join.mgps.activity.ForumPostsActivity.f0.c
        public void b() {
            ForumPostsActivity.this.goMyAlbumActivity4PickPic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b0 extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<c0> f30656b = new ArrayList();

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.v2();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.R0();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.U0();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class d implements View.OnClickListener {
            d() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.O1();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class e implements View.OnClickListener {
            e() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.O1();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class f implements View.OnClickListener {
            f() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.S0();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class g implements View.OnClickListener {
            g() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.G2 = R.id.extFuncDelete;
                ForumPostsActivity.this.I2();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class h implements View.OnClickListener {
            h() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.G2 = R.id.extFuncBest;
                ForumPostsActivity.this.I2();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class i implements View.OnClickListener {
            i() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.V0();
                ForumPostsActivity.this.O0();
            }
        }

        /* loaded from: classes4.dex */
        class j implements View.OnClickListener {
            j() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.W0();
                ForumPostsActivity.this.O0();
            }
        }

        public b0() {
        }

        public List<c0> a(c0 c0Var) {
            if (c0Var == null) {
                return this.f30656b;
            }
            if (this.f30656b == null) {
                this.f30656b = new ArrayList();
            }
            this.f30656b.add(c0Var);
            return this.f30656b;
        }

        public List<c0> b() {
            return this.f30656b;
        }

        public void c(List<c0> list) {
            this.f30656b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<c0> list = this.f30656b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<c0> list = this.f30656b;
            if (list != null) {
                return list.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return super.getItemViewType(i4);
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            d0 d0Var;
            if (view != null) {
                d0Var = (d0) view.getTag();
            } else {
                d0Var = new d0();
                view = LayoutInflater.from(ForumPostsActivity.this).inflate(R.layout.forum_posts_activity_functions_item, (ViewGroup) null);
                d0Var.f30688a = (ImageView) view.findViewById(R.id.icon);
                d0Var.f30689b = (TextView) view.findViewById(R.id.name);
                d0Var.f30690c = view.findViewById(R.id.v_divider);
                view.setTag(d0Var);
            }
            if (i4 == getCount() - 1) {
                d0Var.f30690c.setVisibility(8);
            } else {
                d0Var.f30690c.setVisibility(0);
            }
            c0 c0Var = (c0) getItem(i4);
            int i5 = c0Var.f30680a;
            if (i5 == 1) {
                d0Var.f30688a.setBackgroundResource(c0Var.f30682c ? R.drawable.more_func_favorite_selected : R.drawable.more_func_favorite);
                d0Var.f30689b.setText("收藏");
                view.setOnClickListener(new b());
            } else if (i5 == 2) {
                d0Var.f30688a.setBackgroundResource(R.drawable.ic_forum_post_share);
                d0Var.f30689b.setText("分享");
                view.setOnClickListener(new c());
            } else if (i5 == 3) {
                d0Var.f30688a.setBackgroundResource(R.drawable.more_func_alphabet);
                d0Var.f30689b.setText("倒序查看");
                view.setOnClickListener(new d());
            } else if (i5 == 4) {
                d0Var.f30688a.setBackgroundResource(R.drawable.more_func_alphabet_selected);
                d0Var.f30689b.setText("正序查看");
                view.setOnClickListener(new e());
            } else if (i5 == 5) {
                d0Var.f30688a.setBackgroundResource(R.drawable.ic_forum_post_report);
                d0Var.f30689b.setText("举报");
                view.setOnClickListener(new f());
            } else if (i5 == 6) {
                d0Var.f30688a.setBackgroundResource(R.drawable.ic_forum_post_delete);
                d0Var.f30689b.setText("删帖");
                view.setOnClickListener(new g());
            } else if (i5 == 7) {
                d0Var.f30688a.setBackgroundResource(c0Var.f30683d ? R.drawable.more_func_best_pressed : R.drawable.more_func_best_default);
                d0Var.f30689b.setText("加精");
                view.setOnClickListener(new h());
            } else if (i5 == 8) {
                d0Var.f30688a.setBackgroundResource(R.drawable.more_func_tag_add);
                d0Var.f30689b.setText("收录至话题");
                view.setOnClickListener(new i());
            } else if (i5 == 9) {
                d0Var.f30688a.setBackgroundResource(R.drawable.ic_forum_post_delete);
                d0Var.f30689b.setText("移除话题");
                view.setOnClickListener(new j());
            } else if (i5 == 10) {
                d0Var.f30688a.setBackgroundResource(c0Var.f30684e ? R.drawable.more_func_first_selected : R.drawable.more_func_first_default);
                d0Var.f30689b.setText("置顶");
                view.setOnClickListener(new a());
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return super.getViewTypeCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumPostsAdapter.e0.i f30668b;

        c(ForumPostsAdapter.e0.i iVar) {
            this.f30668b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(this.f30668b.f41049b).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c0 {

        /* renamed from: g  reason: collision with root package name */
        public static final int f30670g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f30671h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f30672i = 3;

        /* renamed from: j  reason: collision with root package name */
        public static final int f30673j = 4;

        /* renamed from: k  reason: collision with root package name */
        public static final int f30674k = 5;

        /* renamed from: l  reason: collision with root package name */
        public static final int f30675l = 6;

        /* renamed from: m  reason: collision with root package name */
        public static final int f30676m = 7;

        /* renamed from: n  reason: collision with root package name */
        public static final int f30677n = 8;

        /* renamed from: o  reason: collision with root package name */
        public static final int f30678o = 9;

        /* renamed from: p  reason: collision with root package name */
        public static final int f30679p = 10;

        /* renamed from: a  reason: collision with root package name */
        public int f30680a;

        /* renamed from: b  reason: collision with root package name */
        public String f30681b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f30682c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f30683d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f30684e;

        c0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30686b;

        d(int i4) {
            this.f30686b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumCommentAdapter.w wVar;
            CommentSelfListActivity_.P0(view.getContext()).a(this.f30686b).start();
            String uid = AccountUtil_.getInstance_(view.getContext()).getUid();
            if (TextUtils.isEmpty(uid)) {
                return;
            }
            if (uid.equals(this.f30686b + "") || (wVar = ForumPostsActivity.this.Z1) == null) {
                return;
            }
            wVar.m(this.f30686b);
        }
    }

    /* loaded from: classes4.dex */
    class d0 {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f30688a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f30689b;

        /* renamed from: c  reason: collision with root package name */
        public View f30690c;

        d0() {
        }
    }

    /* loaded from: classes4.dex */
    class e implements PostingActivity.m {
        e() {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void a(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void b(int i4) {
            ForumPostsActivity.this.finish();
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void c(GroupInfoBean groupInfoBean) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void d(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void e(int i4) {
            if (i4 == 4355) {
                IntentUtil.getInstance().goShareWebActivity(ForumPostsActivity.this, com.join.mgps.rpc.h.f54083s);
            } else if (i4 != 4356) {
            } else {
                IntentUtil.getInstance().goShareWebActivity(ForumPostsActivity.this, com.join.mgps.rpc.h.f54080r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e0 extends Dialog implements View.OnClickListener, AdapterView.OnItemSelectedListener {

        /* renamed from: b  reason: collision with root package name */
        private List<ForumBean.ForumGagType> f30693b;

        /* renamed from: c  reason: collision with root package name */
        h0<ForumBean.ForumGagType> f30694c;

        /* renamed from: d  reason: collision with root package name */
        Spinner f30695d;

        /* renamed from: e  reason: collision with root package name */
        EditText f30696e;

        /* renamed from: f  reason: collision with root package name */
        private String f30697f;

        /* renamed from: g  reason: collision with root package name */
        int f30698g;

        public e0(Context context) {
            super(context, R.style.dialog_error);
            this.f30698g = -1;
            View inflate = LayoutInflater.from(context).inflate(R.layout.mg_forum_post_gag_dialog, (ViewGroup) null);
            setContentView(inflate);
            setCancelable(true);
            setCanceledOnTouchOutside(false);
            inflate.measure(0, 0);
            this.f30695d = (Spinner) com.join.mgps.Util.t2.b(inflate, R.id.spinner);
            this.f30696e = (EditText) com.join.mgps.Util.t2.b(inflate, R.id.txt);
            this.f30696e.setMinHeight(this.f30695d.getMeasuredHeight());
            ((Button) com.join.mgps.Util.t2.b(inflate, R.id.dialog_button_ok)).setOnClickListener(this);
            ((Button) com.join.mgps.Util.t2.b(inflate, R.id.dialog_button_cancle)).setOnClickListener(this);
            this.f30695d.setOnItemSelectedListener(this);
            h0<ForumBean.ForumGagType> h0Var = new h0<>(getContext(), R.layout.mg_forum_post_gag_spinner_item);
            this.f30694c = h0Var;
            this.f30695d.setAdapter((SpinnerAdapter) h0Var);
        }

        public void a(String str) {
            this.f30697f = str;
        }

        public void b(List<ForumBean.ForumGagType> list) {
            if (this.f30693b == null) {
                this.f30693b = new ArrayList();
            }
            this.f30693b.clear();
            this.f30693b.addAll(list);
            if (this.f30694c == null) {
                h0<ForumBean.ForumGagType> h0Var = new h0<>(getContext(), R.layout.mg_forum_post_gag_spinner_item);
                this.f30694c = h0Var;
                this.f30695d.setAdapter((SpinnerAdapter) h0Var);
            }
            this.f30694c.clear();
            ForumBean.ForumGagType forumGagType = new ForumBean.ForumGagType();
            forumGagType.setType(-1);
            forumGagType.setName("设置禁言时间");
            this.f30694c.add(forumGagType);
            this.f30694c.addAll(this.f30693b);
            this.f30694c.notifyDataSetChanged();
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void dismiss() {
            this.f30698g = -1;
            super.dismiss();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id != R.id.dialog_button_ok) {
                if (id == R.id.dialog_button_cancle) {
                    dismiss();
                    return;
                }
                return;
            }
            String obj = this.f30696e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                com.join.mgps.Util.l2.a(getContext()).b("请填写禁言理由");
                return;
            }
            Spinner spinner = this.f30695d;
            int selectedItemPosition = spinner != null ? spinner.getSelectedItemPosition() : 0;
            h0<ForumBean.ForumGagType> h0Var = this.f30694c;
            if (h0Var != null && selectedItemPosition < h0Var.getCount()) {
                ForumBean.ForumGagType item = this.f30694c.getItem(selectedItemPosition);
                if (item.getType() != -1) {
                    this.f30698g = item.getType();
                } else {
                    com.join.mgps.Util.l2.a(getContext()).b("请选择禁言时间");
                    return;
                }
            }
            ForumPostsActivity.this.P1(this.f30697f, this.f30698g, obj);
            dismiss();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.moreFuncBest /* 2131299922 */:
                    ForumPostsActivity.this.G2 = R.id.extFuncBest;
                    ForumPostsActivity.this.I2();
                    break;
                case R.id.moreFuncDelete /* 2131299924 */:
                    ForumPostsActivity.this.G2 = R.id.extFuncDelete;
                    ForumPostsActivity.this.I2();
                    break;
                case R.id.moreFuncFavorite /* 2131299926 */:
                    ForumPostsActivity.this.R0();
                    break;
                case R.id.moreFuncReport /* 2131299928 */:
                    ForumPostsActivity.this.S0();
                    break;
                case R.id.moreFuncShare /* 2131299930 */:
                    ForumPostsActivity.this.U0();
                    break;
                case R.id.moreFuncSort /* 2131299932 */:
                    ForumPostsActivity.this.O1();
                    break;
            }
            if (ForumPostsActivity.this.f30616o2.isShowing()) {
                ForumPostsActivity.this.f30616o2.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class f0 extends BaseAdapter {

        /* renamed from: f  reason: collision with root package name */
        private static final String f30701f = "add_image";

        /* renamed from: c  reason: collision with root package name */
        private Context f30703c;

        /* renamed from: e  reason: collision with root package name */
        private c f30705e;

        /* renamed from: d  reason: collision with root package name */
        boolean f30704d = false;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f30702b = new ArrayList();

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f0 f0Var = f0.this;
                if (f0Var.f30704d) {
                    return;
                }
                f0Var.f30704d = true;
                if (f0Var.f30705e != null) {
                    f0.this.f30705e.b();
                }
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f30707b;

            b(int i4) {
                this.f30707b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (f0.this.f30705e != null) {
                    c cVar = f0.this.f30705e;
                    int i4 = this.f30707b;
                    cVar.a(i4, (String) f0.this.getItem(i4));
                }
            }
        }

        /* loaded from: classes4.dex */
        public interface c {
            void a(int i4, String str);

            void b();
        }

        /* loaded from: classes4.dex */
        class d {

            /* renamed from: a  reason: collision with root package name */
            ImageView f30709a;

            /* renamed from: b  reason: collision with root package name */
            ImageView f30710b;

            d() {
            }
        }

        public f0(Context context) {
            this.f30703c = context;
        }

        private ImageLoader b() {
            return ImageLoader.r(3, ImageLoader.Type.LIFO);
        }

        private void e(View view, View view2) {
            float f5 = this.f30703c.getResources().getDisplayMetrics().density;
            int i4 = (this.f30703c.getResources().getDisplayMetrics().widthPixels / 4) - 10;
            view2.setLayoutParams(new AbsHListView.LayoutParams(i4, -1));
            ((ViewGroup) view2).getChildAt(0).setLayoutParams(new LinearLayout.LayoutParams(i4, i4));
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (this.f30703c.getResources().getDisplayMetrics().scaledDensity * 200.0f)));
        }

        public void c(List<String> list) {
            if (this.f30702b == null) {
                this.f30702b = new ArrayList();
            }
            this.f30702b.clear();
            this.f30702b.addAll(list);
            if (list.size() < 9) {
                this.f30702b.add(f30701f);
            }
        }

        public void d(boolean z4) {
            this.f30704d = z4;
        }

        public void f(c cVar) {
            this.f30705e = cVar;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.f30702b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<String> list = this.f30702b;
            if (list == null) {
                return null;
            }
            return list.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            d dVar;
            try {
                if (view != null) {
                    dVar = (d) view.getTag();
                } else {
                    view = LayoutInflater.from(this.f30703c).inflate(R.layout.forum_post_pic_item, (ViewGroup) null);
                    dVar = new d();
                    dVar.f30709a = (ImageView) view.findViewById(R.id.image);
                    dVar.f30710b = (ImageView) view.findViewById(R.id.image_delete);
                    view.setTag(dVar);
                }
                dVar.f30709a.setOnClickListener(null);
                dVar.f30710b.setVisibility(0);
                if (i4 == getCount() - 1 && this.f30702b.get(i4).equals(f30701f)) {
                    dVar.f30710b.setVisibility(8);
                    dVar.f30709a.setImageResource(R.drawable.pic_add);
                    dVar.f30709a.setOnClickListener(new a());
                } else {
                    b().v(this.f30702b.get(i4), dVar.f30709a);
                    dVar.f30710b.setOnClickListener(new b(i4));
                }
                e(viewGroup, view);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class g implements PopupWindow.OnDismissListener {
        g() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            WindowManager.LayoutParams attributes = ForumPostsActivity.this.getWindow().getAttributes();
            attributes.alpha = 1.0f;
            ForumPostsActivity.this.getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements PopupWindow.OnDismissListener {
        h() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            WindowManager.LayoutParams attributes = ForumPostsActivity.this.getWindow().getAttributes();
            attributes.alpha = 1.0f;
            ForumPostsActivity.this.getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h0<T> extends ArrayAdapter<ForumBean.ForumGagType> {

        /* renamed from: b  reason: collision with root package name */
        private int f30721b;

        public h0(@NonNull Context context, @LayoutRes int i4) {
            super(context, i4);
            this.f30721b = i4;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i4, @Nullable View view, @NonNull ViewGroup viewGroup) {
            ForumBean.ForumGagType forumGagType = (ForumBean.ForumGagType) getItem(i4);
            View inflate = ForumPostsActivity.this.getLayoutInflater().inflate(this.f30721b, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(16908308);
            if (textView != null) {
                textView.setText(forumGagType.getName());
            }
            return inflate;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        public View getView(int i4, @Nullable View view, @NonNull ViewGroup viewGroup) {
            ForumBean.ForumGagType forumGagType = (ForumBean.ForumGagType) getItem(i4);
            View inflate = ForumPostsActivity.this.getLayoutInflater().inflate(this.f30721b, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(16908308);
            if (textView != null) {
                textView.setText(forumGagType.getName());
            }
            return inflate;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity.this.G2 = -1;
            ForumPostsActivity.this.F2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity.this.Y0();
            ForumPostsActivity.this.F2.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class k implements ForumCommentAdapter.w {
        k() {
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void a(int i4) {
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            if (!com.join.mgps.Util.j0.Y0(forumPostsActivity)) {
                com.join.mgps.Util.l2.a(forumPostsActivity).b("用户未登录，请登录");
                com.join.mgps.Util.j0.L0(forumPostsActivity);
            } else if (ForumPostsActivity.this.T2()) {
                ForumPostsActivity.this.p2();
                ForumPostsActivity.this.Q1();
            } else {
                ForumPostsActivity.this.L2(-1);
                ForumPostsActivity.this.B2();
            }
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void b(int i4) {
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            forumPostsActivity.A2(forumPostsActivity.G1);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void c(int i4) {
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void d(int i4) {
            ForumPostsActivity.this.X1 = 17;
            ForumPostsActivity.this.J2(i4, 0);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void e(String str) {
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            forumPostsActivity.f30605k3 = true;
            forumPostsActivity.X0(str);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void f(int i4) {
            ForumPostsActivity.this.T0(0, i4);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void g(int i4) {
            ForumPostsActivity.this.X1 = 18;
            ForumPostsActivity.this.J2(0, i4);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void h(int i4, String str) {
            q(i4, str);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void i(View view, int i4) {
            ForumPostsActivity.this.h1(true);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void j(int i4) {
            ForumPostsActivity.this.T0(i4, 0);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void k(int i4, int i5, String str) {
            ForumPostsActivity.this.h1(true);
            ForumPostsActivity.this.X1 = 4;
            ForumPostsActivity.this.U1 = i4;
            ForumPostsActivity.this.V1 = i5;
            ForumPostsActivity.this.f30603k.setText("");
            ForumPostsActivity.this.f30603k.requestFocus();
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            forumPostsActivity.showSystemKeyBoard(forumPostsActivity.f30603k);
            ClearEditText clearEditText = ForumPostsActivity.this.f30603k;
            clearEditText.setHint("回复" + str + ":");
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void l() {
            ForumPostsActivity.this.S0();
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void m(int i4) {
            ForumPostsActivity.this.G2(i4);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void n(View view, int i4) {
            ForumPostsActivity.this.h1(true);
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void o() {
            ForumPostsActivity.this.H0();
        }

        @Override // com.join.mgps.adapter.ForumCommentAdapter.w
        public void p(int i4) {
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            forumPostsActivity.f1(forumPostsActivity.G1.getPid(), i4);
        }

        @UiThread
        void q(int i4, String str) {
            ForumPostsActivity.this.X1 = 2;
            ForumPostsActivity.this.U1 = i4;
            ForumPostsActivity.this.V1 = 0;
            ForumPostsActivity.this.h1(true);
            ForumPostsActivity.this.f30603k.setText("");
            ClearEditText clearEditText = ForumPostsActivity.this.f30603k;
            clearEditText.setHint("回复" + str + ":");
            ForumPostsActivity.this.f30603k.requestFocus();
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            forumPostsActivity.showSystemKeyBoard(forumPostsActivity.f30603k);
        }
    }

    /* loaded from: classes4.dex */
    class l implements b.d {
        l() {
        }

        @Override // com.join.mgps.customview.b.d
        public void a(int i4) {
        }

        @Override // com.join.mgps.customview.b.d
        public void b(ForumBean.ForumPostsBean forumPostsBean) {
        }

        @Override // com.join.mgps.customview.b.d
        public void c(int i4, boolean z4) {
            if (z4) {
                ForumPostsActivity.this.Z0();
            }
        }

        @Override // com.join.mgps.customview.b.d
        public void d(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean forumPostsBean2 = ForumPostsActivity.this.G1;
            if (forumPostsBean2 != null) {
                forumPostsBean2.setIs_favorite(forumPostsBean.is_favorite());
            }
        }

        @Override // com.join.mgps.customview.b.d
        public void e(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean forumPostsBean2 = ForumPostsActivity.this.G1;
            if (forumPostsBean2 != null) {
                forumPostsBean2.setBest(forumPostsBean.getBest());
            }
        }

        @Override // com.join.mgps.customview.b.d
        public void onCancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements MediaPlayer.OnCompletionListener {
        m() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            ForumPostsActivity.this.K1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements MediaPlayer.OnPreparedListener {
        n() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            ForumPostsActivity.this.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements MediaPlayer.OnErrorListener {
        o() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            ForumPostsActivity.this.K1(true);
            com.join.mgps.Util.l2.a(ForumPostsActivity.this.R2.getContext()).b("视频播放失败");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements MyVideoView.h {
        p() {
        }

        @Override // com.join.android.app.component.video.MyVideoView.h
        public boolean a(boolean z4) {
            com.join.mgps.Util.w0.e("onScreenChanged", "fullscreen=" + z4);
            ForumPostsActivity.this.a1();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.setVisibility(8);
            ForumPostsActivity.this.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class r {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30732a;

        static {
            int[] iArr = new int[HtmlDocUtil.PostDetail.Type.values().length];
            f30732a = iArr;
            try {
                iArr[HtmlDocUtil.PostDetail.Type.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30732a[HtmlDocUtil.PostDetail.Type.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30732a[HtmlDocUtil.PostDetail.Type.Video.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30732a[HtmlDocUtil.PostDetail.Type.RickText.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes4.dex */
    class s implements b.e {
        s() {
        }

        private void b(List<String> list) {
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            if (forumPostsActivity.f30610m2 == 1) {
                forumPostsActivity.f30610m2 = 2;
                ForumRequestBean.ForumPostsCommentRequestBean b02 = com.join.mgps.Util.j0.b0(forumPostsActivity, forumPostsActivity.T1, ForumPostsActivity.this.W1, ForumPostsActivity.this.f30644x2);
                if (list != null && list.size() != 0) {
                    b02.setImages(list);
                }
                ForumPostsActivity.this.Q2(b02);
            }
        }

        @Override // net.bither.util.b.e
        public void a(Boolean bool, Map<String, String> map, Map<String, Integer> map2) {
            List<String> list;
            if (bool.booleanValue() && (list = ForumPostsActivity.this.f30644x2) != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < ForumPostsActivity.this.f30644x2.size(); i4++) {
                    String str = ForumPostsActivity.this.f30644x2.get(i4);
                    int intValue = map2.get(str).intValue();
                    String str2 = map.get(str);
                    if (intValue == 1) {
                        arrayList.add(str2);
                    }
                }
                b(arrayList);
                return;
            }
            b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements XQuickRecyclerView.g {
        t() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XQuickRecyclerView.g
        public void onLoadMore() {
            if (!com.join.android.app.common.utils.j.j(ForumPostsActivity.this)) {
                ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
                forumPostsActivity.M2(forumPostsActivity.getString(R.string.net_connect_failed));
                ForumPostsActivity.this.P2();
                return;
            }
            ForumPostsActivity forumPostsActivity2 = ForumPostsActivity.this;
            forumPostsActivity2.v1(false, false, forumPostsActivity2.f30580c2 + 1);
            if (ForumPostsActivity.this.f30583d2 == -1) {
                ForumPostsActivity.this.P2();
            }
        }

        @Override // com.join.android.app.component.xrecyclerview.XQuickRecyclerView.g
        public void onRefresh() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements ConsecutiveScrollerLayout.f {
        u() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.f
        public void a(View view, int i4, int i5, int i6) {
            ForumPostsActivity forumPostsActivity = ForumPostsActivity.this;
            forumPostsActivity.W2(forumPostsActivity.K, i6);
            ForumPostsActivity.this.G.onScrollStateChanged(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v implements KeyboardListenLayout.a {
        v() {
        }

        @Override // com.join.mgps.customview.KeyboardListenLayout.a
        public void onHidden() {
        }

        @Override // com.join.mgps.customview.KeyboardListenLayout.a
        public void onShown() {
            if (ForumPostsActivity.this.X1 == 1) {
                ForumPostsActivity.this.h1(false);
            } else {
                ForumPostsActivity.this.h1(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w implements View.OnFocusChangeListener {
        w() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            if (z4) {
                ForumPostsActivity.this.f30618p.setVisibility(8);
                ForumPostsActivity.this.f30606l.setVisibility(8);
                ForumPostsActivity.this.f30609m.setVisibility(8);
                ForumPostsActivity.this.f30612n.setVisibility(0);
                ForumPostsActivity.this.showSystemKeyBoard(view);
                return;
            }
            ForumPostsActivity.this.f30618p.setVisibility(0);
            ForumPostsActivity.this.f30606l.setVisibility(0);
            ForumPostsActivity.this.f30609m.setVisibility(0);
            ForumPostsActivity.this.f30612n.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x extends CustomLoadingView.e {
        x(CustomLoadingView customLoadingView) {
            super(customLoadingView);
        }

        @Override // com.join.mgps.customview.CustomLoadingView.e
        public void b() {
            ForumPostsActivity.this.w1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity.this.f30574a2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z implements DialogInterface.OnCancelListener {
        z() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            ForumPostsActivity.this.f30610m2 = 0;
        }
    }

    static {
        String simpleName = ForumPostsActivity.class.getSimpleName();
        f30570w3 = simpleName;
        f30571x3 = simpleName + "key_forum_posts_bean";
    }

    private void E2(View view) {
        m1();
        WrapContentGridView wrapContentGridView = this.D2;
        if (wrapContentGridView != null) {
            wrapContentGridView.setStretchMode(2);
        }
        m2();
        j2();
        o1();
        this.f30616o2.setAnimationStyle(R.style.animation_album_popup);
        this.f30616o2.getContentView().measure(0, 0);
        this.f30616o2.showAsDropDown(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        String str;
        switch (this.G2) {
            case R.id.extFuncBest /* 2131297576 */:
                if (this.G1.getBest() != 1) {
                    str = "确定要设为精华吗？";
                    break;
                } else {
                    str = "确定要取消精华吗？";
                    break;
                }
            case R.id.extFuncBestTv /* 2131297577 */:
            case R.id.extFuncCancel /* 2131297578 */:
            case R.id.extFuncFavoriteTv /* 2131297581 */:
            default:
                return;
            case R.id.extFuncDelete /* 2131297579 */:
                str = "确定要删除吗？";
                break;
            case R.id.extFuncFavorite /* 2131297580 */:
                R0();
                return;
            case R.id.extFuncReply /* 2131297582 */:
                str = "确定要回复吗？";
                break;
            case R.id.extFuncReport /* 2131297583 */:
                str = "确定要设为举报吗？";
                break;
            case R.id.extFuncShare /* 2131297584 */:
                com.join.mgps.Util.j0.H1(this, this.G1);
                return;
        }
        if (this.F2 == null) {
            this.F2 = new com.join.mgps.dialog.v0(this);
        }
        this.F2.f("确定");
        this.F2.d("取消");
        this.F2.b(8);
        this.F2.g(str).c(new i());
        this.F2.e(new j());
        if (this.F2.isShowing()) {
            return;
        }
        this.F2.show();
    }

    private void L1() {
        String str = this.X2;
        String str2 = this.Y2;
        this.S2.setVisibility(0);
        this.S2.setScaleType(ImageView.ScaleType.FIT_XY);
        MyImageLoader.h(this.S2, str2);
        LinearLayout linearLayout = this.U2;
        if (this.V2 == null) {
            MediaController mediaController = new MediaController(this);
            this.V2 = mediaController;
            mediaController.q();
            this.V2.hide();
            this.V2.setVisibility(8);
        }
        if (this.R2.isPlaying()) {
            MyVideoView myVideoView = this.R2;
            if (myVideoView != null) {
                myVideoView.I();
                linearLayout.setVisibility(8);
            }
            MediaController mediaController2 = this.V2;
            if (mediaController2 != null) {
                mediaController2.setVisibility(8);
            }
        }
        this.R2.setVisibility(0);
        this.V2.setAnchorView(this.R2);
        this.V2.setMediaPlayer(this.R2);
        this.R2.setMediaController(this.V2);
        this.R2.requestFocus();
        linearLayout.setVisibility(0);
        if (this.R2.E() && !this.R2.isPlaying()) {
            resume();
            com.join.mgps.Util.w0.e("play a last video ...");
        } else {
            this.R2.setVideoPath(str);
            com.join.mgps.Util.w0.e("play a new video ...");
        }
        this.R2.setOnCompletionListener(new m());
        this.R2.setOnPreparedListener(new n());
        this.R2.setOnErrorListener(new o());
        this.R2.setScreenChangedListener(new p());
        this.T2.setOnClickListener(new q());
    }

    private void M0(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                File file = new File(list.get(i4));
                if (file.getParentFile().exists()) {
                    UtilsMy.delete(file.getParentFile());
                }
                if (file.exists() && file.getAbsolutePath().contains(com.join.mgps.Util.j0.l0().getAbsolutePath())) {
                    UtilsMy.delete(file);
                }
            } catch (Exception unused) {
            }
        }
        net.bither.util.b.q().f71696c = new Hashtable<>();
        net.bither.util.b.q().f71695b = new Hashtable<>();
    }

    private void N0() {
        com.join.mgps.customview.o oVar = this.f30587e3;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f30587e3.dismiss();
    }

    private void N2() {
        this.f30576b.setVisibility(0);
        this.G.setVisibility(0);
        this.f30600j.setVisibility(0);
    }

    private void S2(ForumPostsAdapter.e0.i iVar) {
        try {
            this.f30585e.setText(iVar.f41051d);
            try {
                this.f30645y.setVipData(iVar.f41058k, iVar.f41059l);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (iVar.f41053f) {
                this.F.setVisibility(0);
            } else {
                this.F.setVisibility(8);
            }
            if (iVar.f41056i) {
                this.D.setVisibility(0);
            } else {
                this.D.setVisibility(8);
            }
            if (iVar.f41055h) {
                this.f30585e.setTextColor(getResources().getColor(R.color.app_blue_color));
                this.E.setVisibility(0);
            } else {
                UtilsMy.A3(this, this.f30585e, iVar.f41058k, iVar.f41059l, R.color.forum_nickname_color);
                this.E.setVisibility(8);
            }
            MyImageLoader.x(this.f30643x, iVar.f41050c);
            this.f30643x.setOnClickListener(new c(iVar));
            if (iVar.f41062o) {
                this.A.setVisibility(0);
            } else {
                this.A.setVisibility(8);
            }
            if (!TextUtils.isEmpty(iVar.f41063p)) {
                this.B.setVisibility(0);
                this.B.setText(iVar.f41063p);
            } else {
                this.B.setVisibility(8);
            }
            com.join.mgps.Util.j0.S0(this.f30643x, this.f30585e);
            com.join.mgps.Util.j0.U0(this.f30645y);
            String str = iVar.f41060m;
            String str2 = iVar.f41061n;
            if (this.f30646z != null) {
                if (!TextUtils.isEmpty(str)) {
                    this.f30646z.setVisibility(0);
                    this.f30646z.setText(str);
                    Drawable drawable = getResources().getDrawable(R.drawable.forum_post_host);
                    if (TextUtils.isEmpty(str2) || str2.length() != 7 || !str2.contains("#")) {
                        str2 = "#2fccdf";
                    }
                    drawable.setColorFilter(new LightingColorFilter(Color.parseColor(str2), Color.parseColor(str2)));
                    this.f30646z.setBackgroundDrawable(drawable);
                } else {
                    this.f30646z.setVisibility(8);
                }
            }
            w2(this.f30643x, iVar.f41049b);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                com.join.mgps.Util.j0.H1(this, this.G1);
            } else {
                com.join.mgps.Util.j0.G1(this, this.G1.getPid());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0() {
        switch (this.G2) {
            case R.id.extFuncBest /* 2131297576 */:
                Q0();
                return;
            case R.id.extFuncDelete /* 2131297579 */:
                L0();
                return;
            case R.id.extFuncFavorite /* 2131297580 */:
                R0();
                return;
            case R.id.extFuncReport /* 2131297583 */:
                S0();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0() {
        Activity splashActivity = IntentUtil.getInstance().getSplashActivity();
        if (splashActivity != null) {
            splashActivity.finish();
            IntentUtil.getInstance().setSplashActivity(null);
            Intent intent = new Intent();
            intent.setClass(splashActivity, MGMainActivity_.class);
            intent.setFlags(TTAdConstant.KEY_CLICK_AREA);
            intent.addFlags(536870912);
            startActivity(intent);
        }
        finish();
    }

    private void Z1(List<ForumBean.ForumGagType> list) {
        if (list == null) {
            return;
        }
        if (this.f30630s2 == null) {
            this.f30630s2 = new ArrayList();
        }
        this.f30630s2.clear();
        this.f30630s2.addAll(list);
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private List<String> c1(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (List) extras.get(MyAlbumActivity.f14984x);
    }

    private void f2() {
        if (AccountUtil_.getInstance_(this).isTourist()) {
            touristLogin();
        } else {
            showMessage(getString(R.string.forum_user_login_invalid));
        }
    }

    private void g2() {
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.f30599i3;
            if (list == null || i4 >= list.size()) {
                return;
            }
            D1(p1.f.K().F(this.f30599i3.get(i4).getCrc_link_type_val()), 4);
            i4++;
        }
    }

    private void i1() {
        this.f30576b.setVisibility(8);
        this.G.setVisibility(8);
        this.f30600j.setVisibility(8);
    }

    private void i2() {
        ForumBean.ForumPostsBean forumPostsBean = this.G1;
        if (forumPostsBean != null && forumPostsBean.getCommit() > 0) {
            this.f30615o.setText(com.join.mgps.Util.g2.e(this.G1.getCommit()));
            this.f30615o.setVisibility(0);
            return;
        }
        this.f30615o.setText("0");
        this.f30615o.setVisibility(8);
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private boolean k1(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        return motionEvent.getX() >= ((float) i4) && motionEvent.getX() <= ((float) (i4 + view.getWidth())) && motionEvent.getY() >= ((float) i5) && motionEvent.getY() <= ((float) (i5 + view.getHeight()));
    }

    private void m1() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.forum_posts_activity_functions1, (ViewGroup) null);
        a0 a0Var = new a0(this, inflate, -2, -2);
        this.f30616o2 = a0Var;
        a0Var.setOnDismissListener(new h());
        this.D2 = (WrapContentGridView) inflate.findViewById(R.id.gridView);
        if (this.E2 == null) {
            this.E2 = new b0();
        }
        this.D2.setAdapter((ListAdapter) this.E2);
        o1();
    }

    private void n1() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.forum_posts_activity_functions, (ViewGroup) null);
        a0 a0Var = new a0(this, inflate, -1, -2);
        this.f30616o2 = a0Var;
        a0Var.setOnDismissListener(new g());
        this.O = (LinearLayout) inflate.findViewById(R.id.moreFuncFavorite);
        this.P = (LinearLayout) inflate.findViewById(R.id.moreFuncShare);
        this.Q = (LinearLayout) inflate.findViewById(R.id.moreFuncSort);
        this.R = inflate.findViewById(R.id.row2);
        this.S = (LinearLayout) inflate.findViewById(R.id.moreFuncDelete);
        this.T = (LinearLayout) inflate.findViewById(R.id.moreFuncReport);
        this.U = (LinearLayout) inflate.findViewById(R.id.moreFuncBest);
        this.V = inflate.findViewById(R.id.block1);
        this.W = inflate.findViewById(R.id.block2);
        this.X = (ImageView) inflate.findViewById(R.id.moreFuncFavoriteImg);
        this.Y = (ImageView) inflate.findViewById(R.id.moreFuncShareImg);
        this.Z = (ImageView) inflate.findViewById(R.id.moreFuncSortImg);
        this.f30619p0 = (ImageView) inflate.findViewById(R.id.moreFuncBestImg);
        this.O.setOnClickListener(this.C2);
        this.P.setOnClickListener(this.C2);
        this.Q.setOnClickListener(this.C2);
        this.S.setOnClickListener(this.C2);
        this.T.setOnClickListener(this.C2);
        this.U.setOnClickListener(this.C2);
    }

    private void o1() {
        int i4;
        b0 b0Var = this.E2;
        if (b0Var == null) {
            return;
        }
        if (b0Var.b() != null) {
            this.E2.b().clear();
        }
        int[] iArr = {2, 5, 6, 7, 8, 9, 10};
        String[] strArr = {"分享", "举报", "删帖", "加精", "收录至话题", "移除话题", "置顶"};
        while (i4 < 7) {
            int i5 = iArr[i4];
            String str = strArr[i4];
            c0 c0Var = new c0();
            if (i5 == 7) {
                if (this.G1.is_best_allow()) {
                    if (this.G1.getBest() == 1) {
                        str = "取消精华";
                    }
                    c0Var.f30683d = this.G1.getBest() == 1;
                    c0Var.f30680a = i5;
                    c0Var.f30681b = str;
                    this.E2.a(c0Var);
                }
            } else if (i5 == 6) {
                i4 = this.G1.is_del_allow() ? 0 : i4 + 1;
                c0Var.f30680a = i5;
                c0Var.f30681b = str;
                this.E2.a(c0Var);
            } else if (i5 == 8) {
                if (!this.G1.is_add_tag_allow()) {
                }
                c0Var.f30680a = i5;
                c0Var.f30681b = str;
                this.E2.a(c0Var);
            } else if (i5 == 9) {
                if (!this.G1.is_remove_tag_allow()) {
                }
                c0Var.f30680a = i5;
                c0Var.f30681b = str;
                this.E2.a(c0Var);
            } else if (i5 == 10) {
                if (this.G1.is_first()) {
                    if (this.G1.getFirst() == 1) {
                        str = "取消置顶";
                    }
                    c0Var.f30684e = this.G1.getFirst() == 1;
                    c0Var.f30680a = i5;
                    c0Var.f30681b = str;
                    this.E2.a(c0Var);
                }
            } else {
                if (i5 == 1) {
                    c0Var.f30682c = this.G1.is_favorite();
                } else if (i5 == 3) {
                    if (!this.B1.equals("asc")) {
                    }
                } else if (i5 == 4 && !this.B1.equals("desc")) {
                }
                c0Var.f30680a = i5;
                c0Var.f30681b = str;
                this.E2.a(c0Var);
            }
        }
        this.E2.notifyDataSetChanged();
    }

    private void p1() {
        this.f30644x2 = new ArrayList();
        f0 f0Var = new f0(this);
        this.f30642w2 = f0Var;
        f0Var.c(this.f30644x2);
        this.f30642w2.f(new b());
        this.f30641w.setAdapter((ListAdapter) this.f30642w2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p2() {
        boolean is_praise = this.G1.is_praise();
        int praise = this.G1.getPraise();
        this.G1.setPraise(is_praise ? praise - 1 : praise + 1);
        this.G1.setIs_praise(!is_praise);
        y1(this.G1.is_praise(), this.G1.getPraise());
    }

    private void q1() {
        this.f30591g.setVisibility(8);
        l2();
        String str = (String) getIntent().getSerializableExtra(f30571x3);
        if (!com.join.mgps.Util.g2.h(str)) {
            this.G1 = (ForumBean.ForumPostsBean) JsonMapper.getInstance().fromJson(str, JsonMapper.getInstance().createCollectionType(ForumBean.ForumPostsBean.class, new Class[0]));
        }
        if (this.G1 == null) {
            Z0();
            return;
        }
        this.Y1 = new com.join.android.app.component.video.c(this, "ForumPostsVideoHelper");
        this.G.setLayoutManager(new LinearLayoutManager(this));
        this.G.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.G.setLoadingListener(new t());
        ForumCommentAdapter forumCommentAdapter = new ForumCommentAdapter(this);
        this.N = forumCommentAdapter;
        forumCommentAdapter.T(this.Z1);
        this.G.setAdapter(this.N);
        this.J1 = new ArrayList();
        this.I1 = new ArrayList();
        this.M = new ForumPostsAdapter(this, this.Y1);
        this.K.setLayoutManager(new LinearLayoutManager(this));
        this.K.setAdapter(this.M);
        this.I.setForumStickViewListener(this);
        this.H.setOnVerticalScrollChangeListener(new u());
        this.f30577b2 = new com.join.mgps.dialog.w0(this);
        H0();
        try {
            ((KeyboardListenLayout) this.f30576b.getParent()).setOnSoftKeyboardListener(new v());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f30603k.setOnFocusChangeListener(new w());
        SpannableString spannableString = new SpannableString("每次最多可以分享9张图");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), 8, 9, 33);
        this.f30626r.setText(spannableString);
        p1();
        m1();
    }

    private void receiveDelete(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.f30599i3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f30590f3.remove(next.getCrc_link_type_val());
                    it2.remove();
                    break;
                }
            }
            D1(downloadTask, 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f30590f3;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            D1(downloadTask, 3);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.f30599i3, downloadTask);
        if (!this.f30590f3.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f30599i3.add(downloadTask);
            this.f30590f3.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        D1(downloadTask, 0);
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f30590f3;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f30599i3.add(downloadTask);
            this.f30590f3.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f30590f3.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        D1(downloadTask, 1);
    }

    private void s2() {
        if (!isLogined(this)) {
            showMessage(getString(R.string.forum_user_not_login));
        } else if (!T2()) {
            L2(-1);
            B2();
        } else {
            ForumRequestBean.ForumCommentReplyRequestBean Y = com.join.mgps.Util.j0.Y(this, this.U1, this.W1, this.V1);
            Y.setDevice_id("");
            ForumResponse<ForumData.ForumCommentReplyReplyData> J = this.E1.J(Y.getParams());
            if (J == null) {
                L2(1);
            } else if (J.getError() == 706) {
                M2(getString(R.string.tour_perfect_info_for_comment_toast));
                B2();
            } else {
                ForumData.ForumCommentReplyReplyData data = J.getData();
                if (data.isResult()) {
                    L2(2);
                    ForumBean.ForumCommentReplyBean forumCommentReplyBean = new ForumBean.ForumCommentReplyBean();
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    forumCommentReplyBean.setUid(T.getUid());
                    forumCommentReplyBean.setNickname(T.getNickname());
                    forumCommentReplyBean.setMessage(Y.getMessage());
                    forumCommentReplyBean.setAdd_time(System.currentTimeMillis() / 1000);
                    forumCommentReplyBean.setRrid(this.V1);
                    if (this.V1 != 0) {
                        forumCommentReplyBean.setRid(data.getRid());
                        W1(forumCommentReplyBean);
                        K2(RewardType.REPLY_POST, data.getReward_money(), data.getReward_exp());
                    }
                } else if (data.getError_type() == 1) {
                    P0();
                    H2(data.getError_type());
                } else if (!TextUtils.isEmpty(data.getMsg())) {
                    P0();
                    M2(data.getMsg());
                } else {
                    L2(1);
                }
            }
        }
    }

    private void t2() {
        if (!isLogined(this)) {
            showMessage(getString(R.string.forum_user_not_login));
        } else if (!T2()) {
            L2(-1);
            B2();
        } else {
            ForumRequestBean.ForumCommentReplyRequestBean Y = com.join.mgps.Util.j0.Y(this, this.U1, this.W1, this.V1);
            Y.setDevice_id("");
            ForumResponse<ForumData.ForumCommentReplyData> l02 = this.E1.l0(Y.getParams());
            if (l02 == null) {
                L2(1);
            } else if (l02.getError() == 706) {
                M2(getString(R.string.tour_perfect_info_for_comment_toast));
                B2();
            } else {
                ForumData.ForumCommentReplyData data = l02.getData();
                if (data.isResult()) {
                    L2(2);
                    ForumBean.ForumCommentReplyBean forumCommentReplyBean = new ForumBean.ForumCommentReplyBean();
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    forumCommentReplyBean.setUid(T.getUid());
                    forumCommentReplyBean.setNickname(T.getNickname());
                    forumCommentReplyBean.setMessage(Y.getMessage());
                    forumCommentReplyBean.setAdd_time(System.currentTimeMillis() / 1000);
                    forumCommentReplyBean.setRrid(this.V1);
                    forumCommentReplyBean.setRid(data.getRid());
                    V1(forumCommentReplyBean);
                    K2(RewardType.REPLY_POST, data.getReward_money(), data.getReward_exp());
                } else if (data.getError_type() == 1) {
                    P0();
                    H2(data.getError_type());
                } else if (!TextUtils.isEmpty(data.getMsg())) {
                    P0();
                    M2(data.getMsg());
                } else {
                    L2(1);
                }
            }
        }
    }

    private void u1() {
        E0(18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1(boolean z4) {
        E0(0);
        this.G.reset();
        u1();
        if (com.join.android.app.common.utils.j.j(this)) {
            v1(z4, true, 1);
            return;
        }
        M2(getString(R.string.net_connect_failed));
        E0(17);
    }

    private void w2(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new d(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        if (!com.join.mgps.Util.j0.Y0(this)) {
            com.join.mgps.Util.l2.a(this).b("用户未登录，请登录");
            com.join.mgps.Util.j0.L0(this);
        } else if (!T2()) {
            L2(-1);
            B2();
        } else {
            this.f30606l.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_reset));
            p2();
            Q1();
        }
    }

    void A1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A2(ForumBean.ForumPostsBean forumPostsBean) {
        if (forumPostsBean == null) {
            return;
        }
        View findViewById = findViewById(R.id.bottom);
        com.join.mgps.customview.c z4 = com.join.mgps.customview.c.z(this);
        z4.m(this.I2);
        z4.p(findViewById, forumPostsBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        String obj = this.f30603k.getText().toString();
        this.W1 = obj;
        if (com.join.mgps.Util.g2.h(obj)) {
            M2("回复内容不能为空");
            return;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (!com.join.mgps.Util.g2.h(accountData.getNickname()) && (!accountData.getAccount().equals(accountData.getNickname()) || !accountData.getAccount().startsWith("pa"))) {
            int i4 = this.X1;
            if (i4 == 1) {
                q2();
                return;
            } else if (i4 == 2) {
                r2();
                return;
            } else if (i4 == 4) {
                r2();
                return;
            } else {
                return;
            }
        }
        IntentUtil.getInstance().goChangeNickname(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B1(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B2() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void C0() {
        this.f30609m.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_reset));
        k2();
        R0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C1(String str) {
    }

    void C2() {
        this.f30632t.setVisibility(0);
        this.f30635u.setVisibility(0);
        this.f30638v.setVisibility(8);
        hideSystemKeyBoard(this.f30638v);
        this.v2 = true;
    }

    @UiThread
    public void D0(boolean z4) {
    }

    void D1(DownloadTask downloadTask, int i4) {
    }

    void D2() {
        this.f30632t.setVisibility(0);
        this.f30635u.setVisibility(8);
        this.f30638v.setVisibility(0);
        hideSystemKeyBoard(this.f30638v);
        this.v2 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(int i4) {
        try {
            int i5 = this.f30607l2;
            if (i5 == 32) {
                return;
            }
            if (i4 == 32) {
                this.f30607l2 = 32;
                this.f30588f.l(2);
            } else if (i4 == 0) {
                this.f30607l2 = 0;
                this.f30588f.o();
                this.f30588f.l(1);
            } else {
                this.f30607l2 = i4 | i5;
                CustomLoadingView customLoadingView = this.f30588f;
                customLoadingView.setListener(new x(customLoadingView));
                if (G0(-11)) {
                    this.f30607l2 = 16;
                    this.f30588f.l(9);
                } else if (G0(22)) {
                    this.f30607l2 = 16;
                    this.f30588f.setFailedMsg("该贴已经删除~");
                    this.f30588f.l(10);
                } else {
                    if (!G0(31) && !G0(26)) {
                        if (G0(17)) {
                            this.f30607l2 = 16;
                            this.f30588f.l(9);
                        }
                    }
                    this.f30607l2 = 16;
                    this.f30588f.setFailedMsg("加载失败，再试试吧~");
                    this.f30588f.l(16);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void E1(int i4, int i5) {
        if (getResources().getConfiguration().orientation == 2) {
            ViewCompat.setTranslationY(this.P2, -this.P2.getTop());
            return;
        }
        this.f30578b3 = i4;
        this.f30581c3 = i5;
        com.join.mgps.Util.w0.e("offsetContainer", "mTop=" + this.f30578b3, "mOffsetY=" + this.f30581c3);
        ViewCompat.setTranslationY(this.P2, (float) this.f30581c3);
    }

    void F0() {
        if ((this.f30636u2 && this.v2) || this.f30633t2) {
            return;
        }
        H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_more})
    public void F1() {
        if (this.f30616o2 == null) {
            m1();
        }
        if (this.f30616o2.isShowing()) {
            this.f30616o2.dismiss();
        } else {
            E2(this.J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F2() {
    }

    boolean G0(int i4) {
        return (this.f30607l2 & i4) == i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void G1(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
    }

    synchronized void G2(int i4) {
        List<ForumBean.ForumGagType> list = this.f30630s2;
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f30630s2);
            if (this.f30622p3 == null) {
                this.f30622p3 = new e0(this);
            }
            e0 e0Var = this.f30622p3;
            e0Var.a(i4 + "");
            this.f30622p3.b(arrayList);
            if (this.f30622p3.isShowing()) {
                return;
            }
            this.f30622p3.show();
        }
    }

    @Override // com.join.mgps.customview.ForumStickView.e
    public void H() {
        M1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0() {
        this.f30629s.setVisibility(8);
        this.W1 = "";
        this.T1 = this.G1.getPid();
        this.U1 = -1;
        this.V1 = -1;
        this.X1 = 1;
        this.f30606l.setVisibility(0);
        this.f30609m.setVisibility(0);
        this.f30612n.setVisibility(8);
        this.f30603k.setText("");
        this.f30603k.setHint("添加评论");
        this.f30603k.clearFocus();
        hideSystemKeyBoard(this.f30603k);
        i2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.rl_comment_count})
    public void H1() {
        this.H.c0(this.I);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H2(int i4) {
    }

    void I0() {
        if (this.I1 == null) {
            return;
        }
        System.gc();
    }

    void I1() {
        MyVideoView myVideoView = this.R2;
        if (myVideoView.isPlaying() && (myVideoView != null)) {
            this.R2.pause();
            this.T2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void J0(int i4) {
        try {
            try {
                if (com.join.android.app.common.utils.j.j(this)) {
                    ForumRequestBean.ForumCommentDeleteRequestBean W = com.join.mgps.Util.j0.W(this, i4);
                    ForumResponse<ForumData.ForumCommentDeleteData> forumResponse = null;
                    if (W != null) {
                        W.setDevice_id("");
                        forumResponse = this.E1.d0(W.getParams());
                    }
                    if (forumResponse == null) {
                        if (!com.join.mgps.Util.j0.Y0(this)) {
                            com.join.mgps.Util.j0.L0(this);
                        }
                        M2("评论删除失败");
                    } else if (forumResponse.getData().isResult()) {
                        M2("评论已删除");
                        S1(i4);
                    } else {
                        M2("评论删除失败");
                    }
                } else {
                    M2(getString(R.string.net_connect_failed));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                M2("评论删除失败");
            }
        } finally {
            H0();
        }
    }

    void J1(String str, String str2) {
        String str3 = this.X2;
        if (str3 != null && str3.equals(str) && this.R2.isPlaying()) {
            I1();
            return;
        }
        MyVideoView myVideoView = this.R2;
        if (myVideoView != null) {
            if (myVideoView.E() && this.X2.equals(str)) {
                this.R2.seekTo(0);
                resume();
            } else {
                this.R2.G();
            }
        }
        this.X2 = str;
        this.Y2 = str2;
        if (com.join.mgps.Util.g2.h(str)) {
            O2();
            return;
        }
        this.S2.setVisibility(8);
        this.T2.setVisibility(8);
        L1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J2(int i4, int i5) {
        try {
            if (this.f30574a2 == null) {
                com.join.mgps.dialog.v0 v0Var = new com.join.mgps.dialog.v0(this);
                this.f30574a2 = v0Var;
                v0Var.f("确定");
                this.f30574a2.d("取消");
                this.f30574a2.b(8);
                this.f30574a2.g("确定要删除该评论吗？").c(new y());
                this.f30574a2.setCancelable(true);
                this.f30574a2.setOnCancelListener(new z());
            }
            int i6 = this.X1;
            if (i6 == 17) {
                this.f30574a2.g("确定要删除该评论吗？");
            } else {
                if (i6 != 18 && i6 != 20) {
                    if (i6 == 33) {
                        this.f30574a2.g("确定要举报该评论吗？");
                    } else if (i6 == 34 || i6 == 36) {
                        this.f30574a2.g("确定要举报该回复吗？");
                    }
                }
                this.f30574a2.g("确定要删除该回复吗？");
            }
            this.f30574a2.e(new a(i4, i5));
            if (this.f30574a2.isShowing()) {
                return;
            }
            this.f30574a2.show();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void K0(int i4) {
        if (i4 == 0) {
            return;
        }
        try {
            ForumRequestBean.ForumCommentReplyDeleteRequestBean X = com.join.mgps.Util.j0.X(this, i4);
            ForumResponse<ForumData.ForumCommentReplyDeleteData> forumResponse = null;
            if (X != null) {
                X.setDevice_id("");
                forumResponse = this.E1.A(X.getParams());
            }
            if (forumResponse == null) {
                if (com.join.mgps.Util.j0.Y0(this)) {
                    return;
                }
                com.join.mgps.Util.j0.L0(this);
            } else if (forumResponse.getData().isResult()) {
                Y1(i4);
                M2("回复已删除");
            } else {
                M2("回复删除失败");
            }
        } catch (Exception e5) {
            M2("回复删除失败");
            e5.printStackTrace();
        }
    }

    void K1(boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_PLAY_BACKGROUND.name());
        bundle.putStringArray("key_mediacmd_params", new String[]{String.valueOf(z4)});
        callbackPlayVideo(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K2(RewardType rewardType, int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void L0() {
        ForumData.ForumPostsDeleteData data;
        if (com.join.android.app.common.utils.j.j(this)) {
            boolean z4 = true;
            if (this.L2) {
                return;
            }
            this.L2 = true;
            int pid = this.G1.getPid();
            try {
                try {
                    if (com.join.mgps.Util.j0.c0(this, pid) != null) {
                        ForumResponse<ForumData.ForumPostsDeleteData> q02 = this.E1.q0(com.join.mgps.Util.j0.c0(this, pid).getParams());
                        if (q02 == null || q02.getError() != 0 || (data = q02.getData()) == null || !data.isResult()) {
                            z4 = false;
                        }
                        if (z4) {
                            M2("帖子删除成功");
                            Z0();
                        } else {
                            M2("帖子删除失败");
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                this.L2 = false;
            }
        }
        M2(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L2(int i4) {
        try {
            if (this.f30577b2 == null) {
                this.f30577b2 = new com.join.mgps.dialog.w0(this);
            }
            this.f30577b2.c(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void M1() {
        if (this.f30607l2 == 0) {
            return;
        }
        if (this.A1 == 0) {
            this.A1 = 1;
        } else {
            this.A1 = 0;
        }
        l2();
        this.f30607l2 = 0;
        this.f30583d2 = 0;
        this.f30580c2 = 0;
        w1(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M2(CharSequence charSequence) {
        Toast.makeText(this, charSequence, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void N1() {
        if (this.f30616o2 == null) {
            m1();
        }
        if (this.f30616o2.isShowing()) {
            this.f30616o2.dismiss();
        } else {
            E2(this.f30576b);
        }
    }

    void O0() {
        a0 a0Var = this.f30616o2;
        if (a0Var == null || !a0Var.isShowing()) {
            return;
        }
        this.f30616o2.dismiss();
    }

    void O1() {
        if (this.f30607l2 == 0) {
            return;
        }
        if (this.B1.equals("asc")) {
            this.B1 = "desc";
        } else {
            this.B1 = "asc";
        }
        m2();
        this.f30607l2 = 0;
        this.f30583d2 = 0;
        w1(false);
    }

    void O2() {
        MyVideoView myVideoView = this.R2;
        if (myVideoView != null) {
            myVideoView.seekTo(0);
            this.R2.I();
            this.W2 = -1;
            this.R2.G();
            this.U2.setVisibility(8);
            MediaController mediaController = this.V2;
            if (mediaController != null) {
                mediaController.setVisibility(8);
            }
            this.T2.setVisibility(0);
            if (getResources().getConfiguration().orientation == 1) {
                this.P2.setVisibility(8);
                this.f30575a3 = false;
                return;
            }
            R2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0() {
        try {
            com.join.mgps.dialog.w0 w0Var = this.f30577b2;
            if (w0Var == null || !w0Var.isShowing()) {
                return;
            }
            this.f30577b2.dismiss();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void P1(String str, int i4, String str2) {
        ForumData.ForumResult data;
        if (com.join.android.app.common.utils.j.j(this)) {
            boolean z4 = true;
            if (this.f30617o3) {
                return;
            }
            this.f30617o3 = true;
            this.G1.getPid();
            String uid = AccountUtil_.getInstance_(this).getUid();
            String token = AccountUtil_.getInstance_(this).getToken();
            ForumRequestBean.PostGagRequestBean postGagRequestBean = new ForumRequestBean.PostGagRequestBean();
            postGagRequestBean.setUid(uid);
            postGagRequestBean.setToken(token);
            postGagRequestBean.setGag_uid(str);
            postGagRequestBean.setGag_time(i4);
            postGagRequestBean.setRemarks(str2);
            try {
                try {
                    ForumResponse<ForumData.ForumResult> v02 = this.E1.v0(postGagRequestBean.getParams());
                    if (v02 == null || v02.getError() != 0 || (data = v02.getData()) == null || !data.isResult()) {
                        z4 = false;
                    }
                    if (z4) {
                        M2("禁言成功");
                    } else {
                        String msg = (v02 == null || v02.getData() == null) ? "" : v02.getData().getMsg();
                        if (!TextUtils.isEmpty(msg)) {
                            M2(msg);
                        } else {
                            M2("禁言失败");
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                this.f30617o3 = false;
            }
        }
        M2(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P2() {
        this.G.stopRefresh();
        this.G.stopLoadMore();
        if (this.f30583d2 == -1) {
            this.G.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.M2) {
                return;
            }
            int i4 = 1;
            this.M2 = true;
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            try {
                ForumBean.ForumPostsBean forumPostsBean2 = this.G1;
                if (forumPostsBean2 != null) {
                    forumPostsBean = (ForumBean.ForumPostsBean) forumPostsBean2.clone();
                }
            } catch (CloneNotSupportedException e5) {
                e5.printStackTrace();
            }
            try {
                try {
                } catch (Exception e6) {
                    ForumBean.ForumPostsBean forumPostsBean3 = this.G1;
                    if (forumPostsBean3 != null) {
                        forumPostsBean3.setBest(forumPostsBean.getBest());
                        j2();
                    }
                    M2(getString(R.string.forum_post_best_fail));
                    e6.printStackTrace();
                }
                if (!com.join.mgps.Util.j0.Y0(this)) {
                    com.join.mgps.Util.j0.L0(this);
                    M2(getString(R.string.forum_user_not_login));
                    this.M2 = false;
                    return;
                }
                com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                ForumResponse<ForumData.ForumPostsBestData> r02 = this.E1.r0(new ForumRequestBean.ForumPostsFavoritesRequestBean(T.getUid(), T.getToken(), forumPostsBean.getPid(), "").getParams());
                if (r02 != null) {
                    int error = r02.getError();
                    if (error == 0) {
                        ForumData.ForumPostsBestData data = r02.getData();
                        if (data != null) {
                            if (data.isResult()) {
                                boolean z4 = data.getBest() == 1;
                                if (z4) {
                                    M2(getString(R.string.forum_post_best_success));
                                } else {
                                    M2(getString(R.string.forum_post_debest_success));
                                }
                                if (!z4) {
                                    i4 = 0;
                                }
                                forumPostsBean.setBest(i4);
                            } else if (com.join.mgps.Util.g2.i(data.getMessage())) {
                                M2(data.getMessage());
                            }
                        } else {
                            M2(getString(R.string.forum_post_best_fail));
                        }
                    } else if (error == 701) {
                        M2(getString(R.string.forum_user_login_invalid));
                    }
                } else {
                    M2(getString(R.string.forum_post_best_fail));
                }
                ForumBean.ForumPostsBean forumPostsBean4 = this.G1;
                if (forumPostsBean4 != null) {
                    forumPostsBean4.setBest(forumPostsBean.getBest());
                    j2();
                }
                return;
            } finally {
                this.M2 = false;
            }
        }
        M2(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q1() {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                M2("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this, this.T1);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.E1.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                p2();
                B2();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            boolean is_praise = this.G1.is_praise();
            if (data.isResult()) {
                if (is_praise) {
                    M2("点赞成功");
                } else {
                    M2("取消点赞成功");
                }
            } else if (is_praise) {
                M2("点赞失败");
            } else {
                M2("取消点赞失败");
            }
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void Q2(ForumRequestBean.ForumPostsCommentRequestBean forumPostsCommentRequestBean) {
        try {
            if (!isLogined(this)) {
                showMessage(getString(R.string.forum_user_not_login));
            } else if (!T2()) {
                L2(-1);
                B2();
            } else if (forumPostsCommentRequestBean != null) {
                forumPostsCommentRequestBean.setDevice_id("");
                ForumResponse<ForumData.ForumPostsCommentData> z02 = this.E1.z0(forumPostsCommentRequestBean.getParams1());
                if (z02 != null) {
                    int error = z02.getError();
                    if (error == 706) {
                        L2(-1);
                        M2(getString(R.string.tour_perfect_info_for_comment_toast));
                        B2();
                        return;
                    } else if (error == 701) {
                        f2();
                    }
                }
                d2(forumPostsCommentRequestBean, z02);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            L2(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void R0() {
        if (this.H2) {
            return;
        }
        this.H2 = true;
        ForumBean.ForumPostsBean forumPostsBean = this.G1;
        forumPostsBean.setIs_favorite(true ^ forumPostsBean.is_favorite());
        k2();
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                } catch (Exception e5) {
                    a2();
                    M2("帖子收藏失败");
                    e5.printStackTrace();
                }
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    a2();
                    return;
                }
                com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                ForumRequestBean.ForumPostsFavoritesRequestBean forumPostsFavoritesRequestBean = new ForumRequestBean.ForumPostsFavoritesRequestBean(T.getUid(), T.getToken(), this.G1.getPid(), "");
                int y2 = com.join.android.app.common.utils.n.n(this).y();
                String z4 = com.join.android.app.common.utils.n.n(this).z();
                forumPostsFavoritesRequestBean.setApp_ver(y2 + "_" + z4);
                ForumResponse<ForumData.ForumPostsFavoritesData> k02 = this.E1.k0(forumPostsFavoritesRequestBean.getParams());
                if (k02 != null) {
                    int error = k02.getError();
                    if (error == 0) {
                        ForumData.ForumPostsFavoritesData data = k02.getData();
                        if (data != null) {
                            this.G1.setIs_favorite(data.isFavorites());
                            k2();
                            if (data.isFavorites()) {
                                M2("帖子已收藏");
                            } else {
                                M2("帖子已取消收藏");
                            }
                            com.join.mgps.Util.j0.f1(this.G1.getPid(), data.isFavorites());
                        } else {
                            a2();
                            M2("帖子收藏失败");
                        }
                    } else if (error == 701) {
                        a2();
                        M2("用户验证失效，请重新登录！");
                    }
                } else {
                    a2();
                    M2("帖子收藏失败");
                }
                k2();
                return;
            }
            M2(getString(R.string.net_connect_failed));
            E0(17);
        } finally {
            this.H2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void R1(ListView listView, int i4, int i5, int i6) {
        if (i5 == i6 - 1 || this.B2) {
            return;
        }
        try {
            try {
                this.B2 = true;
                ArrayList arrayList = new ArrayList();
                for (int i7 = i5 + 1; i7 < this.I1.size(); i7++) {
                    Object itemAtPosition = listView.getItemAtPosition(i5);
                    if (itemAtPosition instanceof ForumPostsAdapter.e0.k) {
                        arrayList.add(((ForumPostsAdapter.e0.k) itemAtPosition).f41082a);
                    } else if (itemAtPosition instanceof ForumPostsAdapter.e0.p) {
                        arrayList.add(((ForumPostsAdapter.e0.p) itemAtPosition).f41105a);
                    } else if (itemAtPosition instanceof ForumPostsAdapter.e0.l) {
                        arrayList.addAll(((ForumPostsAdapter.e0.l) itemAtPosition).f41085a);
                    } else if (itemAtPosition instanceof ForumPostsAdapter.e0.b) {
                        arrayList.add(((ForumPostsAdapter.e0.b) itemAtPosition).f41015a);
                    }
                }
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    MyImageLoader.k((String) arrayList.get(i8));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            this.B2 = false;
        }
    }

    void R2() {
        MyVideoView myVideoView = this.R2;
        if (myVideoView != null) {
            myVideoView.setFullScreen(!this.Z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void S0() {
        IntentUtil intentUtil = IntentUtil.getInstance();
        intentUtil.goShareWebActivity(this, com.join.mgps.rpc.h.f54059k + "/group/posts/forum_report/index?pid=" + this.G1.getPid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void S1(int i4) {
        try {
            if (this.G1.getCommit() > 0) {
                ForumBean.ForumPostsBean forumPostsBean = this.G1;
                forumPostsBean.setCommit(forumPostsBean.getCommit() - 1);
                i2();
            }
            z1(false);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void T0(int i4, int i5) {
        IntentUtil intentUtil = IntentUtil.getInstance();
        intentUtil.goShareWebActivity(this, com.join.mgps.rpc.h.f54059k + "/group/posts/forum_report/index?pid=" + this.G1.getPid() + "&cid=" + i4 + "&rid=" + i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T1(int i4) {
        try {
            this.G1.setSolve_flg(1);
            int i5 = 0;
            while (true) {
                if (i5 >= this.N.getItemCount()) {
                    break;
                }
                ForumCommentAdapter.z zVar = (ForumCommentAdapter.z) this.N.getItem(i5);
                if (zVar.a() instanceof ForumBean.ForumCommentBean) {
                    ForumBean.ForumCommentBean forumCommentBean = (ForumBean.ForumCommentBean) zVar.a();
                    if (forumCommentBean.getPid() == i4) {
                        forumCommentBean.setAnswer_flg(1);
                        break;
                    }
                }
                i5++;
            }
            z1(false);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    boolean T2() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void U1(List<ForumBean.ForumCommentBean> list, int i4) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        try {
                            X2(list.get(i5), false);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                return;
            }
        }
        this.N.setNewData(this.I1);
        i2();
        P2();
        x1();
    }

    public void U2(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.G.setVisibility(4);
        } else {
            this.G.setVisibility(0);
        }
    }

    void V0() {
        IntentUtil.getInstance().goForumPostsTagSelectActivity(this, 1, this.G1.getPid(), JsonMapper.getInstance().toJson(this.G1.getEmploy_tags()), this.G1.getPost_type());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V1(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        int i4 = 0;
        while (true) {
            try {
                if (i4 >= this.N.getItemCount()) {
                    break;
                }
                ForumCommentAdapter.z zVar = (ForumCommentAdapter.z) this.N.getItem(i4);
                if (zVar.a() instanceof ForumBean.ForumCommentBean) {
                    ForumBean.ForumCommentBean forumCommentBean = (ForumBean.ForumCommentBean) zVar.a();
                    if (forumCommentReplyBean.getRrid() == 0 && this.U1 == forumCommentBean.getPid()) {
                        List<ForumBean.ForumCommentReplyBean> reply_list = forumCommentBean.getReply_list();
                        if (reply_list == null) {
                            reply_list = new ArrayList<>();
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(reply_list);
                        arrayList.add(forumCommentReplyBean);
                        forumCommentBean.setReply_list(arrayList);
                    }
                }
                i4++;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        ForumBean.ForumPostsBean forumPostsBean = this.G1;
        forumPostsBean.setCommit(forumPostsBean.getCommit() + 1);
        i2();
        com.join.mgps.Util.l2.a(this).b("评论成功，内容将在审核后显示");
        z1(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V2(RecyclerView recyclerView, int i4, int i5, int i6) {
        A1();
    }

    void W0() {
        IntentUtil.getInstance().goForumPostsTagSelectActivity(this, 2, this.G1.getPid(), JsonMapper.getInstance().toJson(this.G1.getTag_list()), this.G1.getPost_type());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W1(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        for (int i4 = 0; i4 < this.N.getItemCount(); i4++) {
            try {
                ForumCommentAdapter.z zVar = (ForumCommentAdapter.z) this.N.getItem(i4);
                if (zVar.a() instanceof ForumBean.ForumCommentBean) {
                    ForumBean.ForumCommentBean forumCommentBean = (ForumBean.ForumCommentBean) zVar.a();
                    if (this.U1 == forumCommentBean.getPid()) {
                        List<ForumBean.ForumCommentReplyBean> reply_list = forumCommentBean.getReply_list();
                        if (reply_list != null && reply_list.size() != 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(reply_list);
                            int i5 = 0;
                            while (true) {
                                if (i5 < reply_list.size()) {
                                    ForumBean.ForumCommentReplyBean forumCommentReplyBean2 = reply_list.get(i5);
                                    if (forumCommentReplyBean2.getRid() == forumCommentReplyBean.getRrid()) {
                                        forumCommentReplyBean.setRuid(forumCommentReplyBean2.getUid());
                                        forumCommentReplyBean.setRnickname(forumCommentReplyBean2.getNickname());
                                        arrayList.add(forumCommentReplyBean);
                                        reply_list.clear();
                                        reply_list.addAll(arrayList);
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        forumCommentReplyBean.setRuid(forumCommentBean.getUid());
                        forumCommentReplyBean.setRnickname(forumCommentBean.getNickname());
                        arrayList2.add(forumCommentReplyBean);
                        forumCommentBean.setReply_list(arrayList2);
                        break;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("评论成功，内容将在审核后显示");
        z1(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W2(RecyclerView recyclerView, int i4) {
        if (i4 == 0) {
            this.Y1.k(recyclerView, i4);
            K1(!s1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.f30602j3 == 1) {
                return;
            }
            try {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                    ResultMainBean<List<DetailResultBean>> R = this.f30627r2.R(RequestBeanUtil.getInstance(this).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                    if (R != null && R.getFlag() != 0) {
                        List<DetailResultBean> data = R.getMessages().getData();
                        if (data.size() != 0) {
                            DetailResultBean detailResultBean = data.get(0);
                            if (this.f30605k3) {
                                startDown(detailResultBean);
                            }
                        }
                    } else if (R != null && R.getFlag() != 0) {
                        M2("获取游戏信息失败");
                    } else {
                        M2("获取游戏信息失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    M2("获取游戏信息失败");
                }
                return;
            } finally {
                this.f30602j3 = 0;
                this.f30605k3 = false;
            }
        }
        M2("获取游戏信息失败");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X1(ForumBean.ForumCommentBean forumCommentBean) {
        try {
            z1(false);
            com.join.mgps.Util.l2.a(this).b("评论成功，内容将在审核后显示");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void X2(ForumBean.ForumCommentBean forumCommentBean, boolean z4) {
        if (forumCommentBean == null || this.G1 == null) {
            return;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        boolean z5 = forumCommentBean.getForum_auth() == 1;
        boolean isOfficialAccount = forumCommentBean.isOfficialAccount();
        boolean z6 = this.G1.getHelp() == 1;
        boolean z7 = this.G1.getSolve_flg() == 1;
        int auth = this.G1.getAuth();
        boolean z8 = accountData != null && accountData.getUid() == this.G1.getUid();
        boolean z9 = accountData != null && forumCommentBean.getUid() == accountData.getUid();
        boolean z10 = forumCommentBean.getUid() == this.G1.getUid();
        boolean z11 = z9;
        this.I1.add(new ForumCommentAdapter.z(ForumCommentAdapter.ViewType.COMMENT_HEADER, new ForumCommentAdapter.z.a(z4, forumCommentBean.getUid(), forumCommentBean.getPid(), forumCommentBean.getAvatar_src(), forumCommentBean.getNickname(), forumCommentBean.getAdd_time(), z10, forumCommentBean.getFloor(), z5, isOfficialAccount, forumCommentBean.getAnswer_flg(), z6 && !z7 && z8 && !z9, !z9, auth == 3 || auth == 99 || z9 || z8, forumCommentBean.getVip_level(), forumCommentBean.getSvip_level(), forumCommentBean.is_moderator(), forumCommentBean.getMember_honor())));
        this.I1.add(new ForumCommentAdapter.z(ForumCommentAdapter.ViewType.COMMENT_MESSAGE, new ForumCommentAdapter.z.c(forumCommentBean.getPid(), forumCommentBean.getMessage(), forumCommentBean.getNickname(), forumCommentBean.getUid(), !z11, auth == 3 || auth == 99 || z11)));
        for (int i4 = 0; forumCommentBean.getPic_list() != null && i4 < forumCommentBean.getPic_list().size(); i4++) {
            this.I1.add(new ForumCommentAdapter.z(ForumCommentAdapter.ViewType.COMMENT_IMAGE, new ForumCommentAdapter.z.b(forumCommentBean.getPic_list().get(i4), i4, forumCommentBean.getRaw_pic_list())));
        }
        this.I1.add(new ForumCommentAdapter.z(ForumCommentAdapter.ViewType.COMMENT_MESSAGE_REPLY, new ForumCommentAdapter.z.d(forumCommentBean.getPid(), forumCommentBean, auth, forumCommentBean.getReply_list() != null && forumCommentBean.getReply_list().size() > 0, z8)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y1(int i4) {
    }

    @Override // com.join.mgps.customview.ForumStickView.e
    public void Z() {
        TextView textView = (TextView) findViewById(R.id.tv_sort);
        if (textView != null) {
            showSortPop(textView);
        }
    }

    void a1() {
        if (getResources().getConfiguration().orientation == 2) {
            this.Z2 = false;
            N2();
            z2();
            E1(0, 0);
            return;
        }
        this.Z2 = true;
        i1();
        o2();
    }

    void a2() {
        ForumBean.ForumPostsBean forumPostsBean = this.G1;
        if (forumPostsBean == null) {
            return;
        }
        forumPostsBean.setIs_favorite(!forumPostsBean.is_favorite());
        l2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.E1 = com.join.mgps.rpc.impl.g.A0();
        this.f30621p2 = com.join.mgps.rpc.impl.a.c0();
        try {
            l1();
            q1();
            w1(true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    String b1(String str, String str2) {
        if (com.join.mgps.Util.g2.h(str2)) {
            return null;
        }
        if (str2.startsWith(com.facebook.common.util.f.f10923a) || str2.startsWith(str)) {
            return str2;
        }
        return str + str2;
    }

    void b2(ForumBean.GameInfo gameInfo) {
        this.H1 = gameInfo;
        if (gameInfo != null) {
            try {
                DownloadTask F = p1.f.K().F(gameInfo.getGame_id());
                this.H1.setDownloadTask(F);
                Map<String, DownloadTask> map = this.f30590f3;
                if (map == null || F == null || map.containsKey(F.getCrc_link_type_val())) {
                    return;
                }
                this.f30599i3.add(F);
                this.f30590f3.put(F.getCrc_link_type_val(), F);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        if (this.v2) {
            z0();
        } else if (this.f30633t2) {
            H0();
        } else {
            y2();
            Z0();
        }
    }

    void c2(ForumBean.ForumPostsBean forumPostsBean) {
        this.G1 = forumPostsBean;
        if (forumPostsBean != null) {
            y1(forumPostsBean.is_praise(), this.G1.getPraise());
            k2();
        }
        if (forumPostsBean != null) {
            b2(forumPostsBean.getRelation_game());
        }
    }

    void callbackPlayVideo(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("key_mediacmd");
        Object[] objArr = (Object[]) bundle.get("key_mediacmd_params");
        com.join.mgps.Util.w0.e("callbackPlayVideo", "cmd=" + string, "params=" + objArr.toString());
        if (string.equals(MediaCmd.CMD_PLAY.name())) {
            String str = null;
            String str2 = null;
            for (int i4 = 0; i4 < objArr.length; i4++) {
                String str3 = (String) objArr[i4];
                if (i4 == 0) {
                    int parseInt = Integer.parseInt(str3);
                    if (parseInt == this.W2) {
                        return;
                    }
                    O2();
                    this.W2 = parseInt;
                } else if (i4 == 1) {
                    str = str3;
                } else if (i4 == 2) {
                    str2 = str3;
                }
            }
            com.join.mgps.Util.w0.e("CMD_PLAY", "videoUrl=" + str, "coverUrl=" + str2);
            this.P2.setVisibility(0);
            this.R2.setVisibility(0);
            this.f30575a3 = true;
            z2();
            J1(str, str2);
        } else if (string.equals(MediaCmd.CMD_PLAY_BACKGROUND.name())) {
            if (this.W2 == -1) {
                return;
            }
            if (Boolean.parseBoolean((String) objArr[0])) {
                this.P2.setVisibility(8);
                this.R2.setVisibility(8);
                this.f30575a3 = false;
                O2();
            } else if (this.W2 != -1) {
                this.P2.setVisibility(0);
                this.R2.setVisibility(0);
                this.f30575a3 = true;
            }
        } else if (string.equals(MediaCmd.CMD_PAUSE.name())) {
            I1();
        } else if (string.equals(MediaCmd.CMD_STOP.name())) {
            O2();
        } else if (string.equals(MediaCmd.CMD_FULLSCREEN.name())) {
            String str4 = Bugly.SDK_IS_DEV;
            for (int i5 = 0; i5 < objArr.length; i5++) {
                if (i5 == 0) {
                    str4 = (String) objArr[0];
                }
                if (i5 == 1) {
                    String str5 = (String) objArr[1];
                }
            }
            Boolean.parseBoolean(str4);
            a1();
        } else if (string.equals(MediaCmd.CMD_TRANSLATE_Y.name())) {
            String str6 = "0";
            String str7 = "0";
            for (int i6 = 0; i6 < objArr.length; i6++) {
                if (i6 == 0) {
                    str6 = (String) objArr[0];
                }
                if (i6 == 1) {
                    str7 = (String) objArr[1];
                }
            }
            int parseInt2 = Integer.parseInt(str6);
            int parseInt3 = Integer.parseInt(str7);
            com.join.mgps.Util.w0.e("CMD_TRANSLATE_Y", "top=" + parseInt2, "offset=" + parseInt3);
            E1(parseInt2, parseInt3);
        }
    }

    void changeDownloadTaskNumber(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            return;
        }
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        if (i4 == 2) {
            if (!this.f30593g3.containsKey(crc_link_type_val)) {
                this.f30593g3.put(crc_link_type_val, downloadTask);
            }
            if (this.f30596h3.containsKey(crc_link_type_val)) {
                return;
            }
            this.f30596h3.put(crc_link_type_val, downloadTask);
        } else if (i4 != 3) {
            if (i4 != 5) {
                if (i4 == 6) {
                    if (this.f30596h3.containsKey(crc_link_type_val)) {
                        this.f30596h3.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 7) {
                    if (this.f30593g3.containsKey(crc_link_type_val)) {
                        this.f30593g3.remove(crc_link_type_val);
                    }
                    if (this.f30596h3.containsKey(crc_link_type_val)) {
                        this.f30596h3.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 10) {
                    if (!this.f30593g3.containsKey(crc_link_type_val)) {
                        this.f30593g3.put(crc_link_type_val, downloadTask);
                    }
                    if (this.f30596h3.containsKey(crc_link_type_val)) {
                        return;
                    }
                    this.f30596h3.put(crc_link_type_val, downloadTask);
                    return;
                } else if (i4 != 11) {
                    return;
                }
            } else if (this.f30593g3.containsKey(crc_link_type_val)) {
                this.f30593g3.remove(crc_link_type_val);
            }
            if (this.f30596h3.containsKey(crc_link_type_val)) {
                this.f30596h3.remove(crc_link_type_val);
            }
        } else if (this.f30596h3.containsKey(crc_link_type_val)) {
            this.f30596h3.remove(crc_link_type_val);
        }
    }

    String d1() {
        String str = "";
        if (this.y2 == null) {
            return "";
        }
        for (int i4 = 0; i4 < this.y2.size(); i4++) {
            str = str + this.y2.get(i4).getTag_id();
            if (i4 != this.y2.size() - 1) {
                str = str + ",";
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010f, code lost:
        if (r9 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0120, code lost:
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
        r9.clear();
        M0(r8.getImages());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:
        g1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012f, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void d2(com.join.mgps.dto.ForumRequestBean.ForumPostsCommentRequestBean r8, com.join.mgps.dto.ForumResponse<com.join.mgps.dto.ForumData.ForumPostsCommentData> r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumPostsActivity.d2(com.join.mgps.dto.ForumRequestBean$ForumPostsCommentRequestBean, com.join.mgps.dto.ForumResponse):void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (!r1(motionEvent) && t1(currentFocus, motionEvent)) {
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
                if (inputMethodManager != null && this.f30633t2) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    this.f30633t2 = false;
                } else {
                    F0();
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        } else if (getWindow().superDispatchTouchEvent(motionEvent)) {
            return true;
        } else {
            return onTouchEvent(motionEvent);
        }
    }

    int e1(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.f30584d3 == 0) {
            Resources resources = context.getResources();
            this.f30584d3 = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.f30584d3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e2(int i4) {
        ForumBean.ForumPostsBean forumPostsBean = this.G1;
        if (forumPostsBean == null) {
            return;
        }
        forumPostsBean.setCommit(forumPostsBean.getCommit() + i4);
        z1(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f1(int i4, int i5) {
        ForumResponse<ForumData.ForumPostsHelpSolveData> forumResponse;
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    ForumRequestBean.ForumPostsHelpSolveRequestBean d02 = com.join.mgps.Util.j0.d0(this, i4, i5);
                    forumResponse = null;
                    if (d02 != null) {
                        d02.setDevice_id("");
                        forumResponse = this.E1.j(d02.getParams());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    M2("采纳失败，请重新操作！");
                }
                if (forumResponse == null) {
                    if (!com.join.mgps.Util.j0.Y0(this)) {
                        com.join.mgps.Util.j0.L0(this);
                    }
                    M2("采纳失败，请重新操作！");
                    return;
                }
                int error = forumResponse.getError();
                if (error == 0) {
                    ForumData.ForumPostsHelpSolveData data = forumResponse.getData();
                    if (data.isResult()) {
                        T1(i5);
                        M2("采纳成功！");
                    } else if (com.join.mgps.Util.g2.h(data.getMessage())) {
                        M2("采纳失败，请重新操作！");
                    } else {
                        M2(data.getMessage());
                    }
                } else if (error == 701) {
                    M2(getResources().getString(R.string.forum_user_login_invalid));
                }
                return;
            }
            M2(getString(R.string.net_connect_failed));
        } finally {
            H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1() {
        try {
            this.f30632t.setVisibility(8);
            this.f30635u.setVisibility(8);
            this.f30638v.setVisibility(8);
            this.v2 = false;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void goMyAlbumActivity4PickPic() {
        Intent intent = new Intent(this, MyAlbumActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(MyAlbumActivity.f14984x, (Serializable) this.f30644x2);
        intent.putExtras(bundle);
        startActivityForResult(intent, 256);
    }

    void h1(boolean z4) {
        g1();
        if (z4) {
            this.f30629s.setVisibility(8);
        } else {
            this.f30629s.setVisibility(0);
        }
        this.f30636u2 = z4;
    }

    void h2() {
        if (this.f30575a3) {
            this.P2.setVisibility(0);
        } else {
            this.P2.setVisibility(8);
        }
    }

    @Override // com.BaseAppCompatActivity
    public void hideKeyBoardHandler() {
        super.hideKeyBoardHandler();
    }

    public void hideSystemKeyBoard(View view) {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        this.f30633t2 = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j1() {
        goMyAlbumActivity4PickPic();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j2() {
        if (this.f30619p0 == null) {
            return;
        }
        if (this.G1.getBest() == 1) {
            this.f30619p0.setImageResource(R.drawable.more_func_best_pressed);
        } else {
            this.f30619p0.setImageResource(R.drawable.more_func_best_default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k2() {
        if (this.f30609m == null) {
            return;
        }
        if (this.G1.is_favorite()) {
            this.f30609m.setBackgroundResource(R.drawable.ic_forum_star_h);
        } else {
            this.f30609m.setBackgroundResource(R.drawable.ic_forum_star_n);
        }
    }

    public void l1() {
        this.f30627r2 = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l2() {
        if (this.A1 == 0) {
            this.f30594h.setTextColor(-11184811);
            this.f30594h.setBackgroundResource(R.drawable.post_host_default);
            return;
        }
        this.f30594h.setTextColor(-1);
        this.f30594h.setBackgroundResource(R.drawable.post_host_pressed);
    }

    void m2() {
        if (this.f30619p0 == null) {
            return;
        }
        if (this.B1.equals("asc")) {
            this.Z.setImageResource(R.drawable.more_func_alphabet);
        } else {
            this.Z.setImageResource(R.drawable.more_func_alphabet_selected);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n2(String str) {
        ForumData.HomepageRecommendLabel data;
        if (com.join.android.app.common.utils.j.j(this)) {
            boolean z4 = true;
            if (this.f30611m3) {
                return;
            }
            this.f30611m3 = true;
            int pid = this.G1.getPid();
            int post_type = this.G1.getPost_type();
            String uid = AccountUtil_.getInstance_(this).getUid();
            String token = AccountUtil_.getInstance_(this).getToken();
            try {
                try {
                    if (com.join.mgps.Util.j0.c0(this, pid) != null) {
                        ForumResponse<ForumData.HomepageRecommendLabel> a02 = this.E1.a0(pid, post_type, str, uid, token);
                        if (a02 == null || a02.getError() != 0 || (data = a02.getData()) == null || !data.isResult()) {
                            z4 = false;
                        }
                        if (z4) {
                            M2("移除话题成功");
                            C1(str);
                        } else {
                            String msg = (a02 == null || a02.getData() == null) ? "" : a02.getData().getMsg();
                            if (!TextUtils.isEmpty(msg)) {
                                M2(msg);
                            } else {
                                M2("移除话题失败");
                            }
                            List<RecommendLabelTag> list = this.y2;
                            if (list != null) {
                                list.clear();
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    List<RecommendLabelTag> list2 = this.y2;
                    if (list2 != null) {
                        list2.clear();
                    }
                }
                return;
            } finally {
                this.f30611m3 = false;
            }
        }
        M2(getString(R.string.net_connect_failed));
    }

    RelativeLayout.LayoutParams o2() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.P2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.P2.setPadding(0, 0, 0, 0);
        }
        RelativeLayout relativeLayout = this.Q2;
        if (relativeLayout == null) {
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
        }
        this.P2.setTop(0);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        int i6;
        super.onActivityResult(i4, i5, intent);
        try {
            if (i4 == 256) {
                this.f30644x2.clear();
                List<String> c12 = c1(intent);
                if (c12 != null) {
                    this.f30644x2.addAll(c12);
                }
                this.f30642w2.c(this.f30644x2);
                this.f30642w2.notifyDataSetChanged();
                this.f30642w2.d(false);
                if (this.f30644x2.size() > 0) {
                    D2();
                    return;
                }
                return;
            }
            if (i4 == 10001 && intent != null && i5 == -1) {
                Bundle extras = intent.getExtras();
                String str = "";
                if (extras != null) {
                    int i7 = extras.getInt("action");
                    str = extras.getString("ids");
                    i6 = i7;
                } else {
                    i6 = 0;
                }
                this.y2 = (List) JsonMapper.getInstance().fromJson(str, JsonMapper.getInstance().createCollectionType(ArrayList.class, RecommendLabelTag.class));
                if (i6 == 1) {
                    x0(d1());
                } else if (i6 == 2) {
                    n2(d1());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.v2) {
            z0();
        } else if (this.f30633t2) {
            H0();
        } else {
            y2();
            if (JCVideoPlayer.d()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i4 = configuration.keyboard;
        if (i4 == 16) {
            if (this.v2) {
                z0();
            }
        } else if (i4 == 16 && this.v2) {
            z0();
        }
        configuration.toString();
        U2(configuration);
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            setSystemUiHide(true);
            return;
        }
        setSystemUiHide(false);
        JCVideoPlayer.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.dialog.w0 w0Var = this.f30577b2;
        if (w0Var != null && w0Var.isShowing()) {
            this.f30577b2.dismiss();
        }
        this.f30577b2 = null;
        net.bither.util.b.q().z(this.f30613n2);
        net.bither.util.b.q().f71696c = new Hashtable<>();
        net.bither.util.b.q().f71695b = new Hashtable<>();
        I0();
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
        StringBuilder sb = new StringBuilder();
        sb.append("zip DownloadStatus =");
        sb.append(nVar.c());
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    updateUI(a5, 6);
                    return;
                } else if (c5 == 7) {
                    updateUI(a5, 3);
                    return;
                } else if (c5 == 8) {
                    updateUI(a5, 4);
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            updateUI(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            updateUI(a5, 8);
                            return;
                        case 13:
                            updateUI(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            updateUI(a5, 5);
        } else {
            updateUI(a5, 2);
        }
    }

    @Override // com.BaseAppCompatActivity
    public void onFavoriteChanged(int i4, boolean z4) {
        super.onFavoriteChanged(i4, z4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.G1);
        com.join.mgps.Util.j0.j(i4, z4, arrayList);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getRepeatCount() == 0 && getResources().getConfiguration().orientation == 2) {
            this.Z2 = true;
            R2();
            return true;
        }
        if (i4 == 4) {
            Z0();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        O2();
        super.onPause();
        if (fm.jiecao.jcvideoplayer_lib.f.c() == null || fm.jiecao.jcvideoplayer_lib.f.c().f69012c != 3) {
            this.f30634t3 = null;
            this.f30637u3 = null;
        }
        JCVideoPlayer.H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        net.bither.util.b.q().e(this.f30613n2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q2() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                if (!com.join.mgps.Util.j0.Y0(this)) {
                    com.join.mgps.Util.j0.L0(this);
                    M2("尚未登录，请先登录！");
                    return;
                } else if (!TextUtils.isEmpty(this.W1) && !TextUtils.isEmpty(this.W1.trim())) {
                    L2(0);
                    this.f30610m2 = 1;
                    net.bither.util.b.q().y();
                    return;
                } else {
                    M2("输入内容为空请重新输入！");
                    return;
                }
            }
            this.f30610m2 = 0;
            M2(getString(R.string.net_connect_failed));
        } catch (Exception e5) {
            this.f30610m2 = 0;
            e5.printStackTrace();
        }
    }

    public boolean r1(MotionEvent motionEvent) {
        int[] iArr = {R.id.layout_chat_cell_container};
        for (int i4 = 0; i4 < 1; i4++) {
            if (k1(findViewById(iArr[i4]), motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r2() {
        try {
            try {
                if (com.join.android.app.common.utils.j.j(this)) {
                    if (!com.join.mgps.Util.j0.Y0(this)) {
                        com.join.mgps.Util.j0.L0(this);
                        M2("尚未登录，请先登录！");
                    } else if (!TextUtils.isEmpty(this.W1) && !TextUtils.isEmpty(this.W1.trim())) {
                        L2(0);
                        synchronized (Integer.valueOf(this.V1)) {
                            if (this.V1 == 0) {
                                t2();
                            } else {
                                s2();
                            }
                        }
                    } else {
                        M2("输入内容为空请重新输入！");
                    }
                } else {
                    M2(getString(R.string.net_connect_failed));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                L2(1);
            }
        } finally {
            H0();
        }
    }

    void resume() {
        MyVideoView myVideoView = this.R2;
        if (myVideoView.E() & (myVideoView != null)) {
            this.U2.setVisibility(8);
            this.S2.setVisibility(8);
            this.T2.setVisibility(8);
            this.R2.start();
            MediaController mediaController = this.V2;
            if (mediaController != null) {
                mediaController.setVisibility(8);
                return;
            }
            return;
        }
        L1();
    }

    boolean s1() {
        return false;
    }

    @Override // com.BaseAppCompatActivity
    public void showKeyBoardHandler() {
        super.showKeyBoardHandler();
        if (this.X1 == 1) {
            h1(false);
        } else {
            h1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    public void showSortPop(View view) {
        g0 g0Var = this.f30640v3;
        if (g0Var != null && g0Var.isShowing()) {
            this.f30640v3.dismiss();
        }
        if (this.f30640v3 == null) {
            this.f30640v3 = new g0(this, -2, -2);
        }
        g0 g0Var2 = this.f30640v3;
        if (g0Var2 != null && g0Var2.getContentView() != null) {
            this.f30640v3.getContentView().measure(0, 0);
            this.f30640v3.setHeight(this.f30640v3.getContentView().getMeasuredHeight());
        }
        int measuredWidth = view.getMeasuredWidth() - getResources().getDimensionPixelOffset(R.dimen.dp15);
        this.f30640v3.showAsDropDown(view, measuredWidth, -((int) getResources().getDimension(R.dimen.wdp30)));
        this.f30640v3.getContentView().invalidate();
    }

    public void showSystemKeyBoard(View view) {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(view, 0);
        this.f30633t2 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void startDown(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        downloadtaskDown.set_from(13203);
        downloadtaskDown.set_from_type(13203);
        ForumBean.GameInfo gameInfo = this.H1;
        if (gameInfo != null && gameInfo.getDownloadTask() == null) {
            this.H1.setDownloadTask(downloadtaskDown);
            z1(false);
        }
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(this, downloadtaskDown.getCrc_link_type_val());
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.o1(this, downloadtaskDown)) {
            return;
        }
        if (detailResultBean.getDown_status() == 5) {
            UtilsMy.l1(this, downloadtaskDown);
        } else {
            UtilsMy.R0(this, downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
        }
    }

    public boolean t1(View view, MotionEvent motionEvent) {
        if (view == null || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        return motionEvent.getX() <= ((float) i4) || motionEvent.getX() >= ((float) (view.getWidth() + i4)) || motionEvent.getY() <= ((float) i5) || motionEvent.getY() >= ((float) (view.getHeight() + i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void touristLogin() {
        if (!com.join.android.app.common.utils.j.j(this) || isLogined(this)) {
            return;
        }
        try {
            TouristLoginRequestBean touristLoginRequestBean = new TouristLoginRequestBean();
            touristLoginRequestBean.setVersion(com.join.android.app.common.utils.n.n(this).z());
            touristLoginRequestBean.setDevice_id("");
            touristLoginRequestBean.setMac("");
            touristLoginRequestBean.setSource("2");
            touristLoginRequestBean.setTuid(new PrefDef_(this).touriseTUID().d().longValue());
            touristLoginRequestBean.setSign(com.join.mgps.Util.x1.g(touristLoginRequestBean));
            AccountResultMainBean<AccountTokenSuccess> s4 = this.f30621p2.s(touristLoginRequestBean.getParams());
            if (s4 != null && s4.getError() == 0) {
                if (s4.getData().is_success()) {
                    AccountUtil_.getInstance_(this).saveAccountData(b3.a.a(s4.getData().getUser_info()), this);
                } else {
                    error(s4.getData().getError_msg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void u2(String str) {
        this.M.e0(str);
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            if (i4 != 4) {
                return;
            }
            g2();
            return;
        }
        switch (i4) {
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
                receiveStart(downloadTask);
                return;
            case 3:
                receiveDelete(downloadTask);
                return;
            case 4:
                g2();
                return;
            case 5:
                receiveSuccess(downloadTask);
                return;
            case 6:
                receiveError(downloadTask);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0185, code lost:
        if (r26.f30583d2 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0187, code lost:
        r26.f30583d2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0189, code lost:
        P2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014f, code lost:
        if (r26.f30583d2 == (-1)) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.join.mgps.dto.ForumResponse] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v1(boolean r27, boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumPostsActivity.v1(boolean, boolean, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v2() {
        if (com.join.android.app.common.utils.j.j(this)) {
            int i4 = 1;
            if (this.f30614n3) {
                return;
            }
            this.f30614n3 = true;
            try {
                try {
                    ForumResponse<ForumData.ForumResult> h02 = this.E1.h0(this.G1.getPid(), AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).getToken());
                    ForumData.ForumResult forumResult = null;
                    if (h02 != null && h02.getError() == 0 && (forumResult = h02.getData()) != null && forumResult.isResult()) {
                        if (this.G1.getFirst() != 1) {
                            M2("帖子置顶成功");
                        } else {
                            M2("帖子取消置顶成功");
                        }
                        ForumBean.ForumPostsBean forumPostsBean = this.G1;
                        if (!forumResult.isFirst()) {
                            i4 = 0;
                        }
                        forumPostsBean.setFirst(i4);
                    } else {
                        String msg = (h02 == null || h02.getData() == null) ? "" : h02.getData().getMsg();
                        if (!TextUtils.isEmpty(msg)) {
                            M2(msg);
                        } else {
                            M2("帖子置顶失败");
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                this.f30614n3 = false;
            }
        }
        M2(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x0(String str) {
        ForumData.HomepageRecommendLabel data;
        if (com.join.android.app.common.utils.j.j(this)) {
            boolean z4 = true;
            if (this.f30608l3) {
                return;
            }
            this.f30608l3 = true;
            int pid = this.G1.getPid();
            int post_type = this.G1.getPost_type();
            String uid = AccountUtil_.getInstance_(this).getUid();
            String token = AccountUtil_.getInstance_(this).getToken();
            try {
                try {
                    if (com.join.mgps.Util.j0.c0(this, pid) != null) {
                        ForumResponse<ForumData.HomepageRecommendLabel> g4 = this.E1.g(pid, post_type, str, uid, token);
                        if (g4 == null || g4.getError() != 0 || (data = g4.getData()) == null || !data.isResult()) {
                            z4 = false;
                        }
                        if (z4) {
                            M2("收录话题成功");
                            B1(str);
                        } else {
                            String msg = (g4 == null || g4.getData() == null) ? "" : g4.getData().getMsg();
                            if (!TextUtils.isEmpty(msg)) {
                                M2(msg);
                            } else {
                                M2("收录话题失败");
                            }
                            List<RecommendLabelTag> list = this.y2;
                            if (list != null) {
                                list.clear();
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    M2("收录话题失败");
                    List<RecommendLabelTag> list2 = this.y2;
                    if (list2 != null) {
                        list2.clear();
                    }
                }
                return;
            } finally {
                this.f30608l3 = false;
            }
        }
        M2(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void x1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x034b A[Catch: Exception -> 0x03a0, TryCatch #0 {Exception -> 0x03a0, blocks: (B:40:0x011f, B:42:0x0129, B:47:0x013e, B:49:0x0148, B:51:0x015c, B:53:0x0166, B:55:0x0174, B:59:0x017d, B:61:0x018b, B:65:0x0194, B:67:0x019a, B:69:0x01a8, B:71:0x01ae, B:76:0x01bc, B:77:0x01cd, B:79:0x01d3, B:130:0x0334, B:91:0x01f6, B:93:0x020e, B:94:0x0214, B:103:0x0240, B:106:0x0258, B:108:0x0261, B:109:0x026c, B:110:0x0290, B:111:0x02c7, B:113:0x02e1, B:114:0x02e7, B:119:0x02f7, B:124:0x030b, B:127:0x0323, B:129:0x032c, B:131:0x0341, B:133:0x034b, B:134:0x034f, B:136:0x0364, B:140:0x036c, B:142:0x037f, B:147:0x0394, B:146:0x0390, B:43:0x012e, B:45:0x0138), top: B:166:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d3 A[Catch: Exception -> 0x03a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x03a0, blocks: (B:40:0x011f, B:42:0x0129, B:47:0x013e, B:49:0x0148, B:51:0x015c, B:53:0x0166, B:55:0x0174, B:59:0x017d, B:61:0x018b, B:65:0x0194, B:67:0x019a, B:69:0x01a8, B:71:0x01ae, B:76:0x01bc, B:77:0x01cd, B:79:0x01d3, B:130:0x0334, B:91:0x01f6, B:93:0x020e, B:94:0x0214, B:103:0x0240, B:106:0x0258, B:108:0x0261, B:109:0x026c, B:110:0x0290, B:111:0x02c7, B:113:0x02e1, B:114:0x02e7, B:119:0x02f7, B:124:0x030b, B:127:0x0323, B:129:0x032c, B:131:0x0341, B:133:0x034b, B:134:0x034f, B:136:0x0364, B:140:0x036c, B:142:0x037f, B:147:0x0394, B:146:0x0390, B:43:0x012e, B:45:0x0138), top: B:166:0x011f }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x2(com.join.mgps.dto.ForumBean.ForumPostsBean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumPostsActivity.x2(com.join.mgps.dto.ForumBean$ForumPostsBean, boolean):void");
    }

    public void y0(RecyclerView recyclerView, int i4, int i5, int i6) {
        if (this.f30625q3 != i4 || i4 == 0) {
            this.f30625q3 = i4;
            this.f30628r3 = i5;
            this.f30631s3 = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y1(boolean z4, int i4) {
        if (z4) {
            this.f30606l.setBackgroundResource(R.drawable.ic_forum_like);
        } else {
            this.f30606l.setBackgroundResource(R.drawable.ic_forum_unlike);
        }
        z1(false);
    }

    void y2() {
        ForumBean.ForumPostsBean forumPostsBean = this.G1;
        if (forumPostsBean == null || forumPostsBean.getPid() == 0) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(ForumPostsTagSelectActivity_.f30896z, this.G1.getPid());
        intent.putExtra("view", this.G1.getView());
        intent.putExtra("comment", this.G1.getCommit());
        intent.putExtra("praise", this.G1.getPraise());
        intent.putExtra("isPraise", this.G1.is_praise());
        intent.putExtra("isFavorite", this.G1.is_favorite());
        setResult(3, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        if (this.v2) {
            g1();
            return;
        }
        List<String> list = this.f30644x2;
        if ((list != null) & (list.size() > 0)) {
            D2();
        } else {
            goMyAlbumActivity4PickPic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z1(boolean z4) {
        if (z4) {
            this.N.setNewData(this.I1);
        } else {
            this.N.notifyDataSetChanged();
        }
    }

    void z2() {
        RelativeLayout relativeLayout = this.Q2;
        if (relativeLayout == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = e1(this);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.P2.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mg_forum_post_item_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_top);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_bottom);
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            this.P2.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
        }
        this.Q2.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g0 extends PopupWindow {

        /* renamed from: a  reason: collision with root package name */
        private Context f30713a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f30714b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f30715c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.O1();
                g0.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumPostsActivity.this.O1();
                g0.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c implements View.OnTouchListener {
            c() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    g0.this.dismiss();
                    return true;
                }
                return false;
            }
        }

        public g0(Context context) {
            super(context);
            this.f30713a = context;
            a();
        }

        private void b() {
            setBackgroundDrawable(new BitmapDrawable());
            setFocusable(true);
            setTouchable(true);
            setOutsideTouchable(true);
            setTouchInterceptor(new c());
        }

        void a() {
            View inflate = LayoutInflater.from(this.f30713a).inflate(R.layout.pop_forum_post_commont_sort, (ViewGroup) null);
            setContentView(inflate);
            setWidth(-2);
            setHeight(-2);
            this.f30714b = (LinearLayout) inflate.findViewById(R.id.ll_early);
            this.f30715c = (LinearLayout) inflate.findViewById(R.id.ll_new);
            this.f30714b.setOnClickListener(new a());
            this.f30715c.setOnClickListener(new b());
            b();
        }

        public g0(Context context, int i4, int i5) {
            super(i4, i5);
            this.f30713a = context;
            a();
        }
    }
}
