.class Lcom/join/mgps/fragment/GameOlGiftPackageFragment$b;
.super Ljava/lang/Object;
.source "GameOlGiftPackageFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$b;->b:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$b;->b:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->Z(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$b;->b:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->a0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$b;->b:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->b0(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;Z)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$b;->b:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->j0()V

    return-void
.end method
