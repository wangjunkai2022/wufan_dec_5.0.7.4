.class public Lcom/join/mgps/dto/SScrollingTxtDTOV2;
.super Ljava/lang/Object;
.source "SScrollingTxtDTOV2.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private interval:I

.field private text:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SScrollingTxtBeanV2;",
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
.method public getInterval()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SScrollingTxtDTOV2;->interval:I

    return v0
.end method

.method public getText()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SScrollingTxtBeanV2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SScrollingTxtDTOV2;->text:Ljava/util/List;

    return-object v0
.end method

.method public setInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SScrollingTxtDTOV2;->interval:I

    return-void
.end method

.method public setText(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SScrollingTxtBeanV2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SScrollingTxtDTOV2;->text:Ljava/util/List;

    return-void
.end method
