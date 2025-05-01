.class public Lcom/join/mgps/dialog/q1;
.super Landroid/app/AlertDialog;
.source "ModStandardDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field f:Lcom/github/snowdream/android/app/downloader/DownloadTask;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f110148

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method private c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/dialog/q1;->f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v1}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/q1;->f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->t(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/join/android/app/common/utils/n;->w()Landroid/app/Activity;

    move-result-object v1

    instance-of v1, v1, Lcom/join/mgps/activity/ModGameIndexActivity_;

    const-string v2, "modStdDialog"

    if-eqz v1, :cond_1

    .line 5
    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.wufun.game.start.std.game"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "from"

    .line 6
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {v0}, Lcom/join/mgps/activity/ModGameIndexActivity_;->o2(Landroid/content/Context;)Lcom/join/mgps/activity/ModGameIndexActivity_$d0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/ModGameIndexActivity_$d0;->a(Ljava/lang/String;)Lcom/join/mgps/activity/ModGameIndexActivity_$d0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/q1;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity_$d0;->b(Ljava/lang/String;)Lcom/join/mgps/activity/ModGameIndexActivity_$d0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/q1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity_$d0;->c(Ljava/lang/String;)Lcom/join/mgps/activity/ModGameIndexActivity_$d0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/q1;->b:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/dialog/q1;->show()V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/q1;->c:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/join/mgps/dialog/q1;->b:Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/dialog/q1;->show()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f09032d

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0

    :cond_0
    const v0, 0x7f090c0b

    if-ne p1, v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/app/AlertDialog;->dismiss()V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/dialog/q1;->c()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c01d6

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setContentView(I)V

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    const p1, 0x7f0913ae

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/dialog/q1;->d:Landroid/widget/TextView;

    const p1, 0x7f090c0b

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/dialog/q1;->e:Landroid/widget/TextView;

    const v0, 0x7f09032d

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public show()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/AlertDialog;->show()V

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/q1;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dialog/q1;->f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0}, Lcom/join/android/app/common/utils/APKUtils;->K(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/dialog/q1;->d:Landroid/widget/TextView;

    const-string v1, "\u5982\u81ea\u52a8\u5b89\u88c5\u65e0\u6cd5\u6b63\u5e38\u8fd0\u884c\uff0c\u8bf7\u5c1d\u8bd5\u624b\u52a8\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/dialog/q1;->e:Landroid/widget/TextView;

    const-string v1, "\u7acb\u5373\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
