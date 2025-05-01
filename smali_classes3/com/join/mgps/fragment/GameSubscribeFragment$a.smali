.class Lcom/join/mgps/fragment/GameSubscribeFragment$a;
.super Ljava/lang/Object;
.source "GameSubscribeFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameSubscribeFragment;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/GameSubscribeFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameSubscribeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$a;->b:Lcom/join/mgps/fragment/GameSubscribeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$a;->b:Lcom/join/mgps/fragment/GameSubscribeFragment;

    const/4 v1, 0x1

    iput v1, v0, Lcom/join/mgps/fragment/GameSubscribeFragment;->k:I

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->X()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$a;->b:Lcom/join/mgps/fragment/GameSubscribeFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->b0()V

    return-void
.end method
