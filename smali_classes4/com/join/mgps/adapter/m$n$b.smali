.class Lcom/join/mgps/adapter/m$n$b;
.super Ljava/lang/Object;
.source "DownloadCenterAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/m$n;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Dialog;

.field final synthetic c:Lcom/join/mgps/adapter/m$n;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/m$n;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/m$n$b;->c:Lcom/join/mgps/adapter/m$n;

    iput-object p2, p0, Lcom/join/mgps/adapter/m$n$b;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lb2/k;->n()Lb2/k;

    move-result-object p1

    invoke-virtual {p1}, Lp1/b;->a()I

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/m$n$b;->c:Lcom/join/mgps/adapter/m$n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m$n;->b:Lcom/join/mgps/adapter/m;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->e:Lcom/join/mgps/dto/DownloadCenterBean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadCenterBean;->setHistoryDownloadFiles(Ljava/util/List;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/adapter/m$n$b;->c:Lcom/join/mgps/adapter/m$n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m$n;->b:Lcom/join/mgps/adapter/m;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/adapter/m$n$b;->c:Lcom/join/mgps/adapter/m$n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m$n;->b:Lcom/join/mgps/adapter/m;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    check-cast p1, Lcom/join/mgps/activity/DownloadCenterActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/DownloadCenterActivity;->r0()V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/adapter/m$n$b;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
