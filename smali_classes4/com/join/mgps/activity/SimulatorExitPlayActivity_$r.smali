.class Lcom/join/mgps/activity/SimulatorExitPlayActivity_$r;
.super Ljava/lang/Object;
.source "SimulatorExitPlayActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SimulatorExitPlayActivity_;->A0(Lcom/join/mgps/dto/SimulatorAchievementBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SimulatorAchievementBean;

.field final synthetic c:Lcom/join/mgps/activity/SimulatorExitPlayActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SimulatorExitPlayActivity_;Lcom/join/mgps/dto/SimulatorAchievementBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$r;->c:Lcom/join/mgps/activity/SimulatorExitPlayActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$r;->b:Lcom/join/mgps/dto/SimulatorAchievementBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$r;->c:Lcom/join/mgps/activity/SimulatorExitPlayActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$r;->b:Lcom/join/mgps/dto/SimulatorAchievementBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/SimulatorExitPlayActivity_;->H0(Lcom/join/mgps/activity/SimulatorExitPlayActivity_;Lcom/join/mgps/dto/SimulatorAchievementBean;)V

    return-void
.end method
