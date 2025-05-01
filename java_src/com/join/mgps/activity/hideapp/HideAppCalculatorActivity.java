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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.w1;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.pref.PrefDef_;
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
@EActivity(R.layout.activity_hide_app_calculator)
/* loaded from: classes4.dex */
public class HideAppCalculatorActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f38950b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f38951c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f38952d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f38953e;
    @Pref

    /* renamed from: f  reason: collision with root package name */
    PrefDef_ f38954f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    boolean f38955g;

    /* renamed from: h  reason: collision with root package name */
    private Context f38956h;

    /* renamed from: j  reason: collision with root package name */
    private c f38958j;

    /* renamed from: l  reason: collision with root package name */
    private boolean f38960l;

    /* renamed from: m  reason: collision with root package name */
    private String f38961m;

    /* renamed from: i  reason: collision with root package name */
    private List<d> f38957i = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private String f38959k = "0";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends GridLayoutManager.SpanSizeLookup {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i4) {
            return (i4 >= HideAppCalculatorActivity.this.f38957i.size() || HideAppCalculatorActivity.this.f38957i.get(i4) == null || !TextUtils.equals(((d) HideAppCalculatorActivity.this.f38957i.get(i4)).b(), "0")) ? 1 : 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements BaseQuickAdapter.j {
        b() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            d dVar = (d) HideAppCalculatorActivity.this.f38957i.get(i4);
            if (dVar.b().matches("[\\+\\-\\×\\÷]")) {
                HideAppCalculatorActivity.this.p0(dVar.b(), true);
            } else if (dVar.b().equals("DEL")) {
                HideAppCalculatorActivity.this.n0();
            } else if (dVar.b().equals("%")) {
                HideAppCalculatorActivity.this.m0();
            } else if (dVar.b().equals(SimpleComparison.EQUAL_TO_OPERATION)) {
                HideAppCalculatorActivity.this.j0();
            } else if (dVar.b().equals("AC")) {
                HideAppCalculatorActivity.this.l0();
            } else {
                HideAppCalculatorActivity.this.p0(dVar.b(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends BaseQuickAdapter<d, BaseViewHolder> {
        public c() {
            super(R.layout.item_hide_app_calculator, HideAppCalculatorActivity.this.f38957i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, d dVar) {
            baseViewHolder.setText(R.id.tvBtn, dVar.b()).setTextColor(R.id.tvBtn, Color.parseColor(dVar.c())).setVisible(R.id.tvBtn, !TextUtils.equals(dVar.b(), "DEL")).setVisible(R.id.ivBtn, TextUtils.equals(dVar.b(), "DEL"));
            ((CardView) baseViewHolder.getView(R.id.root)).setCardBackgroundColor(Color.parseColor(dVar.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        try {
            if (this.f38959k.contains("+")) {
                String[] split = this.f38959k.split("\\+");
                if (split.length == 2) {
                    this.f38959k = String.valueOf(Float.parseFloat(split[0]) + Float.parseFloat(split[1]));
                    this.f38960l = true;
                }
            } else if (this.f38959k.contains("-")) {
                String[] split2 = this.f38959k.split("\\-");
                if (split2.length == 2) {
                    this.f38959k = String.valueOf(Float.parseFloat(split2[0]) - Float.parseFloat(split2[1]));
                    this.f38960l = true;
                }
            } else if (this.f38959k.contains("×")) {
                String[] split3 = this.f38959k.split("\\×");
                if (split3.length == 2) {
                    this.f38959k = String.valueOf(Float.parseFloat(split3[0]) * Float.parseFloat(split3[1]));
                    this.f38960l = true;
                }
            } else if (this.f38959k.contains("÷")) {
                String[] split4 = this.f38959k.split("\\÷");
                if (split4.length == 2) {
                    if (Float.parseFloat(split4[1]) == 0.0f) {
                        showMessage("运算错误");
                        this.f38959k = "0";
                        this.f38951c.setText("0");
                        return;
                    }
                    this.f38959k = String.valueOf(Float.parseFloat(split4[0]) / Float.parseFloat(split4[1]));
                    this.f38960l = true;
                }
            }
            String[] split5 = this.f38959k.split("\\.");
            if (split5.length == 2 && Integer.parseInt(split5[1]) == 0) {
                this.f38959k = split5[0];
            }
            this.f38951c.setText(this.f38959k);
        } catch (Exception unused) {
            showMessage("运算错误");
            this.f38959k = "0";
            this.f38951c.setText("0");
        }
    }

    private void k0() {
        String str = this.f38959k;
        if (str == null || !str.contains(this.f38961m)) {
            return;
        }
        if (!this.f38955g) {
            MGMainActivity_.A2(this.f38956h).start();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        this.f38959k = "0";
        this.f38951c.setText("0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        try {
            String charSequence = this.f38951c.getText().toString();
            this.f38959k = charSequence;
            if (charSequence.contains("+")) {
                String[] split = this.f38959k.split("\\+");
                if (split.length == 2) {
                    this.f38959k = split[0] + "+" + (Float.parseFloat(split[1]) / 100.0f);
                }
            } else if (this.f38959k.contains("-")) {
                String[] split2 = this.f38959k.split("\\-");
                if (split2.length == 2) {
                    this.f38959k = split2[0] + "-" + (Float.parseFloat(split2[1]) / 100.0f);
                }
            } else if (this.f38959k.contains("×")) {
                String[] split3 = this.f38959k.split("\\×");
                if (split3.length == 2) {
                    this.f38959k = split3[0] + "×" + (Float.parseFloat(split3[1]) / 100.0f);
                }
            } else if (this.f38959k.contains("÷")) {
                String[] split4 = this.f38959k.split("\\÷");
                if (split4.length == 2) {
                    this.f38959k = split4[0] + "÷" + (Float.parseFloat(split4[1]) / 100.0f);
                }
            } else {
                this.f38959k = String.valueOf(Float.parseFloat(this.f38959k) / 100.0f);
            }
            String[] split5 = this.f38959k.split("\\.");
            if (split5.length == 2 && Integer.parseInt(split5[1]) == 0) {
                this.f38959k = split5[0];
            }
            this.f38951c.setText(this.f38959k);
        } catch (Exception e5) {
            e5.printStackTrace();
            showMessage("运算错误");
            this.f38959k = "0";
            this.f38951c.setText("0");
        }
    }

    private void o0() {
        this.f38957i.clear();
        this.f38957i.add(new d("AC", "#A5A5A5", "#000000"));
        this.f38957i.add(new d("DEL", "#A5A5A5", "#000000"));
        this.f38957i.add(new d("%", "#A5A5A5", "#000000"));
        this.f38957i.add(new d("÷", "#FEA00A", "#FFFFFF"));
        this.f38957i.add(new d("7"));
        this.f38957i.add(new d("8"));
        this.f38957i.add(new d("9"));
        this.f38957i.add(new d("×", "#FEA00A", "#FFFFFF"));
        this.f38957i.add(new d("4"));
        this.f38957i.add(new d("5"));
        this.f38957i.add(new d("6"));
        this.f38957i.add(new d("+", "#FEA00A", "#FFFFFF"));
        this.f38957i.add(new d("1"));
        this.f38957i.add(new d("2"));
        this.f38957i.add(new d("3"));
        this.f38957i.add(new d("-", "#FEA00A", "#FFFFFF"));
        this.f38957i.add(new d("0"));
        this.f38957i.add(new d(h0.f27805a));
        this.f38957i.add(new d(SimpleComparison.EQUAL_TO_OPERATION, "#FEA00A", "#FFFFFF"));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f38956h, 4);
        gridLayoutManager.setSpanSizeLookup(new a());
        this.f38952d.setLayoutManager(gridLayoutManager);
        c cVar = new c();
        this.f38958j = cVar;
        this.f38952d.setAdapter(cVar);
        this.f38958j.setOnItemClickListener(new b());
        if (TextUtils.isEmpty(this.f38961m)) {
            PackageManager packageManager = getPackageManager();
            packageManager.setComponentEnabledSetting(new ComponentName(this, "default.alias"), 1, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppNotebookActivity_"), 2, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(this, "com.join.mgps.activity.hideapp.HideAppCalculatorActivity_"), 2, 1);
            w1.a(this);
            MGMainActivity_.A2(this.f38956h).start();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f38956h = this;
        this.f38952d.setVisibility(0);
        this.f38953e.setVisibility(8);
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
        View view = this.f38950b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = v2;
            this.f38950b.setLayoutParams(layoutParams);
        }
        this.f38961m = this.f38954f.hide_app_pwd().d();
        this.f38951c.setText(this.f38959k);
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        moveTaskToBack(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        if (this.f38959k.length() <= 1) {
            this.f38959k = "0";
        } else {
            String str = this.f38959k;
            this.f38959k = str.substring(0, str.length() - 1);
        }
        this.f38951c.setText(this.f38959k);
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(String str, boolean z4) {
        String charSequence = this.f38951c.getText().toString();
        this.f38959k = charSequence;
        if (!z4) {
            if (this.f38960l) {
                if (!TextUtils.equals(str, h0.f27805a)) {
                    this.f38959k = str;
                    this.f38960l = false;
                }
            } else if (TextUtils.equals(charSequence, "0") && !TextUtils.equals(str, h0.f27805a) && !TextUtils.equals(str, "0")) {
                this.f38959k = str;
                this.f38960l = false;
            } else if (!this.f38959k.matches(".*[\\+\\-\\×\\÷]$") || !TextUtils.equals(str, h0.f27805a)) {
                this.f38959k += str;
                this.f38960l = false;
            }
        } else if (!charSequence.matches(".*[\\+\\-\\×\\÷]$") || !TextUtils.equals(str, h0.f27805a)) {
            j0();
            this.f38959k += str;
            this.f38960l = false;
        }
        this.f38951c.setText(this.f38959k);
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f38956h).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private String f38965a;

        /* renamed from: b  reason: collision with root package name */
        private String f38966b;

        /* renamed from: c  reason: collision with root package name */
        private String f38967c;

        public d(String str, String str2, String str3) {
            this.f38966b = "#333333";
            this.f38967c = "#FFFFFF";
            this.f38965a = str;
            this.f38966b = str2;
            this.f38967c = str3;
        }

        public String a() {
            return this.f38966b;
        }

        public String b() {
            return this.f38965a;
        }

        public String c() {
            return this.f38967c;
        }

        public void d(String str) {
            this.f38966b = str;
        }

        public void e(String str) {
            this.f38965a = str;
        }

        public void f(String str) {
            this.f38967c = str;
        }

        public d(String str) {
            this.f38966b = "#333333";
            this.f38967c = "#FFFFFF";
            this.f38965a = str;
        }
    }
}
