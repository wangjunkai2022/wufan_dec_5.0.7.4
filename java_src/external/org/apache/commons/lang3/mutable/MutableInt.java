package external.org.apache.commons.lang3.mutable;

import n3.a;
/* loaded from: classes6.dex */
public class MutableInt extends Number implements Comparable<MutableInt>, a<Number> {
    private static final long serialVersionUID = 512176391864L;

    /* renamed from: b  reason: collision with root package name */
    private int f68986b;

    public MutableInt() {
    }

    public void E() {
        this.f68986b++;
    }

    public void P(int i4) {
        this.f68986b = i4;
    }

    @Override // n3.a
    /* renamed from: W */
    public void setValue(Number number) {
        this.f68986b = number.intValue();
    }

    public void a0(int i4) {
        this.f68986b -= i4;
    }

    public void d(int i4) {
        this.f68986b += i4;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f68986b;
    }

    public void e(Number number) {
        this.f68986b += number.intValue();
    }

    public void e0(Number number) {
        this.f68986b -= number.intValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableInt) && this.f68986b == ((MutableInt) obj).intValue();
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(MutableInt mutableInt) {
        int i4 = mutableInt.f68986b;
        int i5 = this.f68986b;
        if (i5 < i4) {
            return -1;
        }
        return i5 == i4 ? 0 : 1;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f68986b;
    }

    public Integer g0() {
        return Integer.valueOf(intValue());
    }

    public int hashCode() {
        return this.f68986b;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f68986b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f68986b;
    }

    public void m() {
        this.f68986b--;
    }

    public String toString() {
        return String.valueOf(this.f68986b);
    }

    @Override // n3.a
    /* renamed from: u */
    public Integer getValue() {
        return Integer.valueOf(this.f68986b);
    }

    public MutableInt(int i4) {
        this.f68986b = i4;
    }

    public MutableInt(Number number) {
        this.f68986b = number.intValue();
    }

    public MutableInt(String str) throws NumberFormatException {
        this.f68986b = Integer.parseInt(str);
    }
}
