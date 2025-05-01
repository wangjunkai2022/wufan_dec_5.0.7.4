.class public Lcom/join/mgps/dto/FoundGameTabBean;
.super Ljava/lang/Object;
.source "FoundGameTabBean.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private tips_info:Lcom/join/mgps/dto/TipsInfoBean;

.field private title_info:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TabItemBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTips_info()Lcom/join/mgps/dto/TipsInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/FoundGameTabBean;->tips_info:Lcom/join/mgps/dto/TipsInfoBean;

    return-object v0
.end method

.method public getTitle_info()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TabItemBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/FoundGameTabBean;->title_info:Ljava/util/List;

    return-object v0
.end method

.method public setTips_info(Lcom/join/mgps/dto/TipsInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/FoundGameTabBean;->tips_info:Lcom/join/mgps/dto/TipsInfoBean;

    return-void
.end method

.method public setTitle_info(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TabItemBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/FoundGameTabBean;->title_info:Ljava/util/List;

    return-void
.end method
