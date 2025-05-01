package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UIntRange.kt */
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes6.dex */
public class UIntProgression implements Iterable<UInt>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    /* compiled from: UIntRange.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: fromClosedRange-Nkh28Cs  reason: not valid java name */
        public final UIntProgression m1282fromClosedRangeNkh28Cs(int i4, int i5, int i6) {
            return new UIntProgression(i4, i5, i6, null);
        }
    }

    private UIntProgression(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 != Integer.MIN_VALUE) {
            this.first = i4;
            this.last = UProgressionUtilKt.m1266getProgressionLastElementNkh28Cs(i4, i5, i6);
            this.step = i6;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public /* synthetic */ UIntProgression(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, i6);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) obj;
                if (this.first != uIntProgression.first || this.last != uIntProgression.last || this.step != uIntProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-pVg5ArA  reason: not valid java name */
    public final int m1280getFirstpVg5ArA() {
        return this.first;
    }

    /* renamed from: getLast-pVg5ArA  reason: not valid java name */
    public final int m1281getLastpVg5ArA() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        if (this.step > 0) {
            compare2 = Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE);
            if (compare2 > 0) {
                return true;
            }
        } else {
            compare = Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE);
            if (compare < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m176toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) UInt.m176toStringimpl(this.last));
            sb.append(" step ");
            i4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m176toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) UInt.m176toStringimpl(this.last));
            sb.append(" step ");
            i4 = -this.step;
        }
        sb.append(i4);
        return sb.toString();
    }
}
