.class public Lcom/kwad/sdk/commercial/e/c;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apF:Ljava/lang/String;

.field public apG:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static Bw()Lcom/kwad/sdk/commercial/e/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/e/c;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/e/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final cI(Ljava/lang/String;)Lcom/kwad/sdk/commercial/e/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/e/c;->apF:Ljava/lang/String;

    return-object p0
.end method

.method public final cJ(Ljava/lang/String;)Lcom/kwad/sdk/commercial/e/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/e/c;->apG:Ljava/lang/String;

    return-object p0
.end method
