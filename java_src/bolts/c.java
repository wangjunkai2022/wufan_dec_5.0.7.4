package bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;
/* compiled from: CancellationToken.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final e f263a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(e eVar) {
        this.f263a = eVar;
    }

    public boolean a() {
        return this.f263a.k();
    }

    public d b(Runnable runnable) {
        return this.f263a.p(runnable);
    }

    public void c() throws CancellationException {
        this.f263a.r();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f263a.k()));
    }
}
