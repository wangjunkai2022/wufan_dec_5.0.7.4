package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.R;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.compliance.i;
import com.ss.android.downloadlib.guide.install.ClipImageView;
import com.ss.android.downloadlib.n.jh;
/* loaded from: classes5.dex */
public class vv extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private long f60444b;

    /* renamed from: i  reason: collision with root package name */
    private TextView f60445i;
    private final com.ss.android.downloadlib.addownload.m.m jh;

    /* renamed from: k  reason: collision with root package name */
    private final long f60446k;

    /* renamed from: m  reason: collision with root package name */
    private TextView f60447m;

    /* renamed from: n  reason: collision with root package name */
    private ClipImageView f60448n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f60449o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f60450p;
    private LinearLayout qv;

    /* renamed from: u  reason: collision with root package name */
    private TextView f60451u;
    private TextView vv;
    private Activity wv;

    public vv(@NonNull Activity activity, long j4) {
        super(activity);
        this.wv = activity;
        this.f60446k = j4;
        this.jh = p.vv().get(Long.valueOf(j4));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        com.ss.android.socialbase.appdownloader.p.vv(this.wv);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.jh == null) {
            dismiss();
            return;
        }
        requestWindowFeature(1);
        setContentView(R.layout.ttdownloader_dialog_appinfo);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.ttdownloader_bg_transparent);
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.f60444b = this.jh.f60502m;
        vv();
        n.m("lp_app_dialog_show", this.f60444b);
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ss.android.downloadlib.addownload.compliance.vv.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                n.vv("lp_app_dialog_cancel", vv.this.f60444b);
            }
        });
    }

    private void vv() {
        this.vv = (TextView) findViewById(R.id.tv_app_name);
        this.f60447m = (TextView) findViewById(R.id.tv_app_version);
        this.f60450p = (TextView) findViewById(R.id.tv_app_developer);
        this.f60445i = (TextView) findViewById(R.id.tv_app_detail);
        this.f60449o = (TextView) findViewById(R.id.tv_app_privacy);
        this.f60451u = (TextView) findViewById(R.id.tv_give_up);
        this.f60448n = (ClipImageView) findViewById(R.id.iv_app_icon);
        this.qv = (LinearLayout) findViewById(R.id.ll_download);
        this.vv.setText(jh.vv(this.jh.f60504o, "--"));
        TextView textView = this.f60447m;
        textView.setText("版本号：" + jh.vv(this.jh.f60506u, "--"));
        TextView textView2 = this.f60450p;
        textView2.setText("开发者：" + jh.vv(this.jh.f60503n, "应用信息正在完善中"));
        this.f60448n.setRoundRadius(jh.vv(b.getContext(), 8.0f));
        this.f60448n.setBackgroundColor(Color.parseColor("#EBEBEB"));
        i.vv().vv(this.f60446k, new i.vv() { // from class: com.ss.android.downloadlib.addownload.compliance.vv.2
            @Override // com.ss.android.downloadlib.addownload.compliance.i.vv
            public void vv(Bitmap bitmap) {
                if (bitmap != null) {
                    vv.this.f60448n.setImageBitmap(bitmap);
                } else {
                    n.vv(8, vv.this.f60444b);
                }
            }
        });
        this.f60445i.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.vv.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m.vv().vv(vv.this.wv);
                AppDetailInfoActivity.vv(vv.this.wv, vv.this.f60446k);
                n.vv("lp_app_dialog_click_detail", vv.this.f60444b);
            }
        });
        this.f60449o.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.vv.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m.vv().vv(vv.this.wv);
                AppPrivacyPolicyActivity.vv(vv.this.wv, vv.this.f60446k);
                n.vv("lp_app_dialog_click_privacy", vv.this.f60444b);
            }
        });
        this.f60451u.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.vv.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vv.this.dismiss();
                n.vv("lp_app_dialog_click_giveup", vv.this.f60444b);
            }
        });
        this.qv.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.vv.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                n.vv("lp_app_dialog_click_download", vv.this.f60444b);
                m.vv().m(vv.this.f60444b);
                vv.this.dismiss();
            }
        });
    }
}
