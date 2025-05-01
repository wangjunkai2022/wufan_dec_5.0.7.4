.class Lcom/join/mgps/service/CommonService_$z1;
.super Lorg/androidannotations/api/a$c;
.source "CommonService_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService_;->D(Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic e:Z

.field final synthetic f:Lcom/join/mgps/dto/DownloadGameArgsBean;

.field final synthetic g:Lcom/join/mgps/service/CommonService_;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService_$z1;->g:Lcom/join/mgps/service/CommonService_;

    iput-object p6, p0, Lcom/join/mgps/service/CommonService_$z1;->b:Ljava/lang/String;

    iput-object p7, p0, Lcom/join/mgps/service/CommonService_$z1;->c:Ljava/lang/String;

    iput-object p8, p0, Lcom/join/mgps/service/CommonService_$z1;->d:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-boolean p9, p0, Lcom/join/mgps/service/CommonService_$z1;->e:Z

    iput-object p10, p0, Lcom/join/mgps/service/CommonService_$z1;->f:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-direct {p0, p2, p3, p4, p5}, Lorg/androidannotations/api/a$c;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_$z1;->g:Lcom/join/mgps/service/CommonService_;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_$z1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService_$z1;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/service/CommonService_$z1;->d:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-boolean v4, p0, Lcom/join/mgps/service/CommonService_$z1;->e:Z

    iget-object v5, p0, Lcom/join/mgps/service/CommonService_$z1;->f:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_;->F2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
