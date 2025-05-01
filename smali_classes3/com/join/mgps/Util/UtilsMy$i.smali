.class Lcom/join/mgps/Util/UtilsMy$i;
.super Lx1/a;
.source "UtilsMy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/UtilsMy;->j1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;IILandroid/content/Context;Lcom/join/mgps/dto/DownloadGameArgsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:Lcom/join/mgps/dto/DownloadGameArgsBean;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DownloadGameArgsBean;Ljava/util/List;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/UtilsMy$i;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/join/mgps/Util/UtilsMy$i;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object p3, p0, Lcom/join/mgps/Util/UtilsMy$i;->c:Lcom/join/mgps/dto/DownloadGameArgsBean;

    iput-object p4, p0, Lcom/join/mgps/Util/UtilsMy$i;->d:Ljava/util/List;

    iput p5, p0, Lcom/join/mgps/Util/UtilsMy$i;->e:I

    iput p6, p0, Lcom/join/mgps/Util/UtilsMy$i;->f:I

    invoke-direct {p0}, Lx1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lx1/a;->b(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Lx1/a;->c(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/Util/UtilsMy$i;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/Util/UtilsMy$i;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/Util/UtilsMy$i;->c:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->p1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DownloadGameArgsBean;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/Util/UtilsMy$i;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_status()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/Util/UtilsMy$i;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/Util/UtilsMy$i;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->n1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/Util/UtilsMy$i;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/join/mgps/Util/UtilsMy$i;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v4, p0, Lcom/join/mgps/Util/UtilsMy$i;->d:Ljava/util/List;

    iget v5, p0, Lcom/join/mgps/Util/UtilsMy$i;->e:I

    iget v6, p0, Lcom/join/mgps/Util/UtilsMy$i;->f:I

    iget-object v7, p0, Lcom/join/mgps/Util/UtilsMy$i;->c:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static/range {v2 .. v7}, Lcom/join/mgps/Util/UtilsMy;->U0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;IILcom/join/mgps/dto/DownloadGameArgsBean;)V

    .line 6
    :goto_0
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
