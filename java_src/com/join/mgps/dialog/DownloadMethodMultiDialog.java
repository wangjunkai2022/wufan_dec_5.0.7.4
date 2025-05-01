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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseActivity;
import com.beizi.fusion.widget.ScrollClickView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dialog.DownloadMethodMultiDialog;
import com.join.mgps.dto.DownloadGameArgsBean;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.layout_sheet_game_resource)
/* loaded from: classes4.dex */
public class DownloadMethodMultiDialog extends BaseActivity {
    private c A;
    private boolean B;
    @ViewById
    View C;
    b D;
    private ContentObserver E = new a(new Handler());
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f49072b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f49073c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f49074d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f49075e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f49076f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f49077g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f49078h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f49079i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f49080j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f49081k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f49082l;
    @Pref

    /* renamed from: m  reason: collision with root package name */
    PrefDef_ f49083m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    String f49084n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    String f49085o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    boolean f49086p;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    boolean f49087q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    DownloadGameArgsBean f49088r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    boolean f49089s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    QueryDownloadInfoResponseData f49090t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    int f49091u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    int f49092v;
    @Extra

    /* renamed from: w  reason: collision with root package name */
    ArrayList<String> f49093w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    boolean f49094x;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.rpc.k f49095y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f49096z;

    /* loaded from: classes4.dex */
    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            int i4;
            if (Build.VERSION.SDK_INT < 21) {
                i4 = Settings.System.getInt(DownloadMethodMultiDialog.this.getContentResolver(), "navigationbar_is_min", 0);
            } else {
                i4 = Settings.Global.getInt(DownloadMethodMultiDialog.this.getContentResolver(), "navigationbar_is_min", 0);
            }
            if (i4 == 1) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) DownloadMethodMultiDialog.this.C.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                DownloadMethodMultiDialog.this.C.setLayoutParams(layoutParams);
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) DownloadMethodMultiDialog.this.C.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = DownloadMethodMultiDialog.this.getNavigationBarHeight();
            DownloadMethodMultiDialog.this.C.setLayoutParams(layoutParams2);
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
            if (DownloadMethodMultiDialog.this.isNavigationBarShow()) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) DownloadMethodMultiDialog.this.C.getLayoutParams();
                int navigationBarHeight = DownloadMethodMultiDialog.this.getNavigationBarHeight();
                if (!com.join.mgps.Util.k1.e() || Build.VERSION.SDK_INT > 19) {
                    i4 = navigationBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
                DownloadMethodMultiDialog.this.C.setLayoutParams(layoutParams);
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) DownloadMethodMultiDialog.this.C.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            DownloadMethodMultiDialog.this.C.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends BaseQuickAdapter<String, BaseViewHolder> {
        public c(@Nullable List<String> list) {
            super(R.layout.layout_sheet_game_resource_item, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str, View view) {
            DownloadMethodMultiDialog downloadMethodMultiDialog = DownloadMethodMultiDialog.this;
            if (downloadMethodMultiDialog.f49090t == null) {
                downloadMethodMultiDialog.h0("获取信息失败");
            } else if (!downloadMethodMultiDialog.f49079i.isSelected()) {
                DownloadMethodMultiDialog.this.h0("请先同意用户协议");
            } else {
                IntentUtil.getInstance().goShareWebActivity(this.mContext, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final String str) {
            baseViewHolder.setText(R.id.tvGameName, DownloadMethodMultiDialog.this.f49090t.getGameName()).setText(R.id.tvGameUrl, str);
            baseViewHolder.setVisible(R.id.divider, baseViewHolder.getLayoutPosition() < getItemCount() - 1);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DownloadMethodMultiDialog.c.this.c(str, view);
                }
            });
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

    private void m0(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
        final List<String> downloadHtmls = queryDownloadInfoResponseData.getDownloadHtmls();
        new ArrayList();
        if (downloadHtmls != null) {
            this.f49072b.setLayoutManager(new LinearLayoutManager(this));
            c cVar = new c((downloadHtmls.size() <= 3 || this.f49096z) ? downloadHtmls : downloadHtmls.subList(0, 3));
            this.A = cVar;
            this.f49072b.setAdapter(cVar);
            if (downloadHtmls.size() <= 3 || this.f49096z) {
                return;
            }
            View inflate = LayoutInflater.from(this).inflate(R.layout.item_game_resource_footer, (ViewGroup) null);
            inflate.findViewById(R.id.footer).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DownloadMethodMultiDialog.this.n0(downloadHtmls, view);
                }
            });
            this.A.addFooterView(inflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(List list, View view) {
        this.f49096z = true;
        this.A.setNewData(list);
        this.A.removeAllFooterView();
    }

    private void registerNavigationBarObserver() {
        if (Build.VERSION.SDK_INT < 21) {
            getContentResolver().registerContentObserver(Settings.System.getUriFor("navigationbar_is_min"), true, this.E);
        } else {
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_is_min"), true, this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f49095y = com.join.mgps.rpc.impl.i.D0();
        com.papa.sim.statistic.p.l(this).Y0(Event.showCopyright, AccountUtil_.getInstance_(this).getUid(), this.f49084n);
        if (TextUtils.isEmpty(this.f49084n)) {
            finish();
            return;
        }
        if (this.f49086p) {
            this.f49082l.setVisibility(8);
        }
        this.f49078h.setText("《悟饭游戏厅下载协议》");
        l0();
        QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49090t;
        if (queryDownloadInfoResponseData == null) {
            p0();
        } else {
            update(queryDownloadInfoResponseData);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        com.papa.sim.statistic.p.l(this).Y0(Event.closeCopyright, AccountUtil_.getInstance_(this).getUid(), this.f49084n);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(String str) {
        com.join.mgps.Util.l2.a(getApplicationContext()).b(str);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        this.f49079i.setSelected(!this.f49079i.isSelected());
        boolean isSelected = this.f49079i.isSelected();
        this.f49075e.setBackgroundResource(isSelected ? R.drawable.detail_simple_multi_bg : R.drawable.shape_view_bg2);
        this.f49079i.setImageResource(isSelected ? R.drawable.ic_copyright_checkbox_selected : R.drawable.ic_copyright_checkbox_unselected);
        if (isSelected || this.f49082l.getVisibility() != 0) {
            return;
        }
        u0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        String uid = AccountUtil_.getInstance_(this).getUid();
        if (this.f49090t == null) {
            h0("获取信息失败");
        } else if (!this.f49079i.isSelected()) {
            h0("请先同意用户协议");
        } else if (this.B) {
            UtilsMy.W3(this, p1.f.K().F(this.f49084n), "2");
            finish();
        } else if (TextUtils.isEmpty(this.f49090t.getBtnStatus())) {
        } else {
            if ("open".equals(this.f49090t.getBtnStatus())) {
                t0();
            } else if (ScrollClickView.DIR_DOWN.equals(this.f49090t.getBtnStatus())) {
                com.papa.sim.statistic.p.l(this).Y0(Event.downloadCopyright, uid, this.f49084n);
                DownloadTask F = p1.f.K().F(this.f49084n);
                if (this.f49090t != null && F != null && (F.getStatus() == 9 || F.getStatus() == 9)) {
                    if (!TextUtils.isEmpty(F.getCrc_link_type_val())) {
                        com.php25.PDownload.d.b(F);
                        F.setVer(this.f49090t.getVer());
                        F.setVer_name(this.f49090t.getVer_name());
                        F.setUrl(this.f49090t.getDownloadURL());
                        F.setResource_url_remote(this.f49090t.getResourceURL());
                        F.setActual_size(this.f49090t.getActualSize());
                        F.setRes_actual_size(this.f49090t.getResourceSize());
                        F.setExt(this.f49085o);
                        F.setFromRecomDown(this.f49087q);
                        F.setDisableShowSpeedUpPrompt(this.f49089s);
                        com.php25.PDownload.d.c(F, this);
                    }
                } else {
                    CommonService_.h2 h2Var = (CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("downGameId", this.f49084n)).extra("ext", this.f49085o)).extra("data", this.f49090t)).extra("_from", this.f49091u)).extra("_from_type", this.f49092v)).extra("fromRecomDown", this.f49087q)).extra("_downloadArgs", this.f49088r)).extra("disableShowSpeedUpPrompt", this.f49089s);
                    QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49090t;
                    ((CommonService_.h2) ((CommonService_.h2) h2Var.extra("resourceSize", queryDownloadInfoResponseData != null ? queryDownloadInfoResponseData.getResourceSize() : 0L)).extra("uncheckSelfSupport", true)).a();
                }
                finish();
            }
        }
    }

    void l0() {
        try {
            registerContentResolver();
            if (checkDeviceHasNavigationBar(this) && isNavigationBarShow()) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.C.getLayoutParams();
                int navigationBarHeight = getNavigationBarHeight();
                if (com.join.mgps.Util.k1.e() && Build.VERSION.SDK_INT <= 19) {
                    navigationBarHeight = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = navigationBarHeight;
                this.C.setLayoutParams(layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        q0();
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
            getContentResolver().unregisterContentObserver(this.D);
            getContentResolver().unregisterContentObserver(this.E);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                String uid = AccountUtil_.getInstance_(this).getUid();
                String token = AccountUtil_.getInstance_(this).getToken();
                RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this);
                QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                queryDownloadInfoRequestArgs.setGameId(this.f49084n);
                queryDownloadInfoRequestArgs.setUid(uid);
                queryDownloadInfoRequestArgs.setToken(token);
                requestModel.setArgs(queryDownloadInfoRequestArgs);
                ResponseModel<QueryDownloadInfoResponseData> q4 = this.f49095y.q(requestModel);
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
        h0(getString(R.string.net_connect_failed));
    }

    void q0() {
        u0(!this.f49080j.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        com.papa.sim.statistic.p.l(this).Y0(Event.closeCopyright, AccountUtil_.getInstance_(this).getUid(), this.f49084n);
        finish();
    }

    void registerContentResolver() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.D = new b(new Handler());
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_hide_bar_enabled"), true, this.D);
            registerNavigationBarObserver();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49090t;
        IntentUtil.getInstance().goShareWebActivity(this, queryDownloadInfoResponseData != null ? queryDownloadInfoResponseData.getUserProtocolURL() : "");
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
    @Click
    public void t0() {
        com.papa.sim.statistic.p.l(this).Y0(Event.openSourceUrl, AccountUtil_.getInstance_(this).getUid(), this.f49084n);
        QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f49090t;
        IntentUtil.getInstance().goShareWebActivity(this, queryDownloadInfoResponseData != null ? queryDownloadInfoResponseData.getDownloadHTML() : "");
    }

    void u0(boolean z4) {
        QueryDownloadInfoResponseData queryDownloadInfoResponseData;
        if (z4) {
            if (this.f49086p || (queryDownloadInfoResponseData = this.f49090t) == null || TextUtils.isEmpty(queryDownloadInfoResponseData.getBtnStatus()) || this.f49090t.getBtnStatus().equals("open")) {
                return;
            }
            if (!this.f49079i.isSelected()) {
                h0("请先同意用户协议");
                return;
            }
        }
        this.f49080j.setSelected(z4);
        this.f49080j.setImageResource(z4 ? R.drawable.ic_copyright_checkbox_selected : R.drawable.ic_copyright_checkbox_unselected);
        if (this.f49094x) {
            return;
        }
        this.f49083m.noPromptDownload().g(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void update(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
        if (queryDownloadInfoResponseData == null) {
            return;
        }
        this.f49090t = queryDownloadInfoResponseData;
        if (!TextUtils.isEmpty(queryDownloadInfoResponseData.getBtnStatus())) {
            if ("open".equals(queryDownloadInfoResponseData.getBtnStatus())) {
                this.f49075e.setText("启动");
                this.f49082l.setVisibility(8);
            } else if (ScrollClickView.DIR_DOWN.equals(queryDownloadInfoResponseData.getBtnStatus())) {
                this.f49075e.setText("立即下载");
                if (!this.f49086p) {
                    this.f49082l.setVisibility(0);
                    if (queryDownloadInfoResponseData.isSelectedNextTips() && queryDownloadInfoResponseData.isSelectedUserProtocol()) {
                        this.f49080j.setSelected(true);
                    } else {
                        this.f49080j.setSelected(false);
                    }
                    if (!this.f49094x) {
                        this.f49083m.noPromptDownload().g(Boolean.valueOf(this.f49080j.isSelected()));
                    }
                }
            }
        }
        this.f49073c.setText(queryDownloadInfoResponseData.getTitle());
        this.f49076f.setText(queryDownloadInfoResponseData.getSubTitle());
        this.f49077g.setText(queryDownloadInfoResponseData.getUserProtocolTxt());
        this.f49079i.setSelected(queryDownloadInfoResponseData.isSelectedUserProtocol());
        m0(queryDownloadInfoResponseData);
        this.f49082l.setVisibility(this.f49094x ? 8 : 0);
        DownloadTask F = p1.f.K().F(this.f49084n);
        if (F != null) {
            int status = F.getStatus();
            if (status != 5 && status != 42) {
                this.f49081k.setVisibility(0);
                TextView textView = this.f49075e;
                int i4 = R.drawable.detail_simple_multi_bg;
                textView.setBackgroundResource(R.drawable.detail_simple_multi_bg);
                TextView textView2 = this.f49075e;
                if (!this.f49079i.isSelected()) {
                    i4 = R.drawable.shape_view_bg2;
                }
                textView2.setBackgroundResource(i4);
                this.f49075e.setText("立即下载");
                this.B = false;
                return;
            }
            this.f49081k.setVisibility(8);
            this.f49075e.setBackgroundResource(R.drawable.detial_simple_open_selecter);
            this.f49075e.setText("启动");
            this.B = true;
        }
    }
}
