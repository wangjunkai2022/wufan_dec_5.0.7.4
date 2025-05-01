package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: EnumEntriesSerializationProxy.kt */
/* loaded from: classes6.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Class<E> f69587c;

    /* compiled from: EnumEntriesSerializationProxy.kt */
    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EnumEntriesSerializationProxy(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        Intrinsics.checkNotNull(cls);
        this.f69587c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f69587c.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "c.enumConstants");
        return EnumEntriesKt.enumEntries(enumConstants);
    }
}
