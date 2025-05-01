package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RxPermissions.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    static final String f62146b = "c";

    /* renamed from: c  reason: collision with root package name */
    static final Object f62147c = new Object();
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    f<RxPermissionsFragment> f62148a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxPermissions.java */
    /* loaded from: classes5.dex */
    public class a implements f<RxPermissionsFragment> {

        /* renamed from: a  reason: collision with root package name */
        private RxPermissionsFragment f62149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentManager f62150b;

        a(FragmentManager fragmentManager) {
            this.f62150b = fragmentManager;
        }

        @Override // com.tbruyelle.rxpermissions2.c.f
        /* renamed from: a */
        public synchronized RxPermissionsFragment get() {
            if (this.f62149a == null) {
                this.f62149a = c.this.i(this.f62150b);
            }
            return this.f62149a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxPermissions.java */
    /* loaded from: classes5.dex */
    public class b<T> implements ObservableTransformer<T, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f62152a;

        /* compiled from: RxPermissions.java */
        /* loaded from: classes5.dex */
        class a implements Function<List<com.tbruyelle.rxpermissions2.b>, ObservableSource<Boolean>> {
            a() {
            }

            @Override // io.reactivex.functions.Function
            /* renamed from: a */
            public ObservableSource<Boolean> apply(List<com.tbruyelle.rxpermissions2.b> list) {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                for (com.tbruyelle.rxpermissions2.b bVar : list) {
                    if (!bVar.f62140b) {
                        return Observable.just(Boolean.FALSE);
                    }
                }
                return Observable.just(Boolean.TRUE);
            }
        }

        b(String[] strArr) {
            this.f62152a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource<Boolean> apply(Observable<T> observable) {
            return c.this.p(observable, this.f62152a).buffer(this.f62152a.length).flatMap(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxPermissions.java */
    /* renamed from: com.tbruyelle.rxpermissions2.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0659c<T> implements ObservableTransformer<T, com.tbruyelle.rxpermissions2.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f62155a;

        C0659c(String[] strArr) {
            this.f62155a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource<com.tbruyelle.rxpermissions2.b> apply(Observable<T> observable) {
            return c.this.p(observable, this.f62155a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxPermissions.java */
    /* loaded from: classes5.dex */
    public class d<T> implements ObservableTransformer<T, com.tbruyelle.rxpermissions2.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f62157a;

        /* compiled from: RxPermissions.java */
        /* loaded from: classes5.dex */
        class a implements Function<List<com.tbruyelle.rxpermissions2.b>, ObservableSource<com.tbruyelle.rxpermissions2.b>> {
            a() {
            }

            @Override // io.reactivex.functions.Function
            /* renamed from: a */
            public ObservableSource<com.tbruyelle.rxpermissions2.b> apply(List<com.tbruyelle.rxpermissions2.b> list) {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                return Observable.just(new com.tbruyelle.rxpermissions2.b(list));
            }
        }

        d(String[] strArr) {
            this.f62157a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource<com.tbruyelle.rxpermissions2.b> apply(Observable<T> observable) {
            return c.this.p(observable, this.f62157a).buffer(this.f62157a.length).flatMap(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxPermissions.java */
    /* loaded from: classes5.dex */
    public class e implements Function<Object, Observable<com.tbruyelle.rxpermissions2.b>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f62160b;

        e(String[] strArr) {
            this.f62160b = strArr;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Observable<com.tbruyelle.rxpermissions2.b> apply(Object obj) {
            return c.this.t(this.f62160b);
        }
    }

    /* compiled from: RxPermissions.java */
    @FunctionalInterface
    /* loaded from: classes5.dex */
    public interface f<V> {
        V get();
    }

    public c(@NonNull FragmentActivity fragmentActivity) {
        this.f62148a = h(fragmentActivity.getSupportFragmentManager());
    }

    private RxPermissionsFragment g(@NonNull FragmentManager fragmentManager) {
        return (RxPermissionsFragment) fragmentManager.findFragmentByTag(f62146b);
    }

    @NonNull
    private f<RxPermissionsFragment> h(@NonNull FragmentManager fragmentManager) {
        return new a(fragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RxPermissionsFragment i(@NonNull FragmentManager fragmentManager) {
        RxPermissionsFragment g4 = g(fragmentManager);
        if (g4 == null) {
            RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
            fragmentManager.beginTransaction().add(rxPermissionsFragment, f62146b).commitNow();
            return rxPermissionsFragment;
        }
        return g4;
    }

    private Observable<?> n(Observable<?> observable, Observable<?> observable2) {
        if (observable == null) {
            return Observable.just(f62147c);
        }
        return Observable.merge(observable, observable2);
    }

    private Observable<?> o(String... strArr) {
        for (String str : strArr) {
            if (!this.f62148a.get().V(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(f62147c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<com.tbruyelle.rxpermissions2.b> p(Observable<?> observable, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return n(observable, o(strArr)).flatMap(new e(strArr));
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public Observable<com.tbruyelle.rxpermissions2.b> t(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f62148a.get().a0("Requesting permission " + str);
            if (j(str)) {
                arrayList.add(Observable.just(new com.tbruyelle.rxpermissions2.b(str, true, false)));
            } else if (l(str)) {
                arrayList.add(Observable.just(new com.tbruyelle.rxpermissions2.b(str, false, false)));
            } else {
                PublishSubject<com.tbruyelle.rxpermissions2.b> W = this.f62148a.get().W(str);
                if (W == null) {
                    arrayList2.add(str);
                    W = PublishSubject.create();
                    this.f62148a.get().d0(str, W);
                }
                arrayList.add(W);
            }
        }
        if (!arrayList2.isEmpty()) {
            u((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    @TargetApi(23)
    private boolean x(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (!j(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                return false;
            }
        }
        return true;
    }

    public <T> ObservableTransformer<T, Boolean> d(String... strArr) {
        return new b(strArr);
    }

    public <T> ObservableTransformer<T, com.tbruyelle.rxpermissions2.b> e(String... strArr) {
        return new C0659c(strArr);
    }

    public <T> ObservableTransformer<T, com.tbruyelle.rxpermissions2.b> f(String... strArr) {
        return new d(strArr);
    }

    public boolean j(String str) {
        return !k() || this.f62148a.get().X(str);
    }

    boolean k() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public boolean l(String str) {
        return k() && this.f62148a.get().Z(str);
    }

    void m(String[] strArr, int[] iArr) {
        this.f62148a.get().b0(strArr, iArr, new boolean[strArr.length]);
    }

    public Observable<Boolean> q(String... strArr) {
        return Observable.just(f62147c).compose(d(strArr));
    }

    public Observable<com.tbruyelle.rxpermissions2.b> r(String... strArr) {
        return Observable.just(f62147c).compose(e(strArr));
    }

    public Observable<com.tbruyelle.rxpermissions2.b> s(String... strArr) {
        return Observable.just(f62147c).compose(f(strArr));
    }

    @TargetApi(23)
    void u(String[] strArr) {
        this.f62148a.get().a0("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f62148a.get().requestPermissions(strArr);
    }

    public void v(boolean z4) {
        this.f62148a.get().c0(z4);
    }

    public Observable<Boolean> w(Activity activity, String... strArr) {
        if (!k()) {
            return Observable.just(Boolean.FALSE);
        }
        return Observable.just(Boolean.valueOf(x(activity, strArr)));
    }

    public c(@NonNull Fragment fragment) {
        this.f62148a = h(fragment.getChildFragmentManager());
    }
}
