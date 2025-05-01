package me.relex.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
/* loaded from: classes7.dex */
public class PhotoDraweeView extends SimpleDraweeView implements d {

    /* renamed from: b  reason: collision with root package name */
    private a f71557b;

    public PhotoDraweeView(Context context, com.facebook.drawee.generic.a aVar) {
        super(context, aVar);
        a();
    }

    protected void a() {
        a aVar = this.f71557b;
        if (aVar == null || aVar.r() == null) {
            this.f71557b = new a(this);
        }
    }

    @Override // me.relex.photodraweeview.d
    public float getMaximumScale() {
        return this.f71557b.getMaximumScale();
    }

    @Override // me.relex.photodraweeview.d
    public float getMediumScale() {
        return this.f71557b.getMediumScale();
    }

    @Override // me.relex.photodraweeview.d
    public float getMinimumScale() {
        return this.f71557b.getMinimumScale();
    }

    @Override // me.relex.photodraweeview.d
    public e getOnPhotoTapListener() {
        return this.f71557b.getOnPhotoTapListener();
    }

    @Override // me.relex.photodraweeview.d
    public h getOnViewTapListener() {
        return this.f71557b.getOnViewTapListener();
    }

    @Override // me.relex.photodraweeview.d
    public float getScale() {
        return this.f71557b.getScale();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        a();
        super.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.f71557b.v();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.f71557b.q());
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // me.relex.photodraweeview.d
    public void setAllowParentInterceptOnEdge(boolean z4) {
        this.f71557b.setAllowParentInterceptOnEdge(z4);
    }

    @Override // me.relex.photodraweeview.d
    public void setMaximumScale(float f5) {
        this.f71557b.setMaximumScale(f5);
    }

    @Override // me.relex.photodraweeview.d
    public void setMediumScale(float f5) {
        this.f71557b.setMediumScale(f5);
    }

    @Override // me.relex.photodraweeview.d
    public void setMinimumScale(float f5) {
        this.f71557b.setMinimumScale(f5);
    }

    @Override // me.relex.photodraweeview.d
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f71557b.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View, me.relex.photodraweeview.d
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f71557b.setOnLongClickListener(onLongClickListener);
    }

    @Override // me.relex.photodraweeview.d
    public void setOnPhotoTapListener(e eVar) {
        this.f71557b.setOnPhotoTapListener(eVar);
    }

    @Override // me.relex.photodraweeview.d
    public void setOnScaleChangeListener(f fVar) {
        this.f71557b.setOnScaleChangeListener(fVar);
    }

    @Override // me.relex.photodraweeview.d
    public void setOnViewTapListener(h hVar) {
        this.f71557b.setOnViewTapListener(hVar);
    }

    @Override // me.relex.photodraweeview.d
    public void setScale(float f5) {
        this.f71557b.setScale(f5);
    }

    @Override // me.relex.photodraweeview.d
    public void setZoomTransitionDuration(long j4) {
        this.f71557b.setZoomTransitionDuration(j4);
    }

    @Override // me.relex.photodraweeview.d
    public void update(int i4, int i5) {
        this.f71557b.update(i4, i5);
    }

    @Override // me.relex.photodraweeview.d
    public void setScale(float f5, boolean z4) {
        this.f71557b.setScale(f5, z4);
    }

    public PhotoDraweeView(Context context) {
        super(context);
        a();
    }

    @Override // me.relex.photodraweeview.d
    public void setScale(float f5, float f6, float f7, boolean z4) {
        this.f71557b.setScale(f5, f6, f7, z4);
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a();
    }
}
