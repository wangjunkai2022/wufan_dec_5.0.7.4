package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
/* compiled from: ViewModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0016\u0010\u0001\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "JOB_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/q0;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/q0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewModelKt {
    @NotNull
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final q0 getViewModelScope(@NotNull ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        q0 q0Var = (q0) viewModel.getTag(JOB_KEY);
        if (q0Var != null) {
            return q0Var;
        }
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(a3.c(null, 1, null).plus(d1.e().Y())));
        Intrinsics.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (q0) tagIfAbsent;
    }
}
