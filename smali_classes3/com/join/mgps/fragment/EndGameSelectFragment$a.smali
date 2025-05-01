.class Lcom/join/mgps/fragment/EndGameSelectFragment$a;
.super Ljava/lang/Object;
.source "EndGameSelectFragment.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameSelectFragment;->a0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameSelectFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameSelectFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$a;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMoreRequested()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$a;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->W(Lcom/join/mgps/fragment/EndGameSelectFragment;)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$a;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->V(Lcom/join/mgps/fragment/EndGameSelectFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/EndGameSelectFragment;->b0(I)V

    return-void
.end method
