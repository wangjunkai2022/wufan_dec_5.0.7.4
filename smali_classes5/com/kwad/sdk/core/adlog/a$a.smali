.class public Lcom/kwad/sdk/core/adlog/a$a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/adlog/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public aqh:I

.field public aqi:Ljava/lang/String;

.field public aqj:I

.field public aqk:I

.field public aql:I

.field public aqm:I

.field public aqn:Lorg/json/JSONObject;

.field public aqo:I

.field public aqp:I

.field public aqq:Lcom/kwad/sdk/core/track/AdTrackLog;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public duration:J

.field public showLiveStatus:I

.field public showLiveStyle:I

.field public templateId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqh:I

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/kwad/sdk/core/adlog/a$a;->duration:J

    .line 4
    iput v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStatus:I

    .line 5
    iput v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStyle:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/sdk/core/track/AdTrackLog;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/f/a<",
            "Lcom/kwad/sdk/core/track/AdTrackLog;",
            ">;)",
            "Lcom/kwad/sdk/core/track/AdTrackLog;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    const-class v1, Lcom/kwad/sdk/service/a/h;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/h;

    if-eqz v1, :cond_2

    .line 2
    invoke-interface {v1}, Lcom/kwad/sdk/service/a/h;->zz()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/track/AdTrackLog;

    invoke-direct {v0, p2, p3}, Lcom/kwad/sdk/core/track/AdTrackLog;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqq:Lcom/kwad/sdk/core/track/AdTrackLog;

    .line 4
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/track/AdTrackLog;->bindABParams(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    if-eqz p4, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqq:Lcom/kwad/sdk/core/track/AdTrackLog;

    invoke-interface {p4, p1}, Lcom/kwad/sdk/f/a;->accept(Ljava/lang/Object;)V

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqq:Lcom/kwad/sdk/core/track/AdTrackLog;

    return-object p1

    :cond_2
    return-object v0
.end method

.method public afterToJson(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/response/a/a;->afterToJson(Lorg/json/JSONObject;)V

    .line 2
    iget v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqh:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const-string v2, "shield_reason"

    .line 3
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 4
    :cond_0
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/a$a;->duration:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    const-string v0, "duration"

    .line 5
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 6
    :cond_1
    iget v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStatus:I

    if-eq v0, v1, :cond_2

    const-string v2, "show_live_status"

    .line 7
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 8
    :cond_2
    iget v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStyle:I

    if-eq v0, v1, :cond_3

    const-string v1, "show_live_style"

    .line 9
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqq:Lcom/kwad/sdk/core/track/AdTrackLog;

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ad_track_log"

    .line 12
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    :cond_4
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqn:Lorg/json/JSONObject;

    if-eqz v0, :cond_5

    .line 14
    :try_start_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 17
    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/a$a;->aqn:Lorg/json/JSONObject;

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_5
    return-void
.end method
