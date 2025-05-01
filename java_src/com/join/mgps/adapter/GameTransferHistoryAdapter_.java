package com.join.mgps.adapter;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.join.mgps.dto.GameTransferBean;
/* loaded from: classes4.dex */
public final class GameTransferHistoryAdapter_ extends GameTransferHistoryAdapter {

    /* renamed from: f  reason: collision with root package name */
    private Context f43193f;

    /* renamed from: g  reason: collision with root package name */
    private Object f43194g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43195b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameTransferBean f43196c;

        a(int i4, GameTransferBean gameTransferBean) {
            this.f43195b = i4;
            this.f43196c = gameTransferBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferHistoryAdapter_.super.b(this.f43195b, this.f43196c);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43198b;

        b(int i4) {
            this.f43198b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferHistoryAdapter_.super.g(this.f43198b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43200b;

        c(int i4) {
            this.f43200b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferHistoryAdapter_.super.f(this.f43200b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SparseArray f43202b;

        d(SparseArray sparseArray) {
            this.f43202b = sparseArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferHistoryAdapter_.super.a(this.f43202b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferHistoryAdapter_.super.clear();
        }
    }

    private GameTransferHistoryAdapter_(Context context) {
        this.f43193f = context;
        y();
    }

    public static GameTransferHistoryAdapter_ w(Context context) {
        return new GameTransferHistoryAdapter_(context);
    }

    public static GameTransferHistoryAdapter_ x(Context context, Object obj) {
        return new GameTransferHistoryAdapter_(context, obj);
    }

    private void y() {
        this.f43192d = this.f43193f;
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
    /* renamed from: v */
    public void b(int i4, GameTransferBean gameTransferBean) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.b(i4, gameTransferBean);
        } else {
            org.androidannotations.api.b.e("", new a(i4, gameTransferBean), 0L);
        }
    }

    public void z(Context context) {
        this.f43193f = context;
        y();
    }

    private GameTransferHistoryAdapter_(Context context, Object obj) {
        this.f43193f = context;
        this.f43194g = obj;
        y();
    }
}
