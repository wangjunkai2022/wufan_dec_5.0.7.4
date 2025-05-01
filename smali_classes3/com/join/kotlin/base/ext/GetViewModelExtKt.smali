.class public final Lcom/join/kotlin/base/ext/GetViewModelExtKt;
.super Ljava/lang/Object;
.source "GetViewModelExt.kt"


# direct methods
.method public static final synthetic getAppViewModel(Landroidx/appcompat/app/AppCompatActivity;)Lcom/join/kotlin/base/viewmodel/BaseViewModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Lcom/join/kotlin/base/viewmodel/BaseViewModel;",
            ">(",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ")TVM;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p0

    instance-of v0, p0, Lcom/join/kotlin/base/BaseApp;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/join/kotlin/base/BaseApp;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const-string/jumbo v0, "\u4f60\u7684Application\u6ca1\u6709\u7ee7\u627f\u6846\u67b6\u81ea\u5e26\u7684BaseApp\u7c7b\uff0c\u6682\u65f6\u65e0\u6cd5\u4f7f\u7528getAppViewModel\u8be5\u65b9\u6cd5"

    .line 2
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/BaseApp;->getAppViewModelProvider()Landroidx/lifecycle/ViewModelProvider;

    move-result-object p0

    const/4 v0, 0x4

    const-string v1, "VM"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    const-class v0, Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    return-object p0
.end method

.method public static final synthetic getAppViewModel(Landroidx/fragment/app/Fragment;)Lcom/join/kotlin/base/viewmodel/BaseViewModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Lcom/join/kotlin/base/viewmodel/BaseViewModel;",
            ">(",
            "Landroidx/fragment/app/Fragment;",
            ")TVM;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p0

    instance-of v0, p0, Lcom/join/kotlin/base/BaseApp;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/join/kotlin/base/BaseApp;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const-string/jumbo v0, "\u4f60\u7684Application\u6ca1\u6709\u7ee7\u627f\u6846\u67b6\u81ea\u5e26\u7684BaseApp\u7c7b\uff0c\u6682\u65f6\u65e0\u6cd5\u4f7f\u7528getAppViewModel\u8be5\u65b9\u6cd5"

    .line 5
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/BaseApp;->getAppViewModelProvider()Landroidx/lifecycle/ViewModelProvider;

    move-result-object p0

    const/4 v0, 0x4

    const-string v1, "VM"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    const-class v0, Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    return-object p0
.end method

.method public static final getVmClazz(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TVM;"
        }
    .end annotation

    const-string v0, "obj"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    return-object p0
.end method
