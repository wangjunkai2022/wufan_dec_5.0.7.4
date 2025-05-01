.class final Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;
.super Lkotlin/jvm/internal/Lambda;
.source "EverdayNewFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/EverdayNewFragment;->loadFinish(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;",
        "Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;

    invoke-direct {v0}, Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;-><init>()V

    sput-object v0, Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;->INSTANCE:Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;)Ljava/lang/Integer;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getTime()J

    move-result-wide v2

    const/4 v4, -0x1

    const/4 v5, 0x1

    cmp-long v6, v0, v2

    if-lez v6, :cond_0

    :goto_0
    const/4 v4, 0x1

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getTime()J

    move-result-wide v2

    cmp-long v6, v0, v2

    if-gez v6, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getList()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->f2(Lcom/join/mgps/dto/CollectionBeanSub;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getList()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->f2(Lcom/join/mgps/dto/CollectionBeanSub;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 6
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;

    check-cast p2, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;->invoke(Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
