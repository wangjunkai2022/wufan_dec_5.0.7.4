package com.kwad.sdk.core.imageloader.core.assist;
/* loaded from: classes5.dex */
public class ImageSize {
    private static final String SEPARATOR = "x";
    private static final int TO_STRING_MAX_LENGHT = 9;
    private final int height;
    private final int width;

    public ImageSize(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public ImageSize scale(float f5) {
        return new ImageSize((int) (this.width * f5), (int) (this.height * f5));
    }

    public ImageSize scaleDown(int i4) {
        return new ImageSize(this.width / i4, this.height / i4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(9);
        sb.append(this.width);
        sb.append(SEPARATOR);
        sb.append(this.height);
        return sb.toString();
    }

    public ImageSize(int i4, int i5, int i6) {
        if (i6 % 180 == 0) {
            this.width = i4;
            this.height = i5;
            return;
        }
        this.width = i5;
        this.height = i4;
    }
}
