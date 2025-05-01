package kotlin.coroutines.jvm.internal;

import com.kuaishou.weapon.p0.t;
import com.xinzhu.overmind.utils.helpers.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;
/* compiled from: DebugMetadata.kt */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface DebugMetadata {
    @JvmName(name = "c")
    String c() default "";

    @JvmName(name = f.f68332a)
    String f() default "";

    @JvmName(name = "i")
    int[] i() default {};

    @JvmName(name = t.f55685d)
    int[] l() default {};

    @JvmName(name = "m")
    String m() default "";

    @JvmName(name = t.f55689h)
    String[] n() default {};

    @JvmName(name = "s")
    String[] s() default {};

    @JvmName(name = "v")
    int v() default 1;
}
