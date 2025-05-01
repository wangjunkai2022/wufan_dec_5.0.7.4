.class public Lcom/join/mgps/dto/FavoriteGameListBean;
.super Ljava/lang/Object;
.source "FavoriteGameListBean.java"


# instance fields
.field private favorites_game_list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private favorites_game_total:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFavorites_game_list()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/FavoriteGameListBean;->favorites_game_list:Ljava/util/List;

    return-object v0
.end method

.method public getFavorites_game_total()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/FavoriteGameListBean;->favorites_game_total:I

    return v0
.end method

.method public setFavorites_game_list(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/FavoriteGameListBean;->favorites_game_list:Ljava/util/List;

    return-void
.end method

.method public setFavorites_game_total(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/FavoriteGameListBean;->favorites_game_total:I

    return-void
.end method
