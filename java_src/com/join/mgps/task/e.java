package com.join.mgps.task;

import android.content.Context;
import com.github.snowdream.android.app.downloader.DownloadTask;
import java.io.File;
/* compiled from: UNAndroidZIPThread.java */
/* loaded from: classes5.dex */
public class e extends Thread implements c {

    /* renamed from: b  reason: collision with root package name */
    private Context f54877b;

    /* renamed from: c  reason: collision with root package name */
    private DownloadTask f54878c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54879d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f54880e;

    /* renamed from: f  reason: collision with root package name */
    a f54881f;

    public e(DownloadTask downloadTask, Context context) {
        this.f54879d = true;
        this.f54880e = false;
        this.f54881f = null;
        this.f54878c = downloadTask;
        this.f54877b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.task.e.c(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.join.mgps.task.c
    public void a() {
        this.f54879d = false;
        this.f54881f.a(false);
        DownloadTask downloadTask = this.f54878c;
        if (downloadTask != null) {
            downloadTask.set_from_type(0);
        }
    }

    @Override // com.join.mgps.task.c
    public boolean isRunning() {
        return this.f54879d;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0454 A[Catch: Exception -> 0x03ef, all -> 0x03f3, TryCatch #2 {Exception -> 0x03ef, blocks: (B:90:0x020b, B:92:0x020f, B:93:0x0213, B:166:0x03ea, B:173:0x03fd, B:179:0x0450, B:181:0x0454, B:182:0x0458, B:184:0x0463, B:187:0x04c2, B:197:0x04ed, B:196:0x04ea), top: B:214:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0463 A[Catch: Exception -> 0x03ef, all -> 0x03f3, TRY_LEAVE, TryCatch #2 {Exception -> 0x03ef, blocks: (B:90:0x020b, B:92:0x020f, B:93:0x0213, B:166:0x03ea, B:173:0x03fd, B:179:0x0450, B:181:0x0454, B:182:0x0458, B:184:0x0463, B:187:0x04c2, B:197:0x04ed, B:196:0x04ea), top: B:214:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04d8 A[Catch: all -> 0x03f3, Exception -> 0x04e8, TryCatch #10 {all -> 0x03f3, blocks: (B:9:0x0032, B:11:0x0038, B:13:0x0044, B:18:0x0065, B:20:0x0077, B:22:0x008d, B:27:0x0099, B:28:0x009d, B:30:0x00c2, B:32:0x00c8, B:34:0x00cc, B:61:0x014b, B:63:0x0156, B:64:0x0159, B:67:0x0168, B:74:0x017e, B:76:0x018b, B:78:0x01b9, B:81:0x01e8, B:83:0x01f1, B:85:0x01f7, B:90:0x020b, B:92:0x020f, B:93:0x0213, B:97:0x021e, B:99:0x0225, B:101:0x022d, B:106:0x023b, B:107:0x024a, B:109:0x0252, B:111:0x025a, B:112:0x025d, B:114:0x026b, B:116:0x0277, B:118:0x0285, B:120:0x028f, B:121:0x02a6, B:123:0x02aa, B:125:0x02b4, B:127:0x02ca, B:128:0x02d0, B:130:0x02d6, B:131:0x02e2, B:132:0x02eb, B:134:0x0301, B:136:0x0309, B:137:0x030e, B:141:0x0331, B:142:0x0334, B:144:0x033c, B:146:0x0344, B:147:0x0352, B:149:0x0356, B:151:0x0387, B:150:0x036b, B:152:0x03ab, B:153:0x03b7, B:155:0x03c8, B:157:0x03d0, B:162:0x03dd, B:161:0x03da, B:166:0x03ea, B:82:0x01ed, B:173:0x03fd, B:174:0x0419, B:176:0x043c, B:179:0x0450, B:181:0x0454, B:182:0x0458, B:184:0x0463, B:186:0x0490, B:187:0x04c2, B:188:0x04c7, B:190:0x04d8, B:192:0x04e0, B:197:0x04ed, B:196:0x04ea, B:79:0x01df, B:71:0x0173, B:69:0x016e, B:73:0x0179, B:38:0x00d8, B:40:0x00ea, B:42:0x0100, B:47:0x010c, B:49:0x0111, B:51:0x0123, B:53:0x0139, B:58:0x0145), top: B:214:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0490 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc A[Catch: Exception -> 0x00d4, all -> 0x03f3, TRY_LEAVE, TryCatch #8 {Exception -> 0x00d4, blocks: (B:28:0x009d, B:30:0x00c2, B:32:0x00c8, B:34:0x00cc, B:61:0x014b, B:63:0x0156, B:64:0x0159, B:74:0x017e, B:76:0x018b, B:69:0x016e, B:73:0x0179), top: B:224:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b A[Catch: Exception -> 0x00d4, all -> 0x03f3, TRY_LEAVE, TryCatch #8 {Exception -> 0x00d4, blocks: (B:28:0x009d, B:30:0x00c2, B:32:0x00c8, B:34:0x00cc, B:61:0x014b, B:63:0x0156, B:64:0x0159, B:74:0x017e, B:76:0x018b, B:69:0x016e, B:73:0x0179), top: B:224:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df A[Catch: Exception -> 0x0204, all -> 0x03f3, TryCatch #10 {all -> 0x03f3, blocks: (B:9:0x0032, B:11:0x0038, B:13:0x0044, B:18:0x0065, B:20:0x0077, B:22:0x008d, B:27:0x0099, B:28:0x009d, B:30:0x00c2, B:32:0x00c8, B:34:0x00cc, B:61:0x014b, B:63:0x0156, B:64:0x0159, B:67:0x0168, B:74:0x017e, B:76:0x018b, B:78:0x01b9, B:81:0x01e8, B:83:0x01f1, B:85:0x01f7, B:90:0x020b, B:92:0x020f, B:93:0x0213, B:97:0x021e, B:99:0x0225, B:101:0x022d, B:106:0x023b, B:107:0x024a, B:109:0x0252, B:111:0x025a, B:112:0x025d, B:114:0x026b, B:116:0x0277, B:118:0x0285, B:120:0x028f, B:121:0x02a6, B:123:0x02aa, B:125:0x02b4, B:127:0x02ca, B:128:0x02d0, B:130:0x02d6, B:131:0x02e2, B:132:0x02eb, B:134:0x0301, B:136:0x0309, B:137:0x030e, B:141:0x0331, B:142:0x0334, B:144:0x033c, B:146:0x0344, B:147:0x0352, B:149:0x0356, B:151:0x0387, B:150:0x036b, B:152:0x03ab, B:153:0x03b7, B:155:0x03c8, B:157:0x03d0, B:162:0x03dd, B:161:0x03da, B:166:0x03ea, B:82:0x01ed, B:173:0x03fd, B:174:0x0419, B:176:0x043c, B:179:0x0450, B:181:0x0454, B:182:0x0458, B:184:0x0463, B:186:0x0490, B:187:0x04c2, B:188:0x04c7, B:190:0x04d8, B:192:0x04e0, B:197:0x04ed, B:196:0x04ea, B:79:0x01df, B:71:0x0173, B:69:0x016e, B:73:0x0179, B:38:0x00d8, B:40:0x00ea, B:42:0x0100, B:47:0x010c, B:49:0x0111, B:51:0x0123, B:53:0x0139, B:58:0x0145), top: B:214:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e8 A[Catch: Exception -> 0x0204, all -> 0x03f3, TryCatch #10 {all -> 0x03f3, blocks: (B:9:0x0032, B:11:0x0038, B:13:0x0044, B:18:0x0065, B:20:0x0077, B:22:0x008d, B:27:0x0099, B:28:0x009d, B:30:0x00c2, B:32:0x00c8, B:34:0x00cc, B:61:0x014b, B:63:0x0156, B:64:0x0159, B:67:0x0168, B:74:0x017e, B:76:0x018b, B:78:0x01b9, B:81:0x01e8, B:83:0x01f1, B:85:0x01f7, B:90:0x020b, B:92:0x020f, B:93:0x0213, B:97:0x021e, B:99:0x0225, B:101:0x022d, B:106:0x023b, B:107:0x024a, B:109:0x0252, B:111:0x025a, B:112:0x025d, B:114:0x026b, B:116:0x0277, B:118:0x0285, B:120:0x028f, B:121:0x02a6, B:123:0x02aa, B:125:0x02b4, B:127:0x02ca, B:128:0x02d0, B:130:0x02d6, B:131:0x02e2, B:132:0x02eb, B:134:0x0301, B:136:0x0309, B:137:0x030e, B:141:0x0331, B:142:0x0334, B:144:0x033c, B:146:0x0344, B:147:0x0352, B:149:0x0356, B:151:0x0387, B:150:0x036b, B:152:0x03ab, B:153:0x03b7, B:155:0x03c8, B:157:0x03d0, B:162:0x03dd, B:161:0x03da, B:166:0x03ea, B:82:0x01ed, B:173:0x03fd, B:174:0x0419, B:176:0x043c, B:179:0x0450, B:181:0x0454, B:182:0x0458, B:184:0x0463, B:186:0x0490, B:187:0x04c2, B:188:0x04c7, B:190:0x04d8, B:192:0x04e0, B:197:0x04ed, B:196:0x04ea, B:79:0x01df, B:71:0x0173, B:69:0x016e, B:73:0x0179, B:38:0x00d8, B:40:0x00ea, B:42:0x0100, B:47:0x010c, B:49:0x0111, B:51:0x0123, B:53:0x0139, B:58:0x0145), top: B:214:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed A[Catch: Exception -> 0x0204, all -> 0x03f3, TryCatch #10 {all -> 0x03f3, blocks: (B:9:0x0032, B:11:0x0038, B:13:0x0044, B:18:0x0065, B:20:0x0077, B:22:0x008d, B:27:0x0099, B:28:0x009d, B:30:0x00c2, B:32:0x00c8, B:34:0x00cc, B:61:0x014b, B:63:0x0156, B:64:0x0159, B:67:0x0168, B:74:0x017e, B:76:0x018b, B:78:0x01b9, B:81:0x01e8, B:83:0x01f1, B:85:0x01f7, B:90:0x020b, B:92:0x020f, B:93:0x0213, B:97:0x021e, B:99:0x0225, B:101:0x022d, B:106:0x023b, B:107:0x024a, B:109:0x0252, B:111:0x025a, B:112:0x025d, B:114:0x026b, B:116:0x0277, B:118:0x0285, B:120:0x028f, B:121:0x02a6, B:123:0x02aa, B:125:0x02b4, B:127:0x02ca, B:128:0x02d0, B:130:0x02d6, B:131:0x02e2, B:132:0x02eb, B:134:0x0301, B:136:0x0309, B:137:0x030e, B:141:0x0331, B:142:0x0334, B:144:0x033c, B:146:0x0344, B:147:0x0352, B:149:0x0356, B:151:0x0387, B:150:0x036b, B:152:0x03ab, B:153:0x03b7, B:155:0x03c8, B:157:0x03d0, B:162:0x03dd, B:161:0x03da, B:166:0x03ea, B:82:0x01ed, B:173:0x03fd, B:174:0x0419, B:176:0x043c, B:179:0x0450, B:181:0x0454, B:182:0x0458, B:184:0x0463, B:186:0x0490, B:187:0x04c2, B:188:0x04c7, B:190:0x04d8, B:192:0x04e0, B:197:0x04ed, B:196:0x04ea, B:79:0x01df, B:71:0x0173, B:69:0x016e, B:73:0x0179, B:38:0x00d8, B:40:0x00ea, B:42:0x0100, B:47:0x010c, B:49:0x0111, B:51:0x0123, B:53:0x0139, B:58:0x0145), top: B:214:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f7 A[Catch: Exception -> 0x0204, all -> 0x03f3, TRY_LEAVE, TryCatch #10 {all -> 0x03f3, blocks: (B:9:0x0032, B:11:0x0038, B:13:0x0044, B:18:0x0065, B:20:0x0077, B:22:0x008d, B:27:0x0099, B:28:0x009d, B:30:0x00c2, B:32:0x00c8, B:34:0x00cc, B:61:0x014b, B:63:0x0156, B:64:0x0159, B:67:0x0168, B:74:0x017e, B:76:0x018b, B:78:0x01b9, B:81:0x01e8, B:83:0x01f1, B:85:0x01f7, B:90:0x020b, B:92:0x020f, B:93:0x0213, B:97:0x021e, B:99:0x0225, B:101:0x022d, B:106:0x023b, B:107:0x024a, B:109:0x0252, B:111:0x025a, B:112:0x025d, B:114:0x026b, B:116:0x0277, B:118:0x0285, B:120:0x028f, B:121:0x02a6, B:123:0x02aa, B:125:0x02b4, B:127:0x02ca, B:128:0x02d0, B:130:0x02d6, B:131:0x02e2, B:132:0x02eb, B:134:0x0301, B:136:0x0309, B:137:0x030e, B:141:0x0331, B:142:0x0334, B:144:0x033c, B:146:0x0344, B:147:0x0352, B:149:0x0356, B:151:0x0387, B:150:0x036b, B:152:0x03ab, B:153:0x03b7, B:155:0x03c8, B:157:0x03d0, B:162:0x03dd, B:161:0x03da, B:166:0x03ea, B:82:0x01ed, B:173:0x03fd, B:174:0x0419, B:176:0x043c, B:179:0x0450, B:181:0x0454, B:182:0x0458, B:184:0x0463, B:186:0x0490, B:187:0x04c2, B:188:0x04c7, B:190:0x04d8, B:192:0x04e0, B:197:0x04ed, B:196:0x04ea, B:79:0x01df, B:71:0x0173, B:69:0x016e, B:73:0x0179, B:38:0x00d8, B:40:0x00ea, B:42:0x0100, B:47:0x010c, B:49:0x0111, B:51:0x0123, B:53:0x0139, B:58:0x0145), top: B:214:0x0032 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.task.e.run():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UNAndroidZIPThread.java */
    /* loaded from: classes5.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f54882b = true;

        /* renamed from: c  reason: collision with root package name */
        File f54883c;

        /* renamed from: d  reason: collision with root package name */
        File f54884d;

        /* renamed from: e  reason: collision with root package name */
        File f54885e;

        public a(File file, File file2) {
            this.f54885e = null;
            this.f54883c = file;
            this.f54885e = file2;
        }

        public void a(boolean z4) {
            this.f54882b = z4;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[Catch: InterruptedException -> 0x0070, TryCatch #0 {InterruptedException -> 0x0070, blocks: (B:3:0x0003, B:4:0x0018, B:8:0x001f, B:9:0x0021, B:14:0x002e, B:16:0x0047, B:17:0x0068, B:13:0x0029), top: B:22:0x0003 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r10 = this;
                super.run()
                java.util.Random r0 = new java.util.Random     // Catch: java.lang.InterruptedException -> L70
                r0.<init>()     // Catch: java.lang.InterruptedException -> L70
                r1 = 10
                int r2 = r0.nextInt(r1)     // Catch: java.lang.InterruptedException -> L70
                int r2 = r2 + 50
                int r0 = r0.nextInt(r1)     // Catch: java.lang.InterruptedException -> L70
                int r0 = r0 + 80
                r1 = 0
                r3 = 0
            L18:
                boolean r4 = r10.f54882b     // Catch: java.lang.InterruptedException -> L70
                if (r4 == 0) goto L79
                r4 = 3
                if (r1 >= r4) goto L23
                int r4 = r2 / 3
            L21:
                int r3 = r3 + r4
                goto L2e
            L23:
                if (r1 < r4) goto L2e
                r4 = 15
                if (r1 >= r4) goto L2e
                int r4 = r0 - r2
                int r4 = r4 / 12
                goto L21
            L2e:
                com.join.mgps.task.e r4 = com.join.mgps.task.e.this     // Catch: java.lang.InterruptedException -> L70
                com.github.snowdream.android.app.downloader.DownloadTask r4 = com.join.mgps.task.e.b(r4)     // Catch: java.lang.InterruptedException -> L70
                long r5 = (long) r3     // Catch: java.lang.InterruptedException -> L70
                r4.setProgress(r5)     // Catch: java.lang.InterruptedException -> L70
                com.join.mgps.task.e r4 = com.join.mgps.task.e.this     // Catch: java.lang.InterruptedException -> L70
                com.github.snowdream.android.app.downloader.DownloadTask r4 = com.join.mgps.task.e.b(r4)     // Catch: java.lang.InterruptedException -> L70
                com.join.mgps.Util.UtilsMy.w4(r4)     // Catch: java.lang.InterruptedException -> L70
                com.join.mgps.task.e r4 = com.join.mgps.task.e.this     // Catch: java.lang.InterruptedException -> L70
                boolean r4 = r4.f54880e     // Catch: java.lang.InterruptedException -> L70
                if (r4 == 0) goto L68
                org.greenrobot.eventbus.c r4 = org.greenrobot.eventbus.c.f()     // Catch: java.lang.InterruptedException -> L70
                com.join.mgps.event.x r5 = new com.join.mgps.event.x     // Catch: java.lang.InterruptedException -> L70
                r6 = 6
                com.join.mgps.task.e r7 = com.join.mgps.task.e.this     // Catch: java.lang.InterruptedException -> L70
                com.github.snowdream.android.app.downloader.DownloadTask r7 = com.join.mgps.task.e.b(r7)     // Catch: java.lang.InterruptedException -> L70
                java.lang.String r7 = r7.getCrc_link_type_val()     // Catch: java.lang.InterruptedException -> L70
                com.join.mgps.task.e r8 = com.join.mgps.task.e.this     // Catch: java.lang.InterruptedException -> L70
                com.github.snowdream.android.app.downloader.DownloadTask r8 = com.join.mgps.task.e.b(r8)     // Catch: java.lang.InterruptedException -> L70
                long r8 = r8.getProgress()     // Catch: java.lang.InterruptedException -> L70
                r5.<init>(r6, r7, r8)     // Catch: java.lang.InterruptedException -> L70
                r4.o(r5)     // Catch: java.lang.InterruptedException -> L70
            L68:
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L70
                int r1 = r1 + 1
                goto L18
            L70:
                r0 = move-exception
                r0.printStackTrace()
                com.join.mgps.task.e r0 = com.join.mgps.task.e.this
                r0.a()
            L79:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.task.e.a.run():void");
        }

        public a(File file, File file2, File file3) {
            this.f54885e = null;
            this.f54883c = file;
            this.f54884d = file2;
            this.f54885e = file3;
        }
    }

    public e(DownloadTask downloadTask, Context context, boolean z4) {
        this.f54879d = true;
        this.f54880e = false;
        this.f54881f = null;
        this.f54878c = downloadTask;
        this.f54877b = context;
        this.f54880e = z4;
    }
}
