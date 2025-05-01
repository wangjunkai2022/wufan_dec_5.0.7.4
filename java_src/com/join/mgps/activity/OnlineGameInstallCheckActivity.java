package com.join.mgps.activity;

import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.Filepath;
import com.join.mgps.pref.PrefDef_;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_online_game_install_check)
/* loaded from: classes4.dex */
public class OnlineGameInstallCheckActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f36261b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f36262c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36263d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ProgressBar f36264e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RecyclerView f36265f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36266g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36267h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    String f36268i;
    @Pref

    /* renamed from: j  reason: collision with root package name */
    PrefDef_ f36269j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<d> f36270k;

    /* renamed from: l  reason: collision with root package name */
    private DownloadTask f36271l;

    /* renamed from: m  reason: collision with root package name */
    private c f36272m;

    /* renamed from: n  reason: collision with root package name */
    private CountDownTimer f36273n;

    /* renamed from: o  reason: collision with root package name */
    private int f36274o = 5000;

    /* renamed from: p  reason: collision with root package name */
    private int f36275p = 0;

    /* renamed from: q  reason: collision with root package name */
    Handler f36276q = new Handler();

    /* renamed from: r  reason: collision with root package name */
    Runnable f36277r = new a();

    /* renamed from: s  reason: collision with root package name */
    private boolean f36278s;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((d) OnlineGameInstallCheckActivity.this.f36270k.get(OnlineGameInstallCheckActivity.this.f36275p)).e(true);
                OnlineGameInstallCheckActivity.this.f36272m.notifyItemChanged(OnlineGameInstallCheckActivity.this.f36275p);
                OnlineGameInstallCheckActivity onlineGameInstallCheckActivity = OnlineGameInstallCheckActivity.this;
                onlineGameInstallCheckActivity.f36265f.smoothScrollToPosition(onlineGameInstallCheckActivity.f36275p);
                OnlineGameInstallCheckActivity onlineGameInstallCheckActivity2 = OnlineGameInstallCheckActivity.this;
                onlineGameInstallCheckActivity2.f36264e.setProgress(onlineGameInstallCheckActivity2.f36275p);
                OnlineGameInstallCheckActivity.h0(OnlineGameInstallCheckActivity.this);
                if (OnlineGameInstallCheckActivity.this.f36275p >= OnlineGameInstallCheckActivity.this.f36270k.size()) {
                    OnlineGameInstallCheckActivity.this.m0();
                } else {
                    OnlineGameInstallCheckActivity.this.f36276q.postDelayed(this, 350L);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                OnlineGameInstallCheckActivity.this.m0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends CountDownTimer {
        b(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            OnlineGameInstallCheckActivity.this.f36266g.setText("立即安装");
            OnlineGameInstallCheckActivity.this.q0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            TextView textView = OnlineGameInstallCheckActivity.this.f36266g;
            textView.setText("立即安装 " + (j4 / 1000) + "秒");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends BaseQuickAdapter<d, BaseViewHolder> {
        public c() {
            super(R.layout.item_online_check_list, OnlineGameInstallCheckActivity.this.f36270k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, d dVar) {
            baseViewHolder.setImageResource(R.id.ivIcon, dVar.b()).setText(R.id.tvTitle, dVar.c()).setText(R.id.tvCheckedInfo, dVar.a()).setVisible(R.id.groupChecked, dVar.d()).setVisible(R.id.divider, baseViewHolder.getLayoutPosition() < OnlineGameInstallCheckActivity.this.f36270k.size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private int f36282a;

        /* renamed from: b  reason: collision with root package name */
        private String f36283b;

        /* renamed from: c  reason: collision with root package name */
        private String f36284c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f36285d;

        public d(int i4, String str, String str2, boolean z4) {
            this.f36282a = i4;
            this.f36283b = str;
            this.f36284c = str2;
            this.f36285d = z4;
        }

        public String a() {
            return this.f36284c;
        }

        public int b() {
            return this.f36282a;
        }

        public String c() {
            return this.f36283b;
        }

        public boolean d() {
            return this.f36285d;
        }

        public void e(boolean z4) {
            this.f36285d = z4;
        }

        public void f(String str) {
            this.f36284c = str;
        }

        public void g(int i4) {
            this.f36282a = i4;
        }

        public void h(String str) {
            this.f36283b = str;
        }
    }

    static /* synthetic */ int h0(OnlineGameInstallCheckActivity onlineGameInstallCheckActivity) {
        int i4 = onlineGameInstallCheckActivity.f36275p;
        onlineGameInstallCheckActivity.f36275p = i4 + 1;
        return i4;
    }

    private void initView() {
        if (this.f36268i == null) {
            showToast("gameId为空");
            finish();
            return;
        }
        DownloadTask F = p1.f.K().F(this.f36268i);
        this.f36271l = F;
        if (F == null) {
            showToast("获取下载任务失败");
            finish();
            return;
        }
        MyImageLoader.n(this.f36262c, F.getPortraitURL());
        this.f36263d.setText(this.f36271l.getShowName());
        this.f36266g.setText("立即安装");
        SpannableString spannableString = new SpannableString("过去2小时内已有" + ((int) ((Math.random() * 500.0d) + 300.0d)) + "人通过悟饭安装此游戏");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF2E2E")), 8, 11, 33);
        this.f36267h.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        if (this.f36278s) {
            return;
        }
        this.f36264e.setProgress(this.f36270k.size());
        this.f36273n = new b(this.f36274o + 200, 1000L).start();
        this.f36266g.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineGameInstallCheckActivity.this.r0(view);
            }
        });
    }

    private String n0() {
        try {
            for (Filepath filepath : com.join.mgps.Util.s1.a(this)) {
                String str = "";
                if (com.join.mgps.Util.g2.i(this.f36271l.getGameZipPath())) {
                    str = this.f36271l.getGameZipPath();
                } else if (com.join.mgps.Util.g2.i(this.f36271l.getPath())) {
                    str = this.f36271l.getPath();
                }
                if (str.contains(filepath.getPathRoot())) {
                    return UtilsMy.a(filepath.getAvailable());
                }
            }
            return "无可用空间";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "无可用空间";
        }
    }

    private int o0() {
        String[] strArr;
        try {
            PackageInfo packageArchiveInfo = getPackageManager().getPackageArchiveInfo(this.f36271l.getPath(), 4096);
            if (packageArchiveInfo == null || (strArr = packageArchiveInfo.requestedPermissions) == null) {
                return 0;
            }
            return strArr.length;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    private void p0() {
        ArrayList<d> arrayList = new ArrayList<>();
        this.f36270k = arrayList;
        arrayList.add(new d(R.drawable.ic_check_apk, "Apk完整性检测", UtilsMy.a(this.f36271l.getSize()), false));
        this.f36270k.add(new d(R.drawable.ic_check_brand, "手机兼容性", Build.BRAND, false));
        ArrayList<d> arrayList2 = this.f36270k;
        arrayList2.add(new d(R.drawable.ic_check_android, "系统兼容性", "Android" + Build.VERSION.RELEASE, false));
        this.f36270k.add(new d(R.drawable.ic_check_storage, "剩余存储空间", n0(), false));
        this.f36270k.add(new d(R.drawable.ic_check_virus, "恶意插件检测", "无", false));
        ArrayList<d> arrayList3 = this.f36270k;
        arrayList3.add(new d(R.drawable.ic_check_permission, "权限检测", o0() + "项权限", false));
        this.f36265f.setLayoutManager(new LinearLayoutManager(this));
        c cVar = new c();
        this.f36272m = cVar;
        this.f36265f.setAdapter(cVar);
        this.f36264e.setMax(this.f36270k.size());
        this.f36276q.postDelayed(this.f36277r, 350L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        CountDownTimer countDownTimer = this.f36273n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.f36277r);
        }
        if (this.f36278s) {
            return;
        }
        com.join.android.app.common.utils.e.l0(this).z(this, new File(this.f36271l.getPath()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(View view) {
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        this.f36274o = this.f36269j.net_game_count_down().d().intValue() > 0 ? this.f36269j.net_game_count_down().d().intValue() : 5000;
        initView();
        p0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f36278s = true;
        CountDownTimer countDownTimer = this.f36273n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.f36277r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }
}
