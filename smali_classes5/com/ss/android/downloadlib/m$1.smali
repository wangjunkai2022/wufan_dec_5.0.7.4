.class Lcom/ss/android/downloadlib/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/o/m$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m;->vv(Landroid/content/Context;Ljava/lang/String;ZLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadStatusChangeListener;IZLcom/ss/android/download/api/config/IDownloadButtonClickListener;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ss/android/downloadlib/o/m$vv<",
        "Landroid/app/Dialog;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/ss/android/downloadlib/m;

.field final synthetic i:Lcom/ss/android/download/api/download/DownloadModel;

.field final synthetic k:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

.field final synthetic o:Lcom/ss/android/download/api/download/DownloadEventConfig;

.field final synthetic p:Z

.field final synthetic qv:I

.field final synthetic u:Lcom/ss/android/download/api/download/DownloadController;

.field final synthetic vv:Landroid/content/Context;

.field final synthetic wv:Z


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/m;Landroid/content/Context;Ljava/lang/String;ZLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadStatusChangeListener;IZLcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m$1;->b:Lcom/ss/android/downloadlib/m;

    iput-object p2, p0, Lcom/ss/android/downloadlib/m$1;->vv:Landroid/content/Context;

    iput-object p3, p0, Lcom/ss/android/downloadlib/m$1;->m:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/ss/android/downloadlib/m$1;->p:Z

    iput-object p5, p0, Lcom/ss/android/downloadlib/m$1;->i:Lcom/ss/android/download/api/download/DownloadModel;

    iput-object p6, p0, Lcom/ss/android/downloadlib/m$1;->o:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iput-object p7, p0, Lcom/ss/android/downloadlib/m$1;->u:Lcom/ss/android/download/api/download/DownloadController;

    iput-object p8, p0, Lcom/ss/android/downloadlib/m$1;->n:Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    iput p9, p0, Lcom/ss/android/downloadlib/m$1;->qv:I

    iput-boolean p10, p0, Lcom/ss/android/downloadlib/m$1;->wv:Z

    iput-object p11, p0, Lcom/ss/android/downloadlib/m$1;->k:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic m()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/m$1;->vv()Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public vv()Landroid/app/Dialog;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/m$1;->b:Lcom/ss/android/downloadlib/m;

    iget-object v1, p0, Lcom/ss/android/downloadlib/m$1;->vv:Landroid/content/Context;

    iget-object v2, p0, Lcom/ss/android/downloadlib/m$1;->m:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/ss/android/downloadlib/m$1;->p:Z

    iget-object v4, p0, Lcom/ss/android/downloadlib/m$1;->i:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v5, p0, Lcom/ss/android/downloadlib/m$1;->o:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object v6, p0, Lcom/ss/android/downloadlib/m$1;->u:Lcom/ss/android/download/api/download/DownloadController;

    iget-object v7, p0, Lcom/ss/android/downloadlib/m$1;->n:Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    iget v8, p0, Lcom/ss/android/downloadlib/m$1;->qv:I

    iget-boolean v9, p0, Lcom/ss/android/downloadlib/m$1;->wv:Z

    iget-object v10, p0, Lcom/ss/android/downloadlib/m$1;->k:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-virtual/range {v0 .. v10}, Lcom/ss/android/downloadlib/m;->m(Landroid/content/Context;Ljava/lang/String;ZLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadStatusChangeListener;IZLcom/ss/android/download/api/config/IDownloadButtonClickListener;)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method
