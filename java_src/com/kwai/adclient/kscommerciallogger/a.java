package com.kwai.adclient.kscommerciallogger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwai.adclient.kscommerciallogger.model.c;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a {
    private com.kwai.adclient.kscommerciallogger.a.a aUC;
    private com.kwai.adclient.kscommerciallogger.a.b aUD;
    private JSONObject aUE;
    private boolean aUF;
    private boolean isDebug;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwai.adclient.kscommerciallogger.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0547a {
        private static a aUG;

        public static a OQ() {
            if (aUG == null) {
                aUG = new a((byte) 0);
            }
            return aUG;
        }
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    public static a OQ() {
        return C0547a.OQ();
    }

    private void b(@NonNull c cVar) {
        if (this.aUC != null) {
            if (cVar.OU() != null) {
                String str = cVar.OU().value;
            }
            if (cVar.OV() != null) {
                cVar.OV().getValue();
            }
            cVar.OY();
            b.z(cVar.OW());
            b.z(cVar.OX());
        }
    }

    public final JSONObject OR() {
        return this.aUE;
    }

    public final boolean OS() {
        return this.aUF;
    }

    public final void a(@NonNull com.kwai.adclient.kscommerciallogger.a.a aVar, @NonNull com.kwai.adclient.kscommerciallogger.a.b bVar, @Nullable JSONObject jSONObject, boolean z4, boolean z5) {
        this.aUC = aVar;
        this.aUD = bVar;
        this.aUE = jSONObject;
        this.isDebug = z4;
        this.aUF = z5;
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    private a() {
        this.isDebug = false;
        this.aUF = false;
    }

    public final void a(c cVar) {
        if (cVar == null) {
            return;
        }
        b(cVar);
        com.kwai.adclient.kscommerciallogger.a.b bVar = this.aUD;
        if (bVar != null) {
            bVar.L(cVar.OT(), cVar.toString());
        }
    }
}
