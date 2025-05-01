.class Lcom/join/mgps/activity/SimulatorFastEntryActivity_$d;
.super Ljava/lang/Object;
.source "SimulatorFastEntryActivity_.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->onViewChanged(La4/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/SimulatorFastEntryActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$d;->b:Lcom/join/mgps/activity/SimulatorFastEntryActivity_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$d;->b:Lcom/join/mgps/activity/SimulatorFastEntryActivity_;

    invoke-virtual {p1}, Lcom/join/mgps/activity/a3;->setNetwork()V

    return-void
.end method
