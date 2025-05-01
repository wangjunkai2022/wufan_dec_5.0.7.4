.class Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;
.super Ljava/lang/Object;
.source "DiscoveryFragmentV3.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


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
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->a0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->b0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    iget-object v0, v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->E:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->H()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    iget-object v0, v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->E:Lcom/join/android/app/component/video/c;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/c;->M(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->c0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->t0()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->e0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;I)I

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->f0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->d0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->u0(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$c;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->s0()V

    return-void
.end method
