.class public final enum Lcom/beizi/ad/c/e$e;
.super Ljava/lang/Enum;
.source "EnumType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/ad/c/e$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/beizi/ad/c/e$e;

.field public static final enum b:Lcom/beizi/ad/c/e$e;

.field public static final enum c:Lcom/beizi/ad/c/e$e;

.field public static final enum d:Lcom/beizi/ad/c/e$e;

.field private static final synthetic f:[Lcom/beizi/ad/c/e$e;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/beizi/ad/c/e$e;

    const-string v1, "PLATFORM_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/beizi/ad/c/e$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beizi/ad/c/e$e;->a:Lcom/beizi/ad/c/e$e;

    .line 2
    new-instance v1, Lcom/beizi/ad/c/e$e;

    const-string v3, "PLATFORM_IOS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/beizi/ad/c/e$e;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/beizi/ad/c/e$e;->b:Lcom/beizi/ad/c/e$e;

    .line 3
    new-instance v3, Lcom/beizi/ad/c/e$e;

    const-string v5, "PLATFORM_ANDROID"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/beizi/ad/c/e$e;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/beizi/ad/c/e$e;->c:Lcom/beizi/ad/c/e$e;

    .line 4
    new-instance v5, Lcom/beizi/ad/c/e$e;

    const-string v7, "PLATFORM_OTHER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/beizi/ad/c/e$e;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/beizi/ad/c/e$e;->d:Lcom/beizi/ad/c/e$e;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/beizi/ad/c/e$e;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/beizi/ad/c/e$e;->f:[Lcom/beizi/ad/c/e$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/beizi/ad/c/e$e;->e:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/ad/c/e$e;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/c/e$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/c/e$e;

    return-object p0
.end method

.method public static values()[Lcom/beizi/ad/c/e$e;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/c/e$e;->f:[Lcom/beizi/ad/c/e$e;

    invoke-virtual {v0}, [Lcom/beizi/ad/c/e$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/ad/c/e$e;

    return-object v0
.end method
