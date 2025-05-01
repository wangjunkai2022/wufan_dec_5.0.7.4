.class Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;
.super Ljava/lang/Object;
.source "ModLoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/mod/activity/ModLoadingActivity$f;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/mod/activity/ModLoadingActivity$f;


# direct methods
.method constructor <init>(Lcom/join/mgps/mod/activity/ModLoadingActivity$f;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;->c:Lcom/join/mgps/mod/activity/ModLoadingActivity$f;

    iput p2, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;->c:Lcom/join/mgps/mod/activity/ModLoadingActivity$f;

    iget-object v0, v0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f;->b:Lcom/join/mgps/mod/activity/ModLoadingActivity;

    invoke-static {v0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->s0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;->c:Lcom/join/mgps/mod/activity/ModLoadingActivity$f;

    iget-object v0, v0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f;->b:Lcom/join/mgps/mod/activity/ModLoadingActivity;

    invoke-static {v0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->t0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;->c:Lcom/join/mgps/mod/activity/ModLoadingActivity$f;

    iget-object v1, v1, Lcom/join/mgps/mod/activity/ModLoadingActivity$f;->b:Lcom/join/mgps/mod/activity/ModLoadingActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f10035e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity$f$a;->b:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
