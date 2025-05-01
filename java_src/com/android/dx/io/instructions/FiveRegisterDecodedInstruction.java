package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;
/* loaded from: classes.dex */
public final class FiveRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a  reason: collision with root package name */
    private final int f5060a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5061b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5062c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5063d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5064e;

    public FiveRegisterDecodedInstruction(InstructionCodec instructionCodec, int i4, int i5, IndexType indexType, int i6, long j4, int i7, int i8, int i9, int i10, int i11) {
        super(instructionCodec, i4, i5, indexType, i6, j4);
        this.f5060a = i7;
        this.f5061b = i8;
        this.f5062c = i9;
        this.f5063d = i10;
        this.f5064e = i11;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f5060a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getB() {
        return this.f5061b;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        return this.f5062c;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getD() {
        return this.f5063d;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getE() {
        return this.f5064e;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 5;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i4) {
        return new FiveRegisterDecodedInstruction(getFormat(), getOpcode(), i4, getIndexType(), getTarget(), getLiteral(), this.f5060a, this.f5061b, this.f5062c, this.f5063d, this.f5064e);
    }
}
