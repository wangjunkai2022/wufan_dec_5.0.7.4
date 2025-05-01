.class final Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CreateSourceHopeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/CreateSourceHopeActivity;->onWantClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$1;->invoke(Lcom/join/mgps/dto/ResponseModel;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/mgps/dto/ResponseModel;)V
    .locals 1
    .param p1    # Lcom/join/mgps/dto/ResponseModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const-string/jumbo p1, "\u6570\u636e\u4e0a\u4f20\u6210\u529f"

    .line 3
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->loadData(Z)V

    goto :goto_1

    :cond_1
    const-string/jumbo p1, "\u6570\u636e\u4e0a\u4f20\u5931\u8d25"

    .line 5
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method
