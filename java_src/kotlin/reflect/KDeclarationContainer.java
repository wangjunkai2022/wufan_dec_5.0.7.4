package kotlin.reflect;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
/* compiled from: KDeclarationContainer.kt */
/* loaded from: classes6.dex */
public interface KDeclarationContainer {
    @NotNull
    Collection<KCallable<?>> getMembers();
}
