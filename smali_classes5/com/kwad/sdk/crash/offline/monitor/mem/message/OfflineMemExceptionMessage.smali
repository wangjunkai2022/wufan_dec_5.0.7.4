.class public Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;
.super Lcom/kwad/sdk/crash/model/message/ExceptionMessage;
.source "SourceFile"


# static fields
.field private static final MSG_QUEUE_DETAIL:Ljava/lang/String; = "mMessageQueueDetail"

.field private static final REASON:Ljava/lang/String; = "mReason"

.field private static final TAG:Ljava/lang/String; = "OfflineMemExceptionMessage"

.field private static final THREAD_DETAIL:Ljava/lang/String; = "mThreadDetail"

.field private static final THREAD_STATUS:Ljava/lang/String; = "mThreadStatus"

.field private static final serialVersionUID:J = 0x1d5f3c76a52de37cL


# instance fields
.field public mMessageQueueDetail:Ljava/lang/String;

.field public mReason:Ljava/lang/String;

.field public mThreadDetail:Ljava/lang/String;

.field public mThreadStatus:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/crash/model/message/ExceptionMessage;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mReason:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mMessageQueueDetail:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mThreadDetail:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mThreadStatus:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getTypePrefix()Ljava/lang/String;
    .locals 1

    const-string v0, "offline_mem_"

    return-object v0
.end method

.method public parseJson(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/crash/model/message/ExceptionMessage;->parseJson(Lorg/json/JSONObject;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "mReason"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mReason:Ljava/lang/String;

    const-string v0, "mMessageQueueDetail"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mMessageQueueDetail:Ljava/lang/String;

    const-string v0, "mThreadDetail"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mThreadDetail:Ljava/lang/String;

    const-string v0, "mThreadStatus"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mThreadStatus:Ljava/lang/String;

    return-void
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/crash/model/message/ExceptionMessage;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mReason:Ljava/lang/String;

    const-string v2, "mReason"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mMessageQueueDetail:Ljava/lang/String;

    const-string v2, "mMessageQueueDetail"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mThreadDetail:Ljava/lang/String;

    const-string v2, "mThreadDetail"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/crash/offline/monitor/mem/message/OfflineMemExceptionMessage;->mThreadStatus:Ljava/lang/String;

    const-string v2, "mThreadStatus"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
