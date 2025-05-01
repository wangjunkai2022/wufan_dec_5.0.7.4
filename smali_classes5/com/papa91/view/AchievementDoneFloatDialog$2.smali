.class Lcom/papa91/view/AchievementDoneFloatDialog$2;
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
    iput-object p1, p0, Lcom/papa91/view/AchievementDoneFloatDialog$2;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog$2;->this$0:Lcom/papa91/view/AchievementDoneFloatDialog;

    invoke-virtual {v0}, Lcom/papa91/view/AchievementDoneFloatDialog;->dismiss()V

    return-void
.end method
