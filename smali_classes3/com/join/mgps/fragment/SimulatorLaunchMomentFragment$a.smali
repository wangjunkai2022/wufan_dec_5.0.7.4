.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$a;
.super Ljava/lang/Object;
.source "SimulatorLaunchMomentFragment.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$a;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$a;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->W(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$a;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->V(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->a0(I)V

    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method
