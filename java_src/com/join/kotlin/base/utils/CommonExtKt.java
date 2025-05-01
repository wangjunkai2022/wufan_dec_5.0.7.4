package com.join.kotlin.base.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.join.kotlin.base.ext.SystemServiceExtKt;
import com.join.kotlin.base.view.ViewExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: CommonExt.kt */
@SourceDebugExtension({"SMAP\nCommonExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,142:1\n13579#2,2:143\n13579#2,2:145\n*S KotlinDebug\n*F\n+ 1 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n*L\n112#1:143,2\n126#1:145,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonExtKt {
    public static final boolean checkAccessibilityServiceEnabled(@NotNull Context context, @NotNull String serviceName) {
        boolean equals;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        while (simpleStringSplitter.hasNext()) {
            equals = StringsKt__StringsJVMKt.equals(simpleStringSplitter.next(), serviceName, true);
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public static final void copyToClipboard(@NotNull Context context, @NotNull String text, @NotNull String label) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(label, "label");
        ClipData newPlainText = ClipData.newPlainText(label, text);
        ClipboardManager clipboardManager = SystemServiceExtKt.getClipboardManager(context);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }

    public static /* synthetic */ void copyToClipboard$default(Context context, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = "悟饭游戏";
        }
        copyToClipboard(context, str, str2);
    }

    public static final int dp2px(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) ((i4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int getScreenHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int getScreenWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final /* synthetic */ <T> void notNull(T t4, Function1<? super T, Unit> notNullAction, Function0<Unit> nullAction) {
        Intrinsics.checkNotNullParameter(notNullAction, "notNullAction");
        Intrinsics.checkNotNullParameter(nullAction, "nullAction");
        if (t4 != null) {
            notNullAction.invoke(t4);
        } else {
            nullAction.invoke();
        }
    }

    public static /* synthetic */ void notNull$default(Object obj, Function1 notNullAction, Function0 nullAction, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            nullAction = new Function0<Unit>() { // from class: com.join.kotlin.base.utils.CommonExtKt$notNull$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        Intrinsics.checkNotNullParameter(notNullAction, "notNullAction");
        Intrinsics.checkNotNullParameter(nullAction, "nullAction");
        if (obj != null) {
            notNullAction.invoke(obj);
        } else {
            nullAction.invoke();
        }
    }

    public static final int px2dp(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) ((i4 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final void setOnclick(@NotNull View[] views, @NotNull final Function1<? super View, Unit> onClick) {
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        for (View view : views) {
            if (view != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.base.utils.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CommonExtKt.setOnclick$lambda$1$lambda$0(Function1.this, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnclick$lambda$1$lambda$0(Function1 onClick, View view) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullExpressionValue(view, "view");
        onClick.invoke(view);
    }

    public static final void setOnclickNoRepeat(@NotNull View[] views, long j4, @NotNull final Function1<? super View, Unit> onClick) {
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        for (View view : views) {
            if (view != null) {
                ViewExtKt.clickNoRepeat(view, j4, new Function1<View, Unit>() { // from class: com.join.kotlin.base.utils.CommonExtKt$setOnclickNoRepeat$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                        invoke2(view2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull View view2) {
                        Intrinsics.checkNotNullParameter(view2, "view");
                        onClick.invoke(view2);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void setOnclickNoRepeat$default(View[] viewArr, long j4, Function1 function1, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 500;
        }
        setOnclickNoRepeat(viewArr, j4, function1);
    }

    @NotNull
    public static final Spanned toHtml(@NotNull String str, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned fromHtml = Html.fromHtml(str, i4);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "{\n        Html.fromHtml(this, flag)\n    }");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        Intrinsics.checkNotNullExpressionValue(fromHtml2, "{\n        Html.fromHtml(this)\n    }");
        return fromHtml2;
    }

    public static /* synthetic */ Spanned toHtml$default(String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return toHtml(str, i4);
    }

    public static final int dp2px(@NotNull View view, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (int) ((i4 * view.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int px2dp(@NotNull View view, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (int) ((i4 / view.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
