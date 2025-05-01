package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Handler;
import android.text.Html;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.adapter.GameCommentAdapterV2;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.VipView;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameInformationBean;
import com.join.mgps.dto.GameInformationCommentPraiseArgs;
import com.join.mgps.dto.GameInformationCommentRequestV2;
import com.join.mgps.dto.InformationCommentBackV2;
import com.join.mgps.dto.InformationCommentBeanV2;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Where;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.game_information_layoutv2)
/* loaded from: classes.dex */
public class GameInformationActivityV2 extends BaseActivity {
    private DownloadTask A;
    @ViewById
    TextView B;
    @ViewById
    LinearLayout C;
    @ViewById
    LinearLayout D;
    @ViewById
    TextView E;
    @ViewById
    RecyclerView F;
    private Context G;
    private DetailResultBean H;
    private long I;
    private int K;
    private com.wufan.user.service.protobuf.n0 L;
    private GameinformationAdapter O;
    private List<GameCommentAdapterV2.l> P;
    private List<InformationCommentBeanV2> Q;
    Context R;
    Button T;
    WebView U;

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.rpc.e f32119b;
    @StringRes(resName = "net_excption")

    /* renamed from: c  reason: collision with root package name */
    String f32120c;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: d  reason: collision with root package name */
    String f32121d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f32122e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f32123f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RelativeLayout f32124g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f32125h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f32126i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    SimpleDraweeView f32127j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    SimpleDraweeView f32128k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f32129l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f32130m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f32131n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f32132o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    Button f32133p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ImageView f32134q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    ImageView f32135r;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: s  reason: collision with root package name */
    CustomerDownloadView f32136s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    String f32137t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    String f32138u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    ExtBean f32139v;
    @Extra

    /* renamed from: w  reason: collision with root package name */
    boolean f32140w;

    /* renamed from: y  reason: collision with root package name */
    private boolean f32142y;

    /* renamed from: z  reason: collision with root package name */
    private GameInformationBean f32143z;

    /* renamed from: x  reason: collision with root package name */
    private String f32141x = "";
    private Handler J = new Handler();
    Map<String, DownloadTask> M = new HashMap();
    Map<String, DownloadTask> N = new HashMap();
    private String S = "";
    com.join.mgps.customview.o V = null;
    List<m> W = new ArrayList();
    n X = null;

    /* loaded from: classes4.dex */
    public class CommentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private RelativeLayout f32144a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f32145b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f32146c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f32147d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f32148e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f32149f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f32150g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f32151h;

        /* renamed from: i  reason: collision with root package name */
        public View f32152i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f32153j;

        /* renamed from: k  reason: collision with root package name */
        public VipView f32154k;

        public CommentViewHolder(@NonNull View view) {
            super(view);
            this.f32144a = (RelativeLayout) view.findViewById(R.id.main);
            this.f32145b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            this.f32146c = (ImageView) view.findViewById(R.id.parise);
            this.f32147d = (TextView) view.findViewById(R.id.username);
            this.f32148e = (TextView) view.findViewById(R.id.time);
            this.f32149f = (TextView) view.findViewById(R.id.content);
            this.f32150g = (TextView) view.findViewById(R.id.pariseNumber);
            this.f32151h = (TextView) view.findViewById(R.id.levelTv);
            this.f32154k = (VipView) view.findViewById(R.id.levelVip);
            this.f32152i = view.findViewById(R.id.line);
            this.f32153j = (TextView) view.findViewById(R.id.more);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum GType {
        webview(1),
        card(2),
        comment(3),
        commentTitle(4),
        TITLE(5),
        COMMENT(6),
        webtitle(8),
        REPLY(7),
        sendcomment(9);
        

        /* renamed from: i  reason: collision with root package name */
        int f32156i;

        GType(int i4) {
            this.f32156i = i4;
        }

        public int vaule() {
            return this.f32156i;
        }
    }

    /* loaded from: classes4.dex */
    public class GameinformationAdapter extends RecyclerView.Adapter {

        /* loaded from: classes4.dex */
        class a {

            /* renamed from: com.join.mgps.activity.GameInformationActivityV2$GameinformationAdapter$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            class RunnableC0329a implements Runnable {
                RunnableC0329a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    GameInformationCommentActivity_.P0(GameInformationActivityV2.this.G).b(GameInformationActivityV2.this.f32137t).start();
                }
            }

            /* loaded from: classes4.dex */
            class b implements Runnable {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f32160b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f32161c;

                b(String str, String str2) {
                    this.f32160b = str;
                    this.f32161c = str2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                    videoInfo.m(this.f32160b);
                    videoInfo.h(this.f32161c);
                    FullScreenActivity_.i0(GameInformationActivityV2.this.G).a(videoInfo).start();
                }
            }

            /* loaded from: classes4.dex */
            class c implements Runnable {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f32163b;

                c(String str) {
                    this.f32163b = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IntentUtil.getInstance().intentActivity(GameInformationActivityV2.this, (IntentDateBean) JsonMapper.getInstance().fromJson(this.f32163b, IntentDateBean.class));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }

            a() {
            }

            @JavascriptInterface
            public void intentCommentList() {
                GameInformationActivityV2.this.J.post(new RunnableC0329a());
            }

            @JavascriptInterface
            public void playVideo(String str, String str2) {
                GameInformationActivityV2.this.J.post(new b(str, str2));
            }

            @JavascriptInterface
            public void startIntent(String str) {
                GameInformationActivityV2.this.J.post(new c(str));
            }
        }

        /* loaded from: classes4.dex */
        class b extends WebViewClient {
            b() {
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                int primaryError = sslError.getPrimaryError();
                if (primaryError == 3 || primaryError == 5) {
                    sslErrorHandler.proceed();
                }
                sslErrorHandler.cancel();
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return false;
            }
        }

        /* loaded from: classes4.dex */
        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GameInformationCommentActivity_.P0(GameInformationActivityV2.this.G).b(GameInformationActivityV2.this.f32137t).start();
            }
        }

        /* loaded from: classes4.dex */
        class d implements View.OnClickListener {
            d() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new IntentDateBean();
                IntentUtil intentUtil = IntentUtil.getInstance();
                GameInformationActivityV2 gameInformationActivityV2 = GameInformationActivityV2.this;
                intentUtil.goGameDetialActivity(gameInformationActivityV2, gameInformationActivityV2.H.getCrc_sign_id(), GameInformationActivityV2.this.H.getGame_info_tpl_type(), GameInformationActivityV2.this.H.getSp_tpl_two_position(), 116);
            }
        }

