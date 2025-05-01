.class Lcom/join/mgps/activity/MiniGameLoadingActivity$e$a;
.super Ljava/lang/Object;
.source "MiniGameLoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MiniGameLoadingActivity$e;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/MiniGameLoadingActivity$e;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity$e;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e$a;->c:Lcom/join/mgps/activity/MiniGameLoadingActivity$e;

    iput p2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e$a;->c:Lcom/join/mgps/activity/MiniGameLoadingActivity$e;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    iget v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e$a;->b:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e$a;->c:Lcom/join/mgps/activity/MiniGameLoadingActivity$e;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f10035e

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$e$a;->b:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
