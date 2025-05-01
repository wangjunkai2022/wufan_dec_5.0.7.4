package com.join.mgps.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.EMUApkTable;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
@EActivity
/* loaded from: classes4.dex */
public class PlugUpdateDialog extends BaseAppCompatActivity implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f49208b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49209c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49210d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f49211e;

    /* renamed from: f  reason: collision with root package name */
    private View f49212f;

    /* renamed from: g  reason: collision with root package name */
    private View f49213g;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    EMUApkTable f49214h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    String f49215i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    String f49216j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f49209c.setText(this.f49214h.getApk_name());
        this.f49210d.setText(Html.fromHtml(this.f49214h.getVer_info()));
    }

    public void f0() {
        finish();
    }

    public void g0(String str) {
        EMUApkTable eMUApkTable;
        if (!TextUtils.isEmpty(str) && (eMUApkTable = this.f49214h) != null) {
            if (eMUApkTable.getTag_id().equals(str)) {
                f0();
                return;
            }
            return;
        }
        f0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.dialog_button_cancle) {
            f0();
            IntentUtil.getInstance().goGameMainActivity(this.f49208b, this.f49216j, this.f49215i);
            if (this.f49211e.isChecked()) {
                try {
                    EMUApkTable eMUApkTable = this.f49214h;
                    eMUApkTable.setNotUpdateversion(Integer.parseInt(eMUApkTable.getVer().split("_")[0]));
                    b2.p.o().update(this.f49214h);
                } catch (NumberFormatException e5) {
                    e5.printStackTrace();
                }
            }
        } else if (id == R.id.dialog_button_ok) {
            f0();
            UtilsMy.q1(this.f49214h, this.f49208b);
            if (this.f49211e.isChecked()) {
                try {
                    EMUApkTable eMUApkTable2 = this.f49214h;
                    eMUApkTable2.setNotUpdateversion(Integer.parseInt(eMUApkTable2.getVer().split("_")[0]));
                    b2.p.o().update(this.f49214h);
                } catch (NumberFormatException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.join.mgps.Util.c2.o(this, 570425344, false);
        this.f49208b = this;
        View inflate = LayoutInflater.from(this).inflate(R.layout.plug_update_dialog_layout, (ViewGroup) null);
        this.f49209c = (TextView) inflate.findViewById(R.id.title);
        this.f49210d = (TextView) inflate.findViewById(R.id.content);
        this.f49211e = (CheckBox) inflate.findViewById(R.id.checkbox);
        this.f49212f = inflate.findViewById(R.id.dialog_button_ok);
        this.f49213g = inflate.findViewById(R.id.dialog_button_cancle);
        this.f49212f.setOnClickListener(this);
        this.f49213g.setOnClickListener(this);
        setContentView(inflate);
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
