.class public final Lcom/psk/frame/roomlibrary/volcano/a;
.super Ljava/lang/Object;
.source "EventVolcanoDataBasFactory.kt"


# static fields
.field public static final a:Lcom/psk/frame/roomlibrary/volcano/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static b:Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;

.field private static c:Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/psk/frame/roomlibrary/volcano/a;

    invoke-direct {v0}, Lcom/psk/frame/roomlibrary/volcano/a;-><init>()V

    sput-object v0, Lcom/psk/frame/roomlibrary/volcano/a;->a:Lcom/psk/frame/roomlibrary/volcano/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;

    invoke-direct {v0, p1}, Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/psk/frame/roomlibrary/volcano/a;->b:Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;

    return-void
.end method

.method public final b()Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/psk/frame/roomlibrary/volcano/a;->c:Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;

    if-nez v0, :cond_1

    .line 2
    new-instance v0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;

    sget-object v1, Lcom/psk/frame/roomlibrary/volcano/a;->b:Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;

    if-nez v1, :cond_0

    const-string v1, "database"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-direct {v0, v1}, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;-><init>(Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;)V

    sput-object v0, Lcom/psk/frame/roomlibrary/volcano/a;->c:Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;

    .line 3
    :cond_1
    sget-object v0, Lcom/psk/frame/roomlibrary/volcano/a;->c:Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method
