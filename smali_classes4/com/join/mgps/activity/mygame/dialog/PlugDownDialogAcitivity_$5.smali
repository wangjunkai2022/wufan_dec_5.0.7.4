.class Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;
.super Ljava/lang/Object;
.source "PlugDownDialogAcitivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_;->updateUnzipRes(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_;

.field final synthetic val$progress:I

.field final synthetic val$size:J

.field final synthetic val$unzipSize:J


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_;JJI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_;

    iput-wide p2, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->val$size:J

    iput-wide p4, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->val$unzipSize:J

    iput p6, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->val$progress:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->this$0:Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_;

    iget-wide v1, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->val$size:J

    iget-wide v3, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->val$unzipSize:J

    iget v5, p0, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_$5;->val$progress:I

    invoke-static/range {v0 .. v5}, Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_;->access$201(Lcom/join/mgps/activity/mygame/dialog/PlugDownDialogAcitivity_;JJI)V

    return-void
.end method
