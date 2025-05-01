package me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
/* loaded from: classes7.dex */
class BaseCircleIndicator extends LinearLayout {

    /* renamed from: m  reason: collision with root package name */
    private static final int f71517m = 5;

    /* renamed from: b  reason: collision with root package name */
    protected int f71518b;

    /* renamed from: c  reason: collision with root package name */
    protected int f71519c;

    /* renamed from: d  reason: collision with root package name */
    protected int f71520d;

    /* renamed from: e  reason: collision with root package name */
    protected int f71521e;

    /* renamed from: f  reason: collision with root package name */
    protected int f71522f;

    /* renamed from: g  reason: collision with root package name */
    protected Animator f71523g;

    /* renamed from: h  reason: collision with root package name */
    protected Animator f71524h;

    /* renamed from: i  reason: collision with root package name */
    protected Animator f71525i;

    /* renamed from: j  reason: collision with root package name */
    protected Animator f71526j;

    /* renamed from: k  reason: collision with root package name */
    protected int f71527k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private a f71528l;

    /* loaded from: classes7.dex */
    public interface a {
        void a(View view, int i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes7.dex */
    public class b implements Interpolator {
        protected b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            return Math.abs(1.0f - f5);
        }
    }

    public BaseCircleIndicator(Context context) {
        super(context);
        this.f71518b = -1;
        this.f71519c = -1;
        this.f71520d = -1;
        this.f71527k = -1;
        g(context, null);
    }

    private me.relex.circleindicator.b f(Context context, AttributeSet attributeSet) {
        me.relex.circleindicator.b bVar = new me.relex.circleindicator.b();
        if (attributeSet == null) {
            return bVar;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BaseCircleIndicator);
        bVar.f71547a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.BaseCircleIndicator_ci_width, -1);
        bVar.f71548b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.BaseCircleIndicator_ci_height, -1);
        bVar.f71549c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.BaseCircleIndicator_ci_margin, -1);
        bVar.f71550d = obtainStyledAttributes.getResourceId(R.styleable.BaseCircleIndicator_ci_animator, R.animator.scale_with_alpha);
        bVar.f71551e = obtainStyledAttributes.getResourceId(R.styleable.BaseCircleIndicator_ci_animator_reverse, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.BaseCircleIndicator_ci_drawable, R.drawable.white_radius);
        bVar.f71552f = resourceId;
        bVar.f71553g = obtainStyledAttributes.getResourceId(R.styleable.BaseCircleIndicator_ci_drawable_unselected, resourceId);
        bVar.f71554h = obtainStyledAttributes.getInt(R.styleable.BaseCircleIndicator_ci_orientation, -1);
        bVar.f71555i = obtainStyledAttributes.getInt(R.styleable.BaseCircleIndicator_ci_gravity, -1);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    private void g(Context context, AttributeSet attributeSet) {
        h(f(context, attributeSet));
    }

    protected void a(int i4) {
        View view = new View(getContext());
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = this.f71519c;
        generateDefaultLayoutParams.height = this.f71520d;
        if (i4 == 0) {
            int i5 = this.f71518b;
            generateDefaultLayoutParams.leftMargin = i5;
            generateDefaultLayoutParams.rightMargin = i5;
        } else {
            int i6 = this.f71518b;
            generateDefaultLayoutParams.topMargin = i6;
            generateDefaultLayoutParams.bottomMargin = i6;
        }
        addView(view, generateDefaultLayoutParams);
    }

    public void b(int i4) {
        View childAt;
        if (this.f71527k == i4) {
            return;
        }
        if (this.f71524h.isRunning()) {
            this.f71524h.end();
            this.f71524h.cancel();
        }
        if (this.f71523g.isRunning()) {
            this.f71523g.end();
            this.f71523g.cancel();
        }
        int i5 = this.f71527k;
        if (i5 >= 0 && (childAt = getChildAt(i5)) != null) {
            childAt.setBackgroundResource(this.f71522f);
            this.f71524h.setTarget(childAt);
            this.f71524h.start();
        }
        View childAt2 = getChildAt(i4);
        if (childAt2 != null) {
            childAt2.setBackgroundResource(this.f71521e);
            this.f71523g.setTarget(childAt2);
            this.f71523g.start();
        }
        this.f71527k = i4;
    }

    protected Animator c(me.relex.circleindicator.b bVar) {
        if (bVar.f71551e == 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), bVar.f71550d);
            loadAnimator.setInterpolator(new b());
            return loadAnimator;
        }
        return AnimatorInflater.loadAnimator(getContext(), bVar.f71551e);
    }

    protected Animator d(me.relex.circleindicator.b bVar) {
        return AnimatorInflater.loadAnimator(getContext(), bVar.f71550d);
    }

    public void e(int i4, int i5) {
        if (this.f71525i.isRunning()) {
            this.f71525i.end();
            this.f71525i.cancel();
        }
        if (this.f71526j.isRunning()) {
            this.f71526j.end();
            this.f71526j.cancel();
        }
        int childCount = getChildCount();
        if (i4 < childCount) {
            removeViews(i4, childCount - i4);
        } else if (i4 > childCount) {
            int i6 = i4 - childCount;
            int orientation = getOrientation();
            for (int i7 = 0; i7 < i6; i7++) {
                a(orientation);
            }
        }
        for (int i8 = 0; i8 < i4; i8++) {
            View childAt = getChildAt(i8);
            if (i5 == i8) {
                childAt.setBackgroundResource(this.f71521e);
                this.f71525i.setTarget(childAt);
                this.f71525i.start();
                this.f71525i.end();
            } else {
                childAt.setBackgroundResource(this.f71522f);
                this.f71526j.setTarget(childAt);
                this.f71526j.start();
                this.f71526j.end();
            }
            a aVar = this.f71528l;
            if (aVar != null) {
                aVar.a(childAt, i8);
            }
        }
        this.f71527k = i5;
    }

    public void h(me.relex.circleindicator.b bVar) {
        int applyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i4 = bVar.f71547a;
        if (i4 < 0) {
            i4 = applyDimension;
        }
        this.f71519c = i4;
        int i5 = bVar.f71548b;
        if (i5 < 0) {
            i5 = applyDimension;
        }
        this.f71520d = i5;
        int i6 = bVar.f71549c;
        if (i6 >= 0) {
            applyDimension = i6;
        }
        this.f71518b = applyDimension;
        this.f71523g = d(bVar);
        Animator d5 = d(bVar);
        this.f71525i = d5;
        d5.setDuration(0L);
        this.f71524h = c(bVar);
        Animator c5 = c(bVar);
        this.f71526j = c5;
        c5.setDuration(0L);
        int i7 = bVar.f71552f;
        this.f71521e = i7 == 0 ? R.drawable.white_radius : i7;
        int i8 = bVar.f71553g;
        if (i8 != 0) {
            i7 = i8;
        }
        this.f71522f = i7;
        setOrientation(bVar.f71554h != 1 ? 0 : 1);
        int i9 = bVar.f71555i;
        if (i9 < 0) {
            i9 = 17;
        }
        setGravity(i9);
    }

    public void setIndicatorCreatedListener(@Nullable a aVar) {
        this.f71528l = aVar;
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71518b = -1;
        this.f71519c = -1;
        this.f71520d = -1;
        this.f71527k = -1;
        g(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f71518b = -1;
        this.f71519c = -1;
        this.f71520d = -1;
        this.f71527k = -1;
        g(context, attributeSet);
    }

    @TargetApi(21)
    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f71518b = -1;
        this.f71519c = -1;
        this.f71520d = -1;
        this.f71527k = -1;
        g(context, attributeSet);
    }
}
