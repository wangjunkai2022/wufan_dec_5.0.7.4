package kotlin.ranges;

import java.util.Iterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Progressions.kt */
/* loaded from: classes6.dex */
public class LongProgression implements Iterable<Long>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    /* compiled from: Progressions.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LongProgression fromClosedRange(long j4, long j5, long j6) {
            return new LongProgression(j4, j5, j6);
        }
    }

    public LongProgression(long j4, long j5, long j6) {
        if (j6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j6 != Long.MIN_VALUE) {
            this.first = j4;
            this.last = ProgressionUtilKt.getProgressionLastElement(j4, j5, j6);
            this.step = j6;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) obj).isEmpty()) {
                LongProgression longProgression = (LongProgression) obj;
                if (this.first != longProgression.first || this.last != longProgression.last || this.step != longProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j4 = 31;
        long j5 = this.first;
        long j6 = this.last;
        long j7 = j4 * (((j5 ^ (j5 >>> 32)) * j4) + (j6 ^ (j6 >>> 32)));
        long j8 = this.step;
        return (int) (j7 + (j8 ^ (j8 >>> 32)));
    }

    public boolean isEmpty() {
        int i4 = (this.step > 0L ? 1 : (this.step == 0L ? 0 : -1));
        long j4 = this.first;
        long j5 = this.last;
        if (i4 > 0) {
            if (j4 > j5) {
                return true;
            }
        } else if (j4 < j5) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j4;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            j4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            j4 = -this.step;
        }
        sb.append(j4);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Long> iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }
}
