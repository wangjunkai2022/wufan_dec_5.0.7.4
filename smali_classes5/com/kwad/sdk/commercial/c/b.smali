.class public Lcom/kwad/sdk/commercial/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public apu:D

.field public apv:D

.field public apw:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "3.3.63"

    .line 2
    iput-object v0, p0, Lcom/kwad/sdk/commercial/c/b;->apw:Ljava/lang/String;

    return-void
.end method
