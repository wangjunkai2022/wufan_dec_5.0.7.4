package com.kwad.sdk.pngencrypt;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes5.dex */
public class DeflatedChunksSet {
    protected byte[] aLN;
    private int aLO;
    private int aLP;
    private int aLQ;
    State aLR;
    private final boolean aLS;
    private d aLT;
    private long aLU;
    private long aLV;
    int aLW;
    int aLX;
    public final String aLY;
    protected final boolean aLx;
    private Inflater inf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum State {
        WAITING_FOR_INPUT,
        ROW_READY,
        DONE,
        CLOSED;

        public final boolean isClosed() {
            return this == CLOSED;
        }

        public final boolean isDone() {
            return this == DONE || this == CLOSED;
        }
    }

    public DeflatedChunksSet(String str, boolean z4, int i4, int i5, Inflater inflater, byte[] bArr) {
        State state = State.WAITING_FOR_INPUT;
        this.aLR = state;
        this.aLU = 0L;
        this.aLV = 0L;
        this.aLW = -1;
        this.aLX = -1;
        this.aLY = str;
        this.aLx = z4;
        this.aLP = i4;
        if (i4 > 0 && i5 >= i4) {
            if (inflater != null) {
                this.inf = inflater;
                this.aLS = false;
            } else {
                this.inf = new Inflater();
                this.aLS = true;
            }
            this.aLN = (bArr == null || bArr.length < i4) ? new byte[i5] : bArr;
            this.aLQ = -1;
            this.aLR = state;
            try {
                dE(i4);
                return;
            } catch (RuntimeException e5) {
                close();
                throw e5;
            }
        }
        throw new PngjException("bad inital row len " + i4);
    }

    private boolean Ku() {
        State state;
        int i4;
        try {
            if (this.aLR == State.ROW_READY) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("invalid state"));
            }
            if (this.aLR.isDone()) {
                return false;
            }
            byte[] bArr = this.aLN;
            if (bArr == null || bArr.length < this.aLP) {
                this.aLN = new byte[this.aLP];
            }
            if (this.aLO < this.aLP && !this.inf.finished()) {
                try {
                    Inflater inflater = this.inf;
                    byte[] bArr2 = this.aLN;
                    int i5 = this.aLO;
                    i4 = inflater.inflate(bArr2, i5, this.aLP - i5);
                } catch (DataFormatException e5) {
                    com.kwad.sdk.core.e.c.printStackTrace(new PngjException("error decompressing zlib stream ", e5));
                    i4 = 0;
                }
                this.aLO += i4;
                this.aLV += i4;
            }
            if (this.aLO == this.aLP) {
                state = State.ROW_READY;
            } else if (!this.inf.finished()) {
                state = State.WAITING_FOR_INPUT;
            } else if (this.aLO > 0) {
                state = State.ROW_READY;
            } else {
                state = State.DONE;
            }
            this.aLR = state;
            if (state == State.ROW_READY) {
                Kv();
                return true;
            }
            return false;
        } catch (RuntimeException e6) {
            close();
            throw e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Kv() {
    }

    protected int Kw() {
        throw new PngjException("not implemented");
    }

    public final void Kx() {
        if (isDone()) {
            return;
        }
        this.aLR = State.DONE;
    }

    public final int Ky() {
        return this.aLQ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(d dVar) {
        if (!this.aLY.equals(dVar.Kh().ahY)) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad chunk inside IdatSet, id:" + dVar.Kh().ahY + ", expected:" + this.aLY));
        }
        this.aLT = dVar;
        int i4 = this.aLW + 1;
        this.aLW = i4;
        int i5 = this.aLX;
        if (i5 >= 0) {
            dVar.dD(i4 + i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(byte[] bArr, int i4, int i5) {
        this.aLU += i5;
        if (i5 <= 0 || this.aLR.isDone()) {
            return;
        }
        if (this.aLR == State.ROW_READY) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("this should only be called if waitingForMoreInput"));
        }
        if (!this.inf.needsDictionary() && this.inf.needsInput()) {
            this.inf.setInput(bArr, i4, i5);
            if (this.aLx) {
                while (Ku()) {
                    dE(Kw());
                    isDone();
                }
                return;
            }
            Ku();
            return;
        }
        throw new RuntimeException("should not happen");
    }

    public void close() {
        Inflater inflater;
        try {
            if (!this.aLR.isClosed()) {
                this.aLR = State.CLOSED;
            }
            if (!this.aLS || (inflater = this.inf) == null) {
                return;
            }
            inflater.end();
            this.inf = null;
        } catch (Exception unused) {
        }
    }

    public final void dE(int i4) {
        this.aLO = 0;
        this.aLQ++;
        if (i4 <= 0) {
            this.aLP = 0;
            Kx();
        } else if (this.inf.finished()) {
            this.aLP = 0;
            Kx();
        } else {
            this.aLR = State.WAITING_FOR_INPUT;
            this.aLP = i4;
            if (this.aLx) {
                return;
            }
            Ku();
        }
    }

    public final boolean gq(String str) {
        if (this.aLR.isClosed()) {
            return false;
        }
        if (str.equals(this.aLY)) {
            return true;
        }
        if (this.aLR.isDone()) {
            if (!this.aLR.isClosed()) {
                close();
            }
            return false;
        }
        throw new PngjException("Unexpected chunk " + str + " while " + this.aLY + " set is not done");
    }

    public final boolean isClosed() {
        return this.aLR.isClosed();
    }

    public final boolean isDone() {
        return this.aLR.isDone();
    }

    public String toString() {
        return new StringBuilder("idatSet : " + this.aLT.Kh().ahY + " state=" + this.aLR + " rows=" + this.aLQ + " bytes=" + this.aLU + net.lingala.zip4j.util.e.F0 + this.aLV).toString();
    }
}
