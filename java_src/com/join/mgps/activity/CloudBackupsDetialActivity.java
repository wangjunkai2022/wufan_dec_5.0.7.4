package com.join.mgps.activity;

import android.content.Context;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.CloudBackupsCanUseBean;
import java.sql.Date;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.cloud_backups_detial_layout)
/* loaded from: classes4.dex */
public class CloudBackupsDetialActivity extends BaseActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    CloudBackupsCanUseBean f28915b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28916c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f28917d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f28918e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f28919f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f28920g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28921h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.b f28922i;

    /* renamed from: j  reason: collision with root package name */
    private Context f28923j;

    /* renamed from: k  reason: collision with root package name */
    private AccountBean f28924k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f28922i = com.join.mgps.rpc.impl.a.c0();
        this.f28923j = this;
        this.f28916c.setText("备份数据详情");
        this.f28917d.setText(this.f28915b.getBrand_name());
        this.f28918e.setText(com.join.mgps.Util.y.e(new Date(Long.parseLong(this.f28915b.getAdd_time()) * 1000), "yyyy-MM.dd HH:mm"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        CloudRecodingActivity_.j0(this.f28923j).b(true).a(this.f28915b).start();
    }
}
