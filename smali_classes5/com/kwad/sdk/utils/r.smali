.class public final Lcom/kwad/sdk/utils/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aQd:Z

.field private static aQe:Lcom/kwad/sdk/utils/c/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/c/a;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/c/a;-><init>()V

    sput-object v0, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    return-void
.end method

.method private static a(Landroid/content/Context;Landroid/location/LocationManager;)Landroid/location/Location;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 1
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "gps"

    .line 2
    invoke-virtual {p1, p0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object p0

    if-nez p0, :cond_0

    .line 3
    sput-boolean v0, Lcom/kwad/sdk/utils/r;->aQd:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 4
    sput-boolean v0, Lcom/kwad/sdk/utils/r;->aQd:Z

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static b(Landroid/content/Context;Landroid/location/LocationManager;)Landroid/location/Location;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 1
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 2
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_2

    :cond_0
    const-string p0, "network"

    .line 3
    invoke-virtual {p1, p0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object p0

    if-nez p0, :cond_1

    .line 4
    sput-boolean v0, Lcom/kwad/sdk/utils/r;->aQd:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object p0

    :catch_0
    move-exception p0

    .line 5
    sput-boolean v0, Lcom/kwad/sdk/utils/r;->aQd:Z

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static c(Landroid/content/Context;Landroid/location/LocationManager;)Landroid/location/Location;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 1
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "passive"

    .line 2
    invoke-virtual {p1, p0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object p0

    if-nez p0, :cond_0

    .line 3
    sput-boolean v0, Lcom/kwad/sdk/utils/r;->aQd:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 4
    sput-boolean v0, Lcom/kwad/sdk/utils/r;->aQd:Z

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ci(Landroid/content/Context;)Lcom/kwad/sdk/utils/c/a;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/c/a;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/c/a;-><init>()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MT()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/kwad/sdk/utils/av;->MU()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MU()Landroid/location/Location;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    .line 4
    iput v2, v0, Lcom/kwad/sdk/utils/c/a;->type:I

    return-object v0

    .line 5
    :cond_0
    sget-boolean v0, Lcom/kwad/sdk/utils/r;->aQd:Z

    if-nez v0, :cond_8

    sget-object v0, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    if-nez v0, :cond_8

    :cond_1
    if-nez p0, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/utils/av;->MT()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v3, 0x40

    invoke-interface {v0, v3, v4}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    :try_start_0
    const-string v0, "location"

    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-string v3, "gps"

    .line 8
    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 9
    sget-object v3, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/r;->a(Landroid/content/Context;Landroid/location/LocationManager;)Landroid/location/Location;

    move-result-object v4

    iput-object v4, v3, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    .line 10
    :cond_4
    sget-object v3, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    if-nez v3, :cond_5

    const-string v3, "network"

    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 11
    sget-object v3, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/r;->b(Landroid/content/Context;Landroid/location/LocationManager;)Landroid/location/Location;

    move-result-object v4

    iput-object v4, v3, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    .line 12
    :cond_5
    sget-object v3, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    if-nez v3, :cond_6

    const-string v3, "passive"

    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 13
    sget-object v3, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/r;->c(Landroid/content/Context;Landroid/location/LocationManager;)Landroid/location/Location;

    move-result-object p0

    iput-object p0, v3, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    .line 14
    :cond_6
    sget-object p0, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/kwad/sdk/utils/c/a;->type:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 15
    sput-boolean v2, Lcom/kwad/sdk/utils/r;->aQd:Z

    .line 16
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_7
    :goto_0
    return-object v1

    .line 17
    :cond_8
    :goto_1
    sget-object p0, Lcom/kwad/sdk/utils/r;->aQe:Lcom/kwad/sdk/utils/c/a;

    return-object p0
.end method
