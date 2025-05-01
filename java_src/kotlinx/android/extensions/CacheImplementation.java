package kotlinx.android.extensions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* compiled from: CacheImplementation.kt */
/* loaded from: classes.dex */
public enum CacheImplementation {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;
    
    @NotNull
    public static final a Companion = new a(null);
    @NotNull
    private static final CacheImplementation DEFAULT;

    /* compiled from: CacheImplementation.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CacheImplementation a() {
            return CacheImplementation.DEFAULT;
        }
    }

    static {
        DEFAULT = r0;
    }
}
