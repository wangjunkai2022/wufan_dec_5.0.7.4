.class public final Lcom/kwad/sdk/core/report/n$a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/report/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public aAe:I

.field public aAf:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    return-void
.end method

.method public static Fy()Lcom/kwad/sdk/core/report/n$a;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/report/n$a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/report/n$a;-><init>()V

    .line 2
    sget v1, Lcom/kwad/sdk/core/report/n$b;->aAe:I

    iput v1, v0, Lcom/kwad/sdk/core/report/n$a;->aAe:I

    .line 3
    sget v1, Lcom/kwad/sdk/core/report/n$b;->aAf:I

    iput v1, v0, Lcom/kwad/sdk/core/report/n$a;->aAf:I

    return-object v0
.end method
