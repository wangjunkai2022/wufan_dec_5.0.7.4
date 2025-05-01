.class public final Lcom/kwad/sdk/commercial/j/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/commercial/j/a$a;
    }
.end annotation


# static fields
.field private static apR:Lcom/kwad/sdk/commercial/j/a$a;


# direct methods
.method private static BC()Lcom/kwad/sdk/commercial/j/a$a;
    .locals 2

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zC()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/kwad/sdk/commercial/j/a$1;

    invoke-direct {v1}, Lcom/kwad/sdk/commercial/j/a$1;-><init>()V

    .line 4
    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/t;->b(Ljava/lang/String;Lcom/kwad/sdk/core/c;)Lcom/kwad/sdk/core/b;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/commercial/j/a$a;

    sput-object v0, Lcom/kwad/sdk/commercial/j/a;->apR:Lcom/kwad/sdk/commercial/j/a$a;

    .line 5
    :cond_0
    sget-object v0, Lcom/kwad/sdk/commercial/j/a;->apR:Lcom/kwad/sdk/commercial/j/a$a;

    return-object v0
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;II)V
    .locals 2

    .line 20
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/j/b;->BF()Lcom/kwad/sdk/commercial/j/b;

    move-result-object v0

    const/4 v1, 0x2

    .line 21
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/j/b;->cn(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/j/b;->co(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 23
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/j/b;->cV(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 24
    invoke-virtual {p1, p4}, Lcom/kwad/sdk/commercial/j/b;->cp(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 25
    invoke-virtual {p1, p3}, Lcom/kwad/sdk/commercial/j/b;->cq(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 26
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/j/b;->bE(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 27
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/j/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 28
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 3

    const/4 v0, 0x1

    .line 29
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/j/b;->BF()Lcom/kwad/sdk/commercial/j/b;

    move-result-object v1

    const/4 v2, 0x3

    .line 30
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/commercial/j/b;->cn(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object v1

    .line 31
    invoke-virtual {v1, p1}, Lcom/kwad/sdk/commercial/j/b;->co(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 32
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/j/b;->cV(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 33
    invoke-virtual {p1, p3}, Lcom/kwad/sdk/commercial/j/b;->cW(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 34
    invoke-virtual {p1, p4}, Lcom/kwad/sdk/commercial/j/b;->cq(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 35
    invoke-virtual {p1, p5}, Lcom/kwad/sdk/commercial/j/b;->cX(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 36
    invoke-virtual {p1, p6}, Lcom/kwad/sdk/commercial/j/b;->cp(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 37
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/j/b;->bE(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 38
    invoke-static {p0, v0, p1}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/j/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 39
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/j/b;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0, p1}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/j/b;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 10
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_client_error_log"

    .line 11
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 13
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d;->aT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_sdk_macro_check_performance"

    const-string v2, "error_name"

    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 15
    invoke-static {}, Lcom/kwad/sdk/commercial/i/a;->BB()Lcom/kwad/sdk/commercial/i/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/kwad/sdk/commercial/i/a;->cN(Ljava/lang/String;)Lcom/kwad/sdk/commercial/i/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/i/a;->cP(Ljava/lang/String;)Lcom/kwad/sdk/commercial/i/a;

    move-result-object p1

    .line 16
    invoke-virtual {p1, p3}, Lcom/kwad/sdk/commercial/i/a;->cQ(Ljava/lang/String;)Lcom/kwad/sdk/commercial/i/a;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/kwad/sdk/commercial/i/a;->cO(Ljava/lang/String;)Lcom/kwad/sdk/commercial/i/a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/i/a;->bD(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/i/a;

    move-result-object p0

    .line 17
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 18
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 19
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/j/b;)V
    .locals 3

    .line 2
    iget-object v0, p2, Lcom/kwad/sdk/commercial/j/b;->apL:Ljava/lang/String;

    invoke-static {v0}, Lcom/kwad/sdk/commercial/j/a;->cU(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_1

    const-string v1, "ad_client_error_log"

    goto :goto_0

    :cond_1
    const-string v1, "ad_client_apm_log"

    .line 4
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_2

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    goto :goto_1

    :cond_2
    const-wide v1, 0x3f50624dd2f1a9fcL    # 0.001

    .line 5
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d;->aT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string p1, "ad_sdk_track_performance"

    const-string v0, "status"

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 8
    invoke-virtual {p0, p2}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method private static cU(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/commercial/j/a;->BC()Lcom/kwad/sdk/commercial/j/a$a;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 3
    :cond_1
    iget-object v0, v0, Lcom/kwad/sdk/commercial/j/a$a;->apS:Ljava/util/List;

    if-nez v0, :cond_2

    return v1

    .line 4
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_4
    return v1
.end method

.method public static n(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/j/b;->BF()Lcom/kwad/sdk/commercial/j/b;

    move-result-object v0

    const/4 v1, 0x4

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/j/b;->cn(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/j/b;->co(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/j/b;->cV(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/j/b;->bE(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 6
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/j/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static o(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/j/b;->BF()Lcom/kwad/sdk/commercial/j/b;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/j/b;->cn(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/j/b;->co(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/j/b;->cV(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/j/b;->bE(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    .line 6
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/j/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method
