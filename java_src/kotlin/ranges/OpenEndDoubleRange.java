package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Ranges.kt */
/* loaded from: classes6.dex */
final class OpenEndDoubleRange implements OpenEndRange<Double> {
    private final double _endExclusive;
    private final double _start;

    public OpenEndDoubleRange(double d5, double d6) {
        this._start = d5;
        this._endExclusive = d6;
    }

    private final boolean lessThanOrEquals(double d5, double d6) {
        return d5 <= d6;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Double d5) {
        return contains(d5.doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof OpenEndDoubleRange) {
            if (isEmpty() && ((OpenEndDoubleRange) obj).isEmpty()) {
                return true;
            }
            OpenEndDoubleRange openEndDoubleRange = (OpenEndDoubleRange) obj;
            if (this._start == openEndDoubleRange._start) {
                if (this._endExclusive == openEndDoubleRange._endExclusive) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a.a(this._start) * 31) + a.a(this._endExclusive);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    @NotNull
    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }

    public boolean contains(double d5) {
        return d5 >= this._start && d5 < this._endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Double getEndExclusive() {
        return Double.valueOf(this._endExclusive);
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Double getStart() {
        return Double.valueOf(this._start);
    }
}
