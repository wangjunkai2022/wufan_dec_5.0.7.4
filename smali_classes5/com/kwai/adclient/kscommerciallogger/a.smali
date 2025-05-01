.class public final Lcom/kwai/adclient/kscommerciallogger/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwai/adclient/kscommerciallogger/a$a;
    }
.end annotation


# instance fields
.field private aUC:Lcom/kwai/adclient/kscommerciallogger/a/a;

.field private aUD:Lcom/kwai/adclient/kscommerciallogger/a/b;

.field private aUE:Lorg/json/JSONObject;

.field private aUF:Z

.field private isDebug:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwai/adclient/kscommerciallogger/a;->isDebug:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUF:Z

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwai/adclient/kscommerciallogger/a;-><init>()V

    return-void
.end method

.method public static OQ()Lcom/kwai/adclient/kscommerciallogger/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwai/adclient/kscommerciallogger/a$a;->OQ()Lcom/kwai/adclient/kscommerciallogger/a;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/kwai/adclient/kscommerciallogger/model/c;)V
    .locals 1
    .param p1    # Lcom/kwai/adclient/kscommerciallogger/model/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUC:Lcom/kwai/adclient/kscommerciallogger/a/a;

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OU()Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OU()Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;

    move-result-object v0

    iget-object v0, v0, Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;->value:Ljava/lang/String;

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OV()Lcom/kwai/adclient/kscommerciallogger/model/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OV()Lcom/kwai/adclient/kscommerciallogger/model/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwai/adclient/kscommerciallogger/model/d;->getValue()Ljava/lang/String;

    :goto_1
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OY()Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OW()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/kwai/adclient/kscommerciallogger/b;->z(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OX()Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lcom/kwai/adclient/kscommerciallogger/b;->z(Lorg/json/JSONObject;)Ljava/lang/String;

    :cond_2
    return-void
.end method


# virtual methods
.method public final OR()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUE:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final OS()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUF:Z

    return v0
.end method

.method public final a(Lcom/kwai/adclient/kscommerciallogger/a/a;Lcom/kwai/adclient/kscommerciallogger/a/b;Lorg/json/JSONObject;ZZ)V
    .locals 0
    .param p1    # Lcom/kwai/adclient/kscommerciallogger/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwai/adclient/kscommerciallogger/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUC:Lcom/kwai/adclient/kscommerciallogger/a/a;

    .line 2
    iput-object p2, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUD:Lcom/kwai/adclient/kscommerciallogger/a/b;

    .line 3
    iput-object p3, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUE:Lorg/json/JSONObject;

    .line 4
    iput-boolean p4, p0, Lcom/kwai/adclient/kscommerciallogger/a;->isDebug:Z

    .line 5
    iput-boolean p5, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUF:Z

    return-void
.end method

.method public final a(Lcom/kwai/adclient/kscommerciallogger/model/c;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwai/adclient/kscommerciallogger/a;->b(Lcom/kwai/adclient/kscommerciallogger/model/c;)V

    .line 7
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/a;->aUD:Lcom/kwai/adclient/kscommerciallogger/a/b;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->OT()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kwai/adclient/kscommerciallogger/model/c;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/kwai/adclient/kscommerciallogger/a/b;->L(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final isDebug()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwai/adclient/kscommerciallogger/a;->isDebug:Z

    return v0
.end method
