.class public Lcn/sharesdk/framework/a/a;
.super Ljava/lang/Object;
.source "EventManager.java"


# static fields
.field private static a:Lcn/sharesdk/framework/a/a;


# instance fields
.field private b:Lcn/sharesdk/framework/a/c;

.field private c:Lcn/sharesdk/framework/a/a/e;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcn/sharesdk/framework/a/a;->d:Z

    .line 3
    new-instance v0, Lcn/sharesdk/framework/a/c;

    invoke-direct {v0}, Lcn/sharesdk/framework/a/c;-><init>()V

    iput-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/a/a/e;->a()Lcn/sharesdk/framework/a/a/e;

    move-result-object v0

    iput-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    return-void
.end method

.method static synthetic a(Lcn/sharesdk/framework/a/a;)Lcn/sharesdk/framework/a/a/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    return-object p0
.end method

.method public static a()Lcn/sharesdk/framework/a/a;
    .locals 1

    .line 3
    sget-object v0, Lcn/sharesdk/framework/a/a;->a:Lcn/sharesdk/framework/a/a;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcn/sharesdk/framework/a/a;

    invoke-direct {v0}, Lcn/sharesdk/framework/a/a;-><init>()V

    sput-object v0, Lcn/sharesdk/framework/a/a;->a:Lcn/sharesdk/framework/a/a;

    .line 5
    :cond_0
    sget-object v0, Lcn/sharesdk/framework/a/a;->a:Lcn/sharesdk/framework/a/a;

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 114
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 115
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 116
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 117
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 118
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 119
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 120
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 121
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 122
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    return-object p1

    .line 123
    :cond_3
    iget-object v1, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    move-object v2, p1

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcn/sharesdk/framework/a/c;->a(Ljava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;Ljava/util/HashMap;)Ljava/util/HashMap;

    move-result-object p3

    if-eqz p3, :cond_8

    .line 124
    invoke-virtual {p3}, Ljava/util/HashMap;->size()I

    move-result p4

    if-gtz p4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string p4, "data"

    .line 125
    invoke-virtual {p3, p4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_5

    return-object p1

    .line 126
    :cond_5
    invoke-virtual {p3, p4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    .line 127
    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    .line 128
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/HashMap;

    const-string v0, "surl"

    .line 129
    invoke-virtual {p5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "source"

    .line 130
    invoke-virtual {p5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    .line 131
    invoke-virtual {p4, p5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 132
    :cond_6
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    .line 133
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p5, 0x0

    const/4 v0, 0x0

    .line 134
    :goto_2
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 135
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    .line 136
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    goto :goto_2

    .line 139
    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 141
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    aput-object p1, p3, p5

    const-string p4, "> SERVER_SHORT_LINK_URL content after replace link ===  %s"

    invoke-virtual {p2, p4, p3}, Lcn/sharesdk/framework/utils/SSDKLog;->c(Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_8
    :goto_3
    return-object p1
.end method

.method static synthetic a(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/a/b/c;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcn/sharesdk/framework/a/a;->b(Lcn/sharesdk/framework/a/b/c;)V

    return-void
.end method

.method private a(Lcn/sharesdk/framework/a/b/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->d()Z

    move-result v0

    .line 26
    iget-object v1, p1, Lcn/sharesdk/framework/a/b/b;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 27
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    iget-object v0, p1, Lcn/sharesdk/framework/a/b/c;->f:Ljava/lang/String;

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-static {v1, v0}, Lcom/mob/tools/utils/Data;->Base64AES(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcn/sharesdk/framework/a/b/b;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 30
    iput-object v0, p1, Lcn/sharesdk/framework/a/b/b;->d:Ljava/lang/String;

    .line 31
    iput-object v0, p1, Lcn/sharesdk/framework/a/b/b;->c:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method private a(Lcn/sharesdk/framework/a/b/f;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->f()I

    move-result v0

    .line 33
    iget-object v1, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v1}, Lcn/sharesdk/framework/a/a/e;->d()Z

    move-result v1

    .line 34
    iget-object v2, p1, Lcn/sharesdk/framework/a/b/f;->d:Lcn/sharesdk/framework/a/b/f$a;

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 35
    iput-object v3, p1, Lcn/sharesdk/framework/a/b/f;->m:Ljava/lang/String;

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    if-eqz v2, :cond_2

    .line 36
    iget-object v0, v2, Lcn/sharesdk/framework/a/b/f$a;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    goto :goto_0

    .line 37
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, v2, Lcn/sharesdk/framework/a/b/f$a;->e:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_1
    const/4 v1, 0x0

    if-eqz v2, :cond_4

    .line 39
    iget-object v3, v2, Lcn/sharesdk/framework/a/b/f$a;->f:Ljava/util/ArrayList;

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v3, 0x0

    :goto_3
    const/4 v4, 0x0

    :goto_4
    if-ge v4, v3, :cond_5

    .line 40
    iget-object v5, v2, Lcn/sharesdk/framework/a/b/f$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap;

    :try_start_0
    const-string v6, "bm_tmp"

    const-string v7, ".png"

    .line 41
    invoke-static {v6, v7}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    .line 42
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 43
    sget-object v8, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v9, 0x64

    invoke-virtual {v5, v8, v9, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 44
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->flush()V

    .line 45
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 46
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v5

    .line 47
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "bit"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v6, v5, v7}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 48
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 50
    sget-object v3, Lcn/sharesdk/framework/a/b;->a:Lcn/sharesdk/framework/a/b;

    new-instance v4, Lcn/sharesdk/framework/a/a$3;

    invoke-direct {v4, p0, v2, p1}, Lcn/sharesdk/framework/a/a$3;-><init>(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/a/b/f$a;Lcn/sharesdk/framework/a/b/f;)V

    invoke-direct {p0, v1, v3, v4}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Lcn/sharesdk/framework/a/b;Lcn/sharesdk/framework/ShareSDKCallback;)V

    goto :goto_6

    .line 51
    :cond_6
    invoke-direct {p0, p1}, Lcn/sharesdk/framework/a/a;->b(Lcn/sharesdk/framework/a/b/c;)V

    goto :goto_7

    .line 52
    :cond_7
    iput-object v3, p1, Lcn/sharesdk/framework/a/b/f;->d:Lcn/sharesdk/framework/a/b/f$a;

    .line 53
    invoke-direct {p0, p1}, Lcn/sharesdk/framework/a/a;->b(Lcn/sharesdk/framework/a/b/c;)V

    :cond_8
    :goto_7
    return-void
.end method

.method private a(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 81
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/DH;->requester(Landroid/content/Context;)Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getNetworkType()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    new-instance v1, Lcn/sharesdk/framework/a/a$4;

    invoke-direct {v1, p0, p2, p1}, Lcn/sharesdk/framework/a/a$4;-><init>(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/String;)V

    .line 83
    invoke-virtual {v0, v1}, Lcom/mob/tools/utils/DH$RequestBuilder;->request(Lcom/mob/tools/utils/DH$DHResponder;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcn/sharesdk/framework/a/b;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/a/b;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 54
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 55
    :cond_0
    invoke-static {p1}, Lcom/mob/tools/utils/BitmapHelper;->getBmpFormat(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v0

    const/high16 v1, 0x43480000    # 200.0f

    .line 56
    sget-object v2, Lcn/sharesdk/framework/a/b;->b:Lcn/sharesdk/framework/a/b;

    if-ne p2, v2, :cond_1

    const/high16 v1, 0x44160000    # 600.0f

    .line 57
    :cond_1
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v2, 0x1

    .line 58
    iput-boolean v2, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 59
    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    .line 60
    iput-boolean v3, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 61
    iget v3, p2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 62
    iget p2, p2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lt v3, p2, :cond_2

    int-to-float v4, p2

    cmpl-float v4, v4, v1

    if-lez v4, :cond_2

    int-to-float p2, p2

    div-float/2addr p2, v1

    float-to-double v3, p2

    .line 63
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    :goto_0
    double-to-int p2, v3

    goto :goto_1

    :cond_2
    if-ge v3, p2, :cond_4

    int-to-float p2, v3

    cmpl-float p2, p2, v1

    if-lez p2, :cond_4

    int-to-float p2, v3

    div-float/2addr p2, v1

    float-to-double v3, p2

    .line 64
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    goto :goto_0

    :goto_1
    if-gtz p2, :cond_3

    const/4 p2, 0x1

    .line 65
    :cond_3
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 66
    iput p2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 67
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 68
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 69
    invoke-static {p1, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 70
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 71
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 72
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "."

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/graphics/Bitmap$CompressFormat;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "bm_tmp2"

    .line 73
    invoke-static {v1, p2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    .line 74
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v2, 0x50

    .line 75
    invoke-virtual {p1, v0, v2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 76
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 77
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 78
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    return-void

    .line 79
    :cond_4
    invoke-direct {p0, p1, p3}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    return-void

    :cond_5
    :goto_2
    if-eqz p3, :cond_6

    const/4 p1, 0x0

    .line 80
    invoke-interface {p3, p1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 93
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 94
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 95
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 96
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 97
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 98
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    if-eqz p5, :cond_2

    .line 100
    invoke-interface {p5, p1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    .line 101
    :cond_2
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    new-instance v5, Lcn/sharesdk/framework/a/a$5;

    invoke-direct {v5, p0, p5, p1, p2}, Lcn/sharesdk/framework/a/a$5;-><init>(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/String;Ljava/util/regex/Pattern;)V

    move-object v1, p1

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/a/c;->a(Ljava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    return-void
.end method

.method private a(Ljava/lang/String;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/a/c;->a(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method static synthetic b(Lcn/sharesdk/framework/a/a;)Lcn/sharesdk/framework/a/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    return-object p0
.end method

.method private b(Lcn/sharesdk/framework/a/b/c;)V
    .locals 5

    .line 2
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 3
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/c;->b()J

    move-result-wide v0

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    iput-wide v2, p1, Lcn/sharesdk/framework/a/b/c;->e:J

    .line 5
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/a/c;->a(Lcn/sharesdk/framework/a/b/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 6
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s l"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 2
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 3
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, p1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/16 v2, 0x400

    new-array v3, v2, [B

    :goto_0
    const/4 v4, 0x0

    .line 4
    invoke-virtual {v0, v3, v4, v2}, Ljava/io/ByteArrayInputStream;->read([BII)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    .line 5
    invoke-virtual {v1, v3, v4, v5}, Ljava/util/zip/GZIPOutputStream;->write([BII)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->flush()V

    .line 7
    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 8
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 9
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 10
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 11
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V

    const/4 p1, 0x2

    .line 12
    invoke-static {v1, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;IZLjava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 106
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "nt"

    .line 107
    invoke-virtual {p5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "none"

    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    const-string v3, "<a[^>]*?href[\\s]*=[\\s]*[\"\']?([^\'\">]+?)[\'\"]?>"

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move-object v5, p4

    move-object v6, p5

    .line 109
    invoke-direct/range {v1 .. v6}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 110
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object p3

    :cond_2
    const-string v2, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+"

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move-object v4, p4

    move-object v5, p5

    .line 111
    invoke-direct/range {v0 .. v5}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 112
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_3

    goto :goto_0

    :cond_3
    return-object p2

    :cond_4
    :goto_0
    return-object p1

    :catchall_0
    move-exception p2

    .line 113
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 104
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 105
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Landroid/os/Handler;)V
    .locals 3

    .line 11
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcn/sharesdk/framework/a/a/e;->a(J)V

    .line 13
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    new-instance v1, Lcn/sharesdk/framework/a/a$2;

    invoke-direct {v1, p0, p1}, Lcn/sharesdk/framework/a/a$2;-><init>(Lcn/sharesdk/framework/a/a;Landroid/os/Handler;)V

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/a/c;->a(Lcn/sharesdk/framework/ShareSDKCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 14
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public a(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 8
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/DH;->requester(Landroid/content/Context;)Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/mob/tools/utils/DH$RequestBuilder;->getNetworkType()Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object v0

    new-instance v1, Lcn/sharesdk/framework/a/a$1;

    invoke-direct {v1, p0, p1}, Lcn/sharesdk/framework/a/a$1;-><init>(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/ShareSDKCallback;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/mob/tools/utils/DH$RequestBuilder;->request(Lcom/mob/tools/utils/DH$DHResponder;)V

    return-void
.end method

.method public a(Lcn/sharesdk/framework/a/b/c;)V
    .locals 1

    .line 15
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->c()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Lcn/sharesdk/framework/a/b/c;->l:Ljava/lang/String;

    .line 18
    :cond_1
    instance-of v0, p1, Lcn/sharesdk/framework/a/b/b;

    if-eqz v0, :cond_2

    .line 19
    move-object v0, p1

    check-cast v0, Lcn/sharesdk/framework/a/b/b;

    invoke-direct {p0, v0}, Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/a/b/b;)V

    .line 20
    invoke-direct {p0, p1}, Lcn/sharesdk/framework/a/a;->b(Lcn/sharesdk/framework/a/b/c;)V

    goto :goto_0

    .line 21
    :cond_2
    instance-of v0, p1, Lcn/sharesdk/framework/a/b/f;

    if-eqz v0, :cond_3

    .line 22
    check-cast p1, Lcn/sharesdk/framework/a/b/f;

    invoke-direct {p0, p1}, Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/a/b/f;)V

    goto :goto_0

    .line 23
    :cond_3
    invoke-direct {p0, p1}, Lcn/sharesdk/framework/a/a;->b(Lcn/sharesdk/framework/a/b/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 24
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/a/c;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;IZLjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 85
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->e()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    if-eqz p5, :cond_1

    .line 86
    invoke-interface {p5, p1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    return-void

    .line 87
    :cond_1
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    const-string v1, "> SERVER_SHORT_LINK_URL content before replace link ===  %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->c(Ljava/lang/Object;[Ljava/lang/Object;)I

    if-eqz p3, :cond_2

    const-string v6, "<a[^>]*?href[\\s]*=[\\s]*[\"\']?([^\'\">]+?)[\'\"]?>"

    move-object v4, p0

    move-object v5, p1

    move v7, p2

    move-object v8, p4

    move-object v9, p5

    .line 88
    invoke-direct/range {v4 .. v9}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    return-void

    :cond_2
    const-string v2, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+"

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move-object v4, p4

    move-object v5, p5

    .line 89
    invoke-direct/range {v0 .. v5}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 90
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    if-eqz p5, :cond_3

    .line 91
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "error:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public a(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 102
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/a/c;->b(Ljava/util/HashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 103
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/a/c;->d(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    .line 19
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/a/a/e;->d(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 20
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/a/a/e;->d(Z)V

    .line 21
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    .line 22
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method public b()V
    .locals 6

    .line 7
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->c:Lcn/sharesdk/framework/a/a/e;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/c;->c()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 9
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcn/sharesdk/framework/a/a/c;

    .line 11
    iget-object v4, v3, Lcn/sharesdk/framework/a/a/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    .line 12
    iget-object v4, v3, Lcn/sharesdk/framework/a/a/c;->a:Ljava/lang/String;

    invoke-direct {p0, v4, v1}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Z)Z

    move-result v4

    goto :goto_1

    .line 13
    :cond_1
    iget-object v4, v3, Lcn/sharesdk/framework/a/a/c;->a:Ljava/lang/String;

    invoke-direct {p0, v4}, Lcn/sharesdk/framework/a/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4, v5}, Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Z)Z

    move-result v4

    :goto_1
    if-eqz v4, :cond_2

    .line 14
    iget-object v4, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    iget-object v3, v3, Lcn/sharesdk/framework/a/a/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Lcn/sharesdk/framework/a/c;->a(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 15
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :cond_3
    return-void
.end method

.method public c()Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 13
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a;->b:Lcn/sharesdk/framework/a/c;

    invoke-virtual {v0}, Lcn/sharesdk/framework/a/c;->d()Ljava/util/HashMap;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    .line 14
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method
