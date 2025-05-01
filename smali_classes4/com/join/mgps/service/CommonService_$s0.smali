.class Lcom/join/mgps/service/CommonService_$s0;
.super Ljava/lang/Object;
.source "CommonService_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService_;->F1(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

.field final synthetic e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic f:Z

.field final synthetic g:Lcom/join/mgps/dto/DownloadGameArgsBean;

.field final synthetic h:Lcom/join/mgps/service/CommonService_;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService_$s0;->h:Lcom/join/mgps/service/CommonService_;

    iput-object p2, p0, Lcom/join/mgps/service/CommonService_$s0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/service/CommonService_$s0;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/join/mgps/service/CommonService_$s0;->d:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    iput-object p5, p0, Lcom/join/mgps/service/CommonService_$s0;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-boolean p6, p0, Lcom/join/mgps/service/CommonService_$s0;->f:Z

    iput-object p7, p0, Lcom/join/mgps/service/CommonService_$s0;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_$s0;->h:Lcom/join/mgps/service/CommonService_;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_$s0;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService_$s0;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/service/CommonService_$s0;->d:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    iget-object v4, p0, Lcom/join/mgps/service/CommonService_$s0;->e:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-boolean v5, p0, Lcom/join/mgps/service/CommonService_$s0;->f:Z

    iget-object v6, p0, Lcom/join/mgps/service/CommonService_$s0;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_;->M2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    return-void
.end method
