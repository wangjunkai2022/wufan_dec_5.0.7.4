.class public final Lcom/kwad/sdk/components/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static cZ(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/components/c;->cY(Ljava/lang/String;)Lcom/kwad/sdk/components/DevelopMangerComponents$DevelopValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/components/DevelopMangerComponents$DevelopValue;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static encryptDisable()Z
    .locals 1

    const-string v0, "KEY_HOST_ENCRYPT_DISABLE"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/components/f;->cZ(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
