package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Response;
/* compiled from: CallExecuteObservable.java */
/* loaded from: classes7.dex */
final class c<T> extends Observable<Response<T>> {

    /* renamed from: b  reason: collision with root package name */
    private final Call<T> f73212b;

    /* compiled from: CallExecuteObservable.java */
    /* loaded from: classes7.dex */
    private static final class a implements Disposable {

        /* renamed from: b  reason: collision with root package name */
        private final Call<?> f73213b;

        /* renamed from: c  reason: collision with root package name */
        private volatile boolean f73214c;

        a(Call<?> call) {
            this.f73213b = call;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f73214c = true;
            this.f73213b.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f73214c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Call<T> call) {
        this.f73212b = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super Response<T>> observer) {
        boolean z4;
        Call<T> mo1570clone = this.f73212b.mo1570clone();
        a aVar = new a(mo1570clone);
        observer.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        try {
            Response<T> execute = mo1570clone.execute();
            if (!aVar.isDisposed()) {
                observer.onNext(execute);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                observer.onComplete();
            } catch (Throwable th) {
                th = th;
                z4 = true;
                Exceptions.throwIfFatal(th);
                if (z4) {
                    RxJavaPlugins.onError(th);
                } else if (aVar.isDisposed()) {
                } else {
                    try {
                        observer.onError(th);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(new CompositeException(th, th2));
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z4 = false;
        }
    }
}
