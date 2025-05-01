package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
/* loaded from: classes6.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes6.dex */
    static final class DelaySubscriber<T> implements FlowableSubscriber<T>, Subscription {
        final long delay;
        final boolean delayError;
        final Subscriber<? super T> downstream;
        final TimeUnit unit;
        Subscription upstream;

        /* renamed from: w  reason: collision with root package name */
        final Scheduler.Worker f69263w;

        /* loaded from: classes6.dex */
        final class OnComplete implements Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f69263w.dispose();
                }
            }
        }

        /* loaded from: classes6.dex */
        final class OnError implements Runnable {

            /* renamed from: t  reason: collision with root package name */
            private final Throwable f69264t;

            OnError(Throwable th) {
                this.f69264t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f69264t);
                } finally {
                    DelaySubscriber.this.f69263w.dispose();
                }
            }
        }

        /* loaded from: classes6.dex */
        final class OnNext implements Runnable {

            /* renamed from: t  reason: collision with root package name */
            private final T f69265t;

            OnNext(T t4) {
                this.f69265t = t4;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext((T) this.f69265t);
            }
        }

        DelaySubscriber(Subscriber<? super T> subscriber, long j4, TimeUnit timeUnit, Scheduler.Worker worker, boolean z4) {
            this.downstream = subscriber;
            this.delay = j4;
            this.unit = timeUnit;
            this.f69263w = worker;
            this.delayError = z4;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            this.f69263w.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f69263w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f69263w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t4) {
            this.f69263w.schedule(new OnNext(t4), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j4) {
            this.upstream.request(j4);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j4, TimeUnit timeUnit, Scheduler scheduler, boolean z4) {
        super(flowable);
        this.delay = j4;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z4;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? subscriber : new SerializedSubscriber(subscriber), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
