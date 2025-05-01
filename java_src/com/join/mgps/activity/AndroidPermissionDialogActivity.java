package com.join.mgps.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.dto.AndroidPermissionParams;
/* loaded from: classes4.dex */
public class AndroidPermissionDialogActivity extends BaseDialogActivity {

    /* renamed from: i  reason: collision with root package name */
    public static final String f28377i = "_permission_params";

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f28378b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f28379c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f28380d;

    /* renamed from: e  reason: collision with root package name */
    Button f28381e;

    /* renamed from: f  reason: collision with root package name */
    Button f28382f;

    /* renamed from: g  reason: collision with root package name */
    Button f28383g;

    /* renamed from: h  reason: collision with root package name */
    AndroidPermissionParams f28384h;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AndroidPermissionDialogActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback instanceof w1.a) {
                ((w1.a) ((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback).a();
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback instanceof w1.a) {
                ((w1.a) ((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback).b(AndroidPermissionDialogActivity.this);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback instanceof w1.a) {
                ((w1.a) ((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback).c(AndroidPermissionDialogActivity.this);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback instanceof w1.a) {
                ((w1.a) ((BaseDialogActivity) AndroidPermissionDialogActivity.this).callback).b(AndroidPermissionDialogActivity.this);
            }
        }
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    public View getContentView() {
        return this.f28378b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.dialog.BaseDialogActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.android_permiss_dialog);
        com.join.mgps.Util.c2.s(this);
        this.f28379c = (ImageView) findViewById(R.id.dialog_title_image);
        this.f28380d = (TextView) findViewById(R.id.dialog_content);
        this.f28379c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f28381e = (Button) findViewById(R.id.dialog_button_keep);
        this.f28382f = (Button) findViewById(R.id.dialog_button_close);
        this.f28383g = (Button) findViewById(R.id.dialog_button_i_know);
        if (getIntent() != null) {
            this.f28384h = (AndroidPermissionParams) getIntent().getSerializableExtra(f28377i);
        }
        AndroidPermissionParams androidPermissionParams = this.f28384h;
        if (androidPermissionParams != null) {
            if (com.join.mgps.Util.g2.i(androidPermissionParams.getContent())) {
                this.f28380d.setText(this.f28384h.getContent());
            }
            if (com.join.mgps.Util.g2.i(this.f28384h.getCancelText())) {
                this.f28381e.setText(this.f28384h.getCancelText());
            }
            findViewById(R.id.llBtn).setVisibility(this.f28384h.isSingleBtn() ? 8 : 0);
            findViewById(R.id.llBtnIKnow).setVisibility(this.f28384h.isSingleBtn() ? 0 : 8);
        }
        findViewById(R.id.closed).setOnClickListener(new a());
        this.f28379c.setOnClickListener(new b());
        this.f28382f.setOnClickListener(new c());
        this.f28381e.setOnClickListener(new d());
        this.f28383g.setOnClickListener(new e());
    }
}
