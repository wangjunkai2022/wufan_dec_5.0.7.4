package com.ss.android.downloadlib.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import com.alipay.sdk.authjs.a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.download.api.config.x;
import com.ss.android.download.api.model.m;
import com.ss.android.downloadad.api.vv.m;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.m.u;
import com.ss.android.downloadlib.addownload.r;
import com.ss.android.downloadlib.addownload.vv.o;
import com.ss.android.downloadlib.guide.install.vv;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.downloadlib.n.k;
import com.ss.android.downloadlib.qv;
import com.ss.android.socialbase.appdownloader.p;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.umeng.analytics.pro.bm;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class TTDelegateActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback {

    /* renamed from: i  reason: collision with root package name */
    private static vv f60374i;

    /* renamed from: m  reason: collision with root package name */
    private boolean f60375m;

    /* renamed from: p  reason: collision with root package name */
    private m f60376p;
    protected Intent vv = null;

    public static void m(String str, com.ss.android.downloadad.api.vv.vv vvVar) {
        Intent p4 = p(vvVar);
        p4.addFlags(268435456);
        p4.putExtra("type", 11);
        p4.putExtra(bm.f63454o, str);
        if (b.getContext() != null) {
            b.getContext().startActivity(p4);
        }
    }

    private static Intent p(@NonNull com.ss.android.downloadad.api.vv.vv vvVar) {
        return new Intent(b.getContext(), TTDelegateActivity.class);
    }

    public static void vv(String str, String[] strArr) {
        Intent intent = new Intent(b.getContext(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 1);
        intent.putExtra("permission_id_key", str);
        intent.putExtra("permission_content_key", strArr);
        if (b.getContext() != null) {
            b.getContext().startActivity(intent);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m();
        this.vv = getIntent();
        b.m(this);
        vv();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.vv = intent;
        b.m(this);
        vv();
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        b.o().vv(this, i4, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onStop() {
        m mVar;
        DownloadInfo m4;
        super.onStop();
        if (!this.f60375m || (mVar = this.f60376p) == null) {
            return;
        }
        if (!TextUtils.isEmpty(mVar.fn())) {
            m4 = qv.vv(b.getContext()).vv(this.f60376p.fn(), null, true);
        } else {
            m4 = qv.vv(b.getContext()).m(this.f60376p.vv());
        }
        if (m4 == null || m4.getCurBytes() < m4.getTotalBytes() || isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.activity.TTDelegateActivity.p():void");
    }

    public static void m(String str, long j4, String str2) {
        Intent intent = new Intent(b.getContext(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 14);
        intent.putExtra(bm.f63454o, str);
        intent.putExtra("model_id", j4);
        intent.putExtra("market_app_id", str2);
        if (b.getContext() != null) {
            b.getContext().startActivity(intent);
        }
    }

    public static void vv(String str, com.ss.android.downloadad.api.vv.vv vvVar) {
        Intent p4 = p(vvVar);
        p4.addFlags(268435456);
        p4.putExtra("type", 2);
        p4.putExtra("open_url", str);
        if (b.getContext() != null) {
            b.getContext().startActivity(p4);
        }
    }

    public static void vv(com.ss.android.downloadad.api.vv.vv vvVar) {
        Intent p4 = p(vvVar);
        p4.addFlags(268435456);
        p4.putExtra("type", 4);
        p4.putExtra("model_id", vvVar.m());
        if (b.getContext() != null) {
            b.getContext().startActivity(p4);
        }
    }

    public static void m(@NonNull com.ss.android.downloadad.api.vv.vv vvVar) {
        vv(vvVar, 5, "", "", "", "");
    }

    public static void m(@NonNull com.ss.android.downloadad.api.vv.vv vvVar, String str, String str2, String str3) {
        vv(vvVar, 7, str, str2, str3, "");
    }

    public static void m(@NonNull com.ss.android.downloadad.api.vv.vv vvVar, String str, String str2, String str3, String str4) {
        vv(vvVar, 20, str, str2, str3, str4);
    }

    private void m() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    public static void vv(com.ss.android.downloadad.api.vv.vv vvVar, vv vvVar2) {
        Intent p4 = p(vvVar);
        p4.addFlags(268435456);
        p4.putExtra("type", 9);
        f60374i = vvVar2;
        if (b.getContext() != null) {
            b.getContext().startActivity(p4);
        }
    }

    private void m(final String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            x xVar = new x() { // from class: com.ss.android.downloadlib.activity.TTDelegateActivity.1

                /* renamed from: p  reason: collision with root package name */
                private WeakReference<Activity> f60378p;

                {
                    this.f60378p = new WeakReference<>(TTDelegateActivity.this);
                }

                @Override // com.ss.android.download.api.config.x
                public void vv() {
                    k.vv(str);
                    p.vv(this.f60378p.get());
                }

                @Override // com.ss.android.download.api.config.x
                public void vv(String str2) {
                    k.vv(str, str2);
                    p.vv(this.f60378p.get());
                }
            };
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    b.o().vv(this, strArr, xVar);
                    return;
                } catch (Exception e5) {
                    b.x().vv(e5, "requestPermission");
                }
            }
            xVar.vv();
            return;
        }
        p.vv((Activity) this);
    }

    public static void vv(long j4) {
        Intent intent = new Intent(b.getContext(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 10);
        intent.putExtra("app_info_id", j4);
        if (b.getContext() != null) {
            b.getContext().startActivity(intent);
        }
    }

    private void m(String str) {
        Intent n4 = jh.n(this, str);
        if (n4 == null) {
            return;
        }
        try {
            n4.addFlags(268435456);
            n4.putExtra("start_only_for_android", true);
            startActivity(n4);
        } catch (Exception e5) {
            e5.printStackTrace();
        } finally {
            p.vv((Activity) this);
        }
    }

    public static void vv(String str, long j4, String str2, @NonNull JSONObject jSONObject) {
        Intent intent = new Intent(b.getContext(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 12);
        intent.putExtra(bm.f63454o, str);
        intent.putExtra("model_id", j4);
        intent.putExtra(a.f4790l, str2);
        intent.putExtra("ext_json", jSONObject.toString());
        if (b.getContext() != null) {
            b.getContext().startActivity(intent);
        }
    }

    private void m(long j4) {
        final m i4 = u.vv().i(j4);
        if (i4 == null) {
            com.ss.android.downloadlib.o.p.vv().vv("showOpenAppDialogInner nativeModel null");
            p.vv((Activity) this);
            return;
        }
        com.ss.android.download.api.config.jh p4 = b.p();
        m.vv vv = new m.vv(this).vv("已安装完成");
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(i4.lb()) ? "刚刚下载的应用" : i4.lb();
        p4.m(vv.m(String.format("%1$s已安装完成，是否立即打开？", objArr)).p("打开").i("取消").vv(false).vv(jh.i(this, i4.o())).vv(new m.InterfaceC0608m() { // from class: com.ss.android.downloadlib.activity.TTDelegateActivity.2
            @Override // com.ss.android.download.api.model.m.InterfaceC0608m
            public void m(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.i.vv.vv().m("market_openapp_cancel", i4);
                TTDelegateActivity tTDelegateActivity = TTDelegateActivity.this;
                if (tTDelegateActivity != null && !tTDelegateActivity.isFinishing()) {
                    dialogInterface.dismiss();
                }
                p.vv((Activity) TTDelegateActivity.this);
            }

            @Override // com.ss.android.download.api.model.m.InterfaceC0608m
            public void p(DialogInterface dialogInterface) {
                p.vv((Activity) TTDelegateActivity.this);
            }

            @Override // com.ss.android.download.api.model.m.InterfaceC0608m
            public void vv(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.m.vv.m(i4);
                TTDelegateActivity tTDelegateActivity = TTDelegateActivity.this;
                if (tTDelegateActivity != null && !tTDelegateActivity.isFinishing()) {
                    dialogInterface.dismiss();
                }
                p.vv((Activity) TTDelegateActivity.this);
            }
        }).vv(2).vv());
        com.ss.android.downloadlib.i.vv.vv().m("market_openapp_window_show", i4);
    }

    public static void vv(String str, long j4, String str2) {
        Intent intent = new Intent(b.getContext(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 13);
        intent.putExtra(bm.f63454o, str);
        intent.putExtra("model_id", j4);
        intent.putExtra("need_comment", str2);
        if (b.getContext() != null) {
            b.getContext().startActivity(intent);
        }
    }

    public static void vv(String str, long j4) {
        Intent intent = new Intent(b.getContext(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 15);
        intent.putExtra(bm.f63454o, str);
        intent.putExtra("model_id", j4);
        if (b.getContext() != null) {
            b.getContext().startActivity(intent);
        }
    }

    private void p(long j4) {
        new com.ss.android.downloadlib.addownload.compliance.vv(this, j4).show();
    }

    public static void vv(@NonNull com.ss.android.downloadad.api.vv.vv vvVar, String str) {
        vv(vvVar, 19, "", "", "", str);
    }

    public static void vv(@NonNull com.ss.android.downloadad.api.vv.vv vvVar, String str, String str2, String str3) {
        vv(vvVar, 8, str, str2, str3, "");
    }

    public static void vv(@NonNull com.ss.android.downloadad.api.vv.vv vvVar, String str, String str2, String str3, String str4) {
        vv(vvVar, 21, str, str2, str3, str4);
    }

    private static void vv(@NonNull com.ss.android.downloadad.api.vv.vv vvVar, int i4, String str, String str2, String str3, String str4) {
        Intent p4 = p(vvVar);
        p4.addFlags(268435456);
        p4.putExtra("type", i4);
        if (!TextUtils.isEmpty(str2)) {
            p4.putExtra("positive_button_text", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            p4.putExtra("negative_button_text", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            p4.putExtra("delete_button_text", str4);
        }
        if (!TextUtils.isEmpty(str)) {
            p4.putExtra("message_text", str);
        }
        p4.putExtra("model_id", vvVar.m());
        if (b.getContext() != null) {
            b.getContext().startActivity(p4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected void vv() {
        Intent intent = this.vv;
        if (intent != null) {
            switch (intent.getIntExtra("type", 0)) {
                case 1:
                    m(this.vv.getStringExtra("permission_id_key"), this.vv.getStringArrayExtra("permission_content_key"));
                    break;
                case 2:
                    vv(this.vv.getStringExtra("open_url"));
                    break;
                case 3:
                case 6:
                case 16:
                case 17:
                case 18:
                default:
                    p.vv((Activity) this);
                    break;
                case 4:
                    m(this.vv.getLongExtra("model_id", 0L));
                    break;
                case 5:
                    vv(this.vv.getLongExtra("model_id", 0L), "");
                    break;
                case 7:
                case 8:
                case 20:
                case 21:
                    p();
                    break;
                case 9:
                    vv vvVar = f60374i;
                    if (vvVar != null) {
                        vvVar.vv();
                    }
                    p.vv((Activity) this);
                    break;
                case 10:
                    p(this.vv.getLongExtra("app_info_id", 0L));
                    break;
                case 11:
                    m(this.vv.getStringExtra(bm.f63454o));
                    break;
                case 12:
                    com.ss.android.downloadlib.n.qv.vv(this, this.vv.getStringExtra(bm.f63454o), this.vv.getLongExtra("model_id", 0L), this.vv.getStringExtra(a.f4790l), this.vv.getStringExtra("ext_json"));
                    p.vv((Activity) this);
                    break;
                case 13:
                    com.ss.android.downloadlib.n.qv.vv(this, this.vv.getStringExtra(bm.f63454o), this.vv.getLongExtra("model_id", 0L), this.vv.getStringExtra("need_comment"));
                    p.vv((Activity) this);
                    break;
                case 14:
                    com.ss.android.downloadlib.n.qv.m(this, this.vv.getStringExtra(bm.f63454o), this.vv.getLongExtra("model_id", 0L), this.vv.getStringExtra("market_app_id"));
                    p.vv((Activity) this);
                    break;
                case 15:
                    com.ss.android.downloadlib.n.qv.vv(this, this.vv.getStringExtra(bm.f63454o), this.vv.getLongExtra("model_id", 0L));
                    p.vv((Activity) this);
                    break;
                case 19:
                    vv(this.vv.getLongExtra("model_id", 0L), this.vv.getStringExtra("delete_button_text"));
                    break;
            }
            this.vv = null;
        }
    }

    private void vv(long j4, String str) {
        if (r.vv() == null) {
            return;
        }
        com.ss.android.downloadad.api.vv.m i4 = u.vv().i(j4);
        if (i4 != null) {
            DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(i4.la());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("time_after_click", Long.valueOf(System.currentTimeMillis() - i4.e()));
                jSONObject.putOpt("click_download_size", Long.valueOf(i4.ju()));
                if (downloadInfo != null) {
                    jSONObject.putOpt("download_length", Long.valueOf(downloadInfo.getCurBytes()));
                    jSONObject.putOpt("download_percent", Long.valueOf(downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()));
                    jSONObject.putOpt("download_apk_size", Long.valueOf(downloadInfo.getTotalBytes()));
                    jSONObject.putOpt("download_current_bytes", Integer.valueOf((int) (downloadInfo.getCurBytes() / 1048576)));
                    jSONObject.putOpt("download_total_bytes", Integer.valueOf((int) (downloadInfo.getTotalBytes() / 1048576)));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (!TextUtils.isEmpty(str)) {
                com.ss.android.downloadlib.i.vv.vv().vv("cancel_pause_reserve_wifi_dialog_show", jSONObject, i4);
            } else {
                com.ss.android.downloadlib.i.vv.vv().m("pause_reserve_wifi_dialog_show", jSONObject, i4);
            }
        }
        o.vv vv = new o.vv(this).vv(false).vv(r.vv());
        if (!TextUtils.isEmpty(str)) {
            vv.i(str).vv(r.m());
        }
        vv.vv().show();
        this.f60375m = true;
        this.f60376p = i4;
    }

    private void vv(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.putExtra("open_url", str);
            intent.addFlags(268435456);
            if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_app_link_flag")) {
                intent.addFlags(TTAdConstant.KEY_CLICK_AREA);
            }
            intent.putExtra("start_only_for_android", true);
            startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        } finally {
            p.vv((Activity) this);
        }
    }
}
