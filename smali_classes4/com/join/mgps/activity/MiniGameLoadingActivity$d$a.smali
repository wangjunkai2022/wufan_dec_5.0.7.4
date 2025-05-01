.class Lcom/join/mgps/activity/MiniGameLoadingActivity$d$a;
.super Ljava/lang/Object;
.source "MiniGameLoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MiniGameLoadingActivity$d;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d$a;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d$a;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity$d;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d$a;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity$d;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v2, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f10035e

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "0%"

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
