.class public Lcom/join/mgps/dto/CollectionSevenListBean;
.super Ljava/lang/Object;
.source "CollectionSevenListBean.java"

# interfaces
.implements Lu1/b;


# instance fields
.field private collection_id:Ljava/lang/String;

.field private hasExposure:Z

.field private item:Ljava/lang/Object;

.field private subTitle:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private tpl_type:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->hasExposure:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->hasExposure:Z

    .line 10
    iput p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->type:I

    .line 11
    iput-object p2, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->item:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->hasExposure:Z

    .line 5
    iput p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->type:I

    .line 6
    iput-object p2, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->item:Ljava/lang/Object;

    .line 7
    iput-object p3, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->collection_id:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCollection_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->collection_id:Ljava/lang/String;

    return-object v0
.end method

.method public getItem()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->item:Ljava/lang/Object;

    return-object v0
.end method

.method public getItemType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->type:I

    return v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTpl_type()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->tpl_type:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->type:I

    return v0
.end method

.method public isHasExposure()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->hasExposure:Z

    return v0
.end method

.method public setCollection_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->collection_id:Ljava/lang/String;

    return-void
.end method

.method public setHasExposure(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->hasExposure:Z

    return-void
.end method

.method public setItem(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->item:Ljava/lang/Object;

    return-void
.end method

.method public setSubTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->subTitle:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->title:Ljava/lang/String;

    return-void
.end method

.method public setTpl_type(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->tpl_type:Ljava/lang/String;

    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CollectionSevenListBean;->type:I

    return-void
.end method