        /* loaded from: classes4.dex */
        class e implements View.OnClickListener {
            e() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil intentUtil = IntentUtil.getInstance();
                GameInformationActivityV2 gameInformationActivityV2 = GameInformationActivityV2.this;
                intentUtil.goGameDetialActivity(gameInformationActivityV2, gameInformationActivityV2.H.getCrc_sign_id(), GameInformationActivityV2.this.H.getGame_info_tpl_type(), GameInformationActivityV2.this.H.getSp_tpl_two_position(), 116);
            }
        }

        /* loaded from: classes4.dex */
        class f implements View.OnClickListener {
            f() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GameInformationActivityV2.this.s0();
            }
        }

        /* loaded from: classes4.dex */
        class g implements View.OnClickListener {
            g() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IntentUtil.getInstance().goLoginInteractive(GameInformationActivityV2.this.G)) {
                    return;
                }
                GameInformationCommentActivity_.P0(GameInformationActivityV2.this.G).b(GameInformationActivityV2.this.f32137t).start();
            }
        }

        public GameinformationAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return GameInformationActivityV2.this.W.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return GameInformationActivityV2.this.W.get(i4).f32227b.vaule();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType == GType.webview.vaule()) {
                GameInformationActivityV2 gameInformationActivityV2 = GameInformationActivityV2.this;
                WebView webView = gameInformationActivityV2.U;
                if (webView != null) {
                    webView.getHeight();
                    return;
                }
                WebView webView2 = ((o) viewHolder).f32229a;
                gameInformationActivityV2.U = webView2;
                webView2.getLayoutParams();
                GameInformationActivityV2.this.U.setBackgroundColor(-1);
                GameInformationActivityV2.this.U.getSettings().setJavaScriptEnabled(true);
                GameInformationActivityV2.this.U.setWebChromeClient(new WebChromeClient());
                GameInformationActivityV2.this.U.addJavascriptInterface(new a(), "papa");
                GameInformationActivityV2 gameInformationActivityV22 = GameInformationActivityV2.this;
                gameInformationActivityV22.U.loadDataWithBaseURL("about:blank", gameInformationActivityV22.f32143z.getContent(), "text/html", "utf-8", null);
                UtilsMy.C3(GameInformationActivityV2.this.U);
                GameInformationActivityV2.this.U.setWebViewClient(new b());
                GameInformationActivityV2.this.U.setBackgroundColor(-1);
            } else if (itemViewType == GType.TITLE.vaule()) {
                GameInformationActivityV2.this.z0(i4, (ViewHolder2) viewHolder);
            } else if (itemViewType == GType.commentTitle.vaule()) {
                l lVar = (l) viewHolder;
                TextView textView = lVar.f32223a;
                textView.setText(GameInformationActivityV2.this.K + "条");
                lVar.f32224b.setOnClickListener(new c());
            } else if (itemViewType == GType.card.vaule()) {
                k kVar = (k) viewHolder;
                GameInformationActivityV2 gameInformationActivityV23 = GameInformationActivityV2.this;
                gameInformationActivityV23.T = kVar.f32221j;
                gameInformationActivityV23.U0();
                kVar.f32214c.setText(GameInformationActivityV2.this.H.getGame_name());
                MyImageLoader.h(kVar.f32213b, GameInformationActivityV2.this.H.getIco_remote());
                UtilsMy.k3(GameInformationActivityV2.this.H.getSp_tag_info(), kVar.f32219h);
                kVar.f32213b.setOnClickListener(new d());
                kVar.f32220i.setOnClickListener(new e());
                GameInformationActivityV2.this.T.setOnClickListener(new f());
                TextView textView2 = kVar.f32217f;
                textView2.setText(com.join.mgps.Util.g2.b(GameInformationActivityV2.this.H.getDown_count()) + "热度");
                TextView textView3 = kVar.f32216e;
                textView3.setText(net.lingala.zip4j.util.e.F0 + GameInformationActivityV2.this.H.getSize() + "M");
                kVar.f32218g.setText(GameInformationActivityV2.this.H.getInfo());
            } else if (itemViewType == GType.COMMENT.vaule()) {
                GameInformationActivityV2.this.A0(i4, (CommentViewHolder) viewHolder);
            } else if (itemViewType == GType.REPLY.vaule()) {
                GameInformationActivityV2.this.C0(i4, (ReplyViewHolder) viewHolder);
            } else if (itemViewType == GType.webtitle.vaule()) {
                WebtitleViewHolder webtitleViewHolder = (WebtitleViewHolder) viewHolder;
                webtitleViewHolder.f32185c.setText(GameInformationActivityV2.this.f32143z.getTitle());
                TextView textView4 = webtitleViewHolder.f32184b;
                textView4.setText("作者:" + GameInformationActivityV2.this.f32143z.getAuthor());
                webtitleViewHolder.f32183a.setText(GameInformationActivityV2.this.f32143z.getRelease_time());
            } else if (itemViewType == GType.sendcomment.vaule()) {
                SendMessageViewHolder sendMessageViewHolder = (SendMessageViewHolder) viewHolder;
                GameInformationActivityV2.this.f32128k = sendMessageViewHolder.f32178a;
                sendMessageViewHolder.f32178a.setImageResource(R.drawable.unloginstatus);
                if (GameInformationActivityV2.this.L != null) {
                    UtilsMy.s3(GameInformationActivityV2.this.G, GameInformationActivityV2.this.L.d0(), sendMessageViewHolder.f32178a);
                }
                sendMessageViewHolder.f32179b.setOnClickListener(new g());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            if (i4 == GType.webview.vaule()) {
                WebView webView = new WebView(viewGroup.getContext());
                webView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return new o(webView);
            } else if (i4 == GType.TITLE.vaule()) {
                return new ViewHolder2(LayoutInflater.from(GameInformationActivityV2.this.R).inflate(R.layout.gameinformation_comment_item_title, viewGroup, false));
            } else if (i4 == GType.commentTitle.vaule()) {
                return new l(LayoutInflater.from(GameInformationActivityV2.this.G).inflate(R.layout.game_information_comment_top, viewGroup, false));
            } else if (i4 == GType.card.vaule()) {
                return new k(LayoutInflater.from(GameInformationActivityV2.this.G).inflate(R.layout.gameinformation_cardlayout, viewGroup, false));
            } else if (i4 == GType.COMMENT.vaule()) {
                return new CommentViewHolder(LayoutInflater.from(GameInformationActivityV2.this.R).inflate(R.layout.gameinformation_commit_item_layout, viewGroup, false));
            } else if (i4 == GType.REPLY.vaule()) {
                return new ReplyViewHolder(LayoutInflater.from(GameInformationActivityV2.this.R).inflate(R.layout.mg_game_comment_activity_item_comment_message_reply, viewGroup, false));
            } else if (i4 == GType.webtitle.vaule()) {
                return new WebtitleViewHolder(LayoutInflater.from(GameInformationActivityV2.this.R).inflate(R.layout.gameinformation_webtitle, viewGroup, false));
            } else if (i4 == GType.sendcomment.vaule()) {
                return new SendMessageViewHolder(LayoutInflater.from(GameInformationActivityV2.this.R).inflate(R.layout.game_information_edit_message, viewGroup, false));
            } else {
                return null;
            }
        }
    }

    /* loaded from: classes4.dex */
    public class ReplyViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f32171a;

        /* renamed from: b  reason: collision with root package name */
        public View f32172b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f32173c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f32174d;

        /* renamed from: e  reason: collision with root package name */
        public View f32175e;

        /* renamed from: f  reason: collision with root package name */
        public View f32176f;

        public ReplyViewHolder(@NonNull View view) {
            super(view);
            this.f32171a = (LinearLayout) view.findViewById(R.id.comment_reply_container);
            this.f32172b = view.findViewById(R.id.comment_reply_divider);
            this.f32173c = (TextView) view.findViewById(R.id.comment_reply_content);
            this.f32174d = (TextView) view.findViewById(R.id.comment_reply_more);
            this.f32175e = view.findViewById(R.id.line);
            this.f32176f = view.findViewById(R.id.bottom);
        }
    }

    /* loaded from: classes4.dex */
    public class SendMessageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f32178a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f32179b;

        public SendMessageViewHolder(@NonNull View view) {
            super(view);
            this.f32178a = (SimpleDraweeView) view.findViewById(R.id.usericonMe);
            this.f32179b = (TextView) view.findViewById(R.id.message);
        }
    }

    /* loaded from: classes4.dex */
    public class ViewHolder2 extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f32181a;

        public ViewHolder2(@NonNull View view) {
            super(view);
            this.f32181a = (TextView) view.findViewById(R.id.title);
        }
    }

    /* loaded from: classes4.dex */
    public class WebtitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f32183a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f32184b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f32185c;

        public WebtitleViewHolder(@NonNull View view) {
            super(view);
            this.f32183a = (TextView) view.findViewById(R.id.contentTime);
            this.f32184b = (TextView) view.findViewById(R.id.contentName);
            this.f32185c = (TextView) view.findViewById(R.id.content_title);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentViewHolder f32187b;

        a(CommentViewHolder commentViewHolder) {
            this.f32187b = commentViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f32187b.f32153j.getText().toString().equals("查看全部")) {
                this.f32187b.f32149f.setMaxLines(Integer.MAX_VALUE);
                this.f32187b.f32153j.setText("收起");
            } else {
                this.f32187b.f32149f.setMaxLines(5);
                this.f32187b.f32153j.setText("查看全部");
            }
            this.f32187b.f32153j.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements n {
        b() {
        }

        @Override // com.join.mgps.activity.GameInformationActivityV2.n
        public void a(InformationCommentBeanV2 informationCommentBeanV2) {
            if (informationCommentBeanV2.getPraise().booleanValue()) {
                com.join.mgps.Util.l2.a(GameInformationActivityV2.this.G).b("你已赞过");
            } else {
                GameInformationActivityV2.this.J0(informationCommentBeanV2, null, null);
            }
        }

        @Override // com.join.mgps.activity.GameInformationActivityV2.n
        public void b(InformationCommentBeanV2 informationCommentBeanV2) {
            GameInformationCommentActivity_.P0(GameInformationActivityV2.this.G).b(GameInformationActivityV2.this.f32137t).a(informationCommentBeanV2).start();
        }

        @Override // com.join.mgps.activity.GameInformationActivityV2.n
        public void c(InformationCommentBeanV2 informationCommentBeanV2) {
            InformationCommentBeanV2 informationCommentBeanV22 = new InformationCommentBeanV2();
            informationCommentBeanV22.setCommentId(informationCommentBeanV2.getCommentId());
            informationCommentBeanV22.setUid(informationCommentBeanV2.getUid());
            informationCommentBeanV22.setNickname(informationCommentBeanV2.getNickname());
            GameInformationCommentActivity_.P0(GameInformationActivityV2.this.G).b(GameInformationActivityV2.this.f32137t).a(informationCommentBeanV22).start();
        }

        @Override // com.join.mgps.activity.GameInformationActivityV2.n
        public void d() {
            GameInformationActivityV2.this.V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            GameInformationActivityV2 gameInformationActivityV2 = GameInformationActivityV2.this;
            intentUtil.goGameDetialActivity(gameInformationActivityV2, gameInformationActivityV2.H.getCrc_sign_id(), GameInformationActivityV2.this.H.getGame_info_tpl_type(), GameInformationActivityV2.this.H.getSp_tpl_two_position(), 116);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32191b;

        d(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f32191b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f32191b.getPraise().booleanValue()) {
                com.join.mgps.Util.l2.a(GameInformationActivityV2.this.R).b("你已赞过");
            } else if (IntentUtil.getInstance().goLoginInteractive(GameInformationActivityV2.this.R)) {
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(GameInformationActivityV2.this.R, R.anim.scale_reset));
                n nVar = GameInformationActivityV2.this.X;
                if (nVar != null) {
                    nVar.a(this.f32191b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32193b;

        e(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f32193b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n nVar = GameInformationActivityV2.this.X;
            if (nVar != null) {
                nVar.c(this.f32193b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32195b;

        f(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f32195b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n nVar = GameInformationActivityV2.this.X;
            if (nVar != null) {
                nVar.b(this.f32195b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32197b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f32198c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32199d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GameCommentAdapterV2.l.b f32200e;

        g(int i4, int i5, String str, GameCommentAdapterV2.l.b bVar) {
            this.f32197b = i4;
            this.f32198c = i5;
            this.f32199d = str;
            this.f32200e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f32197b == 0) {
                return;
            }
            InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f32197b; i4 >= 0; i4--) {
                m mVar = GameInformationActivityV2.this.W.get(this.f32198c - i4);
                GameCommentAdapterV2.l.b bVar = mVar.f32227b.vaule() == GType.REPLY.vaule() ? (GameCommentAdapterV2.l.b) mVar.f32226a : null;
                if (bVar != null && this.f32199d == bVar.f42160a) {
                    arrayList.addAll(bVar.f42161b.getReplyList());
                }
            }
            for (int i5 = 0; i5 <= this.f32197b; i5++) {
                GameInformationActivityV2.this.W.remove(this.f32198c - i5);
            }
            informationCommentBeanV2.setReplyList(arrayList);
            GameInformationActivityV2.this.W.add(this.f32198c - this.f32197b, GameInformationActivityV2.this.u0(this.f32199d, informationCommentBeanV2, this.f32200e.f42162c, true));
            GameInformationActivityV2.this.O.notifyDataSetChanged();
            GameInformationActivityV2.this.X.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32203c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32204d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GameCommentAdapterV2.l.b f32205e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f32206f;

        h(int i4, InformationCommentBeanV2 informationCommentBeanV2, String str, GameCommentAdapterV2.l.b bVar, int i5) {
            this.f32202b = i4;
            this.f32203c = informationCommentBeanV2;
            this.f32204d = str;
            this.f32205e = bVar;
            this.f32206f = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f32202b) {
                InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2(this.f32203c);
                List<InformationCommentBeanV2> replyList = informationCommentBeanV2.getReplyList();
                ArrayList arrayList = new ArrayList();
                int i6 = i4 + 3;
                if (i6 < replyList.size()) {
                    arrayList.addAll(replyList.subList(i4, i6));
                } else {
                    arrayList.addAll(replyList.subList(i4, replyList.size()));
                    z4 = true;
                }
                informationCommentBeanV2.setReplyList(arrayList);
                m u02 = GameInformationActivityV2.this.u0(this.f32204d, informationCommentBeanV2, this.f32205e.f42162c, i5 == 0);
                GameCommentAdapterV2.l.b bVar = (GameCommentAdapterV2.l.b) u02.f32226a;
                bVar.f42164e = i5;
                bVar.f42165f = z4;
                bVar.f42163d = i5 == 0;
                GameInformationActivityV2.this.K0(u02, !z4);
                GameInformationActivityV2.this.W.add(this.f32206f + i5 + 1, u02);
                i5++;
                i4 = i6;
            }
            GameInformationActivityV2.this.W.remove(this.f32206f);
            GameInformationActivityV2.this.O.notifyDataSetChanged();
            GameInformationActivityV2.this.X.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32208b;

        i(InformationCommentBeanV2 informationCommentBeanV2) {
            this.f32208b = informationCommentBeanV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f32208b.getUid())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentViewHolder f32210b;

        j(CommentViewHolder commentViewHolder) {
            this.f32210b = commentViewHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            Layout layout = this.f32210b.f32149f.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) > 0) {
                        this.f32210b.f32153j.setVisibility(0);
                        return;
                    } else {
                        this.f32210b.f32153j.setVisibility(8);
                        return;
                    }
                }
                return;
            }
            this.f32210b.f32153j.setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    class k extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f32212a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f32213b;

        /* renamed from: c  reason: collision with root package name */
        TextView f32214c;

        /* renamed from: d  reason: collision with root package name */
        View f32215d;

        /* renamed from: e  reason: collision with root package name */
        TextView f32216e;

        /* renamed from: f  reason: collision with root package name */
        TextView f32217f;

        /* renamed from: g  reason: collision with root package name */
        TextView f32218g;

        /* renamed from: h  reason: collision with root package name */
        TextView f32219h;

        /* renamed from: i  reason: collision with root package name */
        TextView f32220i;

        /* renamed from: j  reason: collision with root package name */
        Button f32221j;

        public k(@NonNull View view) {
            super(view);
            this.f32212a = view.findViewById(R.id.gameCardLayout);
            this.f32213b = (SimpleDraweeView) view.findViewById(R.id.cardIcon);
            this.f32214c = (TextView) view.findViewById(R.id.cardAppname);
            this.f32215d = view.findViewById(R.id.cardDownNumber);
            this.f32216e = (TextView) view.findViewById(R.id.cardAppSize);
            this.f32217f = (TextView) view.findViewById(R.id.cardDownNumberText);
            this.f32218g = (TextView) view.findViewById(R.id.cardInfo);
            this.f32219h = (TextView) view.findViewById(R.id.moneyText);
            this.f32221j = (Button) view.findViewById(R.id.cardDownButn);
            this.f32220i = (TextView) view.findViewById(R.id.textView69);
        }
    }

    /* loaded from: classes4.dex */
    class l extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f32223a;

        /* renamed from: b  reason: collision with root package name */
        TextView f32224b;

        public l(@NonNull View view) {
            super(view);
            this.f32223a = (TextView) view.findViewById(R.id.comment_number);
            this.f32224b = (TextView) view.findViewById(R.id.more);
        }
    }

    /* loaded from: classes4.dex */
    public interface n {
        void a(InformationCommentBeanV2 informationCommentBeanV2);

        void b(InformationCommentBeanV2 informationCommentBeanV2);

        void c(InformationCommentBeanV2 informationCommentBeanV2);

        void d();
    }

    /* loaded from: classes4.dex */
    class o extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        WebView f32229a;

        public o(@NonNull View view) {
            super(view);
            this.f32229a = (WebView) view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(int i4, ReplyViewHolder replyViewHolder) {
        try {
            GameCommentAdapterV2.l.b bVar = (GameCommentAdapterV2.l.b) this.W.get(i4).f32226a;
            if (bVar == null || bVar.f42161b == null) {
                return;
            }
            if (bVar.f42163d) {
                replyViewHolder.f32172b.setVisibility(0);
            } else {
                replyViewHolder.f32172b.setVisibility(8);
            }
            if (!bVar.f42166g) {
                replyViewHolder.f32175e.setVisibility(0);
                replyViewHolder.f32176f.setVisibility(0);
            } else {
                replyViewHolder.f32175e.setVisibility(8);
                replyViewHolder.f32176f.setVisibility(8);
            }
            List<InformationCommentBeanV2> replyList = bVar.f42161b.getReplyList();
            if (replyList != null && replyList.size() != 0) {
                I0(replyViewHolder.f32171a, bVar, true, i4);
            } else {
                replyViewHolder.f32171a.removeAllViews();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void I0(View view, GameCommentAdapterV2.l.b bVar, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        String str = bVar.f42160a;
        int i8 = bVar.f42164e;
        boolean z6 = bVar.f42165f;
        InformationCommentBeanV2 informationCommentBeanV2 = bVar.f42161b;
        List<InformationCommentBeanV2> replyList = informationCommentBeanV2.getReplyList();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = replyList.size();
        int i9 = 0;
        while (i9 < size + 1) {
            if (i9 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.R).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                TextView textView3 = (TextView) inflate.findViewById(R.id.tvReplyName);
                if ((i9 != size || size <= 3) && !(i8 > 0 && z6 && i9 == size)) {
                    view2 = inflate;
                    i5 = i8;
                    z5 = z6;
                    i6 = i9;
                    if (i6 == 3 && z4 && size > 3) {
                        textView.setVisibility(8);
                        textView3.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - 3)));
                        i7 = size;
                        view2.setOnClickListener(new h(size, informationCommentBeanV2, str, bVar, i4));
                    } else {
                        i7 = size;
                        if (i6 < i7 && (i6 < 3 || !z4)) {
                            textView.setVisibility(0);
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            InformationCommentBeanV2 informationCommentBeanV22 = replyList.get(i6);
                            String msg = informationCommentBeanV22.getMsg();
                            informationCommentBeanV22.getCommentId();
                            try {
                                textView.setText(Html.fromHtml(msg));
                                textView3.setText(informationCommentBeanV22.getNickname() + ":");
                                M0(view2, informationCommentBeanV22);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            linearLayout.addView(view2);
                        }
                    }
                } else {
                    textView.setVisibility(8);
                    textView3.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setText("收起");
                    int i10 = i8;
                    view2 = inflate;
                    i5 = i8;
                    i6 = i9;
                    z5 = z6;
                    view2.setOnClickListener(new g(i10, i4, str, bVar));
                    i7 = size;
                }
                linearLayout.addView(view2);
            } else {
                i5 = i8;
                z5 = z6;
                i6 = i9;
                i7 = size;
            }
            i9 = i6 + 1;
            size = i7;
            i8 = i5;
            z6 = z5;
        }
    }

    private void M0(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new e(informationCommentBeanV2));
    }

    private void N0(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new d(informationCommentBeanV2));
    }

    private void O0(View view, InformationCommentBeanV2 informationCommentBeanV2) {
        view.setOnClickListener(new f(informationCommentBeanV2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void T0() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameInformationActivityV2.T0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U0() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameInformationActivityV2.U0():void");
    }

    private void W0(InformationCommentBeanV2 informationCommentBeanV2) {
        GameInformationBean gameInformationBean = this.f32143z;
        if (gameInformationBean != null && gameInformationBean.getComment_switch() == 1) {
            y0(this.f32137t);
        }
        if (this.Q == null || informationCommentBeanV2 == null) {
            return;
        }
        boolean z4 = false;
        for (int i4 = 0; i4 < this.Q.size(); i4++) {
            InformationCommentBeanV2 informationCommentBeanV22 = this.Q.get(i4);
            if (informationCommentBeanV2.getId().equals(informationCommentBeanV22.getId())) {
                if (informationCommentBeanV2.getPraise() != informationCommentBeanV22.getPraise()) {
                    informationCommentBeanV22.setPraise(informationCommentBeanV2.getPraise());
                    z4 |= true;
                }
                if (informationCommentBeanV2.getLike() != informationCommentBeanV22.getLike()) {
                    informationCommentBeanV22.setLike(informationCommentBeanV2.getLike());
                    z4 |= true;
                }
                if (z4) {
                    break;
                }
            }
        }
        if (z4) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.Q);
            Q0(arrayList);
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void v0() {
        com.join.mgps.customview.o oVar = this.V;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.V.dismiss();
    }

    private void x0() {
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

    public void A0(int i4, CommentViewHolder commentViewHolder) {
        GameCommentAdapterV2.l.a aVar = (GameCommentAdapterV2.l.a) this.W.get(i4).f32226a;
        if (aVar == null) {
            return;
        }
        InformationCommentBeanV2 informationCommentBeanV2 = aVar.f42159a;
        if (informationCommentBeanV2.getReplyList() != null && informationCommentBeanV2.getReplyList().size() > 0) {
            commentViewHolder.f32152i.setVisibility(8);
        } else {
            commentViewHolder.f32152i.setVisibility(0);
        }
        commentViewHolder.f32148e.setText(com.join.android.app.common.utils.g.a(Long.parseLong(informationCommentBeanV2.getCreateTime())));
        commentViewHolder.f32149f.setText(informationCommentBeanV2.getMsg());
        TextView textView = commentViewHolder.f32150g;
        textView.setText(informationCommentBeanV2.getLike() + "");
        if (informationCommentBeanV2.getPraise().booleanValue()) {
            commentViewHolder.f32146c.setImageResource(R.drawable.like);
        } else {
            commentViewHolder.f32146c.setImageResource(R.drawable.unlike);
        }
        if (com.join.mgps.Util.g2.i(informationCommentBeanV2.getAvatar())) {
            UtilsMy.s3(this.R, informationCommentBeanV2.getAvatar(), commentViewHolder.f32145b);
        }
        commentViewHolder.f32147d.setText(Html.fromHtml(informationCommentBeanV2.getNickname()));
        N0(commentViewHolder.f32146c, informationCommentBeanV2);
        O0(commentViewHolder.f32144a, informationCommentBeanV2);
        commentViewHolder.f32145b.setOnClickListener(new i(informationCommentBeanV2));
        commentViewHolder.f32149f.post(new j(commentViewHolder));
        commentViewHolder.f32153j.setOnClickListener(new a(commentViewHolder));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultMainBean<List<GameInformationBean>> O = this.f32119b.O(RequestBeanUtil.getInstance(this).getgameInformation(this.f32137t, this.f32139v));
                if (O != null && O.getFlag() == 1) {
                    List<GameInformationBean> data = O.getMessages().getData();
                    if (data.size() > 0) {
                        R0(data.get(0));
                    } else {
                        showLodingFailed();
                    }
                } else {
                    showLodingFailed();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    public n D0() {
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E0() {
        if (this.f32143z != null && System.currentTimeMillis() - this.I > 2000) {
            this.I = System.currentTimeMillis();
            ShareBean shareBean = new ShareBean();
            shareBean.setTitle(this.f32143z.getTitle());
            shareBean.setText("点击查看详情");
            shareBean.setImageUrl(this.f32143z.getShow_pic());
            shareBean.setQqUrl(this.f32143z.getShare_url());
            shareBean.setqZoneShareUrl(this.f32143z.getShare_url());
            shareBean.setWeiboShareUrl(this.f32143z.getShare_url());
            shareBean.setWechatFriendUrl(this.f32143z.getShare_url());
            shareBean.setWechatShareUrl(this.f32143z.getShare_url());
            shareBean.setFrom(3);
            shareBean.setGameId(this.f32137t);
            com.join.mgps.Util.s.r(this, shareBean);
        }
    }

    boolean F0(DetailResultBean detailResultBean) {
        return (detailResultBean == null || detailResultBean.getPay_tag_info() == null || detailResultBean.getPay_tag_info().getPay_game_amount() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void G0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void H0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        T0();
        U0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void J0(InformationCommentBeanV2 informationCommentBeanV2, ImageView imageView, TextView textView) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    return;
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this);
                GameInformationCommentPraiseArgs gameInformationCommentPraiseArgs = new GameInformationCommentPraiseArgs();
                gameInformationCommentPraiseArgs.setCommentId(informationCommentBeanV2.getId());
                gameInformationCommentPraiseArgs.setUid(this.L.getUid() + "");
                gameInformationCommentPraiseArgs.setUserToken(this.L.getToken());
                requestModel.setArgs(gameInformationCommentPraiseArgs);
                ResponseModel body = com.join.mgps.rpc.impl.i.D0().B0().P(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 706) {
                    showMessage("完善资料后就可点赞哦");
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                } else if (body != null && body.getCode() == 706) {
                    showMessage("完善资料后就可点赞哦");
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                } else if (body != null && body.getCode() == 200) {
                    Boolean bool = Boolean.TRUE;
                    informationCommentBeanV2.setPraise(bool);
                    informationCommentBeanV2.setLike(informationCommentBeanV2.getLike() + 1);
                    informationCommentBeanV2.setPraise(bool);
                    W0(informationCommentBeanV2);
                    return;
                } else {
                    if (body != null && body.getMessage() != null) {
                        showToast(body.getMessage());
                    } else {
                        showToast("点赞失败");
                    }
                    informationCommentBeanV2.setPraise(Boolean.FALSE);
                    W0(informationCommentBeanV2);
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showToast("点赞失败");
                informationCommentBeanV2.setPraise(Boolean.FALSE);
                W0(informationCommentBeanV2);
                return;
            }
        }
        showToast("没有网络");
        informationCommentBeanV2.setPraise(Boolean.FALSE);
        W0(informationCommentBeanV2);
    }

    void K0(m mVar, boolean z4) {
        if (mVar == null) {
            return;
        }
        try {
            ((GameCommentAdapterV2.l.b) mVar.f32226a).f42166g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void L0(n nVar) {
        this.X = nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void P0() {
        LayoutInflater.from(this.G);
        this.W.add(new m(GType.sendcomment));
        this.O.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void Q0(List<InformationCommentBeanV2> list) {
        String json = JsonMapper.getInstance().toJson(list);
        if (this.S.equals(json)) {
            return;
        }
        this.S = json;
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        arrayList.addAll(list);
        p0(list);
        this.O.notifyDataSetChanged();
        V0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(GameInformationBean gameInformationBean) {
        List<DownloadTask> H;
        boolean z4;
        this.f32134q.setVisibility(0);
        if (gameInformationBean.getComment_switch() == 1) {
            this.f32135r.setVisibility(0);
            int comment_count = gameInformationBean.getComment_count();
            this.K = comment_count;
            if (comment_count > 0) {
                this.E.setVisibility(0);
            }
            TextView textView = this.E;
            textView.setText(gameInformationBean.getComment_count() + "");
        } else {
            this.f32135r.setVisibility(8);
            this.E.setVisibility(8);
        }
        this.D.setVisibility(0);
        this.f32143z = gameInformationBean;
        this.f32126i.setVisibility(8);
        this.f32125h.setVisibility(8);
        this.C.setVisibility(0);
        List<DetailResultBean> game_info = gameInformationBean.getGame_info();
        this.W.add(new m(GType.webview));
        if (game_info != null && game_info.size() != 0) {
            DetailResultBean detailResultBean = game_info.get(0);
            this.H = detailResultBean;
            if (detailResultBean == null) {
                this.f32123f.setVisibility(8);
            } else {
                this.f32123f.setVisibility(0);
                this.W.add(new m(GType.card));
                if (this.f32140w) {
                    w0();
                }
            }
        }
        if (gameInformationBean.getComment_switch() == 1) {
            P0();
            this.W.add(new m(GType.commentTitle));
            y0(this.f32137t);
        }
        if (game_info != null && game_info.size() != 0) {
            DetailResultBean detailResultBean2 = game_info.get(0);
            this.H = detailResultBean2;
            detailResultBean2.set_from(106);
            UtilsMy.k3(this.H.getSp_tag_info(), this.f32132o);
            String crc_sign_id = this.H.getCrc_sign_id();
            this.f32141x = crc_sign_id;
            if (crc_sign_id == null) {
                return;
            }
            if (this.H.getMod_info() != null) {
                H = p1.f.K().G(this.H.getMod_info().getMain_game_id(), this.H.getMod_info().getMod_game_id());
            } else {
                H = p1.f.K().H(this.H.getPackage_name());
            }
            if (H != null && H.size() > 0) {
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    this.A = p1.f.K().F(this.f32141x);
                } else if (z5) {
                    this.A = p1.f.K().F(this.H.getMod_info().getMod_game_id());
                } else if (z4) {
                    this.A = p1.f.K().F(this.f32141x);
                } else {
                    if (this.H.getMod_info() != null) {
                        this.A = p1.f.K().F(this.H.getMod_info().getMod_game_id());
                    }
                    if (this.A == null) {
                        this.A = p1.f.K().F(this.f32141x);
                    }
                }
            }
            T0();
            MyImageLoader.h(this.f32127j, this.H.getIco_remote());
            this.f32129l.setText(this.H.getGame_name());
            TextView textView2 = this.f32130m;
            textView2.setText("大小：" + this.H.getSize() + "M");
            if (this.H == null) {
                this.f32123f.setVisibility(8);
            } else {
                this.f32123f.setVisibility(0);
                if (this.f32140w) {
                    w0();
                }
            }
            this.C.setOnClickListener(new c());
            this.O.notifyDataSetChanged();
            return;
        }
        this.f32123f.setVisibility(8);
        this.O.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void S0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void V0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X0(ImageView imageView, TextView textView, boolean z4, String str) {
        if (z4) {
            imageView.setImageResource(R.drawable.like);
            textView.setText(str);
            return;
        }
        imageView.setImageResource(R.drawable.unlike);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f32119b = com.join.mgps.rpc.impl.d.P1();
        this.O = new GameinformationAdapter();
        com.join.mgps.Util.d0.a().d(this);
        this.G = this;
        this.R = this;
        this.f32122e.setText("详情");
        getDownloadTaskInfo();
        this.f32136s.setVisibility(0);
        showLoding();
        this.F.setLayoutManager(new LinearLayoutManager(this.G));
        this.F.setAdapter(this.O);
        this.X = new b();
        B0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r4 != 11) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask r3, int r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getCrc_link_type_val()
            r1 = 2
            if (r4 == r1) goto L8d
            r1 = 3
            if (r4 == r1) goto L7f
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 6
            if (r4 == r1) goto L56
            r1 = 7
            if (r4 == r1) goto L3b
            r1 = 10
            if (r4 == r1) goto L20
            r3 = 11
            if (r4 == r3) goto L71
            goto La7
        L20:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameInformationActivityV2.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.M.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.N.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        x0();
        super.onBackPressed();
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
        changeDownloadTaskNumber(this.A, nVar.c());
        if (a5 != null && this.A != null && a5.getCrc_link_type_val().equals(this.A.getCrc_link_type_val())) {
            this.A = a5;
            a5.setStatus(a5.getStatus());
            this.A.setPath(a5.getPath());
            this.A.setSize(a5.getSize());
        }
        int c5 = nVar.c();
        if ((c5 == 5 || c5 == 11 || c5 == 48) && a5 != null && this.A != null && a5.getCrc_link_type_val().equals(this.A.getCrc_link_type_val())) {
            this.A = a5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onEventMainThread: ");
        sb.append(this.A.getStatus());
        T0();
        U0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        WebView webView = this.U;
        if (webView != null) {
            try {
                webView.getClass().getMethod("onPause", new Class[0]).invoke(this.U, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        super.onPause();
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        List<DownloadTask> H;
        boolean z4;
        super.onResume();
        GameInformationBean gameInformationBean = this.f32143z;
        if (gameInformationBean != null && gameInformationBean.getComment_switch() == 1) {
            y0(this.f32137t);
        }
        WebView webView = this.U;
        if (webView != null) {
            try {
                webView.getClass().getMethod("onResume", new Class[0]).invoke(this.U, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.G).getAccountData();
        this.L = accountData;
        if (accountData != null && this.f32128k != null) {
            UtilsMy.s3(this.G, accountData.d0(), this.f32128k);
        }
        if (com.join.mgps.Util.g2.h(this.f32141x)) {
            return;
        }
        DetailResultBean detailResultBean = this.H;
        if (detailResultBean != null) {
            if (detailResultBean.getMod_info() != null) {
                H = p1.f.K().G(this.H.getMod_info().getMod_game_id(), this.H.getMod_info().getMain_game_id());
            } else {
                H = p1.f.K().H(this.H.getPackage_name());
            }
            if (H != null && H.size() > 0) {
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    r2 = p1.f.K().F(this.f32141x);
                } else if (z5) {
                    if (this.H.getMod_info() != null) {
                        r2 = p1.f.K().F(this.H.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    r2 = p1.f.K().F(this.f32141x);
                } else {
                    r2 = this.H.getMod_info() != null ? p1.f.K().F(this.H.getMod_info().getMod_game_id()) : null;
                    if (r2 == null) {
                        r2 = p1.f.K().F(this.f32141x);
                    }
                }
            }
        }
        if (r2 != null) {
            this.A = r2;
        }
        if (r2 != null && this.A != null) {
            if (Dtype.android.name().equals(this.A.getFileType()) && this.A.getStatus() == 5) {
                if (this.H.getMod_info() == null) {
                    if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(this).d(this, this.A.getPackageName())).booleanValue()) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this).l(this, this.A.getPackageName());
                        if (com.join.mgps.Util.g2.i(this.A.getVer()) && l4.d() < Integer.parseInt(this.A.getVer())) {
                            this.A.setStatus(9);
                        } else {
                            this.A.setStatus(5);
                        }
                    } else {
                        this.A.setStatus(11);
                    }
                }
            } else {
                this.A.setStatus(r2.getStatus());
            }
        } else if (r2 == null && this.A != null && Dtype.android.name().equals(this.A.getFileType()) && this.A.getStatus() == 5 && this.H.getMod_info() == null) {
            if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(this).d(this, this.A.getPackageName())).booleanValue()) {
                APKUtils.a l5 = com.join.android.app.common.utils.e.l0(this).l(this, this.A.getPackageName());
                if (com.join.mgps.Util.g2.i(this.A.getVer()) && l5.d() < Integer.parseInt(this.A.getVer())) {
                    this.A.setStatus(9);
                } else {
                    this.A.setStatus(5);
                }
            } else {
                this.A.setStatus(0);
            }
        }
        T0();
        U0();
    }

    void p0(List<InformationCommentBeanV2> list) {
        Iterator<m> it2 = this.W.iterator();
        while (it2.hasNext()) {
            GType gType = it2.next().f32227b;
            if (gType == GType.COMMENT || gType == GType.REPLY || gType == GType.TITLE) {
                it2.remove();
            }
        }
        for (int i4 = 0; list != null && i4 < list.size(); i4++) {
            InformationCommentBeanV2 informationCommentBeanV2 = list.get(i4);
            this.W.add(new m(GType.COMMENT, new GameCommentAdapterV2.l.a(informationCommentBeanV2)));
            List<InformationCommentBeanV2> replyList = informationCommentBeanV2.getReplyList();
            if (replyList != null && replyList.size() > 0) {
                this.W.add(new m(GType.REPLY, new GameCommentAdapterV2.l.b(informationCommentBeanV2.getCommentId(), informationCommentBeanV2, 0, true)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        if (this.H == null) {
            return;
        }
        IntentUtil.getInstance().goGameDetialActivity(this, this.H.getCrc_sign_id(), this.H.getGame_info_tpl_type(), this.H.getSp_tpl_two_position(), 116);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        B0();
    }

    void s0() {
        DownloadTask downloadTask = this.A;
        if (downloadTask == null) {
            if (this.H.getMod_info() != null) {
                ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this.G).extra("gameDownloadDetail", this.H.getMod_info().getMod_game_id())).extra("_from", this.H.get_from())).extra("_from_type", this.H.get_from_type())).a();
                return;
            } else {
                ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this.G).extra("gameDownloadDetail", this.H.getCrc_sign_id())).extra("_from", this.H.get_from())).extra("_from_type", this.H.get_from_type())).a();
                return;
            }
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        DetailResultBean detailResultBean = this.H;
        if (detailResultBean != null && UtilsMy.w0(detailResultBean.getPay_tag_info(), this.H.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 13) {
                com.php25.PDownload.d.l(this, this.A);
                return;
            } else if (status != 43) {
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(this.G, this.A);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                switch (status) {
                                    case 9:
                                        if (!com.join.android.app.common.utils.j.j(this.G)) {
                                            com.join.mgps.Util.l2.a(this.G).b("无网络连接");
                                            return;
                                        }
                                        int downloadType = this.A.getDownloadType();
                                        if (downloadType != 0 && downloadType != 1) {
                                            if (downloadType != 2) {
                                                return;
                                            }
                                            UtilsMy.u4(this.A);
                                            return;
                                        } else if (this.A.getCrc_link_type_val() == null || this.A.getCrc_link_type_val().equals("")) {
                                            return;
                                        } else {
                                            this.A.setExt1(this.f32137t);
                                            UtilsMy.I2(this.G, this.A);
                                            return;
                                        }
                                    case 10:
                                        break;
                                    case 11:
                                        UtilsMy.a4(this.A, this.G);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(this.A, this.G);
                    return;
                }
                com.php25.PDownload.d.i(this.A);
                return;
            }
        }
        this.A.setKeyword(Where.article.name());
        this.A.setExt1(this.f32137t);
        DetailResultBean detailResultBean2 = this.H;
        if (detailResultBean2 != null && UtilsMy.y0(detailResultBean2.getPay_tag_info(), this.H.getCrc_sign_id()) > 0) {
            UtilsMy.d4(this.G, this.H.getCrc_sign_id());
        } else {
            UtilsMy.z1(this.A, this.H);
            if (!UtilsMy.o1(this.G, this.A)) {
                if (this.H.getDown_status() == 5) {
                    UtilsMy.l1(this.G, this.A);
                } else {
                    UtilsMy.R0(this.G, this.A, this.H.getTp_down_url(), this.H.getOther_down_switch(), this.H.getCdn_down_switch());
                }
            }
        }
        com.papa.sim.statistic.p.l(this.G).B(this.f32137t, AccountUtil_.getInstance_(this.G).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f32125h.setVisibility(0);
        this.f32126i.setVisibility(8);
        this.C.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        this.f32126i.setVisibility(0);
        this.f32125h.setVisibility(8);
        this.C.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.G).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.G).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        GameInformationCommentActivity_.P0(this.G).b(this.f32137t).start();
    }

    m u0(String str, InformationCommentBeanV2 informationCommentBeanV2, int i4, boolean z4) {
        return new m(GType.REPLY, new GameCommentAdapterV2.l.b(str, informationCommentBeanV2, i4, z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.M.size();
        int size2 = this.N.size();
        this.f32136s.setDownloadGameNum(size);
        if (size2 > 0) {
            this.f32136s.d();
        } else {
            this.f32136s.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        DownloadTask downloadTask = this.A;
        if (downloadTask != null && downloadTask.getStatus() != 0) {
            DownloadTask downloadTask2 = this.A;
            int status = downloadTask2 != null ? downloadTask2.getStatus() : 0;
            DetailResultBean detailResultBean = this.H;
            if (detailResultBean != null && UtilsMy.w0(detailResultBean.getPay_tag_info(), this.H.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(this, this.A);
                    return;
                } else if (status != 43) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(this.G, this.A);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(this.G)) {
                                                com.join.mgps.Util.l2.a(this.G).b("无网络连接");
                                                return;
                                            }
                                            int downloadType = this.A.getDownloadType();
                                            if (downloadType != 0 && downloadType != 1) {
                                                if (downloadType != 2) {
                                                    return;
                                                }
                                                UtilsMy.u4(this.A);
                                                return;
                                            } else if (this.A.getCrc_link_type_val() == null || this.A.getCrc_link_type_val().equals("")) {
                                                return;
                                            } else {
                                                this.A.setExt1(this.f32137t);
                                                UtilsMy.I2(this.G, this.A);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(this.A, this.G);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(this.A, this.G);
                        return;
                    }
                    com.php25.PDownload.d.i(this.A);
                    return;
                }
            }
            this.A.setKeyword(Where.article.name());
            this.A.setExt1(this.f32137t);
            DetailResultBean detailResultBean2 = this.H;
            if (detailResultBean2 != null && UtilsMy.y0(detailResultBean2.getPay_tag_info(), this.H.getCrc_sign_id()) > 0) {
                UtilsMy.d4(this.G, this.H.getCrc_sign_id());
            } else {
                UtilsMy.z1(this.A, this.H);
                if (!UtilsMy.o1(this.G, this.A)) {
                    if (this.H.getDown_status() == 5) {
                        UtilsMy.l1(this.G, this.A);
                    } else {
                        UtilsMy.R0(this.G, this.A, this.H.getTp_down_url(), this.H.getOther_down_switch(), this.H.getCdn_down_switch());
                    }
                }
            }
            com.papa.sim.statistic.p.l(this.G).B(this.f32137t, AccountUtil_.getInstance_(this.G).getUid());
            return;
        }
        UtilsMy.Z0(this.G, this.H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.G);
                GameInformationCommentRequestV2 gameInformationCommentRequestV2 = new GameInformationCommentRequestV2();
                gameInformationCommentRequestV2.setInformation_id(this.f32137t);
                gameInformationCommentRequestV2.setUid(AccountUtil_.getInstance_(this.G).getUid());
                gameInformationCommentRequestV2.setToken(AccountUtil_.getInstance_(this.G).getToken());
                gameInformationCommentRequestV2.setPage(1);
                requestModel.setArgs(gameInformationCommentRequestV2);
                ResponseModel<InformationCommentBackV2> body = com.join.mgps.rpc.impl.i.D0().B0().h0(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200) {
                    InformationCommentBackV2 data = body.getData();
                    if (data == null) {
                        G0();
                        return;
                    }
                    List<InformationCommentBeanV2> comments = data.getComments();
                    if (comments == null) {
                        G0();
                        return;
                    } else if (comments.size() > 0) {
                        Q0(comments);
                        return;
                    } else {
                        G0();
                        return;
                    }
                }
                G0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                G0();
                return;
            }
        }
        G0();
    }

    public void z0(int i4, ViewHolder2 viewHolder2) {
        InformationCommentBeanV2 informationCommentBeanV2 = ((GameCommentAdapterV2.l.a) this.W.get(i4).f32226a).f42159a;
        viewHolder2.f32181a.setText("最新评论");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m {

        /* renamed from: a  reason: collision with root package name */
        Object f32226a;

        /* renamed from: b  reason: collision with root package name */
        GType f32227b;

        public m(GType gType) {
            this.f32227b = gType;
        }

        public m(GType gType, Object obj) {
            this.f32227b = gType;
            this.f32226a = obj;
        }
    }
}
