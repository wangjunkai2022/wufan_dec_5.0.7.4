package com.join.mgps.activity.hideapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.w1;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.pref.PrefDef_;
import com.uc.crashsdk.export.LogType;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_hide_app_notebook)
/* loaded from: classes4.dex */
public class HideAppNotebookActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    EditText f38997b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f38998c;
    @Pref

    /* renamed from: d  reason: collision with root package name */
    PrefDef_ f38999d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    boolean f39000e;

    /* renamed from: f  reason: collision with root package name */
    private Context f39001f;

    /* renamed from: g  reason: collision with root package name */
    private String f39002g;

    /* loaded from: classes4.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            if (TextUtils.equals(charSequence.toString(), HideAppNotebookActivity.this.f39002g)) {
                HideAppNotebookActivity hideAppNotebookActivity = HideAppNotebookActivity.this;
                if (!hideAppNotebookActivity.f39000e) {
                    MGMainActivity_.A2(hideAppNotebookActivity.f39001f).start();
                }
                HideAppNotebookActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f39001f = this;
        this.f39002g = this.f38999d.hide_app_pwd().d();
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
        int v2 = n.v(this);
        View view = this.f38998c;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = v2;
            this.f38998c.setLayoutParams(layoutParams);
        }
        this.f38997b.addTextChangedListener(new a());
        if (TextUtils.isEmpty(this.f39002g)) {
            PackageManager packageManager = getPackageManager();
            packageManager.setComponentEnabledSetting(new ComponentName(this, "default.alias"), 1, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppNotebookActivity_"), 2, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppCalculatorActivity_"), 2, 1);
            w1.a(this);
            MGMainActivity_.A2(this.f39001f).start();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        moveTaskToBack(true);
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
