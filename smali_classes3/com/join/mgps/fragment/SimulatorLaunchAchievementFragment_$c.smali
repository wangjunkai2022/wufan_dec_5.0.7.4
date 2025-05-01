.class Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_$c;
.super Ljava/lang/Object;
.source "SimulatorLaunchAchievementFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;->a0(Lcom/join/mgps/dto/SimulatorAchievementBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SimulatorAchievementBean;

.field final synthetic c:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;Lcom/join/mgps/dto/SimulatorAchievementBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_$c;->c:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_$c;->b:Lcom/join/mgps/dto/SimulatorAchievementBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_$c;->c:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_$c;->b:Lcom/join/mgps/dto/SimulatorAchievementBean;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;->b0(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;Lcom/join/mgps/dto/SimulatorAchievementBean;)V

    return-void
.end method
