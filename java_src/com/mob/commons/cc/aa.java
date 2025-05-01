package com.mob.commons.cc;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
/* loaded from: classes5.dex */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    private a f56262a;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Number f56263a;

        /* renamed from: b  reason: collision with root package name */
        private Number f56264b;

        /* renamed from: c  reason: collision with root package name */
        private Number f56265c;

        /* renamed from: d  reason: collision with root package name */
        private Number f56266d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f56267e;

        public a(Number number, Number number2, Number number3) {
            Number[] numberArr = {number, number2, number3};
            int[] iArr = {0, 0, 0};
            for (int i4 = 0; i4 < 3; i4++) {
                Number number4 = numberArr[i4];
                if (number4 != null) {
                    if (number4 instanceof Byte) {
                        iArr[i4] = 1;
                    } else if (number4 instanceof Short) {
                        iArr[i4] = 2;
                    } else if (number4 instanceof Integer) {
                        iArr[i4] = 3;
                    } else if (number4 instanceof Long) {
                        iArr[i4] = 4;
                    } else if (number4 instanceof Float) {
                        iArr[i4] = 5;
                    } else if (number4 instanceof Double) {
                        iArr[i4] = 6;
                    }
                }
            }
            int i5 = 0;
            for (int i6 = 0; i6 < 3; i6++) {
                if (i5 < iArr[i6]) {
                    i5 = iArr[i6];
                }
            }
            if (number == null) {
                number = new Number[]{Integer.MIN_VALUE, Byte.MIN_VALUE, Short.valueOf((short) ShortCompanionObject.MIN_VALUE), Integer.MIN_VALUE, Long.MIN_VALUE, Float.valueOf(Float.MIN_VALUE), Double.valueOf(Double.MIN_VALUE)}[i5];
            } else {
                switch (i5) {
                    case 1:
                        number = Byte.valueOf(Double.valueOf(String.valueOf(number)).byteValue());
                        break;
                    case 2:
                        number = Short.valueOf(Double.valueOf(String.valueOf(number)).shortValue());
                        break;
                    case 3:
                        number = Integer.valueOf(Double.valueOf(String.valueOf(number)).intValue());
                        break;
                    case 4:
                        number = Long.valueOf(Double.valueOf(String.valueOf(number)).longValue());
                        break;
                    case 5:
                        number = Float.valueOf(Double.valueOf(String.valueOf(number)).floatValue());
                        break;
                    case 6:
                        number = Double.valueOf(String.valueOf(number));
                        break;
                }
            }
            if (number2 == null) {
                number2 = new Number[]{Integer.MAX_VALUE, Byte.valueOf((byte) ByteCompanionObject.MAX_VALUE), Short.valueOf((short) ShortCompanionObject.MAX_VALUE), Integer.MAX_VALUE, Long.MAX_VALUE, Float.valueOf(Float.MAX_VALUE), Double.valueOf(Double.MAX_VALUE)}[i5];
            } else {
                switch (i5) {
                    case 1:
                        number2 = Byte.valueOf(Double.valueOf(String.valueOf(number2)).byteValue());
                        break;
                    case 2:
                        number2 = Short.valueOf(Double.valueOf(String.valueOf(number2)).shortValue());
                        break;
                    case 3:
                        number2 = Integer.valueOf(Double.valueOf(String.valueOf(number2)).intValue());
                        break;
                    case 4:
                        number2 = Long.valueOf(Double.valueOf(String.valueOf(number2)).longValue());
                        break;
                    case 5:
                        number2 = Float.valueOf(Double.valueOf(String.valueOf(number2)).floatValue());
                        break;
                    case 6:
                        number2 = Double.valueOf(String.valueOf(number2));
                        break;
                }
            }
            this.f56263a = number;
            this.f56264b = number2;
            this.f56265c = number3;
            boolean z4 = ((Comparable) number).compareTo(number2) > 0;
            this.f56267e = z4;
            if (this.f56265c == null) {
                this.f56265c = Integer.valueOf(z4 ? -1 : 1);
            }
        }

        public boolean a() {
            Number number = this.f56266d;
            if (number == null) {
                number = this.f56263a;
            }
            return this.f56267e ? ((Comparable) number).compareTo(this.f56264b) >= 0 : ((Comparable) number).compareTo(this.f56264b) <= 0;
        }

        public Number b() {
            if (this.f56266d == null) {
                this.f56266d = this.f56263a;
            }
            Number number = this.f56266d;
            Number number2 = this.f56265c;
            if (number2 instanceof Double) {
                this.f56266d = Double.valueOf(number.doubleValue() + this.f56265c.doubleValue());
            } else if (number2 instanceof Float) {
                this.f56266d = Float.valueOf(number.floatValue() + this.f56265c.floatValue());
            } else if (number2 instanceof Long) {
                this.f56266d = Long.valueOf(number.longValue() + this.f56265c.longValue());
            } else if (number2 instanceof Integer) {
                this.f56266d = Integer.valueOf(number.intValue() + this.f56265c.intValue());
            } else if (number2 instanceof Short) {
                this.f56266d = Integer.valueOf(number.shortValue() + this.f56265c.shortValue());
            } else {
                this.f56266d = Integer.valueOf(number.byteValue() + this.f56265c.byteValue());
            }
            return number;
        }
    }

    public aa(Number number, Number number2, Number number3) {
        this.f56262a = new a(number, number2, number3);
    }

    public a a() {
        return this.f56262a;
    }

    public boolean b(Number number) {
        return a(number);
    }

    public boolean a(Number number) {
        return ((Comparable) this.f56262a.f56263a).compareTo(number) <= 0 && ((Comparable) this.f56262a.f56264b).compareTo(number) >= 0;
    }

    public Number[] b() {
        return new Number[]{this.f56262a.f56263a, this.f56262a.f56264b};
    }
}
