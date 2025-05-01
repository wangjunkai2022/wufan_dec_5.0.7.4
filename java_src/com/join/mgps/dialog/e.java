package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.VersionDto;
import com.join.mgps.service.UpdateService_;
import com.papa91.arc.ext.ToastManager;
import java.io.File;
/* compiled from: AppUpdateDialog.java */
/* loaded from: classes4.dex */
public class e extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49318b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49319c;

    /* renamed from: d  reason: collision with root package name */
    WebView f49320d;

    /* renamed from: e  reason: collision with root package name */
    VersionDto f49321e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f49322f;

    /* renamed from: g  reason: collision with root package name */
    RelativeLayout f49323g;

    /* renamed from: h  reason: collision with root package name */
    SimpleDraweeView f49324h;

    /* renamed from: i  reason: collision with root package name */
    Button f49325i;

    /* renamed from: j  reason: collision with root package name */
    View f49326j;

    /* renamed from: k  reason: collision with root package name */
    boolean f49327k;

    /* renamed from: l  reason: collision with root package name */
    boolean f49328l;

    /* renamed from: m  reason: collision with root package name */
    private long f49329m;

    /* compiled from: AppUpdateDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ContextCompat.checkSelfPermission(e.this.f49318b, com.kuaishou.weapon.p0.g.f55590j) != 0) {
                UtilsMy.O2(e.this.f49318b, com.kuaishou.weapon.p0.g.f55590j);
            }
            e eVar = e.this;
            if (eVar.f49328l) {
                eVar.a(new File(e.this.f49321e.getFilepath()), e.this.f49318b);
            } else {
                ((UpdateService_.a) UpdateService_.p(eVar.f49318b).extra("url", e.this.f49321e.getAndroidUrl())).a();
            }
            e eVar2 = e.this;
            if (!eVar2.f49327k) {
                eVar2.dismiss();
            }
            if (com.join.android.app.common.utils.j.j(e.this.getContext())) {
                com.join.mgps.Util.l2.a(e.this.f49318b).b("更新包开始下载");
            } else {
                ToastManager.show("网络未连接，请检查重试");
            }
        }
    }

    /* compiled from: AppUpdateDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppUpdateDialog.java */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppUpdateDialog.java */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.dismiss();
            e eVar = e.this;
            if (eVar.f49328l) {
                eVar.a(new File(e.this.f49321e.getFilepath()), e.this.f49318b);
            } else {
                ((UpdateService_.a) UpdateService_.p(eVar.f49318b).extra("url", e.this.f49321e.getAndroidUrl())).a();
            }
        }
    }

    public e(Context context, int i4, VersionDto versionDto, boolean z4) {
        super(context, R.style.Dialog_Fullscreen);
        this.f49328l = false;
        this.f49329m = 0L;
        this.f49318b = context;
        this.f49321e = versionDto;
        this.f49327k = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, Context context) {
        com.join.android.app.common.utils.e.l0(context).w(context, file);
    }

    private void e() {
        if (this.f49321e.getTpl_type() == 2) {
            this.f49322f.setVisibility(8);
            this.f49323g.setVisibility(0);
            this.f49325i.setOnClickListener(new c());
            if (this.f49327k) {
                this.f49325i.setVisibility(8);
            } else {
                this.f49325i.setVisibility(0);
                setCancelable(true);
            }
            MyImageLoader.h(this.f49324h, this.f49321e.getTow_tpl_back_ground_pic());
            this.f49324h.setOnClickListener(new d());
        } else {
            this.f49322f.setVisibility(0);
            this.f49323g.setVisibility(8);
        }
        this.f49320d.loadDataWithBaseURL(null, this.f49321e.getInfo(), "text/html", "utf-8", null);
        if (this.f49327k) {
            this.f49326j.findViewById(R.id.cancel).setVisibility(8);
        } else {
            this.f49326j.findViewById(R.id.cancel).setVisibility(0);
        }
        if (this.f49328l) {
            this.f49326j.findViewById(R.id.cancel).setVisibility(8);
            ((TextView) this.f49326j.findViewById(R.id.installNotice)).setVisibility(0);
            ((TextView) this.f49326j.findViewById(R.id.updateNow)).setText("免流量安装");
        }
    }

    public void c(String str) {
        this.f49319c.setText(str);
    }

    public void d(VersionDto versionDto, boolean z4) {
        this.f49321e = versionDto;
        this.f49327k = z4;
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() != 1) {
            if (this.f49327k) {
                if (System.currentTimeMillis() - this.f49329m > 2000) {
                    Toast.makeText(this.f49318b, "再按一次退出程序", 0).show();
                    this.f49329m = System.currentTimeMillis();
                    show();
                    return true;
                }
                ((Activity) this.f49318b).finish();
                System.exit(0);
                return true;
            }
            dismiss();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49318b).inflate(R.layout.dialog_app_update, (ViewGroup) null);
        this.f49326j = inflate;
        WebView webView = (WebView) inflate.findViewById(R.id.info);
        this.f49320d = webView;
        UtilsMy.C3(webView);
        this.f49322f = (RelativeLayout) this.f49326j.findViewById(R.id.oldVersion);
        this.f49323g = (RelativeLayout) this.f49326j.findViewById(R.id.newVersion);
        this.f49324h = (SimpleDraweeView) this.f49326j.findViewById(R.id.newUpdateImage);
        this.f49325i = (Button) this.f49326j.findViewById(R.id.newClosed);
        e();
        this.f49326j.findViewById(R.id.updateNow).setOnClickListener(new a());
        this.f49326j.findViewById(R.id.cancel).setOnClickListener(new b());
        setContentView(this.f49326j);
    }

    public e(Context context, int i4, VersionDto versionDto) {
        super(context, R.style.Dialog_Fullscreen);
        this.f49328l = false;
        this.f49329m = 0L;
        this.f49318b = context;
        this.f49321e = versionDto;
        this.f49328l = true;
    }

    public e(Context context) {
        super(context, R.style.Dialog_Fullscreen);
        this.f49328l = false;
        this.f49329m = 0L;
        this.f49318b = context;
    }
}
