.class Lcom/join/mgps/service/CommonService_$d1;
.super Lorg/androidannotations/api/a$c;
.source "CommonService_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService_;->T(Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Z

.field final synthetic e:J

.field final synthetic f:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

.field final synthetic g:Z

.field final synthetic h:I

.field final synthetic i:I

.field final synthetic j:Z

.field final synthetic k:Lcom/join/mgps/dto/DownloadGameArgsBean;

.field final synthetic l:Lcom/join/mgps/service/CommonService_;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 5

    move-object v0, p0

    move-object v1, p1

    .line 1
    iput-object v1, v0, Lcom/join/mgps/service/CommonService_$d1;->l:Lcom/join/mgps/service/CommonService_;

    move-object v1, p6

    iput-object v1, v0, Lcom/join/mgps/service/CommonService_$d1;->b:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, Lcom/join/mgps/service/CommonService_$d1;->c:Ljava/lang/String;

    move v1, p8

    iput-boolean v1, v0, Lcom/join/mgps/service/CommonService_$d1;->d:Z

    move-wide v1, p9

    iput-wide v1, v0, Lcom/join/mgps/service/CommonService_$d1;->e:J

    move-object/from16 v1, p11

    iput-object v1, v0, Lcom/join/mgps/service/CommonService_$d1;->f:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    move/from16 v1, p12

    iput-boolean v1, v0, Lcom/join/mgps/service/CommonService_$d1;->g:Z

    move/from16 v1, p13

    iput v1, v0, Lcom/join/mgps/service/CommonService_$d1;->h:I

    move/from16 v1, p14

    iput v1, v0, Lcom/join/mgps/service/CommonService_$d1;->i:I

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/join/mgps/service/CommonService_$d1;->j:Z

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/join/mgps/service/CommonService_$d1;->k:Lcom/join/mgps/dto/DownloadGameArgsBean;

    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    invoke-direct {p0, p2, p3, p4, p5}, Lorg/androidannotations/api/a$c;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 12

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_$d1;->l:Lcom/join/mgps/service/CommonService_;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_$d1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService_$d1;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/join/mgps/service/CommonService_$d1;->d:Z

    iget-wide v4, p0, Lcom/join/mgps/service/CommonService_$d1;->e:J

    iget-object v6, p0, Lcom/join/mgps/service/CommonService_$d1;->f:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    iget-boolean v7, p0, Lcom/join/mgps/service/CommonService_$d1;->g:Z

    iget v8, p0, Lcom/join/mgps/service/CommonService_$d1;->h:I

    iget v9, p0, Lcom/join/mgps/service/CommonService_$d1;->i:I

    iget-boolean v10, p0, Lcom/join/mgps/service/CommonService_$d1;->j:Z

    iget-object v11, p0, Lcom/join/mgps/service/CommonService_$d1;->k:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static/range {v0 .. v11}, Lcom/join/mgps/service/CommonService_;->j2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V
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
