.class Lcom/join/mgps/fragment/GameSingleCompanyFragment$b;
.super Ljava/lang/Object;
.source "GameSingleCompanyFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


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
    iput-object p1, p0, Lcom/join/mgps/fragment/GameSingleCompanyFragment$b;->b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSingleCompanyFragment$b;->b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/GameSingleCompanyFragment;->V(Lcom/join/mgps/fragment/GameSingleCompanyFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSingleCompanyFragment$b;->b:Lcom/join/mgps/fragment/GameSingleCompanyFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameSingleCompanyFragment;->Z()V

    return-void
.end method
