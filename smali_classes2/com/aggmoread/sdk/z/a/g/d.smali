.class public Lcom/aggmoread/sdk/z/a/g/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Lcom/aggmoread/sdk/z/a/g/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->b()Lcom/aggmoread/sdk/z/a/g/a;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const/4 p2, 0x1

    if-nez p1, :cond_0

    return p2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return p2

    :cond_1
    const-string v0, "unknown"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return p2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const-string p0, "L"

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    const-string p0, "P"

    return-object p0

    :cond_1
    const-string p0, "U"

    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->f:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->s()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->m:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->z()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->i:I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/a;->v()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->j:Ljava/lang/String;

    iput v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->g:I

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/g/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "L"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/g/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "P"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    iput v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->k:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/a;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->l:Ljava/lang/String;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/a;->m()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->d:Ljava/lang/String;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/a;->x()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->e:Ljava/lang/String;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/a;->o()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/g/d;->n:Ljava/lang/String;

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/a/g/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->c:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->a:Ljava/lang/String;

    :goto_2
    const-string v1, "imei"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "imeiMd5"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    const-string v0, "mac"

    :try_start_1
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v0, "androidId"

    :try_start_2
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/d;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    if-nez v0, :cond_5

    const-string v0, "androidIdMd5"

    :try_start_3
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    :cond_5
    const-string v0, "oaid"

    :try_start_4
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->n:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/aggmoread/sdk/z/a/g/d;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lcom/aggmoread/sdk/z/a/h/c;->o:Ljava/lang/String;

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->n:Ljava/lang/String;

    :goto_3
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    const-string v0, "model"

    :try_start_5
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    const-string v0, "vendor"

    :try_start_6
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    const-string v0, "screenWidth"

    :try_start_7
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->y()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    const-string v0, "screenHeight"

    :try_start_8
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->g()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    const-string v0, "osType"

    :try_start_9
    iget v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->g:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    const-string v0, "osVersion"

    :try_start_a
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_0

    const-string v0, "deviceType"

    :try_start_b
    iget v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->i:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    const-string v0, "ua"

    :try_start_c
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->j:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_0

    const-string v0, "ppi"

    :try_start_d
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->r()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0

    const-string v0, "screenOrientation"

    :try_start_e
    iget v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->k:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0

    const-string v0, "serialNo"

    :try_start_f
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->m:Ljava/lang/String;

    const-string v2, "unknown"

    invoke-direct {p0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->c:Ljava/lang/String;

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->m:Ljava/lang/String;

    :goto_4
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_0

    const-string v0, "brand"

    :try_start_10
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->l:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_0

    const-string v0, "imsi"

    :try_start_11
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_0

    const-string v0, "updateMark"

    :try_start_12
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_0

    const-string v0, "bootMark"

    :try_start_13
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_13
    .catch Lorg/json/JSONException; {:try_start_13 .. :try_end_13} :catch_0

    const-string v0, "systemBootTimeMilliSec"

    :try_start_14
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->t()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_0

    const-string v0, "deviceNameMd5"

    :try_start_15
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->d:Ljava/lang/String;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_15
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_0

    const-string v0, "physicalMemoryKBytes"

    :try_start_16
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->l()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_16
    .catch Lorg/json/JSONException; {:try_start_16 .. :try_end_16} :catch_0

    const-string v0, "hardDiskSizeKBytes"

    :try_start_17
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->f()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_17
    .catch Lorg/json/JSONException; {:try_start_17 .. :try_end_17} :catch_0

    const-string v0, "systemUpdateTimeNanoSec"

    :try_start_18
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_18
    .catch Lorg/json/JSONException; {:try_start_18 .. :try_end_18} :catch_0

    const-string v0, "boardModel"

    :try_start_19
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_19
    .catch Lorg/json/JSONException; {:try_start_19 .. :try_end_19} :catch_0

    const-string v0, "apiLevel"

    :try_start_1a
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->q()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1a
    .catch Lorg/json/JSONException; {:try_start_1a .. :try_end_1a} :catch_0

    const-string v0, "density"

    :try_start_1b
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->o:Lcom/aggmoread/sdk/z/a/g/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/a;->e()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_1b
    .catch Lorg/json/JSONException; {:try_start_1b .. :try_end_1b} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JuHeApiDevice{imei=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mac=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", androidId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", model=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", vendor=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", osType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->g:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", osVersion=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", deviceType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->i:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", ua=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", screenOrientation="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->k:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", brand=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", serialNo=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/g/d;->m:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
