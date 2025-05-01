package com.join.mgps.adapter;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.join.mgps.dto.GameTransferBean;
/* loaded from: classes4.dex */
public final class GameTransferListAdapter_ extends GameTransferListAdapter {

    /* renamed from: g  reason: collision with root package name */
    private Context f43208g;

    /* renamed from: h  reason: collision with root package name */
    private Object f43209h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43210b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameTransferBean f43211c;

        a(int i4, GameTransferBean gameTransferBean) {
            this.f43210b = i4;
            this.f43211c = gameTransferBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferListAdapter_.super.b(this.f43210b, this.f43211c);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43213b;

        b(int i4) {
            this.f43213b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferListAdapter_.super.g(this.f43213b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43215b;

        c(int i4) {
            this.f43215b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferListAdapter_.super.f(this.f43215b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SparseArray f43217b;

        d(SparseArray sparseArray) {
            this.f43217b = sparseArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferListAdapter_.super.a(this.f43217b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferListAdapter_.super.clear();
        }
    }

    private GameTransferListAdapter_(Context context) {
        this.f43208g = context;
        z();
    }

    public static GameTransferListAdapter_ x(Context context) {
        return new GameTransferListAdapter_(context);
    }

    public static GameTransferListAdapter_ y(Context context, Object obj) {
        return new GameTransferListAdapter_(context, obj);
    }

    private void z() {
        this.f43206d = this.f43208g;
    }

    public void A(Context context) {
        this.f43208g = context;
        z();
    }

    @Override // com.join.mgps.adapter.RecyclerViewBaseAdapter
    public void a(SparseArray<GameTransferBean> sparseArray) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.a(sparseArray);
        } else {
            org.androidannotations.api.b.e("", new d(sparseArray), 0L);
        }
    }

    @Override // com.join.mgps.adapter.RecyclerViewBaseAdapter
    public void clear() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.clear();
        } else {
            org.androidannotations.api.b.e("", new e(), 0L);
        }
    }

    @Override // com.join.mgps.adapter.RecyclerViewBaseAdapter
    public void f(int i4) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.f(i4);
        } else {
            org.androidannotations.api.b.e("", new c(i4), 0L);
        }
    }

    @Override // com.join.mgps.adapter.RecyclerViewBaseAdapter
    public void g(int i4) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.g(i4);
        } else {
            org.androidannotations.api.b.e("", new b(i4), 0L);
        }
    }

    @Override // com.join.mgps.adapter.RecyclerViewBaseAdapter
    /* renamed from: w */
    public void b(int i4, GameTransferBean gameTransferBean) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.b(i4, gameTransferBean);
        } else {
            org.androidannotations.api.b.e("", new a(i4, gameTransferBean), 0L);
        }
    }

    private GameTransferListAdapter_(Context context, Object obj) {
        this.f43208g = context;
        this.f43209h = obj;
        z();
    }
}
