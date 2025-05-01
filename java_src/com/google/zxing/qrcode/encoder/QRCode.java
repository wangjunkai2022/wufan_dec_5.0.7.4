package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
/* loaded from: classes3.dex */
public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;
    private Mode mode = null;
    private ErrorCorrectionLevel ecLevel = null;
    private int version = -1;
    private int matrixWidth = -1;
    private int maskPattern = -1;
    private int numTotalBytes = -1;
    private int numDataBytes = -1;
    private int numECBytes = -1;
    private int numRSBlocks = -1;
    private ByteMatrix matrix = null;

    public static boolean isValidMaskPattern(int i4) {
        return i4 >= 0 && i4 < 8;
    }

    public int at(int i4, int i5) {
        byte b5 = this.matrix.get(i4, i5);
        if (b5 == 0 || b5 == 1) {
            return b5;
        }
        throw new IllegalStateException("Bad value");
    }

    public ErrorCorrectionLevel getECLevel() {
        return this.ecLevel;
    }

    public int getMaskPattern() {
        return this.maskPattern;
    }

    public ByteMatrix getMatrix() {
        return this.matrix;
    }

    public int getMatrixWidth() {
        return this.matrixWidth;
    }

    public Mode getMode() {
        return this.mode;
    }

    public int getNumDataBytes() {
        return this.numDataBytes;
    }

    public int getNumECBytes() {
        return this.numECBytes;
    }

    public int getNumRSBlocks() {
        return this.numRSBlocks;
    }

    public int getNumTotalBytes() {
        return this.numTotalBytes;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isValid() {
        int i4;
        ByteMatrix byteMatrix;
        return (this.mode == null || this.ecLevel == null || this.version == -1 || this.matrixWidth == -1 || (i4 = this.maskPattern) == -1 || this.numTotalBytes == -1 || this.numDataBytes == -1 || this.numECBytes == -1 || this.numRSBlocks == -1 || !isValidMaskPattern(i4) || this.numTotalBytes != this.numDataBytes + this.numECBytes || (byteMatrix = this.matrix) == null || this.matrixWidth != byteMatrix.getWidth() || this.matrix.getWidth() != this.matrix.getHeight()) ? false : true;
    }

    public void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        this.ecLevel = errorCorrectionLevel;
    }

    public void setMaskPattern(int i4) {
        this.maskPattern = i4;
    }

    public void setMatrix(ByteMatrix byteMatrix) {
        this.matrix = byteMatrix;
    }

    public void setMatrixWidth(int i4) {
        this.matrixWidth = i4;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setNumDataBytes(int i4) {
        this.numDataBytes = i4;
    }

    public void setNumECBytes(int i4) {
        this.numECBytes = i4;
    }

    public void setNumRSBlocks(int i4) {
        this.numRSBlocks = i4;
    }

    public void setNumTotalBytes(int i4) {
        this.numTotalBytes = i4;
    }

    public void setVersion(int i4) {
        this.version = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.mode);
        sb.append("\n ecLevel: ");
        sb.append(this.ecLevel);
        sb.append("\n version: ");
        sb.append(this.version);
        sb.append("\n matrixWidth: ");
        sb.append(this.matrixWidth);
        sb.append("\n maskPattern: ");
        sb.append(this.maskPattern);
        sb.append("\n numTotalBytes: ");
        sb.append(this.numTotalBytes);
        sb.append("\n numDataBytes: ");
        sb.append(this.numDataBytes);
        sb.append("\n numECBytes: ");
        sb.append(this.numECBytes);
        sb.append("\n numRSBlocks: ");
        sb.append(this.numRSBlocks);
        if (this.matrix == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.matrix.toString());
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
