.class public final Lcom/kwad/sdk/utils/au;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aQL:Ljava/lang/String;

.field private static aQM:Ljava/lang/String;


# direct methods
.method public static MP()Z
    .locals 1

    const-string v0, "EMUI"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/au;->gS(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static MQ()Z
    .locals 1

    const-string v0, "MIUI"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/au;->gS(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static MR()Z
    .locals 1

    const-string v0, "FLYME"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/au;->gS(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static gS(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "ro.build.version.opporom"

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/utils/bi;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "OPPO"

    .line 4
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto/16 :goto_0

    :cond_1
    const-string v0, "ro.vivo.os.version"

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/utils/bi;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "VIVO"

    .line 6
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto/16 :goto_0

    :cond_2
    const-string v0, "ro.build.version.emui"

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/utils/bi;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "EMUI"

    .line 8
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const-string v0, "ro.miui.ui.version.name"

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/utils/bi;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "MIUI"

    .line 10
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto :goto_0

    :cond_4
    const-string v0, "ro.product.system.manufacturer"

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/utils/bi;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "OnePlus"

    .line 12
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto :goto_0

    :cond_5
    const-string v0, "ro.smartisan.version"

    .line 13
    invoke-static {v0}, Lcom/kwad/sdk/utils/bi;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "SMARTISAN"

    .line 14
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto :goto_0

    :cond_6
    const-string v0, "ro.product.manufacturer"

    .line 15
    invoke-static {v0}, Lcom/kwad/sdk/utils/bi;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SAMSUNG"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 16
    sput-object v1, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto :goto_0

    .line 17
    :cond_7
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 18
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FLYME"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 19
    sput-object v1, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    goto :goto_0

    :cond_8
    const-string v0, "unknown"

    .line 20
    sput-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    .line 21
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    .line 22
    :goto_0
    sget-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static getName()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/utils/au;->gS(Ljava/lang/String;)Z

    .line 3
    :cond_0
    sget-object v0, Lcom/kwad/sdk/utils/au;->aQL:Ljava/lang/String;

    return-object v0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/utils/au;->gS(Ljava/lang/String;)Z

    .line 3
    :cond_0
    sget-object v0, Lcom/kwad/sdk/utils/au;->aQM:Ljava/lang/String;

    return-object v0
.end method
