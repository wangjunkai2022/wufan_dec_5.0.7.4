package com.join.mgps.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.posting.PostingActivity;
import com.join.mgps.adapter.ForumProfileMessageReplyAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.RewardType;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GroupInfoBean;
import com.join.mgps.dto.TouristLoginRequestBean;
import com.join.mgps.pref.PrefDef_;
import it.sephiroth.android.library.widget.HListView;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.mg_forum_profile_message_reply_activity)
/* loaded from: classes4.dex */
public class ForumProfileMessageReplyActivity extends BaseActivity {
    public static final String M1 = "key_forum_comment_bean";
    public static final String N1 = "key_forum_post_bean";
    public static final String O1 = "key_forum_reply_bean";
    private static final int P1 = 9;
    com.join.mgps.rpc.b A;
    private Button A1;
    private com.join.mgps.dialog.v0 K;
    private com.join.mgps.dialog.y1 K1;
    private com.join.mgps.dialog.w0 L;
    private int V;
    private int W;
    private int X;
    private String Y;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f31116b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f31117c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f31118d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f31119e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ForumLoadingView f31120f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ClearEditText f31121g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f31122h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f31123i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f31124j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f31125k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f31126l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f31127m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f31128n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f31129o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    LinearLayout f31130p;

    /* renamed from: p1  reason: collision with root package name */
    private PopupWindow f31132p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    HListView f31133q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    XListView f31134r;

    /* renamed from: s  reason: collision with root package name */
    ForumProfileMessageReplyAdapter f31135s;

    /* renamed from: t  reason: collision with root package name */
    List<ForumProfileMessageReplyAdapter.u> f31136t;

    /* renamed from: u  reason: collision with root package name */
    ForumBean.ForumCommentBean f31137u;

    /* renamed from: v  reason: collision with root package name */
    ForumBean.ForumPostsBean f31138v;

    /* renamed from: v1  reason: collision with root package name */
    private Button f31139v1;

    /* renamed from: w  reason: collision with root package name */
    ForumBean.ForumCommentReplyBean f31140w;
    @StringRes(resName = "net_excption")

    /* renamed from: x  reason: collision with root package name */
    String f31141x;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: y  reason: collision with root package name */
    String f31142y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.rpc.i f31143z;
    private boolean B = false;
    private final int C = 0;
    private final int D = 16;
    private final int E = 32;
    private final int F = 17;
    private final int G = 18;
    private final int H = 20;
    private final int I = 24;
    private int J = 0;
    private final int M = 1;
    private final int N = 2;
    private final int O = 4;
    private final int P = 17;
    private final int Q = 18;
    private final int R = 20;
    private final int S = 33;
    private final int T = 34;
    private final int U = 36;
    private int Z = 2;

