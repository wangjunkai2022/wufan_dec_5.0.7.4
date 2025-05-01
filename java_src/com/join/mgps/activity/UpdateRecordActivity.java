package com.join.mgps.activity;

import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.update_record_layout)
/* loaded from: classes4.dex */
public class UpdateRecordActivity extends BaseActivity {

    /* renamed from: e  reason: collision with root package name */
    private static final String f38298e = "UpdateRecordActivity";
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f38299b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f38300c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    String f38301d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f38300c.setText("更新记录");
        this.f38299b.setText(this.f38301d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }
}
