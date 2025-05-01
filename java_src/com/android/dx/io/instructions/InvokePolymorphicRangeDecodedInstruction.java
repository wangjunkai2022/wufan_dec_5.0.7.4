package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;
/* loaded from: classes.dex */
public class InvokePolymorphicRangeDecodedInstruction extends DecodedInstruction {

    /* renamed from: c  reason: collision with root package name */
    private final int f5069c;
    private final int protoIndex;
    private final int registerCount;

    public InvokePolymorphicRangeDecodedInstruction(InstructionCodec instructionCodec, int i4, int i5, IndexType indexType, int i6, int i7, int i8) {
        super(instructionCodec, i4, i5, indexType, 0, 0L);
        if (i8 == ((short) i8)) {
            this.f5069c = i6;
            this.registerCount = i7;
            this.protoIndex = i8;
            return;
        }
        throw new IllegalArgumentException("protoIndex doesn't fit in a short: " + i8);
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        return this.f5069c;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public short getProtoIndex() {
        return (short) this.protoIndex;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i4) {
        throw new UnsupportedOperationException("use withProtoIndex to update both the method and proto indices for invoke-polymorphic/range");
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withProtoIndex(int i4, int i5) {
        return new InvokePolymorphicRangeDecodedInstruction(getFormat(), getOpcode(), i4, getIndexType(), this.f5069c, this.registerCount, i5);
    }
}
