package com.join.kotlin.domain.common;

import androidx.annotation.MainThread;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SingleLiveEvents.kt */
/* loaded from: classes3.dex */
public final class SingleLiveEvents<T> extends MutableLiveData<List<? extends T>> {
    @NotNull
    private final AtomicBoolean pending = new AtomicBoolean(false);
    @NotNull
    private final List<List<T>> eventList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observe(@NotNull LifecycleOwner owner, @NotNull final Observer<? super List<? extends T>> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        final Function1<List<? extends T>, Unit> function1 = new Function1<List<? extends T>, Unit>(this) { // from class: com.join.kotlin.domain.common.SingleLiveEvents$observe$1
            final /* synthetic */ SingleLiveEvents<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((List) ((List) obj));
                return Unit.INSTANCE;
            }

            public final void invoke(List<? extends T> list) {
                AtomicBoolean atomicBoolean;
                List list2;
                atomicBoolean = ((SingleLiveEvents) this.this$0).pending;
                if (atomicBoolean.compareAndSet(true, false)) {
                    list2 = ((SingleLiveEvents) this.this$0).eventList;
                    list2.clear();
                    observer.onChanged(list);
                }
            }
        };
        super.observe(owner, new Observer() { // from class: com.join.kotlin.domain.common.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SingleLiveEvents.observe$lambda$0(Function1.this, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        setValue((List) ((List) obj));
    }

    @MainThread
    public void setValue(@Nullable List<? extends T> list) {
        List flatten;
        this.pending.set(true);
        if (list != null) {
            this.eventList.add(list);
        }
        flatten = CollectionsKt__IterablesKt.flatten(this.eventList);
        super.setValue((SingleLiveEvents<T>) flatten);
    }
}
