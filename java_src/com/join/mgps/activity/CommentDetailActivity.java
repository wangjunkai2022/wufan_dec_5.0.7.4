package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.CommentDetailAdapter;
import com.join.mgps.customview.CopyTextViewNew;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.VipView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dialog.b;
import com.join.mgps.dto.CommentCreateArgs;
import com.join.mgps.dto.CommentCreateBean;
import com.join.mgps.dto.CommentDetailBean;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.DeleteCommentArgs;
import com.join.mgps.dto.RequestCommentDetailArgs;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@WindowFeature({10})
@EActivity(R.layout.comment_detail_activity)
/* loaded from: classes.dex */
public class CommentDetailActivity extends BaseAppCompatActivity implements CommentDetailAdapter.h {
    private CommentDetailAdapter A;
    private TextView A1;
    private ImageView B1;
    private TextView C1;
    private ImageView D1;
    private TextView E1;
    private int F;
    private com.wufan.user.service.protobuf.n0 G;
    private View H;
    private String H1;
    private LinearLayout I;
    private String I1;
    private SimpleDraweeView J;
    private String J1;
    private SimpleDraweeView K;
    private String K1;
    private TextView L;
    private String L1;
    private TextView M;
    private VipView N;
    private String N1;
    private TextView O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private CopyTextViewNew T;
    private TextView U;
    private ImageView V;
    private ImageView W;
    private MStarBar X;
    private LinearLayout Y;
    private TextView Z;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f29422b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f29423c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f29424d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f29425e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    PtrClassicFrameLayout f29426f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f29427g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f29428h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f29429i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f29430j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f29431k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f29432l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f29433m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ClearEditText f29434n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    Button f29435o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    String f29436p;

    /* renamed from: p0  reason: collision with root package name */
    private TextView f29437p0;

    /* renamed from: p1  reason: collision with root package name */
    private TextView f29438p1;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    String f29439q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    String f29440r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    String f29441s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    int f29442t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    int f29443u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    String f29444v;

    /* renamed from: v1  reason: collision with root package name */
    private ImageView f29445v1;
    @Extra

    /* renamed from: w  reason: collision with root package name */
    int f29446w;

    /* renamed from: x  reason: collision with root package name */
    com.join.mgps.rpc.f f29447x;
    @Pref

    /* renamed from: y  reason: collision with root package name */
    PrefDef_ f29448y;

