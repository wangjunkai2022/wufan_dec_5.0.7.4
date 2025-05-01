.class public Lcom/kwad/components/core/video/a/d$b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/video/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public SK:J

.field public VI:I

.field public Wa:Ljava/lang/String;

.field public Wb:J

.field public Wc:J

.field public Wd:J

.field public creativeId:J

.field public llsid:J

.field public videoDuration:J

.field public videoUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a/d$b;->sD()Lcom/kwad/components/core/video/a/d$b;

    move-result-object v0

    return-object v0
.end method

.method public final sD()Lcom/kwad/components/core/video/a/d$b;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/video/a/d$b;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 2
    :catch_0
    new-instance v0, Lcom/kwad/components/core/video/a/d$b;

    invoke-direct {v0}, Lcom/kwad/components/core/video/a/d$b;-><init>()V

    return-object v0
.end method
