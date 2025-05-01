.class Lcom/join/mgps/adapter/PapaMainV2Adapter$f;
.super Lw1/p;
.source "PapaMainV2Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/PapaMainV2Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

.field final synthetic c:Lcom/join/mgps/adapter/PapaMainV2Adapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-direct {p0}, Lw1/p;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lw1/p;->onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->o(Lcom/join/mgps/adapter/PapaMainV2Adapter;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->p(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->q(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-static {p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->r(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method public onClickCover()V
    .locals 3

    .line 1
    invoke-super {p0}, Lw1/p;->onClickCover()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-static {v2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->o(Lcom/join/mgps/adapter/PapaMainV2Adapter;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->p(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->q(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-static {v0, v1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->r(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method
