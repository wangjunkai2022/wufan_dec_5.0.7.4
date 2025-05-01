package com.bytedance.sdk.openadsdk.downloadnew;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTDownloadEventLogger;
import com.bytedance.sdk.openadsdk.downloadnew.core.DialogBuilder;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadAdapter;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadVisitor;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadEventModel;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.downloadnew.m;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.g;
import com.ss.android.download.api.config.jh;
import com.ss.android.download.api.config.n;
import com.ss.android.download.api.config.qv;
import com.ss.android.download.api.config.x;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.m;
import com.ss.android.downloadlib.addownload.m.u;
import com.ss.android.downloadlib.addownload.vv.vv;
import com.ss.android.downloadlib.m.k;
import com.ss.android.socialbase.downloader.depend.ff;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.android.socialbase.downloader.network.wv;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class p {

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicBoolean f8782i = new AtomicBoolean(false);

    /* renamed from: m  reason: collision with root package name */
    public static boolean f8783m = true;

    /* renamed from: n  reason: collision with root package name */
    private static final com.ss.android.download.api.download.vv.vv f8784n;

    /* renamed from: o  reason: collision with root package name */
    private static Context f8785o;

    /* renamed from: p  reason: collision with root package name */
    public static ITTDownloadVisitor f8786p;

    /* renamed from: u  reason: collision with root package name */
    private static Map<Integer, ITTDownloadAdapter.OnEventLogHandler> f8787u;
    public static volatile String vv;

    /* loaded from: classes2.dex */
    public static class o implements IDownloadHttpService {
        @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpService
        public wv downloadWithConnection(int i4, String str, List<com.ss.android.socialbase.downloader.model.p> list) throws IOException {
            final m.vv vv = com.bytedance.sdk.openadsdk.downloadnew.m.vv(str, list);
            if (vv != null) {
                return new wv() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.o.1
                    @Override // com.ss.android.socialbase.downloader.network.wv
                    public void i() {
                        try {
                            vv.f8779i.disconnect();
                        } catch (Exception unused) {
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.network.n
                    public int m() {
                        return vv.f8781p;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.n
                    public void p() {
                    }

                    @Override // com.ss.android.socialbase.downloader.network.wv
                    public InputStream vv() {
                        return vv.vv;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.n
                    public String vv(String str2) {
                        Map<String, String> map = vv.f8780m;
                        if (map != null) {
                            return map.get(str2);
                        }
                        return null;
                    }
                };
            }
            return null;
        }
    }

    static {
        try {
            vv = getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getPath();
        } catch (Throwable unused) {
        }
        f8784n = new com.ss.android.download.api.download.vv.vv() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.6
            @Override // com.ss.android.download.api.download.vv.vv
            public void m(DownloadInfo downloadInfo, String str) {
                com.bytedance.sdk.openadsdk.api.p.m("TTDownloadVisitor", "completeListener: onInstalled");
                p.p(str);
            }

            @Override // com.ss.android.download.api.download.vv.vv
            public void vv(DownloadModel downloadModel, DownloadController downloadController, DownloadEventConfig downloadEventConfig) {
                com.bytedance.sdk.openadsdk.api.p.m("TTDownloadVisitor", "completeListener: onDownloadStart");
            }

            @Override // com.ss.android.download.api.download.vv.vv
            public void vv(DownloadInfo downloadInfo, String str) {
                com.bytedance.sdk.openadsdk.api.p.m("TTDownloadVisitor", "completeListener: onDownloadFinished");
            }

            @Override // com.ss.android.download.api.download.vv.vv
            public void vv(DownloadInfo downloadInfo, BaseException baseException, String str) {
                com.bytedance.sdk.openadsdk.api.p.m("TTDownloadVisitor", "completeListener: onDownloadFailed");
            }

            @Override // com.ss.android.download.api.download.vv.vv
            public void vv(DownloadInfo downloadInfo) {
                com.bytedance.sdk.openadsdk.api.p.m("TTDownloadVisitor", "completeListener: onCanceled");
            }
        };
    }

    private static Context getContext() {
        Context context = f8785o;
        return context == null ? TTAppContextHolder.getContext() : context;
    }

    static /* synthetic */ ITTDownloadVisitor i() {
        return o();
    }

    private static ITTDownloadVisitor o() {
        ITTDownloadVisitor iTTDownloadVisitor = f8786p;
        if (iTTDownloadVisitor == null) {
            TTAdManager adManager = TTAdSdk.getAdManager();
            if (adManager == null) {
                return null;
            }
            return (ITTDownloadVisitor) adManager.getExtra(ITTDownloadVisitor.class, com.bytedance.sdk.openadsdk.downloadnew.vv.vv(1));
        }
        return iTTDownloadVisitor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(String str) {
        com.ss.android.downloadad.api.vv.m vv2;
        JSONObject n4;
        if (TextUtils.isEmpty(str) || (vv2 = u.vv().vv(str)) == null || (n4 = vv2.n()) == null || o() == null) {
            return;
        }
        o().checkAutoControl(n4, str);
    }

    private static boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.downloadnew.p$p  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0225p implements com.ss.android.download.api.config.wv {
        @Override // com.ss.android.download.api.config.wv
        public void vv(Activity activity, int i4, String[] strArr, int[] iArr) {
        }

        @Override // com.ss.android.download.api.config.wv
        public void vv(Activity activity, String[] strArr, final x xVar) {
            if (p.i() != null) {
                p.i().requestPermission(activity, strArr, new ITTPermissionCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.p.1
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback
                    public void onDenied(String str) {
                        x xVar2 = xVar;
                        if (xVar2 != null) {
                            xVar2.vv(str);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback
                    public void onGranted() {
                        x xVar2 = xVar;
                        if (xVar2 != null) {
                            xVar2.vv();
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.download.api.config.wv
        public boolean vv(Context context, String str) {
            if (p.i() != null) {
                return p.i().hasPermission(context, str);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class vv implements n {
        private void p(com.ss.android.download.api.model.p pVar) {
            if (pVar == null) {
                return;
            }
            Object jh = pVar.jh();
            TTDownloadEventModel label = TTDownloadEventModel.builder().setTag(pVar.m()).setExtJson(pVar.qv()).setMaterialMeta(jh instanceof JSONObject ? (JSONObject) jh : null).setLabel(pVar.p());
            boolean z4 = "download_notification".equals(pVar.m()) || "landing_h5_download_ad_button".equals(pVar.m());
            if (p.i() != null) {
                p.i().executeLogUpload(label, z4);
            }
        }

        @Override // com.ss.android.download.api.config.n
        public void m(com.ss.android.download.api.model.p pVar) {
            com.bytedance.sdk.openadsdk.api.p.m("LibEventLogger", "onEvent called");
            vv(pVar, false);
            p(pVar);
        }

        @Override // com.ss.android.download.api.config.n
        public void vv(com.ss.android.download.api.model.p pVar) {
            com.bytedance.sdk.openadsdk.api.p.m("LibEventLogger", "onV3Event");
            vv(pVar, true);
        }

        private void vv(com.ss.android.download.api.model.p pVar, boolean z4) {
            TTDownloadEventLogger tTDownloadEventLogger;
            if (p.i() == null || (tTDownloadEventLogger = p.i().getTTDownloadEventLogger()) == null || pVar == null) {
                return;
            }
            if (tTDownloadEventLogger.shouldFilterOpenSdkLog() && p.i().isOpenSdkEvent(pVar.toString())) {
                return;
            }
            if (z4) {
                tTDownloadEventLogger.onV3Event(p.m(pVar));
            } else {
                tTDownloadEventLogger.onEvent(p.m(pVar));
            }
        }
    }

    public static void m() {
        vv().n();
        if (o() != null) {
            o().clearAllData(vv);
        }
    }

    public static void vv(Context context) {
        if (context == null) {
            context = TTAppContextHolder.getContext();
        }
        if (context == null) {
            return;
        }
        AtomicBoolean atomicBoolean = f8782i;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (p.class) {
            if (!atomicBoolean.get()) {
                f8785o = context.getApplicationContext();
                if (o() != null) {
                    String initPath = o().initPath(f8783m);
                    if (!TextUtils.isEmpty(initPath)) {
                        vv = initPath;
                    }
                }
                atomicBoolean.set(m(f8785o));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements jh {
        private final WeakReference<Context> vv;

        public i(Context context) {
            this.vv = new WeakReference<>(context);
        }

        private DialogBuilder p(final com.ss.android.download.api.model.m mVar) {
            return DialogBuilder.builder().setTitle(mVar.f60305m).setMessage(mVar.f60308p).setNegativeBtnText(mVar.f60307o).setPositiveBtnText(mVar.f60303i).setIcon(mVar.f60306n).setDialogStatusChangedListener(new IDialogStatusChangedListener() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.i.1
                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onCancel(DialogInterface dialogInterface) {
                    m.InterfaceC0608m interfaceC0608m = mVar.qv;
                    if (interfaceC0608m != null) {
                        interfaceC0608m.p(dialogInterface);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onNegativeBtnClick(DialogInterface dialogInterface) {
                    m.InterfaceC0608m interfaceC0608m = mVar.qv;
                    if (interfaceC0608m != null) {
                        try {
                            interfaceC0608m.m(dialogInterface);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onPositiveBtnClick(DialogInterface dialogInterface) {
                    m.InterfaceC0608m interfaceC0608m = mVar.qv;
                    if (interfaceC0608m != null) {
                        interfaceC0608m.vv(dialogInterface);
                    }
                }
            });
        }

        @Override // com.ss.android.download.api.config.jh
        public void vv(int i4, Context context, DownloadModel downloadModel, String str, Drawable drawable, int i5) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Toast.makeText(context, str, 0).show();
            } catch (Exception e5) {
                com.ss.android.socialbase.downloader.p.vv.o("LibUIFactory", "showToastWithDuration e " + e5.getMessage());
            }
        }

        @Override // com.ss.android.download.api.config.jh
        /* renamed from: vv */
        public AlertDialog m(com.ss.android.download.api.model.m mVar) {
            if (mVar != null && p.i() != null) {
                Context context = mVar.vv;
                if (context != null && (context instanceof Activity)) {
                    return p.i().showDialogBySelf((Activity) mVar.vv, mVar.f60304k == 1, p(mVar));
                }
                p.i().showDialogByDelegate(this.vv, mVar.f60304k == 1, p(mVar));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class m implements qv {
        private m() {
        }

        @Override // com.ss.android.download.api.config.qv
        public void vv(String str, String str2, Map<String, Object> map, final g gVar) {
            str.hashCode();
            int i4 = 0;
            if (!str.equals("GET") && str.equals("POST")) {
                i4 = 1;
            }
            if (p.i() != null) {
                p.i().execute(i4, str2, map, new ITTHttpCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.m.1
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onError(Throwable th) {
                        g gVar2 = gVar;
                        if (gVar2 != null) {
                            gVar2.vv(th);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onResponse(String str3) {
                        g gVar2 = gVar;
                        if (gVar2 != null) {
                            gVar2.vv(str3);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.download.api.config.qv
        public void vv(String str, byte[] bArr, String str2, int i4, final g gVar) {
            if (p.i() != null) {
                p.i().postBody(str, bArr, str2, new ITTHttpCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.m.2
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onError(Throwable th) {
                        g gVar2 = gVar;
                        if (gVar2 != null) {
                            gVar2.vv(th);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onResponse(String str3) {
                        g gVar2 = gVar;
                        if (gVar2 != null) {
                            gVar2.vv(str3);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m(android.content.Context r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r1 = r5.getPackageName()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L14
            java.lang.String r1 = ""
        L14:
            boolean r2 = u()
            if (r2 == 0) goto L25
            com.ss.android.downloadlib.qv r2 = com.ss.android.downloadlib.qv.vv(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "pangolin"
            com.ss.android.download.api.vv r2 = r2.vv(r3)     // Catch: java.lang.Throwable -> L25
            goto L2d
        L25:
            com.ss.android.downloadlib.qv r2 = com.ss.android.downloadlib.qv.vv(r5)
            com.ss.android.download.api.vv r2 = r2.vv()
        L2d:
            if (r2 != 0) goto L30
            return r0
        L30:
            com.ss.android.download.api.model.vv$vv r0 = new com.ss.android.download.api.model.vv$vv
            r0.<init>()
            java.lang.String r3 = "143"
            com.ss.android.download.api.model.vv$vv r0 = r0.m(r3)
            java.lang.String r3 = "open_news"
            com.ss.android.download.api.model.vv$vv r0 = r0.vv(r3)
            java.lang.String r3 = "6.2.1.7"
            com.ss.android.download.api.model.vv$vv r0 = r0.p(r3)
            java.lang.String r3 = "6217"
            com.ss.android.download.api.model.vv$vv r0 = r0.i(r3)
            com.ss.android.download.api.model.vv r0 = r0.vv()
            com.bytedance.sdk.openadsdk.downloadnew.p$p r3 = new com.bytedance.sdk.openadsdk.downloadnew.p$p
            r3.<init>()
            com.ss.android.download.api.vv r2 = r2.vv(r3)
            com.bytedance.sdk.openadsdk.downloadnew.p$vv r3 = new com.bytedance.sdk.openadsdk.downloadnew.p$vv
            r3.<init>()
            com.ss.android.download.api.vv r2 = r2.vv(r3)
            com.bytedance.sdk.openadsdk.downloadnew.p$i r3 = new com.bytedance.sdk.openadsdk.downloadnew.p$i
            r3.<init>(r5)
            com.ss.android.download.api.vv r2 = r2.vv(r3)
            com.bytedance.sdk.openadsdk.downloadnew.p$m r3 = new com.bytedance.sdk.openadsdk.downloadnew.p$m
            r4 = 0
            r3.<init>()
            com.ss.android.download.api.vv r2 = r2.vv(r3)
            com.bytedance.sdk.openadsdk.downloadnew.p$3 r3 = new com.bytedance.sdk.openadsdk.downloadnew.p$3
            r3.<init>()
            com.ss.android.download.api.vv r2 = r2.vv(r3)
            com.bytedance.sdk.openadsdk.downloadnew.p$2 r3 = new com.bytedance.sdk.openadsdk.downloadnew.p$2
            r3.<init>()
            com.ss.android.download.api.vv r2 = r2.vv(r3)
            com.ss.android.download.api.vv r0 = r2.vv(r0)
            com.bytedance.sdk.openadsdk.downloadnew.p$1 r2 = new com.bytedance.sdk.openadsdk.downloadnew.p$1
            r2.<init>()
            com.ss.android.download.api.vv r0 = r0.vv(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".TTFileProvider"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.ss.android.download.api.vv r0 = r0.vv(r1)
            com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadVisitor r1 = o()
            if (r1 == 0) goto Lb9
            com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadVisitor r1 = o()
            org.json.JSONObject r1 = r1.getDownloadSettings()
            goto Lbe
        Lb9:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        Lbe:
            com.ss.android.socialbase.downloader.downloader.DownloaderBuilder r1 = vv(r5, r1)
            com.ss.android.download.api.vv r0 = r0.vv(r1)
            r0.vv()
            com.ss.android.downloadlib.n.vv.vv()
            com.ss.android.downloadlib.qv r0 = com.ss.android.downloadlib.qv.vv(r5)
            com.ss.android.downloadad.api.vv r0 = r0.i()
            r1 = 1
            r0.vv(r1)
            com.ss.android.downloadlib.qv r5 = com.ss.android.downloadlib.qv.vv(r5)
            com.ss.android.download.api.download.vv.vv r0 = com.bytedance.sdk.openadsdk.downloadnew.p.f8784n
            r5.vv(r0)
            com.ss.android.socialbase.appdownloader.i r5 = com.ss.android.socialbase.appdownloader.i.k()
            com.bytedance.sdk.openadsdk.downloadnew.p$4 r0 = new com.bytedance.sdk.openadsdk.downloadnew.p$4
            r0.<init>()
            r5.vv(r0)
            com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadVisitor r5 = o()
            if (r5 == 0) goto Lfb
            com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadVisitor r5 = o()
            com.bytedance.sdk.openadsdk.TTDownloadEventLogger r4 = r5.getTTDownloadEventLogger()
        Lfb:
            if (r4 == 0) goto L100
            r4.onDownloadConfigReady()
        L100:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.downloadnew.p.m(android.content.Context):boolean");
    }

    public static Map<Integer, ITTDownloadAdapter.OnEventLogHandler> p() {
        return f8787u;
    }

    public static void vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vv = str;
    }

    public static com.ss.android.downloadlib.qv vv() {
        vv(getContext());
        return com.ss.android.downloadlib.qv.vv(getContext());
    }

    public static boolean vv(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return vv().o().vv(context, uri, downloadModel, downloadEventConfig, downloadController, iDownloadButtonClickListener);
    }

    public static boolean vv(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        return vv().o().vv(context, uri, downloadModel, downloadEventConfig, downloadController);
    }

    public static boolean vv(Uri uri) {
        return k.vv(uri);
    }

    public static void vv(int i4) {
        Map<Integer, ITTDownloadAdapter.OnEventLogHandler> map = f8787u;
        if (map != null) {
            map.remove(Integer.valueOf(i4));
        }
    }

    public static void vv(int i4, ITTDownloadAdapter.OnEventLogHandler onEventLogHandler) {
        if (onEventLogHandler != null) {
            if (f8787u == null) {
                f8787u = Collections.synchronizedMap(new WeakHashMap());
            }
            f8787u.put(Integer.valueOf(i4), onEventLogHandler);
        }
    }

    public static boolean vv(String str, String str2, JSONObject jSONObject, Object obj) {
        Map<Integer, ITTDownloadAdapter.OnEventLogHandler> p4;
        boolean z4 = false;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && jSONObject != null && (p4 = p()) != null) {
            for (Map.Entry<Integer, ITTDownloadAdapter.OnEventLogHandler> entry : p4.entrySet()) {
                int intValue = entry.getKey().intValue();
                ITTDownloadAdapter.OnEventLogHandler value = entry.getValue();
                if (value != null) {
                    boolean onEventLog = value.onEventLog(intValue, jSONObject.toString(), str, str2, obj);
                    if (!z4 && !onEventLog) {
                        z4 = true;
                    }
                }
            }
        }
        return z4;
    }

    private static DownloaderBuilder vv(Context context, JSONObject jSONObject) {
        return new DownloaderBuilder(context).downloadSetting(new ff() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.5
            @Override // com.ss.android.socialbase.downloader.depend.ff
            public JSONObject vv() {
                if (p.i() != null) {
                    return p.i().getDownloadSettings();
                }
                return new JSONObject();
            }
        }).downloadExpSwitch(jSONObject.optInt("download_exp_switch_temp", 1040187391)).httpService(new o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject m(com.ss.android.download.api.model.p pVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", pVar.vv());
            jSONObject.put("tag", pVar.m());
            jSONObject.put("label", pVar.p());
            jSONObject.put(TTDownloadField.TT_IS_AD, pVar.i());
            jSONObject.put("adId", pVar.o());
            jSONObject.put(TTDownloadField.TT_LOG_EXTRA, pVar.u());
            jSONObject.put("extValue", pVar.n());
            jSONObject.put("extJson", pVar.qv());
            jSONObject.put(TTDownloadField.TT_PARAMS_JSON, pVar.wv());
            jSONObject.put("eventSource", pVar.b());
            jSONObject.put(TTDownloadField.TT_EXTRA_OBJECT, pVar.jh());
            jSONObject.put(TTDownloadField.TT_CLICK_TRACK_URL, pVar.k());
            jSONObject.put("isV3", pVar.r());
            jSONObject.put("V3EventName", pVar.t());
            jSONObject.put("V3EventParams", pVar.q());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean vv(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            List<DownloadInfo> m4 = com.ss.android.socialbase.appdownloader.i.k().m(context);
            if (!m4.isEmpty()) {
                for (DownloadInfo downloadInfo : m4) {
                    if (downloadInfo != null && str.equals(downloadInfo.getUrl())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean vv(Activity activity, final ExitInstallListener exitInstallListener) {
        return com.ss.android.downloadlib.addownload.vv.vv.vv().vv(activity, false, new vv.InterfaceC0611vv() { // from class: com.bytedance.sdk.openadsdk.downloadnew.p.7
            @Override // com.ss.android.downloadlib.addownload.vv.vv.InterfaceC0611vv
            public void vv() {
                ExitInstallListener exitInstallListener2 = ExitInstallListener.this;
                if (exitInstallListener2 != null) {
                    exitInstallListener2.onExitInstall();
                }
            }
        });
    }
}
