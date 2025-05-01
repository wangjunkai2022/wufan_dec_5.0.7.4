package com.join.mgps.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BootPageData;
import com.join.mgps.dto.BootPageItem;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.util.Iterator;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.papa_plug_guide_notice_layout)
/* loaded from: classes4.dex */
public class PapaPlugGuideActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f36801b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36802c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36803d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36804e;
    @Pref

    /* renamed from: f  reason: collision with root package name */
    PrefDef_ f36805f;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    String f36807h;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    int f36806g = 0;

    /* renamed from: i  reason: collision with root package name */
    int f36808i = 5;

    private void h0(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.join.android.app.common.utils.e.l0(this).w(this, new File(downloadTask.getGameZipPath()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        BootPageItem game_setup_boot;
        String[] pic;
        BootPageItem performance_boot;
        this.f36802c.setText(Html.fromHtml("我知道了<font color = '#ffffff'>(5S)</font>"), TextView.BufferType.SPANNABLE);
        String d5 = this.f36805f.insatllAppFirstData().d();
        if (d5 != null) {
            BootPageData bootPageData = (BootPageData) JsonMapper.getInstance().fromJson(d5, BootPageData.class);
            if (this.f36806g == 0) {
                this.f36803d.setText("为了悟饭游戏稳定运行，请按图示修改设置");
                if (bootPageData != null && bootPageData.getPerformance_boot() != null && (performance_boot = bootPageData.getPerformance_boot()) != null) {
                    String[] pic2 = performance_boot.getPic();
                    String title = performance_boot.getTitle();
                    if (com.join.mgps.Util.g2.i(title)) {
                        this.f36803d.setText(title);
                    }
                    if (pic2 != null && pic2.length > 0) {
                        this.f36801b.setController((com.facebook.drawee.backends.pipeline.d) Fresco.newDraweeControllerBuilder().a(Uri.parse(pic2[0])).c(this.f36801b.getController()).E(true).build());
                    }
                }
            } else {
                DownloadTask downloadTask = null;
                if (com.join.mgps.Util.g2.i(this.f36807h)) {
                    downloadTask = p1.f.K().F(this.f36807h);
                    TextView textView = this.f36803d;
                    textView.setText("《" + downloadTask.getShowName() + "》待安装\n请按下图操作");
                } else {
                    Iterator<DownloadTask> it2 = p1.f.K().v().iterator();
                    if (it2.hasNext()) {
                        downloadTask = it2.next();
                        TextView textView2 = this.f36803d;
                        textView2.setText("《" + downloadTask.getShowName() + "》待安装");
                        this.f36804e.setText("请按下图操作");
                    }
                }
                if (bootPageData != null && bootPageData.getGame_setup_boot() != null && (game_setup_boot = bootPageData.getGame_setup_boot()) != null && (pic = game_setup_boot.getPic()) != null && pic.length > 0) {
                    String str = pic[0];
                    String title2 = game_setup_boot.getTitle();
                    if (com.join.mgps.Util.g2.i(title2)) {
                        String showName = downloadTask.getShowName();
                        if (showName.contains("-")) {
                            showName = showName.substring(0, showName.lastIndexOf("-"));
                        }
                        TextView textView3 = this.f36803d;
                        textView3.setText("《" + showName + "》待安装");
                        this.f36804e.setText(title2);
                    }
                    try {
                        this.f36801b.setController((com.facebook.drawee.backends.pipeline.d) Fresco.newDraweeControllerBuilder().a(Uri.parse(str)).c(this.f36801b.getController()).E(true).build());
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                if (downloadTask != null && downloadTask.getFileType().equals(Dtype.chajian.name()) && downloadTask.getDown_type() == 2 && downloadTask.getStatus() == 11) {
                    if (!com.join.android.app.common.utils.l.r(this, downloadTask, false, new String[0])) {
                        com.join.android.app.common.servcie.i.e().q(getApplicationContext(), downloadTask);
                    }
                    finish();
                    return;
                }
            }
        }
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        if (this.f36806g == 0) {
            String str = Build.BRAND;
            if (str.contains("vivo")) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.vivo.abe", "com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity"));
                intent.setFlags(268435456);
                startActivity(intent);
            } else if (str.toLowerCase().contains("gionee")) {
                com.join.android.app.common.utils.e.l0(this).P(this, "com.gionee.softmanager");
            } else {
                Intent intent2 = new Intent("android.intent.action.POWER_USAGE_SUMMARY");
                if (getPackageManager().resolveActivity(intent2, 0) != null) {
                    startActivity(intent2);
                }
            }
            finish();
            return;
        }
        if (com.join.mgps.Util.g2.i(this.f36807h)) {
            h0(p1.f.K().F(this.f36807h));
        } else {
            for (DownloadTask downloadTask : p1.f.K().v()) {
                h0(downloadTask);
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void i0() {
        this.f36808i--;
        this.f36802c.setText(Html.fromHtml("我知道了<font color = '#ffffff'>(" + this.f36808i + "S)</font>"), TextView.BufferType.SPANNABLE);
        if (this.f36808i <= 0) {
            this.f36802c.setEnabled(true);
            this.f36802c.setTextColor(-1);
            this.f36802c.setText("我知道了");
            return;
        }
        i0();
    }
}
