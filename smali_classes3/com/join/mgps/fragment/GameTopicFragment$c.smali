.class Lcom/join/mgps/fragment/GameTopicFragment$c;
.super Ljava/lang/Object;
.source "GameTopicFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameTopicFragment;->g0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/GameTopicFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameTopicFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameTopicFragment$c;->b:Lcom/join/mgps/fragment/GameTopicFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameTopicFragment$c;->b:Lcom/join/mgps/fragment/GameTopicFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameTopicFragment;->h0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/GameTopicFragment$c;->b:Lcom/join/mgps/fragment/GameTopicFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameTopicFragment;->m0()V

    :cond_0
    return-void
.end method
