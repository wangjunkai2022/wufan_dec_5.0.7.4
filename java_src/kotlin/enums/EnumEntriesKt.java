package kotlin.enums;

import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: EnumEntries.kt */
/* loaded from: classes6.dex */
public final class EnumEntriesKt {
    @SinceKotlin(version = "1.8")
    @ExperimentalStdlibApi
    @NotNull
    @PublishedApi
    public static final <E extends Enum<E>> EnumEntries<E> enumEntries(@NotNull Function0<E[]> entriesProvider) {
        Intrinsics.checkNotNullParameter(entriesProvider, "entriesProvider");
        return new EnumEntriesList(entriesProvider);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalStdlibApi
    @NotNull
    @PublishedApi
    public static final <E extends Enum<E>> EnumEntries<E> enumEntries(@NotNull final E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        EnumEntriesList enumEntriesList = new EnumEntriesList(new Function0<E[]>() { // from class: kotlin.enums.EnumEntriesKt$enumEntries$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: ([TE;)V */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()[TE; */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Enum[] invoke() {
                return entries;
            }
        });
        enumEntriesList.size();
        return enumEntriesList;
    }
}
