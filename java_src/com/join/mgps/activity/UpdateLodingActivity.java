package com.join.mgps.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.UpdateIntentDataBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.UpdateLodingService;
import java.io.File;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.update_loding_layout)
/* loaded from: classes4.dex */
public class UpdateLodingActivity extends BaseActivity implements UpdateLodingService.d {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f38254b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ProgressBar f38255c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f38256d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ProgressBar f38257e;
    @Pref

    /* renamed from: f  reason: collision with root package name */
    PrefDef_ f38258f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    UpdateIntentDataBean f38259g;

    /* renamed from: h  reason: collision with root package name */
    DownloadTask f38260h;

    /* renamed from: i  reason: collision with root package name */
    boolean f38261i;

    /* renamed from: j  reason: collision with root package name */
    boolean f38262j;

    /* renamed from: k  reason: collision with root package name */
    boolean f38263k;

    /* renamed from: l  reason: collision with root package name */
    int f38264l;

    /* renamed from: m  reason: collision with root package name */
    EMUApkTable f38265m;

    /* renamed from: n  reason: collision with root package name */
    boolean f38266n;

    /* renamed from: o  reason: collision with root package name */
    boolean f38267o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f38268p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f38269q;

    /* renamed from: r  reason: collision with root package name */
    private int f38270r;

    /* renamed from: s  reason: collision with root package name */
    private UpdateLodingService f38271s;

    /* renamed from: t  reason: collision with root package name */
    private UpdateLodingService.c f38272t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f38273u = false;

    /* renamed from: v  reason: collision with root package name */
    private ServiceConnection f38274v = new a();

    /* renamed from: w  reason: collision with root package name */
    private UpdateLodingService.d f38275w;

    /* renamed from: x  reason: collision with root package name */
    Context f38276x;

    /* loaded from: classes4.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            UpdateLodingService.c cVar = (UpdateLodingService.c) iBinder;
            UpdateLodingActivity.this.f38272t = cVar;
            UpdateLodingActivity.this.f38271s = cVar.getService();
            UpdateLodingActivity.this.f38271s.m(UpdateLodingActivity.this);
            UpdateLodingActivity updateLodingActivity = UpdateLodingActivity.this;
            if (updateLodingActivity.f38261i) {
                updateLodingActivity.f38270r = 0;
                UpdateLodingActivity.this.f38272t.setDownData(UpdateLodingActivity.this.f38260h.getCrc_link_type_val(), 0);
            } else if (updateLodingActivity.f38262j) {
                updateLodingActivity.f38270r = 1;
                UpdateLodingActivity.this.f38272t.setDownData(UpdateLodingActivity.this.f38260h.getCrc_link_type_val(), 1);
            } else if (updateLodingActivity.f38263k) {
                updateLodingActivity.f38270r = 2;
                UpdateLodingActivity.this.f38272t.setDownData(UpdateLodingActivity.this.f38260h.getCrc_link_type_val(), 2);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            UpdateLodingActivity.this.f38271s = null;
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38278b;

        b(com.join.mgps.dialog.r0 r0Var) {
            this.f38278b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38278b.dismiss();
            UpdateLodingActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38280b;

        c(com.join.mgps.dialog.r0 r0Var) {
            this.f38280b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38280b.dismiss();
            UtilsMy.w3(UpdateLodingActivity.this.f38276x);
            UpdateLodingActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38282b;

        d(com.join.mgps.dialog.r0 r0Var) {
            this.f38282b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38282b.dismiss();
            UpdateLodingActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38284b;

        e(com.join.mgps.dialog.r0 r0Var) {
            this.f38284b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38284b.dismiss();
            UtilsMy.w3(UpdateLodingActivity.this.f38276x);
            UpdateLodingActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38286b;

        f(com.join.mgps.dialog.r0 r0Var) {
            this.f38286b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38286b.dismiss();
            UpdateLodingActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38288b;

        g(com.join.mgps.dialog.r0 r0Var) {
            this.f38288b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38288b.dismiss();
            UtilsMy.w3(UpdateLodingActivity.this.f38276x);
            UpdateLodingActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38290b;

        h(com.join.mgps.dialog.r0 r0Var) {
            this.f38290b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38290b.dismiss();
            UpdateLodingActivity.this.f38271s.l();
            UpdateLodingActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.r0 f38292b;

        i(com.join.mgps.dialog.r0 r0Var) {
            this.f38292b = r0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38292b.dismiss();
        }
    }

    private void m0() {
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f38276x = this;
        if (this.f38267o || this.f38268p || this.f38269q) {
            com.join.mgps.Util.l2.a(this).b("需要更新完才能进入游戏。");
        }
        this.f38260h = this.f38259g.getDownloadTask();
        this.f38261i = this.f38259g.isRomeNewUpdate();
        this.f38262j = this.f38259g.isPeizhiNewUpdate();
        this.f38263k = this.f38259g.isSourceNewUpdate();
        this.f38265m = this.f38259g.getEmuApkTable();
        this.f38266n = this.f38259g.isFight();
        this.f38267o = this.f38259g.isRomeMustUpdate();
        this.f38268p = this.f38259g.isPeizhiMustUpdate();
        this.f38269q = this.f38259g.isSourceMustUpdate();
        String str = this.f38260h.getSource_down_path() + "/platform_pic_loading.jpg";
        if (new File(str).exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            this.f38254b.setImageBitmap(BitmapFactory.decodeFile(str, options));
        } else {
            this.f38254b.setImageResource(R.drawable.updateloding);
        }
        bindService(new Intent(this.f38276x, UpdateLodingService.class), this.f38274v, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        if (this.f38273u) {
            return;
        }
        if (!this.f38266n && this.f38260h.getDown_status() != 5) {
            IntentUtil.getInstance().goGameMainActivity(this.f38276x, this.f38260h.getCrc_link_type_val(), "");
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.join.mgps.dialog.r0 u4 = com.join.mgps.Util.b0.f0(this.f38276x).u(this.f38276x);
        u4.show();
        u4.j("停止更新？");
        u4.f("退出后需重新更新游戏。");
        u4.i("继续更新");
        u4.e("退出");
        u4.d(new h(u4));
        u4.h(new i(u4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f38273u = true;
        unbindService(this.f38274v);
        super.onDestroy();
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
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // com.join.mgps.service.UpdateLodingService.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(int r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.UpdateLodingActivity.update(int, java.lang.Object):void");
    }
}
