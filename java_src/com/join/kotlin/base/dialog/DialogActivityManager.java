package com.join.kotlin.base.dialog;

import android.content.Intent;
import com.join.kotlin.base.dialog.callback.IDialogActivityCallback;
import com.join.mgps.base.dialog.BaseDialogActivity;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DialogActivityManager.kt */
@SourceDebugExtension({"SMAP\nDialogActivityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogActivityManager.kt\ncom/join/kotlin/base/dialog/DialogActivityManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogActivityManager {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Lazy<DialogActivityManager> INSTANCE$delegate;
    @NotNull
    private final HashMap<String, IDialogActivityCallback> mKeyToCallback;
    @NotNull
    private final Lazy mNextLocalRequestCode$delegate;

    /* compiled from: DialogActivityManager.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final DialogActivityManager getINSTANCE() {
            return (DialogActivityManager) DialogActivityManager.INSTANCE$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final DialogActivityManager get() {
            return getINSTANCE();
        }
    }

    static {
        Lazy<DialogActivityManager> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<DialogActivityManager>() { // from class: com.join.kotlin.base.dialog.DialogActivityManager$Companion$INSTANCE$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DialogActivityManager invoke() {
                return new DialogActivityManager();
            }
        });
        INSTANCE$delegate = lazy;
    }

    public DialogActivityManager() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<AtomicInteger>() { // from class: com.join.kotlin.base.dialog.DialogActivityManager$mNextLocalRequestCode$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AtomicInteger invoke() {
                return new AtomicInteger();
            }
        });
        this.mNextLocalRequestCode$delegate = lazy;
        this.mKeyToCallback = new HashMap<>();
    }

    @JvmStatic
    @NotNull
    public static final DialogActivityManager get() {
        return Companion.get();
    }

    private final AtomicInteger getMNextLocalRequestCode() {
        return (AtomicInteger) this.mNextLocalRequestCode$delegate.getValue();
    }

    @Nullable
    public final IDialogActivityCallback getCallback(@Nullable String str) {
        if (str != null) {
            return this.mKeyToCallback.get(str);
        }
        return null;
    }

    @NotNull
    public final Intent registerCallback(@NotNull Class<? extends BaseDialogActivity> idClass, @NotNull IDialogActivityCallback callback) {
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = idClass.getSimpleName() + "_rq#" + getMNextLocalRequestCode().getAndIncrement();
        this.mKeyToCallback.put(str, callback);
        Intent putExtra = new Intent().putExtra("_key_call", str);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(\"_key_call\", key)");
        return putExtra;
    }

    public final void unregisterCallback(@Nullable String str) {
        if (str != null) {
            this.mKeyToCallback.remove(str);
        }
    }
}
