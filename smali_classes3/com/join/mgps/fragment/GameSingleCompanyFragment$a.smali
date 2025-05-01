.class Lcom/join/mgps/fragment/GameSingleCompanyFragment$a;
.super Ljava/lang/Object;
.source "GameSingleCompanyFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameSingleCompanyFragment;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameSingleCompanyFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameSingleCompanyFragment$a;->b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSingleCompanyFragment$a;->b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/GameSingleCompanyFragment;->V(Lcom/join/mgps/fragment/GameSingleCompanyFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSingleCompanyFragment$a;->b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/GameSingleCompanyFragment;->W(Lcom/join/mgps/fragment/GameSingleCompanyFragment;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSingleCompanyFragment$a;->b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameSingleCompanyFragment;->Z()V

    return-void
.end method
