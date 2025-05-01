package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i4, int i5) {
        boolean z4;
        float f5;
        float f6;
        try {
            Result decode = this.delegate.decode(binaryBitmap, map);
            Iterator<Result> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().getText().equals(decode.getText())) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                return;
            }
            list.add(translateResultPoints(decode, i4, i5));
            ResultPoint[] resultPoints = decode.getResultPoints();
            if (resultPoints == null || resultPoints.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f7 = width;
            float f8 = 0.0f;
            float f9 = height;
            float f10 = 0.0f;
            for (ResultPoint resultPoint : resultPoints) {
                float x4 = resultPoint.getX();
                float y2 = resultPoint.getY();
                if (x4 < f7) {
                    f7 = x4;
                }
                if (y2 < f9) {
                    f9 = y2;
                }
                if (x4 > f10) {
                    f10 = x4;
                }
                if (y2 > f8) {
                    f8 = y2;
                }
            }
            if (f7 > 100.0f) {
                f5 = f8;
                f6 = f10;
                doDecodeMultiple(binaryBitmap.crop(0, 0, (int) f7, height), map, list, i4, i5);
            } else {
                f5 = f8;
                f6 = f10;
            }
            if (f9 > 100.0f) {
                doDecodeMultiple(binaryBitmap.crop(0, 0, width, (int) f9), map, list, i4, i5);
            }
            float f11 = f6;
            if (f11 < width - 100) {
                int i6 = (int) f11;
                doDecodeMultiple(binaryBitmap.crop(i6, 0, width - i6, height), map, list, i4 + i6, i5);
            }
            float f12 = f5;
            if (f12 < height - 100) {
                int i7 = (int) f12;
                doDecodeMultiple(binaryBitmap.crop(0, i7, width, height - i7), map, list, i4, i5 + i7);
            }
        } catch (ReaderException unused) {
        }
    }

    private static Result translateResultPoints(Result result, int i4, int i5) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i6 = 0; i6 < resultPoints.length; i6++) {
            ResultPoint resultPoint = resultPoints[i6];
            resultPointArr[i6] = new ResultPoint(resultPoint.getX() + i4, resultPoint.getY() + i5);
        }
        return new Result(result.getText(), result.getRawBytes(), resultPointArr, result.getBarcodeFormat());
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0);
        if (!arrayList.isEmpty()) {
            return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
