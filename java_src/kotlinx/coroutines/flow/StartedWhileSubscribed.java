package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharingStarted.kt */
/* loaded from: classes6.dex */
public final class StartedWhileSubscribed implements r {

    /* renamed from: b  reason: collision with root package name */
    private final long f70832b;

    /* renamed from: c  reason: collision with root package name */
    private final long f70833c;

    public StartedWhileSubscribed(long j4, long j5) {
        this.f70832b = j4;
        this.f70833c = j5;
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j4 + " ms) cannot be negative").toString());
        }
        if (j5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j5 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.r
    @NotNull
    public e<SharingCommand> a(@NotNull u<Integer> uVar) {
        return g.g0(g.k0(g.b2(uVar, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f70832b == startedWhileSubscribed.f70832b && this.f70833c == startedWhileSubscribed.f70833c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (com.join.kotlin.ui.modleregin.modle.a.a(this.f70832b) * 31) + com.join.kotlin.ui.modleregin.modle.a.a(this.f70833c);
    }

    @NotNull
    public String toString() {
        List createListBuilder;
        List build;
        String joinToString$default;
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(2);
        if (this.f70832b > 0) {
            createListBuilder.add("stopTimeout=" + this.f70832b + "ms");
        }
        if (this.f70833c < Long.MAX_VALUE) {
            createListBuilder.add("replayExpiration=" + this.f70833c + "ms");
        }
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default);
        sb.append(')');
        return sb.toString();
    }
}
