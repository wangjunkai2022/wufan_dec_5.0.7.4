.class Lcom/join/mgps/adapter/o$e$b;
.super Ljava/lang/Object;
.source "DownloadedCenterEmulatorAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/o$e;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Landroid/app/Dialog;

.field final synthetic d:Lcom/join/mgps/adapter/o$e;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/o$e;ZLandroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iput-boolean p2, p0, Lcom/join/mgps/adapter/o$e$b;->b:Z

    iput-object p3, p0, Lcom/join/mgps/adapter/o$e$b;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Lcom/join/mgps/adapter/o$e$b;->b:Z

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    iget-object p1, p1, Lcom/join/mgps/adapter/o;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object v1, v0, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    iget-object v1, v1, Lcom/join/mgps/adapter/o;->c:Landroid/app/Activity;

    iget-object v0, v0, Lcom/join/mgps/adapter/o$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    iget-object p1, p1, Lcom/join/mgps/adapter/o;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object v1, v0, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    iget-object v1, v1, Lcom/join/mgps/adapter/o;->c:Landroid/app/Activity;

    iget-object v0, v0, Lcom/join/mgps/adapter/o$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/join/android/app/common/utils/APKUtils;->f0(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object v0, p1, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, p1}, Lcom/join/mgps/adapter/o;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object v0, p1, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, p1}, Lcom/join/mgps/adapter/o;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->d:Lcom/join/mgps/adapter/o$e;

    iget-object p1, p1, Lcom/join/mgps/adapter/o$e;->c:Lcom/join/mgps/adapter/o;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 10
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/adapter/o$e$b;->c:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
