.class public Lcom/beizi/fusion/model/CoordinateBean;
.super Ljava/lang/Object;
.source "CoordinateBean.java"


# instance fields
.field private bottom:Ljava/lang/String;

.field private color:Ljava/lang/String;

.field private fontOrCorner:Ljava/lang/String;

.field private height:Ljava/lang/String;

.field private left:Ljava/lang/String;

.field private right:Ljava/lang/String;

.field private scale:Ljava/lang/String;

.field private top:Ljava/lang/String;

.field private width:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getCoordinate(Ljava/lang/String;)Lcom/beizi/fusion/model/CoordinateBean;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ":"

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 3
    new-instance v0, Lcom/beizi/fusion/model/CoordinateBean;

    invoke-direct {v0}, Lcom/beizi/fusion/model/CoordinateBean;-><init>()V

    const/4 v1, 0x0

    .line 4
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setLeft(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 5
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setTop(Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 6
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setRight(Ljava/lang/String;)V

    const/4 v1, 0x3

    .line 7
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setBottom(Ljava/lang/String;)V

    const/4 v1, 0x4

    .line 8
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setWidth(Ljava/lang/String;)V

    const/4 v1, 0x5

    .line 9
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setHeight(Ljava/lang/String;)V

    const/4 v1, 0x6

    .line 10
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setScale(Ljava/lang/String;)V

    const/4 v1, 0x7

    .line 11
    aget-object v1, p0, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/CoordinateBean;->setFontOrCorner(Ljava/lang/String;)V

    const/16 v1, 0x8

    .line 12
    aget-object p0, p0, v1

    invoke-virtual {v0, p0}, Lcom/beizi/fusion/model/CoordinateBean;->setColor(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getBottom()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->bottom:Ljava/lang/String;

    return-object v0
.end method

.method public getColor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->color:Ljava/lang/String;

    return-object v0
.end method

.method public getFontOrCorner()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->fontOrCorner:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->height:Ljava/lang/String;

    return-object v0
.end method

.method public getLeft()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->left:Ljava/lang/String;

    return-object v0
.end method

.method public getRight()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->right:Ljava/lang/String;

    return-object v0
.end method

.method public getScale()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->scale:Ljava/lang/String;

    return-object v0
.end method

.method public getTop()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->top:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/CoordinateBean;->width:Ljava/lang/String;

    return-object v0
.end method

.method public setBottom(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->bottom:Ljava/lang/String;

    return-void
.end method

.method public setColor(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->color:Ljava/lang/String;

    return-void
.end method

.method public setFontOrCorner(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->fontOrCorner:Ljava/lang/String;

    return-void
.end method

.method public setHeight(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->height:Ljava/lang/String;

    return-void
.end method

.method public setLeft(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->left:Ljava/lang/String;

    return-void
.end method

.method public setRight(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->right:Ljava/lang/String;

    return-void
.end method

.method public setScale(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->scale:Ljava/lang/String;

    return-void
.end method

.method public setTop(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->top:Ljava/lang/String;

    return-void
.end method

.method public setWidth(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/CoordinateBean;->width:Ljava/lang/String;

    return-void
.end method
