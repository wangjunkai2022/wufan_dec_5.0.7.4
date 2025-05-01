.class public Lcom/join/mgps/dto/StatisticsBean;
.super Ljava/lang/Object;
.source "StatisticsBean.java"


# instance fields
.field private min_game_search_source:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/StatisticsBean;->min_game_search_source:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getMin_game_search_source()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/StatisticsBean;->min_game_search_source:Ljava/lang/Integer;

    return-object v0
.end method

.method public setMin_game_search_source(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/StatisticsBean;->min_game_search_source:Ljava/lang/Integer;

    return-void
.end method
