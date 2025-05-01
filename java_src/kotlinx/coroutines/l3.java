package kotlinx.coroutines;

import kotlin.PublishedApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* compiled from: Unconfined.kt */
@PublishedApi
/* loaded from: classes6.dex */
public final class l3 extends AbstractCoroutineContextElement {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final a f71212c = new a(null);
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public boolean f71213b;

    /* compiled from: Unconfined.kt */
    /* loaded from: classes6.dex */
    public static final class a implements CoroutineContext.Key<l3> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l3() {
        super(f71212c);
    }
}
