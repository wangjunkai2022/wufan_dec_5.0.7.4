.class final Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceShareActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/SourceShareActivity;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/base/state/ResultState<",
        "+",
        "Lcom/join/kotlin/quark/model/bean/SourceTabListBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/SourceShareActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/SourceShareActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/state/ResultState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/state/ResultState;)V
    .locals 9
    .param p1    # Lcom/join/kotlin/base/state/ResultState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/base/state/ResultState<",
            "Lcom/join/kotlin/quark/model/bean/SourceTabListBean;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-static {p1}, Lcom/join/kotlin/quark/SourceShareActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/SourceShareActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showError$default(Lcom/kingja/loadsir/core/b;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object v2, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    new-instance v4, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;

    invoke-direct {v4, v2}, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;-><init>(Lcom/join/kotlin/quark/SourceShareActivity;)V

    new-instance v5, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$2;

    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-direct {v5, v0}, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$2;-><init>(Lcom/join/kotlin/quark/SourceShareActivity;)V

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v8}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt;->parseState$default(Lcom/join/kotlin/base/activity/BaseVmActivity;Lcom/join/kotlin/base/state/ResultState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
