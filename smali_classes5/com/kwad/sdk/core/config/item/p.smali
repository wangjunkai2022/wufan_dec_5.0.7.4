.class public final Lcom/kwad/sdk/core/config/item/p;
.super Lcom/kwad/sdk/core/config/item/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/config/item/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/core/config/item/b<",
        "Lcom/kwad/sdk/core/config/item/p$a;",
        ">;"
    }
.end annotation


# instance fields
.field private auE:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "sdkPackInfo"

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/config/item/b;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/SharedPreferences;)V
    .locals 2

    const-string v0, "sdkPackInfo"

    const/4 v1, 0x0

    .line 1
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/config/item/b;->du(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/config/item/p;->auE:Ljava/lang/String;

    .line 3
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/kwad/sdk/core/config/item/p;->auE:Ljava/lang/String;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/config/item/p$a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/config/item/p$a;-><init>()V

    .line 6
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/config/item/p$a;->parseJson(Lorg/json/JSONObject;)V

    .line 7
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/config/item/b;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    return-void
.end method

.method public final b(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/config/item/p;->auE:Ljava/lang/String;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/item/b;->dt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sdkPackInfo"

    .line 2
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public final k(Lorg/json/JSONObject;)V
    .locals 1

    const-string v0, "sdkPackInfo"

    .line 1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/config/item/p;->auE:Ljava/lang/String;

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/config/item/p$a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/config/item/p$a;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/config/item/p$a;->parseJson(Lorg/json/JSONObject;)V

    .line 5
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/config/item/b;->setValue(Ljava/lang/Object;)V

    return-void
.end method
