package com.join.mgps.activity;

import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_install_app_dialog_v2)
/* loaded from: classes4.dex */
public class InstallAppDialogV2Activity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f34079b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f34080c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f34081d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f34082e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    String f34083f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    String f34084g;

    /* renamed from: h  reason: collision with root package name */
    private DownloadTask f34085h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        if (this.f34082e == null) {
            finish();
            return;
        }
        DownloadTask F = p1.f.K().F(this.f34082e);
        this.f34085h = F;
        if (F == null) {
            finish();
        } else {
            i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        com.join.android.app.common.utils.e.l0(this).x(this, this.f34085h.getPath());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        this.f34080c.setText(this.f34085h.getShowName());
        this.f34081d.setText(this.f34083f);
        MyImageLoader.p(this.f34079b, this.f34084g, r.c.f11300g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }
}
