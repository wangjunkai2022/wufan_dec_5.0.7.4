package com.join.kotlin.base.ext;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.join.kotlin.base.activity.BaseVmActivity;
import com.join.kotlin.base.activity.BaseVmDialogActivity;
import com.join.kotlin.base.fragment.BaseVmFragment;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.mgps.dto.ResponseModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseViewModelExt.kt */
@SourceDebugExtension({"SMAP\nBaseViewModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseViewModelExt.kt\ncom/join/kotlin/base/ext/BaseViewModelExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
/* loaded from: classes3.dex */
public final class BaseViewModelExtKt {
    @Nullable
    public static final <T> Object executeResponse(@NotNull ResponseModel<T> responseModel, @NotNull Function3<? super q0, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g4 = r0.g(new BaseViewModelExtKt$executeResponse$2(responseModel, function3, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g4 == coroutine_suspended ? g4 : Unit.INSTANCE;
    }

    public static final <T> void launch(@NotNull BaseViewModel baseViewModel, @NotNull Function1<? super Continuation<? super T>, ? extends Object> block, @NotNull Function1<? super T, Unit> success, @NotNull Function1<? super Throwable, Unit> error) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        k.f(ViewModelKt.getViewModelScope(baseViewModel), null, null, new BaseViewModelExtKt$launch$2(block, success, error, null), 3, null);
    }

    public static /* synthetic */ void launch$default(BaseViewModel baseViewModel, Function1 function1, Function1 function12, Function1 function13, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function13 = new Function1<Throwable, Unit>() { // from class: com.join.kotlin.base.ext.BaseViewModelExtKt$launch$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                }
            };
        }
        launch(baseViewModel, function1, function12, function13);
    }

    public static final <T> void parseState(@NotNull BaseVmActivity<?> baseVmActivity, @NotNull ResultState<? extends T> resultState, @NotNull Function1<? super T, Unit> onSuccess, @Nullable Function1<? super AppException, Unit> function1, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseVmActivity, "<this>");
        Intrinsics.checkNotNullParameter(resultState, "resultState");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (resultState instanceof ResultState.Loading) {
            baseVmActivity.showLoading(((ResultState.Loading) resultState).getLoadingMessage());
        } else if (resultState instanceof ResultState.Success) {
            baseVmActivity.dismissLoading();
            onSuccess.invoke((Object) ((ResultState.Success) resultState).getData());
        } else if (resultState instanceof ResultState.Error) {
            baseVmActivity.dismissLoading();
            if (function1 != null) {
                function1.invoke(((ResultState.Error) resultState).getError());
            }
        }
    }

    public static /* synthetic */ void parseState$default(BaseVmActivity baseVmActivity, ResultState resultState, Function1 function1, Function1 function12, Function0 function0, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function12 = null;
        }
        if ((i4 & 8) != 0) {
            function0 = null;
        }
        parseState(baseVmActivity, resultState, function1, function12, function0);
    }

    @NotNull
    public static final <T> z1 request(@NotNull BaseViewModel baseViewModel, @NotNull Function1<? super Continuation<? super ResponseModel<T>>, ? extends Object> block, @NotNull MutableLiveData<ResultState<T>> resultState, boolean z4, @NotNull String loadingMessage) {
        z1 f5;
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(resultState, "resultState");
        Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
        f5 = k.f(ViewModelKt.getViewModelScope(baseViewModel), null, null, new BaseViewModelExtKt$request$1(z4, resultState, loadingMessage, block, null), 3, null);
        return f5;
    }

    public static /* synthetic */ z1 request$default(BaseViewModel baseViewModel, Function1 function1, MutableLiveData mutableLiveData, boolean z4, String str, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        if ((i4 & 8) != 0) {
            str = "请求网络中...";
        }
        return request(baseViewModel, function1, mutableLiveData, z4, str);
    }

    @NotNull
    public static final <T> z1 requestNoCheck(@NotNull BaseViewModel baseViewModel, @NotNull Function1<? super Continuation<? super T>, ? extends Object> block, @NotNull MutableLiveData<ResultState<T>> resultState, boolean z4, @NotNull String loadingMessage) {
        z1 f5;
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(resultState, "resultState");
        Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
        f5 = k.f(ViewModelKt.getViewModelScope(baseViewModel), null, null, new BaseViewModelExtKt$requestNoCheck$1(z4, resultState, loadingMessage, block, null), 3, null);
        return f5;
    }

    public static /* synthetic */ z1 requestNoCheck$default(BaseViewModel baseViewModel, Function1 function1, MutableLiveData mutableLiveData, boolean z4, String str, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        if ((i4 & 8) != 0) {
            str = "请求网络中...";
        }
        return requestNoCheck(baseViewModel, function1, mutableLiveData, z4, str);
    }

    public static /* synthetic */ void parseState$default(BaseVmDialogActivity baseVmDialogActivity, ResultState resultState, Function1 function1, Function1 function12, Function0 function0, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function12 = null;
        }
        if ((i4 & 8) != 0) {
            function0 = null;
        }
        parseState(baseVmDialogActivity, resultState, function1, function12, function0);
    }

    @NotNull
    public static final <T> z1 request(@NotNull BaseViewModel baseViewModel, @NotNull Function1<? super Continuation<? super ResponseModel<T>>, ? extends Object> block, @NotNull Function1<? super T, Unit> success, @NotNull Function1<? super AppException, Unit> error, boolean z4, @NotNull String loadingMessage) {
        z1 f5;
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
        f5 = k.f(ViewModelKt.getViewModelScope(baseViewModel), null, null, new BaseViewModelExtKt$request$3(block, success, error, null), 3, null);
        return f5;
    }

    public static /* synthetic */ z1 request$default(BaseViewModel baseViewModel, Function1 function1, Function1 function12, Function1 function13, boolean z4, String str, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function13 = new Function1<AppException, Unit>() { // from class: com.join.kotlin.base.ext.BaseViewModelExtKt$request$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AppException appException) {
                    invoke2(appException);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AppException it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                }
            };
        }
        Function1 function14 = function13;
        boolean z5 = (i4 & 8) != 0 ? false : z4;
        if ((i4 & 16) != 0) {
            str = "请求网络中...";
        }
        return request(baseViewModel, function1, function12, function14, z5, str);
    }

    public static /* synthetic */ void parseState$default(BaseVmFragment baseVmFragment, ResultState resultState, Function1 function1, Function1 function12, Function0 function0, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function12 = null;
        }
        if ((i4 & 8) != 0) {
            function0 = null;
        }
        parseState(baseVmFragment, resultState, function1, function12, function0);
    }

    public static final <T> void parseState(@NotNull BaseVmDialogActivity<?> baseVmDialogActivity, @NotNull ResultState<? extends T> resultState, @NotNull Function1<? super T, Unit> onSuccess, @Nullable Function1<? super AppException, Unit> function1, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseVmDialogActivity, "<this>");
        Intrinsics.checkNotNullParameter(resultState, "resultState");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (resultState instanceof ResultState.Loading) {
            baseVmDialogActivity.showLoading(((ResultState.Loading) resultState).getLoadingMessage());
        } else if (resultState instanceof ResultState.Success) {
            baseVmDialogActivity.dismissLoading();
            onSuccess.invoke((Object) ((ResultState.Success) resultState).getData());
        } else if (resultState instanceof ResultState.Error) {
            baseVmDialogActivity.dismissLoading();
            if (function1 != null) {
                function1.invoke(((ResultState.Error) resultState).getError());
            }
        }
    }

    public static final <T> void parseState(@NotNull BaseVmFragment<?> baseVmFragment, @NotNull ResultState<? extends T> resultState, @NotNull Function1<? super T, Unit> onSuccess, @Nullable Function1<? super AppException, Unit> function1, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseVmFragment, "<this>");
        Intrinsics.checkNotNullParameter(resultState, "resultState");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (resultState instanceof ResultState.Loading) {
            baseVmFragment.showLoading(((ResultState.Loading) resultState).getLoadingMessage());
        } else if (resultState instanceof ResultState.Success) {
            onSuccess.invoke((Object) ((ResultState.Success) resultState).getData());
        } else if (!(resultState instanceof ResultState.Error) || function1 == null) {
        } else {
            function1.invoke(((ResultState.Error) resultState).getError());
        }
    }
}
