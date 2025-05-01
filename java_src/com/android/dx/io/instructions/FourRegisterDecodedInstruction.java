package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;
/* loaded from: classes.dex */
public final class FourRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a  reason: collision with root package name */
    private final int f5065a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5066b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5067c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5068d;

    public FourRegisterDecodedInstruction(InstructionCodec instructionCodec, int i4, int i5, IndexType indexType, int i6, long j4, int i7, int i8, int i9, int i10) {
        super(instructionCodec, i4, i5, indexType, i6, j4);
        this.f5065a = i7;
        this.f5066b = i8;
        this.f5067c = i9;
        this.f5068d = i10;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f5065a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getB() {
        return this.f5066b;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        return this.f5067c;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getD() {
        return this.f5068d;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 4;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i4) {
        return new FourRegisterDecodedInstruction(getFormat(), getOpcode(), i4, getIndexType(), getTarget(), getLiteral(), this.f5065a, this.f5066b, this.f5067c, this.f5068d);
    }
}
