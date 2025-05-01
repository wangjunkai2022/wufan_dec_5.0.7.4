.class public final Lcom/kwad/components/core/o/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/o/a$a;
    }
.end annotation


# static fields
.field private static RR:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static G(J)Lcom/kwad/sdk/core/report/n;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/report/n;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/core/report/n;-><init>(J)V

    return-object v0
.end method

.method private static a(JLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)Lcom/kwad/sdk/core/report/n;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/report/n;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/kwad/sdk/core/report/n;-><init>(JLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V

    return-object v0
.end method

.method private static b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/report/n;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/sdk/core/report/n;-><init>(JLcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-object v0
.end method

.method public static qI()Lcom/kwad/components/core/o/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/o/a$a;->qM()Lcom/kwad/components/core/o/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(ILcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V
    .locals 2
    .param p2    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    int-to-long v0, p1

    .line 6
    invoke-static {v0, v1, p2, p3}, Lcom/kwad/components/core/o/a;->a(JLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final a(JI)V
    .locals 3

    .line 32
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Dg()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x4e20

    .line 33
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/sdk/core/report/n;->timestamp:J

    .line 35
    iput p3, v0, Lcom/kwad/sdk/core/report/n;->azY:I

    .line 36
    iput-wide p1, v0, Lcom/kwad/sdk/core/report/n;->posId:J

    const p1, 0x2e548c

    .line 37
    iput p1, v0, Lcom/kwad/sdk/core/report/n;->azZ:I

    .line 38
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/proxy/a/b;)V
    .locals 3

    const-wide/16 v0, 0x27e7

    .line 26
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 27
    iget-object v1, p1, Lcom/kwad/components/core/proxy/a/b;->RH:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/sdk/core/report/n;->RH:Ljava/lang/String;

    .line 28
    iget-wide v1, p1, Lcom/kwad/components/core/proxy/a/b;->RO:J

    iput-wide v1, v0, Lcom/kwad/sdk/core/report/n;->RO:J

    .line 29
    iget-wide v1, p1, Lcom/kwad/components/core/proxy/a/b;->RP:J

    iput-wide v1, v0, Lcom/kwad/sdk/core/report/n;->RP:J

    .line 30
    iget-wide v1, p1, Lcom/kwad/components/core/proxy/a/b;->RQ:J

    iput-wide v1, v0, Lcom/kwad/sdk/core/report/n;->RQ:J

    .line 31
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;JJI)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x27db

    .line 8
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 9
    iput-wide p2, p1, Lcom/kwad/sdk/core/report/n;->WF:J

    .line 10
    iput-wide p4, p1, Lcom/kwad/sdk/core/report/n;->blockDuration:J

    int-to-long p2, p6

    .line 11
    iput-wide p2, p1, Lcom/kwad/sdk/core/report/n;->aze:J

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x2713

    .line 2
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 3
    iput-object p2, p1, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    .line 4
    iput-object p3, p1, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/internal/api/SceneImpl;ZLjava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x27e8

    .line 21
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 22
    iput-boolean p2, v0, Lcom/kwad/sdk/core/report/n;->azz:Z

    .line 23
    iput-object p3, v0, Lcom/kwad/sdk/core/report/n;->azA:Ljava/lang/String;

    .line 24
    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 25
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final a(ZLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v0, 0x27dc

    .line 13
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 14
    iput-boolean p1, v0, Lcom/kwad/sdk/core/report/n;->azz:Z

    .line 15
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 16
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 17
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 18
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 19
    :cond_0
    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azy:Lorg/json/JSONArray;

    .line 20
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final aD(I)V
    .locals 2

    const-wide/16 v0, 0x2778

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    iput p1, v0, Lcom/kwad/sdk/core/report/n;->azp:I

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final aE(I)V
    .locals 2

    const-wide/16 v0, 0x277b

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    iput p1, v0, Lcom/kwad/sdk/core/report/n;->azq:I

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final ap(Landroid/content/Context;)V
    .locals 3

    const-wide/16 v0, 0xb

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    const-class v1, Lcom/kwad/sdk/components/n;

    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/components/n;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zm()Ljava/util/List;

    move-result-object v2

    .line 4
    invoke-interface {v1, p1, v2}, Lcom/kwad/sdk/components/n;->b(Landroid/content/Context;Ljava/util/List;)[Lorg/json/JSONArray;

    move-result-object p1

    const/4 v1, 0x0

    .line 5
    aget-object v1, p1, v1

    iput-object v1, v0, Lcom/kwad/sdk/core/report/n;->azh:Lorg/json/JSONArray;

    const/4 v1, 0x1

    .line 6
    aget-object p1, p1, v1

    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azi:Lorg/json/JSONArray;

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    :cond_0
    return-void
.end method

.method public final av(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x2717

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final aw(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x27e0

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final ax(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x27e1

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x2ee6

    .line 2
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 3
    iput p2, p1, Lcom/kwad/sdk/core/report/n;->Ye:I

    .line 4
    iput p3, p1, Lcom/kwad/sdk/core/report/n;->are:I

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdTemplate;JI)V
    .locals 3
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x68

    .line 14
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 15
    invoke-static {p1}, Lcom/kwad/sdk/utils/l;->eo(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/sdk/core/report/n;->clickTime:J

    .line 16
    iput-wide p2, v0, Lcom/kwad/sdk/core/report/n;->azD:J

    .line 17
    iput p4, v0, Lcom/kwad/sdk/core/report/n;->azE:I

    .line 18
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x2715

    .line 6
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dK(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    .line 11
    :goto_0
    iput-object p2, v0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    .line 12
    iput-object p3, v0, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    .line 13
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final c(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x2712

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/report/n;->Fx()V

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dK(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    .line 7
    :goto_0
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "what"

    .line 8
    invoke-virtual {p1, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "extra"

    .line 9
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 10
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 11
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 12
    :goto_1
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final c(Lorg/json/JSONArray;)V
    .locals 2
    .param p1    # Lorg/json/JSONArray;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x27d8

    .line 13
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 14
    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azt:Lorg/json/JSONArray;

    .line 15
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final e(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V
    .locals 2

    const-wide/16 v0, 0x277c

    .line 5
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 6
    iput p2, p1, Lcom/kwad/sdk/core/report/n;->azq:I

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/o/a;->m(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    invoke-static {p1, p3}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;Z)V

    return-void
.end method

.method public final e(Lorg/json/JSONObject;I)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x27d9

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    const-string v1, "appChangeType"

    .line 2
    invoke-static {p1, v1, p2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 3
    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azs:Lorg/json/JSONObject;

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final f(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V
    .locals 4
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Dg()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    const-wide/16 v1, 0x4e20

    .line 7
    invoke-static {v1, v2}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v1

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/kwad/sdk/core/report/n;->timestamp:J

    .line 9
    iput p2, v1, Lcom/kwad/sdk/core/report/n;->azY:I

    .line 10
    iget-object p2, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->trace:Ljava/lang/String;

    iput-object p2, v1, Lcom/kwad/sdk/core/report/n;->trace:Ljava/lang/String;

    const p2, 0x2e548c

    .line 11
    iput p2, v1, Lcom/kwad/sdk/core/report/n;->azZ:I

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dL(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide p1

    iput-wide p1, v1, Lcom/kwad/sdk/core/report/n;->posId:J

    .line 13
    invoke-static {v1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final f(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x277d

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    const/4 p2, 0x1

    .line 2
    iput p2, p1, Lcom/kwad/sdk/core/report/n;->azq:I

    .line 3
    iput-object p3, p1, Lcom/kwad/sdk/core/report/n;->azr:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final g(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x6b

    .line 4
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 5
    iput p2, p1, Lcom/kwad/sdk/core/report/n;->errorCode:I

    .line 6
    iput-object p3, p1, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final g(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x27da

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 2
    iput-wide p2, p1, Lcom/kwad/sdk/core/report/n;->azx:J

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final h(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V
    .locals 2

    const-wide/16 v0, 0x27de

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 2
    iput-wide p2, p1, Lcom/kwad/sdk/core/report/n;->azN:J

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final i(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V
    .locals 2

    const-wide/16 v0, 0x27df

    .line 1
    invoke-static {v0, v1, p1}, Lcom/kwad/components/core/o/a;->b(JLcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    .line 2
    iput-wide p2, p1, Lcom/kwad/sdk/core/report/n;->azO:J

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/core/report/n;
    .locals 2

    const-wide/16 v0, 0x2fa8

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    iput-object p1, v0, Lcom/kwad/sdk/core/report/n;->azW:Ljava/lang/String;

    .line 3
    iput-object p2, v0, Lcom/kwad/sdk/core/report/n;->azX:Ljava/lang/String;

    return-object v0
.end method

.method public final qJ()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/kwad/components/core/o/a;->RR:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/kwad/components/core/o/a;->RR:Z

    .line 3
    new-instance v0, Lcom/kwad/components/core/o/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/o/a$1;-><init>(Lcom/kwad/components/core/o/a;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final qK()V
    .locals 2

    const-wide/16 v0, 0x2775

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public final qL()V
    .locals 2

    const-wide/16 v0, 0x277a

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/core/o/a;->G(J)Lcom/kwad/sdk/core/report/n;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method
