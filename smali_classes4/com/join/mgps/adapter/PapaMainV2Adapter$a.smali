.class Lcom/join/mgps/adapter/PapaMainV2Adapter$a;
.super Ljava/lang/Object;
.source "PapaMainV2Adapter.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/PapaMainV2Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/join/mgps/adapter/PapaMainV2Adapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;->b:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;->b:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "2-"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, p3, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->n(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;->a:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p2

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object p3

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getJump_type()I

    move-result v0

    const/16 v2, 0x1f

    if-ne v0, v2, :cond_0

    .line 6
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;-><init>(I)V

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v0

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getJump_type()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string v0, "1"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 8
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;

    invoke-direct {p2, v1}, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;-><init>(I)V

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result p3

    const/16 v0, 0x1d

    if-ne p3, v0, :cond_2

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getSub_title()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/join/mgps/Util/IntentDateBean;->setExt1(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p1

    const-string p3, "2"

    invoke-virtual {p1, p3}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;->b:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-static {p3}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->o(Lcom/join/mgps/adapter/PapaMainV2Adapter;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getSub_title()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/join/mgps/Util/IntentDateBean;->setExt1(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;->b:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-static {p3}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->o(Lcom/join/mgps/adapter/PapaMainV2Adapter;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 15
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;->b:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->p(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/lang/String;)V

    return-void
.end method
