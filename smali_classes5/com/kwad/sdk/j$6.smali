.class final Lcom/kwad/sdk/j$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/report/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/j;->yP()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final aa(J)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->asn:Lcom/kwad/sdk/core/config/item/o;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/config/item/o;->aa(J)Z

    move-result p1

    return p1
.end method

.method public final ue()I
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/components/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/a/a/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/a/a/a;->ue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final yS()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->yS()I

    move-result v0

    return v0
.end method
