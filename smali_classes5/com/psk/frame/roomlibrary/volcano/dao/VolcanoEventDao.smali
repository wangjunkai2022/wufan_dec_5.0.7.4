.class public final Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;
.super Ljava/lang/Object;
.source "VolcanoEventDao.kt"


# instance fields
.field private dao:Lcom/j256/ormlite/dao/Dao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/Dao<",
            "Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final databaseHelper:Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;)V
    .locals 1
    .param p1    # Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "databaseHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;->databaseHelper:Lcom/psk/frame/roomlibrary/volcano/database/VolcanoDataBaseHelper;

    .line 2
    const-class v0, Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;

    invoke-virtual {p1, v0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;

    move-result-object p1

    const-string v0, "databaseHelper.getDao(VolcanoEventTab::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;->dao:Lcom/j256/ormlite/dao/Dao;

    return-void
.end method

.method private static synthetic getDao$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final deletById(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;->dao:Lcom/j256/ormlite/dao/Dao;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->deleteById(Ljava/lang/Object;)I

    return-void
.end method

.method public final delete(Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;)V
    .locals 1
    .param p1    # Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;->dao:Lcom/j256/ormlite/dao/Dao;

    invoke-virtual {p1}, Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->deleteById(Ljava/lang/Object;)I

    return-void
.end method

.method public final insertTab(Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;)V
    .locals 1
    .param p1    # Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;->dao:Lcom/j256/ormlite/dao/Dao;

    invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->createIfNotExists(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final queryForAll()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;->dao:Lcom/j256/ormlite/dao/Dao;

    invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->queryForAll()Ljava/util/List;

    move-result-object v0

    const-string v1, "dao.queryForAll()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final update(Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;)V
    .locals 1
    .param p1    # Lcom/psk/frame/roomlibrary/volcano/entity/VolcanoEventTab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/psk/frame/roomlibrary/volcano/dao/VolcanoEventDao;->dao:Lcom/j256/ormlite/dao/Dao;

    invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->update(Ljava/lang/Object;)I

    return-void
.end method
