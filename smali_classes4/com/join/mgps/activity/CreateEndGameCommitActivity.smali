.class public Lcom/join/mgps/activity/CreateEndGameCommitActivity;
.super Lcom/BaseAppCompatActivity;
.source "CreateEndGameCommitActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0032
.end annotation


# static fields
.field public static final B:I = 0x3e9


# instance fields
.field A:Z

.field b:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field c:Lcom/join/mgps/dto/BossBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field d:Lcom/join/mgps/dto/ArchiveListBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field e:Ljava/lang/String;

.field f:Ljava/lang/Long;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field g:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Lcom/join/android/app/component/video/StandardVideoView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Ljava/lang/String;

.field n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field p:Ljava/lang/String;

.field q:Ljava/lang/String;

.field r:Z

.field s:Z

.field t:Lcom/join/mgps/rpc/k;

.field private u:Z

.field private v:Z

.field private w:Z

.field x:Lcom/join/mgps/dialog/b0;

.field y:Lcom/join/mgps/dialog/m2;

.field z:Lcom/join/mgps/dialog/h2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->r:Z

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->s:Z

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->u:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->v:Z

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w:Z

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A:Z

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/CreateEndGameCommitActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->v:Z

    return p1
.end method

.method static synthetic g0(Lcom/join/mgps/activity/CreateEndGameCommitActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w:Z

    return p1
.end method

.method private j0(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const-string v0, "file://"

    const-string v1, ""

    .line 1
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/join/mgps/Util/v;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "uploadCoverFile"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    .line 3
    invoke-virtual {v3, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    .line 4
    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 5
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 8
    :cond_0
    new-instance v2, Lcom/join/mgps/activity/screenshot/ImageFactory;

    invoke-direct {v2}, Lcom/join/mgps/activity/screenshot/ImageFactory;-><init>()V

    const/16 v5, 0x1f4

    const/4 v6, 0x0

    move-object v4, p2

    move-object v7, p1

    invoke-virtual/range {v2 .. v7}, Lcom/join/mgps/activity/screenshot/ImageFactory;->compressAndGenImage(Ljava/lang/String;Ljava/lang/String;IZLandroid/content/Context;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    return-object p2
.end method

.method private n0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    const-string v0, "."

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private x0(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->u:Z

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m0()V

    return-void
.end method


# virtual methods
.method A0(Ljava/lang/String;I)V
    .locals 21
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "data"

    const-string v3, "code"

    const-string v4, "remoteUrl"

    const-string v5, "cover"

    const-string v6, "message"

    const-string v7, "\u4e0a\u4f20\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 1
    iget-boolean v8, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->u:Z

    if-eqz v8, :cond_0

    return-void

    :cond_0
    const/4 v8, 0x1

    .line 2
    iput-boolean v8, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->u:Z

    const/4 v9, 0x2

    if-ne v1, v8, :cond_1

    .line 3
    iput-boolean v8, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->v:Z

    goto :goto_0

    :cond_1
    if-ne v1, v9, :cond_2

    .line 4
    iput-boolean v8, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w:Z

    .line 5
    :cond_2
    :goto_0
    invoke-static/range {p0 .. p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 6
    new-instance v15, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v15}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 7
    invoke-virtual {v15, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 8
    new-instance v10, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;

    invoke-direct {v10}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;-><init>()V

    .line 9
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v11

    .line 10
    iget-object v12, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->b:Ljava/lang/String;

    invoke-virtual {v10, v12}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;->setGameId(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v11}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v12

    invoke-virtual {v10, v12}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;->setUid(I)V

    .line 12
    invoke-virtual {v15, v10}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 13
    invoke-static/range {p0 .. p0}, Lcom/papa/sim/statistic/k;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v16

    .line 14
    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y0(I)V

    .line 15
    invoke-static {}, Lcom/join/android/app/common/http/h;->b()Lcom/join/android/app/common/http/h;

    move-result-object v10

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    invoke-virtual {v11}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 17
    invoke-virtual {v11}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v14

    new-instance v11, Ljava/io/File;

    move-object/from16 v12, p1

    invoke-direct {v11, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v17

    const/4 v11, 0x0

    if-ne v1, v9, :cond_3

    const/16 v18, 0x1

    goto :goto_1

    :cond_3
    const/16 v18, 0x0

    :goto_1
    if-ne v1, v8, :cond_4

    const/16 v19, 0x1

    goto :goto_2

    :cond_4
    const/16 v19, 0x0

    .line 19
    :goto_2
    new-instance v9, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;

    invoke-direct {v9, v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity;I)V

    const/4 v8, 0x0

    move-object v11, v10

    move-object/from16 v12, p1

    move-object/from16 v20, v9

    .line 20
    invoke-virtual/range {v11 .. v20}, Lcom/join/android/app/common/http/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/RequestModel;Ljava/lang/String;Ljava/lang/String;IILcom/join/android/app/common/http/g;)Ljava/lang/String;

    move-result-object v9

    .line 21
    :try_start_0
    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_c

    .line 22
    invoke-static {v9}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v9

    if-eqz v9, :cond_b

    .line 23
    invoke-virtual {v9, v3}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v9, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v3

    const/16 v10, 0xc8

    if-ne v3, v10, :cond_b

    .line 24
    invoke-virtual {v9, v2}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 25
    invoke-virtual {v9, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/google/gson/JsonArray;->size()I

    move-result v3

    if-lez v3, :cond_8

    .line 27
    invoke-virtual {v2, v8}, Lcom/google/gson/JsonArray;->get(I)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v2

    .line 28
    invoke-virtual {v2, v4}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    const/4 v3, 0x1

    if-ne v1, v3, :cond_6

    .line 29
    invoke-virtual {v2, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->o:Ljava/lang/String;

    .line 30
    invoke-virtual {v2, v5}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v2, v5}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v2, v5}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->isJsonNull()Z

    move-result v1

    if-nez v1, :cond_5

    .line 31
    invoke-virtual {v2, v5}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->p:Ljava/lang/String;

    :cond_5
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->r:Z

    goto :goto_3

    :cond_6
    const/4 v3, 0x2

    if-ne v1, v3, :cond_7

    .line 33
    invoke-virtual {v2, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->q:Ljava/lang/String;

    const/4 v1, 0x1

    .line 34
    iput-boolean v1, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->s:Z

    .line 35
    :cond_7
    :goto_3
    iput-boolean v8, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->u:Z

    .line 36
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->z0()V

    .line 37
    iget-boolean v1, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->r:Z

    if-eqz v1, :cond_e

    iget-boolean v1, v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->s:Z

    if-eqz v1, :cond_e

    .line 38
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i0()V

    goto :goto_4

    .line 39
    :cond_8
    invoke-direct {v0, v7}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x0(Ljava/lang/String;)V

    goto :goto_4

    .line 40
    :cond_9
    invoke-virtual {v9, v6}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v9, v6}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->isJsonNull()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {v9, v6}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 41
    invoke-virtual {v9, v6}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x0(Ljava/lang/String;)V

    goto :goto_4

    .line 42
    :cond_a
    invoke-direct {v0, v7}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x0(Ljava/lang/String;)V

    goto :goto_4

    .line 43
    :cond_b
    invoke-direct {v0, v7}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x0(Ljava/lang/String;)V

    goto :goto_4

    .line 44
    :cond_c
    invoke-direct {v0, v7}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x0(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 45
    :catch_0
    invoke-direct {v0, v7}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x0(Ljava/lang/String;)V

    goto :goto_4

    :cond_d
    const-string v1, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38"

    .line 46
    invoke-direct {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x0(Ljava/lang/String;)V

    :cond_e
    :goto_4
    return-void
.end method

.method afterViews()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->t:Lcom/join/mgps/rpc/k;

    return-void
.end method

.method back()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f09090f
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method h0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090cdf
        }
    .end annotation

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    .line 1
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->O2(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    .line 3
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/r1;->B()Z

    move-result v0

    const-string v1, "video/*"

    if-nez v0, :cond_3

    invoke-static {}, Lcom/join/mgps/Util/r1;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-ge v2, v3, :cond_2

    const-string v2, "android.intent.action.GET_CONTENT"

    .line 6
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_2
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 7
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.category.OPENABLE"

    .line 8
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    .line 10
    :cond_3
    :goto_1
    new-instance v0, Landroid/content/Intent;

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v3, "android.intent.action.PICK"

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 11
    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    :goto_2
    const-string v1, "\u9009\u62e9\u6311\u6218\u89c6\u9891"

    .line 12
    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_3
    return-void
.end method

.method i0()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u521b\u5efa\u5931\u8d25\u8bf7\u91cd\u8bd5"

    .line 1
    iget-boolean v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A:Z

    .line 3
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 4
    :try_start_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/IntentUtil;->isNotLogin(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u8bf7\u5148\u767b\u5f55"

    .line 5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    .line 6
    iput-boolean v2, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A:Z

    return-void

    .line 7
    :cond_1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    .line 8
    new-instance v3, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v3, p0}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 9
    new-instance v4, Lcom/join/mgps/dto/RequestCreateEndGameArgs;

    invoke-direct {v4}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;-><init>()V

    .line 10
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setUid(Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->q:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setArchive(Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->o:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setVideo(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->p:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setCover(Ljava/lang/String;)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->c:Lcom/join/mgps/dto/BossBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/BossBean;->getIndex()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setIndex(Ljava/lang/Integer;)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->c:Lcom/join/mgps/dto/BossBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/BossBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setGameId(Ljava/lang/String;)V

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->f:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setDuration(J)V

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setTitle(Ljava/lang/String;)V

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->h:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestCreateEndGameArgs;->setSubTitle(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 20
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->t:Lcom/join/mgps/rpc/k;

    invoke-virtual {v3}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/join/mgps/rpc/k;->Q(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1

    .line 21
    iput-boolean v2, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v1, :cond_2

    .line 22
    :try_start_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m0()V

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->q0()V

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->t0()V

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 26
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 27
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    goto :goto_1

    .line 28
    :cond_3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 29
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m0()V

    .line 31
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m0()V

    .line 34
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    goto :goto_1

    .line 35
    :cond_4
    iput-boolean v2, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A:Z

    :goto_1
    return-void
.end method

.method k0(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/join/mgps/Util/v;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "compress/video"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->n0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m:Ljava/lang/String;

    .line 6
    new-instance v1, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity;)V

    invoke-static {p1, v0, v1}, Lcom/vincent/videocompressor/h;->b(Ljava/lang/String;Ljava/lang/String;Lcom/vincent/videocompressor/h$a;)Lcom/vincent/videocompressor/h$b;

    return-void
.end method

.method l0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0915af
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->isNotLogin(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u8bf7\u5148\u767b\u5f55"

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\u8bf7\u9009\u62e9\u6311\u6218\u89c6\u9891"

    .line 6
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->h:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "\u8bf7\u8f93\u5165\u6b8b\u5c40\u8bf4\u660e"

    .line 9
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    return-void

    :cond_3
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w:Z

    .line 11
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->v:Z

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->k0(Ljava/lang/String;)V

    goto :goto_1

    .line 14
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->p0()V

    goto :goto_1

    :cond_5
    :goto_0
    const-string v0, "\u8bf7\u8f93\u5165\u6807\u9898\uff086\uff5e20\u5b57\uff09"

    .line 15
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    return-void

    :cond_6
    const-string v0, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38"

    .line 16
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method m0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y:Lcom/join/mgps/dialog/m2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method o0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x:Lcom/join/mgps/dialog/b0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/b0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x:Lcom/join/mgps/dialog/b0;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x:Lcom/join/mgps/dialog/b0;

    const-string v1, "\u89c6\u9891"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/b0;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/BaseAppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    .line 2
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/o2;->b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->e:Ljava/lang/String;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->l:Landroid/widget/RelativeLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->j:Landroid/widget/LinearLayout;

    const/16 p3, 0x8

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->e:Ljava/lang/String;

    const/4 p3, 0x1

    invoke-static {p1, p3}, Landroid/media/ThumbnailUtils;->createVideoThumbnail(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 7
    iget-object p3, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    iget-object p3, p3, Lcom/join/android/app/component/video/StandardVideoView;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p3, p1}, Lcom/facebook/drawee/view/DraweeView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    const-string p3, "CreateEndGameActivity_Video"

    invoke-virtual {p1, p3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/video/StandardVideoView;->setMuteWhenPlay(Z)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/video/StandardVideoView;->setShowCoverWhenPause(Z)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "file://"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->e:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array v0, p2, [Ljava/lang/Object;

    invoke-virtual {p1, p3, p2, v0}, Lcom/join/android/app/component/video/StandardVideoView;->setUpLazy(Ljava/lang/String;I[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->y(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->release()V

    :cond_0
    const-string v0, "CreateEndGameActivity_Video"

    .line 5
    invoke-static {v0}, Lcom/join/android/app/component/video/a;->n0(Ljava/lang/String;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    :cond_0
    return-void
.end method

.method p0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x:Lcom/join/mgps/dialog/b0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->r:Z

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A0(Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method q0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->z:Lcom/join/mgps/dialog/h2;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/h2;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/h2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->z:Lcom/join/mgps/dialog/h2;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->z:Lcom/join/mgps/dialog/h2;

    new-instance v1, Lcom/join/mgps/activity/CreateEndGameCommitActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity$b;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/h2;->a(Lcom/papa91/arc/interfaces/DialogListenerWrap;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->z:Lcom/join/mgps/dialog/h2;

    const-string v1, "\u4e0a\u4f20\u6210\u529f\uff0c\u6211\u4eec\u5c06\u57283\u4e2a\u5de5\u4f5c\u65e5\u5185\u5b8c\u6210\u5ba1\u6838"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/h2;->b(Ljava/lang/String;)V

    return-void
.end method

.method r0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/h0;->i(Ljava/lang/String;)Z

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->n:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method s0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090925
        }
    .end annotation

    const-string v0, ""

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->e:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/h0;->i(Ljava/lang/String;)Z

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method u0()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/event/p;

    const-string v1, "CreateEndGameActivity"

    invoke-direct {v0, v1}, Lcom/join/mgps/event/p;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method v0(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x:Lcom/join/mgps/dialog/b0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->x:Lcom/join/mgps/dialog/b0;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/b0;->update(I)V

    :cond_0
    return-void
.end method

.method w0(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y:Lcom/join/mgps/dialog/m2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y:Lcom/join/mgps/dialog/m2;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/m2;->update(I)V

    :cond_0
    return-void
.end method

.method y0(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y:Lcom/join/mgps/dialog/m2;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/m2;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/m2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y:Lcom/join/mgps/dialog/m2;

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const-string p1, "\u89c6\u9891"

    goto :goto_0

    :cond_1
    const-string p1, "\u5b58\u6863"

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y:Lcom/join/mgps/dialog/m2;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/m2;->b(Ljava/lang/String;)V

    return-void
.end method

.method z0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->s:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w:Z

    if-nez v0, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m0()V

    .line 3
    :cond_1
    iget-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->s:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w:Z

    if-nez v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->d:Lcom/join/mgps/dto/ArchiveListBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArchiveListBean;->getArchiveFilePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A0(Ljava/lang/String;I)V

    :cond_2
    return-void
.end method
