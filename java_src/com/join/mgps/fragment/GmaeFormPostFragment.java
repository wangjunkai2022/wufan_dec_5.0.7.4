package com.join.mgps.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.MediaController;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.join.mgps.activity.ForumProfileFavoritesActivity;
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
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.mg_forum_profile_favorites_activity)
/* loaded from: classes.dex */
public class GmaeFormPostFragment extends Fragment implements AbsListView.OnScrollListener {
    private static final String H1 = ForumProfileFavoritesActivity.class.getSimpleName();
    static int I1 = 0;
    public static final String J1 = "key_mediacmd";
    public static final String K1 = "key_mediacmd_params";
    @ViewById
    static MyVideoView L1;
    static boolean M1;
    private com.join.mgps.rpc.e A1;
    com.join.android.app.component.video.c B;
    com.join.mgps.rpc.e C;
    Dialog D;
    public AbsListView D1;
    com.join.mgps.customview.b F;
    View G;
    @ViewById
    FrameLayout I;
    @ViewById
    RelativeLayout J;
    @ViewById
    SimpleDraweeView K;
    @ViewById
    ImageView L;
    @ViewById
    LinearLayout M;
    MediaController N;
    int O;
    String P;
    String Q;
    List<DownloadTask> X;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f52044b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f52045c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f52046d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ForumLoadingView f52047e;

    /* renamed from: f  reason: collision with root package name */
    List<ForumData.ForumUserFavoritesData> f52048f;

    /* renamed from: g  reason: collision with root package name */
    volatile List<ForumProfileFavoritesAdapter.k0> f52049g;

    /* renamed from: h  reason: collision with root package name */
    ForumProfileFavoritesAdapter f52050h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    XListView2 f52051i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    PtrClassicFrameLayout f52052j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.i f52053k;

    /* renamed from: l  reason: collision with root package name */
    private com.join.mgps.dialog.v0 f52054l;

    /* renamed from: y  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f52070y;

    /* renamed from: z  reason: collision with root package name */
    Context f52071z;

    /* renamed from: m  reason: collision with root package name */
    ForumProfileFavoritesAdapter.u f52055m = new k();

    /* renamed from: n  reason: collision with root package name */
    Handler f52056n = new o();

    /* renamed from: o  reason: collision with root package name */
    private int f52057o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f52058p = 0;

    /* renamed from: q  reason: collision with root package name */
    private final int f52061q = 0;

    /* renamed from: r  reason: collision with root package name */
    private final int f52062r = 16;

    /* renamed from: s  reason: collision with root package name */
    private final int f52063s = 32;

    /* renamed from: t  reason: collision with root package name */
    private final int f52064t = 17;

    /* renamed from: u  reason: collision with root package name */
    private final int f52065u = 18;

    /* renamed from: v  reason: collision with root package name */
    private final int f52066v = 20;

    /* renamed from: w  reason: collision with root package name */
    private final int f52068w = 24;

    /* renamed from: x  reason: collision with root package name */
    private int f52069x = 0;
    int A = 0;
    b.d E = new g();
    int H = -1;
    boolean R = false;
    int S = -1;
    int T = -1;
    int U = 0;
    com.join.mgps.customview.o V = null;
    GestureDetector W = new GestureDetector(new n());
    Map<String, DownloadTask> Y = new ConcurrentHashMap();
    Map<String, DownloadTask> Z = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    Map<String, DownloadTask> f52059p0 = new HashMap();

    /* renamed from: p1  reason: collision with root package name */
    private int f52060p1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    private int f52067v1 = 0;
    int B1 = 0;
    boolean C1 = false;
    public int E1 = 0;
    public int F1 = 0;
    public int G1 = 0;

    /* loaded from: classes3.dex */
    public enum MediaCmd {
        CMD_PLAY,
        CMD_PLAY_BACKGROUND,
        CMD_PAUSE,
        CMD_STOP,
        CMD_FULLSCREEN,
        CMD_TRANSLATE_Y
    }

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GmaeFormPostFragment.this.f52054l.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52073b;

        b(int i4) {
            this.f52073b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.join.android.app.common.utils.j.j(view.getContext())) {
                GmaeFormPostFragment.this.m0(view.getContext(), this.f52073b);
            } else {
                GmaeFormPostFragment gmaeFormPostFragment = GmaeFormPostFragment.this;
                gmaeFormPostFragment.showToast(gmaeFormPostFragment.getString(R.string.net_connect_failed));
            }
            GmaeFormPostFragment.this.f52054l.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
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
            GmaeFormPostFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
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
    /* loaded from: classes3.dex */
    public class e extends ForumLoadingView.e {
        e(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            GmaeFormPostFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
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
            GmaeFormPostFragment.this.R();
        }
    }

