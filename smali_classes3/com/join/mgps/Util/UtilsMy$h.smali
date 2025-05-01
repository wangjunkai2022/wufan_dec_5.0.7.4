.class Lcom/join/mgps/Util/UtilsMy$h;
.super Lx1/a;
.source "UtilsMy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/UtilsMy;->S0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;IILcom/join/mgps/dto/DownloadGameArgsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lcom/join/mgps/dto/DownloadGameArgsBean;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;IILcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/UtilsMy$h;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/join/mgps/Util/UtilsMy$h;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object p3, p0, Lcom/join/mgps/Util/UtilsMy$h;->c:Ljava/util/List;

    iput p4, p0, Lcom/join/mgps/Util/UtilsMy$h;->d:I

    iput p5, p0, Lcom/join/mgps/Util/UtilsMy$h;->e:I

    iput-object p6, p0, Lcom/join/mgps/Util/UtilsMy$h;->f:Lcom/join/mgps/dto/DownloadGameArgsBean;

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
    .locals 7

    .line 1
    invoke-super {p0, p1}, Lx1/a;->c(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/Util/UtilsMy$h;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/Util/UtilsMy$h;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/Util/UtilsMy$h;->c:Ljava/util/List;

    iget v3, p0, Lcom/join/mgps/Util/UtilsMy$h;->d:I

    iget v4, p0, Lcom/join/mgps/Util/UtilsMy$h;->e:I

    iget-object v6, p0, Lcom/join/mgps/Util/UtilsMy$h;->f:Lcom/join/mgps/dto/DownloadGameArgsBean;

    move-object v5, p1

    invoke-static/range {v0 .. v6}, Lcom/join/mgps/Util/UtilsMy;->s(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;IILandroid/content/Context;Lcom/join/mgps/dto/DownloadGameArgsBean;)V

    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
