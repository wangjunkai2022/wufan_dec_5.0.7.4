.class Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity$3;
.super Ljava/lang/Object;
.source "BeiZiDownloadDialogActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity$3;->a:Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity$3;->a:Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;->c(Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity$3;->a:Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
