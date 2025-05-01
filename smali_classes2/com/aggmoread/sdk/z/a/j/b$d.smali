.class public final enum Lcom/aggmoread/sdk/z/a/j/b$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/z/a/j/b$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/aggmoread/sdk/z/a/j/b$d;

.field public static final enum c:Lcom/aggmoread/sdk/z/a/j/b$d;

.field public static final enum d:Lcom/aggmoread/sdk/z/a/j/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/b$d;

    const-string v1, "DOWNLOAD_COMPLETED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/b$d;->b:Lcom/aggmoread/sdk/z/a/j/b$d;

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/b$d;

    const-string v1, "NOTIFICATION_CLICK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/b$d;->c:Lcom/aggmoread/sdk/z/a/j/b$d;

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/b$d;

    const-string v1, "INSTALLER_BRIDGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/b$d;->d:Lcom/aggmoread/sdk/z/a/j/b$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method
