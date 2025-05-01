package com.join.mgps.activity.hideapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.w1;
import com.join.mgps.activity.hideapp.HideAppHomeActivity;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.pref.PrefDef_;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_hide_app_home)
/* loaded from: classes4.dex */
public class HideAppHomeActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ViewPager2 f38980b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f38981c;
    @Pref

    /* renamed from: d  reason: collision with root package name */
    PrefDef_ f38982d;

    /* renamed from: e  reason: collision with root package name */
    private Context f38983e;

    /* renamed from: f  reason: collision with root package name */
    private List<b> f38984f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private int f38985g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends BaseQuickAdapter<b, BaseViewHolder> {
        public a() {
            super(R.layout.item_hide_app_home_viewpager, HideAppHomeActivity.this.f38984f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(b bVar, View view) {
            if (HideAppHomeActivity.this.f38985g != 0) {
                if (HideAppHomeActivity.this.f38985g == bVar.getType()) {
                    HideAppHomeActivity.this.i0();
                    return;
                }
                HideAppHomeActivity hideAppHomeActivity = HideAppHomeActivity.this;
                hideAppHomeActivity.showMessage(hideAppHomeActivity.f38985g == 1 ? "记事本" : "计算器伪装功能使用中，请先解除隐身状态");
                return;
            }
            HideAppSetPwdActivity_.t0(this.mContext).a(bVar.getType()).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(View view) {
            HideAppSetPwdActivity_.t0(this.mContext).a(100).start();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: c */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final b bVar) {
            BaseViewHolder text = baseViewHolder.setText(R.id.tvTitle, "将自身伪装成" + bVar.b());
            text.setText(R.id.tvDesc, "从" + bVar.b() + "中输入6位密码进入悟饭").setText(R.id.tvBtn, HideAppHomeActivity.this.f38985g == bVar.getType() ? "解除隐身状态" : "立即使用").setBackgroundRes(R.id.tvBtn, HideAppHomeActivity.this.f38985g == bVar.getType() ? R.drawable.shape_434343_r40 : R.drawable.shape_gradient_yellow_btn).setVisible(R.id.tvResetPwd, HideAppHomeActivity.this.f38985g == bVar.getType()).setImageResource(R.id.ic_pretend, bVar.a());
            baseViewHolder.getView(R.id.tvBtn).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.hideapp.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HideAppHomeActivity.a.this.d(bVar, view);
                }
            });
            baseViewHolder.getView(R.id.tvResetPwd).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.hideapp.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HideAppHomeActivity.a.this.e(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private int f38987a;

        /* renamed from: b  reason: collision with root package name */
        private String f38988b;

        /* renamed from: c  reason: collision with root package name */
        private int f38989c;

        public b(int i4, String str, int i5) {
            this.f38987a = i4;
            this.f38988b = str;
            this.f38989c = i5;
        }

        public int a() {
            return this.f38989c;
        }

        public String b() {
            return this.f38988b;
        }

        public void c(int i4) {
            this.f38989c = i4;
        }

        public void d(String str) {
            this.f38988b = str;
        }

        public void e(int i4) {
            this.f38987a = i4;
        }

        public int getType() {
            return this.f38987a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        this.f38982d.hide_app_pwd().g("");
        this.f38982d.hide_app_switch().g(0);
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(new ComponentName(this, "default.alias"), 1, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppNotebookActivity_"), 2, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppCalculatorActivity_"), 2, 1);
        w1.a(this);
        finish();
    }

    private void j0() {
        this.f38984f.clear();
        this.f38984f.add(new b(2, "计算器", R.drawable.ic_hide_app_calculator));
        this.f38984f.add(new b(1, "记事本", R.drawable.ic_hide_app_notebook));
        this.f38980b.setOffscreenPageLimit(2);
        RecyclerView recyclerView = (RecyclerView) this.f38980b.getChildAt(0);
        recyclerView.setPadding(0, 0, (int) getResources().getDimension(R.dimen.wdp60), 0);
        recyclerView.setClipToPadding(false);
        this.f38980b.setAdapter(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f38983e = this;
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
        View view = this.f38981c;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = v2;
            this.f38981c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f38985g = this.f38982d.hide_app_switch().d().intValue();
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f38983e).b(str);
    }
}
