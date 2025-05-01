package com.kunminx.architecture.ui.callback;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class ProtectedUnPeekLiveData<T> extends LiveData<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final int f55878c = -1;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f55879a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f55880b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Observer<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Observer<? super T> f55881a;

        /* renamed from: b  reason: collision with root package name */
        private int f55882b;

        public a(@NonNull Observer<? super T> observer, int i4) {
            this.f55882b = -1;
            this.f55881a = observer;
            this.f55882b = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.f55881a, ((a) obj).f55881a);
        }

        public int hashCode() {
            return Objects.hash(this.f55881a);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(T t4) {
            if (ProtectedUnPeekLiveData.this.f55879a.get() > this.f55882b) {
                if (t4 != null || ProtectedUnPeekLiveData.this.f55880b) {
                    this.f55881a.onChanged(t4);
                }
            }
        }
    }

    public ProtectedUnPeekLiveData(T t4) {
        super(t4);
        this.f55879a = new AtomicInteger(-1);
    }

    private ProtectedUnPeekLiveData<T>.a c(@NonNull Observer<? super T> observer, int i4) {
        return new a(observer, i4);
    }

    public void b() {
        super.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
        super.observe(lifecycleOwner, c(observer, -1));
    }

    public void e(@NonNull Observer<? super T> observer) {
        super.observeForever(c(observer, -1));
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        super.observe(lifecycleOwner, c(observer, this.f55879a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NonNull Observer<? super T> observer) {
        super.observeForever(c(observer, this.f55879a.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NonNull Observer<? super T> observer) {
        if (observer.getClass().isAssignableFrom(a.class)) {
            super.removeObserver(observer);
        } else {
            super.removeObserver(c(observer, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void setValue(T t4) {
        this.f55879a.getAndIncrement();
        super.setValue(t4);
    }

    public ProtectedUnPeekLiveData() {
        this.f55879a = new AtomicInteger(-1);
    }
}
