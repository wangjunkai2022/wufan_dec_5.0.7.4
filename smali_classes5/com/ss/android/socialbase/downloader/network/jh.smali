.class public final enum Lcom/ss/android/socialbase/downloader/network/jh;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ss/android/socialbase/downloader/network/jh;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lcom/ss/android/socialbase/downloader/network/jh;

.field public static final enum m:Lcom/ss/android/socialbase/downloader/network/jh;

.field public static final enum o:Lcom/ss/android/socialbase/downloader/network/jh;

.field public static final enum p:Lcom/ss/android/socialbase/downloader/network/jh;

.field private static final synthetic u:[Lcom/ss/android/socialbase/downloader/network/jh;

.field public static final enum vv:Lcom/ss/android/socialbase/downloader/network/jh;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/network/jh;

    const-string v1, "POOR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/network/jh;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ss/android/socialbase/downloader/network/jh;->vv:Lcom/ss/android/socialbase/downloader/network/jh;

    .line 2
    new-instance v1, Lcom/ss/android/socialbase/downloader/network/jh;

    const-string v3, "MODERATE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/ss/android/socialbase/downloader/network/jh;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ss/android/socialbase/downloader/network/jh;->m:Lcom/ss/android/socialbase/downloader/network/jh;

    .line 3
    new-instance v3, Lcom/ss/android/socialbase/downloader/network/jh;

    const-string v5, "GOOD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/ss/android/socialbase/downloader/network/jh;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/ss/android/socialbase/downloader/network/jh;->p:Lcom/ss/android/socialbase/downloader/network/jh;

    .line 4
    new-instance v5, Lcom/ss/android/socialbase/downloader/network/jh;

    const-string v7, "EXCELLENT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/ss/android/socialbase/downloader/network/jh;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/ss/android/socialbase/downloader/network/jh;->i:Lcom/ss/android/socialbase/downloader/network/jh;

    .line 5
    new-instance v7, Lcom/ss/android/socialbase/downloader/network/jh;

    const-string v9, "UNKNOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/ss/android/socialbase/downloader/network/jh;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/ss/android/socialbase/downloader/network/jh;->o:Lcom/ss/android/socialbase/downloader/network/jh;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/ss/android/socialbase/downloader/network/jh;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lcom/ss/android/socialbase/downloader/network/jh;->u:[Lcom/ss/android/socialbase/downloader/network/jh;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/network/jh;
    .locals 1

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/network/jh;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ss/android/socialbase/downloader/network/jh;

    return-object p0
.end method

.method public static values()[Lcom/ss/android/socialbase/downloader/network/jh;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/network/jh;->u:[Lcom/ss/android/socialbase/downloader/network/jh;

    invoke-virtual {v0}, [Lcom/ss/android/socialbase/downloader/network/jh;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ss/android/socialbase/downloader/network/jh;

    return-object v0
.end method
