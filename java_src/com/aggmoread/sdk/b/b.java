package com.aggmoread.sdk.b;

import android.app.Activity;
import com.aggmoread.sdk.client.AMAdApkInfo;
import com.aggmoread.sdk.client.AMAdDownloadConfirmListener;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
/* loaded from: classes2.dex */
public class b implements com.aggmoread.sdk.z.c.a.a.d.a.c {

    /* renamed from: a  reason: collision with root package name */
    private AMAdDownloadConfirmListener f1927a;

    /* loaded from: classes2.dex */
    class a implements AMAdDownloadConfirmListener.Controller {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.b f1928a;

        /* renamed from: com.aggmoread.sdk.b.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0052a implements c.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AMAdDownloadConfirmListener.ApkInfoLoadListener f1929a;

            C0052a(a aVar, AMAdDownloadConfirmListener.ApkInfoLoadListener apkInfoLoadListener) {
                this.f1929a = apkInfoLoadListener;
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.a.c.a
            public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
                this.f1929a.onApkInfoLoadFailed(new AMError(dVar.a(), dVar.b()));
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.a.c.a
            public void a(com.aggmoread.sdk.z.c.a.a.d.a.b bVar) {
                this.f1929a.onApkInfo(new AMAdApkInfo(bVar.a(), bVar.b(), bVar.h(), bVar.c(), bVar.g(), bVar.f(), bVar.e(), bVar.d()));
            }
        }

        a(b bVar, c.b bVar2) {
            this.f1928a = bVar2;
        }

        @Override // com.aggmoread.sdk.client.AMAdDownloadConfirmListener.Controller
        public void loadAppInfo(AMAdDownloadConfirmListener.ApkInfoLoadListener apkInfoLoadListener) {
            this.f1928a.a(new C0052a(this, apkInfoLoadListener));
        }

        @Override // com.aggmoread.sdk.client.AMAdDownloadConfirmListener.Controller
        public void onCancel() {
            this.f1928a.onCancel();
        }

        @Override // com.aggmoread.sdk.client.AMAdDownloadConfirmListener.Controller
        public void onConfirm() {
            this.f1928a.onConfirm();
        }
    }

    public b(AMAdDownloadConfirmListener aMAdDownloadConfirmListener) {
        this.f1927a = aMAdDownloadConfirmListener;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.c
    public void a(Activity activity, int i4, c.b bVar) {
        this.f1927a.onDownloadConfirm(activity, i4, new a(this, bVar));
    }
}
