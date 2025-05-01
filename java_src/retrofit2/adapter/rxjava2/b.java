package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: CallEnqueueObservable.java */
/* loaded from: classes7.dex */
final class b<T> extends Observable<Response<T>> {

    /* renamed from: b  reason: collision with root package name */
    private final Call<T> f73207b;

    /* compiled from: CallEnqueueObservable.java */
    /* loaded from: classes7.dex */
    private static final class a<T> implements Disposable, Callback<T> {

        /* renamed from: b  reason: collision with root package name */
        private final Call<?> f73208b;

        /* renamed from: c  reason: collision with root package name */
        private final Observer<? super Response<T>> f73209c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f73210d;

        /* renamed from: e  reason: collision with root package name */
        boolean f73211e = false;

        a(Call<?> call, Observer<? super Response<T>> observer) {
            this.f73208b = call;
            this.f73209c = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f73210d = true;
            this.f73208b.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f73210d;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.f73209c.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            if (this.f73210d) {
                return;
            }
            try {
                this.f73209c.onNext(response);
                if (this.f73210d) {
                    return;
                }
                this.f73211e = true;
                this.f73209c.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                if (this.f73211e) {
                    RxJavaPlugins.onError(th);
                } else if (this.f73210d) {
                } else {
                    try {
                        this.f73209c.onError(th);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(new CompositeException(th, th2));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Call<T> call) {
        this.f73207b = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super Response<T>> observer) {
        Call<T> mo1570clone = this.f73207b.mo1570clone();
        a aVar = new a(mo1570clone, observer);
        observer.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        mo1570clone.enqueue(aVar);
    }
}
