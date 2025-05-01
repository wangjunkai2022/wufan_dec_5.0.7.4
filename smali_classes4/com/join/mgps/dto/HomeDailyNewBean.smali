.class public Lcom/join/mgps/dto/HomeDailyNewBean;
.super Ljava/lang/Object;
.source "HomeDailyNewBean.java"


# instance fields
.field private count:I

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/HomeDailyNewListBean;",
            ">;"
        }
    .end annotation
.end field

.field private pv:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/HomeDailyNewBean;->count:I

    return v0
.end method

.method public getList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/HomeDailyNewListBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/HomeDailyNewBean;->list:Ljava/util/List;

    return-object v0
.end method

.method public getPv()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/HomeDailyNewBean;->pv:I

    return v0
.end method

.method public setCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/HomeDailyNewBean;->count:I

    return-void
.end method

.method public setList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/HomeDailyNewListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/HomeDailyNewBean;->list:Ljava/util/List;

    return-void
.end method

.method public setPv(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/HomeDailyNewBean;->pv:I

    return-void
.end method
