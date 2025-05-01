package me.relex.photodraweeview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.drawee.view.DraweeView;
/* compiled from: DefaultOnDoubleTapListener.java */
/* loaded from: classes7.dex */
public class c implements GestureDetector.OnDoubleTapListener {

    /* renamed from: b  reason: collision with root package name */
    private a f71600b;

    public c(a aVar) {
        a(aVar);
    }

    public void a(a aVar) {
        this.f71600b = aVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        a aVar = this.f71600b;
        if (aVar == null) {
            return false;
        }
        try {
            float scale = aVar.getScale();
            float x4 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (scale < this.f71600b.getMediumScale()) {
                a aVar2 = this.f71600b;
                aVar2.setScale(aVar2.getMediumScale(), x4, y2, true);
            } else if (scale >= this.f71600b.getMediumScale() && scale < this.f71600b.getMaximumScale()) {
                a aVar3 = this.f71600b;
                aVar3.setScale(aVar3.getMaximumScale(), x4, y2, true);
            } else {
                a aVar4 = this.f71600b;
                aVar4.setScale(aVar4.getMinimumScale(), x4, y2, true);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DraweeView<com.facebook.drawee.generic.a> r4;
        RectF o4;
        a aVar = this.f71600b;
        if (aVar == null || (r4 = aVar.r()) == null) {
            return false;
        }
        if (this.f71600b.getOnPhotoTapListener() != null && (o4 = this.f71600b.o()) != null) {
            float x4 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (o4.contains(x4, y2)) {
                this.f71600b.getOnPhotoTapListener().a(r4, (x4 - o4.left) / o4.width(), (y2 - o4.top) / o4.height());
                return true;
            }
        }
        if (this.f71600b.getOnViewTapListener() != null) {
            this.f71600b.getOnViewTapListener().a(r4, motionEvent.getX(), motionEvent.getY());
            return true;
        }
        return false;
    }
}
