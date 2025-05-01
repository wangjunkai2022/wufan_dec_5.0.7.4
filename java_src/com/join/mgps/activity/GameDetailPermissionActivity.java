package com.join.mgps.activity;

import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_game_detail_permission)
/* loaded from: classes4.dex */
public class GameDetailPermissionActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f31667b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f31668c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    String f31669d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f31668c.setText("敏感权限");
        if (!TextUtils.isEmpty(this.f31669d)) {
            this.f31667b.setText(this.f31669d.replaceAll("\n", "\n\n"));
        } else {
            this.f31667b.setText("无敏感权限");
        }
        this.f31667b.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }
}
