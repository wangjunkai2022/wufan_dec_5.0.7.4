package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.BaseAppCompatActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.MediaController;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.adapter.ForumProfileFavoritesAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.b;
import com.join.mgps.db.tables.ForumTable;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.tencent.bugly.Bugly;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.mg_forum_profile_favorites_activity)
/* loaded from: classes.dex */
public class ForumProfileFavoritesActivity extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    private static final String D1 = ForumProfileFavoritesActivity.class.getSimpleName();
    public static final String E1 = "key_mediacmd";
    public static final String F1 = "key_mediacmd_params";
    com.join.mgps.rpc.e A;
    private com.join.mgps.rpc.e A1;
    Dialog B;
    com.join.mgps.customview.b D;
    View E;
    @ViewById
    FrameLayout G;
    @ViewById
    RelativeLayout H;
    @ViewById
    MyVideoView I;
    @ViewById
    SimpleDraweeView J;
    @ViewById
    ImageView K;
    @ViewById
    LinearLayout L;
    MediaController M;
    int N;
    String O;
    String P;
    boolean Q;
    List<DownloadTask> X;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f30962b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f30963c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f30964d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ForumLoadingView f30965e;

    /* renamed from: f  reason: collision with root package name */
    List<ForumData.ForumUserFavoritesData> f30966f;

    /* renamed from: g  reason: collision with root package name */
    volatile List<ForumProfileFavoritesAdapter.k0> f30967g;

    /* renamed from: h  reason: collision with root package name */
    ForumProfileFavoritesAdapter f30968h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    XListView2 f30969i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    PtrClassicFrameLayout f30970j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.i f30971k;

    /* renamed from: l  reason: collision with root package name */
    private com.join.mgps.dialog.v0 f30972l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    ExtBean f30973m;

    /* renamed from: z  reason: collision with root package name */
    com.join.android.app.component.video.c f30989z;

    /* renamed from: n  reason: collision with root package name */
    ForumProfileFavoritesAdapter.u f30974n = new k();

    /* renamed from: o  reason: collision with root package name */
    Handler f30975o = new o();

    /* renamed from: p  reason: collision with root package name */
    private int f30976p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f30979q = 0;

    /* renamed from: r  reason: collision with root package name */
    private final int f30980r = 0;

    /* renamed from: s  reason: collision with root package name */
    private final int f30981s = 16;

    /* renamed from: t  reason: collision with root package name */
    private final int f30982t = 32;

    /* renamed from: u  reason: collision with root package name */
    private final int f30983u = 17;

    /* renamed from: v  reason: collision with root package name */
    private final int f30984v = 18;

    /* renamed from: w  reason: collision with root package name */
    private final int f30986w = 20;

    /* renamed from: x  reason: collision with root package name */
    private final int f30987x = 24;

    /* renamed from: y  reason: collision with root package name */
    private int f30988y = 0;
    b.d C = new g();
    int F = -1;
    boolean R = false;
    int S = -1;
    int T = -1;
    int U = 0;
    com.join.mgps.customview.o V = null;
    GestureDetector W = new GestureDetector(new n());
    Map<String, DownloadTask> Y = new ConcurrentHashMap();
    Map<String, DownloadTask> Z = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    Map<String, DownloadTask> f30977p0 = new HashMap();

    /* renamed from: p1  reason: collision with root package name */
    private int f30978p1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    private int f30985v1 = 0;
    int B1 = 0;
    boolean C1 = false;

    /* loaded from: classes4.dex */
    public enum MediaCmd {
        CMD_PLAY,
        CMD_PLAY_BACKGROUND,
        CMD_PAUSE,
        CMD_STOP,
        CMD_FULLSCREEN,
        CMD_TRANSLATE_Y
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileFavoritesActivity.this.f30972l.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30991b;

        b(int i4) {
            this.f30991b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.android.app.common.utils.j.j(view.getContext())) {
                ForumProfileFavoritesActivity.this.p0(view.getContext(), this.f30991b);
            } else {
                ForumProfileFavoritesActivity forumProfileFavoritesActivity = ForumProfileFavoritesActivity.this;
                forumProfileFavoritesActivity.showToast(forumProfileFavoritesActivity.getString(R.string.net_connect_failed));
            }
            ForumProfileFavoritesActivity.this.f30972l.dismiss();
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
            super.b();
            ForumProfileFavoritesActivity.this.F0();
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
            super.a(view);
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
            ForumProfileFavoritesActivity.this.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends ForumLoadingView.e {
        f(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            ForumProfileFavoritesActivity.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements b.d {
        g() {
        }

        @Override // com.join.mgps.customview.b.d
        public void a(int i4) {
        }

        @Override // com.join.mgps.customview.b.d
        public void b(ForumBean.ForumPostsBean forumPostsBean) {
        }

        @Override // com.join.mgps.customview.b.d
        public void c(int i4, boolean z4) {
            ForumProfileFavoritesActivity.this.I0(i4, z4);
        }

        @Override // com.join.mgps.customview.b.d
        public void d(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean t02 = ForumProfileFavoritesActivity.this.t0(forumPostsBean.getPid());
            if (t02 != null) {
                t02.setIs_favorite(forumPostsBean.is_favorite());
                if (!forumPostsBean.is_favorite()) {
                    ForumProfileFavoritesActivity.this.I0(forumPostsBean.getPid(), true);
                }
            }
            ForumProfileFavoritesActivity.this.H0();
        }

        @Override // com.join.mgps.customview.b.d
        public void e(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean t02 = ForumProfileFavoritesActivity.this.t0(forumPostsBean.getPid());
            if (t02 != null) {
                t02.setBest(forumPostsBean.getBest());
            }
        }

        @Override // com.join.mgps.customview.b.d
        public void onCancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements MediaPlayer.OnCompletionListener {
        h() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            ForumProfileFavoritesActivity.this.n1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements MediaPlayer.OnPreparedListener {
        i() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            ForumProfileFavoritesActivity.this.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements MediaPlayer.OnErrorListener {
        j() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            ForumProfileFavoritesActivity.this.n1();
            com.join.mgps.Util.l2.a(ForumProfileFavoritesActivity.this.I.getContext()).b("视频播放失败");
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class k implements ForumProfileFavoritesAdapter.u {
        k() {
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void a(int i4) {
            ForumProfileFavoritesActivity forumProfileFavoritesActivity = ForumProfileFavoritesActivity.this;
            if (!forumProfileFavoritesActivity.isLogined(forumProfileFavoritesActivity)) {
                ForumProfileFavoritesActivity.this.showMessage(forumProfileFavoritesActivity.getString(R.string.forum_user_not_login));
            } else if (!ForumProfileFavoritesActivity.this.t1()) {
                ForumProfileFavoritesActivity.this.i1();
            } else {
                ForumProfileFavoritesActivity.this.X0(i4);
                ForumProfileFavoritesActivity.this.R0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void b(int i4) {
            ForumProfileFavoritesActivity forumProfileFavoritesActivity = ForumProfileFavoritesActivity.this;
            forumProfileFavoritesActivity.h1(forumProfileFavoritesActivity.t0(i4));
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void c(int i4) {
            ForumProfileFavoritesAdapter.k0.o oVar = (ForumProfileFavoritesAdapter.k0.o) ForumProfileFavoritesActivity.this.f30967g.get(i4).a();
            ForumProfileFavoritesActivity.this.F = i4;
            Bundle bundle = new Bundle();
            bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_PLAY.name());
            bundle.putStringArray("key_mediacmd_params", new String[]{ForumProfileFavoritesActivity.this.F + "", oVar.f41520b, oVar.f41519a});
            ForumProfileFavoritesActivity.this.callbackPlayVideo(bundle);
            ForumProfileFavoritesActivity.this.J0();
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void d(int i4) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(ForumProfileFavoritesActivity.this, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void e(String str) {
            ForumProfileFavoritesActivity forumProfileFavoritesActivity = ForumProfileFavoritesActivity.this;
            forumProfileFavoritesActivity.C1 = true;
            forumProfileFavoritesActivity.r0(str);
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void f(int i4) {
            ForumBean forumBean = new ForumBean();
            forumBean.setFid(i4);
            com.join.mgps.Util.j0.r0(ForumProfileFavoritesActivity.this, forumBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements MyVideoView.h {
        l() {
        }

        @Override // com.join.android.app.component.video.MyVideoView.h
        public boolean a(boolean z4) {
            com.join.mgps.Util.w0.e("onScreenChanged", "fullscreen=" + z4);
            ForumProfileFavoritesActivity.this.s0();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.setVisibility(8);
            ForumProfileFavoritesActivity.this.resume();
        }
    }

    /* loaded from: classes4.dex */
    class n extends GestureDetector.SimpleOnGestureListener {
        n() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            Fresco.getImagePipeline().I();
            return super.onFling(motionEvent, motionEvent2, f5, f6);
        }
    }

    /* loaded from: classes4.dex */
    class o extends Handler {
        o() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ForumProfileFavoritesActivity.this.f30969i.v();
            ForumProfileFavoritesActivity.this.f30969i.u();
            if (ForumProfileFavoritesActivity.this.f30979q == -1) {
                ForumProfileFavoritesActivity.this.f30969i.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements com.join.mgps.customview.f {
        p() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            ForumProfileFavoritesActivity forumProfileFavoritesActivity = ForumProfileFavoritesActivity.this;
            forumProfileFavoritesActivity.D0(forumProfileFavoritesActivity.f30976p + 1);
            if (ForumProfileFavoritesActivity.this.f30979q == -1) {
                ForumProfileFavoritesActivity.this.o1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements com.join.mgps.customview.g {
        q() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (com.join.android.app.common.utils.j.j(ForumProfileFavoritesActivity.this)) {
                ForumProfileFavoritesActivity.this.f30979q = 0;
                ForumProfileFavoritesActivity.this.D0(1);
                return;
            }
            ForumProfileFavoritesActivity forumProfileFavoritesActivity = ForumProfileFavoritesActivity.this;
            forumProfileFavoritesActivity.showToast(forumProfileFavoritesActivity.getString(R.string.net_connect_failed));
            ForumProfileFavoritesActivity.this.m0(17);
            ForumProfileFavoritesActivity.this.o1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnTouchListener {
        r() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ForumProfileFavoritesActivity.this.W.onTouchEvent(motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements AdapterView.OnItemClickListener {
        s() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = ForumProfileFavoritesActivity.this.f30968h;
            if (forumProfileFavoritesAdapter != null && forumProfileFavoritesAdapter.getItemViewType(i4) == ForumProfileFavoritesAdapter.ViewType.GAME_ITEM.ordinal()) {
                ForumProfileFavoritesAdapter.k0.b bVar = (ForumProfileFavoritesAdapter.k0.b) ForumProfileFavoritesActivity.this.f30968h.getItem(i4);
                Context context = adapterView.getContext();
                if (bVar.a() == null || bVar.a().getGame() == null) {
                    return;
                }
                ForumBean.GameInfo gameInfo = new ForumBean.GameInfo();
                gameInfo.setSp_tpl_two_position(bVar.a().getGame().getSp_tpl_two_position());
                gameInfo.setGame_id(bVar.a().getGame().getGame_id());
                gameInfo.setGame_info_tpl_type(bVar.a().getGame().getGame_info_tpl_type());
                com.join.mgps.Util.j0.I0(context, gameInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements AdapterView.OnItemLongClickListener {
        t() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = ForumProfileFavoritesActivity.this.f30968h;
            if (forumProfileFavoritesAdapter == null) {
                return false;
            }
            if (forumProfileFavoritesAdapter.getItemViewType(i4) == ForumProfileFavoritesAdapter.ViewType.GAME_ITEM.ordinal()) {
                ForumProfileFavoritesAdapter.k0.b bVar = (ForumProfileFavoritesAdapter.k0.b) ForumProfileFavoritesActivity.this.f30968h.getItem(i4);
                if (bVar.a() == null || bVar.a().getGame() == null) {
                    return true;
                }
                ForumProfileFavoritesActivity.this.l1(bVar.a().getGame().getGame_id());
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements w1.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31011a;

        u(String str) {
            this.f31011a = str;
        }

        @Override // w1.d
        public void a(Dialog dialog) {
            dialog.dismiss();
        }

        @Override // w1.d
        public void b(Dialog dialog) {
            ForumProfileFavoritesActivity.this.B.dismiss();
            ForumProfileFavoritesActivity.this.l0(1, this.f31011a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31013b;

        v(String str) {
            this.f31013b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileFavoritesActivity.this.B.dismiss();
            ForumProfileFavoritesActivity.this.l0(1, this.f31013b);
        }
    }

    private void E0() {
        D0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        m0(0);
        B0();
        if (com.join.android.app.common.utils.j.j(this)) {
            E0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        m0(17);
    }

    private void Q0() {
        String str = this.O;
        String str2 = this.P;
        this.J.setVisibility(0);
        this.J.setScaleType(ImageView.ScaleType.FIT_XY);
        MyImageLoader.h(this.J, str2);
        LinearLayout linearLayout = this.L;
        if (this.M == null) {
            MediaController mediaController = new MediaController(this);
            this.M = mediaController;
            mediaController.q();
            this.M.hide();
            this.M.setVisibility(8);
        }
        if (this.I.isPlaying()) {
            MyVideoView myVideoView = this.I;
            if (myVideoView != null) {
                myVideoView.I();
                linearLayout.setVisibility(8);
            }
            MediaController mediaController2 = this.M;
            if (mediaController2 != null) {
                mediaController2.setVisibility(8);
            }
        }
        this.I.setVisibility(0);
        this.M.setAnchorView(this.I);
        this.M.setMediaPlayer(this.I);
        this.I.setMediaController(this.M);
        this.I.requestFocus();
        linearLayout.setVisibility(0);
        if (this.I.E() && !this.I.isPlaying()) {
            resume();
            com.join.mgps.Util.w0.e("play a last video ...");
        } else {
            this.I.setVideoPath(str);
            com.join.mgps.Util.w0.e("play a new video ...");
        }
        this.I.setOnCompletionListener(new h());
        this.I.setOnPreparedListener(new i());
        this.I.setOnErrorListener(new j());
        this.I.setScreenChangedListener(new l());
        this.K.setOnClickListener(new m());
    }

    private void U0() {
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.X;
            if (list == null || i4 >= list.size()) {
                return;
            }
            K0(p1.f.K().F(this.X.get(i4).getCrc_link_type_val()), 4);
            i4++;
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void c1(ForumBean.ForumPostsBean forumPostsBean) {
        boolean z4;
        String message;
        if (com.join.mgps.Util.g2.h(forumPostsBean.getSubject()) || com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim())) {
            z4 = false;
        } else {
            ForumProfileFavoritesAdapter.ViewType viewType = ForumProfileFavoritesAdapter.ViewType.P_SUBJECT;
            boolean z5 = forumPostsBean.getBest() > 0;
            String subject = forumPostsBean.getSubject();
            int pid = forumPostsBean.getPid();
            int fid = forumPostsBean.getFid();
            boolean z6 = forumPostsBean.getHelp() > 0;
            this.f30967g.add(new ForumProfileFavoritesAdapter.k0(viewType, new ForumProfileFavoritesAdapter.k0.f(false, z5, subject, pid, fid, z6, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info(), forumPostsBean.getTags(), forumPostsBean.getFname())));
            z4 = true;
        }
        if (!z4) {
            ForumProfileFavoritesAdapter.ViewType viewType2 = ForumProfileFavoritesAdapter.ViewType.P_SUBJECT;
            boolean z7 = forumPostsBean.getBest() > 0;
            String message2 = forumPostsBean.getMessage();
            int pid2 = forumPostsBean.getPid();
            boolean z8 = forumPostsBean.getHelp() > 0;
            this.f30967g.add(new ForumProfileFavoritesAdapter.k0(viewType2, new ForumProfileFavoritesAdapter.k0.f(false, z7, message2, pid2, 0, z8, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info(), forumPostsBean.getTags(), forumPostsBean.getFname())));
        } else {
            boolean z9 = forumPostsBean.getSubject() == null || com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim());
            if (!com.join.mgps.Util.g2.h(forumPostsBean.getMessage()) && !com.join.mgps.Util.g2.h(forumPostsBean.getMessage().trim())) {
                String message3 = forumPostsBean.getMessage();
                boolean z10 = forumPostsBean.getHelp() > 0;
                SpannableStringBuilder m02 = com.join.mgps.Util.j0.m0(this, message3, z9, z10, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info());
                boolean z11 = z9 && forumPostsBean.getBest() > 0;
                String message4 = forumPostsBean.getMessage();
                int pid3 = forumPostsBean.getPid();
                boolean z12 = z9 && forumPostsBean.getHelp() > 0;
                ForumProfileFavoritesAdapter.k0.e eVar = new ForumProfileFavoritesAdapter.k0.e(false, z11, message4, pid3, 0, z12, forumPostsBean.getHelp_money() + "", z9 ? forumPostsBean.getTag_info() : null, z9, m02);
                this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_MESSAGE, eVar));
                this.f30968h.j().e(eVar);
            }
        }
        boolean z13 = (forumPostsBean.getRelation_game() == null || TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id())) ? false : true;
        if (!z13) {
            List<ForumBean.ForumPostsBean.ResBean> rs_list = forumPostsBean.getRs_list();
            ArrayList arrayList = new ArrayList();
            boolean isAttach_video = forumPostsBean.isAttach_video();
            String str = "";
            String str2 = str;
            for (int i4 = 0; rs_list != null && i4 < rs_list.size(); i4++) {
                ForumBean.ForumPostsBean.ResBean resBean = rs_list.get(i4);
                if (resBean.getType().equals("pic")) {
                    arrayList.add(resBean.getRaw());
                } else if (resBean.getType().equals("video") && com.join.mgps.Util.g2.h(str2)) {
                    str = resBean.getThumb();
                    str2 = resBean.getRaw();
                }
            }
            if (com.join.mgps.Util.g2.i(forumPostsBean.getSubject())) {
                message = forumPostsBean.getSubject();
            } else {
                message = com.join.mgps.Util.g2.i(forumPostsBean.getMessage()) ? forumPostsBean.getMessage() : "";
            }
            if (isAttach_video) {
                this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_VIDEO, new ForumProfileFavoritesAdapter.k0.g(str, str2, message)));
            } else if (rs_list != null && rs_list.size() != 0) {
                this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_IMGS, new ForumProfileFavoritesAdapter.k0.d(rs_list, arrayList, forumPostsBean.getPid())));
            }
        }
        if (z13) {
            S0(forumPostsBean.getRelation_game());
            ForumProfileFavoritesAdapter.ViewType viewType3 = ForumProfileFavoritesAdapter.ViewType.POST_GAME;
            this.f30967g.add(new ForumProfileFavoritesAdapter.k0(viewType3, new ForumProfileFavoritesAdapter.k0.i(true, forumPostsBean.getPid() + "", forumPostsBean.getRelation_game())));
        }
        this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_FOOTER, new ForumProfileFavoritesAdapter.k0.c(1, forumPostsBean.getAvatar_src(), forumPostsBean.getLast_comment_time(), forumPostsBean.getNickname(), forumPostsBean.getPraise(), forumPostsBean.getCommit(), forumPostsBean.getPid(), forumPostsBean.getView(), forumPostsBean.is_praise(), forumPostsBean.getUid())));
    }

    private void d1(ForumBean.ForumPostsBean forumPostsBean) {
        String str = "";
        if (forumPostsBean.getSubject() != null && !com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim())) {
            ForumProfileFavoritesAdapter.ViewType viewType = ForumProfileFavoritesAdapter.ViewType.POST_SUBJECT;
            boolean z4 = forumPostsBean.getBest() > 0;
            String subject = forumPostsBean.getSubject();
            int pid = forumPostsBean.getPid();
            int fid = forumPostsBean.getFid();
            boolean z5 = forumPostsBean.getHelp() > 0;
            this.f30967g.add(new ForumProfileFavoritesAdapter.k0(viewType, new ForumProfileFavoritesAdapter.k0.m(z4, subject, pid, fid, z5, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info())));
        }
        boolean z6 = forumPostsBean.getSubject() == null || com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim());
        if (!com.join.mgps.Util.g2.h(forumPostsBean.getMessage()) && !com.join.mgps.Util.g2.h(forumPostsBean.getMessage().trim())) {
            String message = forumPostsBean.getMessage();
            boolean z7 = forumPostsBean.getHelp() > 0;
            SpannableStringBuilder m02 = com.join.mgps.Util.j0.m0(this, message, z6, z7, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info());
            boolean z8 = z6 && forumPostsBean.getBest() > 0;
            String message2 = forumPostsBean.getMessage();
            int pid2 = forumPostsBean.getPid();
            int fid2 = forumPostsBean.getFid();
            boolean z9 = z6 && forumPostsBean.getHelp() > 0;
            ForumProfileFavoritesAdapter.k0.l lVar = new ForumProfileFavoritesAdapter.k0.l(z8, message2, pid2, fid2, z9, forumPostsBean.getHelp_money() + "", z6 ? forumPostsBean.getTag_info() : null, m02);
            this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_MESSAGE, lVar));
            this.f30968h.j().e(lVar);
        }
        List<ForumBean.ForumPostsBean.ResBean> rs_list = forumPostsBean.getRs_list();
        ArrayList arrayList = new ArrayList();
        boolean isAttach_video = forumPostsBean.isAttach_video();
        String str2 = "";
        String str3 = str2;
        for (int i4 = 0; rs_list != null && i4 < rs_list.size(); i4++) {
            ForumBean.ForumPostsBean.ResBean resBean = rs_list.get(i4);
            if (resBean.getType().equals("pic")) {
                arrayList.add(resBean.getRaw());
            } else if (resBean.getType().equals("video") && com.join.mgps.Util.g2.h(str3)) {
                str2 = resBean.getThumb();
                str3 = resBean.getRaw();
            }
        }
        if (com.join.mgps.Util.g2.i(forumPostsBean.getSubject())) {
            str = forumPostsBean.getSubject();
        } else if (com.join.mgps.Util.g2.i(forumPostsBean.getMessage())) {
            str = forumPostsBean.getMessage();
        }
        if (isAttach_video) {
            this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_VIDEO_THUMBNAIL, new ForumProfileFavoritesAdapter.k0.o(str2, str3, str)));
        } else if (rs_list != null && rs_list.size() != 0) {
            this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_IMAGE_THUMBNAIL, new ForumProfileFavoritesAdapter.k0.k(rs_list, arrayList, forumPostsBean.getPid())));
        }
        this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_FOOTER, new ForumProfileFavoritesAdapter.k0.h(forumPostsBean.getPid(), forumPostsBean.getFid(), forumPostsBean.getFname(), forumPostsBean.getView(), forumPostsBean.getCommit(), forumPostsBean.getPraise(), forumPostsBean.is_praise(), false)));
    }

    private void e1(List<ForumData.ForumUserFavoritesData> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ForumData.ForumUserFavoritesData forumUserFavoritesData = list.get(i4);
            if (forumUserFavoritesData.getType() == 1) {
                Z0(forumUserFavoritesData);
                b1(forumUserFavoritesData);
            } else if (forumUserFavoritesData.getType() == 2) {
                ForumBean.ForumPostsBean post = forumUserFavoritesData.getPost();
                if (post.is_favorite()) {
                    Z0(forumUserFavoritesData);
                    c1(post);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void k1(int i4) {
        if (this.f30972l == null) {
            com.join.mgps.dialog.v0 v0Var = new com.join.mgps.dialog.v0(this);
            this.f30972l = v0Var;
            v0Var.f("确定");
            this.f30972l.d("取消");
            this.f30972l.b(8);
            this.f30972l.g("确定要删除该帖吗？").c(new a());
        }
        this.f30972l.e(new b(i4));
        if (this.f30972l.isShowing()) {
            return;
        }
        this.f30972l.show();
    }

    private void m1() {
        this.f30962b.setVisibility(0);
        this.f30970j.setVisibility(0);
    }

    private void q0() {
        com.join.mgps.customview.o oVar = this.V;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.V.dismiss();
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.X.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.Y.remove(next.getCrc_link_type_val());
                it2.remove();
                q1(downloadTask, 2);
                break;
            }
        }
        this.f30969i.requestLayout();
        H0();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.Y;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            q1(downloadTask, 3);
            H0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.X, downloadTask);
        Map<String, DownloadTask> map = this.Y;
        if (map != null) {
            if (map.containsKey(downloadTask.getCrc_link_type_val())) {
                this.Y.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
            } else {
                this.X.add(downloadTask);
                this.Y.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        q1(downloadTask, 0);
        H0();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.Y;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.X.add(downloadTask);
            this.Y.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        q1(downloadTask, 1);
        DownloadTask downloadTask2 = this.Y.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f30969i.requestLayout();
        H0();
    }

    private void updateProgressPartly() {
        XListView2 xListView2 = this.f30969i;
        if (this.f30968h == null) {
            return;
        }
        for (int i4 = this.f30985v1; i4 <= this.f30978p1; i4++) {
            if (this.f30968h.getItemViewType(i4) == ForumProfileFavoritesAdapter.ViewType.GAME_ITEM.ordinal()) {
                ForumProfileFavoritesAdapter.k0.b bVar = (ForumProfileFavoritesAdapter.k0.b) this.f30968h.getItem(i4);
                if (bVar.a() != null && bVar.a().getGame() != null) {
                    DownloadTask downloadTask = bVar.a().getDownloadTask();
                    bVar.a().getGame().getGame_id();
                    if (downloadTask != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                        View childAt = xListView2.getChildAt(i4 - this.f30985v1);
                        if (childAt.getTag() instanceof ForumProfileFavoritesAdapter.w) {
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                            r1((ForumProfileFavoritesAdapter.w) childAt.getTag(), downloadTask, f5);
                            q1(f5, 4);
                        }
                    }
                }
            }
        }
    }

    private void w0() {
        this.f30962b.setVisibility(8);
        this.f30970j.setVisibility(8);
    }

    private void z0() {
        this.f30964d.setText("我的收藏");
        this.f30966f = new ArrayList();
        this.f30969i.requestFocus();
        this.f30969i.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f30969i.setPullLoadEnable(new p());
        this.f30969i.setPullRefreshEnable(new q());
        this.f30967g = new ArrayList();
        this.f30989z = new com.join.android.app.component.video.c(this, D1);
        ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = new ForumProfileFavoritesAdapter(this, this.f30989z);
        this.f30968h = forumProfileFavoritesAdapter;
        forumProfileFavoritesAdapter.M(this.f30974n);
        this.f30969i.setAdapter((ListAdapter) this.f30968h);
        this.f30969i.setOnScrollListener(this);
        this.f30969i.setOnTouchListener(new r());
        this.f30969i.setOnItemClickListener(new s());
        this.f30969i.setOnItemLongClickListener(new t());
    }

    boolean A0() {
        if (this.F == -1) {
            return false;
        }
        int firstVisiblePosition = this.f30969i.getFirstVisiblePosition();
        int lastVisiblePosition = this.f30969i.getLastVisiblePosition();
        int i4 = this.F;
        return i4 >= firstVisiblePosition - 0 && i4 <= lastVisiblePosition;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B0() {
        C0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void C0() {
        try {
            ForumTable o4 = b2.t.p().o(ForumBean.ForumEvent.MyProfileFavorites);
            if (com.join.mgps.Util.g2.h(o4.getArgs1())) {
                m0(18);
                return;
            }
            ForumData.ForumUserFavoritesDatas J = com.join.mgps.Util.j0.J(o4.getArgs1());
            List<ForumData.ForumUserFavoritesData> favorites_list = J != null ? J.getFavorites_list() : null;
            if (favorites_list != null && favorites_list.size() != 0) {
                int ceil = (int) Math.ceil((favorites_list.size() * 1.0f) / com.join.mgps.Util.j0.f27864d);
                this.f30976p = ceil;
                T0(favorites_list, ceil);
                m0(32);
                return;
            }
            m0(18);
        } catch (Exception e5) {
            m0(18);
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        if (r12.f30979q != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
        if (r12.f30979q == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
        r12.f30979q = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00af, code lost:
        o1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D0(int r13) {
        /*
            r12 = this;
            java.lang.String r5 = ""
            boolean r0 = com.join.android.app.common.utils.j.j(r12)
            r8 = 0
            r9 = -1
            if (r0 == 0) goto Lbd
            int r0 = r12.f30979q
            if (r13 != r0) goto Lf
            return
        Lf:
            if (r0 != r9) goto L14
            r12.o1()
        L14:
            r12.f30979q = r13
            r10 = 24
            r11 = 1
            if (r13 <= r11) goto L25
            r12.j1()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            goto L25
        L1f:
            r13 = move-exception
            goto Lb3
        L22:
            r13 = move-exception
            goto La3
        L25:
            com.join.mgps.Util.RequestBeanUtil.getInstance(r12)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L2e
            java.lang.String r0 = com.join.mgps.Util.RequestBeanUtil.getVersionAndVersionName()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L2e
            r6 = r0
            goto L33
        L2e:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            r6 = r5
        L33:
            com.wufan.user.service.protobuf.n0 r0 = com.join.mgps.Util.j0.T(r12)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            boolean r1 = com.join.mgps.Util.j0.Y0(r12)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r1 == 0) goto L9b
            com.join.mgps.rpc.i r1 = r12.f30971k     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            int r2 = r0.getUid()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            java.lang.String r3 = r0.getToken()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            int r4 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            r7 = 2
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r13
            com.join.mgps.dto.ForumResponse r0 = r0.y(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r0 == 0) goto L93
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            com.join.mgps.dto.ForumData$ForumUserFavoritesDatas r0 = (com.join.mgps.dto.ForumData.ForumUserFavoritesDatas) r0     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r13 != r11) goto L5f
            com.join.mgps.Util.j0.s1(r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
        L5f:
            if (r0 == 0) goto L89
            java.util.List r0 = r0.getFavorites_list()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r0 == 0) goto L73
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r1 == 0) goto L73
            r12.f30976p = r13     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            r12.T0(r0, r13)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            goto L75
        L73:
            r12.f30979q = r9     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
        L75:
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r0 != 0) goto L83
            if (r13 != r11) goto L83
            r13 = 20
            r12.m0(r13)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            goto L9e
        L83:
            r13 = 32
            r12.m0(r13)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            goto L9e
        L89:
            int r13 = r12.f30979q
            if (r13 == r9) goto L8f
            r12.f30979q = r8
        L8f:
            r12.o1()
            return
        L93:
            r12.f30979q = r8     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            r12.f30979q = r8
            r12.o1()
            return
        L9b:
            r12.m0(r10)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
        L9e:
            int r13 = r12.f30979q
            if (r13 == r9) goto Laf
            goto Lad
        La3:
            r12.m0(r10)     // Catch: java.lang.Throwable -> L1f
            r13.printStackTrace()     // Catch: java.lang.Throwable -> L1f
            int r13 = r12.f30979q
            if (r13 == r9) goto Laf
        Lad:
            r12.f30979q = r8
        Laf:
            r12.o1()
            goto Ld5
        Lb3:
            int r0 = r12.f30979q
            if (r0 == r9) goto Lb9
            r12.f30979q = r8
        Lb9:
            r12.o1()
            throw r13
        Lbd:
            int r13 = r12.f30979q
            if (r13 == r9) goto Lc3
            r12.f30979q = r8
        Lc3:
            r13 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r13 = r12.getString(r13)
            r12.showToast(r13)
            r13 = 17
            r12.m0(r13)
            r12.o1()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumProfileFavoritesActivity.D0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        this.f30968h.P(this.f30967g);
        this.f30968h.notifyDataSetChanged();
    }

    synchronized void H0() {
        if (this.f30967g == null) {
            this.f30967g = new ArrayList();
        }
        this.f30967g.clear();
        e1(this.f30966f);
        G0();
        List<ForumData.ForumUserFavoritesData> list = this.f30966f;
        if (list == null || list.size() == 0) {
            this.f30988y = 0;
            this.f30965e.m();
            m0(22);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0(int i4, boolean z4) {
        if (z4) {
            List<ForumData.ForumUserFavoritesData> list = this.f30966f;
            if (list != null && list.size() != 0) {
                Iterator<ForumData.ForumUserFavoritesData> it2 = this.f30966f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ForumData.ForumUserFavoritesData next = it2.next();
                    if (next.getType() == 2 && next.getPost() != null && next.getPost().getPid() == i4) {
                        this.f30966f.remove(next);
                        o1();
                        H0();
                        break;
                    }
                }
            }
            ForumData.ForumUserFavoritesData forumUserFavoritesData = new ForumData.ForumUserFavoritesData();
            forumUserFavoritesData.setType(2);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            forumUserFavoritesData.setPost(forumPostsBean);
            com.join.mgps.Util.j0.h1(forumUserFavoritesData);
            com.join.mgps.Util.l2.a(this).b("删除成功");
            return;
        }
        com.join.mgps.Util.l2.a(this).b("删除失败");
    }

    void J0() {
        int i4 = this.F;
        if (i4 == -1) {
            return;
        }
        int firstVisiblePosition = this.f30969i.getFirstVisiblePosition();
        int lastVisiblePosition = this.f30969i.getLastVisiblePosition();
        int i5 = this.F;
        if (i5 >= firstVisiblePosition + 0 && i5 <= lastVisiblePosition) {
            P0(false);
            i4 = (this.F - firstVisiblePosition) + 0;
        } else {
            P0(true);
        }
        View childAt = this.f30969i.getChildAt(i4);
        if (childAt != null) {
            int bottom = this.f30962b.getBottom();
            this.f30969i.getTop();
            int top = childAt.getTop();
            Bundle bundle = new Bundle();
            bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_TRANSLATE_Y.name());
            bundle.putStringArray("key_mediacmd_params", new String[]{bottom + "", top + ""});
            callbackPlayVideo(bundle);
        }
    }

    void K0(DownloadTask downloadTask, int i4) {
        ForumBean.ForumPostsBean post;
        boolean z4 = false;
        for (int i5 = 0; i5 < this.f30966f.size(); i5++) {
            ForumData.ForumUserFavoritesData forumUserFavoritesData = this.f30966f.get(i5);
            if (forumUserFavoritesData.getType() == 1) {
                CollectionBeanSub game = forumUserFavoritesData.getGame();
                if (game != null && !TextUtils.isEmpty(game.getGame_id()) && game.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    forumUserFavoritesData.setDownloadTask(downloadTask);
                    z4 |= true;
                }
            } else {
                if (forumUserFavoritesData.getType() == 2 && (post = forumUserFavoritesData.getPost()) != null && post.getRelation_game() != null && !TextUtils.isEmpty(post.getRelation_game().getGame_id()) && post.getRelation_game().getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    post.getRelation_game().setDownloadTask(downloadTask);
                    z4 |= true;
                }
            }
        }
        if (z4) {
            H0();
        }
    }

    void L0(int i4, int i5) {
        if (getResources().getConfiguration().orientation == 2) {
            ViewCompat.setTranslationY(this.G, -this.G.getTop());
            return;
        }
        this.S = i4;
        this.T = i5;
        com.join.mgps.Util.w0.e("offsetContainer", "mTop=" + this.S, "mOffsetY=" + this.T);
        ViewCompat.setTranslationY(this.G, (float) this.T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void M0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = this.f30968h;
        if (forumProfileFavoritesAdapter != null) {
            forumProfileFavoritesAdapter.notifyDataSetChanged();
        }
    }

    void N0() {
        MyVideoView myVideoView = this.I;
        if (myVideoView.isPlaying() && (myVideoView != null)) {
            this.I.pause();
            this.K.setVisibility(0);
        }
    }

    void O0(String str, String str2) {
        String str3 = this.O;
        if (str3 != null && str3.equals(str) && this.I.isPlaying()) {
            N0();
            return;
        }
        MyVideoView myVideoView = this.I;
        if (myVideoView != null) {
            if (myVideoView.E() && this.O.equals(str)) {
                this.I.seekTo(0);
                resume();
            } else {
                this.I.G();
            }
        }
        this.O = str;
        this.P = str2;
        if (com.join.mgps.Util.g2.h(str)) {
            n1();
            return;
        }
        this.J.setVisibility(8);
        this.K.setVisibility(8);
        Q0();
    }

    void P0(boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_PLAY_BACKGROUND.name());
        bundle.putStringArray("key_mediacmd_params", new String[]{String.valueOf(z4)});
        callbackPlayVideo(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void R0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this, i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f30971k.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                X0(i4);
                i1();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void S0(ForumBean.GameInfo gameInfo) {
        if (gameInfo != null) {
            try {
                DownloadTask F = p1.f.K().F(gameInfo.getGame_id());
                gameInfo.setDownloadTask(F);
                Map<String, DownloadTask> map = this.Y;
                if (map == null || F == null || map.containsKey(F.getCrc_link_type_val())) {
                    return;
                }
                this.X.add(F);
                this.Y.put(F.getCrc_link_type_val(), F);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T0(List<ForumData.ForumUserFavoritesData> list, int i4) {
        if (list != null && list.size() != 0) {
            if (i4 == 1) {
                this.f30966f.clear();
                this.f30976p = 1;
                o1();
            }
            this.f30966f.addAll(list);
        }
        o1();
        H0();
    }

    void V0() {
        if (this.R) {
            this.G.setVisibility(0);
        } else {
            this.G.setVisibility(8);
        }
    }

    void W0(Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(ForumPostsTagSelectActivity_.f30896z, 0);
        int intExtra2 = intent.getIntExtra("view", 0);
        int intExtra3 = intent.getIntExtra("comment", 0);
        int intExtra4 = intent.getIntExtra("praise", 0);
        boolean booleanExtra = intent.getBooleanExtra("isPraise", false);
        boolean booleanExtra2 = intent.getBooleanExtra("isFavorite", true);
        if (intExtra == 0) {
            return;
        }
        for (ForumData.ForumUserFavoritesData forumUserFavoritesData : this.f30966f) {
            if (forumUserFavoritesData.getType() == 2 && forumUserFavoritesData.getPost() != null) {
                ForumBean.ForumPostsBean post = forumUserFavoritesData.getPost();
                if (post.getPid() == intExtra) {
                    post.setView(intExtra2);
                    post.setCommit(intExtra3);
                    post.setPraise(intExtra4);
                    post.setIs_praise(booleanExtra);
                    if (!booleanExtra2) {
                        this.f30966f.remove(post);
                    }
                    H0();
                    return;
                }
            }
        }
    }

    void X0(int i4) {
        List<ForumData.ForumUserFavoritesData> list = this.f30966f;
        if (list == null || list.size() == 0) {
            return;
        }
        for (ForumData.ForumUserFavoritesData forumUserFavoritesData : this.f30966f) {
            if (forumUserFavoritesData.getType() == 2) {
                ForumBean.ForumPostsBean post = forumUserFavoritesData.getPost();
                if (post == null) {
                    return;
                }
                if (post.getPid() == i4) {
                    post.setPraise(post.is_praise() ? post.getPraise() - 1 : post.getPraise() + 1);
                    post.setIs_praise(!post.is_praise());
                    H0();
                    return;
                }
            }
        }
    }

    RelativeLayout.LayoutParams Y0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.G.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.G.setPadding(0, 0, 0, 0);
        }
        RelativeLayout relativeLayout = this.H;
        if (relativeLayout == null) {
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
        }
        this.G.setTop(0);
        return layoutParams;
    }

    void Z0(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
        if (forumUserFavoritesData == null) {
            return;
        }
        this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.FAVORITE_ITEM_HEADER, new ForumProfileFavoritesAdapter.k0.a(false, forumUserFavoritesData.getType(), forumUserFavoritesData.getFav_time())));
    }

    void a1(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
        if (forumUserFavoritesData == null || forumUserFavoritesData.getGame() == null || TextUtils.isEmpty(forumUserFavoritesData.getGame().getGame_id())) {
            return;
        }
        try {
            DownloadTask F = p1.f.K().F(forumUserFavoritesData.getGame().getGame_id());
            forumUserFavoritesData.setDownloadTask(F);
            Map<String, DownloadTask> map = this.Y;
            if (map == null || F == null || map.containsKey(F.getCrc_link_type_val())) {
                return;
            }
            this.X.add(F);
            this.Y.put(F.getCrc_link_type_val(), F);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30971k = com.join.mgps.rpc.impl.g.A0();
        this.A = com.join.mgps.rpc.impl.d.P1();
        try {
            x0();
            z0();
            F0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void b1(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
        a1(forumUserFavoritesData);
        this.f30967g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.GAME_ITEM, new ForumProfileFavoritesAdapter.k0.b(forumUserFavoritesData)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    public void callbackPlayVideo(Bundle bundle) {
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
                    if (parseInt == this.N) {
                        return;
                    }
                    n1();
                    this.N = parseInt;
                } else if (i4 == 1) {
                    str = str3;
                } else if (i4 == 2) {
                    str2 = str3;
                }
            }
            com.join.mgps.Util.w0.e("CMD_PLAY", "videoUrl=" + str, "coverUrl=" + str2);
            this.G.setVisibility(0);
            this.R = true;
            f1();
            O0(str, str2);
        } else if (string.equals(MediaCmd.CMD_PLAY_BACKGROUND.name())) {
            if (this.N == -1) {
                return;
            }
            if (Boolean.parseBoolean((String) objArr[0])) {
                this.G.setVisibility(8);
                this.R = false;
                n1();
            } else if (this.N != -1) {
                this.G.setVisibility(0);
                this.R = true;
            }
        } else if (string.equals(MediaCmd.CMD_PAUSE.name())) {
            N0();
        } else if (string.equals(MediaCmd.CMD_STOP.name())) {
            n1();
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
            s0();
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
            L0(parseInt2, parseInt3);
        }
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.Z
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.Z
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f30977p0
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f30977p0
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f30977p0
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.Z
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.Z
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f30977p0
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f30977p0
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumProfileFavoritesActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    void f1() {
        RelativeLayout relativeLayout = this.H;
        if (relativeLayout == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = v0(this);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.G.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mg_forum_post_item_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_top);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_bottom);
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            this.G.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
        }
        this.H.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1() {
        this.f30969i.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.Z.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f30977p0.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    void h1(ForumBean.ForumPostsBean forumPostsBean) {
        if (forumPostsBean == null) {
            return;
        }
        if (this.E == null) {
            this.E = findViewById(R.id.bottom);
        }
        if (this.D == null) {
            this.D = com.join.mgps.customview.c.z(this);
        }
        this.D.m(this.C);
        com.join.mgps.customview.b bVar = this.D;
        if (bVar == null || bVar.isShowing()) {
            return;
        }
        this.D.p(this.E, forumPostsBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i1() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(int i4, String str) {
        String str2;
        if (com.join.android.app.common.utils.j.j(this)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                str2 = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str2 = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str2);
            requestdetialFolowAndBeSpeak.setGame_id(str);
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(accountData.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.A.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.A.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.A.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.A.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                s1(resultMainBean, i4, str);
                return;
            } else {
                com.join.mgps.Util.l2.a(this).b(getString(R.string.game_unfollow_failed));
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b(getString(R.string.network_conn_failed));
    }

    void l1(String str) {
        if (this.B == null) {
            this.B = com.join.mgps.Util.b0.f0(this).d(this, "取消收藏", "确定要取消收藏吗？", "取消", "确定", new u(str));
        }
        ((Button) this.B.findViewById(R.id.dialog_button_ok)).setOnClickListener(new v(str));
        Dialog dialog = this.B;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.B.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(int i4) {
        int i5 = this.f30988y;
        if (i5 == 32) {
            return;
        }
        if (i4 == 32) {
            this.f30988y = 32;
            this.f30965e.j(2);
        } else if (i4 == 0) {
            this.f30988y = 0;
            this.f30965e.m();
            this.f30965e.j(1);
        } else {
            this.f30988y = i4 | i5;
            if (n0(-11)) {
                this.f30988y = 16;
                this.f30965e.setFailedMsg("网络连接失败，再试试吧~");
                ForumLoadingView forumLoadingView = this.f30965e;
                forumLoadingView.setListener(new c(forumLoadingView));
                this.f30965e.j(9);
            } else if (n0(22)) {
                this.f30988y = 16;
                this.f30965e.setFailedMsg("还没有收藏内容~");
                ForumLoadingView forumLoadingView2 = this.f30965e;
                forumLoadingView2.setListener(new d(forumLoadingView2));
                this.f30965e.j(10);
                this.f30965e.setReloadingVisibility(0);
                this.f30965e.setFailedReloadingRes(R.drawable.papa_loading_null);
            } else if (!n0(31) && !n0(26)) {
                if (n0(17)) {
                    this.f30988y = 16;
                    this.f30965e.setFailedMsg("网络连接失败，再试试吧~");
                    ForumLoadingView forumLoadingView3 = this.f30965e;
                    forumLoadingView3.setListener(new f(forumLoadingView3));
                    this.f30965e.j(9);
                }
            } else {
                this.f30988y = 16;
                this.f30965e.setFailedMsg("加载失败，再试试吧~");
                ForumLoadingView forumLoadingView4 = this.f30965e;
                forumLoadingView4.setListener(new e(forumLoadingView4));
                this.f30965e.j(16);
            }
        }
    }

    boolean n0(int i4) {
        return (this.f30988y & i4) == i4;
    }

    void n1() {
        MyVideoView myVideoView = this.I;
        if (myVideoView != null) {
            myVideoView.seekTo(0);
            this.I.I();
            this.N = -1;
            this.I.G();
            this.L.setVisibility(8);
            MediaController mediaController = this.M;
            if (mediaController != null) {
                mediaController.setVisibility(8);
            }
            this.K.setVisibility(0);
            if (getResources().getConfiguration().orientation == 1) {
                this.G.setVisibility(8);
                this.R = false;
                return;
            }
            p1();
        }
    }

    void o0() {
        if (this.f30967g == null) {
            return;
        }
        System.gc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o1() {
        if (this.f30969i.j()) {
            this.f30975o.sendEmptyMessageDelayed(0, 2000L);
        } else {
            this.f30975o.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i5 == 3) {
            W0(intent);
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u1(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.android.app.component.video.c cVar = this.f30989z;
        if (cVar != null) {
            cVar.G();
        }
        com.join.mgps.Util.d0.a().e(this);
        o0();
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
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
                    Map<String, DownloadTask> map = this.Y;
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

    @Override // com.BaseAppCompatActivity
    public void onFavoriteChanged(int i4, boolean z4) {
        super.onFavoriteChanged(i4, z4);
        I0(i4, !z4);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getRepeatCount() == 0 && getResources().getConfiguration().orientation == 2) {
            this.Q = true;
            p1();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        n1();
        com.join.android.app.component.video.c cVar = this.f30989z;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        com.join.android.app.component.video.c cVar = this.f30989z;
        if (cVar != null) {
            cVar.I();
        }
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f30978p1 = (i4 + i5) - 1;
        this.f30985v1 = i4;
        v1(absListView, i4, i5, i6);
        this.f30989z.f(absListView, i4, i5, i6);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        w1(absListView, i4);
        this.f30989z.j(absListView, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(Context context, int i4) {
        try {
            if (com.join.mgps.Util.j0.c0(context, i4) != null) {
                ForumResponse<ForumData.ForumPostsDeleteData> q02 = this.f30971k.q0(com.join.mgps.Util.j0.c0(context, i4).getParams());
                ForumData.ForumPostsDeleteData data = q02 != null ? q02.getData() : null;
                I0(i4, data != null && data.isResult());
            }
        } catch (Exception unused) {
            I0(i4, false);
        }
    }

    void p1() {
        MyVideoView myVideoView = this.I;
        if (myVideoView != null) {
            myVideoView.setFullScreen(!this.Q);
        }
    }

    void q1(DownloadTask downloadTask, int i4) {
        com.join.mgps.Util.w0.e(D1, "event=" + i4, "downloadTask=" + downloadTask.toString());
        ForumData.ForumUserFavoritesData u02 = u0(downloadTask.getCrc_link_type_val());
        if (u02 == null) {
            return;
        }
        if (i4 == 0 || i4 == 1) {
            u02.setDownloadTask(downloadTask);
        } else if (i4 == 2) {
            u02.setDownloadTask(null);
        } else if (i4 == 3 || i4 == 4) {
            u02.setDownloadTask(downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.B1 == 1) {
                return;
            }
            try {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                    ResultMainBean<List<DetailResultBean>> R = this.A1.R(RequestBeanUtil.getInstance(this).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                    if (R != null && R.getFlag() != 0) {
                        List<DetailResultBean> data = R.getMessages().getData();
                        if (data.size() != 0) {
                            DetailResultBean detailResultBean = data.get(0);
                            if (this.C1) {
                                startDown(detailResultBean);
                            }
                        }
                    } else if (R != null && R.getFlag() != 0) {
                        showToast("获取游戏信息失败");
                    } else {
                        showToast("获取游戏信息失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showToast("获取游戏信息失败");
                }
                return;
            } finally {
                this.B1 = 0;
                this.C1 = false;
            }
        }
        showToast("获取游戏信息失败");
    }

    void r1(ForumProfileFavoritesAdapter.w wVar, DownloadTask downloadTask, DownloadTask downloadTask2) {
        if (downloadTask2 == null) {
            return;
        }
        try {
            long parseDouble = (long) (Double.parseDouble(downloadTask2.getShowSize()) * 1024.0d * 1024.0d);
            if (downloadTask.getSize() == 0) {
                TextView textView = wVar.f41559j;
                textView.setText(UtilsMy.a(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
            } else {
                TextView textView2 = wVar.f41559j;
                textView2.setText(UtilsMy.a(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
            }
            if (downloadTask.getStatus() == 12) {
                wVar.f41562m.setProgress((int) downloadTask2.getProgress());
            } else {
                wVar.f41561l.setProgress((int) downloadTask2.getProgress());
            }
            if (downloadTask.getStatus() == 2) {
                TextView textView3 = wVar.f41560k;
                textView3.setText(downloadTask2.getSpeed() + "/S");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void resume() {
        MyVideoView myVideoView = this.I;
        if (myVideoView.E() & (myVideoView != null)) {
            this.L.setVisibility(8);
            this.J.setVisibility(8);
            this.K.setVisibility(8);
            this.I.start();
            MediaController mediaController = this.M;
            if (mediaController != null) {
                mediaController.setVisibility(8);
                return;
            }
            return;
        }
        Q0();
    }

    void s0() {
        if (getResources().getConfiguration().orientation == 2) {
            this.Q = false;
            m1();
            f1();
            L0(0, 0);
            return;
        }
        this.Q = true;
        w0();
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s1(ResultMainBean resultMainBean, int i4, String str) {
        if (i4 != 1) {
            return;
        }
        if (resultMainBean.getFlag() == 1) {
            ForumData.ForumUserFavoritesData u02 = u0(str);
            List<ForumData.ForumUserFavoritesData> list = this.f30966f;
            if (list != null && list.contains(u02)) {
                this.f30966f.remove(u02);
                com.join.mgps.Util.j0.h1(u02);
            }
            H0();
            return;
        }
        com.join.mgps.Util.l2.a(this).b(resultMainBean.getError_info());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void startDown(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        K0(downloadtaskDown, 0);
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

    ForumBean.ForumPostsBean t0(int i4) {
        List<ForumData.ForumUserFavoritesData> list = this.f30966f;
        ForumBean.ForumPostsBean forumPostsBean = null;
        if (list == null) {
            return null;
        }
        for (ForumData.ForumUserFavoritesData forumUserFavoritesData : list) {
            if (forumUserFavoritesData.getType() == 2 && forumUserFavoritesData.getPost() != null) {
                forumPostsBean = forumUserFavoritesData.getPost();
                if (i4 == forumPostsBean.getPid()) {
                    break;
                }
            }
        }
        return forumPostsBean;
    }

    boolean t1() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    ForumData.ForumUserFavoritesData u0(String str) {
        for (ForumData.ForumUserFavoritesData forumUserFavoritesData : this.f30966f) {
            if (forumUserFavoritesData.getType() == 1 && forumUserFavoritesData.getGame() != null && !TextUtils.isEmpty(forumUserFavoritesData.getGame().getGame_id()) && forumUserFavoritesData.getGame().getGame_id().equals(str)) {
                return forumUserFavoritesData;
            }
        }
        return null;
    }

    public void u1(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.f30970j.setVisibility(4);
        } else {
            this.f30970j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUI(DownloadTask downloadTask, int i4) {
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
                    U0();
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
    }

    int v0(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.U == 0) {
            Resources resources = context.getResources();
            this.U = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v1(AbsListView absListView, int i4, int i5, int i6) {
        J0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w1(AbsListView absListView, int i4) {
        if (i4 == 0) {
            P0(!A0());
            if (Fresco.getImagePipeline().H()) {
                Fresco.getImagePipeline().N();
            }
        }
    }

    void x0() {
        try {
            com.join.mgps.Util.d0.a().d(this);
            getDownloadTaskInfo();
            List<DownloadTask> d5 = p1.f.K().d();
            this.X = d5;
            if (d5 != null && d5.size() > 0) {
                for (DownloadTask downloadTask : this.X) {
                    this.Y.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
            this.A1 = com.join.mgps.rpc.impl.d.P1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void y0() {
    }
}
