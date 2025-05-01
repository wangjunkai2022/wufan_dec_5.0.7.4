package com.join.kotlin.domain.common;

import androidx.annotation.MainThread;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SingleLiveEvent.kt */
/* loaded from: classes3.dex */
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    @NotNull
    private final AtomicBoolean pending = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner owner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        final Function1<T, Unit> function1 = new Function1<T, Unit>(this) { // from class: com.join.kotlin.domain.common.SingleLiveEvent$observe$1
            final /* synthetic */ SingleLiveEvent<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((SingleLiveEvent$observe$1<T>) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(T t4) {
                AtomicBoolean atomicBoolean;
                atomicBoolean = ((SingleLiveEvent) this.this$0).pending;
                if (atomicBoolean.compareAndSet(true, false)) {
                    observer.onChanged(t4);
                }
            }
        };
        super.observe(owner, new Observer() { // from class: com.join.kotlin.domain.common.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SingleLiveEvent.observe$lambda$0(Function1.this, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t4) {
        this.pending.set(true);
        super.setValue(t4);
    }
}
