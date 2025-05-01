package com.tencent.stat.a;

import android.content.Context;
import com.tencent.stat.StatConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class d extends e {

    /* renamed from: a  reason: collision with root package name */
    private String f62887a;

    /* renamed from: l  reason: collision with root package name */
    private int f62888l;

    /* renamed from: m  reason: collision with root package name */
    private int f62889m;

    public d(Context context, int i4, int i5, Throwable th) {
        super(context, i4);
        this.f62889m = 100;
        if (th != null) {
            Throwable th2 = new Throwable(th);
            try {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace != null) {
                    int length = stackTrace.length;
                    int i6 = this.f62889m;
                    if (length > i6) {
                        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i6];
                        for (int i7 = 0; i7 < this.f62889m; i7++) {
                            stackTraceElementArr[i7] = stackTrace[i7];
                        }
                        th2.setStackTrace(stackTraceElementArr);
                    }
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            this.f62887a = stringWriter.toString();
            this.f62888l = i5;
            printWriter.close();
        }
    }

    public d(Context context, int i4, String str, int i5, int i6) {
        super(context, i4);
        this.f62889m = 100;
        if (str != null) {
            i6 = i6 <= 0 ? StatConfig.getMaxReportEventLength() : i6;
            if (str.length() <= i6) {
                this.f62887a = str;
            } else {
                this.f62887a = str.substring(0, i6);
            }
        }
        this.f62888l = i5;
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.ERROR;
    }

    public void a(long j4) {
        this.f62892c = j4;
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        com.tencent.stat.common.k.a(jSONObject, "er", this.f62887a);
        jSONObject.put("ea", this.f62888l);
        return true;
    }
}
