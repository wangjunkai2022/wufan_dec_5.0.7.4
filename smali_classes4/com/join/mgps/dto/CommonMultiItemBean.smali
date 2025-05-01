.class public Lcom/join/mgps/dto/CommonMultiItemBean;
.super Ljava/lang/Object;
.source "CommonMultiItemBean.java"

# interfaces
.implements Lu1/b;


# instance fields
.field private data:Ljava/lang/Object;

.field private exposure:Z

.field private extData:Ljava/lang/Object;

.field private viewType:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->viewType:I

    .line 3
    iput-object p2, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->data:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getExtData()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->extData:Ljava/lang/Object;

    return-object v0
.end method

.method public getItemType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->viewType:I

    return v0
.end method

.method public isExposure()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->exposure:Z

    return v0
.end method

.method public setExposure(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->exposure:Z

    return-void
.end method

.method public setExtData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->extData:Ljava/lang/Object;

    return-void
.end method

.method public setViewType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CommonMultiItemBean;->viewType:I

    return-void
.end method
