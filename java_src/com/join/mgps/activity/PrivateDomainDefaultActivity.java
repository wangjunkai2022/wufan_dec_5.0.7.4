package com.join.mgps.activity;

import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.dto.WxProgram;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.ext.ToastManager;
import io.reactivex.functions.Consumer;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
@EActivity(R.layout.activity_private_domain_default)
/* loaded from: classes4.dex */
public class PrivateDomainDefaultActivity extends BaseDialogActivity implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private View f36936b;

    /* renamed from: c  reason: collision with root package name */
    private View f36937c;

    /* renamed from: d  reason: collision with root package name */
    TextView f36938d;

    /* renamed from: e  reason: collision with root package name */
    private SimpleDraweeView f36939e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f36940f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f36941g;

    /* renamed from: h  reason: collision with root package name */
    private View f36942h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    WxProgram f36943i;

    /* loaded from: classes4.dex */
    class a implements View.OnLongClickListener {
        a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PrivateDomainDefaultActivity.this.i0();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Consumer<com.tbruyelle.rxpermissions2.b> {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && bVar.f62140b) {
                PrivateDomainDefaultActivity privateDomainDefaultActivity = PrivateDomainDefaultActivity.this;
                com.join.mgps.Util.p0.a(privateDomainDefaultActivity, privateDomainDefaultActivity.h0(Uri.parse(privateDomainDefaultActivity.f36943i.getCode_url())));
                ToastManager.show("保存成功");
                PrivateDomainDefaultActivity.this.finish();
                return;
            }
            ToastManager.show("保存失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap h0(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            com.facebook.imagepipeline.core.i r1 = com.facebook.drawee.backends.pipeline.Fresco.getImagePipelineFactory()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            com.facebook.cache.disk.h r1 = r1.l()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            com.facebook.cache.common.i r2 = new com.facebook.cache.common.i     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            e0.a r5 = r1.c(r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            if (r5 == 0) goto L29
            java.io.InputStream r5 = r5.a()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            if (r5 == 0) goto L25
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L4b
            goto L25
        L23:
            r1 = move-exception
            goto L3d
        L25:
            r3 = r0
            r0 = r5
            r5 = r3
            goto L2a
        L29:
            r5 = r0
        L2a:
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.io.IOException -> L30
            goto L34
        L30:
            r0 = move-exception
            r0.printStackTrace()
        L34:
            r0 = r5
            goto L4a
        L36:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L4c
        L3b:
            r1 = move-exception
            r5 = r0
        L3d:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r5 = move-exception
            r5.printStackTrace()
        L4a:
            return r0
        L4b:
            r0 = move-exception
        L4c:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r5 = move-exception
            r5.printStackTrace()
        L56:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PrivateDomainDefaultActivity.h0(android.net.Uri):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        new com.tbruyelle.rxpermissions2.c(this).r(com.kuaishou.weapon.p0.g.f55590j).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.c2.s(this);
        this.f36938d = (TextView) findViewById(R.id.name);
        this.f36936b = findViewById(R.id.iv_close);
        this.f36937c = findViewById(R.id.v_close1);
        this.f36939e = (SimpleDraweeView) findViewById(R.id.sdv_image);
        this.f36941g = (TextView) findViewById(R.id.tv_save_qr);
        this.f36940f = (RelativeLayout) findViewById(R.id.rl_container);
        this.f36942h = findViewById(R.id.ll_content);
        this.f36936b.setOnClickListener(this);
        this.f36937c.setOnClickListener(this);
        this.f36941g.setOnClickListener(this);
        this.f36940f.setOnLongClickListener(new a());
        if (getResources().getConfiguration().orientation == 2) {
            getWindow().setGravity(17);
        } else {
            getWindow().setGravity(80);
        }
        WxProgram wxProgram = this.f36943i;
        if (wxProgram != null) {
            this.f36938d.setText(wxProgram.getCode_text());
            MyImageLoader.h(this.f36939e, this.f36943i.getCode_url());
            com.papa.sim.statistic.p.l(this).O1(Event.pdReserveCode, new Ext().setActType(this.f36943i.getSceneType()));
        }
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    public View getContentView() {
        return this.f36942h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close || id == R.id.v_close1) {
            finish();
        } else if (id == R.id.tv_save_qr) {
            i0();
        }
    }
}
