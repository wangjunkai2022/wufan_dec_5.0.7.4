.class public final Lcom/psk/eventmodule/StatFactory;
.super Ljava/lang/Object;
.source "StatFactory.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/psk/eventmodule/StatFactory$Companion;,
        Lcom/psk/eventmodule/StatFactory$SpmData;,
        Lcom/psk/eventmodule/StatFactory$VolcanoEvent;,
        Lcom/psk/eventmodule/StatFactory$VolcanoOther;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/psk/eventmodule/StatFactory$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static client_version:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static device_id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static instance:Lcom/psk/eventmodule/StatFactory;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static ip:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static network:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static oaid:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static request_id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static scm:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static statCore:Lcom/psk/eventmodule/net/StatCore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static trans_data:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static user_id:J

.field private static user_type:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/psk/eventmodule/StatFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/psk/eventmodule/StatFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/psk/eventmodule/StatFactory;->Companion:Lcom/psk/eventmodule/StatFactory$Companion;

    const-string v0, ""

    .line 1
    sput-object v0, Lcom/psk/eventmodule/StatFactory;->ip:Ljava/lang/String;

    .line 2
    sput-object v0, Lcom/psk/eventmodule/StatFactory;->client_version:Ljava/lang/String;

    .line 3
    sput-object v0, Lcom/psk/eventmodule/StatFactory;->network:Ljava/lang/String;

    .line 4
    sput-object v0, Lcom/psk/eventmodule/StatFactory;->device_id:Ljava/lang/String;

    .line 5
    sput-object v0, Lcom/psk/eventmodule/StatFactory;->scm:Ljava/lang/String;

    .line 6
    sput-object v0, Lcom/psk/eventmodule/StatFactory;->trans_data:Ljava/lang/String;

    .line 7
    sput-object v0, Lcom/psk/eventmodule/StatFactory;->request_id:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/psk/eventmodule/StatFactory;
    .locals 1

    .line 1
    sget-object v0, Lcom/psk/eventmodule/StatFactory;->instance:Lcom/psk/eventmodule/StatFactory;

    return-object v0
.end method

.method public static final synthetic access$getOaid$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/psk/eventmodule/StatFactory;->oaid:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getStatCore$cp()Lcom/psk/eventmodule/net/StatCore;
    .locals 1

    .line 1
    sget-object v0, Lcom/psk/eventmodule/StatFactory;->statCore:Lcom/psk/eventmodule/net/StatCore;

    return-object v0
.end method

.method public static final synthetic access$setDevice_id$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/psk/eventmodule/StatFactory;->device_id:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setInstance$cp(Lcom/psk/eventmodule/StatFactory;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/psk/eventmodule/StatFactory;->instance:Lcom/psk/eventmodule/StatFactory;

    return-void
.end method

.method public static final synthetic access$setOaid$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/psk/eventmodule/StatFactory;->oaid:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setStatCore$cp(Lcom/psk/eventmodule/net/StatCore;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/psk/eventmodule/StatFactory;->statCore:Lcom/psk/eventmodule/net/StatCore;

    return-void
.end method

.method public static synthetic initDatas$default(Lcom/psk/eventmodule/StatFactory;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p7, 0x1

    if-eqz p7, :cond_0

    const-string p1, ""

    :cond_0
    move-object v1, p1

    move-object v0, p0

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/psk/eventmodule/StatFactory;->initDatas(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final initDatas(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "client_versionInit"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkInit"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "."

    invoke-static {p1, v4, v0, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lcom/psk/eventmodule/net/util/AESUtilV2;->decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "decrypt(ipInit, \"\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sput-object p1, Lcom/psk/eventmodule/StatFactory;->ip:Ljava/lang/String;

    .line 2
    sput-wide p2, Lcom/psk/eventmodule/StatFactory;->user_id:J

    .line 3
    sput p4, Lcom/psk/eventmodule/StatFactory;->user_type:I

    .line 4
    sput-object p5, Lcom/psk/eventmodule/StatFactory;->client_version:Ljava/lang/String;

    .line 5
    sput-object p6, Lcom/psk/eventmodule/StatFactory;->network:Ljava/lang/String;

    return-void
.end method

.method public final sendEvent(Lcom/psk/eventmodule/StatFactory$VolcanoEvent;)V
    .locals 1
    .param p1    # Lcom/psk/eventmodule/StatFactory$VolcanoEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final updateNewNewDatas(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "scmUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trans_dataUpdate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request_idUpdate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sput-object p1, Lcom/psk/eventmodule/StatFactory;->scm:Ljava/lang/String;

    .line 2
    sput-object p2, Lcom/psk/eventmodule/StatFactory;->trans_data:Ljava/lang/String;

    .line 3
    sput-object p3, Lcom/psk/eventmodule/StatFactory;->request_id:Ljava/lang/String;

    return-void
.end method
