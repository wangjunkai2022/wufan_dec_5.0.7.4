package com.android.dx.io.instructions;

import androidx.core.view.InputDeviceCompat;
import com.android.dex.DexException;
import com.android.dx.io.IndexType;
import com.android.dx.io.OpcodeInfo;
import com.android.dx.io.Opcodes;
import com.android.dx.util.Hex;
import java.io.EOFException;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class DecodedInstruction {
    private final InstructionCodec format;
    private final int index;
    private final IndexType indexType;
    private final long literal;
    private final int opcode;
    private final int target;

    public DecodedInstruction(InstructionCodec instructionCodec, int i4, int i5, IndexType indexType, int i6, long j4) {
        Objects.requireNonNull(instructionCodec, "format == null");
        if (Opcodes.isValidShape(i4)) {
            this.format = instructionCodec;
            this.opcode = i4;
            this.index = i5;
            this.indexType = indexType;
            this.target = i6;
            this.literal = j4;
            return;
        }
        throw new IllegalArgumentException("invalid opcode");
    }

    public static DecodedInstruction decode(CodeInput codeInput) throws EOFException {
        int read = codeInput.read();
        return OpcodeInfo.getFormat(Opcodes.extractOpcodeFromUnit(read)).decode(read, codeInput);
    }

    public static DecodedInstruction[] decodeAll(short[] sArr) {
        DecodedInstruction[] decodedInstructionArr = new DecodedInstruction[sArr.length];
        ShortArrayCodeInput shortArrayCodeInput = new ShortArrayCodeInput(sArr);
        while (shortArrayCodeInput.hasMore()) {
            try {
                decodedInstructionArr[shortArrayCodeInput.cursor()] = decode(shortArrayCodeInput);
            } catch (EOFException e5) {
                throw new DexException(e5);
            }
        }
        return decodedInstructionArr;
    }

    public final void encode(CodeOutput codeOutput) {
        this.format.encode(this, codeOutput);
    }

    public int getA() {
        return 0;
    }

    public final short getAByte() {
        int a5 = getA();
        if ((a5 & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) a5;
        }
        throw new DexException("Register A out of range: " + Hex.u8(a5));
    }

    public final short getANibble() {
        int a5 = getA();
        if ((a5 & (-16)) == 0) {
            return (short) a5;
        }
        throw new DexException("Register A out of range: " + Hex.u8(a5));
    }

    public final short getAUnit() {
        int a5 = getA();
        if (((-65536) & a5) == 0) {
            return (short) a5;
        }
        throw new DexException("Register A out of range: " + Hex.u8(a5));
    }

    public int getB() {
        return 0;
    }

    public final short getBByte() {
        int b5 = getB();
        if ((b5 & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) b5;
        }
        throw new DexException("Register B out of range: " + Hex.u8(b5));
    }

    public final short getBNibble() {
        int b5 = getB();
        if ((b5 & (-16)) == 0) {
            return (short) b5;
        }
        throw new DexException("Register B out of range: " + Hex.u8(b5));
    }

    public final short getBUnit() {
        int b5 = getB();
        if (((-65536) & b5) == 0) {
            return (short) b5;
        }
        throw new DexException("Register B out of range: " + Hex.u8(b5));
    }

    public int getC() {
        return 0;
    }

    public final short getCByte() {
        int c5 = getC();
        if ((c5 & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) c5;
        }
        throw new DexException("Register C out of range: " + Hex.u8(c5));
    }

    public final short getCNibble() {
        int c5 = getC();
        if ((c5 & (-16)) == 0) {
            return (short) c5;
        }
        throw new DexException("Register C out of range: " + Hex.u8(c5));
    }

    public final short getCUnit() {
        int c5 = getC();
        if (((-65536) & c5) == 0) {
            return (short) c5;
        }
        throw new DexException("Register C out of range: " + Hex.u8(c5));
    }

    public int getD() {
        return 0;
    }

    public final short getDByte() {
        int d5 = getD();
        if ((d5 & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) d5;
        }
        throw new DexException("Register D out of range: " + Hex.u8(d5));
    }

    public final short getDNibble() {
        int d5 = getD();
        if ((d5 & (-16)) == 0) {
            return (short) d5;
        }
        throw new DexException("Register D out of range: " + Hex.u8(d5));
    }

    public final short getDUnit() {
        int d5 = getD();
        if (((-65536) & d5) == 0) {
            return (short) d5;
        }
        throw new DexException("Register D out of range: " + Hex.u8(d5));
    }

    public int getE() {
        return 0;
    }

    public final short getENibble() {
        int e5 = getE();
        if ((e5 & (-16)) == 0) {
            return (short) e5;
        }
        throw new DexException("Register E out of range: " + Hex.u8(e5));
    }

    public final InstructionCodec getFormat() {
        return this.format;
    }

    public final int getIndex() {
        return this.index;
    }

    public final IndexType getIndexType() {
        return this.indexType;
    }

    public final short getIndexUnit() {
        return (short) this.index;
    }

    public final long getLiteral() {
        return this.literal;
    }

    public final int getLiteralByte() {
        long j4 = this.literal;
        if (j4 == ((byte) j4)) {
            return ((int) j4) & 255;
        }
        throw new DexException("Literal out of range: " + Hex.u8(this.literal));
    }

    public final int getLiteralInt() {
        long j4 = this.literal;
        if (j4 == ((int) j4)) {
            return (int) j4;
        }
        throw new DexException("Literal out of range: " + Hex.u8(this.literal));
    }

    public final int getLiteralNibble() {
        long j4 = this.literal;
        if (j4 < -8 || j4 > 7) {
            throw new DexException("Literal out of range: " + Hex.u8(this.literal));
        }
        return ((int) j4) & 15;
    }

    public final short getLiteralUnit() {
        long j4 = this.literal;
        if (j4 == ((short) j4)) {
            return (short) j4;
        }
        throw new DexException("Literal out of range: " + Hex.u8(this.literal));
    }

    public final int getOpcode() {
        return this.opcode;
    }

    public final short getOpcodeUnit() {
        return (short) this.opcode;
    }

    public short getProtoIndex() {
        throw new IllegalStateException(getClass().toString());
    }

    public abstract int getRegisterCount();

    public final short getRegisterCountUnit() {
        int registerCount = getRegisterCount();
        if (((-65536) & registerCount) == 0) {
            return (short) registerCount;
        }
        throw new DexException("Register count out of range: " + Hex.u8(registerCount));
    }

    public final int getTarget() {
        return this.target;
    }

    public final int getTargetByte(int i4) {
        int target = getTarget(i4);
        if (target == ((byte) target)) {
            return target & 255;
        }
        throw new DexException("Target out of range: " + Hex.s4(target));
    }

    public final short getTargetUnit(int i4) {
        int target = getTarget(i4);
        short s4 = (short) target;
        if (target == s4) {
            return s4;
        }
        throw new DexException("Target out of range: " + Hex.s4(target));
    }

    public abstract DecodedInstruction withIndex(int i4);

    public DecodedInstruction withProtoIndex(int i4, int i5) {
        throw new IllegalStateException(getClass().toString());
    }

    public final int getTarget(int i4) {
        return this.target - i4;
    }
}
