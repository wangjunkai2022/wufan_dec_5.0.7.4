.class public Lcom/kuaishou/weapon/p0/o;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/kuaishou/weapon/p0/s;
    .locals 17

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/kuaishou/weapon/p0/o;->b(Lorg/json/JSONObject;)Lcom/kuaishou/weapon/p0/p;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->a()I

    move-result v3

    .line 3
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->l()Ljava/lang/String;

    move-result-object v5

    .line 4
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->j()Ljava/lang/String;

    move-result-object v6

    .line 5
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->d()I

    move-result v1

    const/4 v9, 0x1

    if-ne v1, v9, :cond_1

    const/4 v10, 0x1

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    .line 6
    :goto_0
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->h()I

    move-result v1

    if-ne v1, v9, :cond_2

    const/4 v11, 0x1

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    .line 7
    :goto_1
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->e()I

    move-result v12

    .line 8
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->c()Ljava/lang/String;

    move-result-object v7

    .line 9
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->f()Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->b()Ljava/lang/String;

    move-result-object v1

    .line 11
    new-instance v2, Landroid/content/pm/PackageInfo;

    invoke-direct {v2}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 12
    :try_start_0
    iput-object v4, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 13
    iput-object v5, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 14
    new-instance v13, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v13}, Landroid/content/pm/ApplicationInfo;-><init>()V

    .line 15
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_3

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_3

    const-string v14, "."

    .line 16
    invoke-virtual {v1, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 17
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    iput-object v14, v13, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 18
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v13, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 19
    :cond_3
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->i()I

    move-result v1

    iput v1, v13, Landroid/content/pm/ApplicationInfo;->theme:I

    .line 20
    iput-object v13, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 21
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->m()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 22
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v13

    if-lez v13, :cond_6

    .line 23
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const/4 v14, 0x0

    .line 24
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v15

    if-ge v14, v15, :cond_5

    .line 25
    new-instance v15, Landroid/content/pm/ActivityInfo;

    invoke-direct {v15}, Landroid/content/pm/ActivityInfo;-><init>()V

    .line 26
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/kuaishou/weapon/p0/p$a;

    invoke-virtual/range {v16 .. v16}, Lcom/kuaishou/weapon/p0/p$a;->c()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v15, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 27
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/kuaishou/weapon/p0/p$a;

    invoke-virtual {v8}, Lcom/kuaishou/weapon/p0/p$a;->b()I

    move-result v8

    iput v8, v15, Landroid/content/pm/ActivityInfo;->theme:I

    .line 28
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/kuaishou/weapon/p0/p$a;

    invoke-virtual {v8}, Lcom/kuaishou/weapon/p0/p$a;->a()I

    move-result v8

    iput v8, v15, Landroid/content/pm/ActivityInfo;->labelRes:I

    .line 29
    iget-object v8, v15, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 30
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 31
    :cond_5
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 32
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Landroid/content/pm/ActivityInfo;

    .line 33
    invoke-interface {v13, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/pm/ActivityInfo;

    iput-object v1, v2, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    nop

    .line 34
    :cond_6
    :goto_3
    new-instance v8, Lcom/kuaishou/weapon/p0/s;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/kuaishou/weapon/p0/s;-><init>(Landroid/content/pm/PackageInfo;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iput-boolean v10, v8, Lcom/kuaishou/weapon/p0/s;->v:Z

    .line 36
    iput v12, v8, Lcom/kuaishou/weapon/p0/s;->x:I

    .line 37
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->k()Lcom/kuaishou/weapon/p0/p$b;

    move-result-object v1

    if-nez v1, :cond_7

    const/4 v1, 0x0

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->k()Lcom/kuaishou/weapon/p0/p$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kuaishou/weapon/p0/p$b;->a()I

    move-result v1

    .line 38
    :goto_4
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->k()Lcom/kuaishou/weapon/p0/p$b;

    move-result-object v2

    if-nez v2, :cond_8

    const/4 v2, -0x1

    goto :goto_5

    :cond_8
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->k()Lcom/kuaishou/weapon/p0/p$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kuaishou/weapon/p0/p$b;->b()I

    move-result v2

    .line 39
    :goto_5
    iput v1, v8, Lcom/kuaishou/weapon/p0/s;->t:I

    .line 40
    iput v2, v8, Lcom/kuaishou/weapon/p0/s;->u:I

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v8, Lcom/kuaishou/weapon/p0/s;->s:J

    .line 42
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-le v1, v2, :cond_a

    if-ne v11, v9, :cond_a

    .line 43
    invoke-virtual {v0}, Lcom/kuaishou/weapon/p0/p;->g()I

    move-result v0

    if-ne v0, v9, :cond_9

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    :goto_6
    move v11, v9

    .line 44
    :cond_a
    iput-boolean v11, v8, Lcom/kuaishou/weapon/p0/s;->y:Z

    return-object v8
.end method

.method private static b(Lorg/json/JSONObject;)Lcom/kuaishou/weapon/p0/p;
    .locals 8

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Lcom/kuaishou/weapon/p0/p;

    invoke-direct {v1}, Lcom/kuaishou/weapon/p0/p;-><init>()V

    const-string v2, "wk"

    .line 2
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->a(I)V

    const-string v2, "wan"

    .line 3
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->a(Ljava/lang/String;)V

    const-string v2, "wm"

    .line 4
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->b(Ljava/lang/String;)V

    const-string v2, "wo"

    .line 5
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->b(I)V

    const-string v2, "wpr"

    .line 6
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->c(I)V

    const-string v2, "wp"

    .line 7
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->c(Ljava/lang/String;)V

    const-string v2, "ws"

    const/4 v3, 0x1

    .line 8
    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->e(I)V

    const-string v2, "wh"

    const/4 v3, 0x0

    .line 9
    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->d(I)V

    const-string v2, "wt"

    .line 10
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->f(I)V

    const-string v2, "wu"

    .line 11
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->d(Ljava/lang/String;)V

    const-string v2, "wv"

    .line 12
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->e(Ljava/lang/String;)V

    const-string v2, "wa"

    .line 13
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    move-object v4, v0

    .line 14
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v3, v5, :cond_1

    .line 15
    new-instance v5, Lcom/kuaishou/weapon/p0/p$a;

    invoke-direct {v5}, Lcom/kuaishou/weapon/p0/p$a;-><init>()V

    .line 16
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "r"

    .line 17
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/kuaishou/weapon/p0/p$a;->a(I)V

    const-string v7, "t"

    .line 18
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/kuaishou/weapon/p0/p$a;->b(I)V

    const-string v7, "n"

    .line 19
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/kuaishou/weapon/p0/p$a;->a(Ljava/lang/String;)V

    if-nez v4, :cond_0

    .line 20
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 21
    :cond_0
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {v1, v4}, Lcom/kuaishou/weapon/p0/p;->a(Ljava/util/List;)V

    .line 23
    new-instance v2, Lcom/kuaishou/weapon/p0/p$b;

    invoke-direct {v2}, Lcom/kuaishou/weapon/p0/p$b;-><init>()V

    const-string v3, "we"

    .line 24
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v3, "duration"

    .line 25
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/kuaishou/weapon/p0/p$b;->a(I)V

    const-string v3, "network"

    .line 26
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/kuaishou/weapon/p0/p$b;->b(I)V

    .line 27
    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/p;->a(Lcom/kuaishou/weapon/p0/p$b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method
