package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: KotlinVersion.kt */
@SinceKotlin(version = "1.1")
/* loaded from: classes6.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final KotlinVersion CURRENT = KotlinVersionCurrentValue.get();

    /* compiled from: KotlinVersion.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KotlinVersion(int i4, int i5, int i6) {
        this.major = i4;
        this.minor = i5;
        this.patch = i6;
        this.version = versionOf(i4, i5, i6);
    }

    private final int versionOf(int i4, int i5, int i6) {
        boolean z4 = false;
        if (new IntRange(0, 255).contains(i4) && new IntRange(0, 255).contains(i5) && new IntRange(0, 255).contains(i6)) {
            z4 = true;
        }
        if (z4) {
            return (i4 << 16) + (i5 << 8) + i6;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + external.org.apache.commons.lang3.d.f68897a + i5 + external.org.apache.commons.lang3.d.f68897a + i6).toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i4, int i5) {
        int i6 = this.major;
        return i6 > i4 || (i6 == i4 && this.minor >= i5);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append(external.org.apache.commons.lang3.d.f68897a);
        sb.append(this.minor);
        sb.append(external.org.apache.commons.lang3.d.f68897a);
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public final boolean isAtLeast(int i4, int i5, int i6) {
        int i7;
        int i8 = this.major;
        return i8 > i4 || (i8 == i4 && ((i7 = this.minor) > i5 || (i7 == i5 && this.patch >= i6)));
    }

    public KotlinVersion(int i4, int i5) {
        this(i4, i5, 0);
    }
}
