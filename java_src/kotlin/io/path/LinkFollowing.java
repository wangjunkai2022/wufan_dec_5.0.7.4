package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
/* compiled from: PathTreeWalk.kt */
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* loaded from: classes6.dex */
public final class LinkFollowing {
    @NotNull
    private static final Set<FileVisitOption> followVisitOption;
    @NotNull
    private static final Set<FileVisitOption> nofollowVisitOption;
    @NotNull
    public static final LinkFollowing INSTANCE = new LinkFollowing();
    @NotNull
    private static final LinkOption[] nofollowLinkOption = {LinkOption.NOFOLLOW_LINKS};
    @NotNull
    private static final LinkOption[] followLinkOption = new LinkOption[0];

    static {
        Set<FileVisitOption> emptySet;
        Set<FileVisitOption> of;
        emptySet = SetsKt__SetsKt.emptySet();
        nofollowVisitOption = emptySet;
        of = SetsKt__SetsJVMKt.setOf(FileVisitOption.FOLLOW_LINKS);
        followVisitOption = of;
    }

    private LinkFollowing() {
    }

    @NotNull
    public final LinkOption[] toLinkOptions(boolean z4) {
        return z4 ? followLinkOption : nofollowLinkOption;
    }

    @NotNull
    public final Set<FileVisitOption> toVisitOptions(boolean z4) {
        return z4 ? followVisitOption : nofollowVisitOption;
    }
}
