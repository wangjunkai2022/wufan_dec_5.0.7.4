package com.join.mgps.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
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
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.MediaController;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.adapter.ForumTopicAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView;
import com.join.mgps.customview.b;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.tencent.bugly.Bugly;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.mg_forum_forum_topic_activity)
/* loaded from: classes4.dex */
public class ForumTopicActivity extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    public static final String M = "key_forum_topic_bean";
    public static final String N = "key_mediacmd";
    public static final String O = "key_mediacmd_params";
    @ViewById
    LinearLayout A;
    MediaController B;
    int C;
    String D;
    String E;
    boolean F;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f31305c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f31306d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    View f31307e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ForumLoadingView f31308f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView f31309g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.rpc.i f31310h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.customview.g f31311i;

    /* renamed from: j  reason: collision with root package name */
    ForumTopicAdapter.k f31312j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    ExtBean f31313k;

    /* renamed from: l  reason: collision with root package name */
    ForumTopicAdapter f31314l;

    /* renamed from: m  reason: collision with root package name */
    volatile List<ForumTopicAdapter.t> f31315m;

    /* renamed from: n  reason: collision with root package name */
    List<ForumBean.ForumPostsBean> f31316n;

    /* renamed from: o  reason: collision with root package name */
    ForumBean.ForumTopicBean f31317o;

    /* renamed from: p  reason: collision with root package name */
    int f31318p;

    /* renamed from: q  reason: collision with root package name */
    int f31319q;

    /* renamed from: r  reason: collision with root package name */
    com.join.android.app.component.video.c f31320r;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.customview.b f31322t;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    FrameLayout f31324v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f31325w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    MyVideoView f31326x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    SimpleDraweeView f31327y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    ImageView f31328z;

    /* renamed from: b  reason: collision with root package name */
    private String f31304b = getClass().getSimpleName();

    /* renamed from: s  reason: collision with root package name */
    Handler f31321s = new k();

    /* renamed from: u  reason: collision with root package name */
    int f31323u = -1;
    boolean G = false;
    int H = -1;
    int I = -1;
    int J = 0;
    com.join.mgps.customview.o K = null;
    GestureDetector L = new GestureDetector(new f());

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
    public class a implements MediaPlayer.OnCompletionListener {
        a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            ForumTopicActivity.this.F0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements MediaPlayer.OnPreparedListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            ForumTopicActivity.this.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements MediaPlayer.OnErrorListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            ForumTopicActivity.this.F0(true);
            com.join.mgps.Util.l2.a(ForumTopicActivity.this.f31326x.getContext()).b("视频播放失败");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements MyVideoView.h {
        d() {
        }

        @Override // com.join.android.app.component.video.MyVideoView.h
        public boolean a(boolean z4) {
            com.join.mgps.Util.w0.e("onScreenChanged", "fullscreen=" + z4);
            ForumTopicActivity.this.l0();
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
            view.setVisibility(8);
            ForumTopicActivity.this.resume();
        }
    }

    /* loaded from: classes4.dex */
    class f extends GestureDetector.SimpleOnGestureListener {
        f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            Fresco.getImagePipeline().I();
            return super.onFling(motionEvent, motionEvent2, f5, f6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements com.join.mgps.customview.f {
        g() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ForumTopicActivity.this.t0()) {
                ForumTopicActivity.this.K0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements com.join.mgps.customview.g {
        h() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            ForumTopicActivity.this.Y0();
            if (ForumTopicActivity.this.t0()) {
                ForumTopicActivity.this.M0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements ForumTopicAdapter.k {
        i() {
        }

        @Override // com.join.mgps.adapter.ForumTopicAdapter.k
        public void a(int i4) {
            ForumTopicActivity forumTopicActivity = ForumTopicActivity.this;
            if (!forumTopicActivity.isLogined(forumTopicActivity)) {
                ForumTopicActivity.this.showMessage(forumTopicActivity.getString(R.string.forum_user_not_login));
            } else if (!ForumTopicActivity.this.b1()) {
                ForumTopicActivity.this.V0();
            } else {
                ForumTopicActivity.this.N0(i4);
                ForumTopicActivity.this.H0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumTopicAdapter.k
        public void b(int i4) {
            ForumTopicActivity forumTopicActivity = ForumTopicActivity.this;
            forumTopicActivity.W0(forumTopicActivity.m0(i4));
        }

        @Override // com.join.mgps.adapter.ForumTopicAdapter.k
        public void c(int i4) {
            ForumTopicAdapter.t.l lVar = (ForumTopicAdapter.t.l) ForumTopicActivity.this.f31315m.get(i4).a();
            ForumTopicActivity.this.f31323u = i4;
            Bundle bundle = new Bundle();
            bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_PLAY.name());
            bundle.putStringArray("key_mediacmd_params", new String[]{ForumTopicActivity.this.f31323u + "", lVar.f41972b, lVar.f41971a});
            ForumTopicActivity.this.callbackPlayVideo(bundle);
            ForumTopicActivity.this.B0();
        }

        @Override // com.join.mgps.adapter.ForumTopicAdapter.k
        public void d(int i4) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(ForumTopicActivity.this, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumTopicAdapter.k
        public void e(int i4) {
            ForumBean forumBean = new ForumBean();
            forumBean.setFid(i4);
            com.join.mgps.Util.j0.r0(ForumTopicActivity.this.getBaseContext(), forumBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnTouchListener {
        j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ForumTopicActivity.this.L.onTouchEvent(motionEvent);
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class k extends Handler {
        k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 0) {
                return;
            }
            ForumTopicActivity.this.f31309g.r();
            ForumTopicActivity.this.f31309g.q();
            ForumTopicActivity forumTopicActivity = ForumTopicActivity.this;
            if (forumTopicActivity.f31318p == -1) {
                forumTopicActivity.f31309g.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l extends ForumLoadingView.e {
        l(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumTopicActivity.this.y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends ForumLoadingView.e {
        m(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            ForumTopicActivity.this.y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n extends ForumLoadingView.e {
        n(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumTopicActivity.this.y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements b.d {
        o() {
        }

        @Override // com.join.mgps.customview.b.d
        public void a(int i4) {
        }

        @Override // com.join.mgps.customview.b.d
        public void b(ForumBean.ForumPostsBean forumPostsBean) {
        }

        @Override // com.join.mgps.customview.b.d
        public void c(int i4, boolean z4) {
            f(i4, z4);
        }

        @Override // com.join.mgps.customview.b.d
        public void d(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean m02 = ForumTopicActivity.this.m0(forumPostsBean.getPid());
            if (m02 != null) {
                m02.setIs_favorite(forumPostsBean.is_favorite());
            }
        }

        @Override // com.join.mgps.customview.b.d
        public void e(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean m02 = ForumTopicActivity.this.m0(forumPostsBean.getPid());
            if (m02 != null) {
                m02.setBest(forumPostsBean.getBest());
            }
        }

        void f(int i4, boolean z4) {
            ForumTopicActivity forumTopicActivity = ForumTopicActivity.this;
            List<ForumBean.ForumPostsBean> list = forumTopicActivity.f31316n;
            if (z4) {
                if (list != null && list.size() != 0) {
                    Iterator<ForumBean.ForumPostsBean> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ForumBean.ForumPostsBean next = it2.next();
                        if (next.getPid() == i4) {
                            list.remove(next);
                            ForumTopicActivity.this.Z0();
                            ForumTopicActivity.this.A0();
                            break;
                        }
                    }
                }
                com.join.mgps.Util.l2.a(ForumTopicActivity.this.getBaseContext()).b("删除成功");
                return;
            }
            com.join.mgps.Util.l2.a(forumTopicActivity.getBaseContext()).b("删除失败");
        }

        @Override // com.join.mgps.customview.b.d
        public void onCancel() {
        }
    }

    private void G0() {
        String str = this.D;
        String str2 = this.E;
        this.f31327y.setVisibility(0);
        this.f31327y.setScaleType(ImageView.ScaleType.FIT_XY);
        MyImageLoader.h(this.f31327y, str2);
        LinearLayout linearLayout = this.A;
        if (this.B == null) {
            MediaController mediaController = new MediaController(this);
            this.B = mediaController;
            mediaController.q();
            this.B.hide();
            this.B.setVisibility(8);
        }
        if (this.f31326x.isPlaying()) {
            MyVideoView myVideoView = this.f31326x;
            if (myVideoView != null) {
                myVideoView.I();
                linearLayout.setVisibility(8);
            }
            MediaController mediaController2 = this.B;
            if (mediaController2 != null) {
                mediaController2.setVisibility(8);
            }
        }
        this.f31326x.setVisibility(0);
        this.B.setAnchorView(this.f31326x);
        this.B.setMediaPlayer(this.f31326x);
        this.f31326x.setMediaController(this.B);
        this.f31326x.requestFocus();
        linearLayout.setVisibility(0);
        if (this.f31326x.E() && !this.f31326x.isPlaying()) {
            resume();
            com.join.mgps.Util.w0.e("play a last video ...");
        } else {
            this.f31326x.setVideoPath(str);
            com.join.mgps.Util.w0.e("play a new video ...");
        }
        this.f31326x.setOnCompletionListener(new a());
        this.f31326x.setOnPreparedListener(new b());
        this.f31326x.setOnErrorListener(new c());
        this.f31326x.setScreenChangedListener(new d());
        this.f31328z.setOnClickListener(new e());
    }

    private void I0(int i4, List<ForumBean.ForumPostsBean> list) {
        if (this.f31316n == null) {
            this.f31316n = new ArrayList();
        }
        if (list != null && list.size() != 0) {
            if (i4 == 1) {
                this.f31316n.clear();
                this.f31319q = 1;
            }
            this.f31316n.addAll(list);
        }
        Z0();
        A0();
    }

    private void J0(ForumBean.ForumTopicBean forumTopicBean) {
        this.f31317o = forumTopicBean;
    }

    private void Q0(List<ForumBean.ForumPostsBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            T0(list.get(i4));
        }
    }

    private void T0(ForumBean.ForumPostsBean forumPostsBean) {
        String str;
        String message;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.f31315m.add(new ForumTopicAdapter.t(ForumTopicAdapter.ViewType.POST_HEADER, new ForumTopicAdapter.t.g(false, forumPostsBean.getAvatar_src(), forumPostsBean.getNickname(), forumPostsBean.getAdd_time(), forumPostsBean.getFirst() > 0, forumPostsBean.getPid(), forumPostsBean.getFid(), accountData != null && forumPostsBean.getUid() == accountData.getUid(), forumPostsBean.getForum_auth() == 1, 0, forumPostsBean.getVip_level(), forumPostsBean.getSvip_level(), forumPostsBean.getCopper_title() != null ? forumPostsBean.getCopper_title().getBattleTitle() : "", forumPostsBean.getCopper_title() != null ? forumPostsBean.getCopper_title().getBattleColor() : "", forumPostsBean.getUid())));
        if (forumPostsBean.getSubject() != null && !com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim())) {
            ForumTopicAdapter.ViewType viewType = ForumTopicAdapter.ViewType.POST_SUBJECT;
            boolean z4 = forumPostsBean.getBest() > 0;
            String subject = forumPostsBean.getSubject();
            int pid = forumPostsBean.getPid();
            int fid = forumPostsBean.getFid();
            boolean z5 = forumPostsBean.getHelp() > 0;
            this.f31315m.add(new ForumTopicAdapter.t(viewType, new ForumTopicAdapter.t.j(z4, subject, pid, fid, z5, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info())));
        }
        boolean z6 = forumPostsBean.getSubject() == null || com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim());
        if (com.join.mgps.Util.g2.h(forumPostsBean.getMessage()) || com.join.mgps.Util.g2.h(forumPostsBean.getMessage().trim())) {
            str = "";
        } else {
            String message2 = forumPostsBean.getMessage();
            boolean z7 = forumPostsBean.getHelp() > 0;
            str = "";
            SpannableStringBuilder m02 = com.join.mgps.Util.j0.m0(this, message2, z6, z7, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info());
            boolean z8 = z6 && forumPostsBean.getBest() > 0;
            String message3 = forumPostsBean.getMessage();
            int pid2 = forumPostsBean.getPid();
            int fid2 = forumPostsBean.getFid();
            boolean z9 = z6 && forumPostsBean.getHelp() > 0;
            ForumTopicAdapter.t.i iVar = new ForumTopicAdapter.t.i(z8, message3, pid2, fid2, z9, forumPostsBean.getHelp_money() + str, z6 ? forumPostsBean.getTag_info() : null, m02);
            this.f31315m.add(new ForumTopicAdapter.t(ForumTopicAdapter.ViewType.POST_MESSAGE, iVar));
            this.f31314l.g().e(iVar);
        }
        List<ForumBean.ForumPostsBean.ResBean> rs_list = forumPostsBean.getRs_list();
        ArrayList arrayList = new ArrayList();
        boolean isAttach_video = forumPostsBean.isAttach_video();
        String str2 = str;
        String str3 = str2;
        for (int i4 = 0; i4 < rs_list.size(); i4++) {
            ForumBean.ForumPostsBean.ResBean resBean = rs_list.get(i4);
            if (resBean.getType().equals("pic")) {
                arrayList.add(resBean.getRaw());
            } else if (resBean.getType().equals("video") && com.join.mgps.Util.g2.h(str3)) {
                str2 = resBean.getThumb();
                str3 = resBean.getRaw();
            }
        }
        if (com.join.mgps.Util.g2.i(forumPostsBean.getSubject())) {
            message = forumPostsBean.getSubject();
        } else {
            message = com.join.mgps.Util.g2.i(forumPostsBean.getMessage()) ? forumPostsBean.getMessage() : str;
        }
        if (isAttach_video) {
            this.f31315m.add(new ForumTopicAdapter.t(ForumTopicAdapter.ViewType.POST_VIDEO_THUMBNAIL, new ForumTopicAdapter.t.l(str2, str3, message)));
        } else if (rs_list.size() != 0) {
            this.f31315m.add(new ForumTopicAdapter.t(ForumTopicAdapter.ViewType.POST_IMAGE_THUMBNAIL, new ForumTopicAdapter.t.h(rs_list, arrayList, forumPostsBean.getPid())));
        }
        this.f31315m.add(new ForumTopicAdapter.t(ForumTopicAdapter.ViewType.POST_FOOTER, new ForumTopicAdapter.t.f(forumPostsBean.getPid(), forumPostsBean.getFid(), forumPostsBean.getFname(), forumPostsBean.getView(), forumPostsBean.getCommit(), forumPostsBean.getPraise(), forumPostsBean.is_praise(), false)));
    }

    private void X0() {
        this.f31305c.setVisibility(0);
        this.f31309g.setVisibility(0);
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void i0() {
        if (this.f31315m != null) {
            this.f31315m.clear();
        }
        List<ForumBean.ForumPostsBean> list = this.f31316n;
        if (list != null) {
            list.clear();
        }
        this.f31317o = null;
        this.f31313k = null;
        this.f31321s = null;
        this.f31311i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void k0() {
        com.join.mgps.customview.o oVar = this.K;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.K.dismiss();
    }

    private void p0() {
        this.f31305c.setVisibility(8);
        this.f31309g.setVisibility(8);
    }

    private void q0() {
        ForumBean.ForumTopicBean forumTopicBean = this.f31317o;
        if (forumTopicBean != null && com.join.mgps.Util.g2.i(forumTopicBean.getName())) {
            this.f31306d.setText(this.f31317o.getName());
        } else {
            this.f31306d.setText("话题专区");
        }
    }

    private void r0() {
        this.f31309g.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f31309g.setPullLoadEnable(new g());
        h hVar = new h();
        this.f31311i = hVar;
        this.f31309g.setPullRefreshEnable(hVar);
        this.f31315m = new ArrayList();
        this.f31320r = new com.join.android.app.component.video.c(this, this.f31304b);
        ForumTopicAdapter forumTopicAdapter = new ForumTopicAdapter(this, this.f31320r);
        this.f31314l = forumTopicAdapter;
        this.f31309g.setAdapter((ListAdapter) forumTopicAdapter);
        this.f31309g.setOnScrollListener(this);
        i iVar = new i();
        this.f31312j = iVar;
        this.f31314l.x(iVar);
        this.f31309g.setOnTouchListener(new j());
    }

    private void s0() {
        h0(1);
        r0();
    }

    private void x0() {
        w0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        h0(1);
        if (com.join.android.app.common.utils.j.j(this)) {
            x0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        h0(9);
    }

    synchronized void A0() {
        if (this.f31315m == null) {
            this.f31315m = new ArrayList();
        }
        this.f31315m.clear();
        R0();
        S0();
        z0();
    }

    void B0() {
        int i4 = this.f31323u;
        if (i4 == -1) {
            return;
        }
        int firstVisiblePosition = this.f31309g.getFirstVisiblePosition();
        int lastVisiblePosition = this.f31309g.getLastVisiblePosition();
        int i5 = this.f31323u;
        if (i5 >= firstVisiblePosition - 1 && i5 <= lastVisiblePosition) {
            F0(false);
            i4 = (this.f31323u - firstVisiblePosition) + 1;
        } else {
            F0(true);
        }
        View childAt = this.f31309g.getChildAt(i4);
        if (childAt != null) {
            int bottom = this.f31305c.getBottom();
            int top = childAt.getTop() + this.f31309g.getTop();
            Bundle bundle = new Bundle();
            bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_TRANSLATE_Y.name());
            bundle.putStringArray("key_mediacmd_params", new String[]{bottom + "", top + ""});
            callbackPlayVideo(bundle);
        }
    }

    void C0(int i4, int i5) {
        if (getResources().getConfiguration().orientation == 2) {
            ViewCompat.setTranslationY(this.f31324v, -this.f31324v.getTop());
            return;
        }
        this.H = i4;
        this.I = i5;
        com.join.mgps.Util.w0.e("offsetContainer", "mTop=" + this.H, "mOffsetY=" + this.I);
        ViewCompat.setTranslationY(this.f31324v, (float) this.I);
    }

    void D0() {
        MyVideoView myVideoView = this.f31326x;
        if (myVideoView.isPlaying() && (myVideoView != null)) {
            this.f31326x.pause();
            this.f31328z.setVisibility(0);
        }
    }

    void E0(String str, String str2) {
        String str3 = this.D;
        if (str3 != null && str3.equals(str) && this.f31326x.isPlaying()) {
            D0();
            return;
        }
        MyVideoView myVideoView = this.f31326x;
        if (myVideoView != null) {
            if (myVideoView.E() && this.D.equals(str)) {
                this.f31326x.seekTo(0);
                resume();
            } else {
                this.f31326x.G();
            }
        }
        this.D = str;
        this.E = str2;
        if (com.join.mgps.Util.g2.h(str)) {
            Y0();
            return;
        }
        this.f31327y.setVisibility(8);
        this.f31328z.setVisibility(8);
        G0();
    }

    void F0(boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_PLAY_BACKGROUND.name());
        bundle.putStringArray("key_mediacmd_params", new String[]{String.valueOf(z4)});
        callbackPlayVideo(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this, i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f31310h.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                N0(i4);
                V0();
                return;
            }
            com.join.mgps.Util.j0.m1(e02, o4.getData());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void K0() {
        if (this.f31318p == -1) {
            Z0();
        } else {
            w0(this.f31319q + 1);
        }
    }

    void L0() {
        if (this.G) {
            this.f31324v.setVisibility(0);
        } else {
            this.f31324v.setVisibility(8);
        }
    }

    void M0() {
        if (this.f31317o == null) {
            return;
        }
        w0(1);
    }

    void N0(int i4) {
        List<ForumBean.ForumPostsBean> list = this.f31316n;
        if (list == null || list.size() == 0) {
            return;
        }
        for (ForumBean.ForumPostsBean forumPostsBean : list) {
            if (forumPostsBean.getPid() == i4) {
                forumPostsBean.setPraise(forumPostsBean.is_praise() ? forumPostsBean.getPraise() - 1 : forumPostsBean.getPraise() + 1);
                forumPostsBean.setIs_praise(!forumPostsBean.is_praise());
                A0();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0() {
        if (com.join.mgps.Util.g2.i(this.f31317o.getName())) {
            this.f31306d.setText(this.f31317o.getName());
        }
    }

    RelativeLayout.LayoutParams P0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f31324v.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f31324v.setPadding(0, 0, 0, 0);
        }
        RelativeLayout relativeLayout = this.f31325w;
        if (relativeLayout == null) {
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
        }
        this.f31324v.setTop(0);
        this.f31324v.postInvalidate();
        return layoutParams;
    }

    void R0() {
        O0();
        AccountUtil_.getInstance_(this).getAccountData();
        this.f31315m.add(new ForumTopicAdapter.t(ForumTopicAdapter.ViewType.FORUM_TOPIC_TOP, new ForumTopicAdapter.t.a(this.f31317o.getIcon_src())));
    }

    void S0() {
        Q0(this.f31316n);
    }

    void U0() {
        RelativeLayout relativeLayout = this.f31325w;
        if (relativeLayout == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = o0(this);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f31324v.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mg_forum_post_item_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_top);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_bottom);
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            this.f31324v.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
        }
        this.f31325w.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V0() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    void W0(ForumBean.ForumPostsBean forumPostsBean) {
        if (forumPostsBean == null) {
            return;
        }
        if (this.f31322t == null) {
            com.join.mgps.customview.c z4 = com.join.mgps.customview.c.z(this);
            this.f31322t = z4;
            z4.m(new o());
        }
        this.f31322t.p(this.f31307e, forumPostsBean);
    }

    void Y0() {
        MyVideoView myVideoView = this.f31326x;
        if (myVideoView != null) {
            myVideoView.seekTo(0);
            this.f31326x.I();
            this.C = -1;
            this.f31326x.G();
            this.A.setVisibility(8);
            MediaController mediaController = this.B;
            if (mediaController != null) {
                mediaController.setVisibility(8);
            }
            this.f31328z.setVisibility(0);
            if (getResources().getConfiguration().orientation == 1) {
                this.f31324v.setVisibility(8);
                this.G = false;
                return;
            }
            a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0() {
        Handler handler = this.f31321s;
        if (handler == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 2000L);
    }

    void a1() {
        MyVideoView myVideoView = this.f31326x;
        if (myVideoView != null) {
            myVideoView.setFullScreen(!this.F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f31310h = com.join.mgps.rpc.impl.g.A0();
        n0();
        q0();
        this.f31308f.m();
        s0();
        y0();
    }

    boolean b1() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    boolean c1(int i4) {
        int i5 = this.f31318p;
        if (i5 == -1) {
            Z0();
            return true;
        } else if (i4 == i5) {
            return true;
        } else {
            this.f31318p = i4;
            this.f31318p = i4;
            return false;
        }
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
                    if (parseInt == this.C) {
                        return;
                    }
                    Y0();
                    this.C = parseInt;
                } else if (i4 == 1) {
                    str = str3;
                } else if (i4 == 2) {
                    str2 = str3;
                }
            }
            com.join.mgps.Util.w0.e("CMD_PLAY", "videoUrl=" + str, "coverUrl=" + str2);
            this.f31324v.setVisibility(0);
            this.f31326x.setVisibility(0);
            this.G = true;
            U0();
            E0(str, str2);
        } else if (string.equals(MediaCmd.CMD_PLAY_BACKGROUND.name())) {
            if (this.C == -1) {
                return;
            }
            if (Boolean.parseBoolean((String) objArr[0])) {
                this.f31324v.setVisibility(8);
                this.f31326x.setVisibility(8);
                this.G = false;
                Y0();
            } else if (this.C != -1) {
                this.f31324v.setVisibility(0);
                this.f31326x.setVisibility(0);
                this.G = true;
            }
        } else if (string.equals(MediaCmd.CMD_PAUSE.name())) {
            D0();
        } else if (string.equals(MediaCmd.CMD_STOP.name())) {
            Y0();
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
            l0();
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
            C0(parseInt2, parseInt3);
        }
    }

    public void d1(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.f31309g.setVisibility(4);
        } else {
            this.f31309g.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e1(AbsListView absListView, int i4, int i5, int i6) {
        B0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f1(AbsListView absListView, int i4) {
        if (i4 == 0) {
            F0(!v0());
            if (Fresco.getImagePipeline().H()) {
                Fresco.getImagePipeline().N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(int i4) {
        if (i4 == 1) {
            this.f31308f.j(1);
        } else if (i4 == 2) {
            this.f31308f.j(2);
        } else if (i4 == 9) {
            ForumLoadingView forumLoadingView = this.f31308f;
            forumLoadingView.setListener(new l(forumLoadingView));
            this.f31308f.j(9);
        } else if (i4 == 10) {
            this.f31308f.setFailedMsg("没有更多话题哦~");
            ForumLoadingView forumLoadingView2 = this.f31308f;
            forumLoadingView2.setListener(new m(forumLoadingView2));
            this.f31308f.setReloadingVisibility(0);
            this.f31308f.j(10);
        } else if (i4 != 16) {
        } else {
            this.f31308f.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView3 = this.f31308f;
            forumLoadingView3.setListener(new n(forumLoadingView3));
            this.f31308f.j(16);
        }
    }

    void j0() {
        com.join.mgps.customview.b bVar = this.f31322t;
        if (bVar != null && bVar.isShowing()) {
            this.f31322t.dismiss();
        }
        this.f31322t = null;
    }

    void l0() {
        if (getResources().getConfiguration().orientation == 2) {
            this.F = false;
            X0();
            U0();
            C0(0, 0);
            return;
        }
        this.F = true;
        p0();
        P0();
    }

    ForumBean.ForumPostsBean m0(int i4) {
        List<ForumBean.ForumPostsBean> list = this.f31316n;
        ForumBean.ForumPostsBean forumPostsBean = null;
        if (list == null) {
            return null;
        }
        Iterator<ForumBean.ForumPostsBean> it2 = list.iterator();
        while (it2.hasNext()) {
            forumPostsBean = it2.next();
            if (i4 == forumPostsBean.getPid()) {
                break;
            }
        }
        return forumPostsBean;
    }

    public void n0() {
        try {
            this.f31317o = new ForumBean.ForumTopicBean();
            String str = (String) getIntent().getSerializableExtra(M);
            if (com.join.mgps.Util.g2.h(str)) {
                finish();
            } else {
                this.f31317o = (ForumBean.ForumTopicBean) JsonMapper.getInstance().fromJson(str, JsonMapper.getInstance().createCollectionType(ForumBean.ForumTopicBean.class, new Class[0]));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    int o0(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.J == 0) {
            Resources resources = context.getResources();
            this.J = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.J;
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d1(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j0();
        i0();
        com.join.android.app.component.video.c cVar = this.f31320r;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Override // com.BaseAppCompatActivity
    public void onFavoriteChanged(int i4, boolean z4) {
        super.onFavoriteChanged(i4, z4);
        com.join.mgps.Util.j0.j(i4, z4, this.f31316n);
        A0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getRepeatCount() == 0 && getResources().getConfiguration().orientation == 2) {
            this.F = true;
            a1();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Y0();
        com.join.android.app.component.video.c cVar = this.f31320r;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.c cVar = this.f31320r;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        e1(absListView, i4, i5, i6);
        this.f31320r.f(absListView, i4, i5, i6);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        f1(absListView, i4);
        this.f31320r.j(absListView, i4);
    }

    void resume() {
        MyVideoView myVideoView = this.f31326x;
        if (myVideoView.E() & (myVideoView != null)) {
            this.A.setVisibility(8);
            this.f31327y.setVisibility(8);
            this.f31328z.setVisibility(8);
            this.f31326x.start();
            MediaController mediaController = this.B;
            if (mediaController != null) {
                mediaController.setVisibility(8);
                return;
            }
            return;
        }
        G0();
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

    boolean t0() {
        if (com.join.android.app.common.utils.j.j(getBaseContext())) {
            return true;
        }
        showToast(getString(R.string.net_connect_failed));
        h0(9);
        Z0();
        return false;
    }

    boolean u0(List<ForumBean.ForumPostsBean> list) {
        boolean z4 = list == null || list.size() == 0;
        if (z4) {
            Z0();
        }
        return z4;
    }

    boolean v0() {
        if (this.f31323u == -1) {
            return false;
        }
        int firstVisiblePosition = this.f31309g.getFirstVisiblePosition();
        int lastVisiblePosition = this.f31309g.getLastVisiblePosition();
        int i4 = this.f31323u;
        return i4 >= firstVisiblePosition - 1 && i4 <= lastVisiblePosition;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r11.f31318p != (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r11.f31318p == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        r11.f31318p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        Z0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w0(int r12) {
        /*
            r11 = this;
            boolean r0 = com.join.android.app.common.utils.j.j(r11)
            if (r0 == 0) goto Lac
            boolean r0 = r11.c1(r12)
            if (r0 == 0) goto Ld
            return
        Ld:
            r0 = 4
            r1 = 0
            r2 = -1
            com.wufan.user.service.protobuf.n0 r3 = com.join.mgps.Util.j0.T(r11)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r10 = ""
            java.lang.String r4 = ""
            boolean r5 = com.join.mgps.Util.j0.Y0(r11)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            if (r5 == 0) goto L29
            int r4 = r3.getUid()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r3 = r3.getToken()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r7 = r3
            r6 = r4
            goto L2b
        L29:
            r7 = r4
            r6 = 0
        L2b:
            com.join.mgps.dto.ExtBean r3 = r11.f31313k     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            if (r3 == 0) goto L37
            r3.getFrom()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            com.join.mgps.dto.ExtBean r3 = r11.f31313k     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r3.getPosition()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
        L37:
            com.join.mgps.rpc.i r4 = r11.f31310h     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            com.join.mgps.dto.ForumBean$ForumTopicBean r3 = r11.f31317o     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            int r5 = r3.getTid()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            int r9 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r8 = r12
            com.join.mgps.dto.ForumResponse r3 = r4.h(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            if (r3 == 0) goto L87
            java.lang.Object r3 = r3.getData()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            com.join.mgps.dto.ForumData$ForumForumTopicData r3 = (com.join.mgps.dto.ForumData.ForumForumTopicData) r3     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r4 = 0
            if (r3 == 0) goto L60
            com.join.mgps.dto.ForumBean$ForumTopicBean r4 = r3.getTopic()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.util.List r5 = r3.getPosts_list()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r11.J0(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r11.I0(r12, r5)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r4 = r5
        L60:
            if (r3 == 0) goto L70
            boolean r3 = r11.u0(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            if (r3 == 0) goto L69
            goto L70
        L69:
            r11.f31319q = r12     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r12 = 2
            r11.h0(r12)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            goto L8a
        L70:
            r11.f31318p = r2     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r3 = 1
            if (r12 != r3) goto L7a
            r12 = 10
            r11.h0(r12)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
        L7a:
            r11.Z0()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            int r12 = r11.f31318p
            if (r12 == r2) goto L83
            r11.f31318p = r1
        L83:
            r11.Z0()
            return
        L87:
            r11.h0(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
        L8a:
            int r12 = r11.f31318p
            if (r12 == r2) goto L9e
            goto L9c
        L8f:
            r12 = move-exception
            goto La2
        L91:
            r12 = move-exception
            r11.h0(r0)     // Catch: java.lang.Throwable -> L8f
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L8f
            int r12 = r11.f31318p
            if (r12 == r2) goto L9e
        L9c:
            r11.f31318p = r1
        L9e:
            r11.Z0()
            goto Lbe
        La2:
            int r0 = r11.f31318p
            if (r0 == r2) goto La8
            r11.f31318p = r1
        La8:
            r11.Z0()
            throw r12
        Lac:
            r12 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r12 = r11.getString(r12)
            r11.showToast(r12)
            r12 = 9
            r11.h0(r12)
            r11.Z0()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumTopicActivity.w0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        this.f31314l.z(this.f31315m);
        this.f31314l.notifyDataSetChanged();
    }
}
