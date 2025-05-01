package com.join.mgps.activity.hideapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.w1;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dialog.a1;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.api.sharedpreferences.p;
@EActivity(R.layout.activity_hide_app_set_pwd)
/* loaded from: classes4.dex */
public class HideAppSetPwdActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f39009b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f39010c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f39011d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f39012e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    int f39013f;
    @Pref

    /* renamed from: g  reason: collision with root package name */
    PrefDef_ f39014g;

    /* renamed from: h  reason: collision with root package name */
    private Context f39015h;

    /* renamed from: i  reason: collision with root package name */
    boolean f39016i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements BaseQuickAdapter.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f39017a;

        a(ArrayList arrayList) {
            this.f39017a = arrayList;
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            String str = (String) this.f39017a.get(i4);
            if (TextUtils.equals(str, h0.f27805a)) {
                return;
            }
            if (TextUtils.equals(str, "×")) {
                HideAppSetPwdActivity.this.o0();
            } else {
                HideAppSetPwdActivity.this.j0(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements a1.a {
        b() {
        }

        @Override // com.join.mgps.dialog.a1.a
        public void a(String str) {
            HideAppSetPwdActivity hideAppSetPwdActivity = HideAppSetPwdActivity.this;
            if (hideAppSetPwdActivity.f39013f != 100) {
                hideAppSetPwdActivity.l0(str);
                return;
            }
            hideAppSetPwdActivity.f39014g.hide_app_pwd().g(str);
            HideAppSetPwdActivity.this.showMessage("重置密码成功");
            HideAppSetPwdActivity.this.finish();
        }

        @Override // com.join.mgps.dialog.a1.a
        public void reset() {
            HideAppSetPwdActivity.this.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends BaseQuickAdapter<String, BaseViewHolder> {
        public c(@Nullable List<String> list) {
            super(R.layout.item_hide_app_pwd, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, String str) {
            baseViewHolder.setText(R.id.tvBtn, str);
            ((CardView) baseViewHolder.getView(R.id.root)).setCardBackgroundColor(Color.parseColor(TextUtils.equals(str, "×") ? "#FEA00A" : "#333333"));
        }
    }

    private void initView() {
        int i4 = this.f39013f;
        boolean z4 = true;
        this.f39016i = (i4 == 1 || i4 == 2 || i4 == 99 || i4 == 100) ? false : false;
        if (i4 == 0) {
            this.f39010c.setText("输入伪装密码");
        } else if (i4 == 99) {
            this.f39010c.setText("输入旧密码");
        } else if (i4 == 100) {
            this.f39010c.setText("输入新密码");
        }
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str) {
        LinearLayout linearLayout = this.f39009b;
        if (linearLayout == null || linearLayout.getChildCount() <= 0) {
            return;
        }
        int childCount = this.f39009b.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f39009b.getChildAt(i4);
            if (childAt != null) {
                TextView textView = (TextView) childAt.findViewById(R.id.tvNum);
                if (TextUtils.isEmpty(textView.getText())) {
                    textView.setText(str);
                    View findViewById = childAt.findViewById(R.id.indicator);
                    if (findViewById != null) {
                        findViewById.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                    if (i4 == childCount - 1) {
                        int i5 = this.f39013f;
                        if (i5 == 0) {
                            k0();
                            return;
                        } else if (i5 == 99) {
                            m0();
                            return;
                        } else if (i5 == 100) {
                            r0();
                            return;
                        } else if (i5 == 1 || i5 == 2) {
                            r0();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    private void k0() {
        if (TextUtils.equals(this.f39014g.hide_app_pwd().d(), p0())) {
            r0();
            return;
        }
        showMessage("密码校验未通过");
        n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        p hide_app_pwd = this.f39014g.hide_app_pwd();
        if (this.f39016i) {
            str = "";
        }
        hide_app_pwd.g(str);
        this.f39014g.hide_app_switch().g(Integer.valueOf(this.f39016i ? 0 : this.f39013f));
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(new ComponentName(this, "default.alias"), !this.f39016i ? 2 : 1, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppNotebookActivity_"), (this.f39016i || this.f39013f != 1) ? 2 : 1, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppCalculatorActivity_"), (this.f39016i || this.f39013f != 2) ? 2 : 1, 1);
        if (!this.f39016i) {
            int i4 = this.f39013f;
            if (i4 == 1) {
                HideAppNotebookActivity_.h0(this.f39015h).a(true).start();
            } else if (i4 == 2) {
                HideAppCalculatorActivity_.t0(this.f39015h).a(true).start();
            }
            com.papa.sim.statistic.p.l(this.f39015h).O1(Event.usefakeAPP, new Ext());
            w1.f(this);
        } else {
            w1.a(this);
        }
        finish();
    }

    private void m0() {
        if (TextUtils.equals(this.f39014g.hide_app_pwd().d(), p0())) {
            this.f39013f = 100;
            n0();
            initView();
            return;
        }
        showMessage("密码校验未通过");
        n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        int childCount = this.f39009b.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f39009b.getChildAt(i4);
            if (childAt != null) {
                ((TextView) childAt.findViewById(R.id.tvNum)).setText("");
                View findViewById = childAt.findViewById(R.id.indicator);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(Color.parseColor("#FF656565"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        LinearLayout linearLayout = this.f39009b;
        if (linearLayout == null || linearLayout.getChildCount() <= 0) {
            return;
        }
        int childCount = this.f39009b.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f39009b.getChildAt((childCount - 1) - i4);
            if (childAt != null) {
                TextView textView = (TextView) childAt.findViewById(R.id.tvNum);
                if (!TextUtils.isEmpty(textView.getText())) {
                    textView.setText("");
                    View findViewById = childAt.findViewById(R.id.indicator);
                    if (findViewById != null) {
                        findViewById.setBackgroundColor(Color.parseColor("#FF656565"));
                        return;
                    }
                    return;
                }
            }
        }
    }

    private String p0() {
        TextView textView;
        int childCount = this.f39009b.getChildCount();
        String str = "";
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f39009b.getChildAt(i4);
            if (childAt != null) {
                if (!TextUtils.isEmpty(((TextView) childAt.findViewById(R.id.tvNum)).getText())) {
                    str = str + ((Object) textView.getText());
                }
            }
        }
        return str;
    }

    private void q0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("0");
        arrayList.add(h0.f27805a);
        arrayList.add("×");
        this.f39012e.setLayoutManager(new GridLayoutManager(this.f39015h, 3));
        c cVar = new c(arrayList);
        this.f39012e.setAdapter(cVar);
        cVar.setOnItemClickListener(new a(arrayList));
    }

    private void r0() {
        a1 a1Var = new a1(this.f39015h, p0(), this.f39016i);
        a1Var.a(new b());
        a1Var.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f39015h = this;
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
        View view = this.f39011d;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = v2;
            this.f39011d.setLayoutParams(layoutParams);
        }
        initView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f39015h).b(str);
    }
}
