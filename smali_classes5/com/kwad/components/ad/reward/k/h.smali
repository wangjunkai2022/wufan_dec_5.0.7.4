.class public final Lcom/kwad/components/ad/reward/k/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/k/h$a;
    }
.end annotation


# instance fields
.field private xl:Lcom/kwad/components/ad/reward/k/h$a;


# direct methods
.method public constructor <init>(Lcom/kwad/components/ad/reward/k/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/k/h;->xl:Lcom/kwad/components/ad/reward/k/h$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object p2, p0, Lcom/kwad/components/ad/reward/k/h;->xl:Lcom/kwad/components/ad/reward/k/h$a;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "severCheckResult"

    .line 3
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/k/h;->xl:Lcom/kwad/components/ad/reward/k/h$a;

    invoke-interface {p1, p2}, Lcom/kwad/components/ad/reward/k/h$a;->R(I)V

    :cond_0
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "hasReward"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/ad/reward/k/h;->xl:Lcom/kwad/components/ad/reward/k/h$a;

    return-void
.end method
