.class Lcom/join/mgps/adapter/m$w$a;
.super Ljava/lang/Object;
.source "DownloadCenterAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/m$w;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Dialog;

.field final synthetic c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic d:Lcom/join/mgps/adapter/m$w;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/m$w;Landroid/app/Dialog;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/m$w$a;->d:Lcom/join/mgps/adapter/m$w;

    iput-object p2, p0, Lcom/join/mgps/adapter/m$w$a;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lcom/join/mgps/adapter/m$w$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/m$w$a;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/m$w$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/join/mgps/adapter/m$w$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/join/mgps/adapter/m$w$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/join/mgps/adapter/m$w$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/adapter/m$w$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v0, p0, Lcom/join/mgps/adapter/m$w$a;->d:Lcom/join/mgps/adapter/m$w;

    iget-object v0, v0, Lcom/join/mgps/adapter/m$w;->c:Lcom/join/mgps/adapter/m;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    :cond_0
    return-void
.end method
