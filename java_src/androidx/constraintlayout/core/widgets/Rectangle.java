package androidx.constraintlayout.core.widgets;
/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x  reason: collision with root package name */
    public int f62x;

    /* renamed from: y  reason: collision with root package name */
    public int f63y;

    public boolean contains(int i4, int i5) {
        int i6;
        int i7 = this.f62x;
        return i4 >= i7 && i4 < i7 + this.width && i5 >= (i6 = this.f63y) && i5 < i6 + this.height;
    }

    public int getCenterX() {
        return (this.f62x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f63y + this.height) / 2;
    }

    void grow(int i4, int i5) {
        this.f62x -= i4;
        this.f63y -= i5;
        this.width += i4 * 2;
        this.height += i5 * 2;
    }

    boolean intersects(Rectangle rectangle) {
        int i4;
        int i5;
        int i6 = this.f62x;
        int i7 = rectangle.f62x;
        return i6 >= i7 && i6 < i7 + rectangle.width && (i4 = this.f63y) >= (i5 = rectangle.f63y) && i4 < i5 + rectangle.height;
    }

    public void setBounds(int i4, int i5, int i6, int i7) {
        this.f62x = i4;
        this.f63y = i5;
        this.width = i6;
        this.height = i7;
    }
}
