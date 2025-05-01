.class public Lcom/beizi/ad/internal/m;
.super Ljava/lang/Object;
.source "RewardItemImpl.java"

# interfaces
.implements Lcom/beizi/ad/RewardItem;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/m;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/beizi/ad/internal/m;->b:I

    return-void
.end method


# virtual methods
.method public getAmount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/m;->b:I

    return v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/m;->a:Ljava/lang/String;

    return-object v0
.end method
