package kotlin.time;

import external.org.apache.commons.lang3.d;
import kotlin.SinceKotlin;
/* compiled from: TimeSources.kt */
@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    /* renamed from: overflow-LRDsOJo  reason: not valid java name */
    private final void m1507overflowLRDsOJo(long j4) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m1422toStringimpl(j4)) + d.f68897a);
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m1508plusAssignLRDsOJo(long j4) {
        long j5;
        long m1419toLongimpl = Duration.m1419toLongimpl(j4, getUnit());
        if (m1419toLongimpl != Long.MIN_VALUE && m1419toLongimpl != Long.MAX_VALUE) {
            long j6 = this.reading;
            j5 = j6 + m1419toLongimpl;
            if ((m1419toLongimpl ^ j6) >= 0 && (j6 ^ j5) < 0) {
                m1507overflowLRDsOJo(j4);
            }
        } else {
            double m1416toDoubleimpl = Duration.m1416toDoubleimpl(j4, getUnit());
            double d5 = this.reading;
            Double.isNaN(d5);
            double d6 = d5 + m1416toDoubleimpl;
            if (d6 > 9.223372036854776E18d || d6 < -9.223372036854776E18d) {
                m1507overflowLRDsOJo(j4);
            }
            j5 = (long) d6;
        }
        this.reading = j5;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long read() {
        return this.reading;
    }
}
