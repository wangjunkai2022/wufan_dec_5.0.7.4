package kotlin.jvm;

import j1.b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
/* compiled from: JvmDefault.kt */
@Target({ElementType.METHOD})
@SinceKotlin(version = b.f69563b)
@Deprecated(message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JvmDefault {
}
