package bolts;

import bolts.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnobservedErrorNotifier.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private h<?> f342a;

    public j(h<?> hVar) {
        this.f342a = hVar;
    }

    public void a() {
        this.f342a = null;
    }

    protected void finalize() throws Throwable {
        h.q C;
        try {
            h<?> hVar = this.f342a;
            if (hVar != null && (C = h.C()) != null) {
                C.a(hVar, new UnobservedTaskException(hVar.A()));
            }
        } finally {
            super.finalize();
        }
    }
}
