package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
/* compiled from: Debug.kt */
/* loaded from: classes6.dex */
public final class s0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f71243a = "kotlinx.coroutines.debug";
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f71244b = "kotlinx.coroutines.stacktrace.recovery";
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final String f71245c = "auto";
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final String f71246d = "on";
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final String f71247e = "off";

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f71248f = false;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f71249g;

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f71250h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicLong f71251i;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0.equals(kotlinx.coroutines.s0.f71245c) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r0.equals(kotlinx.coroutines.s0.f71246d) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r0.equals("") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.q0.d(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L64
            int r3 = r0.hashCode()
            if (r3 == 0) goto L3a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L31
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L44
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L64
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            r0 = 0
            goto L68
        L31:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L42
        L3a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L42:
            r0 = 1
            goto L68
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L64:
            boolean r0 = b()
        L68:
            kotlinx.coroutines.s0.f71249g = r0
            if (r0 == 0) goto L75
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.q0.e(r0, r2)
            if (r0 == 0) goto L75
            r1 = 1
        L75:
            kotlinx.coroutines.s0.f71250h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.s0.f71251i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.s0.<clinit>():void");
    }

    @InlineOnly
    private static final void a(Function0<Boolean> function0) {
        if (b() && !function0.invoke().booleanValue()) {
            throw new AssertionError();
        }
    }

    public static final boolean b() {
        return f71248f;
    }

    @NotNull
    public static final AtomicLong c() {
        return f71251i;
    }

    public static final boolean d() {
        return f71249g;
    }

    public static final boolean e() {
        return f71250h;
    }

    public static final void f() {
        f71251i.set(0L);
    }
}
