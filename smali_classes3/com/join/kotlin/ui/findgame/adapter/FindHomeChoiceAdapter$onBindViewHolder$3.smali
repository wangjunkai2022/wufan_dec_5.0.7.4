.class final Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;
.super Lkotlin/jvm/internal/Lambda;
.source "FindHomeChoiceAdapter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $da:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;",
            ">;",
            "Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->$da:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->this$0:Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->$da:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getComponent_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, "461506587"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/16 v1, 0x1d

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 5
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->$da:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getComponent_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 6
    new-instance v1, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    const-string v2, "3"

    .line 7
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 9
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->this$0:Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->this$0:Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->$da:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getTpl_type()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter$onBindViewHolder$3;->$da:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;

    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getComponent_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/IntentUtil;->goColloctionList(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
