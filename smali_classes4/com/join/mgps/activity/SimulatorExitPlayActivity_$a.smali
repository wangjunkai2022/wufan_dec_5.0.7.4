.class Lcom/join/mgps/activity/SimulatorExitPlayActivity_$a;
.super Ljava/lang/Object;
.source "SimulatorExitPlayActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SimulatorExitPlayActivity_;->w0(Lcom/join/mgps/dto/SimulatorExitPlayResponseData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SimulatorExitPlayResponseData;

.field final synthetic c:Lcom/join/mgps/activity/SimulatorExitPlayActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SimulatorExitPlayActivity_;Lcom/join/mgps/dto/SimulatorExitPlayResponseData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$a;->c:Lcom/join/mgps/activity/SimulatorExitPlayActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$a;->b:Lcom/join/mgps/dto/SimulatorExitPlayResponseData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$a;->c:Lcom/join/mgps/activity/SimulatorExitPlayActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity_$a;->b:Lcom/join/mgps/dto/SimulatorExitPlayResponseData;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/SimulatorExitPlayActivity_;->I0(Lcom/join/mgps/activity/SimulatorExitPlayActivity_;Lcom/join/mgps/dto/SimulatorExitPlayResponseData;)V

    return-void
.end method
