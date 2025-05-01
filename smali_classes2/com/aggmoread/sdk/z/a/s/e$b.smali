.class public final enum Lcom/aggmoread/sdk/z/a/s/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/s/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/z/a/s/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/aggmoread/sdk/z/a/s/e$b;

.field public static final enum c:Lcom/aggmoread/sdk/z/a/s/e$b;

.field public static final enum d:Lcom/aggmoread/sdk/z/a/s/e$b;

.field public static final enum e:Lcom/aggmoread/sdk/z/a/s/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/e$b;

    const-string v1, "PORTRAIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->b:Lcom/aggmoread/sdk/z/a/s/e$b;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/e$b;

    const-string v1, "REVERSE_PORTRAIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->c:Lcom/aggmoread/sdk/z/a/s/e$b;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/e$b;

    const-string v1, "LANDSCAPE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->d:Lcom/aggmoread/sdk/z/a/s/e$b;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/e$b;

    const-string v1, "REVERSE_LANDSCAPE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->e:Lcom/aggmoread/sdk/z/a/s/e$b;

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
