.class final enum Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;
.super Ljava/lang/Enum;
.source "ScrollableLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "DIRECTION"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

.field public static final enum DOWN:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

.field public static final enum UP:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    const-string v1, "UP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->UP:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    .line 2
    new-instance v1, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    const-string v3, "DOWN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->DOWN:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->$VALUES:[Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

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

.method public static valueOf(Ljava/lang/String;)Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;
    .locals 1

    .line 1
    const-class v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    return-object p0
.end method

.method public static values()[Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;
    .locals 1

    .line 1
    sget-object v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->$VALUES:[Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    invoke-virtual {v0}, [Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    return-object v0
.end method
