.class Lcom/join/mgps/fragment/DiscoveryFragmentV3$b;
.super Ljava/lang/Object;
.source "DiscoveryFragmentV3.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$b;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$b;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->a0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$b;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->t0()V

    return-void
.end method
