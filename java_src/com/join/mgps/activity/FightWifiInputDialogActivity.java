package com.join.mgps.activity;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
@EActivity(R.layout.dialog_fight_wifi_ip)
/* loaded from: classes4.dex */
public class FightWifiInputDialogActivity extends BaseActivity {

    /* renamed from: e  reason: collision with root package name */
    public static final int f30316e = 9002;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    EditText f30317b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    Button f30318c;
    @Pref

    /* renamed from: d  reason: collision with root package name */
    PrefDef_ f30319d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30317b.setText(this.f30319d.fightWifiInputIP().d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        String obj = this.f30317b.getText().toString();
        if (com.join.mgps.Util.g2.h(obj)) {
            com.join.android.app.common.manager.a.h().j(this, "IP地址不能为空", 1);
            return;
        }
        String[] split = obj.split("\\.");
        if (obj.contains(com.join.mgps.Util.h0.f27805a) && split.length == 4 && com.join.mgps.Util.g2.j(split[0]) && com.join.mgps.Util.g2.j(split[1]) && com.join.mgps.Util.g2.j(split[2]) && com.join.mgps.Util.g2.j(split[3])) {
            this.f30319d.fightWifiInputIP().g(obj);
            Intent intent = new Intent();
            intent.putExtra(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, obj);
            setResult(9002, intent);
            finish();
            return;
        }
        com.join.android.app.common.manager.a.h().j(this, "IP地址不合法", 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
