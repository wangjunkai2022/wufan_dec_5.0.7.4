package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SystemProps.kt */
/* loaded from: classes6.dex */
final /* synthetic */ class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f71145a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f71145a;
    }

    @Nullable
    public static final String b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
