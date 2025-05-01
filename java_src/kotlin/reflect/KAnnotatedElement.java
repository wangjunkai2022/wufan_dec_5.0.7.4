package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: KAnnotatedElement.kt */
/* loaded from: classes6.dex */
public interface KAnnotatedElement {
    @NotNull
    List<Annotation> getAnnotations();
}
