package com.fasterxml.jackson.core.sym;
/* loaded from: classes3.dex */
public final class Name3 extends Name {

    /* renamed from: q1  reason: collision with root package name */
    private final int f12839q1;

    /* renamed from: q2  reason: collision with root package name */
    private final int f12840q2;

    /* renamed from: q3  reason: collision with root package name */
    private final int f12841q3;

    Name3(String str, int i4, int i5, int i6, int i7) {
        super(str, i4);
        this.f12839q1 = i5;
        this.f12840q2 = i6;
        this.f12841q3 = i7;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4, int i5) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4, int i5, int i6) {
        return this.f12839q1 == i4 && this.f12840q2 == i5 && this.f12841q3 == i6;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i4) {
        return i4 == 3 && iArr[0] == this.f12839q1 && iArr[1] == this.f12840q2 && iArr[2] == this.f12841q3;
    }
}