    /* loaded from: classes3.dex */
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
            GmaeFormPostFragment.this.E0(i4, z4);
        }

        @Override // com.join.mgps.customview.b.d
        public void d(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean q02 = GmaeFormPostFragment.this.q0(forumPostsBean.getPid());
            if (q02 != null) {
                q02.setIs_favorite(forumPostsBean.is_favorite());
                if (!forumPostsBean.is_favorite()) {
                    GmaeFormPostFragment.this.E0(forumPostsBean.getPid(), true);
                }
            }
            GmaeFormPostFragment.this.D0();
        }

        @Override // com.join.mgps.customview.b.d
        public void e(ForumBean.ForumPostsBean forumPostsBean) {
            ForumBean.ForumPostsBean q02 = GmaeFormPostFragment.this.q0(forumPostsBean.getPid());
            if (q02 != null) {
                q02.setBest(forumPostsBean.getBest());
            }
        }

        @Override // com.join.mgps.customview.b.d
        public void onCancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements MediaPlayer.OnCompletionListener {
        h() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            GmaeFormPostFragment.this.p1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements MediaPlayer.OnPreparedListener {
        i() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            GmaeFormPostFragment.this.Z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements MediaPlayer.OnErrorListener {
        j() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            GmaeFormPostFragment.this.p1();
            l2.a(GmaeFormPostFragment.L1.getContext()).b("视频播放失败");
            return false;
        }
    }

    /* loaded from: classes3.dex */
    class k implements ForumProfileFavoritesAdapter.u {
        k() {
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void a(int i4) {
            FragmentActivity activity = GmaeFormPostFragment.this.getActivity();
            if (!GmaeFormPostFragment.this.isLogined(activity)) {
                GmaeFormPostFragment.this.showMessage(activity.getString(R.string.forum_user_not_login));
            } else if (!GmaeFormPostFragment.this.x1()) {
                GmaeFormPostFragment.this.j1();
            } else {
                GmaeFormPostFragment.this.X0(i4);
                GmaeFormPostFragment.this.N0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void b(int i4) {
            GmaeFormPostFragment gmaeFormPostFragment = GmaeFormPostFragment.this;
            gmaeFormPostFragment.i1(gmaeFormPostFragment.q0(i4));
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void c(int i4) {
            ForumProfileFavoritesAdapter.k0.o oVar = (ForumProfileFavoritesAdapter.k0.o) GmaeFormPostFragment.this.f52049g.get(i4).a();
            GmaeFormPostFragment.this.H = i4;
            Bundle bundle = new Bundle();
            bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_PLAY.name());
            bundle.putStringArray("key_mediacmd_params", new String[]{GmaeFormPostFragment.this.H + "", oVar.f41520b, oVar.f41519a});
            GmaeFormPostFragment.this.h0(bundle);
            GmaeFormPostFragment.this.F0();
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void d(int i4) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(GmaeFormPostFragment.this.f52071z, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void e(String str) {
            GmaeFormPostFragment gmaeFormPostFragment = GmaeFormPostFragment.this;
            gmaeFormPostFragment.C1 = true;
            gmaeFormPostFragment.o0(str);
        }

        @Override // com.join.mgps.adapter.ForumProfileFavoritesAdapter.u
        public void f(int i4) {
            ForumBean forumBean = new ForumBean();
            forumBean.setFid(i4);
            com.join.mgps.Util.j0.r0(GmaeFormPostFragment.this.f52071z, forumBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class l implements MyVideoView.h {
        l() {
        }

        @Override // com.join.android.app.component.video.MyVideoView.h
        public boolean a(boolean z4) {
            com.join.mgps.Util.w0.e("onScreenChanged", "fullscreen=" + z4);
            GmaeFormPostFragment.this.p0();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.setVisibility(8);
            GmaeFormPostFragment.this.Z0();
        }
    }

    /* loaded from: classes3.dex */
    class n extends GestureDetector.SimpleOnGestureListener {
        n() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            Fresco.getImagePipeline().I();
            return super.onFling(motionEvent, motionEvent2, f5, f6);
        }
    }

    /* loaded from: classes3.dex */
    class o extends Handler {
        o() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            GmaeFormPostFragment.this.f52051i.v();
            GmaeFormPostFragment.this.f52051i.u();
            if (GmaeFormPostFragment.this.f52058p == -1) {
                GmaeFormPostFragment.this.f52051i.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class p implements com.join.mgps.customview.f {
        p() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            GmaeFormPostFragment gmaeFormPostFragment = GmaeFormPostFragment.this;
            gmaeFormPostFragment.A0(gmaeFormPostFragment.f52057o + 1);
            if (GmaeFormPostFragment.this.f52058p == -1) {
                GmaeFormPostFragment.this.q1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class q implements com.join.mgps.customview.g {
        q() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (com.join.android.app.common.utils.j.j(GmaeFormPostFragment.this.f52071z)) {
                GmaeFormPostFragment.this.f52058p = 0;
                GmaeFormPostFragment.this.A0(1);
                return;
            }
            GmaeFormPostFragment gmaeFormPostFragment = GmaeFormPostFragment.this;
            gmaeFormPostFragment.showToast(gmaeFormPostFragment.getString(R.string.net_connect_failed));
            GmaeFormPostFragment.this.j0(17);
            GmaeFormPostFragment.this.q1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class r implements View.OnTouchListener {
        r() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            GmaeFormPostFragment.this.W.onTouchEvent(motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class s implements AdapterView.OnItemClickListener {
        s() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = GmaeFormPostFragment.this.f52050h;
            if (forumProfileFavoritesAdapter != null && forumProfileFavoritesAdapter.getItemViewType(i4) == ForumProfileFavoritesAdapter.ViewType.GAME_ITEM.ordinal()) {
                ForumProfileFavoritesAdapter.k0.b bVar = (ForumProfileFavoritesAdapter.k0.b) GmaeFormPostFragment.this.f52050h.getItem(i4);
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
    /* loaded from: classes3.dex */
    public class t implements AdapterView.OnItemLongClickListener {
        t() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = GmaeFormPostFragment.this.f52050h;
            if (forumProfileFavoritesAdapter == null) {
                return false;
            }
            if (forumProfileFavoritesAdapter.getItemViewType(i4) == ForumProfileFavoritesAdapter.ViewType.GAME_ITEM.ordinal()) {
                ForumProfileFavoritesAdapter.k0.b bVar = (ForumProfileFavoritesAdapter.k0.b) GmaeFormPostFragment.this.f52050h.getItem(i4);
                if (bVar.a() == null || bVar.a().getGame() == null) {
                    return true;
                }
                GmaeFormPostFragment.this.m1(bVar.a().getGame().getGame_id());
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class u implements w1.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f52093a;

        u(String str) {
            this.f52093a = str;
        }

        @Override // w1.d
        public void a(Dialog dialog) {
            dialog.dismiss();
        }

        @Override // w1.d
        public void b(Dialog dialog) {
            GmaeFormPostFragment.this.D.dismiss();
            GmaeFormPostFragment.this.i0(1, this.f52093a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52095b;

        v(String str) {
            this.f52095b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GmaeFormPostFragment.this.D.dismiss();
            GmaeFormPostFragment.this.i0(1, this.f52095b);
        }
    }

    private void B0() {
        A0(1);
    }

    public static boolean I0(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getRepeatCount() == 0 && I1 == 2) {
            M1 = true;
            r1();
        }
        return true;
    }

    private void Q0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.X.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.Y.remove(next.getCrc_link_type_val());
                it2.remove();
                s1(downloadTask, 2);
                break;
            }
        }
        this.f52051i.requestLayout();
        D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        j0(0);
        y0();
        if (com.join.android.app.common.utils.j.j(this.f52071z)) {
            B0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        j0(17);
    }

    private void R0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.Y;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            s1(downloadTask, 3);
            D0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void S0(DownloadTask downloadTask) {
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
        s1(downloadTask, 0);
        D0();
    }

    private void T0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.Y;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.X.add(downloadTask);
            this.Y.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        s1(downloadTask, 1);
        DownloadTask downloadTask2 = this.Y.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f52051i.requestLayout();
        D0();
    }

    private void U0() {
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.X;
            if (list == null || i4 >= list.size()) {
                return;
            }
            G0(p1.f.K().F(this.X.get(i4).getCrc_link_type_val()), 4);
            i4++;
        }
    }

    private com.wufan.user.service.protobuf.n0 c0(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void d1(ForumBean.ForumPostsBean forumPostsBean) {
        boolean z4;
        String message;
        if (g2.h(forumPostsBean.getSubject()) || g2.h(forumPostsBean.getSubject().trim())) {
            z4 = false;
        } else {
            ForumProfileFavoritesAdapter.ViewType viewType = ForumProfileFavoritesAdapter.ViewType.P_SUBJECT;
            boolean z5 = forumPostsBean.getBest() > 0;
            String subject = forumPostsBean.getSubject();
            int pid = forumPostsBean.getPid();
            int fid = forumPostsBean.getFid();
            boolean z6 = forumPostsBean.getHelp() > 0;
            this.f52049g.add(new ForumProfileFavoritesAdapter.k0(viewType, new ForumProfileFavoritesAdapter.k0.f(false, z5, subject, pid, fid, z6, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info(), forumPostsBean.getTags(), forumPostsBean.getFname())));
            z4 = true;
        }
        if (!z4) {
            ForumProfileFavoritesAdapter.ViewType viewType2 = ForumProfileFavoritesAdapter.ViewType.P_SUBJECT;
            boolean z7 = forumPostsBean.getBest() > 0;
            String message2 = forumPostsBean.getMessage();
            int pid2 = forumPostsBean.getPid();
            boolean z8 = forumPostsBean.getHelp() > 0;
            this.f52049g.add(new ForumProfileFavoritesAdapter.k0(viewType2, new ForumProfileFavoritesAdapter.k0.f(false, z7, message2, pid2, 0, z8, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info(), forumPostsBean.getTags(), forumPostsBean.getFname())));
        } else {
            boolean z9 = forumPostsBean.getSubject() == null || g2.h(forumPostsBean.getSubject().trim());
            if (!g2.h(forumPostsBean.getMessage()) && !g2.h(forumPostsBean.getMessage().trim())) {
                Context context = this.f52071z;
                String message3 = forumPostsBean.getMessage();
                boolean z10 = forumPostsBean.getHelp() > 0;
                SpannableStringBuilder m02 = com.join.mgps.Util.j0.m0(context, message3, z9, z10, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info());
                boolean z11 = z9 && forumPostsBean.getBest() > 0;
                String message4 = forumPostsBean.getMessage();
                int pid3 = forumPostsBean.getPid();
                boolean z12 = z9 && forumPostsBean.getHelp() > 0;
                ForumProfileFavoritesAdapter.k0.e eVar = new ForumProfileFavoritesAdapter.k0.e(false, z11, message4, pid3, 0, z12, forumPostsBean.getHelp_money() + "", z9 ? forumPostsBean.getTag_info() : null, z9, m02);
                this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_MESSAGE, eVar));
                this.f52050h.j().e(eVar);
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
                } else if (resBean.getType().equals("video") && g2.h(str2)) {
                    str = resBean.getThumb();
                    str2 = resBean.getRaw();
                }
            }
            if (g2.i(forumPostsBean.getSubject())) {
                message = forumPostsBean.getSubject();
            } else {
                message = g2.i(forumPostsBean.getMessage()) ? forumPostsBean.getMessage() : "";
            }
            if (isAttach_video) {
                this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_VIDEO, new ForumProfileFavoritesAdapter.k0.g(str, str2, message)));
            } else if (rs_list != null && rs_list.size() != 0) {
                this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_IMGS, new ForumProfileFavoritesAdapter.k0.d(rs_list, arrayList, forumPostsBean.getPid())));
            }
        }
        if (z13) {
            O0(forumPostsBean.getRelation_game());
            ForumProfileFavoritesAdapter.ViewType viewType3 = ForumProfileFavoritesAdapter.ViewType.POST_GAME;
            this.f52049g.add(new ForumProfileFavoritesAdapter.k0(viewType3, new ForumProfileFavoritesAdapter.k0.i(true, forumPostsBean.getPid() + "", forumPostsBean.getRelation_game())));
        }
        this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.P_FOOTER, new ForumProfileFavoritesAdapter.k0.c(1, forumPostsBean.getAvatar_src(), forumPostsBean.getLast_comment_time(), forumPostsBean.getNickname(), forumPostsBean.getPraise(), forumPostsBean.getCommit(), forumPostsBean.getPid(), forumPostsBean.getView(), forumPostsBean.is_praise(), forumPostsBean.getUid())));
    }

    private void e1(ForumBean.ForumPostsBean forumPostsBean) {
        String str = "";
        if (forumPostsBean.getSubject() != null && !g2.h(forumPostsBean.getSubject().trim())) {
            ForumProfileFavoritesAdapter.ViewType viewType = ForumProfileFavoritesAdapter.ViewType.POST_SUBJECT;
            boolean z4 = forumPostsBean.getBest() > 0;
            String subject = forumPostsBean.getSubject();
            int pid = forumPostsBean.getPid();
            int fid = forumPostsBean.getFid();
            boolean z5 = forumPostsBean.getHelp() > 0;
            this.f52049g.add(new ForumProfileFavoritesAdapter.k0(viewType, new ForumProfileFavoritesAdapter.k0.m(z4, subject, pid, fid, z5, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info())));
        }
        boolean z6 = forumPostsBean.getSubject() == null || g2.h(forumPostsBean.getSubject().trim());
        if (!g2.h(forumPostsBean.getMessage()) && !g2.h(forumPostsBean.getMessage().trim())) {
            Context context = this.f52071z;
            String message = forumPostsBean.getMessage();
            boolean z7 = forumPostsBean.getHelp() > 0;
            SpannableStringBuilder m02 = com.join.mgps.Util.j0.m0(context, message, z6, z7, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info());
            boolean z8 = z6 && forumPostsBean.getBest() > 0;
            String message2 = forumPostsBean.getMessage();
            int pid2 = forumPostsBean.getPid();
            int fid2 = forumPostsBean.getFid();
            boolean z9 = z6 && forumPostsBean.getHelp() > 0;
            ForumProfileFavoritesAdapter.k0.l lVar = new ForumProfileFavoritesAdapter.k0.l(z8, message2, pid2, fid2, z9, forumPostsBean.getHelp_money() + "", z6 ? forumPostsBean.getTag_info() : null, m02);
            this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_MESSAGE, lVar));
            this.f52050h.j().e(lVar);
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
            } else if (resBean.getType().equals("video") && g2.h(str3)) {
                str2 = resBean.getThumb();
                str3 = resBean.getRaw();
            }
        }
        if (g2.i(forumPostsBean.getSubject())) {
            str = forumPostsBean.getSubject();
        } else if (g2.i(forumPostsBean.getMessage())) {
            str = forumPostsBean.getMessage();
        }
        if (isAttach_video) {
            this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_VIDEO_THUMBNAIL, new ForumProfileFavoritesAdapter.k0.o(str2, str3, str)));
        } else if (rs_list != null && rs_list.size() != 0) {
            this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_IMAGE_THUMBNAIL, new ForumProfileFavoritesAdapter.k0.k(rs_list, arrayList, forumPostsBean.getPid())));
        }
        this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.POST_FOOTER, new ForumProfileFavoritesAdapter.k0.h(forumPostsBean.getPid(), forumPostsBean.getFid(), forumPostsBean.getFname(), forumPostsBean.getView(), forumPostsBean.getCommit(), forumPostsBean.getPraise(), forumPostsBean.is_praise(), false)));
    }

    private void f1(List<ForumData.ForumUserFavoritesData> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ForumData.ForumUserFavoritesData forumUserFavoritesData = list.get(i4);
            if (forumUserFavoritesData.getType() == 1) {
                a1(forumUserFavoritesData);
                c1(forumUserFavoritesData);
            } else if (forumUserFavoritesData.getType() == 2) {
                ForumBean.ForumPostsBean post = forumUserFavoritesData.getPost();
                if (post.is_favorite()) {
                    a1(forumUserFavoritesData);
                    d1(post);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 c02 = c0(context);
        return c02 != null && g2.i(c02.getToken());
    }

    private void l1(int i4) {
        if (this.f52054l == null) {
            com.join.mgps.dialog.v0 v0Var = new com.join.mgps.dialog.v0(this.f52071z);
            this.f52054l = v0Var;
            v0Var.f("确定");
            this.f52054l.d("取消");
            this.f52054l.b(8);
            this.f52054l.g("确定要删除该帖吗？").c(new a());
        }
        this.f52054l.e(new b(i4));
        if (this.f52054l.isShowing()) {
            return;
        }
        this.f52054l.show();
    }

    private void n0() {
        com.join.mgps.customview.o oVar = this.V;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.V.dismiss();
    }

    private void n1() {
        this.f52052j.setVisibility(0);
    }

    private void playVideo() {
        String str = this.P;
        String str2 = this.Q;
        this.K.setVisibility(0);
        this.K.setScaleType(ImageView.ScaleType.FIT_XY);
        MyImageLoader.h(this.K, str2);
        LinearLayout linearLayout = this.M;
        if (this.N == null) {
            MediaController mediaController = new MediaController(this.f52071z);
            this.N = mediaController;
            mediaController.q();
            this.N.hide();
            this.N.setVisibility(8);
        }
        if (L1.isPlaying()) {
            MyVideoView myVideoView = L1;
            if (myVideoView != null) {
                myVideoView.I();
                linearLayout.setVisibility(8);
            }
            MediaController mediaController2 = this.N;
            if (mediaController2 != null) {
                mediaController2.setVisibility(8);
            }
        }
        L1.setVisibility(0);
        this.N.setAnchorView(L1);
        this.N.setMediaPlayer(L1);
        L1.setMediaController(this.N);
        L1.requestFocus();
        linearLayout.setVisibility(0);
        if (L1.E() && !L1.isPlaying()) {
            Z0();
            com.join.mgps.Util.w0.e("play a last video ...");
        } else {
            L1.setVideoPath(str);
            com.join.mgps.Util.w0.e("play a new video ...");
        }
        L1.setOnCompletionListener(new h());
        L1.setOnPreparedListener(new i());
        L1.setOnErrorListener(new j());
        L1.setScreenChangedListener(new l());
        this.L.setOnClickListener(new m());
    }

    static void r1() {
        MyVideoView myVideoView = L1;
        if (myVideoView != null) {
            myVideoView.setFullScreen(!M1);
        }
    }

    private void t0() {
        this.f52044b.setVisibility(8);
        this.f52052j.setVisibility(8);
    }

    private void u1() {
        XListView2 xListView2 = this.f52051i;
        ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = this.f52050h;
        if (forumProfileFavoritesAdapter != null && this.f52060p1 <= forumProfileFavoritesAdapter.getCount()) {
            for (int i4 = this.f52067v1; i4 <= this.f52060p1; i4++) {
                if (this.f52050h.getItemViewType(i4) == ForumProfileFavoritesAdapter.ViewType.GAME_ITEM.ordinal()) {
                    ForumProfileFavoritesAdapter.k0.b bVar = (ForumProfileFavoritesAdapter.k0.b) this.f52050h.getItem(i4);
                    if (bVar.a() != null && bVar.a().getGame() != null) {
                        DownloadTask downloadTask = bVar.a().getDownloadTask();
                        String game_id = bVar.a().getGame().getGame_id();
                        if (downloadTask != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                            View childAt = xListView2.getChildAt(i4 - this.f52067v1);
                            if (childAt.getTag() instanceof ForumProfileFavoritesAdapter.w) {
                                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(game_id);
                                t1((ForumProfileFavoritesAdapter.w) childAt.getTag(), downloadTask, f5);
                                s1(f5, 4);
                            }
                        }
                    }
                }
            }
        }
    }

    private void w0() {
        this.f52046d.setText("我的收藏");
        this.f52048f = new ArrayList();
        this.f52051i.requestFocus();
        this.f52051i.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f52051i.setPullLoadEnable(new p());
        this.f52051i.setPullRefreshEnable(new q());
        this.f52049g = new ArrayList();
        this.B = new com.join.android.app.component.video.c(this.f52071z, H1);
        ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = new ForumProfileFavoritesAdapter(this.f52071z, this.B);
        this.f52050h = forumProfileFavoritesAdapter;
        forumProfileFavoritesAdapter.M(this.f52055m);
        this.f52051i.setAdapter((ListAdapter) this.f52050h);
        this.f52051i.setOnScrollListener(this);
        this.f52051i.setOnTouchListener(new r());
        this.f52051i.setOnItemClickListener(new s());
        this.f52051i.setOnItemLongClickListener(new t());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
        if (r12.f52058p != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
        if (r12.f52058p == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
        r12.f52058p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
        q1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0(int r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.GmaeFormPostFragment.A0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A1(AbsListView absListView, int i4) {
        if (i4 == 0) {
            M0(!x0());
            if (Fresco.getImagePipeline().H()) {
                Fresco.getImagePipeline().N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
        ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = this.f52050h;
        if (forumProfileFavoritesAdapter != null) {
            forumProfileFavoritesAdapter.P(this.f52049g);
            this.f52050h.notifyDataSetChanged();
        }
    }

    synchronized void D0() {
        if (this.f52049g == null) {
            this.f52049g = new ArrayList();
        }
        this.f52049g.clear();
        f1(this.f52048f);
        C0();
        List<ForumData.ForumUserFavoritesData> list = this.f52048f;
        if (list == null || list.size() == 0) {
            this.f52069x = 0;
            this.f52047e.m();
            j0(22);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(int i4, boolean z4) {
        if (z4) {
            List<ForumData.ForumUserFavoritesData> list = this.f52048f;
            if (list != null && list.size() != 0) {
                Iterator<ForumData.ForumUserFavoritesData> it2 = this.f52048f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ForumData.ForumUserFavoritesData next = it2.next();
                    if (next.getType() == 2 && next.getPost() != null && next.getPost().getPid() == i4) {
                        this.f52048f.remove(next);
                        q1();
                        D0();
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
            l2.a(this.f52071z).b("删除成功");
            return;
        }
        l2.a(this.f52071z).b("删除失败");
    }

    void F0() {
        int i4;
        XListView2 xListView2 = this.f52051i;
        if (xListView2 == null || (i4 = this.H) == -1) {
            return;
        }
        int firstVisiblePosition = xListView2.getFirstVisiblePosition();
        int lastVisiblePosition = this.f52051i.getLastVisiblePosition();
        int i5 = this.H;
        if (i5 >= firstVisiblePosition + 0 && i5 <= lastVisiblePosition) {
            M0(false);
            i4 = (this.H - firstVisiblePosition) + 0;
        } else {
            M0(true);
        }
        View childAt = this.f52051i.getChildAt(i4);
        if (childAt != null) {
            int bottom = this.f52044b.getBottom();
            this.f52051i.getTop();
            int top = childAt.getTop();
            Bundle bundle = new Bundle();
            bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_TRANSLATE_Y.name());
            bundle.putStringArray("key_mediacmd_params", new String[]{bottom + "", top + ""});
            h0(bundle);
        }
    }

    void G0(DownloadTask downloadTask, int i4) {
        ForumBean.ForumPostsBean post;
        boolean z4 = false;
        for (int i5 = 0; i5 < this.f52048f.size(); i5++) {
            ForumData.ForumUserFavoritesData forumUserFavoritesData = this.f52048f.get(i5);
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
            D0();
        }
    }

    void H0(int i4, int i5) {
        if (getResources().getConfiguration().orientation == 2) {
            ViewCompat.setTranslationY(this.I, -this.I.getTop());
            return;
        }
        this.S = i4;
        this.T = i5;
        com.join.mgps.Util.w0.e("offsetContainer", "mTop=" + this.S, "mOffsetY=" + this.T);
        ViewCompat.setTranslationY(this.I, (float) this.T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void J0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        ForumProfileFavoritesAdapter forumProfileFavoritesAdapter = this.f52050h;
        if (forumProfileFavoritesAdapter != null) {
            forumProfileFavoritesAdapter.notifyDataSetChanged();
        }
    }

    void K0() {
        MyVideoView myVideoView = L1;
        if (myVideoView.isPlaying() && (myVideoView != null)) {
            L1.pause();
            this.L.setVisibility(0);
        }
    }

    void L0(String str, String str2) {
        String str3 = this.P;
        if (str3 != null && str3.equals(str) && L1.isPlaying()) {
            K0();
            return;
        }
        MyVideoView myVideoView = L1;
        if (myVideoView != null) {
            if (myVideoView.E() && this.P.equals(str)) {
                L1.seekTo(0);
                Z0();
            } else {
                L1.G();
            }
        }
        this.P = str;
        this.Q = str2;
        if (g2.h(str)) {
            p1();
            return;
        }
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        playVideo();
    }

    void M0(boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putString("key_mediacmd", MGMainActivity.MediaCmd.CMD_PLAY_BACKGROUND.name());
        bundle.putStringArray("key_mediacmd_params", new String[]{String.valueOf(z4)});
        h0(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void N0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this.f52071z)) {
                com.join.mgps.Util.j0.L0(this.f52071z);
                l2.a(this.f52071z).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this.f52071z, i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f52053k.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                X0(i4);
                j1();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void O0(ForumBean.GameInfo gameInfo) {
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
    public void P0(List<ForumData.ForumUserFavoritesData> list, int i4) {
        if (list != null && list.size() != 0) {
            if (i4 == 1) {
                this.f52048f.clear();
                this.f52057o = 1;
                q1();
            }
            this.f52048f.addAll(list);
        }
        q1();
        D0();
    }

    void V0() {
        if (this.R) {
            this.I.setVisibility(0);
        } else {
            this.I.setVisibility(8);
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
        for (ForumData.ForumUserFavoritesData forumUserFavoritesData : this.f52048f) {
            if (forumUserFavoritesData.getType() == 2 && forumUserFavoritesData.getPost() != null) {
                ForumBean.ForumPostsBean post = forumUserFavoritesData.getPost();
                if (post.getPid() == intExtra) {
                    post.setView(intExtra2);
                    post.setCommit(intExtra3);
                    post.setPraise(intExtra4);
                    post.setIs_praise(booleanExtra);
                    if (!booleanExtra2) {
                        this.f52048f.remove(post);
                    }
                    D0();
                    return;
                }
            }
        }
    }

    void X0(int i4) {
        List<ForumData.ForumUserFavoritesData> list = this.f52048f;
        if (list == null || list.size() == 0) {
            return;
        }
        for (ForumData.ForumUserFavoritesData forumUserFavoritesData : this.f52048f) {
            if (forumUserFavoritesData.getType() == 2) {
                ForumBean.ForumPostsBean post = forumUserFavoritesData.getPost();
                if (post == null) {
                    return;
                }
                if (post.getPid() == i4) {
                    post.setPraise(post.is_praise() ? post.getPraise() - 1 : post.getPraise() + 1);
                    post.setIs_praise(!post.is_praise());
                    D0();
                    return;
                }
            }
        }
    }

    RelativeLayout.LayoutParams Y0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.I.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.I.setPadding(0, 0, 0, 0);
        }
        RelativeLayout relativeLayout = this.J;
        if (relativeLayout == null) {
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
        }
        this.I.setTop(0);
        return layoutParams;
    }

    void Z0() {
        MyVideoView myVideoView = L1;
        if (myVideoView.E() & (myVideoView != null)) {
            this.M.setVisibility(8);
            this.K.setVisibility(8);
            this.L.setVisibility(8);
            L1.start();
            MediaController mediaController = this.N;
            if (mediaController != null) {
                mediaController.setVisibility(8);
                return;
            }
            return;
        }
        playVideo();
    }

    void a1(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
        if (forumUserFavoritesData == null) {
            return;
        }
        this.f52049g.add(new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.FAVORITE_ITEM_HEADER, new ForumProfileFavoritesAdapter.k0.a(false, forumUserFavoritesData.getType(), forumUserFavoritesData.getFav_time())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52053k = com.join.mgps.rpc.impl.g.A0();
        this.C = com.join.mgps.rpc.impl.d.P1();
        this.f52071z = getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.A = arguments.getInt("uid", 0);
        }
        I1 = getResources().getConfiguration().orientation;
        this.f52070y = AccountUtil_.getInstance_(this.f52071z).getAccountData();
        try {
            u0();
            w0();
            R();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void b1(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
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

    void c1(ForumData.ForumUserFavoritesData forumUserFavoritesData) {
        b1(forumUserFavoritesData);
        new ForumProfileFavoritesAdapter.k0(ForumProfileFavoritesAdapter.ViewType.GAME_ITEM, new ForumProfileFavoritesAdapter.k0.b(forumUserFavoritesData));
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f52059p0
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f52059p0
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.Z
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f52059p0
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.Z
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.Z
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f52059p0
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f52059p0
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.GmaeFormPostFragment.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    public void d0(AbsListView absListView, int i4, int i5, int i6) {
        if (this.E1 != i4 || i4 == 0) {
            this.E1 = i4;
            this.F1 = i5;
            this.G1 = i6;
        }
    }

    public void e0(AbsListView absListView, int i4) {
        if (i4 != 0) {
            return;
        }
        f0(absListView);
    }

    public void f0(AbsListView absListView) {
        try {
            if (!com.join.mgps.pref.h.n(this.f52071z).a()) {
                if (com.papa.gsyvideoplayer.d.e0().n() >= 0) {
                    com.papa.gsyvideoplayer.d.j0();
                    return;
                }
                return;
            }
            for (int i4 = 0; i4 < this.F1; i4++) {
                if (absListView != null && absListView.getChildAt(i4) != null && absListView.getChildAt(i4).findViewById(R.id.videoPlayer) != null) {
                    StandardVideoView standardVideoView = (StandardVideoView) absListView.getChildAt(i4).findViewById(R.id.videoPlayer);
                    Rect rect = new Rect();
                    standardVideoView.getLocalVisibleRect(rect);
                    int height = standardVideoView.getHeight();
                    StringBuilder sb = new StringBuilder();
                    sb.append("child=");
                    sb.append(i4);
                    sb.append(", videoHeight=");
                    sb.append(height);
                    sb.append(", rect.top:");
                    sb.append(rect.top);
                    sb.append(", rect.bottom:");
                    sb.append(rect.bottom);
                    if (rect.top == 0 && rect.bottom == height) {
                        int currentState = standardVideoView.getCurrentState();
                        if (currentState == 0 || currentState == 7) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("currentState=");
                            sb2.append(currentState);
                            sb2.append(" -->performClick");
                            if (com.join.android.app.common.utils.j.k(this.f52071z)) {
                                standardVideoView.startPlayLogic();
                                this.D1 = absListView;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            com.papa.gsyvideoplayer.d.j0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        getActivity().finish();
    }

    void g1() {
        RelativeLayout relativeLayout = this.J;
        if (relativeLayout == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = s0(this.f52071z);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.I.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mg_forum_post_item_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_top);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.mg_forum_item_video_padding_bottom);
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            this.I.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
        }
        this.J.postInvalidate();
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
                this.f52059p0.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    public void h0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("key_mediacmd");
        Object[] objArr = (Object[]) bundle.get("key_mediacmd_params");
        com.join.mgps.Util.w0.e("callbackPlayVideo", "cmd=" + string, "params=" + objArr.toString());
        if (string.equals(ForumProfileFavoritesActivity.MediaCmd.CMD_PLAY.name())) {
            String str = null;
            String str2 = null;
            for (int i4 = 0; i4 < objArr.length; i4++) {
                String str3 = (String) objArr[i4];
                if (i4 == 0) {
                    int parseInt = Integer.parseInt(str3);
                    if (parseInt == this.O) {
                        return;
                    }
                    p1();
                    this.O = parseInt;
                } else if (i4 == 1) {
                    str = str3;
                } else if (i4 == 2) {
                    str2 = str3;
                }
            }
            com.join.mgps.Util.w0.e("CMD_PLAY", "videoUrl=" + str, "coverUrl=" + str2);
            this.I.setVisibility(0);
            this.R = true;
            g1();
            L0(str, str2);
        } else if (string.equals(ForumProfileFavoritesActivity.MediaCmd.CMD_PLAY_BACKGROUND.name())) {
            if (this.O == -1) {
                return;
            }
            if (Boolean.parseBoolean((String) objArr[0])) {
                this.I.setVisibility(8);
                this.R = false;
                p1();
            } else if (this.O != -1) {
                this.I.setVisibility(0);
                this.R = true;
            }
        } else if (string.equals(ForumProfileFavoritesActivity.MediaCmd.CMD_PAUSE.name())) {
            K0();
        } else if (string.equals(ForumProfileFavoritesActivity.MediaCmd.CMD_STOP.name())) {
            p1();
        } else if (string.equals(ForumProfileFavoritesActivity.MediaCmd.CMD_FULLSCREEN.name())) {
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
            p0();
        } else if (string.equals(ForumProfileFavoritesActivity.MediaCmd.CMD_TRANSLATE_Y.name())) {
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
            H0(parseInt2, parseInt3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h1() {
        XListView2 xListView2 = this.f52051i;
        if (xListView2 != null) {
            xListView2.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(int i4, String str) {
        int i5;
        String str2;
        if (com.join.android.app.common.utils.j.j(this.f52071z)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f52071z).getAccountData();
            if (accountData != null) {
                i5 = this.A;
                if (i5 == 0) {
                    i5 = accountData.getUid();
                }
            } else {
                i5 = 0;
            }
            try {
                PackageInfo packageInfo = this.f52071z.getPackageManager().getPackageInfo(this.f52071z.getPackageName(), 0);
                str2 = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str2 = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str2);
            requestdetialFolowAndBeSpeak.setGame_id(str);
            requestdetialFolowAndBeSpeak.setUid(i5);
            requestdetialFolowAndBeSpeak.setMobile(accountData.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this.f52071z).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.C.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.C.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.C.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.C.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                w1(resultMainBean, i4, str);
                return;
            } else {
                l2.a(this.f52071z).b(getString(R.string.game_unfollow_failed));
                return;
            }
        }
        l2.a(this.f52071z).b(getString(R.string.network_conn_failed));
    }

    void i1(ForumBean.ForumPostsBean forumPostsBean) {
        if (forumPostsBean == null) {
            return;
        }
        if (this.G == null) {
            this.G = getActivity().findViewById(R.id.bottom);
        }
        if (this.F == null) {
            this.F = com.join.mgps.customview.c.z(this.f52071z);
        }
        this.F.m(this.E);
        com.join.mgps.customview.b bVar = this.F;
        if (bVar == null || bVar.isShowing()) {
            return;
        }
        this.F.p(this.G, forumPostsBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(int i4) {
        int i5;
        ForumLoadingView forumLoadingView = this.f52047e;
        if (forumLoadingView == null || (i5 = this.f52069x) == 32) {
            return;
        }
        if (i4 == 32) {
            this.f52069x = 32;
            forumLoadingView.j(2);
        } else if (i4 == 0) {
            this.f52069x = 0;
            forumLoadingView.m();
            this.f52047e.j(1);
        } else {
            this.f52069x = i4 | i5;
            if (k0(-11)) {
                this.f52069x = 16;
                this.f52047e.setFailedMsg("网络连接失败，再试试吧~");
                ForumLoadingView forumLoadingView2 = this.f52047e;
                forumLoadingView2.setListener(new c(forumLoadingView2));
                this.f52047e.j(9);
            } else if (k0(22)) {
                this.f52069x = 16;
                this.f52047e.setFailedMsg("还没有收藏内容~");
                ForumLoadingView forumLoadingView3 = this.f52047e;
                forumLoadingView3.setListener(new d(forumLoadingView3));
                this.f52047e.j(10);
                this.f52047e.setReloadingVisibility(0);
                this.f52047e.setFailedReloadingRes(R.drawable.papa_loading_null);
            } else if (!k0(31) && !k0(26)) {
                if (k0(17)) {
                    this.f52069x = 16;
                    this.f52047e.setFailedMsg("网络连接失败，再试试吧~");
                    ForumLoadingView forumLoadingView4 = this.f52047e;
                    forumLoadingView4.setListener(new f(forumLoadingView4));
                    this.f52047e.j(9);
                }
            } else {
                this.f52069x = 16;
                this.f52047e.setFailedMsg("加载失败，再试试吧~");
                ForumLoadingView forumLoadingView5 = this.f52047e;
                forumLoadingView5.setListener(new e(forumLoadingView5));
                this.f52047e.j(16);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j1() {
        com.join.mgps.Util.b0.f0(this.f52071z).m(this.f52071z);
    }

    boolean k0(int i4) {
        return (this.f52069x & i4) == i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k1() {
    }

    void l0() {
        if (this.f52049g == null) {
            return;
        }
        System.gc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0(Context context, int i4) {
        try {
            if (com.join.mgps.Util.j0.c0(context, i4) != null) {
                ForumResponse<ForumData.ForumPostsDeleteData> q02 = this.f52053k.q0(com.join.mgps.Util.j0.c0(context, i4).getParams());
                ForumData.ForumPostsDeleteData data = q02 != null ? q02.getData() : null;
                E0(i4, data != null && data.isResult());
            }
        } catch (Exception unused) {
            E0(i4, false);
        }
    }

    void m1(String str) {
        if (this.D == null) {
            this.D = com.join.mgps.Util.b0.f0(this.f52071z).d(this.f52071z, "取消收藏", "确定要取消收藏吗？", "取消", "确定", new u(str));
        }
        ((Button) this.D.findViewById(R.id.dialog_button_ok)).setOnClickListener(new v(str));
        Dialog dialog = this.D;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.D.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0(String str) {
        int i4;
        if (com.join.android.app.common.utils.j.j(this.f52071z)) {
            if (this.B1 == 1) {
                return;
            }
            try {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f52071z).getAccountData();
                    if (accountData != null) {
                        i4 = this.A;
                        if (i4 == 0) {
                            i4 = accountData.getUid();
                        }
                    } else {
                        i4 = 0;
                    }
                    ResultMainBean<List<DetailResultBean>> R = this.A1.R(RequestBeanUtil.getInstance(this.f52071z).getAppDetialBean(str, i4, null));
                    if (R != null && R.getFlag() != 0) {
                        List<DetailResultBean> data = R.getMessages().getData();
                        if (data.size() != 0) {
                            DetailResultBean detailResultBean = data.get(0);
                            if (this.C1) {
                                o1(detailResultBean);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o1(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        G0(downloadtaskDown, 0);
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(this.f52071z, downloadtaskDown.getCrc_link_type_val());
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.o1(this.f52071z, downloadtaskDown)) {
            return;
        }
        if (detailResultBean.getDown_status() == 5) {
            UtilsMy.l1(this.f52071z, downloadtaskDown);
        } else {
            UtilsMy.R0(this.f52071z, downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i5 == 3) {
            W0(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y1(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        com.join.android.app.component.video.c cVar = this.B;
        if (cVar != null) {
            cVar.G();
        }
        l0();
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
        switch (nVar.c()) {
            case 2:
                v1(a5, 1);
                return;
            case 3:
                v1(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                v1(a5, 5);
                return;
            case 6:
                v1(a5, 6);
                return;
            case 7:
                v1(a5, 3);
                return;
            case 8:
                Map<String, DownloadTask> map = this.Y;
                if (map == null || map.isEmpty()) {
                    return;
                }
                u1();
                return;
            case 10:
                v1(a5, 7);
                return;
            case 12:
                v1(a5, 8);
                return;
            case 13:
                v1(a5, 9);
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        p1();
        com.join.android.app.component.video.c cVar = this.B;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.c cVar = this.B;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f52060p1 = (i4 + i5) - 1;
        this.f52067v1 = i4;
        z1(absListView, i4, i5, i6);
        this.B.f(absListView, i4, i5, i6);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        A1(absListView, i4);
        this.B.j(absListView, i4);
    }

    void p0() {
        if (getResources().getConfiguration().orientation == 2) {
            M1 = false;
            n1();
            g1();
            H0(0, 0);
            return;
        }
        M1 = true;
        t0();
        Y0();
    }

    void p1() {
        MyVideoView myVideoView = L1;
        if (myVideoView != null) {
            myVideoView.seekTo(0);
            L1.I();
            this.O = -1;
            L1.G();
            this.M.setVisibility(8);
            MediaController mediaController = this.N;
            if (mediaController != null) {
                mediaController.setVisibility(8);
            }
            this.L.setVisibility(0);
            if (getResources().getConfiguration().orientation == 1) {
                this.I.setVisibility(8);
                this.R = false;
                return;
            }
            r1();
        }
    }

    ForumBean.ForumPostsBean q0(int i4) {
        List<ForumData.ForumUserFavoritesData> list = this.f52048f;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q1() {
        XListView2 xListView2 = this.f52051i;
        if (xListView2 != null) {
            if (xListView2.j()) {
                this.f52056n.sendEmptyMessageDelayed(0, 2000L);
            } else {
                this.f52056n.sendEmptyMessage(0);
            }
        }
    }

    ForumData.ForumUserFavoritesData r0(String str) {
        for (ForumData.ForumUserFavoritesData forumUserFavoritesData : this.f52048f) {
            if (forumUserFavoritesData.getType() == 1 && forumUserFavoritesData.getGame() != null && !TextUtils.isEmpty(forumUserFavoritesData.getGame().getGame_id()) && forumUserFavoritesData.getGame().getGame_id().equals(str)) {
                return forumUserFavoritesData;
            }
        }
        return null;
    }

    int s0(Context context) {
        if (context == null) {
            return 0;
        }
        if (this.U == 0) {
            Resources resources = context.getResources();
            this.U = (int) (((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.mg_forum_post_item_padding) * 2)) * 1.0f) / 1.8f);
        }
        return this.U;
    }

    void s1(DownloadTask downloadTask, int i4) {
        com.join.mgps.Util.w0.e(H1, "event=" + i4, "downloadTask=" + downloadTask.toString());
        ForumData.ForumUserFavoritesData r02 = r0(downloadTask.getCrc_link_type_val());
        if (r02 == null) {
            return;
        }
        if (i4 == 0 || i4 == 1) {
            r02.setDownloadTask(downloadTask);
        } else if (i4 == 2) {
            r02.setDownloadTask(null);
        } else if (i4 == 3 || i4 == 4) {
            r02.setDownloadTask(downloadTask);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4) {
            return;
        }
        getActivity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f52071z).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        l2.a(this.f52071z).b(str);
    }

    void t1(ForumProfileFavoritesAdapter.w wVar, DownloadTask downloadTask, DownloadTask downloadTask2) {
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

    void u0() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
    }

    public void v0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v1(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    S0(downloadTask);
                    return;
                case 3:
                    Q0(downloadTask);
                    return;
                case 4:
                    U0();
                    return;
                case 5:
                    T0(downloadTask);
                    return;
                case 6:
                    R0(downloadTask);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w1(ResultMainBean resultMainBean, int i4, String str) {
        if (i4 != 1) {
            return;
        }
        if (resultMainBean.getFlag() == 1) {
            ForumData.ForumUserFavoritesData r02 = r0(str);
            List<ForumData.ForumUserFavoritesData> list = this.f52048f;
            if (list != null && list.contains(r02)) {
                this.f52048f.remove(r02);
                com.join.mgps.Util.j0.h1(r02);
            }
            D0();
            return;
        }
        l2.a(this.f52071z).b(resultMainBean.getError_info());
    }

    boolean x0() {
        if (this.H == -1) {
            return false;
        }
        int firstVisiblePosition = this.f52051i.getFirstVisiblePosition();
        int lastVisiblePosition = this.f52051i.getLastVisiblePosition();
        int i4 = this.H;
        return i4 >= firstVisiblePosition - 0 && i4 <= lastVisiblePosition;
    }

    boolean x1() {
        if (c0(this.f52071z) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this.f52071z).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0() {
        z0();
    }

    public void y1(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.f52052j.setVisibility(4);
        } else {
            this.f52052j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z0() {
        try {
            ForumTable o4 = b2.t.p().o(ForumBean.ForumEvent.MyProfileFavorites);
            if (g2.h(o4.getArgs1())) {
                j0(18);
                return;
            }
            ForumData.ForumUserFavoritesDatas J = com.join.mgps.Util.j0.J(o4.getArgs1());
            List<ForumData.ForumUserFavoritesData> favorites_list = J != null ? J.getFavorites_list() : null;
            if (favorites_list != null && favorites_list.size() != 0) {
                int ceil = (int) Math.ceil((favorites_list.size() * 1.0f) / com.join.mgps.Util.j0.f27864d);
                this.f52057o = ceil;
                P0(favorites_list, ceil);
                j0(32);
                return;
            }
            j0(18);
        } catch (Exception e5) {
            j0(18);
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z1(AbsListView absListView, int i4, int i5, int i6) {
        F0();
    }
}
