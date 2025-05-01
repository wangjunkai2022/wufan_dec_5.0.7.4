package com.join.android.app.component.album;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.MApplication;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v;
import com.join.mgps.Util.x1;
import com.join.mgps.customview.ClipImageLayout;
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.Constant;
import com.join.mgps.dto.UploadPortraitRequestBean;
import com.join.mgps.dto.UploadResultMainBean;
import com.join.mgps.rpc.b;
import com.join.mgps.rpc.h;
import com.papa.sim.statistic.JsonMapper;
import com.papa.sim.statistic.http.b;
import com.wufan.user.service.protobuf.n0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.crop_pic_layout)
/* loaded from: classes3.dex */
public class CropPicActivity extends FragmentActivity {

    /* renamed from: p  reason: collision with root package name */
    static String f14951p = "CropPicActivity";
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f14952b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    Button f14953c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ClipImageLayout f14954d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f14955e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f14956f;

    /* renamed from: g  reason: collision with root package name */
    private Context f14957g;

    /* renamed from: h  reason: collision with root package name */
    b f14958h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f14959i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    String f14960j;

    /* renamed from: k  reason: collision with root package name */
    n0 f14961k;

    /* renamed from: l  reason: collision with root package name */
    private d1 f14962l;

    /* renamed from: m  reason: collision with root package name */
    MApplication f14963m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    int f14964n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14965o = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        MApplication mApplication = (MApplication) getApplication();
        this.f14963m = mApplication;
        mApplication.e(this);
        this.f14957g = this;
        this.f14962l = b0.f0(this).x(this);
        this.f14958h = com.join.mgps.rpc.impl.a.c0();
        showLoading();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0() {
        this.f14962l.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        l2.a(this.f14957g).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
        this.f14963m.f();
        com.join.mgps.listener.a.b().c();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bd -> B:29:0x00c5). Please submit an issue!!! */
    public void g0(Bitmap bitmap) {
        try {
            File a5 = v.a();
            if (!a5.getParentFile().isDirectory()) {
                a5.getParentFile().delete();
            }
            if (!a5.getParentFile().exists()) {
                a5.getParentFile().mkdirs();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 300, 300, true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i4 = 100;
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            while (byteArrayOutputStream.toByteArray().length / 1024 > 30) {
                byteArrayOutputStream.reset();
                i4 -= 10;
                createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(a5);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                if (this.f14964n == 1) {
                    l0(a5);
                    File c5 = v.c();
                    h0.c(a5 + "", c5 + "");
                    Fresco.getImagePipeline().e(MyImageLoader.G(c5));
                    AccountUtil_.getInstance_(this.f14957g).setLocalUserIcon(c5 + "");
                } else {
                    f0();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        g0(this.f14954d.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(Bitmap bitmap) {
        this.f14959i.setVisibility(8);
        this.f14954d.setVisibility(0);
        if (bitmap == null) {
            return;
        }
        this.f14954d.getmZoomImageView().setImageBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        i0(this.f14954d.c(this.f14957g, this.f14960j));
    }

    public boolean k0(n0 n0Var, File file, Context context) {
        this.f14965o = false;
        UploadPortraitRequestBean uploadPortraitRequestBean = new UploadPortraitRequestBean();
        uploadPortraitRequestBean.setDevice_id("");
        uploadPortraitRequestBean.setToken(n0Var.getToken());
        uploadPortraitRequestBean.setUid(n0Var.getUid());
        try {
            UploadResultMainBean uploadResultMainBean = (UploadResultMainBean) JsonMapper.e().fromJson(com.papa.sim.statistic.http.b.I().c(h.f54056j + "/user/upfile/upload_user_head_portrait", "files", file, new b.n[]{new b.n("uid", uploadPortraitRequestBean.getUid() + ""), new b.n("token", uploadPortraitRequestBean.getToken()), new b.n("device_id", uploadPortraitRequestBean.getDevice_id()), new b.n(Constant.MD5, x1.g(uploadPortraitRequestBean))}, file.getName()).body().string(), UploadResultMainBean.class);
            if (uploadResultMainBean != null && uploadResultMainBean.getError() == 0) {
                if (uploadResultMainBean.getData().is_success()) {
                    this.f14965o = true;
                    n0.b builder = n0Var.toBuilder();
                    builder.K3(file.getAbsolutePath());
                    AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(builder.build(), getApplicationContext());
                } else {
                    this.f14965o = false;
                }
            } else {
                this.f14965o = false;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            this.f14965o = false;
        }
        return this.f14965o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(File file) {
        if (j.j(this)) {
            e0();
            try {
                n0 accountData = AccountUtil_.getInstance_(this.f14957g).getAccountData();
                this.f14961k = accountData;
                if (accountData == null) {
                    showLodingDismis();
                    return;
                }
                boolean z4 = false;
                if (file != null && file.isFile() && file.exists()) {
                    z4 = k0(this.f14961k, file, this.f14957g);
                }
                showLodingDismis();
                if (z4) {
                    f0();
                    return;
                } else {
                    error("连接失败，请稍后再试。");
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingDismis();
                error("连接失败，请稍后再试。");
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        showLodingDismis();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoading() {
        this.f14953c.setVisibility(0);
        this.f14955e.setText("裁剪图像");
        this.f14953c.setBackgroundResource(R.drawable.common_blue_selector);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        d1 d1Var = this.f14962l;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f14962l.dismiss();
    }
}
