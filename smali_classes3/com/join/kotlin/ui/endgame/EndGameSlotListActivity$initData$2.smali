.class final Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$2;
.super Lkotlin/jvm/internal/Lambda;
.source "EndGameSlotListActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/mgps/dto/ArchiveListBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$2;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/ArchiveListBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$2;->invoke(Lcom/join/mgps/dto/ArchiveListBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/mgps/dto/ArchiveListBean;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$2;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getCommitText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "\u5b8c\u6210("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v2, "0"

    goto :goto_0

    :cond_0
    const-string v2, "1"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/1)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$2;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getCommitEnableStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