    /* renamed from: p0  reason: collision with root package name */
    int f31131p0 = 0;
    ForumProfileMessageReplyAdapter.o B1 = new i();
    Handler C1 = new j();
    private boolean D1 = false;
    boolean E1 = false;
    boolean F1 = false;
    boolean G1 = false;
    boolean H1 = false;
    boolean I1 = false;
    com.join.mgps.customview.o J1 = null;
    private final PostingActivity.m L1 = new h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends ForumLoadingView.e {
        a(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            Context applicationContext = ForumProfileMessageReplyActivity.this.getApplicationContext();
            if (com.join.mgps.Util.j0.Y0(applicationContext)) {
                ForumProfileMessageReplyActivity.this.S0();
                return;
            }
            ForumProfileMessageReplyActivity.this.showToast("用户未登录，请登录！");
            com.join.mgps.Util.j0.L0(applicationContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyActivity.this.D0();
            if (ForumProfileMessageReplyActivity.this.W == -1) {
                return;
            }
            if (ForumProfileMessageReplyActivity.this.Z == 1) {
                ForumProfileMessageReplyActivity.this.Z = 2;
            }
            if (ForumProfileMessageReplyActivity.this.Z == 2) {
                ForumProfileMessageReplyActivity.this.Z = 4;
            }
            ForumProfileMessageReplyActivity.this.f31121g.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyActivity.this.D0();
            if (ForumProfileMessageReplyActivity.this.W == -1) {
                return;
            }
            if (ForumProfileMessageReplyActivity.this.Z == 1) {
                ForumProfileMessageReplyActivity.this.Z = 17;
            }
            if (ForumProfileMessageReplyActivity.this.Z == 2) {
                ForumProfileMessageReplyActivity.this.Z = 18;
            }
            if (ForumProfileMessageReplyActivity.this.Z == 4) {
                ForumProfileMessageReplyActivity.this.Z = 20;
            }
            ForumProfileMessageReplyActivity.this.v1(ForumProfileMessageReplyActivity.this.W, ForumProfileMessageReplyActivity.this.X);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                ForumProfileMessageReplyActivity.this.f31132p1.dismiss();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyActivity.this.K.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements DialogInterface.OnCancelListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            ForumProfileMessageReplyActivity.this.f31131p0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31150b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31151c;

        g(int i4, int i5) {
            this.f31150b = i4;
            this.f31151c = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumProfileMessageReplyActivity.this.Z != 17) {
                if (ForumProfileMessageReplyActivity.this.Z == 18 || ForumProfileMessageReplyActivity.this.Z == 20) {
                    ForumProfileMessageReplyActivity.this.z0(this.f31151c);
                }
            } else {
                ForumProfileMessageReplyActivity.this.y0(this.f31150b);
            }
            ForumProfileMessageReplyActivity.this.K.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class h implements PostingActivity.m {
        h() {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void a(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void b(int i4) {
            ForumProfileMessageReplyActivity.this.finish();
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
                IntentUtil.getInstance().goShareWebActivity(ForumProfileMessageReplyActivity.this, com.join.mgps.rpc.h.f54083s);
            } else if (i4 != 4356) {
            } else {
                IntentUtil.getInstance().goShareWebActivity(ForumProfileMessageReplyActivity.this, com.join.mgps.rpc.h.f54080r);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements ForumProfileMessageReplyAdapter.o {
        i() {
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void a(int i4) {
            ForumProfileMessageReplyActivity forumProfileMessageReplyActivity = ForumProfileMessageReplyActivity.this;
            if (!com.join.mgps.Util.j0.Y0(forumProfileMessageReplyActivity)) {
                com.join.mgps.Util.l2.a(forumProfileMessageReplyActivity).b("用户未登录，请登录");
                com.join.mgps.Util.j0.L0(forumProfileMessageReplyActivity);
            } else if (ForumProfileMessageReplyActivity.this.B1()) {
                ForumProfileMessageReplyActivity.this.i1();
                ForumProfileMessageReplyActivity.this.X0();
            } else {
                ForumProfileMessageReplyActivity.this.p1();
            }
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void b(int i4) {
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void c(int i4, int i5, String str) {
            ForumProfileMessageReplyActivity.this.h1(i4, i5, str);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void d(int i4) {
            ForumProfileMessageReplyActivity.this.Z = 17;
            ForumProfileMessageReplyActivity.this.v1(i4, 0);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void e(View view, int i4, int i5) {
            ForumProfileMessageReplyActivity.this.W = i4;
            ForumProfileMessageReplyActivity.this.X = 0;
            ForumProfileMessageReplyActivity.this.t1(view.findViewById(R.id.comment_message), 1);
            com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(view.getContext());
            if (T == null) {
                return;
            }
            if (i5 == T.getUid()) {
                ForumProfileMessageReplyActivity.this.n1(true, true);
            } else {
                ForumProfileMessageReplyActivity.this.n1(false, true);
            }
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void f(int i4) {
            ForumProfileMessageReplyActivity.this.G0(0, i4);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void g(int i4) {
            ForumProfileMessageReplyActivity.this.Z = 18;
            ForumProfileMessageReplyActivity.this.v1(0, i4);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void h(int i4, String str) {
            ForumProfileMessageReplyActivity.this.x0(i4, str);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void i(View view, int i4) {
            ForumProfileMessageReplyActivity.this.J0(true);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void j(int i4) {
            ForumProfileMessageReplyActivity.this.G0(i4, 0);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void k(int i4, int i5, String str) {
            ForumProfileMessageReplyActivity.this.J0(true);
            ForumProfileMessageReplyActivity.this.Z = 4;
            ForumProfileMessageReplyActivity.this.W = i4;
            ForumProfileMessageReplyActivity.this.X = i5;
            ForumProfileMessageReplyActivity.this.f31121g.setText("");
            ForumProfileMessageReplyActivity.this.f31121g.requestFocus();
            ForumProfileMessageReplyActivity forumProfileMessageReplyActivity = ForumProfileMessageReplyActivity.this;
            forumProfileMessageReplyActivity.showSystemKeyBoard(forumProfileMessageReplyActivity.f31121g);
            ClearEditText clearEditText = ForumProfileMessageReplyActivity.this.f31121g;
            clearEditText.setHint("回复" + str + ":");
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void l(View view, int i4, int i5, int i6) {
            ForumProfileMessageReplyActivity.this.J0(true);
            ForumProfileMessageReplyActivity.this.Z = 4;
            ForumProfileMessageReplyActivity.this.W = i4;
            ForumProfileMessageReplyActivity.this.X = i5;
            ForumProfileMessageReplyActivity.this.t1(view, 4);
            com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(view.getContext());
            if (T == null) {
                return;
            }
            if (i6 == T.getUid()) {
                ForumProfileMessageReplyActivity.this.n1(true, true);
            } else {
                ForumProfileMessageReplyActivity.this.n1(false, true);
            }
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageReplyAdapter.o
        public void m() {
            ForumProfileMessageReplyActivity.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class j extends Handler {
        j() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ForumProfileMessageReplyActivity.this.f31134r.r();
            ForumProfileMessageReplyActivity.this.f31134r.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements KeyboardListenLayout.a {
        k() {
        }

        @Override // com.join.mgps.customview.KeyboardListenLayout.a
        public void onHidden() {
        }

        @Override // com.join.mgps.customview.KeyboardListenLayout.a
        public void onShown() {
            ForumProfileMessageReplyActivity.this.J0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnFocusChangeListener {
        l() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            if (z4) {
                ForumProfileMessageReplyActivity.this.f31124j.setVisibility(8);
                ForumProfileMessageReplyActivity.this.f31122h.setVisibility(8);
                ForumProfileMessageReplyActivity.this.f31125k.setVisibility(8);
                ForumProfileMessageReplyActivity.this.f31123i.setVisibility(0);
                ForumProfileMessageReplyActivity.this.showSystemKeyBoard(view);
                return;
            }
            ForumProfileMessageReplyActivity.this.f31124j.setVisibility(0);
            ForumProfileMessageReplyActivity.this.f31123i.setVisibility(8);
            ForumProfileMessageReplyActivity.this.f31125k.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements com.join.mgps.customview.f {
        m() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (!com.join.android.app.common.utils.j.j(ForumProfileMessageReplyActivity.this)) {
                ForumProfileMessageReplyActivity forumProfileMessageReplyActivity = ForumProfileMessageReplyActivity.this;
                forumProfileMessageReplyActivity.showToast(forumProfileMessageReplyActivity.getString(R.string.net_connect_failed));
                ForumProfileMessageReplyActivity.this.y1();
                return;
            }
            ForumProfileMessageReplyActivity.this.y1();
            ForumProfileMessageReplyActivity.this.f31134r.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements com.join.mgps.customview.g {
        n() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (!com.join.android.app.common.utils.j.j(ForumProfileMessageReplyActivity.this)) {
                ForumProfileMessageReplyActivity.this.y1();
                ForumProfileMessageReplyActivity forumProfileMessageReplyActivity = ForumProfileMessageReplyActivity.this;
                forumProfileMessageReplyActivity.showToast(forumProfileMessageReplyActivity.getString(R.string.net_connect_failed));
                return;
            }
            ForumProfileMessageReplyActivity.this.H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o extends ForumLoadingView.e {
        o(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            Context applicationContext = ForumProfileMessageReplyActivity.this.getApplicationContext();
            if (com.join.mgps.Util.j0.Y0(applicationContext)) {
                ForumProfileMessageReplyActivity.this.S0();
                return;
            }
            ForumProfileMessageReplyActivity.this.showToast("用户未登录，请登录！");
            com.join.mgps.Util.j0.L0(applicationContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p extends ForumLoadingView.e {
        p(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q extends ForumLoadingView.e {
        q(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            Context applicationContext = ForumProfileMessageReplyActivity.this.getApplicationContext();
            if (com.join.mgps.Util.j0.Y0(applicationContext)) {
                ForumProfileMessageReplyActivity.this.S0();
                return;
            }
            ForumProfileMessageReplyActivity.this.showToast("用户未登录，请登录！");
            com.join.mgps.Util.j0.L0(applicationContext);
        }
    }

    private void B0(List<String> list) {
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

    private void C0() {
        com.join.mgps.customview.o oVar = this.J1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.J1.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        PopupWindow popupWindow = this.f31132p1;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f31132p1.dismiss();
    }

    private boolean K0(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        return motionEvent.getX() >= ((float) i4) && motionEvent.getX() <= ((float) (i4 + view.getWidth())) && motionEvent.getY() >= ((float) i5) && motionEvent.getY() <= ((float) (i5 + view.getHeight()));
    }

    private void L0() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.mg_forum_popupwindow_layout, (ViewGroup) null);
        this.f31132p1 = new PopupWindow(inflate, -2, -2);
        this.A1 = (Button) inflate.findViewById(R.id.btn_forum_comment);
        this.f31139v1 = (Button) inflate.findViewById(R.id.btn_forum_comment_delete);
        this.A1.setOnClickListener(new b());
        this.f31139v1.setOnClickListener(new c());
        this.f31132p1.setBackgroundDrawable(new BitmapDrawable());
        this.f31132p1.setTouchable(true);
        this.f31132p1.setOutsideTouchable(true);
        this.f31132p1.setTouchInterceptor(new d());
    }

    private void M0() {
        this.f31118d.setText("我的消息");
        this.f31119e.setText("查看主贴");
        String str = (String) getIntent().getSerializableExtra(M1);
        String str2 = (String) getIntent().getSerializableExtra(N1);
        String str3 = (String) getIntent().getSerializableExtra(O1);
        if (!com.join.mgps.Util.g2.h(str)) {
            this.f31137u = (ForumBean.ForumCommentBean) JsonMapper.getInstance().fromJson(str, JsonMapper.getInstance().createCollectionType(ForumBean.ForumCommentBean.class, new Class[0]));
        }
        if (!com.join.mgps.Util.g2.h(str2)) {
            this.f31138v = (ForumBean.ForumPostsBean) JsonMapper.getInstance().fromJson(str2, JsonMapper.getInstance().createCollectionType(ForumBean.ForumPostsBean.class, new Class[0]));
        }
        if (!com.join.mgps.Util.g2.h(str3)) {
            this.f31140w = (ForumBean.ForumCommentReplyBean) JsonMapper.getInstance().fromJson(str3, JsonMapper.getInstance().createCollectionType(ForumBean.ForumCommentReplyBean.class, new Class[0]));
        }
        ForumBean.ForumCommentBean forumCommentBean = this.f31137u;
        if (forumCommentBean != null && this.f31138v != null) {
            this.W = forumCommentBean.getPid();
            this.L = new com.join.mgps.dialog.w0(this);
            L0();
            this.f31125k.setVisibility(8);
            w0();
            try {
                ((KeyboardListenLayout) this.f31116b.getParent()).setOnSoftKeyboardListener(new k());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f31122h.setVisibility(8);
            this.f31121g.setOnFocusChangeListener(new l());
            this.f31134r.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
            this.f31134r.setPullLoadEnable(new m());
            this.f31134r.setPullRefreshEnable(new n());
            this.f31135s = new ForumProfileMessageReplyAdapter(this);
            this.f31136t = new ArrayList();
            this.f31135s.C(this.B1);
            this.f31134r.setAdapter((ListAdapter) this.f31135s);
            ForumBean.ForumCommentBean forumCommentBean2 = this.f31137u;
            if (forumCommentBean2 != null && forumCommentBean2.getPid() != 0) {
                this.W = this.f31137u.getPid();
            }
            ForumBean.ForumPostsBean forumPostsBean = this.f31138v;
            if (forumPostsBean != null && forumPostsBean.getPid() != 0) {
                this.V = this.f31138v.getPid();
            }
            ForumBean.ForumCommentReplyBean forumCommentReplyBean = this.f31140w;
            if (forumCommentReplyBean == null || forumCommentReplyBean.getRid() == 0) {
                return;
            }
            this.X = this.f31140w.getRid();
            return;
        }
        finish();
    }

    private void Q0() {
        t0(18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        t0(0);
        Q0();
        if (com.join.android.app.common.utils.j.j(this)) {
            R0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        t0(17);
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void f1() {
        if (AccountUtil_.getInstance_(this).isTourist()) {
            touristLogin();
        } else {
            showMessage(getString(R.string.forum_user_login_invalid));
        }
    }

    private void g1() {
        ForumBean.ForumCommentBean forumCommentBean = this.f31137u;
        if (forumCommentBean != null) {
            int size = forumCommentBean.getReply_list() != null ? this.f31137u.getReply_list().size() : 0;
            TextView textView = this.f31124j;
            textView.setText("已有" + size + "条回复");
            return;
        }
        this.f31124j.setText("已有0条回复");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1() {
        boolean is_praise = this.f31138v.is_praise();
        int praise = this.f31138v.getPraise();
        this.f31138v.setPraise(is_praise ? praise - 1 : praise + 1);
        this.f31138v.setIs_praise(!is_praise);
        T0(this.f31138v.is_praise(), this.f31138v.getPraise());
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void l1() {
        if (!isLogined(this)) {
            showMessage(getString(R.string.forum_user_not_login));
        } else if (!B1()) {
            p1();
        } else {
            ForumRequestBean.ForumCommentReplyRequestBean Y = com.join.mgps.Util.j0.Y(this, this.W, this.Y, this.X);
            Y.setDevice_id("");
            ForumResponse<ForumData.ForumCommentReplyReplyData> J = this.f31143z.J(Y.getParams());
            if (J == null) {
                x1(1);
            } else if (J.getError() == 706) {
                showToast(getString(R.string.tour_perfect_info_for_comment_toast));
                p1();
            } else {
                ForumData.ForumCommentReplyReplyData data = J.getData();
                if (data.isResult()) {
                    x1(2);
                    ForumBean.ForumCommentReplyBean forumCommentReplyBean = new ForumBean.ForumCommentReplyBean();
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    forumCommentReplyBean.setUid(T.getUid());
                    forumCommentReplyBean.setNickname(T.getNickname());
                    forumCommentReplyBean.setMessage(Y.getMessage());
                    forumCommentReplyBean.setAdd_time(System.currentTimeMillis() / 1000);
                    forumCommentReplyBean.setRrid(this.X);
                    if (this.X != 0) {
                        forumCommentReplyBean.setRid(data.getRid());
                        a1(forumCommentReplyBean);
                        w1(RewardType.REPLY_POST, data.getReward_money(), data.getReward_exp());
                    }
                } else if (data.getError_type() == 1) {
                    u1(data.getError_type());
                } else {
                    if (TextUtils.isEmpty(data.getMsg())) {
                        showToast(data.getMsg());
                    }
                    x1(1);
                }
            }
        }
    }

    private void m1() {
        if (!isLogined(this)) {
            showMessage(getString(R.string.forum_user_not_login));
        } else if (!B1()) {
            p1();
        } else {
            ForumRequestBean.ForumCommentReplyRequestBean Y = com.join.mgps.Util.j0.Y(this, this.W, this.Y, this.X);
            Y.setDevice_id("");
            ForumResponse<ForumData.ForumCommentReplyData> l02 = this.f31143z.l0(Y.getParams());
            if (l02 == null) {
                x1(1);
            } else if (l02.getError() == 706) {
                showToast(getString(R.string.tour_perfect_info_for_comment_toast));
                p1();
            } else {
                ForumData.ForumCommentReplyData data = l02.getData();
                if (data.isResult()) {
                    x1(2);
                    ForumBean.ForumCommentReplyBean forumCommentReplyBean = new ForumBean.ForumCommentReplyBean();
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    forumCommentReplyBean.setUid(T.getUid());
                    forumCommentReplyBean.setNickname(T.getNickname());
                    forumCommentReplyBean.setMessage(Y.getMessage());
                    forumCommentReplyBean.setAdd_time(System.currentTimeMillis() / 1000);
                    forumCommentReplyBean.setRrid(this.X);
                    forumCommentReplyBean.setRid(data.getRid());
                    Z0(forumCommentReplyBean);
                    w1(RewardType.REPLY_POST, data.getReward_money(), data.getReward_exp());
                } else if (data.getError_type() == 1) {
                    u1(data.getError_type());
                } else {
                    if (TextUtils.isEmpty(data.getMsg())) {
                        showToast(data.getMsg());
                    }
                    x1(1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A0() {
        ForumData.ForumPostsDeleteData data;
        if (com.join.android.app.common.utils.j.j(this)) {
            boolean z4 = true;
            if (this.I1) {
                return;
            }
            this.I1 = true;
            int pid = this.f31138v.getPid();
            try {
                try {
                    if (com.join.mgps.Util.j0.c0(this, pid) != null) {
                        ForumResponse<ForumData.ForumPostsDeleteData> q02 = this.f31143z.q0(com.join.mgps.Util.j0.c0(this, pid).getParams());
                        if (q02 == null || q02.getError() != 0 || (data = q02.getData()) == null || !data.isResult()) {
                            z4 = false;
                        }
                        if (z4) {
                            showToast("帖子删除成功");
                            finish();
                        } else {
                            showToast("帖子删除失败");
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                this.I1 = false;
            }
        }
        showToast(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A1(ForumBean.ForumCommentBean forumCommentBean) {
        this.f31137u = forumCommentBean;
        g1();
        y1();
        V0();
    }

    boolean B1() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        try {
            com.join.mgps.dialog.w0 w0Var = this.L;
            if (w0Var == null || !w0Var.isShowing()) {
                return;
            }
            this.L.dismiss();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F0() {
        if (this.G1) {
            return;
        }
        this.G1 = true;
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        try {
            ForumBean.ForumPostsBean forumPostsBean2 = this.f31138v;
            if (forumPostsBean2 != null) {
                forumPostsBean = (ForumBean.ForumPostsBean) forumPostsBean2.clone();
            }
        } catch (CloneNotSupportedException e5) {
            e5.printStackTrace();
        }
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                } catch (Exception e6) {
                    showToast(getString(R.string.forum_post_report_fail));
                    e6.printStackTrace();
                }
                if (!com.join.mgps.Util.j0.Y0(this)) {
                    com.join.mgps.Util.j0.L0(this);
                    showToast(getString(R.string.forum_user_not_login));
                    this.G1 = false;
                    return;
                }
                com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                ForumResponse<ForumData.ForumPostsReportData> c5 = this.f31143z.c(new ForumRequestBean.ForumPostsReportRequestBean(T.getUid(), T.getToken(), forumPostsBean.getPid(), "").getParams());
                if (c5 != null) {
                    int error = c5.getError();
                    if (error == 0) {
                        ForumData.ForumPostsReportData data = c5.getData();
                        if (data != null) {
                            if (data.isResult()) {
                                showToast(getString(R.string.forum_post_report_success));
                            } else {
                                showToast(getString(R.string.forum_post_report_fail));
                            }
                        } else {
                            showToast(getString(R.string.forum_post_report_fail));
                        }
                    } else if (error == 701) {
                        showToast(getString(R.string.forum_user_login_invalid));
                    }
                } else {
                    showToast(getString(R.string.forum_post_report_fail));
                }
                return;
            } finally {
                this.G1 = false;
            }
        }
        showToast(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void G0(int i4, int i5) {
        String str = i4 != 0 ? "评论举报成功" : "回复举报成功";
        String str2 = i4 != 0 ? "评论举报失败" : "回复举报失败";
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.H1) {
                return;
            }
            this.H1 = true;
            Integer num = new Integer(i4);
            Integer num2 = new Integer(i5);
            try {
                try {
                } catch (Exception e5) {
                    showToast(str2);
                    e5.printStackTrace();
                }
                if (!com.join.mgps.Util.j0.Y0(this)) {
                    com.join.mgps.Util.j0.L0(this);
                    showToast(getString(R.string.forum_user_not_login));
                    this.H1 = false;
                    return;
                }
                com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                ForumResponse<ForumData.ForumPostsReportData> c5 = this.f31143z.c(new ForumRequestBean.ForumPostsReportRequestBean(T.getUid(), T.getToken(), 0, num.intValue(), num2.intValue(), "").getParams());
                if (c5 != null) {
                    int error = c5.getError();
                    if (error == 0) {
                        ForumData.ForumPostsReportData data = c5.getData();
                        if (data != null) {
                            if (data.isResult()) {
                                showToast(str);
                            } else {
                                showToast(str2);
                            }
                        } else {
                            showToast(str2);
                        }
                    } else if (error == 701) {
                        showToast(getString(R.string.forum_user_login_invalid));
                    }
                } else {
                    showToast(str2);
                }
                return;
            } finally {
                this.H1 = false;
            }
        }
        showToast(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H0() {
        ForumBean.ForumCommentBean forumCommentBean;
        ForumResponse<ForumData.ForumProfileMessageReplyData> c02;
        if (this.B) {
            return;
        }
        this.B = true;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    forumCommentBean = null;
                    c02 = com.join.mgps.Util.j0.Y0(this) ? this.f31143z.c0(T.getUid(), T.getToken(), this.f31137u.getPid(), "") : null;
                } catch (Exception e5) {
                    t0(24);
                    e5.printStackTrace();
                }
                if (c02.getError() == 701) {
                    showToast(getString(R.string.forum_user_not_login));
                    t0(20);
                } else {
                    ForumData.ForumProfileMessageReplyData data = c02.getData();
                    if (data != null) {
                        forumCommentBean = data.getComment();
                    } else {
                        t0(24);
                    }
                    if (forumCommentBean != null) {
                        A1(forumCommentBean);
                    }
                    if (forumCommentBean != null && forumCommentBean.getPid() != 0) {
                        t0(32);
                        v0();
                        return;
                    }
                    t0(20);
                }
                return;
            } finally {
                this.B = false;
                y1();
            }
        }
        showToast(getString(R.string.net_connect_failed));
        t0(17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0() {
        this.f31128n.setVisibility(8);
        this.f31129o.setVisibility(8);
        this.f31130p.setVisibility(8);
        this.F1 = false;
    }

    void J0(boolean z4) {
        I0();
        if (z4) {
            this.f31127m.setVisibility(8);
        } else {
            this.f31127m.setVisibility(0);
        }
        this.E1 = z4;
    }

    public boolean N0(MotionEvent motionEvent) {
        int[] iArr = {R.id.layout_chat_cell_container};
        for (int i4 = 0; i4 < 1; i4++) {
            if (K0(findViewById(iArr[i4]), motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public boolean O0(View view, MotionEvent motionEvent) {
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
    @Click
    public void P0() {
        if (this.f31138v == null) {
            this.f31138v = new ForumBean.ForumPostsBean();
        }
        com.join.mgps.Util.j0.v0(this, this.f31138v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void R0() {
        H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T0(boolean z4, int i4) {
        if (z4) {
            this.f31122h.setBackgroundResource(R.drawable.like);
        } else {
            this.f31122h.setBackgroundResource(R.drawable.unlike);
        }
        V0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void U0() {
        this.f31135s.u(this.f31136t);
        this.f31135s.notifyDataSetChanged();
    }

    synchronized void V0() {
        this.f31136t.clear();
        o1(this.f31137u);
        U0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X0() {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this, this.V);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f31143z.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                i1();
                p1();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            boolean is_praise = this.f31138v.is_praise();
            if (data.isResult()) {
                if (is_praise) {
                    showToast("点赞成功");
                } else {
                    showToast("取消点赞成功");
                }
            } else if (is_praise) {
                showToast("点赞失败");
            } else {
                showToast("取消点赞失败");
            }
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y0(int i4) {
        g1();
        V0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        try {
            ForumBean.ForumCommentBean forumCommentBean = this.f31137u;
            if (forumCommentReplyBean.getRrid() == 0 && this.W == forumCommentBean.getPid()) {
                List<ForumBean.ForumCommentReplyBean> reply_list = forumCommentBean.getReply_list();
                if (reply_list == null) {
                    reply_list = new ArrayList<>();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(forumCommentReplyBean);
                arrayList.addAll(reply_list);
                forumCommentBean.setReply_list(arrayList);
            }
            g1();
            V0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        ForumBean.ForumCommentBean forumCommentBean = this.f31137u;
        List<ForumBean.ForumCommentReplyBean> reply_list = forumCommentBean.getReply_list();
        if (reply_list != null && reply_list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(reply_list);
            int i4 = 0;
            while (true) {
                if (i4 >= reply_list.size()) {
                    break;
                }
                ForumBean.ForumCommentReplyBean forumCommentReplyBean2 = reply_list.get(i4);
                if (forumCommentReplyBean2.getRid() == forumCommentReplyBean.getRrid()) {
                    forumCommentReplyBean.setRuid(forumCommentReplyBean2.getUid());
                    forumCommentReplyBean.setRnickname(forumCommentReplyBean2.getNickname());
                    reply_list.clear();
                    reply_list.add(forumCommentReplyBean);
                    reply_list.addAll(arrayList);
                    this.f31135s.notifyDataSetChanged();
                    break;
                }
                i4++;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            forumCommentReplyBean.setRuid(forumCommentBean.getUid());
            forumCommentReplyBean.setRnickname(forumCommentBean.getNickname());
            arrayList2.add(forumCommentReplyBean);
            forumCommentBean.setReply_list(arrayList2);
            this.f31135s.notifyDataSetChanged();
        }
        g1();
        V0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f31143z = com.join.mgps.rpc.impl.g.A0();
        this.A = com.join.mgps.rpc.impl.a.c0();
        M0();
        S0();
        if (com.join.mgps.Util.j0.Y0(this)) {
            return;
        }
        showToast("用户未登录，请登录！");
        com.join.mgps.Util.j0.L0(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b1(ForumBean.ForumCommentBean forumCommentBean) {
        V0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        if (this.F1) {
            return;
        }
        if (this.D1) {
            w0();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c1(int i4) {
        ForumBean.ForumCommentBean forumCommentBean = this.f31137u;
        if (forumCommentBean.getReply_list() == null || forumCommentBean.getReply_list().size() == 0) {
            return;
        }
        for (ForumBean.ForumCommentReplyBean forumCommentReplyBean : forumCommentBean.getReply_list()) {
            if (forumCommentReplyBean.getRid() == i4) {
                forumCommentBean.getReply_list().remove(forumCommentReplyBean);
                V0();
                return;
            }
        }
    }

    void d1(ForumRequestBean.ForumPostsCommentRequestBean forumPostsCommentRequestBean, ForumResponse<ForumData.ForumPostsCommentData> forumResponse) {
        try {
            try {
            } catch (Exception e5) {
                e5.printStackTrace();
                x1(1);
            }
            if (forumResponse == null) {
                x1(1);
            } else {
                ForumData.ForumPostsCommentData data = forumResponse.getData();
                if (data.isResult()) {
                    x1(2);
                    ForumBean.ForumCommentBean forumCommentBean = new ForumBean.ForumCommentBean();
                    forumCommentBean.setPid(data.getPid());
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    forumCommentBean.setUid(T.getUid());
                    forumCommentBean.setNickname(T.getNickname());
                    forumCommentBean.setAvatar_src(T.d0());
                    forumCommentBean.setMessage(forumPostsCommentRequestBean.getMessage());
                    forumCommentBean.setAdd_time(System.currentTimeMillis() / 1000);
                    forumCommentBean.setPic_list(data.getPic_list());
                    forumCommentBean.setRaw_pic_list(data.getRaw_pic_list());
                    forumCommentBean.setFloor(data.getFloor());
                    b1(forumCommentBean);
                    w1(RewardType.COMMENT_POST, data.getReward_money(), data.getReward_exp());
                    e1(1);
                    B0(forumPostsCommentRequestBean.getImages());
                } else if (data.getError_type() == 1) {
                    E0();
                    u1(data.getError_type());
                } else if (!TextUtils.isEmpty(data.getMsg())) {
                    E0();
                    showToast(data.getMsg());
                } else {
                    x1(1);
                }
            }
        } finally {
            w0();
            I0();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InputMethodManager inputMethodManager;
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (!N0(motionEvent) && O0(currentFocus, motionEvent) && (inputMethodManager = (InputMethodManager) getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            return super.dispatchTouchEvent(motionEvent);
        } else if (getWindow().superDispatchTouchEvent(motionEvent)) {
            return true;
        } else {
            return onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e1(int i4) {
        V0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    void h1(int i4, int i5, String str) {
        J0(true);
        this.Z = 4;
        this.W = i4;
        this.X = i5;
        this.f31121g.setText("");
        this.f31121g.requestFocus();
        showSystemKeyBoard(this.f31121g);
        ClearEditText clearEditText = this.f31121g;
        clearEditText.setHint("回复" + str + ":");
    }

    public void hideSystemKeyBoard(View view) {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        this.D1 = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j1() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                if (!com.join.mgps.Util.j0.Y0(this)) {
                    com.join.mgps.Util.j0.L0(this);
                    com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                    return;
                }
                x1(0);
                this.f31131p0 = 1;
                net.bither.util.b.q().y();
                return;
            }
            this.f31131p0 = 0;
            showToast(getString(R.string.net_connect_failed));
        } catch (Exception e5) {
            this.f31131p0 = 0;
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k1() {
        try {
            try {
            } catch (Exception e5) {
                e5.printStackTrace();
                x1(1);
            }
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                showToast("尚未登录，请先登录！");
                return;
            }
            x1(0);
            synchronized (Integer.valueOf(this.X)) {
                if (this.X == 0) {
                    m1();
                } else {
                    l1();
                }
            }
        } finally {
            w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n1(boolean z4, boolean z5) {
        if (this.f31132p1 == null) {
            L0();
        }
        View contentView = this.f31132p1.getContentView();
        Button button = (Button) contentView.findViewById(R.id.btn_forum_comment);
        Button button2 = (Button) contentView.findViewById(R.id.btn_forum_comment_delete);
        View findViewById = contentView.findViewById(R.id.divider_forum_comment_1);
        if (!z4) {
            button2.setVisibility(8);
            findViewById.setVisibility(8);
            return;
        }
        button2.setVisibility(0);
        findViewById.setVisibility(0);
        button.setVisibility(0);
    }

    void o1(ForumBean.ForumCommentBean forumCommentBean) {
        if (forumCommentBean == null) {
            return;
        }
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            forumCommentBean.getForum_auth();
            this.f31138v.getHelp();
            this.f31138v.getSolve_flg();
            int auth = this.f31138v.getAuth();
            if (accountData != null) {
                accountData.getUid();
                this.f31138v.getUid();
            }
            if (accountData != null) {
                forumCommentBean.getUid();
                accountData.getUid();
            }
            forumCommentBean.getUid();
            this.f31138v.getUid();
            this.f31136t.add(new ForumProfileMessageReplyAdapter.u(ForumProfileMessageReplyAdapter.ViewType.PROFILE_HEADER, new ForumProfileMessageReplyAdapter.u.b(true, forumCommentBean.getAvatar_src(), forumCommentBean.getNickname(), forumCommentBean.getAdd_time(), forumCommentBean.getPid(), false, forumCommentBean.getVip_level(), forumCommentBean.getSvip_level(), forumCommentBean.getUid())));
            this.f31136t.add(new ForumProfileMessageReplyAdapter.u(ForumProfileMessageReplyAdapter.ViewType.PROFILE_MESSAGE_ITEM, new ForumProfileMessageReplyAdapter.u.c(forumCommentBean.getPid(), forumCommentBean.getMessage())));
            for (int i4 = 0; this.f31137u.getPic_list() != null && i4 < this.f31137u.getPic_list().size(); i4++) {
                this.f31136t.add(new ForumProfileMessageReplyAdapter.u(ForumProfileMessageReplyAdapter.ViewType.PROFILE_COMMENT_IMAGE, new ForumProfileMessageReplyAdapter.u.a(this.f31137u.getPic_list().get(i4), i4, this.f31137u.getRaw_pic_list())));
            }
            forumCommentBean.getReply_list();
            this.f31136t.add(new ForumProfileMessageReplyAdapter.u(ForumProfileMessageReplyAdapter.ViewType.PROFILE_MESSAGE_REPLY_ITEM, new ForumProfileMessageReplyAdapter.u.d(forumCommentBean.getPid(), forumCommentBean, auth)));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.F1) {
            return;
        }
        if (this.D1) {
            w0();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.J == 16) {
            S0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p1() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    void q1() {
        this.f31128n.setVisibility(0);
        this.f31129o.setVisibility(0);
        this.f31130p.setVisibility(8);
        hideSystemKeyBoard(this.f31130p);
        this.F1 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        if (!com.join.mgps.Util.j0.Y0(this)) {
            com.join.mgps.Util.l2.a(this).b("用户未登录，请登录");
            com.join.mgps.Util.j0.L0(this);
        } else if (!B1()) {
            p1();
        } else {
            this.f31122h.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_reset));
            i1();
            X0();
        }
    }

    void r1() {
        this.f31128n.setVisibility(0);
        this.f31129o.setVisibility(8);
        this.f31130p.setVisibility(0);
        hideSystemKeyBoard(this.f31130p);
        this.F1 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        String obj = this.f31121g.getText().toString();
        this.Y = obj;
        if (com.join.mgps.Util.g2.h(obj)) {
            com.join.mgps.Util.l2.a(this).b("回复内容不能为空");
            return;
        }
        int i4 = this.Z;
        if (i4 == 1) {
            j1();
        } else if (i4 == 2) {
            k1();
        } else if (i4 == 4) {
            k1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s1() {
        this.f31134r.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    public void showSystemKeyBoard(View view) {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(view, 0);
        this.D1 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(int i4) {
        int i5 = this.J;
        if (i5 == 32) {
            return;
        }
        if (i4 == 32) {
            this.J = 32;
            this.f31120f.j(2);
        } else if (i4 == 0) {
            this.J = 0;
            this.f31120f.m();
            this.f31120f.j(1);
        } else {
            this.J = i4 | i5;
            if (u0(-11)) {
                this.J = 16;
                ForumLoadingView forumLoadingView = this.f31120f;
                forumLoadingView.setListener(new o(forumLoadingView));
                this.f31120f.j(9);
            } else if (u0(22)) {
                this.J = 16;
                this.f31120f.setFailedMsg("该评论已经删除~");
                ForumLoadingView forumLoadingView2 = this.f31120f;
                forumLoadingView2.setListener(new p(forumLoadingView2));
                this.f31120f.j(10);
            } else if (!u0(31) && !u0(26)) {
                if (u0(17)) {
                    this.J = 16;
                    ForumLoadingView forumLoadingView3 = this.f31120f;
                    forumLoadingView3.setListener(new a(forumLoadingView3));
                    this.f31120f.j(9);
                }
            } else {
                this.J = 16;
                this.f31120f.setFailedMsg("加载失败，再试试吧~");
                ForumLoadingView forumLoadingView4 = this.f31120f;
                forumLoadingView4.setListener(new q(forumLoadingView4));
                this.f31120f.j(16);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t1(View view, int i4) {
        float f5 = getResources().getDisplayMetrics().scaledDensity;
        int i5 = getResources().getDisplayMetrics().widthPixels;
        this.f31132p1.showAsDropDown(view, 0, (int) ((view.getMeasuredHeight() * (-1)) - (f5 * 40.0f)));
        this.Z = i4;
        if (i4 == 2) {
            this.X = 0;
        }
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
            AccountResultMainBean<AccountTokenSuccess> s4 = this.A.s(touristLoginRequestBean.getParams());
            if (s4 != null && s4.getError() == 0) {
                if (s4.getData().is_success()) {
                    AccountUtil_.getInstance_(this).saveAccountData(b3.a.a(s4.getData().getUser_info()), this);
                    W0();
                } else {
                    error(s4.getData().getError_msg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    boolean u0(int i4) {
        return (this.J & i4) == i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u1(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        int i4 = this.W;
        if (i4 != 0) {
            int i5 = this.X;
            if (i5 != 0) {
                h1(i4, i5, this.f31140w.getNickname());
            } else {
                x0(i4, this.f31137u.getNickname());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v1(int i4, int i5) {
        if (this.K == null) {
            com.join.mgps.dialog.v0 v0Var = new com.join.mgps.dialog.v0(this);
            this.K = v0Var;
            v0Var.f("确定");
            this.K.d("取消");
            this.K.b(8);
            this.K.g("确定要删除该评论吗？").c(new e());
            this.K.setCancelable(true);
            this.K.setOnCancelListener(new f());
        }
        int i6 = this.Z;
        if (i6 == 17) {
            this.K.g("确定要删除该评论吗？");
        } else if (i6 == 18 || i6 == 20) {
            this.K.g("确定要删除该回复吗？");
        }
        this.K.e(new g(i4, i5));
        if (this.K.isShowing()) {
            return;
        }
        this.K.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        this.f31127m.setVisibility(8);
        this.Z = 2;
        this.f31124j.setVisibility(0);
        this.f31122h.setVisibility(8);
        this.f31123i.setVisibility(8);
        this.f31125k.setVisibility(8);
        hideSystemKeyBoard(this.f31121g);
        this.f31121g.setText("");
        this.f31121g.setHint("添加回复");
        this.f31121g.clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w1(RewardType rewardType, int i4, int i5) {
    }

    void x0(int i4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("cid=");
        sb.append(i4);
        sb.append(" cNickname=");
        sb.append(str);
        this.Z = 2;
        this.W = i4;
        this.X = 0;
        this.f31121g.setText("");
        this.f31121g.requestFocus();
        J0(true);
        showSystemKeyBoard(this.f31121g);
        ClearEditText clearEditText = this.f31121g;
        clearEditText.setHint("回复" + str + ":");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x1(int i4) {
        if (this.L == null) {
            this.L = new com.join.mgps.dialog.w0(this);
        }
        this.L.c(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0(int i4) {
        try {
            try {
                if (com.join.android.app.common.utils.j.j(this)) {
                    ForumRequestBean.ForumCommentDeleteRequestBean W = com.join.mgps.Util.j0.W(this, i4);
                    ForumResponse<ForumData.ForumCommentDeleteData> forumResponse = null;
                    if (W != null) {
                        W.setDevice_id("");
                        forumResponse = this.f31143z.d0(W.getParams());
                    }
                    if (forumResponse == null) {
                        if (!com.join.mgps.Util.j0.Y0(this)) {
                            com.join.mgps.Util.j0.L0(this);
                        }
                    } else if (forumResponse.getData().isResult()) {
                        showToast("评论已删除");
                        Y0(i4);
                    } else {
                        showToast("评论删除失败");
                    }
                } else {
                    showToast(getString(R.string.net_connect_failed));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showToast("评论删除失败");
            }
        } finally {
            w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y1() {
        if (this.f31134r.g()) {
            this.C1.sendEmptyMessageDelayed(0, 3000L);
        } else {
            this.C1.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z0(int i4) {
        if (i4 == 0) {
            return;
        }
        try {
            ForumRequestBean.ForumCommentReplyDeleteRequestBean X = com.join.mgps.Util.j0.X(this, i4);
            ForumResponse<ForumData.ForumCommentReplyDeleteData> forumResponse = null;
            if (X != null) {
                X.setDevice_id("");
                forumResponse = this.f31143z.A(X.getParams());
            }
            if (forumResponse == null) {
                if (com.join.mgps.Util.j0.Y0(this)) {
                    return;
                }
                com.join.mgps.Util.j0.L0(this);
            } else if (forumResponse.getData().isResult()) {
                c1(i4);
                showToast("回复已删除");
            } else {
                showToast("回复删除失败");
            }
        } catch (Exception e5) {
            showToast("回复删除失败");
            e5.printStackTrace();
        }
    }

    void z1(ForumRequestBean.ForumPostsCommentRequestBean forumPostsCommentRequestBean) {
        try {
            if (!isLogined(this)) {
                showMessage(getString(R.string.forum_user_not_login));
            } else if (!B1()) {
                p1();
            } else if (forumPostsCommentRequestBean != null) {
                forumPostsCommentRequestBean.setDevice_id("");
                ForumResponse<ForumData.ForumPostsCommentData> z02 = this.f31143z.z0(forumPostsCommentRequestBean.getParams1());
                int error = z02.getError();
                if (error == 706) {
                    showToast(getString(R.string.tour_perfect_info_for_comment_toast));
                    p1();
                    return;
                }
                if (error == 701) {
                    f1();
                }
                d1(forumPostsCommentRequestBean, z02);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            x1(1);
        }
    }
}
