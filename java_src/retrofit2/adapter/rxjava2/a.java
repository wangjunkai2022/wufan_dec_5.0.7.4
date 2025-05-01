package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;
/* compiled from: BodyObservable.java */
/* loaded from: classes7.dex */
final class a<T> extends Observable<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Observable<Response<T>> f73204b;

    /* compiled from: BodyObservable.java */
    /* renamed from: retrofit2.adapter.rxjava2.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    private static class C0810a<R> implements Observer<Response<R>> {

        /* renamed from: b  reason: collision with root package name */
        private final Observer<? super R> f73205b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f73206c;

        C0810a(Observer<? super R> observer) {
            this.f73205b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.f73205b.onNext(response.body());
                return;
            }
            this.f73206c = true;
            HttpException httpException = new HttpException(response);
            try {
                this.f73205b.onError(httpException);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(new CompositeException(httpException, th));
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f73206c) {
                return;
            }
            this.f73205b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.f73206c) {
                this.f73205b.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.onError(assertionError);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f73205b.onSubscribe(disposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Observable<Response<T>> observable) {
        this.f73204b = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super T> observer) {
        this.f73204b.subscribe(new C0810a(observer));
    }
}
