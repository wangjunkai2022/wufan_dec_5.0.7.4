.class public Lcom/ss/android/downloadad/api/vv/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadad/api/vv/vv;


# instance fields
.field private a:I

.field private transient ah:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private cl:J

.field private cq:Z

.field private d:Ljava/lang/String;

.field private di:Ljava/lang/String;

.field private ds:I
    .annotation build Lcom/ss/android/downloadad/api/constant/AdBaseConstants$FunnelType;
    .end annotation
.end field

.field private e:Z

.field private ev:J

.field private f:Z

.field private ff:J

.field private fn:Z

.field private fo:J

.field private g:Ljava/lang/String;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private j:I

.field private jb:Ljava/lang/String;

.field private jh:Ljava/lang/String;

.field private ju:Z

.field private k:Ljava/lang/String;

.field private ky:Z

.field private l:Z

.field private la:Ljava/lang/String;

.field private lb:Z

.field protected m:Z

.field private n:Ljava/lang/String;

.field private nn:Ljava/lang/String;

.field private ns:I

.field private o:J

.field private ot:Z

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private pd:J

.field private pj:Ljava/lang/String;

.field private pl:Z

.field private q:I

.field private qb:Z

.field private qd:Z

.field private qv:I

.field private r:I

.field private rm:Z

.field private s:I

.field private sr:Z

.field private t:I

.field private td:J

.field private tf:Ljava/lang/String;

.field private to:Z

.field private u:J

.field private uw:Z

.field private v:Lorg/json/JSONObject;

.field private vu:I

.field protected vv:Z

.field private w:I

.field private wv:Ljava/lang/String;

.field private x:Z

.field private y:J

.field private ya:I

.field private yj:Z

