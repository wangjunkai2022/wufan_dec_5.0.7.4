package com.join.mgps.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.dto.APKVersionMainBean;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.ApkVersionbean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.VersionDto;
import com.join.mgps.pref.PrefDef_;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.setting_activity)
/* loaded from: classes4.dex */
public class MGSettingActivity extends BaseFragmentActivity {

    /* renamed from: b  reason: collision with root package name */
    private Context f34910b;

    /* renamed from: c  reason: collision with root package name */
    private String f34911c = getClass().getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.b f34912d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.e f34913e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f34914f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RelativeLayout f34915g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f34916h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f34917i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f34918j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f34919k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f34920l;
    @Pref

    /* renamed from: m  reason: collision with root package name */
    PrefDef_ f34921m;

    /* renamed from: n  reason: collision with root package name */
    private AccountBean f34922n;

    /* renamed from: o  reason: collision with root package name */
    private com.join.mgps.dialog.e f34923o;

    /* renamed from: p  reason: collision with root package name */
    private long f34924p;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this.f34910b).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void f0() {
        this.f34913e = com.join.mgps.rpc.impl.d.P1();
        this.f34912d = com.join.mgps.rpc.impl.a.c0();
        this.f34910b = this;
        TextUtils.isEmpty("wufun");
        this.f34920l.setText("关于悟饭");
        l0();
        TextView textView = this.f34919k;
        if (textView != null) {
            textView.setText(com.join.mgps.Util.s.d(this.f34910b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        h0();
    }

    @Background
    public void h0() {
        if (com.join.android.app.common.utils.j.j(this.f34910b)) {
            try {
                ResultMainBean<List<APKVersionMainBean>> r12 = this.f34913e.r1(RequestBeanUtil.getInstance(getApplicationContext()).getApkVersion(2, 1, 0));
                ApkVersionbean apkVersionbean = r12.getMessages().getData().get(0).getApp().get(0);
                if (r12.getFlag() == 1) {
                    String[] A = com.join.android.app.common.utils.n.n(getApplicationContext()).A();
                    String ver = apkVersionbean.getVer();
                    int parseInt = Integer.parseInt(ver.split("_")[0]);
                    int parseInt2 = Integer.parseInt(apkVersionbean.getVer_compatible().split("_")[0]);
                    if (Integer.parseInt(A[0]) <= parseInt) {
                        VersionDto versionDto = new VersionDto();
                        versionDto.setAndroidUrl(apkVersionbean.getDown_url());
                        versionDto.setVersionNo(Integer.parseInt(ver.split("_")[0]));
                        versionDto.setInfo(apkVersionbean.getVer_info());
                        versionDto.setHead_pic(apkVersionbean.getHead_pic());
                        versionDto.setTow_tpl_back_ground_pic(apkVersionbean.getTow_tpl_back_ground_pic());
                        versionDto.setTpl_type(apkVersionbean.getTpl_type());
                        if (Integer.parseInt(A[0]) < parseInt) {
                            if (Float.parseFloat(A[0]) < parseInt2) {
                                showVersionDownLoadHint(versionDto, true);
                            } else {
                                showVersionDownLoadHint(versionDto, false);
                            }
                        } else {
                            error("无需更新,已是最新版本");
                        }
                    } else {
                        error("无需更新,已是最新版本");
                    }
                }
                return;
            } catch (Exception unused) {
                error("网络似乎不通哦~");
                return;
            }
        }
        error("网络似乎不通哦~");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        MGPapaAboutActivity_.t0(this.f34910b).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        TextUtils.isEmpty("wufun");
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54056j + "/static/wf_mianze.html");
        intentDateBean.setObject("免责声明");
        IntentUtil.getInstance().intentActivity(this.f34910b, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        com.join.mgps.Util.s.i(this.f34910b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f34917i.setText(this.f34920l.getText());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.mgps.dialog.e eVar = this.f34923o;
        if (eVar == null || !eVar.isShowing()) {
            return;
        }
        this.f34923o.dismiss();
    }

    @UiThread
    public void showVersionDownLoadHint(VersionDto versionDto, boolean z4) {
        SharedPreferences.Editor edit = getSharedPreferences("VersionXML", 0).edit();
        edit.putBoolean("Mandatory", z4);
        edit.putString("VersionDto", JsonMapper.getInstance().toJson(versionDto));
        edit.commit();
        if (this.f34923o == null) {
            this.f34923o = new com.join.mgps.dialog.e(this, R.style.HKDialogLoading, versionDto, z4);
        }
        if (this.f34923o.isShowing()) {
            return;
        }
        this.f34923o.show();
    }
}
