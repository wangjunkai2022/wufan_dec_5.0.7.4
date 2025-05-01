package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.dingmouren.layoutmanagergroup.viewpager.ViewPagerLayoutManager;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentAllListActivity_;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.customview.GamelistExpandableTextView;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.ForumResponseGame;
import com.join.mgps.dto.GameFromBooleanBean;
import com.join.mgps.dto.GameListItemBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.ShareToBaseBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.activity_game_detail)
/* loaded from: classes.dex */
public class GameDetailActivity extends BaseActivity implements AbsListView.OnScrollListener {
    TextView A;
    ViewPagerLayoutManager A1;
    TextView B;
    n B1;
    LinearLayout C;
    SimpleDraweeView D;
    View D1;
    TextView E;
    TextView F;
    Context G;
    k H;
    View H1;
    String I;
    int J;
    int K;
    PopupWindow K1;
    int L;
    InputFilter[] L1;
    String M;
    String N;
    com.wufan.user.service.protobuf.n0 O;
    View O1;
    com.join.mgps.rpc.b P;
    View P1;
    EditText Q1;
    ForumResponseGame.Datadetails S;
    String T;
    String U;
    List<String> V;
    List<String> W;
    List<DownloadTask> Z;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f31503b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XRecyclerView f31504c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f31505d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f31506e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f31507f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f31508g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f31509h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f31510i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    SimpleDraweeView f31511j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f31512k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f31513l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f31514m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f31515n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f31516o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f31517p;

    /* renamed from: p0  reason: collision with root package name */
    ForumResponseGame f31518p0;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    LinearLayout f31520q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    SimpleDraweeView f31521r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f31522s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    RelativeLayout f31523t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    ImageView f31524u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    TextView f31525v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    TextView f31527w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    TextView f31528x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    TextView f31529y;

    /* renamed from: z  reason: collision with root package name */
    LinearLayout f31530z;
    int Q = 1;
    private List<GameListItemBean> R = new ArrayList();
    String X = "";
    String Y = "";

    /* renamed from: p1  reason: collision with root package name */
    boolean f31519p1 = true;

