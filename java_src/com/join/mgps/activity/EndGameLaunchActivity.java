package com.join.mgps.activity;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.join.android.app.common.http.d;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.EndGameBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import java.io.File;
import okhttp3.Request;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_end_game_launch)
/* loaded from: classes.dex */
public class EndGameLaunchActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f30181b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    FrameLayout f30182c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f30183d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f30184e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    EndGameBean f30185f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    int f30186g;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    String f30187h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f30188i;

    /* renamed from: j  reason: collision with root package name */
    private com.github.snowdream.android.app.downloader.b f30189j;

    /* renamed from: k  reason: collision with root package name */
    private b.InterfaceC0290b f30190k;

    /* renamed from: l  reason: collision with root package name */
    private String f30191l;

    /* renamed from: m  reason: collision with root package name */
    private String f30192m;

    /* renamed from: n  reason: collision with root package name */
    private int f30193n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f30194o;

    /* renamed from: p  reason: collision with root package name */
    Runnable f30195p = new b();

    /* renamed from: q  reason: collision with root package name */
    Runnable f30196q = new d();

    /* renamed from: r  reason: collision with root package name */
    Runnable f30197r = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends d.p<String> {
        a() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            Toast.makeText(EndGameLaunchActivity.this.f30188i, "回放失败！", 0).show();
            EndGameLaunchActivity.this.finish();
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            EndGameLaunchActivity.this.A0(str);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (EndGameLaunchActivity.this.f30193n < 80) {
                EndGameLaunchActivity.this.f30193n = 80;
            }
            EndGameLaunchActivity endGameLaunchActivity = EndGameLaunchActivity.this;
            endGameLaunchActivity.w0(endGameLaunchActivity.f30193n);
            if (EndGameLaunchActivity.this.f30193n < 100) {
                EndGameLaunchActivity.j0(EndGameLaunchActivity.this);
                if (((BaseAppCompatActivity) EndGameLaunchActivity.this).mHandler == null) {
                    ((BaseAppCompatActivity) EndGameLaunchActivity.this).mHandler = new Handler();
                }
                ((BaseAppCompatActivity) EndGameLaunchActivity.this).mHandler.postDelayed(this, 100L);
                return;
            }
            EndGameLaunchActivity.this.v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30200b;

        c(String str) {
            this.f30200b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameLaunchActivity.this.A0(this.f30200b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameLaunchActivity endGameLaunchActivity = EndGameLaunchActivity.this;
            endGameLaunchActivity.w0(endGameLaunchActivity.f30193n);
            if (EndGameLaunchActivity.this.f30193n <= 80) {
                EndGameLaunchActivity.j0(EndGameLaunchActivity.this);
                ((BaseAppCompatActivity) EndGameLaunchActivity.this).mHandler.postDelayed(this, 150L);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!EndGameLaunchActivity.this.f30194o && EndGameLaunchActivity.this.f30193n < 80) {
                EndGameLaunchActivity.this.f30193n = 80;
            }
            EndGameLaunchActivity endGameLaunchActivity = EndGameLaunchActivity.this;
            endGameLaunchActivity.w0(endGameLaunchActivity.f30193n);
            if (EndGameLaunchActivity.this.f30193n < 100) {
                if (EndGameLaunchActivity.this.f30194o) {
                    EndGameLaunchActivity.l0(EndGameLaunchActivity.this, 5);
                } else {
                    EndGameLaunchActivity.j0(EndGameLaunchActivity.this);
                }
                if (((BaseAppCompatActivity) EndGameLaunchActivity.this).mHandler == null) {
                    ((BaseAppCompatActivity) EndGameLaunchActivity.this).mHandler = new Handler();
                }
                ((BaseAppCompatActivity) EndGameLaunchActivity.this).mHandler.postDelayed(this, 100L);
                return;
            }
            GameMainV4DataBean.EndGameConfigBean endGameConfigBean = (GameMainV4DataBean.EndGameConfigBean) JsonMapper.getInstance().fromJson(new PrefDef_(EndGameLaunchActivity.this.f30188i).endGameConfig().d(), GameMainV4DataBean.EndGameConfigBean.class);
            String jsonString = (endGameConfigBean == null || endGameConfigBean.getEndgame_challenge_level() == null) ? "" : JsonMapper.toJsonString(endGameConfigBean.getEndgame_challenge_level());
            Activity activity = EndGameLaunchActivity.this.f30188i;
            String uid = AccountUtil_.getInstance_(EndGameLaunchActivity.this.f30188i).getUid();
            String str = EndGameLaunchActivity.this.f30184e;
            if (UtilsMy.R3(activity, uid, str, 16, EndGameLaunchActivity.this.f30192m + File.separator + EndGameLaunchActivity.this.f30191l, EndGameLaunchActivity.this.f30185f.getIndex(), EndGameLaunchActivity.this.f30185f.getDuration() / 1000, EndGameLaunchActivity.this.f30185f.getSubTitle(), EndGameLaunchActivity.this.f30185f.getEndgameId(), jsonString)) {
                EndGameLaunchActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements b.InterfaceC0290b {
        f() {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onError(String str) {
            EndGameLaunchActivity.this.showTost("下载存档失败");
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onFinish(String str) {
            EndGameLaunchActivity.this.y0();
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onProgress(String str, int i4, String str2) {
            EndGameLaunchActivity.this.w0(((i4 * 20) / 100) + 80);
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

    static /* synthetic */ int j0(EndGameLaunchActivity endGameLaunchActivity) {
        int i4 = endGameLaunchActivity.f30193n;
        endGameLaunchActivity.f30193n = i4 + 1;
        return i4;
    }

    static /* synthetic */ int l0(EndGameLaunchActivity endGameLaunchActivity, int i4) {
        int i5 = endGameLaunchActivity.f30193n + i4;
        endGameLaunchActivity.f30193n = i5;
        return i5;
    }

    private void u0() {
        this.f30189j = com.github.snowdream.android.app.downloader.b.e();
        f fVar = new f();
        this.f30190k = fVar;
        this.f30189j.m(fVar);
        this.f30189j.i();
    }

    private void x0(boolean z4) {
        if (this.f30186g == 15) {
            z0();
            return;
        }
        this.f30194o = z4;
        if (!z4) {
            w0(80);
        }
        if (this.f30185f == null) {
            showTost("获取残局信息失败");
            finish();
            return;
        }
        this.f30191l = this.f30185f.getEndgameId() + "_v2";
        this.f30192m = com.join.mgps.Util.v.f28110j;
        if (!new File(this.f30192m + File.separator + this.f30191l).exists()) {
            this.f30189j.b(new com.github.snowdream.android.app.downloader.c(this.f30185f.getArchive(), this.f30191l, this.f30192m, 0L));
            return;
        }
        y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0(String str) {
        Activity activity = this.f30188i;
        if (UtilsMy.j4(activity, AccountUtil_.getInstance_(activity).getUid(), p1.f.K().F(this.f30184e), this.f30186g, str, true)) {
            finish();
        } else {
            new Handler().postDelayed(new c(str), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        EndGameBean endGameBean;
        this.f30188i = this;
        com.join.mgps.Util.d0.a().d(this);
        u0();
        SimpleDraweeView simpleDraweeView = this.f30181b;
        if (simpleDraweeView != null && (endGameBean = this.f30185f) != null) {
            MyImageLoader.h(simpleDraweeView, endGameBean.getGameIcon());
        }
        DownloadTask F = p1.f.K().F(this.f30184e);
        if (F != null && F.getStatus() == 5) {
            x0(true);
            return;
        }
        ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("gameDownloadDetail", this.f30184e)).extra("fromRecomDown", true)).extra("_from", 157)).a();
        this.mHandler.postDelayed(this.f30196q, 150L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        b.InterfaceC0290b interfaceC0290b;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        com.join.mgps.Util.d0.a().e(this);
        com.github.snowdream.android.app.downloader.b bVar = this.f30189j;
        if (bVar != null && (interfaceC0290b = this.f30190k) != null) {
            bVar.j(interfaceC0290b);
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            DownloadTask F = p1.f.K().F(a5.getCrc_link_type_val());
            if (TextUtils.equals(a5.getCrc_link_type_val(), this.f30184e)) {
                double progress = F.getProgress();
                Double.isNaN(progress);
                w0((int) (progress * 0.5d));
            } else if (TextUtils.equals(a5.getCrc_link_type_val(), F.getPlugin_num())) {
                double progress2 = F.getProgress();
                Double.isNaN(progress2);
                w0(((int) (progress2 * 0.5d)) + 50);
            }
        } else if (c5 == 5 || c5 == 11 || c5 == 48) {
            DownloadTask F2 = p1.f.K().F(a5.getCrc_link_type_val());
            if (TextUtils.equals(a5.getCrc_link_type_val(), this.f30184e)) {
                w0(50);
                x0(false);
            } else if (TextUtils.equals(a5.getCrc_link_type_val(), F2.getPlugin_num())) {
                w0(100);
                x0(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    public void v0() {
        String str = com.join.mgps.Util.v.f28110j + "/record/";
        if (this.f30187h.isEmpty()) {
            Toast.makeText(this.f30188i, "回放失败！", 0).show();
            finish();
            return;
        }
        String str2 = this.f30187h;
        File file = new File(str + str2.substring(str2.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1));
        if (file.exists()) {
            A0(file.getPath());
        } else {
            com.join.android.app.common.http.d.B().a(this.f30187h, str, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > 100) {
            i4 = 100;
        }
        int i5 = this.f30193n;
        if (i4 < i5) {
            i4 = i5;
        }
        ViewGroup.LayoutParams layoutParams = this.f30182c.getLayoutParams();
        layoutParams.width = (getResources().getDimensionPixelSize(R.dimen.wdp1016) * i4) / 100;
        this.f30182c.setLayoutParams(layoutParams);
        this.f30193n = i4;
        TextView textView = this.f30183d;
        textView.setText("正在进入游戏" + i4 + "%");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.removeCallbacks(this.f30197r);
        this.mHandler.postDelayed(this.f30197r, 100L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.removeCallbacks(this.f30195p);
        this.mHandler.postDelayed(this.f30195p, 100L);
    }
}
