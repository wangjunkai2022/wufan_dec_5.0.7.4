package com.join.mgps.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_handshank_mapkey)
/* loaded from: classes4.dex */
public class HandShankMapKeyActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f33654b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f33655c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33656d = true;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33657e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f33658f;

    private IntentDateBean h0(int i4, String str) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(i4);
        intentDateBean.setLink_type_val(str);
        intentDateBean.setObject("NDS游戏手柄设置");
        return intentDateBean;
    }

    private void i0(boolean z4) {
        if (!z4) {
            this.f33655c.setImageResource(R.drawable.handshank_virtualkey_off);
            this.f33654b.setImageResource(R.drawable.handshank_virtualkey_on_icon);
        } else {
            this.f33655c.setImageResource(R.drawable.handshank_virtualkey_on);
            this.f33654b.setImageResource(R.drawable.handshank_virtualkey_off_icon);
        }
        if (this.f33656d != z4) {
            this.f33656d = z4;
            com.join.mgps.joystick.map.d.l(0, Boolean.valueOf(z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f33658f.setText("映射按键");
        this.f33657e.setVisibility(8);
        this.f33655c = (ImageView) findViewById(R.id.handshank_on_off);
        this.f33654b = (ImageView) findViewById(R.id.on_off_img);
        i0(com.join.mgps.joystick.map.d.l(0, new Boolean[0]));
        findViewById(R.id.lay_1).setOnClickListener(this);
        findViewById(R.id.lay_2).setOnClickListener(this);
        findViewById(R.id.fba_lay).setOnClickListener(this);
        findViewById(R.id.gba_lay).setOnClickListener(this);
        findViewById(R.id.fc_lay).setOnClickListener(this);
        findViewById(R.id.sfc_lay).setOnClickListener(this);
        findViewById(R.id.psp_lay).setOnClickListener(this);
        findViewById(R.id.md_lay).setOnClickListener(this);
        findViewById(R.id.ps_lay).setOnClickListener(this);
        findViewById(R.id.wsc_lay).setOnClickListener(this);
        findViewById(R.id.gbc_lay).setOnClickListener(this);
        findViewById(R.id.nds_lay).setOnClickListener(this);
        findViewById(R.id.papaHandList).setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.papaHandList || id == R.id.nds_lay) {
            IntentDateBean intentDateBean = null;
            if (id == R.id.papaHandList) {
                intentDateBean = h0(4, "http://h5.5fun.com/wf_shoubing.html");
            } else if (id == R.id.nds_lay) {
                intentDateBean = h0(4, com.join.mgps.rpc.h.f54095w + "/nds/index.html");
            }
            IntentUtil.getInstance().intentActivity(this, intentDateBean);
        } else if (id == R.id.lay_1) {
            i0(!this.f33656d);
        } else if (id == R.id.lay_2) {
            startActivity(new Intent(this, HandShankCheckKeyActivity_.class));
        } else if (id == R.id.fba_lay) {
            startActivity(new Intent(this, HandShankFBAActivity_.class));
        } else if (id == R.id.gba_lay) {
            startActivity(new Intent(this, HandShankGBAActivity_.class));
        } else if (id == R.id.fc_lay) {
            startActivity(new Intent(this, HandShankFCActivity_.class));
        } else if (id == R.id.sfc_lay) {
            startActivity(new Intent(this, HandShankSFCActivity_.class));
        } else if (id == R.id.psp_lay) {
            startActivity(new Intent(this, HandShankPSPActivity_.class));
        } else if (id == R.id.md_lay) {
            startActivity(new Intent(this, HandShankMDActivity_.class));
        } else if (id == R.id.ps_lay) {
            startActivity(new Intent(this, HandShankPSActivity_.class));
        } else if (id == R.id.wsc_lay) {
            startActivity(new Intent(this, HandShankWSCActivity_.class));
        } else if (id == R.id.gbc_lay) {
            startActivity(new Intent(this, HandShankGBCActivity_.class));
        }
    }
}
