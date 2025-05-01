package com.kwad.components.core.webview.tachikoma.d;

import com.kwad.components.core.webview.tachikoma.e.e;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes5.dex */
public final class b {
    private final Set<e> abI;

    /* loaded from: classes5.dex */
    static class a {
        private static final b abO = new b((byte) 0);
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, String str2) {
        if (this.abI.size() == 0) {
            return;
        }
        for (e eVar : new HashSet(this.abI)) {
            eVar.q(str2);
        }
    }

    public static b tG() {
        return a.abO;
    }

    public final void b(e eVar) {
        this.abI.remove(eVar);
    }

    public final void c(final String str, final long j4, final long j5, final long j6) {
        bo.runOnUiThread(new az() { // from class: com.kwad.components.core.webview.tachikoma.d.b.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                b.this.b(str, j4, j5, j6);
            }
        });
    }

    public final void s(final String str, final String str2) {
        bo.runOnUiThread(new az() { // from class: com.kwad.components.core.webview.tachikoma.d.b.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                b.this.r(str, str2);
            }
        });
    }

    public final void tH() {
        this.abI.clear();
    }

    private b() {
        this.abI = new CopyOnWriteArraySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, long j4, long j5, long j6) {
        if (this.abI.size() == 0) {
            return;
        }
        for (e eVar : new HashSet(this.abI)) {
            eVar.a(str, j4, j5, j6);
        }
    }

    public final void a(e eVar) {
        if (eVar != null) {
            this.abI.add(eVar);
        }
    }
}
