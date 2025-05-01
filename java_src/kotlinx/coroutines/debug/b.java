package kotlinx.coroutines.debug;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;
import sun.misc.SignalHandler;
/* compiled from: AgentPremain.kt */
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes6.dex */
public final class b {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final b f70022a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f70023b;

    /* compiled from: AgentPremain.kt */
    /* loaded from: classes6.dex */
    public static final class a implements ClassFileTransformer {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public static final a f70024a = new a();

        private a() {
        }

        @Nullable
        public byte[] a(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (Intrinsics.areEqual(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                kotlinx.coroutines.debug.internal.a.f70087a.b(true);
                return ByteStreamsKt.readBytes(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object m35constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            m35constructorimpl = Result.m35constructorimpl(property == null ? null : Boolean.valueOf(Boolean.parseBoolean(property)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Result.m41isFailureimpl(m35constructorimpl) ? null : m35constructorimpl;
        f70023b = bool == null ? DebugProbesImpl.f70061a.u() : bool.booleanValue();
    }

    private b() {
    }

    private final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: kotlinx.coroutines.debug.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Signal signal) {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f70061a;
        if (debugProbesImpl.z()) {
            debugProbesImpl.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @JvmStatic
    public static final void d(@Nullable String str, @NotNull Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f70087a.b(true);
        instrumentation.addTransformer(a.f70024a);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f70061a;
        debugProbesImpl.K(f70023b);
        debugProbesImpl.x();
        f70022a.b();
    }
}
