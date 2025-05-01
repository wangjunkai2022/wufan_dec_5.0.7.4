package kotlin.reflect;

import java.util.List;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: KType.kt */
/* loaded from: classes6.dex */
public interface KType extends KAnnotatedElement {

    /* compiled from: KType.kt */
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getArguments$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getClassifier$annotations() {
        }
    }

    @NotNull
    List<KTypeProjection> getArguments();

    @Nullable
    KClassifier getClassifier();

    boolean isMarkedNullable();
}
