package com.join.mgps.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.BaseActivity;
import com.beizi.fusion.widget.ScrollClickView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.dialog_download_method_prompt)
/* loaded from: classes4.dex */
public class DownloadMethodPromptDialog extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f49113b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f49114c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f49115d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f49116e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f49117f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f49118g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f49119h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f49120i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f49121j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f49122k;
    @Pref

    /* renamed from: l  reason: collision with root package name */
    PrefDef_ f49123l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f49124m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    String f49125n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    boolean f49126o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    boolean f49127p;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    boolean f49128q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    QueryDownloadInfoResponseData f49129r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    int f49130s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    int f49131t;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.rpc.k f49132u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    View f49133v;

    /* renamed from: w  reason: collision with root package name */
    b f49134w;

    /* renamed from: x  reason: collision with root package name */
    private ContentObserver f49135x = new a(new Handler());

    /* loaded from: classes4.dex */
    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            int i4;
            if (Build.VERSION.SDK_INT < 21) {
                i4 = Settings.System.getInt(DownloadMethodPromptDialog.this.getContentResolver(), "navigationbar_is_min", 0);
            } else {
                i4 = Settings.Global.getInt(DownloadMethodPromptDialog.this.getContentResolver(), "navigationbar_is_min", 0);
            }
            if (i4 == 1) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) DownloadMethodPromptDialog.this.f49133v.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                DownloadMethodPromptDialog.this.f49133v.setLayoutParams(layoutParams);
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) DownloadMethodPromptDialog.this.f49133v.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = DownloadMethodPromptDialog.this.getNavigationBarHeight();
            DownloadMethodPromptDialog.this.f49133v.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
            int i4 = 0;
            if (DownloadMethodPromptDialog.this.isNavigationBarShow()) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) DownloadMethodPromptDialog.this.f49133v.getLayoutParams();
                int navigationBarHeight = DownloadMethodPromptDialog.this.getNavigationBarHeight();
                if (!com.join.mgps.Util.k1.e() || Build.VERSION.SDK_INT > 19) {
                    i4 = navigationBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
                DownloadMethodPromptDialog.this.f49133v.setLayoutParams(layoutParams);
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) DownloadMethodPromptDialog.this.f49133v.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            DownloadMethodPromptDialog.this.f49133v.setLayoutParams(layoutParams2);
        }
    }

    public static boolean checkDeviceHasNavigationBar(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", q.a.f73126a);
        boolean z4 = false;
        boolean z5 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if (!"1".equals(str)) {
                z4 = "0".equals(str) ? true : z5;
            }
            return z4;
        } catch (Exception unused) {
            return z5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNavigationBarHeight() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", q.a.f73126a));
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    private void registerNavigationBarObserver() {
        if (Build.VERSION.SDK_INT < 21) {
            getContentResolver().registerContentObserver(Settings.System.getUriFor("navigationbar_is_min"), true, this.f49135x);
        } else {
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_is_min"), true, this.f49135x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f49132u = com.join.mgps.rpc.impl.i.D0();
        com.papa.sim.statistic.p.l(this).Y0(Event.showCopyright, AccountUtil_.getInstance_(this).getUid(), this.f49124m);
        if (TextUtils.isEmpty(this.f49124m)) {
            finish();
            return;
        }
        if (this.f49126o) {
            this.f49115d.setVisibility(4);
        }
        this.f49122k.setText("《悟饭游戏厅下载协议》");
        j0();
        QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49129r;
        if (queryDownloadInfoResponseData == null) {
            k0();
        } else {
            update(queryDownloadInfoResponseData);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        com.papa.sim.statistic.p.l(this).Y0(Event.closeCopyright, AccountUtil_.getInstance_(this).getUid(), this.f49124m);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(String str) {
        com.join.mgps.Util.l2.a(getApplicationContext()).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        String uid = AccountUtil_.getInstance_(this).getUid();
        if (this.f49129r == null) {
            g0("获取信息失败");
        } else if (!this.f49113b.isSelected()) {
            g0("请先同意用户协议");
        } else if (TextUtils.isEmpty(this.f49129r.getBtnStatus())) {
        } else {
            if ("open".equals(this.f49129r.getBtnStatus())) {
                o0();
            } else if (ScrollClickView.DIR_DOWN.equals(this.f49129r.getBtnStatus())) {
                com.papa.sim.statistic.p.l(this).Y0(Event.downloadCopyright, uid, this.f49124m);
                DownloadTask F = p1.f.K().F(this.f49124m);
                if (this.f49129r != null && F != null && (F.getStatus() == 9 || F.getStatus() == 9)) {
                    if (!TextUtils.isEmpty(F.getCrc_link_type_val())) {
                        com.php25.PDownload.d.b(F);
                        F.setVer(this.f49129r.getVer());
                        F.setVer_name(this.f49129r.getVer_name());
                        F.setUrl(this.f49129r.getDownloadURL());
                        F.setResource_url_remote(this.f49129r.getResourceURL());
                        F.setActual_size(this.f49129r.getActualSize());
                        F.setRes_actual_size(this.f49129r.getResourceSize());
                        F.setExt(this.f49125n);
                        F.setFromRecomDown(this.f49127p);
                        F.setDisableShowSpeedUpPrompt(this.f49128q);
                        com.php25.PDownload.d.c(F, this);
                    }
                } else {
                    CommonService_.h2 h2Var = (CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("downGameId", this.f49124m)).extra("ext", this.f49125n)).extra("data", this.f49129r)).extra("_from", this.f49130s)).extra("_from_type", this.f49131t)).extra("fromRecomDown", this.f49127p)).extra("disableShowSpeedUpPrompt", this.f49128q);
                    QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49129r;
                    ((CommonService_.h2) ((CommonService_.h2) h2Var.extra("resourceSize", queryDownloadInfoResponseData != null ? queryDownloadInfoResponseData.getResourceSize() : 0L)).extra("uncheckSelfSupport", true)).a();
                }
                finish();
            }
        }
    }

    public boolean isNavigationBarShow() {
        if (Build.VERSION.SDK_INT < 17) {
            return (ViewConfiguration.get(this).hasPermanentMenuKey() || KeyCharacterMap.deviceHasKey(4)) ? false : true;
        }
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.join.mgps.Util.k1.e()) {
            return com.join.mgps.Util.k1.a(this) && !com.join.mgps.Util.k1.f(this);
        }
        if (com.join.mgps.Util.k1.g() && Settings.Global.getInt(getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return false;
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return point2.y != point.y;
    }

    void j0() {
        try {
            registerContentResolver();
            if (checkDeviceHasNavigationBar(this) && isNavigationBarShow()) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f49133v.getLayoutParams();
                int navigationBarHeight = getNavigationBarHeight();
                if (com.join.mgps.Util.k1.e() && Build.VERSION.SDK_INT <= 19) {
                    navigationBarHeight = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = navigationBarHeight;
                this.f49133v.setLayoutParams(layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                String uid = AccountUtil_.getInstance_(this).getUid();
                String token = AccountUtil_.getInstance_(this).getToken();
                RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this);
                QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                queryDownloadInfoRequestArgs.setGameId(this.f49124m);
                queryDownloadInfoRequestArgs.setUid(uid);
                queryDownloadInfoRequestArgs.setToken(token);
                requestModel.setArgs(queryDownloadInfoRequestArgs);
                ResponseModel<QueryDownloadInfoResponseData> q4 = this.f49132u.q(requestModel);
                if (q4 == null || q4.getCode() != 600 || q4.getData() == null) {
                    return;
                }
                update(q4.getData());
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        g0(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        p0(!this.f49114c.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        com.papa.sim.statistic.p.l(this).Y0(Event.closeCopyright, AccountUtil_.getInstance_(this).getUid(), this.f49124m);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49129r;
        IntentUtil.getInstance().goShareWebActivity(this, queryDownloadInfoResponseData != null ? queryDownloadInfoResponseData.getUserProtocolURL() : "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        com.papa.sim.statistic.p.l(this).Y0(Event.openSourceUrl, AccountUtil_.getInstance_(this).getUid(), this.f49124m);
        QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49129r;
        IntentUtil.getInstance().goShareWebActivity(this, queryDownloadInfoResponseData != null ? queryDownloadInfoResponseData.getDownloadHTML() : "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            getContentResolver().unregisterContentObserver(this.f49134w);
            getContentResolver().unregisterContentObserver(this.f49135x);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void p0(boolean z4) {
        QueryDownloadInfoResponseData queryDownloadInfoResponseData;
        if (z4) {
            if (this.f49126o || (queryDownloadInfoResponseData = this.f49129r) == null || TextUtils.isEmpty(queryDownloadInfoResponseData.getBtnStatus()) || this.f49129r.getBtnStatus().equals("open")) {
                return;
            }
            if (!this.f49113b.isSelected()) {
                g0("请先同意用户协议");
                return;
            }
        }
        this.f49114c.setSelected(z4);
        this.f49123l.noPromptDownload().g(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void protocolCheckPlaceholder() {
        this.f49113b.setSelected(!this.f49113b.isSelected());
        boolean isSelected = this.f49113b.isSelected();
        this.f49119h.setBackgroundResource(isSelected ? R.drawable.shape_view_bg1 : R.drawable.shape_view_bg2);
        if (isSelected || this.f49115d.getVisibility() != 0) {
            return;
        }
        p0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        l0();
    }

    void registerContentResolver() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f49134w = new b(new Handler());
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_hide_bar_enabled"), true, this.f49134w);
            registerNavigationBarObserver();
        }
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        com.join.mgps.Util.c2.o(this, 16777215, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void update(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
        if (queryDownloadInfoResponseData == null) {
            return;
        }
        this.f49129r = queryDownloadInfoResponseData;
        if (!TextUtils.isEmpty(queryDownloadInfoResponseData.getBtnStatus())) {
            if ("open".equals(queryDownloadInfoResponseData.getBtnStatus())) {
                this.f49119h.setText("立即打开");
                this.f49115d.setVisibility(4);
            } else if (ScrollClickView.DIR_DOWN.equals(queryDownloadInfoResponseData.getBtnStatus())) {
                this.f49119h.setText("立即下载");
                if (!this.f49126o) {
                    this.f49115d.setVisibility(0);
                    if (queryDownloadInfoResponseData.isSelectedNextTips() && queryDownloadInfoResponseData.isSelectedUserProtocol()) {
                        this.f49114c.setSelected(true);
                    } else {
                        this.f49114c.setSelected(false);
                    }
                    this.f49123l.noPromptDownload().g(Boolean.valueOf(this.f49114c.isSelected()));
                }
            }
        }
        this.f49117f.setText(queryDownloadInfoResponseData.getGameName());
        this.f49116e.setText(queryDownloadInfoResponseData.getTitle());
        this.f49120i.setText(queryDownloadInfoResponseData.getSubTitle());
        this.f49121j.setText(queryDownloadInfoResponseData.getUserProtocolTxt());
        this.f49118g.setText(queryDownloadInfoResponseData.getDownloadHTML());
        this.f49113b.setSelected(queryDownloadInfoResponseData.isSelectedUserProtocol());
        this.f49119h.setBackgroundResource(this.f49113b.isSelected() ? R.drawable.shape_view_bg1 : R.drawable.shape_view_bg2);
    }
}
