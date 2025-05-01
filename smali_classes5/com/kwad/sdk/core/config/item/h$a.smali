.class public final Lcom/kwad/sdk/core/config/item/h$a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/config/item/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public aux:Ljava/lang/String;

.field public auy:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/kwad/sdk/core/config/item/h$a;->aux:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/kwad/sdk/core/config/item/h$a;->auy:Ljava/lang/String;

    return-void
.end method
