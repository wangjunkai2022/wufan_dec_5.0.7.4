.class public final enum Lcom/beizi/ad/internal/view/f$b;
.super Ljava/lang/Enum;
.source "MRAIDImplementation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/view/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/ad/internal/view/f$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/beizi/ad/internal/view/f$b;

.field public static final enum b:Lcom/beizi/ad/internal/view/f$b;

.field private static final synthetic c:[Lcom/beizi/ad/internal/view/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/beizi/ad/internal/view/f$b;

    const-string v1, "STARTING_DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/beizi/ad/internal/view/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/beizi/ad/internal/view/f$b;->a:Lcom/beizi/ad/internal/view/f$b;

    .line 2
    new-instance v1, Lcom/beizi/ad/internal/view/f$b;

    const-string v3, "STARTING_EXPANDED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/beizi/ad/internal/view/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/beizi/ad/internal/view/f$b;->b:Lcom/beizi/ad/internal/view/f$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/beizi/ad/internal/view/f$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/beizi/ad/internal/view/f$b;->c:[Lcom/beizi/ad/internal/view/f$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/ad/internal/view/f$b;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/internal/view/f$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/internal/view/f$b;

    return-object p0
.end method

.method public static values()[Lcom/beizi/ad/internal/view/f$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/view/f$b;->c:[Lcom/beizi/ad/internal/view/f$b;

    invoke-virtual {v0}, [Lcom/beizi/ad/internal/view/f$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/ad/internal/view/f$b;

    return-object v0
.end method