.field private zn:Z


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->qv:I

    .line 3
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->x:Z

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->l:Z

    .line 5
    iput v1, p0, Lcom/ss/android/downloadad/api/vv/m;->ns:I

    .line 6
    iput v1, p0, Lcom/ss/android/downloadad/api/vv/m;->vu:I

    .line 7
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->zn:Z

    .line 8
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->f:Z

    .line 9
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ot:Z

    .line 10
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->cq:Z

    .line 11
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->vv:Z

    .line 12
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->m:Z

    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ds:I

    .line 16
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->e:Z

    const-wide/16 v0, -0x1

    .line 17
    iput-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->cl:J

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ss/android/downloadad/api/vv/m;-><init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;I)V

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;I)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 20
    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->qv:I

    .line 21
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->x:Z

    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->l:Z

    .line 23
    iput v1, p0, Lcom/ss/android/downloadad/api/vv/m;->ns:I

    .line 24
    iput v1, p0, Lcom/ss/android/downloadad/api/vv/m;->vu:I

    .line 25
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->zn:Z

    .line 26
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->f:Z

    .line 27
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ot:Z

    .line 28
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->cq:Z

    .line 29
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->vv:Z

    .line 30
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->m:Z

    .line 31
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ds:I

    .line 34
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->e:Z

    const-wide/16 v0, -0x1

    .line 35
    iput-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->cl:J

    .line 36
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->o:J

    .line 37
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getExtraValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->u:J

    .line 38
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->n:Ljava/lang/String;

    .line 39
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->wv:Ljava/lang/String;

    .line 40
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getExtra()Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->v:Lorg/json/JSONObject;

    .line 41
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->x:Z

    .line 42
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getVersionCode()I

    move-result v0

    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->j:I

    .line 43
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getVersionName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->d:Ljava/lang/String;

    .line 44
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->k:Ljava/lang/String;

    .line 45
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 46
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/DeepLink;->getOpenUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->b:Ljava/lang/String;

    .line 47
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/DeepLink;->getWebUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->jh:Ljava/lang/String;

    .line 48
    :cond_0
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getModelType()I

    move-result v0

    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->r:I

    .line 49
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->g:Ljava/lang/String;

    .line 50
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getAppIcon()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->la:Ljava/lang/String;

    .line 51
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getMimeType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->pj:Ljava/lang/String;

    .line 52
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadEventConfig;->getClickButtonTag()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->tf:Ljava/lang/String;

    .line 53
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadEventConfig;->getRefer()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->jb:Ljava/lang/String;

    .line 54
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadEventConfig;->isEnableV3Event()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->lb:Z

    .line 55
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->isEnableBackDialog()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->l:Z

    .line 56
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->getLinkMode()I

    move-result p2

    iput p2, p0, Lcom/ss/android/downloadad/api/vv/m;->t:I

    .line 57
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result p2

    iput p2, p0, Lcom/ss/android/downloadad/api/vv/m;->q:I

    .line 58
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableShowComplianceDialog()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->e:Z

    .line 59
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->isAutoDownloadOnCardShow()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->ju:Z

    .line 60
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableNewActivity()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->ot:Z

    .line 61
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableAH()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->vv:Z

    .line 62
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableAM()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->m:Z

    .line 63
    iput p4, p0, Lcom/ss/android/downloadad/api/vv/m;->ya:I

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ss/android/downloadad/api/vv/m;->y:J

    .line 65
    iput-wide p2, p0, Lcom/ss/android/downloadad/api/vv/m;->ff:J

    .line 66
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->shouldDownloadWithPatchApply()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/vv/m;->f:Z

    .line 67
    instance-of p2, p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz p2, :cond_1

    .line 68
    check-cast p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->di:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public static m(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/vv/m;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/ss/android/downloadad/api/vv/m;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/vv/m;-><init>()V

    :try_start_0
    const-string v1, "mId"

    .line 7
    invoke-static {p0, v1}, Lcom/ss/android/download/api/p/m;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/vv/m;->i(J)V

    const-string v1, "mExtValue"

    .line 8
    invoke-static {p0, v1}, Lcom/ss/android/download/api/p/m;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/vv/m;->o(J)V

    const-string v1, "mLogExtra"

    .line 9
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->p(Ljava/lang/String;)V

    const-string v1, "mDownloadStatus"

    .line 10
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->o(I)V

    const-string v1, "mPackageName"

    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->m(Ljava/lang/String;)V

    const-string v1, "mIsAd"

    const/4 v2, 0x1

    .line 12
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->vv(Z)V

    const-string v1, "mTimeStamp"

    .line 13
    invoke-static {p0, v1}, Lcom/ss/android/download/api/p/m;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/ss/android/downloadad/api/vv/m;->u(J)V

    const-string v1, "mVersionCode"

    .line 14
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->u(I)V

    const-string v1, "mVersionName"

    .line 15
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->i(Ljava/lang/String;)V

    const-string v1, "mDownloadId"

    .line 16
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->n(I)V

    const-string v1, "mIsV3Event"

    .line 17
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->m(Z)V

    const-string v1, "mScene"

    .line 18
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->qv(I)V

    const-string v1, "mEventTag"

    .line 19
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->u(Ljava/lang/String;)V

    const-string v1, "mEventRefer"

    .line 20
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->n(Ljava/lang/String;)V

    const-string v1, "mDownloadUrl"

    .line 21
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->qv(Ljava/lang/String;)V

    const-string v1, "mEnableBackDialog"

    .line 22
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->p(Z)V

    .line 23
    iget-object v1, v0, Lcom/ss/android/downloadad/api/vv/m;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v3, "hasSendInstallFinish"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 24
    iget-object v1, v0, Lcom/ss/android/downloadad/api/vv/m;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v3, "hasSendDownloadFailedFinally"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v1, "mLastFailedErrCode"

    .line 25
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->i(I)V

    const-string v1, "mLastFailedErrMsg"

    .line 26
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->vv(Ljava/lang/String;)V

    const-string v1, "mOpenUrl"

    .line 27
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->wv(Ljava/lang/String;)V

    const-string v1, "mLinkMode"

    .line 28
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->k(I)V

    const-string v1, "mDownloadMode"

    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->b(I)V

    const-string v1, "mModelType"

    .line 30
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->jh(I)V

    const-string v1, "mAppName"

    .line 31
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->k(Ljava/lang/String;)V

    const-string v1, "mAppIcon"

    .line 32
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->b(Ljava/lang/String;)V

    const-string v1, "mDownloadFailedTimes"

    const/4 v3, 0x0

    .line 33
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->vv(I)V

    const-string v1, "mRecentDownloadResumeTime"

    .line 34
    invoke-static {p0, v1}, Lcom/ss/android/download/api/p/m;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/vv/m;->vv(J)V

    const-string v1, "mClickPauseTimes"

    .line 35
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->m(I)V

    const-string v1, "mJumpInstallTime"

    .line 36
    invoke-static {p0, v1}, Lcom/ss/android/download/api/p/m;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/vv/m;->m(J)V

    const-string v1, "mCancelInstallTime"

    .line 37
    invoke-static {p0, v1}, Lcom/ss/android/download/api/p/m;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/vv/m;->p(J)V

    const-string v1, "mLastFailedResumeCount"

    .line 38
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->p(I)V

    const-string v1, "downloadFinishReason"

    .line 39
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->jh(Ljava/lang/String;)V

    const-string v1, "clickDownloadSize"

    .line 40
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/vv/m;->wv(J)V

    const-string v1, "clickDownloadTime"

    .line 41
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/vv/m;->qv(J)V

    const-string v1, "mIsUpdateDownload"

    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->qv(Z)V

    const-string v1, "mOriginMimeType"

    .line 43
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->r(Ljava/lang/String;)V

    const-string v1, "mIsPatchApplyHandled"

    .line 44
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->wv(Z)V

    const-string v1, "installAfterCleanSpace"

    .line 45
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->u(Z)V

    const-string v1, "funnelType"

    .line 46
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->wv(I)V

    const-string v1, "webUrl"

    .line 47
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->o(Ljava/lang/String;)V

    const-string v1, "enableShowComplianceDialog"

    .line 48
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->j(Z)V

    const-string v1, "isAutoDownloadOnCardShow"

    .line 49
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->d(Z)V

    const-string v1, "enable_new_activity"

    .line 50
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->g(Z)V

    const-string v1, "enable_pause"

    .line 51
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->la(Z)V

    const-string v1, "enable_ah"

    .line 52
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->x(Z)V

    const-string v1, "enable_am"

    .line 53
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadad/api/vv/m;->y(Z)V

    const-string v1, "mExtras"

    .line 54
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->vv(Lorg/json/JSONObject;)V

    const-string v1, "intent_jump_browser_success"

    .line 55
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->v(Z)V

    const-string v1, "task_key"

    .line 56
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadad/api/vv/m;->t(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p0

    .line 57
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->x()Lcom/ss/android/download/api/m/vv;

    move-result-object v1

    const-string v2, "NativeDownloadModel fromJson"

    invoke-interface {v1, p0, v2}, Lcom/ss/android/download/api/m/vv;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_4
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->a:I

    return v0
.end method

.method public ah()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->rm:Z

    return v0
.end method

.method public b()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->q:I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->la:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->sr:Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->c:Ljava/lang/String;

    return-object v0
.end method

.method public cl()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->sr:Z

    return v0
.end method

.method public cq()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->s:I

    return v0
.end method

.method public d(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ju:Z

    return-void
.end method

.method public d()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ot:Z

    return v0
.end method

.method public di()Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 5

    .line 1
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;-><init>()V

    iget-wide v1, p0, Lcom/ss/android/downloadad/api/vv/m;->o:J

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAdId(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadad/api/vv/m;->u:J

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExtraValue(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->n:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setLogExtra(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->wv:Ljava/lang/String;

    .line 5
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setPackageName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->v:Lorg/json/JSONObject;

    .line 6
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExtra(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->x:Z

    .line 7
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setIsAd(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/downloadad/api/vv/m;->j:I

    .line 8
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setVersionCode(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->d:Ljava/lang/String;

    .line 9
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setVersionName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->k:Ljava/lang/String;

    .line 10
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDownloadUrl(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/downloadad/api/vv/m;->r:I

    .line 11
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setModelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->pj:Ljava/lang/String;

    .line 12
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setMimeType(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->g:Ljava/lang/String;

    .line 13
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->la:Ljava/lang/String;

    .line 14
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppIcon(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->di:Ljava/lang/String;

    .line 15
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setTaskKey(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    new-instance v1, Lcom/ss/android/download/api/model/DeepLink;

    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/ss/android/downloadad/api/vv/m;->jh:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/ss/android/download/api/model/DeepLink;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDeepLink(Lcom/ss/android/download/api/model/DeepLink;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object v0

    return-object v0
.end method

.method public dj()Lcom/ss/android/downloadad/api/download/AdDownloadController;
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;-><init>()V

    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->l:Z

    .line 2
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsEnableBackDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/downloadad/api/vv/m;->t:I

    .line 3
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setLinkMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/downloadad/api/vv/m;->q:I

    .line 4
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setDownloadMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->e:Z

    .line 5
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableShowComplianceDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->vv:Z

    .line 6
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAH(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->m:Z

    .line 7
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAM(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadController;

    move-result-object v0

    return-object v0
.end method

.method public ds()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->to:Z

    return v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->fo:J

    return-wide v0
.end method

.method public ev()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->yj:Z

    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->j:I

    return v0
.end method

.method public declared-synchronized ff()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->vu:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->vu:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public fn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->di:Ljava/lang/String;

    return-object v0
.end method

.method public fo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ky:Z

    return v0
.end method

.method public g()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ot:Z

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->n:Ljava/lang/String;

    return-object v0
.end method

.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->a:I

    return-void
.end method

.method public i(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->o:J

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->d:Ljava/lang/String;

    return-void
.end method

.method public i(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->qb:Z

    return-void
.end method

.method public j()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->e:Z

    return-void
.end method

.method public jb()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->cl:J

    return-wide v0
.end method

.method public jh()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->u:J

    return-wide v0
.end method

.method public jh(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->r:I

    return-void
.end method

.method public jh(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->nn:Ljava/lang/String;

    return-void
.end method

.method public jh(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->rm:Z

    return-void
.end method

.method public ju()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ev:J

    return-wide v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->tf:Ljava/lang/String;

    return-object v0
.end method

.method public k(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->t:I

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->g:Ljava/lang/String;

    return-void
.end method

.method public k(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ah:Z

    return-void
.end method

.method public ky()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->t:I

    return v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ns:I

    return v0
.end method

.method public la()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ya:I

    return v0
.end method

.method public la(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->cq:Z

    return-void
.end method

.method public lb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->g:Ljava/lang/String;

    return-object v0
.end method

.method public m()J
    .locals 2

    .line 3
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->o:J

    return-wide v0
.end method

.method public m(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->vu:I

    return-void
.end method

.method public m(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->td:J

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->wv:Ljava/lang/String;

    return-void
.end method

.method public m(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->lb:Z

    return-void
.end method

.method public mm()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;-><init>()V

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->tf:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickButtonTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadad/api/vv/m;->jb:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setRefer(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/vv/m;->lb:Z

    .line 4
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableV3Event(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    move-result-object v0

    return-object v0
.end method

.method public n()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->v:Lorg/json/JSONObject;

    return-object v0
.end method

.method public n(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ya:I

    return-void
.end method

.method public n(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->cl:J

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->jb:Ljava/lang/String;

    return-void
.end method

.method public n(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->yj:Z

    return-void
.end method

.method public nn()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->zn:Z

    return v0
.end method

.method public declared-synchronized ns()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ns:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ns:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->wv:Ljava/lang/String;

    return-object v0
.end method

.method public o(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->qv:I

    return-void
.end method

.method public o(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->u:J

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->jh:Ljava/lang/String;

    return-void
.end method

.method public o(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->to:Z

    return-void
.end method

.method public ot()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->d:Ljava/lang/String;

    return-object v0
.end method

.method public p(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->w:I

    return-void
.end method

.method public p(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->pd:J

    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->n:Ljava/lang/String;

    return-void
.end method

.method public p(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->l:Z

    return-void
.end method

.method public p()Z
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->x:Z

    return v0
.end method

.method public pd()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->td:J

    return-wide v0
.end method

.method public pj()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->y:J

    return-wide v0
.end method

.method public pl()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->uw:Z

    return v0
.end method

.method public q()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->fn:Z

    return-void
.end method

.method public qb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->pj:Ljava/lang/String;

    return-object v0
.end method

.method public qd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->pl:Z

    return v0
.end method

.method public qv()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ds:I

    return v0
.end method

.method public qv(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->s:I

    return-void
.end method

.method public qv(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->fo:J

    return-void
.end method

.method public qv(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->k:Ljava/lang/String;

    return-void
.end method

.method public qv(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->zn:Z

    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->pj:Ljava/lang/String;

    return-void
.end method

.method public r(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->qd:Z

    return-void
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->lb:Z

    return v0
.end method

.method public rm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->fn:Z

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->nn:Ljava/lang/String;

    return-object v0
.end method

.method public sr()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->qd:Z

    return v0
.end method

.method public t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public t(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->di:Ljava/lang/String;

    return-void
.end method

.method public t(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->pl:Z

    return-void
.end method

.method public td()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ff:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 2
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/vv/m;->y:J

    :cond_0
    return-wide v0
.end method

.method public tf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->l:Z

    return v0
.end method

.method public to()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->f:Z

    return v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public u(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->j:I

    return-void
.end method

.method public u(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 1
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->y:J

    :cond_0
    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->tf:Ljava/lang/String;

    return-void
.end method

.method public u(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ky:Z

    return-void
.end method

.method public uw()Lorg/json/JSONObject;
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "mId"

    .line 2
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->o:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mExtValue"

    .line 3
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->u:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mLogExtra"

    .line 4
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->n:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mDownloadStatus"

    .line 5
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->qv:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mPackageName"

    .line 6
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->wv:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mIsAd"

    .line 7
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->x:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "mTimeStamp"

    .line 8
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->y:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mExtras"

    .line 9
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->v:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mVersionCode"

    .line 10
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->j:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mVersionName"

    .line 11
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mDownloadId"

    .line 12
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ya:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mIsV3Event"

    .line 13
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->lb:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "mScene"

    .line 14
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->s:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mEventTag"

    .line 15
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->tf:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mEventRefer"

    .line 16
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->jb:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mDownloadUrl"

    .line 17
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mEnableBackDialog"

    .line 18
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->l:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "hasSendInstallFinish"

    .line 19
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "hasSendDownloadFailedFinally"

    .line 20
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "mLastFailedErrCode"

    .line 21
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->a:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mLastFailedErrMsg"

    .line 22
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mOpenUrl"

    .line 23
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mLinkMode"

    .line 24
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->t:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mDownloadMode"

    .line 25
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->q:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mModelType"

    .line 26
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->r:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mAppName"

    .line 27
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mAppIcon"

    .line 28
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->la:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mDownloadFailedTimes"

    .line 29
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ns:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mRecentDownloadResumeTime"

    .line 30
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ff:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->y:J

    :cond_0
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mClickPauseTimes"

    .line 31
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->vu:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mJumpInstallTime"

    .line 32
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->td:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mCancelInstallTime"

    .line 33
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->pd:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mLastFailedResumeCount"

    .line 34
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->w:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "mIsUpdateDownload"

    .line 35
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->zn:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "mOriginMimeType"

    .line 36
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->pj:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mIsPatchApplyHandled"

    .line 37
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->f:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "downloadFinishReason"

    .line 38
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->nn:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "clickDownloadTime"

    .line 39
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->fo:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "clickDownloadSize"

    .line 40
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ev:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "installAfterCleanSpace"

    .line 41
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ky:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "funnelType"

    .line 42
    iget v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ds:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "webUrl"

    .line 43
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->jh:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "enableShowComplianceDialog"

    .line 44
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->e:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "isAutoDownloadOnCardShow"

    .line 45
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ju:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "enable_new_activity"

    .line 46
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->ot:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "enable_pause"

    .line 47
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->cq:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "enable_ah"

    .line 48
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->vv:Z

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "enable_am"

    .line 49
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->m:Z

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "intent_jump_browser_success"

    .line 50
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/vv/m;->uw:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "task_key"

    .line 51
    iget-object v2, p0, Lcom/ss/android/downloadad/api/vv/m;->di:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v1

    .line 52
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->x()Lcom/ss/android/download/api/m/vv;

    move-result-object v2

    const-string v3, "NativeDownloadModel toJson"

    invoke-interface {v2, v1, v3}, Lcom/ss/android/download/api/m/vv;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_4
    return-object v0
.end method

.method public v()Lcom/ss/android/download/api/download/DownloadEventConfig;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/vv/m;->mm()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    move-result-object v0

    return-object v0
.end method

.method public v(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->uw:Z

    return-void
.end method

.method public vu()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->vu:I

    return v0
.end method

.method public vv()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->k:Ljava/lang/String;

    return-object v0
.end method

.method public vv(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ns:I

    return-void
.end method

.method public vv(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ff:J

    return-void
.end method

.method public vv(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->c:Ljava/lang/String;

    return-void
.end method

.method public vv(Lorg/json/JSONObject;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->v:Lorg/json/JSONObject;

    return-void
.end method

.method public vv(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->x:Z

    return-void
.end method

.method public w()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->w:I

    return v0
.end method

.method public wv()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadad/api/vv/m;->jb:Ljava/lang/String;

    return-object v0
.end method

.method public wv(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ds:I

    return-void
.end method

.method public wv(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/vv/m;->ev:J

    return-void
.end method

.method public wv(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/vv/m;->b:Ljava/lang/String;

    return-void
.end method

.method public wv(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->f:Z

    return-void
.end method

.method public x()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->vv:Z

    return-void
.end method

.method public y()Lcom/ss/android/download/api/download/DownloadModel;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/vv/m;->di()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object v0

    return-object v0
.end method

.method public y(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/vv/m;->m:Z

    return-void
.end method

.method public ya()Lcom/ss/android/download/api/download/DownloadController;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/vv/m;->dj()Lcom/ss/android/downloadad/api/download/AdDownloadController;

    move-result-object v0

    return-object v0
.end method

.method public yj()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/vv/m;->ah:Z

    return v0
.end method

.method public zn()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/vv/m;->qv:I

    return v0
.end method
