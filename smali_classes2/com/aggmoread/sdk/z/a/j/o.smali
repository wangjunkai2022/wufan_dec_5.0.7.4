.class public final enum Lcom/aggmoread/sdk/z/a/j/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/z/a/j/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/aggmoread/sdk/z/a/j/o;

.field public static final enum c:Lcom/aggmoread/sdk/z/a/j/o;

.field public static final enum d:Lcom/aggmoread/sdk/z/a/j/o;

.field public static final enum e:Lcom/aggmoread/sdk/z/a/j/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/o;

    const-string v1, "PREPARE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/o;->b:Lcom/aggmoread/sdk/z/a/j/o;

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/o;

    const-string v1, "CONNECT_SERVER_SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/o;->c:Lcom/aggmoread/sdk/z/a/j/o;

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/o;

    const-string v1, "COMPLETED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/o;->d:Lcom/aggmoread/sdk/z/a/j/o;

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/o;

    const-string v1, "ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/o;->e:Lcom/aggmoread/sdk/z/a/j/o;

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
