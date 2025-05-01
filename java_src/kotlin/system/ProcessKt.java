package kotlin.system;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
/* compiled from: Process.kt */
@JvmName(name = "ProcessKt")
/* loaded from: classes6.dex */
public final class ProcessKt {
    @InlineOnly
    private static final Void exitProcess(int i4) {
        System.exit(i4);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
