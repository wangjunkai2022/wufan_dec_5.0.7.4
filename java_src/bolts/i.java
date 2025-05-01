package bolts;
/* compiled from: TaskCompletionSource.java */
/* loaded from: classes2.dex */
public class i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final h<TResult> f341a = new h<>();

    public h<TResult> a() {
        return this.f341a;
    }

    public void b() {
        if (!d()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!e(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public boolean d() {
        return this.f341a.R();
    }

    public boolean e(Exception exc) {
        return this.f341a.S(exc);
    }

    public boolean f(TResult tresult) {
        return this.f341a.T(tresult);
    }

    public void setResult(TResult tresult) {
        if (!f(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
