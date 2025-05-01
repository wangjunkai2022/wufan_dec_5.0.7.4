package com.join.kotlin.base.ext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ViewBindUtil.kt */
/* loaded from: classes3.dex */
public final class ViewBindUtilKt {
    @JvmName(name = "generateDataBindingHolder")
    @NotNull
    public static final <VB extends ViewDataBinding> DataBindingHolder<VB> generateDataBindingHolder(@NotNull Context context, int i4, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DataBindingHolder<>(DataBindingUtil.inflate(LayoutInflater.from(context), i4, viewGroup, false));
    }

    @JvmName(name = "inflateWithGeneric")
    @NotNull
    public static final <VB extends ViewBinding> VB inflateWithGeneric(@NotNull AppCompatActivity appCompatActivity, @NotNull final LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        VB vb = (VB) withGenericBindingClass(appCompatActivity, new Function1<Class<VB>, VB>() { // from class: com.join.kotlin.base.ext.ViewBindUtilKt$inflateBindingWithGeneric$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<TVB;>;)TVB; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull Class clazz) {
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                Object invoke = clazz.getMethod("inflate", LayoutInflater.class).invoke(null, layoutInflater);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type VB of com.join.kotlin.base.ext.ViewBindUtilKt.inflateBindingWithGeneric");
                return (ViewBinding) invoke;
            }
        });
        if (vb instanceof ViewDataBinding) {
            ((ViewDataBinding) vb).setLifecycleOwner(appCompatActivity);
        }
        return vb;
    }

    private static final <VB extends ViewBinding> VB withGenericBindingClass(Object obj, Function1<? super Class<VB>, ? extends VB> function1) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        for (Class<? super Object> superclass = obj.getClass().getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (genericSuperclass instanceof ParameterizedType) {
                try {
                    Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1];
                    Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<VB of com.join.kotlin.base.ext.ViewBindUtilKt.withGenericBindingClass>");
                    return function1.invoke((Class) type);
                } catch (ClassCastException | NoSuchMethodException unused) {
                    continue;
                } catch (InvocationTargetException e5) {
                    Throwable targetException = e5.getTargetException();
                    Intrinsics.checkNotNullExpressionValue(targetException, "e.targetException");
                    throw targetException;
                }
            }
            genericSuperclass = superclass.getGenericSuperclass();
        }
        throw new IllegalArgumentException("There is no generic of ViewBinding.");
    }

    @JvmName(name = "inflateWithGeneric")
    @NotNull
    public static final <VB extends ViewBinding> VB inflateWithGeneric(@NotNull Fragment fragment, @NotNull final LayoutInflater layoutInflater, @Nullable final ViewGroup viewGroup, final boolean z4) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        VB vb = (VB) withGenericBindingClass(fragment, new Function1<Class<VB>, VB>() { // from class: com.join.kotlin.base.ext.ViewBindUtilKt$inflateBindingWithGeneric$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<TVB;>;)TVB; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ViewBinding invoke(@NotNull Class clazz) {
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                Object invoke = clazz.getMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE).invoke(null, layoutInflater, viewGroup, Boolean.valueOf(z4));
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type VB of com.join.kotlin.base.ext.ViewBindUtilKt.inflateBindingWithGeneric");
                return (ViewBinding) invoke;
            }
        });
        if (vb instanceof ViewDataBinding) {
            ((ViewDataBinding) vb).setLifecycleOwner(fragment.getViewLifecycleOwner());
        }
        return vb;
    }
}
