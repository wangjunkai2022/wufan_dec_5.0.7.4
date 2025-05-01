package com.join.mgps.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.join.mgps.Util.v;
/* loaded from: classes4.dex */
public class UpdateLodingService extends Service {

    /* renamed from: i  reason: collision with root package name */
    private static String f54556i = v.f28107g;

    /* renamed from: b  reason: collision with root package name */
    private boolean f54557b = false;

    /* renamed from: c  reason: collision with root package name */
    private long f54558c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f54559d;

    /* renamed from: e  reason: collision with root package name */
    private b f54560e;

    /* renamed from: f  reason: collision with root package name */
    private c f54561f;

    /* renamed from: g  reason: collision with root package name */
    d f54562g;

    /* renamed from: h  reason: collision with root package name */
    Context f54563h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54564b;

        a(String str) {
            this.f54564b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:147:0x04b3 A[Catch: IOException -> 0x0558, TRY_ENTER, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x04b8 A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x04bd A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x04c2 A[Catch: IOException -> 0x0558, TRY_LEAVE, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:163:0x04f4 A[Catch: IOException -> 0x0558, TRY_ENTER, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x04f9 A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x04fe A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0503 A[Catch: IOException -> 0x0558, TRY_LEAVE, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0524 A[Catch: IOException -> 0x0558, TRY_ENTER, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0529 A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x052e A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0533 A[Catch: IOException -> 0x0558, TRY_LEAVE, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0554 A[Catch: IOException -> 0x0558, TRY_ENTER, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x055c A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:193:0x0561 A[Catch: IOException -> 0x0558, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0566 A[Catch: IOException -> 0x0558, TRY_LEAVE, TryCatch #17 {IOException -> 0x0558, blocks: (B:175:0x0524, B:177:0x0529, B:179:0x052e, B:181:0x0533, B:187:0x0554, B:191:0x055c, B:193:0x0561, B:195:0x0566, B:163:0x04f4, B:165:0x04f9, B:167:0x04fe, B:169:0x0503, B:147:0x04b3, B:149:0x04b8, B:151:0x04bd, B:153:0x04c2), top: B:230:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:206:0x057c A[Catch: IOException -> 0x0578, TryCatch #1 {IOException -> 0x0578, blocks: (B:202:0x0574, B:206:0x057c, B:208:0x0581, B:210:0x0586), top: B:218:0x0574 }] */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0581 A[Catch: IOException -> 0x0578, TryCatch #1 {IOException -> 0x0578, blocks: (B:202:0x0574, B:206:0x057c, B:208:0x0581, B:210:0x0586), top: B:218:0x0574 }] */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0586 A[Catch: IOException -> 0x0578, TRY_LEAVE, TryCatch #1 {IOException -> 0x0578, blocks: (B:202:0x0574, B:206:0x057c, B:208:0x0581, B:210:0x0586), top: B:218:0x0574 }] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0574 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r18v0 */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v10, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r18v11 */
        /* JADX WARN: Type inference failed for: r18v12, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r18v13, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r18v14 */
        /* JADX WARN: Type inference failed for: r18v15 */
        /* JADX WARN: Type inference failed for: r18v16 */
        /* JADX WARN: Type inference failed for: r18v17 */
        /* JADX WARN: Type inference failed for: r18v18 */
        /* JADX WARN: Type inference failed for: r18v19 */
        /* JADX WARN: Type inference failed for: r18v2 */
        /* JADX WARN: Type inference failed for: r18v20 */
        /* JADX WARN: Type inference failed for: r18v21 */
        /* JADX WARN: Type inference failed for: r18v22 */
        /* JADX WARN: Type inference failed for: r18v23 */
        /* JADX WARN: Type inference failed for: r18v24 */
        /* JADX WARN: Type inference failed for: r18v25 */
        /* JADX WARN: Type inference failed for: r18v26 */
        /* JADX WARN: Type inference failed for: r18v27 */
        /* JADX WARN: Type inference failed for: r18v3 */
        /* JADX WARN: Type inference failed for: r18v32 */
        /* JADX WARN: Type inference failed for: r18v33 */
        /* JADX WARN: Type inference failed for: r18v34 */
        /* JADX WARN: Type inference failed for: r18v35 */
        /* JADX WARN: Type inference failed for: r18v36 */
        /* JADX WARN: Type inference failed for: r18v37 */
        /* JADX WARN: Type inference failed for: r18v38 */
        /* JADX WARN: Type inference failed for: r18v39 */
        /* JADX WARN: Type inference failed for: r18v40 */
        /* JADX WARN: Type inference failed for: r18v41 */
        /* JADX WARN: Type inference failed for: r18v42, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r18v43 */
        /* JADX WARN: Type inference failed for: r18v5 */
        /* JADX WARN: Type inference failed for: r18v6 */
        /* JADX WARN: Type inference failed for: r18v7 */
        /* JADX WARN: Type inference failed for: r18v8 */
        /* JADX WARN: Type inference failed for: r18v9, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.InputStream] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.service.UpdateLodingService.a.run():void");
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Context f54566a;

        public b(Looper looper, Context context) {
            super(looper);
            this.f54566a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null) {
                int i4 = message.what;
                if (i4 == 0) {
                    UpdateLodingService.this.f54562g.update(0, message.obj);
                } else if (i4 == 1) {
                    UpdateLodingService.this.f54562g.update(1, message.obj);
                } else if (i4 == 2) {
                    UpdateLodingService.this.f54562g.update(2, message.obj);
                } else if (i4 == 3) {
                    UpdateLodingService.this.f54562g.update(3, message.obj);
                } else if (i4 != 4) {
                } else {
                    UpdateLodingService.this.f54562g.update(4, message.obj);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c extends Binder {
        public c() {
        }

        public UpdateLodingService getService() {
            return UpdateLodingService.this;
        }

        public void setDownData(String str, int i4) {
            UpdateLodingService.this.f54557b = false;
            UpdateLodingService.this.f54559d = i4;
            UpdateLodingService.this.k(str);
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void update(int i4, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        new a(str).start();
    }

    public void l() {
        this.f54557b = true;
        stopSelf();
    }

    public void m(d dVar) {
        this.f54562g = dVar;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.f54561f == null) {
            this.f54561f = new c();
        }
        this.f54560e = new b(Looper.myLooper(), this);
        return this.f54561f;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f54561f = new c();
        this.f54563h = this;
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f54557b = true;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        return super.onStartCommand(intent, i4, i5);
    }
}
