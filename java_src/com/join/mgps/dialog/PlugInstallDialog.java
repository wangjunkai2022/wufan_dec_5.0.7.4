package com.join.mgps.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.enums.ConstantIntEnum;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity
/* loaded from: classes.dex */
public class PlugInstallDialog extends BaseAppCompatActivity implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f49192b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f49193c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49194d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f49195e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f49196f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f49197g;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    EMUApkTable f49198h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    DownloadTask f49199i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    int f49200j;

    /* renamed from: k  reason: collision with root package name */
    private int f49201k = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.d0.a().d(this);
    }

    public void f0() {
        finish();
    }

    public void g0(String str) {
        EMUApkTable eMUApkTable;
        if (!TextUtils.isEmpty(str) && (eMUApkTable = this.f49198h) != null) {
            if (eMUApkTable.getTag_id().equals(str)) {
                f0();
                return;
            }
            return;
        }
        f0();
    }

    public void h0() {
        String str;
        this.f49193c.setBackgroundResource(R.drawable.emu_f_complete);
        this.f49194d.setText("完成");
        this.f49194d.setBackgroundResource(R.drawable.shape_plug_btn_bg);
        this.f49194d.setEnabled(true);
        this.f49195e.setVisibility(8);
        this.f49197g.setText("请享受游戏之旅");
        ConstantIntEnum[] values = ConstantIntEnum.values();
        int i4 = 0;
        while (true) {
            str = "已安装完成";
            if (i4 >= values.length) {
                break;
            }
            if (this.f49198h.getTag_id().equals(values[i4].value() + "")) {
                str = values[i4].nickName() + "已安装完成";
                break;
            }
            i4++;
        }
        this.f49196f.setText(str);
        this.f49201k = 3;
    }

    public void i0() {
        String str;
        this.f49193c.setBackgroundResource(R.drawable.emu_f_install);
        this.f49194d.setText("完成");
        this.f49194d.setBackgroundResource(R.drawable.shape_plug_btn_disable_bg);
        int i4 = 0;
        this.f49194d.setEnabled(false);
        this.f49195e.setVisibility(8);
        this.f49197g.setText("大约需要几秒钟");
        ConstantIntEnum[] values = ConstantIntEnum.values();
        while (true) {
            str = "插件安装中";
            if (i4 >= values.length) {
                break;
            }
            if (this.f49198h.getTag_id().equals(values[i4].value() + "")) {
                str = values[i4].nickName() + "插件安装中";
                break;
            }
            i4++;
        }
        this.f49196f.setText(str);
        this.f49201k = 2;
    }

    public void j0() {
        this.f49193c.setBackgroundResource(R.drawable.emu_f_update);
        this.f49194d.setText("一键安装");
        this.f49194d.setEnabled(true);
        this.f49194d.setBackgroundResource(R.drawable.shape_plug_btn_bg);
        int i4 = 0;
        if (this.f49200j == 2) {
            this.f49195e.setVisibility(8);
        } else {
            this.f49195e.setVisibility(0);
        }
        this.f49197g.setText("我们已为你准备好安装包");
        String str = "插件可更新";
        ConstantIntEnum[] values = ConstantIntEnum.values();
        while (true) {
            if (i4 >= values.length) {
                break;
            }
            if (this.f49198h.getTag_id().equals(values[i4].value() + "")) {
                str = values[i4].nickName() + "插件可更新";
                break;
            }
            i4++;
        }
        this.f49196f.setText(str);
        this.f49201k = 1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.skip) {
            f0();
            DownloadTask downloadTask = this.f49199i;
            if (downloadTask != null) {
                UtilsMy.U3(this.f49192b, downloadTask, 1);
            }
        } else if (id == R.id.submit) {
            int i4 = this.f49201k;
            if (i4 != 1) {
                if (i4 == 3) {
                    f0();
                    return;
                }
                return;
            }
            i0();
            DownloadTask Z = p1.f.K().Z(Integer.parseInt(this.f49199i.getPlugin_num()));
            if (Z.getStatus() == 11 && Z.getDown_type() == 2) {
                com.join.android.app.common.servcie.i.e().q(this, Z);
            } else {
                UtilsMy.q1(this.f49198h, this.f49192b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.join.mgps.Util.c2.o(this, 570425344, false);
        this.f49192b = this;
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_emu_plugin_dialog, (ViewGroup) null);
        this.f49193c = (ImageView) inflate.findViewById(R.id.icon);
        this.f49194d = (TextView) inflate.findViewById(R.id.submit);
        this.f49195e = (TextView) inflate.findViewById(R.id.skip);
        this.f49196f = (TextView) inflate.findViewById(R.id.title);
        this.f49197g = (TextView) inflate.findViewById(R.id.subTitle);
        this.f49195e.setVisibility(8);
        this.f49194d.setOnClickListener(this);
        this.f49195e.setOnClickListener(this);
        setContentView(inflate);
        int i4 = this.f49200j;
        if (i4 != 1 && i4 != 2) {
            i0();
        } else {
            j0();
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        if (a5 != null && a5.getStatus() == 5) {
            h0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        com.join.mgps.Util.c2.o(this, 570425344, false);
    }
}
