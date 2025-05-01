package com.efs.sdk.pa.a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.pa.PA;
import com.efs.sdk.pa.PAANRListener;
import com.efs.sdk.pa.PAMsgListener;
import com.efs.sdk.pa.a.b;
import com.efs.sdk.pa.a.g;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
/* loaded from: classes2.dex */
public final class c implements PA {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10664a;

    /* renamed from: c  reason: collision with root package name */
    private e f10666c;

    /* renamed from: d  reason: collision with root package name */
    private f f10667d;

    /* renamed from: e  reason: collision with root package name */
    private a f10668e;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10671h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10672i;

    /* renamed from: b  reason: collision with root package name */
    private Looper f10665b = Looper.myLooper();

    /* renamed from: f  reason: collision with root package name */
    private b f10669f = new b();

    /* renamed from: g  reason: collision with root package name */
    private g f10670g = new g();

    public c(boolean z4) {
        this.f10672i = z4;
    }

    @Override // com.efs.sdk.pa.PA
    public final void enableDumpToFile(String str) {
        FileOutputStream fileOutputStream;
        f fVar = this.f10667d;
        if (fVar == null || str == null || str.trim().length() == 0) {
            return;
        }
        fVar.f10681c = str;
        if (fVar.f10682d == null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Exception unused) {
            }
            try {
                fVar.f10682d = new BufferedOutputStream(fileOutputStream);
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void enableLog(boolean z4) {
        this.f10664a = z4;
        this.f10669f.f10658b = z4;
        this.f10670g.f10684b = z4;
        f fVar = this.f10667d;
        if (fVar != null) {
            fVar.f10680b = z4;
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final int endCalFPS(String str) {
        if (this.f10671h) {
            b bVar = this.f10669f;
            if (str != null && str.trim().length() != 0) {
                b.a aVar = bVar.f10657a.get(str);
                if (aVar == null) {
                    return 0;
                }
                View view = aVar.f10662d;
                if (view != null && aVar.f10661c != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(aVar.f10661c);
                }
                bVar.f10657a.remove(str);
                int currentTimeMillis = (int) (((float) aVar.f10660b) / (((float) (System.currentTimeMillis() - aVar.f10659a)) / 1000.0f));
                r1 = currentTimeMillis > 0 ? currentTimeMillis : 0;
                if (bVar.f10658b) {
                    StringBuilder sb = new StringBuilder("key=");
                    sb.append(str);
                    sb.append(",fps=");
                    sb.append(r1);
                }
            }
            return r1;
        }
        return -1;
    }

    @Override // com.efs.sdk.pa.PA
    public final long endCalTime(String str) {
        if (this.f10671h) {
            g gVar = this.f10670g;
            long j4 = 0;
            if (str != null && str.trim().length() != 0) {
                g.a aVar = gVar.f10683a.get(str);
                if (aVar == null) {
                    return 0L;
                }
                gVar.f10683a.remove(str);
                j4 = System.currentTimeMillis() - aVar.f10685a;
                if (gVar.f10684b) {
                    StringBuilder sb = new StringBuilder("key=");
                    sb.append(str);
                    sb.append(",consumeTime=");
                    sb.append(j4);
                }
            }
            return j4;
        }
        return -1L;
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, 2000L);
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f10666c == null) {
            this.f10666c = new e();
        }
        this.f10665b.setMessageLogging(this.f10666c);
        if (this.f10667d == null) {
            this.f10667d = new f();
        }
        f fVar = this.f10667d;
        fVar.f10680b = this.f10664a;
        fVar.f10679a = pAMsgListener;
        this.f10666c.f10673a.add(fVar);
    }

    @Override // com.efs.sdk.pa.PA
    public final void start() {
        if (this.f10672i || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            this.f10671h = true;
            e eVar = this.f10666c;
            if (eVar != null) {
                this.f10665b.setMessageLogging(eVar);
            }
            a aVar = this.f10668e;
            if (aVar == null || !aVar.f10644f) {
                return;
            }
            aVar.f10644f = false;
            aVar.f10645g.post(aVar.f10651m);
            aVar.f10648j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void startCalFPS(String str, View view) {
        if (this.f10671h) {
            b bVar = this.f10669f;
            if (str == null || str.trim().length() == 0 || view == null || bVar.f10657a.get(str) != null) {
                return;
            }
            final b.a aVar = new b.a((byte) 0);
            aVar.f10662d = view;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.efs.sdk.pa.a.b.a.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    aVar.f10660b++;
                    return true;
                }
            };
            aVar.f10661c = onPreDrawListener;
            aVar.f10662d.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            aVar.f10659a = System.currentTimeMillis();
            bVar.f10657a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void startCalTime(String str) {
        if (this.f10671h) {
            g gVar = this.f10670g;
            if (str == null || str.trim().length() == 0 || gVar.f10683a.get(str) != null) {
                return;
            }
            g.a aVar = new g.a((byte) 0);
            aVar.f10685a = System.currentTimeMillis();
            gVar.f10683a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void stop() {
        this.f10671h = false;
        this.f10665b.setMessageLogging(null);
        a aVar = this.f10668e;
        if (aVar != null) {
            aVar.f10644f = true;
            aVar.f10645g.removeCallbacksAndMessages(null);
            aVar.f10639a = true;
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void unRegisterPAMsgListener() {
        f fVar = this.f10667d;
        if (fVar != null) {
            fVar.f10679a = null;
        }
        e eVar = this.f10666c;
        if (eVar != null) {
            eVar.f10673a.remove(fVar);
        }
    }

    @Override // com.efs.sdk.pa.PA
    public final void unregisterPAANRListener() {
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j4) {
        registerPAANRListener(context, pAANRListener, j4, Looper.getMainLooper().getThread());
    }

    @Override // com.efs.sdk.pa.PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j4, Thread thread) {
        if (this.f10668e == null) {
            if (thread != null) {
                this.f10668e = new a((Application) context.getApplicationContext(), j4);
            } else {
                this.f10668e = new a((Application) context.getApplicationContext(), j4, false);
            }
        }
        this.f10668e.f10646h = pAANRListener;
    }
}
