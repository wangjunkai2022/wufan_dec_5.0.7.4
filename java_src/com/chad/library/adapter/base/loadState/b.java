package com.chad.library.adapter.base.loadState;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LoadState.kt */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9070a;

    /* compiled from: LoadState.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f9071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Throwable error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f9071b = error;
        }

        @NotNull
        public final Throwable b() {
            return this.f9071b;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a() == aVar.a() && Intrinsics.areEqual(this.f9071b, aVar.f9071b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return com.chad.library.adapter.base.loadState.a.a(a()) + this.f9071b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.f9071b + ')';
        }
    }

    /* compiled from: LoadState.kt */
    /* renamed from: com.chad.library.adapter.base.loadState.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0232b extends b {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public static final C0232b f9072b = new C0232b();

        private C0232b() {
            super(false, null);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C0232b) && a() == ((C0232b) obj).a();
        }

        public int hashCode() {
            return com.chad.library.adapter.base.loadState.a.a(a());
        }

        @NotNull
        public String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    /* compiled from: LoadState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends b {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public static final c f9073b = new c();

        private c() {
            super(false, null);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof c) && a() == ((c) obj).a();
        }

        public int hashCode() {
            return com.chad.library.adapter.base.loadState.a.a(a());
        }

        @NotNull
        public String toString() {
            return "None(endOfPaginationReached=" + a() + ')';
        }
    }

    /* compiled from: LoadState.kt */
    /* loaded from: classes2.dex */
    public static final class d extends b {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public static final a f9074b = new a(null);
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        private static final d f9075c = new d(true);
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private static final d f9076d = new d(false);

        /* compiled from: LoadState.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final d a() {
                return d.f9075c;
            }

            @NotNull
            public final d b() {
                return d.f9076d;
            }
        }

        public d(boolean z4) {
            super(z4, null);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof d) && a() == ((d) obj).a();
        }

        public int hashCode() {
            return com.chad.library.adapter.base.loadState.a.a(a());
        }

        @NotNull
        public String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    private b(boolean z4) {
        this.f9070a = z4;
    }

    public /* synthetic */ b(boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4);
    }

    public final boolean a() {
        return this.f9070a;
    }
}
