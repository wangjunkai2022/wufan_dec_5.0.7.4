.class public final enum Lcom/papa91/arc/widget/listview/LoadMoreMode;
.super Ljava/lang/Enum;
.source "LoadMoreMode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/papa91/arc/widget/listview/LoadMoreMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/papa91/arc/widget/listview/LoadMoreMode;

.field public static final enum CLICK:Lcom/papa91/arc/widget/listview/LoadMoreMode;

.field public static final enum SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/papa91/arc/widget/listview/LoadMoreMode;

    const-string v1, "CLICK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/papa91/arc/widget/listview/LoadMoreMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/papa91/arc/widget/listview/LoadMoreMode;->CLICK:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    .line 2
    new-instance v1, Lcom/papa91/arc/widget/listview/LoadMoreMode;

    const-string v3, "SCROLL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/papa91/arc/widget/listview/LoadMoreMode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/papa91/arc/widget/listview/LoadMoreMode;->SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/papa91/arc/widget/listview/LoadMoreMode;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/papa91/arc/widget/listview/LoadMoreMode;->$VALUES:[Lcom/papa91/arc/widget/listview/LoadMoreMode;

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

.method static mapIntToValue(I)Lcom/papa91/arc/widget/listview/LoadMoreMode;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    .line 1
    sget-object p0, Lcom/papa91/arc/widget/listview/LoadMoreMode;->CLICK:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    return-object p0

    .line 2
    :cond_0
    sget-object p0, Lcom/papa91/arc/widget/listview/LoadMoreMode;->SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/papa91/arc/widget/listview/LoadMoreMode;
    .locals 1

    .line 1
    const-class v0, Lcom/papa91/arc/widget/listview/LoadMoreMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/papa91/arc/widget/listview/LoadMoreMode;

    return-object p0
.end method

.method public static values()[Lcom/papa91/arc/widget/listview/LoadMoreMode;
    .locals 1

    .line 1
    sget-object v0, Lcom/papa91/arc/widget/listview/LoadMoreMode;->$VALUES:[Lcom/papa91/arc/widget/listview/LoadMoreMode;

    invoke-virtual {v0}, [Lcom/papa91/arc/widget/listview/LoadMoreMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/papa91/arc/widget/listview/LoadMoreMode;

    return-object v0
.end method
