.class public final Lcom/kwad/components/ad/feed/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static aW()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/ad/feed/a/a;->ev:Lcom/kwad/sdk/core/config/item/d;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/config/item/d;->Ds()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static aX()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/ad/feed/a/a;->ew:Lcom/kwad/sdk/core/config/item/k;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/config/item/k;->Dx()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