    /* renamed from: z  reason: collision with root package name */
    private Context f29449z;
    private int B = 1;
    private boolean C = false;
    private List<CommentDetailAdapter.j> D = new ArrayList();
    private List<CommentDetailBean.MainCommentBean> E = new ArrayList();
    private CommentDetailBean.MainCommentBean F1 = null;
    private Context G1 = this;
    private int M1 = 1;
    private String O1 = "";
    com.join.mgps.dialog.d1 P1 = null;
    private String Q1 = "desc";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLoginInteractive(CommentDetailActivity.this.G1)) {
                return;
            }
            CommentDetailActivity commentDetailActivity = CommentDetailActivity.this;
            commentDetailActivity.o1(view, commentDetailActivity.C1, CommentDetailActivity.this.F1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClearEditText clearEditText = CommentDetailActivity.this.f29434n;
            clearEditText.setHint("@" + CommentDetailActivity.this.F1.getUser_name() + "：");
            CommentDetailActivity.this.f29434n.setFocusable(true);
            CommentDetailActivity.this.f29434n.setFocusableInTouchMode(true);
            CommentDetailActivity.this.f29434n.requestFocus();
            ((InputMethodManager) CommentDetailActivity.this.f29434n.getContext().getSystemService("input_method")).showSoftInput(CommentDetailActivity.this.f29434n, 0);
            CommentDetailActivity commentDetailActivity = CommentDetailActivity.this;
            commentDetailActivity.J1 = commentDetailActivity.f29436p;
            CommentDetailActivity.this.M1 = 1;
            CommentDetailActivity commentDetailActivity2 = CommentDetailActivity.this;
            commentDetailActivity2.K1 = commentDetailActivity2.F1.getUser_name();
            CommentDetailActivity commentDetailActivity3 = CommentDetailActivity.this;
            commentDetailActivity3.L1 = commentDetailActivity3.F1.getUid();
            CommentDetailActivity.this.O1 = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f29452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f29453c;

        c(TextView textView, CommentDetailBean.MainCommentBean mainCommentBean) {
            this.f29452b = textView;
            this.f29453c = mainCommentBean;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            long longValue = Long.valueOf(this.f29452b.getText().toString()).longValue();
            TextView textView = this.f29452b;
            textView.setText((longValue + 1) + "");
            CommentDetailActivity.this.G0();
            CommentDetailActivity.this.V0(this.f29453c, 1);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f29455b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f29456c;

        d(TextView textView, CommentDetailBean.MainCommentBean mainCommentBean) {
            this.f29455b = textView;
            this.f29456c = mainCommentBean;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            long longValue = Long.valueOf(this.f29455b.getText().toString()).longValue();
            TextView textView = this.f29455b;
            textView.setText((longValue + 1) + "");
            CommentDetailActivity.this.H0();
            CommentDetailActivity.this.n1(this.f29456c, 1);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f29458b;

        e(PopupWindow popupWindow) {
            this.f29458b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f29458b.dismiss();
            if (CommentDetailActivity.this.C) {
                return;
            }
            CommentDetailActivity.this.E.clear();
            CommentDetailActivity.this.D.clear();
            if (CommentDetailActivity.this.Q1.equals("desc")) {
                CommentDetailActivity.this.Q1 = "asc";
            } else {
                CommentDetailActivity.this.Q1 = "desc";
            }
            CommentDetailActivity.this.B = 1;
            CommentDetailActivity commentDetailActivity = CommentDetailActivity.this;
            commentDetailActivity.O0(commentDetailActivity.Q1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f29460b;

        f(PopupWindow popupWindow) {
            this.f29460b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f29460b.dismiss();
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = CommentDetailActivity.this.f29449z;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54059k + "/user/comment_report?comment_id=" + CommentDetailActivity.this.f29436p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f29462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29463c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f29464d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f29465e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f29466f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f29467g;

        g(com.join.mgps.customview.o oVar, String str, String str2, int i4, String str3, String str4) {
            this.f29462b = oVar;
            this.f29463c = str;
            this.f29464d = str2;
            this.f29465e = i4;
            this.f29466f = str3;
            this.f29467g = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLoginInteractive(CommentDetailActivity.this.G1)) {
                this.f29462b.dismiss();
                return;
            }
            com.join.mgps.customview.o oVar = this.f29462b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f29462b.dismiss();
            ClearEditText clearEditText = CommentDetailActivity.this.f29434n;
            clearEditText.setHint("@" + this.f29463c + "：");
            CommentDetailActivity.this.J1 = this.f29464d;
            CommentDetailActivity.this.M1 = this.f29465e;
            CommentDetailActivity.this.K1 = this.f29463c;
            CommentDetailActivity.this.L1 = this.f29466f;
            CommentDetailActivity.this.O1 = this.f29467g;
            CommentDetailActivity.this.h1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f29469b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29470c;

        h(com.join.mgps.customview.o oVar, String str) {
            this.f29469b = oVar;
            this.f29470c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f29469b.dismiss();
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = CommentDetailActivity.this.f29449z;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54059k + "/user/comment_report?comment_id=" + this.f29470c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f29472b;

        i(com.join.mgps.customview.o oVar) {
            this.f29472b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f29472b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) CommentDetailActivity.this.f29434n.getContext().getSystemService("input_method")).showSoftInput(CommentDetailActivity.this.f29434n, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLoginInteractive(CommentDetailActivity.this.G1)) {
                return;
            }
            CommentDetailActivity commentDetailActivity = CommentDetailActivity.this;
            commentDetailActivity.N1 = commentDetailActivity.f29434n.getText().toString();
            if (CommentDetailActivity.this.N1.length() == 0) {
                com.join.mgps.Util.l2.a(CommentDetailActivity.this.f29449z).b("不能发表空字符串");
            } else if (CommentDetailActivity.this.N1.length() <= 3) {
                com.join.mgps.Util.l2.a(CommentDetailActivity.this.f29449z).b("超过3个字才可以发表");
            } else {
                ((InputMethodManager) CommentDetailActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(CommentDetailActivity.this.getCurrentFocus().getWindowToken(), 2);
                CommentDetailActivity commentDetailActivity2 = CommentDetailActivity.this;
                commentDetailActivity2.m1(commentDetailActivity2.I1, CommentDetailActivity.this.N1, Build.MODEL, CommentDetailActivity.this.L1, CommentDetailActivity.this.K1, CommentDetailActivity.this.J1, CommentDetailActivity.this.M1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements com.join.mgps.customview.f {
        l() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CommentDetailActivity.this.C) {
                return;
            }
            CommentDetailActivity commentDetailActivity = CommentDetailActivity.this;
            commentDetailActivity.O0(commentDetailActivity.Q1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements com.join.mgps.customview.g {
        m() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CommentDetailActivity.this.C) {
                return;
            }
            CommentDetailActivity.this.B = 1;
            CommentDetailActivity commentDetailActivity = CommentDetailActivity.this;
            commentDetailActivity.O0(commentDetailActivity.Q1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f29478b;

        n(CommentDetailBean.MainCommentBean mainCommentBean) {
            this.f29478b = mainCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f29478b.getUid())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnLongClickListener {
        o() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivity(CommentDetailActivity.this.f29449z, CommentDetailActivity.this.f29439q, "0", 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!CommentDetailActivity.this.F1.getUid().equals(String.valueOf(CommentDetailActivity.this.F)) || IntentUtil.getInstance().goLoginInteractive(CommentDetailActivity.this.G1)) {
                return;
            }
            CommentCreatActivity_.w0(CommentDetailActivity.this.f29449z).f(CommentDetailActivity.this.f29439q).j(CommentDetailActivity.this.f29441s).d(CommentDetailActivity.this.f29440r).c(CommentDetailActivity.this.f29436p).e(Float.valueOf(CommentDetailActivity.this.F1.getStars_score()).floatValue()).h(CommentDetailActivity.this.f29444v).g(1).i(true).a(CommentDetailActivity.this.f29442t).k(CommentDetailActivity.this.F1.getMobile_phone_model()).b(CommentDetailActivity.this.F1.getContent()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnClickListener {

        /* loaded from: classes4.dex */
        class a implements b.c {
            a() {
            }

            @Override // com.join.mgps.dialog.b.c
            public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
                bVar.dismiss();
            }

            @Override // com.join.mgps.dialog.b.c
            public void ClickOKButn(com.join.mgps.dialog.b bVar) {
                bVar.dismiss();
                CommentDetailActivity.this.L0();
            }
        }

        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new com.join.mgps.dialog.b(CommentDetailActivity.this.f29449z, R.style.HKDialogLoading).g("您确定要删除自己的点评？").j("确定").d("取消").k("提示").i(new a()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLoginInteractive(CommentDetailActivity.this.G1)) {
                return;
            }
            CommentDetailActivity commentDetailActivity = CommentDetailActivity.this;
            commentDetailActivity.W0(view, commentDetailActivity.A1, CommentDetailActivity.this.F1);
        }
    }

    private void I0(List<CommentDetailBean.MainCommentBean> list, boolean z4) {
        for (int i4 = 0; list != null && i4 < list.size(); i4++) {
            CommentDetailBean.MainCommentBean mainCommentBean = list.get(i4);
            CommentDetailAdapter.j jVar = new CommentDetailAdapter.j(CommentDetailAdapter.ViewType.COMMENT, new CommentDetailAdapter.j.a(mainCommentBean));
            if (z4) {
                this.D.add(0, jVar);
            } else {
                this.D.add(jVar);
            }
            List<CommentDetailBean.MainCommentBean.SubCommentBean> sub_comment = mainCommentBean.getSub_comment();
            if (sub_comment != null && sub_comment.size() > 0) {
                CommentDetailAdapter.j jVar2 = new CommentDetailAdapter.j(CommentDetailAdapter.ViewType.REPLY, new CommentDetailAdapter.j.b(mainCommentBean.getId(), mainCommentBean, 0, true));
                if (z4) {
                    this.D.add(0, jVar2);
                } else {
                    this.D.add(jVar2);
                }
            }
        }
    }

    private RequestCommentDetailArgs N0(String str) {
        String str2 = Build.MODEL;
        this.H1 = this.f29448y.commentToken().d();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29449z).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            this.F = accountData.getUid();
        }
        return RequestBeanUtil.getInstance(this.f29449z).getCommentDetailList(str, this.f29436p, this.f29439q, this.F, this.B, 10, str2, this.H1);
    }

    private void U0() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.comment_detail_head_view, (ViewGroup) null);
        this.H = inflate;
        this.I = (LinearLayout) inflate.findViewById(R.id.commentDetailTopLl);
        this.J = (SimpleDraweeView) this.H.findViewById(R.id.appIcon);
        this.K = (SimpleDraweeView) this.H.findViewById(R.id.usericon);
        this.L = (TextView) this.H.findViewById(R.id.gameName);
        this.M = (TextView) this.H.findViewById(R.id.userName);
        this.N = (VipView) this.H.findViewById(R.id.levelTv);
        this.O = (TextView) this.H.findViewById(R.id.isMe);
        this.P = (TextView) this.H.findViewById(R.id.isConnoisseurs);
        this.Q = (TextView) this.H.findViewById(R.id.comment_head_num_tx);
        this.R = (TextView) this.H.findViewById(R.id.time);
        this.S = (TextView) this.H.findViewById(R.id.content);
        this.T = (CopyTextViewNew) this.H.findViewById(R.id.contentWeb);
        this.U = (TextView) this.H.findViewById(R.id.more);
        this.V = (ImageView) this.H.findViewById(R.id.isAuth);
        this.W = (ImageView) this.H.findViewById(R.id.isGood);
        MStarBar mStarBar = (MStarBar) this.H.findViewById(R.id.comment_head_mstarBar);
        this.X = mStarBar;
        mStarBar.setIntegerMark(false);
        this.X.setEnabled(false);
        this.Y = (LinearLayout) this.H.findViewById(R.id.editLl);
        this.Z = (TextView) this.H.findViewById(R.id.editTx);
        this.f29437p0 = (TextView) this.H.findViewById(R.id.deleteTx);
        this.f29438p1 = (TextView) this.H.findViewById(R.id.phoneModle);
        this.f29445v1 = (ImageView) this.H.findViewById(R.id.parise);
        this.A1 = (TextView) this.H.findViewById(R.id.pariseNumber);
        this.B1 = (ImageView) this.H.findViewById(R.id.down);
        this.C1 = (TextView) this.H.findViewById(R.id.downNumber);
        this.D1 = (ImageView) this.H.findViewById(R.id.message);
        this.E1 = (TextView) this.H.findViewById(R.id.messageNumber);
        this.U.setVisibility(8);
        this.S.setVisibility(8);
        this.T.setVisibility(0);
        this.T.setOnLongClickListener(new o());
        this.I.setOnClickListener(new p());
        this.Z.setOnClickListener(new q());
        this.f29437p0.setOnClickListener(new r());
        this.f29445v1.setOnClickListener(new s());
        this.B1.setOnClickListener(new a());
        this.D1.setOnClickListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(View view, TextView textView, CommentDetailBean.MainCommentBean mainCommentBean) {
        if (mainCommentBean == null) {
            return;
        }
        if (mainCommentBean.getIs_praise() == 1) {
            l1();
            ((ImageView) view).setImageResource(R.drawable.up_ic);
            n1(mainCommentBean, 2);
            return;
        }
        mainCommentBean.setIs_praise(1);
        if (AccountUtil_.getInstance_(this.G1).getAccountData() != null) {
            ((ImageView) view).setImageResource(R.drawable.uped_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.G1, R.anim.scale_reset);
            view.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new d(textView, mainCommentBean));
            return;
        }
        IntentUtil.getInstance().goLoginInteractive(this.G1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1() {
        this.f29434n.setFocusable(true);
        this.f29434n.setFocusableInTouchMode(true);
        this.f29434n.requestFocus();
        new Handler().postDelayed(new j(), 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1(View view, TextView textView, CommentDetailBean.MainCommentBean mainCommentBean) {
        if (mainCommentBean == null) {
            return;
        }
        if (mainCommentBean.getIs_despise() == 1) {
            k1();
            ((ImageView) view).setImageResource(R.drawable.down_ic);
            V0(mainCommentBean, 2);
            return;
        }
        mainCommentBean.setIs_despise(1);
        if (AccountUtil_.getInstance_(this.G1).getAccountData() != null) {
            ((ImageView) view).setImageResource(R.drawable.downed_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.G1, R.anim.scale_reset);
            view.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new c(textView, mainCommentBean));
            return;
        }
        IntentUtil.getInstance().goLoginInteractive(this.G1);
    }

    public void G0() {
        long longValue = Long.valueOf(this.F1.getDespise_count()).longValue();
        this.F1.setIs_despise(1);
        CommentDetailBean.MainCommentBean mainCommentBean = this.F1;
        mainCommentBean.setDespise_count((longValue + 1) + "");
    }

    public void H0() {
        long longValue = Long.valueOf(this.F1.getPraise_count()).longValue();
        this.F1.setIs_praise(1);
        CommentDetailBean.MainCommentBean mainCommentBean = this.F1;
        mainCommentBean.setPraise_count((longValue + 1) + "");
    }

    void J0(String str, String str2, String str3, String str4, int i4) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f29449z, R.style.MyDialog);
        oVar.setContentView(R.layout.commentdetail_report_dialog);
        TextView textView = (TextView) oVar.findViewById(R.id.replyTv);
        TextView textView2 = (TextView) oVar.findViewById(R.id.reportTv);
        TextView textView3 = (TextView) oVar.findViewById(R.id.cancelTv);
        textView.setOnClickListener(new g(oVar, str2, str, i4, str3, str4));
        textView2.setOnClickListener(new h(oVar, str));
        textView3.setOnClickListener(new i(oVar));
        oVar.show();
        WindowManager.LayoutParams attributes = oVar.getWindow().getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -2;
        oVar.getWindow().getDecorView().setPadding(0, 0, 0, 0);
        oVar.getWindow().setAttributes(attributes);
    }

    @UiThread
    public void K0(int i4) {
        if (i4 == 1) {
            X0(1);
        } else {
            Y0(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void L0() {
        if (com.join.android.app.common.utils.j.j(this.f29449z)) {
            try {
                CommentResponse<CommentPraiseBean> k4 = this.f29447x.k(R0(this.F1.getId(), this.F1.getPn()));
                if (k4 != null) {
                    if (k4.getSucc() != 1) {
                        if (k4.getCode() == 801) {
                            a1(k4);
                        } else {
                            b1(k4.getMsg(), false);
                        }
                    } else {
                        b1("", true);
                    }
                } else {
                    b1("删除失败，请稍候再试~", false);
                }
                return;
            } catch (Exception e5) {
                b1("删除失败，请稍候再试~", false);
                e5.printStackTrace();
                return;
            }
        }
        b1("网络连接失败，再试试吧~", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M0() {
        this.P1.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void O0(String str) {
        if (com.join.android.app.common.utils.j.j(this.f29449z)) {
            this.C = true;
            try {
                CommentResponse<CommentDetailBean> e5 = this.f29447x.e(N0(str));
                if (e5 != null) {
                    if (e5.getCode() != 0) {
                        a1(e5);
                    }
                    if (this.B == 1 && (e5.getData_info().getMain_comment() == null || e5.getData_info().getMain_comment().size() <= 0)) {
                        g1();
                        return;
                    }
                    CommentDetailBean.GameInfoBean game_info = e5.getData_info().getGame_info();
                    List<CommentDetailBean.MainCommentBean> main_comment = e5.getData_info().getMain_comment();
                    if (this.B == 1 && game_info != null) {
                        f1(game_info);
                    }
                    int i4 = 10;
                    if (this.B == 1 && main_comment != null && main_comment.size() > 0) {
                        CommentDetailBean.MainCommentBean mainCommentBean = main_comment.get(0);
                        this.F1 = mainCommentBean;
                        mainCommentBean.setPn(this.B);
                        e1(this.F1);
                        main_comment.remove(0);
                        i4 = 9;
                    }
                    if (main_comment != null) {
                        for (int i5 = 0; i5 < main_comment.size(); i5++) {
                            main_comment.get(i5).setPn(this.B);
                        }
                    }
                    j1(main_comment, i4);
                    return;
                }
                showLodingFailed();
                return;
            } catch (Exception e6) {
                showLodingFailed();
                e6.printStackTrace();
                return;
            }
        }
        showLodingFailed();
    }

    public RequestCommentpraiseArgs P0(String str, int i4, int i5) {
        String str2;
        String str3 = Build.MODEL;
        this.H1 = this.f29448y.commentToken().d();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29449z).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            this.F = accountData.getUid();
            str2 = this.G.getToken();
        } else {
            str2 = "";
        }
        return RequestBeanUtil.getInstance(this.f29449z).getPraiseComment(this.f29439q, this.H1, str3, str, str2, this.F, i4, i5);
    }

    public CommentCreateArgs Q0(String str, String str2, String str3, String str4, String str5, String str6, int i4) {
        String str7;
        String str8;
        String str9;
        int i5;
        String d5 = this.f29448y.commentToken().d();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29449z).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            int uid = accountData.getUid();
            String nickname = this.G.getNickname();
            i5 = uid;
            str7 = nickname;
            str8 = this.G.d0();
            str9 = this.G.getToken();
        } else {
            str7 = "";
            str8 = str7;
            str9 = str8;
            i5 = -1;
        }
        return RequestBeanUtil.getInstance(this.f29449z).getReplyCreateCommentBean(this.f29439q, 0.0f, str2, d5, str3, 2, str, str7, str8, str9, i5, str4, str5, str6, i4);
    }

    public DeleteCommentArgs R0(String str, int i4) {
        String str2;
        String str3 = Build.MODEL;
        this.H1 = this.f29448y.commentToken().d();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29449z).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            this.F = accountData.getUid();
            str2 = this.G.getToken();
        } else {
            str2 = "";
        }
        return RequestBeanUtil.getInstance(this.f29449z).getDeleteComment(this.f29439q, this.H1, str3, str, str2, this.F, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void S0() {
        if (com.join.android.app.common.utils.j.j(this.f29449z)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.f29447x.c(RequestBeanUtil.getInstance(this).getTokenRequestBean(AccountUtil_.getInstance_(this).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.f29448y.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.f29448y.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void T0() {
        View inflate = getLayoutInflater().inflate(R.layout.comment_detail_top_popwin, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.pop_list_order_tx);
        TextView textView2 = (TextView) inflate.findViewById(R.id.pop_report_tx);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.update();
        popupWindow.showAsDropDown(this.f29424d, 0, 0);
        if (this.Q1.equals("desc")) {
            textView.setText("顺序查看");
        } else {
            textView.setText("倒序查看");
        }
        textView.setOnClickListener(new e(popupWindow));
        textView2.setOnClickListener(new f(popupWindow));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void V0(CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
        if (com.join.android.app.common.utils.j.j(this.f29449z)) {
            try {
                CommentResponse<CommentPraiseBean> l4 = this.f29447x.l(P0(mainCommentBean.getId(), i4, mainCommentBean.getPn()));
                if (l4 != null) {
                    if (l4.getSucc() != 1) {
                        if (l4.getCode() == 801) {
                            a1(l4);
                        } else {
                            Z0(l4.getMsg(), true, 2);
                        }
                    } else {
                        K0(2);
                    }
                } else {
                    Z0("操作失败，请稍候再试~", true, 2);
                }
                return;
            } catch (Exception e5) {
                Z0("操作失败，请稍候再试~", true, 2);
                e5.printStackTrace();
                return;
            }
        }
        Z0("网络连接失败，再试试吧~", true, 2);
    }

    @Override // com.join.mgps.adapter.CommentDetailAdapter.h
    @Background
    public void X(CommentDetailBean.MainCommentBean mainCommentBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f29449z)) {
            try {
                CommentResponse<CommentPraiseBean> h4 = this.f29447x.h(P0(mainCommentBean.getId(), i5, mainCommentBean.getPn()));
                if (h4 != null) {
                    if (h4.getSucc() != 1) {
                        if (h4.getCode() == 801) {
                            a1(h4);
                        } else {
                            c1(h4.getMsg(), true, i4, 1);
                        }
                    }
                } else {
                    c1("操作失败，请稍候再试~", true, i4, 1);
                }
                return;
            } catch (Exception e5) {
                c1("操作失败，请稍候再试~", true, i4, 1);
                e5.printStackTrace();
                return;
            }
        }
        c1("网络连接失败，再试试吧~", true, i4, 1);
    }

    public void X0(int i4) {
        long longValue = Long.valueOf(this.F1.getDespise_count()).longValue();
        if (this.F1.getIs_despise() == 1) {
            this.F1.setIs_despise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                this.F1.setDespise_count("0");
            } else {
                CommentDetailBean.MainCommentBean mainCommentBean = this.F1;
                mainCommentBean.setDespise_count(j4 + "");
            }
        } else if (i4 != 1) {
            this.F1.setIs_despise(1);
            CommentDetailBean.MainCommentBean mainCommentBean2 = this.F1;
            mainCommentBean2.setDespise_count((longValue + 1) + "");
        }
        e1(this.F1);
    }

    public void Y0(int i4) {
        long longValue = Long.valueOf(this.F1.getPraise_count()).longValue();
        if (this.F1.getIs_praise() == 1) {
            this.F1.setIs_praise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                this.F1.setPraise_count("0");
            } else {
                CommentDetailBean.MainCommentBean mainCommentBean = this.F1;
                mainCommentBean.setPraise_count(j4 + "");
            }
        } else if (i4 != 1) {
            this.F1.setIs_praise(1);
            CommentDetailBean.MainCommentBean mainCommentBean2 = this.F1;
            mainCommentBean2.setPraise_count((longValue + 1) + "");
        }
        e1(this.F1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(String str, boolean z4, int i4) {
        com.join.mgps.Util.l2.a(this.f29449z).b(str);
        if (z4) {
            if (i4 == 1) {
                Y0(0);
            } else {
                X0(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            S0();
            com.join.mgps.Util.l2.a(this.f29449z).b("数据访问失败，请稍候再试！");
            return;
        }
        com.join.mgps.Util.l2.a(this.f29449z).b(commentResponse.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f29447x = com.join.mgps.rpc.impl.e.m();
        this.f29449z = this;
        this.f29423c.setText("点评详情");
        org.greenrobot.eventbus.c.f().t(this);
        this.H1 = this.f29448y.commentToken().d();
        String str = this.f29436p;
        this.I1 = str;
        this.J1 = str;
        this.P1 = com.join.mgps.Util.b0.f0(this.f29449z).x(this.f29449z);
        U0();
        this.f29434n.setShowDeleteIcon(false);
        this.f29431k.setVisibility(8);
        this.f29432l.setVisibility(8);
        this.f29433m.setVisibility(8);
        this.f29435o.setOnClickListener(new k());
        showLoding();
        O0(this.Q1);
        this.A = new CommentDetailAdapter(this.f29449z, this.D, this);
        this.f29427g.addHeaderView(this.H);
        this.f29427g.setAdapter((ListAdapter) this.A);
        this.f29427g.setPreLoadCount(10);
        this.f29427g.setVerticalScrollBarEnabled(false);
        this.f29427g.setPullLoadEnable(new l());
        this.f29427g.setPullRefreshEnable(new m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b1(String str, boolean z4) {
        if (!str.isEmpty()) {
            com.join.mgps.Util.l2.a(this.f29449z).b(str);
        }
        if (z4) {
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.j(1, "", 0.0d, 0L, ""));
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c1(String str, boolean z4, int i4, int i5) {
        com.join.mgps.Util.l2.a(this.f29449z).b(str);
        if (z4 && i5 == 1) {
            this.A.j(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d1(String str, CommentCreateBean.InfoBean infoBean, boolean z4) {
        M0();
        com.join.mgps.Util.l2.a(this.f29449z).b(str);
        if (z4) {
            ArrayList arrayList = new ArrayList();
            if (this.J1 == this.f29436p) {
                CommentDetailBean.MainCommentBean mainCommentBean = new CommentDetailBean.MainCommentBean();
                mainCommentBean.setId(infoBean.getId());
                mainCommentBean.setUid(infoBean.getUid());
                mainCommentBean.setUser_name(infoBean.getUser_name());
                mainCommentBean.setRank(infoBean.getRank());
                mainCommentBean.setHead_portrait(infoBean.getHead_portrait());
                mainCommentBean.setGame_id(infoBean.getGame_id());
                mainCommentBean.setContent(infoBean.getContent());
                mainCommentBean.setMobile_phone_model(infoBean.getMobile_phone_model());
                mainCommentBean.setPraise_count(String.valueOf(infoBean.getPraise_count()));
                mainCommentBean.setDespise_count(String.valueOf(infoBean.getDespise_count()));
                mainCommentBean.setStart_game_count(String.valueOf(infoBean.getStart_game_count()));
                mainCommentBean.setStars_score(infoBean.getStars_score());
                mainCommentBean.setApproval_rate(infoBean.getApproval_rate());
                mainCommentBean.setAdd_times(String.valueOf(infoBean.getAdd_times()));
                mainCommentBean.setIs_belong_to(infoBean.getIs_despise());
                mainCommentBean.setReply_count(String.valueOf(infoBean.getReply_count()));
                mainCommentBean.setIs_praise(infoBean.getIs_praise());
                mainCommentBean.setIs_despise(infoBean.getIs_despise());
                mainCommentBean.setIs_old(String.valueOf(infoBean.getIs_old()));
                mainCommentBean.setPn(this.M1);
                mainCommentBean.setVip_level(infoBean.getVip_level());
                mainCommentBean.setSvip_level(infoBean.getSvip_level());
                arrayList.add(0, mainCommentBean);
                this.E.addAll(0, arrayList);
                I0(arrayList, true);
            } else {
                int i4 = -1;
                for (int i5 = 0; i5 < this.E.size(); i5++) {
                    if (this.E.get(i5).getId().equals(this.O1)) {
                        i4 = i5;
                    }
                }
                if (i4 == -1) {
                    return;
                }
                CommentDetailBean.MainCommentBean mainCommentBean2 = this.E.get(i4);
                if (this.J1 != mainCommentBean2.getId() && mainCommentBean2.getSub_comment() != null) {
                    int size = mainCommentBean2.getSub_comment().size();
                    for (int i6 = 0; i6 < size; i6++) {
                        mainCommentBean2.getSub_comment().get(i6).getId().equals(this.J1);
                    }
                }
                CommentDetailBean.MainCommentBean.SubCommentBean subCommentBean = new CommentDetailBean.MainCommentBean.SubCommentBean();
                subCommentBean.setId(infoBean.getId());
                subCommentBean.setUid(infoBean.getUid());
                subCommentBean.setUser_name(infoBean.getUser_name());
                subCommentBean.setGame_id(infoBean.getGame_id());
                subCommentBean.setContent(infoBean.getContent());
                subCommentBean.setVip_level(infoBean.getVip_level());
                subCommentBean.setSvip_level(infoBean.getSvip_level());
                subCommentBean.setReply_vip_level(infoBean.getReply_vip_level());
                subCommentBean.setReply_svip_level(infoBean.getReply_svip_level());
                if (mainCommentBean2.getSub_comment() == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(subCommentBean);
                    mainCommentBean2.setSub_comment(arrayList2);
                } else {
                    mainCommentBean2.getSub_comment().add(0, subCommentBean);
                }
                this.E.set(i4, mainCommentBean2);
                this.D.clear();
                I0(this.E, false);
            }
            this.A.notifyDataSetChanged();
            this.f29434n.setText("");
            this.f29434n.setHint("添加评论");
            this.J1 = this.f29436p;
            this.M1 = 1;
            this.K1 = this.F1.getUser_name();
            this.L1 = this.F1.getUid();
            this.O1 = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e1(CommentDetailBean.MainCommentBean mainCommentBean) {
        String str;
        if (mainCommentBean != null) {
            this.K1 = mainCommentBean.getUser_name();
            this.L1 = mainCommentBean.getUid();
            UtilsMy.s3(this, mainCommentBean.getHead_portrait(), this.K);
            this.K.setOnClickListener(new n(mainCommentBean));
            this.M.setText(mainCommentBean.getUser_name());
            this.M.setTextColor(-16777216);
            if (mainCommentBean.getVip_level() > 0) {
                this.M.setTextColor(getResources().getColor(R.color.vip_color));
            }
            if (mainCommentBean.getSvip_level() > 0) {
                this.M.setTextColor(getResources().getColor(R.color.vip_svip_color));
            }
            this.N.setVipData(mainCommentBean.getVip_level(), mainCommentBean.getSvip_level());
            String uid = mainCommentBean.getUid();
            if (uid.equals("" + this.F)) {
                this.O.setVisibility(0);
                if (mainCommentBean.getIs_old().equals("1")) {
                    this.Y.setVisibility(8);
                } else {
                    this.Y.setVisibility(0);
                }
            } else {
                this.O.setVisibility(8);
                this.Y.setVisibility(8);
            }
            if (mainCommentBean.getRank().equals("")) {
                this.V.setVisibility(8);
            } else {
                this.V.setVisibility(0);
            }
            this.P.setText(mainCommentBean.getRank());
            this.T.setTextHeader(mainCommentBean.getContent());
            if (!mainCommentBean.getIs_old().equals("1") && mainCommentBean.getMobile_phone_model() != null && !mainCommentBean.getMobile_phone_model().isEmpty()) {
                this.f29438p1.setVisibility(0);
                this.f29438p1.setText(mainCommentBean.getMobile_phone_model());
            } else {
                this.f29438p1.setVisibility(4);
            }
            TextView textView = this.A1;
            textView.setText(mainCommentBean.getPraise_count() + "");
            TextView textView2 = this.C1;
            textView2.setText(mainCommentBean.getDespise_count() + "");
            TextView textView3 = this.E1;
            textView3.setText(mainCommentBean.getReply_count() + "");
            this.R.setText(com.join.android.app.common.utils.g.a(Long.parseLong(mainCommentBean.getAdd_times() + "000")));
            if (!mainCommentBean.getIs_old().equals("1") && Float.valueOf(mainCommentBean.getStars_score()).floatValue() != 0.0f && ((str = this.f29440r) == null || str.equals("1"))) {
                this.X.setVisibility(0);
                this.X.setStarCount(Integer.valueOf(mainCommentBean.getStars_score()).intValue());
                this.X.setStarMark(Float.valueOf(mainCommentBean.getStars_score()).floatValue());
            } else {
                this.X.setVisibility(8);
            }
            this.Q.setVisibility(8);
            if (mainCommentBean.getApproval_rate() != null && Double.valueOf(mainCommentBean.getApproval_rate()).doubleValue() > 70.0d) {
                this.W.setVisibility(0);
            } else {
                this.W.setVisibility(8);
            }
            if (mainCommentBean.getIs_praise() == 1) {
                this.f29445v1.setImageResource(R.drawable.uped_ic);
            } else {
                this.f29445v1.setImageResource(R.drawable.up_ic);
            }
            if (mainCommentBean.getIs_despise() == 1) {
                this.B1.setImageResource(R.drawable.downed_ic);
            } else {
                this.B1.setImageResource(R.drawable.down_ic);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f1(CommentDetailBean.GameInfoBean gameInfoBean) {
        if (gameInfoBean != null) {
            if (com.join.mgps.Util.g2.i(gameInfoBean.getGame_ico())) {
                UtilsMy.v3(this, gameInfoBean.getGame_ico(), this.J);
            }
            this.L.setText(gameInfoBean.getGame_name());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1() {
        this.f29426f.setVisibility(8);
        this.f29425e.setVisibility(0);
        this.f29430j.setVisibility(8);
        this.f29429i.setVisibility(8);
        this.f29428h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i1() {
        this.P1.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j1(List<CommentDetailBean.MainCommentBean> list, int i4) {
        if (this.B == 1) {
            this.f29427g.setVisibility(0);
            this.f29426f.setVisibility(0);
            this.f29430j.setVisibility(0);
            this.f29429i.setVisibility(8);
            this.f29428h.setVisibility(8);
            this.E.clear();
            this.D.clear();
        }
        if (list == null) {
            this.f29427g.setNoMore();
            return;
        }
        this.B++;
        this.E.addAll(list);
        I0(list, false);
        if (list.size() <= 0) {
            this.f29427g.setNoMore();
        }
        this.A.notifyDataSetChanged();
        p1();
    }

    public void k1() {
        long longValue = Long.valueOf(this.F1.getDespise_count()).longValue();
        this.F1.setIs_despise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            this.F1.setDespise_count("0");
            return;
        }
        CommentDetailBean.MainCommentBean mainCommentBean = this.F1;
        mainCommentBean.setDespise_count(j4 + "");
    }

    public void l1() {
        long longValue = Long.valueOf(this.F1.getPraise_count()).longValue();
        this.F1.setIs_praise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            this.F1.setPraise_count("0");
            return;
        }
        CommentDetailBean.MainCommentBean mainCommentBean = this.F1;
        mainCommentBean.setPraise_count(j4 + "");
    }

    @Override // com.join.mgps.adapter.CommentDetailAdapter.h
    public void m(CommentDetailBean.MainCommentBean.SubCommentBean subCommentBean, int i4, String str) {
        J0(subCommentBean.getId(), subCommentBean.getUser_name(), subCommentBean.getUid(), str, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m1(String str, String str2, String str3, String str4, String str5, String str6, int i4) {
        if (com.join.android.app.common.utils.j.j(this.f29449z)) {
            i1();
            try {
                CommentResponse<CommentCreateBean> d5 = this.f29447x.d(Q0(str, str2, str3, str4, str5, str6, i4));
                if (d5 != null) {
                    if (d5.getCode() != 0) {
                        if (d5.getCode() == 801) {
                            a1(d5);
                        } else {
                            d1(d5.getMsg(), null, false);
                        }
                    } else if (d5.getData_info().getInfo() != null) {
                        d1("内容将在审核后显示！", d5.getData_info().getInfo(), true);
                    }
                } else {
                    d1("回复失败，请稍候再试~", null, false);
                }
                return;
            } catch (Exception e5) {
                d1(e5.getMessage(), null, false);
                e5.printStackTrace();
                return;
            }
        }
        d1("网络连接失败，再试试吧~", null, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n1(CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
        if (com.join.android.app.common.utils.j.j(this.f29449z)) {
            try {
                CommentResponse<CommentPraiseBean> h4 = this.f29447x.h(P0(mainCommentBean.getId(), i4, mainCommentBean.getPn()));
                if (h4 != null) {
                    if (h4.getSucc() != 1) {
                        if (h4.getCode() == 801) {
                            a1(h4);
                        } else {
                            Z0(h4.getMsg(), true, 1);
                        }
                    } else {
                        K0(1);
                    }
                } else {
                    Z0("操作失败，请稍候再试~", true, 1);
                }
                return;
            } catch (Exception e5) {
                Z0("操作失败，请稍候再试~", true, 1);
                e5.printStackTrace();
                return;
            }
        }
        Z0("网络连接失败，再试试吧~", true, 1);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeComment(com.join.mgps.event.j jVar) {
        if (jVar.getType() == 2) {
            this.X.setStarCount((int) jVar.c());
            this.X.setStarMark(jVar.c());
            if (jVar.b() != null && !jVar.b().isEmpty()) {
                this.f29438p1.setVisibility(0);
                this.f29438p1.setText(jVar.b());
                return;
            }
            this.f29438p1.setVisibility(4);
            this.F1.setMobile_phone_model("");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.join.mgps.adapter.CommentDetailAdapter.h
    public void p(CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
        J0(mainCommentBean.getId(), mainCommentBean.getUser_name(), mainCommentBean.getUid(), mainCommentBean.getId(), mainCommentBean.getPn());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p1() {
        this.f29427g.u();
        this.f29427g.v();
        this.C = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f29427g.setVisibility(8);
        this.f29426f.setVisibility(8);
        this.f29430j.setVisibility(8);
        this.f29429i.setVisibility(8);
        this.f29428h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        p1();
        List<CommentDetailBean.MainCommentBean> list = this.E;
        if (list != null && list.size() != 0) {
            Toast.makeText(this, getString(R.string.net_connect_failed), 0).show();
            return;
        }
        this.f29427g.setVisibility(8);
        this.f29426f.setVisibility(8);
        this.f29430j.setVisibility(8);
        this.f29429i.setVisibility(0);
        this.f29428h.setVisibility(8);
    }
}
