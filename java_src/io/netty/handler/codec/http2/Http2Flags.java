package io.netty.handler.codec.http2;
/* loaded from: classes6.dex */
public final class Http2Flags {
    public static final short ACK = 1;
    public static final short END_HEADERS = 4;
    public static final short END_STREAM = 1;
    public static final short PADDED = 8;
    public static final short PRIORITY = 32;
    private short value;

    public Http2Flags() {
    }

    public boolean ack() {
        return isFlagSet((short) 1);
    }

    public boolean endOfHeaders() {
        return isFlagSet((short) 4);
    }

    public boolean endOfStream() {
        return isFlagSet((short) 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Http2Flags.class == obj.getClass() && this.value == ((Http2Flags) obj).value;
    }

    public int getNumPriorityBytes() {
        return priorityPresent() ? 5 : 0;
    }

    public int getPaddingPresenceFieldLength() {
        return paddingPresent() ? 1 : 0;
    }

    public int hashCode() {
        return 31 + this.value;
    }

    public boolean isFlagSet(short s4) {
        return (s4 & this.value) != 0;
    }

    public boolean paddingPresent() {
        return isFlagSet((short) 8);
    }

    public boolean priorityPresent() {
        return isFlagSet((short) 32);
    }

    public Http2Flags setFlag(boolean z4, short s4) {
        if (z4) {
            this.value = (short) (this.value | s4);
        } else {
            this.value = (short) (this.value & (s4 ^ (-1)));
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("value = ");
        sb.append((int) this.value);
        sb.append(" (");
        if (ack()) {
            sb.append("ACK,");
        }
        if (endOfHeaders()) {
            sb.append("END_OF_HEADERS,");
        }
        if (endOfStream()) {
            sb.append("END_OF_STREAM,");
        }
        if (priorityPresent()) {
            sb.append("PRIORITY_PRESENT,");
        }
        if (paddingPresent()) {
            sb.append("PADDING_PRESENT,");
        }
        sb.append(')');
        return sb.toString();
    }

    public short value() {
        return this.value;
    }

    public Http2Flags(short s4) {
        this.value = s4;
    }

    public Http2Flags ack(boolean z4) {
        return setFlag(z4, (short) 1);
    }

    public Http2Flags endOfHeaders(boolean z4) {
        return setFlag(z4, (short) 4);
    }

    public Http2Flags endOfStream(boolean z4) {
        return setFlag(z4, (short) 1);
    }

    public Http2Flags paddingPresent(boolean z4) {
        return setFlag(z4, (short) 8);
    }

    public Http2Flags priorityPresent(boolean z4) {
        return setFlag(z4, (short) 32);
    }
}
