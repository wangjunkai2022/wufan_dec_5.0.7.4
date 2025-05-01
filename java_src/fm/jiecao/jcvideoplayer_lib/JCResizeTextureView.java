package fm.jiecao.jcvideoplayer_lib;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
/* loaded from: classes6.dex */
public class JCResizeTextureView extends TextureView {

    /* renamed from: c  reason: collision with root package name */
    protected static final String f69006c = "JCResizeTextureView";

    /* renamed from: b  reason: collision with root package name */
    protected Point f69007b;

    public JCResizeTextureView(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.f69007b = new Point(0, 0);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        StringBuilder sb = new StringBuilder();
        sb.append("onMeasure  [");
        sb.append(hashCode());
        sb.append("] ");
        int rotation = (int) getRotation();
        Point point = this.f69007b;
        int i8 = point.x;
        int i9 = point.y;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("videoWidth = ");
        sb2.append(i8);
        sb2.append(", videoHeight = ");
        sb2.append(i9);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("viewRotation = ");
        sb3.append(rotation);
        if (rotation == 90 || rotation == 270) {
            i5 = i4;
            i4 = i5;
        }
        int defaultSize = TextureView.getDefaultSize(i8, i4);
        int defaultSize2 = TextureView.getDefaultSize(i9, i5);
        if (i8 > 0 && i9 > 0) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int size2 = View.MeasureSpec.getSize(i5);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("widthMeasureSpec  [");
            sb4.append(View.MeasureSpec.toString(i4));
            sb4.append("]");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("heightMeasureSpec [");
            sb5.append(View.MeasureSpec.toString(i5));
            sb5.append("]");
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i10 = i8 * size2;
                int i11 = size * i9;
                if (i10 < i11) {
                    defaultSize = i10 / i9;
                } else if (i10 > i11) {
                    i7 = i11 / i8;
                    defaultSize = size;
                    defaultSize2 = i7;
                } else {
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else if (mode == 1073741824) {
                i7 = (size * i9) / i8;
                if (mode2 == Integer.MIN_VALUE && i7 > size2) {
                    defaultSize = (i8 * size2) / i9;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = i7;
            } else if (mode2 == 1073741824) {
                i6 = (size2 * i8) / i9;
                if (mode == Integer.MIN_VALUE && i6 > size) {
                    i7 = (i9 * size) / i8;
                    defaultSize = size;
                    defaultSize2 = i7;
                }
                defaultSize = i6;
                defaultSize2 = size2;
            } else {
                if (mode2 != Integer.MIN_VALUE || i9 <= size2) {
                    size2 = i9;
                    i6 = i8;
                } else {
                    i6 = (size2 * i8) / i9;
                }
                if (mode == Integer.MIN_VALUE && i6 > size) {
                    i7 = (i9 * size) / i8;
                    defaultSize = size;
                    defaultSize2 = i7;
                }
                defaultSize = i6;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.view.View
    public void setRotation(float f5) {
        if (f5 != getRotation()) {
            super.setRotation(f5);
            requestLayout();
        }
    }

    public void setVideoSize(Point point) {
        if (point == null || this.f69007b.equals(point)) {
            return;
        }
        this.f69007b = point;
        requestLayout();
    }

    public JCResizeTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
