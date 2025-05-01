.class Lcom/join/mgps/activity/SimulatorFastEntryActivity_$f;
.super Ljava/lang/Object;
.source "SimulatorFastEntryActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->g0(Lcom/join/mgps/dto/SimulatorFastEntryBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SimulatorFastEntryBean;

.field final synthetic c:Lcom/join/mgps/activity/SimulatorFastEntryActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;Lcom/join/mgps/dto/SimulatorFastEntryBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$f;->c:Lcom/join/mgps/activity/SimulatorFastEntryActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$f;->b:Lcom/join/mgps/dto/SimulatorFastEntryBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$f;->c:Lcom/join/mgps/activity/SimulatorFastEntryActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$f;->b:Lcom/join/mgps/dto/SimulatorFastEntryBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->j0(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;Lcom/join/mgps/dto/SimulatorFastEntryBean;)V

    return-void
.end method
