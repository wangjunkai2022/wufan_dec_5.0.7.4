package com.dingmouren.layoutmanagergroup.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class BannerLayoutManager extends LinearLayoutManager {

    /* renamed from: j  reason: collision with root package name */
    private static final String f10153j = "BannerLayoutManager";

    /* renamed from: a  reason: collision with root package name */
    private LinearSnapHelper f10154a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f10155b;

    /* renamed from: c  reason: collision with root package name */
    private b f10156c;

    /* renamed from: d  reason: collision with root package name */
    private int f10157d;

    /* renamed from: e  reason: collision with root package name */
    private int f10158e;

    /* renamed from: f  reason: collision with root package name */
    private c f10159f;

    /* renamed from: g  reason: collision with root package name */
    private long f10160g;

    /* renamed from: h  reason: collision with root package name */
    private int f10161h;

    /* renamed from: i  reason: collision with root package name */
    private float f10162i;

    /* loaded from: classes2.dex */
    class a extends LinearSmoothScroller {
        a(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return BannerLayoutManager.this.f10162i / displayMetrics.densityDpi;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(View view, int i4);
    }

    /* loaded from: classes2.dex */
    private static class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<BannerLayoutManager> f10164a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10165b;

        public c(BannerLayoutManager bannerLayoutManager) {
            this.f10164a = new WeakReference<>(bannerLayoutManager);
        }

        public void a(boolean z4) {
            this.f10165b = z4;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null || !this.f10165b) {
                return;
            }
            int i4 = message.what;
            BannerLayoutManager bannerLayoutManager = this.f10164a.get();
            if (bannerLayoutManager != null) {
                bannerLayoutManager.c().smoothScrollToPosition(i4);
            }
        }
    }

    public BannerLayoutManager(Context context, RecyclerView recyclerView, int i4) {
        super(context);
        this.f10158e = 0;
        this.f10160g = 1000L;
        this.f10162i = 150.0f;
        this.f10154a = new LinearSnapHelper();
        this.f10157d = i4;
        this.f10159f = new c(this);
        this.f10155b = recyclerView;
        setOrientation(0);
        this.f10161h = 0;
    }

    public RecyclerView c() {
        return this.f10155b;
    }

    public void d(b bVar) {
        this.f10156c = bVar;
    }

    public void e(long j4) {
        this.f10160g = j4;
    }

    public void f(float f5) {
        this.f10162i = f5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f10154a.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        this.f10159f.a(true);
        Message obtain = Message.obtain();
        obtain.what = this.f10158e + 1;
        this.f10159f.sendMessageDelayed(obtain, this.f10160g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i4) {
        super.onScrollStateChanged(i4);
        if (i4 != 0) {
            if (i4 == 1) {
                this.f10159f.a(false);
                return;
            }
            return;
        }
        LinearSnapHelper linearSnapHelper = this.f10154a;
        if (linearSnapHelper != null) {
            View findSnapView = linearSnapHelper.findSnapView(this);
            int position = getPosition(findSnapView);
            this.f10158e = position;
            b bVar = this.f10156c;
            if (bVar != null) {
                bVar.a(findSnapView, position % this.f10157d);
            }
            this.f10159f.a(true);
            Message obtain = Message.obtain();
            int i5 = this.f10158e + 1;
            this.f10158e = i5;
            obtain.what = i5;
            this.f10159f.sendMessageDelayed(obtain, this.f10160g);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i4) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i4);
        startSmoothScroll(aVar);
    }

    public BannerLayoutManager(Context context, RecyclerView recyclerView, int i4, int i5) {
        super(context);
        this.f10158e = 0;
        this.f10160g = 1000L;
        this.f10162i = 150.0f;
        this.f10154a = new LinearSnapHelper();
        this.f10157d = i4;
        this.f10159f = new c(this);
        this.f10155b = recyclerView;
        setOrientation(i5);
        this.f10161h = i5;
    }
}
