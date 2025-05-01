package me.relex.circleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import me.relex.circleindicator.BaseCircleIndicator;
/* loaded from: classes7.dex */
public class CircleIndicator2 extends BaseCircleIndicator {

    /* renamed from: n  reason: collision with root package name */
    private RecyclerView f71535n;

    /* renamed from: o  reason: collision with root package name */
    private SnapHelper f71536o;

    /* renamed from: p  reason: collision with root package name */
    private final RecyclerView.OnScrollListener f71537p;

    /* renamed from: q  reason: collision with root package name */
    private final RecyclerView.AdapterDataObserver f71538q;

    /* loaded from: classes7.dex */
    class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            int m4 = CircleIndicator2.this.m(recyclerView.getLayoutManager());
            if (m4 == -1) {
                return;
            }
            CircleIndicator2.this.b(m4);
        }
    }

    public CircleIndicator2(Context context) {
        super(context);
        this.f71537p = new a();
        this.f71538q = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        RecyclerView.Adapter adapter = this.f71535n.getAdapter();
        e(adapter == null ? 0 : adapter.getItemCount(), m(this.f71535n.getLayoutManager()));
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void b(int i4) {
        super.b(i4);
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void e(int i4, int i5) {
        super.e(i4, i5);
    }

    public RecyclerView.AdapterDataObserver getAdapterDataObserver() {
        return this.f71538q;
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void h(me.relex.circleindicator.b bVar) {
        super.h(bVar);
    }

    public void k(@NonNull RecyclerView recyclerView, @NonNull SnapHelper snapHelper) {
        this.f71535n = recyclerView;
        this.f71536o = snapHelper;
        this.f71527k = -1;
        l();
        recyclerView.removeOnScrollListener(this.f71537p);
        recyclerView.addOnScrollListener(this.f71537p);
    }

    public int m(@Nullable RecyclerView.LayoutManager layoutManager) {
        View findSnapView;
        if (layoutManager == null || (findSnapView = this.f71536o.findSnapView(layoutManager)) == null) {
            return -1;
        }
        return layoutManager.getPosition(findSnapView);
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.a aVar) {
        super.setIndicatorCreatedListener(aVar);
    }

    /* loaded from: classes7.dex */
    class b extends RecyclerView.AdapterDataObserver {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator2.this.f71535n == null) {
                return;
            }
            RecyclerView.Adapter adapter = CircleIndicator2.this.f71535n.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == CircleIndicator2.this.getChildCount()) {
                return;
            }
            CircleIndicator2 circleIndicator2 = CircleIndicator2.this;
            if (circleIndicator2.f71527k < itemCount) {
                circleIndicator2.f71527k = circleIndicator2.m(circleIndicator2.f71535n.getLayoutManager());
            } else {
                circleIndicator2.f71527k = -1;
            }
            CircleIndicator2.this.l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5) {
            super.onItemRangeChanged(i4, i5);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i4, int i5) {
            super.onItemRangeInserted(i4, i5);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i4, int i5, int i6) {
            super.onItemRangeMoved(i4, i5, i6);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i4, int i5) {
            super.onItemRangeRemoved(i4, i5);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5, @Nullable Object obj) {
            super.onItemRangeChanged(i4, i5, obj);
            onChanged();
        }
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71537p = new a();
        this.f71538q = new b();
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f71537p = new a();
        this.f71538q = new b();
    }

    @TargetApi(21)
    public CircleIndicator2(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f71537p = new a();
        this.f71538q = new b();
    }
}
