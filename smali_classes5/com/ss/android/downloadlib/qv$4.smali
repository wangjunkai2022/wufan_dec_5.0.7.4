.class Lcom/ss/android/downloadlib/qv$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/download/api/download/DownloadModel;

.field final synthetic m:I

.field final synthetic o:Lcom/ss/android/downloadlib/qv;

.field final synthetic p:Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/qv;Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/qv$4;->o:Lcom/ss/android/downloadlib/qv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/qv$4;->vv:Landroid/content/Context;

    iput p3, p0, Lcom/ss/android/downloadlib/qv$4;->m:I

    iput-object p4, p0, Lcom/ss/android/downloadlib/qv$4;->p:Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    iput-object p5, p0, Lcom/ss/android/downloadlib/qv$4;->i:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv$4;->o:Lcom/ss/android/downloadlib/qv;

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->m(Lcom/ss/android/downloadlib/qv;)Lcom/ss/android/downloadlib/n;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/qv$4;->vv:Landroid/content/Context;

    iget v2, p0, Lcom/ss/android/downloadlib/qv$4;->m:I

    iget-object v3, p0, Lcom/ss/android/downloadlib/qv$4;->p:Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    iget-object v4, p0, Lcom/ss/android/downloadlib/qv$4;->i:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/ss/android/downloadlib/n;->vv(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    return-void
.end method
