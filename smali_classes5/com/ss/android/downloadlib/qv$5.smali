.class Lcom/ss/android/downloadlib/qv$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/qv;->vv(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/download/api/download/DownloadEventConfig;

.field final synthetic m:J

.field final synthetic n:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

.field final synthetic o:Lcom/ss/android/download/api/download/DownloadController;

.field final synthetic p:I

.field final synthetic qv:Lcom/ss/android/downloadlib/qv;

.field final synthetic u:Lcom/ss/android/download/api/config/OnItemClickListener;

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/qv;Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/qv$5;->qv:Lcom/ss/android/downloadlib/qv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/qv$5;->vv:Ljava/lang/String;

    iput-wide p3, p0, Lcom/ss/android/downloadlib/qv$5;->m:J

    iput p5, p0, Lcom/ss/android/downloadlib/qv$5;->p:I

    iput-object p6, p0, Lcom/ss/android/downloadlib/qv$5;->i:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iput-object p7, p0, Lcom/ss/android/downloadlib/qv$5;->o:Lcom/ss/android/download/api/download/DownloadController;

    iput-object p8, p0, Lcom/ss/android/downloadlib/qv$5;->u:Lcom/ss/android/download/api/config/OnItemClickListener;

    iput-object p9, p0, Lcom/ss/android/downloadlib/qv$5;->n:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv$5;->qv:Lcom/ss/android/downloadlib/qv;

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->m(Lcom/ss/android/downloadlib/qv;)Lcom/ss/android/downloadlib/n;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/qv$5;->vv:Ljava/lang/String;

    iget-wide v3, p0, Lcom/ss/android/downloadlib/qv$5;->m:J

    iget v5, p0, Lcom/ss/android/downloadlib/qv$5;->p:I

    iget-object v6, p0, Lcom/ss/android/downloadlib/qv$5;->i:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object v7, p0, Lcom/ss/android/downloadlib/qv$5;->o:Lcom/ss/android/download/api/download/DownloadController;

    iget-object v8, p0, Lcom/ss/android/downloadlib/qv$5;->u:Lcom/ss/android/download/api/config/OnItemClickListener;

    iget-object v9, p0, Lcom/ss/android/downloadlib/qv$5;->n:Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-virtual/range {v1 .. v9}, Lcom/ss/android/downloadlib/n;->vv(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V

    return-void
.end method
