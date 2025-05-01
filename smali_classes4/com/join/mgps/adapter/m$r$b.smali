.class Lcom/join/mgps/adapter/m$r$b;
.super Ljava/lang/Object;
.source "DownloadCenterAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/m$r;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Dialog;

.field final synthetic c:Lcom/join/mgps/adapter/m$r;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/m$r;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/m$r$b;->c:Lcom/join/mgps/adapter/m$r;

    iput-object p2, p0, Lcom/join/mgps/adapter/m$r$b;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lb2/k;->n()Lb2/k;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/m$r$b;->c:Lcom/join/mgps/adapter/m$r;

    iget-object v0, v0, Lcom/join/mgps/adapter/m$r;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb2/k;->p(Ljava/lang/String;)Lcom/join/mgps/db/tables/DownloadHistoryTable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lb2/k;->n()Lb2/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/b;->delete(Ljava/lang/Object;)I

    .line 3
    iget-object p1, p0, Lcom/join/mgps/adapter/m$r$b;->c:Lcom/join/mgps/adapter/m$r;

    iget-object p1, p1, Lcom/join/mgps/adapter/m$r;->c:Lcom/join/mgps/adapter/m;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->e:Lcom/join/mgps/dto/DownloadCenterBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadCenterBean;->getHistoryDownloadFiles()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/m$r$b;->c:Lcom/join/mgps/adapter/m$r;

    iget-object v0, v0, Lcom/join/mgps/adapter/m$r;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lcom/join/mgps/adapter/m$r$b;->c:Lcom/join/mgps/adapter/m$r;

    iget-object p1, p1, Lcom/join/mgps/adapter/m$r;->c:Lcom/join/mgps/adapter/m;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/adapter/m$r$b;->c:Lcom/join/mgps/adapter/m$r;

    iget-object p1, p1, Lcom/join/mgps/adapter/m$r;->c:Lcom/join/mgps/adapter/m;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    check-cast p1, Lcom/join/mgps/activity/DownloadCenterActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/DownloadCenterActivity;->r0()V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/adapter/m$r$b;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
