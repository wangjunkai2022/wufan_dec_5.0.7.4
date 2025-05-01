.class final Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "CreateSourceHopeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/base/net/AppException;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/net/AppException;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$2;->invoke(Lcom/join/kotlin/base/net/AppException;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/net/AppException;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/base/net/AppException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/kotlin/base/net/AppException;->getErrorMsg()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$2;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-static {p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showError$default(Lcom/kingja/loadsir/core/b;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method
