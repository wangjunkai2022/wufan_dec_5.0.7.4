.class Lcom/papa91/view/AchievementDoneFloatDialog$1;
.super Ljava/lang/Object;
.source "AchievementDoneFloatDialog.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/view/AchievementDoneFloatDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/view/AchievementDoneFloatDialog;


# direct methods
.method constructor <init>(Lcom/papa91/view/AchievementDoneFloatDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/view/AchievementDoneFloatDialog$1;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog$1;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    invoke-static {v0}, Lcom/papa91/view/AchievementDoneFloatDialog;->access$000(Lcom/papa91/view/AchievementDoneFloatDialog;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog$1;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    invoke-static {v0}, Lcom/papa91/view/AchievementDoneFloatDialog;->access$100(Lcom/papa91/view/AchievementDoneFloatDialog;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog$1;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    invoke-static {v0}, Lcom/papa91/view/AchievementDoneFloatDialog;->access$200(Lcom/papa91/view/AchievementDoneFloatDialog;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog$1;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-static {v0, v1}, Lcom/papa91/view/AchievementDoneFloatDialog;->access$202(Lcom/papa91/view/AchievementDoneFloatDialog;Landroid/os/Handler;)Landroid/os/Handler;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog$1;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    invoke-static {v0}, Lcom/papa91/view/AchievementDoneFloatDialog;->access$200(Lcom/papa91/view/AchievementDoneFloatDialog;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/papa91/view/AchievementDoneFloatDialog$1;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    iget-object v1, v1, Lcom/papa91/view/AchievementDoneFloatDialog;->dimissRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0xfa0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method
