.class final Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;
.super Lkotlin/jvm/internal/Lambda;
.source "ViewBindUtil.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/base/ext/ViewBindUtilKt;->inflateWithGeneric(Landroidx/fragment/app/Fragment;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Class<",
        "TVB;>;TVB;>;"
    }
.end annotation


# instance fields
.field final synthetic $attachToParent:Z

.field final synthetic $layoutInflater:Landroid/view/LayoutInflater;

.field final synthetic $parent:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;->$layoutInflater:Landroid/view/LayoutInflater;

    iput-object p2, p0, Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;->$parent:Landroid/view/ViewGroup;

    iput-boolean p3, p0, Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;->$attachToParent:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Class;)Landroidx/viewbinding/ViewBinding;
    .locals 6
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TVB;>;)TVB;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Class;

    .line 2
    const-class v2, Landroid/view/LayoutInflater;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Landroid/view/ViewGroup;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "inflate"

    .line 3
    invoke-virtual {p1, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    iget-object v1, p0, Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;->$layoutInflater:Landroid/view/LayoutInflater;

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;->$parent:Landroid/view/ViewGroup;

    aput-object v1, v0, v4

    iget-boolean v1, p0, Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;->$attachToParent:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, v5

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type VB of com.join.kotlin.base.ext.ViewBindUtilKt.inflateBindingWithGeneric"

    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/viewbinding/ViewBinding;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/ext/ViewBindUtilKt$inflateBindingWithGeneric$3;->invoke(Ljava/lang/Class;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    return-object p1
.end method
