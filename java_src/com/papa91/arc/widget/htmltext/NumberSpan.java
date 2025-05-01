package com.papa91.arc.widget.htmltext;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.join.mgps.Util.h0;
/* loaded from: classes5.dex */
public class NumberSpan extends BulletSpan {
    public static final int STANDARD_GAP_WIDTH = 10;
    private final String mNumber;
    private final int mNumberGapWidth;

    public NumberSpan(int i4, int i5) {
        this.mNumberGapWidth = i4;
        this.mNumber = Integer.toString(i5).concat(h0.f27805a);
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@NonNull Canvas canvas, @NonNull Paint paint, int i4, int i5, int i6, int i7, int i8, @NonNull CharSequence charSequence, int i9, int i10, boolean z4, @Nullable Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i9) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                canvas.drawText(this.mNumber, i4 + i5, i7, paint);
                canvas.restore();
            } else {
                canvas.drawText(this.mNumber, i4 + i5, (i6 + i8) / 2.0f, paint);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        return this.mNumberGapWidth + 20;
    }

    @Override // android.text.style.BulletSpan, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.mNumberGapWidth);
        parcel.writeString(this.mNumber);
    }

    public NumberSpan(int i4) {
        this(10, i4);
    }

    public NumberSpan(Parcel parcel) {
        super(parcel);
        this.mNumberGapWidth = parcel.readInt();
        this.mNumber = parcel.readString();
    }
}
