package com.join.mgps.activity;

import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.service.CommonService_;
import io.reactivex.functions.Consumer;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_quark_install_app)
/* loaded from: classes4.dex */
public class QuarkInstallAppActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f36984b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36985c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f36986d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    int f36987e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    String f36988f;

    /* loaded from: classes4.dex */
    class a implements Consumer<com.tbruyelle.rxpermissions2.b> {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            ((CommonService_.h2) CommonService_.S2(QuarkInstallAppActivity.this).extra("action", "quarkScan")).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @org.androidannotations.annotations.AfterViews
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterViews() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            com.join.mgps.Util.c2.s(r10)
            r1 = 1
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = r10.f36988f     // Catch: java.lang.Exception -> L30
            android.content.pm.PackageInfo r3 = r2.getPackageArchiveInfo(r3, r1)     // Catch: java.lang.Exception -> L30
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = r10.f36988f     // Catch: java.lang.Exception -> L30
            r3.sourceDir = r4     // Catch: java.lang.Exception -> L30
            r3.publicSourceDir = r4     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r4.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.CharSequence r5 = r3.loadLabel(r2)     // Catch: java.lang.Exception -> L30
            r4.append(r5)     // Catch: java.lang.Exception -> L30
            r4.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L30
            android.graphics.drawable.Drawable r2 = r3.loadIcon(r2)     // Catch: java.lang.Exception -> L31
            goto L32
        L30:
            r4 = r0
        L31:
            r2 = 0
        L32:
            android.widget.TextView r3 = r10.f36984b
            r5 = 2131755418(0x7f10019a, float:1.9141715E38)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r10.f36987e
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r6[r7] = r0
            java.lang.String r0 = r10.getString(r5, r6)
            r3.setText(r0)
            android.widget.TextView r0 = r10.f36985c
            r0.setText(r4)
            if (r2 == 0) goto L68
            com.facebook.drawee.view.SimpleDraweeView r0 = r10.f36986d
            o0.b r0 = r0.getHierarchy()
            com.facebook.drawee.generic.a r0 = (com.facebook.drawee.generic.a) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            r0.d(r2, r3, r1)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.QuarkInstallAppActivity.afterViews():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        new com.tbruyelle.rxpermissions2.c(this).r(com.kuaishou.weapon.p0.g.f55589i).subscribe(new a());
        finish();
    }
}
