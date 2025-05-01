.class public final enum Lcom/aggmoread/sdk/z/a/s/d$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/s/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/z/a/s/d$i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/aggmoread/sdk/z/a/s/d$i;

.field public static final enum c:Lcom/aggmoread/sdk/z/a/s/d$i;

.field public static final enum d:Lcom/aggmoread/sdk/z/a/s/d$i;

.field public static final enum e:Lcom/aggmoread/sdk/z/a/s/d$i;

.field public static final enum f:Lcom/aggmoread/sdk/z/a/s/d$i;

.field public static final enum g:Lcom/aggmoread/sdk/z/a/s/d$i;

.field public static final enum h:Lcom/aggmoread/sdk/z/a/s/d$i;

.field private static final synthetic i:[Lcom/aggmoread/sdk/z/a/s/d$i;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/d$i;

    const-string v1, "TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/d$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/d$i;->b:Lcom/aggmoread/sdk/z/a/s/d$i;

    new-instance v1, Lcom/aggmoread/sdk/z/a/s/d$i;

    const-string v3, "TYPE_SCALE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/aggmoread/sdk/z/a/s/d$i;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/aggmoread/sdk/z/a/s/d$i;->c:Lcom/aggmoread/sdk/z/a/s/d$i;

    new-instance v3, Lcom/aggmoread/sdk/z/a/s/d$i;

    const-string v5, "TYPE_CENTER_INSIDE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/aggmoread/sdk/z/a/s/d$i;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/aggmoread/sdk/z/a/s/d$i;->d:Lcom/aggmoread/sdk/z/a/s/d$i;

    new-instance v5, Lcom/aggmoread/sdk/z/a/s/d$i;

    const-string v7, "TYPE9_16"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/aggmoread/sdk/z/a/s/d$i;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/aggmoread/sdk/z/a/s/d$i;->e:Lcom/aggmoread/sdk/z/a/s/d$i;

    new-instance v7, Lcom/aggmoread/sdk/z/a/s/d$i;

    const-string v9, "TYPE3_4"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/aggmoread/sdk/z/a/s/d$i;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/aggmoread/sdk/z/a/s/d$i;->f:Lcom/aggmoread/sdk/z/a/s/d$i;

    new-instance v9, Lcom/aggmoread/sdk/z/a/s/d$i;

    const-string v11, "TYPE5"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/aggmoread/sdk/z/a/s/d$i;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/aggmoread/sdk/z/a/s/d$i;->g:Lcom/aggmoread/sdk/z/a/s/d$i;

    new-instance v11, Lcom/aggmoread/sdk/z/a/s/d$i;

    const-string v13, "TYPE_CLIP_VIDEO"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/aggmoread/sdk/z/a/s/d$i;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/aggmoread/sdk/z/a/s/d$i;->h:Lcom/aggmoread/sdk/z/a/s/d$i;

    const/4 v13, 0x7

    new-array v13, v13, [Lcom/aggmoread/sdk/z/a/s/d$i;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lcom/aggmoread/sdk/z/a/s/d$i;->i:[Lcom/aggmoread/sdk/z/a/s/d$i;

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

.method public static a()[Lcom/aggmoread/sdk/z/a/s/d$i;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/d$i;->i:[Lcom/aggmoread/sdk/z/a/s/d$i;

    invoke-virtual {v0}, [Lcom/aggmoread/sdk/z/a/s/d$i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/aggmoread/sdk/z/a/s/d$i;

    return-object v0
.end method
