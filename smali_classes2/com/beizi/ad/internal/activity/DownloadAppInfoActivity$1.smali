.class Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$1;
.super Ljava/lang/Object;
.source "DownloadAppInfoActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$1;->a:Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity$1;->a:Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
