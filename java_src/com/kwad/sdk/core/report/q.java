package com.kwad.sdk.core.report;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public class q extends d {
    private static volatile q aAh;
    private o aAi;

    private q(Context context) {
        super(new p(context, p.Jr));
        this.aAi = new i();
    }

    public static q bs(Context context) {
        if (aAh == null) {
            synchronized (q.class) {
                if (aAh == null) {
                    aAh = new q(context);
                }
            }
        }
        return aAh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.report.d
    /* renamed from: h */
    public synchronized n g(@NonNull Cursor cursor) {
        String string = cursor.getString(0);
        String string2 = cursor.getString(1);
        if (((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).zy()) {
            return this.aAi.Z(string2, string);
        }
        return this.aAi.Z(string2, string);
    }

    @Override // com.kwad.sdk.core.report.d
    protected final String Fq() {
        return "ksad_actions";
    }

    @Override // com.kwad.sdk.core.report.d
    protected final String Fr() {
        return "select aLog, actionId from " + Fq();
    }

    @Override // com.kwad.sdk.core.report.d
    protected final String getTag() {
        return "ReportActionDBManager";
    }
}
