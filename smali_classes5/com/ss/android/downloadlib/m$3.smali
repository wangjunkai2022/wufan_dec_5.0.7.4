.class Lcom/ss/android/downloadlib/m$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/o/m$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m;->vv(Landroid/content/Context;Landroid/net/Uri;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ss/android/downloadlib/o/m$vv<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/download/api/download/DownloadEventConfig;

.field final synthetic m:Landroid/net/Uri;

.field final synthetic n:Lcom/ss/android/downloadlib/m;

.field final synthetic o:Lcom/ss/android/download/api/download/DownloadController;

.field final synthetic p:Lcom/ss/android/download/api/download/DownloadModel;

.field final synthetic u:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/m;Landroid/content/Context;Landroid/net/Uri;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m$3;->n:Lcom/ss/android/downloadlib/m;

    iput-object p2, p0, Lcom/ss/android/downloadlib/m$3;->vv:Landroid/content/Context;

    iput-object p3, p0, Lcom/ss/android/downloadlib/m$3;->m:Landroid/net/Uri;

    iput-object p4, p0, Lcom/ss/android/downloadlib/m$3;->p:Lcom/ss/android/download/api/download/DownloadModel;

    iput-object p5, p0, Lcom/ss/android/downloadlib/m$3;->i:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iput-object p6, p0, Lcom/ss/android/downloadlib/m$3;->o:Lcom/ss/android/download/api/download/DownloadController;

    iput-object p7, p0, Lcom/ss/android/downloadlib/m$3;->u:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic m()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/m$3;->vv()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public vv()Ljava/lang/Boolean;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/m$3;->n:Lcom/ss/android/downloadlib/m;

    iget-object v1, p0, Lcom/ss/android/downloadlib/m$3;->vv:Landroid/content/Context;

    iget-object v2, p0, Lcom/ss/android/downloadlib/m$3;->m:Landroid/net/Uri;

    iget-object v3, p0, Lcom/ss/android/downloadlib/m$3;->p:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v4, p0, Lcom/ss/android/downloadlib/m$3;->i:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object v5, p0, Lcom/ss/android/downloadlib/m$3;->o:Lcom/ss/android/download/api/download/DownloadController;

    iget-object v6, p0, Lcom/ss/android/downloadlib/m$3;->u:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-static/range {v0 .. v6}, Lcom/ss/android/downloadlib/m;->vv(Lcom/ss/android/downloadlib/m;Landroid/content/Context;Landroid/net/Uri;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
