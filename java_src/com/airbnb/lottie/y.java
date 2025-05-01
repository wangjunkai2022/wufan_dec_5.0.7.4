package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
/* compiled from: LottieConfig.java */
/* loaded from: classes2.dex */
public class y {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    final com.airbnb.lottie.network.e f4378a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    final com.airbnb.lottie.network.d f4379b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f4380c;

    /* compiled from: LottieConfig.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private com.airbnb.lottie.network.e f4381a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private com.airbnb.lottie.network.d f4382b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4383c = false;

        /* compiled from: LottieConfig.java */
        /* loaded from: classes2.dex */
        class a implements com.airbnb.lottie.network.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ File f4384a;

            a(File file) {
                this.f4384a = file;
            }

            @Override // com.airbnb.lottie.network.d
            @NonNull
            public File a() {
                if (this.f4384a.isDirectory()) {
                    return this.f4384a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* compiled from: LottieConfig.java */
        /* renamed from: com.airbnb.lottie.y$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0152b implements com.airbnb.lottie.network.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.airbnb.lottie.network.d f4386a;

            C0152b(com.airbnb.lottie.network.d dVar) {
                this.f4386a = dVar;
            }

            @Override // com.airbnb.lottie.network.d
            @NonNull
            public File a() {
                File a5 = this.f4386a.a();
                if (a5.isDirectory()) {
                    return a5;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public y a() {
            return new y(this.f4381a, this.f4382b, this.f4383c);
        }

        @NonNull
        public b b(boolean z4) {
            this.f4383c = z4;
            return this;
        }

        @NonNull
        public b c(@NonNull File file) {
            if (this.f4382b == null) {
                this.f4382b = new a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public b d(@NonNull com.airbnb.lottie.network.d dVar) {
            if (this.f4382b == null) {
                this.f4382b = new C0152b(dVar);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public b e(@NonNull com.airbnb.lottie.network.e eVar) {
            this.f4381a = eVar;
            return this;
        }
    }

    private y(@Nullable com.airbnb.lottie.network.e eVar, @Nullable com.airbnb.lottie.network.d dVar, boolean z4) {
        this.f4378a = eVar;
        this.f4379b = dVar;
        this.f4380c = z4;
    }
}
