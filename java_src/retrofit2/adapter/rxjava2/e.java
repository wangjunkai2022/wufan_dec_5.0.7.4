package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;
/* compiled from: ResultObservable.java */
/* loaded from: classes7.dex */
final class e<T> extends Observable<d<T>> {

    /* renamed from: b  reason: collision with root package name */
    private final Observable<Response<T>> f73217b;

    /* compiled from: ResultObservable.java */
    /* loaded from: classes7.dex */
    private static class a<R> implements Observer<Response<R>> {

        /* renamed from: b  reason: collision with root package name */
        private final Observer<? super d<R>> f73218b;

        a(Observer<? super d<R>> observer) {
            this.f73218b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void onNext(Response<R> response) {
            this.f73218b.onNext(d.e(response));
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f73218b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            try {
                this.f73218b.onNext(d.b(th));
                this.f73218b.onComplete();
            } catch (Throwable th2) {
                try {
                    this.f73218b.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f73218b.onSubscribe(disposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Observable<Response<T>> observable) {
        this.f73217b = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super d<T>> observer) {
        this.f73217b.subscribe(new a(observer));
    }
}
