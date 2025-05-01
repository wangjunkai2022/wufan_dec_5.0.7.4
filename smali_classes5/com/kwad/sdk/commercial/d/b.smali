.class public Lcom/kwad/sdk/commercial/d/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public adNum:I

.field public adSource:Ljava/lang/String;

.field public apA:Z

.field public apB:Z

.field public apC:Ljava/lang/String;

.field public apz:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static Bu()Lcom/kwad/sdk/commercial/d/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/d/b;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/d/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bk(Z)Lcom/kwad/sdk/commercial/d/b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/commercial/d/b;->apA:Z

    return-object p0
.end method

.method public final cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/d/b;->apz:Ljava/lang/String;

    return-object p0
.end method

.method public final cE(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/d/b;->apC:Ljava/lang/String;

    return-object p0
.end method

.method public final cF(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/d/b;->adSource:Ljava/lang/String;

    return-object p0
.end method

.method public final ci(I)Lcom/kwad/sdk/commercial/d/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/d/b;->adNum:I

    return-object p0
.end method
