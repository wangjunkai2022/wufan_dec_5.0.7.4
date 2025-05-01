.class public final Lcom/kwad/components/ad/g/b;
.super Lcom/kwad/sdk/components/d;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/components/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/components/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final K(Landroid/content/Context;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/app/AppPackageInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/kwad/components/ad/g/a;->K(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;Lcom/kwad/sdk/f/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/kwad/sdk/f/a<",
            "Lorg/json/JSONArray;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/components/ad/g/a;->a(Landroid/content/Context;Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final b(Landroid/content/Context;Ljava/util/List;)[Lorg/json/JSONArray;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)[",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/components/ad/g/a;->b(Landroid/content/Context;Ljava/util/List;)[Lorg/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/util/Map;)Lorg/json/JSONArray;
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/app/AppPackageInfo;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/kwad/components/ad/g/a;->c(Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 3
    invoke-static {p2, p1}, Lcom/kwad/components/ad/g/a;->a(Landroid/content/pm/PackageInfo;Landroid/content/pm/PackageManager;)Lcom/kwad/sdk/app/AppPackageInfo;

    move-result-object p1

    .line 4
    invoke-static {p1}, Lcom/kwad/components/ad/g/a;->a(Lcom/kwad/sdk/app/AppPackageInfo;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getComponentsType()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/components/n;

    return-object v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public final x(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/app/AppPackageInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/app/AppPackageInfo;-><init>()V

    .line 2
    iput-object p1, v0, Lcom/kwad/sdk/app/AppPackageInfo;->packageName:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/g/a;->a(Lcom/kwad/sdk/app/AppPackageInfo;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