    /* renamed from: v1  reason: collision with root package name */
    boolean f31526v1 = false;
    private boolean C1 = false;
    boolean E1 = false;
    String F1 = "";
    private boolean G1 = false;
    boolean I1 = true;
    String J1 = "";
    boolean M1 = false;
    boolean N1 = true;
    private Map<String, DownloadTask> R1 = new ConcurrentHashMap();
    private int S1 = 0;
    private int T1 = 0;
    private int U1 = 0;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            com.join.mgps.Util.v0.d("gamelist  ", "loadmore 11111");
            GameDetailActivity gameDetailActivity = GameDetailActivity.this;
            if (gameDetailActivity.f31519p1 && !gameDetailActivity.f31526v1) {
                gameDetailActivity.l0();
                com.join.mgps.Util.v0.d("gamelist  ", "loadmore 2222");
                GameDetailActivity.this.j0();
                return;
            }
            gameDetailActivity.f31506e.g();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity gameDetailActivity = GameDetailActivity.this;
            gameDetailActivity.I0(null, gameDetailActivity.f31525v.getText().toString().trim(), "", null, 1, 0);
        }
    }

    /* loaded from: classes4.dex */
    class c implements com.dingmouren.layoutmanagergroup.viewpager.a {
        c() {
        }

        @Override // com.dingmouren.layoutmanagergroup.viewpager.a
        public void a(boolean z4, int i4) {
        }

        @Override // com.dingmouren.layoutmanagergroup.viewpager.a
        public void b() {
        }

        @Override // com.dingmouren.layoutmanagergroup.viewpager.a
        public void c(int i4, boolean z4) {
            com.join.mgps.Util.v0.c(" onPageSelected  " + i4 + "  " + z4);
            GameDetailActivity.this.S0(i4);
        }
    }

    /* loaded from: classes4.dex */
    class d implements XRecyclerView.f {
        d() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            GameDetailActivity gameDetailActivity = GameDetailActivity.this;
            if (gameDetailActivity.f31519p1) {
                gameDetailActivity.l0();
                GameDetailActivity.this.j0();
            }
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = GameDetailActivity.this.K1;
            if (popupWindow != null) {
                if (popupWindow.isShowing()) {
                    GameDetailActivity.this.K1.dismiss();
                    GameDetailActivity.this.N1 = true;
                    return;
                }
                GameDetailActivity.this.J0("亲，请慢点");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements PopupWindow.OnDismissListener {
        f() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            GameDetailActivity.this.N1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f31538c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f31539d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f31540e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ GameListItemBean f31541f;

        g(int i4, String str, String str2, l lVar, GameListItemBean gameListItemBean) {
            this.f31537b = i4;
            this.f31538c = str;
            this.f31539d = str2;
            this.f31540e = lVar;
            this.f31541f = gameListItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.mgps.Util.o.f(GameDetailActivity.this.Q1.getText().toString().trim()) && !GameDetailActivity.this.Q1.getText().toString().trim().equals("")) {
                GameDetailActivity.this.K1.dismiss();
                if (this.f31537b == 2) {
                    if (GameDetailActivity.this.Q1.getText().toString().trim().equals(this.f31538c)) {
                        return;
                    }
                    List<String> list = GameDetailActivity.this.V;
                    list.add(this.f31539d + "|" + GameDetailActivity.this.Q1.getText().toString().trim());
                    this.f31540e.f31586m.setText(GameDetailActivity.this.Q1.getText().toString().trim());
                    this.f31541f.setInfo(GameDetailActivity.this.Q1.getText().toString().trim());
                    this.f31541f.setCustomer_info(GameDetailActivity.this.Q1.getText().toString().trim());
                    return;
                } else if (GameDetailActivity.this.Q1.getText().toString().trim().equals(this.f31538c)) {
                    return;
                } else {
                    GameDetailActivity gameDetailActivity = GameDetailActivity.this;
                    gameDetailActivity.F1 = gameDetailActivity.Q1.getText().toString().trim();
                    GameDetailActivity gameDetailActivity2 = GameDetailActivity.this;
                    gameDetailActivity2.f31525v.setText(gameDetailActivity2.F1);
                    GameDetailActivity gameDetailActivity3 = GameDetailActivity.this;
                    TextView textView = gameDetailActivity3.f31525v;
                    if (textView != null) {
                        textView.setText(gameDetailActivity3.F1);
                        return;
                    }
                    return;
                }
            }
            GameDetailActivity.this.J0("不能为空或者表情");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f31543b;

        h(View view) {
            this.f31543b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Rect rect = new Rect();
            this.f31543b.getWindowVisibleDisplayFrame(rect);
            if (rect.bottom - rect.top > (this.f31543b.getHeight() / 3) * 2) {
                GameDetailActivity gameDetailActivity = GameDetailActivity.this;
                if (gameDetailActivity.M1) {
                    gameDetailActivity.K1.dismiss();
                    GameDetailActivity.this.M1 = false;
                    return;
                }
                return;
            }
            GameDetailActivity.this.M1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        GameListItemBean f31545b;

        /* renamed from: c  reason: collision with root package name */
        int f31546c;

        public i(GameListItemBean gameListItemBean, int i4) {
            this.f31545b = gameListItemBean;
            this.f31546c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f31545b.getDownloadTask();
            if (downloadTask == null) {
                if (this.f31545b.getMod_info() == null && UtilsMy.o0(this.f31545b.getTag_info())) {
                    if (this.f31545b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G).d(GameDetailActivity.this.G, this.f31545b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G).l(GameDetailActivity.this.G, this.f31545b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f31545b.getVer()) || l4.d() >= Integer.parseInt(this.f31545b.getVer())) {
                                com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G);
                                APKUtils.a0(GameDetailActivity.this.G, this.f31545b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G).d(GameDetailActivity.this.G, this.f31545b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f31545b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G);
                            APKUtils.V(GameDetailActivity.this.G, this.f31545b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(GameDetailActivity.this.G, this.f31545b);
                return;
            }
            String plugin_num = this.f31545b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f31545b.getDown_url_remote());
                UtilsMy.T2(downloadTask, GameDetailActivity.this.G);
                IntentUtil.getInstance().intentActivity(GameDetailActivity.this.G, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f31545b.getPay_tag_info(), this.f31545b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status != 13) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(GameDetailActivity.this.G, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(GameDetailActivity.this.G)) {
                                            GameDetailActivity.this.J0("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(GameDetailActivity.this.G, downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(GameDetailActivity.this.G)) {
                                                    GameDetailActivity.this.J0("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(GameDetailActivity.this.G, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, GameDetailActivity.this.G);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, GameDetailActivity.this.G);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(GameDetailActivity.this.G, downloadTask);
                return;
            }
            if (UtilsMy.y0(this.f31545b.getPay_tag_info(), this.f31545b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(GameDetailActivity.this.G, downloadTask.getCrc_link_type_val());
            } else if (this.f31545b.getDown_status() == 5) {
                UtilsMy.l1(GameDetailActivity.this.G, downloadTask);
            } else {
                UtilsMy.R0(GameDetailActivity.this.G, downloadTask, this.f31545b.getTp_down_url(), this.f31545b.getOther_down_switch(), this.f31545b.getCdn_down_switch());
            }
            Ext ext = new Ext();
            ext.setGameId(this.f31545b.getGame_id());
            if (this.f31546c == 1) {
                ext.setPosition("listMode");
            } else {
                ext.setPosition("defaultMode");
            }
            ext.setArticleId(GameDetailActivity.this.I);
            com.papa.sim.statistic.p.l(GameDetailActivity.this.G).O1(Event.downloadFromUserGameList, ext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<CommentBaseBean> f31548b;

        /* renamed from: c  reason: collision with root package name */
        int f31549c;

        /* renamed from: d  reason: collision with root package name */
        GameListItemBean f31550d;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CommentBaseBean f31552b;

            a(CommentBaseBean commentBaseBean) {
                this.f31552b = commentBaseBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Ext ext = new Ext();
                ext.setPosition("comments");
                ext.setGameId(j.this.f31550d.getCrc_sign_id());
                ext.setArticleId(GameDetailActivity.this.I);
                com.papa.sim.statistic.p.l(GameDetailActivity.this.G).O1(Event.clickFromUserGameList, ext);
                if (com.join.mgps.Util.g2.h(this.f31552b.getId())) {
                    IntentUtil intentUtil = IntentUtil.getInstance();
                    j jVar = j.this;
                    intentUtil.goGameDetialActivity(GameDetailActivity.this.G, jVar.f31550d.getCrc_sign_id(), j.this.f31550d.getGame_info_tpl_type(), j.this.f31550d.getSp_tpl_two_position(), GameDetailActivity.this.K);
                    return;
                }
                CommentAllListActivity_.p a5 = CommentAllListActivity_.H0(GameDetailActivity.this.G).f(this.f31552b.getGame_id()).i(j.this.f31550d.getPackageName()).h(j.this.f31550d.getPlugin_num()).g(1).j(j.this.f31550d.getGame_score() != null ? j.this.f31550d.getGame_score().getSgc_switch() : 0).a(0);
                a5.d(j.this.f31550d.getComment_score_switch() + "").start();
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CommentBaseBean f31554b;

            b(CommentBaseBean commentBaseBean) {
                this.f31554b = commentBaseBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Ext ext = new Ext();
                ext.setPosition("comments");
                ext.setGameId(j.this.f31550d.getCrc_sign_id());
                ext.setArticleId(GameDetailActivity.this.I);
                com.papa.sim.statistic.p.l(GameDetailActivity.this.G).O1(Event.clickFromUserGameList, ext);
                if (com.join.mgps.Util.g2.h(this.f31554b.getId())) {
                    IntentUtil intentUtil = IntentUtil.getInstance();
                    j jVar = j.this;
                    intentUtil.goGameDetialActivity(GameDetailActivity.this.G, jVar.f31550d.getCrc_sign_id(), j.this.f31550d.getGame_info_tpl_type(), j.this.f31550d.getSp_tpl_two_position(), GameDetailActivity.this.K);
                    return;
                }
                CommentAllListActivity_.p a5 = CommentAllListActivity_.H0(GameDetailActivity.this.G).f(this.f31554b.getGame_id()).i(j.this.f31550d.getPackageName()).h(j.this.f31550d.getPlugin_num()).g(1).j(j.this.f31550d.getGame_score() != null ? j.this.f31550d.getGame_score().getSgc_switch() : 0).a(0);
                a5.d(j.this.f31550d.getComment_score_switch() + "").start();
            }
        }

        /* loaded from: classes4.dex */
        class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GamelistExpandableTextView f31556b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CommentBaseBean f31557c;

            c(GamelistExpandableTextView gamelistExpandableTextView, CommentBaseBean commentBaseBean) {
                this.f31556b = gamelistExpandableTextView;
                this.f31557c = commentBaseBean;
            }

            @Override // java.lang.Runnable
            public void run() {
                int height = this.f31556b.getHeight() / GameDetailActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp37);
                this.f31556b.setMaxLines(height);
                this.f31556b.setMaxLinesOnShrink(height);
                this.f31556b.u(this.f31557c.getContent(), this.f31556b.getWidth(), 0);
            }
        }

        public j(List<CommentBaseBean> list, int i4, GameListItemBean gameListItemBean) {
            this.f31549c = 0;
            this.f31548b = list;
            this.f31549c = i4;
            this.f31550d = gameListItemBean;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f31548b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(GameDetailActivity.this.G).inflate(R.layout.gamelist_detial_comment_layout, (ViewGroup) null);
            }
            CommentBaseBean commentBaseBean = this.f31548b.get(i4);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(GameDetailActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp6));
            gradientDrawable.setStroke(GameDetailActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp1), this.f31549c);
            MStarBar mStarBar = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            GamelistExpandableTextView gamelistExpandableTextView = (GamelistExpandableTextView) view.findViewById(R.id.content);
            TextView textView = (TextView) view.findViewById(R.id.more);
            View findViewById = view.findViewById(R.id.main);
            View findViewById2 = view.findViewById(R.id.usertag);
            findViewById.setBackground(gradientDrawable);
            MyImageLoader.x((SimpleDraweeView) view.findViewById(R.id.userIcon), commentBaseBean.getHead_portrait());
            ((TextView) view.findViewById(R.id.userName)).setText(commentBaseBean.getUser_name());
            if (commentBaseBean.getIs_old() != 1 && Float.valueOf(commentBaseBean.getStars_score()).floatValue() != 0.0f) {
                mStarBar.setVisibility(0);
                mStarBar.setStarMark(Double.parseDouble(commentBaseBean.getStars_score()));
            } else {
                mStarBar.setVisibility(8);
            }
            if (com.join.mgps.Util.g2.h(commentBaseBean.getId())) {
                findViewById2.setVisibility(0);
            } else {
                findViewById2.setVisibility(8);
            }
            gamelistExpandableTextView.setText(commentBaseBean.getContent());
            gamelistExpandableTextView.u(commentBaseBean.getContent(), gamelistExpandableTextView.getWidth(), 0);
            findViewById.setOnClickListener(new a(commentBaseBean));
            gamelistExpandableTextView.setOnClickListener(new b(commentBaseBean));
            gamelistExpandableTextView.post(new c(gamelistExpandableTextView, commentBaseBean));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends BaseAdapter {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements AdapterView.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f31560a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31561b;

            a(List list, GameListItemBean gameListItemBean) {
                this.f31560a = list;
                this.f31561b = gameListItemBean;
            }

            @Override // it.sephiroth.android.library.widget.AdapterView.d
            public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
                try {
                    Intent intent = new Intent(GameDetailActivity.this.G, ImagePagerActivity.class);
                    String[] strArr = new String[this.f31560a.size()];
                    for (int i5 = 0; i5 < this.f31560a.size(); i5++) {
                        strArr[i5] = (String) this.f31560a.get(i5);
                    }
                    if (com.join.mgps.Util.g2.i(this.f31561b.getVedio_url()) && i4 == 0) {
                        FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                        videoInfo.m(this.f31561b.getVedio_url());
                        videoInfo.h(strArr[0]);
                        FullScreenActivity_.i0(GameDetailActivity.this.G).a(videoInfo).start();
                        return;
                    }
                    intent.putExtra("image_urls", strArr);
                    intent.putExtra("image_index", i4);
                    GameDetailActivity.this.G.startActivity(intent);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31563b;

            b(GameListItemBean gameListItemBean) {
                this.f31563b = gameListItemBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GameDetailActivity gameDetailActivity = GameDetailActivity.this;
                if (gameDetailActivity.f31519p1) {
                    Ext ext = new Ext();
                    ext.setPosition("brief");
                    ext.setGameId(this.f31563b.getCrc_sign_id());
                    ext.setArticleId(GameDetailActivity.this.I);
                    com.papa.sim.statistic.p.l(GameDetailActivity.this.G).O1(Event.clickFromUserGameList, ext);
                    IntentUtil.getInstance().goGameDetialActivity(GameDetailActivity.this.G, this.f31563b.getCrc_sign_id(), this.f31563b.getGame_info_tpl_type(), this.f31563b.getSp_tpl_two_position(), GameDetailActivity.this.K);
                    return;
                }
                gameDetailActivity.J0("请先点击完成");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31565b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l f31566c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f31567d;

            c(GameListItemBean gameListItemBean, l lVar, int i4) {
                this.f31565b = gameListItemBean;
                this.f31566c = lVar;
                this.f31567d = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (GameDetailActivity.this.S.getIs_self().equals("1") && GameDetailActivity.this.S.getTv_btn() == 0) {
                    if (this.f31565b.getCustomer_info() != null && !this.f31565b.getCustomer_info().equals("")) {
                        GameDetailActivity.this.J1 = this.f31565b.getCustomer_info();
                    } else {
                        GameDetailActivity.this.J1 = this.f31565b.getInfo();
                    }
                    GameDetailActivity gameDetailActivity = GameDetailActivity.this;
                    gameDetailActivity.I0(this.f31566c, gameDetailActivity.J1, this.f31565b.getGame_id(), this.f31565b, 2, this.f31567d);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class d implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31569b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f31570c;

            d(GameListItemBean gameListItemBean, int i4) {
                this.f31569b = gameListItemBean;
                this.f31570c = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GameDetailActivity.this.W.add(this.f31569b.getGame_id());
                GameDetailActivity.this.h0(this.f31570c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class e {

            /* renamed from: a  reason: collision with root package name */
            HListView f31572a;

            public e(View view) {
                this.f31572a = (HListView) view.findViewById(R.id.screenListView);
            }
        }

        k() {
        }

        public View a(int i4, View view, ViewGroup viewGroup) {
            e eVar;
            boolean z4;
            if (view == null) {
                view = LayoutInflater.from(GameDetailActivity.this.G).inflate(R.layout.gamedetail_item_viewpage1, (ViewGroup) null);
                eVar = new e(view);
                view.setTag(eVar);
            } else {
                eVar = (e) view.getTag();
            }
            GameListItemBean gameListItemBean = (GameListItemBean) getItem(i4);
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                if (com.join.mgps.Util.g2.i(gameListItemBean.getVedio_cover_pic()) && com.join.mgps.Util.g2.i(gameListItemBean.getVedio_url())) {
                    arrayList.add(gameListItemBean.getVedio_cover_pic());
                    z4 = true;
                } else {
                    z4 = false;
                }
                List<DetialShowImageBean> pic_info = gameListItemBean.getPic_info();
                if (pic_info != null) {
                    for (int i5 = 0; i5 < pic_info.size(); i5++) {
                        arrayList.add(pic_info.get(i5).getRemote().getPath());
                    }
                }
                if (arrayList.size() == 0) {
                    eVar.f31572a.setVisibility(8);
                } else {
                    eVar.f31572a.setVisibility(0);
                    int pic_position = gameListItemBean.getPic_position();
                    eVar.f31572a.setAdapter((ListAdapter) new com.join.mgps.adapter.p0(GameDetailActivity.this.G, pic_position, arrayList, z4));
                    if (pic_position == 1) {
                        eVar.f31572a.setDividerWidth(GameDetailActivity.this.G.getResources().getDimensionPixelSize(R.dimen.wdp10));
                        eVar.f31572a.postInvalidate();
                    } else {
                        eVar.f31572a.setDividerWidth(GameDetailActivity.this.G.getResources().getDimensionPixelSize(R.dimen.wdp20));
                        eVar.f31572a.postInvalidate();
                    }
                    eVar.f31572a.setOnItemClickListener(new a(arrayList, gameListItemBean));
                }
            }
            return view;
        }

        View b(int i4, View view, ViewGroup viewGroup) {
            l lVar;
            View view2;
            GameListItemBean gameListItemBean = (GameListItemBean) GameDetailActivity.this.R.get(i4);
            DownloadTask downloadTask = gameListItemBean.getDownloadTask();
            if (view == null) {
                view2 = LayoutInflater.from(GameDetailActivity.this.G).inflate(R.layout.gamede_item, (ViewGroup) null);
                lVar = new l();
                lVar.f31574a = (SimpleDraweeView) view2.findViewById(R.id.mgListviewItemIcon);
                lVar.f31575b = (TextView) view2.findViewById(R.id.mgListviewItemAppname);
                lVar.f31576c = (ProgressBar) view2.findViewById(R.id.progressBarZip);
                lVar.f31577d = (ProgressBar) view2.findViewById(R.id.progressBar);
                lVar.f31579f = (LinearLayout) view2.findViewById(R.id.tipsLayout);
                lVar.f31578e = (TextView) view2.findViewById(R.id.privilege);
                lVar.f31580g = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
                lVar.f31581h = (RelativeLayout) view2.findViewById(R.id.rLayoutRight2);
                lVar.f31582i = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
                lVar.f31583j = (LinearLayout) view2.findViewById(R.id.linearLayout2);
                lVar.f31585l = (TextView) view2.findViewById(R.id.appSize);
                lVar.f31586m = (TextView) view2.findViewById(R.id.tv_content);
                lVar.f31588o = (TextView) view2.findViewById(R.id.loding_info);
                lVar.f31589p = (TextView) view2.findViewById(R.id.tv_delect_game);
                lVar.f31584k = (LinearLayout) view2.findViewById(R.id.rl_item);
                lVar.f31587n = (TextView) view2.findViewById(R.id.mgListviewItemDescribe);
                view2.setTag(lVar);
            } else {
                lVar = (l) view.getTag();
                view2 = view;
            }
            if (GameDetailActivity.this.S.getTv_btn() == 0) {
                lVar.f31581h.setVisibility(0);
                lVar.f31580g.setVisibility(8);
            } else {
                lVar.f31581h.setVisibility(8);
                lVar.f31580g.setVisibility(0);
            }
            if (gameListItemBean.getCustomer_info() != null && !gameListItemBean.getCustomer_info().equals("")) {
                lVar.f31586m.setText(gameListItemBean.getCustomer_info());
            } else if (gameListItemBean.getInfo() != null && !gameListItemBean.getInfo().equals("")) {
                if (GameDetailActivity.this.S.getIs_self().equals("1") && GameDetailActivity.this.S.getTv_btn() == 0) {
                    lVar.f31586m.setText("在此输入推荐语.");
                } else {
                    lVar.f31586m.setText(gameListItemBean.getInfo());
                }
            } else if (GameDetailActivity.this.S.getIs_self().equals("1")) {
                lVar.f31586m.setText("在此输入推荐语");
            } else {
                lVar.f31586m.setText("不知道该说啥了");
            }
            lVar.f31584k.setOnClickListener(new b(gameListItemBean));
            lVar.f31586m.setOnClickListener(new c(gameListItemBean, lVar, i4));
            lVar.f31589p.setOnClickListener(new d(gameListItemBean, i4));
            lVar.f31575b.setText(gameListItemBean.getGame_name());
            lVar.f31587n.setText(gameListItemBean.getInfo());
            lVar.f31574a.setImageResource(R.drawable.main_normal_icon);
            gameListItemBean.getGift_package_switch();
            MyImageLoader.h(lVar.f31574a, gameListItemBean.getIco_remote());
            GameListItemBean gameListItemBean2 = (GameListItemBean) GameDetailActivity.this.R.get(i4);
            long parseDouble = (long) (Double.parseDouble(gameListItemBean2.getSize()) * 1024.0d * 1024.0d);
            UtilsMy.I(gameListItemBean.getScore(), gameListItemBean.getDown_count(), gameListItemBean.getSize(), gameListItemBean.getSp_tag_info(), gameListItemBean.getTag_info(), lVar.f31579f, GameDetailActivity.this.G);
            UtilsMy.j3(gameListItemBean.getSp_tag_info(), view2, downloadTask);
            String plugin_num = gameListItemBean2.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                lVar.f31582i.setBackgroundResource(R.drawable.recom_blue_butn);
                lVar.f31582i.setText("开始");
                lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_blue_color));
                lVar.f31579f.setVisibility(8);
            } else if (downloadTask == null) {
                GameDetailActivity.this.V0(lVar, Boolean.TRUE, Boolean.FALSE);
                if (UtilsMy.o0(gameListItemBean2.getTag_info())) {
                    if (UtilsMy.w0(gameListItemBean2.getPay_tag_info(), gameListItemBean2.getCrc_sign_id()) <= 0 ? com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G).d(GameDetailActivity.this.G, gameListItemBean2.getPackage_name()) : false) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G).l(GameDetailActivity.this.G, gameListItemBean2.getPackage_name());
                        if (com.join.mgps.Util.g2.i(gameListItemBean2.getVer()) && l4.d() < Integer.parseInt(gameListItemBean2.getVer())) {
                            lVar.f31582i.setBackgroundResource(R.drawable.recom_green_butn);
                            lVar.f31582i.setText("更新");
                            lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_green_color));
                        } else {
                            lVar.f31582i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            lVar.f31582i.setText(GameDetailActivity.this.G.getResources().getString(R.string.download_status_finished));
                            lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_main_color));
                        }
                    } else {
                        lVar.f31582i.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(gameListItemBean2.getPay_tag_info(), gameListItemBean2.getCrc_sign_id());
                        UtilsMy.Z2(lVar.f31582i, lVar.f31580g, gameListItemBean2);
                    }
                } else {
                    lVar.f31582i.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(gameListItemBean2.getPay_tag_info(), gameListItemBean2.getCrc_sign_id());
                    UtilsMy.Z2(lVar.f31582i, lVar.f31580g, gameListItemBean2);
                }
            } else {
                int status = downloadTask.getStatus();
                if (UtilsMy.w0(gameListItemBean2.getPay_tag_info(), gameListItemBean2.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        lVar.f31582i.setText("暂停中");
                    } else if (status == 48) {
                        lVar.f31577d.setProgress(100);
                        lVar.f31582i.setBackgroundResource(R.drawable.recom_blue_butn);
                        lVar.f31582i.setText("安装中");
                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_blue_color));
                        GameDetailActivity.this.V0(lVar, Boolean.TRUE, Boolean.FALSE);
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        lVar.f31582i.setBackgroundResource(R.drawable.recom_green_butn);
                                                        lVar.f31582i.setText("更新");
                                                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_green_color));
                                                        GameDetailActivity.this.V0(lVar, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 10:
                                                        lVar.f31582i.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        lVar.f31582i.setText("等待");
                                                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_blue_color));
                                                        GameDetailActivity gameDetailActivity = GameDetailActivity.this;
                                                        Boolean bool = Boolean.FALSE;
                                                        gameDetailActivity.V0(lVar, bool, bool);
                                                        try {
                                                            TextView textView = lVar.f31585l;
                                                            textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            lVar.f31577d.setProgress((int) downloadTask.getProgress());
                                                        } catch (Exception e5) {
                                                            e5.printStackTrace();
                                                        }
                                                        lVar.f31588o.setText("等待中");
                                                        break;
                                                    case 11:
                                                        lVar.f31582i.setBackgroundResource(R.drawable.recom_green_butn);
                                                        lVar.f31582i.setText("安装");
                                                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_green_color));
                                                        GameDetailActivity.this.V0(lVar, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 12:
                                                        GameDetailActivity.this.V0(lVar, Boolean.FALSE, Boolean.TRUE);
                                                        TextView textView2 = lVar.f31585l;
                                                        textView2.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        lVar.f31588o.setText("解压中..");
                                                        lVar.f31576c.setProgress((int) downloadTask.getProgress());
                                                        lVar.f31582i.setBackgroundResource(R.drawable.extract);
                                                        lVar.f31582i.setText("解压中");
                                                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_grey_color));
                                                        break;
                                                    case 13:
                                                        GameDetailActivity.this.V0(lVar, Boolean.FALSE, Boolean.TRUE);
                                                        TextView textView3 = lVar.f31585l;
                                                        textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        lVar.f31588o.setText("点击重新解压");
                                                        lVar.f31576c.setProgress((int) downloadTask.getProgress());
                                                        lVar.f31582i.setBackgroundResource(R.drawable.reextract);
                                                        lVar.f31582i.setText("解压");
                                                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_blue_color));
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            lVar.f31582i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            lVar.f31582i.setText(GameDetailActivity.this.G.getResources().getString(R.string.download_status_finished));
                            lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_main_color));
                            GameDetailActivity.this.V0(lVar, Boolean.TRUE, Boolean.FALSE);
                        }
                        lVar.f31582i.setBackgroundResource(R.drawable.recom_blue_butn);
                        lVar.f31582i.setText("继续");
                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_blue_color));
                        GameDetailActivity gameDetailActivity2 = GameDetailActivity.this;
                        Boolean bool2 = Boolean.FALSE;
                        gameDetailActivity2.V0(lVar, bool2, bool2);
                        try {
                            TextView textView4 = lVar.f31585l;
                            textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            lVar.f31577d.setProgress((int) downloadTask.getProgress());
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        lVar.f31588o.setText("暂停中");
                    } else {
                        UtilsMy.x4(downloadTask);
                        lVar.f31582i.setBackgroundResource(R.drawable.recom_blue_butn);
                        lVar.f31582i.setText("暂停");
                        lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_blue_color));
                        GameDetailActivity gameDetailActivity3 = GameDetailActivity.this;
                        Boolean bool3 = Boolean.FALSE;
                        gameDetailActivity3.V0(lVar, bool3, bool3);
                        TextView textView5 = lVar.f31585l;
                        textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        TextView textView6 = lVar.f31588o;
                        textView6.setText(downloadTask.getSpeed() + "/S");
                        lVar.f31577d.setProgress((int) downloadTask.getProgress());
                    }
                }
                lVar.f31582i.setBackgroundResource(R.drawable.recom_blue_butn);
                lVar.f31582i.setTextColor(GameDetailActivity.this.G.getResources().getColor(R.color.app_blue_color));
                UtilsMy.w0(gameListItemBean2.getPay_tag_info(), gameListItemBean2.getCrc_sign_id());
                UtilsMy.Z2(lVar.f31582i, lVar.f31580g, gameListItemBean2);
                GameDetailActivity.this.V0(lVar, Boolean.TRUE, Boolean.FALSE);
            }
            lVar.f31580g.setOnClickListener(new i(gameListItemBean2, 1));
            return view2;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return GameDetailActivity.this.R.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return GameDetailActivity.this.R.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return ((GameListItemBean) GameDetailActivity.this.R.get(i4)).getItemType();
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (getItemViewType(i4) == 2) {
                return a(i4, view, viewGroup);
            }
            return b(i4, view, viewGroup);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f31574a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f31575b;

        /* renamed from: c  reason: collision with root package name */
        public ProgressBar f31576c;

        /* renamed from: d  reason: collision with root package name */
        public ProgressBar f31577d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f31578e;

        /* renamed from: f  reason: collision with root package name */
        private LinearLayout f31579f;

        /* renamed from: g  reason: collision with root package name */
        private RelativeLayout f31580g;

        /* renamed from: h  reason: collision with root package name */
        private RelativeLayout f31581h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f31582i;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f31583j;

        /* renamed from: k  reason: collision with root package name */
        private LinearLayout f31584k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f31585l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f31586m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f31587n;

        /* renamed from: o  reason: collision with root package name */
        public TextView f31588o;

        /* renamed from: p  reason: collision with root package name */
        TextView f31589p;

        l() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f31591a;

        /* renamed from: b  reason: collision with root package name */
        TextView f31592b;

        /* renamed from: c  reason: collision with root package name */
        TextView f31593c;

        /* renamed from: d  reason: collision with root package name */
        TextView f31594d;

        /* renamed from: e  reason: collision with root package name */
        TextView f31595e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f31596f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f31597g;

        /* renamed from: h  reason: collision with root package name */
        MStarBar f31598h;

        /* renamed from: i  reason: collision with root package name */
        HListView f31599i;

        /* renamed from: j  reason: collision with root package name */
        HListView f31600j;

        /* renamed from: k  reason: collision with root package name */
        LinearLayout f31601k;

        /* renamed from: l  reason: collision with root package name */
        ImageView f31602l;

        /* renamed from: m  reason: collision with root package name */
        SimpleDraweeView f31603m;

        /* renamed from: n  reason: collision with root package name */
        TextView f31604n;

        /* renamed from: o  reason: collision with root package name */
        LinearLayout f31605o;

        /* renamed from: p  reason: collision with root package name */
        View f31606p;

        public m(@NonNull View view) {
            super(view);
            this.f31591a = (SimpleDraweeView) view.findViewById(R.id.appIcon);
            this.f31592b = (TextView) view.findViewById(R.id.appName);
            this.f31593c = (TextView) view.findViewById(R.id.comment_head_point_tx);
            this.f31594d = (TextView) view.findViewById(R.id.describ);
            this.f31596f = (LinearLayout) view.findViewById(R.id.tips);
            this.f31597g = (LinearLayout) view.findViewById(R.id.scoreLayout);
            this.f31598h = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f31599i = (HListView) view.findViewById(R.id.screenListView);
            this.f31600j = (HListView) view.findViewById(R.id.comment);
            this.f31601k = (LinearLayout) view.findViewById(R.id.downloadButn);
            this.f31595e = (TextView) view.findViewById(R.id.downButnText);
            this.f31602l = (ImageView) view.findViewById(R.id.downIcon);
            this.f31603m = (SimpleDraweeView) view.findViewById(R.id.moveImg);
            this.f31604n = (TextView) view.findViewById(R.id.bottom);
            this.f31605o = (LinearLayout) view.findViewById(R.id.describLayout);
            this.f31606p = view.findViewById(R.id.appRecomLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n extends RecyclerView.Adapter<m> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31609b;

            a(GameListItemBean gameListItemBean) {
                this.f31609b = gameListItemBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Ext ext = new Ext();
                ext.setPosition("brief");
                ext.setGameId(this.f31609b.getCrc_sign_id());
                ext.setArticleId(GameDetailActivity.this.I);
                com.papa.sim.statistic.p.l(GameDetailActivity.this.G).O1(Event.clickFromUserGameList, ext);
                IntentUtil.getInstance().goGameDetialActivity(GameDetailActivity.this.G, this.f31609b.getCrc_sign_id(), this.f31609b.getGame_info_tpl_type(), this.f31609b.getSp_tpl_two_position(), GameDetailActivity.this.K);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31611b;

            b(GameListItemBean gameListItemBean) {
                this.f31611b = gameListItemBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Ext ext = new Ext();
                ext.setPosition("introduction");
                ext.setGameId(this.f31611b.getCrc_sign_id());
                ext.setArticleId(GameDetailActivity.this.I);
                com.papa.sim.statistic.p.l(GameDetailActivity.this.G).O1(Event.clickFromUserGameList, ext);
                IntentUtil.getInstance().goGameDetialActivity(GameDetailActivity.this.G, this.f31611b.getCrc_sign_id(), this.f31611b.getGame_info_tpl_type(), this.f31611b.getSp_tpl_two_position(), GameDetailActivity.this.K);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m f31613b;

            c(m mVar) {
                this.f31613b = mVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                int height = this.f31613b.f31594d.getHeight() / GameDetailActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp36);
                if (height == 0) {
                    height = GameDetailActivity.this.U1;
                }
                com.join.mgps.Util.v0.c(height + "  可以显示行数行");
                if (height >= 1) {
                    if (GameDetailActivity.this.U1 == 0) {
                        GameDetailActivity.this.U1 = height;
                    }
                    this.f31613b.f31594d.setMaxLines(height);
                    this.f31613b.f31594d.invalidate();
                } else if (height == 0) {
                    this.f31613b.f31594d.setMaxLines(2);
                    this.f31613b.f31594d.invalidate();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class d implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31615b;

            d(GameListItemBean gameListItemBean) {
                this.f31615b = gameListItemBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil.getInstance().goGameDetialActivity(GameDetailActivity.this.G, this.f31615b.getCrc_sign_id(), this.f31615b.getGame_info_tpl_type(), this.f31615b.getSp_tpl_two_position(), GameDetailActivity.this.K);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class e implements AdapterView.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f31617a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameListItemBean f31618b;

            e(List list, GameListItemBean gameListItemBean) {
                this.f31617a = list;
                this.f31618b = gameListItemBean;
            }

            @Override // it.sephiroth.android.library.widget.AdapterView.d
            public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
                try {
                    Intent intent = new Intent(GameDetailActivity.this.G, ImagePagerActivity.class);
                    String[] strArr = new String[this.f31617a.size()];
                    for (int i5 = 0; i5 < this.f31617a.size(); i5++) {
                        strArr[i5] = (String) this.f31617a.get(i5);
                    }
                    if (com.join.mgps.Util.g2.i(this.f31618b.getVedio_url()) && i4 == 0) {
                        FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                        videoInfo.m(this.f31618b.getVedio_url());
                        videoInfo.h(strArr[0]);
                        FullScreenActivity_.i0(GameDetailActivity.this.G).a(videoInfo).start();
                        return;
                    }
                    intent.putExtra("image_urls", strArr);
                    intent.putExtra("image_index", i4);
                    GameDetailActivity.this.G.startActivity(intent);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(@NonNull m mVar, int i4) {
            int parseColor;
            int i5;
            int i6 = i4 * 2;
            GameListItemBean gameListItemBean = (GameListItemBean) GameDetailActivity.this.R.get(i6);
            gameListItemBean.getGame_score();
            if (GameDetailActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp1280) >= GameDetailActivity.this.getResources().getDisplayMetrics().heightPixels - GameDetailActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp50)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mVar.f31605o.getLayoutParams();
                layoutParams.weight = 1.0f;
                mVar.f31605o.setLayoutParams(layoutParams);
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) mVar.f31600j.getLayoutParams();
                layoutParams2.weight = 1.0f;
                mVar.f31600j.setLayoutParams(layoutParams2);
            }
            switch (gameListItemBean.getBg_color_tag_type()) {
                case 1:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_1);
                    parseColor = Color.parseColor("#767676");
                    i5 = parseColor;
                    break;
                case 2:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_8);
                    parseColor = Color.parseColor("#776353");
                    i5 = parseColor;
                    break;
                case 3:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_7);
                    parseColor = Color.parseColor("#AB3B3A");
                    i5 = parseColor;
                    break;
                case 4:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_2);
                    parseColor = Color.parseColor("#5E4643");
                    i5 = parseColor;
                    break;
                case 5:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_4);
                    parseColor = Color.parseColor("#A4961B");
                    i5 = parseColor;
                    break;
                case 6:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_3);
                    parseColor = Color.parseColor("#84975C");
                    i5 = parseColor;
                    break;
                case 7:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_5);
                    parseColor = Color.parseColor("#3A8282");
                    i5 = parseColor;
                    break;
                case 8:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_9);
                    parseColor = Color.parseColor("#41578D");
                    i5 = parseColor;
                    break;
                case 9:
                    mVar.f31601k.setBackgroundResource(R.drawable.gamelist_detialbutn_back_6);
                    parseColor = Color.parseColor("#68465B");
                    i5 = parseColor;
                    break;
                default:
                    i5 = 0;
                    break;
            }
            SimpleDraweeView simpleDraweeView = mVar.f31591a;
            String ico_remote = gameListItemBean.getIco_remote();
            GameDetailActivity gameDetailActivity = GameDetailActivity.this;
            MyImageLoader.f(simpleDraweeView, R.drawable.main_normal_icon, ico_remote, MyImageLoader.E(gameDetailActivity.G, gameDetailActivity.getResources().getDimensionPixelOffset(R.dimen.wdp24)));
            mVar.f31592b.setText(gameListItemBean.getGame_name());
            if (gameListItemBean.getComment_score_switch() == 1) {
                if ("0.0".equals(gameListItemBean.getScore())) {
                    mVar.f31593c.setText("暂未出分");
                    mVar.f31593c.setTextSize(12.0f);
                    mVar.f31593c.setTextColor(Color.parseColor("#8a8a8a"));
                } else {
                    mVar.f31593c.setText(gameListItemBean.getScore());
                }
                mVar.f31598h.setIntegerMark(false);
                mVar.f31598h.setEnabled(false);
                mVar.f31598h.setStarCount(5);
                mVar.f31598h.setStarMark((Double.parseDouble(gameListItemBean.getScore()) * 5.0d) / 10.0d);
                mVar.f31597g.setVisibility(0);
            } else {
                mVar.f31597g.setVisibility(8);
            }
            UtilsMy.q3(mVar.f31595e, mVar.f31601k, gameListItemBean);
            mVar.f31601k.setOnClickListener(new i(gameListItemBean, 2));
            TextView textView = mVar.f31594d;
            textView.setText("简介：" + gameListItemBean.getGame_describe_second());
            if (com.join.mgps.Util.g2.h(gameListItemBean.getGame_describe_second())) {
                mVar.f31605o.setVisibility(4);
            } else {
                mVar.f31605o.setVisibility(0);
            }
            mVar.f31606p.setOnClickListener(new a(gameListItemBean));
            mVar.f31594d.setOnClickListener(new b(gameListItemBean));
            mVar.f31594d.post(new c(mVar));
            mVar.f31605o.setOnClickListener(new d(gameListItemBean));
            mVar.f31603m.setController((com.facebook.drawee.backends.pipeline.d) Fresco.newDraweeControllerBuilder().a(Uri.parse("res:///2131232024")).c(mVar.f31603m.getController()).E(true).build());
            if (GameDetailActivity.this.R.size() <= i6 + 2 && GameDetailActivity.this.G1) {
                mVar.f31604n.setVisibility(0);
                mVar.f31603m.setVisibility(8);
            } else {
                mVar.f31604n.setVisibility(8);
                mVar.f31603m.setVisibility(0);
            }
            UtilsMy.N(gameListItemBean.getScore(), gameListItemBean.getDown_count(), gameListItemBean.getAppSize(), gameListItemBean.getSp_tag_info(), mVar.f31596f, GameDetailActivity.this.G);
            List<DetialShowImageBean> pic_info = gameListItemBean.getPic_info();
            if (pic_info.size() == 0) {
                mVar.f31599i.setVisibility(8);
            } else {
                mVar.f31599i.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < pic_info.size(); i7++) {
                arrayList.add(pic_info.get(i7).getRemote().getPath());
            }
            com.join.mgps.adapter.o0 o0Var = new com.join.mgps.adapter.o0(GameDetailActivity.this.G, gameListItemBean.getPic_position(), arrayList, false);
            o0Var.b();
            mVar.f31599i.setAdapter((ListAdapter) o0Var);
            mVar.f31599i.setOnItemClickListener(new e(arrayList, gameListItemBean));
            List<CommentBaseBean> comment_list = gameListItemBean.getComment_list();
            String customer_info = gameListItemBean.getCustomer_info();
            try {
                if (com.join.mgps.Util.g2.i(customer_info) && comment_list != null && comment_list.size() > 0 && com.join.mgps.Util.g2.i(comment_list.get(0).getId())) {
                    CommentBaseBean commentBaseBean = new CommentBaseBean();
                    commentBaseBean.setHead_portrait(GameDetailActivity.this.S.getPortrait());
                    commentBaseBean.setUser_name(GameDetailActivity.this.S.getNick_name());
                    commentBaseBean.setContent(customer_info);
                    commentBaseBean.setId("");
                    commentBaseBean.setStars_score("0");
                    comment_list.add(0, commentBaseBean);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (comment_list != null && comment_list.size() != 0) {
                mVar.f31600j.setAdapter((ListAdapter) new j(comment_list, i5, gameListItemBean));
                mVar.f31600j.setVisibility(0);
            } else {
                mVar.f31600j.setVisibility(8);
            }
            DownloadTask downloadTask = gameListItemBean.getDownloadTask();
            String plugin_num = gameListItemBean.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                mVar.f31595e.setText("开始");
            } else if (downloadTask == null) {
                mVar.f31602l.setImageResource(R.drawable.gamelist_ic_domn);
                mVar.f31602l.setVisibility(0);
                if (UtilsMy.o0(gameListItemBean.getTag_info())) {
                    if (UtilsMy.w0(gameListItemBean.getPay_tag_info(), gameListItemBean.getCrc_sign_id()) <= 0 ? com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G).d(GameDetailActivity.this.G, gameListItemBean.getPackage_name()) : false) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(GameDetailActivity.this.G).l(GameDetailActivity.this.G, gameListItemBean.getPackage_name());
                        if (com.join.mgps.Util.g2.i(gameListItemBean.getVer()) && l4.d() < Integer.parseInt(gameListItemBean.getVer())) {
                            mVar.f31595e.setText("更新");
                            return;
                        } else {
                            mVar.f31595e.setText(GameDetailActivity.this.G.getResources().getString(R.string.download_status_finished));
                            return;
                        }
                    }
                    UtilsMy.w0(gameListItemBean.getPay_tag_info(), gameListItemBean.getCrc_sign_id());
                    UtilsMy.q3(mVar.f31595e, mVar.f31601k, gameListItemBean);
                    return;
                }
                UtilsMy.w0(gameListItemBean.getPay_tag_info(), gameListItemBean.getCrc_sign_id());
                UtilsMy.q3(mVar.f31595e, mVar.f31601k, gameListItemBean);
            } else {
                int status = downloadTask.getStatus();
                if (UtilsMy.w0(gameListItemBean.getPay_tag_info(), gameListItemBean.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                mVar.f31602l.setImageResource(R.drawable.gamelist_ic_domn);
                mVar.f31602l.setVisibility(0);
                if (status != 0) {
                    if (status == 27) {
                        mVar.f31602l.setImageResource(R.drawable.detail_comment_download_continue);
                        TextView textView2 = mVar.f31595e;
                        textView2.setText(downloadTask.getProgress() + "%");
                        return;
                    } else if (status == 48) {
                        mVar.f31595e.setText("安装中");
                        mVar.f31602l.setVisibility(8);
                        return;
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        mVar.f31595e.setText("更新");
                                                        return;
                                                    case 10:
                                                        mVar.f31595e.setText("等待");
                                                        return;
                                                    case 11:
                                                        mVar.f31595e.setText("安装");
                                                        mVar.f31602l.setVisibility(8);
                                                        return;
                                                    case 12:
                                                        mVar.f31595e.setText("解压中");
                                                        mVar.f31602l.setVisibility(8);
                                                        return;
                                                    case 13:
                                                        mVar.f31595e.setText("解压");
                                                        mVar.f31602l.setVisibility(8);
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            mVar.f31595e.setText(GameDetailActivity.this.G.getResources().getString(R.string.download_status_finished));
                            mVar.f31602l.setVisibility(8);
                            return;
                        }
                        mVar.f31602l.setImageResource(R.drawable.detail_comment_download_continue);
                        TextView textView3 = mVar.f31595e;
                        textView3.setText(downloadTask.getProgress() + "%");
                        return;
                    } else {
                        UtilsMy.x4(downloadTask);
                        mVar.f31602l.setImageResource(R.drawable.detail_comment_download_pause);
                        TextView textView4 = mVar.f31595e;
                        textView4.setText(downloadTask.getProgress() + "%");
                        return;
                    }
                }
                UtilsMy.w0(gameListItemBean.getPay_tag_info(), gameListItemBean.getCrc_sign_id());
                UtilsMy.q3(mVar.f31595e, mVar.f31601k, gameListItemBean);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: d */
        public m onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new m(LayoutInflater.from(GameDetailActivity.this.G).inflate(R.layout.gamelist_detial_item_layout, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return GameDetailActivity.this.R.size() / 2;
        }
    }

    private void H0(View view) {
        this.K1.showAtLocation(view, 81, 0, 0);
    }

    public static String M0(String str) {
        try {
            return new String(str.getBytes("UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(int i4) {
        if (this.R.size() > 0) {
            GameListItemBean gameListItemBean = this.R.get(i4 * 2);
            switch (gameListItemBean.getBg_color_tag_type()) {
                case 1:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_1);
                    break;
                case 2:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_8);
                    break;
                case 3:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_7);
                    break;
                case 4:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_2);
                    break;
                case 5:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_4);
                    break;
                case 6:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_3);
                    break;
                case 7:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_5);
                    break;
                case 8:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_9);
                    break;
                case 9:
                    this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_6);
                    break;
            }
            if (gameListItemBean.getPic_info() == null || gameListItemBean.getPic_info().size() <= 0) {
                return;
            }
            this.f31521r.getHierarchy().x(r.c.f11301h);
            this.f31521r.getHierarchy().w(new PointF(0.5f, 0.0f));
            this.f31521r.setImageURI(Uri.parse(gameListItemBean.getPic_info().get(0).getRemote().getPath()));
        }
    }

    private void T0(List<GameListItemBean> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.Z) == null || list2.size() == 0) {
            return;
        }
        for (GameListItemBean gameListItemBean : list) {
            Iterator<DownloadTask> it2 = this.Z.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (gameListItemBean.getMod_info() != null) {
                        ModInfoBean mod_info = gameListItemBean.getMod_info();
                        DownloadTask downloadTask = this.R1.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.R1.get(mod_info.getMod_game_id());
                        z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
                        if (!z4 || !z5) {
                            if (z4) {
                                if (gameListItemBean.getMod_info() != null && next.getCrc_link_type_val().equals(gameListItemBean.getMod_info().getMod_game_id())) {
                                    gameListItemBean.setDownloadTask(next);
                                    break;
                                }
                            } else if (z5) {
                                if (next.getCrc_link_type_val().equals(gameListItemBean.getCrc_sign_id())) {
                                    gameListItemBean.setDownloadTask(next);
                                    break;
                                }
                            } else {
                                DownloadTask F = gameListItemBean.getMod_info() != null ? p1.f.K().F(gameListItemBean.getMod_info().getMod_game_id()) : null;
                                if (F == null) {
                                    F = p1.f.K().F(gameListItemBean.getCrc_sign_id());
                                }
                                if (F != null && next.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                    gameListItemBean.setDownloadTask(next);
                                    break;
                                }
                            }
                        } else if (next.getCrc_link_type_val().equals(gameListItemBean.getCrc_sign_id())) {
                            gameListItemBean.setDownloadTask(next);
                            break;
                        }
                    } else if (next.getCrc_link_type_val().equals(gameListItemBean.getCrc_sign_id())) {
                        gameListItemBean.setDownloadTask(next);
                        break;
                    }
                }
            }
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.Z.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.R1.remove(next.getCrc_link_type_val());
                it2.remove();
                for (GameListItemBean gameListItemBean : this.R) {
                    if (gameListItemBean.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.R1.get(gameListItemBean.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.R1.get(gameListItemBean.getGame_id());
                        if (downloadTask2 == null && downloadTask3 == null) {
                            gameListItemBean.setDownloadTask(null);
                        } else if (downloadTask2 != null) {
                            gameListItemBean.setDownloadTask(downloadTask2);
                        } else if (downloadTask3 != null) {
                            gameListItemBean.setDownloadTask(downloadTask3);
                        } else if (gameListItemBean.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            gameListItemBean.setDownloadTask(null);
                        }
                    } else if (gameListItemBean.getItemType() != 2 && gameListItemBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        gameListItemBean.setDownloadTask(null);
                    }
                }
            }
        }
        this.H.notifyDataSetChanged();
        n nVar = this.B1;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.R1;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.H.notifyDataSetChanged();
            n nVar = this.B1;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.A4(this.Z);
        if (!this.R1.containsKey(downloadTask.getCrc_link_type_val())) {
            this.Z.add(downloadTask);
            this.R1.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        this.H.notifyDataSetChanged();
        n nVar = this.B1;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.R1;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.Z.add(downloadTask);
            this.R1.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.R1.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.H.notifyDataSetChanged();
        n nVar = this.B1;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (GameListItemBean gameListItemBean : this.R) {
                if (gameListItemBean.getMod_info() != null) {
                    ModInfoBean mod_info = gameListItemBean.getMod_info();
                    DownloadTask downloadTask2 = this.R1.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.R1.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(gameListItemBean.getCrc_sign_id())) {
                            gameListItemBean.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z4) {
                        if (gameListItemBean.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(gameListItemBean.getMod_info().getMod_game_id())) {
                            gameListItemBean.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(gameListItemBean.getCrc_sign_id())) {
                            gameListItemBean.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F = gameListItemBean.getMod_info() != null ? p1.f.K().F(gameListItemBean.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(gameListItemBean.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            gameListItemBean.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (downloadTask.getCrc_link_type_val().equals(gameListItemBean.getCrc_sign_id())) {
                    gameListItemBean.setDownloadTask(downloadTask);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void updateProgressPartly() {
        int findFirstVisibleItemPosition;
        DownloadTask downloadTask;
        DownloadTask downloadTask2;
        try {
            if (this.T1 >= 0 && this.S1 < this.f31506e.getCount()) {
                for (int i4 = this.T1; i4 <= this.S1; i4++) {
                    GameListItemBean gameListItemBean = (GameListItemBean) this.f31506e.getItemAtPosition(i4);
                    if (gameListItemBean != null && (downloadTask2 = gameListItemBean.getDownloadTask()) != null && (downloadTask2.getStatus() == 2 || downloadTask2.getStatus() == 12)) {
                        View childAt = this.f31506e.getChildAt(i4 - this.T1);
                        if (childAt.getTag() instanceof l) {
                            l lVar = (l) childAt.getTag();
                            try {
                                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                                if (f5 == null) {
                                    return;
                                }
                                long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                                if (downloadTask2.getSize() == 0) {
                                    TextView textView = lVar.f31585l;
                                    textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                } else {
                                    TextView textView2 = lVar.f31585l;
                                    textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                }
                                if (downloadTask2.getStatus() == 12) {
                                    lVar.f31576c.setProgress((int) f5.getProgress());
                                } else {
                                    lVar.f31577d.setProgress((int) f5.getProgress());
                                }
                                if (downloadTask2.getStatus() == 2) {
                                    TextView textView3 = lVar.f31588o;
                                    textView3.setText(f5.getSpeed() + "/S");
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            if (this.f31504c == null || (findFirstVisibleItemPosition = this.A1.findFirstVisibleItemPosition()) < 0 || (downloadTask = this.R.get(findFirstVisibleItemPosition * 2).getDownloadTask()) == null) {
                return;
            }
            if (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) {
                View childAt2 = this.f31504c.getChildAt(0);
                if (this.f31504c.getChildViewHolder(childAt2) != null) {
                    m mVar = (m) this.f31504c.getChildViewHolder(childAt2);
                    DownloadTask f6 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                    TextView textView4 = mVar.f31595e;
                    textView4.setText(f6.getProgress() + "%");
                    mVar.f31602l.setImageResource(R.drawable.detail_comment_download_pause);
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    private void x0() {
        try {
            try {
                if (!this.C1) {
                    this.C1 = true;
                    int lastVisiblePosition = this.f31506e.getLastVisiblePosition();
                    for (int i4 = 0; i4 <= lastVisiblePosition; i4++) {
                        GameListItemBean gameListItemBean = this.R.get(i4);
                        if (!gameListItemBean.isHasExposure()) {
                            gameListItemBean.setHasExposure(true);
                            if (UtilsMy.f2(gameListItemBean)) {
                                try {
                                    Ext ext = new Ext();
                                    ext.setResultCode("discount_game");
                                    ext.setScenesCode(getClass().getSimpleName());
                                    Data data = new Data();
                                    data.setGameId(Long.parseLong(gameListItemBean.getGame_id()));
                                    com.papa.sim.statistic.p.l(this.G).Y(Event.expGameAdPage, ext, data);
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } finally {
                this.C1 = false;
            }
        } catch (Exception unused) {
        }
    }

    private int y0() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        LinearLayout linearLayout = this.f31507f;
        if (linearLayout == null || this.f31508g == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f31508g.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    @RequiresApi(api = 26)
    public void B0() {
        if (this.f31519p1) {
            try {
                ShareToBaseBean shareToBaseBean = new ShareToBaseBean();
                shareToBaseBean.setUid(this.O.getUid());
                shareToBaseBean.setToken("");
                shareToBaseBean.setDevice_id(this.T);
                int i4 = this.Q;
                shareToBaseBean.setPage(i4 > 1 ? i4 - 1 : 1);
                shareToBaseBean.setVersion(this.U);
                shareToBaseBean.setGroup_id(Integer.valueOf(this.I).intValue());
                shareToBaseBean.setGroup_uid(this.J);
                String str = "http://anv3cjapi.5fun.com/static/game_favorites/index.html?share_id=" + Base64.encodeToString(JsonMapper.getInstance().toJson(shareToBaseBean).toString().getBytes(), 2);
                ShareBean shareBean = new ShareBean();
                shareBean.setQqUrl(str);
                shareBean.setqZoneShareUrl(str);
                shareBean.setWeiboShareUrl(str);
                shareBean.setWechatFriendUrl(str);
                shareBean.setWechatShareUrl(str);
                shareBean.setText("这是我珍藏的好游戏，一起来玩啊~");
                ForumResponseGame.Datadetails datadetails = this.S;
                if (datadetails != null) {
                    shareBean.setTitle(datadetails.getTitle());
                }
                if (this.R.size() != 0) {
                    shareBean.setImageUrl(this.R.get(0).getIco_remote());
                } else {
                    shareBean.setImageUrl("http://ctimg.mg3721.com/upload/images/wf_ico.png?ver=2.2");
                }
                com.join.mgps.Util.s.r(this.G, shareBean);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        J0("请先点击完成");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D0() {
        try {
            try {
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (this.S == null) {
                return;
            }
            this.E1 = true;
            if (com.join.android.app.common.utils.j.j(this.G)) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                if (com.join.mgps.Util.g2.h(this.M)) {
                    this.M = "";
                }
                if (com.join.mgps.Util.g2.h(this.N)) {
                    this.N = "";
                }
                linkedMultiValueMap.add("uid", Integer.valueOf(this.O.getUid()));
                linkedMultiValueMap.add("token", this.O.getToken());
                linkedMultiValueMap.add("game_id", this.M);
                linkedMultiValueMap.add("company_id", this.N);
                linkedMultiValueMap.add("be_book_group_id", this.S.getId());
                linkedMultiValueMap.add("be_book_group_uid", Integer.valueOf(this.S.getUid()));
                linkedMultiValueMap.add("device_id", this.T);
                linkedMultiValueMap.add("version", this.U);
                if (this.S.getBook_state().equals("0")) {
                    GameFromBooleanBean P = this.P.P(linkedMultiValueMap);
                    if (P.getError() == 0 && P.getData().isState()) {
                        E0(1);
                    } else if (P.getError() == 701) {
                        this.I1 = false;
                        IntentUtil.getInstance().goMyAccountLoginActivity(this.G);
                        J0("Token已失效，请重新登录");
                        IntentUtil.getInstance().goLogin(this.G);
                    } else {
                        E0(3);
                    }
                } else if (this.S.getBook_state().equals("1")) {
                    GameFromBooleanBean E = this.P.E(linkedMultiValueMap);
                    if (E.getError() == 0 && E.getData().isState()) {
                        E0(2);
                    } else if (E.getError() == 701) {
                        this.I1 = false;
                        IntentUtil.getInstance().goMyAccountLoginActivity(this.G);
                        J0("Token已失效，请重新登录");
                        IntentUtil.getInstance().goLogin(this.G);
                    } else {
                        E0(4);
                    }
                }
            }
        } finally {
            this.E1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(int i4) {
        if (this.S == null) {
            return;
        }
        this.f31514m.setTextColor(-1);
        if (i4 == 1) {
            this.f31514m.setText("已订阅");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_gray);
            this.S.setBook_state("1");
            J0("订阅成功");
            TextView textView = this.E;
            if (textView != null) {
                textView.setText("已订阅");
                this.E.setBackgroundResource(R.drawable.game_detail_gray);
            }
            int intValue = Integer.valueOf(this.S.getBook_count()).intValue() + 1;
            ForumResponseGame.Datadetails datadetails = this.S;
            datadetails.setBook_count(intValue + "");
            TextView textView2 = this.F;
            if (textView2 != null) {
                textView2.setText(intValue + "人订阅，第一时间获取新动态");
            }
        } else if (i4 == 2) {
            this.f31514m.setTextColor(-16777216);
            this.f31514m.setText("+  订阅");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_o);
            this.S.setBook_state("0");
            J0("取消订阅成功");
            TextView textView3 = this.E;
            if (textView3 != null) {
                textView3.setText("+  订阅");
                this.E.setBackgroundResource(R.drawable.game_detail_o);
                this.E.setTextColor(-16777216);
            }
            int intValue2 = Integer.valueOf(this.S.getBook_count()).intValue() - 1;
            ForumResponseGame.Datadetails datadetails2 = this.S;
            datadetails2.setBook_count(intValue2 + "");
            TextView textView4 = this.F;
            if (textView4 != null) {
                textView4.setText(intValue2 + "人订阅，第一时间获取新动态");
            }
        } else if (i4 == 3) {
            J0("订阅失败");
        } else {
            J0("取消订阅失败");
        }
        this.H.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        this.f31523t.setVisibility(0);
        this.f31520q.setVisibility(8);
        if (this.f31504c.getVisibility() == 8 && this.f31505d.getVisibility() == 8) {
            this.f31505d.setVisibility(0);
        }
        MyImageLoader.h(this.f31511j, this.f31518p0.getData().getDetails().getPortrait());
        this.f31512k.setText(this.S.getNick_name());
        this.f31525v.setText(this.S.getTitle());
        Long.parseLong(this.S.getAdd_time());
        TextView textView = this.f31513l;
        textView.setText(this.S.getBook_count() + "订阅");
        this.f31514m.setTextColor(-1);
        if (this.S.getIs_self().equals("1")) {
            this.f31514m.setText("编辑");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_blue);
            this.S.setTv_btn(1);
        } else if (this.S.getBook_state().equals("1")) {
            this.f31514m.setText("已订阅");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_gray);
        } else {
            this.f31514m.setTextColor(-16777216);
            this.f31514m.setText("+  订阅");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        String trim;
        if (this.S == null) {
            return;
        }
        if (this.A != null) {
            trim = this.f31525v.getText().toString().trim();
        } else {
            trim = this.f31525v.getText().toString().trim();
        }
        if (!trim.equals(this.S.getTitle()) || !this.f31525v.getText().toString().trim().equals(this.S.getTitle()) || !this.X.equals("") || !this.Y.equals("")) {
            this.V.clear();
            this.W.clear();
            this.X = "";
            this.Y = "";
            J0("修改成功");
            this.Q = 1;
            this.G1 = false;
            l0();
            j0();
        }
        XListView2 xListView2 = this.f31506e;
        if (xListView2 != null) {
            xListView2.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0(l lVar, String str, String str2, GameListItemBean gameListItemBean, int i4, int i5) {
        this.N1 = false;
        if (this.O1 == null) {
            this.O1 = LayoutInflater.from(this.G).inflate(R.layout.appointment_pay_popwindow_page, (ViewGroup) null);
            this.K1 = new PopupWindow(this.O1, -1, -1, true);
            EditText editText = (EditText) this.O1.findViewById(R.id.edit);
            this.Q1 = editText;
            editText.setInputType(1);
            this.Q1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
            ((LinearLayout) this.O1.findViewById(R.id.ll_dismiss)).setOnClickListener(new e());
            this.K1.setOnDismissListener(new f());
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
            EditText editText2 = this.Q1;
            editText2.setHint(new SpannedString("  " + ((Object) spannableString)));
            ((Button) this.O1.findViewById(R.id.btn_confirm)).setOnClickListener(new g(i4, str, str2, lVar, gameListItemBean));
            this.Q1.setFocusable(true);
            this.K1.setFocusable(true);
            this.Q1.setFocusableInTouchMode(true);
            this.Q1.setFocusable(true);
            this.Q1.requestFocus();
            ((InputMethodManager) this.G.getSystemService("input_method")).toggleSoftInput(0, 2);
            View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new h(decorView));
            View inflate = LayoutInflater.from(this.G).inflate(R.layout.activity_game_detail, (ViewGroup) null);
            this.P1 = inflate;
            H0(inflate);
            return;
        }
        ((InputMethodManager) this.G.getSystemService("input_method")).toggleSoftInput(0, 2);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString2.length(), 33);
        EditText editText3 = this.Q1;
        editText3.setHint(new SpannedString("  " + ((Object) spannableString2)));
        this.K1.showAtLocation(this.P1, 81, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0(String str) {
        if (isDestroyed()) {
            return;
        }
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void K0() {
        if (this.S == null) {
            return;
        }
        if (this.f31519p1) {
            Ext ext = new Ext();
            ext.setPosition("brief");
            ext.setGameId("0");
            ext.setArticleId(this.I);
            com.papa.sim.statistic.p.l(this.G).O1(Event.clickFromUserGameList, ext);
            CommentSelfListActivity_.P0(this.G).a(this.S.getUid()).start();
            return;
        }
        J0("请先点击完成");
    }

    public String L0(Long l4) {
        return new SimpleDateFormat("MM/dd").format(new Date(new Long(l4.longValue()).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void N0() {
        if (!com.ta.utdid2.android.utils.f.f(this.G)) {
            J0("无网络连接");
        } else if (this.S == null) {
        } else {
            if (!IntentUtil.getInstance().goLogin(this.G)) {
                if (this.S.getIs_self().equals("1")) {
                    if (this.S.getTv_btn() == 1) {
                        this.f31514m.setText("完成");
                        this.f31514m.setBackgroundResource(R.drawable.game_detail_green);
                        this.S.setTv_btn(0);
                        this.f31506e.f();
                        this.f31506e.g();
                        TextView textView = this.B;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        this.f31517p.setVisibility(0);
                        this.f31519p1 = false;
                        this.f31527w.setText("修改");
                        List<GameListItemBean> list = this.R;
                        if (list == null || list.size() == 0) {
                            return;
                        }
                        this.f31504c.setVisibility(8);
                        this.f31505d.setVisibility(0);
                    } else if (this.S.getTv_btn() == 0) {
                        this.f31514m.setText("编辑");
                        this.f31514m.setBackgroundResource(R.drawable.game_detail_blue);
                        this.S.setTv_btn(1);
                        TextView textView2 = this.B;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        this.f31517p.setVisibility(8);
                        this.f31506e.q();
                        o0();
                        l0();
                        this.f31519p1 = true;
                        this.f31527w.setText("列表模式");
                        List<GameListItemBean> list2 = this.R;
                        if (list2 == null || list2.size() == 0) {
                            return;
                        }
                        this.f31504c.setVisibility(0);
                        this.f31505d.setVisibility(8);
                    }
                    k kVar = this.H;
                    if (kVar != null) {
                        kVar.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                this.f31514m.setTextColor(-1);
                if (!this.E1) {
                    if (this.S.getBook_state().equals("1")) {
                        this.f31514m.setText("+  订阅");
                        this.f31514m.setBackgroundResource(R.drawable.game_detail_gray);
                    } else {
                        this.f31514m.setText("已订阅");
                        this.f31514m.setTextColor(-16777216);
                        this.f31514m.setBackgroundResource(R.drawable.game_detail_o);
                    }
                    D0();
                    return;
                }
                J0("上步操作尚未完成");
                return;
            }
            this.I1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void O0() {
        if (this.S == null) {
            return;
        }
        if (this.f31519p1) {
            Ext ext = new Ext();
            ext.setPosition("brief");
            ext.setGameId("0");
            ext.setArticleId(this.I);
            com.papa.sim.statistic.p.l(this.G).O1(Event.clickFromUserGameList, ext);
            CommentSelfListActivity_.P0(this.G).a(this.S.getUid()).start();
            return;
        }
        J0("请先点击完成");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void P0() {
        if (this.S == null) {
            return;
        }
        if (this.f31519p1) {
            Ext ext = new Ext();
            ext.setPosition("brief");
            ext.setGameId("0");
            ext.setArticleId(this.I);
            com.papa.sim.statistic.p.l(this.G).O1(Event.clickFromUserGameList, ext);
            CommentSelfListActivity_.P0(this.G).a(this.S.getUid()).start();
            return;
        }
        J0("请先点击完成");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0(ForumResponseGame forumResponseGame) {
        XListView2 xListView2 = this.f31506e;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f31506e.v();
                this.G1 = true;
                this.f31506e.setNoMore();
                k0(forumResponseGame);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        this.B1.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0() {
        XListView2 xListView2 = this.f31506e;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f31506e.v();
                this.f31506e.setNoMore();
                this.G1 = true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        this.B1.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void U0() {
        XListView2 xListView2 = this.f31506e;
        if (xListView2 != null) {
            try {
                if (this.f31519p1) {
                    xListView2.u();
                }
                this.f31506e.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void V0(l lVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            lVar.f31583j.setVisibility(8);
            lVar.f31577d.setVisibility(8);
            lVar.f31576c.setVisibility(8);
            lVar.f31579f.setVisibility(0);
            lVar.f31587n.setVisibility(0);
            return;
        }
        lVar.f31587n.setVisibility(8);
        lVar.f31583j.setVisibility(0);
        if (bool2.booleanValue()) {
            lVar.f31577d.setVisibility(8);
            lVar.f31576c.setVisibility(0);
        } else {
            lVar.f31576c.setVisibility(8);
            lVar.f31577d.setVisibility(0);
        }
        lVar.f31579f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void g0() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
            this.f31522s.setPadding(0, y0(), 0, 0);
        }
        this.G = this;
        Intent intent = getIntent();
        this.I = intent.getStringExtra("fromid");
        this.K = intent.getIntExtra("_from", 0);
        this.J = intent.getIntExtra("groupuid", 111);
        this.M = intent.getStringExtra("gameid");
        this.N = intent.getStringExtra("company_id");
        this.P = com.join.mgps.rpc.impl.a.c0();
        this.O = AccountUtil_.getInstance_(this.G).getAccountData();
        com.join.mgps.Util.d0.a().d(this);
        this.f31528x.setTextColor(-1);
        this.f31529y.setTextColor(-1);
        k kVar = new k();
        this.H = kVar;
        this.f31506e.setAdapter((ListAdapter) kVar);
        this.f31506e.setOnScrollListener(this);
        List<DownloadTask> d5 = p1.f.K().d();
        this.Z = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.Z) {
                this.R1.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        this.f31506e.setPreLoadCount(6);
        j0();
        this.f31506e.setPullLoadEnable(new a());
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f31517p.setOnClickListener(new b());
        ViewPagerLayoutManager viewPagerLayoutManager = new ViewPagerLayoutManager(this.G, 1);
        this.A1 = viewPagerLayoutManager;
        viewPagerLayoutManager.d(new c());
        this.B1 = new n();
        this.f31504c.setLayoutManager(this.A1);
        this.f31504c.setAdapter(this.B1);
        this.f31504c.setLoadingMoreEnabled(true);
        this.f31504c.setPullRefreshEnabled(false);
        this.f31504c.setPreLoadCount(10);
        this.f31504c.setLoadingListener(new d());
        this.f31522s.setBackgroundResource(R.drawable.gamelist_detialback_1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(int i4) {
        if (this.R.size() > 0) {
            this.R.remove(i4);
            this.R.remove(i4);
            k kVar = this.H;
            if (kVar != null) {
                kVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(List<GameListItemBean> list) {
        if (this.Q == 2 && this.R.size() != 0) {
            this.R.clear();
            k kVar = this.H;
            if (kVar != null) {
                kVar.notifyDataSetChanged();
            }
        }
        for (GameListItemBean gameListItemBean : list) {
            int i4 = this.K;
            if (i4 == 0) {
                gameListItemBean.set_from(102);
                gameListItemBean.set_from_type(111);
                this.K = 111;
            } else {
                gameListItemBean.set_from(i4);
                gameListItemBean.set_from_type(this.K);
            }
            this.R.add(gameListItemBean);
            GameListItemBean gameListItemBean2 = new GameListItemBean();
            gameListItemBean2.setPic_info(gameListItemBean.getPic_info());
            gameListItemBean2.setPic_position(gameListItemBean.getPic_position());
            gameListItemBean2.setItemType(2);
            this.R.add(gameListItemBean2);
        }
        try {
            this.f31525v.setText(this.S.getTitle());
            MyImageLoader.i(this.f31521r, this.R.get(0).getPic_info().get(0).getRemote().getPath(), r.c.f11301h);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        k kVar2 = this.H;
        if (kVar2 != null) {
            kVar2.notifyDataSetChanged();
        }
        n nVar = this.B1;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
        this.f31504c.loadMoreComplete();
        T0(this.R);
        if (this.Q == 2) {
            S0(0);
        }
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        if (this.f31519p1) {
            finish();
        } else {
            J0("请先点击完成");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        try {
            try {
                com.join.mgps.Util.v0.d("gamelist  ", "loadmore 3333");
                this.f31526v1 = true;
                if (com.join.android.app.common.utils.j.j(this.G)) {
                    if (this.Q == 1) {
                        showLoding();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (com.join.android.app.common.utils.j.j(this.G)) {
                        this.T = "";
                        RequestBeanUtil.getInstance(this.G);
                        this.U = RequestBeanUtil.getVersionAndVersionName();
                        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                        linkedMultiValueMap.add("uid", Integer.valueOf(this.O.getUid()));
                        linkedMultiValueMap.add("token", this.O.getToken());
                        linkedMultiValueMap.add("group_id", this.I);
                        linkedMultiValueMap.add("group_uid", Integer.valueOf(this.J));
                        linkedMultiValueMap.add("page", Integer.valueOf(this.Q));
                        linkedMultiValueMap.add("device_id", this.T);
                        linkedMultiValueMap.add("version", this.U);
                        com.join.mgps.Util.v0.d("gamelist  ", "loadmore 44444  page=" + this.Q + linkedMultiValueMap.toString());
                        ForumResponseGame A = this.P.A(linkedMultiValueMap);
                        if (A.getData() != null && A.getData().getDetails() != null) {
                            this.S = A.getData().getDetails();
                        }
                        this.Q++;
                        if (A.getError() == 0 && A.getData() != null && A.getData() != null && A.getData().getGame_list().size() > 0) {
                            if (this.Q == 2) {
                                this.f31518p0 = A;
                                C0();
                            }
                            A0();
                            U0();
                            F0();
                            for (int i4 = 0; i4 < A.getData().getGame_list().size(); i4++) {
                                arrayList.add(A.getData().getGame_list().get(i4));
                            }
                            if (A.getData().getGame_list().size() == 0) {
                                com.join.mgps.Util.v0.d("gamelist  ", "nomore 5555  page=" + this.Q);
                                Q0(A);
                            }
                            i0(arrayList);
                        } else {
                            com.join.mgps.Util.v0.d("gamelist  ", "nomore 666666  json=" + JsonMapper.getInstance().toJson(A));
                            if (this.Q == 2) {
                                m0();
                            } else {
                                k0(A);
                            }
                        }
                    } else {
                        if (this.Q == 2) {
                            showLodingFailed();
                        }
                        R0();
                    }
                } else {
                    showLodingFailed();
                }
            } catch (Exception e5) {
                showLodingFailed();
                e5.printStackTrace();
            }
        } finally {
            this.f31526v1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(ForumResponseGame forumResponseGame) {
        try {
            this.G1 = true;
            if (forumResponseGame.getData().getDetails().getIs_self().equals("0")) {
                XListView2 xListView2 = this.f31506e;
                if (xListView2 != null) {
                    xListView2.g();
                }
                XListView2 xListView22 = this.f31506e;
                if (xListView22 != null) {
                    xListView22.setNoMore();
                }
            } else {
                this.f31514m.setText("编辑");
                this.f31514m.setBackgroundResource(R.drawable.game_detail_blue);
                this.S.setTv_btn(1);
                View view = this.H1;
                if (view != null) {
                    this.f31506e.removeFooterView(view);
                }
                XListView2 xListView23 = this.f31506e;
                if (xListView23 != null) {
                    xListView23.setNoMore();
                }
            }
            this.B1.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        try {
            XListView2 xListView2 = this.f31506e;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        ForumResponseGame.Datadetails datadetails = this.S;
        if (datadetails == null) {
            return;
        }
        TextView textView = this.f31512k;
        if (textView != null) {
            textView.setText(datadetails.getNick_name());
        }
        TextView textView2 = this.f31513l;
        if (textView2 != null) {
            textView2.setText(this.S.getBook_count() + "订阅");
        }
        TextView textView3 = this.f31525v;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.f31525v.setText(this.S.getTitle());
        }
        LinearLayout linearLayout = this.f31520q;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        SimpleDraweeView simpleDraweeView = this.f31511j;
        if (simpleDraweeView != null) {
            MyImageLoader.h(simpleDraweeView, this.S.getPortrait());
        }
        LinearLayout linearLayout2 = this.f31503b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f31505d;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f31504c;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        A0();
        this.f31514m.setTextColor(-1);
        if (this.S.getIs_self().equals("1")) {
            this.f31514m.setText("编辑");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_blue);
            this.S.setTv_btn(1);
        } else if (this.S.getBook_state().equals("1")) {
            this.f31514m.setText("已订阅");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_gray);
        } else {
            this.f31514m.setTextColor(-16777216);
            this.f31514m.setText("+  订阅");
            this.f31514m.setBackgroundResource(R.drawable.game_detail_o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0(String str) {
        J0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        String str = "";
        try {
            if (this.S != null && z0()) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(this.O.getUid()));
                linkedMultiValueMap.add("token", this.O.getToken());
                linkedMultiValueMap.add("group_id", this.S.getId());
                linkedMultiValueMap.add("group_title", this.F1.equals("") ? this.S.getTitle() : this.F1);
                this.X = this.X.equals("") ? "" : this.X;
                if (!this.Y.equals("")) {
                    str = this.Y;
                }
                this.Y = str;
                this.X = M0(this.X);
                this.Y = M0(this.Y);
                linkedMultiValueMap.add("del_game_list", this.X);
                linkedMultiValueMap.add("modify_game_list", this.Y);
                linkedMultiValueMap.add("device_id", this.T);
                linkedMultiValueMap.add("version", this.U);
                GameFromBooleanBean b02 = this.P.b0(linkedMultiValueMap);
                if (b02.getError() == 0 && b02.getData().isState()) {
                    G0();
                } else {
                    J0("修改失败");
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
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
                    Map<String, DownloadTask> map = this.R1;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    updateProgressPartly();
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!this.f31519p1 && i4 == 4 && keyEvent.getAction() == 0) {
            J0("请先点击完成");
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.I1) {
            return;
        }
        this.Q = 1;
        this.G1 = false;
        this.O = AccountUtil_.getInstance_(this.G).getAccountData();
        l0();
        j0();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.S1 = (i5 + i4) - 1;
        this.T1 = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0) {
            x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.Q = 1;
        this.G1 = false;
        l0();
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f31507f;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f31508g;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f31508g;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f31507f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f31505d;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f31504c;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        ForumResponseGame.Datadetails datadetails = this.S;
        if (datadetails == null) {
            return;
        }
        if (datadetails.getIs_self().equals("1") && this.S.getTv_btn() == 0) {
            I0(null, this.f31525v.getText().toString().trim(), "", null, 1, 0);
            return;
        }
        List<GameListItemBean> list = this.R;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f31505d.getVisibility() == 0) {
            this.f31505d.setVisibility(8);
            this.f31504c.setVisibility(0);
            this.f31527w.setText("列表模式");
            return;
        }
        this.f31505d.setVisibility(0);
        this.f31504c.setVisibility(8);
        this.f31527w.setText("大图模式");
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
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
                default:
                    return;
                case 5:
                    receiveSuccess(downloadTask);
                    return;
                case 6:
                    receiveError(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(int i4) {
        if (this.R.size() > 0) {
            this.R.remove(i4);
            k kVar = this.H;
            if (kVar != null) {
                kVar.notifyDataSetChanged();
            }
        }
    }

    boolean z0() {
        for (int i4 = 0; i4 < this.V.size(); i4++) {
            this.Y += this.V.get(i4) + ",";
        }
        for (int i5 = 0; i5 < this.W.size(); i5++) {
            this.X += this.W.get(i5) + ",";
        }
        return true;
    }
}
