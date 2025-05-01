package retrofit2.adapter.rxjava2;

import java.util.Objects;
import javax.annotation.Nullable;
import retrofit2.Response;
/* compiled from: Result.java */
/* loaded from: classes.dex */
public final class d<T> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Response<T> f73215a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f73216b;

    private d(@Nullable Response<T> response, @Nullable Throwable th) {
        this.f73215a = response;
        this.f73216b = th;
    }

    public static <T> d<T> b(Throwable th) {
        Objects.requireNonNull(th, "error == null");
        return new d<>(null, th);
    }

    public static <T> d<T> e(Response<T> response) {
        Objects.requireNonNull(response, "response == null");
        return new d<>(response, null);
    }

    @Nullable
    public Throwable a() {
        return this.f73216b;
    }

    public boolean c() {
        return this.f73216b != null;
    }

    @Nullable
    public Response<T> d() {
        return this.f73215a;
    }
}
