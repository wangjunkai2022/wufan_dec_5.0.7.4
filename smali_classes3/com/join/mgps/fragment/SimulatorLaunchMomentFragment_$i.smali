.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_$i;
.super Ljava/lang/Object;
.source "SimulatorLaunchMomentFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;->h0(Lcom/join/mgps/dto/SimulatorMomentBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SimulatorMomentBean;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;Lcom/join/mgps/dto/SimulatorMomentBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_$i;->d:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_$i;->b:Lcom/join/mgps/dto/SimulatorMomentBean;

    iput p3, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_$i;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_$i;->d:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_$i;->b:Lcom/join/mgps/dto/SimulatorMomentBean;

    iget v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_$i;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;->l0(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;Lcom/join/mgps/dto/SimulatorMomentBean;I)V

    return-void
.end method
