package com.fasterxml.jackson.core.sym;
/* loaded from: classes3.dex */
public final class Name1 extends Name {
    private static final Name1 EMPTY = new Name1("", 0, 0);

    /* renamed from: q  reason: collision with root package name */
    private final int f12836q;

    Name1(String str, int i4, int i5) {
        super(str, i4);
        this.f12836q = i5;
    }

    public static Name1 getEmptyName() {
        return EMPTY;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4) {
        return i4 == this.f12836q;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4, int i5, int i6) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i4, int i5) {
        return i4 == this.f12836q && i5 == 0;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i4) {
        return i4 == 1 && iArr[0] == this.f12836q;
    }
}
