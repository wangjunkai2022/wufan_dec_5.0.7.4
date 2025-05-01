.class Lcom/join/android/app/common/dialog/l$b;
.super Ljava/lang/Object;
.source "ShowBottomDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/common/dialog/l;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Landroid/app/Dialog;

.field final synthetic d:Lcom/join/android/app/common/dialog/l;


# direct methods
.method constructor <init>(Lcom/join/android/app/common/dialog/l;ZLandroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    iput-boolean p2, p0, Lcom/join/android/app/common/dialog/l$b;->b:Z

    iput-object p3, p0, Lcom/join/android/app/common/dialog/l$b;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Lcom/join/android/app/common/dialog/l$b;->b:Z

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->a(Lcom/join/android/app/common/dialog/l;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {v0}, Lcom/join/android/app/common/dialog/l;->a(Lcom/join/android/app/common/dialog/l;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {v1}, Lcom/join/android/app/common/dialog/l;->b(Lcom/join/android/app/common/dialog/l;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->a(Lcom/join/android/app/common/dialog/l;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {v0}, Lcom/join/android/app/common/dialog/l;->a(Lcom/join/android/app/common/dialog/l;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {v1}, Lcom/join/android/app/common/dialog/l;->b(Lcom/join/android/app/common/dialog/l;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->f0(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->c(Lcom/join/android/app/common/dialog/l;)Lcom/join/mgps/adapter/o;

    move-result-object p1

    iget-object v0, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {v0}, Lcom/join/android/app/common/dialog/l;->b(Lcom/join/android/app/common/dialog/l;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/o;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 5
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->b(Lcom/join/android/app/common/dialog/l;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 6
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->c(Lcom/join/android/app/common/dialog/l;)Lcom/join/mgps/adapter/o;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->c(Lcom/join/android/app/common/dialog/l;)Lcom/join/mgps/adapter/o;

    move-result-object p1

    iget-object v0, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {v0}, Lcom/join/android/app/common/dialog/l;->b(Lcom/join/android/app/common/dialog/l;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/o;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 8
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->b(Lcom/join/android/app/common/dialog/l;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 9
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->d:Lcom/join/android/app/common/dialog/l;

    invoke-static {p1}, Lcom/join/android/app/common/dialog/l;->c(Lcom/join/android/app/common/dialog/l;)Lcom/join/mgps/adapter/o;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 10
    :goto_0
    iget-object p1, p0, Lcom/join/android/app/common/dialog/l$b;->c:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
