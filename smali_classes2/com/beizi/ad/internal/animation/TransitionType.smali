.class public final enum Lcom/beizi/ad/internal/animation/TransitionType;
.super Ljava/lang/Enum;
.source "TransitionType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/ad/internal/animation/TransitionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/beizi/ad/internal/animation/TransitionType;

.field public static final enum FADE:Lcom/beizi/ad/internal/animation/TransitionType;

.field public static final enum MOVEIN:Lcom/beizi/ad/internal/animation/TransitionType;

.field public static final enum NONE:Lcom/beizi/ad/internal/animation/TransitionType;

.field public static final enum PUSH:Lcom/beizi/ad/internal/animation/TransitionType;

.field public static final enum RANDOM:Lcom/beizi/ad/internal/animation/TransitionType;

.field public static final enum REVEAL:Lcom/beizi/ad/internal/animation/TransitionType;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lcom/beizi/ad/internal/animation/TransitionType;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/beizi/ad/internal/animation/TransitionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/beizi/ad/internal/animation/TransitionType;->NONE:Lcom/beizi/ad/internal/animation/TransitionType;

    .line 2
    new-instance v1, Lcom/beizi/ad/internal/animation/TransitionType;

    const-string v3, "RANDOM"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/beizi/ad/internal/animation/TransitionType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/beizi/ad/internal/animation/TransitionType;->RANDOM:Lcom/beizi/ad/internal/animation/TransitionType;

    .line 3
    new-instance v3, Lcom/beizi/ad/internal/animation/TransitionType;

    const-string v5, "FADE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/beizi/ad/internal/animation/TransitionType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/beizi/ad/internal/animation/TransitionType;->FADE:Lcom/beizi/ad/internal/animation/TransitionType;

    .line 4
    new-instance v5, Lcom/beizi/ad/internal/animation/TransitionType;

    const-string v7, "PUSH"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/beizi/ad/internal/animation/TransitionType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/beizi/ad/internal/animation/TransitionType;->PUSH:Lcom/beizi/ad/internal/animation/TransitionType;

    .line 5
    new-instance v7, Lcom/beizi/ad/internal/animation/TransitionType;

    const-string v9, "MOVEIN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/beizi/ad/internal/animation/TransitionType;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/beizi/ad/internal/animation/TransitionType;->MOVEIN:Lcom/beizi/ad/internal/animation/TransitionType;

    .line 6
    new-instance v9, Lcom/beizi/ad/internal/animation/TransitionType;

    const-string v11, "REVEAL"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/beizi/ad/internal/animation/TransitionType;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/beizi/ad/internal/animation/TransitionType;->REVEAL:Lcom/beizi/ad/internal/animation/TransitionType;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/beizi/ad/internal/animation/TransitionType;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Lcom/beizi/ad/internal/animation/TransitionType;->$VALUES:[Lcom/beizi/ad/internal/animation/TransitionType;

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

.method public static getTypeForInt(I)Lcom/beizi/ad/internal/animation/TransitionType;
    .locals 5

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/animation/TransitionType;->values()[Lcom/beizi/ad/internal/animation/TransitionType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    sget-object p0, Lcom/beizi/ad/internal/animation/TransitionType;->NONE:Lcom/beizi/ad/internal/animation/TransitionType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/ad/internal/animation/TransitionType;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/internal/animation/TransitionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/internal/animation/TransitionType;

    return-object p0
.end method

.method public static values()[Lcom/beizi/ad/internal/animation/TransitionType;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/animation/TransitionType;->$VALUES:[Lcom/beizi/ad/internal/animation/TransitionType;

    invoke-virtual {v0}, [Lcom/beizi/ad/internal/animation/TransitionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/ad/internal/animation/TransitionType;

    return-object v0
.end method
