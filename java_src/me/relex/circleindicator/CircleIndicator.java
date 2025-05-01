package me.relex.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.Objects;
import me.relex.circleindicator.BaseCircleIndicator;
/* loaded from: classes7.dex */
public class CircleIndicator extends BaseCircleIndicator {

    /* renamed from: n  reason: collision with root package name */
    private ViewPager f71530n;

    /* renamed from: o  reason: collision with root package name */
    private final ViewPager.OnPageChangeListener f71531o;

    /* renamed from: p  reason: collision with root package name */
    private final DataSetObserver f71532p;

    /* loaded from: classes7.dex */
    class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (CircleIndicator.this.f71530n.getAdapter() == null || CircleIndicator.this.f71530n.getAdapter().getCount() <= 0) {
                return;
            }
            CircleIndicator.this.b(i4);
        }
    }

    /* loaded from: classes7.dex */
    class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator.this.f71530n == null) {
                return;
            }
            PagerAdapter adapter = CircleIndicator.this.f71530n.getAdapter();
            int count = adapter != null ? adapter.getCount() : 0;
            if (count == CircleIndicator.this.getChildCount()) {
                return;
            }
            CircleIndicator circleIndicator = CircleIndicator.this;
            if (circleIndicator.f71527k < count) {
                circleIndicator.f71527k = circleIndicator.f71530n.getCurrentItem();
            } else {
                circleIndicator.f71527k = -1;
            }
            CircleIndicator.this.k();
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        this.f71531o = new a();
        this.f71532p = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        PagerAdapter adapter = this.f71530n.getAdapter();
        e(adapter == null ? 0 : adapter.getCount(), this.f71530n.getCurrentItem());
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void b(int i4) {
        super.b(i4);
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void e(int i4, int i5) {
        super.e(i4, i5);
    }

    public DataSetObserver getDataSetObserver() {
        return this.f71532p;
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void h(me.relex.circleindicator.b bVar) {
        super.h(bVar);
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.a aVar) {
        super.setIndicatorCreatedListener(aVar);
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ViewPager viewPager = this.f71530n;
        Objects.requireNonNull(viewPager, "can not find Viewpager , setViewPager first");
        viewPager.removeOnPageChangeListener(onPageChangeListener);
        this.f71530n.addOnPageChangeListener(onPageChangeListener);
    }

    public void setViewPager(@Nullable ViewPager viewPager) {
        this.f71530n = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f71527k = -1;
        k();
        this.f71530n.removeOnPageChangeListener(this.f71531o);
        this.f71530n.addOnPageChangeListener(this.f71531o);
        this.f71531o.onPageSelected(this.f71530n.getCurrentItem());
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71531o = new a();
        this.f71532p = new b();
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f71531o = new a();
        this.f71532p = new b();
    }

    @TargetApi(21)
    public CircleIndicator(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f71531o = new a();
        this.f71532p = new b();
    }
}
