.class final Lcom/kwad/sdk/api/loader/n$h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/loader/n$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/api/loader/n$h;->a(Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/api/loader/n$c<",
        "Lcom/kwad/sdk/api/loader/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic aoe:Lcom/kwad/sdk/api/loader/n$c;

.field final synthetic aof:Lcom/kwad/sdk/api/loader/v;

.field final synthetic aol:Lcom/kwad/sdk/api/loader/n$h;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/api/loader/n$h;Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aol:Lcom/kwad/sdk/api/loader/n$h;

    iput-object p2, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aof:Lcom/kwad/sdk/api/loader/v;

    iput-object p3, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lcom/kwad/sdk/api/loader/a$a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v0}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/api/loader/h;->aM(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/api/c;->AD()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getSDKVersion()Ljava/lang/String;

    move-result-object v0

    .line 4
    :cond_0
    iget-object v1, p1, Lcom/kwad/sdk/api/loader/a$a;->sdkVersion:Ljava/lang/String;

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v1}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-wide v2, p1, Lcom/kwad/sdk/api/loader/a$a;->interval:J

    const-string v4, "interval"

    invoke-static {v1, v4, v2, v3}, Lcom/kwad/sdk/api/loader/b;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v1}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-string v4, "lastUpdateTime"

    .line 8
    invoke-static {v1, v4, v2, v3}, Lcom/kwad/sdk/api/loader/b;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 9
    invoke-virtual {p1}, Lcom/kwad/sdk/api/loader/a$a;->AJ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {p1}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/api/loader/u;->aS(Landroid/content/Context;)V

    .line 11
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DynamicType == -1, curVersion: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void

    .line 12
    :cond_1
    iget-object v1, p1, Lcom/kwad/sdk/api/loader/a$a;->sdkVersion:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/kwad/sdk/api/loader/h;->K(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {p1}, Lcom/kwad/sdk/api/loader/a$a;->AI()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 14
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/n$h$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/api/loader/n$c;->i(Ljava/lang/Object;)V

    return-void

    .line 15
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No new sdkVersion. remote sdkVersion:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Lcom/kwad/sdk/api/loader/a$a;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " currentDynamicVersion:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " dynamicType:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/kwad/sdk/api/loader/a$a;->amY:I

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final synthetic i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/api/loader/a$a;

    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/n$h$1;->c(Lcom/kwad/sdk/api/loader/a$a;)V

    return-void
.end method
