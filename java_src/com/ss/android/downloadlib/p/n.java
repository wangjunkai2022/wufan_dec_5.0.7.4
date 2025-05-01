package com.ss.android.downloadlib.p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.download.api.model.m;
import com.ss.android.socialbase.appdownloader.p.b;
import com.ss.android.socialbase.appdownloader.p.jh;
/* loaded from: classes5.dex */
public class n extends com.ss.android.socialbase.appdownloader.p.vv {
    private static String vv = "n";

    /* loaded from: classes5.dex */
    private static class vv implements b {
        private Dialog vv;

        public vv(Dialog dialog) {
            if (dialog != null) {
                this.vv = dialog;
                vv();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.p.b
        public boolean m() {
            Dialog dialog = this.vv;
            if (dialog != null) {
                return dialog.isShowing();
            }
            return false;
        }

        @Override // com.ss.android.socialbase.appdownloader.p.b
        public void vv() {
            Dialog dialog = this.vv;
            if (dialog != null) {
                dialog.show();
            }
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.p.vv, com.ss.android.socialbase.appdownloader.p.p
    public jh vv(Context context) {
        return new jh(context) { // from class: com.ss.android.downloadlib.p.n.1

            /* renamed from: i  reason: collision with root package name */
            private DialogInterface.OnClickListener f60690i;

            /* renamed from: o  reason: collision with root package name */
            private DialogInterface.OnClickListener f60692o;

            /* renamed from: p  reason: collision with root package name */
            private m.vv f60693p;

            /* renamed from: u  reason: collision with root package name */
            private DialogInterface.OnCancelListener f60694u;
            final /* synthetic */ Context vv;

            {
                this.vv = context;
                this.f60693p = new m.vv(context);
            }

            @Override // com.ss.android.socialbase.appdownloader.p.jh
            public jh m(int i4, DialogInterface.OnClickListener onClickListener) {
                this.f60693p.i(this.vv.getResources().getString(i4));
                this.f60692o = onClickListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.p.jh
            public jh vv(int i4) {
                this.f60693p.vv(this.vv.getResources().getString(i4));
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.p.jh
            public jh vv(String str) {
                this.f60693p.m(str);
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.p.jh
            public jh vv(int i4, DialogInterface.OnClickListener onClickListener) {
                this.f60693p.p(this.vv.getResources().getString(i4));
                this.f60690i = onClickListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.p.jh
            public jh vv(DialogInterface.OnCancelListener onCancelListener) {
                this.f60694u = onCancelListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.p.jh
            public jh vv(boolean z4) {
                this.f60693p.vv(z4);
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.p.jh
            public b vv() {
                this.f60693p.vv(new m.InterfaceC0608m() { // from class: com.ss.android.downloadlib.p.n.1.1
                    @Override // com.ss.android.download.api.model.m.InterfaceC0608m
                    public void m(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f60692o != null) {
                            AnonymousClass1.this.f60692o.onClick(dialogInterface, -2);
                        }
                    }

                    @Override // com.ss.android.download.api.model.m.InterfaceC0608m
                    public void p(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f60694u == null || dialogInterface == null) {
                            return;
                        }
                        AnonymousClass1.this.f60694u.onCancel(dialogInterface);
                    }

                    @Override // com.ss.android.download.api.model.m.InterfaceC0608m
                    public void vv(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f60690i != null) {
                            AnonymousClass1.this.f60690i.onClick(dialogInterface, -1);
                        }
                    }
                });
                com.ss.android.downloadlib.n.b.vv(n.vv, "getThemedAlertDlgBuilder", null);
                this.f60693p.vv(3);
                return new vv(com.ss.android.downloadlib.addownload.b.p().m(this.f60693p.vv()));
            }
        };
    }

    @Override // com.ss.android.socialbase.appdownloader.p.vv, com.ss.android.socialbase.appdownloader.p.p
    public boolean vv() {
        return true;
    }
}
