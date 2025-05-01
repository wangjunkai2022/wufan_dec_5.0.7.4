.class Lcom/join/mgps/fragment/DiscoveryFragment$d;
.super Ljava/lang/Object;
.source "DiscoveryFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DiscoveryFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/DiscoveryFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragment$d;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$d;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragment;->X(Lcom/join/mgps/fragment/DiscoveryFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$d;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/DiscoveryFragment;->h0()V

    return-void
.end method
