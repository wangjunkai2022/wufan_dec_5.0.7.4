package com.google.zxing.oned.rss.expanded.decoders;

import com.android.dx.io.Opcodes;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.papa.controller.core.hardware.a;
import external.org.apache.commons.lang3.d;
import io.netty.util.internal.StringUtil;
import kotlin.text.Typography;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class GeneralAppIdDecoder {
    private final BitArray information;
    private final CurrentParsingState current = new CurrentParsingState();
    private final StringBuilder buffer = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeneralAppIdDecoder(BitArray bitArray) {
        this.information = bitArray;
    }

    private DecodedChar decodeAlphanumeric(int i4) {
        char c5;
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i4, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new DecodedChar(i4 + 5, '$');
        }
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new DecodedChar(i4 + 5, (char) ((extractNumericValueFromBitArray + 48) - 5));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i4, 6);
        if (extractNumericValueFromBitArray2 >= 32 && extractNumericValueFromBitArray2 < 58) {
            return new DecodedChar(i4 + 6, (char) (extractNumericValueFromBitArray2 + 33));
        }
        switch (extractNumericValueFromBitArray2) {
            case 58:
                c5 = '*';
                break;
            case 59:
                c5 = StringUtil.COMMA;
                break;
            case 60:
                c5 = '-';
                break;
            case 61:
                c5 = d.f68897a;
                break;
            case 62:
                c5 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + extractNumericValueFromBitArray2);
        }
        return new DecodedChar(i4 + 6, c5);
    }

    private DecodedChar decodeIsoIec646(int i4) {
        char c5;
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i4, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new DecodedChar(i4 + 5, '$');
        }
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new DecodedChar(i4 + 5, (char) ((extractNumericValueFromBitArray + 48) - 5));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i4, 7);
        if (extractNumericValueFromBitArray2 < 64 || extractNumericValueFromBitArray2 >= 90) {
            if (extractNumericValueFromBitArray2 >= 90 && extractNumericValueFromBitArray2 < 116) {
                return new DecodedChar(i4 + 7, (char) (extractNumericValueFromBitArray2 + 7));
            }
            int extractNumericValueFromBitArray3 = extractNumericValueFromBitArray(i4, 8);
            switch (extractNumericValueFromBitArray3) {
                case 232:
                    c5 = '!';
                    break;
                case 233:
                    c5 = '\"';
                    break;
                case 234:
                    c5 = '%';
                    break;
                case 235:
                    c5 = Typography.amp;
                    break;
                case 236:
                    c5 = '\'';
                    break;
                case 237:
                    c5 = '(';
                    break;
                case 238:
                    c5 = ')';
                    break;
                case 239:
                    c5 = '*';
                    break;
                case 240:
                    c5 = '+';
                    break;
                case 241:
                    c5 = StringUtil.COMMA;
                    break;
                case 242:
                    c5 = '-';
                    break;
                case 243:
                    c5 = d.f68897a;
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                    c5 = '/';
                    break;
                case 245:
                    c5 = ':';
                    break;
                case a.f58131m /* 246 */:
                    c5 = ';';
                    break;
                case 247:
                    c5 = Typography.less;
                    break;
                case 248:
                    c5 = '=';
                    break;
                case 249:
                    c5 = Typography.greater;
                    break;
                case 250:
                    c5 = '?';
                    break;
                case Opcodes.INVOKE_POLYMORPHIC_RANGE /* 251 */:
                    c5 = '_';
                    break;
                case Opcodes.INVOKE_CUSTOM /* 252 */:
                    c5 = ' ';
                    break;
                default:
                    throw new IllegalArgumentException("Decoding invalid ISO/IEC 646 value: " + extractNumericValueFromBitArray3);
            }
            return new DecodedChar(i4 + 8, c5);
        }
        return new DecodedChar(i4 + 7, (char) (extractNumericValueFromBitArray2 + 1));
    }

    private DecodedNumeric decodeNumeric(int i4) {
        int i5 = i4 + 7;
        if (i5 > this.information.getSize()) {
            int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i4, 4);
            if (extractNumericValueFromBitArray == 0) {
                return new DecodedNumeric(this.information.getSize(), 10, 10);
            }
            return new DecodedNumeric(this.information.getSize(), extractNumericValueFromBitArray - 1, 10);
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i4, 7) - 8;
        return new DecodedNumeric(i5, extractNumericValueFromBitArray2 / 11, extractNumericValueFromBitArray2 % 11);
    }

    private boolean isAlphaOr646ToNumericLatch(int i4) {
        int i5 = i4 + 3;
        if (i5 > this.information.getSize()) {
            return false;
        }
        while (i4 < i5) {
            if (this.information.get(i4)) {
                return false;
            }
            i4++;
        }
        return true;
    }

    private boolean isAlphaTo646ToAlphaLatch(int i4) {
        int i5;
        if (i4 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i6 = 0; i6 < 5 && (i5 = i6 + i4) < this.information.getSize(); i6++) {
            if (i6 == 2) {
                if (!this.information.get(i4 + 2)) {
                    return false;
                }
            } else if (this.information.get(i5)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int i4) {
        int i5;
        if (i4 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i6 = 0; i6 < 4 && (i5 = i6 + i4) < this.information.getSize(); i6++) {
            if (this.information.get(i5)) {
                return false;
            }
        }
        return true;
    }

    private boolean isStillAlpha(int i4) {
        int extractNumericValueFromBitArray;
        if (i4 + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i4, 5);
        if (extractNumericValueFromBitArray2 < 5 || extractNumericValueFromBitArray2 >= 16) {
            return i4 + 6 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i4, 6)) >= 16 && extractNumericValueFromBitArray < 63;
        }
        return true;
    }

    private boolean isStillIsoIec646(int i4) {
        int extractNumericValueFromBitArray;
        if (i4 + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i4, 5);
        if (extractNumericValueFromBitArray2 < 5 || extractNumericValueFromBitArray2 >= 16) {
            if (i4 + 7 > this.information.getSize()) {
                return false;
            }
            int extractNumericValueFromBitArray3 = extractNumericValueFromBitArray(i4, 7);
            if (extractNumericValueFromBitArray3 < 64 || extractNumericValueFromBitArray3 >= 116) {
                return i4 + 8 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i4, 8)) >= 232 && extractNumericValueFromBitArray < 253;
            }
            return true;
        }
        return true;
    }

    private boolean isStillNumeric(int i4) {
        if (i4 + 7 > this.information.getSize()) {
            return i4 + 4 <= this.information.getSize();
        }
        int i5 = i4;
        while (true) {
            int i6 = i4 + 3;
            if (i5 < i6) {
                if (this.information.get(i5)) {
                    return true;
                }
                i5++;
            } else {
                return this.information.get(i6);
            }
        }
    }

    private BlockParsedResult parseAlphaBlock() {
        while (isStillAlpha(this.current.getPosition())) {
            DecodedChar decodeAlphanumeric = decodeAlphanumeric(this.current.getPosition());
            this.current.setPosition(decodeAlphanumeric.getNewPosition());
            if (decodeAlphanumeric.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeAlphanumeric.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setIsoIec646();
        }
        return new BlockParsedResult(false);
    }

    private DecodedInformation parseBlocks() {
        BlockParsedResult parseNumericBlock;
        boolean isFinished;
        do {
            int position = this.current.getPosition();
            if (this.current.isAlpha()) {
                parseNumericBlock = parseAlphaBlock();
                isFinished = parseNumericBlock.isFinished();
            } else if (this.current.isIsoIec646()) {
                parseNumericBlock = parseIsoIec646Block();
                isFinished = parseNumericBlock.isFinished();
            } else {
                parseNumericBlock = parseNumericBlock();
                isFinished = parseNumericBlock.isFinished();
            }
            if (!(position != this.current.getPosition()) && !isFinished) {
                break;
            }
        } while (!isFinished);
        return parseNumericBlock.getDecodedInformation();
    }

    private BlockParsedResult parseIsoIec646Block() {
        while (isStillIsoIec646(this.current.getPosition())) {
            DecodedChar decodeIsoIec646 = decodeIsoIec646(this.current.getPosition());
            this.current.setPosition(decodeIsoIec646.getNewPosition());
            if (decodeIsoIec646.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeIsoIec646.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setAlpha();
        }
        return new BlockParsedResult(false);
    }

    private BlockParsedResult parseNumericBlock() {
        DecodedInformation decodedInformation;
        while (isStillNumeric(this.current.getPosition())) {
            DecodedNumeric decodeNumeric = decodeNumeric(this.current.getPosition());
            this.current.setPosition(decodeNumeric.getNewPosition());
            if (decodeNumeric.isFirstDigitFNC1()) {
                if (decodeNumeric.isSecondDigitFNC1()) {
                    decodedInformation = new DecodedInformation(this.current.getPosition(), this.buffer.toString());
                } else {
                    decodedInformation = new DecodedInformation(this.current.getPosition(), this.buffer.toString(), decodeNumeric.getSecondDigit());
                }
                return new BlockParsedResult(decodedInformation, true);
            }
            this.buffer.append(decodeNumeric.getFirstDigit());
            if (decodeNumeric.isSecondDigitFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeNumeric.getSecondDigit());
        }
        if (isNumericToAlphaNumericLatch(this.current.getPosition())) {
            this.current.setAlpha();
            this.current.incrementPosition(4);
        }
        return new BlockParsedResult(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String decodeAllCodes(StringBuilder sb, int i4) throws NotFoundException {
        String str = null;
        while (true) {
            DecodedInformation decodeGeneralPurposeField = decodeGeneralPurposeField(i4, str);
            String parseFieldsInGeneralPurpose = FieldParser.parseFieldsInGeneralPurpose(decodeGeneralPurposeField.getNewString());
            if (parseFieldsInGeneralPurpose != null) {
                sb.append(parseFieldsInGeneralPurpose);
            }
            String valueOf = decodeGeneralPurposeField.isRemaining() ? String.valueOf(decodeGeneralPurposeField.getRemainingValue()) : null;
            if (i4 == decodeGeneralPurposeField.getNewPosition()) {
                return sb.toString();
            }
            i4 = decodeGeneralPurposeField.getNewPosition();
            str = valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecodedInformation decodeGeneralPurposeField(int i4, String str) {
        this.buffer.setLength(0);
        if (str != null) {
            this.buffer.append(str);
        }
        this.current.setPosition(i4);
        DecodedInformation parseBlocks = parseBlocks();
        if (parseBlocks != null && parseBlocks.isRemaining()) {
            return new DecodedInformation(this.current.getPosition(), this.buffer.toString(), parseBlocks.getRemainingValue());
        }
        return new DecodedInformation(this.current.getPosition(), this.buffer.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int extractNumericValueFromBitArray(int i4, int i5) {
        return extractNumericValueFromBitArray(this.information, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int extractNumericValueFromBitArray(BitArray bitArray, int i4, int i5) {
        if (i5 <= 32) {
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                if (bitArray.get(i4 + i7)) {
                    i6 |= 1 << ((i5 - i7) - 1);
                }
            }
            return i6;
        }
        throw new IllegalArgumentException("extractNumberValueFromBitArray can't handle more than 32 bits");
    }
}
