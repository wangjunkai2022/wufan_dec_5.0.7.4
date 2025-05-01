.class public Lcom/join/mgps/dto/CollectionModuleSevenSubBean;
.super Ljava/lang/Object;
.source "CollectionModuleSevenSubBean.java"


# instance fields
.field private model_type:I

.field private model_val:Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getModel_type()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->model_type:I

    return v0
.end method

.method public getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->model_val:Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setModel_type(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->model_type:I

    return-void
.end method

.method public setModel_val(Lcom/join/mgps/dto/CollectionModuleSevenItemBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->model_val:Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->title:Ljava/lang/String;

    return-void
.end method
