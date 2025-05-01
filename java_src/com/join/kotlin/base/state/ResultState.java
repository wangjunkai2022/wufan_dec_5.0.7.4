package com.join.kotlin.base.state;

import com.join.kotlin.base.net.AppException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ResultState.kt */
/* loaded from: classes3.dex */
public abstract class ResultState<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: ResultState.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> ResultState<T> onRequestError(@NotNull AppException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        @NotNull
        public final <T> ResultState<T> onRequestLoading(@NotNull String loadingMessage) {
            Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
            return new Loading(loadingMessage);
        }

        @NotNull
        public final <T> ResultState<T> onRequestSuccess(@Nullable T t4) {
            return new Success(t4);
        }
    }

    /* compiled from: ResultState.kt */
    /* loaded from: classes3.dex */
    public static final class Error extends ResultState {
        @NotNull
        private final AppException error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull AppException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, AppException appException, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                appException = error.error;
            }
            return error.copy(appException);
        }

        @NotNull
        public final AppException component1() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull AppException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        @NotNull
        public final AppException getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    /* compiled from: ResultState.kt */
    /* loaded from: classes3.dex */
    public static final class Loading extends ResultState {
        @NotNull
        private final String loadingMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(@NotNull String loadingMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
            this.loadingMessage = loadingMessage;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = loading.loadingMessage;
            }
            return loading.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.loadingMessage;
        }

        @NotNull
        public final Loading copy(@NotNull String loadingMessage) {
            Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
            return new Loading(loadingMessage);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.loadingMessage, ((Loading) obj).loadingMessage);
        }

        @NotNull
        public final String getLoadingMessage() {
            return this.loadingMessage;
        }

        public int hashCode() {
            return this.loadingMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loading(loadingMessage=" + this.loadingMessage + ')';
        }
    }

    /* compiled from: ResultState.kt */
    /* loaded from: classes3.dex */
    public static final class Success<T> extends ResultState<T> {
        @Nullable
        private final T data;

        public Success(@Nullable T t4) {
            super(null);
            this.data = t4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        @Nullable
        public final T component1() {
            return this.data;
        }

        @NotNull
        public final Success<T> copy(@Nullable T t4) {
            return new Success<>(t4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.data, ((Success) obj).data);
        }

        @Nullable
        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t4 = this.data;
            if (t4 == null) {
                return 0;
            }
            return t4.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(data=" + this.data + ')';
        }
    }

    private ResultState() {
    }

    public /* synthetic */ ResultState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
