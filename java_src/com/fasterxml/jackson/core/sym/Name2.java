package com.fasterxml.jackson.core.sym;
/* loaded from: classes3.dex */
public final class Name2 extends Name {

    /* renamed from: q1  reason: collision with root package name */
    private final int f12837q1;

    /* renamed from: q2  reason: collision with root package name */
    private final int f12838q2;

    Name2(String str, int i4, int i5, int i6) {
        super(str, i4);
        this.f12837q1 = i5;
        this.f12838q2 = i6;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4, int i5) {
        return i4 == this.f12837q1 && i5 == this.f12838q2;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4, int i5, int i6) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i4) {
        return i4 == 2 && iArr[0] == this.f12837q1 && iArr[1] == this.f12838q2;
    }
}
