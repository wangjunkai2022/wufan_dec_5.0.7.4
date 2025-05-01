package com.join.mgps.activity;

import android.content.Context;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.mg_tips_activity)
/* loaded from: classes4.dex */
public class MGTipsActivity extends BaseActivity {

    /* renamed from: b  reason: collision with root package name */
    private Context f34940b;

    /* renamed from: c  reason: collision with root package name */
    private String f34941c = getClass().getSimpleName();
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f34942d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void g0() {
        this.f34940b = this;
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        this.f34942d.setText("温馨提示");
    }
}
