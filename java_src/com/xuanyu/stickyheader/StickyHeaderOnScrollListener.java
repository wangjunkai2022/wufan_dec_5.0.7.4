package com.xuanyu.stickyheader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes6.dex */
public class StickyHeaderOnScrollListener<T> extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    private int f68429a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f68430b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f68431c;

    /* renamed from: d  reason: collision with root package name */
    private com.xuanyu.stickyheader.e<T> f68432d;

    /* renamed from: f  reason: collision with root package name */
    private h<T> f68434f;

    /* renamed from: h  reason: collision with root package name */
    private Context f68436h;

    /* renamed from: e  reason: collision with root package name */
    private Handler f68433e = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    private boolean f68435g = true;

    /* renamed from: i  reason: collision with root package name */
    private int f68437i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f68438j = 0;

    /* renamed from: k  reason: collision with root package name */
    private Runnable f68439k = new a();

    /* loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StickyHeaderOnScrollListener.this.p();
        }
    }

    /* loaded from: classes6.dex */
    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (StickyHeaderOnScrollListener.this.f68435g) {
                StickyHeaderOnScrollListener.this.p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StickyHeaderOnScrollListener.this.f68430b.setAlpha(1.0f);
            ViewCompat.offsetTopAndBottom(StickyHeaderOnScrollListener.this.f68430b, (StickyHeaderOnScrollListener.this.f68429a - StickyHeaderOnScrollListener.this.f68430b.getMeasuredHeight()) - StickyHeaderOnScrollListener.this.f68430b.getTop());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f68444b;

        e(int i4) {
            this.f68444b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            StickyHeaderOnScrollListener.this.f68430b.setAlpha(1.0f);
            ViewCompat.offsetTopAndBottom(StickyHeaderOnScrollListener.this.f68430b, (this.f68444b + StickyHeaderOnScrollListener.this.f68429a) - StickyHeaderOnScrollListener.this.f68430b.getTop());
        }
    }

    public StickyHeaderOnScrollListener(RecyclerView recyclerView, ViewGroup viewGroup, int i4) {
        this.f68429a = i4;
        this.f68430b = viewGroup;
        this.f68431c = recyclerView;
        this.f68436h = recyclerView.getContext();
        this.f68432d = (com.xuanyu.stickyheader.e) this.f68431c.getAdapter();
        this.f68431c.getAdapter().registerAdapterDataObserver(new b());
        this.f68431c.getViewTreeObserver().addOnGlobalLayoutListener(new c());
    }

    private void i(View view) {
        if (!w(view)) {
            this.f68430b.addView(view);
        }
        n(view);
    }

    private com.xuanyu.stickyheader.a<T> k(RecyclerView recyclerView) {
        com.xuanyu.stickyheader.a<T> b5;
        if (this.f68434f == null) {
            return null;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1) {
                com.xuanyu.stickyheader.e eVar = (com.xuanyu.stickyheader.e) recyclerView.getAdapter();
                if (eVar.a(childAdapterPosition) && (b5 = eVar.b(childAdapterPosition)) != null) {
                    b5.setRecyclerViewItemView(childAt);
                    if (this.f68434f.b().getRecyclerViewItemModel().equals(eVar.getItem(childAdapterPosition))) {
                        return b5;
                    }
                    g.b(b5);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.xuanyu.stickyheader.a<T> l(androidx.recyclerview.widget.RecyclerView r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r8.getChildCount()
            r1 = 0
        L5:
            r2 = 0
            if (r1 >= r0) goto L62
            android.view.View r3 = r8.getChildAt(r1)
            int r4 = r8.getChildAdapterPosition(r3)
            r5 = -1
            if (r4 != r5) goto L14
            goto L47
        L14:
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r8.getAdapter()
            com.xuanyu.stickyheader.e r5 = (com.xuanyu.stickyheader.e) r5
            boolean r6 = r5.a(r4)
            if (r6 != 0) goto L21
            goto L47
        L21:
            com.xuanyu.stickyheader.a r6 = r5.b(r4)
            if (r6 != 0) goto L28
            goto L47
        L28:
            r6.setRecyclerViewItemView(r3)
            java.lang.Object r3 = r5.getItem(r4)
            if (r9 == 0) goto L4b
            com.xuanyu.stickyheader.h<T> r2 = r7.f68434f
            if (r2 == 0) goto L4a
            com.xuanyu.stickyheader.a r2 = r2.b()
            java.lang.Object r2 = r2.getRecyclerViewItemModel()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            goto L4a
        L44:
            com.xuanyu.stickyheader.g.b(r6)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return r6
        L4b:
            com.xuanyu.stickyheader.h<T> r8 = r7.f68434f
            if (r8 == 0) goto L5f
            com.xuanyu.stickyheader.a r8 = r8.b()
            java.lang.Object r8 = r8.getRecyclerViewItemModel()
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L5e
            goto L5f
        L5e:
            return r6
        L5f:
            com.xuanyu.stickyheader.g.b(r6)
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuanyu.stickyheader.StickyHeaderOnScrollListener.l(androidx.recyclerview.widget.RecyclerView, boolean):com.xuanyu.stickyheader.a");
    }

    private int m(View view) {
        if (view instanceof com.xuanyu.stickyheader.b) {
            return ((com.xuanyu.stickyheader.b) view).b();
        }
        return view.getTop();
    }

    private void n(View view) {
        for (int i4 = 0; i4 < this.f68430b.getChildCount(); i4++) {
            View childAt = this.f68430b.getChildAt(i4);
            if (childAt == view) {
                childAt.setVisibility(0);
            } else {
                childAt.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        RecyclerView recyclerView;
        int childAdapterPosition;
        if (this.f68435g) {
            View j4 = j(this.f68431c, recyclerView.getMeasuredWidth() / 4, this.f68429a);
            if (j4 == null || (childAdapterPosition = this.f68431c.getChildAdapterPosition(j4)) == -1) {
                return;
            }
            ((RecyclerView.Adapter) this.f68432d).getItemCount();
            com.xuanyu.stickyheader.a aVar = null;
            com.xuanyu.stickyheader.a aVar2 = null;
            for (int i4 = childAdapterPosition; i4 >= 0; i4--) {
                aVar2 = f.d(this.f68432d, i4);
                if (aVar2 != null) {
                    break;
                }
            }
            if (m(j4) == this.f68429a && aVar2 != null) {
                g.b(aVar2);
                return;
            }
            h<T> hVar = this.f68434f;
            if (hVar != null && hVar.b() != null && aVar2 != null) {
                T recyclerViewItemModel = this.f68434f.b().getRecyclerViewItemModel();
                Object recyclerViewItemModel2 = aVar2.getRecyclerViewItemModel();
                if (recyclerViewItemModel != null && recyclerViewItemModel2 != null && recyclerViewItemModel.equals(recyclerViewItemModel2)) {
                    g.b(aVar2);
                    return;
                }
            }
            q();
            if (aVar2 == null) {
                this.f68430b.setVisibility(8);
                return;
            }
            if (this.f68430b.getVisibility() == 8) {
                this.f68430b.setVisibility(0);
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.f68431c.getChildCount()) {
                    i5 = -1;
                    break;
                } else if (j4 == this.f68431c.getChildAt(i5)) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 != -1) {
                while (true) {
                    if (i5 >= this.f68431c.getChildCount()) {
                        break;
                    }
                    View childAt = this.f68431c.getChildAt(i5);
                    int childAdapterPosition2 = this.f68431c.getChildAdapterPosition(childAt);
                    if (childAdapterPosition2 != -1 && (aVar = f.d(this.f68432d, childAdapterPosition2)) != null) {
                        aVar.setRecyclerViewItemView(childAt);
                        break;
                    }
                    i5++;
                }
            }
            if (aVar == null) {
                ViewGroup viewGroup = this.f68430b;
                ViewCompat.offsetTopAndBottom(viewGroup, this.f68429a - viewGroup.getTop());
            } else {
                int c5 = com.xuanyu.stickyheader.c.c(((m(aVar.getRecyclerViewItemView()) - this.f68437i) - this.f68429a) - this.f68430b.getMeasuredHeight(), -this.f68430b.getMeasuredHeight(), 0);
                this.f68430b.setAlpha(0.0f);
                this.f68430b.post(new e(c5));
                g.b(aVar);
            }
            RecyclerView recyclerView2 = this.f68431c;
            i(aVar2.createIfAbsent(recyclerView2, recyclerView2.getContext()));
            aVar2.onBindView();
            g.b(aVar2);
            o(childAdapterPosition);
        }
    }

    private void t(RecyclerView recyclerView, int i4, int i5) {
        if (i5 > 0) {
            v(recyclerView, i5);
        } else {
            u(recyclerView, i5);
        }
    }

    private void u(RecyclerView recyclerView, int i4) {
        View recyclerViewItemView;
        if (this.f68434f == null) {
            return;
        }
        com.xuanyu.stickyheader.a<T> l4 = l(recyclerView, false);
        if (l4 != null && (recyclerViewItemView = l4.getRecyclerViewItemView()) != null && m(recyclerViewItemView) >= this.f68429a + this.f68438j && m(recyclerViewItemView) <= ((this.f68429a + this.f68438j) + this.f68430b.getMeasuredHeight()) - i4) {
            int min = Math.min(this.f68429a, (m(recyclerViewItemView) - this.f68430b.getMeasuredHeight()) - this.f68438j);
            ViewGroup viewGroup = this.f68430b;
            ViewCompat.offsetTopAndBottom(viewGroup, min - viewGroup.getTop());
            g.b(l4);
            return;
        }
        if (l4 != null) {
            g.b(l4);
        }
        com.xuanyu.stickyheader.a<T> k4 = k(recyclerView);
        if (k4 == null) {
            ViewGroup viewGroup2 = this.f68430b;
            ViewCompat.offsetTopAndBottom(viewGroup2, this.f68429a - viewGroup2.getTop());
            return;
        }
        if (m(k4.getRecyclerViewItemView()) >= this.f68429a) {
            if (this.f68434f.a() == null) {
                this.f68430b.setVisibility(8);
            } else {
                this.f68430b.setVisibility(0);
                com.xuanyu.stickyheader.a<T> b5 = this.f68434f.a().b();
                RecyclerView recyclerView2 = this.f68431c;
                View createIfAbsent = b5.createIfAbsent(recyclerView2, recyclerView2.getContext());
                i(createIfAbsent);
                this.f68430b.setAlpha(0.0f);
                createIfAbsent.post(new d());
                this.f68434f.a().b().onBindView();
            }
            h<T> a5 = this.f68434f.a();
            this.f68434f.c(null);
            g.b(this.f68434f.b());
            this.f68434f = a5;
        }
        g.b(k4);
    }

    private void v(RecyclerView recyclerView, int i4) {
        com.xuanyu.stickyheader.a<T> l4 = l(recyclerView, true);
        if (l4 == null) {
            return;
        }
        View recyclerViewItemView = l4.getRecyclerViewItemView();
        if (m(recyclerViewItemView) < this.f68429a) {
            i(l4.createIfAbsent(this.f68431c, recyclerView.getContext()));
            if (this.f68434f == null) {
                this.f68430b.setVisibility(0);
            } else {
                ViewGroup viewGroup = this.f68430b;
                ViewCompat.offsetTopAndBottom(viewGroup, this.f68429a - viewGroup.getTop());
            }
            l4.onBindView();
            h<T> hVar = new h<>();
            hVar.d(l4);
            hVar.c(this.f68434f);
            this.f68434f = hVar;
        } else if (m(recyclerViewItemView) <= this.f68429a + this.f68430b.getMeasuredHeight() + this.f68437i) {
            int c5 = com.xuanyu.stickyheader.c.c((m(recyclerViewItemView) - this.f68430b.getMeasuredHeight()) - this.f68437i, this.f68429a - this.f68430b.getMeasuredHeight(), this.f68429a);
            ViewGroup viewGroup2 = this.f68430b;
            ViewCompat.offsetTopAndBottom(viewGroup2, c5 - viewGroup2.getTop());
            g.b(l4);
        } else {
            g.b(l4);
            p();
        }
    }

    private boolean w(View view) {
        for (int i4 = 0; i4 < this.f68430b.getChildCount(); i4++) {
            if (this.f68430b.getChildAt(i4) == view) {
                return true;
            }
        }
        return false;
    }

    public View j(RecyclerView recyclerView, float f5, float f6) {
        for (int childCount = recyclerView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = recyclerView.getChildAt(childCount);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (f5 >= childAt.getLeft() + translationX && f5 <= childAt.getRight() + translationX && f6 >= childAt.getTop() + translationY && f6 <= childAt.getBottom() + translationY) {
                return childAt;
            }
        }
        return null;
    }

    public void o(int i4) {
        h<T> hVar = null;
        while (i4 >= 0) {
            com.xuanyu.stickyheader.a<T> d5 = f.d(this.f68432d, i4);
            if (d5 != null) {
                h<T> hVar2 = new h<>();
                hVar2.d(d5);
                if (this.f68434f == null) {
                    this.f68434f = hVar2;
                }
                if (hVar != null) {
                    hVar.c(hVar2);
                }
                hVar = hVar2;
            }
            i4--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
        super.onScrollStateChanged(recyclerView, i4);
        if (i4 == 0) {
            p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
        super.onScrolled(recyclerView, i4, i5);
        if (this.f68435g) {
            t(recyclerView, i4, i5);
        }
    }

    public void q() {
        r();
    }

    public void r() {
        while (true) {
            h<T> hVar = this.f68434f;
            if (hVar == null) {
                return;
            }
            com.xuanyu.stickyheader.a<T> b5 = hVar.b();
            this.f68434f.d(null);
            g.b(b5);
            h<T> a5 = this.f68434f.a();
            this.f68434f.c(null);
            this.f68434f = a5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i4) {
        int i5 = (int) (i4 * this.f68436h.getResources().getDisplayMetrics().density);
        this.f68438j = i5;
        this.f68437i = i5;
    }

    public void x(boolean z4) {
        this.f68435g = z4;
        if (z4) {
            p();
            return;
        }
        q();
        this.f68430b.setVisibility(8);
    }

    /* loaded from: classes6.dex */
    class b extends RecyclerView.AdapterDataObserver {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5) {
            super.onItemRangeChanged(i4, i5);
            RecyclerView.ItemAnimator itemAnimator = StickyHeaderOnScrollListener.this.f68431c.getItemAnimator();
            if (!StickyHeaderOnScrollListener.this.f68435g || itemAnimator == null) {
                return;
            }
            StickyHeaderOnScrollListener.this.f68433e.postDelayed(StickyHeaderOnScrollListener.this.f68439k, itemAnimator.getChangeDuration() + 100);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i4, int i5) {
            RecyclerView.ItemAnimator itemAnimator = StickyHeaderOnScrollListener.this.f68431c.getItemAnimator();
            if (StickyHeaderOnScrollListener.this.f68435g && itemAnimator != null) {
                StickyHeaderOnScrollListener.this.f68433e.postDelayed(StickyHeaderOnScrollListener.this.f68439k, itemAnimator.getAddDuration() + 100);
            }
            super.onItemRangeInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i4, int i5, int i6) {
            RecyclerView.ItemAnimator itemAnimator = StickyHeaderOnScrollListener.this.f68431c.getItemAnimator();
            if (StickyHeaderOnScrollListener.this.f68435g && itemAnimator != null) {
                StickyHeaderOnScrollListener.this.f68433e.postDelayed(StickyHeaderOnScrollListener.this.f68439k, itemAnimator.getMoveDuration() + 100);
            }
            super.onItemRangeMoved(i4, i5, i6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i4, int i5) {
            RecyclerView.ItemAnimator itemAnimator = StickyHeaderOnScrollListener.this.f68431c.getItemAnimator();
            if (StickyHeaderOnScrollListener.this.f68435g && itemAnimator != null) {
                StickyHeaderOnScrollListener.this.f68433e.postDelayed(StickyHeaderOnScrollListener.this.f68439k, itemAnimator.getRemoveDuration() + 300);
            }
            super.onItemRangeRemoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5, @Nullable Object obj) {
            super.onItemRangeChanged(i4, i5, obj);
            RecyclerView.ItemAnimator itemAnimator = StickyHeaderOnScrollListener.this.f68431c.getItemAnimator();
            if (!StickyHeaderOnScrollListener.this.f68435g || itemAnimator == null) {
                return;
            }
            StickyHeaderOnScrollListener.this.f68433e.postDelayed(StickyHeaderOnScrollListener.this.f68439k, itemAnimator.getChangeDuration() + 100);
        }
    }
}
