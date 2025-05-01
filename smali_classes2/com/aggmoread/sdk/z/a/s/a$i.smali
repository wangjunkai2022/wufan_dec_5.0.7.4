.class public final enum Lcom/aggmoread/sdk/z/a/s/a$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/s/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/z/a/s/a$i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/aggmoread/sdk/z/a/s/a$i;

.field public static final enum c:Lcom/aggmoread/sdk/z/a/s/a$i;

.field public static final enum d:Lcom/aggmoread/sdk/z/a/s/a$i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$i;

    const-string v1, "SHOW_NEVER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/a$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/a$i;->b:Lcom/aggmoread/sdk/z/a/s/a$i;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$i;

    const-string v1, "SHOW_ALWAYS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/a$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/a$i;->c:Lcom/aggmoread/sdk/z/a/s/a$i;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$i;

    const-string v1, "SHOW_VISIBLE_OR_GONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/a$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/s/a$i;->d:Lcom/aggmoread/sdk/z/a/s/a$i;

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
