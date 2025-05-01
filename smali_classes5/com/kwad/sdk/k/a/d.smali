.class public final Lcom/kwad/sdk/k/a/d;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;


# instance fields
.field public aOc:I

.field public aOd:I

.field public aOe:I

.field public aOf:I

.field public aOg:I

.field public aOh:I

.field public aOi:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/k/a/d;->aOc:I

    .line 3
    iput v0, p0, Lcom/kwad/sdk/k/a/d;->aOd:I

    .line 4
    iput v0, p0, Lcom/kwad/sdk/k/a/d;->aOe:I

    .line 5
    iput v0, p0, Lcom/kwad/sdk/k/a/d;->aOf:I

    .line 6
    iput v0, p0, Lcom/kwad/sdk/k/a/d;->aOg:I

    .line 7
    iput v0, p0, Lcom/kwad/sdk/k/a/d;->aOh:I

    .line 8
    iput v0, p0, Lcom/kwad/sdk/k/a/d;->aOi:I

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v1, "adb_enabled"

    invoke-static {p1, v1, v0}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p1

    if-lez p1, :cond_0

    const/4 v0, 0x1

    .line 10
    :cond_0
    invoke-direct {p0, v0}, Lcom/kwad/sdk/k/a/d;->bM(Z)V

    :cond_1
    return-void
.end method

.method private a(Lcom/kwad/sdk/k/a/d;Lorg/json/JSONObject;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    const-string v0, "isRoot"

    .line 1
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/kwad/sdk/k/a/d;->aOc:I

    const-string v0, "isXPosed"

    .line 2
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/kwad/sdk/k/a/d;->aOd:I

    const-string v0, "isFrameworkHooked"

    .line 3
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/kwad/sdk/k/a/d;->aOe:I

    const-string v0, "isVirtual"

    .line 4
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/kwad/sdk/k/a/d;->aOf:I

    const-string v0, "isAdbEnabled"

    .line 5
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/kwad/sdk/k/a/d;->aOg:I

    const-string v0, "isEmulator"

    .line 6
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/kwad/sdk/k/a/d;->aOh:I

    const-string v0, "isGroupControl"

    .line 7
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/kwad/sdk/k/a/d;->aOi:I

    .line 8
    invoke-super {p0, p2}, Lcom/kwad/sdk/core/response/a/a;->afterParseJson(Lorg/json/JSONObject;)V

    return-void
.end method

.method private static b(Lcom/kwad/sdk/k/a/d;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/k/a/d;->aOc:I

    const-string v1, "isRoot"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 2
    iget v0, p0, Lcom/kwad/sdk/k/a/d;->aOd:I

    const-string v1, "isXPosed"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 3
    iget v0, p0, Lcom/kwad/sdk/k/a/d;->aOe:I

    const-string v1, "isFrameworkHooked"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 4
    iget v0, p0, Lcom/kwad/sdk/k/a/d;->aOf:I

    const-string v1, "isVirtual"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 5
    iget v0, p0, Lcom/kwad/sdk/k/a/d;->aOg:I

    const-string v1, "isAdbEnabled"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 6
    iget v0, p0, Lcom/kwad/sdk/k/a/d;->aOh:I

    const-string v1, "isEmulator"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 7
    iget p0, p0, Lcom/kwad/sdk/k/a/d;->aOi:I

    const-string v0, "isGroupControl"

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    return-object p1
.end method

.method private bM(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/k/a/d;->bP(Z)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/k/a/d;->aOg:I

    return-void
.end method

.method private static bP(Z)I
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0
.end method


# virtual methods
.method public final bJ(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/k/a/d;->bP(Z)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/k/a/d;->aOc:I

    return-void
.end method

.method public final bK(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/k/a/d;->bP(Z)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/k/a/d;->aOd:I

    return-void
.end method

.method public final bL(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/k/a/d;->bP(Z)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/k/a/d;->aOe:I

    return-void
.end method

.method public final bN(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/k/a/d;->bP(Z)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/k/a/d;->aOh:I

    return-void
.end method

.method public final bO(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/k/a/d;->bP(Z)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/k/a/d;->aOi:I

    return-void
.end method

.method public final parseJson(Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p0, p1}, Lcom/kwad/sdk/k/a/d;->a(Lcom/kwad/sdk/k/a/d;Lorg/json/JSONObject;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/response/a/a;->afterParseJson(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 1

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {p0, v0}, Lcom/kwad/sdk/k/a/d;->b(Lcom/kwad/sdk/k/a/d;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/response/a/a;->afterToJson(Lorg/json/JSONObject;)V

    return-object v0
.end method
