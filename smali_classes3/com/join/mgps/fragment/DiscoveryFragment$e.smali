.class Lcom/join/mgps/fragment/DiscoveryFragment$e;
.super Ljava/lang/Object;
.source "DiscoveryFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


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
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragment$e;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$e;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragment;->X(Lcom/join/mgps/fragment/DiscoveryFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$e;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/DiscoveryFragment;->Z(Lcom/join/mgps/fragment/DiscoveryFragment;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$e;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/DiscoveryFragment;->E:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->H()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$e;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/DiscoveryFragment;->E:Lcom/join/android/app/component/video/c;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/c;->M(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$e;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragment;->a0(Lcom/join/mgps/fragment/DiscoveryFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragment$e;->b:Lcom/join/mgps/fragment/DiscoveryFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/DiscoveryFragment;->h0()V

    return-void
.end method
