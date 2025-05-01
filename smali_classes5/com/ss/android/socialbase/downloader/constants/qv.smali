.class public final enum Lcom/ss/android/socialbase/downloader/constants/qv;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ss/android/socialbase/downloader/constants/qv;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lcom/ss/android/socialbase/downloader/constants/qv;

.field private static final synthetic k:[Lcom/ss/android/socialbase/downloader/constants/qv;

.field public static final enum m:Lcom/ss/android/socialbase/downloader/constants/qv;

.field public static final enum n:Lcom/ss/android/socialbase/downloader/constants/qv;

.field public static final enum o:Lcom/ss/android/socialbase/downloader/constants/qv;

.field public static final enum p:Lcom/ss/android/socialbase/downloader/constants/qv;

.field public static final enum qv:Lcom/ss/android/socialbase/downloader/constants/qv;

.field public static final enum u:Lcom/ss/android/socialbase/downloader/constants/qv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum vv:Lcom/ss/android/socialbase/downloader/constants/qv;

.field public static final enum wv:Lcom/ss/android/socialbase/downloader/constants/qv;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v1, "RUN_STATUS_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->vv:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 2
    new-instance v1, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v3, "RUN_STATUS_PAUSE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 3
    new-instance v3, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v5, "RUN_STATUS_CANCELED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 4
    new-instance v5, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v7, "RUN_STATUS_ERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/ss/android/socialbase/downloader/constants/qv;->i:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 5
    new-instance v7, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v9, "RUN_STATUS_END_RIGHT_NOW"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/ss/android/socialbase/downloader/constants/qv;->o:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 6
    new-instance v9, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v11, "RUN_STATUS_RETRY_DELAY"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/ss/android/socialbase/downloader/constants/qv;->u:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 7
    new-instance v11, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v13, "RUN_STATUS_WAITING_ASYNC_HANDLER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/ss/android/socialbase/downloader/constants/qv;->n:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 8
    new-instance v13, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v15, "RUN_STATUS_END_FOR_FILE_EXIST"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/ss/android/socialbase/downloader/constants/qv;->qv:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 9
    new-instance v15, Lcom/ss/android/socialbase/downloader/constants/qv;

    const-string v14, "RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lcom/ss/android/socialbase/downloader/constants/qv;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lcom/ss/android/socialbase/downloader/constants/qv;->wv:Lcom/ss/android/socialbase/downloader/constants/qv;

    const/16 v14, 0x9

    new-array v14, v14, [Lcom/ss/android/socialbase/downloader/constants/qv;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    aput-object v5, v14, v8

    aput-object v7, v14, v10

    const/4 v0, 0x5

    aput-object v9, v14, v0

    const/4 v0, 0x6

    aput-object v11, v14, v0

    const/4 v0, 0x7

    aput-object v13, v14, v0

    aput-object v15, v14, v12

    .line 10
    sput-object v14, Lcom/ss/android/socialbase/downloader/constants/qv;->k:[Lcom/ss/android/socialbase/downloader/constants/qv;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/constants/qv;
    .locals 1

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/constants/qv;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ss/android/socialbase/downloader/constants/qv;

    return-object p0
.end method

.method public static values()[Lcom/ss/android/socialbase/downloader/constants/qv;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->k:[Lcom/ss/android/socialbase/downloader/constants/qv;

    invoke-virtual {v0}, [Lcom/ss/android/socialbase/downloader/constants/qv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ss/android/socialbase/downloader/constants/qv;

    return-object v0
.end method
