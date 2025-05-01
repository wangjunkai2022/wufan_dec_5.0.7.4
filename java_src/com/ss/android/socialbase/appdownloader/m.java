package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.provider.FontsContractCompat;
import com.join.mgps.data.c;
import com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.qv.qv;
import com.ss.android.socialbase.downloader.vv.vv;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class m {

    /* renamed from: m  reason: collision with root package name */
    private static p f60804m = null;

    /* renamed from: p  reason: collision with root package name */
    private static vv f60805p = null;
    private static final String vv = "m";

    /* loaded from: classes5.dex */
    private static class i implements Callable<Boolean> {

        /* renamed from: i  reason: collision with root package name */
        private final long f60806i;

        /* renamed from: m  reason: collision with root package name */
        private final InterfaceC0624m f60807m;

        /* renamed from: p  reason: collision with root package name */
        private final Handler f60808p;
        private final Context vv;

        public i(Handler handler, Context context, InterfaceC0624m interfaceC0624m, long j4) {
            this.vv = context;
            this.f60807m = interfaceC0624m;
            this.f60808p = handler;
            this.f60806i = j4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            InterfaceC0624m interfaceC0624m;
            try {
                interfaceC0624m = this.f60807m;
            } catch (Throwable unused) {
            }
            if (interfaceC0624m != null) {
                long j4 = this.f60806i;
                if (j4 > 0 && j4 <= c.f49010a) {
                    Context context = this.vv;
                    boolean vv = context != null ? interfaceC0624m.vv(context) : false;
                    Message obtain = Message.obtain();
                    if (vv) {
                        obtain.what = 2;
                        this.f60808p.sendMessage(obtain);
                    } else {
                        obtain.what = 1;
                        this.f60808p.sendMessageDelayed(obtain, this.f60806i);
                    }
                    return Boolean.FALSE;
                }
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.appdownloader.m$m  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0624m {
        boolean vv(@NonNull Context context);
    }

    /* loaded from: classes5.dex */
    private static class o implements qv.vv {

        /* renamed from: m  reason: collision with root package name */
        private static int f60809m;
        public static int vv;

        /* renamed from: i  reason: collision with root package name */
        private final Intent f60810i;

        /* renamed from: n  reason: collision with root package name */
        private final long f60811n;

        /* renamed from: o  reason: collision with root package name */
        private final InterfaceC0624m f60812o;

        /* renamed from: p  reason: collision with root package name */
        private final Context f60813p;
        private Future<Boolean> qv;

        /* renamed from: u  reason: collision with root package name */
        private final Handler f60814u;
        private boolean wv = false;

        public o(Context context, Intent intent, int i4, InterfaceC0624m interfaceC0624m, long j4) {
            this.f60813p = context;
            this.f60810i = intent;
            f60809m = i4;
            this.f60812o = interfaceC0624m;
            this.f60814u = new com.ss.android.socialbase.downloader.qv.qv(Looper.getMainLooper(), this);
            this.f60811n = j4;
        }

        @Override // com.ss.android.socialbase.downloader.qv.qv.vv
        public void vv(Message message) {
            if (message != null) {
                int i4 = message.what;
                if (i4 == 1) {
                    long j4 = this.f60811n;
                    if (j4 <= 0 || j4 > c.f49010a) {
                        return;
                    }
                    vv = 1;
                    this.qv = com.ss.android.socialbase.downloader.downloader.p.jh().submit(new i(this.f60814u, this.f60813p, this.f60812o, this.f60811n));
                } else if (i4 == 2) {
                    vv = 2;
                    this.f60814u.removeMessages(2);
                    this.f60814u.removeMessages(1);
                    Future<Boolean> future = this.qv;
                    if (future != null) {
                        future.cancel(true);
                    }
                    if (!this.wv && (Build.VERSION.SDK_INT < 29 || com.ss.android.socialbase.downloader.vv.vv.vv().m())) {
                        Intent intent = this.f60810i;
                        if (intent != null) {
                            m.m(this.f60813p, intent);
                        } else {
                            DownloadInfo downloadInfo = Downloader.getInstance(this.f60813p).getDownloadInfo(f60809m);
                            if (downloadInfo != null && downloadInfo.isDownloadOverStatus()) {
                                com.ss.android.socialbase.appdownloader.p.m(this.f60813p, f60809m, false);
                            }
                        }
                        this.wv = true;
                    }
                    m.m(f60809m, this.f60810i == null, m.vv(this.f60813p));
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface p {
        void vv(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.vv vvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv implements vv.InterfaceC0653vv {

        /* renamed from: m  reason: collision with root package name */
        private final int f60815m;

        /* renamed from: p  reason: collision with root package name */
        private JSONObject f60816p;
        private final o vv;

        public vv(Context context, Intent intent, int i4, JSONObject jSONObject, InterfaceC0624m interfaceC0624m) {
            this.f60816p = jSONObject;
            int optInt = jSONObject.optInt("query_interval", 1000);
            this.f60815m = optInt;
            this.vv = new o(context, intent, i4, interfaceC0624m, optInt);
        }

        @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
        public void m() {
            if (!this.vv.wv) {
                Message obtain = Message.obtain();
                obtain.what = 2;
                this.vv.f60814u.sendMessage(obtain);
            }
            com.ss.android.socialbase.downloader.vv.vv.vv().m(this);
            vv unused = m.f60805p = null;
        }

        @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
        public void p() {
            int optInt = this.f60816p.optInt("time_out_second", 20);
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.vv.f60814u.sendMessage(obtain);
            if (optInt <= 0 || optInt >= 60) {
                return;
            }
            Message obtain2 = Message.obtain();
            obtain2.what = 2;
            this.vv.f60814u.sendMessageDelayed(obtain2, optInt * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps", 1) > 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 26)
    public static boolean o(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return context.getPackageManager().canRequestPackageInstalls();
        } catch (Throwable unused) {
            return true;
        }
    }

    private static void i(int i4, JSONObject jSONObject) {
        int i5 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i5 = 2;
        }
        try {
            jSONObject2.put("scene", i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.p.ds().m(i4, "guide_auth_dialog_show", jSONObject2);
    }

    private static boolean m(Context context, @NonNull DownloadInfo downloadInfo, JSONObject jSONObject, @NonNull com.ss.android.socialbase.appdownloader.vv vvVar) {
        if (context != null && jSONObject != null) {
            String savePath = downloadInfo.getSavePath();
            if (TextUtils.isEmpty(savePath)) {
                return false;
            }
            vvVar.f60925i = "custom";
            com.ss.android.socialbase.appdownloader.vv.vv vv2 = com.ss.android.socialbase.appdownloader.vv.i.vv(context, "custom", jSONObject, downloadInfo);
            if (vv2 != null && vv2.vv()) {
                Intent m4 = vv2.m();
                if (m4 == null) {
                    return false;
                }
                if (vv(new File(savePath), downloadInfo, jSONObject)) {
                    if (m(context, m4)) {
                        vvVar.f60926m = 0;
                        return true;
                    }
                    vvVar.f60926m = 1;
                } else {
                    vvVar.f60926m = 6;
                }
                return false;
            }
            vvVar.f60926m = 3;
        }
        return false;
    }

    public static void p(int i4, JSONObject jSONObject) {
        int i5 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i5 = 2;
        }
        try {
            jSONObject2.put("scene", i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.p.ds().m(i4, "guide_auth_open_setting", jSONObject2);
    }

    public static boolean vv(Context context, DownloadInfo downloadInfo, Intent intent, boolean z4) {
        JSONArray o4 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).o("ah_plans");
        if (o4 != null) {
            int length = o4.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject optJSONObject = o4.optJSONObject(i4);
                if (com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONObject) && vv(context, downloadInfo, intent, optJSONObject, z4)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean vv(android.content.Context r11, com.ss.android.socialbase.downloader.model.DownloadInfo r12, android.content.Intent r13, org.json.JSONObject r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.m.vv(android.content.Context, com.ss.android.socialbase.downloader.model.DownloadInfo, android.content.Intent, org.json.JSONObject, boolean):boolean");
    }

    public static com.ss.android.socialbase.appdownloader.vv m(JSONObject jSONObject, com.ss.android.socialbase.downloader.n.vv vvVar) {
        com.ss.android.socialbase.appdownloader.vv vvVar2 = new com.ss.android.socialbase.appdownloader.vv();
        if (jSONObject == null) {
            return vvVar2;
        }
        vvVar2.vv = jSONObject.optString("type");
        vvVar2.f60927o = "vbi";
        if (com.ss.android.socialbase.appdownloader.vv.i.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), "vbi", jSONObject, vvVar)) {
            vvVar2.f60926m = 0;
        } else {
            vv(vvVar2, 3);
        }
        return vvVar2;
    }

    public static void m(int i4, JSONObject jSONObject) {
        int i5 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i5 = 2;
        }
        try {
            jSONObject2.put("scene", i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.p.ds().m(i4, "guide_auth_dialog_cancel", jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(int i4, boolean z4, boolean z5) {
        JSONObject jSONObject = new JSONObject();
        int i5 = 1;
        try {
            jSONObject.put("scene", z4 ? 1 : 2);
            if (!z5) {
                i5 = 2;
            }
            jSONObject.put(FontsContractCompat.Columns.RESULT_CODE, i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.p.ds().m(i4, "guide_auth_result", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(Context context, Intent intent) {
        return vv(context, intent, true);
    }

    private static boolean vv(Context context, @NonNull DownloadInfo downloadInfo, JSONObject jSONObject, @NonNull com.ss.android.socialbase.appdownloader.vv vvVar, com.ss.android.socialbase.downloader.n.vv vvVar2) {
        boolean z4;
        String optString = jSONObject.optString("type");
        vvVar.vv = optString;
        Intent m4 = com.ss.android.socialbase.appdownloader.vv.i.vv(context, "vbi", jSONObject, downloadInfo).m();
        StringBuilder sb = new StringBuilder();
        try {
            z4 = m(context, m4);
        } catch (Throwable th) {
            sb.append(optString);
            sb.append(" startActivity failed : ");
            sb.append(vv(th));
            vv(vvVar, 1);
            z4 = false;
        }
        if (!z4) {
            vvVar.f60928p = sb.toString();
        } else {
            vvVar.f60926m = 0;
        }
        return true;
    }

    private static boolean vv(Context context, DownloadInfo downloadInfo, JSONObject jSONObject, com.ss.android.socialbase.appdownloader.vv vvVar) {
        boolean z4;
        if (context != null && jSONObject != null) {
            String optString = jSONObject.optString("device_plans");
            vvVar.f60927o = optString;
            if (!TextUtils.isEmpty(optString)) {
                String[] split = optString.split(",");
                String savePath = downloadInfo.getSavePath();
                if (TextUtils.isEmpty(savePath)) {
                    return false;
                }
                File file = new File(savePath);
                StringBuilder sb = new StringBuilder();
                String str = null;
                int length = split.length;
                int i4 = 0;
                while (true) {
                    z4 = true;
                    if (i4 >= length) {
                        z4 = false;
                        break;
                    }
                    String str2 = split[i4];
                    com.ss.android.socialbase.appdownloader.vv.vv vv2 = com.ss.android.socialbase.appdownloader.vv.i.vv(context, str2, jSONObject, downloadInfo);
                    if (vv2 != null) {
                        Intent m4 = vv2.m();
                        if (m4 != null) {
                            if (vv(file, downloadInfo, jSONObject)) {
                                try {
                                    vv(context, m4, false);
                                    str = str2;
                                    break;
                                } catch (Throwable th) {
                                    sb.append(str2);
                                    sb.append(" startActivity failed : ");
                                    sb.append(vv(th));
                                    vv(vvVar, 1);
                                }
                            } else {
                                vv(vvVar, 6);
                                sb.append(str2);
                                sb.append(" createDescFile failed! ");
                            }
                        } else {
                            vv(vvVar, 3);
                            sb.append(str2);
                            sb.append(" resolveActivity failed! ");
                        }
                    }
                    sb.append("  ");
                    i4++;
                }
                if (!z4) {
                    vvVar.f60928p = sb.toString();
                } else {
                    vvVar.f60925i = str;
                    vvVar.f60926m = 0;
                }
                return z4;
            }
        }
        return false;
    }

    public static int vv(@NonNull com.ss.android.socialbase.downloader.n.vv vvVar) {
        JSONObject i4 = vvVar.i("download_dir");
        if (i4 != null ? !TextUtils.isEmpty(i4.optString("dir_name")) : false) {
            if (com.ss.android.socialbase.downloader.n.vv.p().vv("get_download_info_by_list")) {
                JSONArray o4 = vvVar.o("ah_plans");
                int i5 = -1;
                if (o4 != null) {
                    int length = o4.length();
                    for (int i6 = 0; i6 < length; i6++) {
                        JSONObject optJSONObject = o4.optJSONObject(i6);
                        if (com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONObject)) {
                            String optString = optJSONObject.optString("type");
                            if (!"plan_a".equals(optString) && !"plan_b".equals(optString) && !"plan_e".equals(optString) && !"plan_f".equals(optString)) {
                                if ("plan_d".equalsIgnoreCase(optString) || "plan_h".equalsIgnoreCase(optString) || ("plan_g".equalsIgnoreCase(optString) && (i5 = m(optJSONObject, vvVar).f60926m) == 0)) {
                                    return 0;
                                }
                            } else {
                                i5 = vv(optJSONObject, vvVar).f60926m;
                                if (i5 == 0) {
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return i5;
            }
            return 4;
        }
        return 5;
    }

    @NonNull
    public static com.ss.android.socialbase.appdownloader.vv vv(JSONObject jSONObject, com.ss.android.socialbase.downloader.n.vv vvVar) {
        com.ss.android.socialbase.appdownloader.vv vvVar2 = new com.ss.android.socialbase.appdownloader.vv();
        if (jSONObject == null) {
            return vvVar2;
        }
        String optString = jSONObject.optString("type");
        vvVar2.vv = optString;
        if ("plan_b".equals(optString)) {
            vvVar2.f60927o = "custom";
            if (com.ss.android.socialbase.appdownloader.vv.i.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), "custom", jSONObject, vvVar)) {
                vvVar2.f60926m = 0;
                return vvVar2;
            }
            vv(vvVar2, 3);
        } else {
            String optString2 = jSONObject.optString("device_plans");
            vvVar2.f60927o = optString2;
            if (!TextUtils.isEmpty(optString2)) {
                for (String str : optString2.split(",")) {
                    if (com.ss.android.socialbase.appdownloader.vv.i.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), str, jSONObject, vvVar)) {
                        vvVar2.f60926m = 0;
                        return vvVar2;
                    }
                    vv(vvVar2, 3);
                }
            }
        }
        return vvVar2;
    }

    public static com.ss.android.socialbase.appdownloader.vv vv(JSONObject jSONObject, String str, Context context, com.ss.android.socialbase.downloader.n.vv vvVar) {
        com.ss.android.socialbase.appdownloader.vv vvVar2 = new com.ss.android.socialbase.appdownloader.vv();
        if (jSONObject != null && com.ss.android.socialbase.appdownloader.u.o.p()) {
            vvVar2.vv = jSONObject.optString("type");
            if (vvVar.vv("bi", 0) == 1) {
                vvVar2.f60926m = 0;
                return vvVar2;
            } else if (vv(context)) {
                vvVar2.f60926m = 2;
            } else if (com.ss.android.socialbase.appdownloader.u.vv.vv(str) != null) {
                vvVar2.f60926m = 0;
            } else {
                vvVar2.f60926m = 9;
            }
        }
        return vvVar2;
    }

    private static void vv(com.ss.android.socialbase.appdownloader.vv vvVar, int i4) {
        int i5 = vvVar.f60926m;
        if (i5 != -1) {
            vvVar.f60926m = (i5 * 10) + i4;
        } else {
            vvVar.f60926m = i4;
        }
    }

    private static boolean vv(File file, DownloadInfo downloadInfo, @NonNull JSONObject jSONObject) {
        if (file == null) {
            return false;
        }
        String path = file.getPath();
        JSONObject i4 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).i("download_dir");
        File file2 = null;
        String optString = i4 != null ? i4.optString("ins_desc") : null;
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString)) {
            file2 = new File(path + File.separator + optString);
        }
        if (file2 != null) {
            try {
                if (file2.createNewFile()) {
                    file2.deleteOnExit();
                    return true;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean vv(Context context, @Nullable Intent intent, JSONObject jSONObject, int i4, @Nullable com.ss.android.socialbase.appdownloader.vv vvVar) {
        if (context != null && jSONObject != null) {
            long optLong = jSONObject.optLong("jump_interval", 0L);
            if (optLong <= 0) {
                return false;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("sp_ah_config", 0);
            if ((System.currentTimeMillis() - sharedPreferences.getLong("last_jump_unknown_source_time", 0L)) / 60000 >= optLong && !vv(context)) {
                sharedPreferences.edit().putLong("last_jump_unknown_source_time", System.currentTimeMillis()).apply();
                if (jSONObject.optInt("show_unknown_source_dialog", 0) == 1) {
                    Intent intent2 = new Intent(context, JumpUnknownSourceActivity.class);
                    intent2.addFlags(268435456);
                    intent2.putExtra("intent", intent);
                    intent2.putExtra("config", jSONObject.toString());
                    intent2.putExtra("id", i4);
                    try {
                        if (vv(context, intent2, false)) {
                            i(i4, jSONObject);
                        }
                        return true;
                    } catch (Throwable th) {
                        if (vvVar != null) {
                            vvVar.f60926m = 1;
                            vvVar.f60928p = "tryShowUnknownSourceDialog" + vv(th);
                        }
                        return false;
                    }
                }
                if (vv(context, intent, i4, jSONObject)) {
                    p(i4, jSONObject);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean vv(Context context, @Nullable Intent intent, int i4, JSONObject jSONObject) {
        try {
            if (com.ss.android.socialbase.appdownloader.u.o.p() && Build.VERSION.SDK_INT < 26 && !i(context)) {
                com.ss.android.socialbase.appdownloader.vv.u uVar = new com.ss.android.socialbase.appdownloader.vv.u(context);
                if (uVar.vv()) {
                    vv(context, intent, i4, jSONObject, new InterfaceC0624m() { // from class: com.ss.android.socialbase.appdownloader.m.1
                        @Override // com.ss.android.socialbase.appdownloader.m.InterfaceC0624m
                        public boolean vv(@NonNull Context context2) {
                            return m.i(context2);
                        }
                    });
                    return m(context, uVar.m());
                }
            } else if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26 && !o(context)) {
                com.ss.android.socialbase.appdownloader.vv.m mVar = new com.ss.android.socialbase.appdownloader.vv.m(context);
                if (mVar.vv()) {
                    vv(context, intent, i4, jSONObject, new InterfaceC0624m() { // from class: com.ss.android.socialbase.appdownloader.m.2
                        @Override // com.ss.android.socialbase.appdownloader.m.InterfaceC0624m
                        public boolean vv(@NonNull Context context2) {
                            return m.o(context2);
                        }
                    });
                    return m(context, mVar.m());
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean vv(Context context) {
        if (context == null) {
            return true;
        }
        if (com.ss.android.socialbase.appdownloader.u.o.p() && Build.VERSION.SDK_INT < 26) {
            return i(context);
        }
        if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26) {
            return o(context);
        }
        return true;
    }

    public static boolean vv() {
        return o.vv == 1;
    }

    public static void vv(int i4, JSONObject jSONObject) {
        int i5 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i5 = 2;
        }
        try {
            jSONObject2.put("scene", i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.p.ds().m(i4, "guide_auth_dialog_confirm", jSONObject2);
    }

    private static void vv(Context context, Intent intent, int i4, JSONObject jSONObject, InterfaceC0624m interfaceC0624m) {
        if (f60805p != null) {
            com.ss.android.socialbase.downloader.vv.vv.vv().m(f60805p);
            f60805p = null;
        }
        f60805p = new vv(context, intent, i4, jSONObject, interfaceC0624m);
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(f60805p);
    }

    public static boolean vv(Context context, Intent intent, boolean z4) {
        if (context == null || intent == null) {
            return false;
        }
        if (z4) {
            try {
                intent.putExtra("start_only_for_android", true);
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        intent.putExtra("start_only_for_android", true);
        context.startActivity(intent);
        return true;
    }

    public static String vv(Throwable th) {
        String th2 = th.toString();
        return th2.length() > 800 ? th2.substring(0, 500) : th2;
    }

    public static void vv(p pVar) {
        f60804m = pVar;
    }
}
