package com.join.mgps.activity;

import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.PapayHistoryInfo;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_papay_detial)
/* loaded from: classes4.dex */
public class PapayPayDetialActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f36833b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36834c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36835d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36836e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f36837f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36838g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36839h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    PapayHistoryInfo f36840i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f36833b.setText("交易详情");
        this.f36834c.setText(this.f36840i.getOrder_id());
        this.f36839h.setText(this.f36840i.getMoney());
        this.f36835d.setText(this.f36840i.getOrder_type());
        this.f36838g.setText(this.f36840i.getTitle());
        this.f36836e.setText(this.f36840i.getPay_time());
        this.f36837f.setText(this.f36840i.getPay_type());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }
}
