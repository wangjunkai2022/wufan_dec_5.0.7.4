package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
/* compiled from: FastServiceLoader.kt */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f71137a;

    static {
        Object m35constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        f71137a = Result.m42isSuccessimpl(m35constructorimpl);
    }

    public static final boolean a() {
        return f71137a;
    }
}
