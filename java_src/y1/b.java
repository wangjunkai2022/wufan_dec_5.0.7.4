package y1;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
/* compiled from: ViewTarget.java */
/* loaded from: classes4.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private View f73598a;

    public b(View view) {
        this.f73598a = view;
    }

    @Override // y1.a
    public Point a() {
        int[] iArr = new int[2];
        this.f73598a.getLocationInWindow(iArr);
        return new Point(iArr[0] + (this.f73598a.getWidth() / 2), iArr[1] + (this.f73598a.getHeight() / 2));
    }

    @Override // y1.a
    public Rect b() {
        int[] iArr = new int[2];
        this.f73598a.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + this.f73598a.getWidth(), iArr[1]);
    }

    @Override // y1.a
    public int getHeight() {
        View view = this.f73598a;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    @Override // y1.a
    public View getView() {
        return this.f73598a;
    }
}
